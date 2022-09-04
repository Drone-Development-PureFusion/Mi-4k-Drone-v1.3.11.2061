package com.google.android.gms.internal;

import java.util.Random;
/* renamed from: com.google.android.gms.internal.mj */
/* loaded from: classes2.dex */
public class C7391mj {

    /* renamed from: a */
    static final /* synthetic */ boolean f24615a;

    /* renamed from: b */
    private static final Random f24616b;

    /* renamed from: c */
    private static long f24617c;

    /* renamed from: d */
    private static final int[] f24618d;

    static {
        f24615a = !C7391mj.class.desiredAssertionStatus();
        f24616b = new Random();
        f24617c = 0L;
        f24618d = new int[12];
    }

    /* renamed from: a */
    public static synchronized String m14613a(long j) {
        String sb;
        synchronized (C7391mj.class) {
            boolean z = j == f24617c;
            f24617c = j;
            char[] cArr = new char[8];
            StringBuilder sb2 = new StringBuilder(20);
            for (int i = 7; i >= 0; i--) {
                cArr[i] = "-0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ_abcdefghijklmnopqrstuvwxyz".charAt((int) (j % 64));
                j /= 64;
            }
            if (!f24615a && j != 0) {
                throw new AssertionError();
            }
            sb2.append(cArr);
            if (!z) {
                for (int i2 = 0; i2 < 12; i2++) {
                    f24618d[i2] = f24616b.nextInt(64);
                }
            } else {
                m14614a();
            }
            for (int i3 = 0; i3 < 12; i3++) {
                sb2.append("-0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ_abcdefghijklmnopqrstuvwxyz".charAt(f24618d[i3]));
            }
            if (!f24615a && sb2.length() != 20) {
                throw new AssertionError();
            }
            sb = sb2.toString();
        }
        return sb;
    }

    /* renamed from: a */
    private static void m14614a() {
        for (int i = 11; i >= 0; i--) {
            if (f24618d[i] != 63) {
                f24618d[i] = f24618d[i] + 1;
                return;
            }
            f24618d[i] = 0;
        }
    }
}
