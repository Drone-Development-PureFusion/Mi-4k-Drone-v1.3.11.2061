package com.xiaomi.mistatistic.sdk.controller;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/* renamed from: com.xiaomi.mistatistic.sdk.controller.g */
/* loaded from: classes2.dex */
public class C10526g {

    /* renamed from: a */
    private static String f32677a;

    /* renamed from: a */
    public static String m4852a(Context context) {
        String str;
        String str2 = null;
        if (0 == 0) {
            String m4849b = m4849b(context);
            try {
                str = Settings.Secure.getString(context.getContentResolver(), "android_id");
            } catch (Throwable th) {
                str = null;
            }
            if (Build.VERSION.SDK_INT > 8) {
                str2 = Build.SERIAL;
            }
            return m4848b(m4849b + str + str2);
        }
        return null;
    }

    /* renamed from: b */
    public static String m4849b(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            String deviceId = telephonyManager.getDeviceId();
            int i = 10;
            while (deviceId == null) {
                int i2 = i - 1;
                if (i <= 0) {
                    break;
                }
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException e) {
                }
                deviceId = telephonyManager.getDeviceId();
                i = i2;
            }
            return deviceId;
        } catch (Throwable th) {
            return null;
        }
    }

    /* renamed from: b */
    private static String m4848b(String str) {
        if (str != null) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
                messageDigest.update(m4847c(str));
                return String.format("%1$032X", new BigInteger(1, messageDigest.digest()));
            } catch (NoSuchAlgorithmException e) {
                return str;
            }
        }
        return null;
    }

    /* renamed from: c */
    private static byte[] m4847c(String str) {
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            return str.getBytes();
        }
    }

    /* renamed from: a */
    public String m4853a() {
        if (f32677a != null) {
            return f32677a;
        }
        C10521b.m4859a().m4856a(new C10527h(AbstractC10508a.m4880a()));
        return null;
    }
}
