package org.p325b.p326a;

import java.util.ArrayList;
import java.util.Arrays;
import org.p325b.AbstractC11428g;
import org.p325b.AbstractC11431i;
import org.p325b.AbstractC11433k;
/* renamed from: org.b.a.b */
/* loaded from: classes.dex */
public class C11396b<T> extends AbstractC11410n<T> {
    public C11396b(Iterable<AbstractC11433k<? super T>> iterable) {
        super(iterable);
    }

    @AbstractC11431i
    /* renamed from: a */
    public static <T> C11396b<T> m1194a(Iterable<AbstractC11433k<? super T>> iterable) {
        return new C11396b<>(iterable);
    }

    @AbstractC11431i
    /* renamed from: a */
    public static <T> C11396b<T> m1193a(AbstractC11433k<T> abstractC11433k, AbstractC11433k<? super T> abstractC11433k2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(abstractC11433k);
        arrayList.add(abstractC11433k2);
        return m1194a((Iterable) arrayList);
    }

    @AbstractC11431i
    /* renamed from: a */
    public static <T> C11396b<T> m1192a(AbstractC11433k<T> abstractC11433k, AbstractC11433k<? super T> abstractC11433k2, AbstractC11433k<? super T> abstractC11433k3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(abstractC11433k);
        arrayList.add(abstractC11433k2);
        arrayList.add(abstractC11433k3);
        return m1194a((Iterable) arrayList);
    }

    @AbstractC11431i
    /* renamed from: a */
    public static <T> C11396b<T> m1191a(AbstractC11433k<T> abstractC11433k, AbstractC11433k<? super T> abstractC11433k2, AbstractC11433k<? super T> abstractC11433k3, AbstractC11433k<? super T> abstractC11433k4) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(abstractC11433k);
        arrayList.add(abstractC11433k2);
        arrayList.add(abstractC11433k3);
        arrayList.add(abstractC11433k4);
        return m1194a((Iterable) arrayList);
    }

    @AbstractC11431i
    /* renamed from: a */
    public static <T> C11396b<T> m1190a(AbstractC11433k<T> abstractC11433k, AbstractC11433k<? super T> abstractC11433k2, AbstractC11433k<? super T> abstractC11433k3, AbstractC11433k<? super T> abstractC11433k4, AbstractC11433k<? super T> abstractC11433k5) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(abstractC11433k);
        arrayList.add(abstractC11433k2);
        arrayList.add(abstractC11433k3);
        arrayList.add(abstractC11433k4);
        arrayList.add(abstractC11433k5);
        return m1194a((Iterable) arrayList);
    }

    @AbstractC11431i
    /* renamed from: a */
    public static <T> C11396b<T> m1189a(AbstractC11433k<T> abstractC11433k, AbstractC11433k<? super T> abstractC11433k2, AbstractC11433k<? super T> abstractC11433k3, AbstractC11433k<? super T> abstractC11433k4, AbstractC11433k<? super T> abstractC11433k5, AbstractC11433k<? super T> abstractC11433k6) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(abstractC11433k);
        arrayList.add(abstractC11433k2);
        arrayList.add(abstractC11433k3);
        arrayList.add(abstractC11433k4);
        arrayList.add(abstractC11433k5);
        arrayList.add(abstractC11433k6);
        return m1194a((Iterable) arrayList);
    }

    @AbstractC11431i
    /* renamed from: a */
    public static <T> C11396b<T> m1188a(AbstractC11433k<? super T>... abstractC11433kArr) {
        return m1194a((Iterable) Arrays.asList(abstractC11433kArr));
    }

    @Override // org.p325b.p326a.AbstractC11410n, org.p325b.AbstractC11435m
    /* renamed from: a */
    public void mo905a(AbstractC11428g abstractC11428g) {
        mo1148a(abstractC11428g, "or");
    }

    @Override // org.p325b.p326a.AbstractC11410n
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo1148a(AbstractC11428g abstractC11428g, String str) {
        super.mo1148a(abstractC11428g, str);
    }

    @Override // org.p325b.p326a.AbstractC11410n, org.p325b.AbstractC11433k
    /* renamed from: a */
    public boolean mo900a(Object obj) {
        return a(obj, true);
    }
}
