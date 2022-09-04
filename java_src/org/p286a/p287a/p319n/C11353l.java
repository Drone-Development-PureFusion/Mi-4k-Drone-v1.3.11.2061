package org.p286a.p287a.p319n;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolVersion;
import org.apache.http.protocol.HttpContext;
import org.p286a.p287a.C11086e;
import org.p286a.p287a.p288a.AbstractC11008b;
import org.p286a.p287a.p320o.C11354a;
@AbstractC11008b
/* renamed from: org.a.a.n.l */
/* loaded from: classes2.dex */
public class C11353l implements HttpResponseInterceptor {
    public void process(HttpResponse httpResponse, HttpContext httpContext) {
        C11354a.m1321a(httpResponse, "HTTP response");
        C11344c m1348b = C11344c.m1348b(httpContext);
        int statusCode = httpResponse.getStatusLine().getStatusCode();
        if (statusCode == 400 || statusCode == 408 || statusCode == 411 || statusCode == 413 || statusCode == 414 || statusCode == 503 || statusCode == 501) {
            httpResponse.setHeader(C11086e.f35717j, "Close");
            return;
        }
        Header firstHeader = httpResponse.getFirstHeader(C11086e.f35717j);
        if (firstHeader != null && "Close".equalsIgnoreCase(firstHeader.getValue())) {
            return;
        }
        HttpEntity entity = httpResponse.getEntity();
        if (entity != null) {
            ProtocolVersion protocolVersion = httpResponse.getStatusLine().getProtocolVersion();
            if (entity.getContentLength() < 0 && (!entity.isChunked() || protocolVersion.lessEquals(HttpVersion.HTTP_1_0))) {
                httpResponse.setHeader(C11086e.f35717j, "Close");
                return;
            }
        }
        HttpRequest m1345q = m1348b.m1345q();
        if (m1345q == null) {
            return;
        }
        Header firstHeader2 = m1345q.getFirstHeader(C11086e.f35717j);
        if (firstHeader2 != null) {
            httpResponse.setHeader(C11086e.f35717j, firstHeader2.getValue());
        } else if (!m1345q.getProtocolVersion().lessEquals(HttpVersion.HTTP_1_0)) {
        } else {
            httpResponse.setHeader(C11086e.f35717j, "Close");
        }
    }
}
