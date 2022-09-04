package com.google.android.gms.analytics.internal;
/* renamed from: com.google.android.gms.analytics.internal.t */
/* loaded from: classes2.dex */
public abstract class AbstractC3920t extends C3919s {

    /* renamed from: a */
    private boolean f15152a;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC3920t(C3922v c3922v) {
        super(c3922v);
    }

    /* renamed from: C */
    public boolean m26118C() {
        return this.f15152a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: D */
    public void m26117D() {
        if (!m26118C()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: E */
    public void m26116E() {
        mo26047a();
        this.f15152a = true;
    }

    /* renamed from: a */
    protected abstract void mo26047a();
}
