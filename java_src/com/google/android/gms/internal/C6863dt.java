package com.google.android.gms.internal;

import android.content.Context;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* renamed from: com.google.android.gms.internal.dt */
/* loaded from: classes2.dex */
public class C6863dt {

    /* renamed from: a */
    private final ScheduledExecutorService f23072a;

    /* renamed from: b */
    private ScheduledFuture<?> f23073b;

    /* renamed from: c */
    private String f23074c;

    /* renamed from: d */
    private boolean f23075d;

    public C6863dt() {
        this(Executors.newSingleThreadScheduledExecutor());
    }

    public C6863dt(String str) {
        this(Executors.newSingleThreadScheduledExecutor());
        this.f23074c = str;
    }

    C6863dt(ScheduledExecutorService scheduledExecutorService) {
        this.f23073b = null;
        this.f23074c = null;
        this.f23072a = scheduledExecutorService;
        this.f23075d = false;
    }

    /* renamed from: a */
    public void m16093a(Context context, C6849dl c6849dl, long j, AbstractC6840dh abstractC6840dh) {
        synchronized (this) {
            if (this.f23073b != null) {
                this.f23073b.cancel(false);
            }
            this.f23073b = this.f23072a.schedule(this.f23074c != null ? new RunnableC6862ds(context, c6849dl, abstractC6840dh, this.f23074c) : new RunnableC6862ds(context, c6849dl, abstractC6840dh), j, TimeUnit.MILLISECONDS);
        }
    }
}
