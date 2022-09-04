package p005b.p006a.p007a.p029b.p033d;

import p005b.p006a.p007a.p029b.p031b.AbstractC0406b;
import p005b.p006a.p007a.p029b.p031b.C0405a;
import p005b.p006a.p007a.p029b.p055o.EnumC0668l;
/* renamed from: b.a.a.b.d.b */
/* loaded from: classes.dex */
public class C0420b<E> extends AbstractC0419a<E> {

    /* renamed from: a */
    AbstractC0406b<E> f520a;

    @Override // p005b.p006a.p007a.p029b.p033d.AbstractC0421c
    /* renamed from: a */
    public EnumC0668l mo39358a(E e) {
        if (!b_() || !this.f520a.b_()) {
            return EnumC0668l.NEUTRAL;
        }
        try {
            return this.f520a.mo39408a((AbstractC0406b<E>) e) ? this.f518b : this.f519c;
        } catch (C0405a e2) {
            a("Evaluator " + this.f520a.mo39407a() + " threw an exception", e2);
            return EnumC0668l.NEUTRAL;
        }
    }

    /* renamed from: a */
    public void m39360a(AbstractC0406b<E> abstractC0406b) {
        this.f520a = abstractC0406b;
    }

    /* renamed from: d */
    public AbstractC0406b<E> m39359d() {
        return this.f520a;
    }

    @Override // p005b.p006a.p007a.p029b.p033d.AbstractC0421c, p005b.p006a.p007a.p029b.p055o.AbstractC0669m
    /* renamed from: j */
    public void mo38474j() {
        if (this.f520a != null) {
            super.j();
        } else {
            c("No evaluator set for filter " + e());
        }
    }
}
