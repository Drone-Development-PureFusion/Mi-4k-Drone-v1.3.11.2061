package com.p120c.p121a.p122a.p123a.p124a.p125a;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
/* renamed from: com.c.a.a.a.a.a.c */
/* loaded from: classes.dex */
class C1265c implements Closeable {

    /* renamed from: a */
    private static final byte f3187a = 13;

    /* renamed from: b */
    private static final byte f3188b = 10;

    /* renamed from: c */
    private final InputStream f3189c;

    /* renamed from: d */
    private final Charset f3190d;

    /* renamed from: e */
    private byte[] f3191e;

    /* renamed from: f */
    private int f3192f;

    /* renamed from: g */
    private int f3193g;

    public C1265c(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw new NullPointerException();
        }
        if (i < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        }
        if (!charset.equals(C1267d.f3195a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f3189c = inputStream;
        this.f3190d = charset;
        this.f3191e = new byte[i];
    }

    public C1265c(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    /* renamed from: b */
    private void m35983b() {
        int read = this.f3189c.read(this.f3191e, 0, this.f3191e.length);
        if (read == -1) {
            throw new EOFException();
        }
        this.f3192f = 0;
        this.f3193g = read;
    }

    /* renamed from: a */
    public String m35985a() {
        int i;
        String byteArrayOutputStream;
        synchronized (this.f3189c) {
            if (this.f3191e == null) {
                throw new IOException("LineReader is closed");
            }
            if (this.f3192f >= this.f3193g) {
                m35983b();
            }
            int i2 = this.f3192f;
            while (true) {
                if (i2 == this.f3193g) {
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream((this.f3193g - this.f3192f) + 80) { // from class: com.c.a.a.a.a.a.c.1
                        @Override // java.io.ByteArrayOutputStream
                        public String toString() {
                            try {
                                return new String(this.buf, 0, (this.count <= 0 || this.buf[this.count + (-1)] != 13) ? this.count : this.count - 1, C1265c.this.f3190d.name());
                            } catch (UnsupportedEncodingException e) {
                                throw new AssertionError(e);
                            }
                        }
                    };
                    loop1: while (true) {
                        byteArrayOutputStream2.write(this.f3191e, this.f3192f, this.f3193g - this.f3192f);
                        this.f3193g = -1;
                        m35983b();
                        i = this.f3192f;
                        while (i != this.f3193g) {
                            if (this.f3191e[i] == 10) {
                                break loop1;
                            }
                            i++;
                        }
                    }
                    if (i != this.f3192f) {
                        byteArrayOutputStream2.write(this.f3191e, this.f3192f, i - this.f3192f);
                    }
                    this.f3192f = i + 1;
                    byteArrayOutputStream = byteArrayOutputStream2.toString();
                } else if (this.f3191e[i2] == 10) {
                    byteArrayOutputStream = new String(this.f3191e, this.f3192f, ((i2 == this.f3192f || this.f3191e[i2 + (-1)] != 13) ? i2 : i2 - 1) - this.f3192f, this.f3190d.name());
                    this.f3192f = i2 + 1;
                } else {
                    i2++;
                }
            }
            return byteArrayOutputStream;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f3189c) {
            if (this.f3191e != null) {
                this.f3191e = null;
                this.f3189c.close();
            }
        }
    }
}
