package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.vision.face.internal.client.f */
/* loaded from: classes2.dex */
public class C9302f implements Parcelable.Creator<LandmarkParcel> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m8674a(LandmarkParcel landmarkParcel, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, landmarkParcel.f29346a);
        C4630b.m23476a(parcel, 2, landmarkParcel.f29347b);
        C4630b.m23476a(parcel, 3, landmarkParcel.f29348c);
        C4630b.m23475a(parcel, 4, landmarkParcel.f29349d);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public LandmarkParcel createFromParcel(Parcel parcel) {
        int i = 0;
        float f = 0.0f;
        int m23508b = C4628a.m23508b(parcel);
        float f2 = 0.0f;
        int i2 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    f2 = C4628a.m23495l(parcel, m23514a);
                    break;
                case 3:
                    f = C4628a.m23495l(parcel, m23514a);
                    break;
                case 4:
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
        return new LandmarkParcel(i2, f2, f, i);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public LandmarkParcel[] newArray(int i) {
        return new LandmarkParcel[i];
    }
}
