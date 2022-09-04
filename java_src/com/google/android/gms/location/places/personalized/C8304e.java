package com.google.android.gms.location.places.personalized;

import com.google.android.gms.common.api.AbstractC4502m;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.C4532k;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.location.places.C8295n;
@Deprecated
/* renamed from: com.google.android.gms.location.places.personalized.e */
/* loaded from: classes.dex */
public final class C8304e extends C4532k<PlaceUserData> implements AbstractC4502m {

    /* renamed from: b */
    private final Status f27188b;

    public C8304e(DataHolder dataHolder) {
        this(dataHolder, C8295n.m12143c(dataHolder.m23883e()));
    }

    private C8304e(DataHolder dataHolder, Status status) {
        super(dataHolder, PlaceUserData.CREATOR);
        C4588d.m23619b(dataHolder == null || dataHolder.m23883e() == status.m24015i());
        this.f27188b = status;
    }

    @Override // com.google.android.gms.common.api.AbstractC4502m
    /* renamed from: a */
    public Status mo7645a() {
        return this.f27188b;
    }
}
