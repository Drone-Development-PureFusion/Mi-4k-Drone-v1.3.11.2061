package org.p286a.p287a.p290c.p293c;

import java.net.URI;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpRequest;
import org.apache.http.ProtocolVersion;
import org.apache.http.RequestLine;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.message.AbstractHttpMessage;
import org.apache.http.message.BasicRequestLine;
import org.apache.http.params.HttpParams;
import org.p286a.p287a.C11086e;
import org.p286a.p287a.p288a.AbstractC11009c;
@AbstractC11009c
/* renamed from: org.a.a.c.c.n */
/* loaded from: classes.dex */
public class C11050n extends AbstractHttpMessage implements HttpUriRequest {

    /* renamed from: a */
    private final HttpRequest f35593a;

    /* renamed from: b */
    private final String f35594b;

    /* renamed from: c */
    private ProtocolVersion f35595c;

    /* renamed from: d */
    private URI f35596d;

    /* renamed from: org.a.a.c.c.n$a */
    /* loaded from: classes2.dex */
    static class C11052a extends C11050n implements HttpEntityEnclosingRequest {

        /* renamed from: a */
        private HttpEntity f35597a;

        public C11052a(HttpEntityEnclosingRequest httpEntityEnclosingRequest) {
            super(httpEntityEnclosingRequest);
            this.f35597a = httpEntityEnclosingRequest.getEntity();
        }

        public boolean expectContinue() {
            Header firstHeader = getFirstHeader(C11086e.f35730w);
            return firstHeader != null && "100-continue".equalsIgnoreCase(firstHeader.getValue());
        }

        public HttpEntity getEntity() {
            return this.f35597a;
        }

        public void setEntity(HttpEntity httpEntity) {
            this.f35597a = httpEntity;
        }
    }

    private C11050n(HttpRequest httpRequest) {
        this.f35593a = httpRequest;
        this.f35595c = this.f35593a.getRequestLine().getProtocolVersion();
        this.f35594b = this.f35593a.getRequestLine().getMethod();
        if (httpRequest instanceof HttpUriRequest) {
            this.f35596d = ((HttpUriRequest) httpRequest).getURI();
        } else {
            this.f35596d = null;
        }
        setHeaders(httpRequest.getAllHeaders());
    }

    /* renamed from: a */
    public static C11050n m2221a(HttpRequest httpRequest) {
        if (httpRequest == null) {
            return null;
        }
        return httpRequest instanceof HttpEntityEnclosingRequest ? new C11052a((HttpEntityEnclosingRequest) httpRequest) : new C11050n(httpRequest);
    }

    /* renamed from: a */
    public HttpRequest m2223a() {
        return this.f35593a;
    }

    /* renamed from: a */
    public void m2222a(URI uri) {
        this.f35596d = uri;
    }

    /* renamed from: a */
    public void m2220a(ProtocolVersion protocolVersion) {
        this.f35595c = protocolVersion;
    }

    public void abort() {
        throw new UnsupportedOperationException();
    }

    public String getMethod() {
        return this.f35594b;
    }

    @Deprecated
    public HttpParams getParams() {
        if (this.params == null) {
            this.params = this.f35593a.getParams().copy();
        }
        return this.params;
    }

    public ProtocolVersion getProtocolVersion() {
        return this.f35595c != null ? this.f35595c : this.f35593a.getProtocolVersion();
    }

    public RequestLine getRequestLine() {
        String aSCIIString = this.f35596d != null ? this.f35596d.toASCIIString() : this.f35593a.getRequestLine().getUri();
        if (aSCIIString == null || aSCIIString.length() == 0) {
            aSCIIString = "/";
        }
        return new BasicRequestLine(this.f35594b, aSCIIString, getProtocolVersion());
    }

    public URI getURI() {
        return this.f35596d;
    }

    public boolean isAborted() {
        return false;
    }

    public String toString() {
        return getRequestLine() + " " + this.headergroup;
    }
}
