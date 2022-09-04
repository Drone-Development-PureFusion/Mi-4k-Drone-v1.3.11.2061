package com.android.volley;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
/* renamed from: com.android.volley.v */
/* loaded from: classes.dex */
public class C0968v {

    /* renamed from: a */
    public static String f2166a = "Volley";

    /* renamed from: b */
    public static boolean f2167b = Log.isLoggable(f2166a, 2);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.android.volley.v$a */
    /* loaded from: classes.dex */
    public static class C0969a {

        /* renamed from: a */
        public static final boolean f2168a = C0968v.f2167b;

        /* renamed from: b */
        private static final long f2169b = 0;

        /* renamed from: c */
        private final List<C0970a> f2170c = new ArrayList();

        /* renamed from: d */
        private boolean f2171d = false;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.android.volley.v$a$a */
        /* loaded from: classes.dex */
        public static class C0970a {

            /* renamed from: a */
            public final String f2172a;

            /* renamed from: b */
            public final long f2173b;

            /* renamed from: c */
            public final long f2174c;

            public C0970a(String str, long j, long j2) {
                this.f2172a = str;
                this.f2173b = j;
                this.f2174c = j2;
            }
        }

        /* renamed from: a */
        private long m37255a() {
            if (this.f2170c.size() == 0) {
                return 0L;
            }
            return this.f2170c.get(this.f2170c.size() - 1).f2174c - this.f2170c.get(0).f2174c;
        }

        /* renamed from: a */
        public synchronized void m37254a(String str) {
            this.f2171d = true;
            long m37255a = m37255a();
            if (m37255a > 0) {
                long j = this.f2170c.get(0).f2174c;
                C0968v.m37260b("(%-4d ms) %s", Long.valueOf(m37255a), str);
                long j2 = j;
                for (C0970a c0970a : this.f2170c) {
                    long j3 = c0970a.f2174c;
                    C0968v.m37260b("(+%-4d) [%2d] %s", Long.valueOf(j3 - j2), Long.valueOf(c0970a.f2173b), c0970a.f2172a);
                    j2 = j3;
                }
            }
        }

        /* renamed from: a */
        public synchronized void m37253a(String str, long j) {
            if (this.f2171d) {
                throw new IllegalStateException("Marker added to finished log");
            }
            this.f2170c.add(new C0970a(str, j, SystemClock.elapsedRealtime()));
        }

        protected void finalize() {
            if (!this.f2171d) {
                m37254a("Request on the loose");
                C0968v.m37258c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
            }
        }
    }

    /* renamed from: a */
    public static void m37263a(String str) {
        m37260b("Changing log tag to %s", str);
        f2166a = str;
        f2167b = Log.isLoggable(f2166a, 2);
    }

    /* renamed from: a */
    public static void m37262a(String str, Object... objArr) {
        if (f2167b) {
            Log.v(f2166a, m37256e(str, objArr));
        }
    }

    /* renamed from: a */
    public static void m37261a(Throwable th, String str, Object... objArr) {
        Log.e(f2166a, m37256e(str, objArr), th);
    }

    /* renamed from: b */
    public static void m37260b(String str, Object... objArr) {
        Log.d(f2166a, m37256e(str, objArr));
    }

    /* renamed from: b */
    public static void m37259b(Throwable th, String str, Object... objArr) {
        Log.wtf(f2166a, m37256e(str, objArr), th);
    }

    /* renamed from: c */
    public static void m37258c(String str, Object... objArr) {
        Log.e(f2166a, m37256e(str, objArr));
    }

    /* renamed from: d */
    public static void m37257d(String str, Object... objArr) {
        Log.wtf(f2166a, m37256e(str, objArr));
    }

    /* renamed from: e */
    private static String m37256e(String str, Object... objArr) {
        String str2;
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i = 2;
        while (true) {
            if (i >= stackTrace.length) {
                str2 = "<unknown>";
                break;
            } else if (!stackTrace[i].getClass().equals(C0968v.class)) {
                String className = stackTrace[i].getClassName();
                String substring = className.substring(className.lastIndexOf(46) + 1);
                str2 = substring.substring(substring.lastIndexOf(36) + 1) + "." + stackTrace[i].getMethodName();
                break;
            } else {
                i++;
            }
        }
        return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), str2, str);
    }
}
