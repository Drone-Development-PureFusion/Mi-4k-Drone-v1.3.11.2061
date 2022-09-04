package com.google.android.gms.internal;

import java.util.concurrent.Future;
@aaa
/* loaded from: classes.dex */
public abstract class abq implements abx<Future> {

    /* renamed from: a */
    private final Runnable f20996a;

    /* renamed from: b */
    private volatile Thread f20997b;

    /* renamed from: c */
    private boolean f20998c;

    public abq() {
        this.f20996a = new Runnable() { // from class: com.google.android.gms.internal.abq.1
            @Override // java.lang.Runnable
            public final void run() {
                abq.this.f20997b = Thread.currentThread();
                abq.this.mo12782a();
            }
        };
        this.f20998c = false;
    }

    public abq(boolean z) {
        this.f20996a = new Runnable() { // from class: com.google.android.gms.internal.abq.1
            @Override // java.lang.Runnable
            public final void run() {
                abq.this.f20997b = Thread.currentThread();
                abq.this.mo12782a();
            }
        };
        this.f20998c = z;
    }

    /* renamed from: a */
    public abstract void mo12782a();

    /* renamed from: b */
    public abstract void mo12779b();

    @Override // com.google.android.gms.internal.abx
    /* renamed from: d */
    public final void mo12794d() {
        mo12779b();
        if (this.f20997b != null) {
            this.f20997b.interrupt();
        }
    }

    @Override // com.google.android.gms.internal.abx
    /* renamed from: h */
    public final Future mo12820e() {
        return this.f20998c ? abu.m18392a(1, this.f20996a) : abu.m18391a(this.f20996a);
    }
}
