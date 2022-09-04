package com.google.android.gms.analytics;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import com.google.android.gms.analytics.internal.C3909p;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.internal.ado;
import com.google.android.gms.internal.adt;
import java.lang.Thread;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* renamed from: com.google.android.gms.analytics.p */
/* loaded from: classes2.dex */
public final class C3940p {

    /* renamed from: a */
    private static volatile C3940p f15215a;

    /* renamed from: b */
    private final Context f15216b;

    /* renamed from: f */
    private volatile ado f15220f;

    /* renamed from: g */
    private Thread.UncaughtExceptionHandler f15221g;

    /* renamed from: e */
    private final C3942a f15219e = new C3942a();

    /* renamed from: c */
    private final List<AbstractC3946q> f15217c = new CopyOnWriteArrayList();

    /* renamed from: d */
    private final C3934k f15218d = new C3934k();

    /* renamed from: com.google.android.gms.analytics.p$a */
    /* loaded from: classes2.dex */
    private class C3942a extends ThreadPoolExecutor {
        public C3942a() {
            super(1, 1, 1L, TimeUnit.MINUTES, new LinkedBlockingQueue());
            setThreadFactory(new ThreadFactoryC3944b());
            allowCoreThreadTimeOut(true);
        }

        @Override // java.util.concurrent.AbstractExecutorService
        protected <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
            return new FutureTask<T>(runnable, t) { // from class: com.google.android.gms.analytics.p.a.1
                @Override // java.util.concurrent.FutureTask
                protected void setException(Throwable th) {
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler = C3940p.this.f15221g;
                    if (uncaughtExceptionHandler != null) {
                        uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
                    } else if (Log.isLoggable("GAv4", 6)) {
                        String valueOf = String.valueOf(th);
                        Log.e("GAv4", new StringBuilder(String.valueOf(valueOf).length() + 37).append("MeasurementExecutor: job failed with ").append(valueOf).toString());
                    }
                    super.setException(th);
                }
            };
        }
    }

    /* renamed from: com.google.android.gms.analytics.p$b */
    /* loaded from: classes2.dex */
    private static class ThreadFactoryC3944b implements ThreadFactory {

        /* renamed from: a */
        private static final AtomicInteger f15226a = new AtomicInteger();

        private ThreadFactoryC3944b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C3945c(runnable, new StringBuilder(23).append("measurement-").append(f15226a.incrementAndGet()).toString());
        }
    }

    /* renamed from: com.google.android.gms.analytics.p$c */
    /* loaded from: classes2.dex */
    private static class C3945c extends Thread {
        C3945c(Runnable runnable, String str) {
            super(runnable, str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(10);
            super.run();
        }
    }

    C3940p(Context context) {
        Context applicationContext = context.getApplicationContext();
        C4588d.m23627a(applicationContext);
        this.f15216b = applicationContext;
    }

    /* renamed from: a */
    public static C3940p m25973a(Context context) {
        C4588d.m23627a(context);
        if (f15215a == null) {
            synchronized (C3940p.class) {
                if (f15215a == null) {
                    f15215a = new C3940p(context);
                }
            }
        }
        return f15215a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m25965b(C3936l c3936l) {
        C4588d.m23616c("deliver should be called from worker thread");
        C4588d.m23618b(c3936l.m25990f(), "Measurement must be submitted");
        List<AbstractC3947r> m25994c = c3936l.m25994c();
        if (m25994c.isEmpty()) {
            return;
        }
        HashSet hashSet = new HashSet();
        for (AbstractC3947r abstractC3947r : m25994c) {
            Uri mo25960a = abstractC3947r.mo25960a();
            if (!hashSet.contains(mo25960a)) {
                hashSet.add(mo25960a);
                abstractC3947r.mo25959a(c3936l);
            }
        }
    }

    /* renamed from: d */
    public static void m25962d() {
        if (!(Thread.currentThread() instanceof C3945c)) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    /* renamed from: a */
    public ado m25974a() {
        if (this.f15220f == null) {
            synchronized (this) {
                if (this.f15220f == null) {
                    ado adoVar = new ado();
                    PackageManager packageManager = this.f15216b.getPackageManager();
                    String packageName = this.f15216b.getPackageName();
                    adoVar.m18026c(packageName);
                    adoVar.m18024d(packageManager.getInstallerPackageName(packageName));
                    String str = null;
                    try {
                        PackageInfo packageInfo = packageManager.getPackageInfo(this.f15216b.getPackageName(), 0);
                        if (packageInfo != null) {
                            CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                            if (!TextUtils.isEmpty(applicationLabel)) {
                                packageName = applicationLabel.toString();
                            }
                            str = packageInfo.versionName;
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        String valueOf = String.valueOf(packageName);
                        Log.e("GAv4", valueOf.length() != 0 ? "Error retrieving package info: appName set to ".concat(valueOf) : new String("Error retrieving package info: appName set to "));
                    }
                    adoVar.m18030a(packageName);
                    adoVar.m18028b(str);
                    this.f15220f = adoVar;
                }
            }
        }
        return this.f15220f;
    }

    /* renamed from: a */
    public <V> Future<V> m25967a(Callable<V> callable) {
        C4588d.m23627a(callable);
        if (Thread.currentThread() instanceof C3945c) {
            FutureTask futureTask = new FutureTask(callable);
            futureTask.run();
            return futureTask;
        }
        return this.f15219e.submit(callable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m25972a(C3936l c3936l) {
        if (c3936l.m25986j()) {
            throw new IllegalStateException("Measurement prototype can't be submitted");
        }
        if (c3936l.m25990f()) {
            throw new IllegalStateException("Measurement can only be submitted once");
        }
        final C3936l m26000a = c3936l.m26000a();
        m26000a.m25989g();
        this.f15219e.execute(new Runnable() { // from class: com.google.android.gms.analytics.p.1
            @Override // java.lang.Runnable
            public void run() {
                m26000a.m25988h().mo25980a(m26000a);
                for (AbstractC3946q abstractC3946q : C3940p.this.f15217c) {
                    abstractC3946q.m25961a(m26000a);
                }
                C3940p.this.m25965b(m26000a);
            }
        });
    }

    /* renamed from: a */
    public void m25969a(Runnable runnable) {
        C4588d.m23627a(runnable);
        this.f15219e.submit(runnable);
    }

    /* renamed from: a */
    public void m25968a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f15221g = uncaughtExceptionHandler;
    }

    /* renamed from: b */
    public adt m25966b() {
        DisplayMetrics displayMetrics = this.f15216b.getResources().getDisplayMetrics();
        adt adtVar = new adt();
        adtVar.m17991a(C3909p.m26193a(Locale.getDefault()));
        adtVar.m17989b(displayMetrics.widthPixels);
        adtVar.m17987c(displayMetrics.heightPixels);
        return adtVar;
    }

    /* renamed from: c */
    public Context m25963c() {
        return this.f15216b;
    }
}
