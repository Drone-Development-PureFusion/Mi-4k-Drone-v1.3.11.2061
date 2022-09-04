package p005b.p006a.p007a.p008a.p027o;

import org.p356d.AbstractC11759f;
import org.p356d.C11760g;
import p005b.p006a.p007a.p008a.C0281d;
import p005b.p006a.p007a.p008a.C0283e;
import p005b.p006a.p007a.p029b.p055o.EnumC0668l;
/* renamed from: b.a.a.a.o.f */
/* loaded from: classes.dex */
public class C0388f extends AbstractC0389g {

    /* renamed from: a */
    AbstractC11759f f444a;

    @Override // p005b.p006a.p007a.p008a.p027o.AbstractC0392i
    /* renamed from: a */
    public EnumC0668l mo39443a(AbstractC11759f abstractC11759f, C0283e c0283e, C0281d c0281d, String str, Object[] objArr, Throwable th) {
        if (!b_()) {
            return EnumC0668l.NEUTRAL;
        }
        if (abstractC11759f != null && abstractC11759f.mo5c(this.f444a)) {
            return this.f445c;
        }
        return this.f446d;
    }

    /* renamed from: a */
    public void m39462a(String str) {
        if (str != null) {
            this.f444a = C11760g.m2a(str);
        }
    }

    @Override // p005b.p006a.p007a.p008a.p027o.AbstractC0392i, p005b.p006a.p007a.p029b.p055o.AbstractC0669m
    /* renamed from: j */
    public void mo38474j() {
        if (this.f444a != null) {
            super.j();
        } else {
            c("The marker property must be set for [" + f() + "]");
        }
    }
}
