package org.p286a.p287a.p306i.p313g;

import org.apache.http.HttpMessage;
import org.apache.http.HttpRequest;
import org.apache.http.io.SessionOutputBuffer;
import org.apache.http.message.LineFormatter;
import org.p286a.p287a.p288a.AbstractC11009c;
@AbstractC11009c
/* renamed from: org.a.a.i.g.i */
/* loaded from: classes2.dex */
public class C11303i extends AbstractC11296b<HttpRequest> {
    public C11303i(SessionOutputBuffer sessionOutputBuffer) {
        this(sessionOutputBuffer, null);
    }

    public C11303i(SessionOutputBuffer sessionOutputBuffer, LineFormatter lineFormatter) {
        super(sessionOutputBuffer, lineFormatter);
    }

    @Override // org.p286a.p287a.p306i.p313g.AbstractC11296b
    /* renamed from: a */
    protected void mo1494a(HttpMessage httpMessage) {
        this.f36289c.formatRequestLine(this.f36288b, ((HttpRequest) httpMessage).getRequestLine());
        this.f36287a.writeLine(this.f36288b);
    }
}
