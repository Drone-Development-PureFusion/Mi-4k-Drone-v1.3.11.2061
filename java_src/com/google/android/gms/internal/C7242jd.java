package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
/* renamed from: com.google.android.gms.internal.jd */
/* loaded from: classes2.dex */
public class C7242jd implements AbstractC7152if {

    /* renamed from: b */
    static final /* synthetic */ boolean f24312b;

    /* renamed from: c */
    private static C7242jd f24313c;

    /* renamed from: a */
    final HashMap<AbstractC7151ie, List<AbstractC7151ie>> f24314a = new HashMap<>();

    static {
        f24312b = !C7242jd.class.desiredAssertionStatus();
        f24313c = new C7242jd();
    }

    private C7242jd() {
    }

    /* renamed from: a */
    public static C7242jd m15107a() {
        return f24313c;
    }

    /* renamed from: d */
    private void m15103d(AbstractC7151ie abstractC7151ie) {
        boolean z;
        AbstractC7151ie mo15135a;
        List<AbstractC7151ie> list;
        boolean z2;
        int i = 0;
        synchronized (this.f24314a) {
            List<AbstractC7151ie> list2 = this.f24314a.get(abstractC7151ie);
            if (list2 != null) {
                int i2 = 0;
                while (true) {
                    if (i2 >= list2.size()) {
                        z2 = false;
                        break;
                    } else if (list2.get(i2) == abstractC7151ie) {
                        z2 = true;
                        list2.remove(i2);
                        break;
                    } else {
                        i2++;
                    }
                }
                if (list2.isEmpty()) {
                    this.f24314a.remove(abstractC7151ie);
                }
                z = z2;
            } else {
                z = false;
            }
            if (!f24312b && !z && abstractC7151ie.m15375d()) {
                throw new AssertionError();
            }
            if (!abstractC7151ie.mo15140a().m14895d() && (list = this.f24314a.get((mo15135a = abstractC7151ie.mo15135a(C7296kg.m14899a(abstractC7151ie.mo15140a().m14900a()))))) != null) {
                while (true) {
                    if (i >= list.size()) {
                        break;
                    } else if (list.get(i) == abstractC7151ie) {
                        list.remove(i);
                        break;
                    } else {
                        i++;
                    }
                }
                if (list.isEmpty()) {
                    this.f24314a.remove(mo15135a);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.AbstractC7152if
    /* renamed from: a */
    public void mo15106a(AbstractC7151ie abstractC7151ie) {
        m15103d(abstractC7151ie);
    }

    /* renamed from: b */
    public void m15105b(AbstractC7151ie abstractC7151ie) {
        synchronized (this.f24314a) {
            List<AbstractC7151ie> list = this.f24314a.get(abstractC7151ie);
            if (list == null) {
                list = new ArrayList<>();
                this.f24314a.put(abstractC7151ie, list);
            }
            list.add(abstractC7151ie);
            if (!abstractC7151ie.mo15140a().m14895d()) {
                AbstractC7151ie mo15135a = abstractC7151ie.mo15135a(C7296kg.m14899a(abstractC7151ie.mo15140a().m14900a()));
                List<AbstractC7151ie> list2 = this.f24314a.get(mo15135a);
                if (list2 == null) {
                    list2 = new ArrayList<>();
                    this.f24314a.put(mo15135a, list2);
                }
                list2.add(abstractC7151ie);
            }
            abstractC7151ie.m15378a(true);
            abstractC7151ie.m15379a(this);
        }
    }

    /* renamed from: c */
    public void m15104c(AbstractC7151ie abstractC7151ie) {
        synchronized (this.f24314a) {
            List<AbstractC7151ie> list = this.f24314a.get(abstractC7151ie);
            if (list != null && !list.isEmpty()) {
                if (abstractC7151ie.mo15140a().m14895d()) {
                    HashSet hashSet = new HashSet();
                    for (int size = list.size() - 1; size >= 0; size--) {
                        AbstractC7151ie abstractC7151ie2 = list.get(size);
                        if (!hashSet.contains(abstractC7151ie2.mo15140a())) {
                            hashSet.add(abstractC7151ie2.mo15140a());
                            abstractC7151ie2.m15377b();
                        }
                    }
                } else {
                    list.get(0).m15377b();
                }
            }
        }
    }
}
