package com.google.android.gms.internal;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* renamed from: com.google.android.gms.internal.ix */
/* loaded from: classes2.dex */
class C7232ix implements AbstractC7153ig {

    /* renamed from: a */
    private final ThreadPoolExecutor f24287a;

    public C7232ix(final ThreadFactory threadFactory, final AbstractC7230iw abstractC7230iw) {
        this.f24287a = new ThreadPoolExecutor(1, 1, 3L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.google.android.gms.internal.ix.1
            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                Thread newThread = threadFactory.newThread(runnable);
                abstractC7230iw.mo15160a(newThread, "FirebaseDatabaseEventTarget");
                abstractC7230iw.mo15158a(newThread, true);
                return newThread;
            }
        });
    }

    @Override // com.google.android.gms.internal.AbstractC7153ig
    /* renamed from: a */
    public void mo15157a() {
        this.f24287a.setCorePoolSize(0);
    }

    @Override // com.google.android.gms.internal.AbstractC7153ig
    /* renamed from: a */
    public void mo15156a(Runnable runnable) {
        this.f24287a.execute(runnable);
    }

    @Override // com.google.android.gms.internal.AbstractC7153ig
    /* renamed from: b */
    public void mo15155b() {
        this.f24287a.setCorePoolSize(1);
    }
}
