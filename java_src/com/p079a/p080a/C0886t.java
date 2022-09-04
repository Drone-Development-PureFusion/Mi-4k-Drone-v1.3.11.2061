package com.p079a.p080a;

import java.math.BigInteger;
/* renamed from: com.a.a.t */
/* loaded from: classes.dex */
public final class C0886t {

    /* renamed from: a */
    public static final C0886t f1877a = new C0886t(0);

    /* renamed from: b */
    private static final int f1878b = 1;

    /* renamed from: c */
    private static final int f1879c = 65280;

    /* renamed from: d */
    private static final int f1880d = 8;

    /* renamed from: e */
    private static final int f1881e = 2;

    /* renamed from: f */
    private static final int f1882f = 16711680;

    /* renamed from: g */
    private static final int f1883g = 16;

    /* renamed from: h */
    private static final int f1884h = 3;

    /* renamed from: i */
    private static final long f1885i = 4278190080L;

    /* renamed from: j */
    private static final int f1886j = 24;

    /* renamed from: k */
    private static final int f1887k = 4;

    /* renamed from: l */
    private static final long f1888l = 1095216660480L;

    /* renamed from: m */
    private static final int f1889m = 32;

    /* renamed from: n */
    private static final int f1890n = 5;

    /* renamed from: o */
    private static final long f1891o = 280375465082880L;

    /* renamed from: p */
    private static final int f1892p = 40;

    /* renamed from: q */
    private static final int f1893q = 6;

    /* renamed from: r */
    private static final long f1894r = 71776119061217280L;

    /* renamed from: s */
    private static final int f1895s = 48;

    /* renamed from: t */
    private static final int f1896t = 7;

    /* renamed from: u */
    private static final long f1897u = 9151314442816847872L;

    /* renamed from: v */
    private static final int f1898v = 56;

    /* renamed from: w */
    private static final int f1899w = 63;

    /* renamed from: x */
    private static final byte f1900x = Byte.MIN_VALUE;

    /* renamed from: y */
    private final BigInteger f1901y;

    public C0886t(long j) {
        this(BigInteger.valueOf(j));
    }

    public C0886t(BigInteger bigInteger) {
        this.f1901y = bigInteger;
    }

    public C0886t(byte[] bArr) {
        this(bArr, 0);
    }

    public C0886t(byte[] bArr, int i) {
        this.f1901y = m37523b(bArr, i);
    }

    /* renamed from: a */
    public static long m37527a(byte[] bArr) {
        return m37526a(bArr, 0);
    }

    /* renamed from: a */
    public static long m37526a(byte[] bArr, int i) {
        return m37523b(bArr, i).longValue();
    }

    /* renamed from: a */
    public static byte[] m37529a(long j) {
        return m37528a(BigInteger.valueOf(j));
    }

    /* renamed from: a */
    public static byte[] m37528a(BigInteger bigInteger) {
        long longValue = bigInteger.longValue();
        byte[] bArr = {(byte) (255 & longValue), (byte) ((65280 & longValue) >> 8), (byte) ((16711680 & longValue) >> 16), (byte) ((f1885i & longValue) >> 24), (byte) ((f1888l & longValue) >> 32), (byte) ((f1891o & longValue) >> 40), (byte) ((f1894r & longValue) >> 48), (byte) ((longValue & f1897u) >> 56)};
        if (bigInteger.testBit(63)) {
            bArr[7] = (byte) (bArr[7] | f1900x);
        }
        return bArr;
    }

    /* renamed from: b */
    public static BigInteger m37524b(byte[] bArr) {
        return m37523b(bArr, 0);
    }

    /* renamed from: b */
    public static BigInteger m37523b(byte[] bArr, int i) {
        BigInteger valueOf = BigInteger.valueOf(((bArr[i + 7] << 56) & f1897u) + ((bArr[i + 6] << 48) & f1894r) + ((bArr[i + 5] << 40) & f1891o) + ((bArr[i + 4] << 32) & f1888l) + ((bArr[i + 3] << 24) & f1885i) + ((bArr[i + 2] << 16) & 16711680) + ((bArr[i + 1] << 8) & 65280) + (bArr[i] & 255));
        return (bArr[i + 7] & f1900x) == -128 ? valueOf.setBit(63) : valueOf;
    }

    /* renamed from: a */
    public byte[] m37530a() {
        return m37528a(this.f1901y);
    }

    /* renamed from: b */
    public long m37525b() {
        return this.f1901y.longValue();
    }

    /* renamed from: c */
    public BigInteger m37522c() {
        return this.f1901y;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C0886t)) {
            return false;
        }
        return this.f1901y.equals(((C0886t) obj).m37522c());
    }

    public int hashCode() {
        return this.f1901y.hashCode();
    }

    public String toString() {
        return "ZipEightByteInteger value: " + this.f1901y;
    }
}
