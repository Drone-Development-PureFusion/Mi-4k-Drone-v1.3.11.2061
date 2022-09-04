package com.google.android.gms.cast;

import android.text.TextUtils;
import com.google.android.gms.cast.internal.C4430f;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Collection;
import java.util.Locale;
/* renamed from: com.google.android.gms.cast.b */
/* loaded from: classes2.dex */
public final class C4225b {

    /* renamed from: a */
    public static final String f16075a = "CC1AD845";

    /* renamed from: b */
    public static final String f16076b = "com.google.android.gms.cast.ACTION_SYNC_STATUS";

    /* renamed from: c */
    public static final String f16077c = "com.google.android.gms.cast.EXTRA_CUSTOM_DATA";

    /* renamed from: d */
    public static final String f16078d = "com.google.android.gms.cast.EXTRA_CAST_APPLICATION_ID";

    /* renamed from: e */
    public static final String f16079e = "com.google.android.gms.cast.EXTRA_CAST_RELAUNCH_APPLICATION";

    /* renamed from: f */
    public static final String f16080f = "com.google.android.gms.cast.EXTRA_CAST_LANGUAGE_CODE";

    /* renamed from: g */
    public static final String f16081g = "com.google.android.gms.cast.EXTRA_CAST_STOP_APPLICATION_WHEN_SESSION_ENDS";

    /* renamed from: h */
    public static final String f16082h = "com.google.android.gms.cast.EXTRA_DEBUG_LOGGING_ENABLED";

    /* renamed from: i */
    public static final String f16083i = "com.google.android.gms.cast.EXTRA_ERROR_CODE";

    /* renamed from: j */
    public static final int f16084j = 1;

    /* renamed from: k */
    public static final int f16085k = 2;

    /* renamed from: l */
    public static final int f16086l = 3;

    private C4225b() {
    }

    /* renamed from: a */
    public static String m24927a() {
        return m24925a("com.google.android.gms.cast.CATEGORY_CAST_REMOTE_PLAYBACK", null, null);
    }

    /* renamed from: a */
    public static String m24926a(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("applicationId cannot be null or empty");
        }
        return m24925a("com.google.android.gms.cast.CATEGORY_CAST_REMOTE_PLAYBACK", str, null);
    }

    /* renamed from: a */
    private static String m24925a(String str, String str2, Collection<String> collection) {
        StringBuilder sb = new StringBuilder(str);
        if (str2 != null) {
            String upperCase = str2.toUpperCase();
            if (!upperCase.matches("[A-F0-9]+")) {
                String valueOf = String.valueOf(str2);
                throw new IllegalArgumentException(valueOf.length() != 0 ? "Invalid application ID: ".concat(valueOf) : new String("Invalid application ID: "));
            }
            sb.append("/").append(upperCase);
        }
        if (collection != null) {
            if (collection.isEmpty()) {
                throw new IllegalArgumentException("Must specify at least one namespace");
            }
            if (str2 == null) {
                sb.append("/");
            }
            sb.append("/");
            boolean z = true;
            for (String str3 : collection) {
                C4430f.m24205a(str3);
                if (z) {
                    z = false;
                } else {
                    sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                }
                sb.append(C4430f.m24202c(str3));
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static String m24924a(String str, Collection<String> collection) {
        if (str == null) {
            throw new IllegalArgumentException("applicationId cannot be null");
        }
        if (collection != null) {
            return m24925a("com.google.android.gms.cast.CATEGORY_CAST", str, collection);
        }
        throw new IllegalArgumentException("namespaces cannot be null");
    }

    /* renamed from: a */
    public static String m24923a(Collection<String> collection) {
        if (collection == null) {
            throw new IllegalArgumentException("namespaces cannot be null");
        }
        return m24925a("com.google.android.gms.cast.CATEGORY_CAST", null, collection);
    }

    /* renamed from: a */
    public static String m24922a(Locale locale) {
        return C4430f.m24204a(locale);
    }

    /* renamed from: b */
    public static String m24921b(String str) {
        if (str == null) {
            throw new IllegalArgumentException("applicationId cannot be null");
        }
        return m24925a("com.google.android.gms.cast.CATEGORY_CAST", str, null);
    }
}
