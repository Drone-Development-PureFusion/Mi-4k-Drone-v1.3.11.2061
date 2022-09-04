package android.support.p004v7.media;

import android.content.Context;
import android.os.Build;
import android.support.p004v7.media.MediaRouterJellybean;
import java.lang.ref.WeakReference;
/* renamed from: android.support.v7.media.RemoteControlClientCompat */
/* loaded from: classes.dex */
abstract class RemoteControlClientCompat {
    protected final Context mContext;
    protected final Object mRcc;
    protected VolumeCallback mVolumeCallback;

    /* renamed from: android.support.v7.media.RemoteControlClientCompat$JellybeanImpl */
    /* loaded from: classes.dex */
    static class JellybeanImpl extends RemoteControlClientCompat {
        private boolean mRegistered;
        private final Object mRouterObj;
        private final Object mUserRouteCategoryObj;
        private final Object mUserRouteObj;

        /* renamed from: android.support.v7.media.RemoteControlClientCompat$JellybeanImpl$VolumeCallbackWrapper */
        /* loaded from: classes.dex */
        private static final class VolumeCallbackWrapper implements MediaRouterJellybean.VolumeCallback {
            private final WeakReference<JellybeanImpl> mImplWeak;

            public VolumeCallbackWrapper(JellybeanImpl jellybeanImpl) {
                this.mImplWeak = new WeakReference<>(jellybeanImpl);
            }

            @Override // android.support.p004v7.media.MediaRouterJellybean.VolumeCallback
            public void onVolumeSetRequest(Object obj, int i) {
                JellybeanImpl jellybeanImpl = this.mImplWeak.get();
                if (jellybeanImpl == null || jellybeanImpl.mVolumeCallback == null) {
                    return;
                }
                jellybeanImpl.mVolumeCallback.onVolumeSetRequest(i);
            }

            @Override // android.support.p004v7.media.MediaRouterJellybean.VolumeCallback
            public void onVolumeUpdateRequest(Object obj, int i) {
                JellybeanImpl jellybeanImpl = this.mImplWeak.get();
                if (jellybeanImpl == null || jellybeanImpl.mVolumeCallback == null) {
                    return;
                }
                jellybeanImpl.mVolumeCallback.onVolumeUpdateRequest(i);
            }
        }

        public JellybeanImpl(Context context, Object obj) {
            super(context, obj);
            this.mRouterObj = MediaRouterJellybean.getMediaRouter(context);
            this.mUserRouteCategoryObj = MediaRouterJellybean.createRouteCategory(this.mRouterObj, "", false);
            this.mUserRouteObj = MediaRouterJellybean.createUserRoute(this.mRouterObj, this.mUserRouteCategoryObj);
        }

        @Override // android.support.p004v7.media.RemoteControlClientCompat
        public void setPlaybackInfo(PlaybackInfo playbackInfo) {
            MediaRouterJellybean.UserRouteInfo.setVolume(this.mUserRouteObj, playbackInfo.volume);
            MediaRouterJellybean.UserRouteInfo.setVolumeMax(this.mUserRouteObj, playbackInfo.volumeMax);
            MediaRouterJellybean.UserRouteInfo.setVolumeHandling(this.mUserRouteObj, playbackInfo.volumeHandling);
            MediaRouterJellybean.UserRouteInfo.setPlaybackStream(this.mUserRouteObj, playbackInfo.playbackStream);
            MediaRouterJellybean.UserRouteInfo.setPlaybackType(this.mUserRouteObj, playbackInfo.playbackType);
            if (!this.mRegistered) {
                this.mRegistered = true;
                MediaRouterJellybean.UserRouteInfo.setVolumeCallback(this.mUserRouteObj, MediaRouterJellybean.createVolumeCallback(new VolumeCallbackWrapper(this)));
                MediaRouterJellybean.UserRouteInfo.setRemoteControlClient(this.mUserRouteObj, this.mRcc);
            }
        }
    }

    /* renamed from: android.support.v7.media.RemoteControlClientCompat$LegacyImpl */
    /* loaded from: classes.dex */
    static class LegacyImpl extends RemoteControlClientCompat {
        public LegacyImpl(Context context, Object obj) {
            super(context, obj);
        }
    }

    /* renamed from: android.support.v7.media.RemoteControlClientCompat$PlaybackInfo */
    /* loaded from: classes.dex */
    public static final class PlaybackInfo {
        public int volume;
        public int volumeMax;
        public int volumeHandling = 0;
        public int playbackStream = 3;
        public int playbackType = 1;
    }

    /* renamed from: android.support.v7.media.RemoteControlClientCompat$VolumeCallback */
    /* loaded from: classes.dex */
    public interface VolumeCallback {
        void onVolumeSetRequest(int i);

        void onVolumeUpdateRequest(int i);
    }

    protected RemoteControlClientCompat(Context context, Object obj) {
        this.mContext = context;
        this.mRcc = obj;
    }

    public static RemoteControlClientCompat obtain(Context context, Object obj) {
        return Build.VERSION.SDK_INT >= 16 ? new JellybeanImpl(context, obj) : new LegacyImpl(context, obj);
    }

    public Object getRemoteControlClient() {
        return this.mRcc;
    }

    public void setPlaybackInfo(PlaybackInfo playbackInfo) {
    }

    public void setVolumeCallback(VolumeCallback volumeCallback) {
        this.mVolumeCallback = volumeCallback;
    }
}
