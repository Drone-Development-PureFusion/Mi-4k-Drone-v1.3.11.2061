package p005b.p006a.p007a.p008a;

import p005b.p006a.p007a.p008a.p026n.AbstractC0366d;
import p005b.p006a.p007a.p029b.C0408c;
/* renamed from: b.a.a.a.a */
/* loaded from: classes.dex */
public class C0263a extends C0408c<AbstractC0366d> {

    /* renamed from: a */
    boolean f132a = false;

    /* renamed from: a */
    public void m39862a(boolean z) {
        this.f132a = z;
    }

    /* renamed from: a */
    public boolean m39864a() {
        return this.f132a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p005b.p006a.p007a.p029b.C0408c
    /* renamed from: a */
    public boolean mo39400b(AbstractC0366d abstractC0366d) {
        return abstractC0366d.mo39538b().m39804a() <= 20000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p005b.p006a.p007a.p029b.C0408c
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public void mo39403a_(AbstractC0366d abstractC0366d) {
        abstractC0366d.mo38531o();
        if (this.f132a) {
            abstractC0366d.mo39531i();
        }
    }
}
