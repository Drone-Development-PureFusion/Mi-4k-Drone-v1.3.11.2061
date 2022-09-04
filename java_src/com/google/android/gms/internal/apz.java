package com.google.android.gms.internal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
/* loaded from: classes2.dex */
class apz {

    /* renamed from: com.google.android.gms.internal.apz$a */
    /* loaded from: classes2.dex */
    private static class C6748a {

        /* renamed from: a */
        private static final ExecutorService f22845a = Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: com.google.android.gms.internal.apz.a.1
            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                return new Thread(runnable, "google-tag-manager-background-thread");
            }
        });
    }

    /* renamed from: com.google.android.gms.internal.apz$b */
    /* loaded from: classes2.dex */
    private static class C6750b {

        /* renamed from: a */
        private static final ScheduledExecutorService f22846a = Executors.newSingleThreadScheduledExecutor(new ThreadFactory() { // from class: com.google.android.gms.internal.apz.b.1
            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                return new Thread(runnable, "google-tag-manager-scheduler-thread");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static ExecutorService m16245a() {
        return C6748a.f22845a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static ScheduledExecutorService m16244b() {
        return C6750b.f22846a;
    }
}
