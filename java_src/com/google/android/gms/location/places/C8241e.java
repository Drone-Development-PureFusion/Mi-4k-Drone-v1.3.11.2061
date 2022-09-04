package com.google.android.gms.location.places;

import android.support.annotation.Nullable;
import com.google.android.gms.common.api.AbstractC4502m;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.AbstractC4521a;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.location.places.internal.C8285r;
/* renamed from: com.google.android.gms.location.places.e */
/* loaded from: classes2.dex */
public class C8241e extends AbstractC4521a<AbstractC8240d> implements AbstractC4502m {

    /* renamed from: b */
    private final Status f27045b;

    /* renamed from: c */
    private final String f27046c;

    public C8241e(DataHolder dataHolder) {
        super(dataHolder);
        this.f27045b = C8295n.m12143c(dataHolder.m23883e());
        if (dataHolder == null || dataHolder.m23881f() == null) {
            this.f27046c = null;
        } else {
            this.f27046c = dataHolder.m23881f().getString("com.google.android.gms.location.places.PlaceBuffer.ATTRIBUTIONS_EXTRA_KEY");
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC4502m
    /* renamed from: a */
    public Status mo7645a() {
        return this.f27045b;
    }

    @Override // com.google.android.gms.common.data.AbstractC4521a, com.google.android.gms.common.data.AbstractC4522b
    /* renamed from: b */
    public AbstractC8240d mo9715a(int i) {
        return new C8285r(this.f16904a, i);
    }

    @Nullable
    /* renamed from: h */
    public CharSequence m12322h() {
        return this.f27046c;
    }
}
