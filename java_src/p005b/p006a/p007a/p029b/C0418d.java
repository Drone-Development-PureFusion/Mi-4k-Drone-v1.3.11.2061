package p005b.p006a.p007a.p029b;

import java.util.ArrayList;
import java.util.List;
import p005b.p006a.p007a.p029b.p034e.C0423a;
import p005b.p006a.p007a.p029b.p055o.C0670n;
import p005b.p006a.p007a.p029b.p056p.AbstractC0682g;
import p005b.p006a.p007a.p029b.p056p.AbstractC0684i;
import p005b.p006a.p007a.p029b.p056p.AbstractC0686k;
import p005b.p006a.p007a.p029b.p056p.C0688m;
/* renamed from: b.a.a.b.d */
/* loaded from: classes.dex */
public class C0418d implements AbstractC0686k {

    /* renamed from: a */
    public static final int f509a = 150;

    /* renamed from: b */
    public static final int f510b = 150;

    /* renamed from: c */
    int f511c = 0;

    /* renamed from: d */
    protected final List<AbstractC0682g> f512d = new ArrayList();

    /* renamed from: e */
    protected final C0423a<AbstractC0682g> f513e = new C0423a<>(150);

    /* renamed from: f */
    protected final C0670n f514f = new C0670n();

    /* renamed from: g */
    int f515g = 0;

    /* renamed from: h */
    protected final List<AbstractC0684i> f516h = new ArrayList();

    /* renamed from: i */
    protected final C0670n f517i = new C0670n();

    /* renamed from: b */
    private void m39366b(AbstractC0682g abstractC0682g) {
        synchronized (this.f517i) {
            for (AbstractC0684i abstractC0684i : this.f516h) {
                abstractC0684i.mo38508a_(abstractC0682g);
            }
        }
    }

    @Override // p005b.p006a.p007a.p029b.p056p.AbstractC0686k
    /* renamed from: a */
    public List<AbstractC0682g> mo38507a() {
        ArrayList arrayList;
        synchronized (this.f514f) {
            arrayList = new ArrayList(this.f512d);
            arrayList.addAll(this.f513e.m39345d());
        }
        return arrayList;
    }

    @Override // p005b.p006a.p007a.p029b.p056p.AbstractC0686k
    /* renamed from: a */
    public void mo38506a(AbstractC0682g abstractC0682g) {
        m39366b(abstractC0682g);
        this.f511c++;
        if (abstractC0682g.mo38519a() > this.f515g) {
            this.f515g = abstractC0682g.mo38519a();
        }
        synchronized (this.f514f) {
            if (this.f512d.size() < 150) {
                this.f512d.add(abstractC0682g);
            } else {
                this.f513e.m39350a((C0423a<AbstractC0682g>) abstractC0682g);
            }
        }
    }

    @Override // p005b.p006a.p007a.p029b.p056p.AbstractC0686k
    /* renamed from: a */
    public void mo38505a(AbstractC0684i abstractC0684i) {
        synchronized (this.f517i) {
            this.f516h.add(abstractC0684i);
        }
    }

    @Override // p005b.p006a.p007a.p029b.p056p.AbstractC0686k
    /* renamed from: a */
    public boolean mo38504a(AbstractC0684i abstractC0684i, Object obj) {
        for (AbstractC0684i abstractC0684i2 : mo38500e()) {
            if (abstractC0684i2.getClass().isInstance(abstractC0684i)) {
                mo38506a(new C0688m("A previous listener of type [" + abstractC0684i2.getClass() + "] has been already registered. Skipping double registration.", obj));
                return false;
            }
        }
        mo38505a(abstractC0684i);
        return true;
    }

    @Override // p005b.p006a.p007a.p029b.p056p.AbstractC0686k
    /* renamed from: b */
    public void mo38503b() {
        synchronized (this.f514f) {
            this.f511c = 0;
            this.f512d.clear();
            this.f513e.m39352a();
        }
    }

    @Override // p005b.p006a.p007a.p029b.p056p.AbstractC0686k
    /* renamed from: b */
    public void mo38502b(AbstractC0684i abstractC0684i) {
        synchronized (this.f517i) {
            this.f516h.remove(abstractC0684i);
        }
    }

    /* renamed from: c */
    public int m39365c() {
        return this.f515g;
    }

    @Override // p005b.p006a.p007a.p029b.p056p.AbstractC0686k
    /* renamed from: d */
    public int mo38501d() {
        return this.f511c;
    }

    @Override // p005b.p006a.p007a.p029b.p056p.AbstractC0686k
    /* renamed from: e */
    public List<AbstractC0684i> mo38500e() {
        ArrayList arrayList;
        synchronized (this.f517i) {
            arrayList = new ArrayList(this.f516h);
        }
        return arrayList;
    }
}
