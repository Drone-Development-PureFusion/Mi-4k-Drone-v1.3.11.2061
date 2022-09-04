package org.p286a.p287a.p306i.p309c;

import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseFactory;
import org.apache.http.io.HttpMessageParser;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.message.LineParser;
import org.p286a.p287a.p288a.AbstractC11008b;
import org.p286a.p287a.p298e.C11090c;
import org.p286a.p287a.p306i.C11317i;
import org.p286a.p287a.p315j.AbstractC11321b;
import org.p286a.p287a.p316k.C11326d;
@AbstractC11008b
/* renamed from: org.a.a.i.c.g */
/* loaded from: classes2.dex */
public class C11217g implements AbstractC11321b<HttpResponse> {

    /* renamed from: a */
    public static final C11217g f36120a = new C11217g();

    /* renamed from: b */
    private final LineParser f36121b;

    /* renamed from: c */
    private final HttpResponseFactory f36122c;

    public C11217g() {
        this(null, null);
    }

    public C11217g(HttpResponseFactory httpResponseFactory) {
        this(null, httpResponseFactory);
    }

    public C11217g(LineParser lineParser, HttpResponseFactory httpResponseFactory) {
        this.f36121b = lineParser == null ? C11326d.f36378b : lineParser;
        this.f36122c = httpResponseFactory == null ? C11317i.f36361a : httpResponseFactory;
    }

    @Override // org.p286a.p287a.p315j.AbstractC11321b
    /* renamed from: a */
    public HttpMessageParser mo1466a(SessionInputBuffer sessionInputBuffer, C11090c c11090c) {
        return new C11216f(sessionInputBuffer, this.f36121b, this.f36122c, c11090c);
    }
}
