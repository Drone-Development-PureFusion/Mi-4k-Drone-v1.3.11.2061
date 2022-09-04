package com.google.android.gms.internal;

import com.google.android.gms.internal.AbstractC7246jh;
import com.google.android.gms.internal.C7300kj;
import com.google.firebase.database.C9831c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* renamed from: com.google.android.gms.internal.kh */
/* loaded from: classes2.dex */
public class C7297kh {

    /* renamed from: a */
    static final /* synthetic */ boolean f24433a;

    /* renamed from: b */
    private final C7296kg f24434b;

    /* renamed from: c */
    private final C7300kj f24435c;

    /* renamed from: d */
    private C7299ki f24436d;

    /* renamed from: e */
    private final List<AbstractC7151ie> f24437e = new ArrayList();

    /* renamed from: f */
    private final C7289kd f24438f;

    /* renamed from: com.google.android.gms.internal.kh$a */
    /* loaded from: classes2.dex */
    public static class C7298a {

        /* renamed from: a */
        public final List<C7286kb> f24439a;

        /* renamed from: b */
        public final List<C7285ka> f24440b;

        public C7298a(List<C7286kb> list, List<C7285ka> list2) {
            this.f24439a = list;
            this.f24440b = list2;
        }
    }

    static {
        f24433a = !C7297kh.class.desiredAssertionStatus();
    }

    public C7297kh(C7296kg c7296kg, C7299ki c7299ki) {
        this.f24434b = c7296kg;
        C7306kl c7306kl = new C7306kl(c7296kg.m14896c());
        AbstractC7309ko m14902q = c7296kg.m14897b().m14902q();
        this.f24435c = new C7300kj(m14902q);
        C7282jy m14879c = c7299ki.m14879c();
        C7282jy m14883a = c7299ki.m14883a();
        C7337lc m14768a = C7337lc.m14768a(C7335la.m14778j(), c7296kg.m14896c());
        C7337lc mo14858a = c7306kl.mo14858a(m14768a, m14879c.m14954d(), null);
        C7337lc mo14858a2 = m14902q.mo14858a(m14768a, m14883a.m14954d(), null);
        this.f24436d = new C7299ki(new C7282jy(mo14858a2, m14883a.m14959a(), m14902q.mo14853c()), new C7282jy(mo14858a, m14879c.m14959a(), c7306kl.mo14853c()));
        this.f24438f = new C7289kd(c7296kg);
    }

    /* renamed from: a */
    private List<C7286kb> m14888a(List<C7285ka> list, C7337lc c7337lc, AbstractC7151ie abstractC7151ie) {
        return this.f24438f.m14929a(list, c7337lc, abstractC7151ie == null ? this.f24437e : Arrays.asList(abstractC7151ie));
    }

    /* renamed from: a */
    public C7296kg m14893a() {
        return this.f24434b;
    }

    /* renamed from: a */
    public C7298a m14889a(AbstractC7246jh abstractC7246jh, C7241jc c7241jc, AbstractC7344lh abstractC7344lh) {
        if (abstractC7246jh.m15097e() == AbstractC7246jh.EnumC7247a.Merge && abstractC7246jh.m15098d().m15092d() != null) {
            if (!f24433a && this.f24436d.m14878d() == null) {
                throw new AssertionError("We should always have a full cache before handling merges");
            }
            if (!f24433a && this.f24436d.m14881b() == null) {
                throw new AssertionError("Missing event cache, even though we have a server cache");
            }
        }
        C7299ki c7299ki = this.f24436d;
        C7300kj.C7303a m14870a = this.f24435c.m14870a(c7299ki, abstractC7246jh, c7241jc, abstractC7344lh);
        if (f24433a || m14870a.f24447a.m14879c().m14959a() || !c7299ki.m14879c().m14959a()) {
            this.f24436d = m14870a.f24447a;
            return new C7298a(m14888a(m14870a.f24448b, m14870a.f24447a.m14883a().m14954d(), (AbstractC7151ie) null), m14870a.f24448b);
        }
        throw new AssertionError("Once a server snap is complete, it should never go back");
    }

    /* renamed from: a */
    public AbstractC7344lh m14890a(C7160ij c7160ij) {
        AbstractC7344lh m14878d = this.f24436d.m14878d();
        if (m14878d == null || (!this.f24434b.m14894e() && (c7160ij.m15356h() || m14878d.mo14738c(c7160ij.m15363d()).mo14739b()))) {
            return null;
        }
        return m14878d.mo14750a(c7160ij);
    }

    /* renamed from: a */
    public List<AbstractC7287kc> m14891a(AbstractC7151ie abstractC7151ie, C9831c c9831c) {
        ArrayList emptyList;
        if (c9831c != null) {
            ArrayList arrayList = new ArrayList();
            if (!f24433a && abstractC7151ie != null) {
                throw new AssertionError("A cancel should cancel all event registrations");
            }
            C7160ij m14900a = this.f24434b.m14900a();
            for (AbstractC7151ie abstractC7151ie2 : this.f24437e) {
                arrayList.add(new C7283jz(abstractC7151ie2, c9831c, m14900a));
            }
            emptyList = arrayList;
        } else {
            emptyList = Collections.emptyList();
        }
        if (abstractC7151ie != null) {
            int i = 0;
            int i2 = -1;
            while (true) {
                if (i >= this.f24437e.size()) {
                    i = i2;
                    break;
                }
                AbstractC7151ie abstractC7151ie3 = this.f24437e.get(i);
                if (abstractC7151ie3.mo15139a(abstractC7151ie)) {
                    if (abstractC7151ie3.m15376c()) {
                        break;
                    }
                    i2 = i;
                }
                i++;
            }
            if (i != -1) {
                this.f24437e.remove(i);
                this.f24437e.get(i).m15377b();
            }
        } else {
            for (AbstractC7151ie abstractC7151ie4 : this.f24437e) {
                abstractC7151ie4.m15377b();
            }
            this.f24437e.clear();
        }
        return emptyList;
    }

    /* renamed from: a */
    public void m14892a(AbstractC7151ie abstractC7151ie) {
        this.f24437e.add(abstractC7151ie);
    }

    /* renamed from: b */
    public AbstractC7344lh m14887b() {
        return this.f24436d.m14879c().m14955c();
    }

    /* renamed from: b */
    public List<C7286kb> m14886b(AbstractC7151ie abstractC7151ie) {
        C7282jy m14883a = this.f24436d.m14883a();
        ArrayList arrayList = new ArrayList();
        for (C7343lg c7343lg : m14883a.m14955c()) {
            arrayList.add(C7285ka.m14948a(c7343lg.m14752c(), c7343lg.m14751d()));
        }
        if (m14883a.m14959a()) {
            arrayList.add(C7285ka.m14946a(m14883a.m14954d()));
        }
        return m14888a(arrayList, m14883a.m14954d(), abstractC7151ie);
    }

    /* renamed from: c */
    public AbstractC7344lh m14885c() {
        return this.f24436d.m14883a().m14955c();
    }

    /* renamed from: d */
    public boolean m14884d() {
        return this.f24437e.isEmpty();
    }
}
