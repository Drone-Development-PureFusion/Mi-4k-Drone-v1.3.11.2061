package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.places.AbstractC8240d;
import com.google.android.gms.location.places.AbstractC8243g;
/* loaded from: classes2.dex */
public class PlaceLikelihoodEntity extends AbstractSafeParcelable implements AbstractC8243g {
    public static final Parcelable.Creator<PlaceLikelihoodEntity> CREATOR = new C8279m();

    /* renamed from: a */
    final int f27103a;

    /* renamed from: b */
    final PlaceEntity f27104b;

    /* renamed from: c */
    final float f27105c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public PlaceLikelihoodEntity(int i, PlaceEntity placeEntity, float f) {
        this.f27103a = i;
        this.f27104b = placeEntity;
        this.f27105c = f;
    }

    /* renamed from: a */
    public static PlaceLikelihoodEntity m12283a(PlaceEntity placeEntity, float f) {
        return new PlaceLikelihoodEntity(0, (PlaceEntity) C4588d.m23627a(placeEntity), f);
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: b */
    public boolean mo7790b() {
        return true;
    }

    @Override // com.google.android.gms.location.places.AbstractC8243g
    /* renamed from: c */
    public float mo12200c() {
        return this.f27105c;
    }

    @Override // com.google.android.gms.location.places.AbstractC8243g
    /* renamed from: d */
    public AbstractC8240d mo12199d() {
        return this.f27104b;
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: e */
    public AbstractC8243g mo7785a() {
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaceLikelihoodEntity)) {
            return false;
        }
        PlaceLikelihoodEntity placeLikelihoodEntity = (PlaceLikelihoodEntity) obj;
        return this.f27104b.equals(placeLikelihoodEntity.f27104b) && this.f27105c == placeLikelihoodEntity.f27105c;
    }

    public int hashCode() {
        return C4585c.m23633a(this.f27104b, Float.valueOf(this.f27105c));
    }

    public String toString() {
        return C4585c.m23635a(this).m23632a("place", this.f27104b).m23632a("likelihood", Float.valueOf(this.f27105c)).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8279m.m12201a(this, parcel, i);
    }
}
