package android.support.p004v7.app;

import android.app.Dialog;
import android.os.Bundle;
import android.support.p001v4.app.DialogFragment;
/* renamed from: android.support.v7.app.AppCompatDialogFragment */
/* loaded from: classes.dex */
public class AppCompatDialogFragment extends DialogFragment {
    @Override // android.support.p001v4.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        return new AppCompatDialog(getContext(), getTheme());
    }

    public void setupDialog(Dialog dialog, int i) {
        if (!(dialog instanceof AppCompatDialog)) {
            super.setupDialog(dialog, i);
            return;
        }
        AppCompatDialog appCompatDialog = (AppCompatDialog) dialog;
        switch (i) {
            case 1:
            case 2:
                break;
            default:
                return;
            case 3:
                dialog.getWindow().addFlags(24);
                break;
        }
        appCompatDialog.supportRequestWindowFeature(1);
    }
}
