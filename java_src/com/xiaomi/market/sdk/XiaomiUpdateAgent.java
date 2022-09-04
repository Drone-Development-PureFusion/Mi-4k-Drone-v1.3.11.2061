package com.xiaomi.market.sdk;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.io.File;
/* loaded from: classes2.dex */
public class XiaomiUpdateAgent {
    private static final String TAG = "MarketUpdateAgent";

    /* renamed from: aK */
    private static C10458w f32389aK;

    /* renamed from: aL */
    private static C10452q f32390aL;

    /* renamed from: be */
    private static boolean f32391be = true;

    /* renamed from: bf */
    private static boolean f32392bf = false;

    /* renamed from: bg */
    private static boolean f32393bg = false;

    /* renamed from: bh */
    private static XiaomiUpdateListener f32394bh;
    private static Context mContext;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Context getContext() {
        return mContext;
    }

    public static int getSDKVersion() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public static C10452q m5163p(Context context) {
        PackageInfo packageInfo;
        C10452q m5088h = C10452q.m5088h(context.getPackageName());
        PackageManager packageManager = context.getPackageManager();
        try {
            packageInfo = packageManager.getPackageInfo(m5088h.packageName, 64);
        } catch (PackageManager.NameNotFoundException e) {
            Log.e(TAG, "get package info failed");
            packageInfo = null;
        }
        if (packageInfo == null || packageInfo.applicationInfo == null) {
            return null;
        }
        m5088h.f32502aT = packageManager.getApplicationLabel(packageInfo.applicationInfo).toString();
        m5088h.versionCode = packageInfo.versionCode;
        m5088h.versionName = packageInfo.versionName;
        m5088h.f32503aU = C10437b.m5142a(String.valueOf(packageInfo.signatures[0].toChars()));
        m5088h.sourceDir = packageInfo.applicationInfo.sourceDir;
        m5088h.f32504aV = C10437b.m5143a(new File(m5088h.sourceDir));
        return m5088h;
    }

    public static void setCheckUpdateOnlyWifi(boolean z) {
        f32392bf = z;
    }

    public static void setUpdateAutoPopup(boolean z) {
        f32391be = z;
    }

    public static void setUpdateListener(XiaomiUpdateListener xiaomiUpdateListener) {
        f32394bh = xiaomiUpdateListener;
    }

    public static void update(Context context) {
        if (context == null) {
            return;
        }
        mContext = context;
        C10445j.m5108k();
        new AsyncTaskC10455t(null).execute(new Void[0]);
    }
}
