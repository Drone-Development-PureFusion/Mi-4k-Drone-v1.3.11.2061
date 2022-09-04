package com.p079a.p080a;

import org.codehaus.jackson.smile.SmileConstants;
/* renamed from: com.a.a.z */
/* loaded from: classes.dex */
public final class C0898z implements Cloneable {

    /* renamed from: a */
    public static final C0898z f1964a = new C0898z(33639248);

    /* renamed from: b */
    public static final C0898z f1965b = new C0898z(67324752);

    /* renamed from: c */
    public static final C0898z f1966c = new C0898z(134695760);

    /* renamed from: d */
    static final C0898z f1967d = new C0898z(4294967295L);

    /* renamed from: e */
    private static final int f1968e = 1;

    /* renamed from: f */
    private static final int f1969f = 65280;

    /* renamed from: g */
    private static final int f1970g = 8;

    /* renamed from: h */
    private static final int f1971h = 2;

    /* renamed from: i */
    private static final int f1972i = 16711680;

    /* renamed from: j */
    private static final int f1973j = 16;

    /* renamed from: k */
    private static final int f1974k = 3;

    /* renamed from: l */
    private static final long f1975l = 4278190080L;

    /* renamed from: m */
    private static final int f1976m = 24;

    /* renamed from: n */
    private final long f1977n;

    public C0898z(long j) {
        this.f1977n = j;
    }

    public C0898z(byte[] bArr) {
        this(bArr, 0);
    }

    public C0898z(byte[] bArr, int i) {
        this.f1977n = m37446a(bArr, i);
    }

    /* renamed from: a */
    public static long m37447a(byte[] bArr) {
        return m37446a(bArr, 0);
    }

    /* renamed from: a */
    public static long m37446a(byte[] bArr, int i) {
        return ((bArr[i + 3] << 24) & f1975l) + ((bArr[i + 2] << 16) & f1972i) + ((bArr[i + 1] << 8) & 65280) + (bArr[i] & SmileConstants.BYTE_MARKER_END_OF_CONTENT);
    }

    /* renamed from: a */
    public static byte[] m37448a(long j) {
        return new byte[]{(byte) (255 & j), (byte) ((65280 & j) >> 8), (byte) ((16711680 & j) >> 16), (byte) ((f1975l & j) >> 24)};
    }

    /* renamed from: a */
    public byte[] m37449a() {
        return m37448a(this.f1977n);
    }

    /* renamed from: b */
    public long m37445b() {
        return this.f1977n;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean equals(Object obj) {
        return obj != null && (obj instanceof C0898z) && this.f1977n == ((C0898z) obj).m37445b();
    }

    public int hashCode() {
        return (int) this.f1977n;
    }

    public String toString() {
        return "ZipLong value: " + this.f1977n;
    }
}
