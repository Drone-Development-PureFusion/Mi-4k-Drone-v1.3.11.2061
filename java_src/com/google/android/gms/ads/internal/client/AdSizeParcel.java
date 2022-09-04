package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Parcel;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.C3446d;
import com.google.android.gms.ads.C3789j;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.aaa;
@aaa
/* loaded from: classes.dex */
public class AdSizeParcel extends AbstractSafeParcelable {
    public static final C3587z CREATOR = new C3587z();

    /* renamed from: a */
    public final int f13863a;

    /* renamed from: b */
    public final String f13864b;

    /* renamed from: c */
    public final int f13865c;

    /* renamed from: d */
    public final int f13866d;

    /* renamed from: e */
    public final boolean f13867e;

    /* renamed from: f */
    public final int f13868f;

    /* renamed from: g */
    public final int f13869g;

    /* renamed from: h */
    public final AdSizeParcel[] f13870h;

    /* renamed from: i */
    public final boolean f13871i;

    /* renamed from: j */
    public final boolean f13872j;

    /* renamed from: k */
    public boolean f13873k;

    public AdSizeParcel() {
        this(5, "interstitial_mb", 0, 0, true, 0, 0, null, false, false, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AdSizeParcel(int i, String str, int i2, int i3, boolean z, int i4, int i5, AdSizeParcel[] adSizeParcelArr, boolean z2, boolean z3, boolean z4) {
        this.f13863a = i;
        this.f13864b = str;
        this.f13865c = i2;
        this.f13866d = i3;
        this.f13867e = z;
        this.f13868f = i4;
        this.f13869g = i5;
        this.f13870h = adSizeParcelArr;
        this.f13871i = z2;
        this.f13872j = z3;
        this.f13873k = z4;
    }

    public AdSizeParcel(Context context, C3446d c3446d) {
        this(context, new C3446d[]{c3446d});
    }

    public AdSizeParcel(Context context, C3446d[] c3446dArr) {
        int i;
        C3446d c3446d = c3446dArr[0];
        this.f13863a = 5;
        this.f13867e = false;
        this.f13872j = c3446d.m27811e();
        if (this.f13872j) {
            this.f13868f = C3446d.f13737c.m27815b();
            this.f13865c = C3446d.f13737c.m27817a();
        } else {
            this.f13868f = c3446d.m27815b();
            this.f13865c = c3446d.m27817a();
        }
        boolean z = this.f13868f == -1;
        boolean z2 = this.f13865c == -2;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (z) {
            if (!C3514ac.m27586a().m26850c(context) || !C3514ac.m27586a().m26849d(context)) {
                this.f13869g = m27637a(displayMetrics);
            } else {
                this.f13869g = m27637a(displayMetrics) - C3514ac.m27586a().m26848e(context);
            }
            double d = this.f13869g / displayMetrics.density;
            int i2 = (int) d;
            i = d - ((double) ((int) d)) >= 0.01d ? i2 + 1 : i2;
        } else {
            int i3 = this.f13868f;
            this.f13869g = C3514ac.m27586a().m26862a(displayMetrics, this.f13868f);
            i = i3;
        }
        int m27633c = z2 ? m27633c(displayMetrics) : this.f13865c;
        this.f13866d = C3514ac.m27586a().m26862a(displayMetrics, m27633c);
        if (z || z2) {
            this.f13864b = new StringBuilder(26).append(i).append("x").append(m27633c).append("_as").toString();
        } else if (this.f13872j) {
            this.f13864b = "320x50_mb";
        } else {
            this.f13864b = c3446d.toString();
        }
        if (c3446dArr.length > 1) {
            this.f13870h = new AdSizeParcel[c3446dArr.length];
            for (int i4 = 0; i4 < c3446dArr.length; i4++) {
                this.f13870h[i4] = new AdSizeParcel(context, c3446dArr[i4]);
            }
        } else {
            this.f13870h = null;
        }
        this.f13871i = false;
        this.f13873k = false;
    }

    public AdSizeParcel(AdSizeParcel adSizeParcel, AdSizeParcel[] adSizeParcelArr) {
        this(5, adSizeParcel.f13864b, adSizeParcel.f13865c, adSizeParcel.f13866d, adSizeParcel.f13867e, adSizeParcel.f13868f, adSizeParcel.f13869g, adSizeParcelArr, adSizeParcel.f13871i, adSizeParcel.f13872j, adSizeParcel.f13873k);
    }

    /* renamed from: a */
    public static int m27637a(DisplayMetrics displayMetrics) {
        return displayMetrics.widthPixels;
    }

    /* renamed from: a */
    public static AdSizeParcel m27639a() {
        return new AdSizeParcel(5, "reward_mb", 0, 0, true, 0, 0, null, false, false, false);
    }

    /* renamed from: a */
    public static AdSizeParcel m27638a(Context context) {
        return new AdSizeParcel(5, "320x50_mb", 0, 0, false, 0, 0, null, true, false, false);
    }

    /* renamed from: b */
    public static int m27634b(DisplayMetrics displayMetrics) {
        return (int) (m27633c(displayMetrics) * displayMetrics.density);
    }

    /* renamed from: c */
    private static int m27633c(DisplayMetrics displayMetrics) {
        int i = (int) (displayMetrics.heightPixels / displayMetrics.density);
        if (i <= 400) {
            return 32;
        }
        return i <= 720 ? 50 : 90;
    }

    /* renamed from: a */
    public void m27636a(boolean z) {
        this.f13873k = z;
    }

    /* renamed from: b */
    public C3446d m27635b() {
        return C3789j.m26819a(this.f13868f, this.f13865c, this.f13864b);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3587z.m27409a(this, parcel, i);
    }
}
