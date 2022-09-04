package com.google.android.gms.cast.internal;

import com.google.android.gms.common.util.AbstractC4682e;
/* renamed from: com.google.android.gms.cast.internal.q */
/* loaded from: classes2.dex */
public final class C4445q {

    /* renamed from: b */
    private long f16693b;

    /* renamed from: c */
    private long f16694c = -1;

    /* renamed from: d */
    private long f16695d = 0;

    /* renamed from: e */
    private AbstractC4444p f16696e;

    /* renamed from: f */
    private final AbstractC4682e f16697f;

    /* renamed from: g */
    private static final C4440m f16692g = new C4440m("RequestTracker");

    /* renamed from: a */
    public static final Object f16691a = new Object();

    public C4445q(AbstractC4682e abstractC4682e, long j) {
        this.f16697f = abstractC4682e;
        this.f16693b = j;
    }

    /* renamed from: c */
    private void m24111c() {
        this.f16694c = -1L;
        this.f16696e = null;
        this.f16695d = 0L;
    }

    /* renamed from: a */
    public void m24118a() {
        synchronized (f16691a) {
            if (this.f16694c != -1) {
                m24111c();
            }
        }
    }

    /* renamed from: a */
    public void m24114a(long j, AbstractC4444p abstractC4444p) {
        AbstractC4444p abstractC4444p2;
        long j2;
        synchronized (f16691a) {
            abstractC4444p2 = this.f16696e;
            j2 = this.f16694c;
            this.f16694c = j;
            this.f16696e = abstractC4444p;
            this.f16695d = this.f16697f.mo16432b();
        }
        if (abstractC4444p2 != null) {
            abstractC4444p2.mo17629a(j2);
        }
    }

    /* renamed from: a */
    public boolean m24117a(long j) {
        boolean z;
        synchronized (f16691a) {
            z = this.f16694c != -1 && this.f16694c == j;
        }
        return z;
    }

    /* renamed from: a */
    public boolean m24116a(long j, int i) {
        return m24115a(j, i, null);
    }

    /* renamed from: a */
    public boolean m24115a(long j, int i, Object obj) {
        boolean z = true;
        AbstractC4444p abstractC4444p = null;
        synchronized (f16691a) {
            if (this.f16694c == -1 || this.f16694c != j) {
                z = false;
            } else {
                f16692g.m24160b("request %d completed", Long.valueOf(this.f16694c));
                abstractC4444p = this.f16696e;
                m24111c();
            }
        }
        if (abstractC4444p != null) {
            abstractC4444p.mo17628a(j, i, obj);
        }
        return z;
    }

    /* renamed from: b */
    public boolean m24113b() {
        boolean z;
        synchronized (f16691a) {
            z = this.f16694c != -1;
        }
        return z;
    }

    /* renamed from: b */
    public boolean m24112b(long j, int i) {
        AbstractC4444p abstractC4444p;
        boolean z = true;
        long j2 = 0;
        synchronized (f16691a) {
            if (this.f16694c == -1 || j - this.f16695d < this.f16693b) {
                z = false;
                abstractC4444p = null;
            } else {
                f16692g.m24160b("request %d timed out", Long.valueOf(this.f16694c));
                j2 = this.f16694c;
                abstractC4444p = this.f16696e;
                m24111c();
            }
        }
        if (abstractC4444p != null) {
            abstractC4444p.mo17628a(j2, i, null);
        }
        return z;
    }
}
