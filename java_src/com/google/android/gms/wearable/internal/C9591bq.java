package com.google.android.gms.wearable.internal;

import com.google.android.gms.wearable.AbstractC9464f;
import com.google.android.gms.wearable.AbstractC9466h;
/* renamed from: com.google.android.gms.wearable.internal.bq */
/* loaded from: classes2.dex */
public class C9591bq implements AbstractC9464f {

    /* renamed from: c */
    private int f30136c;

    /* renamed from: d */
    private AbstractC9466h f30137d;

    public C9591bq(AbstractC9464f abstractC9464f) {
        this.f30136c = abstractC9464f.mo7799d();
        this.f30137d = abstractC9464f.mo7800c().a();
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: b */
    public boolean mo7790b() {
        return true;
    }

    @Override // com.google.android.gms.wearable.AbstractC9464f
    /* renamed from: c */
    public AbstractC9466h mo7800c() {
        return this.f30137d;
    }

    @Override // com.google.android.gms.wearable.AbstractC9464f
    /* renamed from: d */
    public int mo7799d() {
        return this.f30136c;
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: e */
    public AbstractC9464f mo7785a() {
        return this;
    }

    public String toString() {
        String str = mo7799d() == 1 ? "changed" : mo7799d() == 2 ? "deleted" : "unknown";
        String valueOf = String.valueOf(mo7800c());
        return new StringBuilder(String.valueOf(str).length() + 35 + String.valueOf(valueOf).length()).append("DataEventEntity{ type=").append(str).append(", dataitem=").append(valueOf).append(" }").toString();
    }
}
