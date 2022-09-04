package com.google.android.gms.internal;

import com.google.firebase.database.C9866d;
import com.google.firebase.database.C9874g;
import java.lang.Thread;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
/* renamed from: com.google.android.gms.internal.me */
/* loaded from: classes2.dex */
public abstract class AbstractC7383me implements AbstractC7199ip {

    /* renamed from: a */
    private ScheduledThreadPoolExecutor f24604a = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC7385a()) { // from class: com.google.android.gms.internal.me.1
        @Override // java.util.concurrent.ThreadPoolExecutor
        protected void afterExecute(Runnable runnable, Throwable th) {
            super.afterExecute(runnable, th);
            if (th == null && (runnable instanceof Future)) {
                Future future = (Future) runnable;
                try {
                    if (future.isDone()) {
                        future.get();
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                } catch (CancellationException e2) {
                } catch (ExecutionException e3) {
                    th = e3.getCause();
                }
            }
            if (th != null) {
                AbstractC7383me.this.mo14627a(th);
            }
        }
    };

    /* renamed from: com.google.android.gms.internal.me$a */
    /* loaded from: classes2.dex */
    private class ThreadFactoryC7385a implements ThreadFactory {
        private ThreadFactoryC7385a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = AbstractC7383me.this.mo14629a().newThread(runnable);
            AbstractC7230iw mo14626b = AbstractC7383me.this.mo14626b();
            mo14626b.mo15160a(newThread, "FirebaseDatabaseWorker");
            mo14626b.mo15158a(newThread, true);
            mo14626b.mo15159a(newThread, new Thread.UncaughtExceptionHandler() { // from class: com.google.android.gms.internal.me.a.1
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public void uncaughtException(Thread thread, Throwable th) {
                    AbstractC7383me.this.mo14627a(th);
                }
            });
            return newThread;
        }
    }

    public AbstractC7383me() {
        this.f24604a.setKeepAliveTime(3L, TimeUnit.SECONDS);
    }

    /* renamed from: b */
    public static String m14625b(Throwable th) {
        if (th instanceof OutOfMemoryError) {
            return "Firebase Database encountered an OutOfMemoryError. You may need to reduce the amount of data you are syncing to the client (e.g. by using queries or syncing a deeper path). See https://firebase.google.com/docs/database/ios/structure-data#best_practices_for_data_structure and https://firebase.google.com/docs/database/android/retrieve-data#filtering_data";
        }
        if (th instanceof C9866d) {
            return "";
        }
        String valueOf = String.valueOf(C9874g.m6731g());
        return new StringBuilder(String.valueOf(valueOf).length() + 104).append("Uncaught exception in Firebase Database runloop (").append(valueOf).append("). Please report to firebase-database-client@google.com").toString();
    }

    /* renamed from: a */
    protected ThreadFactory mo14629a() {
        return Executors.defaultThreadFactory();
    }

    @Override // com.google.android.gms.internal.AbstractC7199ip
    /* renamed from: a */
    public void mo14628a(Runnable runnable) {
        this.f24604a.execute(runnable);
    }

    /* renamed from: a */
    public abstract void mo14627a(Throwable th);

    /* renamed from: b */
    protected AbstractC7230iw mo14626b() {
        return AbstractC7230iw.f24286a;
    }

    @Override // com.google.android.gms.internal.AbstractC7199ip
    /* renamed from: c */
    public void mo14624c() {
        this.f24604a.setCorePoolSize(0);
    }

    @Override // com.google.android.gms.internal.AbstractC7199ip
    /* renamed from: d */
    public void mo14623d() {
        this.f24604a.setCorePoolSize(1);
    }

    /* renamed from: e */
    public ScheduledExecutorService m14622e() {
        return this.f24604a;
    }
}
