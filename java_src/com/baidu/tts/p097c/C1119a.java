package com.baidu.tts.p097c;

import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import com.baidu.tts.p103g.p104a.ThreadFactoryC1188a;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* renamed from: com.baidu.tts.c.a */
/* loaded from: classes.dex */
public class C1119a extends ThreadPoolExecutor {

    /* renamed from: com.baidu.tts.c.a$a */
    /* loaded from: classes.dex */
    public static class RejectedExecutionHandlerC1120a implements RejectedExecutionHandler {
        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            LoggerProxy.m36554d("LimitQueueThreadPoolExecutor", "rejectedExecution");
            if (!threadPoolExecutor.isShutdown()) {
                try {
                    threadPoolExecutor.getQueue().put(runnable);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    public C1119a(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        super(i, i2, j, timeUnit, blockingQueue, threadFactory, rejectedExecutionHandler);
    }

    public C1119a(int i, String str) {
        this(i, str, new RejectedExecutionHandlerC1120a());
    }

    public C1119a(int i, String str, RejectedExecutionHandler rejectedExecutionHandler) {
        this(i, new ThreadFactoryC1188a(str), rejectedExecutionHandler);
    }

    public C1119a(int i, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        this(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(i), threadFactory, rejectedExecutionHandler);
    }
}
