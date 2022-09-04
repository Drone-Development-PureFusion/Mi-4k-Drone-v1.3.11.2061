package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.channel.commonutils.android.C10390b;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.push.service.C10615ak;
import java.util.Locale;
/* renamed from: com.xiaomi.push.service.n */
/* loaded from: classes.dex */
public class C10685n {

    /* renamed from: a */
    public final String f33206a;

    /* renamed from: b */
    public final String f33207b;

    /* renamed from: c */
    public final String f33208c;

    /* renamed from: d */
    public final String f33209d;

    /* renamed from: e */
    public final String f33210e;

    /* renamed from: f */
    public final String f33211f;

    /* renamed from: g */
    public final int f33212g;

    public C10685n(String str, String str2, String str3, String str4, String str5, String str6, int i) {
        this.f33206a = str;
        this.f33207b = str2;
        this.f33208c = str3;
        this.f33209d = str4;
        this.f33210e = str5;
        this.f33211f = str6;
        this.f33212g = i;
    }

    /* renamed from: a */
    public static boolean m4143a() {
        try {
            return Class.forName("miui.os.Build").getField("IS_ALPHA_BUILD").getBoolean(null);
        } catch (Exception e) {
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m4142a(Context context) {
        return "com.xiaomi.xmsf".equals(context.getPackageName()) && m4143a();
    }

    /* renamed from: b */
    private static boolean m4139b(Context context) {
        return context.getPackageName().equals("com.xiaomi.xmsf");
    }

    /* renamed from: a */
    public C10615ak.C10617b m4141a(XMPushService xMPushService) {
        C10615ak.C10617b c10617b = new C10615ak.C10617b(xMPushService);
        m4140a(c10617b, xMPushService, xMPushService.m4459e(), "c");
        return c10617b;
    }

    /* renamed from: a */
    public C10615ak.C10617b m4140a(C10615ak.C10617b c10617b, Context context, C10646b c10646b, String str) {
        c10617b.f32996a = context.getPackageName();
        c10617b.f32997b = this.f33206a;
        c10617b.f33004i = this.f33208c;
        c10617b.f32998c = this.f33207b;
        c10617b.f33003h = "5";
        c10617b.f32999d = "XMPUSH-PASS";
        c10617b.f33000e = false;
        String str2 = "";
        if (m4139b(context)) {
            str2 = C10390b.m5322d(context);
        }
        c10617b.f33001f = String.format("%1$s:%2$s,%3$s:%4$s,%5$s:%6$s:%7$s:%8$s", "sdk_ver", 26, "cpvn", "3_2_1", "cpvc", 30201, "aapn", str2);
        c10617b.f33002g = String.format("%1$s:%2$s,%3$s:%4$s,%5$s:%6$s,sync:1", "appid", m4139b(context) ? "1000271" : this.f33209d, "locale", Locale.getDefault().toString(), Constants.EXTRA_KEY_MIID, C10673k.m4213a(context).m4206c());
        if (m4142a(context)) {
            c10617b.f33002g += String.format(",%1$s:%2$s", "ab", str);
        }
        c10617b.f33006k = c10646b;
        return c10617b;
    }
}
