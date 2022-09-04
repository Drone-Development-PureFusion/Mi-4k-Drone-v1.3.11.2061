package org.p325b.p326a;

import org.p325b.AbstractC11415b;
import org.p325b.AbstractC11428g;
import org.p325b.AbstractC11431i;
import org.p325b.AbstractC11433k;
import org.p325b.AbstractC11435m;
/* renamed from: org.b.a.k */
/* loaded from: classes.dex */
public class C11407k<T> extends AbstractC11415b<T> {

    /* renamed from: a */
    private final AbstractC11433k<T> f36525a;

    public C11407k(AbstractC11433k<T> abstractC11433k) {
        this.f36525a = abstractC11433k;
    }

    @AbstractC11431i
    /* renamed from: a */
    public static <T> AbstractC11433k<T> m1157a(AbstractC11433k<T> abstractC11433k) {
        return new C11407k(abstractC11433k);
    }

    @AbstractC11431i
    /* renamed from: b */
    public static <T> AbstractC11433k<T> m1156b(T t) {
        return m1157a(C11405i.m1165b(t));
    }

    @Override // org.p325b.AbstractC11435m
    /* renamed from: a */
    public void mo905a(AbstractC11428g abstractC11428g) {
        abstractC11428g.mo1086a("not ").mo1083a((AbstractC11435m) this.f36525a);
    }

    @Override // org.p325b.AbstractC11433k
    /* renamed from: a */
    public boolean mo900a(Object obj) {
        return !this.f36525a.mo900a(obj);
    }
}
