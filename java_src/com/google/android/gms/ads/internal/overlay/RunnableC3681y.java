package com.google.android.gms.ads.internal.overlay;

import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abv;
/* JADX INFO: Access modifiers changed from: package-private */
@aaa
/* renamed from: com.google.android.gms.ads.internal.overlay.y */
/* loaded from: classes.dex */
public class RunnableC3681y implements Runnable {

    /* renamed from: a */
    private C3663k f14398a;

    /* renamed from: b */
    private boolean f14399b = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3681y(C3663k c3663k) {
        this.f14398a = c3663k;
    }

    /* renamed from: a */
    public void m27121a() {
        this.f14399b = true;
        abv.f21039a.removeCallbacks(this);
    }

    /* renamed from: b */
    public void m27120b() {
        abv.f21039a.postDelayed(this, 250L);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!this.f14399b) {
            this.f14398a.m27175n();
            m27120b();
        }
    }
}
