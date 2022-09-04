package org.p286a.p287a.p306i.p313g;

import com.fimi.soul.media.player.FimiMediaMeta;
import java.io.IOException;
import java.io.InputStream;
import org.apache.http.ConnectionClosedException;
import org.apache.http.io.SessionInputBuffer;
import org.p286a.p287a.p288a.AbstractC11009c;
import org.p286a.p287a.p315j.AbstractC11320a;
import org.p286a.p287a.p320o.C11354a;
@AbstractC11009c
/* renamed from: org.a.a.i.g.e */
/* loaded from: classes2.dex */
public class C11299e extends InputStream {

    /* renamed from: a */
    private static final int f36307a = 2048;

    /* renamed from: b */
    private final long f36308b;

    /* renamed from: c */
    private long f36309c = 0;

    /* renamed from: d */
    private boolean f36310d = false;

    /* renamed from: e */
    private SessionInputBuffer f36311e;

    public C11299e(SessionInputBuffer sessionInputBuffer, long j) {
        this.f36311e = null;
        this.f36311e = (SessionInputBuffer) C11354a.m1321a(sessionInputBuffer, "Session input buffer");
        this.f36308b = C11354a.m1316b(j, "Content length");
    }

    @Override // java.io.InputStream
    public int available() {
        if (this.f36311e instanceof AbstractC11320a) {
            return Math.min(this.f36311e.mo1468c(), (int) (this.f36308b - this.f36309c));
        }
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.f36310d) {
            try {
                if (this.f36309c >= this.f36308b) {
                }
                do {
                } while (read(new byte[2048]) >= 0);
            } finally {
                this.f36310d = true;
            }
        }
    }

    @Override // java.io.InputStream
    public int read() {
        if (this.f36310d) {
            throw new IOException("Attempted read from closed stream.");
        }
        if (this.f36309c >= this.f36308b) {
            return -1;
        }
        int read = this.f36311e.read();
        if (read != -1) {
            this.f36309c++;
        } else if (this.f36309c < this.f36308b) {
            throw new ConnectionClosedException("Premature end of Content-Length delimited message body (expected: " + this.f36308b + "; received: " + this.f36309c);
        }
        return read;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        if (this.f36310d) {
            throw new IOException("Attempted read from closed stream.");
        }
        if (this.f36309c >= this.f36308b) {
            return -1;
        }
        if (this.f36309c + i2 > this.f36308b) {
            i2 = (int) (this.f36308b - this.f36309c);
        }
        int read = this.f36311e.read(bArr, i, i2);
        if (read == -1 && this.f36309c < this.f36308b) {
            throw new ConnectionClosedException("Premature end of Content-Length delimited message body (expected: " + this.f36308b + "; received: " + this.f36309c);
        }
        if (read > 0) {
            this.f36309c += read;
        }
        return read;
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        int read;
        if (j <= 0) {
            return 0L;
        }
        byte[] bArr = new byte[2048];
        long min = Math.min(j, this.f36308b - this.f36309c);
        long j2 = 0;
        while (min > 0 && (read = read(bArr, 0, (int) Math.min((long) FimiMediaMeta.AV_CH_TOP_CENTER, min))) != -1) {
            j2 += read;
            min -= read;
        }
        return j2;
    }
}
