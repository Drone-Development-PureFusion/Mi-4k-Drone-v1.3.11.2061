package com.google.android.gms.location.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.location.LocationRequest;
import java.util.List;
/* renamed from: com.google.android.gms.location.internal.m */
/* loaded from: classes2.dex */
public class C8219m implements Parcelable.Creator<LocationRequestInternal> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m12393a(LocationRequestInternal locationRequestInternal, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23470a(parcel, 1, (Parcelable) locationRequestInternal.f26740b, i, false);
        C4630b.m23461a(parcel, 4, locationRequestInternal.f26741c);
        C4630b.m23447c(parcel, 5, locationRequestInternal.f26742d, false);
        C4630b.m23464a(parcel, 6, locationRequestInternal.f26743e, false);
        C4630b.m23461a(parcel, 7, locationRequestInternal.f26744f);
        C4630b.m23475a(parcel, 1000, locationRequestInternal.m12548a());
        C4630b.m23461a(parcel, 8, locationRequestInternal.f26745g);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public LocationRequestInternal createFromParcel(Parcel parcel) {
        String str = null;
        boolean z = false;
        int m23508b = C4628a.m23508b(parcel);
        boolean z2 = true;
        List<ClientIdentity> list = LocationRequestInternal.f26739a;
        boolean z3 = false;
        LocationRequest locationRequest = null;
        int i = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    locationRequest = (LocationRequest) C4628a.m23510a(parcel, m23514a, LocationRequest.CREATOR);
                    break;
                case 4:
                    z2 = C4628a.m23505c(parcel, m23514a);
                    break;
                case 5:
                    list = C4628a.m23504c(parcel, m23514a, ClientIdentity.CREATOR);
                    break;
                case 6:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 7:
                    z3 = C4628a.m23505c(parcel, m23514a);
                    break;
                case 8:
                    z = C4628a.m23505c(parcel, m23514a);
                    break;
                case 1000:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new LocationRequestInternal(i, locationRequest, z2, list, str, z3, z);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public LocationRequestInternal[] newArray(int i) {
        return new LocationRequestInternal[i];
    }
}
