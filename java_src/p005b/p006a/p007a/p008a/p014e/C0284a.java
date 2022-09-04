package p005b.p006a.p007a.p008a.p014e;

import p005b.p006a.p007a.p008a.C0281d;
import p005b.p006a.p007a.p008a.p026n.AbstractC0366d;
import p005b.p006a.p007a.p029b.p033d.AbstractC0419a;
import p005b.p006a.p007a.p029b.p055o.EnumC0668l;
/* renamed from: b.a.a.a.e.a */
/* loaded from: classes.dex */
public class C0284a extends AbstractC0419a<AbstractC0366d> {

    /* renamed from: a */
    C0281d f229a;

    @Override // p005b.p006a.p007a.p029b.p033d.AbstractC0421c
    /* renamed from: a */
    public EnumC0668l mo39358a(AbstractC0366d abstractC0366d) {
        return !b_() ? EnumC0668l.NEUTRAL : abstractC0366d.mo39538b().equals(this.f229a) ? this.f518b : this.f519c;
    }

    /* renamed from: a */
    public void m39771a(C0281d c0281d) {
        this.f229a = c0281d;
    }

    @Override // p005b.p006a.p007a.p029b.p033d.AbstractC0421c, p005b.p006a.p007a.p029b.p055o.AbstractC0669m
    /* renamed from: j */
    public void mo38474j() {
        if (this.f229a != null) {
            super.j();
        }
    }
}
