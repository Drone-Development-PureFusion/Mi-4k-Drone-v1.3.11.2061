package com.tencent.map.p262b;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.google.android.gms.safetynet.C8995d;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.tencent.map.b.k */
/* loaded from: classes2.dex */
public final class C10186k {

    /* renamed from: a */
    private static int f31501a;

    /* renamed from: b */
    private static int f31502b;

    /* renamed from: c */
    private static int f31503c;

    /* renamed from: d */
    private static int f31504d;

    /* renamed from: e */
    private static int f31505e;

    /* renamed from: f */
    private static int f31506f;

    /* renamed from: g */
    private static ArrayList<C10187a> f31507g;

    /* renamed from: h */
    private static long f31508h;

    /* renamed from: i */
    private static long f31509i;

    /* renamed from: j */
    private static long f31510j;

    /* renamed from: k */
    private static long f31511k;

    /* renamed from: l */
    private static long f31512l;

    /* renamed from: m */
    private static long f31513m;

    /* renamed from: n */
    private static long f31514n;

    /* renamed from: o */
    private static long f31515o;

    /* renamed from: p */
    private static long f31516p;

    /* renamed from: q */
    private static long f31517q;

    /* renamed from: r */
    private static int f31518r;

    /* renamed from: s */
    private static int f31519s;

    /* renamed from: t */
    private static int f31520t;

    /* renamed from: u */
    private static int f31521u;

    /* renamed from: com.tencent.map.b.k$a */
    /* loaded from: classes2.dex */
    public static class C10187a {

        /* renamed from: a */
        public long f31522a;

        /* renamed from: b */
        public long f31523b;

        /* renamed from: c */
        public long f31524c;

        /* renamed from: d */
        public long f31525d;

        /* renamed from: e */
        public int f31526e;

        /* renamed from: f */
        public long f31527f;

        /* renamed from: g */
        public int f31528g;

        /* renamed from: h */
        public int f31529h;
    }

