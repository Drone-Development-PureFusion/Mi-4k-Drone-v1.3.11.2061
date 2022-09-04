package com.android.volley;

import android.annotation.TargetApi;
import android.net.TrafficStats;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;
/* renamed from: com.android.volley.h */
/* loaded from: classes.dex */
public class C0910h extends Thread {

    /* renamed from: a */
    private final BlockingQueue<AbstractC0916n<?>> f2009a;

    /* renamed from: b */
    private final AbstractC0909g f2010b;

    /* renamed from: c */
    private final AbstractC0900b f2011c;

    /* renamed from: d */
    private final AbstractC0927q f2012d;

    /* renamed from: e */
    private volatile boolean f2013e = false;

    public C0910h(BlockingQueue<AbstractC0916n<?>> blockingQueue, AbstractC0909g abstractC0909g, AbstractC0900b abstractC0900b, AbstractC0927q abstractC0927q) {
        this.f2009a = blockingQueue;
        this.f2010b = abstractC0909g;
        this.f2011c = abstractC0900b;
        this.f2012d = abstractC0927q;
    }

    @TargetApi(14)
    /* renamed from: a */
    private void m37434a(AbstractC0916n<?> abstractC0916n) {
        if (Build.VERSION.SDK_INT >= 14) {
            TrafficStats.setThreadStatsTag(abstractC0916n.m37412d());
        }
    }

    /* renamed from: a */
    private void m37433a(AbstractC0916n<?> abstractC0916n, C0967u c0967u) {
        this.f2012d.mo37379a(abstractC0916n, abstractC0916n.m37423a(c0967u));
    }

    /* renamed from: a */
    public void m37435a() {
        this.f2013e = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Process.setThreadPriority(10);
        while (true) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                AbstractC0916n<?> take = this.f2009a.take();
                try {
                    take.m37421a("network-queue-take");
                    if (take.mo37356m()) {
                        take.m37415b("network-discard-cancelled");
                    } else {
                        m37434a(take);
                        C0912j mo37366a = this.f2010b.mo37366a(take);
                        take.m37421a("network-http-complete");
                        if (!mo37366a.f2017d || !take.m37431B()) {
                            C0924p<?> mo34917a = take.mo34917a(mo37366a);
                            take.m37421a("network-parse-complete");
                            if (take.m37399w() && mo34917a.f2068b != null) {
                                this.f2011c.mo37279a(take.m37406j(), mo34917a.f2068b);
                                take.m37421a("network-cache-written");
                            }
                            take.m37432A();
                            this.f2012d.mo37381a(take, mo34917a);
                        } else {
                            take.m37415b("not-modified");
                        }
                    }
                } catch (C0967u e) {
                    e.m37265a(SystemClock.elapsedRealtime() - elapsedRealtime);
                    m37433a(take, e);
                } catch (Exception e2) {
                    C0968v.m37261a(e2, "Unhandled exception %s", e2.toString());
                    C0967u c0967u = new C0967u(e2);
                    c0967u.m37265a(SystemClock.elapsedRealtime() - elapsedRealtime);
                    this.f2012d.mo37379a(take, c0967u);
                }
            } catch (InterruptedException e3) {
                if (this.f2013e) {
                    return;
                }
            }
        }
    }
}
