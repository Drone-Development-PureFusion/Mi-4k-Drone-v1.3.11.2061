package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.UserManager;
import android.provider.Settings;
import com.google.android.gms.common.util.C4696s;
/* loaded from: classes2.dex */
public class aoe {

    /* renamed from: a */
    private final Context f22568a;

    /* renamed from: b */
    private volatile Boolean f22569b = null;

    public aoe(Context context) {
        this.f22568a = context;
    }

    @TargetApi(17)
    /* renamed from: a */
    private static int m16524a(Context context, String str, int i) {
        return C4696s.m23108f() ? Settings.Global.getInt(context.getContentResolver(), str, i) : Settings.Secure.getInt(context.getContentResolver(), str, i);
    }

    /* renamed from: a */
    public static boolean m16525a(Context context) {
        if (C4696s.m23103k()) {
            return m16520c(context);
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m16522b(Context context) {
        return m16524a(context, "package_verifier_enable", 1) == 1;
    }

    @TargetApi(21)
    /* renamed from: c */
    private static boolean m16520c(Context context) {
        UserManager userManager = (UserManager) context.getSystemService("user");
        return userManager != null && userManager.hasUserRestriction("ensure_verify_apps");
    }

    /* renamed from: a */
    public boolean m16526a() {
        return m16521c() ? m16523b() : m16523b() && m16522b(this.f22568a);
    }

    /* renamed from: b */
    public boolean m16523b() {
        if (m16521c()) {
            return (C4696s.m23103k() && m16525a(this.f22568a)) || Settings.Secure.getInt(this.f22568a.getContentResolver(), "package_verifier_user_consent", 0) == 1;
        } else if (C4696s.m23106h()) {
            return Settings.Secure.getInt(this.f22568a.getContentResolver(), "package_verifier_user_consent", 0) == 1;
        } else {
            try {
                return this.f22568a.createPackageContext("com.android.vending", 2).getSharedPreferences("package_verifer_public_preferences", 1).getBoolean("accepted-anti-malware-consent", false);
            } catch (PackageManager.NameNotFoundException e) {
                return false;
            }
        }
    }

    /* renamed from: c */
    public synchronized boolean m16521c() {
        boolean booleanValue;
        boolean z = false;
        synchronized (this) {
            if (this.f22569b == null) {
                PackageInfo packageInfo = null;
                try {
                    packageInfo = this.f22568a.getPackageManager().getPackageInfo("com.android.vending", 0);
                } catch (PackageManager.NameNotFoundException e) {
                }
                if (packageInfo == null || packageInfo.versionCode >= 80440000) {
                    z = true;
                }
                this.f22569b = Boolean.valueOf(z);
            }
            booleanValue = this.f22569b.booleanValue();
        }
        return booleanValue;
    }
}
