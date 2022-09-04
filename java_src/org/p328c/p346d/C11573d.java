package org.p328c.p346d;

import java.util.ArrayList;
import java.util.List;
import org.p325b.AbstractC11433k;
import org.p325b.C11425d;
import org.p328c.p345c.C11566a;
/* renamed from: org.c.d.d */
/* loaded from: classes2.dex */
class C11573d {

    /* renamed from: a */
    private final List<AbstractC11433k<?>> f36697a = new ArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    private AbstractC11433k<Throwable> m656b(AbstractC11433k<?> abstractC11433k) {
        return abstractC11433k;
    }

    /* renamed from: c */
    private AbstractC11433k<Throwable> m655c() {
        return this.f36697a.size() == 1 ? m656b(this.f36697a.get(0)) : C11425d.m1127a((Iterable) m654d());
    }

    /* renamed from: d */
    private List<AbstractC11433k<? super Throwable>> m654d() {
        return new ArrayList(this.f36697a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m658a(AbstractC11433k<?> abstractC11433k) {
        this.f36697a.add(abstractC11433k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean m659a() {
        return !this.f36697a.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public AbstractC11433k<Throwable> m657b() {
        return C11566a.m692e(m655c());
    }
}
