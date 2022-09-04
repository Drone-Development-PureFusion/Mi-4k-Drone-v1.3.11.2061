package com.p120c.p121a.p129b;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import com.p120c.p121a.p122a.p123a.AbstractC1255a;
import com.p120c.p121a.p122a.p123a.p124a.C1269c;
import com.p120c.p121a.p122a.p123a.p124a.p125a.C1264b;
import com.p120c.p121a.p122a.p123a.p126b.AbstractC1270a;
import com.p120c.p121a.p122a.p123a.p126b.C1271b;
import com.p120c.p121a.p122a.p127b.AbstractC1283c;
import com.p120c.p121a.p122a.p127b.p128a.C1279f;
import com.p120c.p121a.p129b.p130a.EnumC1302g;
import com.p120c.p121a.p129b.p130a.p131a.C1289c;
import com.p120c.p121a.p129b.p132b.AbstractC1309b;
import com.p120c.p121a.p129b.p132b.C1306a;
import com.p120c.p121a.p129b.p133c.AbstractC1314a;
import com.p120c.p121a.p129b.p133c.C1320e;
import com.p120c.p121a.p129b.p134d.AbstractC1326b;
import com.p120c.p121a.p129b.p134d.C1324a;
import com.p120c.p121a.p138c.C1356d;
import com.p120c.p121a.p138c.C1359f;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* renamed from: com.c.a.b.a */
/* loaded from: classes.dex */
public class C1284a {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.c.a.b.a$a */
    /* loaded from: classes.dex */
    public static class ThreadFactoryC1285a implements ThreadFactory {

        /* renamed from: a */
        private static final AtomicInteger f3221a = new AtomicInteger(1);

        /* renamed from: d */
        private final String f3224d;

        /* renamed from: e */
        private final int f3225e;

        /* renamed from: c */
        private final AtomicInteger f3223c = new AtomicInteger(1);

        /* renamed from: b */
        private final ThreadGroup f3222b = Thread.currentThread().getThreadGroup();

        ThreadFactoryC1285a(int i, String str) {
            this.f3225e = i;
            this.f3224d = str + f3221a.getAndIncrement() + "-thread-";
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(this.f3222b, runnable, this.f3224d + this.f3223c.getAndIncrement(), 0L);
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            thread.setPriority(this.f3225e);
            return thread;
        }
    }

    @TargetApi(11)
    /* renamed from: a */
    private static int m35957a(ActivityManager activityManager) {
        return activityManager.getLargeMemoryClass();
    }

    /* renamed from: a */
    public static AbstractC1255a m35954a(Context context, AbstractC1270a abstractC1270a, long j, int i) {
        File m35951b = m35951b(context);
        if (j > 0 || i > 0) {
            try {
                return new C1264b(C1359f.m35593b(context), m35951b, abstractC1270a, j, i);
            } catch (IOException e) {
                C1356d.m35611a(e);
            }
        }
        return new C1269c(C1359f.m35597a(context), m35951b, abstractC1270a);
    }

    /* renamed from: a */
    public static AbstractC1283c m35955a(Context context, int i) {
        if (i == 0) {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            i = (((!m35948d() || !m35949c(context)) ? activityManager.getMemoryClass() : m35957a(activityManager)) * 1048576) / 8;
        }
        return new C1279f(i);
    }

    /* renamed from: a */
    public static AbstractC1309b m35953a(boolean z) {
        return new C1306a(z);
    }

    /* renamed from: a */
    public static AbstractC1326b m35956a(Context context) {
        return new C1324a(context);
    }

    /* renamed from: a */
    public static Executor m35960a() {
        return Executors.newCachedThreadPool(m35958a(5, "uil-pool-d-"));
    }

    /* renamed from: a */
    public static Executor m35959a(int i, int i2, EnumC1302g enumC1302g) {
        return new ThreadPoolExecutor(i, i, 0L, TimeUnit.MILLISECONDS, enumC1302g == EnumC1302g.LIFO ? new C1289c() : new LinkedBlockingQueue(), m35958a(i2, "uil-pool-"));
    }

    /* renamed from: a */
    private static ThreadFactory m35958a(int i, String str) {
        return new ThreadFactoryC1285a(i, str);
    }

    /* renamed from: b */
    public static AbstractC1270a m35952b() {
        return new C1271b();
    }

    /* renamed from: b */
    private static File m35951b(Context context) {
        File m35594a = C1359f.m35594a(context, false);
        File file = new File(m35594a, "uil-images");
        return (file.exists() || file.mkdir()) ? file : m35594a;
    }

    /* renamed from: c */
    public static AbstractC1314a m35950c() {
        return new C1320e();
    }

    @TargetApi(11)
    /* renamed from: c */
    private static boolean m35949c(Context context) {
        return (context.getApplicationInfo().flags & 1048576) != 0;
    }

    /* renamed from: d */
    private static boolean m35948d() {
        return Build.VERSION.SDK_INT >= 11;
    }
}
