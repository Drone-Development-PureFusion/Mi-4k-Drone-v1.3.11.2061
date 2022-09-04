package p005b.p006a.p007a.p008a.p020j;

import p005b.p006a.p007a.p029b.p055o.AbstractC0669m;
import p005b.p006a.p007a.p029b.p055o.C0662f;
/* renamed from: b.a.a.a.j.b */
/* loaded from: classes.dex */
public abstract class AbstractC0315b extends C0662f implements AbstractC0669m {

    /* renamed from: a */
    private boolean f290a;

    /* renamed from: a */
    protected abstract boolean mo39655a();

    /* renamed from: b */
    protected abstract void mo39649b();

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0669m
    /* renamed from: b_ */
    public final boolean mo38480b_() {
        return this.f290a;
    }

    /* renamed from: d */
    protected abstract Runnable mo39645d();

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0669m
    /* renamed from: j */
    public final void mo38474j() {
        if (mo38480b_()) {
            return;
        }
        if (c_() == null) {
            throw new IllegalStateException("context not set");
        }
        if (!mo39655a()) {
            return;
        }
        c_().mo39311s().execute(mo39645d());
        this.f290a = true;
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0669m
    /* renamed from: k */
    public final void mo38473k() {
        if (!mo38480b_()) {
            return;
        }
        try {
            mo39649b();
        } catch (RuntimeException e) {
            a("on stop: " + e, e);
        }
        this.f290a = false;
    }
}
