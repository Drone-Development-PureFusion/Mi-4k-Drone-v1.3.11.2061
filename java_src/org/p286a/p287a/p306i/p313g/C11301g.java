package org.p286a.p287a.p306i.p313g;

import org.apache.http.ConnectionClosedException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestFactory;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.message.LineParser;
import org.apache.http.message.ParserCursor;
import org.apache.http.params.HttpParams;
import org.apache.http.util.CharArrayBuffer;
import org.p286a.p287a.p288a.AbstractC11009c;
import org.p286a.p287a.p298e.C11090c;
import org.p286a.p287a.p306i.C11313h;
import org.p286a.p287a.p320o.C11354a;
@AbstractC11009c
/* renamed from: org.a.a.i.g.g */
/* loaded from: classes.dex */
public class C11301g extends AbstractC11295a<HttpRequest> {

    /* renamed from: b */
    private final HttpRequestFactory f36316b;

    /* renamed from: c */
    private final CharArrayBuffer f36317c;

    public C11301g(SessionInputBuffer sessionInputBuffer) {
        this(sessionInputBuffer, (LineParser) null, (HttpRequestFactory) null, C11090c.f35747a);
    }

    public C11301g(SessionInputBuffer sessionInputBuffer, C11090c c11090c) {
        this(sessionInputBuffer, (LineParser) null, (HttpRequestFactory) null, c11090c);
    }

    public C11301g(SessionInputBuffer sessionInputBuffer, LineParser lineParser, HttpRequestFactory httpRequestFactory, C11090c c11090c) {
        super(sessionInputBuffer, lineParser, c11090c);
        this.f36316b = httpRequestFactory == null ? C11313h.f36351a : httpRequestFactory;
        this.f36317c = new CharArrayBuffer(128);
    }

    @Deprecated
    public C11301g(SessionInputBuffer sessionInputBuffer, LineParser lineParser, HttpRequestFactory httpRequestFactory, HttpParams httpParams) {
        super(sessionInputBuffer, lineParser, httpParams);
        this.f36316b = (HttpRequestFactory) C11354a.m1321a(httpRequestFactory, "Request factory");
        this.f36317c = new CharArrayBuffer(128);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.p286a.p287a.p306i.p313g.AbstractC11295a
    /* renamed from: a */
    public HttpRequest mo1495b(SessionInputBuffer sessionInputBuffer) {
        this.f36317c.clear();
        if (sessionInputBuffer.readLine(this.f36317c) == -1) {
            throw new ConnectionClosedException("Client closed connection");
        }
        return this.f36316b.newHttpRequest(this.f36281a.parseRequestLine(this.f36317c, new ParserCursor(0, this.f36317c.length())));
    }
}
