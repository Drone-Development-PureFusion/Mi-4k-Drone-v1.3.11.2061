package org.p325b.p326a;

import org.p325b.AbstractC11415b;
import org.p325b.AbstractC11428g;
import org.p325b.AbstractC11431i;
import org.p325b.AbstractC11433k;
/* renamed from: org.b.a.m */
/* loaded from: classes.dex */
public class C11409m<T> extends AbstractC11415b<T> {

    /* renamed from: a */
    private final T f36526a;

    public C11409m(T t) {
        this.f36526a = t;
    }

    @AbstractC11431i
    /* renamed from: b */
    public static <T> AbstractC11433k<T> m1151b(T t) {
        return new C11409m(t);
    }

    @AbstractC11431i
    /* renamed from: c */
    public static <T> AbstractC11433k<T> m1150c(T t) {
        return new C11409m(t);
    }

    @Override // org.p325b.AbstractC11435m
    /* renamed from: a */
    public void mo905a(AbstractC11428g abstractC11428g) {
        abstractC11428g.mo1086a("sameInstance(").mo1087a(this.f36526a).mo1086a(")");
    }

    @Override // org.p325b.AbstractC11433k
    /* renamed from: a */
    public boolean mo900a(Object obj) {
        return obj == this.f36526a;
    }
}
