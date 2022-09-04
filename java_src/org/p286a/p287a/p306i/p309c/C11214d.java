package org.p286a.p287a.p306i.p309c;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSession;
import org.apache.http.HttpClientConnection;
import org.apache.http.HttpConnectionMetrics;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.protocol.HttpContext;
import org.p286a.p287a.p288a.AbstractC11009c;
import org.p286a.p287a.p299f.AbstractC11133h;
import p005b.p006a.p007a.p029b.C0494h;
@AbstractC11009c
/* renamed from: org.a.a.i.c.d */
/* loaded from: classes2.dex */
class C11214d implements AbstractC11133h, HttpContext {

    /* renamed from: a */
    private volatile C11213c f36116a;

    C11214d(C11213c c11213c) {
        this.f36116a = c11213c;
    }

    /* renamed from: a */
    public static C11213c m1642a(HttpClientConnection httpClientConnection) {
        C11213c m1639d = m1640c(httpClientConnection).m1639d();
        if (m1639d == null) {
            throw new C11215e();
        }
        return m1639d;
    }

    /* renamed from: a */
    public static HttpClientConnection m1643a(C11213c c11213c) {
        return new C11214d(c11213c);
    }

    /* renamed from: b */
    public static C11213c m1641b(HttpClientConnection httpClientConnection) {
        return m1640c(httpClientConnection).m1638e();
    }

    /* renamed from: c */
    private static C11214d m1640c(HttpClientConnection httpClientConnection) {
        if (!C11214d.class.isInstance(httpClientConnection)) {
            throw new IllegalStateException("Unexpected connection proxy class: " + httpClientConnection.getClass());
        }
        return (C11214d) C11214d.class.cast(httpClientConnection);
    }

    @Override // org.p286a.p287a.p299f.AbstractC11133h
    /* renamed from: a */
    public String mo1633a() {
        return m1636g().mo1633a();
    }

    @Override // org.p286a.p287a.p299f.AbstractC11133h
    /* renamed from: a */
    public void mo1644a(Socket socket) {
        m1636g().mo1644a(socket);
    }

    @Override // org.p286a.p287a.p299f.AbstractC11133h
    /* renamed from: b */
    public Socket mo1632b() {
        return m1636g().mo1632b();
    }

    @Override // org.p286a.p287a.p299f.AbstractC11133h
    /* renamed from: c */
    public SSLSession mo1631c() {
        return m1636g().mo1631c();
    }

    public void close() {
        C11213c c11213c = this.f36116a;
        if (c11213c != null) {
            c11213c.m1646c();
        }
    }

    /* renamed from: d */
    C11213c m1639d() {
        return this.f36116a;
    }

    /* renamed from: e */
    C11213c m1638e() {
        C11213c c11213c = this.f36116a;
        this.f36116a = null;
        return c11213c;
    }

    /* renamed from: f */
    AbstractC11133h m1637f() {
        C11213c c11213c = this.f36116a;
        if (c11213c == null) {
            return null;
        }
        return c11213c.i();
    }

    public void flush() {
        m1636g().flush();
    }

    /* renamed from: g */
    AbstractC11133h m1636g() {
        AbstractC11133h m1637f = m1637f();
        if (m1637f == null) {
            throw new C11215e();
        }
        return m1637f;
    }

    public Object getAttribute(String str) {
        HttpContext m1636g = m1636g();
        if (m1636g instanceof HttpContext) {
            return m1636g.getAttribute(str);
        }
        return null;
    }

    public InetAddress getLocalAddress() {
        return m1636g().getLocalAddress();
    }

    public int getLocalPort() {
        return m1636g().getLocalPort();
    }

    public HttpConnectionMetrics getMetrics() {
        return m1636g().getMetrics();
    }

    public InetAddress getRemoteAddress() {
        return m1636g().getRemoteAddress();
    }

    public int getRemotePort() {
        return m1636g().getRemotePort();
    }

    public int getSocketTimeout() {
        return m1636g().getSocketTimeout();
    }

    public boolean isOpen() {
        C11213c c11213c = this.f36116a;
        return c11213c != null && !c11213c.mo1393e();
    }

    public boolean isResponseAvailable(int i) {
        return m1636g().isResponseAvailable(i);
    }

    public boolean isStale() {
        AbstractC11133h m1637f = m1637f();
        if (m1637f != null) {
            return m1637f.isStale();
        }
        return true;
    }

    public void receiveResponseEntity(HttpResponse httpResponse) {
        m1636g().receiveResponseEntity(httpResponse);
    }

    public HttpResponse receiveResponseHeader() {
        return m1636g().receiveResponseHeader();
    }

    public Object removeAttribute(String str) {
        HttpContext m1636g = m1636g();
        if (m1636g instanceof HttpContext) {
            return m1636g.removeAttribute(str);
        }
        return null;
    }

    public void sendRequestEntity(HttpEntityEnclosingRequest httpEntityEnclosingRequest) {
        m1636g().sendRequestEntity(httpEntityEnclosingRequest);
    }

    public void sendRequestHeader(HttpRequest httpRequest) {
        m1636g().sendRequestHeader(httpRequest);
    }

    public void setAttribute(String str, Object obj) {
        HttpContext m1636g = m1636g();
        if (m1636g instanceof HttpContext) {
            m1636g.setAttribute(str, obj);
        }
    }

    public void setSocketTimeout(int i) {
        m1636g().setSocketTimeout(i);
    }

    public void shutdown() {
        C11213c c11213c = this.f36116a;
        if (c11213c != null) {
            c11213c.m1645d();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CPoolProxy{");
        AbstractC11133h m1637f = m1637f();
        if (m1637f != null) {
            sb.append(m1637f);
        } else {
            sb.append("detached");
        }
        sb.append(C0494h.f735w);
        return sb.toString();
    }
}
