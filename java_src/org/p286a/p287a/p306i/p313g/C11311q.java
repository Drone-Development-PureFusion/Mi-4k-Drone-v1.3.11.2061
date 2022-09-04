package org.p286a.p287a.p306i.p313g;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import org.apache.http.impl.io.HttpTransportMetricsImpl;
import org.apache.http.io.HttpTransportMetrics;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.util.ByteArrayBuffer;
import org.apache.http.util.CharArrayBuffer;
import org.codehaus.jackson.smile.SmileConstants;
import org.p286a.p287a.C11096f;
import org.p286a.p287a.p288a.AbstractC11009c;
import org.p286a.p287a.p298e.C11090c;
import org.p286a.p287a.p315j.AbstractC11320a;
import org.p286a.p287a.p320o.C11354a;
import org.p286a.p287a.p320o.C11355b;
@AbstractC11009c
/* renamed from: org.a.a.i.g.q */
/* loaded from: classes2.dex */
public class C11311q implements AbstractC11320a, SessionInputBuffer {

    /* renamed from: a */
    private final HttpTransportMetricsImpl f36334a;

    /* renamed from: b */
    private final byte[] f36335b;

    /* renamed from: c */
    private final ByteArrayBuffer f36336c;

    /* renamed from: d */
    private final int f36337d;

    /* renamed from: e */
    private final C11090c f36338e;

    /* renamed from: f */
    private final CharsetDecoder f36339f;

    /* renamed from: g */
    private InputStream f36340g;

    /* renamed from: h */
    private int f36341h;

    /* renamed from: i */
    private int f36342i;

    /* renamed from: j */
    private CharBuffer f36343j;

    public C11311q(HttpTransportMetricsImpl httpTransportMetricsImpl, int i) {
        this(httpTransportMetricsImpl, i, i, null, null);
    }

    public C11311q(HttpTransportMetricsImpl httpTransportMetricsImpl, int i, int i2, C11090c c11090c, CharsetDecoder charsetDecoder) {
        C11354a.m1321a(httpTransportMetricsImpl, "HTTP transport metrcis");
        C11354a.m1324a(i, "Buffer size");
        this.f36334a = httpTransportMetricsImpl;
        this.f36335b = new byte[i];
        this.f36341h = 0;
        this.f36342i = 0;
        this.f36337d = i2 < 0 ? 512 : i2;
        this.f36338e = c11090c == null ? C11090c.f35747a : c11090c;
        this.f36336c = new ByteArrayBuffer(i);
        this.f36339f = charsetDecoder;
    }

    /* renamed from: a */
    private int m1491a(CoderResult coderResult, CharArrayBuffer charArrayBuffer, ByteBuffer byteBuffer) {
        if (coderResult.isError()) {
            coderResult.throwException();
        }
        this.f36343j.flip();
        int remaining = this.f36343j.remaining();
        while (this.f36343j.hasRemaining()) {
            charArrayBuffer.append(this.f36343j.get());
        }
        this.f36343j.compact();
        return remaining;
    }

    /* renamed from: a */
    private int m1490a(CharArrayBuffer charArrayBuffer) {
        int length = this.f36336c.length();
        if (length > 0) {
            if (this.f36336c.byteAt(length - 1) == 10) {
                length--;
            }
            if (length > 0 && this.f36336c.byteAt(length - 1) == 13) {
                length--;
            }
        }
        if (this.f36339f == null) {
            charArrayBuffer.append(this.f36336c, 0, length);
        } else {
            length = m1488a(charArrayBuffer, ByteBuffer.wrap(this.f36336c.buffer(), 0, length));
        }
        this.f36336c.clear();
        return length;
    }

    /* renamed from: a */
    private int m1489a(CharArrayBuffer charArrayBuffer, int i) {
        int i2 = this.f36341h;
        this.f36341h = i + 1;
        if (i > i2 && this.f36335b[i - 1] == 13) {
            i--;
        }
        int i3 = i - i2;
        if (this.f36339f == null) {
            charArrayBuffer.append(this.f36335b, i2, i3);
            return i3;
        }
        return m1488a(charArrayBuffer, ByteBuffer.wrap(this.f36335b, i2, i3));
    }

    /* renamed from: a */
    private int m1488a(CharArrayBuffer charArrayBuffer, ByteBuffer byteBuffer) {
        int i = 0;
        if (!byteBuffer.hasRemaining()) {
            return 0;
        }
        if (this.f36343j == null) {
            this.f36343j = CharBuffer.allocate(1024);
        }
        this.f36339f.reset();
        while (byteBuffer.hasRemaining()) {
            i += m1491a(this.f36339f.decode(byteBuffer, this.f36343j, true), charArrayBuffer, byteBuffer);
        }
        int m1491a = i + m1491a(this.f36339f.flush(this.f36343j), charArrayBuffer, byteBuffer);
        this.f36343j.clear();
        return m1491a;
    }

