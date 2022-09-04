package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.p004v7.media.SystemMediaRouteProvider;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.ads.internal.C3779u;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
@aaa
/* loaded from: classes.dex */
public class abm {

    /* renamed from: e */
    final String f20985e;

    /* renamed from: a */
    long f20981a = -1;

    /* renamed from: b */
    long f20982b = -1;

    /* renamed from: c */
    int f20983c = -1;

    /* renamed from: d */
    int f20984d = -1;

    /* renamed from: h */
    private final Object f20988h = new Object();

    /* renamed from: f */
    int f20986f = 0;

    /* renamed from: g */
    int f20987g = 0;

    public abm(String str) {
        this.f20985e = str;
    }

    /* renamed from: a */
    public static boolean m18425a(Context context) {
        int identifier = context.getResources().getIdentifier("Theme.Translucent", "style", SystemMediaRouteProvider.PACKAGE_NAME);
        if (identifier == 0) {
            abr.c("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        }
        try {
            if (identifier == context.getPackageManager().getActivityInfo(new ComponentName(context.getPackageName(), AdActivity.f13701a), 0).theme) {
                return true;
            }
            abr.c("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        } catch (PackageManager.NameNotFoundException e) {
            abr.d("Fail to fetch AdActivity theme");
            abr.c("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        }
    }

    /* renamed from: a */
    public long m18427a() {
        return this.f20982b;
    }

    /* renamed from: a */
    public Bundle m18424a(Context context, String str) {
        Bundle bundle;
        synchronized (this.f20988h) {
            bundle = new Bundle();
            bundle.putString("session_id", this.f20985e);
            bundle.putLong("basets", this.f20982b);
            bundle.putLong("currts", this.f20981a);
            bundle.putString("seq_num", str);
            bundle.putInt("preqs", this.f20983c);
            bundle.putInt("preqs_in_session", this.f20984d);
            bundle.putInt("pclick", this.f20986f);
            bundle.putInt("pimp", this.f20987g);
            bundle.putBoolean("support_transparent_background", m18425a(context));
        }
        return bundle;
    }

    /* renamed from: a */
    public void m18426a(int i) {
        this.f20984d = i;
    }

    /* renamed from: a */
    public void m18423a(AdRequestParcel adRequestParcel, long j) {
        synchronized (this.f20988h) {
            if (this.f20982b == -1) {
                if (j - C3779u.m26886i().m18435l() > C7788uf.f25785aq.m13486c().longValue()) {
                    m18426a(-1);
                } else {
                    m18426a(C3779u.m26886i().m18434m());
                }
                this.f20982b = j;
                this.f20981a = this.f20982b;
            } else {
                this.f20981a = j;
            }
            if (adRequestParcel.f13847c == null || adRequestParcel.f13847c.getInt("gw", 2) != 1) {
                this.f20983c++;
                this.f20984d++;
            }
        }
    }

    /* renamed from: b */
    public void m18422b() {
        synchronized (this.f20988h) {
            this.f20986f++;
        }
    }

    /* renamed from: c */
    public void m18421c() {
        synchronized (this.f20988h) {
            this.f20987g++;
        }
    }

    /* renamed from: d */
    public int m18420d() {
        return this.f20984d;
    }
}
