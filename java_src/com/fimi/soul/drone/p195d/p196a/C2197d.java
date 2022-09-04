package com.fimi.soul.drone.p195d.p196a;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import org.codehaus.jackson.smile.SmileConstants;
/* renamed from: com.fimi.soul.drone.d.a.d */
/* loaded from: classes.dex */
public class C2197d {

    /* renamed from: a */
    public static final int f6916a = 512;

    /* renamed from: b */
    public ByteBuffer f6917b = ByteBuffer.allocate(512);

    /* renamed from: c */
    public int f6918c;

    /* renamed from: a */
    public ByteBuffer m32753a() {
        return this.f6917b;
    }

    /* renamed from: a */
    public void m32752a(byte b) {
        this.f6917b.put(b);
    }

    /* renamed from: a */
    public void m32751a(char c) {
        m32752a((byte) (c >> 0));
        m32752a((byte) (c >> '\b'));
    }

    /* renamed from: a */
    public void m32750a(double d) {
        m32742b(Double.doubleToLongBits(d));
    }

    /* renamed from: a */
    public void m32749a(float f) {
        m32743b(Float.floatToIntBits(f));
    }

    /* renamed from: a */
    public void m32748a(int i) {
        m32752a((byte) (i >> 0));
        m32752a((byte) (i >> 8));
        m32752a((byte) (i >> 16));
    }

    /* renamed from: a */
    public void m32747a(long j) {
        m32752a((byte) (j >> 0));
        m32752a((byte) (j >> 8));
        m32752a((byte) (j >> 16));
        m32752a((byte) (j >> 24));
    }

    /* renamed from: a */
    public void m32746a(short s) {
        m32752a((byte) (s >> 0));
        m32752a((byte) (s >> 8));
    }

    /* renamed from: b */
    public int m32745b() {
        return this.f6917b.position() + 1;
    }

    /* renamed from: b */
    public void m32744b(byte b) {
        m32752a(b);
    }

    /* renamed from: b */
    public void m32743b(int i) {
        m32752a((byte) (i >> 0));
        m32752a((byte) (i >> 8));
        m32752a((byte) (i >> 16));
        m32752a((byte) (i >> 24));
    }

    /* renamed from: b */
    public void m32742b(long j) {
        m32752a((byte) (j >> 0));
        m32752a((byte) (j >> 8));
        m32752a((byte) (j >> 16));
        m32752a((byte) (j >> 24));
        m32752a((byte) (j >> 32));
        m32752a((byte) (j >> 40));
        m32752a((byte) (j >> 48));
        m32752a((byte) (j >> 56));
    }

    /* renamed from: c */
    public void m32741c() {
        this.f6918c = 0;
    }

    /* renamed from: c */
    public void m32740c(int i) {
        this.f6918c = i;
    }

    /* renamed from: d */
    public byte m32739d() {
        byte b = (byte) (0 | (this.f6917b.get(this.f6918c + 0) & SmileConstants.BYTE_MARKER_END_OF_CONTENT));
        this.f6918c++;
        return b;
    }

    /* renamed from: e */
    public short m32738e() {
        short s = (short) (((short) (0 | ((this.f6917b.get(this.f6918c + 1) & SmileConstants.BYTE_MARKER_END_OF_CONTENT) << 8))) | (this.f6917b.get(this.f6918c + 0) & SmileConstants.BYTE_MARKER_END_OF_CONTENT));
        this.f6918c += 2;
        return s;
    }

    /* renamed from: f */
    public int m32737f() {
        int i = 0 | ((this.f6917b.get(this.f6918c + 3) & SmileConstants.BYTE_MARKER_END_OF_CONTENT) << 24) | ((this.f6917b.get(this.f6918c + 2) & SmileConstants.BYTE_MARKER_END_OF_CONTENT) << 16) | ((this.f6917b.get(this.f6918c + 1) & SmileConstants.BYTE_MARKER_END_OF_CONTENT) << 8) | (this.f6917b.get(this.f6918c + 0) & SmileConstants.BYTE_MARKER_END_OF_CONTENT);
        this.f6918c += 4;
        return i;
    }

    /* renamed from: g */
    public long m32736g() {
        long j = 0 | ((this.f6917b.get(this.f6918c + 7) & 255) << 56) | ((this.f6917b.get(this.f6918c + 6) & 255) << 48) | ((this.f6917b.get(this.f6918c + 5) & 255) << 40) | ((this.f6917b.get(this.f6918c + 4) & 255) << 32) | ((this.f6917b.get(this.f6918c + 3) & 255) << 24) | ((this.f6917b.get(this.f6918c + 2) & 255) << 16) | ((this.f6917b.get(this.f6918c + 1) & 255) << 8) | (this.f6917b.get(this.f6918c + 0) & 255);
        this.f6918c += 8;
        return j;
    }

    /* renamed from: h */
    public long m32735h() {
        long j = 0 | ((this.f6917b.get(this.f6918c + 0) & 255) << 56) | ((this.f6917b.get(this.f6918c + 1) & 255) << 48) | ((this.f6917b.get(this.f6918c + 2) & 255) << 40) | ((this.f6917b.get(this.f6918c + 3) & 255) << 32) | ((this.f6917b.get(this.f6918c + 4) & 255) << 24) | ((this.f6917b.get(this.f6918c + 5) & 255) << 16) | ((this.f6917b.get(this.f6918c + 6) & 255) << 8) | (this.f6917b.get(this.f6918c + 7) & 255);
        this.f6918c += 8;
        return j;
    }

    /* renamed from: i */
    public float m32734i() {
        return Float.intBitsToFloat(m32737f());
    }

    /* renamed from: j */
    public float m32733j() {
        BigInteger bigInteger = new BigInteger(1, new byte[]{(byte) ((this.f6917b.get(this.f6918c + 2) & SmileConstants.BYTE_MARKER_END_OF_CONTENT) | 0), (byte) ((this.f6917b.get(this.f6918c + 1) & SmileConstants.BYTE_MARKER_END_OF_CONTENT) | 0), (byte) ((this.f6917b.get(this.f6918c + 0) & SmileConstants.BYTE_MARKER_END_OF_CONTENT) | 0)});
        this.f6918c += 3;
        return Float.parseFloat(bigInteger.toString());
    }

    /* renamed from: k */
    public Double m32732k() {
        return Double.valueOf(Double.longBitsToDouble(m32736g()));
    }

    /* renamed from: l */
    public char m32731l() {
        char c = (char) (((char) (0 | ((this.f6917b.get(this.f6918c + 1) & SmileConstants.BYTE_MARKER_END_OF_CONTENT) << 8))) | (this.f6917b.get(this.f6918c + 0) & SmileConstants.BYTE_MARKER_END_OF_CONTENT));
        this.f6918c += 2;
        return c;
    }

    /* renamed from: m */
    public long m32730m() {
        long j = 0 | ((this.f6917b.get(this.f6918c + 3) & 255) << 24) | ((this.f6917b.get(this.f6918c + 2) & 255) << 16) | ((this.f6917b.get(this.f6918c + 1) & 255) << 8) | (this.f6917b.get(this.f6918c + 0) & 255);
        this.f6918c += 4;
        return j;
    }
}
