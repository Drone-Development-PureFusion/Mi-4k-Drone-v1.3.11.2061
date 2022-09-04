package com.google.android.gms.nearby.messages.internal;

import java.util.Arrays;
/* renamed from: com.google.android.gms.nearby.messages.internal.c */
/* loaded from: classes2.dex */
public abstract class AbstractC8843c {

    /* renamed from: a */
    private static final char[] f28330a = "0123456789abcdef".toCharArray();

    /* renamed from: b */
    private final byte[] f28331b;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC8843c(byte[] bArr) {
        this.f28331b = bArr;
    }

    /* renamed from: a */
    public static String m9888a(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            sb.append(f28330a[(b >> 4) & 15]).append(f28330a[b & 15]);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static byte[] m9889a(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr[i] = (byte) ((Character.digit(str.charAt(i * 2), 16) << 4) + Character.digit(str.charAt((i * 2) + 1), 16));
        }
        return bArr;
    }

    /* renamed from: a */
    public byte[] m9890a() {
        return this.f28331b;
    }

    /* renamed from: b */
    public String m9887b() {
        return m9888a(this.f28331b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj.getClass().isAssignableFrom(getClass())) {
            return Arrays.equals(this.f28331b, ((AbstractC8843c) obj).f28331b);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f28331b);
    }

    public String toString() {
        return m9888a(this.f28331b);
    }
}
