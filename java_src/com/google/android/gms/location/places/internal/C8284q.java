package com.google.android.gms.location.places.internal;

import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.location.places.AbstractC8247i;
import com.google.android.gms.location.places.PlacePhotoResult;
/* renamed from: com.google.android.gms.location.places.internal.q */
/* loaded from: classes2.dex */
public class C8284q extends AbstractC8287t implements AbstractC8247i {

    /* renamed from: c */
    private final String f27150c = e("photo_fife_url");

    public C8284q(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    @Override // com.google.android.gms.location.places.AbstractC8247i
    /* renamed from: a */
    public AbstractC4494i<PlacePhotoResult> mo12190a(AbstractC4489g abstractC4489g) {
        return mo12189a(abstractC4489g, mo12188c(), mo12187d());
    }

    @Override // com.google.android.gms.location.places.AbstractC8247i
    /* renamed from: a */
    public AbstractC4494i<PlacePhotoResult> mo12189a(AbstractC4489g abstractC4489g, int i, int i2) {
        return ((AbstractC8247i) mo7785a()).mo12189a(abstractC4489g, i, i2);
    }

    @Override // com.google.android.gms.location.places.AbstractC8247i
    /* renamed from: c */
    public int mo12188c() {
        return a("photo_max_width", 0);
    }

    @Override // com.google.android.gms.location.places.AbstractC8247i
    /* renamed from: d */
    public int mo12187d() {
        return a("photo_max_height", 0);
    }

    @Override // com.google.android.gms.location.places.AbstractC8247i
    /* renamed from: e */
    public CharSequence mo12186e() {
        return a("photo_attributions", (String) null);
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: f */
    public AbstractC8247i mo7785a() {
        return new C8282p(this.f27150c, mo12188c(), mo12187d(), mo12186e(), this.f16910d_);
    }
}
