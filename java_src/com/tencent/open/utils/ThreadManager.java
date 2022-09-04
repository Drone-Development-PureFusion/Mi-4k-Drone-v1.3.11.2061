package com.tencent.open.utils;

import android.os.AsyncTask;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.lang.reflect.Field;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public final class ThreadManager {
    public static final boolean DEBUG_THREAD = false;
    public static final Executor NETWORK_EXECUTOR = m5577a();

    /* renamed from: a */
    private static Handler f32014a;

    /* renamed from: b */
    private static HandlerThread f32015b;

    /* renamed from: c */
    private static Handler f32016c;

    /* renamed from: d */
    private static HandlerThread f32017d;

    /* renamed from: a */
    private static Executor m5577a() {
        Executor threadPoolExecutor;
        Executor executor;
        if (Build.VERSION.SDK_INT >= 11) {
            executor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        } else {
            try {
                Field declaredField = AsyncTask.class.getDeclaredField("sExecutor");
                declaredField.setAccessible(true);
                threadPoolExecutor = (Executor) declaredField.get(null);
            } catch (Exception e) {
                threadPoolExecutor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.SECONDS, new LinkedBlockingQueue());
            }
            executor = threadPoolExecutor;
        }
        if (executor instanceof ThreadPoolExecutor) {
            ((ThreadPoolExecutor) executor).setCorePoolSize(3);
        }
        return executor;
    }

    public static void executeOnNetWorkThread(Runnable runnable) {
        try {
            NETWORK_EXECUTOR.execute(runnable);
        } catch (RejectedExecutionException e) {
        }
    }

    public static void executeOnSubThread(Runnable runnable) {
        getSubThreadHandler().post(runnable);
    }

    public static Handler getFileThreadHandler() {
        if (f32016c == null) {
            synchronized (ThreadManager.class) {
                f32017d = new HandlerThread("QQ_FILE_RW");
                f32017d.start();
                f32016c = new Handler(f32017d.getLooper());
            }
        }
        return f32016c;
    }

    public static Looper getFileThreadLooper() {
        return getFileThreadHandler().getLooper();
    }

    public static Thread getSubThread() {
        if (f32015b == null) {
            getSubThreadHandler();
        }
        return f32015b;
    }

    public static Handler getSubThreadHandler() {
        if (f32014a == null) {
            synchronized (ThreadManager.class) {
                f32015b = new HandlerThread("QQ_SUB");
                f32015b.start();
                f32014a = new Handler(f32015b.getLooper());
            }
        }
        return f32014a;
    }

    public static Looper getSubThreadLooper() {
        return getSubThreadHandler().getLooper();
    }

    public static void init() {
    }
}
