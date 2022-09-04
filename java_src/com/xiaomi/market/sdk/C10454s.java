package com.xiaomi.market.sdk;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Environment;
import android.util.Log;
import java.io.File;
/* renamed from: com.xiaomi.market.sdk.s */
/* loaded from: classes2.dex */
public class C10454s {
    static boolean DEBUG = false;
    static final String TAG = "MarketSdkUtils";

    /* renamed from: bb */
    static boolean f32509bb = false;

    /* renamed from: bc */
    protected static final int f32510bc = 1000000;

    /* renamed from: bd */
    protected static final int f32511bd = 1000;

    static {
        boolean z = false;
        DEBUG = new File("/sdcard/com.xiaomi.market.sdk/sdk_debug").exists();
        if (new File("/sdcard/com.xiaomi.market.sdk/sdk_staging").exists()) {
            z = true;
        }
        f32509bb = z;
    }

    /* renamed from: a */
    public static String m5082a(long j, Context context) {
        String valueOf;
        int m5081b;
        if (j < 0) {
            return "";
        }
        if (j > 1000000) {
            valueOf = String.format("%.1f", Double.valueOf((j * 1.0d) / 1000000.0d));
            m5081b = m5081b(context.getPackageName(), "string", "xiaomi_megabytes_unit");
        } else if (j > 1000) {
            valueOf = String.format("%.1f", Double.valueOf((j * 1.0d) / 1000.0d));
            m5081b = m5081b(context.getPackageName(), "string", "xiaomi_kilobytes_unit");
        } else {
            valueOf = String.valueOf(j);
            m5081b = m5081b(context.getPackageName(), "string", "xiaomi_bytes_unit");
        }
        return context.getString(m5081b, valueOf);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static int m5081b(String str, String str2, String str3) {
        int i = 0;
        try {
            Class<?>[] classes = Class.forName(String.valueOf(str) + ".R").getClasses();
            Class<?> cls = null;
            int i2 = 0;
            while (true) {
                if (i2 >= classes.length) {
                    break;
                } else if (classes[i2].getName().split("\\$")[1].equals(str2)) {
                    cls = classes[i2];
                    break;
                } else {
                    i2++;
                }
            }
            if (cls == null) {
                if (DEBUG) {
                    Log.d(TAG, "[get resource id] : return id from R$class");
                }
                cls = Class.forName(String.valueOf(str) + ".R$" + str2);
            }
            if (cls != null) {
                i = cls.getField(str3).getInt(cls);
            }
        } catch (Exception e) {
            Log.e(TAG, "[get resource id] : id = 0\nerror: " + e.toString());
        }
        if (DEBUG) {
            Log.d(TAG, "[get resource id] : id = " + i);
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static boolean m5080f(boolean z) {
        String externalStorageState = Environment.getExternalStorageState();
        if ("mounted".equals(externalStorageState)) {
            return true;
        }
        return "mounted_ro".equals(externalStorageState) && !z;
    }

    /* renamed from: k */
    static boolean m5079k(Context context) {
        try {
            return (context.getPackageManager().getPackageInfo("com.miui.cloudservice", 0).applicationInfo.flags & 1) != 0;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public static boolean m5078l(Context context) {
        try {
            context.getPackageManager().getPackageInfo("com.xiaomi.market", 1);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public static boolean m5077m(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public static boolean m5076n(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.getType() == 1;
    }

    /* renamed from: o */
    static boolean m5075o(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.getType() == 0;
    }
}
