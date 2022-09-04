package org.p325b.p326a;

import org.p325b.AbstractC11415b;
import org.p325b.AbstractC11428g;
import org.p325b.AbstractC11431i;
import org.p325b.AbstractC11433k;
/* renamed from: org.b.a.l */
/* loaded from: classes.dex */
public class C11408l<T> extends AbstractC11415b<T> {
    @AbstractC11431i
    /* renamed from: a */
    public static <T> AbstractC11433k<T> m1155a(Class<T> cls) {
        return new C11408l();
    }

    @AbstractC11431i
    /* renamed from: b */
    public static AbstractC11433k<Object> m1154b() {
        return new C11408l();
    }

    @AbstractC11431i
    /* renamed from: b */
    public static <T> AbstractC11433k<T> m1153b(Class<T> cls) {
        return C11407k.m1157a(m1155a((Class) cls));
    }

    @AbstractC11431i
    /* renamed from: c */
    public static AbstractC11433k<Object> m1152c() {
        return C11407k.m1157a((AbstractC11433k) m1154b());
    }

    @Override // org.p325b.AbstractC11435m
    /* renamed from: a */
    public void mo905a(AbstractC11428g abstractC11428g) {
        abstractC11428g.mo1086a("null");
    }

    @Override // org.p325b.AbstractC11433k
    /* renamed from: a */
    public boolean mo900a(Object obj) {
        return obj == null;
    }
}
