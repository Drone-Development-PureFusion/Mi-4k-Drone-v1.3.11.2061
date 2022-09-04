package org.p286a.p287a.p306i.p312f;

import java.io.IOException;
import java.lang.reflect.UndeclaredThrowableException;
import org.apache.http.HttpException;
import org.apache.http.conn.routing.HttpRoute;
import org.p286a.p287a.p288a.AbstractC11008b;
import org.p286a.p287a.p290c.AbstractC11034c;
import org.p286a.p287a.p290c.AbstractC11057d;
import org.p286a.p287a.p290c.p293c.AbstractC11038b;
import org.p286a.p287a.p290c.p293c.AbstractC11042f;
import org.p286a.p287a.p290c.p293c.C11050n;
import org.p286a.p287a.p290c.p295e.C11060a;
import org.p286a.p287a.p320o.C11354a;
@AbstractC11008b
/* renamed from: org.a.a.i.f.a */
/* loaded from: classes2.dex */
public class C11280a implements AbstractC11281b {

    /* renamed from: a */
    private final AbstractC11281b f36232a;

    /* renamed from: b */
    private final AbstractC11057d f36233b;

    /* renamed from: c */
    private final AbstractC11034c f36234c;

    public C11280a(AbstractC11281b abstractC11281b, AbstractC11057d abstractC11057d, AbstractC11034c abstractC11034c) {
        C11354a.m1321a(abstractC11281b, "HTTP client request executor");
        C11354a.m1321a(abstractC11057d, "Connection backoff strategy");
        C11354a.m1321a(abstractC11034c, "Backoff manager");
        this.f36232a = abstractC11281b;
        this.f36233b = abstractC11057d;
        this.f36234c = abstractC11034c;
    }

    @Override // org.p286a.p287a.p306i.p312f.AbstractC11281b
    /* renamed from: a */
    public AbstractC11038b mo1511a(HttpRoute httpRoute, C11050n c11050n, C11060a c11060a, AbstractC11042f abstractC11042f) {
        C11354a.m1321a(httpRoute, "HTTP route");
        C11354a.m1321a(c11050n, "HTTP request");
        C11354a.m1321a(c11060a, "HTTP context");
        AbstractC11038b abstractC11038b = null;
        try {
            AbstractC11038b mo1511a = this.f36232a.mo1511a(httpRoute, c11050n, c11060a, abstractC11042f);
            if (this.f36233b.mo1762a(mo1511a)) {
                this.f36234c.mo1800a(httpRoute);
            } else {
                this.f36234c.mo1798b(httpRoute);
            }
            return mo1511a;
        } catch (Exception e) {
            if (0 != 0) {
                abstractC11038b.close();
            }
            if (this.f36233b.mo1763a((Throwable) e)) {
                this.f36234c.mo1800a(httpRoute);
            }
            if (e instanceof RuntimeException) {
                throw ((RuntimeException) e);
            }
            if (e instanceof HttpException) {
                throw e;
            }
            if (!(e instanceof IOException)) {
                throw new UndeclaredThrowableException(e);
            }
            throw ((IOException) e);
        }
    }
}
