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
/* renamed from: org.a.a.i.f */
/* loaded from: classes2.dex */
public class C11279f implements AbstractC11082d<C11275e> {

    /* renamed from: a */
    public static final C11279f f36226a = new C11279f();

    /* renamed from: b */
    private final C11087a f36227b;

    /* renamed from: c */
    private final ContentLengthStrategy f36228c;

    /* renamed from: d */
    private final ContentLengthStrategy f36229d;

    /* renamed from: e */
    private final AbstractC11321b<HttpRequest> f36230e;

    /* renamed from: f */
    private final AbstractC11322c<HttpResponse> f36231f;

    public C11279f() {
        this(null, null, null, null, null);
    }

    public C11279f(C11087a c11087a) {
        this(c11087a, null, null, null, null);
    }

    public C11279f(C11087a c11087a, AbstractC11321b<HttpRequest> abstractC11321b, AbstractC11322c<HttpResponse> abstractC11322c) {
        this(c11087a, null, null, abstractC11321b, abstractC11322c);
    }

    public C11279f(C11087a c11087a, ContentLengthStrategy contentLengthStrategy, ContentLengthStrategy contentLengthStrategy2, AbstractC11321b<HttpRequest> abstractC11321b, AbstractC11322c<HttpResponse> abstractC11322c) {
        this.f36227b = c11087a == null ? C11087a.f35734a : c11087a;
        this.f36228c = contentLengthStrategy;
        this.f36229d = contentLengthStrategy2;
        this.f36230e = abstractC11321b;
        this.f36231f = abstractC11322c;
    }

    @Override // org.p286a.p287a.AbstractC11082d
    /* renamed from: b */
    public C11275e mo1534a(Socket socket) {
        C11275e c11275e = new C11275e(this.f36227b.m2068a(), this.f36227b.m2066b(), C11170b.m1806a(this.f36227b), C11170b.m1805b(this.f36227b), this.f36227b.m2062f(), this.f36228c, this.f36229d, this.f36230e, this.f36231f);
        c11275e.mo1537a(socket);
        return c11275e;
    }
}