    static {
        NetworkInfo activeNetworkInfo;
        String subscriberId;
        f31501a = 10000;
        f31502b = 15000;
        f31503c = 5000;
        f31504d = 20000;
        f31505e = 25000;
        f31506f = 15000;
        f31501a = C8995d.f28624a;
        f31502b = 20000;
        f31503c = 8000;
        f31504d = 20000;
        f31505e = 25000;
        f31506f = 15000;
        ConnectivityManager connectivityManager = (ConnectivityManager) C10188l.m5901b().getSystemService("connectivity");
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
            return;
        }
        int type = activeNetworkInfo.getType();
        if (!activeNetworkInfo.isConnected() || type != 0 || (subscriberId = ((TelephonyManager) C10188l.m5901b().getSystemService("phone")).getSubscriberId()) == null || subscriberId.length() <= 3 || subscriberId.startsWith("46000") || subscriberId.startsWith("46002")) {
            return;
        }
        f31501a = 15000;
        f31502b = 25000;
        f31503c = 10000;
        f31504d = 25000;
        f31505e = 35000;
        f31506f = 15000;
    }

    /* renamed from: a */
    public static int m5913a() {
        NetworkInfo activeNetworkInfo;
        int max = (f31510j <= 0 || f31511k <= 0) ? f31501a : (int) ((Math.max(f31513m, f31510j) + f31511k) - f31512l);
        ConnectivityManager connectivityManager = (ConnectivityManager) C10188l.m5901b().getSystemService("connectivity");
        if (connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null) {
            if (!activeNetworkInfo.isConnected() && activeNetworkInfo.isAvailable()) {
                max = f31502b;
            } else if (f31511k > 0 && f31511k < f31503c) {
                max = f31503c;
            }
        }
        int i = (f31521u * f31503c) + max;
        if (i <= f31503c) {
            i = f31503c;
        }
        if (i <= f31511k) {
            i = (int) (f31511k + f31503c);
        }
        if (i >= f31502b) {
            i = f31502b;
        }
        C10187a m5907b = m5907b(Thread.currentThread().getId());
        if (m5907b == null) {
            m5907b = m5911a(Thread.currentThread().getId());
        }
        if (i < m5907b.f31528g + f31503c) {
            i = m5907b.f31528g + f31503c;
        }
        m5907b.f31528g = i;
        return i;
    }

    /* renamed from: a */
    private static C10187a m5911a(long j) {
        C10187a c10187a;
        boolean z;
        int i;
        if (f31507g == null) {
            f31507g = new ArrayList<>();
        }
        synchronized (f31507g) {
            if (f31507g.size() > 20) {
                int size = f31507g.size();
                int i2 = 0;
                boolean z2 = false;
                int i3 = 0;
                while (i2 < size / 2) {
                    if (f31507g.get(i3).f31527f > 0 || System.currentTimeMillis() - f31507g.get(i3).f31523b > 600000) {
                        f31507g.remove(i3);
                        z = true;
                        i = i3;
                    } else {
                        boolean z3 = z2;
                        i = i3 + 1;
                        z = z3;
                    }
                    i2++;
                    i3 = i;
                    z2 = z;
                }
                if (z2) {
                    f31507g.get(0);
                    f31508h = 0L;
                    f31507g.get(0);
                    f31509i = 0L;
                    f31511k = f31507g.get(0).f31524c;
                    f31512l = f31507g.get(0).f31524c;
                    f31515o = f31507g.get(0).f31525d;
                    f31516p = f31507g.get(0).f31525d;
                    if (f31507g.get(0).f31527f > 0) {
                        f31518r = (int) ((f31507g.get(0).f31526e * 1000) / f31507g.get(0).f31527f);
                    }
                    f31519s = f31518r;
                    Iterator<C10187a> it2 = f31507g.iterator();
                    while (it2.hasNext()) {
                        C10187a next = it2.next();
                        if (0 > f31508h) {
                            f31508h = 0L;
                        }
                        if (0 < f31509i) {
                            f31509i = 0L;
                        }
                        if (next.f31524c > f31511k) {
                            f31511k = next.f31524c;
                        }
                        if (next.f31524c < f31512l) {
                            f31512l = next.f31524c;
                        }
                        if (next.f31525d > f31515o) {
                            f31515o = next.f31525d;
                        }
                        if (next.f31525d < f31516p) {
                            f31516p = next.f31525d;
                        }
                        if (next.f31527f > 0) {
                            int i4 = (int) ((next.f31526e * 1000) / next.f31527f);
                            if (i4 > f31518r) {
                                f31518r = i4;
                            }
                            if (i4 < f31519s) {
                                f31519s = i4;
                            }
                        }
                    }
                }
            }
            c10187a = new C10187a();
            c10187a.f31522a = j;
            f31507g.add(c10187a);
        }
        return c10187a;
    }

    /* renamed from: a */
    public static void m5912a(int i) {
        C10187a m5907b = m5907b(Thread.currentThread().getId());
        if (m5907b == null) {
            return;
        }
        m5907b.f31527f = System.currentTimeMillis() - m5907b.f31523b;
        m5907b.f31523b = System.currentTimeMillis();
        m5907b.f31526e = i;
        int i2 = (int) ((i * 1000) / (m5907b.f31527f == 0 ? 1L : m5907b.f31527f));
        f31520t = i2;
        f31518r = i2 > f31518r ? f31520t : f31518r;
        f31519s = f31520t < f31519s ? f31520t : f31519s == 0 ? f31520t : f31519s;
        if (f31507g != null) {
            synchronized (f31507g) {
                Iterator<C10187a> it2 = f31507g.iterator();
                while (it2.hasNext()) {
                    C10187a next = it2.next();
                    int i3 = next.f31526e;
                    long j = next.f31527f;
                }
            }
        }
        if (f31521u > 0 && m5907b.f31524c < f31503c && m5907b.f31525d < f31506f) {
            f31521u--;
        }
        m5907b.f31528g = (int) m5907b.f31524c;
    }

    /* renamed from: a */
    public static void m5910a(HttpURLConnection httpURLConnection) {
        C10187a m5907b = m5907b(Thread.currentThread().getId());
        if (m5907b == null) {
            m5907b = m5911a(Thread.currentThread().getId());
        }
        if (m5907b == null) {
            return;
        }
        m5907b.f31523b = System.currentTimeMillis();
    }

    /* renamed from: a */
    public static void m5909a(boolean z) {
        if (!z) {
            f31521u++;
        }
        C10187a m5905c = m5905c(Thread.currentThread().getId());
        if (m5905c != null) {
            long j = m5905c.f31523b;
        }
    }

    /* renamed from: b */
    public static int m5908b() {
        NetworkInfo activeNetworkInfo;
        int max = (f31514n <= 0 || f31515o <= 0) ? f31504d : (int) ((Math.max(f31517q, f31514n) + f31515o) - f31516p);
        ConnectivityManager connectivityManager = (ConnectivityManager) C10188l.m5901b().getSystemService("connectivity");
        if (connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null) {
            if (!activeNetworkInfo.isConnected() && activeNetworkInfo.isAvailable()) {
                max = f31505e;
            } else if (f31515o > 0 && f31515o < f31506f) {
                max = f31506f;
            }
        }
        int i = (f31521u * f31503c) + max;
        if (i <= f31506f) {
            i = f31506f;
        }
        if (i <= f31515o) {
            i = (int) (f31515o + f31506f);
        }
        if (i >= f31505e) {
            i = f31505e;
        }
        C10187a m5907b = m5907b(Thread.currentThread().getId());
        if (m5907b != null) {
            if (i < m5907b.f31529h + f31506f) {
                i = m5907b.f31529h + f31506f;
            }
            if (i < m5907b.f31528g + f31506f) {
                i = m5907b.f31528g + f31506f;
            }
            m5907b.f31529h = i;
        }
        return i;
    }

    /* renamed from: b */
    private static C10187a m5907b(long j) {
        C10187a c10187a;
        if (f31507g == null) {
            return null;
        }
        synchronized (f31507g) {
            Iterator<C10187a> it2 = f31507g.iterator();
            while (true) {
                if (it2.hasNext()) {
                    c10187a = it2.next();
                    if (c10187a.f31522a == j) {
                        break;
                    }
                } else {
                    c10187a = null;
                    break;
                }
            }
        }
        return c10187a;
    }

    /* renamed from: c */
    private static C10187a m5905c(long j) {
        if (f31507g != null) {
            synchronized (f31507g) {
                for (int size = f31507g.size() - 1; size >= 0; size--) {
                    if (f31507g.get(size).f31522a == j) {
                        return f31507g.remove(size);
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: c */
    public static void m5906c() {
        C10187a m5907b = m5907b(Thread.currentThread().getId());
        if (m5907b == null) {
            return;
        }
        m5907b.f31524c = System.currentTimeMillis() - m5907b.f31523b;
        m5907b.f31523b = System.currentTimeMillis();
        f31513m = m5907b.f31524c;
        f31511k = m5907b.f31524c > f31511k ? m5907b.f31524c : f31511k;
        f31512l = m5907b.f31524c < f31512l ? m5907b.f31524c : f31512l == 0 ? m5907b.f31524c : f31512l;
        if (f31507g == null) {
            return;
        }
        synchronized (f31507g) {
            Iterator<C10187a> it2 = f31507g.iterator();
            int i = 0;
            while (it2.hasNext()) {
                C10187a next = it2.next();
                if (next.f31524c > 0) {
                    f31510j += next.f31524c;
                    i++;
                }
            }
            if (i > 0) {
                f31510j /= i;
            }
        }
    }

    /* renamed from: d */
    public static void m5904d() {
        C10187a m5907b = m5907b(Thread.currentThread().getId());
        if (m5907b == null) {
            return;
        }
        m5907b.f31525d = System.currentTimeMillis() - m5907b.f31523b;
        m5907b.f31523b = System.currentTimeMillis();
        f31517q = m5907b.f31525d;
        f31515o = m5907b.f31525d > f31515o ? m5907b.f31525d : f31515o;
        f31516p = m5907b.f31525d < f31516p ? m5907b.f31525d : f31516p == 0 ? m5907b.f31525d : f31516p;
        if (f31507g == null) {
            return;
        }
        synchronized (f31507g) {
            Iterator<C10187a> it2 = f31507g.iterator();
            int i = 0;
            while (it2.hasNext()) {
                C10187a next = it2.next();
                if (next.f31525d > 0) {
                    f31514n += next.f31525d;
                    i++;
                }
            }
            if (i > 0) {
                f31514n /= i;
            }
        }
    }
}
