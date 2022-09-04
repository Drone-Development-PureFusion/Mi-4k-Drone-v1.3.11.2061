package org.p286a.p287a.p306i.p313g;

import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestFactory;
import org.apache.http.io.HttpMessageParser;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.message.LineParser;
import org.p286a.p287a.p288a.AbstractC11008b;
import org.p286a.p287a.p298e.C11090c;
import org.p286a.p287a.p306i.C11313h;
import org.p286a.p287a.p315j.AbstractC11321b;
import org.p286a.p287a.p316k.C11326d;
@AbstractC11008b
/* renamed from: org.a.a.i.g.h */
/* loaded from: classes2.dex */
public class C11302h implements AbstractC11321b<HttpRequest> {

    /* renamed from: a */
    public static final C11302h f36318a = new C11302h();

    /* renamed from: b */
    private final LineParser f36319b;

    /* renamed from: c */
    private final HttpRequestFactory f36320c;

    public C11302h() {
        this(null, null);
    }

    public C11302h(LineParser lineParser, HttpRequestFactory httpRequestFactory) {
        this.f36319b = lineParser == null ? C11326d.f36378b : lineParser;
        this.f36320c = httpRequestFactory == null ? C11313h.f36351a : httpRequestFactory;
    }

    @Override // org.p286a.p287a.p315j.AbstractC11321b
    /* renamed from: a */
    public HttpMessageParser mo1466a(SessionInputBuffer sessionInputBuffer, C11090c c11090c) {
        return new C11301g(sessionInputBuffer, this.f36319b, this.f36320c, c11090c);
    }
}
