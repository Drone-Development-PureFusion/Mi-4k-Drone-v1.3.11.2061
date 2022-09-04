package org.p286a.p287a.p306i.p313g;

import org.apache.http.HeaderIterator;
import org.apache.http.HttpMessage;
import org.apache.http.io.HttpMessageWriter;
import org.apache.http.io.SessionOutputBuffer;
import org.apache.http.message.LineFormatter;
import org.apache.http.params.HttpParams;
import org.apache.http.util.CharArrayBuffer;
import org.p286a.p287a.p288a.AbstractC11009c;
import org.p286a.p287a.p316k.C11325c;
import org.p286a.p287a.p320o.C11354a;
@AbstractC11009c
/* renamed from: org.a.a.i.g.b */
/* loaded from: classes.dex */
public abstract class AbstractC11296b<T extends HttpMessage> implements HttpMessageWriter {

    /* renamed from: a */
    protected final SessionOutputBuffer f36287a;

    /* renamed from: b */
    protected final CharArrayBuffer f36288b;

    /* renamed from: c */
    protected final LineFormatter f36289c;

    public AbstractC11296b(SessionOutputBuffer sessionOutputBuffer, LineFormatter lineFormatter) {
        this.f36287a = (SessionOutputBuffer) C11354a.m1321a(sessionOutputBuffer, "Session input buffer");
        this.f36289c = lineFormatter == null ? C11325c.f36376b : lineFormatter;
        this.f36288b = new CharArrayBuffer(128);
    }

    @Deprecated
    public AbstractC11296b(SessionOutputBuffer sessionOutputBuffer, LineFormatter lineFormatter, HttpParams httpParams) {
        C11354a.m1321a(sessionOutputBuffer, "Session input buffer");
        this.f36287a = sessionOutputBuffer;
        this.f36288b = new CharArrayBuffer(128);
        this.f36289c = lineFormatter == null ? C11325c.f36376b : lineFormatter;
    }

    /* renamed from: a */
    protected abstract void mo1494a(HttpMessage httpMessage);

    public void write(HttpMessage httpMessage) {
        C11354a.m1321a(httpMessage, "HTTP message");
        mo1494a(httpMessage);
        HeaderIterator headerIterator = httpMessage.headerIterator();
        while (headerIterator.hasNext()) {
            this.f36287a.writeLine(this.f36289c.formatHeader(this.f36288b, headerIterator.nextHeader()));
        }
        this.f36288b.clear();
        this.f36287a.writeLine(this.f36288b);
    }
}
