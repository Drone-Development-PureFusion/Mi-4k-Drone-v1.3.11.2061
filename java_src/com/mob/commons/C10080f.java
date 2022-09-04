package com.mob.commons;

import android.content.Context;
import com.mob.tools.utils.SharePrefrenceHelper;
/* renamed from: com.mob.commons.f */
/* loaded from: classes2.dex */
public class C10080f {

    /* renamed from: a */
    private static SharePrefrenceHelper f31117a;

    /* renamed from: a */
    public static synchronized String m6254a(Context context) {
        String string;
        synchronized (C10080f.class) {
            m6239h(context);
            string = f31117a.getString("key_ext_info");
        }
        return string;
    }

    /* renamed from: a */
    public static synchronized void m6253a(Context context, long j) {
        synchronized (C10080f.class) {
            m6239h(context);
            f31117a.putLong("wifi_last_time", Long.valueOf(j));
        }
    }

    /* renamed from: a */
    public static synchronized void m6252a(Context context, String str) {
        synchronized (C10080f.class) {
            m6239h(context);
            f31117a.putString("key_ext_info", str);
        }
    }

    /* renamed from: b */
    public static synchronized long m6251b(Context context) {
        long j;
        synchronized (C10080f.class) {
            m6239h(context);
            j = f31117a.getLong("wifi_last_time");
        }
        return j;
    }

    /* renamed from: b */
    public static synchronized void m6250b(Context context, long j) {
        synchronized (C10080f.class) {
            m6239h(context);
            f31117a.putLong("key_cellinfo_next_total", Long.valueOf(j));
        }
    }

    /* renamed from: b */
    public static synchronized void m6249b(Context context, String str) {
        synchronized (C10080f.class) {
            m6239h(context);
            f31117a.putString("wifi_last_info", str);
        }
    }

    /* renamed from: c */
    public static synchronized String m6248c(Context context) {
        String string;
        synchronized (C10080f.class) {
            m6239h(context);
            string = f31117a.getString("wifi_last_info");
        }
        return string;
    }

    /* renamed from: c */
    public static synchronized void m6247c(Context context, String str) {
        synchronized (C10080f.class) {
            m6239h(context);
            f31117a.putString("key_cellinfo", str);
        }
    }

    /* renamed from: d */
    public static synchronized String m6246d(Context context) {
        String string;
        synchronized (C10080f.class) {
            m6239h(context);
            string = f31117a.getString("key_cellinfo");
        }
        return string;
    }

    /* renamed from: d */
    public static synchronized void m6245d(Context context, String str) {
        synchronized (C10080f.class) {
            m6239h(context);
            f31117a.putString("key_switches", str);
        }
    }

    /* renamed from: e */
    public static synchronized String m6244e(Context context) {
        String string;
        synchronized (C10080f.class) {
            m6239h(context);
            string = f31117a.getString("key_switches");
        }
        return string;
    }

    /* renamed from: e */
    public static synchronized void m6243e(Context context, String str) {
        synchronized (C10080f.class) {
            m6239h(context);
            if (str == null) {
                f31117a.remove("key_data_url");
            } else {
                f31117a.putString("key_data_url", str);
            }
        }
    }

    /* renamed from: f */
    public static synchronized String m6242f(Context context) {
        String string;
        synchronized (C10080f.class) {
            m6239h(context);
            string = f31117a.getString("key_data_url");
        }
        return string;
    }

    /* renamed from: f */
    public static synchronized void m6241f(Context context, String str) {
        synchronized (C10080f.class) {
            m6239h(context);
            if (str == null) {
                f31117a.remove("key_conf_url");
            } else {
                f31117a.putString("key_conf_url", str);
            }
        }
    }

    /* renamed from: g */
    public static synchronized String m6240g(Context context) {
        String string;
        synchronized (C10080f.class) {
            m6239h(context);
            string = f31117a.getString("key_conf_url");
        }
        return string;
    }

    /* renamed from: h */
    private static synchronized void m6239h(Context context) {
        synchronized (C10080f.class) {
            if (f31117a == null) {
                f31117a = new SharePrefrenceHelper(context.getApplicationContext());
                f31117a.open("mob_commons", 1);
            }
        }
    }
}
