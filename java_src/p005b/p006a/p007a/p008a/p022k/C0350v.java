package p005b.p006a.p007a.p008a.p022k;

import p005b.p006a.p007a.p008a.p026n.AbstractC0366d;
/* renamed from: b.a.a.a.k.v */
/* loaded from: classes.dex */
public final class C0350v extends AbstractC0333e {

    /* renamed from: a */
    String f345a;

    @Override // p005b.p006a.p007a.p029b.p045i.AbstractC0566b
    /* renamed from: a */
    public String mo38694a(AbstractC0366d abstractC0366d) {
        if (this.f345a == null) {
            return "Property_HAS_NO_KEY";
        }
        String str = abstractC0366d.mo39533g().m39558b().get(this.f345a);
        return str == null ? System.getProperty(this.f345a) : str;
    }

    @Override // p005b.p006a.p007a.p029b.p045i.AbstractC0584d, p005b.p006a.p007a.p029b.p055o.AbstractC0669m
    /* renamed from: j */
    public void mo38474j() {
        String d = d();
        if (d != null) {
            this.f345a = d;
            super.j();
        }
    }
}
