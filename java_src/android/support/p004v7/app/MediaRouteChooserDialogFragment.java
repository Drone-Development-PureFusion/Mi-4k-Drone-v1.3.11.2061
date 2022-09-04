package android.support.p004v7.app;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.p001v4.app.DialogFragment;
import android.support.p004v7.media.MediaRouteSelector;
/* renamed from: android.support.v7.app.MediaRouteChooserDialogFragment */
/* loaded from: classes.dex */
public class MediaRouteChooserDialogFragment extends DialogFragment {
    private final String ARGUMENT_SELECTOR = "selector";
    private MediaRouteChooserDialog mDialog;
    private MediaRouteSelector mSelector;

    public MediaRouteChooserDialogFragment() {
        setCancelable(true);
    }

    private void ensureRouteSelector() {
        if (this.mSelector == null) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                this.mSelector = MediaRouteSelector.fromBundle(arguments.getBundle("selector"));
            }
            if (this.mSelector != null) {
                return;
            }
            this.mSelector = MediaRouteSelector.EMPTY;
        }
    }

    public MediaRouteSelector getRouteSelector() {
        ensureRouteSelector();
        return this.mSelector;
    }

    @Override // android.support.p001v4.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.mDialog != null) {
            this.mDialog.updateLayout();
        }
    }

    public MediaRouteChooserDialog onCreateChooserDialog(Context context, Bundle bundle) {
        return new MediaRouteChooserDialog(context);
    }

    @Override // android.support.p001v4.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        this.mDialog = onCreateChooserDialog(getContext(), bundle);
        this.mDialog.setRouteSelector(getRouteSelector());
        return this.mDialog;
    }

    public void setRouteSelector(MediaRouteSelector mediaRouteSelector) {
        if (mediaRouteSelector == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        ensureRouteSelector();
        if (this.mSelector.equals(mediaRouteSelector)) {
            return;
        }
        this.mSelector = mediaRouteSelector;
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putBundle("selector", mediaRouteSelector.asBundle());
        setArguments(arguments);
        MediaRouteChooserDialog mediaRouteChooserDialog = (MediaRouteChooserDialog) getDialog();
        if (mediaRouteChooserDialog == null) {
            return;
        }
        mediaRouteChooserDialog.setRouteSelector(mediaRouteSelector);
    }
}
