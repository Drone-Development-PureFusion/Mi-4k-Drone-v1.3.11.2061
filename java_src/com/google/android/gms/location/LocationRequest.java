package com.google.android.gms.location;

import android.os.Parcel;
import android.os.SystemClock;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.tencent.p263mm.sdk.platformtools.LocaleUtil;
import com.tencent.p263mm.sdk.platformtools.Util;
/* loaded from: classes2.dex */
public final class LocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final C8228m CREATOR = new C8228m();

    /* renamed from: a */
    public static final int f26671a = 100;

    /* renamed from: b */
    public static final int f26672b = 102;

    /* renamed from: c */
    public static final int f26673c = 104;

    /* renamed from: d */
    public static final int f26674d = 105;

    /* renamed from: e */
    int f26675e;

    /* renamed from: f */
    long f26676f;

    /* renamed from: g */
    long f26677g;

    /* renamed from: h */
    boolean f26678h;

    /* renamed from: i */
    long f26679i;

    /* renamed from: j */
    int f26680j;

    /* renamed from: k */
    float f26681k;

    /* renamed from: l */
    long f26682l;

    /* renamed from: m */
    private final int f26683m;

    public LocationRequest() {
        this.f26683m = 1;
        this.f26675e = 102;
        this.f26676f = Util.MILLSECONDS_OF_HOUR;
        this.f26677g = 600000L;
        this.f26678h = false;
        this.f26679i = Long.MAX_VALUE;
        this.f26680j = Integer.MAX_VALUE;
        this.f26681k = 0.0f;
        this.f26682l = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LocationRequest(int i, int i2, long j, long j2, boolean z, long j3, int i3, float f, long j4) {
        this.f26683m = i;
        this.f26675e = i2;
        this.f26676f = j;
        this.f26677g = j2;
        this.f26678h = z;
        this.f26679i = j3;
        this.f26680j = i3;
        this.f26681k = f;
        this.f26682l = j4;
    }

    /* renamed from: a */
    public static LocationRequest m12627a() {
        return new LocationRequest();
    }

    /* renamed from: b */
    private static void m12622b(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException(new StringBuilder(37).append("invalid displacement: ").append(f).toString());
        }
    }

    /* renamed from: c */
    public static String m12618c(int i) {
        switch (i) {
            case 100:
                return "PRIORITY_HIGH_ACCURACY";
            case 101:
            case 103:
            default:
                return "???";
            case 102:
                return "PRIORITY_BALANCED_POWER_ACCURACY";
            case 104:
                return "PRIORITY_LOW_POWER";
            case 105:
                return "PRIORITY_NO_POWER";
        }
    }

    /* renamed from: d */
    private static void m12615d(int i) {
        switch (i) {
            case 100:
            case 102:
            case 104:
            case 105:
                return;
            case 101:
            case 103:
            default:
                throw new IllegalArgumentException(new StringBuilder(28).append("invalid quality: ").append(i).toString());
        }
    }

    /* renamed from: f */
    private static void m12610f(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(new StringBuilder(38).append("invalid interval: ").append(j).toString());
        }
    }

    /* renamed from: a */
    public LocationRequest m12626a(float f) {
        m12622b(f);
        this.f26681k = f;
        return this;
    }

    /* renamed from: a */
    public LocationRequest m12625a(int i) {
        m12615d(i);
        this.f26675e = i;
        return this;
    }

    /* renamed from: a */
    public LocationRequest m12624a(long j) {
        m12610f(j);
        this.f26676f = j;
        if (!this.f26678h) {
            this.f26677g = (long) (this.f26676f / 6.0d);
        }
        return this;
    }

    /* renamed from: b */
    public int m12623b() {
        return this.f26675e;
    }

    /* renamed from: b */
    public LocationRequest m12621b(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(new StringBuilder(31).append("invalid numUpdates: ").append(i).toString());
        }
        this.f26680j = i;
        return this;
    }

    /* renamed from: b */
    public LocationRequest m12620b(long j) {
        m12610f(j);
        this.f26682l = j;
        return this;
    }

    /* renamed from: c */
    public long m12619c() {
        return this.f26676f;
    }

    /* renamed from: c */
    public LocationRequest m12617c(long j) {
        m12610f(j);
        this.f26678h = true;
        this.f26677g = j;
        return this;
    }

    /* renamed from: d */
    public long m12616d() {
        long j = this.f26682l;
        return j < this.f26676f ? this.f26676f : j;
    }

    /* renamed from: d */
    public LocationRequest m12614d(long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (j > Long.MAX_VALUE - elapsedRealtime) {
            this.f26679i = Long.MAX_VALUE;
        } else {
            this.f26679i = elapsedRealtime + j;
        }
        if (this.f26679i < 0) {
            this.f26679i = 0L;
        }
        return this;
    }

    /* renamed from: e */
    public long m12613e() {
        return this.f26677g;
    }

    /* renamed from: e */
    public LocationRequest m12612e(long j) {
        this.f26679i = j;
        if (this.f26679i < 0) {
            this.f26679i = 0L;
        }
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationRequest)) {
            return false;
        }
        LocationRequest locationRequest = (LocationRequest) obj;
        return this.f26675e == locationRequest.f26675e && this.f26676f == locationRequest.f26676f && this.f26677g == locationRequest.f26677g && this.f26678h == locationRequest.f26678h && this.f26679i == locationRequest.f26679i && this.f26680j == locationRequest.f26680j && this.f26681k == locationRequest.f26681k;
    }

    /* renamed from: f */
    public long m12611f() {
        return this.f26679i;
    }

    /* renamed from: g */
    public int m12609g() {
        return this.f26680j;
    }

    /* renamed from: h */
    public float m12608h() {
        return this.f26681k;
    }

    public int hashCode() {
        return C4585c.m23633a(Integer.valueOf(this.f26675e), Long.valueOf(this.f26676f), Long.valueOf(this.f26677g), Boolean.valueOf(this.f26678h), Long.valueOf(this.f26679i), Integer.valueOf(this.f26680j), Float.valueOf(this.f26681k));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public int m12607i() {
        return this.f26683m;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request[").append(m12618c(this.f26675e));
        if (this.f26675e != 105) {
            sb.append(" requested=");
            sb.append(this.f26676f).append(LocaleUtil.MALAY);
        }
        sb.append(" fastest=");
        sb.append(this.f26677g).append(LocaleUtil.MALAY);
        if (this.f26682l > this.f26676f) {
            sb.append(" maxWait=");
            sb.append(this.f26682l).append(LocaleUtil.MALAY);
        }
        if (this.f26679i != Long.MAX_VALUE) {
            sb.append(" expireIn=");
            sb.append(this.f26679i - SystemClock.elapsedRealtime()).append(LocaleUtil.MALAY);
        }
        if (this.f26680j != Integer.MAX_VALUE) {
            sb.append(" num=").append(this.f26680j);
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8228m.m12373a(this, parcel, i);
    }
}
