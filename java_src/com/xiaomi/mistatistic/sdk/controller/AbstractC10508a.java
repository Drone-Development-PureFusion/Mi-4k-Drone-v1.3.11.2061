package com.xiaomi.mistatistic.sdk.controller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
/* renamed from: com.xiaomi.mistatistic.sdk.controller.a */
/* loaded from: classes2.dex */
public abstract class AbstractC10508a {

    /* renamed from: a */
    private static Context f32641a;

    /* renamed from: b */
    private static String f32642b;

    /* renamed from: c */
    private static String f32643c;

    /* renamed from: d */
    private static String f32644d;

    /* renamed from: a */
    public static Context m4880a() {
        return f32641a;
    }

    /* renamed from: a */
    public static void m4879a(Context context, String str, String str2, String str3) {
        f32641a = context.getApplicationContext();
        f32642b = str;
        f32643c = str2;
        f32644d = str3;
    }

    /* renamed from: b */
    public static String m4878b() {
        return f32642b;
    }

    /* renamed from: c */
    public static String m4877c() {
        return f32643c;
    }

    /* renamed from: d */
    public static String m4876d() {
        return f32644d;
    }

    /* renamed from: e */
    public static String m4875e() {
        try {
            PackageInfo packageInfo = f32641a.getPackageManager().getPackageInfo(f32641a.getPackageName(), 16384);
            if (packageInfo != null) {
                return packageInfo.versionName;
            }
        } catch (PackageManager.NameNotFoundException e) {
        }
        return null;
    }
}
