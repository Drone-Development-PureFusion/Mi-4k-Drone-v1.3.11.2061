package com.google.android.gms.analytics.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.text.TextUtils;
import com.fimi.soul.biz.camera.C1831e;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.util.C4691n;
import com.google.android.gms.internal.adp;
import com.google.firebase.p253b.C9755a;
import com.xiaomi.mipush.sdk.Constants;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p005b.p006a.p007a.p008a.p026n.C0363a;
/* renamed from: com.google.android.gms.analytics.internal.p */
/* loaded from: classes2.dex */
public class C3909p {

    /* renamed from: a */
    private static final char[] f15129a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    public static double m26195a(String str, double d) {
        if (str == null) {
            return d;
        }
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException e) {
            return d;
        }
    }

    /* renamed from: a */
    public static adp m26197a(C3893g c3893g, String str) {
        C4588d.m23627a(c3893g);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        new HashMap();
        try {
            String valueOf = String.valueOf(str);
            Map<String, String> m23126a = C4691n.m23126a(new URI(valueOf.length() != 0 ? C0363a.f360a.concat(valueOf) : new String(C0363a.f360a)), "UTF-8");
            adp adpVar = new adp();
            adpVar.m18013e(m23126a.get("utm_content"));
            adpVar.m18017c(m23126a.get("utm_medium"));
            adpVar.m18021a(m23126a.get("utm_campaign"));
            adpVar.m18019b(m23126a.get("utm_source"));
            adpVar.m18015d(m23126a.get("utm_term"));
            adpVar.m18011f(m23126a.get("utm_id"));
            adpVar.m18009g(m23126a.get("anid"));
            adpVar.m18007h(m23126a.get("gclid"));
            adpVar.m18005i(m23126a.get("dclid"));
            adpVar.m18003j(m23126a.get("aclid"));
            return adpVar;
        } catch (URISyntaxException e) {
            c3893g.d("No valid campaign data found", e);
            return null;
        }
    }

    /* renamed from: a */
    public static String m26193a(Locale locale) {
        if (locale == null) {
            return null;
        }
        String language = locale.getLanguage();
        if (TextUtils.isEmpty(language)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(language.toLowerCase());
        if (!TextUtils.isEmpty(locale.getCountry())) {
            sb.append(Constants.ACCEPT_TIME_SEPARATOR_SERVER).append(locale.getCountry().toLowerCase());
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static String m26189a(boolean z) {
        return z ? "1" : "0";
    }

    /* renamed from: a */
    public static Map<String, String> m26196a(String str) {
        HashMap hashMap = new HashMap();
        for (String str2 : str.split("&")) {
            String[] split = str2.split("=", 3);
            if (split.length > 1) {
                hashMap.put(split[0], TextUtils.isEmpty(split[1]) ? null : split[1]);
                if (split.length == 3 && !TextUtils.isEmpty(split[1]) && !hashMap.containsKey(split[1])) {
                    hashMap.put(split[1], TextUtils.isEmpty(split[2]) ? null : split[2]);
                }
            } else if (split.length == 1 && split[0].length() != 0) {
                hashMap.put(split[0], null);
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public static void m26192a(Map<String, String> map, String str, String str2) {
        if (str2 == null || map.containsKey(str)) {
            return;
        }
        map.put(str, str2);
    }

    /* renamed from: a */
    public static void m26191a(Map<String, String> map, String str, Map<String, String> map2) {
        m26192a(map, str, map2.get(str));
    }

    /* renamed from: a */
    public static void m26190a(Map<String, String> map, String str, boolean z) {
        if (!map.containsKey(str)) {
            map.put(str, z ? "1" : "0");
        }
    }

    /* renamed from: a */
    public static boolean m26200a(double d, String str) {
        return d > C9755a.f30449c && d < 100.0d && ((double) (m26184e(str) % 10000)) >= 100.0d * d;
    }

    /* renamed from: a */
    public static boolean m26199a(Context context, String str) {
        try {
            ServiceInfo serviceInfo = context.getPackageManager().getServiceInfo(new ComponentName(context, str), 4);
            if (serviceInfo != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException e) {
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m26198a(Context context, String str, boolean z) {
        try {
            ActivityInfo receiverInfo = context.getPackageManager().getReceiverInfo(new ComponentName(context, str), 2);
            if (receiverInfo != null && receiverInfo.enabled) {
                if (z) {
                    if (receiverInfo.exported) {
                    }
                }
                return true;
            }
        } catch (PackageManager.NameNotFoundException e) {
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m26194a(String str, boolean z) {
        if (str != null) {
            if (str.equalsIgnoreCase("true") || str.equalsIgnoreCase(C1831e.f4910cD) || str.equalsIgnoreCase("1")) {
                return true;
            }
            if (!str.equalsIgnoreCase("false") && !str.equalsIgnoreCase("no") && !str.equalsIgnoreCase("0")) {
                return z;
            }
            return false;
        }
        return z;
    }

    /* renamed from: b */
    public static long m26188b(String str) {
        if (str == null) {
            return 0L;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException e) {
            return 0L;
        }
    }

    /* renamed from: b */
    public static void m26187b(Map<String, String> map, String str, String str2) {
        if (str2 == null || !TextUtils.isEmpty(map.get(str))) {
            return;
        }
        map.put(str, str2);
    }

    /* renamed from: c */
    public static String m26186c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.contains(C0363a.f360a)) {
            String[] split = str.split("[\\?]");
            if (split.length > 1) {
                str = split[1];
            }
        }
        if (str.contains("%3D")) {
            try {
                str = URLDecoder.decode(str, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                return null;
            }
        } else if (!str.contains("=")) {
            return null;
        }
        Map<String, String> m26196a = m26196a(str);
        String[] strArr = {"dclid", "utm_source", "gclid", "aclid", "utm_campaign", "utm_medium", "utm_term", "utm_content", "utm_id", "anid", "gmob_t"};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 11; i++) {
            if (!TextUtils.isEmpty(m26196a.get(strArr[i]))) {
                if (sb.length() > 0) {
                    sb.append("&");
                }
                sb.append(strArr[i]).append("=").append(m26196a.get(strArr[i]));
            }
        }
        return sb.toString();
    }

    /* renamed from: d */
    public static MessageDigest m26185d(String str) {
        MessageDigest messageDigest;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < 2) {
                try {
                    messageDigest = MessageDigest.getInstance(str);
                } catch (NoSuchAlgorithmException e) {
                }
                if (messageDigest != null) {
                    return messageDigest;
                }
                i = i2 + 1;
            } else {
                return null;
            }
        }
    }

    /* renamed from: e */
    public static int m26184e(String str) {
        int i = 1;
        if (!TextUtils.isEmpty(str)) {
            i = 0;
            for (int length = str.length() - 1; length >= 0; length--) {
                char charAt = str.charAt(length);
                i = ((i << 6) & 268435455) + charAt + (charAt << 14);
                int i2 = 266338304 & i;
                if (i2 != 0) {
                    i ^= i2 >> 21;
                }
            }
        }
        return i;
    }

    /* renamed from: f */
    public static boolean m26183f(String str) {
        return TextUtils.isEmpty(str) || !str.startsWith("http:");
    }
}
