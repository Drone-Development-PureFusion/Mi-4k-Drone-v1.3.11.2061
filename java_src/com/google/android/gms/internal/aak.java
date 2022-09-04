package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.C3779u;
import com.google.android.gms.ads.internal.client.C3514ac;
import com.google.android.gms.common.util.C4686i;
import java.util.Locale;
@aaa
/* loaded from: classes.dex */
public final class aak {

    /* renamed from: a */
    public final int f20750a;

    /* renamed from: b */
    public final boolean f20751b;

    /* renamed from: c */
    public final boolean f20752c;

    /* renamed from: d */
    public final String f20753d;

    /* renamed from: e */
    public final String f20754e;

    /* renamed from: f */
    public final boolean f20755f;

    /* renamed from: g */
    public final boolean f20756g;

    /* renamed from: h */
    public final boolean f20757h;

    /* renamed from: i */
    public final boolean f20758i;

    /* renamed from: j */
    public final String f20759j;

    /* renamed from: k */
    public final String f20760k;

    /* renamed from: l */
    public final int f20761l;

    /* renamed from: m */
    public final int f20762m;

    /* renamed from: n */
    public final int f20763n;

    /* renamed from: o */
    public final int f20764o;

    /* renamed from: p */
    public final int f20765p;

    /* renamed from: q */
    public final int f20766q;

    /* renamed from: r */
    public final float f20767r;

    /* renamed from: s */
    public final int f20768s;

    /* renamed from: t */
    public final int f20769t;

    /* renamed from: u */
    public final double f20770u;

    /* renamed from: v */
    public final boolean f20771v;

    /* renamed from: w */
    public final boolean f20772w;

    /* renamed from: x */
    public final int f20773x;

    /* renamed from: y */
    public final String f20774y;

    /* renamed from: z */
    public final boolean f20775z;

    /* renamed from: com.google.android.gms.internal.aak$a */
    /* loaded from: classes2.dex */
    public static final class C6115a {

        /* renamed from: a */
        private int f20776a;

        /* renamed from: b */
        private boolean f20777b;

        /* renamed from: c */
        private boolean f20778c;

        /* renamed from: d */
        private int f20779d;

        /* renamed from: e */
        private int f20780e;

        /* renamed from: f */
        private int f20781f;

        /* renamed from: g */
        private String f20782g;

        /* renamed from: h */
        private int f20783h;

        /* renamed from: i */
        private int f20784i;

        /* renamed from: j */
        private int f20785j;

        /* renamed from: k */
        private boolean f20786k;

        /* renamed from: l */
        private int f20787l;

        /* renamed from: m */
        private double f20788m;

        /* renamed from: n */
        private boolean f20789n;

        /* renamed from: o */
        private String f20790o;

        /* renamed from: p */
        private boolean f20791p;

        /* renamed from: q */
        private boolean f20792q;

        /* renamed from: r */
        private String f20793r;

        /* renamed from: s */
        private boolean f20794s;

        /* renamed from: t */
        private boolean f20795t;

        /* renamed from: u */
        private String f20796u;

        /* renamed from: v */
        private String f20797v;

        /* renamed from: w */
        private float f20798w;

        /* renamed from: x */
        private int f20799x;

        /* renamed from: y */
        private int f20800y;

        /* renamed from: z */
        private boolean f20801z;

        public C6115a(Context context) {
            DisplayMetrics displayMetrics;
            boolean z = true;
            PackageManager packageManager = context.getPackageManager();
            m18607a(context);
            m18606a(context, packageManager);
            m18603b(context);
            Locale locale = Locale.getDefault();
            this.f20791p = m18604a(packageManager, "geo:0,0?q=donuts") != null;
            this.f20792q = m18604a(packageManager, "http://www.google.com") == null ? false : z;
            this.f20793r = locale.getCountry();
            this.f20794s = C3514ac.m27586a().m26867a();
            this.f20795t = C4686i.m23135b(context);
            this.f20796u = locale.getLanguage();
            this.f20797v = m18605a(packageManager);
            Resources resources = context.getResources();
            if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
                return;
            }
            this.f20798w = displayMetrics.density;
            this.f20799x = displayMetrics.widthPixels;
            this.f20800y = displayMetrics.heightPixels;
        }

        public C6115a(Context context, aak aakVar) {
            PackageManager packageManager = context.getPackageManager();
            m18607a(context);
            m18606a(context, packageManager);
            m18603b(context);
            m18602c(context);
            this.f20791p = aakVar.f20751b;
            this.f20792q = aakVar.f20752c;
            this.f20793r = aakVar.f20754e;
            this.f20794s = aakVar.f20755f;
            this.f20795t = aakVar.f20756g;
            this.f20796u = aakVar.f20759j;
            this.f20797v = aakVar.f20760k;
            this.f20798w = aakVar.f20767r;
            this.f20799x = aakVar.f20768s;
            this.f20800y = aakVar.f20769t;
        }

