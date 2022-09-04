package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.location.internal.ParcelableGeofence;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.location.u */
/* loaded from: classes2.dex */
public class C8339u implements Parcelable.Creator<GeofencingRequest> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m12030a(GeofencingRequest geofencingRequest, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23447c(parcel, 1, geofencingRequest.m12641b(), false);
        C4630b.m23475a(parcel, 2, geofencingRequest.m12639d());
        C4630b.m23475a(parcel, 1000, geofencingRequest.m12642a());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public GeofencingRequest createFromParcel(Parcel parcel) {
        int i = 0;
        int m23508b = C4628a.m23508b(parcel);
        ArrayList arrayList = null;
        int i2 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    arrayList = C4628a.m23504c(parcel, m23514a, ParcelableGeofence.CREATOR);
                    break;
                case 2:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 1000:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new GeofencingRequest(i2, arrayList, i);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public GeofencingRequest[] newArray(int i) {
        return new GeofencingRequest[i];
    }
}
