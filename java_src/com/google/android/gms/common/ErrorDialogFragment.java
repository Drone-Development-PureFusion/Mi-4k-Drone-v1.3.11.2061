package com.google.android.gms.common;

import android.annotation.TargetApi;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.gms.common.internal.C4588d;
@TargetApi(11)
/* loaded from: classes2.dex */
public class ErrorDialogFragment extends DialogFragment {

    /* renamed from: a */
    private Dialog f16769a = null;

    /* renamed from: b */
    private DialogInterface.OnCancelListener f16770b = null;

    /* renamed from: a */
    public static ErrorDialogFragment m24043a(Dialog dialog) {
        return m24042a(dialog, null);
    }

    /* renamed from: a */
    public static ErrorDialogFragment m24042a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        ErrorDialogFragment errorDialogFragment = new ErrorDialogFragment();
        Dialog dialog2 = (Dialog) C4588d.m23626a(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        errorDialogFragment.f16769a = dialog2;
        if (onCancelListener != null) {
            errorDialogFragment.f16770b = onCancelListener;
        }
        return errorDialogFragment;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        if (this.f16770b != null) {
            this.f16770b.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        if (this.f16769a == null) {
            setShowsDialog(false);
        }
        return this.f16769a;
    }

    @Override // android.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
