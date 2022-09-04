package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.data.AbstractC4531j;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.AbstractC9464f;
import com.google.android.gms.wearable.AbstractC9466h;
/* renamed from: com.google.android.gms.wearable.internal.br */
/* loaded from: classes2.dex */
public final class C9592br extends AbstractC4531j implements AbstractC9464f {

    /* renamed from: c */
    private final int f30138c;

    public C9592br(DataHolder dataHolder, int i, int i2) {
        super(dataHolder, i);
        this.f30138c = i2;
    }

    @Override // com.google.android.gms.wearable.AbstractC9464f
    /* renamed from: c */
    public AbstractC9466h mo7800c() {
        return new C9597g(this.f16909c_, this.f16910d_, this.f30138c);
    }

    @Override // com.google.android.gms.wearable.AbstractC9464f
    /* renamed from: d */
    public int mo7799d() {
        return c("event_type");
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: e */
    public AbstractC9464f mo7785a() {
        return new C9591bq(this);
    }

    public String toString() {
        String str = mo7799d() == 1 ? "changed" : mo7799d() == 2 ? "deleted" : "unknown";
        String valueOf = String.valueOf(mo7800c());
        return new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(valueOf).length()).append("DataEventRef{ type=").append(str).append(", dataitem=").append(valueOf).append(" }").toString();
    }
}
