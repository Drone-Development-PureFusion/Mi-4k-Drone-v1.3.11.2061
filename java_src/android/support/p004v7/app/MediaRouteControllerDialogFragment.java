package android.support.p004v7.app;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.p001v4.app.DialogFragment;
/* renamed from: android.support.v7.app.MediaRouteControllerDialogFragment */
/* loaded from: classes.dex */
public class MediaRouteControllerDialogFragment extends DialogFragment {
    private MediaRouteControllerDialog mDialog;

    public MediaRouteControllerDialogFragment() {
        setCancelable(true);
    }

    @Override // android.support.p001v4.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.mDialog != null) {
            this.mDialog.updateLayout();
        }
    }

    public MediaRouteControllerDialog onCreateControllerDialog(Context context, Bundle bundle) {
        return new MediaRouteControllerDialog(context);
    }

    @Override // android.support.p001v4.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        this.mDialog = onCreateControllerDialog(getContext(), bundle);
        return this.mDialog;
    }

    @Override // android.support.p001v4.app.DialogFragment, android.support.p001v4.app.Fragment
    public void onStop() {
        super.onStop();
        if (this.mDialog != null) {
            this.mDialog.clearGroupListAnimation(false);
        }
    }
}
