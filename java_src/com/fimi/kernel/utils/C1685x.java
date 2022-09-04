package com.fimi.kernel.utils;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* renamed from: com.fimi.kernel.utils.x */
/* loaded from: classes.dex */
public class C1685x {

    /* renamed from: a */
    private static ExecutorService f4188a;

    /* renamed from: a */
    public static synchronized ExecutorService m34458a() {
        ExecutorService executorService;
        synchronized (C1685x.class) {
            if (f4188a == null) {
                f4188a = Executors.newCachedThreadPool();
            }
            executorService = f4188a;
        }
        return executorService;
    }

    /* renamed from: a */
    public static void m34457a(Runnable runnable) {
        m34458a().execute(runnable);
    }

    /* renamed from: b */
    public static void m34456b() {
        if (f4188a != null) {
            f4188a.shutdownNow();
            f4188a = null;
        }
    }

    /* renamed from: b */
    public static void m34455b(Runnable runnable) {
        m34458a().execute(runnable);
    }
}
