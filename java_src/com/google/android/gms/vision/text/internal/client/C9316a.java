package com.google.android.gms.vision.text.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.vision.text.internal.client.a */
/* loaded from: classes2.dex */
public class C9316a implements Parcelable.Creator<BoundingBoxParcel> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m8631a(BoundingBoxParcel boundingBoxParcel, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, boundingBoxParcel.f29380a);
        C4630b.m23475a(parcel, 2, boundingBoxParcel.f29381b);
        C4630b.m23475a(parcel, 3, boundingBoxParcel.f29382c);
        C4630b.m23475a(parcel, 4, boundingBoxParcel.f29383d);
        C4630b.m23475a(parcel, 5, boundingBoxParcel.f29384e);
        C4630b.m23476a(parcel, 6, boundingBoxParcel.f29385f);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public BoundingBoxParcel createFromParcel(Parcel parcel) {
        int i = 0;
        int m23508b = C4628a.m23508b(parcel);
        float f = 0.0f;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i5 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    i4 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 3:
                    i3 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 4:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 5:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 6:
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
        return new BoundingBoxParcel(i5, i4, i3, i2, i, f);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public BoundingBoxParcel[] newArray(int i) {
        return new BoundingBoxParcel[i];
    }
}
