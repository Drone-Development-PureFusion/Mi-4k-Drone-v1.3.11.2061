package com.google.android.gms.location.places;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.location.places.o */
/* loaded from: classes2.dex */
public class C8296o implements Parcelable.Creator<AddPlaceRequest> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m12140a(AddPlaceRequest addPlaceRequest, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23464a(parcel, 1, addPlaceRequest.m12366a(), false);
        C4630b.m23470a(parcel, 2, (Parcelable) addPlaceRequest.m12365b(), i, false);
        C4630b.m23464a(parcel, 3, addPlaceRequest.m12364c(), false);
        C4630b.m23463a(parcel, 4, addPlaceRequest.m12363d(), false);
        C4630b.m23464a(parcel, 5, addPlaceRequest.m12362e(), false);
        C4630b.m23470a(parcel, 6, (Parcelable) addPlaceRequest.m12361f(), i, false);
        C4630b.m23475a(parcel, 1000, addPlaceRequest.f26841a);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public AddPlaceRequest createFromParcel(Parcel parcel) {
        Uri uri = null;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        String str = null;
        ArrayList<Integer> arrayList = null;
        String str2 = null;
        LatLng latLng = null;
        String str3 = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    str3 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 2:
                    latLng = (LatLng) C4628a.m23510a(parcel, m23514a, LatLng.CREATOR);
                    break;
                case 3:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 4:
                    arrayList = C4628a.m23519D(parcel, m23514a);
                    break;
                case 5:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 6:
                    uri = (Uri) C4628a.m23510a(parcel, m23514a, Uri.CREATOR);
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
        return new AddPlaceRequest(i, str3, latLng, str2, arrayList, str, uri);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public AddPlaceRequest[] newArray(int i) {
        return new AddPlaceRequest[i];
    }
}
