package org.p286a.p287a.p320o;
/* renamed from: org.a.a.o.b */
/* loaded from: classes2.dex */
public class C11355b {
    /* renamed from: a */
    public static void m1314a(CharSequence charSequence, String str) {
        if (C11359f.m1297a(charSequence)) {
            throw new IllegalStateException(str + " is empty");
        }
    }

    /* renamed from: a */
    public static void m1313a(Object obj, String str) {
        if (obj == null) {
            throw new IllegalStateException(str + " is null");
        }
    }

    /* renamed from: a */
    public static void m1312a(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: a */
    public static void m1311a(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }

    /* renamed from: b */
    public static void m1310b(CharSequence charSequence, String str) {
        if (C11359f.m1296b(charSequence)) {
            throw new IllegalStateException(str + " is blank");
        }
    }
}
