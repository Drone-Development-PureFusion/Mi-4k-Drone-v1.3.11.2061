package com.google.android.gms.location.internal;

import android.annotation.SuppressLint;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.AbstractC8167f;
import java.util.Locale;
/* loaded from: classes2.dex */
public class ParcelableGeofence extends AbstractSafeParcelable implements AbstractC8167f {
    public static final C8221o CREATOR = new C8221o();

    /* renamed from: e */
    private final int f26754e;

    /* renamed from: f */
    private final String f26755f;

    /* renamed from: g */
    private final long f26756g;

    /* renamed from: h */
    private final short f26757h;

    /* renamed from: i */
    private final double f26758i;

    /* renamed from: j */
    private final double f26759j;

    /* renamed from: k */
    private final float f26760k;

    /* renamed from: l */
    private final int f26761l;

    /* renamed from: m */
    private final int f26762m;

    /* renamed from: n */
    private final int f26763n;

    public ParcelableGeofence(int i, String str, int i2, short s, double d, double d2, float f, long j, int i3, int i4) {
        m12531a(str);
        m12533a(f);
        m12534a(d, d2);
        int m12532a = m12532a(i2);
        this.f26754e = i;
        this.f26757h = s;
        this.f26755f = str;
        this.f26758i = d;
        this.f26759j = d2;
        this.f26760k = f;
        this.f26756g = j;
        this.f26761l = m12532a;
        this.f26762m = i3;
        this.f26763n = i4;
    }

    public ParcelableGeofence(String str, int i, short s, double d, double d2, float f, long j, int i2, int i3) {
        this(1, str, i, s, d, d2, f, j, i2, i3);
    }

    /* renamed from: a */
    private static int m12532a(int i) {
        int i2 = i & 7;
        if (i2 == 0) {
            throw new IllegalArgumentException(new StringBuilder(46).append("No supported transition specified: ").append(i).toString());
        }
        return i2;
    }

    /* renamed from: a */
    public static ParcelableGeofence m12530a(byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        ParcelableGeofence parcelableGeofence = (ParcelableGeofence) CREATOR.createFromParcel(obtain);
        obtain.recycle();
        return parcelableGeofence;
    }

    /* renamed from: a */
    private static void m12534a(double d, double d2) {
        if (d > 90.0d || d < -90.0d) {
            throw new IllegalArgumentException(new StringBuilder(42).append("invalid latitude: ").append(d).toString());
        }
        if (d2 <= 180.0d && d2 >= -180.0d) {
            return;
        }
        throw new IllegalArgumentException(new StringBuilder(43).append("invalid longitude: ").append(d2).toString());
    }

    /* renamed from: a */
    private static void m12533a(float f) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException(new StringBuilder(31).append("invalid radius: ").append(f).toString());
        }
    }

    /* renamed from: a */
    private static void m12531a(String str) {
        if (str == null || str.length() > 100) {
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? "requestId is null or too long: ".concat(valueOf) : new String("requestId is null or too long: "));
        }
    }

    @SuppressLint({"DefaultLocale"})
    /* renamed from: b */
    private static String m12528b(int i) {
        switch (i) {
            case 1:
                return "CIRCLE";
            default:
                return null;
        }
    }

    @Override // com.google.android.gms.location.AbstractC8167f
    /* renamed from: a */
    public String mo12535a() {
        return this.f26755f;
    }

    /* renamed from: b */
    public int m12529b() {
        return this.f26754e;
    }

    /* renamed from: c */
    public short m12527c() {
        return this.f26757h;
    }

    /* renamed from: d */
    public double m12526d() {
        return this.f26758i;
    }

    /* renamed from: e */
    public double m12525e() {
        return this.f26759j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof ParcelableGeofence)) {
            ParcelableGeofence parcelableGeofence = (ParcelableGeofence) obj;
            return this.f26760k == parcelableGeofence.f26760k && this.f26758i == parcelableGeofence.f26758i && this.f26759j == parcelableGeofence.f26759j && this.f26757h == parcelableGeofence.f26757h;
        }
        return false;
    }

    /* renamed from: f */
    public float m12524f() {
        return this.f26760k;
    }

    /* renamed from: g */
    public long m12523g() {
        return this.f26756g;
    }

    /* renamed from: h */
    public int m12522h() {
        return this.f26761l;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f26758i);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f26759j);
        return ((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + Float.floatToIntBits(this.f26760k)) * 31) + this.f26757h) * 31) + this.f26761l;
    }

    /* renamed from: i */
    public int m12521i() {
        return this.f26762m;
    }

    /* renamed from: j */
    public int m12520j() {
        return this.f26763n;
    }

    public String toString() {
        return String.format(Locale.US, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", m12528b(this.f26757h), this.f26755f, Integer.valueOf(this.f26761l), Double.valueOf(this.f26758i), Double.valueOf(this.f26759j), Float.valueOf(this.f26760k), Integer.valueOf(this.f26762m / 1000), Integer.valueOf(this.f26763n), Long.valueOf(this.f26756g));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8221o c8221o = CREATOR;
        C8221o.m12387a(this, parcel, i);
    }
}
