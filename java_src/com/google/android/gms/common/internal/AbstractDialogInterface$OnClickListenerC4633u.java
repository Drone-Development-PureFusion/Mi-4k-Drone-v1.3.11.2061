package com.google.android.gms.common.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.p001v4.app.Fragment;
import android.util.Log;
import com.google.android.gms.internal.aik;
/* renamed from: com.google.android.gms.common.internal.u */
/* loaded from: classes2.dex */
public abstract class AbstractDialogInterface$OnClickListenerC4633u implements DialogInterface.OnClickListener {
    /* renamed from: a */
    public static AbstractDialogInterface$OnClickListenerC4633u m23432a(final Activity activity, final Intent intent, final int i) {
        return new AbstractDialogInterface$OnClickListenerC4633u() { // from class: com.google.android.gms.common.internal.u.1
            @Override // com.google.android.gms.common.internal.AbstractDialogInterface$OnClickListenerC4633u
            /* renamed from: a */
            public void mo23429a() {
                if (intent != null) {
                    activity.startActivityForResult(intent, i);
                }
            }
        };
    }

    /* renamed from: a */
    public static AbstractDialogInterface$OnClickListenerC4633u m23431a(@NonNull final Fragment fragment, final Intent intent, final int i) {
        return new AbstractDialogInterface$OnClickListenerC4633u() { // from class: com.google.android.gms.common.internal.u.2
            @Override // com.google.android.gms.common.internal.AbstractDialogInterface$OnClickListenerC4633u
            /* renamed from: a */
            public void mo23429a() {
                if (intent != null) {
                    fragment.startActivityForResult(intent, i);
                }
            }
        };
    }

    /* renamed from: a */
    public static AbstractDialogInterface$OnClickListenerC4633u m23430a(@NonNull final aik aikVar, final Intent intent, final int i) {
        return new AbstractDialogInterface$OnClickListenerC4633u() { // from class: com.google.android.gms.common.internal.u.3
            @Override // com.google.android.gms.common.internal.AbstractDialogInterface$OnClickListenerC4633u
            @TargetApi(11)
            /* renamed from: a */
            public void mo23429a() {
                if (intent != null) {
                    aikVar.startActivityForResult(intent, i);
                }
            }
        };
    }

    /* renamed from: a */
    public abstract void mo23429a();

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            mo23429a();
            dialogInterface.dismiss();
        } catch (ActivityNotFoundException e) {
            Log.e("DialogRedirect", "Can't redirect to app settings for Google Play services", e);
        }
    }
}
