package com.google.android.gms.internal;

import com.google.android.gms.internal.AbstractC7287kc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/* renamed from: com.google.android.gms.internal.kd */
/* loaded from: classes2.dex */
public class C7289kd {

    /* renamed from: a */
    private final C7296kg f24409a;

    /* renamed from: b */
    private final AbstractC7336lb f24410b;

    public C7289kd(C7296kg c7296kg) {
        this.f24409a = c7296kg;
        this.f24410b = c7296kg.m14896c();
    }

    /* renamed from: a */
    private C7286kb m14932a(C7285ka c7285ka, AbstractC7151ie abstractC7151ie, C7337lc c7337lc) {
        if (!c7285ka.m14945b().equals(AbstractC7287kc.EnumC7288a.VALUE) && !c7285ka.m14945b().equals(AbstractC7287kc.EnumC7288a.CHILD_REMOVED)) {
            c7285ka = c7285ka.m14951a(c7337lc.m14771a(c7285ka.m14952a(), c7285ka.m14942c().m14773a(), this.f24410b));
        }
        return abstractC7151ie.mo15138a(c7285ka, this.f24409a);
    }

    /* renamed from: a */
    private Comparator<C7285ka> m14933a() {
        return new Comparator<C7285ka>() { // from class: com.google.android.gms.internal.kd.1

            /* renamed from: a */
            static final /* synthetic */ boolean f24411a;

            static {
                f24411a = !C7289kd.class.desiredAssertionStatus();
            }

            @Override // java.util.Comparator
            /* renamed from: a */
            public int compare(C7285ka c7285ka, C7285ka c7285ka2) {
                if (f24411a || !(c7285ka.m14952a() == null || c7285ka2.m14952a() == null)) {
                    return C7289kd.this.f24410b.compare(new C7343lg(c7285ka.m14952a(), c7285ka.m14942c().m14773a()), new C7343lg(c7285ka2.m14952a(), c7285ka2.m14942c().m14773a()));
                }
                throw new AssertionError();
            }
        };
    }

    /* renamed from: a */
    private void m14930a(List<C7286kb> list, AbstractC7287kc.EnumC7288a enumC7288a, List<C7285ka> list2, List<AbstractC7151ie> list3, C7337lc c7337lc) {
        ArrayList<C7285ka> arrayList = new ArrayList();
        for (C7285ka c7285ka : list2) {
            if (c7285ka.m14945b().equals(enumC7288a)) {
                arrayList.add(c7285ka);
            }
        }
        Collections.sort(arrayList, m14933a());
        for (C7285ka c7285ka2 : arrayList) {
            for (AbstractC7151ie abstractC7151ie : list3) {
                if (abstractC7151ie.mo15136a(enumC7288a)) {
                    list.add(m14932a(c7285ka2, abstractC7151ie, c7337lc));
                }
            }
        }
    }

    /* renamed from: a */
    public List<C7286kb> m14929a(List<C7285ka> list, C7337lc c7337lc, List<AbstractC7151ie> list2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C7285ka c7285ka : list) {
            if (c7285ka.m14945b().equals(AbstractC7287kc.EnumC7288a.CHILD_CHANGED) && this.f24410b.m14775a(c7285ka.m14939e().m14773a(), c7285ka.m14942c().m14773a())) {
                arrayList2.add(C7285ka.m14941c(c7285ka.m14952a(), c7285ka.m14942c()));
            }
        }
        m14930a(arrayList, AbstractC7287kc.EnumC7288a.CHILD_REMOVED, list, list2, c7337lc);
        m14930a(arrayList, AbstractC7287kc.EnumC7288a.CHILD_ADDED, list, list2, c7337lc);
        m14930a(arrayList, AbstractC7287kc.EnumC7288a.CHILD_MOVED, arrayList2, list2, c7337lc);
        m14930a(arrayList, AbstractC7287kc.EnumC7288a.CHILD_CHANGED, list, list2, c7337lc);
        m14930a(arrayList, AbstractC7287kc.EnumC7288a.VALUE, list, list2, c7337lc);
        return arrayList;
    }
}
