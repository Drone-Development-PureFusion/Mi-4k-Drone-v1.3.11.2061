package p005b.p006a.p007a.p029b.p050k;

import p005b.p006a.p007a.p029b.AbstractC0404b;
import p005b.p006a.p007a.p029b.p034e.C0423a;
/* renamed from: b.a.a.b.k.a */
/* loaded from: classes.dex */
public class C0598a<E> extends AbstractC0404b<E> {

    /* renamed from: a */
    C0423a<E> f1031a;

    /* renamed from: b */
    int f1032b = 512;

    /* renamed from: a */
    public int m38759a() {
        if (b_()) {
            return this.f1031a.m39344e();
        }
        return 0;
    }

    /* renamed from: a */
    public E m38758a(int i) {
        if (b_()) {
            return this.f1031a.m39351a(i);
        }
        return null;
    }

    @Override // p005b.p006a.p007a.p029b.AbstractC0404b
    /* renamed from: a */
    protected void mo38607a(E e) {
        if (!b_()) {
            return;
        }
        this.f1031a.m39350a((C0423a<E>) e);
    }

    /* renamed from: b */
    public void m38757b() {
        this.f1031a.m39352a();
    }

    /* renamed from: b */
    public void m38756b(int i) {
        this.f1032b = i;
    }

    /* renamed from: d */
    public int m38755d() {
        return this.f1032b;
    }

    @Override // p005b.p006a.p007a.p029b.AbstractC0404b, p005b.p006a.p007a.p029b.p055o.AbstractC0669m
    /* renamed from: j */
    public void mo38474j() {
        this.f1031a = new C0423a<>(this.f1032b);
        super.mo38474j();
    }

    @Override // p005b.p006a.p007a.p029b.AbstractC0404b, p005b.p006a.p007a.p029b.p055o.AbstractC0669m
    /* renamed from: k */
    public void mo38473k() {
        this.f1031a = null;
        super.mo38473k();
    }
}
