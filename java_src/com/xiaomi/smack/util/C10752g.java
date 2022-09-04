package com.xiaomi.smack.util;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
import com.xiaomi.channel.commonutils.misc.C10414h;
import com.xiaomi.market.sdk.C10447l;
import com.xiaomi.push.providers.C10582a;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* renamed from: com.xiaomi.smack.util.g */
/* loaded from: classes.dex */
public class C10752g {

    /* renamed from: a */
    private static C10414h f33558a = new C10414h(true);

    /* renamed from: b */
    private static int f33559b = -1;

    /* renamed from: c */
    private static final Object f33560c = new Object();

    /* renamed from: d */
    private static List<C10753a> f33561d = Collections.synchronizedList(new ArrayList());

    /* renamed from: e */
    private static String f33562e = "";

    /* renamed from: f */
    private static C10582a f33563f = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.xiaomi.smack.util.g$a */
    /* loaded from: classes2.dex */
    public static class C10753a {

        /* renamed from: a */
        public String f33564a;

        /* renamed from: b */
        public long f33565b;

        /* renamed from: c */
        public int f33566c;

        /* renamed from: d */
        public int f33567d;

        /* renamed from: e */
        public String f33568e;

        /* renamed from: f */
        public long f33569f;

        public C10753a(String str, long j, int i, int i2, String str2, long j2) {
            this.f33564a = "";
            this.f33565b = 0L;
            this.f33566c = -1;
            this.f33567d = -1;
            this.f33568e = "";
            this.f33569f = 0L;
            this.f33564a = str;
            this.f33565b = j;
            this.f33566c = i;
            this.f33567d = i2;
            this.f33568e = str2;
            this.f33569f = j2;
        }

        /* renamed from: a */
        public boolean m3818a(C10753a c10753a) {
            return TextUtils.equals(c10753a.f33564a, this.f33564a) && TextUtils.equals(c10753a.f33568e, this.f33568e) && c10753a.f33566c == this.f33566c && c10753a.f33567d == this.f33567d && Math.abs(c10753a.f33565b - this.f33565b) <= 5000;
        }
    }

    /* renamed from: a */
    private static int m3828a(Context context) {
        if (f33559b == -1) {
            f33559b = m3822b(context);
        }
        return f33559b;
    }

    /* renamed from: a */
    public static int m3824a(String str) {
        try {
            return str.getBytes("UTF-8").length;
        } catch (UnsupportedEncodingException e) {
            return str.getBytes().length;
        }
    }

    /* renamed from: a */
    private static long m3829a(int i, long j) {
        return ((i == 0 ? 13 : 11) * j) / 10;
    }

    /* renamed from: a */
    public static void m3827a(Context context, String str, long j, boolean z, long j2) {
        int m3828a;
        boolean isEmpty;
        if (context == null || TextUtils.isEmpty(str) || !"com.xiaomi.xmsf".equals(context.getPackageName()) || "com.xiaomi.xmsf".equals(str) || -1 == (m3828a = m3828a(context))) {
            return;
        }
        synchronized (f33560c) {
            isEmpty = f33561d.isEmpty();
            m3825a(new C10753a(str, j2, m3828a, z ? 1 : 0, m3828a == 0 ? m3820c(context) : "", m3829a(m3828a, j)));
        }
        if (!isEmpty) {
            return;
        }
        f33558a.m5242a(new C10754h(context), 5000L);
    }

    /* renamed from: a */
    private static void m3825a(C10753a c10753a) {
        for (C10753a c10753a2 : f33561d) {
            if (c10753a2.m3818a(c10753a)) {
                c10753a2.f33569f += c10753a.f33569f;
                return;
            }
        }
        f33561d.add(c10753a);
    }

    /* renamed from: b */
    private static int m3822b(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                return -1;
            }
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null) {
                    return activeNetworkInfo.getType();
                }
                return -1;
            } catch (Exception e) {
                return -1;
            }
        } catch (Exception e2) {
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static void m3821b(Context context, List<C10753a> list) {
        try {
            synchronized (C10582a.f32920a) {
                SQLiteDatabase writableDatabase = m3819d(context).getWritableDatabase();
                writableDatabase.beginTransaction();
                for (C10753a c10753a : list) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(C10447l.PACKAGE_NAME, c10753a.f33564a);
                    contentValues.put("message_ts", Long.valueOf(c10753a.f33565b));
                    contentValues.put("network_type", Integer.valueOf(c10753a.f33566c));
                    contentValues.put("bytes", Long.valueOf(c10753a.f33569f));
                    contentValues.put("rcv", Integer.valueOf(c10753a.f33567d));
                    contentValues.put("imsi", c10753a.f33568e);
                    writableDatabase.insert("traffic", null, contentValues);
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            }
        } catch (SQLiteException e) {
            AbstractC10404b.m5267a(e);
        }
    }

    /* renamed from: c */
    private static synchronized String m3820c(Context context) {
        String str;
        synchronized (C10752g.class) {
            if (!TextUtils.isEmpty(f33562e)) {
                str = f33562e;
            } else {
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                    if (telephonyManager != null) {
                        f33562e = telephonyManager.getSubscriberId();
                    }
                } catch (Exception e) {
                }
                str = f33562e;
            }
        }
        return str;
    }

    /* renamed from: d */
    private static C10582a m3819d(Context context) {
        if (f33563f != null) {
            return f33563f;
        }
        f33563f = new C10582a(context);
        return f33563f;
    }
}
