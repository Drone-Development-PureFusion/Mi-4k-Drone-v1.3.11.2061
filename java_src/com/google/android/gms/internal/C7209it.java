package com.google.android.gms.internal;

import com.google.android.gms.internal.AbstractC7287kc;
import com.google.android.gms.internal.C7297kh;
import com.google.firebase.database.C9831c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* renamed from: com.google.android.gms.internal.it */
/* loaded from: classes2.dex */
public class C7209it {

    /* renamed from: a */
    static final /* synthetic */ boolean f24217a;

    /* renamed from: b */
    private final Map<C7293kf, C7297kh> f24218b = new HashMap();

    /* renamed from: c */
    private final AbstractC7257jp f24219c;

    static {
        f24217a = !C7209it.class.desiredAssertionStatus();
    }

    public C7209it(AbstractC7257jp abstractC7257jp) {
        this.f24219c = abstractC7257jp;
    }

    /* renamed from: a */
    private List<C7286kb> m15233a(C7297kh c7297kh, AbstractC7246jh abstractC7246jh, C7241jc c7241jc, AbstractC7344lh abstractC7344lh) {
        C7297kh.C7298a m14889a = c7297kh.m14889a(abstractC7246jh, c7241jc, abstractC7344lh);
        if (!c7297kh.m14893a().m14894e()) {
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            for (C7285ka c7285ka : m14889a.f24440b) {
                AbstractC7287kc.EnumC7288a m14945b = c7285ka.m14945b();
                if (m14945b == AbstractC7287kc.EnumC7288a.CHILD_ADDED) {
                    hashSet2.add(c7285ka.m14952a());
                } else if (m14945b == AbstractC7287kc.EnumC7288a.CHILD_REMOVED) {
                    hashSet.add(c7285ka.m14952a());
                }
            }
            if (!hashSet2.isEmpty() || !hashSet.isEmpty()) {
                this.f24219c.mo15072a(c7297kh.m14893a(), hashSet2, hashSet);
            }
        }
        return m14889a.f24439a;
    }

    /* renamed from: a */
    public C7297kh m15235a(C7296kg c7296kg) {
        return c7296kg.m14894e() ? m15229d() : this.f24218b.get(c7296kg.m14897b());
    }

    /* renamed from: a */
    public AbstractC7344lh m15237a(C7160ij c7160ij) {
        for (C7297kh c7297kh : this.f24218b.values()) {
            if (c7297kh.m14890a(c7160ij) != null) {
                return c7297kh.m14890a(c7160ij);
            }
        }
        return null;
    }

    /* renamed from: a */
    public C7389mh<List<C7296kg>, List<AbstractC7287kc>> m15234a(C7296kg c7296kg, AbstractC7151ie abstractC7151ie, C9831c c9831c) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        boolean m15230c = m15230c();
        if (c7296kg.m14895d()) {
            Iterator<Map.Entry<C7293kf, C7297kh>> it2 = this.f24218b.entrySet().iterator();
            while (it2.hasNext()) {
                C7297kh value = it2.next().getValue();
                arrayList2.addAll(value.m14891a(abstractC7151ie, c9831c));
                if (value.m14884d()) {
                    it2.remove();
                    if (!value.m14893a().m14894e()) {
                        arrayList.add(value.m14893a());
                    }
                }
            }
        } else {
            C7297kh c7297kh = this.f24218b.get(c7296kg.m14897b());
            if (c7297kh != null) {
                arrayList2.addAll(c7297kh.m14891a(abstractC7151ie, c9831c));
                if (c7297kh.m14884d()) {
                    this.f24218b.remove(c7296kg.m14897b());
                    if (!c7297kh.m14893a().m14894e()) {
                        arrayList.add(c7297kh.m14893a());
                    }
                }
            }
        }
        if (m15230c && !m15230c()) {
            arrayList.add(C7296kg.m14899a(c7296kg.m14900a()));
        }
        return new C7389mh<>(arrayList, arrayList2);
    }

    /* renamed from: a */
    public List<C7286kb> m15238a(AbstractC7151ie abstractC7151ie, C7241jc c7241jc, C7282jy c7282jy) {
        boolean z;
        C7296kg mo15140a = abstractC7151ie.mo15140a();
        C7297kh c7297kh = this.f24218b.get(mo15140a.m14897b());
        if (c7297kh == null) {
            AbstractC7344lh m15112a = c7241jc.m15112a(c7282jy.m14959a() ? c7282jy.m14955c() : null);
            if (m15112a != null) {
                z = true;
            } else {
                m15112a = c7241jc.m15108b(c7282jy.m14955c());
                z = false;
            }
            C7297kh c7297kh2 = new C7297kh(mo15140a, new C7299ki(new C7282jy(C7337lc.m14768a(m15112a, mo15140a.m14896c()), z, false), c7282jy));
            if (!mo15140a.m14894e()) {
                HashSet hashSet = new HashSet();
                for (C7343lg c7343lg : c7297kh2.m14885c()) {
                    hashSet.add(c7343lg.m14752c());
                }
                this.f24219c.mo15073a(mo15140a, hashSet);
            }
            this.f24218b.put(mo15140a.m14897b(), c7297kh2);
            c7297kh = c7297kh2;
        }
        c7297kh.m14892a(abstractC7151ie);
        return c7297kh.m14886b(abstractC7151ie);
    }

    /* renamed from: a */
    public List<C7286kb> m15236a(AbstractC7246jh abstractC7246jh, C7241jc c7241jc, AbstractC7344lh abstractC7344lh) {
        C7293kf m15092d = abstractC7246jh.m15098d().m15092d();
        if (m15092d != null) {
            C7297kh c7297kh = this.f24218b.get(m15092d);
            if (!f24217a && c7297kh == null) {
                throw new AssertionError();
            }
            return m15233a(c7297kh, abstractC7246jh, c7241jc, abstractC7344lh);
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<C7293kf, C7297kh> entry : this.f24218b.entrySet()) {
            arrayList.addAll(m15233a(entry.getValue(), abstractC7246jh, c7241jc, abstractC7344lh));
        }
        return arrayList;
    }

    /* renamed from: a */
    public boolean m15239a() {
        return this.f24218b.isEmpty();
    }

    /* renamed from: b */
    public List<C7297kh> m15232b() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<C7293kf, C7297kh> entry : this.f24218b.entrySet()) {
            C7297kh value = entry.getValue();
            if (!value.m14893a().m14894e()) {
                arrayList.add(value);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public boolean m15231b(C7296kg c7296kg) {
        return m15235a(c7296kg) != null;
    }

    /* renamed from: c */
    public boolean m15230c() {
        return m15229d() != null;
    }

    /* renamed from: d */
    public C7297kh m15229d() {
        for (Map.Entry<C7293kf, C7297kh> entry : this.f24218b.entrySet()) {
            C7297kh value = entry.getValue();
            if (value.m14893a().m14894e()) {
                return value;
            }
        }
        return null;
    }
}
