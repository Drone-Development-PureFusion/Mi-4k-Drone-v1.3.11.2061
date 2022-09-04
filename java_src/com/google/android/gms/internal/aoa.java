package com.google.android.gms.internal;

import java.util.Arrays;
/* loaded from: classes2.dex */
public class aoa {

    /* renamed from: a */
    private static final String f22540a = aoa.class.getSimpleName();

    /* renamed from: b */
    private static final char[] f22541b = "0123456789abcdef".toCharArray();

    /* renamed from: c */
    private final byte[] f22542c;

    public aoa(byte[] bArr) {
        this.f22542c = bArr;
    }

    /* renamed from: a */
    public aoa m16570a(int i) {
        return new aoa(Arrays.copyOfRange(this.f22542c, 0, i));
    }

    /* renamed from: a */
    public byte[] m16571a() {
        return this.f22542c;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        try {
            return Arrays.equals(this.f22542c, ((aoa) obj).m16571a());
        } catch (ClassCastException e) {
            return false;
        }
    }

    public int hashCode() {
        return Arrays.hashCode(this.f22542c) + 527;
    }
}
