package org.p286a.p287a.p319n;

import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolException;
import org.apache.http.ProtocolVersion;
import org.apache.http.protocol.HttpContext;
import org.p286a.p287a.C11086e;
import org.p286a.p287a.p288a.AbstractC11008b;
import org.p286a.p287a.p320o.C11354a;
@AbstractC11008b
/* renamed from: org.a.a.n.h */
/* loaded from: classes2.dex */
public class C11349h implements HttpRequestInterceptor {

    /* renamed from: a */
    private final boolean f36435a;

    public C11349h() {
        this(false);
    }

    public C11349h(boolean z) {
        this.f36435a = z;
    }

    public void process(HttpRequest httpRequest, HttpContext httpContext) {
        C11354a.m1321a(httpRequest, "HTTP request");
        if (httpRequest instanceof HttpEntityEnclosingRequest) {
            if (this.f36435a) {
                httpRequest.removeHeaders(C11086e.f35701W);
                httpRequest.removeHeaders("Content-Length");
            } else if (httpRequest.containsHeader(C11086e.f35701W)) {
                throw new ProtocolException("Transfer-encoding header already present");
            } else {
                if (httpRequest.containsHeader("Content-Length")) {
                    throw new ProtocolException("Content-Length header already present");
                }
            }
            ProtocolVersion protocolVersion = httpRequest.getRequestLine().getProtocolVersion();
            HttpEntity entity = ((HttpEntityEnclosingRequest) httpRequest).getEntity();
            if (entity == null) {
                httpRequest.addHeader("Content-Length", "0");
                return;
            }
            if (!entity.isChunked() && entity.getContentLength() >= 0) {
                httpRequest.addHeader("Content-Length", Long.toString(entity.getContentLength()));
            } else if (protocolVersion.lessEquals(HttpVersion.HTTP_1_0)) {
                throw new ProtocolException("Chunked transfer encoding not allowed for " + protocolVersion);
            } else {
                httpRequest.addHeader(C11086e.f35701W, "chunked");
            }
            if (entity.getContentType() != null && !httpRequest.containsHeader("Content-Type")) {
                httpRequest.addHeader(entity.getContentType());
            }
            if (entity.getContentEncoding() == null || httpRequest.containsHeader("Content-Encoding")) {
                return;
            }
            httpRequest.addHeader(entity.getContentEncoding());
        }
    }
}
