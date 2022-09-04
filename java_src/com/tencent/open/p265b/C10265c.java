package com.tencent.open.p265b;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Environment;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.tencent.open.p264a.C10257f;
import com.tencent.open.utils.Global;
import java.util.Locale;
/* renamed from: com.tencent.open.b.c */
/* loaded from: classes2.dex */
public class C10265c {

    /* renamed from: d */
    private static String f31932d;

    /* renamed from: a */
    static String f31929a = null;

    /* renamed from: b */
    static String f31930b = null;

    /* renamed from: c */
    static String f31931c = null;

    /* renamed from: e */
    private static String f31933e = null;

    /* renamed from: a */
    public static String m5648a() {
        WifiManager wifiManager;
        WifiInfo connectionInfo;
        try {
            Context context = Global.getContext();
            if (context != null && (wifiManager = (WifiManager) context.getSystemService("wifi")) != null && (connectionInfo = wifiManager.getConnectionInfo()) != null) {
                return connectionInfo.getMacAddress();
            }
            return "";
        } catch (SecurityException e) {
            C10257f.m5672b("MobileInfoUtil", "getLocalMacAddress>>>", e);
            return "";
        }
    }

    /* renamed from: a */
    public static String m5647a(Context context) {
        if (!TextUtils.isEmpty(f31932d)) {
            return f31932d;
        }
        if (context == null) {
            return "";
        }
        f31932d = "";
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            int width = windowManager.getDefaultDisplay().getWidth();
            f31932d = width + "x" + windowManager.getDefaultDisplay().getHeight();
        }
        return f31932d;
    }

    /* renamed from: b */
    public static String m5646b() {
        return Locale.getDefault().getLanguage();
    }

    /* renamed from: b */
    public static String m5645b(Context context) {
        if (f31929a == null || f31929a.length() <= 0) {
            if (context == null) {
                return "";
            }
            try {
                f31929a = ((TelephonyManager) context.getSystemService("phone")).getDeviceId();
                return f31929a;
            } catch (Exception e) {
                return "";
            }
        }
        return f31929a;
    }

    /* renamed from: c */
    public static String m5644c(Context context) {
        if (f31930b == null || f31930b.length() <= 0) {
            if (context == null) {
                return "";
            }
            try {
                f31930b = ((TelephonyManager) context.getSystemService("phone")).getSimSerialNumber();
                return f31930b;
            } catch (Exception e) {
                return "";
            }
        }
        return f31930b;
    }

    /* renamed from: d */
    public static String m5643d(Context context) {
        if (f31931c == null || f31931c.length() <= 0) {
            if (context == null) {
                return "";
            }
            try {
                f31931c = Settings.Secure.getString(context.getContentResolver(), "android_id");
                return f31931c;
            } catch (Exception e) {
                return "";
            }
        }
        return f31931c;
    }

    /* renamed from: e */
    public static String m5642e(Context context) {
        try {
            if (f31933e == null) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
                StringBuilder sb = new StringBuilder();
                sb.append("imei=").append(m5645b(context)).append('&');
                sb.append("model=").append(Build.MODEL).append('&');
                sb.append("os=").append(Build.VERSION.RELEASE).append('&');
                sb.append("apilevel=").append(Build.VERSION.SDK_INT).append('&');
                String m5652b = C10263a.m5652b(context);
                if (m5652b == null) {
                    m5652b = "";
                }
                sb.append("network=").append(m5652b).append('&');
                sb.append("sdcard=").append(Environment.getExternalStorageState().equals("mounted") ? 1 : 0).append('&');
                sb.append("display=").append(displayMetrics.widthPixels).append('*').append(displayMetrics.heightPixels).append('&');
                sb.append("manu=").append(Build.MANUFACTURER).append("&");
                sb.append("wifi=").append(C10263a.m5649e(context));
                f31933e = sb.toString();
            }
            return f31933e;
        } catch (Exception e) {
            return null;
        }
    }
}
