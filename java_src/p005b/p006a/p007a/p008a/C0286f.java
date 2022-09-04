package p005b.p006a.p007a.p008a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.p356d.AbstractC11724a;
import org.p356d.AbstractC11747c;
import org.p356d.AbstractC11759f;
import p005b.p006a.p007a.p008a.p009a.C0266b;
import p005b.p006a.p007a.p008a.p026n.AbstractC0371i;
import p005b.p006a.p007a.p008a.p026n.C0368f;
import p005b.p006a.p007a.p008a.p026n.C0372j;
import p005b.p006a.p007a.p008a.p026n.C0382t;
import p005b.p006a.p007a.p008a.p027o.AbstractC0392i;
import p005b.p006a.p007a.p008a.p028p.C0399g;
import p005b.p006a.p007a.p029b.C0432g;
import p005b.p006a.p007a.p029b.C0494h;
import p005b.p006a.p007a.p029b.p036g.p040d.C0481m;
import p005b.p006a.p007a.p029b.p055o.AbstractC0669m;
import p005b.p006a.p007a.p029b.p055o.EnumC0668l;
import p005b.p006a.p007a.p029b.p056p.AbstractC0684i;
import p005b.p006a.p007a.p029b.p056p.AbstractC0686k;
import p005b.p006a.p007a.p029b.p056p.C0688m;
/* renamed from: b.a.a.a.f */
/* loaded from: classes.dex */
public class C0286f extends C0432g implements AbstractC0669m, AbstractC11724a {

    /* renamed from: g */
    private int f234g = 0;

    /* renamed from: h */
    private final List<AbstractC0371i> f235h = new ArrayList();

    /* renamed from: k */
    private final C0382t f238k = new C0382t();

    /* renamed from: l */
    private boolean f239l = true;

    /* renamed from: m */
    private boolean f240m = false;

    /* renamed from: n */
    private int f241n = 8;

    /* renamed from: b */
    int f232b = 0;

    /* renamed from: i */
    private Map<String, C0283e> f236i = new ConcurrentHashMap();

    /* renamed from: j */
    private C0372j f237j = new C0372j(this);

    /* renamed from: a */
    final C0283e f231a = new C0283e(AbstractC11747c.f37061c, null, this);

    /* renamed from: f */
    private int f233f = 1;

    /* renamed from: o */
    private List<String> f242o = new ArrayList();

    public C0286f() {
        this.f231a.m39792a(C0281d.f214s);
        this.f236i.put(AbstractC11747c.f37061c, this.f231a);
        m39765a();
    }

    /* renamed from: A */
    private void m39767A() {
        for (AbstractC0371i abstractC0371i : this.f235h) {
            abstractC0371i.mo39562a(this);
        }
    }

    /* renamed from: B */
    private void m39766B() {
        for (AbstractC0371i abstractC0371i : this.f235h) {
            abstractC0371i.mo39560c(this);
        }
    }

    /* renamed from: g */
    private boolean m39746g(String str) {
        return str.equals(C0494h.f698S) || str.equals(C0494h.f699T) || str.equals(C0494h.f700U) || str.equals(C0494h.f697R) || str.equals(C0494h.f696Q);
    }

    /* renamed from: u */
    private void m39741u() {
        this.f237j = new C0372j(this);
    }

    /* renamed from: v */
    private void m39740v() {
        this.f233f++;
    }

    /* renamed from: w */
    private void m39739w() {
        AbstractC0686k n = n();
        for (AbstractC0684i abstractC0684i : n.mo38500e()) {
            n.mo38502b(abstractC0684i);
        }
    }

    /* renamed from: x */
    private void m39738x() {
        ArrayList arrayList = new ArrayList();
        for (AbstractC0371i abstractC0371i : this.f235h) {
            if (abstractC0371i.mo39564a()) {
                arrayList.add(abstractC0371i);
            }
        }
        this.f235h.retainAll(arrayList);
    }

    /* renamed from: y */
    private void m39737y() {
        this.f235h.clear();
    }

    /* renamed from: z */
    private void m39736z() {
        for (AbstractC0371i abstractC0371i : this.f235h) {
            abstractC0371i.mo39561b(this);
        }
    }

