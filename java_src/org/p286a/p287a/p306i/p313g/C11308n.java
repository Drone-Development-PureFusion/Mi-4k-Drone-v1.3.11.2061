package org.p286a.p287a.p306i.p313g;

import org.apache.http.HttpResponse;
import org.apache.http.io.HttpMessageWriter;
import org.apache.http.io.SessionOutputBuffer;
import org.apache.http.message.LineFormatter;
import org.p286a.p287a.p288a.AbstractC11008b;
import org.p286a.p287a.p315j.AbstractC11322c;
import org.p286a.p287a.p316k.C11325c;
@AbstractC11008b
/* renamed from: org.a.a.i.g.n */
/* loaded from: classes2.dex */
public class C11308n implements AbstractC11322c<HttpResponse> {

    /* renamed from: a */
    public static final C11308n f36328a = new C11308n();

    /* renamed from: b */
    private final LineFormatter f36329b;

    public C11308n() {
        this(null);
    }

    public C11308n(LineFormatter lineFormatter) {
        this.f36329b = lineFormatter == null ? C11325c.f36376b : lineFormatter;
    }

    @Override // org.p286a.p287a.p315j.AbstractC11322c
    /* renamed from: a */
    public HttpMessageWriter mo1465a(SessionOutputBuffer sessionOutputBuffer) {
        return new C11307m(sessionOutputBuffer, this.f36329b);
    }
}
