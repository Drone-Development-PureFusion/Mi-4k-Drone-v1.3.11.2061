package com.google.android.gms.internal;

import com.google.android.gms.internal.AbstractC7309ko;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* renamed from: com.google.android.gms.internal.kj */
/* loaded from: classes2.dex */
public class C7300kj {

    /* renamed from: a */
    static final /* synthetic */ boolean f24443a;

    /* renamed from: c */
    private static AbstractC7309ko.AbstractC7310a f24444c;

    /* renamed from: b */
    private final AbstractC7309ko f24445b;

    /* renamed from: com.google.android.gms.internal.kj$a */
    /* loaded from: classes2.dex */
    public static class C7303a {

        /* renamed from: a */
        public final C7299ki f24447a;

        /* renamed from: b */
        public final List<C7285ka> f24448b;

        public C7303a(C7299ki c7299ki, List<C7285ka> list) {
            this.f24447a = c7299ki;
            this.f24448b = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.internal.kj$b */
    /* loaded from: classes2.dex */
    public static class C7304b implements AbstractC7309ko.AbstractC7310a {

        /* renamed from: a */
        private final C7241jc f24449a;

        /* renamed from: b */
        private final C7299ki f24450b;

        /* renamed from: c */
        private final AbstractC7344lh f24451c;

        public C7304b(C7241jc c7241jc, C7299ki c7299ki, AbstractC7344lh abstractC7344lh) {
            this.f24449a = c7241jc;
            this.f24450b = c7299ki;
            this.f24451c = abstractC7344lh;
        }

        @Override // com.google.android.gms.internal.AbstractC7309ko.AbstractC7310a
        /* renamed from: a */
        public C7343lg mo14862a(AbstractC7336lb abstractC7336lb, C7343lg c7343lg, boolean z) {
            return this.f24449a.m15111a(this.f24451c != null ? this.f24451c : this.f24450b.m14878d(), c7343lg, z, abstractC7336lb);
        }

        @Override // com.google.android.gms.internal.AbstractC7309ko.AbstractC7310a
        /* renamed from: a */
        public AbstractC7344lh mo14863a(C7319kv c7319kv) {
            C7282jy m14883a = this.f24450b.m14883a();
            if (m14883a.m14957a(c7319kv)) {
                return m14883a.m14955c().mo14738c(c7319kv);
            }
            return this.f24449a.m15113a(c7319kv, this.f24451c != null ? new C7282jy(C7337lc.m14768a(this.f24451c, C7338ld.m14761d()), true, false) : this.f24450b.m14879c());
        }
    }

    static {
        f24443a = !C7300kj.class.desiredAssertionStatus();
        f24444c = new AbstractC7309ko.AbstractC7310a() { // from class: com.google.android.gms.internal.kj.1
            @Override // com.google.android.gms.internal.AbstractC7309ko.AbstractC7310a
            /* renamed from: a */
            public C7343lg mo14862a(AbstractC7336lb abstractC7336lb, C7343lg c7343lg, boolean z) {
                return null;
            }

            @Override // com.google.android.gms.internal.AbstractC7309ko.AbstractC7310a
            /* renamed from: a */
            public AbstractC7344lh mo14863a(C7319kv c7319kv) {
                return null;
            }
        };
    }

    public C7300kj(AbstractC7309ko abstractC7309ko) {
        this.f24445b = abstractC7309ko;
    }

    /* renamed from: a */
    private C7299ki m14877a(C7299ki c7299ki, C7160ij c7160ij, C7142ia c7142ia, C7241jc c7241jc, AbstractC7344lh abstractC7344lh, C7305kk c7305kk) {
        if (f24443a || c7142ia.m15427b() == null) {
            Iterator<Map.Entry<C7160ij, AbstractC7344lh>> it2 = c7142ia.iterator();
            C7299ki c7299ki2 = c7299ki;
            while (it2.hasNext()) {
                Map.Entry<C7160ij, AbstractC7344lh> next = it2.next();
                C7160ij m15370a = c7160ij.m15370a(next.getKey());
                if (m14868a(c7299ki, m15370a.m15363d())) {
                    c7299ki2 = m14872a(c7299ki2, m15370a, next.getValue(), c7241jc, abstractC7344lh, c7305kk);
                }
            }
            Iterator<Map.Entry<C7160ij, AbstractC7344lh>> it3 = c7142ia.iterator();
            while (it3.hasNext()) {
                Map.Entry<C7160ij, AbstractC7344lh> next2 = it3.next();
                C7160ij m15370a2 = c7160ij.m15370a(next2.getKey());
                if (!m14868a(c7299ki, m15370a2.m15363d())) {
                    c7299ki2 = m14872a(c7299ki2, m15370a2, next2.getValue(), c7241jc, abstractC7344lh, c7305kk);
                }
            }
            return c7299ki2;
        }
        throw new AssertionError("Can't have a merge that is an overwrite");
    }

    /* renamed from: a */
    private C7299ki m14876a(C7299ki c7299ki, C7160ij c7160ij, C7142ia c7142ia, C7241jc c7241jc, AbstractC7344lh abstractC7344lh, boolean z, C7305kk c7305kk) {
        if (!c7299ki.m14879c().m14955c().mo14739b() || c7299ki.m14879c().m14959a()) {
            if (!f24443a && c7142ia.m15427b() != null) {
                throw new AssertionError("Can't have a merge that is an overwrite");
            }
            if (!c7160ij.m15356h()) {
                c7142ia = C7142ia.m15436a().m15434a(c7160ij, c7142ia);
            }
            AbstractC7344lh m14955c = c7299ki.m14879c().m14955c();
            Map<C7319kv, C7142ia> m15422d = c7142ia.m15422d();
            C7299ki c7299ki2 = c7299ki;
            for (Map.Entry<C7319kv, C7142ia> entry : m15422d.entrySet()) {
                C7319kv key = entry.getKey();
                if (m14955c.mo14741a(key)) {
                    c7299ki2 = m14871a(c7299ki2, new C7160ij(key), entry.getValue().m15430a(m14955c.mo14738c(key)), c7241jc, abstractC7344lh, z, c7305kk);
                }
            }
            for (Map.Entry<C7319kv, C7142ia> entry2 : m15422d.entrySet()) {
                C7319kv key2 = entry2.getKey();
                boolean z2 = !c7299ki.m14879c().m14957a(key2) && entry2.getValue().m15427b() == null;
                if (!m14955c.mo14741a(key2) && !z2) {
                    c7299ki2 = m14871a(c7299ki2, new C7160ij(key2), entry2.getValue().m15430a(m14955c.mo14738c(key2)), c7241jc, abstractC7344lh, z, c7305kk);
                }
            }
            return c7299ki2;
        }
        return c7299ki;
    }

    /* renamed from: a */
    private C7299ki m14875a(C7299ki c7299ki, C7160ij c7160ij, C7241jc c7241jc, AbstractC7309ko.AbstractC7310a abstractC7310a, C7305kk c7305kk) {
        AbstractC7344lh m15113a;
        C7337lc mo14859a;
        AbstractC7344lh m15112a;
        C7282jy m14883a = c7299ki.m14883a();
        if (c7241jc.m15116a(c7160ij) != null) {
            return c7299ki;
        }
        if (!c7160ij.m15356h()) {
            C7319kv m15363d = c7160ij.m15363d();
            if (!m15363d.m14822f()) {
                C7160ij m15361e = c7160ij.m15361e();
                if (m14883a.m14957a(m15363d)) {
                    AbstractC7344lh m15115a = c7241jc.m15115a(c7160ij, m14883a.m14955c(), c7299ki.m14879c().m14955c());
                    m15113a = m15115a != null ? m14883a.m14955c().mo14738c(m15363d).mo14749a(m15361e, m15115a) : m14883a.m14955c().mo14738c(m15363d);
                } else {
                    m15113a = c7241jc.m15113a(m15363d, c7299ki.m14879c());
                }
                mo14859a = m15113a != null ? this.f24445b.mo14859a(m14883a.m14954d(), m15363d, m15113a, m15361e, abstractC7310a, c7305kk) : m14883a.m14954d();
            } else if (!f24443a && c7160ij.m15355i() != 1) {
                throw new AssertionError("Can't have a priority with additional path components");
            } else {
                AbstractC7344lh m15115a2 = c7241jc.m15115a(c7160ij, m14883a.m14955c(), c7299ki.m14879c().m14955c());
                mo14859a = m15115a2 != null ? this.f24445b.mo14857a(m14883a.m14954d(), m15115a2) : m14883a.m14954d();
            }
        } else if (!f24443a && !c7299ki.m14879c().m14959a()) {
            throw new AssertionError("If change path is empty, we must have complete server data");
        } else {
            if (c7299ki.m14879c().m14956b()) {
                AbstractC7344lh m14878d = c7299ki.m14878d();
                if (!(m14878d instanceof C7322kw)) {
                    m14878d = C7335la.m14778j();
                }
                m15112a = c7241jc.m15108b(m14878d);
            } else {
                m15112a = c7241jc.m15112a(c7299ki.m14878d());
            }
            mo14859a = this.f24445b.mo14858a(c7299ki.m14883a().m14954d(), C7337lc.m14768a(m15112a, this.f24445b.mo14855b()), c7305kk);
        }
        return c7299ki.m14882a(mo14859a, m14883a.m14959a() || c7160ij.m15356h(), this.f24445b.mo14853c());
    }

    /* renamed from: a */
    private C7299ki m14873a(C7299ki c7299ki, C7160ij c7160ij, C7271ju<Boolean> c7271ju, C7241jc c7241jc, AbstractC7344lh abstractC7344lh, C7305kk c7305kk) {
        if (c7241jc.m15116a(c7160ij) != null) {
            return c7299ki;
        }
        boolean m14956b = c7299ki.m14879c().m14956b();
        C7282jy m14879c = c7299ki.m14879c();
        if (c7271ju.m14990b() == null) {
            C7142ia m15436a = C7142ia.m15436a();
            Iterator<Map.Entry<C7160ij, Boolean>> it2 = c7271ju.iterator();
            while (it2.hasNext()) {
                C7160ij key = it2.next().getKey();
                C7160ij m15370a = c7160ij.m15370a(key);
                if (m14879c.m14958a(m15370a)) {
                    m15436a = m15436a.m15432a(key, m14879c.m14955c().mo14750a(m15370a));
                }
            }
            return m14876a(c7299ki, c7160ij, m15436a, c7241jc, abstractC7344lh, m14956b, c7305kk);
        } else if ((c7160ij.m15356h() && m14879c.m14959a()) || m14879c.m14958a(c7160ij)) {
            return m14871a(c7299ki, c7160ij, m14879c.m14955c().mo14750a(c7160ij), c7241jc, abstractC7344lh, m14956b, c7305kk);
        } else {
            if (!c7160ij.m15356h()) {
                return c7299ki;
            }
            C7142ia m15436a2 = C7142ia.m15436a();
            for (C7343lg c7343lg : m14879c.m14955c()) {
                m15436a2 = m15436a2.m15431a(c7343lg.m14752c(), c7343lg.m14751d());
            }
            return m14876a(c7299ki, c7160ij, m15436a2, c7241jc, abstractC7344lh, m14956b, c7305kk);
        }
    }

    /* renamed from: a */
    private C7299ki m14872a(C7299ki c7299ki, C7160ij c7160ij, AbstractC7344lh abstractC7344lh, C7241jc c7241jc, AbstractC7344lh abstractC7344lh2, C7305kk c7305kk) {
        AbstractC7344lh mo14863a;
        C7282jy m14883a = c7299ki.m14883a();
        C7304b c7304b = new C7304b(c7241jc, c7299ki, abstractC7344lh2);
        if (c7160ij.m15356h()) {
            return c7299ki.m14882a(this.f24445b.mo14858a(c7299ki.m14883a().m14954d(), C7337lc.m14768a(abstractC7344lh, this.f24445b.mo14855b()), c7305kk), true, this.f24445b.mo14853c());
        }
        C7319kv m15363d = c7160ij.m15363d();
        if (m15363d.m14822f()) {
            return c7299ki.m14882a(this.f24445b.mo14857a(c7299ki.m14883a().m14954d(), abstractC7344lh), m14883a.m14959a(), m14883a.m14956b());
        }
        C7160ij m15361e = c7160ij.m15361e();
        AbstractC7344lh mo14738c = m14883a.m14955c().mo14738c(m15363d);
        if (m15361e.m15356h()) {
            mo14863a = abstractC7344lh;
        } else {
            mo14863a = c7304b.mo14863a(m15363d);
            if (mo14863a == null) {
                mo14863a = C7335la.m14778j();
            } else if (!m15361e.m15357g().m14822f() || !mo14863a.mo14750a(m15361e.m15359f()).mo14739b()) {
                mo14863a = mo14863a.mo14749a(m15361e, abstractC7344lh);
            }
        }
        return !mo14738c.equals(mo14863a) ? c7299ki.m14882a(this.f24445b.mo14859a(m14883a.m14954d(), m15363d, mo14863a, m15361e, c7304b, c7305kk), m14883a.m14959a(), this.f24445b.mo14853c()) : c7299ki;
    }

    /* renamed from: a */
    private C7299ki m14871a(C7299ki c7299ki, C7160ij c7160ij, AbstractC7344lh abstractC7344lh, C7241jc c7241jc, AbstractC7344lh abstractC7344lh2, boolean z, C7305kk c7305kk) {
        C7337lc mo14857a;
        C7282jy m14879c = c7299ki.m14879c();
        AbstractC7309ko mo14861a = z ? this.f24445b : this.f24445b.mo14861a();
        if (c7160ij.m15356h()) {
            mo14857a = mo14861a.mo14858a(m14879c.m14954d(), C7337lc.m14768a(abstractC7344lh, mo14861a.mo14855b()), null);
        } else if (!mo14861a.mo14853c() || m14879c.m14956b()) {
            C7319kv m15363d = c7160ij.m15363d();
            if (!m14879c.m14958a(c7160ij) && c7160ij.m15355i() > 1) {
                return c7299ki;
            }
            C7160ij m15361e = c7160ij.m15361e();
            AbstractC7344lh mo14749a = m14879c.m14955c().mo14738c(m15363d).mo14749a(m15361e, abstractC7344lh);
            mo14857a = m15363d.m14822f() ? mo14861a.mo14857a(m14879c.m14954d(), mo14749a) : mo14861a.mo14859a(m14879c.m14954d(), m15363d, mo14749a, m15361e, f24444c, null);
        } else if (!f24443a && c7160ij.m15356h()) {
            throw new AssertionError("An empty path should have been caught in the other branch");
        } else {
            C7319kv m15363d2 = c7160ij.m15363d();
            mo14857a = mo14861a.mo14858a(m14879c.m14954d(), m14879c.m14954d().m14772a(m15363d2, m14879c.m14955c().mo14738c(m15363d2).mo14749a(c7160ij.m15361e(), abstractC7344lh)), null);
        }
        C7299ki m14880b = c7299ki.m14880b(mo14857a, m14879c.m14959a() || c7160ij.m15356h(), mo14861a.mo14853c());
        return m14875a(m14880b, c7160ij, c7241jc, new C7304b(c7241jc, m14880b, abstractC7344lh2), c7305kk);
    }

    /* renamed from: a */
    private void m14869a(C7299ki c7299ki, C7299ki c7299ki2, List<C7285ka> list) {
        C7282jy m14883a = c7299ki2.m14883a();
        if (m14883a.m14959a()) {
            boolean z = m14883a.m14955c().mo14743e() || m14883a.m14955c().mo14739b();
            if (list.isEmpty() && c7299ki.m14883a().m14959a() && ((!z || m14883a.m14955c().equals(c7299ki.m14881b())) && m14883a.m14955c().mo14737f().equals(c7299ki.m14881b().mo14737f()))) {
                return;
            }
            list.add(C7285ka.m14946a(m14883a.m14954d()));
        }
    }

    /* renamed from: a */
    private static boolean m14868a(C7299ki c7299ki, C7319kv c7319kv) {
        return c7299ki.m14883a().m14957a(c7319kv);
    }

    /* renamed from: b */
    private C7299ki m14867b(C7299ki c7299ki, C7160ij c7160ij, C7241jc c7241jc, AbstractC7344lh abstractC7344lh, C7305kk c7305kk) {
        C7282jy m14879c = c7299ki.m14879c();
        return m14875a(c7299ki.m14880b(m14879c.m14954d(), m14879c.m14959a() || c7160ij.m15356h(), m14879c.m14956b()), c7160ij, c7241jc, f24444c, c7305kk);
    }

    /* renamed from: a */
    public C7299ki m14874a(C7299ki c7299ki, C7160ij c7160ij, C7241jc c7241jc, AbstractC7344lh abstractC7344lh, C7305kk c7305kk) {
        if (c7241jc.m15116a(c7160ij) != null) {
            return c7299ki;
        }
        C7304b c7304b = new C7304b(c7241jc, c7299ki, abstractC7344lh);
        C7337lc m14954d = c7299ki.m14883a().m14954d();
        if (c7160ij.m15356h() || c7160ij.m15363d().m14822f()) {
            m14954d = this.f24445b.mo14858a(m14954d, C7337lc.m14768a(c7299ki.m14879c().m14959a() ? c7241jc.m15112a(c7299ki.m14878d()) : c7241jc.m15108b(c7299ki.m14879c().m14955c()), this.f24445b.mo14855b()), c7305kk);
        } else {
            C7319kv m15363d = c7160ij.m15363d();
            AbstractC7344lh m15113a = c7241jc.m15113a(m15363d, c7299ki.m14879c());
            if (m15113a == null && c7299ki.m14879c().m14957a(m15363d)) {
                m15113a = m14954d.m14773a().mo14738c(m15363d);
            }
            if (m15113a != null) {
                m14954d = this.f24445b.mo14859a(m14954d, m15363d, m15113a, c7160ij.m15361e(), c7304b, c7305kk);
            } else if (m15113a == null && c7299ki.m14883a().m14955c().mo14741a(m15363d)) {
                m14954d = this.f24445b.mo14859a(m14954d, m15363d, C7335la.m14778j(), c7160ij.m15361e(), c7304b, c7305kk);
            }
            if (m14954d.m14773a().mo14739b() && c7299ki.m14879c().m14959a()) {
                AbstractC7344lh m15112a = c7241jc.m15112a(c7299ki.m14878d());
                if (m15112a.mo14743e()) {
                    m14954d = this.f24445b.mo14858a(m14954d, C7337lc.m14768a(m15112a, this.f24445b.mo14855b()), c7305kk);
                }
            }
        }
        return c7299ki.m14882a(m14954d, c7299ki.m14879c().m14959a() || c7241jc.m15116a(C7160ij.m15371a()) != null, this.f24445b.mo14853c());
    }

    /* renamed from: a */
    public C7303a m14870a(C7299ki c7299ki, AbstractC7246jh abstractC7246jh, C7241jc c7241jc, AbstractC7344lh abstractC7344lh) {
        C7299ki m14867b;
        C7305kk c7305kk = new C7305kk();
        switch (abstractC7246jh.m15097e()) {
            case Overwrite:
                C7250jj c7250jj = (C7250jj) abstractC7246jh;
                if (c7250jj.d().m15096a()) {
                    m14867b = m14872a(c7299ki, c7250jj.c(), c7250jj.m15091a(), c7241jc, abstractC7344lh, c7305kk);
                    break;
                } else if (!f24443a && !c7250jj.d().m15094b()) {
                    throw new AssertionError();
                } else {
                    m14867b = m14871a(c7299ki, c7250jj.c(), c7250jj.m15091a(), c7241jc, abstractC7344lh, c7250jj.d().m15093c() || (c7299ki.m14879c().m14956b() && !c7250jj.c().m15356h()), c7305kk);
                    break;
                }
            case Merge:
                C7245jg c7245jg = (C7245jg) abstractC7246jh;
                if (c7245jg.d().m15096a()) {
                    m14867b = m14877a(c7299ki, c7245jg.c(), c7245jg.m15100a(), c7241jc, abstractC7344lh, c7305kk);
                    break;
                } else if (!f24443a && !c7245jg.d().m15094b()) {
                    throw new AssertionError();
                } else {
                    m14867b = m14876a(c7299ki, c7245jg.c(), c7245jg.m15100a(), c7241jc, abstractC7344lh, c7245jg.d().m15093c() || c7299ki.m14879c().m14956b(), c7305kk);
                    break;
                }
                break;
            case AckUserWrite:
                C7243je c7243je = (C7243je) abstractC7246jh;
                if (c7243je.m15101b()) {
                    m14867b = m14874a(c7299ki, c7243je.c(), c7241jc, abstractC7344lh, c7305kk);
                    break;
                } else {
                    m14867b = m14873a(c7299ki, c7243je.c(), c7243je.m15102a(), c7241jc, abstractC7344lh, c7305kk);
                    break;
                }
            case ListenComplete:
                m14867b = m14867b(c7299ki, abstractC7246jh.m15099c(), c7241jc, abstractC7344lh, c7305kk);
                break;
            default:
                String valueOf = String.valueOf(abstractC7246jh.m15097e());
                throw new AssertionError(new StringBuilder(String.valueOf(valueOf).length() + 19).append("Unknown operation: ").append(valueOf).toString());
        }
        ArrayList arrayList = new ArrayList(c7305kk.m14866a());
        m14869a(c7299ki, m14867b, arrayList);
        return new C7303a(m14867b, arrayList);
    }
}
