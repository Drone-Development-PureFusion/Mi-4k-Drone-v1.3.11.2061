package org.p286a.p287a.p306i.p312f;

import android.util.Log;
import java.io.IOException;
import org.apache.http.Header;
import org.apache.http.HttpRequest;
import org.apache.http.NoHttpResponseException;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.NonRepeatableRequestException;
import org.apache.http.conn.routing.HttpRoute;
import org.p286a.p287a.p288a.AbstractC11008b;
import org.p286a.p287a.p290c.p293c.AbstractC11038b;
import org.p286a.p287a.p290c.p293c.AbstractC11042f;
import org.p286a.p287a.p290c.p293c.C11050n;
import org.p286a.p287a.p290c.p295e.C11060a;
import org.p286a.p287a.p320o.C11354a;
@AbstractC11008b
/* renamed from: org.a.a.i.f.l */
/* loaded from: classes2.dex */
public class C11291l implements AbstractC11281b {

    /* renamed from: a */
    private static final String f36271a = "HttpClient";

    /* renamed from: b */
    private final AbstractC11281b f36272b;

    /* renamed from: c */
    private final HttpRequestRetryHandler f36273c;

    public C11291l(AbstractC11281b abstractC11281b, HttpRequestRetryHandler httpRequestRetryHandler) {
        C11354a.m1321a(abstractC11281b, "HTTP request executor");
        C11354a.m1321a(httpRequestRetryHandler, "HTTP request retry handler");
        this.f36272b = abstractC11281b;
        this.f36273c = httpRequestRetryHandler;
    }

    @Override // org.p286a.p287a.p306i.p312f.AbstractC11281b
    /* renamed from: a */
    public AbstractC11038b mo1511a(HttpRoute httpRoute, C11050n c11050n, C11060a c11060a, AbstractC11042f abstractC11042f) {
        int i;
        C11354a.m1321a(httpRoute, "HTTP route");
        C11354a.m1321a(c11050n, "HTTP request");
        C11354a.m1321a(c11060a, "HTTP context");
        Header[] allHeaders = c11050n.getAllHeaders();
        int i2 = 1;
        while (true) {
            try {
                i = i2;
                return this.f36272b.mo1511a(httpRoute, c11050n, c11060a, abstractC11042f);
            } catch (IOException e) {
                if (abstractC11042f != null && abstractC11042f.isAborted()) {
                    if (Log.isLoggable(f36271a, 3)) {
                        Log.d(f36271a, "Request has been aborted");
                    }
                    throw e;
                } else if (!this.f36273c.retryRequest(e, i, c11060a)) {
                    if (!(e instanceof NoHttpResponseException)) {
                        throw e;
                    }
                    NoHttpResponseException noHttpResponseException = new NoHttpResponseException(httpRoute.getTargetHost().toHostString() + " failed to respond");
                    noHttpResponseException.setStackTrace(e.getStackTrace());
                    throw noHttpResponseException;
                } else {
                    if (Log.isLoggable(f36271a, 4)) {
                        Log.i(f36271a, "I/O exception (" + e.getClass().getName() + ") caught when processing request to " + httpRoute + ": " + e.getMessage());
                    }
                    if (Log.isLoggable(f36271a, 3)) {
                        Log.d(f36271a, e.getMessage(), e);
                    }
                    if (!C11289j.m1516a((HttpRequest) c11050n)) {
                        if (Log.isLoggable(f36271a, 3)) {
                            Log.d(f36271a, "Cannot retry non-repeatable request");
                        }
                        new NonRepeatableRequestException("Cannot retry request with a non-repeatable request entity").initCause(e);
                    }
                    c11050n.setHeaders(allHeaders);
                    if (Log.isLoggable(f36271a, 4)) {
                        Log.i(f36271a, "Retrying request to " + httpRoute);
                    }
                    i2 = i + 1;
                }
            }
        }
    }
}
