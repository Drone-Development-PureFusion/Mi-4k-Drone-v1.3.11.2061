package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.google.android.gms.tagmanager.an */
/* loaded from: classes2.dex */
public class C9052an {

    /* renamed from: a */
    static Map<String, String> f28695a = new HashMap();

    /* renamed from: b */
    private static String f28696b;

    /* renamed from: a */
    public static String m9314a(Context context, String str, String str2) {
        String str3 = f28695a.get(str);
        if (str3 == null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("gtm_click_referrers", 0);
            str3 = sharedPreferences != null ? sharedPreferences.getString(str, "") : "";
            f28695a.put(str, str3);
        }
        return m9312a(str3, str2);
    }

    /* renamed from: a */
    public static String m9312a(String str, String str2) {
        if (str2 != null) {
            String valueOf = String.valueOf(str);
            return Uri.parse(valueOf.length() != 0 ? "http://hostname/?".concat(valueOf) : new String("http://hostname/?")).getQueryParameter(str2);
        } else if (str.length() <= 0) {
            return null;
        } else {
            return str;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m9315a(Context context, String str) {
        C9133cn.m9162a(context, "gtm_install_referrer", "referrer", str);
        m9310c(context, str);
    }

    /* renamed from: a */
    public static void m9313a(String str) {
        synchronized (C9052an.class) {
            f28696b = str;
        }
    }

    /* renamed from: b */
    public static String m9311b(Context context, String str) {
        if (f28696b == null) {
            synchronized (C9052an.class) {
                if (f28696b == null) {
                    SharedPreferences sharedPreferences = context.getSharedPreferences("gtm_install_referrer", 0);
                    if (sharedPreferences != null) {
                        f28696b = sharedPreferences.getString("referrer", "");
                    } else {
                        f28696b = "";
                    }
                }
            }
        }
        return m9312a(f28696b, str);
    }

    /* renamed from: c */
    public static void m9310c(Context context, String str) {
        String m9312a = m9312a(str, "conv");
        if (m9312a == null || m9312a.length() <= 0) {
            return;
        }
        f28695a.put(m9312a, str);
        C9133cn.m9162a(context, "gtm_click_referrers", m9312a, str);
    }
}
