package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.maps.model.ab */
/* loaded from: classes2.dex */
public class C8607ab implements Parcelable.Creator<Tile> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m11095a(Tile tile, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, tile.m11271a());
        C4630b.m23475a(parcel, 2, tile.f27532a);
        C4630b.m23475a(parcel, 3, tile.f27533b);
        C4630b.m23460a(parcel, 4, tile.f27534c, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public Tile createFromParcel(Parcel parcel) {
        int i = 0;
        int m23508b = C4628a.m23508b(parcel);
        byte[] bArr = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i3 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 3:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 4:
                    bArr = C4628a.m23487t(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new Tile(i3, i2, i, bArr);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public Tile[] newArray(int i) {
        return new Tile[i];
    }
}
