package com.fimi.p140a;

import com.fimi.p140a.p143c.AbstractC1498b;
/* renamed from: com.fimi.a.b */
/* loaded from: classes.dex */
public abstract class AbstractC1493b implements AbstractC1498b {

    /* renamed from: a */
    public static final int f3568a = 0;

    /* renamed from: b */
    public static final int f3569b = 1;

    /* renamed from: c */
    public static final int f3570c = 2;

    /* renamed from: d */
    public static final int f3571d = 3;

    /* renamed from: e */
    public static final int f3572e = 4;

    /* renamed from: f */
    public static final int f3573f = 5;

    /* renamed from: g */
    public static final int f3574g = 2;

    /* renamed from: h */
    public static final int f3575h = 3;

    /* renamed from: i */
    public static final int f3576i = 4;

    /* renamed from: j */
    public static final String f3577j = "select_corresponding_view";

    /* renamed from: k */
    public static final int f3578k = 0;

    /* renamed from: l */
    public static final int f3579l = 1;

    /* renamed from: m */
    public static final int f3580m = 2;

    /* renamed from: o */
    public static final int f3581o = 4;

    /* renamed from: n */
    protected int f3582n = 0;

    /* renamed from: p */
    private Thread f3583p;

    /* renamed from: q */
    private boolean f3584q;

    @Override // com.fimi.p140a.p143c.AbstractC1498b
    /* renamed from: a */
    public void mo35495a() {
        if (this.f3583p == null || !this.f3583p.isAlive() || this.f3583p.isInterrupted()) {
            return;
        }
        this.f3583p.interrupt();
    }

    @Override // com.fimi.p140a.p143c.AbstractC1498b
    /* renamed from: a */
    public void mo35494a(int i) {
        try {
            Thread.sleep(i);
        } catch (InterruptedException e) {
            e.printStackTrace();
            mo35492a(true);
        }
    }

    @Override // com.fimi.p140a.p143c.AbstractC1498b
    /* renamed from: a */
    public void mo35493a(Runnable runnable) {
        this.f3583p = new Thread(runnable);
        this.f3583p.start();
    }

    @Override // com.fimi.p140a.p143c.AbstractC1498b
    /* renamed from: a */
    public synchronized void mo35492a(boolean z) {
        this.f3584q = z;
    }

    @Override // com.fimi.p140a.p143c.AbstractC1498b
    /* renamed from: b */
    public synchronized boolean mo35491b() {
        return this.f3584q;
    }
}
