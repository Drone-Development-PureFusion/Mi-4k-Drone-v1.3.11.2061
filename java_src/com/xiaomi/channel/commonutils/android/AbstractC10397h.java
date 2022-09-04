package com.xiaomi.channel.commonutils.android;

import android.content.Context;
import android.preference.PreferenceManager;
import java.util.Map;
/* renamed from: com.xiaomi.channel.commonutils.android.h */
/* loaded from: classes2.dex */
public abstract class AbstractC10397h {
    /* renamed from: a */
    public static void m5300a(Context context) {
    }

    /* renamed from: a */
    public static void m5298a(Map<String, String> map, String str, String str2) {
        if (map == null || str == null || str2 == null) {
            return;
        }
        map.put(str, str2);
    }

    /* renamed from: a */
    public static boolean m5299a(Context context, String str, boolean z) {
        m5300a(context);
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean(str, z);
    }

    /* renamed from: b */
    public static void m5297b(Context context, String str, boolean z) {
        m5300a(context);
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean(str, z).commit();
    }
}
