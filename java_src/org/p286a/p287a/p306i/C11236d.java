package org.p286a.p287a.p306i;

import java.net.Socket;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.entity.ContentLengthStrategy;
import org.p286a.p287a.AbstractC11082d;
import org.p286a.p287a.p288a.AbstractC11008b;
import org.p286a.p287a.p298e.C11087a;
import org.p286a.p287a.p315j.AbstractC11321b;
import org.p286a.p287a.p315j.AbstractC11322c;
@AbstractC11008b
/* renamed from: org.a.a.i.d */
/* loaded from: classes2.dex */
public class C11236d implements AbstractC11082d<C11209c> {

    /* renamed from: a */
    public static final C11236d f36165a = new C11236d();

    /* renamed from: b */
    private final C11087a f36166b;

    /* renamed from: c */
    private final ContentLengthStrategy f36167c;

    /* renamed from: d */
    private final ContentLengthStrategy f36168d;

    /* renamed from: e */
    private final AbstractC11322c<HttpRequest> f36169e;

    /* renamed from: f */
    private final AbstractC11321b<HttpResponse> f36170f;

    public C11236d() {
        this(null, null, null, null, null);
    }

    public C11236d(C11087a c11087a) {
        this(c11087a, null, null, null, null);
    }

    public C11236d(C11087a c11087a, AbstractC11322c<HttpRequest> abstractC11322c, AbstractC11321b<HttpResponse> abstractC11321b) {
        this(c11087a, null, null, abstractC11322c, abstractC11321b);
    }

    public C11236d(C11087a c11087a, ContentLengthStrategy contentLengthStrategy, ContentLengthStrategy contentLengthStrategy2, AbstractC11322c<HttpRequest> abstractC11322c, AbstractC11321b<HttpResponse> abstractC11321b) {
        this.f36166b = c11087a == null ? C11087a.f35734a : c11087a;
        this.f36167c = contentLengthStrategy;
        this.f36168d = contentLengthStrategy2;
        this.f36169e = abstractC11322c;
        this.f36170f = abstractC11321b;
    }

    @Override // org.p286a.p287a.AbstractC11082d
    /* renamed from: b */
    public C11209c mo1534a(Socket socket) {
        C11209c c11209c = new C11209c(this.f36166b.m2068a(), this.f36166b.m2066b(), C11170b.m1806a(this.f36166b), C11170b.m1805b(this.f36166b), this.f36166b.m2062f(), this.f36167c, this.f36168d, this.f36169e, this.f36170f);
        c11209c.mo1537a(socket);
        return c11209c;
    }
}
