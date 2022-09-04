package com.google.android.gms.internal;
/* renamed from: com.google.android.gms.internal.jn */
/* loaded from: classes2.dex */
public class C7255jn implements AbstractC7251jk {

    /* renamed from: b */
    public final long f24344b;

    public C7255jn(long j) {
        this.f24344b = j;
    }

    @Override // com.google.android.gms.internal.AbstractC7251jk
    /* renamed from: a */
    public float mo15086a() {
        return 0.2f;
    }

    @Override // com.google.android.gms.internal.AbstractC7251jk
    /* renamed from: a */
    public boolean mo15085a(long j) {
        return j > 1000;
    }

    @Override // com.google.android.gms.internal.AbstractC7251jk
    /* renamed from: a */
    public boolean mo15084a(long j, long j2) {
        return j > this.f24344b || j2 > 1000;
    }

    @Override // com.google.android.gms.internal.AbstractC7251jk
    /* renamed from: b */
    public long mo15083b() {
        return 1000L;
    }
}
