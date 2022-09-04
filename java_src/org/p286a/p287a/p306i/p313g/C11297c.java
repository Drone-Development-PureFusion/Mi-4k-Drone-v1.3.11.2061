package org.p286a.p287a.p306i.p313g;

import java.io.IOException;
import java.io.InputStream;
import org.apache.http.Header;
import org.apache.http.HttpException;
import org.apache.http.MalformedChunkCodingException;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.util.CharArrayBuffer;
import org.p286a.p287a.C11136g;
import org.p286a.p287a.p288a.AbstractC11009c;
import org.p286a.p287a.p315j.AbstractC11320a;
import org.p286a.p287a.p320o.C11354a;
@AbstractC11009c
/* renamed from: org.a.a.i.g.c */
/* loaded from: classes2.dex */
public class C11297c extends InputStream {

    /* renamed from: a */
    private static final int f36290a = 1;

    /* renamed from: b */
    private static final int f36291b = 2;

    /* renamed from: c */
    private static final int f36292c = 3;

    /* renamed from: d */
    private static final int f36293d = 2048;

    /* renamed from: e */
    private final SessionInputBuffer f36294e;

    /* renamed from: h */
    private int f36297h;

    /* renamed from: j */
    private boolean f36299j = false;

    /* renamed from: k */
    private boolean f36300k = false;

    /* renamed from: l */
    private Header[] f36301l = new Header[0];

    /* renamed from: i */
    private int f36298i = 0;

    /* renamed from: f */
    private final CharArrayBuffer f36295f = new CharArrayBuffer(16);

    /* renamed from: g */
    private int f36296g = 1;

    public C11297c(SessionInputBuffer sessionInputBuffer) {
        this.f36294e = (SessionInputBuffer) C11354a.m1321a(sessionInputBuffer, "Session input buffer");
    }

    /* renamed from: b */
    private void m1504b() {
        this.f36297h = m1503c();
        if (this.f36297h < 0) {
            throw new MalformedChunkCodingException("Negative chunk size");
        }
        this.f36296g = 2;
        this.f36298i = 0;
        if (this.f36297h != 0) {
            return;
        }
        this.f36299j = true;
        m1502d();
    }

    /* renamed from: c */
    private int m1503c() {
        switch (this.f36296g) {
            case 1:
                break;
            case 2:
            default:
                throw new IllegalStateException("Inconsistent codec state");
            case 3:
                this.f36295f.clear();
                if (this.f36294e.readLine(this.f36295f) != -1) {
                    if (this.f36295f.isEmpty()) {
                        this.f36296g = 1;
                        break;
                    } else {
                        throw new MalformedChunkCodingException("Unexpected content at the end of chunk");
                    }
                } else {
                    return 0;
                }
        }
        this.f36295f.clear();
        if (this.f36294e.readLine(this.f36295f) != -1) {
            int indexOf = this.f36295f.indexOf(59);
            if (indexOf < 0) {
                indexOf = this.f36295f.length();
            }
            try {
                return Integer.parseInt(this.f36295f.substringTrimmed(0, indexOf), 16);
            } catch (NumberFormatException e) {
                throw new MalformedChunkCodingException("Bad chunk header");
            }
        }
        return 0;
    }

    /* renamed from: d */
    private void m1502d() {
        try {
            this.f36301l = AbstractC11295a.m1507a(this.f36294e, -1, -1, null);
        } catch (HttpException e) {
            MalformedChunkCodingException malformedChunkCodingException = new MalformedChunkCodingException("Invalid footer: " + e.getMessage());
            malformedChunkCodingException.initCause(e);
            throw malformedChunkCodingException;
        }
    }

    /* renamed from: a */
    public Header[] m1505a() {
        return (Header[]) this.f36301l.clone();
    }

    @Override // java.io.InputStream
    public int available() {
        if (this.f36294e instanceof AbstractC11320a) {
            return Math.min(this.f36294e.mo1468c(), this.f36297h - this.f36298i);
        }
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.f36300k) {
            try {
                if (this.f36299j) {
                }
                do {
                } while (read(new byte[2048]) >= 0);
            } finally {
                this.f36299j = true;
                this.f36300k = true;
            }
        }
    }

    @Override // java.io.InputStream
    public int read() {
        if (this.f36300k) {
            throw new IOException("Attempted read from closed stream.");
        }
        if (this.f36299j) {
            return -1;
        }
        if (this.f36296g != 2) {
            m1504b();
            if (this.f36299j) {
                return -1;
            }
        }
        int read = this.f36294e.read();
        if (read != -1) {
            this.f36298i++;
            if (this.f36298i >= this.f36297h) {
                this.f36296g = 3;
            }
        }
        return read;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        if (this.f36300k) {
            throw new IOException("Attempted read from closed stream.");
        }
        if (this.f36299j) {
            return -1;
        }
        if (this.f36296g != 2) {
            m1504b();
            if (this.f36299j) {
                return -1;
            }
        }
        int read = this.f36294e.read(bArr, i, Math.min(i2, this.f36297h - this.f36298i));
        if (read == -1) {
            this.f36299j = true;
            throw new C11136g("Truncated chunk ( expected size: " + this.f36297h + "; actual size: " + this.f36298i + ")");
        }
        this.f36298i += read;
        if (this.f36298i >= this.f36297h) {
            this.f36296g = 3;
        }
        return read;
    }
}
