package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.vision.barcode.Barcode;
/* renamed from: com.google.android.gms.vision.barcode.e */
/* loaded from: classes2.dex */
public class C9255e implements Parcelable.Creator<Barcode.CalendarEvent> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m8806a(Barcode.CalendarEvent calendarEvent, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, calendarEvent.f29176a);
        C4630b.m23464a(parcel, 2, calendarEvent.f29177b, false);
        C4630b.m23464a(parcel, 3, calendarEvent.f29178c, false);
        C4630b.m23464a(parcel, 4, calendarEvent.f29179d, false);
        C4630b.m23464a(parcel, 5, calendarEvent.f29180e, false);
        C4630b.m23464a(parcel, 6, calendarEvent.f29181f, false);
        C4630b.m23470a(parcel, 7, (Parcelable) calendarEvent.f29182g, i, false);
        C4630b.m23470a(parcel, 8, (Parcelable) calendarEvent.f29183h, i, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public Barcode.CalendarEvent createFromParcel(Parcel parcel) {
        Barcode.CalendarDateTime calendarDateTime = null;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        Barcode.CalendarDateTime calendarDateTime2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    str5 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 3:
                    str4 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 4:
                    str3 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 5:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 6:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 7:
                    calendarDateTime2 = (Barcode.CalendarDateTime) C4628a.m23510a(parcel, m23514a, Barcode.CalendarDateTime.CREATOR);
                    break;
                case 8:
                    calendarDateTime = (Barcode.CalendarDateTime) C4628a.m23510a(parcel, m23514a, Barcode.CalendarDateTime.CREATOR);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new Barcode.CalendarEvent(i, str5, str4, str3, str2, str, calendarDateTime2, calendarDateTime);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public Barcode.CalendarEvent[] newArray(int i) {
        return new Barcode.CalendarEvent[i];
    }
}
