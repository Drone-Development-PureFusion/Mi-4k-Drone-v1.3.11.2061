package p005b.p006a.p007a.p029b.p036g.p040d;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.p356d.AbstractC11759f;
import p005b.p006a.p007a.p029b.AbstractC0427f;
import p005b.p006a.p007a.p029b.p036g.p037a.AbstractC0436c;
import p005b.p006a.p007a.p029b.p055o.C0662f;
import p005b.p006a.p007a.p029b.p058r.C0724u;
/* renamed from: b.a.a.b.g.d.q */
/* loaded from: classes.dex */
public class C0485q extends C0662f implements AbstractC0484p {

    /* renamed from: a */
    static String f665a = AbstractC11759f.f37104a;

    /* renamed from: b */
    HashMap<C0476h, List<AbstractC0436c>> f666b = new HashMap<>();

    public C0485q(AbstractC0427f abstractC0427f) {
        a(abstractC0427f);
    }

    /* renamed from: a */
    private boolean m39161a(C0476h c0476h) {
        return c0476h.e() > 1 && c0476h.a(0).equals(f665a);
    }

    /* renamed from: a */
    private boolean m39158a(String str) {
        return f665a.equals(str);
    }

    @Override // p005b.p006a.p007a.p029b.p036g.p040d.AbstractC0484p
    /* renamed from: a */
    public List<AbstractC0436c> mo39162a(C0475g c0475g) {
        List<AbstractC0436c> m39157b = m39157b(c0475g);
        if (m39157b != null) {
            return m39157b;
        }
        List<AbstractC0436c> m39156c = m39156c(c0475g);
        if (m39156c != null) {
            return m39156c;
        }
        List<AbstractC0436c> m39155d = m39155d(c0475g);
        if (m39155d != null) {
            return m39155d;
        }
        List<AbstractC0436c> m39154e = m39154e(c0475g);
        if (m39154e != null) {
            return m39154e;
        }
        return null;
    }

    @Override // p005b.p006a.p007a.p029b.p036g.p040d.AbstractC0484p
    /* renamed from: a */
    public void mo39160a(C0476h c0476h, AbstractC0436c abstractC0436c) {
        abstractC0436c.a(this.f1199s);
        List<AbstractC0436c> list = this.f666b.get(c0476h);
        if (list == null) {
            list = new ArrayList<>();
            this.f666b.put(c0476h, list);
        }
        list.add(abstractC0436c);
    }

    @Override // p005b.p006a.p007a.p029b.p036g.p040d.AbstractC0484p
    /* renamed from: a */
    public void mo39159a(C0476h c0476h, String str) {
        AbstractC0436c abstractC0436c;
        try {
            abstractC0436c = (AbstractC0436c) C0724u.m38382a(str, AbstractC0436c.class, this.f1199s);
        } catch (Exception e) {
            a("Could not instantiate class [" + str + "]", e);
            abstractC0436c = null;
        }
        if (abstractC0436c != null) {
            mo39160a(c0476h, abstractC0436c);
        }
    }

    /* renamed from: b */
    List<AbstractC0436c> m39157b(C0475g c0475g) {
        for (C0476h c0476h : this.f666b.keySet()) {
            if (c0476h.m39213a(c0475g)) {
                return this.f666b.get(c0476h);
            }
        }
        return null;
    }

    /* renamed from: c */
    List<AbstractC0436c> m39156c(C0475g c0475g) {
        int i;
        int m39211b;
        int i2 = 0;
        C0476h c0476h = null;
        for (C0476h c0476h2 : this.f666b.keySet()) {
            if (!m39161a(c0476h2) || (m39211b = c0476h2.m39211b(c0475g)) <= i2) {
                c0476h2 = c0476h;
                i = i2;
            } else {
                i = m39211b;
            }
            i2 = i;
            c0476h = c0476h2;
        }
        if (c0476h != null) {
            return this.f666b.get(c0476h);
        }
        return null;
    }

    /* renamed from: d */
    List<AbstractC0436c> m39155d(C0475g c0475g) {
        int i;
        int m39209d;
        int i2 = 0;
        C0476h c0476h = null;
        for (C0476h c0476h2 : this.f666b.keySet()) {
            if (!m39158a(c0476h2.d()) || (m39209d = c0476h2.m39209d(c0475g)) != c0476h2.e() - 1 || m39209d <= i2) {
                c0476h2 = c0476h;
                i = i2;
            } else {
                i = m39209d;
            }
            i2 = i;
            c0476h = c0476h2;
        }
        if (c0476h != null) {
            return this.f666b.get(c0476h);
        }
        return null;
    }

    /* renamed from: e */
    List<AbstractC0436c> m39154e(C0475g c0475g) {
        int i;
        C0476h c0476h = null;
        int i2 = 0;
        for (C0476h c0476h2 : this.f666b.keySet()) {
            String d = c0476h2.d();
            String a = c0476h2.e() > 1 ? c0476h2.a(0) : null;
            if (m39158a(d) && m39158a(a)) {
                List<String> b = c0476h2.b();
                if (b.size() > 2) {
                    b.remove(0);
                    b.remove(b.size() - 1);
                }
                C0476h c0476h3 = new C0476h(b);
                int e = c0476h3.m39210c(c0475g) ? c0476h3.e() : 0;
                if (e > i2) {
                    i = e;
                    i2 = i;
                    c0476h = c0476h2;
                }
            }
            c0476h2 = c0476h;
            i = i2;
            i2 = i;
            c0476h = c0476h2;
        }
        if (c0476h != null) {
            return this.f666b.get(c0476h);
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SimpleRuleStore ( ").append("rules = ").append(this.f666b).append("  ").append(" )");
        return sb.toString();
    }
}
