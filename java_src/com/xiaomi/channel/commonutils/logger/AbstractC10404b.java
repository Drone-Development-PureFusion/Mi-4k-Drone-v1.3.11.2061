package com.xiaomi.channel.commonutils.logger;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
/* renamed from: com.xiaomi.channel.commonutils.logger.b */
/* loaded from: classes.dex */
public abstract class AbstractC10404b {

    /* renamed from: a */
    private static int f32329a = 2;

    /* renamed from: b */
    private static LoggerInterface f32330b = new C10403a();

    /* renamed from: c */
    private static final HashMap<Integer, Long> f32331c = new HashMap<>();

    /* renamed from: d */
    private static final HashMap<Integer, String> f32332d = new HashMap<>();

    /* renamed from: e */
    private static final Integer f32333e = -1;

    /* renamed from: f */
    private static AtomicInteger f32334f = new AtomicInteger(1);

    /* renamed from: a */
    public static int m5275a() {
        return f32329a;
    }

    /* renamed from: a */
    public static void m5274a(int i, String str) {
        if (i >= f32329a) {
            f32330b.log(str);
        }
    }

    /* renamed from: a */
    public static void m5273a(int i, String str, Throwable th) {
        if (i >= f32329a) {
            f32330b.log(str, th);
        }
    }

    /* renamed from: a */
    public static void m5272a(int i, Throwable th) {
        if (i >= f32329a) {
            f32330b.log("", th);
        }
    }

    /* renamed from: a */
    public static void m5271a(LoggerInterface loggerInterface) {
        f32330b = loggerInterface;
    }

    /* renamed from: a */
    public static void m5270a(Integer num) {
        if (f32329a > 1 || !f32331c.containsKey(num)) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - f32331c.remove(num).longValue();
        f32330b.log(f32332d.remove(num) + " ends in " + currentTimeMillis + " ms");
    }

    /* renamed from: a */
    public static void m5269a(String str) {
        m5274a(2, "[Thread:" + Thread.currentThread().getId() + "] " + str);
    }

    /* renamed from: a */
    public static void m5268a(String str, Throwable th) {
        m5273a(4, str, th);
    }

    /* renamed from: a */
    public static void m5267a(Throwable th) {
        m5272a(4, th);
    }

    /* renamed from: b */
    public static void m5266b(String str) {
        m5274a(0, str);
    }

    /* renamed from: c */
    public static void m5265c(String str) {
        m5274a(1, "[Thread:" + Thread.currentThread().getId() + "] " + str);
    }

    /* renamed from: d */
    public static void m5264d(String str) {
        m5274a(4, str);
    }

    /* renamed from: e */
    public static Integer m5263e(String str) {
        if (f32329a <= 1) {
            Integer valueOf = Integer.valueOf(f32334f.incrementAndGet());
            f32331c.put(valueOf, Long.valueOf(System.currentTimeMillis()));
            f32332d.put(valueOf, str);
            f32330b.log(str + " starts");
            return valueOf;
        }
        return f32333e;
    }
}
