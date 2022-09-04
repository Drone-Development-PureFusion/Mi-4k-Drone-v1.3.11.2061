package org.p325b.p326a;

import java.util.ArrayList;
import org.p325b.AbstractC11428g;
import org.p325b.AbstractC11431i;
import org.p325b.AbstractC11433k;
import org.p325b.AbstractC11435m;
import org.p325b.AbstractC11437o;
/* renamed from: org.b.a.h */
/* loaded from: classes.dex */
public class C11404h<T> extends AbstractC11437o<Iterable<? super T>> {

    /* renamed from: a */
    private final AbstractC11433k<? super T> f36521a;

    public C11404h(AbstractC11433k<? super T> abstractC11433k) {
        this.f36521a = abstractC11433k;
    }

    @AbstractC11431i
    /* renamed from: a */
    public static <T> AbstractC11433k<Iterable<? super T>> m1170a(AbstractC11433k<? super T> abstractC11433k) {
        return new C11404h(abstractC11433k);
    }

    @AbstractC11431i
    /* renamed from: a */
    public static <T> AbstractC11433k<Iterable<T>> m1169a(T... tArr) {
        ArrayList arrayList = new ArrayList(tArr.length);
        for (T t : tArr) {
            arrayList.add(m1167b(t));
        }
        return C11395a.m1201a((Iterable) arrayList);
    }

    @AbstractC11431i
    /* renamed from: a */
    public static <T> AbstractC11433k<Iterable<T>> m1168a(AbstractC11433k<? super T>... abstractC11433kArr) {
        ArrayList arrayList = new ArrayList(abstractC11433kArr.length);
        for (AbstractC11433k<? super T> abstractC11433k : abstractC11433kArr) {
            arrayList.add(new C11404h(abstractC11433k));
        }
        return C11395a.m1201a((Iterable) arrayList);
    }

    @AbstractC11431i
    /* renamed from: b */
    public static <T> AbstractC11433k<Iterable<? super T>> m1167b(T t) {
        return new C11404h(C11405i.m1165b(t));
    }

    @Override // org.p325b.AbstractC11435m
    /* renamed from: a */
    public void mo905a(AbstractC11428g abstractC11428g) {
        abstractC11428g.mo1086a("a collection containing ").mo1083a((AbstractC11435m) this.f36521a);
    }

    /* renamed from: a */
    protected boolean m1171a(Iterable<? super T> iterable, AbstractC11428g abstractC11428g) {
        boolean z = false;
        for (T t : iterable) {
            if (this.f36521a.mo900a(t)) {
                return true;
            }
            if (z) {
                abstractC11428g.mo1086a(", ");
            }
            this.f36521a.mo1070a(t, abstractC11428g);
            z = true;
        }
        return false;
    }

    @Override // org.p325b.AbstractC11437o
    /* renamed from: b */
    protected /* synthetic */ boolean mo1071b(Object obj, AbstractC11428g abstractC11428g) {
        return m1171a((Iterable) ((Iterable) obj), abstractC11428g);
    }
}
