package com.google.android.gms.analytics.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.analytics.C3940p;
import com.google.android.gms.common.internal.C4588d;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* renamed from: com.google.android.gms.analytics.internal.r */
/* loaded from: classes2.dex */
public class C3911r extends AbstractC3920t {

    /* renamed from: a */
    private final C3860ab f15137a;

    public C3911r(C3922v c3922v, C3924w c3924w) {
        super(c3922v);
        C4588d.m23627a(c3924w);
        this.f15137a = c3924w.m26082j(c3922v);
    }

    /* renamed from: a */
    public long m26167a(C3925x c3925x) {
        D();
        C4588d.m23627a(c3925x);
        m();
        long m26419a = this.f15137a.m26419a(c3925x, true);
        if (m26419a == 0) {
            this.f15137a.m26421a(c3925x);
        }
        return m26419a;
    }

    @Override // com.google.android.gms.analytics.internal.AbstractC3920t
    /* renamed from: a */
    protected void mo26047a() {
        this.f15137a.E();
    }

    /* renamed from: a */
    public void m26171a(final int i) {
        D();
        b("setLocalDispatchPeriod (sec)", Integer.valueOf(i));
        r().m25969a(new Runnable() { // from class: com.google.android.gms.analytics.internal.r.1
            @Override // java.lang.Runnable
            public void run() {
                C3911r.this.f15137a.m26426a(i * 1000);
            }
        });
    }

    /* renamed from: a */
    public void m26170a(final AbstractC3880am abstractC3880am) {
        D();
        r().m25969a(new Runnable() { // from class: com.google.android.gms.analytics.internal.r.6
            @Override // java.lang.Runnable
            public void run() {
                C3911r.this.f15137a.m26424a(abstractC3880am);
            }
        });
    }

    /* renamed from: a */
    public void m26169a(final C3887c c3887c) {
        C4588d.m23627a(c3887c);
        D();
        b("Hit delivery requested", c3887c);
        r().m25969a(new Runnable() { // from class: com.google.android.gms.analytics.internal.r.4
            @Override // java.lang.Runnable
            public void run() {
                C3911r.this.f15137a.m26422a(c3887c);
            }
        });
    }

    /* renamed from: a */
    public void m26166a(final String str, final Runnable runnable) {
        C4588d.m23624a(str, (Object) "campaign param can't be empty");
        r().m25969a(new Runnable() { // from class: com.google.android.gms.analytics.internal.r.3
            @Override // java.lang.Runnable
            public void run() {
                C3911r.this.f15137a.m26418a(str);
                if (runnable != null) {
                    runnable.run();
                }
            }
        });
    }

    /* renamed from: a */
    public void m26165a(final boolean z) {
        a("Network connectivity status changed", Boolean.valueOf(z));
        r().m25969a(new Runnable() { // from class: com.google.android.gms.analytics.internal.r.2
            @Override // java.lang.Runnable
            public void run() {
                C3911r.this.f15137a.m26417a(z);
            }
        });
    }

    /* renamed from: b */
    public void m26164b() {
        this.f15137a.m26416b();
    }

    /* renamed from: c */
    public void m26163c() {
        D();
        l();
        r().m25969a(new Runnable() { // from class: com.google.android.gms.analytics.internal.r.5
            @Override // java.lang.Runnable
            public void run() {
                C3911r.this.f15137a.m26407h();
            }
        });
    }

    /* renamed from: d */
    public void m26162d() {
        D();
        Context o = o();
        if (!C3900k.m26235a(o) || !C3901l.m26232a(o)) {
            m26170a((AbstractC3880am) null);
            return;
        }
        Intent intent = new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
        intent.setComponent(new ComponentName(o, "com.google.android.gms.analytics.AnalyticsService"));
        o.startService(intent);
    }

    /* renamed from: e */
    public boolean m26161e() {
        D();
        try {
            r().m25967a(new Callable<Void>() { // from class: com.google.android.gms.analytics.internal.r.7
                @Override // java.util.concurrent.Callable
                /* renamed from: a */
                public Void call() {
                    C3911r.this.f15137a.m26440F();
                    return null;
                }
            }).get(4L, TimeUnit.SECONDS);
            return true;
        } catch (InterruptedException e) {
            d("syncDispatchLocalHits interrupted", e);
            return false;
        } catch (ExecutionException e2) {
            e("syncDispatchLocalHits failed", e2);
            return false;
        } catch (TimeoutException e3) {
            d("syncDispatchLocalHits timed out", e3);
            return false;
        }
    }

    /* renamed from: f */
    public void m26160f() {
        D();
        C3940p.m25962d();
        this.f15137a.m26409f();
    }

    /* renamed from: g */
    public void m26159g() {
        q("Radio powered up");
        m26162d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m26158h() {
        m();
        this.f15137a.m26410e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m26157i() {
        m();
        this.f15137a.m26411d();
    }
}
