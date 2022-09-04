package com.fimi.soul.drone.p204h;

import android.os.Handler;
/* renamed from: com.fimi.soul.drone.h.f */
/* loaded from: classes.dex */
public class C2283f {

    /* renamed from: a */
    public boolean f7294a;

    /* renamed from: b */
    public boolean f7295b;

    /* renamed from: c */
    private int f7296c;

    /* renamed from: d */
    private Handler f7297d = new Handler();

    /* renamed from: e */
    private Runnable f7298e;

    /* renamed from: f */
    private Runnable f7299f;

    public C2283f(int i) {
        this.f7296c = i;
    }

    public C2283f(int i, Runnable runnable) {
        this.f7296c = i;
        m32444a(runnable);
    }

    /* renamed from: a */
    public int m32448a() {
        return this.f7296c;
    }

    /* renamed from: a */
    public void m32447a(int i) {
        this.f7296c = i;
    }

    /* renamed from: a */
    public void m32446a(int i, Runnable runnable) {
        this.f7295b = true;
        if (this.f7294a) {
            return;
        }
        this.f7296c = i;
        m32444a(runnable);
        this.f7297d.postDelayed(this.f7299f, this.f7296c);
        this.f7294a = true;
    }

    /* renamed from: a */
    public void m32444a(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        this.f7298e = runnable;
        this.f7299f = new Runnable() { // from class: com.fimi.soul.drone.h.f.1
            @Override // java.lang.Runnable
            public void run() {
                if (C2283f.this.f7298e == null) {
                    return;
                }
                C2283f.this.f7298e.run();
                C2283f.this.f7297d.postDelayed(C2283f.this.f7299f, C2283f.this.f7296c);
            }
        };
    }

    /* renamed from: b */
    public boolean m32443b() {
        return this.f7294a;
    }

    /* renamed from: c */
    public void m32441c() {
        this.f7297d.removeCallbacks(this.f7299f);
        this.f7294a = false;
        this.f7297d.postDelayed(this.f7299f, this.f7296c);
        this.f7294a = true;
    }

    /* renamed from: d */
    public void m32439d() {
        if (this.f7294a) {
            return;
        }
        this.f7297d.postDelayed(this.f7299f, this.f7296c);
        this.f7294a = true;
    }

    /* renamed from: e */
    public void m32437e() {
        this.f7297d.removeCallbacks(this.f7299f);
        this.f7294a = false;
    }

    /* renamed from: f */
    public void m32436f() {
        this.f7297d.removeCallbacks(this.f7298e);
        this.f7297d.removeCallbacks(this.f7299f);
    }
}
