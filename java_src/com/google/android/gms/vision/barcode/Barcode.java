package com.google.android.gms.vision.barcode;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class Barcode extends AbstractSafeParcelable {
    public static final C9253c CREATOR = new C9253c();

    /* renamed from: a */
    public static final int f29120a = 0;

    /* renamed from: b */
    public static final int f29121b = 1;

    /* renamed from: c */
    public static final int f29122c = 2;

    /* renamed from: d */
    public static final int f29123d = 4;

    /* renamed from: e */
    public static final int f29124e = 8;

    /* renamed from: f */
    public static final int f29125f = 16;

    /* renamed from: g */
    public static final int f29126g = 32;

    /* renamed from: h */
    public static final int f29127h = 64;

    /* renamed from: i */
    public static final int f29128i = 128;

    /* renamed from: j */
    public static final int f29129j = 256;

    /* renamed from: k */
    public static final int f29130k = 512;

    /* renamed from: l */
    public static final int f29131l = 1024;

    /* renamed from: m */
    public static final int f29132m = 2048;

    /* renamed from: n */
    public static final int f29133n = 4096;

    /* renamed from: o */
    public static final int f29134o = 1;

    /* renamed from: p */
    public static final int f29135p = 2;

    /* renamed from: q */
    public static final int f29136q = 3;

    /* renamed from: r */
    public static final int f29137r = 4;

    /* renamed from: s */
    public static final int f29138s = 5;

    /* renamed from: t */
    public static final int f29139t = 6;

    /* renamed from: u */
    public static final int f29140u = 7;

    /* renamed from: v */
    public static final int f29141v = 8;

    /* renamed from: w */
    public static final int f29142w = 9;

    /* renamed from: x */
    public static final int f29143x = 10;

    /* renamed from: y */
    public static final int f29144y = 11;

    /* renamed from: z */
    public static final int f29145z = 12;

    /* renamed from: A */
    final int f29146A;

    /* renamed from: B */
    public int f29147B;

    /* renamed from: C */
    public String f29148C;

    /* renamed from: D */
    public String f29149D;

    /* renamed from: E */
    public int f29150E;

    /* renamed from: F */
    public Point[] f29151F;

    /* renamed from: G */
    public Email f29152G;

    /* renamed from: H */
    public Phone f29153H;

    /* renamed from: I */
    public Sms f29154I;

    /* renamed from: J */
    public WiFi f29155J;

    /* renamed from: K */
    public UrlBookmark f29156K;

    /* renamed from: L */
    public GeoPoint f29157L;

    /* renamed from: M */
    public CalendarEvent f29158M;

    /* renamed from: N */
    public ContactInfo f29159N;

    /* renamed from: O */
    public DriverLicense f29160O;

    /* loaded from: classes2.dex */
    public static class Address extends AbstractSafeParcelable {
        public static final C9252b CREATOR = new C9252b();

        /* renamed from: b */
        public static final int f29161b = 0;

        /* renamed from: c */
        public static final int f29162c = 1;

        /* renamed from: d */
        public static final int f29163d = 2;

        /* renamed from: a */
        final int f29164a;

        /* renamed from: e */
        public int f29165e;

        /* renamed from: f */
        public String[] f29166f;

        public Address() {
            this.f29164a = 1;
        }

        public Address(int i, int i2, String[] strArr) {
            this.f29164a = i;
            this.f29165e = i2;
            this.f29166f = strArr;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            C9252b c9252b = CREATOR;
            C9252b.m8815a(this, parcel, i);
        }
    }

    /* loaded from: classes2.dex */
    public static class CalendarDateTime extends AbstractSafeParcelable {
        public static final C9254d CREATOR = new C9254d();

        /* renamed from: a */
        final int f29167a;

        /* renamed from: b */
        public int f29168b;

        /* renamed from: c */
        public int f29169c;

        /* renamed from: d */
        public int f29170d;

        /* renamed from: e */
        public int f29171e;

        /* renamed from: f */
        public int f29172f;

        /* renamed from: g */
        public int f29173g;

        /* renamed from: h */
        public boolean f29174h;

        /* renamed from: i */
        public String f29175i;

        public CalendarDateTime() {
            this.f29167a = 1;
        }

        public CalendarDateTime(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, String str) {
            this.f29167a = i;
            this.f29168b = i2;
            this.f29169c = i3;
            this.f29170d = i4;
            this.f29171e = i5;
            this.f29172f = i6;
            this.f29173g = i7;
            this.f29174h = z;
            this.f29175i = str;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            C9254d c9254d = CREATOR;
            C9254d.m8809a(this, parcel, i);
        }
    }

    /* loaded from: classes2.dex */
    public static class CalendarEvent extends AbstractSafeParcelable {
        public static final C9255e CREATOR = new C9255e();

        /* renamed from: a */
        final int f29176a;

        /* renamed from: b */
        public String f29177b;

        /* renamed from: c */
        public String f29178c;

        /* renamed from: d */
        public String f29179d;

        /* renamed from: e */
        public String f29180e;

        /* renamed from: f */
        public String f29181f;

        /* renamed from: g */
        public CalendarDateTime f29182g;

        /* renamed from: h */
        public CalendarDateTime f29183h;

        public CalendarEvent() {
            this.f29176a = 1;
        }

        public CalendarEvent(int i, String str, String str2, String str3, String str4, String str5, CalendarDateTime calendarDateTime, CalendarDateTime calendarDateTime2) {
            this.f29176a = i;
            this.f29177b = str;
            this.f29178c = str2;
            this.f29179d = str3;
            this.f29180e = str4;
            this.f29181f = str5;
            this.f29182g = calendarDateTime;
            this.f29183h = calendarDateTime2;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            C9255e c9255e = CREATOR;
            C9255e.m8806a(this, parcel, i);
        }
    }

    /* loaded from: classes2.dex */
    public static class ContactInfo extends AbstractSafeParcelable {
        public static final C9256f CREATOR = new C9256f();

        /* renamed from: a */
        final int f29184a;

        /* renamed from: b */
        public PersonName f29185b;

        /* renamed from: c */
        public String f29186c;

        /* renamed from: d */
        public String f29187d;

        /* renamed from: e */
        public Phone[] f29188e;

        /* renamed from: f */
        public Email[] f29189f;

        /* renamed from: g */
        public String[] f29190g;

        /* renamed from: h */
        public Address[] f29191h;

        public ContactInfo() {
            this.f29184a = 1;
        }

        public ContactInfo(int i, PersonName personName, String str, String str2, Phone[] phoneArr, Email[] emailArr, String[] strArr, Address[] addressArr) {
            this.f29184a = i;
            this.f29185b = personName;
            this.f29186c = str;
            this.f29187d = str2;
            this.f29188e = phoneArr;
            this.f29189f = emailArr;
            this.f29190g = strArr;
            this.f29191h = addressArr;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            C9256f c9256f = CREATOR;
            C9256f.m8803a(this, parcel, i);
        }
    }

    /* loaded from: classes2.dex */
    public static class DriverLicense extends AbstractSafeParcelable {
        public static final C9257g CREATOR = new C9257g();

        /* renamed from: a */
        final int f29192a;

        /* renamed from: b */
        public String f29193b;

        /* renamed from: c */
        public String f29194c;

        /* renamed from: d */
        public String f29195d;

        /* renamed from: e */
        public String f29196e;

        /* renamed from: f */
        public String f29197f;

        /* renamed from: g */
        public String f29198g;

        /* renamed from: h */
        public String f29199h;

        /* renamed from: i */
        public String f29200i;

        /* renamed from: j */
        public String f29201j;

        /* renamed from: k */
        public String f29202k;

        /* renamed from: l */
        public String f29203l;

        /* renamed from: m */
        public String f29204m;

        /* renamed from: n */
        public String f29205n;

        /* renamed from: o */
        public String f29206o;

        public DriverLicense() {
            this.f29192a = 1;
        }

        public DriverLicense(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
            this.f29192a = i;
            this.f29193b = str;
            this.f29194c = str2;
            this.f29195d = str3;
            this.f29196e = str4;
            this.f29197f = str5;
            this.f29198g = str6;
            this.f29199h = str7;
            this.f29200i = str8;
            this.f29201j = str9;
            this.f29202k = str10;
            this.f29203l = str11;
            this.f29204m = str12;
            this.f29205n = str13;
            this.f29206o = str14;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            C9257g c9257g = CREATOR;
            C9257g.m8800a(this, parcel, i);
        }
    }

    /* loaded from: classes2.dex */
    public static class Email extends AbstractSafeParcelable {
        public static final C9258h CREATOR = new C9258h();

        /* renamed from: a */
        public static final int f29207a = 0;

        /* renamed from: b */
        public static final int f29208b = 1;

        /* renamed from: c */
        public static final int f29209c = 2;

        /* renamed from: d */
        final int f29210d;

        /* renamed from: e */
        public int f29211e;

        /* renamed from: f */
        public String f29212f;

        /* renamed from: g */
        public String f29213g;

        /* renamed from: h */
        public String f29214h;

        public Email() {
            this.f29210d = 1;
        }

        public Email(int i, int i2, String str, String str2, String str3) {
            this.f29210d = i;
            this.f29211e = i2;
            this.f29212f = str;
            this.f29213g = str2;
            this.f29214h = str3;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            C9258h c9258h = CREATOR;
            C9258h.m8797a(this, parcel, i);
        }
    }

    /* loaded from: classes2.dex */
    public static class GeoPoint extends AbstractSafeParcelable {
        public static final C9259i CREATOR = new C9259i();

        /* renamed from: a */
        final int f29215a;

        /* renamed from: b */
        public double f29216b;

        /* renamed from: c */
        public double f29217c;

        public GeoPoint() {
            this.f29215a = 1;
        }

        public GeoPoint(int i, double d, double d2) {
            this.f29215a = i;
            this.f29216b = d;
            this.f29217c = d2;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            C9259i c9259i = CREATOR;
            C9259i.m8794a(this, parcel, i);
        }
    }

    /* loaded from: classes2.dex */
    public static class PersonName extends AbstractSafeParcelable {
        public static final C9268j CREATOR = new C9268j();

        /* renamed from: a */
        final int f29218a;

        /* renamed from: b */
        public String f29219b;

        /* renamed from: c */
        public String f29220c;

        /* renamed from: d */
        public String f29221d;

        /* renamed from: e */
        public String f29222e;

        /* renamed from: f */
        public String f29223f;

        /* renamed from: g */
        public String f29224g;

        /* renamed from: h */
        public String f29225h;

        public PersonName() {
            this.f29218a = 1;
        }

        public PersonName(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            this.f29218a = i;
            this.f29219b = str;
            this.f29220c = str2;
            this.f29221d = str3;
            this.f29222e = str4;
            this.f29223f = str5;
            this.f29224g = str6;
            this.f29225h = str7;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            C9268j c9268j = CREATOR;
            C9268j.m8779a(this, parcel, i);
        }
    }

    /* loaded from: classes2.dex */
    public static class Phone extends AbstractSafeParcelable {
        public static final C9269k CREATOR = new C9269k();

        /* renamed from: a */
        public static final int f29226a = 0;

        /* renamed from: b */
        public static final int f29227b = 1;

        /* renamed from: c */
        public static final int f29228c = 2;

        /* renamed from: d */
        public static final int f29229d = 3;

        /* renamed from: e */
        public static final int f29230e = 4;

        /* renamed from: f */
        final int f29231f;

        /* renamed from: g */
        public int f29232g;

        /* renamed from: h */
        public String f29233h;

        public Phone() {
            this.f29231f = 1;
        }

        public Phone(int i, int i2, String str) {
            this.f29231f = i;
            this.f29232g = i2;
            this.f29233h = str;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            C9269k c9269k = CREATOR;
            C9269k.m8776a(this, parcel, i);
        }
    }

    /* loaded from: classes2.dex */
    public static class Sms extends AbstractSafeParcelable {
        public static final C9270l CREATOR = new C9270l();

        /* renamed from: a */
        final int f29234a;

        /* renamed from: b */
        public String f29235b;

        /* renamed from: c */
        public String f29236c;

        public Sms() {
            this.f29234a = 1;
        }

        public Sms(int i, String str, String str2) {
            this.f29234a = i;
            this.f29235b = str;
            this.f29236c = str2;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            C9270l c9270l = CREATOR;
            C9270l.m8773a(this, parcel, i);
        }
    }

    /* loaded from: classes2.dex */
    public static class UrlBookmark extends AbstractSafeParcelable {
        public static final C9271m CREATOR = new C9271m();

        /* renamed from: a */
        final int f29237a;

        /* renamed from: b */
        public String f29238b;

        /* renamed from: c */
        public String f29239c;

        public UrlBookmark() {
            this.f29237a = 1;
        }

        public UrlBookmark(int i, String str, String str2) {
            this.f29237a = i;
            this.f29238b = str;
            this.f29239c = str2;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            C9271m c9271m = CREATOR;
            C9271m.m8770a(this, parcel, i);
        }
    }

    /* loaded from: classes2.dex */
    public static class WiFi extends AbstractSafeParcelable {
        public static final C9272n CREATOR = new C9272n();

        /* renamed from: a */
        public static final int f29240a = 1;

        /* renamed from: b */
        public static final int f29241b = 2;

        /* renamed from: c */
        public static final int f29242c = 3;

        /* renamed from: d */
        final int f29243d;

        /* renamed from: e */
        public String f29244e;

        /* renamed from: f */
        public String f29245f;

        /* renamed from: g */
        public int f29246g;

        public WiFi() {
            this.f29243d = 1;
        }

        public WiFi(int i, String str, String str2, int i2) {
            this.f29243d = i;
            this.f29244e = str;
            this.f29245f = str2;
            this.f29246g = i2;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            C9272n c9272n = CREATOR;
            C9272n.m8767a(this, parcel, i);
        }
    }

    public Barcode() {
        this.f29146A = 1;
    }

    public Barcode(int i, int i2, String str, String str2, int i3, Point[] pointArr, Email email, Phone phone, Sms sms, WiFi wiFi, UrlBookmark urlBookmark, GeoPoint geoPoint, CalendarEvent calendarEvent, ContactInfo contactInfo, DriverLicense driverLicense) {
        this.f29146A = i;
        this.f29147B = i2;
        this.f29148C = str;
        this.f29149D = str2;
        this.f29150E = i3;
        this.f29151F = pointArr;
        this.f29152G = email;
        this.f29153H = phone;
        this.f29154I = sms;
        this.f29155J = wiFi;
        this.f29156K = urlBookmark;
        this.f29157L = geoPoint;
        this.f29158M = calendarEvent;
        this.f29159N = contactInfo;
        this.f29160O = driverLicense;
    }

    /* renamed from: a */
    public Rect m8820a() {
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        for (int i5 = 0; i5 < this.f29151F.length; i5++) {
            Point point = this.f29151F[i5];
            i4 = Math.min(i4, point.x);
            i3 = Math.max(i3, point.x);
            i = Math.min(i, point.y);
            i2 = Math.max(i2, point.y);
        }
        return new Rect(i4, i, i3, i2);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9253c c9253c = CREATOR;
        C9253c.m8812a(this, parcel, i);
    }
}
