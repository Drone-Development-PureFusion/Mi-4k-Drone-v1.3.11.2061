package org.p286a.p287a.p306i.p313g;

import java.io.InputStream;
import org.apache.http.io.SessionInputBuffer;
import org.p286a.p287a.p288a.AbstractC11009c;
import org.p286a.p287a.p315j.AbstractC11320a;
import org.p286a.p287a.p320o.C11354a;
@AbstractC11009c
/* renamed from: org.a.a.i.g.o */
/* loaded from: classes2.dex */
public class C11309o extends InputStream {

    /* renamed from: a */
    private final SessionInputBuffer f36330a;

    /* renamed from: b */
    private boolean f36331b = false;

    public C11309o(SessionInputBuffer sessionInputBuffer) {
        this.f36330a = (SessionInputBuffer) C11354a.m1321a(sessionInputBuffer, "Session input buffer");
    }

    @Override // java.io.InputStream
    public int available() {
        if (this.f36330a instanceof AbstractC11320a) {
            return this.f36330a.mo1468c();
        }
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f36331b = true;
    }

    @Override // java.io.InputStream
    public int read() {
        if (this.f36331b) {
            return -1;
        }
        return this.f36330a.read();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        if (this.f36331b) {
            return -1;
        }
        return this.f36330a.read(bArr, i, i2);
    }
}
