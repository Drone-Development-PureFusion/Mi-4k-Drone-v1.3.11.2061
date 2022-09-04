package com.google.android.gms.ads.internal.request;

import com.google.android.gms.ads.internal.request.AbstractC3732l;
import com.google.android.gms.ads.internal.request.C3714c;
import com.google.android.gms.internal.aaa;
import java.lang.ref.WeakReference;
@aaa
/* renamed from: com.google.android.gms.ads.internal.request.g */
/* loaded from: classes.dex */
public final class BinderC3725g extends AbstractC3732l.AbstractBinderC3733a {

    /* renamed from: a */
    private final WeakReference<C3714c.AbstractC3716a> f14637a;

    public BinderC3725g(C3714c.AbstractC3716a abstractC3716a) {
        this.f14637a = new WeakReference<>(abstractC3716a);
    }

    @Override // com.google.android.gms.ads.internal.request.AbstractC3732l
    /* renamed from: a */
    public void mo26994a(AdResponseParcel adResponseParcel) {
        C3714c.AbstractC3716a abstractC3716a = this.f14637a.get();
        if (abstractC3716a != null) {
            abstractC3716a.mo27018a(adResponseParcel);
        }
    }
}
