package com.tencent.stat.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
/* renamed from: com.tencent.stat.common.p */
/* loaded from: classes2.dex */
public class C10351p {

    /* renamed from: a */
    private static SharedPreferences f32266a = null;

    /* renamed from: a */
    public static int m5382a(Context context, String str, int i) {
        return m5383a(context).getInt(C10346k.m5423b(context, "" + str), i);
    }

    /* renamed from: a */
    public static long m5381a(Context context, String str, long j) {
        return m5383a(context).getLong(C10346k.m5423b(context, "" + str), j);
    }

    /* renamed from: a */
    static synchronized SharedPreferences m5383a(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (C10351p.class) {
            if (f32266a == null) {
                f32266a = PreferenceManager.getDefaultSharedPreferences(context);
            }
            sharedPreferences = f32266a;
        }
        return sharedPreferences;
    }

    /* renamed from: a */
    public static String m5380a(Context context, String str, String str2) {
        return m5383a(context).getString(C10346k.m5423b(context, "" + str), str2);
    }

    /* renamed from: b */
    public static void m5379b(Context context, String str, int i) {
        String m5423b = C10346k.m5423b(context, "" + str);
        SharedPreferences.Editor edit = m5383a(context).edit();
        edit.putInt(m5423b, i);
        edit.commit();
    }

    /* renamed from: b */
    public static void m5378b(Context context, String str, long j) {
        String m5423b = C10346k.m5423b(context, "" + str);
        SharedPreferences.Editor edit = m5383a(context).edit();
        edit.putLong(m5423b, j);
        edit.commit();
    }

    /* renamed from: b */
    public static void m5377b(Context context, String str, String str2) {
        String m5423b = C10346k.m5423b(context, "" + str);
        SharedPreferences.Editor edit = m5383a(context).edit();
        edit.putString(m5423b, str2);
        edit.commit();
    }
}
