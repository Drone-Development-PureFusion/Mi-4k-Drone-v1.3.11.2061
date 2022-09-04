package com.google.android.gms.internal;

import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.firebase.p253b.C9755a;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* renamed from: com.google.android.gms.internal.hw */
/* loaded from: classes2.dex */
public class C7132hw {

    /* renamed from: a */
    private final ScheduledExecutorService f24008a;

    /* renamed from: b */
    private final C7315ks f24009b;

    /* renamed from: c */
    private final long f24010c;

    /* renamed from: d */
    private final long f24011d;

    /* renamed from: e */
    private final double f24012e;

    /* renamed from: f */
    private final double f24013f;

    /* renamed from: g */
    private final Random f24014g;

    /* renamed from: h */
    private ScheduledFuture<?> f24015h;

    /* renamed from: i */
    private long f24016i;

    /* renamed from: j */
    private boolean f24017j;

    /* renamed from: com.google.android.gms.internal.hw$a */
    /* loaded from: classes2.dex */
    public static class C7134a {

        /* renamed from: a */
        private final ScheduledExecutorService f24020a;

        /* renamed from: b */
        private long f24021b = 1000;

        /* renamed from: c */
        private double f24022c = 0.5d;

        /* renamed from: d */
        private long f24023d = NotificationOptions.f16268b;

        /* renamed from: e */
        private double f24024e = 1.3d;

        /* renamed from: f */
        private final C7315ks f24025f;

        public C7134a(ScheduledExecutorService scheduledExecutorService, AbstractC7316kt abstractC7316kt, String str) {
            this.f24020a = scheduledExecutorService;
            this.f24025f = new C7315ks(abstractC7316kt, str);
        }

        /* renamed from: a */
        public C7134a m15448a(double d) {
            this.f24024e = d;
            return this;
        }

        /* renamed from: a */
        public C7134a m15447a(long j) {
            this.f24021b = j;
            return this;
        }

        /* renamed from: a */
        public C7132hw m15449a() {
            return new C7132hw(this.f24020a, this.f24025f, this.f24021b, this.f24023d, this.f24024e, this.f24022c);
        }

        /* renamed from: b */
        public C7134a m15446b(double d) {
            if (d < C9755a.f30449c || d > 1.0d) {
                throw new IllegalArgumentException(new StringBuilder(47).append("Argument out of range: ").append(d).toString());
            }
            this.f24022c = d;
            return this;
        }

        /* renamed from: b */
        public C7134a m15445b(long j) {
            this.f24023d = j;
            return this;
        }
    }

    private C7132hw(ScheduledExecutorService scheduledExecutorService, C7315ks c7315ks, long j, long j2, double d, double d2) {
        this.f24014g = new Random();
        this.f24017j = true;
        this.f24008a = scheduledExecutorService;
        this.f24009b = c7315ks;
        this.f24010c = j;
        this.f24011d = j2;
        this.f24013f = d;
        this.f24012e = d2;
    }

    /* renamed from: a */
    public void m15454a() {
        this.f24017j = true;
        this.f24016i = 0L;
    }

    /* renamed from: a */
    public void m15452a(final Runnable runnable) {
        long j = 0;
        Runnable runnable2 = new Runnable() { // from class: com.google.android.gms.internal.hw.1
            @Override // java.lang.Runnable
            public void run() {
                C7132hw.this.f24015h = null;
                runnable.run();
            }
        };
        if (this.f24015h != null) {
            this.f24009b.m14840a("Cancelling previous scheduled retry", new Object[0]);
            this.f24015h.cancel(false);
            this.f24015h = null;
        }
        if (!this.f24017j) {
            if (this.f24016i == 0) {
                this.f24016i = this.f24010c;
            } else {
                this.f24016i = Math.min((long) (this.f24016i * this.f24013f), this.f24011d);
            }
            j = (long) (((1.0d - this.f24012e) * this.f24016i) + (this.f24012e * this.f24016i * this.f24014g.nextDouble()));
        }
        this.f24017j = false;
        this.f24009b.m14840a("Scheduling retry in %dms", Long.valueOf(j));
        this.f24015h = this.f24008a.schedule(runnable2, j, TimeUnit.MILLISECONDS);
    }

    /* renamed from: b */
    public void m15451b() {
        this.f24016i = this.f24011d;
    }

    /* renamed from: c */
    public void m15450c() {
        if (this.f24015h != null) {
            this.f24009b.m14840a("Cancelling existing retry attempt", new Object[0]);
            this.f24015h.cancel(false);
            this.f24015h = null;
        } else {
            this.f24009b.m14840a("No existing retry attempt to cancel", new Object[0]);
        }
        this.f24016i = 0L;
    }
}
