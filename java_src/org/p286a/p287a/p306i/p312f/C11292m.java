package org.p286a.p287a.p306i.p312f;

import android.util.Log;
import java.io.InterruptedIOException;
import org.apache.http.Header;
import org.apache.http.conn.routing.HttpRoute;
import org.p286a.p287a.p288a.AbstractC11008b;
import org.p286a.p287a.p290c.AbstractC11069f;
import org.p286a.p287a.p290c.p293c.AbstractC11038b;
import org.p286a.p287a.p290c.p293c.AbstractC11042f;
import org.p286a.p287a.p290c.p293c.C11050n;
import org.p286a.p287a.p290c.p295e.C11060a;
import org.p286a.p287a.p320o.C11354a;
@AbstractC11008b
/* renamed from: org.a.a.i.f.m */
/* loaded from: classes2.dex */
public class C11292m implements AbstractC11281b {

    /* renamed from: a */
    private static final String f36274a = "HttpClient";

    /* renamed from: b */
    private final AbstractC11281b f36275b;

    /* renamed from: c */
    private final AbstractC11069f f36276c;

    public C11292m(AbstractC11281b abstractC11281b, AbstractC11069f abstractC11069f) {
        C11354a.m1321a(abstractC11281b, "HTTP request executor");
        C11354a.m1321a(abstractC11069f, "Retry strategy");
        this.f36275b = abstractC11281b;
        this.f36276c = abstractC11069f;
    }

    @Override // org.p286a.p287a.p306i.p312f.AbstractC11281b
    /* renamed from: a */
    public AbstractC11038b mo1511a(HttpRoute httpRoute, C11050n c11050n, C11060a c11060a, AbstractC11042f abstractC11042f) {
        Header[] allHeaders = c11050n.getAllHeaders();
        int i = 1;
        while (true) {
            AbstractC11038b mo1511a = this.f36275b.mo1511a(httpRoute, c11050n, c11060a, abstractC11042f);
            try {
                if (!this.f36276c.mo1752a(mo1511a, i, c11060a)) {
                    return mo1511a;
                }
                mo1511a.close();
                long mo1753a = this.f36276c.mo1753a();
                if (mo1753a > 0) {
                    try {
                        if (Log.isLoggable(f36274a, 3)) {
                            Log.d(f36274a, "Wait for " + mo1753a);
                        }
                        Thread.sleep(mo1753a);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                }
                c11050n.setHeaders(allHeaders);
                i++;
            } catch (RuntimeException e2) {
                mo1511a.close();
                throw e2;
            }
        }
    }
}
