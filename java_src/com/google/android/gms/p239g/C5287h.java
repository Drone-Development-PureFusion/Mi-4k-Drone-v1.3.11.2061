package com.google.android.gms.p239g;

import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import java.util.concurrent.Executor;
/* renamed from: com.google.android.gms.g.h */
/* loaded from: classes2.dex */
public final class C5287h {

    /* renamed from: a */
    public static final Executor f19156a = new ExecutorC5289a();

    /* renamed from: b */
    static final Executor f19157b = new Executor() { // from class: com.google.android.gms.g.h.1
        @Override // java.util.concurrent.Executor
        public void execute(@NonNull Runnable runnable) {
            runnable.run();
        }
    };

    /* renamed from: com.google.android.gms.g.h$a */
    /* loaded from: classes2.dex */
    private static final class ExecutorC5289a implements Executor {

        /* renamed from: a */
        private final Handler f19158a = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public void execute(@NonNull Runnable runnable) {
            this.f19158a.post(runnable);
        }
    }

    private C5287h() {
    }
}
