package android.support.p004v7.media;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.p001v4.hardware.display.DisplayManagerCompat;
import android.support.p004v7.media.MediaRouteProvider;
import android.support.p004v7.media.MediaRouteSelector;
import android.support.p004v7.media.RegisteredMediaRouteProviderWatcher;
import android.support.p004v7.media.RemoteControlClientCompat;
import android.support.p004v7.media.SystemMediaRouteProvider;
import android.support.v4.app.ActivityManagerCompat;
import android.support.v4.media.VolumeProviderCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.util.Pair;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
/* renamed from: android.support.v7.media.MediaRouter */
/* loaded from: classes.dex */
public final class MediaRouter {
    public static final int AVAILABILITY_FLAG_IGNORE_DEFAULT_ROUTE = 1;
    public static final int AVAILABILITY_FLAG_REQUIRE_MATCH = 2;
    public static final int CALLBACK_FLAG_FORCE_DISCOVERY = 8;
    public static final int CALLBACK_FLAG_PERFORM_ACTIVE_SCAN = 1;
    public static final int CALLBACK_FLAG_REQUEST_DISCOVERY = 4;
    public static final int CALLBACK_FLAG_UNFILTERED_EVENTS = 2;
    public static final int UNSELECT_REASON_DISCONNECTED = 1;
    public static final int UNSELECT_REASON_ROUTE_CHANGED = 3;
    public static final int UNSELECT_REASON_STOPPED = 2;
    public static final int UNSELECT_REASON_UNKNOWN = 0;
    static GlobalMediaRouter sGlobal;
    final ArrayList<CallbackRecord> mCallbackRecords = new ArrayList<>();
    final Context mContext;
    private static final String TAG = "MediaRouter";
    private static final boolean DEBUG = Log.isLoggable(TAG, 3);

    /* renamed from: android.support.v7.media.MediaRouter$Callback */
    /* loaded from: classes.dex */
    public static abstract class Callback {
        public void onProviderAdded(MediaRouter mediaRouter, ProviderInfo providerInfo) {
        }

        public void onProviderChanged(MediaRouter mediaRouter, ProviderInfo providerInfo) {
        }

        public void onProviderRemoved(MediaRouter mediaRouter, ProviderInfo providerInfo) {
        }

        public void onRouteAdded(MediaRouter mediaRouter, RouteInfo routeInfo) {
        }

        public void onRouteChanged(MediaRouter mediaRouter, RouteInfo routeInfo) {
        }

        public void onRoutePresentationDisplayChanged(MediaRouter mediaRouter, RouteInfo routeInfo) {
        }

        public void onRouteRemoved(MediaRouter mediaRouter, RouteInfo routeInfo) {
        }

        public void onRouteSelected(MediaRouter mediaRouter, RouteInfo routeInfo) {
        }

        public void onRouteUnselected(MediaRouter mediaRouter, RouteInfo routeInfo) {
        }

        public void onRouteUnselected(MediaRouter mediaRouter, RouteInfo routeInfo, int i) {
            onRouteUnselected(mediaRouter, routeInfo);
        }

        public void onRouteVolumeChanged(MediaRouter mediaRouter, RouteInfo routeInfo) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.media.MediaRouter$CallbackRecord */
    /* loaded from: classes.dex */
    public static final class CallbackRecord {
        public final Callback mCallback;
        public int mFlags;
        public final MediaRouter mRouter;
        public MediaRouteSelector mSelector = MediaRouteSelector.EMPTY;

        public CallbackRecord(MediaRouter mediaRouter, Callback callback) {
            this.mRouter = mediaRouter;
            this.mCallback = callback;
        }

        public boolean filterRouteEvent(RouteInfo routeInfo) {
            return (this.mFlags & 2) != 0 || routeInfo.matchesSelector(this.mSelector);
        }
    }

    /* renamed from: android.support.v7.media.MediaRouter$ControlRequestCallback */
    /* loaded from: classes.dex */
    public static abstract class ControlRequestCallback {
        public void onError(String str, Bundle bundle) {
        }

        public void onResult(Bundle bundle) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.media.MediaRouter$GlobalMediaRouter */
    /* loaded from: classes.dex */
    public static final class GlobalMediaRouter implements RegisteredMediaRouteProviderWatcher.Callback, SystemMediaRouteProvider.SyncCallback {
        private final Context mApplicationContext;
        private MediaSessionCompat mCompatSession;
        private RouteInfo mDefaultRoute;
        private MediaRouteDiscoveryRequest mDiscoveryRequest;
        private final DisplayManagerCompat mDisplayManager;
        private Map<String, MediaRouteProvider.RouteController> mGroupMemberControllers;
        private final boolean mLowRam;
        private MediaSessionRecord mMediaSession;
        private MediaSessionCompat mRccMediaSession;
        private RegisteredMediaRouteProviderWatcher mRegisteredProviderWatcher;
        private RouteInfo mSelectedRoute;
        private MediaRouteProvider.RouteController mSelectedRouteController;
        private final SystemMediaRouteProvider mSystemProvider;
        private final ArrayList<WeakReference<MediaRouter>> mRouters = new ArrayList<>();
        private final ArrayList<RouteInfo> mRoutes = new ArrayList<>();
        private final Map<Pair<String, String>, String> mUniqueIdMap = new HashMap();
        private final ArrayList<ProviderInfo> mProviders = new ArrayList<>();
        private final ArrayList<RemoteControlClientRecord> mRemoteControlClients = new ArrayList<>();
        private final RemoteControlClientCompat.PlaybackInfo mPlaybackInfo = new RemoteControlClientCompat.PlaybackInfo();
        private final ProviderCallback mProviderCallback = new ProviderCallback();
        private final CallbackHandler mCallbackHandler = new CallbackHandler();
        private MediaSessionCompat.OnActiveChangeListener mSessionActiveListener = new MediaSessionCompat.OnActiveChangeListener() { // from class: android.support.v7.media.MediaRouter.GlobalMediaRouter.1
            public void onActiveChanged() {
                if (GlobalMediaRouter.this.mRccMediaSession != null) {
                    if (GlobalMediaRouter.this.mRccMediaSession.isActive()) {
                        GlobalMediaRouter.this.addRemoteControlClient(GlobalMediaRouter.this.mRccMediaSession.getRemoteControlClient());
                    } else {
                        GlobalMediaRouter.this.removeRemoteControlClient(GlobalMediaRouter.this.mRccMediaSession.getRemoteControlClient());
                    }
                }
            }
        };

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: android.support.v7.media.MediaRouter$GlobalMediaRouter$CallbackHandler */
        /* loaded from: classes.dex */
        public final class CallbackHandler extends Handler {
            public static final int MSG_PROVIDER_ADDED = 513;
            public static final int MSG_PROVIDER_CHANGED = 515;
            public static final int MSG_PROVIDER_REMOVED = 514;
            public static final int MSG_ROUTE_ADDED = 257;
            public static final int MSG_ROUTE_CHANGED = 259;
            public static final int MSG_ROUTE_PRESENTATION_DISPLAY_CHANGED = 261;
            public static final int MSG_ROUTE_REMOVED = 258;
            public static final int MSG_ROUTE_SELECTED = 262;
            public static final int MSG_ROUTE_UNSELECTED = 263;
            public static final int MSG_ROUTE_VOLUME_CHANGED = 260;
            private static final int MSG_TYPE_MASK = 65280;
            private static final int MSG_TYPE_PROVIDER = 512;
            private static final int MSG_TYPE_ROUTE = 256;
            private final ArrayList<CallbackRecord> mTempCallbackRecords;

            private CallbackHandler() {
                this.mTempCallbackRecords = new ArrayList<>();
            }

