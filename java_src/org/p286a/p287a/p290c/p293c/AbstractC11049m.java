package org.p286a.p287a.p290c.p293c;

import java.net.URI;
import org.apache.http.ProtocolVersion;
import org.apache.http.RequestLine;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.message.BasicRequestLine;
import org.apache.http.params.HttpProtocolParams;
import org.p286a.p287a.p288a.AbstractC11009c;
import org.p286a.p287a.p290c.p291a.C11022c;
@AbstractC11009c
/* renamed from: org.a.a.c.c.m */
/* loaded from: classes2.dex */
public abstract class AbstractC11049m extends AbstractC11035a implements AbstractC11039c, HttpUriRequest {

    /* renamed from: a */
    private ProtocolVersion f35590a;

    /* renamed from: b */
    private URI f35591b;

    /* renamed from: c */
    private C11022c f35592c;

    @Override // org.p286a.p287a.p290c.p293c.AbstractC11039c
    /* renamed from: A_ */
    public C11022c mo2229A_() {
        return this.f35592c;
    }

    /* renamed from: a */
    public void m2228a(URI uri) {
        this.f35591b = uri;
    }

    /* renamed from: a */
    public void m2227a(C11022c c11022c) {
        this.f35592c = c11022c;
    }

    /* renamed from: a */
    public void m2226a(ProtocolVersion protocolVersion) {
        this.f35590a = protocolVersion;
    }

    /* renamed from: c */
    public void m2225c() {
    }

    /* renamed from: d */
    public void m2224d() {
        b();
    }

    public abstract String getMethod();

    public ProtocolVersion getProtocolVersion() {
        return this.f35590a != null ? this.f35590a : HttpProtocolParams.getVersion(getParams());
    }

    public RequestLine getRequestLine() {
        String method = getMethod();
        ProtocolVersion protocolVersion = getProtocolVersion();
        URI uri = getURI();
        String str = null;
        if (uri != null) {
            str = uri.toASCIIString();
        }
        if (str == null || str.length() == 0) {
            str = "/";
        }
        return new BasicRequestLine(method, str, protocolVersion);
    }

    public URI getURI() {
        return this.f35591b;
    }

    public String toString() {
        return getMethod() + " " + getURI() + " " + getProtocolVersion();
    }
}
