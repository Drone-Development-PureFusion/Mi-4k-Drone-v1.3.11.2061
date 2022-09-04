package com.google.android.gms.location.places;

import com.google.android.gms.common.api.AbstractC4502m;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.AbstractC4521a;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.location.places.internal.C8250b;
/* renamed from: com.google.android.gms.location.places.b */
/* loaded from: classes2.dex */
public class C8238b extends AbstractC4521a<AbstractC8237a> implements AbstractC4502m {
    public C8238b(DataHolder dataHolder) {
        super(dataHolder);
    }

    @Override // com.google.android.gms.common.api.AbstractC4502m
    /* renamed from: a */
    public Status mo7645a() {
        return C8295n.m12143c(this.f16904a.m23883e());
    }

    @Override // com.google.android.gms.common.data.AbstractC4521a, com.google.android.gms.common.data.AbstractC4522b
    /* renamed from: b */
    public AbstractC8237a mo9715a(int i) {
        return new C8250b(this.f16904a, i);
    }

    public String toString() {
        return C4585c.m23635a(this).m23632a("status", mo7645a()).toString();
    }
}