            private void invokeCallback(CallbackRecord callbackRecord, int i, Object obj, int i2) {
                MediaRouter mediaRouter = callbackRecord.mRouter;
                Callback callback = callbackRecord.mCallback;
                switch (65280 & i) {
                    case 256:
                        RouteInfo routeInfo = (RouteInfo) obj;
                        if (!callbackRecord.filterRouteEvent(routeInfo)) {
                            return;
                        }
                        switch (i) {
                            case 257:
                                callback.onRouteAdded(mediaRouter, routeInfo);
                                return;
                            case 258:
                                callback.onRouteRemoved(mediaRouter, routeInfo);
                                return;
                            case 259:
                                callback.onRouteChanged(mediaRouter, routeInfo);
                                return;
                            case 260:
                                callback.onRouteVolumeChanged(mediaRouter, routeInfo);
                                return;
                            case 261:
                                callback.onRoutePresentationDisplayChanged(mediaRouter, routeInfo);
                                return;
                            case MSG_ROUTE_SELECTED /* 262 */:
                                callback.onRouteSelected(mediaRouter, routeInfo);
                                return;
                            case MSG_ROUTE_UNSELECTED /* 263 */:
                                callback.onRouteUnselected(mediaRouter, routeInfo, i2);
                                return;
                            default:
                                return;
                        }
                    case 512:
                        ProviderInfo providerInfo = (ProviderInfo) obj;
                        switch (i) {
                            case 513:
                                callback.onProviderAdded(mediaRouter, providerInfo);
                                return;
                            case 514:
                                callback.onProviderRemoved(mediaRouter, providerInfo);
                                return;
                            case 515:
                                callback.onProviderChanged(mediaRouter, providerInfo);
                                return;
                            default:
                                return;
                        }
                    default:
                        return;
                }
            }

            private void syncWithSystemProvider(int i, Object obj) {
                switch (i) {
                    case 257:
                        GlobalMediaRouter.this.mSystemProvider.onSyncRouteAdded((RouteInfo) obj);
                        return;
                    case 258:
                        GlobalMediaRouter.this.mSystemProvider.onSyncRouteRemoved((RouteInfo) obj);
                        return;
                    case 259:
                        GlobalMediaRouter.this.mSystemProvider.onSyncRouteChanged((RouteInfo) obj);
                        return;
                    case 260:
                    case 261:
                    default:
                        return;
                    case MSG_ROUTE_SELECTED /* 262 */:
                        GlobalMediaRouter.this.mSystemProvider.onSyncRouteSelected((RouteInfo) obj);
                        return;
                }
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i = message.what;
                Object obj = message.obj;
                int i2 = message.arg1;
                syncWithSystemProvider(i, obj);
                try {
                    int size = GlobalMediaRouter.this.mRouters.size();
                    while (true) {
                        int i3 = size - 1;
                        if (i3 < 0) {
                            break;
                        }
                        MediaRouter mediaRouter = (MediaRouter) ((WeakReference) GlobalMediaRouter.this.mRouters.get(i3)).get();
                        if (mediaRouter == null) {
                            GlobalMediaRouter.this.mRouters.remove(i3);
                        } else {
                            this.mTempCallbackRecords.addAll(mediaRouter.mCallbackRecords);
                        }
                        size = i3;
                    }
                    int size2 = this.mTempCallbackRecords.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        invokeCallback(this.mTempCallbackRecords.get(i4), i, obj, i2);
                    }
                } finally {
                    this.mTempCallbackRecords.clear();
                }
            }

            public void post(int i, Object obj) {
                obtainMessage(i, obj).sendToTarget();
            }

            public void post(int i, Object obj, int i2) {
                Message obtainMessage = obtainMessage(i, obj);
                obtainMessage.arg1 = i2;
                obtainMessage.sendToTarget();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: android.support.v7.media.MediaRouter$GlobalMediaRouter$MediaSessionRecord */
        /* loaded from: classes.dex */
        public final class MediaSessionRecord {
            private int mControlType;
            private int mMaxVolume;
            private final MediaSessionCompat mMsCompat;
            private VolumeProviderCompat mVpCompat;

            public MediaSessionRecord(Object obj) {
                this.mMsCompat = MediaSessionCompat.obtain(GlobalMediaRouter.this.mApplicationContext, obj);
            }

            public void clearVolumeHandling() {
                this.mMsCompat.setPlaybackToLocal(GlobalMediaRouter.this.mPlaybackInfo.playbackStream);
                this.mVpCompat = null;
            }

            public void configureVolume(int i, int i2, int i3) {
                if (this.mVpCompat != null && i == this.mControlType && i2 == this.mMaxVolume) {
                    this.mVpCompat.setCurrentVolume(i3);
                    return;
                }
                this.mVpCompat = new VolumeProviderCompat(i, i2, i3) { // from class: android.support.v7.media.MediaRouter.GlobalMediaRouter.MediaSessionRecord.1
                    public void onAdjustVolume(final int i4) {
                        GlobalMediaRouter.this.mCallbackHandler.post(new Runnable() { // from class: android.support.v7.media.MediaRouter.GlobalMediaRouter.MediaSessionRecord.1.2
                            @Override // java.lang.Runnable
                            public void run() {
                                if (GlobalMediaRouter.this.mSelectedRoute != null) {
                                    GlobalMediaRouter.this.mSelectedRoute.requestUpdateVolume(i4);
                                }
                            }
                        });
                    }

                    public void onSetVolumeTo(final int i4) {
                        GlobalMediaRouter.this.mCallbackHandler.post(new Runnable() { // from class: android.support.v7.media.MediaRouter.GlobalMediaRouter.MediaSessionRecord.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                if (GlobalMediaRouter.this.mSelectedRoute != null) {
                                    GlobalMediaRouter.this.mSelectedRoute.requestSetVolume(i4);
                                }
                            }
                        });
                    }
                };
                this.mMsCompat.setPlaybackToRemote(this.mVpCompat);
            }

