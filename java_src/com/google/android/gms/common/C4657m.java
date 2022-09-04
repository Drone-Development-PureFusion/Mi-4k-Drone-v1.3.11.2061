package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.C4649k;
import com.google.android.gms.common.internal.AbstractC4565ae;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.internal.ajp;
/* renamed from: com.google.android.gms.common.m */
/* loaded from: classes2.dex */
public class C4657m {

    /* renamed from: a */
    private static C4657m f17188a;

    /* renamed from: b */
    private final Context f17189b;

    private C4657m(Context context) {
        this.f17189b = context.getApplicationContext();
    }

    /* renamed from: a */
    public static C4657m m23326a(Context context) {
        C4588d.m23627a(context);
        synchronized (C4657m.class) {
            if (f17188a == null) {
                C4649k.m23360a(context);
                f17188a = new C4657m(context);
            }
        }
        return f17188a;
    }

    /* renamed from: b */
    private boolean m23321b(PackageInfo packageInfo, boolean z) {
        if (packageInfo.signatures.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return false;
        }
        C4649k.BinderC4651b binderC4651b = new C4649k.BinderC4651b(packageInfo.signatures[0].toByteArray());
        for (AbstractC4565ae abstractC4565ae : z ? C4649k.m23361a() : C4649k.m23358b()) {
            if (binderC4651b.equals(abstractC4565ae)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C4649k.AbstractBinderC4650a m23324a(PackageInfo packageInfo, C4649k.AbstractBinderC4650a... abstractBinderC4650aArr) {
        if (packageInfo.signatures == null) {
            return null;
        }
        if (packageInfo.signatures.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        C4649k.BinderC4651b binderC4651b = new C4649k.BinderC4651b(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < abstractBinderC4650aArr.length; i++) {
            if (abstractBinderC4650aArr[i].equals(binderC4651b)) {
                return abstractBinderC4650aArr[i];
            }
        }
        return null;
    }

    /* renamed from: a */
    public boolean m23325a(PackageInfo packageInfo, boolean z) {
        if (packageInfo != null && packageInfo.signatures != null) {
            if ((z ? m23324a(packageInfo, C4649k.C4653d.f17176a) : m23324a(packageInfo, C4649k.C4653d.f17176a[0])) != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean m23323a(PackageManager packageManager, PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (C4656l.m23333h(this.f17189b)) {
            return m23321b(packageInfo, true);
        }
        boolean m23321b = m23321b(packageInfo, false);
        if (m23321b || !m23321b(packageInfo, true)) {
            return m23321b;
        }
        Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        return m23321b;
    }

    /* renamed from: a */
    public boolean m23322a(PackageManager packageManager, String str) {
        try {
            return m23323a(packageManager, ajp.m17106b(this.f17189b).m17108b(str, 64));
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }

    /* renamed from: b */
    public boolean m23320b(PackageManager packageManager, PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (m23325a(packageInfo, false)) {
            return true;
        }
        if (!m23325a(packageInfo, true)) {
            return false;
        }
        if (C4656l.m23333h(this.f17189b)) {
            return true;
        }
        Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        return false;
    }
}
