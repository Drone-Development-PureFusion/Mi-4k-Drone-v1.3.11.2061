package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.internal.aaa;
@aaa
/* loaded from: classes.dex */
public class ThinAdSizeParcel extends AdSizeParcel {
    public ThinAdSizeParcel(AdSizeParcel adSizeParcel) {
        super(adSizeParcel.f13863a, adSizeParcel.f13864b, adSizeParcel.f13865c, adSizeParcel.f13866d, adSizeParcel.f13867e, adSizeParcel.f13868f, adSizeParcel.f13869g, adSizeParcel.f13870h, adSizeParcel.f13871i, adSizeParcel.f13872j, adSizeParcel.f13873k);
    }

    @Override // com.google.android.gms.ads.internal.client.AdSizeParcel, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, this.f13863a);
        C4630b.m23464a(parcel, 2, this.f13864b, false);
        C4630b.m23475a(parcel, 3, this.f13865c);
        C4630b.m23475a(parcel, 6, this.f13868f);
        C4630b.m23479a(parcel, m23480a);
    }
}
