package org.p286a.p287a.p306i;

import java.util.Locale;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseFactory;
import org.apache.http.ProtocolVersion;
import org.apache.http.ReasonPhraseCatalog;
import org.apache.http.StatusLine;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;
import org.apache.http.protocol.HttpContext;
import org.p286a.p287a.p288a.AbstractC11008b;
import org.p286a.p287a.p320o.C11354a;
@AbstractC11008b
/* renamed from: org.a.a.i.i */
/* loaded from: classes2.dex */
public class C11317i implements HttpResponseFactory {

    /* renamed from: a */
    public static final C11317i f36361a = new C11317i();

    /* renamed from: b */
    protected final ReasonPhraseCatalog f36362b;

    public C11317i() {
        this(C11318j.f36363a);
    }

    public C11317i(ReasonPhraseCatalog reasonPhraseCatalog) {
        this.f36362b = (ReasonPhraseCatalog) C11354a.m1321a(reasonPhraseCatalog, "Reason phrase catalog");
    }

    /* renamed from: a */
    protected Locale m1471a(HttpContext httpContext) {
        return Locale.getDefault();
    }

    public HttpResponse newHttpResponse(ProtocolVersion protocolVersion, int i, HttpContext httpContext) {
        C11354a.m1321a(protocolVersion, "HTTP version");
        Locale m1471a = m1471a(httpContext);
        return new BasicHttpResponse(new BasicStatusLine(protocolVersion, i, this.f36362b.getReason(i, m1471a)), this.f36362b, m1471a);
    }

    public HttpResponse newHttpResponse(StatusLine statusLine, HttpContext httpContext) {
        C11354a.m1321a(statusLine, "Status line");
        return new BasicHttpResponse(statusLine, this.f36362b, m1471a(httpContext));
    }
}
