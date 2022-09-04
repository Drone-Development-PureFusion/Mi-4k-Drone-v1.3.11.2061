package android.support.p004v7.app;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.p001v4.view.ActionProvider;
import android.support.p004v7.media.MediaRouteSelector;
import android.support.p004v7.media.MediaRouter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
/* renamed from: android.support.v7.app.MediaRouteActionProvider */
/* loaded from: classes.dex */
public class MediaRouteActionProvider extends ActionProvider {
    private static final String TAG = "MediaRouteActionProvider";
    private MediaRouteButton mButton;
    private final MediaRouter mRouter;
    private MediaRouteSelector mSelector = MediaRouteSelector.EMPTY;
    private MediaRouteDialogFactory mDialogFactory = MediaRouteDialogFactory.getDefault();
    private final MediaRouterCallback mCallback = new MediaRouterCallback(this);

    /* renamed from: android.support.v7.app.MediaRouteActionProvider$MediaRouterCallback */
    /* loaded from: classes.dex */
    private static final class MediaRouterCallback extends MediaRouter.Callback {
        private final WeakReference<MediaRouteActionProvider> mProviderWeak;

        public MediaRouterCallback(MediaRouteActionProvider mediaRouteActionProvider) {
            this.mProviderWeak = new WeakReference<>(mediaRouteActionProvider);
        }

        private void refreshRoute(MediaRouter mediaRouter) {
            MediaRouteActionProvider mediaRouteActionProvider = this.mProviderWeak.get();
            if (mediaRouteActionProvider != null) {
                mediaRouteActionProvider.refreshRoute();
            } else {
                mediaRouter.removeCallback(this);
            }
        }

        @Override // android.support.p004v7.media.MediaRouter.Callback
        public void onProviderAdded(MediaRouter mediaRouter, MediaRouter.ProviderInfo providerInfo) {
            refreshRoute(mediaRouter);
        }

        @Override // android.support.p004v7.media.MediaRouter.Callback
        public void onProviderChanged(MediaRouter mediaRouter, MediaRouter.ProviderInfo providerInfo) {
            refreshRoute(mediaRouter);
        }

        @Override // android.support.p004v7.media.MediaRouter.Callback
        public void onProviderRemoved(MediaRouter mediaRouter, MediaRouter.ProviderInfo providerInfo) {
            refreshRoute(mediaRouter);
        }

        @Override // android.support.p004v7.media.MediaRouter.Callback
        public void onRouteAdded(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            refreshRoute(mediaRouter);
        }

        @Override // android.support.p004v7.media.MediaRouter.Callback
        public void onRouteChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            refreshRoute(mediaRouter);
        }

        @Override // android.support.p004v7.media.MediaRouter.Callback
        public void onRouteRemoved(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            refreshRoute(mediaRouter);
        }
    }

    public MediaRouteActionProvider(Context context) {
        super(context);
        this.mRouter = MediaRouter.getInstance(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void refreshRoute() {
        refreshVisibility();
    }

    @NonNull
    public MediaRouteDialogFactory getDialogFactory() {
        return this.mDialogFactory;
    }

    @Nullable
    public MediaRouteButton getMediaRouteButton() {
        return this.mButton;
    }

    @NonNull
    public MediaRouteSelector getRouteSelector() {
        return this.mSelector;
    }

    @Override // android.support.p001v4.view.ActionProvider
    public boolean isVisible() {
        return this.mRouter.isRouteAvailable(this.mSelector, 1);
    }

    @Override // android.support.p001v4.view.ActionProvider
    public View onCreateActionView() {
        if (this.mButton != null) {
            Log.e(TAG, "onCreateActionView: this ActionProvider is already associated with a menu item. Don't reuse MediaRouteActionProvider instances! Abandoning the old menu item...");
        }
        this.mButton = onCreateMediaRouteButton();
        this.mButton.setCheatSheetEnabled(true);
        this.mButton.setRouteSelector(this.mSelector);
        this.mButton.setDialogFactory(this.mDialogFactory);
        this.mButton.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
        return this.mButton;
    }

    public MediaRouteButton onCreateMediaRouteButton() {
        return new MediaRouteButton(getContext());
    }

    @Override // android.support.p001v4.view.ActionProvider
    public boolean onPerformDefaultAction() {
        if (this.mButton != null) {
            return this.mButton.showDialog();
        }
        return false;
    }

    @Override // android.support.p001v4.view.ActionProvider
    public boolean overridesItemVisibility() {
        return true;
    }

    public void setDialogFactory(@NonNull MediaRouteDialogFactory mediaRouteDialogFactory) {
        if (mediaRouteDialogFactory == null) {
            throw new IllegalArgumentException("factory must not be null");
        }
        if (this.mDialogFactory == mediaRouteDialogFactory) {
            return;
        }
        this.mDialogFactory = mediaRouteDialogFactory;
        if (this.mButton == null) {
            return;
        }
        this.mButton.setDialogFactory(mediaRouteDialogFactory);
    }

    public void setRouteSelector(@NonNull MediaRouteSelector mediaRouteSelector) {
        if (mediaRouteSelector == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.mSelector.equals(mediaRouteSelector)) {
            return;
        }
        if (!this.mSelector.isEmpty()) {
            this.mRouter.removeCallback(this.mCallback);
        }
        if (!mediaRouteSelector.isEmpty()) {
            this.mRouter.addCallback(mediaRouteSelector, this.mCallback);
        }
        this.mSelector = mediaRouteSelector;
        refreshRoute();
        if (this.mButton == null) {
            return;
        }
        this.mButton.setRouteSelector(mediaRouteSelector);
    }
}
