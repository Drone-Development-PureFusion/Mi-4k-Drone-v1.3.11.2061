package com.google.android.gms.internal;

import com.google.android.gms.common.data.DataHolder;
/* loaded from: classes2.dex */
public class aoc {

    /* renamed from: c */
    private static final String f22546c = aoc.class.getSimpleName();

    /* renamed from: a */
    int[] f22547a;

    /* renamed from: b */
    int f22548b;

    public aoc(DataHolder dataHolder, int i) {
        int[] m16551b;
        if (dataHolder != null && dataHolder.m23883e() == 0 && (m16551b = m16551b(dataHolder.m23880f("", i, dataHolder.m23898a(i)))) != null && m16551b.length >= 3 && m16551b[0] == 1 && m16551b[1] == 1936614772) {
            this.f22547a = new int[m16551b.length];
            System.arraycopy(m16551b, 0, this.f22547a, 0, m16551b.length);
            this.f22548b = this.f22547a[2];
        }
    }

    /* renamed from: a */
    private static int m16552a(int[] iArr, long j) {
        int i = 3;
        int length = iArr.length - 1;
        while (i <= length) {
            int i2 = ((length - i) / 2) + i;
            long m16554a = m16554a(iArr[i2]);
            if (m16554a == j) {
                return i2;
            }
            if (m16554a < j) {
                i = i2 + 1;
            } else {
                length = i2 - 1;
            }
        }
        return -1;
    }

    /* renamed from: a */
    private static long m16554a(long j) {
        return 4294967295L & j;
    }

    /* renamed from: b */
    public static int[] m16551b(byte[] bArr) {
        if (bArr == null || bArr.length % 4 != 0) {
            return null;
        }
        int[] iArr = new int[bArr.length / 4];
        for (int i = 0; i < bArr.length; i += 4) {
            iArr[i / 4] = (int) (((bArr[i + 3] & 255) | ((bArr[i + 2] & 255) << 8) | ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24)) & 4294967295L);
        }
        return iArr;
    }

    /* renamed from: c */
    private static long m16550c(byte[] bArr) {
        return ((bArr[3] & 255) | ((bArr[2] & 255) << 8) | ((bArr[1] & 255) << 16) | ((bArr[0] & 255) << 24)) & 4294967295L;
    }

    /* renamed from: a */
    public int m16555a() {
        return this.f22548b;
    }

    /* renamed from: a */
    public boolean m16553a(byte[] bArr) {
        if (this.f22547a == null) {
            return false;
        }
        return m16552a(this.f22547a, m16550c(bArr)) != -1;
    }
}
