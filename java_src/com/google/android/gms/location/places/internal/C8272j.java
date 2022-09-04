package com.google.android.gms.location.places.internal;

import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.AbstractC8242f;
import com.google.android.gms.location.places.BinderC8327y;
import com.google.android.gms.location.places.C8244h;
import com.google.android.gms.location.places.C8291l;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.PlaceReport;
/* renamed from: com.google.android.gms.location.places.internal.j */
/* loaded from: classes2.dex */
public class C8272j implements AbstractC8242f {
    @Override // com.google.android.gms.location.places.AbstractC8242f
    /* renamed from: a */
    public AbstractC4494i<C8244h> mo12214a(AbstractC4489g abstractC4489g, final PlaceFilter placeFilter) {
        return abstractC4489g.mo17255a((AbstractC4489g) new BinderC8327y.AbstractC8331d<C8275k>(C8291l.f27158d, abstractC4489g) { // from class: com.google.android.gms.location.places.internal.j.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a */
            public void mo7809a(C8275k c8275k) {
                c8275k.m12209a(new BinderC8327y(this), placeFilter);
            }
        });
    }

    @Override // com.google.android.gms.location.places.AbstractC8242f
    /* renamed from: a */
    public AbstractC4494i<Status> mo12213a(AbstractC4489g abstractC4489g, final PlaceReport placeReport) {
        return abstractC4489g.mo17253b((AbstractC4489g) new BinderC8327y.AbstractC8333f<C8275k>(C8291l.f27158d, abstractC4489g) { // from class: com.google.android.gms.location.places.internal.j.2
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a */
            public void mo7809a(C8275k c8275k) {
                c8275k.m12208a(new BinderC8327y(this), placeReport);
            }
        });
    }
}
