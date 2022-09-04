package com.google.android.gms.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C3779u;
import com.xiaomi.mipush.sdk.Constants;
import java.math.BigInteger;
import java.util.Locale;
@aaa
/* loaded from: classes.dex */
public final class abp {

    /* renamed from: a */
    private static final Object f20994a = new Object();

    /* renamed from: b */
    private static String f20995b;

    /* renamed from: a */
    public static String m18416a() {
        String str;
        synchronized (f20994a) {
            str = f20995b;
        }
        return str;
    }

    /* renamed from: a */
    public static String m18415a(Context context, String str, String str2) {
        String str3;
        synchronized (f20994a) {
            if (f20995b == null && !TextUtils.isEmpty(str)) {
                m18414b(context, str, str2);
            }
            str3 = f20995b;
        }
        return str3;
    }

    /* renamed from: b */
    private static void m18414b(Context context, String str, String str2) {
        try {
            ClassLoader classLoader = context.createPackageContext(str2, 3).getClassLoader();
            Class<?> cls = Class.forName("com.google.ads.mediation.MediationAdapter", false, classLoader);
            BigInteger bigInteger = new BigInteger(new byte[1]);
            String[] split = str.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
            BigInteger bigInteger2 = bigInteger;
            for (int i = 0; i < split.length; i++) {
                if (C3779u.m26890e().m18349a(classLoader, cls, split[i])) {
                    bigInteger2 = bigInteger2.setBit(i);
                }
            }
            f20995b = String.format(Locale.US, "%X", bigInteger2);
        } catch (Throwable th) {
            f20995b = "err";
        }
    }
}
