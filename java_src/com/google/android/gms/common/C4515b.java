package com.google.android.gms.common;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.p001v4.app.FragmentActivity;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.internal.AbstractDialogInterface$OnClickListenerC4633u;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.C4632t;
import com.google.android.gms.common.util.C4686i;
import com.google.android.gms.common.util.C4696s;
import com.google.android.gms.internal.aik;
import com.google.android.gms.internal.ain;
import com.google.android.gms.internal.zzqv;
import com.google.android.gms.p239g.AbstractC5285f;
import com.google.android.gms.p239g.C5290i;
import p005b.p006a.p007a.p029b.p052m.p053a.C0612f;
/* renamed from: com.google.android.gms.common.b */
/* loaded from: classes.dex */
public class C4515b extends C4648j {

    /* renamed from: b */
    public static final String f16877b = "com.google.android.gms";

    /* renamed from: e */
    private static final C4515b f16878e = new C4515b();

    /* renamed from: a */
    public static final int f16876a = C4648j.f17166c;

    C4515b() {
    }

    /* renamed from: a */
    public static C4515b m23920a() {
        return f16878e;
    }

    @Override // com.google.android.gms.common.C4648j
    /* renamed from: a */
    public int mo23375a(Context context) {
        return super.mo23375a(context);
    }

    /* renamed from: a */
    public Dialog m23918a(Activity activity, int i, int i2) {
        return m23917a(activity, i, i2, (DialogInterface.OnCancelListener) null);
    }

    /* renamed from: a */
    public Dialog m23917a(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        return m23912a(activity, i, AbstractDialogInterface$OnClickListenerC4633u.m23432a(activity, mo23372a(activity, i, C0612f.f1063a), i2), onCancelListener);
    }

