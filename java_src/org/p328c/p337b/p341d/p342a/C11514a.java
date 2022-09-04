package org.p328c.p337b.p341d.p342a;

import org.p328c.p337b.C11503b;
import org.p328c.p347e.C11622c;
import org.p328c.p347e.p349b.C11608a;
import org.p328c.p347e.p349b.C11611c;
import org.p328c.p350f.p351a.C11646f;
/* renamed from: org.c.b.d.a.a */
/* loaded from: classes.dex */
public class C11514a {

    /* renamed from: a */
    private final C11611c f36625a;

    /* renamed from: b */
    private final C11622c f36626b;

    public C11514a(C11611c c11611c, C11622c c11622c) {
        this.f36625a = c11611c;
        this.f36626b = c11622c;
    }

    /* renamed from: a */
    private void m885a(C11646f c11646f) {
        for (Throwable th : c11646f.m439a()) {
            m887a(th);
        }
    }

    /* renamed from: a */
    public void m888a() {
        this.f36625a.m556d(this.f36626b);
    }

    /* renamed from: a */
    public void m887a(Throwable th) {
        if (th instanceof C11646f) {
            m885a((C11646f) th);
        } else {
            this.f36625a.m568a(new C11608a(this.f36626b, th));
        }
    }

    /* renamed from: a */
    public void m886a(C11503b c11503b) {
        this.f36625a.m562b(new C11608a(this.f36626b, c11503b));
    }

    /* renamed from: b */
    public void m884b() {
        this.f36625a.m560b(this.f36626b);
    }

    /* renamed from: c */
    public void m883c() {
        this.f36625a.m558c(this.f36626b);
    }
}
