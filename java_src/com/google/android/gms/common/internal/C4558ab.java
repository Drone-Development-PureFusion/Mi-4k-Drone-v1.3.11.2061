package com.google.android.gms.common.internal;

import android.util.Log;
/* renamed from: com.google.android.gms.common.internal.ab */
/* loaded from: classes2.dex */
public final class C4558ab {

    /* renamed from: a */
    public static final int f17025a = 23 - " PII_LOG".length();

    /* renamed from: b */
    private static final String f17026b = null;

    /* renamed from: c */
    private final String f17027c;

    /* renamed from: d */
    private final String f17028d;

    public C4558ab(String str) {
        this(str, null);
    }

    public C4558ab(String str, String str2) {
        C4588d.m23626a(str, (Object) "log tag cannot be null");
        C4588d.m23617b(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f17027c = str;
        if (str2 == null || str2.length() <= 0) {
            this.f17028d = null;
        } else {
            this.f17028d = str2;
        }
    }

    /* renamed from: a */
    private String m23710a(String str) {
        return this.f17028d == null ? str : this.f17028d.concat(str);
    }

    /* renamed from: a */
    public void m23709a(String str, String str2) {
        if (m23711a(3)) {
            Log.d(str, m23710a(str2));
        }
    }

    /* renamed from: a */
    public void m23708a(String str, String str2, Throwable th) {
        if (m23711a(4)) {
            Log.i(str, m23710a(str2), th);
        }
    }

    /* renamed from: a */
    public boolean m23711a(int i) {
        return Log.isLoggable(this.f17027c, i);
    }

    /* renamed from: b */
    public void m23707b(String str, String str2) {
        if (m23711a(5)) {
            Log.w(str, m23710a(str2));
        }
    }

    /* renamed from: b */
    public void m23706b(String str, String str2, Throwable th) {
        if (m23711a(5)) {
            Log.w(str, m23710a(str2), th);
        }
    }

    /* renamed from: c */
    public void m23705c(String str, String str2) {
        if (m23711a(6)) {
            Log.e(str, m23710a(str2));
        }
    }

    /* renamed from: c */
    public void m23704c(String str, String str2, Throwable th) {
        if (m23711a(6)) {
            Log.e(str, m23710a(str2), th);
        }
    }

    /* renamed from: d */
    public void m23703d(String str, String str2, Throwable th) {
        if (m23711a(7)) {
            Log.e(str, m23710a(str2), th);
            Log.wtf(str, m23710a(str2), th);
        }
    }
}