    /* renamed from: a */
    public Dialog m23915a(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, 16842874);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(C4632t.m23435c(activity, 18));
        builder.setTitle(C4632t.m23439a(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        m23916a(activity, create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @TargetApi(14)
    /* renamed from: a */
    public Dialog m23912a(Context context, int i, AbstractDialogInterface$OnClickListenerC4633u abstractDialogInterface$OnClickListenerC4633u, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog.Builder builder = null;
        if (i == 0) {
            return null;
        }
        if (C4686i.m23137a(context) && i == 2) {
            i = 42;
        }
        if (C4696s.m23110d()) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(16843529, typedValue, true);
            if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
                builder = new AlertDialog.Builder(context, 5);
            }
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(C4632t.m23435c(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String m23433e = C4632t.m23433e(context, i);
        if (m23433e != null) {
            builder.setPositiveButton(m23433e, abstractDialogInterface$OnClickListenerC4633u);
        }
        String m23439a = C4632t.m23439a(context, i);
        if (m23439a != null) {
            builder.setTitle(m23439a);
        }
        return builder.create();
    }

    @Override // com.google.android.gms.common.C4648j
    @Nullable
    /* renamed from: a */
    public PendingIntent mo23374a(Context context, int i, int i2) {
        return super.mo23374a(context, i, i2);
    }

    @Override // com.google.android.gms.common.C4648j
    @Nullable
    /* renamed from: a */
    public PendingIntent mo23373a(Context context, int i, int i2, @Nullable String str) {
        return super.mo23373a(context, i, i2, str);
    }

    @Override // com.google.android.gms.common.C4648j
    @Nullable
    /* renamed from: a */
    public Intent mo23372a(Context context, int i, @Nullable String str) {
        return super.mo23372a(context, i, str);
    }

    @MainThread
    /* renamed from: a */
    public AbstractC5285f<Void> m23919a(Activity activity) {
        C4588d.m23620b("makeGooglePlayServicesAvailable must be called from the main thread");
        int mo23375a = mo23375a((Context) activity);
        if (mo23375a == 0) {
            return C5290i.m20825a((Object) null);
        }
        ain m17208a = ain.m17208a(activity);
        m17208a.m17207a(new ConnectionResult(mo23375a, null));
        return m17208a.m17203g();
    }

    @Nullable
    /* renamed from: a */
    public zzqv m23909a(Context context, zzqv.AbstractC8149a abstractC8149a) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        zzqv zzqvVar = new zzqv(abstractC8149a);
        context.registerReceiver(zzqvVar, intentFilter);
        zzqvVar.m12693a(context);
        if (!a(context, "com.google.android.gms")) {
            abstractC8149a.mo12692a();
            zzqvVar.m12694a();
            return null;
        }
        return zzqvVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @TargetApi(11)
    /* renamed from: a */
    public void m23916a(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        boolean z;
        try {
            z = activity instanceof FragmentActivity;
        } catch (NoClassDefFoundError e) {
            z = false;
        }
        if (z) {
            SupportErrorDialogFragment.m24035a(dialog, onCancelListener).show(((FragmentActivity) activity).getSupportFragmentManager(), str);
        } else if (!C4696s.m23114a()) {
            throw new RuntimeException("This Activity does not support Fragments.");
        } else {
            ErrorDialogFragment.m24042a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
        }
    }

    /* renamed from: a */
    public void m23913a(Context context, int i) {
        if (i == 6) {
            Log.e("GoogleApiAvailability", "showErrorNotification(context, errorCode) is called for RESOLUTION_REQUIRED when showErrorNotification(context, result) should be called");
        }
        if (mo23376a(i)) {
            C4536e.m23820a(i, context);
        }
    }

    /* renamed from: a */
    public void m23911a(Context context, ConnectionResult connectionResult) {
        PendingIntent m23906b = m23906b(context, connectionResult);
        if (m23906b != null) {
            C4536e.m23818a(connectionResult.m24046c(), context, m23906b);
        }
    }

    /* renamed from: a */
    public void m23910a(Context context, ConnectionResult connectionResult, int i) {
        PendingIntent m23906b = m23906b(context, connectionResult);
        if (m23906b != null) {
            C4536e.m23818a(connectionResult.m24046c(), context, GoogleApiActivity.m24027a(context, m23906b, i));
        }
    }

    @Override // com.google.android.gms.common.C4648j
    /* renamed from: a */
    public final boolean mo23376a(int i) {
        return super.mo23376a(i);
    }

    /* renamed from: a */
    public boolean m23914a(Activity activity, @NonNull aik aikVar, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog m23912a = m23912a(activity, i, AbstractDialogInterface$OnClickListenerC4633u.m23430a(aikVar, mo23372a(activity, i, C0612f.f1063a), i2), onCancelListener);
        if (m23912a == null) {
            return false;
        }
        m23916a(activity, m23912a, C4536e.f16916a, onCancelListener);
        return true;
    }

    @Nullable
    /* renamed from: b */
    public PendingIntent m23906b(Context context, ConnectionResult connectionResult) {
        if (connectionResult.m24050a()) {
            return connectionResult.m24045d();
        }
        int m24046c = connectionResult.m24046c();
        if (C4686i.m23137a(context) && m24046c == 2) {
            m24046c = 42;
        }
        return mo23374a(context, m24046c, 0);
    }

    @Override // com.google.android.gms.common.C4648j
    @Nullable
    @Deprecated
    /* renamed from: b */
    public Intent mo23369b(int i) {
        return super.mo23369b(i);
    }

    @Override // com.google.android.gms.common.C4648j
    @Nullable
    /* renamed from: b */
    public String mo23368b(Context context) {
        return super.mo23368b(context);
    }

    /* renamed from: b */
    public boolean m23908b(Activity activity, int i, int i2) {
        return m23907b(activity, i, i2, null);
    }

    /* renamed from: b */
    public boolean m23907b(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog m23917a = m23917a(activity, i, i2, onCancelListener);
        if (m23917a == null) {
            return false;
        }
        m23916a(activity, m23917a, C4536e.f16916a, onCancelListener);
        return true;
    }

    @Override // com.google.android.gms.common.C4648j
    /* renamed from: b */
    public boolean mo23367b(Context context, int i) {
        return super.mo23367b(context, i);
    }

    @Override // com.google.android.gms.common.C4648j
    /* renamed from: c */
    public int mo23364c(Context context) {
        return super.mo23364c(context);
    }

    @Override // com.google.android.gms.common.C4648j
    /* renamed from: c */
    public final String mo23365c(int i) {
        return super.mo23365c(i);
    }
}
