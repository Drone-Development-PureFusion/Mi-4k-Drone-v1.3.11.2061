package com.google.android.gms.location.places.internal;

import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.location.places.AbstractC8239c;
import com.google.android.gms.location.places.AddPlaceRequest;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.location.places.BinderC8308s;
import com.google.android.gms.location.places.BinderC8327y;
import com.google.android.gms.location.places.C8238b;
import com.google.android.gms.location.places.C8241e;
import com.google.android.gms.location.places.C8291l;
import com.google.android.gms.location.places.PlacePhotoMetadataResult;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.Arrays;
/* renamed from: com.google.android.gms.location.places.internal.d */
/* loaded from: classes2.dex */
public class C8252d implements AbstractC8239c {
    @Override // com.google.android.gms.location.places.AbstractC8239c
    /* renamed from: a */
    public AbstractC4494i<C8241e> mo12262a(AbstractC4489g abstractC4489g, final AddPlaceRequest addPlaceRequest) {
        return abstractC4489g.mo17253b((AbstractC4489g) new BinderC8327y.AbstractC8330c<C8257e>(C8291l.f27157c, abstractC4489g) { // from class: com.google.android.gms.location.places.internal.d.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a */
            public void mo7809a(C8257e c8257e) {
                c8257e.m12251a(new BinderC8327y(this), addPlaceRequest);
            }
        });
    }

    @Override // com.google.android.gms.location.places.AbstractC8239c
    /* renamed from: a */
    public AbstractC4494i<PlacePhotoMetadataResult> mo12261a(AbstractC4489g abstractC4489g, final String str) {
        return abstractC4489g.mo17255a((AbstractC4489g) new BinderC8308s.AbstractC8310b<C8257e>(C8291l.f27157c, abstractC4489g) { // from class: com.google.android.gms.location.places.internal.d.2
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a */
            public void mo7809a(C8257e c8257e) {
                c8257e.m12253a(new BinderC8308s(this), str);
            }
        });
    }

    @Override // com.google.android.gms.location.places.AbstractC8239c
    /* renamed from: a */
    public AbstractC4494i<C8238b> mo12260a(AbstractC4489g abstractC4489g, final String str, final LatLngBounds latLngBounds, final AutocompleteFilter autocompleteFilter) {
        return abstractC4489g.mo17255a((AbstractC4489g) new BinderC8327y.AbstractC8328a<C8257e>(C8291l.f27157c, abstractC4489g) { // from class: com.google.android.gms.location.places.internal.d.4
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a */
            public void mo7809a(C8257e c8257e) {
                c8257e.m12250a(new BinderC8327y(this), str, latLngBounds, autocompleteFilter);
            }
        });
    }

    @Override // com.google.android.gms.location.places.AbstractC8239c
    /* renamed from: a */
    public AbstractC4494i<C8241e> mo12259a(AbstractC4489g abstractC4489g, final String... strArr) {
        boolean z = true;
        if (strArr == null || strArr.length < 1) {
            z = false;
        }
        C4588d.m23619b(z);
        return abstractC4489g.mo17255a((AbstractC4489g) new BinderC8327y.AbstractC8330c<C8257e>(C8291l.f27157c, abstractC4489g) { // from class: com.google.android.gms.location.places.internal.d.3
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a */
            public void mo7809a(C8257e c8257e) {
                c8257e.m12249a(new BinderC8327y(this), Arrays.asList(strArr));
            }
        });
    }
}
