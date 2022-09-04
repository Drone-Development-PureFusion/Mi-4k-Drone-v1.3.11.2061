package org.p286a.p287a.p306i.p313g;

import org.apache.http.HttpRequest;
import org.apache.http.io.HttpMessageWriter;
import org.apache.http.io.SessionOutputBuffer;
import org.apache.http.message.LineFormatter;
import org.p286a.p287a.p288a.AbstractC11008b;
import org.p286a.p287a.p315j.AbstractC11322c;
import org.p286a.p287a.p316k.C11325c;
@AbstractC11008b
/* renamed from: org.a.a.i.g.j */
/* loaded from: classes2.dex */
public class C11304j implements AbstractC11322c<HttpRequest> {

    /* renamed from: a */
    public static final C11304j f36321a = new C11304j();

    /* renamed from: b */
    private final LineFormatter f36322b;

    public C11304j() {
        this(null);
    }

    public C11304j(LineFormatter lineFormatter) {
        this.f36322b = lineFormatter == null ? C11325c.f36376b : lineFormatter;
    }

    @Override // org.p286a.p287a.p315j.AbstractC11322c
    /* renamed from: a */
    public HttpMessageWriter mo1465a(SessionOutputBuffer sessionOutputBuffer) {
        return new C11303i(sessionOutputBuffer, this.f36322b);
    }
}
