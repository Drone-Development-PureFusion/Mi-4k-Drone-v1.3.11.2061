package org.p286a.p287a.p306i.p309c;

import android.util.Log;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseFactory;
import org.apache.http.NoHttpResponseException;
import org.apache.http.ProtocolException;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.message.LineParser;
import org.apache.http.message.ParserCursor;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.CharArrayBuffer;
import org.p286a.p287a.p288a.AbstractC11009c;
import org.p286a.p287a.p298e.C11090c;
import org.p286a.p287a.p306i.C11317i;
import org.p286a.p287a.p306i.p313g.AbstractC11295a;
import org.p286a.p287a.p320o.C11354a;
@AbstractC11009c
/* renamed from: org.a.a.i.c.f */
/* loaded from: classes.dex */
public class C11216f extends AbstractC11295a<HttpResponse> {

    /* renamed from: b */
    private static final String f36117b = "HttpClient";

    /* renamed from: c */
    private final HttpResponseFactory f36118c;

    /* renamed from: d */
    private final CharArrayBuffer f36119d;

    public C11216f(SessionInputBuffer sessionInputBuffer) {
        this(sessionInputBuffer, (LineParser) null, (HttpResponseFactory) null, C11090c.f35747a);
    }

    public C11216f(SessionInputBuffer sessionInputBuffer, C11090c c11090c) {
        this(sessionInputBuffer, (LineParser) null, (HttpResponseFactory) null, c11090c);
    }

    public C11216f(SessionInputBuffer sessionInputBuffer, LineParser lineParser, HttpResponseFactory httpResponseFactory, C11090c c11090c) {
        super(sessionInputBuffer, lineParser, c11090c);
        this.f36118c = httpResponseFactory == null ? C11317i.f36361a : httpResponseFactory;
        this.f36119d = new CharArrayBuffer(128);
    }

    @Deprecated
    public C11216f(SessionInputBuffer sessionInputBuffer, LineParser lineParser, HttpResponseFactory httpResponseFactory, HttpParams httpParams) {
        super(sessionInputBuffer, lineParser, httpParams);
        C11354a.m1321a(httpResponseFactory, "Response factory");
        this.f36118c = httpResponseFactory;
        this.f36119d = new CharArrayBuffer(128);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.p286a.p287a.p306i.p313g.AbstractC11295a
    /* renamed from: a */
    public HttpResponse mo1495b(SessionInputBuffer sessionInputBuffer) {
        int i = 0;
        while (true) {
            this.f36119d.clear();
            int readLine = sessionInputBuffer.readLine(this.f36119d);
            if (readLine == -1 && i == 0) {
                throw new NoHttpResponseException("The target server failed to respond");
            }
            ParserCursor parserCursor = new ParserCursor(0, this.f36119d.length());
            if (this.f36281a.hasProtocolVersion(this.f36119d, parserCursor)) {
                return this.f36118c.newHttpResponse(this.f36281a.parseStatusLine(this.f36119d, parserCursor), (HttpContext) null);
            } else if (readLine == -1 || m1634a(this.f36119d, i)) {
                break;
            } else {
                if (Log.isLoggable(f36117b, 3)) {
                    Log.d(f36117b, "Garbage in response: " + this.f36119d.toString());
                }
                i++;
            }
        }
        throw new ProtocolException("The server failed to respond with a valid HTTP response");
    }

    /* renamed from: a */
    protected boolean m1634a(CharArrayBuffer charArrayBuffer, int i) {
        return false;
    }
}
