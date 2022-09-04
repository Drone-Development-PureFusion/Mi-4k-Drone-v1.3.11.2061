package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.b */
/* loaded from: classes2.dex */
public abstract class AbstractC8683b extends C8682al {

    /* renamed from: a */
    private boolean f27816a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC8683b(C8668aj c8668aj) {
        super(c8668aj);
        this.f27815n.m10719a(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean m10667a() {
        return this.f27816a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean m10666b() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public void m10665c() {
        if (!m10667a()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: d */
    public final void m10664d() {
        if (this.f27816a) {
            throw new IllegalStateException("Can't initialize twice");
        }
        mo10312e();
        this.f27815n.m10739J();
        this.f27816a = true;
    }

    /* renamed from: e */
    protected abstract void mo10312e();
}
