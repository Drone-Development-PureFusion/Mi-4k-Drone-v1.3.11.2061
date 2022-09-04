package com.android.volley.toolbox;

import com.android.volley.AbstractC0900b;
import com.android.volley.C0912j;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Map;
import org.apache.http.impl.cookie.DateParseException;
import org.apache.http.impl.cookie.DateUtils;
import org.p286a.p287a.C11086e;
/* renamed from: com.android.volley.toolbox.h */
/* loaded from: classes.dex */
public class C0945h {
    /* renamed from: a */
    public static long m37330a(String str) {
        try {
            return DateUtils.parseDate(str).getTime();
        } catch (DateParseException e) {
            return 0L;
        }
    }

    /* renamed from: a */
    public static AbstractC0900b.C0901a m37331a(C0912j c0912j) {
        boolean z;
        boolean z2;
        long j;
        long j2;
        long currentTimeMillis = System.currentTimeMillis();
        Map<String, String> map = c0912j.f2016c;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        String str = map.get("Date");
        if (str != null) {
            j3 = m37330a(str);
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
        long m37330a = str4 != null ? m37330a(str4) : 0L;
        String str5 = map.get("Last-Modified");
        long m37330a2 = str5 != null ? m37330a(str5) : 0L;
        String str6 = map.get(C11086e.f35729v);
        if (z2) {
            j2 = currentTimeMillis + (1000 * j4);
            j = z ? j2 : (1000 * j5) + j2;
        } else if (j3 <= 0 || m37330a < j3) {
            j = 0;
            j2 = 0;
        } else {
            j = (m37330a - j3) + currentTimeMillis;
            j2 = j;
        }
        AbstractC0900b.C0901a c0901a = new AbstractC0900b.C0901a();
        c0901a.f1979a = c0912j.f2015b;
        c0901a.f1980b = str6;
        c0901a.f1984f = j2;
        c0901a.f1983e = j;
        c0901a.f1981c = j3;
        c0901a.f1982d = m37330a2;
        c0901a.f1985g = map;
        return c0901a;
    }

    /* renamed from: a */
    public static String m37329a(Map<String, String> map) {
        return m37328a(map, "ISO-8859-1");
    }

    /* renamed from: a */
    public static String m37328a(Map<String, String> map, String str) {
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
