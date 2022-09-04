package org.p325b.p326a;

import org.p325b.AbstractC11415b;
import org.p325b.AbstractC11428g;
import org.p325b.AbstractC11431i;
import org.p325b.AbstractC11433k;
import org.p325b.AbstractC11435m;
/* renamed from: org.b.a.f */
/* loaded from: classes.dex */
public class C11402f<T> extends AbstractC11415b<T> {

    /* renamed from: a */
    private final AbstractC11433k<T> f36519a;

    public C11402f(AbstractC11433k<T> abstractC11433k) {
        this.f36519a = abstractC11433k;
    }

    @AbstractC11431i
    @Deprecated
    /* renamed from: a */
    public static <T> AbstractC11433k<T> m1177a(Class<T> cls) {
        return m1176a(C11406j.m1160a((Class<?>) cls));
    }

    @AbstractC11431i
    /* renamed from: a */
    public static <T> AbstractC11433k<T> m1176a(AbstractC11433k<T> abstractC11433k) {
        return new C11402f(abstractC11433k);
    }

    @AbstractC11431i
    /* renamed from: b */
    public static <T> AbstractC11433k<T> m1175b(Class<T> cls) {
        return m1176a(C11406j.m1160a((Class<?>) cls));
    }

    @AbstractC11431i
    /* renamed from: b */
    public static <T> AbstractC11433k<T> m1174b(T t) {
        return m1176a(C11405i.m1165b(t));
    }

    @Override // org.p325b.AbstractC11415b, org.p325b.AbstractC11433k
    /* renamed from: a */
    public void mo1070a(Object obj, AbstractC11428g abstractC11428g) {
        this.f36519a.mo1070a(obj, abstractC11428g);
    }

    @Override // org.p325b.AbstractC11435m
    /* renamed from: a */
    public void mo905a(AbstractC11428g abstractC11428g) {
        abstractC11428g.mo1086a("is ").mo1083a((AbstractC11435m) this.f36519a);
    }

    @Override // org.p325b.AbstractC11433k
    /* renamed from: a */
    public boolean mo900a(Object obj) {
        return this.f36519a.mo900a(obj);
    }
}
