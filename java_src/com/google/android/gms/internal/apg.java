package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public class apg {

    /* renamed from: a */
    static Map<String, String> f22699a = new HashMap();

    /* renamed from: b */
    private static String f22700b;

    /* renamed from: a */
    public static String m16399a(Context context, String str) {
        if (f22700b == null) {
            synchronized (apg.class) {
                if (f22700b == null) {
                    SharedPreferences sharedPreferences = context.getSharedPreferences("gtm_install_referrer", 0);
                    if (sharedPreferences != null) {
                        f22700b = sharedPreferences.getString("referrer", "");
                    } else {
                        f22700b = "";
                    }
                }
            }
        }
        return m16398a(f22700b, str);
    }

    /* renamed from: a */
    public static String m16398a(String str, String str2) {
        if (str2 != null) {
            String valueOf = String.valueOf(str);
            return Uri.parse(valueOf.length() != 0 ? "http://hostname/?".concat(valueOf) : new String("http://hostname/?")).getQueryParameter(str2);
        } else if (str.length() <= 0) {
            return null;
        } else {
            return str;
        }
    }
}
