package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.vision.barcode.Barcode;
/* renamed from: com.google.android.gms.vision.barcode.b */
/* loaded from: classes2.dex */
public class C9252b implements Parcelable.Creator<Barcode.Address> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m8815a(Barcode.Address address, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, address.f29164a);
        C4630b.m23475a(parcel, 2, address.f29165e);
        C4630b.m23455a(parcel, 3, address.f29166f, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public Barcode.Address createFromParcel(Parcel parcel) {
        int i = 0;
        int m23508b = C4628a.m23508b(parcel);
        String[] strArr = null;
        int i2 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 3:
                    strArr = C4628a.m23520C(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new Barcode.Address(i2, i, strArr);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public Barcode.Address[] newArray(int i) {
        return new Barcode.Address[i];
    }
}
