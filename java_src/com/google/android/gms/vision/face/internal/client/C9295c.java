package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.vision.face.internal.client.c */
/* loaded from: classes2.dex */
public class C9295c implements Parcelable.Creator<FaceSettingsParcel> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m8683a(FaceSettingsParcel faceSettingsParcel, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, faceSettingsParcel.f29339a);
        C4630b.m23475a(parcel, 2, faceSettingsParcel.f29340b);
        C4630b.m23475a(parcel, 3, faceSettingsParcel.f29341c);
        C4630b.m23475a(parcel, 4, faceSettingsParcel.f29342d);
        C4630b.m23461a(parcel, 5, faceSettingsParcel.f29343e);
        C4630b.m23461a(parcel, 6, faceSettingsParcel.f29344f);
        C4630b.m23476a(parcel, 7, faceSettingsParcel.f29345g);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public FaceSettingsParcel createFromParcel(Parcel parcel) {
        boolean z = false;
        int m23508b = C4628a.m23508b(parcel);
        float f = -1.0f;
        boolean z2 = false;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i4 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    i3 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 3:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 4:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 5:
                    z2 = C4628a.m23505c(parcel, m23514a);
                    break;
                case 6:
                    z = C4628a.m23505c(parcel, m23514a);
                    break;
                case 7:
                    f = C4628a.m23495l(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new FaceSettingsParcel(i4, i3, i2, i, z2, z, f);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public FaceSettingsParcel[] newArray(int i) {
        return new FaceSettingsParcel[i];
    }
}
