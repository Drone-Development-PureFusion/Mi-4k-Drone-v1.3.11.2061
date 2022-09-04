package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.p001v4.view.accessibility.AccessibilityEventCompat;
import com.google.android.gms.internal.ajp;
/* renamed from: com.google.android.gms.common.util.d */
/* loaded from: classes2.dex */
public class C4681d {
    /* renamed from: a */
    public static int m23156a(Context context, String str) {
        return m23155a(m23154b(context, str));
    }

    /* renamed from: a */
    public static int m23155a(PackageInfo packageInfo) {
        Bundle bundle;
        if (packageInfo == null || packageInfo.applicationInfo == null || (bundle = packageInfo.applicationInfo.metaData) == null) {
            return -1;
        }
        return bundle.getInt("com.google.android.gms.version", -1);
    }

    /* renamed from: a */
    public static boolean m23157a() {
        return false;
    }

    @Nullable
    /* renamed from: b */
    public static PackageInfo m23154b(Context context, String str) {
        try {
            return ajp.m17106b(context).m17108b(str, 128);
        } catch (PackageManager.NameNotFoundException e) {
            return null;
        }
    }

    @TargetApi(12)
    /* renamed from: c */
    public static boolean m23153c(Context context, String str) {
        if (!C4696s.m23112b()) {
            return false;
        }
        if ("com.google.android.gms".equals(str) && m23157a()) {
            return false;
        }
        try {
            return (ajp.m17106b(context).m17110a(str, 0).flags & AccessibilityEventCompat.TYPE_TOUCH_INTERACTION_END) != 0;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }
}
