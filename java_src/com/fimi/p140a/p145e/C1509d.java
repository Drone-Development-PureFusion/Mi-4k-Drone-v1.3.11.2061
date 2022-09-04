package com.fimi.p140a.p145e;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import org.codehaus.jackson.smile.SmileConstants;
/* renamed from: com.fimi.a.e.d */
/* loaded from: classes.dex */
public class C1509d {

    /* renamed from: a */
    public static final int f3619a = 512;

    /* renamed from: b */
    public ByteBuffer f3620b = ByteBuffer.allocate(512);

    /* renamed from: c */
    public int f3621c;

    /* renamed from: a */
    public ByteBuffer m35462a() {
        return this.f3620b;
    }

    /* renamed from: a */
    public void m35461a(byte b) {
        this.f3620b.put(b);
    }

    /* renamed from: a */
    public void m35460a(char c) {
        m35461a((byte) (c >> 0));
        m35461a((byte) (c >> '\b'));
    }

    /* renamed from: a */
    public void m35459a(double d) {
        m35450b(Double.doubleToLongBits(d));
    }

    /* renamed from: a */
    public void m35458a(float f) {
        m35451b(Float.floatToIntBits(f));
    }

    /* renamed from: a */
    public void m35457a(int i) {
        m35461a((byte) (i >> 0));
        m35461a((byte) (i >> 8));
        m35461a((byte) (i >> 16));
    }

    /* renamed from: a */
    public void m35456a(long j) {
        m35461a((byte) (j >> 0));
        m35461a((byte) (j >> 8));
        m35461a((byte) (j >> 16));
        m35461a((byte) (j >> 24));
    }

    /* renamed from: a */
    public void m35455a(short s) {
        m35461a((byte) (s >> 0));
        m35461a((byte) (s >> 8));
    }

    /* renamed from: a */
    public void m35454a(byte[] bArr) {
        this.f3620b.put(bArr);
    }

    /* renamed from: b */
    public int m35453b() {
        return this.f3620b.position();
    }

    /* renamed from: b */
    public void m35452b(byte b) {
        m35461a(b);
    }

    /* renamed from: b */
    public void m35451b(int i) {
        m35461a((byte) (i >> 0));
        m35461a((byte) (i >> 8));
        m35461a((byte) (i >> 16));
        m35461a((byte) (i >> 24));
    }

    /* renamed from: b */
    public void m35450b(long j) {
        m35461a((byte) (j >> 0));
        m35461a((byte) (j >> 8));
        m35461a((byte) (j >> 16));
        m35461a((byte) (j >> 24));
        m35461a((byte) (j >> 32));
        m35461a((byte) (j >> 40));
        m35461a((byte) (j >> 48));
        m35461a((byte) (j >> 56));
    }

    /* renamed from: c */
    public void m35449c() {
        this.f3621c = 0;
    }

    /* renamed from: c */
    public void m35448c(int i) {
        this.f3621c = i;
    }

    /* renamed from: d */
    public byte m35447d() {
        byte b = (byte) (0 | (this.f3620b.get(this.f3621c + 0) & SmileConstants.BYTE_MARKER_END_OF_CONTENT));
        this.f3621c++;
        return b;
    }

    /* renamed from: e */
    public short m35446e() {
        short s = (short) (((short) (0 | ((this.f3620b.get(this.f3621c + 1) & SmileConstants.BYTE_MARKER_END_OF_CONTENT) << 8))) | (this.f3620b.get(this.f3621c + 0) & SmileConstants.BYTE_MARKER_END_OF_CONTENT));
        this.f3621c += 2;
        return s;
    }

    /* renamed from: f */
    public int m35445f() {
        int i = 0 | ((this.f3620b.get(this.f3621c + 3) & SmileConstants.BYTE_MARKER_END_OF_CONTENT) << 24) | ((this.f3620b.get(this.f3621c + 2) & SmileConstants.BYTE_MARKER_END_OF_CONTENT) << 16) | ((this.f3620b.get(this.f3621c + 1) & SmileConstants.BYTE_MARKER_END_OF_CONTENT) << 8) | (this.f3620b.get(this.f3621c + 0) & SmileConstants.BYTE_MARKER_END_OF_CONTENT);
        this.f3621c += 4;
        return i;
    }

    /* renamed from: g */
    public long m35444g() {
        long j = 0 | ((this.f3620b.get(this.f3621c + 7) & 255) << 56) | ((this.f3620b.get(this.f3621c + 6) & 255) << 48) | ((this.f3620b.get(this.f3621c + 5) & 255) << 40) | ((this.f3620b.get(this.f3621c + 4) & 255) << 32) | ((this.f3620b.get(this.f3621c + 3) & 255) << 24) | ((this.f3620b.get(this.f3621c + 2) & 255) << 16) | ((this.f3620b.get(this.f3621c + 1) & 255) << 8) | (this.f3620b.get(this.f3621c + 0) & 255);
        this.f3621c += 8;
        return j;
    }

    /* renamed from: h */
    public long m35443h() {
        long j = 0 | ((this.f3620b.get(this.f3621c + 0) & 255) << 56) | ((this.f3620b.get(this.f3621c + 1) & 255) << 48) | ((this.f3620b.get(this.f3621c + 2) & 255) << 40) | ((this.f3620b.get(this.f3621c + 3) & 255) << 32) | ((this.f3620b.get(this.f3621c + 4) & 255) << 24) | ((this.f3620b.get(this.f3621c + 5) & 255) << 16) | ((this.f3620b.get(this.f3621c + 6) & 255) << 8) | (this.f3620b.get(this.f3621c + 7) & 255);
        this.f3621c += 8;
        return j;
    }

    /* renamed from: i */
    public float m35442i() {
        return Float.intBitsToFloat(m35445f());
    }

    /* renamed from: j */
    public float m35441j() {
        BigInteger bigInteger = new BigInteger(1, new byte[]{(byte) ((this.f3620b.get(this.f3621c + 2) & SmileConstants.BYTE_MARKER_END_OF_CONTENT) | 0), (byte) ((this.f3620b.get(this.f3621c + 1) & SmileConstants.BYTE_MARKER_END_OF_CONTENT) | 0), (byte) ((this.f3620b.get(this.f3621c + 0) & SmileConstants.BYTE_MARKER_END_OF_CONTENT) | 0)});
        this.f3621c += 3;
        return Float.parseFloat(bigInteger.toString());
    }

    /* renamed from: k */
    public Double m35440k() {
        return Double.valueOf(Double.longBitsToDouble(m35444g()));
    }

    /* renamed from: l */
    public char m35439l() {
        char c = (char) (((char) (0 | ((this.f3620b.get(this.f3621c + 1) & SmileConstants.BYTE_MARKER_END_OF_CONTENT) << 8))) | (this.f3620b.get(this.f3621c + 0) & SmileConstants.BYTE_MARKER_END_OF_CONTENT));
        this.f3621c += 2;
        return c;
    }

    /* renamed from: m */
    public long m35438m() {
        long j = 0 | ((this.f3620b.get(this.f3621c + 3) & 255) << 24) | ((this.f3620b.get(this.f3621c + 2) & 255) << 16) | ((this.f3620b.get(this.f3621c + 1) & 255) << 8) | (this.f3620b.get(this.f3621c + 0) & 255);
        this.f3621c += 4;
        return j;
    }
}
