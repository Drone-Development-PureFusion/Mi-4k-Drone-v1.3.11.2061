package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.common.server.response.e */
/* loaded from: classes2.dex */
public class C4667e implements Parcelable.Creator<SafeParcelResponse> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m23231a(SafeParcelResponse safeParcelResponse, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, safeParcelResponse.m23259a());
        C4630b.m23471a(parcel, 2, safeParcelResponse.m23249b(), false);
        C4630b.m23470a(parcel, 3, (Parcelable) safeParcelResponse.m23246f(), i, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public SafeParcelResponse createFromParcel(Parcel parcel) {
        FieldMappingDictionary fieldMappingDictionary = null;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        Parcel parcel2 = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    parcel2 = C4628a.m23517F(parcel, m23514a);
                    break;
                case 3:
                    fieldMappingDictionary = (FieldMappingDictionary) C4628a.m23510a(parcel, m23514a, FieldMappingDictionary.CREATOR);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new SafeParcelResponse(i, parcel2, fieldMappingDictionary);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public SafeParcelResponse[] newArray(int i) {
        return new SafeParcelResponse[i];
    }
}
