package com.google.firebase.p254c;

import android.support.annotation.NonNull;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* renamed from: com.google.firebase.c.p */
/* loaded from: classes2.dex */
public class C9803p {

    /* renamed from: a */
    public static C9803p f30599a = new C9803p();

    /* renamed from: b */
    private static BlockingQueue<Runnable> f30600b = new LinkedBlockingQueue(128);

    /* renamed from: c */
    private static final ThreadPoolExecutor f30601c = new ThreadPoolExecutor(5, 5, 5, TimeUnit.SECONDS, f30600b, new ThreadFactoryC9804a("Command-"));

    /* renamed from: d */
    private static BlockingQueue<Runnable> f30602d = new LinkedBlockingQueue(128);

    /* renamed from: e */
    private static final ThreadPoolExecutor f30603e = new ThreadPoolExecutor(2, 2, 5, TimeUnit.SECONDS, f30602d, new ThreadFactoryC9804a("Upload-"));

    /* renamed from: f */
    private static BlockingQueue<Runnable> f30604f = new LinkedBlockingQueue(128);

    /* renamed from: g */
    private static final ThreadPoolExecutor f30605g = new ThreadPoolExecutor(3, 3, 5, TimeUnit.SECONDS, f30604f, new ThreadFactoryC9804a("Download-"));

    /* renamed from: h */
    private static BlockingQueue<Runnable> f30606h = new LinkedBlockingQueue(128);

    /* renamed from: i */
    private static final ThreadPoolExecutor f30607i = new ThreadPoolExecutor(1, 1, 5, TimeUnit.SECONDS, f30606h, new ThreadFactoryC9804a("Callbacks-"));

    /* renamed from: com.google.firebase.c.p$a */
    /* loaded from: classes2.dex */
    static class ThreadFactoryC9804a implements ThreadFactory {

        /* renamed from: a */
        private final AtomicInteger f30608a = new AtomicInteger(1);

        /* renamed from: b */
        private final String f30609b;

        ThreadFactoryC9804a(@NonNull String str) {
            this.f30609b = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@NonNull Runnable runnable) {
            String str = this.f30609b;
            Thread thread = new Thread(runnable, new StringBuilder(String.valueOf(str).length() + 27).append("FirebaseStorage-").append(str).append(this.f30608a.getAndIncrement()).toString());
            thread.setDaemon(false);
            thread.setPriority(9);
            return thread;
        }
    }

    static {
        f30601c.allowCoreThreadTimeOut(true);
        f30603e.allowCoreThreadTimeOut(true);
        f30605g.allowCoreThreadTimeOut(true);
        f30607i.allowCoreThreadTimeOut(true);
    }

    /* renamed from: a */
    public static C9803p m6929a() {
        return f30599a;
    }

    /* renamed from: a */
    public void m6928a(Runnable runnable) {
        f30601c.execute(runnable);
    }

    /* renamed from: b */
    public void m6927b(Runnable runnable) {
        f30603e.execute(runnable);
    }

    /* renamed from: c */
    public void m6926c(Runnable runnable) {
        f30605g.execute(runnable);
    }

    /* renamed from: d */
    public void m6925d(Runnable runnable) {
        f30607i.execute(runnable);
    }
}
