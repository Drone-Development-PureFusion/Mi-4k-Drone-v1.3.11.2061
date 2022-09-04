package com.fimi.soul.module.droneTrack;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* renamed from: com.fimi.soul.module.droneTrack.c */
/* loaded from: classes.dex */
public class C2683c {

    /* renamed from: a */
    private static ExecutorService f9150a;

    /* renamed from: a */
    public static synchronized ExecutorService m30637a() {
        ExecutorService executorService;
        synchronized (C2683c.class) {
            if (f9150a == null) {
                synchronized (C2683c.class) {
                    if (f9150a == null) {
                        f9150a = Executors.newCachedThreadPool();
                    }
                }
            }
            executorService = f9150a;
        }
        return executorService;
    }

    /* renamed from: a */
    public static void m30636a(Runnable runnable) {
        m30637a().execute(runnable);
    }

    /* renamed from: b */
    public static void m30635b() {
        if (f9150a != null) {
            f9150a.shutdownNow();
            f9150a = null;
        }
    }

    /* renamed from: b */
    public static void m30634b(Runnable runnable) {
        m30637a().execute(runnable);
    }
}