    /* renamed from: a */
    public final C0283e m39759a(Class cls) {
        return mo126e(cls.getName());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final EnumC0668l m39758a(AbstractC11759f abstractC11759f, C0283e c0283e, C0281d c0281d, String str, Object obj, Object obj2, Throwable th) {
        return this.f238k.size() == 0 ? EnumC0668l.NEUTRAL : this.f238k.m39483a(abstractC11759f, c0283e, c0281d, str, new Object[]{obj, obj2}, th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final EnumC0668l m39757a(AbstractC11759f abstractC11759f, C0283e c0283e, C0281d c0281d, String str, Object obj, Throwable th) {
        return this.f238k.size() == 0 ? EnumC0668l.NEUTRAL : this.f238k.m39483a(abstractC11759f, c0283e, c0281d, str, new Object[]{obj}, th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final EnumC0668l m39756a(AbstractC11759f abstractC11759f, C0283e c0283e, C0281d c0281d, String str, Object[] objArr, Throwable th) {
        return this.f238k.size() == 0 ? EnumC0668l.NEUTRAL : this.f238k.m39483a(abstractC11759f, c0283e, c0281d, str, objArr, th);
    }

    @Override // p005b.p006a.p007a.p029b.C0432g, p005b.p006a.p007a.p029b.AbstractC0427f, p005b.p006a.p007a.p029b.p055o.AbstractC0672p
    /* renamed from: a */
    public String mo38529a(String str) {
        if (m39746g(str)) {
            try {
                if (!this.f240m) {
                    this.f240m = true;
                    C0266b.m39846a(this);
                }
            } catch (C0481m e) {
                n().mo38506a(new C0688m("Can't set manifest properties", e));
                this.f240m = false;
            }
        }
        return super.mo38529a(str);
    }

    /* renamed from: a */
    void m39765a() {
        a(C0494h.f724l, new HashMap());
    }

    /* renamed from: a */
    public void m39764a(int i) {
        this.f241n = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m39763a(C0283e c0283e) {
        int i = this.f234g;
        this.f234g = i + 1;
        if (i == 0) {
            n().mo38506a(new C0688m("No appenders present in context [" + p() + "] for logger [" + c0283e.mo88d() + "].", c0283e));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m39762a(C0283e c0283e, C0281d c0281d) {
        for (AbstractC0371i abstractC0371i : this.f235h) {
            abstractC0371i.mo39563a(c0283e, c0281d);
        }
    }

    /* renamed from: a */
    public void m39761a(AbstractC0371i abstractC0371i) {
        this.f235h.add(abstractC0371i);
    }

    /* renamed from: a */
    public void m39760a(AbstractC0392i abstractC0392i) {
        this.f238k.add(abstractC0392i);
    }

    @Override // p005b.p006a.p007a.p029b.C0432g, p005b.p006a.p007a.p029b.AbstractC0427f
    /* renamed from: a */
    public void mo39319a(String str, String str2) {
        super.mo39319a(str, str2);
        m39741u();
    }

    /* renamed from: a */
    public void m39755a(boolean z) {
        this.f239l = z;
    }

    /* renamed from: b */
    int m39754b() {
        return this.f233f;
    }

    /* renamed from: b */
    public void m39753b(AbstractC0371i abstractC0371i) {
        this.f235h.remove(abstractC0371i);
    }

    @Override // p005b.p006a.p007a.p029b.C0432g, p005b.p006a.p007a.p029b.AbstractC0427f
    /* renamed from: b */
    public void mo39318b(String str) {
        super.mo39318b(str);
        m39741u();
    }

    @Override // org.p356d.AbstractC11724a
    /* renamed from: c */
    public final C0283e mo126e(String str) {
        C0283e c0283e;
        if (str == null) {
            throw new IllegalArgumentException("name argument cannot be null");
        }
        if (AbstractC11747c.f37061c.equalsIgnoreCase(str)) {
            return this.f231a;
        }
        C0283e c0283e2 = this.f231a;
        C0283e c0283e3 = this.f236i.get(str);
        if (c0283e3 != null) {
            return c0283e3;
        }
        C0283e c0283e4 = c0283e2;
        int i = 0;
        while (true) {
            int m39422a = C0399g.m39422a(str, i);
            String substring = m39422a == -1 ? str : str.substring(0, m39422a);
            int i2 = m39422a + 1;
            synchronized (c0283e4) {
                C0283e m39790a = c0283e4.m39790a(substring);
                if (m39790a == null) {
                    m39790a = c0283e4.m39777e(substring);
                    this.f236i.put(substring, m39790a);
                    m39740v();
                }
                c0283e = m39790a;
            }
            if (m39422a == -1) {
                return c0283e;
            }
            c0283e4 = c0283e;
            i = i2;
        }
    }

    /* renamed from: c */
    public List<C0283e> m39752c() {
        ArrayList arrayList = new ArrayList(this.f236i.values());
        Collections.sort(arrayList, new C0368f());
        return arrayList;
    }

    /* renamed from: d */
    public C0283e m39749d(String str) {
        return this.f236i.get(str);
    }

    /* renamed from: d */
    public C0372j m39750d() {
        return this.f237j;
    }

    /* renamed from: e */
    public boolean m39748e() {
        return this.f239l;
    }

    @Override // p005b.p006a.p007a.p029b.C0432g
    /* renamed from: f */
    public void mo39317f() {
        this.f232b++;
        super.mo39317f();
        m39765a();
        this.f231a.m39776g();
        m39745h();
        m39736z();
        m39738x();
        m39739w();
    }

    /* renamed from: g */
    public C0382t m39747g() {
        return this.f238k;
    }

    /* renamed from: h */
    public void m39745h() {
        Iterator<AbstractC0392i> it2 = this.f238k.iterator();
        while (it2.hasNext()) {
            it2.next().mo38473k();
        }
        this.f238k.clear();
    }

    /* renamed from: i */
    public List<AbstractC0371i> m39744i() {
        return new ArrayList(this.f235h);
    }

    @Override // p005b.p006a.p007a.p029b.C0432g, p005b.p006a.p007a.p029b.p055o.AbstractC0669m
    /* renamed from: j */
    public void mo38474j() {
        super.mo38474j();
        m39767A();
    }

    @Override // p005b.p006a.p007a.p029b.C0432g, p005b.p006a.p007a.p029b.p055o.AbstractC0669m
    /* renamed from: k */
    public void mo38473k() {
        mo39317f();
        m39766B();
        m39737y();
        super.mo38473k();
    }

    /* renamed from: l */
    public int m39743l() {
        return this.f241n;
    }

    /* renamed from: m */
    public List<String> m39742m() {
        return this.f242o;
    }

    @Override // p005b.p006a.p007a.p029b.C0432g
    public String toString() {
        return getClass().getName() + "[" + p() + "]";
    }
}
