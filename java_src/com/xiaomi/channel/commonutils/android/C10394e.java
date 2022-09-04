package com.xiaomi.channel.commonutils.android;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
import com.xiaomi.channel.commonutils.reflect.C10426a;
import com.xiaomi.channel.commonutils.string.C10433d;
/* renamed from: com.xiaomi.channel.commonutils.android.e */
/* loaded from: classes2.dex */
public class C10394e {

    /* renamed from: a */
    private static String f32322a = null;

    /* renamed from: b */
    private static String f32323b = null;

    /* renamed from: c */
    private static String f32324c = null;

    /* renamed from: a */
    public static String m5314a() {
        if (Build.VERSION.SDK_INT > 8) {
            return Build.SERIAL;
        }
        return null;
    }

    /* renamed from: a */
    public static String m5313a(Context context) {
        if (f32323b == null) {
            String m5310c = m5310c(context);
            String m5311b = m5311b(context);
            f32323b = "a-" + C10433d.m5172b(m5310c + m5311b + m5314a());
        }
        return f32323b;
    }

    @TargetApi(17)
    /* renamed from: b */
    public static int m5312b() {
        Object m5199a;
        if (Build.VERSION.SDK_INT >= 17 && (m5199a = C10426a.m5199a("android.os.UserHandle", "myUserId", new Object[0])) != null) {
            return ((Integer) Integer.class.cast(m5199a)).intValue();
        }
        return -1;
    }

    /* renamed from: b */
    public static String m5311b(Context context) {
        try {
            return Settings.Secure.getString(context.getContentResolver(), "android_id");
        } catch (Throwable th) {
            AbstractC10404b.m5267a(th);
            return null;
        }
    }

    /* renamed from: c */
    public static String m5310c(Context context) {
        int i = 10;
        String m5309d = m5309d(context);
        while (m5309d == null) {
            int i2 = i - 1;
            if (i <= 0) {
                break;
            }
            try {
                Thread.sleep(500L);
            } catch (InterruptedException e) {
            }
            m5309d = m5309d(context);
            i = i2;
        }
        return m5309d;
    }

    /* renamed from: d */
    public static String m5309d(Context context) {
        Object m5199a;
        Object m5200a;
        if (f32322a != null) {
            return f32322a;
        }
        try {
            String str = (!C10396g.m5303a() || (m5199a = C10426a.m5199a("miui.telephony.TelephonyManager", "getDefault", new Object[0])) == null || (m5200a = C10426a.m5200a(m5199a, "getMiuiDeviceId", new Object[0])) == null || !(m5200a instanceof String)) ? null : (String) String.class.cast(m5200a);
            if (str == null && m5305h(context)) {
                str = ((TelephonyManager) context.getSystemService("phone")).getDeviceId();
            }
            if (str == null) {
                return str;
            }
            f32322a = str;
            return str;
        } catch (Throwable th) {
            AbstractC10404b.m5267a(th);
            return null;
        }
    }

    /* renamed from: e */
    public static synchronized String m5308e(Context context) {
        String str;
        synchronized (C10394e.class) {
            if (f32324c != null) {
                str = f32324c;
            } else {
                String m5311b = m5311b(context);
                f32324c = C10433d.m5172b(m5311b + m5314a());
                str = f32324c;
            }
        }
        return str;
    }

    /* renamed from: f */
    public static String m5307f(Context context) {
        return ((TelephonyManager) context.getSystemService("phone")).getSimOperatorName();
    }

    /* renamed from: g */
    public static String m5306g(Context context) {
        try {
            return ((WifiManager) context.getSystemService("wifi")).getConnectionInfo().getMacAddress();
        } catch (Exception e) {
            AbstractC10404b.m5267a(e);
            return null;
        }
    }

    /* renamed from: h */
    private static boolean m5305h(Context context) {
        return context.getPackageManager().checkPermission("android.permission.READ_PHONE_STATE", context.getPackageName()) == 0;
    }
}
