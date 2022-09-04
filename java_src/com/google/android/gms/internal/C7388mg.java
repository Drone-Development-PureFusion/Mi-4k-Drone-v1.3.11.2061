package com.google.android.gms.internal;
/* renamed from: com.google.android.gms.internal.mg */
/* loaded from: classes2.dex */
public class C7388mg implements AbstractC7381mc {

    /* renamed from: a */
    private final AbstractC7381mc f24609a;

    /* renamed from: b */
    private long f24610b;

    public C7388mg(AbstractC7381mc abstractC7381mc, long j) {
        this.f24610b = 0L;
        this.f24609a = abstractC7381mc;
        this.f24610b = j;
    }

    @Override // com.google.android.gms.internal.AbstractC7381mc
    /* renamed from: a */
    public long mo14618a() {
        return this.f24609a.mo14618a() + this.f24610b;
    }

    /* renamed from: a */
    public void m14617a(long j) {
        this.f24610b = j;
    }
}
