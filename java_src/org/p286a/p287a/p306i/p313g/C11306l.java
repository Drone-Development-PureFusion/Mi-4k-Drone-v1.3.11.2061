package org.p286a.p287a.p306i.p313g;

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
/* renamed from: org.a.a.i.g.l */
/* loaded from: classes2.dex */
public class C11306l implements AbstractC11321b<HttpResponse> {

    /* renamed from: a */
    public static final C11306l f36325a = new C11306l();

    /* renamed from: b */
    private final LineParser f36326b;

    /* renamed from: c */
    private final HttpResponseFactory f36327c;

    public C11306l() {
        this(null, null);
    }

    public C11306l(LineParser lineParser, HttpResponseFactory httpResponseFactory) {
        this.f36326b = lineParser == null ? C11326d.f36378b : lineParser;
        this.f36327c = httpResponseFactory == null ? C11317i.f36361a : httpResponseFactory;
    }

    @Override // org.p286a.p287a.p315j.AbstractC11321b
    /* renamed from: a */
    public HttpMessageParser mo1466a(SessionInputBuffer sessionInputBuffer, C11090c c11090c) {
        return new C11305k(sessionInputBuffer, this.f36326b, this.f36327c, c11090c);
    }
}
