package com.google.android.gms.location.internal;

import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.AbstractC8335q;
import com.google.android.gms.location.C8229n;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;
/* renamed from: com.google.android.gms.location.internal.q */
/* loaded from: classes2.dex */
public class C8223q implements AbstractC8335q {
    @Override // com.google.android.gms.location.AbstractC8335q
    /* renamed from: a */
    public AbstractC4494i<LocationSettingsResult> mo12042a(AbstractC4489g abstractC4489g, LocationSettingsRequest locationSettingsRequest) {
        return m12384a(abstractC4489g, locationSettingsRequest, null);
    }

    /* renamed from: a */
    public AbstractC4494i<LocationSettingsResult> m12384a(AbstractC4489g abstractC4489g, final LocationSettingsRequest locationSettingsRequest, final String str) {
        return abstractC4489g.mo17255a((AbstractC4489g) new C8229n.AbstractC8231a<LocationSettingsResult>(abstractC4489g) { // from class: com.google.android.gms.location.internal.q.1
            @Override // com.google.android.gms.internal.ahn
            /* renamed from: a */
            public LocationSettingsResult mo7807b(Status status) {
                return new LocationSettingsResult(status);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C8215l c8215l) {
                c8215l.m12409a(locationSettingsRequest, this, str);
            }
        });
    }
}
