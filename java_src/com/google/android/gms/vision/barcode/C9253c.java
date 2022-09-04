package com.google.android.gms.vision.barcode;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.vision.barcode.Barcode;
/* renamed from: com.google.android.gms.vision.barcode.c */
/* loaded from: classes2.dex */
public class C9253c implements Parcelable.Creator<Barcode> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m8812a(Barcode barcode, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, barcode.f29146A);
        C4630b.m23475a(parcel, 2, barcode.f29147B);
        C4630b.m23464a(parcel, 3, barcode.f29148C, false);
        C4630b.m23464a(parcel, 4, barcode.f29149D, false);
        C4630b.m23475a(parcel, 5, barcode.f29150E);
        C4630b.m23456a(parcel, 6, (Parcelable[]) barcode.f29151F, i, false);
        C4630b.m23470a(parcel, 7, (Parcelable) barcode.f29152G, i, false);
        C4630b.m23470a(parcel, 8, (Parcelable) barcode.f29153H, i, false);
        C4630b.m23470a(parcel, 9, (Parcelable) barcode.f29154I, i, false);
        C4630b.m23470a(parcel, 10, (Parcelable) barcode.f29155J, i, false);
        C4630b.m23470a(parcel, 11, (Parcelable) barcode.f29156K, i, false);
        C4630b.m23470a(parcel, 12, (Parcelable) barcode.f29157L, i, false);
        C4630b.m23470a(parcel, 13, (Parcelable) barcode.f29158M, i, false);
        C4630b.m23470a(parcel, 14, (Parcelable) barcode.f29159N, i, false);
        C4630b.m23470a(parcel, 15, (Parcelable) barcode.f29160O, i, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public Barcode createFromParcel(Parcel parcel) {
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        int i2 = 0;
        String str = null;
        String str2 = null;
        int i3 = 0;
        Point[] pointArr = null;
        Barcode.Email email = null;
        Barcode.Phone phone = null;
        Barcode.Sms sms = null;
        Barcode.WiFi wiFi = null;
        Barcode.UrlBookmark urlBookmark = null;
        Barcode.GeoPoint geoPoint = null;
        Barcode.CalendarEvent calendarEvent = null;
        Barcode.ContactInfo contactInfo = null;
        Barcode.DriverLicense driverLicense = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 3:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 4:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 5:
                    i3 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 6:
                    pointArr = (Point[]) C4628a.m23506b(parcel, m23514a, Point.CREATOR);
                    break;
                case 7:
                    email = (Barcode.Email) C4628a.m23510a(parcel, m23514a, Barcode.Email.CREATOR);
                    break;
                case 8:
                    phone = (Barcode.Phone) C4628a.m23510a(parcel, m23514a, Barcode.Phone.CREATOR);
                    break;
                case 9:
                    sms = (Barcode.Sms) C4628a.m23510a(parcel, m23514a, Barcode.Sms.CREATOR);
                    break;
                case 10:
                    wiFi = (Barcode.WiFi) C4628a.m23510a(parcel, m23514a, Barcode.WiFi.CREATOR);
                    break;
                case 11:
                    urlBookmark = (Barcode.UrlBookmark) C4628a.m23510a(parcel, m23514a, Barcode.UrlBookmark.CREATOR);
                    break;
                case 12:
                    geoPoint = (Barcode.GeoPoint) C4628a.m23510a(parcel, m23514a, Barcode.GeoPoint.CREATOR);
                    break;
                case 13:
                    calendarEvent = (Barcode.CalendarEvent) C4628a.m23510a(parcel, m23514a, Barcode.CalendarEvent.CREATOR);
                    break;
                case 14:
                    contactInfo = (Barcode.ContactInfo) C4628a.m23510a(parcel, m23514a, Barcode.ContactInfo.CREATOR);
                    break;
                case 15:
                    driverLicense = (Barcode.DriverLicense) C4628a.m23510a(parcel, m23514a, Barcode.DriverLicense.CREATOR);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new Barcode(i, i2, str, str2, i3, pointArr, email, phone, sms, wiFi, urlBookmark, geoPoint, calendarEvent, contactInfo, driverLicense);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public Barcode[] newArray(int i) {
        return new Barcode[i];
    }
}
