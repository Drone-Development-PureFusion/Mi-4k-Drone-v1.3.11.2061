package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.location.places.q */
/* loaded from: classes2.dex */
public class C8306q implements Parcelable.Creator<NearbyAlertFilter> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m12111a(NearbyAlertFilter nearbyAlertFilter, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23449b(parcel, 1, nearbyAlertFilter.f26863b, false);
        C4630b.m23463a(parcel, 2, nearbyAlertFilter.f26864c, false);
        C4630b.m23447c(parcel, 3, nearbyAlertFilter.f26865d, false);
        C4630b.m23464a(parcel, 4, nearbyAlertFilter.f26866e, false);
        C4630b.m23461a(parcel, 5, nearbyAlertFilter.f26867f);
        C4630b.m23475a(parcel, 1000, nearbyAlertFilter.f26862a);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public NearbyAlertFilter createFromParcel(Parcel parcel) {
        boolean z = false;
        String str = null;
        int m23508b = C4628a.m23508b(parcel);
        ArrayList arrayList = null;
        ArrayList<Integer> arrayList2 = null;
        ArrayList<String> arrayList3 = null;
        int i = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    arrayList3 = C4628a.m23518E(parcel, m23514a);
                    break;
                case 2:
                    arrayList2 = C4628a.m23519D(parcel, m23514a);
                    break;
                case 3:
                    arrayList = C4628a.m23504c(parcel, m23514a, UserDataType.CREATOR);
                    break;
                case 4:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 5:
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
        return new NearbyAlertFilter(i, arrayList3, arrayList2, arrayList, str, z);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public NearbyAlertFilter[] newArray(int i) {
        return new NearbyAlertFilter[i];
    }
}
