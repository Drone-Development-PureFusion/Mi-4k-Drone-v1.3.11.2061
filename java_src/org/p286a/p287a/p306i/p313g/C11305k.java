package org.p286a.p287a.p306i.p313g;

import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseFactory;
import org.apache.http.NoHttpResponseException;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.message.LineParser;
import org.apache.http.message.ParserCursor;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.CharArrayBuffer;
import org.p286a.p287a.p288a.AbstractC11009c;
import org.p286a.p287a.p298e.C11090c;
import org.p286a.p287a.p306i.C11317i;
import org.p286a.p287a.p320o.C11354a;
@AbstractC11009c
/* renamed from: org.a.a.i.g.k */
/* loaded from: classes.dex */
public class C11305k extends AbstractC11295a<HttpResponse> {

    /* renamed from: b */
    private final HttpResponseFactory f36323b;

    /* renamed from: c */
    private final CharArrayBuffer f36324c;

    public C11305k(SessionInputBuffer sessionInputBuffer) {
        this(sessionInputBuffer, (LineParser) null, (HttpResponseFactory) null, C11090c.f35747a);
    }

    public C11305k(SessionInputBuffer sessionInputBuffer, C11090c c11090c) {
        this(sessionInputBuffer, (LineParser) null, (HttpResponseFactory) null, c11090c);
    }

    public C11305k(SessionInputBuffer sessionInputBuffer, LineParser lineParser, HttpResponseFactory httpResponseFactory, C11090c c11090c) {
        super(sessionInputBuffer, lineParser, c11090c);
        this.f36323b = httpResponseFactory == null ? C11317i.f36361a : httpResponseFactory;
        this.f36324c = new CharArrayBuffer(128);
    }

    @Deprecated
    public C11305k(SessionInputBuffer sessionInputBuffer, LineParser lineParser, HttpResponseFactory httpResponseFactory, HttpParams httpParams) {
        super(sessionInputBuffer, lineParser, httpParams);
        this.f36323b = (HttpResponseFactory) C11354a.m1321a(httpResponseFactory, "Response factory");
        this.f36324c = new CharArrayBuffer(128);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.p286a.p287a.p306i.p313g.AbstractC11295a
    /* renamed from: a */
    public HttpResponse mo1495b(SessionInputBuffer sessionInputBuffer) {
        this.f36324c.clear();
        if (sessionInputBuffer.readLine(this.f36324c) == -1) {
            throw new NoHttpResponseException("The target server failed to respond");
        }
        return this.f36323b.newHttpResponse(this.f36281a.parseStatusLine(this.f36324c, new ParserCursor(0, this.f36324c.length())), (HttpContext) null);
    }
}
