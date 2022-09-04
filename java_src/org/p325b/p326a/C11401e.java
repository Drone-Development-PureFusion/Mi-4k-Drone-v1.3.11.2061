package org.p325b.p326a;

import org.p325b.AbstractC11428g;
import org.p325b.AbstractC11431i;
import org.p325b.AbstractC11433k;
import org.p325b.AbstractC11435m;
import org.p325b.AbstractC11437o;
/* renamed from: org.b.a.e */
/* loaded from: classes.dex */
public class C11401e<T> extends AbstractC11437o<Iterable<T>> {

    /* renamed from: a */
    private final AbstractC11433k<? super T> f36518a;

    public C11401e(AbstractC11433k<? super T> abstractC11433k) {
        this.f36518a = abstractC11433k;
    }

    @AbstractC11431i
    /* renamed from: a */
    public static <U> AbstractC11433k<Iterable<U>> m1178a(AbstractC11433k<U> abstractC11433k) {
        return new C11401e(abstractC11433k);
    }

    @Override // org.p325b.AbstractC11435m
    /* renamed from: a */
    public void mo905a(AbstractC11428g abstractC11428g) {
        abstractC11428g.mo1086a("every item is ").mo1083a((AbstractC11435m) this.f36518a);
    }

    /* renamed from: a */
    public boolean m1179a(Iterable<T> iterable, AbstractC11428g abstractC11428g) {
        for (T t : iterable) {
            if (!this.f36518a.mo900a(t)) {
                abstractC11428g.mo1086a("an item ");
                this.f36518a.mo1070a(t, abstractC11428g);
                return false;
            }
        }
        return true;
    }

    @Override // org.p325b.AbstractC11437o
    /* renamed from: b */
    public /* synthetic */ boolean mo1071b(Object obj, AbstractC11428g abstractC11428g) {
        return m1179a((Iterable) ((Iterable) obj), abstractC11428g);
    }
}
