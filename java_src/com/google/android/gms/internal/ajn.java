package com.google.android.gms.internal;

import android.os.Process;
/* loaded from: classes2.dex */
class ajn implements Runnable {

    /* renamed from: a */
    private final Runnable f22029a;

    /* renamed from: b */
    private final int f22030b;

    public ajn(Runnable runnable, int i) {
        this.f22029a = runnable;
        this.f22030b = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        Process.setThreadPriority(this.f22030b);
        this.f22029a.run();
    }
}
