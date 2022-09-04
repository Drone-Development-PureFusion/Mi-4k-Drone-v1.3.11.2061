package com.xiaomi.channel.commonutils.misc;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.SparseArray;
import com.xiaomi.mipush.sdk.MiPushClient;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* renamed from: com.xiaomi.channel.commonutils.misc.f */
/* loaded from: classes.dex */
public class C10410f {

    /* renamed from: a */
    private static volatile C10410f f32347a;

    /* renamed from: b */
    private ScheduledThreadPoolExecutor f32348b = new ScheduledThreadPoolExecutor(1);

    /* renamed from: c */
    private SparseArray<ScheduledFuture> f32349c = new SparseArray<>();

    /* renamed from: d */
    private Object f32350d = new Object();

    /* renamed from: e */
    private SharedPreferences f32351e;

    /* renamed from: com.xiaomi.channel.commonutils.misc.f$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractRunnableC10411a implements Runnable {
        /* renamed from: a */
        public abstract int mo4276a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.xiaomi.channel.commonutils.misc.f$b */
    /* loaded from: classes2.dex */
    public static class RunnableC10412b implements Runnable {

        /* renamed from: c */
        AbstractRunnableC10411a f32352c;

        public RunnableC10412b(AbstractRunnableC10411a abstractRunnableC10411a) {
            this.f32352c = abstractRunnableC10411a;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo5246a() {
        }

        /* renamed from: b */
        void mo5245b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            mo5246a();
            this.f32352c.run();
            mo5245b();
        }
    }

    private C10410f(Context context) {
        this.f32351e = context.getSharedPreferences(MiPushClient.PREF_EXTRA, 0);
    }

    /* renamed from: a */
    public static C10410f m5253a(Context context) {
        if (f32347a == null) {
            synchronized (C10410f.class) {
                if (f32347a == null) {
                    f32347a = new C10410f(context);
                }
            }
        }
        return f32347a;
    }

    /* renamed from: a */
    private static String m5254a(int i) {
        return "last_job_time" + i;
    }

    /* renamed from: a */
    private ScheduledFuture m5252a(AbstractRunnableC10411a abstractRunnableC10411a) {
        ScheduledFuture scheduledFuture;
        synchronized (this.f32350d) {
            scheduledFuture = this.f32349c.get(abstractRunnableC10411a.mo4276a());
        }
        return scheduledFuture;
    }

    /* renamed from: a */
    public void m5248a(Runnable runnable) {
        m5247a(runnable, 0);
    }

    /* renamed from: a */
    public void m5247a(Runnable runnable, int i) {
        this.f32348b.schedule(runnable, i, TimeUnit.SECONDS);
    }

    /* renamed from: a */
    public boolean m5251a(AbstractRunnableC10411a abstractRunnableC10411a, int i) {
        return m5250a(abstractRunnableC10411a, i, 0);
    }

    /* renamed from: a */
    public boolean m5250a(AbstractRunnableC10411a abstractRunnableC10411a, int i, int i2) {
        if (abstractRunnableC10411a == null || m5252a(abstractRunnableC10411a) != null) {
            return false;
        }
        String m5254a = m5254a(abstractRunnableC10411a.mo4276a());
        C10413g c10413g = new C10413g(this, abstractRunnableC10411a, m5254a);
        long abs = Math.abs(System.currentTimeMillis() - this.f32351e.getLong(m5254a, 0L)) / 1000;
        if (abs < i - i2) {
            i2 = (int) (i - abs);
        }
        ScheduledFuture<?> scheduleAtFixedRate = this.f32348b.scheduleAtFixedRate(c10413g, i2, i, TimeUnit.SECONDS);
        synchronized (this.f32350d) {
            this.f32349c.put(abstractRunnableC10411a.mo4276a(), scheduleAtFixedRate);
        }
        return true;
    }
}
