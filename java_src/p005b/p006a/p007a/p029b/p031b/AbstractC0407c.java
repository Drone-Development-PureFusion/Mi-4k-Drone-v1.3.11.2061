package p005b.p006a.p007a.p029b.p031b;

import p005b.p006a.p007a.p029b.p055o.C0662f;
/* renamed from: b.a.a.b.b.c */
/* loaded from: classes.dex */
public abstract class AbstractC0407c<E> extends C0662f implements AbstractC0406b<E> {

    /* renamed from: b */
    String f486b;

    /* renamed from: c */
    boolean f487c;

    @Override // p005b.p006a.p007a.p029b.p031b.AbstractC0406b
    /* renamed from: a */
    public String mo39407a() {
        return this.f486b;
    }

    @Override // p005b.p006a.p007a.p029b.p031b.AbstractC0406b
    /* renamed from: b */
    public void mo39406b(String str) {
        if (this.f486b != null) {
            throw new IllegalStateException("name has been already set");
        }
        this.f486b = str;
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0669m
    /* renamed from: b_ */
    public boolean mo38480b_() {
        return this.f487c;
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0669m
    /* renamed from: j */
    public void mo38474j() {
        this.f487c = true;
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0669m
    /* renamed from: k */
    public void mo38473k() {
        this.f487c = false;
    }
}
