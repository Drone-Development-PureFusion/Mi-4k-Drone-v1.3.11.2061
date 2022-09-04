package com.google.android.gms.internal;

import android.os.Process;
import com.google.android.gms.ads.internal.C3779u;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
@aaa
/* loaded from: classes.dex */
public final class abu {

    /* renamed from: a */
    private static final ThreadPoolExecutor f21029a = new ThreadPoolExecutor(10, 10, 1, TimeUnit.MINUTES, new LinkedBlockingQueue(), m18390a("Default"));

    /* renamed from: b */
    private static final ThreadPoolExecutor f21030b = new ThreadPoolExecutor(5, 5, 1, TimeUnit.MINUTES, new LinkedBlockingQueue(), m18390a("Loader"));

    static {
        f21029a.allowCoreThreadTimeOut(true);
        f21030b.allowCoreThreadTimeOut(true);
    }

    /* renamed from: a */
    public static aco<Void> m18392a(int i, final Runnable runnable) {
        return i == 1 ? m18388a(f21030b, new Callable<Void>() { // from class: com.google.android.gms.internal.abu.1
            @Override // java.util.concurrent.Callable
            /* renamed from: a */
            public Void call() {
                runnable.run();
                return null;
            }
        }) : m18388a(f21029a, new Callable<Void>() { // from class: com.google.android.gms.internal.abu.2
            @Override // java.util.concurrent.Callable
            /* renamed from: a */
            public Void call() {
                runnable.run();
                return null;
            }
        });
    }

    /* renamed from: a */
    public static aco<Void> m18391a(Runnable runnable) {
        return m18392a(0, runnable);
    }

    /* renamed from: a */
    public static <T> aco<T> m18389a(Callable<T> callable) {
        return m18388a(f21029a, callable);
    }

    /* renamed from: a */
    public static <T> aco<T> m18388a(ExecutorService executorService, final Callable<T> callable) {
        final acl aclVar = new acl();
        try {
            final Future<?> submit = executorService.submit(new Runnable() { // from class: com.google.android.gms.internal.abu.3
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        Process.setThreadPriority(10);
                        acl.this.m18209b((acl) callable.call());
                    } catch (Exception e) {
                        C3779u.m26886i().m18451a(e, "AdThreadPool.submit");
                        acl.this.m18210a(e);
                    }
                }
            });
            aclVar.m18208b(new Runnable() { // from class: com.google.android.gms.internal.abu.4
                @Override // java.lang.Runnable
                public void run() {
                    if (acl.this.isCancelled()) {
                        submit.cancel(true);
                    }
                }
            });
        } catch (RejectedExecutionException e) {
            abr.d("Thread execution is rejected.", e);
            aclVar.cancel(true);
        }
        return aclVar;
    }

    /* renamed from: a */
    private static ThreadFactory m18390a(final String str) {
        return new ThreadFactory() { // from class: com.google.android.gms.internal.abu.5

            /* renamed from: b */
            private final AtomicInteger f21038b = new AtomicInteger(1);

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                String str2 = str;
                return new Thread(runnable, new StringBuilder(String.valueOf(str2).length() + 23).append("AdWorker(").append(str2).append(") #").append(this.f21038b.getAndIncrement()).toString());
            }
        };
    }
}
