package com.xiaomi.mistatistic.sdk.controller;

import android.content.Context;
import android.content.SharedPreferences;
/* renamed from: com.xiaomi.mistatistic.sdk.controller.s */
/* loaded from: classes2.dex */
public class C10538s {
    /* renamed from: a */
    public static int m4812a(Context context, String str, int i) {
        return context.getSharedPreferences("mistat", 0).getInt(str, i);
    }

    /* renamed from: a */
    public static long m4811a(Context context, String str, long j) {
        return context.getSharedPreferences("mistat", 0).getLong(str, j);
    }

    /* renamed from: a */
    public static String m4810a(Context context, String str, String str2) {
        return context.getSharedPreferences("mistat", 0).getString(str, str2);
    }

    /* renamed from: a */
    public static boolean m4813a(Context context, String str) {
        return context.getSharedPreferences("mistat", 0).contains(str);
    }

    /* renamed from: b */
    public static void m4809b(Context context, String str, int i) {
        SharedPreferences.Editor edit = context.getSharedPreferences("mistat", 0).edit();
        edit.putInt(str, i);
        edit.commit();
    }

    /* renamed from: b */
    public static void m4808b(Context context, String str, long j) {
        SharedPreferences.Editor edit = context.getSharedPreferences("mistat", 0).edit();
        edit.putLong(str, j);
        edit.commit();
    }

    /* renamed from: b */
    public static void m4807b(Context context, String str, String str2) {
        SharedPreferences.Editor edit = context.getSharedPreferences("mistat", 0).edit();
        edit.putString(str, str2);
        edit.commit();
    }
}
