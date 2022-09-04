package com.p079a.p080a;

import org.codehaus.jackson.smile.SmileConstants;
/* renamed from: com.a.a.ab */
/* loaded from: classes.dex */
public final class C0863ab implements Cloneable {

    /* renamed from: a */
    private static final int f1794a = 65280;

    /* renamed from: b */
    private static final int f1795b = 8;

    /* renamed from: c */
    private final int f1796c;

    public C0863ab(int i) {
        this.f1796c = i;
    }

    public C0863ab(byte[] bArr) {
        this(bArr, 0);
    }

    public C0863ab(byte[] bArr, int i) {
        this.f1796c = m37597a(bArr, i);
    }

    /* renamed from: a */
    public static int m37598a(byte[] bArr) {
        return m37597a(bArr, 0);
    }

    /* renamed from: a */
    public static int m37597a(byte[] bArr, int i) {
        return ((bArr[i + 1] << 8) & 65280) + (bArr[i] & SmileConstants.BYTE_MARKER_END_OF_CONTENT);
    }

    /* renamed from: a */
    public static byte[] m37599a(int i) {
        return new byte[]{(byte) (i & 255), (byte) ((65280 & i) >> 8)};
    }

    /* renamed from: a */
    public byte[] m37600a() {
        return new byte[]{(byte) (this.f1796c & 255), (byte) ((this.f1796c & 65280) >> 8)};
    }

    /* renamed from: b */
    public int m37596b() {
        return this.f1796c;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean equals(Object obj) {
        return obj != null && (obj instanceof C0863ab) && this.f1796c == ((C0863ab) obj).m37596b();
    }

    public int hashCode() {
        return this.f1796c;
    }

    public String toString() {
        return "ZipShort value: " + this.f1796c;
    }
}
