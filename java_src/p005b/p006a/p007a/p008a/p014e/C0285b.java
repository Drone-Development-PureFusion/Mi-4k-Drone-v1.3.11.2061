package p005b.p006a.p007a.p008a.p014e;

import p005b.p006a.p007a.p008a.C0281d;
import p005b.p006a.p007a.p008a.p026n.AbstractC0366d;
import p005b.p006a.p007a.p029b.p033d.AbstractC0421c;
import p005b.p006a.p007a.p029b.p055o.EnumC0668l;
/* renamed from: b.a.a.a.e.b */
/* loaded from: classes.dex */
public class C0285b extends AbstractC0421c<AbstractC0366d> {

    /* renamed from: a */
    C0281d f230a;

    @Override // p005b.p006a.p007a.p029b.p033d.AbstractC0421c
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public EnumC0668l mo39358a(AbstractC0366d abstractC0366d) {
        if (b_() && !abstractC0366d.mo39538b().m39801a(this.f230a)) {
            return EnumC0668l.DENY;
        }
        return EnumC0668l.NEUTRAL;
    }

    /* renamed from: a */
    public void m39768a(String str) {
        this.f230a = C0281d.m39800a(str);
    }

    @Override // p005b.p006a.p007a.p029b.p033d.AbstractC0421c, p005b.p006a.p007a.p029b.p055o.AbstractC0669m
    /* renamed from: j */
    public void mo38474j() {
        if (this.f230a != null) {
            super.mo38474j();
        }
    }
}
