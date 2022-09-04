package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.vision.barcode.Barcode;
/* renamed from: com.google.android.gms.vision.barcode.d */
/* loaded from: classes2.dex */
public class C9254d implements Parcelable.Creator<Barcode.CalendarDateTime> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m8809a(Barcode.CalendarDateTime calendarDateTime, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, calendarDateTime.f29167a);
        C4630b.m23475a(parcel, 2, calendarDateTime.f29168b);
        C4630b.m23475a(parcel, 3, calendarDateTime.f29169c);
        C4630b.m23475a(parcel, 4, calendarDateTime.f29170d);
        C4630b.m23475a(parcel, 5, calendarDateTime.f29171e);
        C4630b.m23475a(parcel, 6, calendarDateTime.f29172f);
        C4630b.m23475a(parcel, 7, calendarDateTime.f29173g);
        C4630b.m23461a(parcel, 8, calendarDateTime.f29174h);
        C4630b.m23464a(parcel, 9, calendarDateTime.f29175i, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public Barcode.CalendarDateTime createFromParcel(Parcel parcel) {
        boolean z = false;
        int m23508b = C4628a.m23508b(parcel);
        String str = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i7 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    i6 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 3:
                    i5 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 4:
                    i4 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 5:
                    i3 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 6:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 7:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 8:
                    z = C4628a.m23505c(parcel, m23514a);
                    break;
                case 9:
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
        return new Barcode.CalendarDateTime(i7, i6, i5, i4, i3, i2, i, z, str);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public Barcode.CalendarDateTime[] newArray(int i) {
        return new Barcode.CalendarDateTime[i];
    }
}
