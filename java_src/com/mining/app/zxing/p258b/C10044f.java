package com.mining.app.zxing.p258b;

import android.app.Activity;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
/* renamed from: com.mining.app.zxing.b.f */
/* loaded from: classes.dex */
public final class C10044f {

    /* renamed from: a */
    private static final int f31004a = 300;

    /* renamed from: c */
    private final Activity f31006c;

    /* renamed from: b */
    private final ScheduledExecutorService f31005b = Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC10046a());

    /* renamed from: d */
    private ScheduledFuture<?> f31007d = null;

    /* renamed from: com.mining.app.zxing.b.f$a */
    /* loaded from: classes2.dex */
    private static final class ThreadFactoryC10046a implements ThreadFactory {
        private ThreadFactoryC10046a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setDaemon(true);
            return thread;
        }
    }

    public C10044f(Activity activity) {
        this.f31006c = activity;
        m6378a();
    }

    /* renamed from: c */
    private void m6376c() {
        if (this.f31007d != null) {
            this.f31007d.cancel(true);
            this.f31007d = null;
        }
    }

    /* renamed from: a */
    public void m6378a() {
        m6376c();
        this.f31007d = this.f31005b.schedule(new DialogInterface$OnCancelListenerC10043e(this.f31006c), 300L, TimeUnit.SECONDS);
    }

    /* renamed from: b */
    public void m6377b() {
        m6376c();
        this.f31005b.shutdown();
    }
}
