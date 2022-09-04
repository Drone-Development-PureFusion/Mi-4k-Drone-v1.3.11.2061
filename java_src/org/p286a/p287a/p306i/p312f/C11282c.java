package org.p286a.p287a.p306i.p312f;

import android.util.Log;
import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.http.HttpClientConnection;
import org.apache.http.conn.ConnectionReleaseTrigger;
import org.p286a.p287a.p288a.AbstractC11010d;
import org.p286a.p287a.p297d.AbstractC11084b;
import org.p286a.p287a.p299f.AbstractC11128d;
@AbstractC11010d
/* renamed from: org.a.a.i.f.c */
/* loaded from: classes2.dex */
class C11282c implements Closeable, AbstractC11084b, ConnectionReleaseTrigger {

    /* renamed from: a */
    private static final String f36235a = "HttpClient";

    /* renamed from: b */
    private final AbstractC11128d f36236b;

    /* renamed from: c */
    private final HttpClientConnection f36237c;

    /* renamed from: d */
    private volatile boolean f36238d;

    /* renamed from: e */
    private volatile Object f36239e;

    /* renamed from: f */
    private volatile long f36240f;

    /* renamed from: g */
    private volatile TimeUnit f36241g;

    /* renamed from: h */
    private volatile boolean f36242h;

    public C11282c(AbstractC11128d abstractC11128d, HttpClientConnection httpClientConnection) {
        this.f36236b = abstractC11128d;
        this.f36237c = httpClientConnection;
    }

    /* renamed from: a */
    public void m1531a(long j, TimeUnit timeUnit) {
        synchronized (this.f36237c) {
            this.f36240f = j;
            this.f36241g = timeUnit;
        }
    }

    /* renamed from: a */
    public void m1530a(Object obj) {
        this.f36239e = obj;
    }

    @Override // org.p286a.p287a.p297d.AbstractC11084b
    /* renamed from: a */
    public boolean mo1532a() {
        boolean z = this.f36242h;
        if (Log.isLoggable(f36235a, 3)) {
            Log.d(f36235a, "Cancelling request execution");
        }
        abortConnection();
        return !z;
    }

    public void abortConnection() {
        synchronized (this.f36237c) {
            if (this.f36242h) {
                return;
            }
            this.f36242h = true;
            try {
                this.f36237c.shutdown();
                if (Log.isLoggable(f36235a, 3)) {
                    Log.d(f36235a, "Connection discarded");
                }
                this.f36236b.mo1612a(this.f36237c, (Object) null, 0L, TimeUnit.MILLISECONDS);
            } catch (IOException e) {
                if (Log.isLoggable(f36235a, 3)) {
                    Log.d(f36235a, e.getMessage(), e);
                }
                this.f36236b.mo1612a(this.f36237c, (Object) null, 0L, TimeUnit.MILLISECONDS);
            }
        }
    }

    /* renamed from: b */
    public boolean m1529b() {
        return this.f36238d;
    }

    /* renamed from: c */
    public void m1528c() {
        this.f36238d = true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        abortConnection();
    }

    /* renamed from: d */
    public void m1527d() {
        this.f36238d = false;
    }

    /* renamed from: e */
    public boolean m1526e() {
        return this.f36242h;
    }

    public void releaseConnection() {
        synchronized (this.f36237c) {
            if (this.f36242h) {
                return;
            }
            this.f36242h = true;
            if (this.f36238d) {
                this.f36236b.mo1612a(this.f36237c, this.f36239e, this.f36240f, this.f36241g);
            } else {
                try {
                    this.f36237c.close();
                    if (Log.isLoggable(f36235a, 3)) {
                        Log.d(f36235a, "Connection discarded");
                    }
                    this.f36236b.mo1612a(this.f36237c, (Object) null, 0L, TimeUnit.MILLISECONDS);
                } catch (IOException e) {
                    if (Log.isLoggable(f36235a, 3)) {
                        Log.d(f36235a, e.getMessage(), e);
                    }
                    this.f36236b.mo1612a(this.f36237c, (Object) null, 0L, TimeUnit.MILLISECONDS);
                }
            }
        }
    }
}
