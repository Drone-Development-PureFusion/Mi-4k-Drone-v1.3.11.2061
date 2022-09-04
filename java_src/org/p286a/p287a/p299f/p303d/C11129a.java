package org.p286a.p287a.p299f.p303d;

import java.util.regex.Pattern;
import org.p286a.p287a.p288a.AbstractC11008b;
@AbstractC11008b
/* renamed from: org.a.a.f.d.a */
/* loaded from: classes2.dex */
public class C11129a {

    /* renamed from: a */
    private static final String f35810a = "(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])";

    /* renamed from: b */
    private static final Pattern f35811b = Pattern.compile("^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$");

    /* renamed from: c */
    private static final Pattern f35812c = Pattern.compile("^::[fF]{4}:(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$");

    /* renamed from: d */
    private static final Pattern f35813d = Pattern.compile("^[0-9a-fA-F]{1,4}(:[0-9a-fA-F]{1,4}){7}$");

    /* renamed from: e */
    private static final Pattern f35814e = Pattern.compile("^(([0-9A-Fa-f]{1,4}(:[0-9A-Fa-f]{1,4}){0,5})?)::(([0-9A-Fa-f]{1,4}(:[0-9A-Fa-f]{1,4}){0,5})?)$");

    /* renamed from: f */
    private static final char f35815f = ':';

    /* renamed from: g */
    private static final int f35816g = 7;

    private C11129a() {
    }

    /* renamed from: a */
    public static boolean m1963a(String str) {
        return f35811b.matcher(str).matches();
    }

    /* renamed from: b */
    public static boolean m1962b(String str) {
        return f35812c.matcher(str).matches();
    }

    /* renamed from: c */
    public static boolean m1961c(String str) {
        return f35813d.matcher(str).matches();
    }

    /* renamed from: d */
    public static boolean m1960d(String str) {
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (str.charAt(i2) == ':') {
                i++;
            }
        }
        return i <= 7 && f35814e.matcher(str).matches();
    }

    /* renamed from: e */
    public static boolean m1959e(String str) {
        return m1961c(str) || m1960d(str);
    }
}
