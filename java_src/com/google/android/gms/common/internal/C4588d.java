package com.google.android.gms.common.internal;

import android.os.Looper;
import android.text.TextUtils;
/* renamed from: com.google.android.gms.common.internal.d */
/* loaded from: classes.dex */
public final class C4588d {
    /* renamed from: a */
    public static int m23630a(int i) {
        if (i == 0) {
            throw new IllegalArgumentException("Given Integer is zero");
        }
        return i;
    }

    /* renamed from: a */
    public static int m23629a(int i, Object obj) {
        if (i == 0) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
        return i;
    }

    /* renamed from: a */
    public static long m23628a(long j, Object obj) {
        if (j == 0) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
        return j;
    }

    /* renamed from: a */
    public static <T> T m23627a(T t) {
        if (t == null) {
            throw new NullPointerException("null reference");
        }
        return t;
    }

    /* renamed from: a */
    public static <T> T m23626a(T t, Object obj) {
        if (t == null) {
            throw new NullPointerException(String.valueOf(obj));
        }
        return t;
    }

    /* renamed from: a */
    public static String m23625a(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
        return str;
    }

    /* renamed from: a */
    public static String m23624a(String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
        return str;
    }

    /* renamed from: a */
    public static void m23631a() {
        m23616c("Must not be called on the main application thread");
    }

    /* renamed from: a */
    public static void m23623a(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    public static void m23622a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* renamed from: a */
    public static void m23621a(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }

    /* renamed from: b */
    public static void m23620b(String str) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: b */
    public static void m23619b(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: b */
    public static void m23618b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: b */
    public static void m23617b(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    /* renamed from: c */
    public static void m23616c(String str) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException(str);
        }
    }
}