        /* renamed from: a */
        private static ResolveInfo m18604a(PackageManager packageManager, String str) {
            return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
        }

        /* renamed from: a */
        private static String m18605a(PackageManager packageManager) {
            ActivityInfo activityInfo;
            ResolveInfo m18604a = m18604a(packageManager, "market://details?id=com.google.android.gms.ads");
            if (m18604a == null || (activityInfo = m18604a.activityInfo) == null) {
                return null;
            }
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(activityInfo.packageName, 0);
                if (packageInfo == null) {
                    return null;
                }
                int i = packageInfo.versionCode;
                String valueOf = String.valueOf(activityInfo.packageName);
                return new StringBuilder(String.valueOf(valueOf).length() + 12).append(i).append(".").append(valueOf).toString();
            } catch (PackageManager.NameNotFoundException e) {
                return null;
            }
        }

        /* renamed from: a */
        private void m18607a(Context context) {
            AudioManager m18311i = C3779u.m26890e().m18311i(context);
            if (m18311i != null) {
                try {
                    this.f20776a = m18311i.getMode();
                    this.f20777b = m18311i.isMusicActive();
                    this.f20778c = m18311i.isSpeakerphoneOn();
                    this.f20779d = m18311i.getStreamVolume(3);
                    this.f20780e = m18311i.getRingerMode();
                    this.f20781f = m18311i.getStreamVolume(2);
                    return;
                } catch (Throwable th) {
                    C3779u.m26886i().m18451a(th, "DeviceInfo.gatherAudioInfo");
                }
            }
            this.f20776a = -2;
            this.f20777b = false;
            this.f20778c = false;
            this.f20779d = 0;
            this.f20780e = 0;
            this.f20781f = 0;
        }

        @TargetApi(16)
        /* renamed from: a */
        private void m18606a(Context context, PackageManager packageManager) {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            this.f20782g = telephonyManager.getNetworkOperator();
            this.f20784i = telephonyManager.getNetworkType();
            this.f20785j = telephonyManager.getPhoneType();
            this.f20783h = -2;
            this.f20786k = false;
            this.f20787l = -1;
            if (C3779u.m26890e().m18364a(packageManager, context.getPackageName(), "android.permission.ACCESS_NETWORK_STATE")) {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null) {
                    this.f20783h = activeNetworkInfo.getType();
                    this.f20787l = activeNetworkInfo.getDetailedState().ordinal();
                } else {
                    this.f20783h = -1;
                }
                if (Build.VERSION.SDK_INT < 16) {
                    return;
                }
                this.f20786k = connectivityManager.isActiveNetworkMetered();
            }
        }

        /* renamed from: b */
        private void m18603b(Context context) {
            boolean z = false;
            Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver == null) {
                this.f20788m = -1.0d;
                this.f20789n = false;
                return;
            }
            int intExtra = registerReceiver.getIntExtra("status", -1);
            this.f20788m = registerReceiver.getIntExtra("level", -1) / registerReceiver.getIntExtra("scale", -1);
            if (intExtra == 2 || intExtra == 5) {
                z = true;
            }
            this.f20789n = z;
        }

        /* renamed from: c */
        private void m18602c(Context context) {
            this.f20790o = Build.FINGERPRINT;
            this.f20801z = C7811ut.m13414a(context);
        }

        /* renamed from: a */
        public aak m18608a() {
            return new aak(this.f20776a, this.f20791p, this.f20792q, this.f20782g, this.f20793r, this.f20794s, this.f20795t, this.f20777b, this.f20778c, this.f20796u, this.f20797v, this.f20779d, this.f20783h, this.f20784i, this.f20785j, this.f20780e, this.f20781f, this.f20798w, this.f20799x, this.f20800y, this.f20788m, this.f20789n, this.f20786k, this.f20787l, this.f20790o, this.f20801z);
        }
    }

    aak(int i, boolean z, boolean z2, String str, String str2, boolean z3, boolean z4, boolean z5, boolean z6, String str3, String str4, int i2, int i3, int i4, int i5, int i6, int i7, float f, int i8, int i9, double d, boolean z7, boolean z8, int i10, String str5, boolean z9) {
        this.f20750a = i;
        this.f20751b = z;
        this.f20752c = z2;
        this.f20753d = str;
        this.f20754e = str2;
        this.f20755f = z3;
        this.f20756g = z4;
        this.f20757h = z5;
        this.f20758i = z6;
        this.f20759j = str3;
        this.f20760k = str4;
        this.f20761l = i2;
        this.f20762m = i3;
        this.f20763n = i4;
        this.f20764o = i5;
        this.f20765p = i6;
        this.f20766q = i7;
        this.f20767r = f;
        this.f20768s = i8;
        this.f20769t = i9;
        this.f20770u = d;
        this.f20771v = z7;
        this.f20772w = z8;
        this.f20773x = i10;
        this.f20774y = str5;
        this.f20775z = z9;
    }
}
