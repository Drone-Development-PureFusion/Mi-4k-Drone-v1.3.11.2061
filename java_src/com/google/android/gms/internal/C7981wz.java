package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.net.TrafficStats;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;
/* renamed from: com.google.android.gms.internal.wz */
/* loaded from: classes2.dex */
public class C7981wz extends Thread {

    /* renamed from: a */
    private final BlockingQueue<abd<?>> f26208a;

    /* renamed from: b */
    private final AbstractC7888vy f26209b;

    /* renamed from: c */
    private final AbstractC7674ru f26210c;

    /* renamed from: d */
    private final aeg f26211d;

    /* renamed from: e */
    private volatile boolean f26212e = false;

    public C7981wz(BlockingQueue<abd<?>> blockingQueue, AbstractC7888vy abstractC7888vy, AbstractC7674ru abstractC7674ru, aeg aegVar) {
        super("VolleyNetworkDispatcher");
        this.f26208a = blockingQueue;
        this.f26209b = abstractC7888vy;
        this.f26210c = abstractC7674ru;
        this.f26211d = aegVar;
    }

    @TargetApi(14)
    /* renamed from: a */
    private void m13117a(abd<?> abdVar) {
        if (Build.VERSION.SDK_INT >= 14) {
            TrafficStats.setThreadStatsTag(abdVar.m18510b());
        }
    }

    /* renamed from: a */
    private void m13116a(abd<?> abdVar, aii aiiVar) {
        this.f26211d.mo13394a(abdVar, abdVar.m18514a(aiiVar));
    }

    /* renamed from: a */
    public void m13118a() {
        this.f26212e = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Process.setThreadPriority(10);
        while (true) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                abd<?> take = this.f26208a.take();
                try {
                    take.m18507b("network-queue-take");
                    if (take.m18502f()) {
                        take.m18505c("network-discard-cancelled");
                    } else {
                        m13117a(take);
                        C8092zb mo13293a = this.f26209b.mo13293a(take);
                        take.m18507b("network-http-complete");
                        if (!mo13293a.f26445d || !take.m18489u()) {
                            adf<?> mo18238a = take.mo18238a(mo13293a);
                            take.m18507b("network-parse-complete");
                            if (take.m18494p() && mo18238a.f21266b != null) {
                                this.f26210c.mo13735a(take.m18504d(), mo18238a.f21266b);
                                take.m18507b("network-cache-written");
                            }
                            take.m18490t();
                            this.f26211d.mo13396a(take, mo18238a);
                        } else {
                            take.m18505c("not-modified");
                        }
                    }
                } catch (aii e) {
                    e.m17224a(SystemClock.elapsedRealtime() - elapsedRealtime);
                    m13116a(take, e);
                } catch (Exception e2) {
                    ajg.m17132a(e2, "Unhandled exception %s", e2.toString());
                    aii aiiVar = new aii(e2);
                    aiiVar.m17224a(SystemClock.elapsedRealtime() - elapsedRealtime);
                    this.f26211d.mo13394a(take, aiiVar);
                }
            } catch (InterruptedException e3) {
                if (this.f26212e) {
                    return;
                }
            }
        }
    }
}
