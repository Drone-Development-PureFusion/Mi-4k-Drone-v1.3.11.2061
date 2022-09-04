package org.p286a.p287a.p306i;

import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpMessage;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpServerConnection;
import org.apache.http.entity.ContentLengthStrategy;
import org.apache.http.io.HttpMessageParser;
import org.apache.http.io.HttpMessageWriter;
import org.p286a.p287a.p288a.AbstractC11009c;
import org.p286a.p287a.p298e.C11090c;
import org.p286a.p287a.p306i.p311e.C11276a;
import org.p286a.p287a.p306i.p313g.C11302h;
import org.p286a.p287a.p306i.p313g.C11308n;
import org.p286a.p287a.p315j.AbstractC11321b;
import org.p286a.p287a.p315j.AbstractC11322c;
import org.p286a.p287a.p320o.C11354a;
@AbstractC11009c
/* renamed from: org.a.a.i.e */
/* loaded from: classes2.dex */
public class C11275e extends C11149a implements HttpServerConnection {

    /* renamed from: a */
    private final HttpMessageParser f36218a;

    /* renamed from: b */
    private final HttpMessageWriter f36219b;

    public C11275e(int i) {
        this(i, i, null, null, null, null, null, null, null);
    }

    public C11275e(int i, int i2, CharsetDecoder charsetDecoder, CharsetEncoder charsetEncoder, C11090c c11090c, ContentLengthStrategy contentLengthStrategy, ContentLengthStrategy contentLengthStrategy2, AbstractC11321b<HttpRequest> abstractC11321b, AbstractC11322c<HttpResponse> abstractC11322c) {
        super(i, i2, charsetDecoder, charsetEncoder, c11090c, contentLengthStrategy != null ? contentLengthStrategy : C11276a.f36220a, contentLengthStrategy2);
        this.f36218a = (abstractC11321b == null ? C11302h.f36318a : abstractC11321b).mo1466a(e(), c11090c);
        this.f36219b = (abstractC11322c == null ? C11308n.f36328a : abstractC11322c).mo1465a(f());
    }

    public C11275e(int i, CharsetDecoder charsetDecoder, CharsetEncoder charsetEncoder, C11090c c11090c) {
        this(i, i, charsetDecoder, charsetEncoder, c11090c, null, null, null, null);
    }

    @Override // org.p286a.p287a.p306i.C11149a
    /* renamed from: a */
    public void mo1537a(Socket socket) {
        super.mo1537a(socket);
    }

    /* renamed from: a */
    protected void m1536a(HttpRequest httpRequest) {
    }

    /* renamed from: a */
    protected void m1535a(HttpResponse httpResponse) {
    }

    public void flush() {
        d();
        g();
    }

    public void receiveRequestEntity(HttpEntityEnclosingRequest httpEntityEnclosingRequest) {
        C11354a.m1321a(httpEntityEnclosingRequest, "HTTP request");
        d();
        httpEntityEnclosingRequest.setEntity(b((HttpMessage) httpEntityEnclosingRequest));
    }

    public HttpRequest receiveRequestHeader() {
        d();
        HttpRequest httpRequest = (HttpRequest) this.f36218a.parse();
        m1536a(httpRequest);
        h();
        return httpRequest;
    }

    public void sendResponseEntity(HttpResponse httpResponse) {
        C11354a.m1321a(httpResponse, "HTTP response");
        d();
        HttpEntity entity = httpResponse.getEntity();
        if (entity == null) {
            return;
        }
        OutputStream a = a((HttpMessage) httpResponse);
        entity.writeTo(a);
        a.close();
    }

    public void sendResponseHeader(HttpResponse httpResponse) {
        C11354a.m1321a(httpResponse, "HTTP response");
        d();
        this.f36219b.write(httpResponse);
        m1535a(httpResponse);
        if (httpResponse.getStatusLine().getStatusCode() >= 200) {
            i();
        }
    }
}
