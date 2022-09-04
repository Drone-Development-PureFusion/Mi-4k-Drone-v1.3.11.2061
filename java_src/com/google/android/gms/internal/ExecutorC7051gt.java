package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import java.util.concurrent.Executor;
/* renamed from: com.google.android.gms.internal.gt */
/* loaded from: classes2.dex */
public class ExecutorC7051gt implements Executor {

    /* renamed from: a */
    private static ExecutorC7051gt f23809a = new ExecutorC7051gt();

    /* renamed from: b */
    private Handler f23810b = new Handler(Looper.getMainLooper());

    private ExecutorC7051gt() {
    }

    /* renamed from: a */
    public static ExecutorC7051gt m15702a() {
        return f23809a;
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NonNull Runnable runnable) {
        this.f23810b.post(runnable);
    }
}
