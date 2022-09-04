package com.tencent.open.p264a;

import com.tencent.open.p264a.C10250d;
/* renamed from: com.tencent.open.a.i */
/* loaded from: classes.dex */
public abstract class AbstractC10260i {

    /* renamed from: a */
    private volatile int f31922a;

    /* renamed from: b */
    private volatile boolean f31923b;

    /* renamed from: c */
    private C10259h f31924c;

    public AbstractC10260i() {
        this(C10249c.f31892b, true, C10259h.f31921a);
    }

    public AbstractC10260i(int i, boolean z, C10259h c10259h) {
        this.f31922a = C10249c.f31892b;
        this.f31923b = true;
        this.f31924c = C10259h.f31921a;
        m5660a(i);
        m5657a(z);
        m5658a(c10259h);
    }

    /* renamed from: a */
    public void m5660a(int i) {
        this.f31922a = i;
    }

    /* renamed from: a */
    protected abstract void mo5659a(int i, Thread thread, long j, String str, String str2, Throwable th);

    /* renamed from: a */
    public void m5658a(C10259h c10259h) {
        this.f31924c = c10259h;
    }

    /* renamed from: a */
    public void m5657a(boolean z) {
        this.f31923b = z;
    }

    /* renamed from: b */
    public void m5656b(int i, Thread thread, long j, String str, String str2, Throwable th) {
        if (!m5655d() || !C10250d.C10251a.m5690a(this.f31922a, i)) {
            return;
        }
        mo5659a(i, thread, j, str, str2, th);
    }

    /* renamed from: d */
    public boolean m5655d() {
        return this.f31923b;
    }

    /* renamed from: e */
    public C10259h m5654e() {
        return this.f31924c;
    }
}
