package com.google.android.gms.common.data;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.common.data.h */
/* loaded from: classes2.dex */
public class C4529h implements Parcelable.Creator<BitmapTeleporter> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m23847a(BitmapTeleporter bitmapTeleporter, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, bitmapTeleporter.f16881a);
        C4630b.m23470a(parcel, 2, (Parcelable) bitmapTeleporter.f16882b, i, false);
        C4630b.m23475a(parcel, 3, bitmapTeleporter.f16883c);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public BitmapTeleporter createFromParcel(Parcel parcel) {
        int m23500g;
        ParcelFileDescriptor parcelFileDescriptor;
        int i;
        int i2 = 0;
        int m23508b = C4628a.m23508b(parcel);
        ParcelFileDescriptor parcelFileDescriptor2 = null;
        int i3 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    int i4 = i2;
                    parcelFileDescriptor = parcelFileDescriptor2;
                    i = C4628a.m23500g(parcel, m23514a);
                    m23500g = i4;
                    break;
                case 2:
                    ParcelFileDescriptor parcelFileDescriptor3 = (ParcelFileDescriptor) C4628a.m23510a(parcel, m23514a, ParcelFileDescriptor.CREATOR);
                    i = i3;
                    m23500g = i2;
                    parcelFileDescriptor = parcelFileDescriptor3;
                    break;
                case 3:
                    m23500g = C4628a.m23500g(parcel, m23514a);
                    parcelFileDescriptor = parcelFileDescriptor2;
                    i = i3;
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    m23500g = i2;
                    parcelFileDescriptor = parcelFileDescriptor2;
                    i = i3;
                    break;
            }
            i3 = i;
            parcelFileDescriptor2 = parcelFileDescriptor;
            i2 = m23500g;
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new BitmapTeleporter(i3, parcelFileDescriptor2, i2);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public BitmapTeleporter[] newArray(int i) {
        return new BitmapTeleporter[i];
    }
}
