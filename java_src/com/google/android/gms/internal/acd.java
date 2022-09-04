package com.google.android.gms.internal;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.internal.C4588d;
@aaa
/* loaded from: classes.dex */
public class acd {

    /* renamed from: a */
    private HandlerThread f21106a = null;

    /* renamed from: b */
    private Handler f21107b = null;

    /* renamed from: c */
    private int f21108c = 0;

    /* renamed from: d */
    private final Object f21109d = new Object();

    /* renamed from: a */
    public Looper m18235a() {
        Looper looper;
        synchronized (this.f21109d) {
            if (this.f21108c != 0) {
                C4588d.m23626a(this.f21106a, "Invalid state: mHandlerThread should already been initialized.");
            } else if (this.f21106a == null) {
                abr.m18409e("Starting the looper thread.");
                this.f21106a = new HandlerThread("LooperProvider");
                this.f21106a.start();
                this.f21107b = new Handler(this.f21106a.getLooper());
                abr.m18409e("Looper thread started.");
            } else {
                abr.m18409e("Resuming the looper thread");
                this.f21109d.notifyAll();
            }
            this.f21108c++;
            looper = this.f21106a.getLooper();
        }
        return looper;
    }

    /* renamed from: b */
    public void m18233b() {
        synchronized (this.f21109d) {
            C4588d.m23618b(this.f21108c > 0, "Invalid state: release() called more times than expected.");
            int i = this.f21108c - 1;
            this.f21108c = i;
            if (i == 0) {
                this.f21107b.post(new Runnable() { // from class: com.google.android.gms.internal.acd.1
                    @Override // java.lang.Runnable
                    public void run() {
                        synchronized (acd.this.f21109d) {
                            abr.m18409e("Suspending the looper thread");
                            while (acd.this.f21108c == 0) {
                                try {
                                    acd.this.f21109d.wait();
                                    abr.m18409e("Looper thread resumed");
                                } catch (InterruptedException e) {
                                    abr.m18409e("Looper thread interrupted.");
                                }
                            }
                        }
                    }
                });
            }
        }
    }
}
