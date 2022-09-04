package org.p328c.p329a.p332c;

import java.util.List;
import org.p328c.p347e.C11632j;
import org.p328c.p347e.p349b.C11608a;
import org.p328c.p347e.p349b.C11609b;
/* renamed from: org.c.a.c.a */
/* loaded from: classes2.dex */
class C11461a {

    /* renamed from: a */
    private final List<C11608a> f36571a;

    public C11461a(List<C11608a> list) {
        this.f36571a = list;
    }

    /* renamed from: a */
    public C11632j m1007a() {
        C11632j c11632j = new C11632j();
        C11609b m477g = c11632j.m477g();
        for (C11608a c11608a : this.f36571a) {
            try {
                m477g.mo476a(c11608a);
            } catch (Exception e) {
                throw new RuntimeException("I can't believe this happened");
            }
        }
        return c11632j;
    }
}
