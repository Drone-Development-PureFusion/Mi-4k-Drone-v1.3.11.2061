package org.p325b.p326a;

import org.p325b.AbstractC11415b;
import org.p325b.AbstractC11428g;
import org.p325b.AbstractC11433k;
/* renamed from: org.b.a.n */
/* loaded from: classes2.dex */
abstract class AbstractC11410n<T> extends AbstractC11415b<T> {

    /* renamed from: a */
    private final Iterable<AbstractC11433k<? super T>> f36527a;

    public AbstractC11410n(Iterable<AbstractC11433k<? super T>> iterable) {
        this.f36527a = iterable;
    }

    @Override // org.p325b.AbstractC11435m
    /* renamed from: a */
    public abstract void mo905a(AbstractC11428g abstractC11428g);

    /* renamed from: a */
    public void mo1148a(AbstractC11428g abstractC11428g, String str) {
        abstractC11428g.mo1082b("(", " " + str + " ", ")", this.f36527a);
    }

    @Override // org.p325b.AbstractC11433k
    /* renamed from: a */
    public abstract boolean mo900a(Object obj);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public boolean m1149a(Object obj, boolean z) {
        for (AbstractC11433k<? super T> abstractC11433k : this.f36527a) {
            if (abstractC11433k.mo900a(obj) == z) {
                return z;
            }
        }
        return !z;
    }
}
