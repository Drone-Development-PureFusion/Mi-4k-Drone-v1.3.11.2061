package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.location.aa */
/* loaded from: classes2.dex */
public class C8161aa implements Parcelable.Creator<LocationSettingsResult> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m12576a(LocationSettingsResult locationSettingsResult, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23470a(parcel, 1, (Parcelable) locationSettingsResult.mo7645a(), i, false);
        C4630b.m23470a(parcel, 2, (Parcelable) locationSettingsResult.m12590c(), i, false);
        C4630b.m23475a(parcel, 1000, locationSettingsResult.m12591b());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public LocationSettingsResult createFromParcel(Parcel parcel) {
        Status status;
        int m23500g;
        LocationSettingsStates locationSettingsStates;
        LocationSettingsStates locationSettingsStates2 = null;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        Status status2 = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    Status status3 = (Status) C4628a.m23510a(parcel, m23514a, Status.CREATOR);
                    m23500g = i;
                    locationSettingsStates = locationSettingsStates2;
                    status = status3;
                    break;
                case 2:
                    locationSettingsStates = (LocationSettingsStates) C4628a.m23510a(parcel, m23514a, LocationSettingsStates.CREATOR);
                    status = status2;
                    m23500g = i;
                    break;
                case 1000:
                    LocationSettingsStates locationSettingsStates3 = locationSettingsStates2;
                    status = status2;
                    m23500g = C4628a.m23500g(parcel, m23514a);
                    locationSettingsStates = locationSettingsStates3;
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    locationSettingsStates = locationSettingsStates2;
                    status = status2;
                    m23500g = i;
                    break;
            }
            i = m23500g;
            status2 = status;
            locationSettingsStates2 = locationSettingsStates;
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new LocationSettingsResult(i, status2, locationSettingsStates2);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public LocationSettingsResult[] newArray(int i) {
        return new LocationSettingsResult[i];
    }
}
