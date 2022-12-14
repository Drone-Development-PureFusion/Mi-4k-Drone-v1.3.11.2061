package com.google.android.gms.internal;
/* loaded from: classes2.dex */
public class ame {

    /* renamed from: a */
    private static final ThreadLocal<String> f22259a = new ThreadLocal<>();

    /* renamed from: a */
    private static int m16831a(byte[] bArr, int i, int i2, int i3) {
        int i4;
        int i5 = i + (i2 & (-4));
        int i6 = i3;
        while (i < i5) {
            int i7 = ((bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | (bArr[i + 3] << 24)) * (-862048943);
            int i8 = (((i7 >>> 17) | (i7 << 15)) * 461845907) ^ i6;
            i6 = (-430675100) + (((i8 >>> 19) | (i8 << 13)) * 5);
            i += 4;
        }
        int i9 = 0;
        switch (i2 & 3) {
            case 3:
                i9 = (bArr[i5 + 2] & 255) << 16;
            case 2:
                i9 |= (bArr[i5 + 1] & 255) << 8;
            case 1:
                int i10 = (i9 | (bArr[i5] & 255)) * (-862048943);
                i4 = (((i10 >>> 17) | (i10 << 15)) * 461845907) ^ i6;
                break;
            default:
                i4 = i6;
                break;
        }
        int i11 = i4 ^ i2;
        int i12 = (i11 ^ (i11 >>> 16)) * (-2048144789);
        int i13 = (i12 ^ (i12 >>> 13)) * (-1028477387);
        return i13 ^ (i13 >>> 16);
    }

    /* renamed from: a */
    public static String m16833a(String str) {
        return m16834a() ? str : m16832a(str, f22259a.get());
    }

    /* renamed from: a */
    public static String m16832a(String str, String str2) {
        if (str == null || str2 == null) {
            return str;
        }
        byte[] bArr = new byte[str.length() + str2.length()];
        System.arraycopy(str.getBytes(), 0, bArr, 0, str.length());
        System.arraycopy(str2.getBytes(), 0, bArr, str.length(), str2.length());
        return Integer.toHexString(m16831a(bArr, 0, bArr.length, 0));
    }

    /* renamed from: a */
    public static boolean m16834a() {
        String str = f22259a.get();
        return str == null || str.startsWith("com.google");
    }
}
