package com.google.android.gms.internal;

import com.google.android.gms.internal.AbstractC7674ru;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Map;
import org.apache.http.impl.cookie.DateParseException;
import org.apache.http.impl.cookie.DateUtils;
import org.p286a.p287a.C11086e;
/* loaded from: classes2.dex */
public class aol {
    /* renamed from: a */
    public static long m16502a(String str) {
        try {
            return DateUtils.parseDate(str).getTime();
        } catch (DateParseException e) {
            return 0L;
        }
    }

    /* renamed from: a */
    public static AbstractC7674ru.C7675a m16503a(C8092zb c8092zb) {
        boolean z;
        boolean z2;
        long j;
        long j2;
        long currentTimeMillis = System.currentTimeMillis();
        Map<String, String> map = c8092zb.f26444c;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        String str = map.get("Date");
        if (str != null) {
            j3 = m16502a(str);
        }
        String str2 = map.get("Cache-Control");
        if (str2 != null) {
            String[] split = str2.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
            z = false;
            long j6 = 0;
            long j7 = 0;
            for (String str3 : split) {
                String trim = str3.trim();
                if (trim.equals("no-cache") || trim.equals("no-store")) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j7 = Long.parseLong(trim.substring(8));
                    } catch (Exception e) {
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    try {
                        j6 = Long.parseLong(trim.substring(23));
                    } catch (Exception e2) {
                    }
                } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                    z = true;
                }
            }
            j4 = j7;
            j5 = j6;
            z2 = true;
        } else {
            z = false;
            z2 = false;
        }
        String str4 = map.get("Expires");
        long m16502a = str4 != null ? m16502a(str4) : 0L;
        String str5 = map.get("Last-Modified");
        long m16502a2 = str5 != null ? m16502a(str5) : 0L;
        String str6 = map.get(C11086e.f35729v);
        if (z2) {
            j2 = currentTimeMillis + (1000 * j4);
            j = z ? j2 : (1000 * j5) + j2;
        } else if (j3 <= 0 || m16502a < j3) {
            j = 0;
            j2 = 0;
        } else {
            j = (m16502a - j3) + currentTimeMillis;
            j2 = j;
        }
        AbstractC7674ru.C7675a c7675a = new AbstractC7674ru.C7675a();
        c7675a.f25470a = c8092zb.f26443b;
        c7675a.f25471b = str6;
        c7675a.f25475f = j2;
        c7675a.f25474e = j;
        c7675a.f25472c = j3;
        c7675a.f25473d = m16502a2;
        c7675a.f25476g = map;
        return c7675a;
    }

    /* renamed from: a */
    public static String m16501a(Map<String, String> map) {
        return m16500a(map, "ISO-8859-1");
    }

    /* renamed from: a */
    public static String m16500a(Map<String, String> map, String str) {
        String str2 = map.get("Content-Type");
        if (str2 != null) {
            String[] split = str2.split(";");
            for (int i = 1; i < split.length; i++) {
                String[] split2 = split[i].trim().split("=");
                if (split2.length == 2 && split2[0].equals("charset")) {
                    return split2[1];
                }
            }
            return str;
        }
        return str;
    }
}
