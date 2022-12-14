package android.support.p004v7.app;

import android.support.annotation.NonNull;
/* renamed from: android.support.v7.app.MediaRouteDialogFactory */
/* loaded from: classes.dex */
public class MediaRouteDialogFactory {
    private static final MediaRouteDialogFactory sDefault = new MediaRouteDialogFactory();

    @NonNull
    public static MediaRouteDialogFactory getDefault() {
        return sDefault;
    }

    @NonNull
    public MediaRouteChooserDialogFragment onCreateChooserDialogFragment() {
        return new MediaRouteChooserDialogFragment();
    }

    @NonNull
    public MediaRouteControllerDialogFragment onCreateControllerDialogFragment() {
        return new MediaRouteControllerDialogFragment();
    }
}
