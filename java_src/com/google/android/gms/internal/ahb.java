package com.google.android.gms.internal;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* loaded from: classes2.dex */
public class ahb {
    /* renamed from: a */
    private static long m17517a(long j) {
        return (j >>> 47) ^ j;
    }

    /* renamed from: a */
    private static long m17516a(long j, long j2) {
        long j3 = (j2 ^ j) * (-4132994306676758123L);
        long j4 = ((j3 ^ (j3 >>> 47)) ^ j) * (-4132994306676758123L);
        return (j4 ^ (j4 >>> 47)) * (-4132994306676758123L);
    }

    /* renamed from: a */
    public static long m17515a(byte[] bArr) {
        long j = -6505348102511208375L;
        long m17511a = bArr.length <= 32 ? m17511a(bArr, -1397348546323613475L) : bArr.length <= 64 ? m17510b(bArr) : m17509c(bArr);
        long m17514a = bArr.length >= 8 ? m17514a(bArr, 0) : -6505348102511208375L;
        if (bArr.length >= 9) {
            j = m17514a(bArr, bArr.length - 8);
        }
        long m17516a = m17516a(m17511a + j, m17514a);
        return (m17516a == 0 || m17516a == 1) ? m17516a - 2 : m17516a;
    }

    /* renamed from: a */
    private static long m17514a(byte[] bArr, int i) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr, i, 8);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        return wrap.getLong();
    }

    /* renamed from: a */
    private static long m17513a(byte[] bArr, int i, int i2) {
        long j = 0;
        int min = Math.min(i2, 8);
        for (int i3 = 0; i3 < min; i3++) {
            j |= (bArr[i + i3] & 255) << (i3 * 8);
        }
        return j;
    }

    /* renamed from: a */
    private static long m17511a(byte[] bArr, long j) {
        int length = bArr.length & (-8);
        int length2 = bArr.length & 7;
        long length3 = j ^ (bArr.length * (-4132994306676758123L));
        int i = 0;
        while (i < length) {
            long m17517a = (length3 ^ (m17517a(m17514a(bArr, i) * (-4132994306676758123L)) * (-4132994306676758123L))) * (-4132994306676758123L);
            i += 8;
            length3 = m17517a;
        }
        if (length2 != 0) {
            length3 = (length3 ^ m17513a(bArr, length, length2)) * (-4132994306676758123L);
        }
        return m17517a(m17517a(length3) * (-4132994306676758123L));
    }

    /* renamed from: a */
    private static void m17512a(byte[] bArr, int i, long j, long j2, long[] jArr) {
        long m17514a = m17514a(bArr, i);
        long m17514a2 = m17514a(bArr, i + 8);
        long m17514a3 = m17514a(bArr, i + 16);
        long m17514a4 = m17514a(bArr, i + 24);
        long j3 = m17514a + j;
        long rotateRight = Long.rotateRight(j2 + j3 + m17514a4, 51);
        long j4 = m17514a2 + j3 + m17514a3;
        jArr[0] = j4 + m17514a4;
        jArr[1] = j3 + Long.rotateRight(j4, 23) + rotateRight;
    }

    /* renamed from: b */
    private static long m17510b(byte[] bArr) {
        int length = bArr.length;
        long m17514a = m17514a(bArr, 24);
        long m17514a2 = m17514a(bArr, 0) + ((length + m17514a(bArr, length - 16)) * (-6505348102511208375L));
        long rotateRight = Long.rotateRight(m17514a2 + m17514a, 52);
        long rotateRight2 = Long.rotateRight(m17514a2, 37);
        long m17514a3 = m17514a2 + m17514a(bArr, 8);
        long rotateRight3 = rotateRight2 + Long.rotateRight(m17514a3, 7);
        long m17514a4 = m17514a3 + m17514a(bArr, 16);
        long j = m17514a + m17514a4;
        long rotateRight4 = Long.rotateRight(m17514a4, 31) + rotateRight + rotateRight3;
        long m17514a5 = m17514a(bArr, 16) + m17514a(bArr, length - 32);
        long m17514a6 = m17514a(bArr, length - 8);
        long rotateRight5 = Long.rotateRight(m17514a5 + m17514a6, 52);
        long rotateRight6 = Long.rotateRight(m17514a5, 37);
        long m17514a7 = m17514a5 + m17514a(bArr, length - 24);
        long m17514a8 = m17514a(bArr, length - 16) + m17514a7;
        long j2 = m17514a8 + m17514a6;
        return m17517a((m17517a(((Long.rotateRight(m17514a8, 31) + rotateRight5 + rotateRight6 + Long.rotateRight(m17514a7, 7) + j) * (-4288712594273399085L)) + ((j2 + rotateRight4) * (-6505348102511208375L))) * (-6505348102511208375L)) + rotateRight4) * (-4288712594273399085L);
    }

    /* renamed from: c */
    private static long m17509c(byte[] bArr) {
        int length = bArr.length;
        long m17514a = m17514a(bArr, 0);
        long m17514a2 = m17514a(bArr, length - 16) ^ (-8261664234251669945L);
        long m17514a3 = m17514a(bArr, length - 56) ^ (-6505348102511208375L);
        long[] jArr = new long[2];
        long[] jArr2 = new long[2];
        m17512a(bArr, length - 64, length, m17514a2, jArr);
        m17512a(bArr, length - 32, length * (-8261664234251669945L), -6505348102511208375L, jArr2);
        long m17517a = m17514a3 + (m17517a(jArr[1]) * (-8261664234251669945L));
        long rotateRight = (-8261664234251669945L) * Long.rotateRight(m17517a + m17514a, 39);
        long rotateRight2 = Long.rotateRight(m17514a2, 33) * (-8261664234251669945L);
        int i = (length - 1) & (-64);
        int i2 = 0;
        long j = rotateRight;
        while (true) {
            long rotateRight3 = (Long.rotateRight(((j + rotateRight2) + jArr[0]) + m17514a(bArr, i2 + 16), 37) * (-8261664234251669945L)) ^ jArr2[1];
            rotateRight2 = (Long.rotateRight((jArr[1] + rotateRight2) + m17514a(bArr, i2 + 48), 42) * (-8261664234251669945L)) ^ jArr[0];
            long rotateRight4 = Long.rotateRight(m17517a ^ jArr2[0], 33);
            m17512a(bArr, i2, jArr[1] * (-8261664234251669945L), jArr2[0] + rotateRight3, jArr);
            m17512a(bArr, i2 + 32, rotateRight4 + jArr2[1], rotateRight2, jArr2);
            i2 += 64;
            i -= 64;
            if (i == 0) {
                return m17516a(m17516a(jArr[0], jArr2[0]) + (m17517a(rotateRight2) * (-8261664234251669945L)) + rotateRight3, m17516a(jArr[1], jArr2[1]) + rotateRight4);
            }
            m17517a = rotateRight3;
            j = rotateRight4;
        }
    }
}
