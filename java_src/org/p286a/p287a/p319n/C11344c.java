package org.p286a.p287a.p319n;

import org.apache.http.HttpConnection;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.protocol.HttpContext;
import org.p286a.p287a.p288a.AbstractC11009c;
import org.p286a.p287a.p320o.C11354a;
@AbstractC11009c
/* renamed from: org.a.a.n.c */
/* loaded from: classes2.dex */
public class C11344c implements HttpContext {

    /* renamed from: n */
    public static final String f36425n = "http.connection";

    /* renamed from: o */
    public static final String f36426o = "http.request";

    /* renamed from: p */
    public static final String f36427p = "http.response";

    /* renamed from: q */
    public static final String f36428q = "http.target_host";

    /* renamed from: r */
    public static final String f36429r = "http.request_sent";

    /* renamed from: a */
    private final HttpContext f36430a;

    public C11344c() {
        this.f36430a = new C11342a();
    }

    public C11344c(HttpContext httpContext) {
        this.f36430a = httpContext;
    }

    /* renamed from: b */
    public static C11344c m1348b(HttpContext httpContext) {
        C11354a.m1321a(httpContext, "HTTP context");
        return httpContext instanceof C11344c ? (C11344c) httpContext : new C11344c(httpContext);
    }

    /* renamed from: o */
    public static C11344c m1347o() {
        return new C11344c(new C11342a());
    }

    /* renamed from: a */
    public <T> T m1351a(String str, Class<T> cls) {
        C11354a.m1321a(cls, "Attribute class");
        Object attribute = getAttribute(str);
        if (attribute == null) {
            return null;
        }
        return cls.cast(attribute);
    }

    /* renamed from: a */
    public void m1350a(HttpHost httpHost) {
        setAttribute(f36428q, httpHost);
    }

    /* renamed from: b */
    public <T extends HttpConnection> T m1349b(Class<T> cls) {
        return (T) m1351a(f36425n, cls);
    }

    public Object getAttribute(String str) {
        return this.f36430a.getAttribute(str);
    }

    /* renamed from: p */
    public HttpConnection m1346p() {
        return (HttpConnection) m1351a(f36425n, HttpConnection.class);
    }

    /* renamed from: q */
    public HttpRequest m1345q() {
        return (HttpRequest) m1351a(f36426o, HttpRequest.class);
    }

    /* renamed from: r */
    public boolean m1344r() {
        Boolean bool = (Boolean) m1351a(f36429r, Boolean.class);
        return bool != null && bool.booleanValue();
    }

    public Object removeAttribute(String str) {
        return this.f36430a.removeAttribute(str);
    }

    /* renamed from: s */
    public HttpResponse m1343s() {
        return (HttpResponse) m1351a(f36427p, HttpResponse.class);
    }

    public void setAttribute(String str, Object obj) {
        this.f36430a.setAttribute(str, obj);
    }

    /* renamed from: t */
    public HttpHost m1342t() {
        return (HttpHost) m1351a(f36428q, HttpHost.class);
    }
}
