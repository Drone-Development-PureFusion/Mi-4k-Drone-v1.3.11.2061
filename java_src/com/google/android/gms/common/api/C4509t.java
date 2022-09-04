package com.google.android.gms.common.api;

import android.support.p001v4.util.ArrayMap;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.ahh;
/* renamed from: com.google.android.gms.common.api.t */
/* loaded from: classes2.dex */
public class C4509t implements AbstractC4502m {

    /* renamed from: a */
    private final Status f16860a;

    /* renamed from: b */
    private final ArrayMap<ahh<?>, ConnectionResult> f16861b;

    public C4509t(Status status, ArrayMap<ahh<?>, ConnectionResult> arrayMap) {
        this.f16860a = status;
        this.f16861b = arrayMap;
    }

    @Override // com.google.android.gms.common.api.AbstractC4502m
    /* renamed from: a */
    public Status mo7645a() {
        return this.f16860a;
    }
}
