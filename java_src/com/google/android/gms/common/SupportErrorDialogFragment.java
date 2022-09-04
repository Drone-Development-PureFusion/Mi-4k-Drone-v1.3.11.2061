package com.google.android.gms.common;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.p001v4.app.DialogFragment;
import android.support.p001v4.app.FragmentManager;
import com.google.android.gms.common.internal.C4588d;
/* loaded from: classes2.dex */
public class SupportErrorDialogFragment extends DialogFragment {

    /* renamed from: a */
    private Dialog f16781a = null;

    /* renamed from: b */
    private DialogInterface.OnCancelListener f16782b = null;

    /* renamed from: a */
    public static SupportErrorDialogFragment m24036a(Dialog dialog) {
        return m24035a(dialog, null);
    }

    /* renamed from: a */
    public static SupportErrorDialogFragment m24035a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        SupportErrorDialogFragment supportErrorDialogFragment = new SupportErrorDialogFragment();
        Dialog dialog2 = (Dialog) C4588d.m23626a(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        supportErrorDialogFragment.f16781a = dialog2;
        if (onCancelListener != null) {
            supportErrorDialogFragment.f16782b = onCancelListener;
        }
        return supportErrorDialogFragment;
    }

    @Override // android.support.p001v4.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        if (this.f16782b != null) {
            this.f16782b.onCancel(dialogInterface);
        }
    }

    @Override // android.support.p001v4.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        if (this.f16781a == null) {
            setShowsDialog(false);
        }
        return this.f16781a;
    }

    @Override // android.support.p001v4.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
