package org.p286a.p287a.p306i;

import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import org.apache.http.HttpClientConnection;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpMessage;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.entity.ContentLengthStrategy;
import org.apache.http.io.HttpMessageParser;
import org.apache.http.io.HttpMessageWriter;
import org.p286a.p287a.p288a.AbstractC11009c;
import org.p286a.p287a.p298e.C11090c;
import org.p286a.p287a.p306i.p313g.C11304j;
import org.p286a.p287a.p306i.p313g.C11306l;
import org.p286a.p287a.p315j.AbstractC11321b;
import org.p286a.p287a.p315j.AbstractC11322c;
import org.p286a.p287a.p320o.C11354a;
@AbstractC11009c
/* renamed from: org.a.a.i.c */
/* loaded from: classes2.dex */
public class C11209c extends C11149a implements HttpClientConnection {

    /* renamed from: a */
    private final HttpMessageParser f36094a;

    /* renamed from: b */
    private final HttpMessageWriter f36095b;

    public C11209c(int i) {
        this(i, i, null, null, null, null, null, null, null);
    }

    public C11209c(int i, int i2, CharsetDecoder charsetDecoder, CharsetEncoder charsetEncoder, C11090c c11090c, ContentLengthStrategy contentLengthStrategy, ContentLengthStrategy contentLengthStrategy2, AbstractC11322c<HttpRequest> abstractC11322c, AbstractC11321b<HttpResponse> abstractC11321b) {
        super(i, i2, charsetDecoder, charsetEncoder, c11090c, contentLengthStrategy, contentLengthStrategy2);
        this.f36095b = (abstractC11322c == null ? C11304j.f36321a : abstractC11322c).mo1465a(f());
        this.f36094a = (abstractC11321b == null ? C11306l.f36325a : abstractC11321b).mo1466a(e(), c11090c);
    }

    public C11209c(int i, CharsetDecoder charsetDecoder, CharsetEncoder charsetEncoder, C11090c c11090c) {
        this(i, i, charsetDecoder, charsetEncoder, c11090c, null, null, null, null);
    }

    @Override // org.p286a.p287a.p306i.C11149a
    /* renamed from: a */
    public void mo1537a(Socket socket) {
        super.mo1537a(socket);
    }

    /* renamed from: a */
    protected void mo1624a(HttpRequest httpRequest) {
    }

    /* renamed from: a */
    protected void mo1623a(HttpResponse httpResponse) {
    }

    public void flush() {
        d();
        g();
    }

    public boolean isResponseAvailable(int i) {
        d();
        try {
            return a(i);
        } catch (SocketTimeoutException e) {
            return false;
        }
    }

    public void receiveResponseEntity(HttpResponse httpResponse) {
        C11354a.m1321a(httpResponse, "HTTP response");
        d();
        httpResponse.setEntity(b((HttpMessage) httpResponse));
    }

    public HttpResponse receiveResponseHeader() {
        d();
        HttpResponse httpResponse = (HttpResponse) this.f36094a.parse();
        mo1623a(httpResponse);
        if (httpResponse.getStatusLine().getStatusCode() >= 200) {
            i();
        }
        return httpResponse;
    }

    public void sendRequestEntity(HttpEntityEnclosingRequest httpEntityEnclosingRequest) {
        C11354a.m1321a(httpEntityEnclosingRequest, "HTTP request");
        d();
        HttpEntity entity = httpEntityEnclosingRequest.getEntity();
        if (entity == null) {
            return;
        }
        OutputStream a = a((HttpMessage) httpEntityEnclosingRequest);
        entity.writeTo(a);
        a.close();
    }

    public void sendRequestHeader(HttpRequest httpRequest) {
        C11354a.m1321a(httpRequest, "HTTP request");
        d();
        this.f36095b.write(httpRequest);
        mo1624a(httpRequest);
        h();
    }
}
