package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.C3514ac;
import it.p273a.p274a.AbstractC10866e;
/* renamed from: com.google.android.gms.ads.d */
/* loaded from: classes2.dex */
public final class C3446d {

    /* renamed from: a */
    public static final int f13735a = -1;

    /* renamed from: b */
    public static final int f13736b = -2;

    /* renamed from: c */
    public static final C3446d f13737c = new C3446d(320, 50, "320x50_mb");

    /* renamed from: d */
    public static final C3446d f13738d = new C3446d(468, 60, "468x60_as");

    /* renamed from: e */
    public static final C3446d f13739e = new C3446d(320, 100, "320x100_as");

    /* renamed from: f */
    public static final C3446d f13740f = new C3446d(728, 90, "728x90_as");

    /* renamed from: g */
    public static final C3446d f13741g = new C3446d(300, AbstractC10866e.f34828G, "300x250_as");

    /* renamed from: h */
    public static final C3446d f13742h = new C3446d(160, 600, "160x600_as");

    /* renamed from: i */
    public static final C3446d f13743i = new C3446d(-1, -2, "smart_banner");

    /* renamed from: j */
    public static final C3446d f13744j = new C3446d(-3, -4, "fluid");

    /* renamed from: k */
    public static final C3446d f13745k = new C3446d(-3, 0, "search_v2");

    /* renamed from: l */
    private final int f13746l;

    /* renamed from: m */
    private final int f13747m;

    /* renamed from: n */
    private final String f13748n;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3446d(int i, int i2) {
        this(i, i2, new StringBuilder(String.valueOf(r1).length() + 1 + String.valueOf(r0).length() + String.valueOf(r2).length()).append(r1).append("x").append(r0).append(r2).toString());
        String valueOf = i == -1 ? "FULL" : String.valueOf(i);
        String valueOf2 = i2 == -2 ? "AUTO" : String.valueOf(i2);
        String valueOf3 = String.valueOf("_as");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3446d(int i, int i2, String str) {
        if (i >= 0 || i == -1 || i == -3) {
            if (i2 < 0 && i2 != -2 && i2 != -4) {
                throw new IllegalArgumentException(new StringBuilder(38).append("Invalid height for AdSize: ").append(i2).toString());
            }
            this.f13746l = i;
            this.f13747m = i2;
            this.f13748n = str;
            return;
        }
        throw new IllegalArgumentException(new StringBuilder(37).append("Invalid width for AdSize: ").append(i).toString());
    }

    /* renamed from: a */
    public int m27817a() {
        return this.f13747m;
    }

    /* renamed from: a */
    public int m27816a(Context context) {
        switch (this.f13747m) {
            case -4:
            case -3:
                return -1;
            case -2:
                return AdSizeParcel.m27634b(context.getResources().getDisplayMetrics());
            default:
                return C3514ac.m27586a().m26865a(context, this.f13747m);
        }
    }

    /* renamed from: b */
    public int m27815b() {
        return this.f13746l;
    }

    /* renamed from: b */
    public int m27814b(Context context) {
        switch (this.f13746l) {
            case -4:
            case -3:
                return -1;
            case -2:
            default:
                return C3514ac.m27586a().m26865a(context, this.f13746l);
            case -1:
                return AdSizeParcel.m27637a(context.getResources().getDisplayMetrics());
        }
    }

    /* renamed from: c */
    public boolean m27813c() {
        return this.f13747m == -2;
    }

    /* renamed from: d */
    public boolean m27812d() {
        return this.f13746l == -1;
    }

    /* renamed from: e */
    public boolean m27811e() {
        return this.f13746l == -3 && this.f13747m == -4;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3446d)) {
            return false;
        }
        C3446d c3446d = (C3446d) obj;
        return this.f13746l == c3446d.f13746l && this.f13747m == c3446d.f13747m && this.f13748n.equals(c3446d.f13748n);
    }

    public int hashCode() {
        return this.f13748n.hashCode();
    }

    public String toString() {
        return this.f13748n;
    }
}
