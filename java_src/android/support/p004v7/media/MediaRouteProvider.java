package android.support.p004v7.media;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.p004v7.media.MediaRouter;
/* renamed from: android.support.v7.media.MediaRouteProvider */
/* loaded from: classes.dex */
public abstract class MediaRouteProvider {
    private static final int MSG_DELIVER_DESCRIPTOR_CHANGED = 1;
    private static final int MSG_DELIVER_DISCOVERY_REQUEST_CHANGED = 2;
    private Callback mCallback;
    private final Context mContext;
    private MediaRouteProviderDescriptor mDescriptor;
    private MediaRouteDiscoveryRequest mDiscoveryRequest;
    private final ProviderHandler mHandler;
    private final ProviderMetadata mMetadata;
    private boolean mPendingDescriptorChange;
    private boolean mPendingDiscoveryRequestChange;

    /* renamed from: android.support.v7.media.MediaRouteProvider$Callback */
    /* loaded from: classes.dex */
    public static abstract class Callback {
        public void onDescriptorChanged(@NonNull MediaRouteProvider mediaRouteProvider, @Nullable MediaRouteProviderDescriptor mediaRouteProviderDescriptor) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.media.MediaRouteProvider$ProviderHandler */
    /* loaded from: classes.dex */
    public final class ProviderHandler extends Handler {
        private ProviderHandler() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    MediaRouteProvider.this.deliverDescriptorChanged();
                    return;
                case 2:
                    MediaRouteProvider.this.deliverDiscoveryRequestChanged();
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: android.support.v7.media.MediaRouteProvider$ProviderMetadata */
    /* loaded from: classes.dex */
    public static final class ProviderMetadata {
        private final ComponentName mComponentName;

        /* JADX INFO: Access modifiers changed from: package-private */
        public ProviderMetadata(ComponentName componentName) {
            if (componentName == null) {
                throw new IllegalArgumentException("componentName must not be null");
            }
            this.mComponentName = componentName;
        }

        public ComponentName getComponentName() {
            return this.mComponentName;
        }

        public String getPackageName() {
            return this.mComponentName.getPackageName();
        }

        public String toString() {
            return "ProviderMetadata{ componentName=" + this.mComponentName.flattenToShortString() + " }";
        }
    }

    /* renamed from: android.support.v7.media.MediaRouteProvider$RouteController */
    /* loaded from: classes.dex */
    public static abstract class RouteController {
        public boolean onControlRequest(Intent intent, @Nullable MediaRouter.ControlRequestCallback controlRequestCallback) {
            return false;
        }

        public void onRelease() {
        }

        public void onSelect() {
        }

        public void onSetVolume(int i) {
        }

        public void onUnselect() {
        }

        public void onUnselect(int i) {
            onUnselect();
        }

        public void onUpdateVolume(int i) {
        }
    }

    public MediaRouteProvider(@NonNull Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MediaRouteProvider(Context context, ProviderMetadata providerMetadata) {
        this.mHandler = new ProviderHandler();
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        }
        this.mContext = context;
        if (providerMetadata == null) {
            this.mMetadata = new ProviderMetadata(new ComponentName(context, getClass()));
        } else {
            this.mMetadata = providerMetadata;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void deliverDescriptorChanged() {
        this.mPendingDescriptorChange = false;
        if (this.mCallback != null) {
            this.mCallback.onDescriptorChanged(this, this.mDescriptor);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void deliverDiscoveryRequestChanged() {
        this.mPendingDiscoveryRequestChange = false;
        onDiscoveryRequestChanged(this.mDiscoveryRequest);
    }

    public final Context getContext() {
        return this.mContext;
    }

    @Nullable
    public final MediaRouteProviderDescriptor getDescriptor() {
        return this.mDescriptor;
    }

    @Nullable
    public final MediaRouteDiscoveryRequest getDiscoveryRequest() {
        return this.mDiscoveryRequest;
    }

    public final Handler getHandler() {
        return this.mHandler;
    }

    public final ProviderMetadata getMetadata() {
        return this.mMetadata;
    }

    @Nullable
    public RouteController onCreateRouteController(String str) {
        return null;
    }

    public void onDiscoveryRequestChanged(@Nullable MediaRouteDiscoveryRequest mediaRouteDiscoveryRequest) {
    }

    public final void setCallback(@Nullable Callback callback) {
        MediaRouter.checkCallingThread();
        this.mCallback = callback;
    }

    public final void setDescriptor(@Nullable MediaRouteProviderDescriptor mediaRouteProviderDescriptor) {
        MediaRouter.checkCallingThread();
        if (this.mDescriptor != mediaRouteProviderDescriptor) {
            this.mDescriptor = mediaRouteProviderDescriptor;
            if (this.mPendingDescriptorChange) {
                return;
            }
            this.mPendingDescriptorChange = true;
            this.mHandler.sendEmptyMessage(1);
        }
    }

    public final void setDiscoveryRequest(MediaRouteDiscoveryRequest mediaRouteDiscoveryRequest) {
        MediaRouter.checkCallingThread();
        if (this.mDiscoveryRequest != mediaRouteDiscoveryRequest) {
            if (this.mDiscoveryRequest != null && this.mDiscoveryRequest.equals(mediaRouteDiscoveryRequest)) {
                return;
            }
            this.mDiscoveryRequest = mediaRouteDiscoveryRequest;
            if (this.mPendingDiscoveryRequestChange) {
                return;
            }
            this.mPendingDiscoveryRequestChange = true;
            this.mHandler.sendEmptyMessage(2);
        }
    }
}
