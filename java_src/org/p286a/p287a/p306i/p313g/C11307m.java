package org.p286a.p287a.p306i.p313g;

import org.apache.http.HttpMessage;
import org.apache.http.HttpResponse;
import org.apache.http.io.SessionOutputBuffer;
import org.apache.http.message.LineFormatter;
import org.p286a.p287a.p288a.AbstractC11009c;
@AbstractC11009c
/* renamed from: org.a.a.i.g.m */
/* loaded from: classes2.dex */
public class C11307m extends AbstractC11296b<HttpResponse> {
    public C11307m(SessionOutputBuffer sessionOutputBuffer) {
        super(sessionOutputBuffer, null);
    }

    public C11307m(SessionOutputBuffer sessionOutputBuffer, LineFormatter lineFormatter) {
        super(sessionOutputBuffer, lineFormatter);
    }

    @Override // org.p286a.p287a.p306i.p313g.AbstractC11296b
    /* renamed from: a */
    protected void mo1494a(HttpMessage httpMessage) {
        this.f36289c.formatStatusLine(this.f36288b, ((HttpResponse) httpMessage).getStatusLine());
        this.f36287a.writeLine(this.f36288b);
    }
}
