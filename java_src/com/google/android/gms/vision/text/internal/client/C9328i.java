package com.google.android.gms.vision.text.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.vision.text.internal.client.i */
/* loaded from: classes2.dex */
public class C9328i implements Parcelable.Creator<WordBoxParcel> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m8606a(WordBoxParcel wordBoxParcel, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, wordBoxParcel.f29402a);
        C4630b.m23456a(parcel, 2, (Parcelable[]) wordBoxParcel.f29403b, i, false);
        C4630b.m23470a(parcel, 3, (Parcelable) wordBoxParcel.f29404c, i, false);
        C4630b.m23470a(parcel, 4, (Parcelable) wordBoxParcel.f29405d, i, false);
        C4630b.m23464a(parcel, 5, wordBoxParcel.f29406e, false);
        C4630b.m23476a(parcel, 6, wordBoxParcel.f29407f);
        C4630b.m23464a(parcel, 7, wordBoxParcel.f29408g, false);
        C4630b.m23461a(parcel, 8, wordBoxParcel.f29409h);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public WordBoxParcel createFromParcel(Parcel parcel) {
        boolean z = false;
        String str = null;
        int m23508b = C4628a.m23508b(parcel);
        float f = 0.0f;
        String str2 = null;
        BoundingBoxParcel boundingBoxParcel = null;
        BoundingBoxParcel boundingBoxParcel2 = null;
        SymbolBoxParcel[] symbolBoxParcelArr = null;
        int i = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    symbolBoxParcelArr = (SymbolBoxParcel[]) C4628a.m23506b(parcel, m23514a, SymbolBoxParcel.CREATOR);
                    break;
                case 3:
                    boundingBoxParcel2 = (BoundingBoxParcel) C4628a.m23510a(parcel, m23514a, BoundingBoxParcel.CREATOR);
                    break;
                case 4:
                    boundingBoxParcel = (BoundingBoxParcel) C4628a.m23510a(parcel, m23514a, BoundingBoxParcel.CREATOR);
                    break;
                case 5:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 6:
                    f = C4628a.m23495l(parcel, m23514a);
                    break;
                case 7:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 8:
                    z = C4628a.m23505c(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new WordBoxParcel(i, symbolBoxParcelArr, boundingBoxParcel2, boundingBoxParcel, str2, f, str, z);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public WordBoxParcel[] newArray(int i) {
        return new WordBoxParcel[i];
    }
}
