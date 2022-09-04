package org.p286a.p287a.p306i;

import org.apache.http.ConnectionReuseStrategy;
import org.apache.http.Header;
import org.apache.http.HeaderIterator;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.ParseException;
import org.apache.http.ProtocolVersion;
import org.apache.http.TokenIterator;
import org.apache.http.message.BasicTokenIterator;
import org.apache.http.protocol.HttpContext;
import org.p286a.p287a.C11086e;
import org.p286a.p287a.p288a.AbstractC11008b;
import org.p286a.p287a.p320o.C11354a;
@AbstractC11008b
/* renamed from: org.a.a.i.g */
/* loaded from: classes2.dex */
public class C11294g implements ConnectionReuseStrategy {

    /* renamed from: a */
    public static final C11294g f36278a = new C11294g();

    /* renamed from: a */
    private boolean m1508a(HttpResponse httpResponse) {
        int statusCode = httpResponse.getStatusLine().getStatusCode();
        return (statusCode < 200 || statusCode == 204 || statusCode == 304 || statusCode == 205) ? false : true;
    }

    /* renamed from: a */
    protected TokenIterator m1509a(HeaderIterator headerIterator) {
        return new BasicTokenIterator(headerIterator);
    }

    public boolean keepAlive(HttpResponse httpResponse, HttpContext httpContext) {
        boolean z = true;
        C11354a.m1321a(httpResponse, "HTTP response");
        C11354a.m1321a(httpContext, "HTTP context");
        ProtocolVersion protocolVersion = httpResponse.getStatusLine().getProtocolVersion();
        Header firstHeader = httpResponse.getFirstHeader(C11086e.f35701W);
        if (firstHeader != null) {
            if (!"chunked".equalsIgnoreCase(firstHeader.getValue())) {
                return false;
            }
        } else if (m1508a(httpResponse)) {
            Header[] headers = httpResponse.getHeaders("Content-Length");
            if (headers.length != 1) {
                return false;
            }
            try {
                if (Integer.parseInt(headers[0].getValue()) < 0) {
                    return false;
                }
            } catch (NumberFormatException e) {
                return false;
            }
        }
        HeaderIterator headerIterator = httpResponse.headerIterator(C11086e.f35717j);
        if (!headerIterator.hasNext()) {
            headerIterator = httpResponse.headerIterator("Proxy-Connection");
        }
        if (headerIterator.hasNext()) {
            try {
                TokenIterator m1509a = m1509a(headerIterator);
                boolean z2 = false;
                while (m1509a.hasNext()) {
                    String nextToken = m1509a.nextToken();
                    if ("Close".equalsIgnoreCase(nextToken)) {
                        return false;
                    }
                    if ("Keep-Alive".equalsIgnoreCase(nextToken)) {
                        z2 = true;
                    }
                }
                if (z2) {
                    return true;
                }
            } catch (ParseException e2) {
                return false;
            }
        }
        if (protocolVersion.lessEquals(HttpVersion.HTTP_1_0)) {
            z = false;
        }
        return z;
    }
}
