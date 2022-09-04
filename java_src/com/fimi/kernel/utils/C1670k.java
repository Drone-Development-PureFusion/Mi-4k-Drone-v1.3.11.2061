package com.fimi.kernel.utils;

import android.content.Context;
import android.util.Log;
import com.tencent.p263mm.sdk.platformtools.LocaleUtil;
import java.util.Calendar;
/* renamed from: com.fimi.kernel.utils.k */
/* loaded from: classes.dex */
public class C1670k {

    /* renamed from: a */
    public static boolean f4129a = false;

    /* renamed from: b */
    public static boolean f4130b = false;

    /* renamed from: c */
    public static boolean f4131c = false;

    /* renamed from: d */
    public static long f4132d = 0;

    /* renamed from: a */
    public static void m34716a() {
        f4129a = true;
        f4130b = true;
        f4131c = true;
    }

    /* renamed from: a */
    public static void m34715a(Context context) {
        m34709a(context.getClass().getSimpleName());
    }

    /* renamed from: a */
    public static void m34714a(Context context, String str) {
        m34708a(context.getClass().getSimpleName(), str);
    }

    /* renamed from: a */
    public static void m34713a(Context context, String str, boolean z) {
        m34707a(context.getClass().getSimpleName(), str, z);
    }

    /* renamed from: a */
    public static void m34712a(Class<?> cls) {
        m34709a(cls.getSimpleName());
    }

    /* renamed from: a */
    public static void m34711a(Class<?> cls, String str) {
        m34708a(cls.getSimpleName(), str);
    }

    /* renamed from: a */
    public static void m34710a(Class<?> cls, String str, boolean z) {
        m34707a(cls.getSimpleName(), str, z);
    }

    /* renamed from: a */
    public static void m34709a(String str) {
        f4132d = Calendar.getInstance().getTimeInMillis();
        Log.d(str, "日志计时开始：" + f4132d);
    }

    /* renamed from: a */
    public static void m34708a(String str, String str2) {
        if (f4129a) {
            Log.d(str, str2);
        }
    }

    /* renamed from: a */
    public static void m34707a(String str, String str2, boolean z) {
        Log.d(str, str2 + ":" + (Calendar.getInstance().getTimeInMillis() - f4132d) + LocaleUtil.MALAY);
    }

    /* renamed from: a */
    public static void m34706a(boolean z) {
        f4129a = z;
    }

    /* renamed from: a */
    public static void m34705a(boolean z, boolean z2, boolean z3) {
        f4129a = z;
        f4130b = z2;
        f4131c = z3;
    }

    /* renamed from: b */
    public static void m34704b() {
        f4129a = false;
        f4130b = false;
        f4131c = false;
    }

    /* renamed from: b */
    public static void m34703b(Context context, String str) {
        m34701b(context.getClass().getSimpleName(), str);
    }

    /* renamed from: b */
    public static void m34702b(Class<?> cls, String str) {
        m34701b(cls.getSimpleName(), str);
    }

    /* renamed from: b */
    public static void m34701b(String str, String str2) {
        Log.i(str, str2);
    }

    /* renamed from: b */
    public static void m34700b(boolean z) {
        f4130b = z;
    }

    /* renamed from: c */
    public static void m34699c(Context context, String str) {
        m34697c(context.getClass().getSimpleName(), str);
    }

    /* renamed from: c */
    public static void m34698c(Class<?> cls, String str) {
        m34697c(cls.getSimpleName(), str);
    }

    /* renamed from: c */
    public static void m34697c(String str, String str2) {
        Log.e(str, str2);
    }

    /* renamed from: c */
    public static void m34696c(boolean z) {
        f4131c = z;
    }
}