            public MediaSessionCompat.Token getToken() {
                return this.mMsCompat.getSessionToken();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: android.support.v7.media.MediaRouter$GlobalMediaRouter$ProviderCallback */
        /* loaded from: classes.dex */
        public final class ProviderCallback extends MediaRouteProvider.Callback {
            private ProviderCallback() {
            }

            @Override // android.support.p004v7.media.MediaRouteProvider.Callback
            public void onDescriptorChanged(MediaRouteProvider mediaRouteProvider, MediaRouteProviderDescriptor mediaRouteProviderDescriptor) {
                GlobalMediaRouter.this.updateProviderDescriptor(mediaRouteProvider, mediaRouteProviderDescriptor);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: android.support.v7.media.MediaRouter$GlobalMediaRouter$RemoteControlClientRecord */
        /* loaded from: classes.dex */
        public final class RemoteControlClientRecord implements RemoteControlClientCompat.VolumeCallback {
            private boolean mDisconnected;
            private final RemoteControlClientCompat mRccCompat;

            public RemoteControlClientRecord(Object obj) {
                this.mRccCompat = RemoteControlClientCompat.obtain(GlobalMediaRouter.this.mApplicationContext, obj);
                this.mRccCompat.setVolumeCallback(this);
                updatePlaybackInfo();
            }

            public void disconnect() {
                this.mDisconnected = true;
                this.mRccCompat.setVolumeCallback(null);
            }

            public Object getRemoteControlClient() {
                return this.mRccCompat.getRemoteControlClient();
            }

            @Override // android.support.p004v7.media.RemoteControlClientCompat.VolumeCallback
            public void onVolumeSetRequest(int i) {
                if (this.mDisconnected || GlobalMediaRouter.this.mSelectedRoute == null) {
                    return;
                }
                GlobalMediaRouter.this.mSelectedRoute.requestSetVolume(i);
            }

            @Override // android.support.p004v7.media.RemoteControlClientCompat.VolumeCallback
            public void onVolumeUpdateRequest(int i) {
                if (this.mDisconnected || GlobalMediaRouter.this.mSelectedRoute == null) {
                    return;
                }
                GlobalMediaRouter.this.mSelectedRoute.requestUpdateVolume(i);
            }

            public void updatePlaybackInfo() {
                this.mRccCompat.setPlaybackInfo(GlobalMediaRouter.this.mPlaybackInfo);
            }
        }

        GlobalMediaRouter(Context context) {
            this.mApplicationContext = context;
            this.mDisplayManager = DisplayManagerCompat.getInstance(context);
            this.mLowRam = ActivityManagerCompat.isLowRamDevice((ActivityManager) context.getSystemService("activity"));
            this.mSystemProvider = SystemMediaRouteProvider.obtain(context, this);
            addProvider(this.mSystemProvider);
        }

        private String assignRouteUniqueId(ProviderInfo providerInfo, String str) {
            String flattenToShortString = providerInfo.getComponentName().flattenToShortString();
            String str2 = flattenToShortString + ":" + str;
            if (findRouteByUniqueId(str2) < 0) {
                this.mUniqueIdMap.put(new Pair<>(flattenToShortString, str), str2);
                return str2;
            }
            Log.w(MediaRouter.TAG, "Either " + str + " isn't unique in " + flattenToShortString + " or we're trying to assign a unique ID for an already added route");
            int i = 2;
            while (true) {
                String format = String.format(Locale.US, "%s_%d", str2, Integer.valueOf(i));
                if (findRouteByUniqueId(format) < 0) {
                    this.mUniqueIdMap.put(new Pair<>(flattenToShortString, str), format);
                    return format;
                }
                i++;
            }
        }

        private int findProviderInfo(MediaRouteProvider mediaRouteProvider) {
            int size = this.mProviders.size();
            for (int i = 0; i < size; i++) {
                if (this.mProviders.get(i).mProviderInstance == mediaRouteProvider) {
                    return i;
                }
            }
            return -1;
        }

        private int findRemoteControlClientRecord(Object obj) {
            int size = this.mRemoteControlClients.size();
            for (int i = 0; i < size; i++) {
                if (this.mRemoteControlClients.get(i).getRemoteControlClient() == obj) {
                    return i;
                }
            }
            return -1;
        }

        private int findRouteByUniqueId(String str) {
            int size = this.mRoutes.size();
            for (int i = 0; i < size; i++) {
                if (this.mRoutes.get(i).mUniqueId.equals(str)) {
                    return i;
                }
            }
            return -1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String getUniqueId(ProviderInfo providerInfo, String str) {
            return this.mUniqueIdMap.get(new Pair(providerInfo.getComponentName().flattenToShortString(), str));
        }

        private boolean isRouteSelectable(RouteInfo routeInfo) {
            return routeInfo.mDescriptor != null && routeInfo.mEnabled;
        }

        private boolean isSystemDefaultRoute(RouteInfo routeInfo) {
            return routeInfo.getProviderInstance() == this.mSystemProvider && routeInfo.mDescriptorId.equals(SystemMediaRouteProvider.DEFAULT_ROUTE_ID);
        }

        private boolean isSystemLiveAudioOnlyRoute(RouteInfo routeInfo) {
            return routeInfo.getProviderInstance() == this.mSystemProvider && routeInfo.supportsControlCategory(MediaControlIntent.CATEGORY_LIVE_AUDIO) && !routeInfo.supportsControlCategory(MediaControlIntent.CATEGORY_LIVE_VIDEO);
        }

        private void setSelectedRouteInternal(RouteInfo routeInfo, int i) {
            if (this.mSelectedRoute != routeInfo) {
                if (this.mSelectedRoute != null) {
                    if (MediaRouter.DEBUG) {
                        Log.d(MediaRouter.TAG, "Route unselected: " + this.mSelectedRoute + " reason: " + i);
                    }
                    this.mCallbackHandler.post(CallbackHandler.MSG_ROUTE_UNSELECTED, this.mSelectedRoute, i);
                    if (this.mSelectedRouteController != null) {
                        this.mSelectedRouteController.onUnselect(i);
                        this.mSelectedRouteController.onRelease();
                        this.mSelectedRouteController = null;
                    }
                    if (this.mGroupMemberControllers != null) {
                        for (MediaRouteProvider.RouteController routeController : this.mGroupMemberControllers.values()) {
                            routeController.onUnselect(i);
                            routeController.onRelease();
                        }
                        this.mGroupMemberControllers = null;
                    }
                }
                this.mSelectedRoute = routeInfo;
                if (this.mSelectedRoute != null) {
                    this.mSelectedRouteController = routeInfo.getProviderInstance().onCreateRouteController(routeInfo.mDescriptorId);
                    if (this.mSelectedRouteController != null) {
                        this.mSelectedRouteController.onSelect();
                    }
                    if (MediaRouter.DEBUG) {
                        Log.d(MediaRouter.TAG, "Route selected: " + this.mSelectedRoute);
                    }
                    this.mCallbackHandler.post(CallbackHandler.MSG_ROUTE_SELECTED, this.mSelectedRoute);
                    if (this.mSelectedRoute instanceof RouteGroup) {
                        this.mGroupMemberControllers = new HashMap();
                        for (RouteInfo routeInfo2 : ((RouteGroup) this.mSelectedRoute).getRoutes()) {
                            MediaRouteProvider.RouteController onCreateRouteController = routeInfo2.getProviderInstance().onCreateRouteController(routeInfo2.mDescriptorId);
                            onCreateRouteController.onSelect();
                            this.mGroupMemberControllers.put(routeInfo2.mDescriptorId, onCreateRouteController);
                        }
                    }
                }
                updatePlaybackInfoFromSelectedRoute();
            }
        }

        private void updatePlaybackInfoFromSelectedRoute() {
            if (this.mSelectedRoute == null) {
                if (this.mMediaSession == null) {
                    return;
                }
                this.mMediaSession.clearVolumeHandling();
                return;
            }
            this.mPlaybackInfo.volume = this.mSelectedRoute.getVolume();
            this.mPlaybackInfo.volumeMax = this.mSelectedRoute.getVolumeMax();
            this.mPlaybackInfo.volumeHandling = this.mSelectedRoute.getVolumeHandling();
            this.mPlaybackInfo.playbackStream = this.mSelectedRoute.getPlaybackStream();
            this.mPlaybackInfo.playbackType = this.mSelectedRoute.getPlaybackType();
            int size = this.mRemoteControlClients.size();
            for (int i = 0; i < size; i++) {
                this.mRemoteControlClients.get(i).updatePlaybackInfo();
            }
            if (this.mMediaSession == null) {
                return;
            }
            if (this.mSelectedRoute == getDefaultRoute()) {
                this.mMediaSession.clearVolumeHandling();
            } else {
                this.mMediaSession.configureVolume(this.mPlaybackInfo.volumeHandling == 1 ? 2 : 0, this.mPlaybackInfo.volumeMax, this.mPlaybackInfo.volume);
            }
        }

        private void updateProviderContents(ProviderInfo providerInfo, MediaRouteProviderDescriptor mediaRouteProviderDescriptor) {
            boolean z;
            int i;
            if (providerInfo.updateDescriptor(mediaRouteProviderDescriptor)) {
                int i2 = 0;
                boolean z2 = false;
                if (mediaRouteProviderDescriptor != null) {
                    if (mediaRouteProviderDescriptor.isValid()) {
                        List<MediaRouteDescriptor> routes = mediaRouteProviderDescriptor.getRoutes();
                        int size = routes.size();
                        ArrayList<Pair> arrayList = new ArrayList();
                        ArrayList<Pair> arrayList2 = new ArrayList();
                        int i3 = 0;
                        while (i3 < size) {
                            MediaRouteDescriptor mediaRouteDescriptor = routes.get(i3);
                            String id = mediaRouteDescriptor.getId();
                            int findRouteByDescriptorId = providerInfo.findRouteByDescriptorId(id);
                            if (findRouteByDescriptorId < 0) {
                                String assignRouteUniqueId = assignRouteUniqueId(providerInfo, id);
                                boolean z3 = mediaRouteDescriptor.getGroupMemberIds() != null;
                                RouteInfo routeGroup = z3 ? new RouteGroup(providerInfo, id, assignRouteUniqueId) : new RouteInfo(providerInfo, id, assignRouteUniqueId);
                                int i4 = i2 + 1;
                                providerInfo.mRoutes.add(i2, routeGroup);
                                this.mRoutes.add(routeGroup);
                                if (z3) {
                                    arrayList.add(new Pair(routeGroup, mediaRouteDescriptor));
                                } else {
                                    routeGroup.maybeUpdateDescriptor(mediaRouteDescriptor);
                                    if (MediaRouter.DEBUG) {
                                        Log.d(MediaRouter.TAG, "Route added: " + routeGroup);
                                    }
                                    this.mCallbackHandler.post(257, routeGroup);
                                }
                                z = z2;
                                i = i4;
                            } else if (findRouteByDescriptorId < i2) {
                                Log.w(MediaRouter.TAG, "Ignoring route descriptor with duplicate id: " + mediaRouteDescriptor);
                                z = z2;
                                i = i2;
                            } else {
                                RouteInfo routeInfo = (RouteInfo) providerInfo.mRoutes.get(findRouteByDescriptorId);
                                int i5 = i2 + 1;
                                Collections.swap(providerInfo.mRoutes, findRouteByDescriptorId, i2);
                                if (routeInfo instanceof RouteGroup) {
                                    arrayList2.add(new Pair(routeInfo, mediaRouteDescriptor));
                                    z = z2;
                                    i = i5;
                                } else if (updateRouteDescriptorAndNotify(routeInfo, mediaRouteDescriptor) == 0 || routeInfo != this.mSelectedRoute) {
                                    z = z2;
                                    i = i5;
                                } else {
                                    z = true;
                                    i = i5;
                                }
                            }
                            i3++;
                            i2 = i;
                            z2 = z;
                        }
                        for (Pair pair : arrayList) {
                            RouteInfo routeInfo2 = (RouteInfo) pair.first;
                            routeInfo2.maybeUpdateDescriptor((MediaRouteDescriptor) pair.second);
                            if (MediaRouter.DEBUG) {
                                Log.d(MediaRouter.TAG, "Route added: " + routeInfo2);
                            }
                            this.mCallbackHandler.post(257, routeInfo2);
                        }
                        for (Pair pair2 : arrayList2) {
                            RouteInfo routeInfo3 = (RouteInfo) pair2.first;
                            if (updateRouteDescriptorAndNotify(routeInfo3, (MediaRouteDescriptor) pair2.second) != 0 && routeInfo3 == this.mSelectedRoute) {
                                z2 = true;
                            }
                        }
                    } else {
                        Log.w(MediaRouter.TAG, "Ignoring invalid provider descriptor: " + mediaRouteProviderDescriptor);
                    }
                }
                for (int size2 = providerInfo.mRoutes.size() - 1; size2 >= i2; size2--) {
                    RouteInfo routeInfo4 = (RouteInfo) providerInfo.mRoutes.get(size2);
                    routeInfo4.maybeUpdateDescriptor(null);
                    this.mRoutes.remove(routeInfo4);
                }
                updateSelectedRouteIfNeeded(z2);
                for (int size3 = providerInfo.mRoutes.size() - 1; size3 >= i2; size3--) {
                    RouteInfo routeInfo5 = (RouteInfo) providerInfo.mRoutes.remove(size3);
                    if (MediaRouter.DEBUG) {
                        Log.d(MediaRouter.TAG, "Route removed: " + routeInfo5);
                    }
                    this.mCallbackHandler.post(258, routeInfo5);
                }
                if (MediaRouter.DEBUG) {
                    Log.d(MediaRouter.TAG, "Provider changed: " + providerInfo);
                }
                this.mCallbackHandler.post(515, providerInfo);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void updateProviderDescriptor(MediaRouteProvider mediaRouteProvider, MediaRouteProviderDescriptor mediaRouteProviderDescriptor) {
            int findProviderInfo = findProviderInfo(mediaRouteProvider);
            if (findProviderInfo >= 0) {
                updateProviderContents(this.mProviders.get(findProviderInfo), mediaRouteProviderDescriptor);
            }
        }

        private int updateRouteDescriptorAndNotify(RouteInfo routeInfo, MediaRouteDescriptor mediaRouteDescriptor) {
            int maybeUpdateDescriptor = routeInfo.maybeUpdateDescriptor(mediaRouteDescriptor);
            if (maybeUpdateDescriptor != 0) {
                if ((maybeUpdateDescriptor & 1) != 0) {
                    if (MediaRouter.DEBUG) {
                        Log.d(MediaRouter.TAG, "Route changed: " + routeInfo);
                    }
                    this.mCallbackHandler.post(259, routeInfo);
                }
                if ((maybeUpdateDescriptor & 2) != 0) {
                    if (MediaRouter.DEBUG) {
                        Log.d(MediaRouter.TAG, "Route volume changed: " + routeInfo);
                    }
                    this.mCallbackHandler.post(260, routeInfo);
                }
                if ((maybeUpdateDescriptor & 4) != 0) {
                    if (MediaRouter.DEBUG) {
                        Log.d(MediaRouter.TAG, "Route presentation display changed: " + routeInfo);
                    }
                    this.mCallbackHandler.post(261, routeInfo);
                }
            }
            return maybeUpdateDescriptor;
        }

        private void updateSelectedRouteIfNeeded(boolean z) {
            if (this.mDefaultRoute != null && !isRouteSelectable(this.mDefaultRoute)) {
                Log.i(MediaRouter.TAG, "Clearing the default route because it is no longer selectable: " + this.mDefaultRoute);
                this.mDefaultRoute = null;
            }
            if (this.mDefaultRoute == null && !this.mRoutes.isEmpty()) {
                Iterator<RouteInfo> it2 = this.mRoutes.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    RouteInfo next = it2.next();
                    if (isSystemDefaultRoute(next) && isRouteSelectable(next)) {
                        this.mDefaultRoute = next;
                        Log.i(MediaRouter.TAG, "Found default route: " + this.mDefaultRoute);
                        break;
                    }
                }
            }
            if (this.mSelectedRoute != null && !isRouteSelectable(this.mSelectedRoute)) {
                Log.i(MediaRouter.TAG, "Unselecting the current route because it is no longer selectable: " + this.mSelectedRoute);
                setSelectedRouteInternal(null, 0);
            }
            if (this.mSelectedRoute == null) {
                setSelectedRouteInternal(chooseFallbackRoute(), 0);
            } else if (!z) {
            } else {
                updatePlaybackInfoFromSelectedRoute();
            }
        }

        @Override // android.support.p004v7.media.RegisteredMediaRouteProviderWatcher.Callback
        public void addProvider(MediaRouteProvider mediaRouteProvider) {
            if (findProviderInfo(mediaRouteProvider) < 0) {
                ProviderInfo providerInfo = new ProviderInfo(mediaRouteProvider);
                this.mProviders.add(providerInfo);
                if (MediaRouter.DEBUG) {
                    Log.d(MediaRouter.TAG, "Provider added: " + providerInfo);
                }
                this.mCallbackHandler.post(513, providerInfo);
                updateProviderContents(providerInfo, mediaRouteProvider.getDescriptor());
                mediaRouteProvider.setCallback(this.mProviderCallback);
                mediaRouteProvider.setDiscoveryRequest(this.mDiscoveryRequest);
            }
        }

        public void addRemoteControlClient(Object obj) {
            if (findRemoteControlClientRecord(obj) < 0) {
                this.mRemoteControlClients.add(new RemoteControlClientRecord(obj));
            }
        }

        RouteInfo chooseFallbackRoute() {
            Iterator<RouteInfo> it2 = this.mRoutes.iterator();
            while (it2.hasNext()) {
                RouteInfo next = it2.next();
                if (next != this.mDefaultRoute && isSystemLiveAudioOnlyRoute(next) && isRouteSelectable(next)) {
                    return next;
                }
            }
            return this.mDefaultRoute;
        }

        public ContentResolver getContentResolver() {
            return this.mApplicationContext.getContentResolver();
        }

        public RouteInfo getDefaultRoute() {
            if (this.mDefaultRoute == null) {
                throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
            }
            return this.mDefaultRoute;
        }

        public Display getDisplay(int i) {
            return this.mDisplayManager.getDisplay(i);
        }

        public MediaSessionCompat.Token getMediaSessionToken() {
            if (this.mMediaSession != null) {
                return this.mMediaSession.getToken();
            }
            if (this.mCompatSession == null) {
                return null;
            }
            return this.mCompatSession.getSessionToken();
        }

        public Context getProviderContext(String str) {
            if (str.equals(SystemMediaRouteProvider.PACKAGE_NAME)) {
                return this.mApplicationContext;
            }
            try {
                return this.mApplicationContext.createPackageContext(str, 4);
            } catch (PackageManager.NameNotFoundException e) {
                return null;
            }
        }

        public List<ProviderInfo> getProviders() {
            return this.mProviders;
        }

        public RouteInfo getRoute(String str) {
            Iterator<RouteInfo> it2 = this.mRoutes.iterator();
            while (it2.hasNext()) {
                RouteInfo next = it2.next();
                if (next.mUniqueId.equals(str)) {
                    return next;
                }
            }
            return null;
        }

        public MediaRouter getRouter(Context context) {
            int size = this.mRouters.size();
            while (true) {
                int i = size - 1;
                if (i < 0) {
                    MediaRouter mediaRouter = new MediaRouter(context);
                    this.mRouters.add(new WeakReference<>(mediaRouter));
                    return mediaRouter;
                }
                MediaRouter mediaRouter2 = this.mRouters.get(i).get();
                if (mediaRouter2 == null) {
                    this.mRouters.remove(i);
                    size = i;
                } else if (mediaRouter2.mContext == context) {
                    return mediaRouter2;
                } else {
                    size = i;
                }
            }
        }

        public List<RouteInfo> getRoutes() {
            return this.mRoutes;
        }

        public RouteInfo getSelectedRoute() {
            if (this.mSelectedRoute == null) {
                throw new IllegalStateException("There is no currently selected route.  The media router has not yet been fully initialized.");
            }
            return this.mSelectedRoute;
        }

        @Override // android.support.p004v7.media.SystemMediaRouteProvider.SyncCallback
        public RouteInfo getSystemRouteByDescriptorId(String str) {
            ProviderInfo providerInfo;
            int findRouteByDescriptorId;
            int findProviderInfo = findProviderInfo(this.mSystemProvider);
            if (findProviderInfo < 0 || (findRouteByDescriptorId = (providerInfo = this.mProviders.get(findProviderInfo)).findRouteByDescriptorId(str)) < 0) {
                return null;
            }
            return (RouteInfo) providerInfo.mRoutes.get(findRouteByDescriptorId);
        }

        public boolean isRouteAvailable(MediaRouteSelector mediaRouteSelector, int i) {
            if (mediaRouteSelector.isEmpty()) {
                return false;
            }
            if ((i & 2) == 0 && this.mLowRam) {
                return true;
            }
            int size = this.mRoutes.size();
            for (int i2 = 0; i2 < size; i2++) {
                RouteInfo routeInfo = this.mRoutes.get(i2);
                if (((i & 1) == 0 || !routeInfo.isDefaultOrBluetooth()) && routeInfo.matchesSelector(mediaRouteSelector)) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.support.p004v7.media.RegisteredMediaRouteProviderWatcher.Callback
        public void removeProvider(MediaRouteProvider mediaRouteProvider) {
            int findProviderInfo = findProviderInfo(mediaRouteProvider);
            if (findProviderInfo >= 0) {
                mediaRouteProvider.setCallback(null);
                mediaRouteProvider.setDiscoveryRequest(null);
                ProviderInfo providerInfo = this.mProviders.get(findProviderInfo);
                updateProviderContents(providerInfo, null);
                if (MediaRouter.DEBUG) {
                    Log.d(MediaRouter.TAG, "Provider removed: " + providerInfo);
                }
                this.mCallbackHandler.post(514, providerInfo);
                this.mProviders.remove(findProviderInfo);
            }
        }

        public void removeRemoteControlClient(Object obj) {
            int findRemoteControlClientRecord = findRemoteControlClientRecord(obj);
            if (findRemoteControlClientRecord >= 0) {
                this.mRemoteControlClients.remove(findRemoteControlClientRecord).disconnect();
            }
        }

        public void requestSetVolume(RouteInfo routeInfo, int i) {
            MediaRouteProvider.RouteController routeController;
            if (routeInfo == this.mSelectedRoute && this.mSelectedRouteController != null) {
                this.mSelectedRouteController.onSetVolume(i);
            } else if (this.mGroupMemberControllers == null || (routeController = this.mGroupMemberControllers.get(routeInfo.mDescriptorId)) == null) {
            } else {
                routeController.onSetVolume(i);
            }
        }

        public void requestUpdateVolume(RouteInfo routeInfo, int i) {
            if (routeInfo != this.mSelectedRoute || this.mSelectedRouteController == null) {
                return;
            }
            this.mSelectedRouteController.onUpdateVolume(i);
        }

        public void selectRoute(RouteInfo routeInfo) {
            selectRoute(routeInfo, 3);
        }

        public void selectRoute(RouteInfo routeInfo, int i) {
            if (!this.mRoutes.contains(routeInfo)) {
                Log.w(MediaRouter.TAG, "Ignoring attempt to select removed route: " + routeInfo);
            } else if (!routeInfo.mEnabled) {
                Log.w(MediaRouter.TAG, "Ignoring attempt to select disabled route: " + routeInfo);
            } else {
                setSelectedRouteInternal(routeInfo, i);
            }
        }

        public void sendControlRequest(RouteInfo routeInfo, Intent intent, ControlRequestCallback controlRequestCallback) {
            if ((routeInfo != this.mSelectedRoute || this.mSelectedRouteController == null || !this.mSelectedRouteController.onControlRequest(intent, controlRequestCallback)) && controlRequestCallback != null) {
                controlRequestCallback.onError(null, null);
            }
        }

        public void setMediaSession(Object obj) {
            if (this.mMediaSession != null) {
                this.mMediaSession.clearVolumeHandling();
            }
            if (obj == null) {
                this.mMediaSession = null;
                return;
            }
            this.mMediaSession = new MediaSessionRecord(obj);
            updatePlaybackInfoFromSelectedRoute();
        }

        public void setMediaSessionCompat(MediaSessionCompat mediaSessionCompat) {
            this.mCompatSession = mediaSessionCompat;
            if (Build.VERSION.SDK_INT >= 21) {
                setMediaSession(mediaSessionCompat != null ? mediaSessionCompat.getMediaSession() : null);
            } else if (Build.VERSION.SDK_INT < 14) {
            } else {
                if (this.mRccMediaSession != null) {
                    removeRemoteControlClient(this.mRccMediaSession.getRemoteControlClient());
                    this.mRccMediaSession.removeOnActiveChangeListener(this.mSessionActiveListener);
                }
                this.mRccMediaSession = mediaSessionCompat;
                if (mediaSessionCompat == null) {
                    return;
                }
                mediaSessionCompat.addOnActiveChangeListener(this.mSessionActiveListener);
                if (!mediaSessionCompat.isActive()) {
                    return;
                }
                addRemoteControlClient(mediaSessionCompat.getRemoteControlClient());
            }
        }

        public void start() {
            this.mRegisteredProviderWatcher = new RegisteredMediaRouteProviderWatcher(this.mApplicationContext, this);
            this.mRegisteredProviderWatcher.start();
        }

        public void updateDiscoveryRequest() {
            MediaRouteSelector.Builder builder = new MediaRouteSelector.Builder();
            int size = this.mRouters.size();
            boolean z = false;
            boolean z2 = false;
            while (true) {
                int i = size - 1;
                if (i < 0) {
                    break;
                }
                MediaRouter mediaRouter = this.mRouters.get(i).get();
                if (mediaRouter == null) {
                    this.mRouters.remove(i);
                } else {
                    int size2 = mediaRouter.mCallbackRecords.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        CallbackRecord callbackRecord = mediaRouter.mCallbackRecords.get(i2);
                        builder.addSelector(callbackRecord.mSelector);
                        if ((callbackRecord.mFlags & 1) != 0) {
                            z = true;
                            z2 = true;
                        }
                        if ((callbackRecord.mFlags & 4) != 0 && !this.mLowRam) {
                            z2 = true;
                        }
                        if ((callbackRecord.mFlags & 8) != 0) {
                            z2 = true;
                        }
                    }
                }
                size = i;
            }
            MediaRouteSelector build = z2 ? builder.build() : MediaRouteSelector.EMPTY;
            if (this.mDiscoveryRequest == null || !this.mDiscoveryRequest.getSelector().equals(build) || this.mDiscoveryRequest.isActiveScan() != z) {
                if (!build.isEmpty() || z) {
                    this.mDiscoveryRequest = new MediaRouteDiscoveryRequest(build, z);
                } else if (this.mDiscoveryRequest == null) {
                    return;
                } else {
                    this.mDiscoveryRequest = null;
                }
                if (MediaRouter.DEBUG) {
                    Log.d(MediaRouter.TAG, "Updated discovery request: " + this.mDiscoveryRequest);
                }
                if (z2 && !z && this.mLowRam) {
                    Log.i(MediaRouter.TAG, "Forcing passive route discovery on a low-RAM device, system performance may be affected.  Please consider using CALLBACK_FLAG_REQUEST_DISCOVERY instead of CALLBACK_FLAG_FORCE_DISCOVERY.");
                }
                int size3 = this.mProviders.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    this.mProviders.get(i3).mProviderInstance.setDiscoveryRequest(this.mDiscoveryRequest);
                }
            }
        }
    }

    /* renamed from: android.support.v7.media.MediaRouter$ProviderInfo */
    /* loaded from: classes.dex */
    public static final class ProviderInfo {
        private MediaRouteProviderDescriptor mDescriptor;
        private final MediaRouteProvider.ProviderMetadata mMetadata;
        private final MediaRouteProvider mProviderInstance;
        private Resources mResources;
        private boolean mResourcesNotAvailable;
        private final List<RouteInfo> mRoutes = new ArrayList();

        ProviderInfo(MediaRouteProvider mediaRouteProvider) {
            this.mProviderInstance = mediaRouteProvider;
            this.mMetadata = mediaRouteProvider.getMetadata();
        }

        int findRouteByDescriptorId(String str) {
            int size = this.mRoutes.size();
            for (int i = 0; i < size; i++) {
                if (this.mRoutes.get(i).mDescriptorId.equals(str)) {
                    return i;
                }
            }
            return -1;
        }

        public ComponentName getComponentName() {
            return this.mMetadata.getComponentName();
        }

        public String getPackageName() {
            return this.mMetadata.getPackageName();
        }

        public MediaRouteProvider getProviderInstance() {
            MediaRouter.checkCallingThread();
            return this.mProviderInstance;
        }

        Resources getResources() {
            if (this.mResources == null && !this.mResourcesNotAvailable) {
                String packageName = getPackageName();
                Context providerContext = MediaRouter.sGlobal.getProviderContext(packageName);
                if (providerContext != null) {
                    this.mResources = providerContext.getResources();
                } else {
                    Log.w(MediaRouter.TAG, "Unable to obtain resources for route provider package: " + packageName);
                    this.mResourcesNotAvailable = true;
                }
            }
            return this.mResources;
        }

        public List<RouteInfo> getRoutes() {
            MediaRouter.checkCallingThread();
            return this.mRoutes;
        }

        public String toString() {
            return "MediaRouter.RouteProviderInfo{ packageName=" + getPackageName() + " }";
        }

        boolean updateDescriptor(MediaRouteProviderDescriptor mediaRouteProviderDescriptor) {
            if (this.mDescriptor != mediaRouteProviderDescriptor) {
                this.mDescriptor = mediaRouteProviderDescriptor;
                return true;
            }
            return false;
        }
    }

    /* renamed from: android.support.v7.media.MediaRouter$RouteGroup */
    /* loaded from: classes.dex */
    public static class RouteGroup extends RouteInfo {
        private List<RouteInfo> mRoutes = new ArrayList();

        RouteGroup(ProviderInfo providerInfo, String str, String str2) {
            super(providerInfo, str, str2);
        }

        public RouteInfo getRouteAt(int i) {
            return this.mRoutes.get(i);
        }

        public int getRouteCount() {
            return this.mRoutes.size();
        }

        public List<RouteInfo> getRoutes() {
            return this.mRoutes;
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
        @Override // android.support.p004v7.media.MediaRouter.RouteInfo
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        int maybeUpdateDescriptor(MediaRouteDescriptor mediaRouteDescriptor) {
            boolean z;
            int i = 1;
            if (this.mDescriptor != mediaRouteDescriptor) {
                this.mDescriptor = mediaRouteDescriptor;
                if (mediaRouteDescriptor != null) {
                    List<String> groupMemberIds = mediaRouteDescriptor.getGroupMemberIds();
                    ArrayList arrayList = new ArrayList();
                    boolean z2 = groupMemberIds.size() != this.mRoutes.size();
                    Iterator<String> it2 = groupMemberIds.iterator();
                    while (true) {
                        z = z2;
                        if (!it2.hasNext()) {
                            break;
                        }
                        RouteInfo route = MediaRouter.sGlobal.getRoute(MediaRouter.sGlobal.getUniqueId(getProvider(), it2.next()));
                        if (route != null) {
                            arrayList.add(route);
                            if (!z && !this.mRoutes.contains(route)) {
                                z2 = true;
                            }
                        }
                        z2 = z;
                    }
                    if (z) {
                        this.mRoutes = arrayList;
                    }
                    if (!z) {
                        i = 0;
                    }
                    return super.updateDescriptor(mediaRouteDescriptor) | i;
                }
            }
            z = false;
            if (!z) {
            }
            return super.updateDescriptor(mediaRouteDescriptor) | i;
        }

        @Override // android.support.p004v7.media.MediaRouter.RouteInfo
        public String toString() {
            StringBuilder sb = new StringBuilder(super.toString());
            sb.append('[');
            int size = this.mRoutes.size();
            for (int i = 0; i < size; i++) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(this.mRoutes.get(i));
            }
            sb.append(']');
            return sb.toString();
        }
    }

    /* renamed from: android.support.v7.media.MediaRouter$RouteInfo */
    /* loaded from: classes.dex */
    public static class RouteInfo {
        static final int CHANGE_GENERAL = 1;
        static final int CHANGE_PRESENTATION_DISPLAY = 4;
        static final int CHANGE_VOLUME = 2;
        public static final int CONNECTION_STATE_CONNECTED = 2;
        public static final int CONNECTION_STATE_CONNECTING = 1;
        public static final int CONNECTION_STATE_DISCONNECTED = 0;
        public static final int DEVICE_TYPE_BLUETOOTH = 3;
        public static final int DEVICE_TYPE_SPEAKER = 2;
        public static final int DEVICE_TYPE_TV = 1;
        public static final int DEVICE_TYPE_UNKNOWN = 0;
        public static final int PLAYBACK_TYPE_LOCAL = 0;
        public static final int PLAYBACK_TYPE_REMOTE = 1;
        public static final int PLAYBACK_VOLUME_FIXED = 0;
        public static final int PLAYBACK_VOLUME_VARIABLE = 1;
        public static final int PRESENTATION_DISPLAY_ID_NONE = -1;
        static final String SYSTEM_MEDIA_ROUTE_PROVIDER_PACKAGE_NAME = "android";
        private boolean mCanDisconnect;
        private boolean mConnecting;
        private int mConnectionState;
        private String mDescription;
        MediaRouteDescriptor mDescriptor;
        private final String mDescriptorId;
        private int mDeviceType;
        private boolean mEnabled;
        private Bundle mExtras;
        private Uri mIconUri;
        private String mName;
        private int mPlaybackStream;
        private int mPlaybackType;
        private Display mPresentationDisplay;
        private final ProviderInfo mProvider;
        private IntentSender mSettingsIntent;
        private final String mUniqueId;
        private int mVolume;
        private int mVolumeHandling;
        private int mVolumeMax;
        private final ArrayList<IntentFilter> mControlFilters = new ArrayList<>();
        private int mPresentationDisplayId = -1;

        RouteInfo(ProviderInfo providerInfo, String str, String str2) {
            this.mProvider = providerInfo;
            this.mDescriptorId = str;
            this.mUniqueId = str2;
        }

        private static boolean isSystemMediaRouteProvider(RouteInfo routeInfo) {
            return TextUtils.equals(routeInfo.getProviderInstance().getMetadata().getPackageName(), "android");
        }

        public boolean canDisconnect() {
            return this.mCanDisconnect;
        }

        public int getConnectionState() {
            return this.mConnectionState;
        }

        public List<IntentFilter> getControlFilters() {
            return this.mControlFilters;
        }

        @Nullable
        public String getDescription() {
            return this.mDescription;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public String getDescriptorId() {
            return this.mDescriptorId;
        }

        public int getDeviceType() {
            return this.mDeviceType;
        }

        @Nullable
        public Bundle getExtras() {
            return this.mExtras;
        }

        public Uri getIconUri() {
            return this.mIconUri;
        }

        @NonNull
        public String getId() {
            return this.mUniqueId;
        }

        public String getName() {
            return this.mName;
        }

        public int getPlaybackStream() {
            return this.mPlaybackStream;
        }

        public int getPlaybackType() {
            return this.mPlaybackType;
        }

        @Nullable
        public Display getPresentationDisplay() {
            MediaRouter.checkCallingThread();
            if (this.mPresentationDisplayId >= 0 && this.mPresentationDisplay == null) {
                this.mPresentationDisplay = MediaRouter.sGlobal.getDisplay(this.mPresentationDisplayId);
            }
            return this.mPresentationDisplay;
        }

        public int getPresentationDisplayId() {
            return this.mPresentationDisplayId;
        }

        public ProviderInfo getProvider() {
            return this.mProvider;
        }

        public MediaRouteProvider getProviderInstance() {
            return this.mProvider.getProviderInstance();
        }

        @Nullable
        public IntentSender getSettingsIntent() {
            return this.mSettingsIntent;
        }

        public int getVolume() {
            return this.mVolume;
        }

        public int getVolumeHandling() {
            return this.mVolumeHandling;
        }

        public int getVolumeMax() {
            return this.mVolumeMax;
        }

        public boolean isConnecting() {
            return this.mConnecting;
        }

        public boolean isDefault() {
            MediaRouter.checkCallingThread();
            return MediaRouter.sGlobal.getDefaultRoute() == this;
        }

        public boolean isDefaultOrBluetooth() {
            if (isDefault() || this.mDeviceType == 3) {
                return true;
            }
            return isSystemMediaRouteProvider(this) && supportsControlCategory(MediaControlIntent.CATEGORY_LIVE_AUDIO) && !supportsControlCategory(MediaControlIntent.CATEGORY_LIVE_VIDEO);
        }

        public boolean isEnabled() {
            return this.mEnabled;
        }

        public boolean isSelected() {
            MediaRouter.checkCallingThread();
            return MediaRouter.sGlobal.getSelectedRoute() == this;
        }

        public boolean matchesSelector(@NonNull MediaRouteSelector mediaRouteSelector) {
            if (mediaRouteSelector == null) {
                throw new IllegalArgumentException("selector must not be null");
            }
            MediaRouter.checkCallingThread();
            return mediaRouteSelector.matchesControlFilters(this.mControlFilters);
        }

        int maybeUpdateDescriptor(MediaRouteDescriptor mediaRouteDescriptor) {
            if (this.mDescriptor != mediaRouteDescriptor) {
                return updateDescriptor(mediaRouteDescriptor);
            }
            return 0;
        }

        public void requestSetVolume(int i) {
            MediaRouter.checkCallingThread();
            MediaRouter.sGlobal.requestSetVolume(this, Math.min(this.mVolumeMax, Math.max(0, i)));
        }

        public void requestUpdateVolume(int i) {
            MediaRouter.checkCallingThread();
            if (i != 0) {
                MediaRouter.sGlobal.requestUpdateVolume(this, i);
            }
        }

        public void select() {
            MediaRouter.checkCallingThread();
            MediaRouter.sGlobal.selectRoute(this);
        }

        public void sendControlRequest(@NonNull Intent intent, @Nullable ControlRequestCallback controlRequestCallback) {
            if (intent == null) {
                throw new IllegalArgumentException("intent must not be null");
            }
            MediaRouter.checkCallingThread();
            MediaRouter.sGlobal.sendControlRequest(this, intent, controlRequestCallback);
        }

        public boolean supportsControlAction(@NonNull String str, @NonNull String str2) {
            if (str == null) {
                throw new IllegalArgumentException("category must not be null");
            }
            if (str2 == null) {
                throw new IllegalArgumentException("action must not be null");
            }
            MediaRouter.checkCallingThread();
            int size = this.mControlFilters.size();
            for (int i = 0; i < size; i++) {
                IntentFilter intentFilter = this.mControlFilters.get(i);
                if (intentFilter.hasCategory(str) && intentFilter.hasAction(str2)) {
                    return true;
                }
            }
            return false;
        }

        public boolean supportsControlCategory(@NonNull String str) {
            if (str == null) {
                throw new IllegalArgumentException("category must not be null");
            }
            MediaRouter.checkCallingThread();
            int size = this.mControlFilters.size();
            for (int i = 0; i < size; i++) {
                if (this.mControlFilters.get(i).hasCategory(str)) {
                    return true;
                }
            }
            return false;
        }

        public boolean supportsControlRequest(@NonNull Intent intent) {
            if (intent == null) {
                throw new IllegalArgumentException("intent must not be null");
            }
            MediaRouter.checkCallingThread();
            ContentResolver contentResolver = MediaRouter.sGlobal.getContentResolver();
            int size = this.mControlFilters.size();
            for (int i = 0; i < size; i++) {
                if (this.mControlFilters.get(i).match(contentResolver, intent, true, MediaRouter.TAG) >= 0) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            return "MediaRouter.RouteInfo{ uniqueId=" + this.mUniqueId + ", name=" + this.mName + ", description=" + this.mDescription + ", iconUri=" + this.mIconUri + ", enabled=" + this.mEnabled + ", connecting=" + this.mConnecting + ", connectionState=" + this.mConnectionState + ", canDisconnect=" + this.mCanDisconnect + ", playbackType=" + this.mPlaybackType + ", playbackStream=" + this.mPlaybackStream + ", deviceType=" + this.mDeviceType + ", volumeHandling=" + this.mVolumeHandling + ", volume=" + this.mVolume + ", volumeMax=" + this.mVolumeMax + ", presentationDisplayId=" + this.mPresentationDisplayId + ", extras=" + this.mExtras + ", settingsIntent=" + this.mSettingsIntent + ", providerPackageName=" + this.mProvider.getPackageName() + " }";
        }

        int updateDescriptor(MediaRouteDescriptor mediaRouteDescriptor) {
            int i = 0;
            this.mDescriptor = mediaRouteDescriptor;
            if (mediaRouteDescriptor != null) {
                if (!MediaRouter.equal(this.mName, mediaRouteDescriptor.getName())) {
                    this.mName = mediaRouteDescriptor.getName();
                    i = 1;
                }
                if (!MediaRouter.equal(this.mDescription, mediaRouteDescriptor.getDescription())) {
                    this.mDescription = mediaRouteDescriptor.getDescription();
                    i |= 1;
                }
                if (!MediaRouter.equal(this.mIconUri, mediaRouteDescriptor.getIconUri())) {
                    this.mIconUri = mediaRouteDescriptor.getIconUri();
                    i |= 1;
                }
                if (this.mEnabled != mediaRouteDescriptor.isEnabled()) {
                    this.mEnabled = mediaRouteDescriptor.isEnabled();
                    i |= 1;
                }
                if (this.mConnecting != mediaRouteDescriptor.isConnecting()) {
                    this.mConnecting = mediaRouteDescriptor.isConnecting();
                    i |= 1;
                }
                if (this.mConnectionState != mediaRouteDescriptor.getConnectionState()) {
                    this.mConnectionState = mediaRouteDescriptor.getConnectionState();
                    i |= 1;
                }
                if (!this.mControlFilters.equals(mediaRouteDescriptor.getControlFilters())) {
                    this.mControlFilters.clear();
                    this.mControlFilters.addAll(mediaRouteDescriptor.getControlFilters());
                    i |= 1;
                }
                if (this.mPlaybackType != mediaRouteDescriptor.getPlaybackType()) {
                    this.mPlaybackType = mediaRouteDescriptor.getPlaybackType();
                    i |= 1;
                }
                if (this.mPlaybackStream != mediaRouteDescriptor.getPlaybackStream()) {
                    this.mPlaybackStream = mediaRouteDescriptor.getPlaybackStream();
                    i |= 1;
                }
                if (this.mDeviceType != mediaRouteDescriptor.getDeviceType()) {
                    this.mDeviceType = mediaRouteDescriptor.getDeviceType();
                    i |= 1;
                }
                if (this.mVolumeHandling != mediaRouteDescriptor.getVolumeHandling()) {
                    this.mVolumeHandling = mediaRouteDescriptor.getVolumeHandling();
                    i |= 3;
                }
                if (this.mVolume != mediaRouteDescriptor.getVolume()) {
                    this.mVolume = mediaRouteDescriptor.getVolume();
                    i |= 3;
                }
                if (this.mVolumeMax != mediaRouteDescriptor.getVolumeMax()) {
                    this.mVolumeMax = mediaRouteDescriptor.getVolumeMax();
                    i |= 3;
                }
                if (this.mPresentationDisplayId != mediaRouteDescriptor.getPresentationDisplayId()) {
                    this.mPresentationDisplayId = mediaRouteDescriptor.getPresentationDisplayId();
                    this.mPresentationDisplay = null;
                    i |= 5;
                }
                if (!MediaRouter.equal(this.mExtras, mediaRouteDescriptor.getExtras())) {
                    this.mExtras = mediaRouteDescriptor.getExtras();
                    i |= 1;
                }
                if (!MediaRouter.equal(this.mSettingsIntent, mediaRouteDescriptor.getSettingsActivity())) {
                    this.mSettingsIntent = mediaRouteDescriptor.getSettingsActivity();
                    i |= 1;
                }
                if (this.mCanDisconnect == mediaRouteDescriptor.canDisconnectAndKeepPlaying()) {
                    return i;
                }
                this.mCanDisconnect = mediaRouteDescriptor.canDisconnectAndKeepPlaying();
                return i | 5;
            }
            return 0;
        }
    }

    MediaRouter(Context context) {
        this.mContext = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void checkCallingThread() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("The media router service must only be accessed on the application's main thread.");
        }
    }

    static <T> boolean equal(T t, T t2) {
        return t == t2 || !(t == null || t2 == null || !t.equals(t2));
    }

    private int findCallbackRecord(Callback callback) {
        int size = this.mCallbackRecords.size();
        for (int i = 0; i < size; i++) {
            if (this.mCallbackRecords.get(i).mCallback == callback) {
                return i;
            }
        }
        return -1;
    }

    public static MediaRouter getInstance(@NonNull Context context) {
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        }
        checkCallingThread();
        if (sGlobal == null) {
            sGlobal = new GlobalMediaRouter(context.getApplicationContext());
            sGlobal.start();
        }
        return sGlobal.getRouter(context);
    }

    public void addCallback(MediaRouteSelector mediaRouteSelector, Callback callback) {
        addCallback(mediaRouteSelector, callback, 0);
    }

    public void addCallback(@NonNull MediaRouteSelector mediaRouteSelector, @NonNull Callback callback, int i) {
        CallbackRecord callbackRecord;
        boolean z = true;
        if (mediaRouteSelector == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (callback == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        checkCallingThread();
        if (DEBUG) {
            Log.d(TAG, "addCallback: selector=" + mediaRouteSelector + ", callback=" + callback + ", flags=" + Integer.toHexString(i));
        }
        int findCallbackRecord = findCallbackRecord(callback);
        if (findCallbackRecord < 0) {
            callbackRecord = new CallbackRecord(this, callback);
            this.mCallbackRecords.add(callbackRecord);
        } else {
            callbackRecord = this.mCallbackRecords.get(findCallbackRecord);
        }
        boolean z2 = false;
        if (((callbackRecord.mFlags ^ (-1)) & i) != 0) {
            callbackRecord.mFlags |= i;
            z2 = true;
        }
        if (!callbackRecord.mSelector.contains(mediaRouteSelector)) {
            callbackRecord.mSelector = new MediaRouteSelector.Builder(callbackRecord.mSelector).addSelector(mediaRouteSelector).build();
        } else {
            z = z2;
        }
        if (!z) {
            return;
        }
        sGlobal.updateDiscoveryRequest();
    }

    public void addProvider(@NonNull MediaRouteProvider mediaRouteProvider) {
        if (mediaRouteProvider == null) {
            throw new IllegalArgumentException("providerInstance must not be null");
        }
        checkCallingThread();
        if (DEBUG) {
            Log.d(TAG, "addProvider: " + mediaRouteProvider);
        }
        sGlobal.addProvider(mediaRouteProvider);
    }

    public void addRemoteControlClient(@NonNull Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("remoteControlClient must not be null");
        }
        checkCallingThread();
        if (DEBUG) {
            Log.d(TAG, "addRemoteControlClient: " + obj);
        }
        sGlobal.addRemoteControlClient(obj);
    }

    @NonNull
    public RouteInfo getDefaultRoute() {
        checkCallingThread();
        return sGlobal.getDefaultRoute();
    }

    public MediaSessionCompat.Token getMediaSessionToken() {
        return sGlobal.getMediaSessionToken();
    }

    public List<ProviderInfo> getProviders() {
        checkCallingThread();
        return sGlobal.getProviders();
    }

    public List<RouteInfo> getRoutes() {
        checkCallingThread();
        return sGlobal.getRoutes();
    }

    @NonNull
    public RouteInfo getSelectedRoute() {
        checkCallingThread();
        return sGlobal.getSelectedRoute();
    }

    public boolean isRouteAvailable(@NonNull MediaRouteSelector mediaRouteSelector, int i) {
        if (mediaRouteSelector == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        checkCallingThread();
        return sGlobal.isRouteAvailable(mediaRouteSelector, i);
    }

    public void removeCallback(@NonNull Callback callback) {
        if (callback == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        checkCallingThread();
        if (DEBUG) {
            Log.d(TAG, "removeCallback: callback=" + callback);
        }
        int findCallbackRecord = findCallbackRecord(callback);
        if (findCallbackRecord < 0) {
            return;
        }
        this.mCallbackRecords.remove(findCallbackRecord);
        sGlobal.updateDiscoveryRequest();
    }

    public void removeProvider(@NonNull MediaRouteProvider mediaRouteProvider) {
        if (mediaRouteProvider == null) {
            throw new IllegalArgumentException("providerInstance must not be null");
        }
        checkCallingThread();
        if (DEBUG) {
            Log.d(TAG, "removeProvider: " + mediaRouteProvider);
        }
        sGlobal.removeProvider(mediaRouteProvider);
    }

    public void removeRemoteControlClient(@NonNull Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("remoteControlClient must not be null");
        }
        if (DEBUG) {
            Log.d(TAG, "removeRemoteControlClient: " + obj);
        }
        sGlobal.removeRemoteControlClient(obj);
    }

    public void selectRoute(@NonNull RouteInfo routeInfo) {
        if (routeInfo == null) {
            throw new IllegalArgumentException("route must not be null");
        }
        checkCallingThread();
        if (DEBUG) {
            Log.d(TAG, "selectRoute: " + routeInfo);
        }
        sGlobal.selectRoute(routeInfo);
    }

    public void setMediaSession(Object obj) {
        if (DEBUG) {
            Log.d(TAG, "addMediaSession: " + obj);
        }
        sGlobal.setMediaSession(obj);
    }

    public void setMediaSessionCompat(MediaSessionCompat mediaSessionCompat) {
        if (DEBUG) {
            Log.d(TAG, "addMediaSessionCompat: " + mediaSessionCompat);
        }
        sGlobal.setMediaSessionCompat(mediaSessionCompat);
    }

    public void unselect(int i) {
        if (i < 0 || i > 3) {
            throw new IllegalArgumentException("Unsupported reason to unselect route");
        }
        checkCallingThread();
        RouteInfo chooseFallbackRoute = sGlobal.chooseFallbackRoute();
        if (sGlobal.getSelectedRoute() != chooseFallbackRoute) {
            sGlobal.selectRoute(chooseFallbackRoute, i);
        } else {
            sGlobal.selectRoute(sGlobal.getDefaultRoute(), i);
        }
    }

    @NonNull
    public RouteInfo updateSelectedRoute(@NonNull MediaRouteSelector mediaRouteSelector) {
        if (mediaRouteSelector == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        checkCallingThread();
        if (DEBUG) {
            Log.d(TAG, "updateSelectedRoute: " + mediaRouteSelector);
        }
        RouteInfo selectedRoute = sGlobal.getSelectedRoute();
        if (selectedRoute.isDefaultOrBluetooth() || selectedRoute.matchesSelector(mediaRouteSelector)) {
            return selectedRoute;
        }
        RouteInfo chooseFallbackRoute = sGlobal.chooseFallbackRoute();
        sGlobal.selectRoute(chooseFallbackRoute);
        return chooseFallbackRoute;
    }
}
