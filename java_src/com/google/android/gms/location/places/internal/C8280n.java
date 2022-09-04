package com.google.android.gms.location.places.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.location.places.AbstractC8240d;
import com.google.android.gms.location.places.AbstractC8243g;
/* renamed from: com.google.android.gms.location.places.internal.n */
/* loaded from: classes2.dex */
public class C8280n extends AbstractC8287t implements AbstractC8243g {
    public C8280n(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    @Override // com.google.android.gms.location.places.AbstractC8243g
    /* renamed from: c */
    public float mo12200c() {
        return a("place_likelihood", -1.0f);
    }

    @Override // com.google.android.gms.location.places.AbstractC8243g
    /* renamed from: d */
    public AbstractC8240d mo12199d() {
        return new C8285r(this.f16909c_, this.f16910d_);
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: e */
    public AbstractC8243g mo7785a() {
        return PlaceLikelihoodEntity.m12283a((PlaceEntity) mo12199d().a(), mo12200c());
    }
}
