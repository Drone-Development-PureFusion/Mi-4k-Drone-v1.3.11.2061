package org.p286a.p287a.p306i.p308b;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import javax.net.ssl.SSLException;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpRequest;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.RequestWrapper;
import org.apache.http.protocol.HttpContext;
import org.p286a.p287a.p288a.AbstractC11008b;
import org.p286a.p287a.p290c.p295e.C11060a;
import org.p286a.p287a.p320o.C11354a;
@AbstractC11008b
/* renamed from: org.a.a.i.b.l */
/* loaded from: classes.dex */
public class C11190l implements HttpRequestRetryHandler {

    /* renamed from: a */
    public static final C11190l f35996a = new C11190l();

    /* renamed from: b */
    private final int f35997b;

    /* renamed from: c */
    private final boolean f35998c;

    /* renamed from: d */
    private final Set<Class<? extends IOException>> f35999d;

    public C11190l() {
        this(3, false);
    }

    public C11190l(int i, boolean z) {
        this(i, z, Arrays.asList(InterruptedIOException.class, UnknownHostException.class, ConnectException.class, SSLException.class));
    }

    protected C11190l(int i, boolean z, Collection<Class<? extends IOException>> collection) {
        this.f35997b = i;
        this.f35998c = z;
        this.f35999d = new HashSet();
        for (Class<? extends IOException> cls : collection) {
            this.f35999d.add(cls);
        }
    }

    /* renamed from: a */
    public boolean m1761a() {
        return this.f35998c;
    }

    /* renamed from: a */
    protected boolean mo1760a(HttpRequest httpRequest) {
        return !(httpRequest instanceof HttpEntityEnclosingRequest);
    }

    /* renamed from: b */
    public int m1759b() {
        return this.f35997b;
    }

    @Deprecated
    /* renamed from: b */
    protected boolean m1758b(HttpRequest httpRequest) {
        HttpRequest original = httpRequest instanceof RequestWrapper ? ((RequestWrapper) httpRequest).getOriginal() : httpRequest;
        return (original instanceof HttpUriRequest) && ((HttpUriRequest) original).isAborted();
    }

    public boolean retryRequest(IOException iOException, int i, HttpContext httpContext) {
        C11354a.m1321a(iOException, "Exception parameter");
        C11354a.m1321a(httpContext, "HTTP context");
        if (i <= this.f35997b && !this.f35999d.contains(iOException.getClass())) {
            for (Class<? extends IOException> cls : this.f35999d) {
                if (cls.isInstance(iOException)) {
                    return false;
                }
            }
            C11060a m2176a = C11060a.m2176a(httpContext);
            HttpRequest q = m2176a.q();
            if (m1758b(q)) {
                return false;
            }
            if (mo1760a(q)) {
                return true;
            }
            return !m2176a.r() || this.f35998c;
        }
        return false;
    }
}
