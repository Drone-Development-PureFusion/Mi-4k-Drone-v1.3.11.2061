package com.fimi.soul.drone.p204h;

import com.fimi.soul.media.player.FimiMediaMeta;
/* renamed from: com.fimi.soul.drone.h.b */
/* loaded from: classes.dex */
public class C2278b {
    /* renamed from: a */
    public static long m32456a(int[] iArr, int i) {
        long j = -1;
        int i2 = 0;
        while (true) {
            int i3 = i - 1;
            if (i > 0) {
                long j2 = FimiMediaMeta.AV_CH_WIDE_LEFT;
                int i4 = i2 + 1;
                long j3 = iArr[i2];
                long j4 = j;
                for (long j5 = 0; j5 < 32; j5++) {
                    j4 = (FimiMediaMeta.AV_CH_WIDE_LEFT & j4) == FimiMediaMeta.AV_CH_WIDE_LEFT ? ((j4 << 1) & 4294967295L) ^ 79764919 : (j4 << 1) & 4294967295L;
                    if ((j3 & j2) == j2) {
                        j4 ^= 79764919;
                    }
                    j2 >>= 1;
                }
                j = j4;
                i = i3;
                i2 = i4;
            } else {
                return j;
            }
        }
    }

    /* renamed from: a */
    public static byte[] m32459a(int i) {
        byte[] bArr = new byte[4];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            bArr[i2] = (byte) ((i >> (i2 * 8)) & 255);
        }
        return bArr;
    }

    /* renamed from: a */
    public static byte[] m32458a(long j) {
        byte[] bArr = new byte[4];
        for (int i = 0; i < bArr.length; i++) {
            bArr[i] = (byte) ((j >> (i * 8)) & 255);
        }
        return bArr;
    }

    /* renamed from: a */
    public static byte[] m32457a(short s) {
        byte[] bArr = new byte[2];
        for (int i = 0; i < bArr.length; i++) {
            bArr[i] = (byte) ((s >> (i * 8)) & 255);
        }
        return bArr;
    }
}
