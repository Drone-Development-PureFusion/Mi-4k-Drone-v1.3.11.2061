package p005b.p006a.p007a.p008a.p022k;

import p005b.p006a.p007a.p008a.p026n.AbstractC0366d;
/* renamed from: b.a.a.a.k.t */
/* loaded from: classes.dex */
public abstract class AbstractC0348t extends AbstractC0333e {

    /* renamed from: a */
    AbstractC0325a f344a = null;

    /* renamed from: a */
    protected abstract String mo39607a(AbstractC0366d abstractC0366d);

    @Override // p005b.p006a.p007a.p029b.p045i.AbstractC0566b
    /* renamed from: b */
    public String mo38694a(AbstractC0366d abstractC0366d) {
        String mo39607a = mo39607a(abstractC0366d);
        return this.f344a == null ? mo39607a : this.f344a.mo39598a(mo39607a);
    }

    @Override // p005b.p006a.p007a.p029b.p045i.AbstractC0584d, p005b.p006a.p007a.p029b.p055o.AbstractC0669m
    /* renamed from: j */
    public void mo38474j() {
        String d = d();
        if (d != null) {
            try {
                int parseInt = Integer.parseInt(d);
                if (parseInt == 0) {
                    this.f344a = new C0331c();
                } else if (parseInt > 0) {
                    this.f344a = new C0354z(parseInt);
                }
            } catch (NumberFormatException e) {
            }
        }
    }
}
