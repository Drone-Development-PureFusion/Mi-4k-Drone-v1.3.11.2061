package com.google.android.gms.internal;
/* renamed from: com.google.android.gms.internal.rg */
/* loaded from: classes2.dex */
public final class C7652rg {

    /* renamed from: a */
    public static final int[] f25394a = new int[0];

    /* renamed from: b */
    public static final long[] f25395b = new long[0];

    /* renamed from: c */
    public static final float[] f25396c = new float[0];

    /* renamed from: d */
    public static final double[] f25397d = new double[0];

    /* renamed from: e */
    public static final boolean[] f25398e = new boolean[0];

    /* renamed from: f */
    public static final String[] f25399f = new String[0];

    /* renamed from: g */
    public static final byte[][] f25400g = new byte[0];

    /* renamed from: h */
    public static final byte[] f25401h = new byte[0];

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m13843a(int i) {
        return i & 7;
    }

    /* renamed from: a */
    public static int m13842a(int i, int i2) {
        return (i << 3) | i2;
    }

    /* renamed from: a */
    public static boolean m13841a(C7639qv c7639qv, int i) {
        return c7639qv.m14006b(i);
    }

    /* renamed from: b */
    public static int m13840b(int i) {
        return i >>> 3;
    }

    /* renamed from: b */
    public static final int m13839b(C7639qv c7639qv, int i) {
        int i2 = 1;
        int m13983t = c7639qv.m13983t();
        c7639qv.m14006b(i);
        while (c7639qv.m14015a() == i) {
            c7639qv.m14006b(i);
            i2++;
        }
        c7639qv.m13998f(m13983t);
        return i2;
    }
}
