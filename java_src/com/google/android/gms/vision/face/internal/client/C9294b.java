package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.vision.face.internal.client.b */
/* loaded from: classes2.dex */
public class C9294b implements Parcelable.Creator<FaceParcel> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m8686a(FaceParcel faceParcel, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, faceParcel.f29327a);
        C4630b.m23475a(parcel, 2, faceParcel.f29328b);
        C4630b.m23476a(parcel, 3, faceParcel.f29329c);
        C4630b.m23476a(parcel, 4, faceParcel.f29330d);
        C4630b.m23476a(parcel, 5, faceParcel.f29331e);
        C4630b.m23476a(parcel, 6, faceParcel.f29332f);
        C4630b.m23476a(parcel, 7, faceParcel.f29333g);
        C4630b.m23476a(parcel, 8, faceParcel.f29334h);
        C4630b.m23456a(parcel, 9, (Parcelable[]) faceParcel.f29335i, i, false);
        C4630b.m23476a(parcel, 10, faceParcel.f29336j);
        C4630b.m23476a(parcel, 11, faceParcel.f29337k);
        C4630b.m23476a(parcel, 12, faceParcel.f29338l);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public FaceParcel createFromParcel(Parcel parcel) {
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        int i2 = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        LandmarkParcel[] landmarkParcelArr = null;
        float f7 = 0.0f;
        float f8 = 0.0f;
        float f9 = 0.0f;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 3:
                    f = C4628a.m23495l(parcel, m23514a);
                    break;
                case 4:
                    f2 = C4628a.m23495l(parcel, m23514a);
                    break;
                case 5:
                    f3 = C4628a.m23495l(parcel, m23514a);
                    break;
                case 6:
                    f4 = C4628a.m23495l(parcel, m23514a);
                    break;
                case 7:
                    f5 = C4628a.m23495l(parcel, m23514a);
                    break;
                case 8:
                    f6 = C4628a.m23495l(parcel, m23514a);
                    break;
                case 9:
                    landmarkParcelArr = (LandmarkParcel[]) C4628a.m23506b(parcel, m23514a, LandmarkParcel.CREATOR);
                    break;
                case 10:
                    f7 = C4628a.m23495l(parcel, m23514a);
                    break;
                case 11:
                    f8 = C4628a.m23495l(parcel, m23514a);
                    break;
                case 12:
                    f9 = C4628a.m23495l(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new FaceParcel(i, i2, f, f2, f3, f4, f5, f6, landmarkParcelArr, f7, f8, f9);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public FaceParcel[] newArray(int i) {
        return new FaceParcel[i];
    }
}
