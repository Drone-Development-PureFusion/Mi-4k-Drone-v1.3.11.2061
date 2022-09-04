package com.google.android.gms.cast.internal;

import android.text.TextUtils;
import java.util.Locale;
import java.util.regex.Pattern;
/* renamed from: com.google.android.gms.cast.internal.f */
/* loaded from: classes.dex */
public final class C4430f {

    /* renamed from: a */
    private static final Pattern f16657a = Pattern.compile("urn:x-cast:[-A-Za-z0-9_]+(\\.[-A-Za-z0-9_]+)*");

    /* renamed from: a */
    public static double m24207a(long j) {
        return j / 1000.0d;
    }

    /* renamed from: a */
    public static long m24208a(double d) {
        return (long) (1000.0d * d);
    }

    /* renamed from: a */
    public static String m24204a(Locale locale) {
        StringBuilder sb = new StringBuilder(20);
        sb.append(locale.getLanguage());
        String country = locale.getCountry();
        if (!TextUtils.isEmpty(country)) {
            sb.append('-').append(country);
        }
        String variant = locale.getVariant();
        if (!TextUtils.isEmpty(variant)) {
            sb.append('-').append(variant);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static void m24205a(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Namespace cannot be null or empty");
        }
        if (str.length() > 128) {
            throw new IllegalArgumentException("Invalid namespace length");
        }
        if (!str.startsWith("urn:x-cast:")) {
            throw new IllegalArgumentException("Namespace must begin with the prefix \"urn:x-cast:\"");
        }
        if (str.length() != "urn:x-cast:".length()) {
            return;
        }
        throw new IllegalArgumentException("Namespace must begin with the prefix \"urn:x-cast:\" and have non-empty suffix");
    }

    /* renamed from: a */
    private static boolean m24209a(char c) {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || ((c >= '0' && c <= '9') || c == '_' || c == '-');
    }

    /* renamed from: a */
    public static <T> boolean m24206a(T t, T t2) {
        return (t == null && t2 == null) || !(t == null || t2 == null || !t.equals(t2));
    }

    /* renamed from: b */
    public static String m24203b(String str) {
        String valueOf = String.valueOf("urn:x-cast:");
        String valueOf2 = String.valueOf(str);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    /* renamed from: c */
    public static String m24202c(String str) {
        if (f16657a.matcher(str).matches()) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (m24209a(charAt) || charAt == '.' || charAt == ':') {
                sb.append(charAt);
            } else {
                sb.append(String.format("%%%04x", Integer.valueOf(charAt & 65535)));
            }
        }
        return sb.toString();
    }
}
