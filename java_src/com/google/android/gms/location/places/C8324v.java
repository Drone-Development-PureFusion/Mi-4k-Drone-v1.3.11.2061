package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.location.places.v */
/* loaded from: classes2.dex */
public class C8324v implements Parcelable.Creator<PlacePhotoResult> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m12061a(PlacePhotoResult placePhotoResult, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23470a(parcel, 1, (Parcelable) placePhotoResult.mo7645a(), i, false);
        C4630b.m23470a(parcel, 2, (Parcelable) placePhotoResult.f26897b, i, false);
        C4630b.m23475a(parcel, 1000, placePhotoResult.f26896a);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public PlacePhotoResult createFromParcel(Parcel parcel) {
        Status status;
        int m23500g;
        BitmapTeleporter bitmapTeleporter;
        BitmapTeleporter bitmapTeleporter2 = null;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        Status status2 = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    Status status3 = (Status) C4628a.m23510a(parcel, m23514a, Status.CREATOR);
                    m23500g = i;
                    bitmapTeleporter = bitmapTeleporter2;
                    status = status3;
                    break;
                case 2:
                    bitmapTeleporter = (BitmapTeleporter) C4628a.m23510a(parcel, m23514a, BitmapTeleporter.CREATOR);
                    status = status2;
                    m23500g = i;
                    break;
                case 1000:
                    BitmapTeleporter bitmapTeleporter3 = bitmapTeleporter2;
                    status = status2;
                    m23500g = C4628a.m23500g(parcel, m23514a);
                    bitmapTeleporter = bitmapTeleporter3;
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    bitmapTeleporter = bitmapTeleporter2;
                    status = status2;
                    m23500g = i;
                    break;
            }
            i = m23500g;
            status2 = status;
            bitmapTeleporter2 = bitmapTeleporter;
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new PlacePhotoResult(i, status2, bitmapTeleporter2);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public PlacePhotoResult[] newArray(int i) {
        return new PlacePhotoResult[i];
    }
}
