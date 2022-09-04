package p005b.p006a.p007a.p008a.p026n;

import p005b.p006a.p007a.p008a.C0286f;
import p005b.p006a.p007a.p029b.AbstractC0427f;
import p005b.p006a.p007a.p029b.p055o.C0662f;
/* renamed from: b.a.a.a.n.h */
/* loaded from: classes.dex */
public class C0370h extends C0662f implements AbstractC0369g {
    /* renamed from: a */
    public C0286f m39566a() {
        return (C0286f) this.f1199s;
    }

    @Override // p005b.p006a.p007a.p008a.p026n.AbstractC0369g
    /* renamed from: a */
    public void mo39565a(C0286f c0286f) {
        super.mo38551a((AbstractC0427f) c0286f);
    }

    @Override // p005b.p006a.p007a.p029b.p055o.C0662f, p005b.p006a.p007a.p029b.p055o.AbstractC0661e
    /* renamed from: a */
    public void mo38551a(AbstractC0427f abstractC0427f) {
        if ((abstractC0427f instanceof C0286f) || abstractC0427f == null) {
            super.mo38551a(abstractC0427f);
            return;
        }
        throw new IllegalArgumentException("LoggerContextAwareBase only accepts contexts of type c.l.classic.LoggerContext");
    }
}
