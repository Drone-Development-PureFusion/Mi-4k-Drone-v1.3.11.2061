package org.p286a.p287a.p306i.p313g;

import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import org.apache.http.impl.io.HttpTransportMetricsImpl;
import org.apache.http.io.HttpTransportMetrics;
import org.apache.http.io.SessionOutputBuffer;
import org.apache.http.util.ByteArrayBuffer;
import org.apache.http.util.CharArrayBuffer;
import org.p286a.p287a.p288a.AbstractC11009c;
import org.p286a.p287a.p315j.AbstractC11320a;
import org.p286a.p287a.p320o.C11354a;
import org.p286a.p287a.p320o.C11355b;
@AbstractC11009c
/* renamed from: org.a.a.i.g.r */
/* loaded from: classes2.dex */
public class C11312r implements AbstractC11320a, SessionOutputBuffer {

    /* renamed from: a */
    private static final byte[] f36344a = {13, 10};

    /* renamed from: b */
    private final HttpTransportMetricsImpl f36345b;

    /* renamed from: c */
    private final ByteArrayBuffer f36346c;

    /* renamed from: d */
    private final int f36347d;

    /* renamed from: e */
    private final CharsetEncoder f36348e;

    /* renamed from: f */
    private OutputStream f36349f;

    /* renamed from: g */
    private ByteBuffer f36350g;

    public C11312r(HttpTransportMetricsImpl httpTransportMetricsImpl, int i) {
        this(httpTransportMetricsImpl, i, i, null);
    }

    public C11312r(HttpTransportMetricsImpl httpTransportMetricsImpl, int i, int i2, CharsetEncoder charsetEncoder) {
        C11354a.m1324a(i, "Buffer size");
        C11354a.m1321a(httpTransportMetricsImpl, "HTTP transport metrcis");
        this.f36345b = httpTransportMetricsImpl;
        this.f36346c = new ByteArrayBuffer(i);
        this.f36347d = i2 < 0 ? 0 : i2;
        this.f36348e = charsetEncoder;
    }

    /* renamed from: a */
    private void m1480a(CharBuffer charBuffer) {
        if (!charBuffer.hasRemaining()) {
            return;
        }
        if (this.f36350g == null) {
            this.f36350g = ByteBuffer.allocate(1024);
        }
        this.f36348e.reset();
        while (charBuffer.hasRemaining()) {
            m1479a(this.f36348e.encode(charBuffer, this.f36350g, true));
        }
        m1479a(this.f36348e.flush(this.f36350g));
        this.f36350g.clear();
    }

    /* renamed from: a */
    private void m1479a(CoderResult coderResult) {
        if (coderResult.isError()) {
            coderResult.throwException();
        }
        this.f36350g.flip();
        while (this.f36350g.hasRemaining()) {
            write(this.f36350g.get());
        }
        this.f36350g.compact();
    }

    /* renamed from: a */
    private void m1478a(byte[] bArr, int i, int i2) {
        C11355b.m1313a(this.f36349f, "Output stream");
        this.f36349f.write(bArr, i, i2);
    }

    /* renamed from: e */
    private void m1477e() {
        if (this.f36349f != null) {
            this.f36349f.flush();
        }
    }

    /* renamed from: f */
    private void m1476f() {
        int length = this.f36346c.length();
        if (length > 0) {
            m1478a(this.f36346c.buffer(), 0, length);
            this.f36346c.clear();
            this.f36345b.incrementBytesTransferred(length);
        }
    }

    /* renamed from: a */
    public void m1481a(OutputStream outputStream) {
        this.f36349f = outputStream;
    }

    /* renamed from: a */
    public boolean m1482a() {
        return this.f36349f != null;
    }

    @Override // org.p286a.p287a.p315j.AbstractC11320a
    /* renamed from: b */
    public int mo1469b() {
        return this.f36346c.capacity();
    }

    @Override // org.p286a.p287a.p315j.AbstractC11320a
    /* renamed from: c */
    public int mo1468c() {
        return this.f36346c.length();
    }

    @Override // org.p286a.p287a.p315j.AbstractC11320a
    /* renamed from: d */
    public int mo1467d() {
        return mo1469b() - mo1468c();
    }

    public void flush() {
        m1476f();
        m1477e();
    }

    public HttpTransportMetrics getMetrics() {
        return this.f36345b;
    }

    public void write(int i) {
        if (this.f36347d <= 0) {
            m1476f();
            this.f36349f.write(i);
            return;
        }
        if (this.f36346c.isFull()) {
            m1476f();
        }
        this.f36346c.append(i);
    }

    public void write(byte[] bArr) {
        if (bArr == null) {
            return;
        }
        write(bArr, 0, bArr.length);
    }

    public void write(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            return;
        }
        if (i2 > this.f36347d || i2 > this.f36346c.capacity()) {
            m1476f();
            m1478a(bArr, i, i2);
            this.f36345b.incrementBytesTransferred(i2);
            return;
        }
        if (i2 > this.f36346c.capacity() - this.f36346c.length()) {
            m1476f();
        }
        this.f36346c.append(bArr, i, i2);
    }

    public void writeLine(String str) {
        if (str == null) {
            return;
        }
        if (str.length() > 0) {
            if (this.f36348e == null) {
                for (int i = 0; i < str.length(); i++) {
                    write(str.charAt(i));
                }
            } else {
                m1480a(CharBuffer.wrap(str));
            }
        }
        write(f36344a);
    }

    public void writeLine(CharArrayBuffer charArrayBuffer) {
        int i = 0;
        if (charArrayBuffer == null) {
            return;
        }
        if (this.f36348e == null) {
            int length = charArrayBuffer.length();
            while (length > 0) {
                int min = Math.min(this.f36346c.capacity() - this.f36346c.length(), length);
                if (min > 0) {
                    this.f36346c.append(charArrayBuffer, i, min);
                }
                if (this.f36346c.isFull()) {
                    m1476f();
                }
                i += min;
                length -= min;
            }
        } else {
            m1480a(CharBuffer.wrap(charArrayBuffer.buffer(), 0, charArrayBuffer.length()));
        }
        write(f36344a);
    }
}
