package com.xiaomi.channel.commonutils.android;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
import com.xiaomi.channel.commonutils.reflect.C10426a;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/* renamed from: com.xiaomi.channel.commonutils.android.j */
/* loaded from: classes.dex */
public class C10399j {

    /* renamed from: a */
    private static Context f32326a;

    /* renamed from: a */
    public static Context m5295a() {
        return f32326a;
    }

    /* renamed from: a */
    public static void m5294a(Context context) {
        f32326a = context.getApplicationContext();
    }

    /* renamed from: b */
    public static String m5293b() {
        String m5310c = C10394e.m5310c(f32326a);
        if (m5310c == null) {
            m5310c = C10394e.m5308e(f32326a);
        }
        if (m5310c != null) {
            try {
                return Base64.encodeToString(MessageDigest.getInstance("SHA1").digest(m5310c.getBytes()), 8).substring(0, 16);
            } catch (NoSuchAlgorithmException e) {
                AbstractC10404b.m5267a(e);
            }
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m5292b(Context context) {
        try {
            return (context.getApplicationInfo().flags & 2) != 0;
        } catch (Exception e) {
            AbstractC10404b.m5267a(e);
            return false;
        }
    }

    /* renamed from: c */
    public static int m5291c() {
        try {
            Class<?> cls = Class.forName("miui.os.Build");
            if (cls.getField("IS_STABLE_VERSION").getBoolean(null)) {
                return 3;
            }
            return cls.getField("IS_DEVELOPMENT_VERSION").getBoolean(null) ? 2 : 1;
        } catch (Exception e) {
            return 0;
        }
    }

    /* renamed from: d */
    public static boolean m5290d() {
        return TextUtils.equals((String) C10426a.m5199a("android.os.SystemProperties", "get", "sys.boot_completed"), "1");
    }
}