    /* renamed from: a */
    private int m1487a(byte[] bArr, int i, int i2) {
        C11355b.m1313a(this.f36340g, "Input stream");
        return this.f36340g.read(bArr, i, i2);
    }

    /* renamed from: h */
    private int m1483h() {
        for (int i = this.f36341h; i < this.f36342i; i++) {
            if (this.f36335b[i] == 10) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public void m1492a(InputStream inputStream) {
        this.f36340g = inputStream;
    }

    /* renamed from: a */
    public boolean m1493a() {
        return this.f36340g != null;
    }

    @Override // org.p286a.p287a.p315j.AbstractC11320a
    /* renamed from: b */
    public int mo1469b() {
        return this.f36335b.length;
    }

    @Override // org.p286a.p287a.p315j.AbstractC11320a
    /* renamed from: c */
    public int mo1468c() {
        return this.f36342i - this.f36341h;
    }

    @Override // org.p286a.p287a.p315j.AbstractC11320a
    /* renamed from: d */
    public int mo1467d() {
        return mo1469b() - mo1468c();
    }

    /* renamed from: e */
    public int m1486e() {
        if (this.f36341h > 0) {
            int i = this.f36342i - this.f36341h;
            if (i > 0) {
                System.arraycopy(this.f36335b, this.f36341h, this.f36335b, 0, i);
            }
            this.f36341h = 0;
            this.f36342i = i;
        }
        int i2 = this.f36342i;
        int m1487a = m1487a(this.f36335b, i2, this.f36335b.length - i2);
        if (m1487a == -1) {
            return -1;
        }
        this.f36342i = i2 + m1487a;
        this.f36334a.incrementBytesTransferred(m1487a);
        return m1487a;
    }

    /* renamed from: f */
    public boolean m1485f() {
        return this.f36341h < this.f36342i;
    }

    /* renamed from: g */
    public void m1484g() {
        this.f36341h = 0;
        this.f36342i = 0;
    }

    public HttpTransportMetrics getMetrics() {
        return this.f36334a;
    }

    public boolean isDataAvailable(int i) {
        return m1485f();
    }

    public int read() {
        while (!m1485f()) {
            if (m1486e() == -1) {
                return -1;
            }
        }
        byte[] bArr = this.f36335b;
        int i = this.f36341h;
        this.f36341h = i + 1;
        return bArr[i] & SmileConstants.BYTE_MARKER_END_OF_CONTENT;
    }

    public int read(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            return 0;
        }
        if (m1485f()) {
            int min = Math.min(i2, this.f36342i - this.f36341h);
            System.arraycopy(this.f36335b, this.f36341h, bArr, i, min);
            this.f36341h += min;
            return min;
        } else if (i2 > this.f36337d) {
            int m1487a = m1487a(bArr, i, i2);
            if (m1487a <= 0) {
                return m1487a;
            }
            this.f36334a.incrementBytesTransferred(m1487a);
            return m1487a;
        } else {
            while (!m1485f()) {
                if (m1486e() == -1) {
                    return -1;
                }
            }
            int min2 = Math.min(i2, this.f36342i - this.f36341h);
            System.arraycopy(this.f36335b, this.f36341h, bArr, i, min2);
            this.f36341h += min2;
            return min2;
        }
    }

    public int readLine(CharArrayBuffer charArrayBuffer) {
        C11354a.m1321a(charArrayBuffer, "Char array buffer");
        boolean z = true;
        int i = 0;
        while (z) {
            int m1483h = m1483h();
            if (m1483h == -1) {
                if (m1485f()) {
                    this.f36336c.append(this.f36335b, this.f36341h, this.f36342i - this.f36341h);
                    this.f36341h = this.f36342i;
                }
                i = m1486e();
                if (i == -1) {
                    z = false;
                }
            } else if (this.f36336c.isEmpty()) {
                return m1489a(charArrayBuffer, m1483h);
            } else {
                this.f36336c.append(this.f36335b, this.f36341h, (m1483h + 1) - this.f36341h);
                this.f36341h = m1483h + 1;
                z = false;
            }
            int m2052a = this.f36338e.m2052a();
            if (m2052a > 0 && this.f36336c.length() >= m2052a) {
                throw new C11096f("Maximum line length limit exceeded");
            }
        }
        if (i != -1 || !this.f36336c.isEmpty()) {
            return m1490a(charArrayBuffer);
        }
        return -1;
    }

    public String readLine() {
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(64);
        if (readLine(charArrayBuffer) != -1) {
            return charArrayBuffer.toString();
        }
        return null;
    }
}
