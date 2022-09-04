package com.xiaomi.channel.commonutils.misc;

import android.os.Handler;
import android.os.Looper;
import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
/* renamed from: com.xiaomi.channel.commonutils.misc.h */
/* loaded from: classes2.dex */
public class C10414h {

    /* renamed from: a */
    private C10415a f32355a;

    /* renamed from: b */
    private Handler f32356b;

    /* renamed from: c */
    private volatile boolean f32357c;

    /* renamed from: d */
    private final boolean f32358d;

    /* renamed from: e */
    private int f32359e;

    /* renamed from: f */
    private volatile AbstractC10416b f32360f;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.xiaomi.channel.commonutils.misc.h$a */
    /* loaded from: classes2.dex */
    public class C10415a extends Thread {

        /* renamed from: b */
        private final LinkedBlockingQueue<AbstractC10416b> f32362b = new LinkedBlockingQueue<>();

        public C10415a() {
            super("PackageProcessor");
        }

        /* renamed from: a */
        public void m5235a(AbstractC10416b abstractC10416b) {
            this.f32362b.add(abstractC10416b);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            int i = C10414h.this.f32359e > 0 ? C10414h.this.f32359e : 1;
            while (!C10414h.this.f32357c) {
                try {
                    C10414h.this.f32360f = this.f32362b.poll(i, TimeUnit.SECONDS);
                    if (C10414h.this.f32360f != null) {
                        C10414h.this.f32356b.sendMessage(C10414h.this.f32356b.obtainMessage(0, C10414h.this.f32360f));
                        C10414h.this.f32360f.mo3817b();
                        C10414h.this.f32356b.sendMessage(C10414h.this.f32356b.obtainMessage(1, C10414h.this.f32360f));
                    } else if (C10414h.this.f32359e > 0) {
                        C10414h.this.m5244a();
                    }
                } catch (InterruptedException e) {
                    AbstractC10404b.m5267a(e);
                }
            }
        }
    }

    /* renamed from: com.xiaomi.channel.commonutils.misc.h$b */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC10416b {
        /* renamed from: a */
        public void m5234a() {
        }

        /* renamed from: b */
        public abstract void mo3817b();

        /* renamed from: c */
        public void mo4323c() {
        }
    }

    public C10414h() {
        this(false);
    }

    public C10414h(boolean z) {
        this(z, 0);
    }

    public C10414h(boolean z, int i) {
        this.f32356b = null;
        this.f32357c = false;
        this.f32359e = 0;
        this.f32356b = new HandlerC10417i(this, Looper.getMainLooper());
        this.f32358d = z;
        this.f32359e = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void m5244a() {
        this.f32355a = null;
        this.f32357c = true;
    }

    /* renamed from: a */
    public synchronized void m5243a(AbstractC10416b abstractC10416b) {
        if (this.f32355a == null) {
            this.f32355a = new C10415a();
            this.f32355a.setDaemon(this.f32358d);
            this.f32357c = false;
            this.f32355a.start();
        }
        this.f32355a.m5235a(abstractC10416b);
    }

    /* renamed from: a */
    public void m5242a(AbstractC10416b abstractC10416b, long j) {
        this.f32356b.postDelayed(new RunnableC10418j(this, abstractC10416b), j);
    }
}
