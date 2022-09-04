package com.google.android.gms.vision.text.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.vision.text.internal.client.d */
/* loaded from: classes2.dex */
public class C9323d implements Parcelable.Creator<LineBoxParcel> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m8622a(LineBoxParcel lineBoxParcel, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, lineBoxParcel.f29386a);
        C4630b.m23456a(parcel, 2, (Parcelable[]) lineBoxParcel.f29387b, i, false);
        C4630b.m23470a(parcel, 3, (Parcelable) lineBoxParcel.f29388c, i, false);
        C4630b.m23470a(parcel, 4, (Parcelable) lineBoxParcel.f29389d, i, false);
        C4630b.m23470a(parcel, 5, (Parcelable) lineBoxParcel.f29390e, i, false);
        C4630b.m23464a(parcel, 6, lineBoxParcel.f29391f, false);
        C4630b.m23476a(parcel, 7, lineBoxParcel.f29392g);
        C4630b.m23464a(parcel, 8, lineBoxParcel.f29393h, false);
        C4630b.m23475a(parcel, 9, lineBoxParcel.f29394i);
        C4630b.m23461a(parcel, 10, lineBoxParcel.f29395j);
        C4630b.m23475a(parcel, 11, lineBoxParcel.f29396k);
        C4630b.m23475a(parcel, 12, lineBoxParcel.f29397l);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public LineBoxParcel createFromParcel(Parcel parcel) {
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        WordBoxParcel[] wordBoxParcelArr = null;
        BoundingBoxParcel boundingBoxParcel = null;
        BoundingBoxParcel boundingBoxParcel2 = null;
        BoundingBoxParcel boundingBoxParcel3 = null;
        String str = null;
        float f = 0.0f;
        String str2 = null;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        int i4 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    wordBoxParcelArr = (WordBoxParcel[]) C4628a.m23506b(parcel, m23514a, WordBoxParcel.CREATOR);
                    break;
                case 3:
                    boundingBoxParcel = (BoundingBoxParcel) C4628a.m23510a(parcel, m23514a, BoundingBoxParcel.CREATOR);
                    break;
                case 4:
                    boundingBoxParcel2 = (BoundingBoxParcel) C4628a.m23510a(parcel, m23514a, BoundingBoxParcel.CREATOR);
                    break;
                case 5:
                    boundingBoxParcel3 = (BoundingBoxParcel) C4628a.m23510a(parcel, m23514a, BoundingBoxParcel.CREATOR);
                    break;
                case 6:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 7:
                    f = C4628a.m23495l(parcel, m23514a);
                    break;
                case 8:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 9:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 10:
                    z = C4628a.m23505c(parcel, m23514a);
                    break;
                case 11:
                    i3 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 12:
                    i4 = C4628a.m23500g(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new LineBoxParcel(i, wordBoxParcelArr, boundingBoxParcel, boundingBoxParcel2, boundingBoxParcel3, str, f, str2, i2, z, i3, i4);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public LineBoxParcel[] newArray(int i) {
        return new LineBoxParcel[i];
    }
}
