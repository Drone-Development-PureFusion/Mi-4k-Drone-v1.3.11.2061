package org.p325b.p326a;

import java.util.ArrayList;
import java.util.Arrays;
import org.p325b.AbstractC11428g;
import org.p325b.AbstractC11430h;
import org.p325b.AbstractC11431i;
import org.p325b.AbstractC11433k;
import org.p325b.AbstractC11435m;
/* renamed from: org.b.a.a */
/* loaded from: classes.dex */
public class C11395a<T> extends AbstractC11430h<T> {

    /* renamed from: a */
    private final Iterable<AbstractC11433k<? super T>> f36510a;

    public C11395a(Iterable<AbstractC11433k<? super T>> iterable) {
        this.f36510a = iterable;
    }

    @AbstractC11431i
    /* renamed from: a */
    public static <T> AbstractC11433k<T> m1201a(Iterable<AbstractC11433k<? super T>> iterable) {
        return new C11395a(iterable);
    }

    @AbstractC11431i
    /* renamed from: a */
    public static <T> AbstractC11433k<T> m1200a(AbstractC11433k<? super T> abstractC11433k, AbstractC11433k<? super T> abstractC11433k2) {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(abstractC11433k);
        arrayList.add(abstractC11433k2);
        return m1201a((Iterable) arrayList);
    }

    @AbstractC11431i
    /* renamed from: a */
    public static <T> AbstractC11433k<T> m1199a(AbstractC11433k<? super T> abstractC11433k, AbstractC11433k<? super T> abstractC11433k2, AbstractC11433k<? super T> abstractC11433k3) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(abstractC11433k);
        arrayList.add(abstractC11433k2);
        arrayList.add(abstractC11433k3);
        return m1201a((Iterable) arrayList);
    }

    @AbstractC11431i
    /* renamed from: a */
    public static <T> AbstractC11433k<T> m1198a(AbstractC11433k<? super T> abstractC11433k, AbstractC11433k<? super T> abstractC11433k2, AbstractC11433k<? super T> abstractC11433k3, AbstractC11433k<? super T> abstractC11433k4) {
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(abstractC11433k);
        arrayList.add(abstractC11433k2);
        arrayList.add(abstractC11433k3);
        arrayList.add(abstractC11433k4);
        return m1201a((Iterable) arrayList);
    }

    @AbstractC11431i
    /* renamed from: a */
    public static <T> AbstractC11433k<T> m1197a(AbstractC11433k<? super T> abstractC11433k, AbstractC11433k<? super T> abstractC11433k2, AbstractC11433k<? super T> abstractC11433k3, AbstractC11433k<? super T> abstractC11433k4, AbstractC11433k<? super T> abstractC11433k5) {
        ArrayList arrayList = new ArrayList(5);
        arrayList.add(abstractC11433k);
        arrayList.add(abstractC11433k2);
        arrayList.add(abstractC11433k3);
        arrayList.add(abstractC11433k4);
        arrayList.add(abstractC11433k5);
        return m1201a((Iterable) arrayList);
    }

    @AbstractC11431i
    /* renamed from: a */
    public static <T> AbstractC11433k<T> m1196a(AbstractC11433k<? super T> abstractC11433k, AbstractC11433k<? super T> abstractC11433k2, AbstractC11433k<? super T> abstractC11433k3, AbstractC11433k<? super T> abstractC11433k4, AbstractC11433k<? super T> abstractC11433k5, AbstractC11433k<? super T> abstractC11433k6) {
        ArrayList arrayList = new ArrayList(6);
        arrayList.add(abstractC11433k);
        arrayList.add(abstractC11433k2);
        arrayList.add(abstractC11433k3);
        arrayList.add(abstractC11433k4);
        arrayList.add(abstractC11433k5);
        arrayList.add(abstractC11433k6);
        return m1201a((Iterable) arrayList);
    }

    @AbstractC11431i
    /* renamed from: a */
    public static <T> AbstractC11433k<T> m1195a(AbstractC11433k<? super T>... abstractC11433kArr) {
        return m1201a((Iterable) Arrays.asList(abstractC11433kArr));
    }

    @Override // org.p325b.AbstractC11435m
    /* renamed from: a */
    public void mo905a(AbstractC11428g abstractC11428g) {
        abstractC11428g.mo1082b("(", " and ", ")", this.f36510a);
    }

    @Override // org.p325b.AbstractC11430h
    /* renamed from: b */
    public boolean mo1081b(Object obj, AbstractC11428g abstractC11428g) {
        for (AbstractC11433k<? super T> abstractC11433k : this.f36510a) {
            if (!abstractC11433k.mo900a(obj)) {
                abstractC11428g.mo1083a((AbstractC11435m) abstractC11433k).mo1086a(" ");
                abstractC11433k.mo1070a(obj, abstractC11428g);
                return false;
            }
        }
        return true;
    }
}
