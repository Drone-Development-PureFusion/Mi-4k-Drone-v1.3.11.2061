package com.google.android.gms.internal;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
/* loaded from: classes2.dex */
public class ajg {

    /* renamed from: a */
    public static String f22011a = "Volley";

    /* renamed from: b */
    public static boolean f22012b = Log.isLoggable(f22011a, 2);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.internal.ajg$a */
    /* loaded from: classes2.dex */
    public static class C6407a {

        /* renamed from: a */
        public static final boolean f22013a = ajg.f22012b;

        /* renamed from: b */
        private final List<C6408a> f22014b = new ArrayList();

        /* renamed from: c */
        private boolean f22015c = false;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.google.android.gms.internal.ajg$a$a */
        /* loaded from: classes2.dex */
        public static class C6408a {

            /* renamed from: a */
            public final String f22016a;

            /* renamed from: b */
            public final long f22017b;

            /* renamed from: c */
            public final long f22018c;

            public C6408a(String str, long j, long j2) {
                this.f22016a = str;
                this.f22017b = j;
                this.f22018c = j2;
            }
        }

        /* renamed from: a */
        private long m17128a() {
            if (this.f22014b.size() == 0) {
                return 0L;
            }
            return this.f22014b.get(this.f22014b.size() - 1).f22018c - this.f22014b.get(0).f22018c;
        }

        /* renamed from: a */
        public synchronized void m17127a(String str) {
            this.f22015c = true;
            long m17128a = m17128a();
            if (m17128a > 0) {
                long j = this.f22014b.get(0).f22018c;
                ajg.m17131b("(%-4d ms) %s", Long.valueOf(m17128a), str);
                long j2 = j;
                for (C6408a c6408a : this.f22014b) {
                    long j3 = c6408a.f22018c;
                    ajg.m17131b("(+%-4d) [%2d] %s", Long.valueOf(j3 - j2), Long.valueOf(c6408a.f22017b), c6408a.f22016a);
                    j2 = j3;
                }
            }
        }

        /* renamed from: a */
        public synchronized void m17126a(String str, long j) {
            if (this.f22015c) {
                throw new IllegalStateException("Marker added to finished log");
            }
            this.f22014b.add(new C6408a(str, j, SystemClock.elapsedRealtime()));
        }

        protected void finalize() {
            if (!this.f22015c) {
                m17127a("Request on the loose");
                ajg.m17130c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
            }
        }
    }

    /* renamed from: a */
    public static void m17133a(String str, Object... objArr) {
        if (f22012b) {
            Log.v(f22011a, m17129d(str, objArr));
        }
    }

    /* renamed from: a */
    public static void m17132a(Throwable th, String str, Object... objArr) {
        Log.e(f22011a, m17129d(str, objArr), th);
    }

    /* renamed from: b */
    public static void m17131b(String str, Object... objArr) {
        Log.d(f22011a, m17129d(str, objArr));
    }

    /* renamed from: c */
    public static void m17130c(String str, Object... objArr) {
        Log.e(f22011a, m17129d(str, objArr));
    }

    /* renamed from: d */
    private static String m17129d(String str, Object... objArr) {
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
            } else if (!stackTrace[i].getClass().equals(ajg.class)) {
                String className = stackTrace[i].getClassName();
                String substring = className.substring(className.lastIndexOf(46) + 1);
                String substring2 = substring.substring(substring.lastIndexOf(36) + 1);
                String valueOf = String.valueOf(stackTrace[i].getMethodName());
                str2 = new StringBuilder(String.valueOf(substring2).length() + 1 + String.valueOf(valueOf).length()).append(substring2).append(".").append(valueOf).toString();
                break;
            } else {
                i++;
            }
        }
        return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), str2, str);
    }
}
