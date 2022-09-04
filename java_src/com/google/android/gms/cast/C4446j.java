package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.cast.j */
/* loaded from: classes2.dex */
public class C4446j implements Parcelable.Creator<CastDevice> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m24108a(CastDevice castDevice, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, castDevice.m25251a());
        C4630b.m23464a(parcel, 2, castDevice.m25242c(), false);
        C4630b.m23464a(parcel, 3, castDevice.f15790f, false);
        C4630b.m23464a(parcel, 4, castDevice.m25240e(), false);
        C4630b.m23464a(parcel, 5, castDevice.m25239f(), false);
        C4630b.m23464a(parcel, 6, castDevice.m25238g(), false);
        C4630b.m23475a(parcel, 7, castDevice.m25236i());
        C4630b.m23447c(parcel, 8, castDevice.m25235j(), false);
        C4630b.m23475a(parcel, 9, castDevice.m25233l());
        C4630b.m23475a(parcel, 10, castDevice.m25232m());
        C4630b.m23464a(parcel, 11, castDevice.m25237h(), false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public CastDevice createFromParcel(Parcel parcel) {
        int i = 0;
        String str = null;
        int m23508b = C4628a.m23508b(parcel);
        int i2 = -1;
        ArrayList arrayList = null;
        int i3 = 0;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        int i4 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i4 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    str6 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 3:
                    str5 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 4:
                    str4 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 5:
                    str3 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 6:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 7:
                    i3 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 8:
                    arrayList = C4628a.m23504c(parcel, m23514a, WebImage.CREATOR);
                    break;
                case 9:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 10:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 11:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new CastDevice(i4, str6, str5, str4, str3, str2, i3, arrayList, i, i2, str);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public CastDevice[] newArray(int i) {
        return new CastDevice[i];
    }
}
