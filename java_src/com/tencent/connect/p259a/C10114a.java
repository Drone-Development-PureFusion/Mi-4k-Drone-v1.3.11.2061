package com.tencent.connect.p259a;

import android.content.Context;
import com.fimi.soul.biz.p170b.C1760b;
import com.tencent.connect.auth.QQToken;
import com.tencent.open.utils.OpenConfig;
import java.lang.reflect.Method;
/* renamed from: com.tencent.connect.a.a */
/* loaded from: classes2.dex */
public class C10114a {

    /* renamed from: a */
    private static Class<?> f31141a = null;

    /* renamed from: b */
    private static Class<?> f31142b = null;

    /* renamed from: c */
    private static Method f31143c = null;

    /* renamed from: d */
    private static Method f31144d = null;

    /* renamed from: e */
    private static Method f31145e = null;

    /* renamed from: f */
    private static Method f31146f = null;

    /* renamed from: g */
    private static boolean f31147g = false;

    /* renamed from: a */
    public static void m6184a(Context context, QQToken qQToken, String str, String... strArr) {
        if (!f31147g) {
            return;
        }
        m6183b(context, qQToken);
        try {
            f31144d.invoke(f31142b, context, str, strArr);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static boolean m6185a(Context context, QQToken qQToken) {
        return OpenConfig.getInstance(context, qQToken.getAppId()).getBoolean("Common_ta_enable");
    }

    /* renamed from: b */
    public static void m6183b(Context context, QQToken qQToken) {
        try {
            if (m6185a(context, qQToken)) {
                f31146f.invoke(f31141a, true);
            } else {
                f31146f.invoke(f31141a, false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    public static void m6182c(Context context, QQToken qQToken) {
        String str = "Aqc" + qQToken.getAppId();
        try {
            f31141a = Class.forName("com.tencent.stat.StatConfig");
            f31142b = Class.forName("com.tencent.stat.StatService");
            f31143c = f31142b.getMethod("reportQQ", new Class[0]);
            f31144d = f31142b.getMethod("trackCustomEvent", new Class[0]);
            f31145e = f31142b.getMethod("commitEvents", new Class[0]);
            f31146f = f31141a.getMethod("setEnableStatService", new Class[0]);
            m6183b(context, qQToken);
            f31141a.getMethod("setAutoExceptionCaught", new Class[0]).invoke(f31141a, false);
            f31141a.getMethod("setEnableSmartReporting", new Class[0]).invoke(f31141a, true);
            f31141a.getMethod("setSendPeriodMinutes", new Class[0]).invoke(f31141a, 1440);
            f31141a.getMethod("setStatSendStrategy", new Class[0]).invoke(f31141a, Integer.valueOf(Class.forName("com.tencent.stat.StatReportStrategy").getField("PERIOD").getInt(null)));
            f31141a.getMethod("setStatReportUrl", new Class[0]).invoke(f31141a, "http://cgi.connect.qq.com/qqconnectutil/sdk");
            f31142b.getMethod("startStatService", new Class[0]).invoke(f31142b, context, str, Integer.valueOf(Class.forName("com.tencent.stat.common.StatConstants").getField(C1760b.f4582e).getInt(null)));
            f31147g = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: d */
    public static void m6181d(Context context, QQToken qQToken) {
        if (!f31147g) {
            return;
        }
        m6183b(context, qQToken);
        if (qQToken.getOpenId() == null) {
            return;
        }
        try {
            f31143c.invoke(f31142b, context, qQToken.getOpenId());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
