package com.google.android.gms.analytics;

import com.google.android.gms.analytics.internal.C3892f;
/* renamed from: com.google.android.gms.analytics.j */
/* loaded from: classes2.dex */
public final class C3933j {
    /* renamed from: a */
    public static String m26015a(int i) {
        return m26014a("&cd", i);
    }

    /* renamed from: a */
    private static String m26014a(String str, int i) {
        if (i < 1) {
            C3892f.m26294a("index out of range for prefix", str);
            return "";
        }
        return new StringBuilder(String.valueOf(str).length() + 11).append(str).append(i).toString();
    }

    /* renamed from: b */
    public static String m26013b(int i) {
        return m26014a("cd", i);
    }

    /* renamed from: c */
    public static String m26012c(int i) {
        return m26014a("&cm", i);
    }

    /* renamed from: d */
    public static String m26011d(int i) {
        return m26014a("cm", i);
    }

    /* renamed from: e */
    public static String m26010e(int i) {
        return m26014a("&pr", i);
    }

    /* renamed from: f */
    public static String m26009f(int i) {
        return m26014a("pr", i);
    }

    /* renamed from: g */
    public static String m26008g(int i) {
        return m26014a("&promo", i);
    }

    /* renamed from: h */
    public static String m26007h(int i) {
        return m26014a("promo", i);
    }

    /* renamed from: i */
    public static String m26006i(int i) {
        return m26014a("pi", i);
    }

    /* renamed from: j */
    public static String m26005j(int i) {
        return m26014a("&il", i);
    }

    /* renamed from: k */
    public static String m26004k(int i) {
        return m26014a("il", i);
    }

    /* renamed from: l */
    public static String m26003l(int i) {
        return m26014a("cd", i);
    }

    /* renamed from: m */
    public static String m26002m(int i) {
        return m26014a("cm", i);
    }
}
