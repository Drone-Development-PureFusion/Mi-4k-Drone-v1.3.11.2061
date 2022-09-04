package org.p286a.p287a.p299f;

import java.io.IOException;
import java.io.InputStream;
import org.apache.http.conn.ConnectionReleaseTrigger;
import org.apache.http.conn.EofSensorWatcher;
import org.p286a.p287a.p288a.AbstractC11009c;
import org.p286a.p287a.p320o.C11354a;
@AbstractC11009c
/* renamed from: org.a.a.f.c */
/* loaded from: classes2.dex */
public class C11110c extends InputStream implements ConnectionReleaseTrigger {

    /* renamed from: a */
    protected InputStream f35771a;

    /* renamed from: b */
    private boolean f35772b = false;

    /* renamed from: c */
    private final EofSensorWatcher f35773c;

    public C11110c(InputStream inputStream, EofSensorWatcher eofSensorWatcher) {
        C11354a.m1321a(inputStream, "Wrapped stream");
        this.f35771a = inputStream;
        this.f35773c = eofSensorWatcher;
    }

    /* renamed from: a */
    protected void m2016a(int i) {
        if (this.f35771a == null || i >= 0) {
            return;
        }
        boolean z = true;
        try {
            if (this.f35773c != null) {
                z = this.f35773c.eofDetected(this.f35771a);
            }
            if (z) {
                this.f35771a.close();
            }
        } finally {
            this.f35771a = null;
        }
    }

    /* renamed from: a */
    boolean m2017a() {
        return this.f35772b;
    }

    public void abortConnection() {
        this.f35772b = true;
        m2012e();
    }

    @Override // java.io.InputStream
    public int available() {
        if (m2014c()) {
            try {
                return this.f35771a.available();
            } catch (IOException e) {
                m2012e();
                throw e;
            }
        }
        return 0;
    }

    /* renamed from: b */
    InputStream m2015b() {
        return this.f35771a;
    }

    /* renamed from: c */
    protected boolean m2014c() {
        if (this.f35772b) {
            throw new IOException("Attempted read on closed stream.");
        }
        return this.f35771a != null;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f35772b = true;
        m2013d();
    }

    /* renamed from: d */
    protected void m2013d() {
        if (this.f35771a != null) {
            boolean z = true;
            try {
                if (this.f35773c != null) {
                    z = this.f35773c.streamClosed(this.f35771a);
                }
                if (z) {
                    this.f35771a.close();
                }
            } finally {
                this.f35771a = null;
            }
        }
    }

    /* renamed from: e */
    protected void m2012e() {
        if (this.f35771a != null) {
            boolean z = true;
            try {
                if (this.f35773c != null) {
                    z = this.f35773c.streamAbort(this.f35771a);
                }
                if (z) {
                    this.f35771a.close();
                }
            } finally {
                this.f35771a = null;
            }
        }
    }

    @Override // java.io.InputStream
    public int read() {
        if (m2014c()) {
            try {
                int read = this.f35771a.read();
                m2016a(read);
                return read;
            } catch (IOException e) {
                m2012e();
                throw e;
            }
        }
        return -1;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        if (m2014c()) {
            try {
                int read = this.f35771a.read(bArr, i, i2);
                m2016a(read);
                return read;
            } catch (IOException e) {
                m2012e();
                throw e;
            }
        }
        return -1;
    }

    public void releaseConnection() {
        close();
    }
}
