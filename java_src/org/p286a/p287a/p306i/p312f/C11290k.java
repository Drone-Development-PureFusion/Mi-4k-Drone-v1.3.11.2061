package org.p286a.p287a.p306i.p312f;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.SocketException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.conn.EofSensorWatcher;
import org.p286a.p287a.p288a.AbstractC11009c;
import org.p286a.p287a.p299f.C11110c;
import org.p286a.p287a.p305h.C11145g;
import p005b.p006a.p007a.p029b.C0494h;
@AbstractC11009c
/* renamed from: org.a.a.i.f.k */
/* loaded from: classes.dex */
class C11290k extends C11145g implements EofSensorWatcher {

    /* renamed from: b */
    private final C11282c f36270b;

    C11290k(HttpEntity httpEntity, C11282c c11282c) {
        super(httpEntity);
        this.f36270b = c11282c;
    }

    /* renamed from: a */
    public static void m1513a(HttpResponse httpResponse, C11282c c11282c) {
        HttpEntity entity = httpResponse.getEntity();
        if (entity == null || !entity.isStreaming() || c11282c == null) {
            return;
        }
        httpResponse.setEntity(new C11290k(entity, c11282c));
    }

    /* renamed from: b */
    private void m1512b() {
        if (this.f36270b != null) {
            this.f36270b.abortConnection();
        }
    }

    /* renamed from: a */
    public void m1514a() {
        if (this.f36270b != null) {
            try {
                if (this.f36270b.m1529b()) {
                    this.f36270b.releaseConnection();
                }
            } finally {
                m1512b();
            }
        }
    }

    @Override // org.p286a.p287a.p305h.C11145g
    @Deprecated
    public void consumeContent() {
        m1514a();
    }

    public boolean eofDetected(InputStream inputStream) {
        try {
            inputStream.close();
            m1514a();
            m1512b();
            return false;
        } catch (Throwable th) {
            m1512b();
            throw th;
        }
    }

    @Override // org.p286a.p287a.p305h.C11145g
    public InputStream getContent() {
        return new C11110c(this.f35847a.getContent(), this);
    }

    @Override // org.p286a.p287a.p305h.C11145g
    public boolean isRepeatable() {
        return false;
    }

    public boolean streamAbort(InputStream inputStream) {
        m1512b();
        return false;
    }

    public boolean streamClosed(InputStream inputStream) {
        try {
            boolean z = this.f36270b != null && !this.f36270b.m1526e();
            try {
                inputStream.close();
                m1514a();
            } catch (SocketException e) {
                if (z) {
                    throw e;
                }
            }
            return false;
        } finally {
            m1512b();
        }
    }

    public String toString() {
        return "ResponseEntityProxy{" + this.f35847a + C0494h.f735w;
    }

    @Override // org.p286a.p287a.p305h.C11145g
    public void writeTo(OutputStream outputStream) {
        try {
            this.f35847a.writeTo(outputStream);
            m1514a();
        } finally {
            m1512b();
        }
    }
}
