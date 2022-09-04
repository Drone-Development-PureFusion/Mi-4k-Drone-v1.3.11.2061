package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.MainThread;
import android.support.annotation.WorkerThread;
import com.google.android.gms.common.util.AbstractC4682e;
import com.tencent.p263mm.sdk.platformtools.Util;
/* renamed from: com.google.android.gms.measurement.internal.g */
/* loaded from: classes2.dex */
public class C8710g extends AbstractC8683b {

    /* renamed from: a */
    private Handler f27885a;

    /* renamed from: b */
    private long f27886b;

    /* renamed from: c */
    private final Runnable f27887c = new Runnable() { // from class: com.google.android.gms.measurement.internal.g.1
        @Override // java.lang.Runnable
        @MainThread
        public void run() {
            C8710g.this.mo10295v().m10762a(new Runnable() { // from class: com.google.android.gms.measurement.internal.g.1.1
                @Override // java.lang.Runnable
                public void run() {
                    C8710g.this.m10565z();
                }
            });
        }
    };

    /* renamed from: d */
    private final AbstractC8731r f27888d = new AbstractC8731r(this.f27815n) { // from class: com.google.android.gms.measurement.internal.g.2
        @Override // com.google.android.gms.measurement.internal.AbstractC8731r
        @WorkerThread
        /* renamed from: a */
        public void mo10361a() {
            C8710g.this.m10575B();
        }
    };

    /* renamed from: e */
    private final AbstractC8731r f27889e = new AbstractC8731r(this.f27815n) { // from class: com.google.android.gms.measurement.internal.g.3
        @Override // com.google.android.gms.measurement.internal.AbstractC8731r
        @WorkerThread
        /* renamed from: a */
        public void mo10361a() {
            C8710g.this.m10574C();
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8710g(C8668aj c8668aj) {
        super(c8668aj);
    }

    /* renamed from: A */
    private void m10576A() {
        synchronized (this) {
            if (this.f27885a == null) {
                this.f27885a = new Handler(Looper.getMainLooper());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    /* renamed from: B */
    public void m10575B() {
        mo10307j();
        mo10294w().m10843E().m10830a("Session started, time", Long.valueOf(mo10301p().mo16432b()));
        mo10293x().f27696j.m10790a(false);
        mo10305l().m10632a("auto", "_s", new Bundle());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    /* renamed from: C */
    public void m10574C() {
        mo10307j();
        long mo16432b = mo10301p().mo16432b();
        if (this.f27886b == 0) {
            this.f27886b = mo16432b - Util.MILLSECONDS_OF_HOUR;
        }
        long m10788a = mo10293x().f27698l.m10788a() + (mo16432b - this.f27886b);
        mo10293x().f27698l.m10787a(m10788a);
        mo10294w().m10843E().m10830a("Recording user engagement, ms", Long.valueOf(m10788a));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", m10788a);
        mo10305l().m10632a("auto", "_e", bundle);
        mo10293x().f27698l.m10787a(0L);
        this.f27886b = mo16432b;
        this.f27889e.m10360a(Math.max(0L, Util.MILLSECONDS_OF_HOUR - mo10293x().f27698l.m10788a()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    /* renamed from: a */
    public void m10573a(long j) {
        mo10307j();
        m10576A();
        this.f27888d.m10355c();
        this.f27889e.m10355c();
        mo10294w().m10843E().m10830a("Activity resumed, time", Long.valueOf(j));
        this.f27886b = j;
        if (mo10301p().mo16434a() - mo10293x().f27695i.m10788a() > mo10293x().f27697k.m10788a()) {
            mo10293x().f27696j.m10790a(true);
            mo10293x().f27698l.m10787a(0L);
        }
        if (mo10293x().f27696j.m10791a()) {
            this.f27888d.m10360a(Math.max(0L, mo10293x().f27694h.m10788a() - mo10293x().f27698l.m10788a()));
        } else {
            this.f27889e.m10360a(Math.max(0L, Util.MILLSECONDS_OF_HOUR - mo10293x().f27698l.m10788a()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    /* renamed from: b */
    public void m10570b(long j) {
        mo10307j();
        m10576A();
        this.f27888d.m10355c();
        this.f27889e.m10355c();
        mo10294w().m10843E().m10830a("Activity paused, time", Long.valueOf(j));
        if (this.f27886b != 0) {
            mo10293x().f27698l.m10787a(mo10293x().f27698l.m10788a() + (j - this.f27886b));
        }
        mo10293x().f27697k.m10787a(mo10301p().mo16434a());
        synchronized (this) {
            if (!mo10293x().f27696j.m10791a()) {
                this.f27885a.postDelayed(this.f27887c, 1000L);
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC8683b
    /* renamed from: e */
    protected void mo10312e() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @MainThread
    /* renamed from: f */
    public void m10567f() {
        synchronized (this) {
            m10576A();
            this.f27885a.removeCallbacks(this.f27887c);
        }
        final long mo16432b = mo10301p().mo16432b();
        mo10295v().m10762a(new Runnable() { // from class: com.google.android.gms.measurement.internal.g.4
            @Override // java.lang.Runnable
            public void run() {
                C8710g.this.m10573a(mo16432b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @MainThread
    /* renamed from: g */
    public void m10566g() {
        final long mo16432b = mo10301p().mo16432b();
        mo10295v().m10762a(new Runnable() { // from class: com.google.android.gms.measurement.internal.g.5
            @Override // java.lang.Runnable
            public void run() {
                C8710g.this.m10570b(mo16432b);
            }
        });
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: h */
    public /* bridge */ /* synthetic */ void mo10309h() {
        super.h();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: i */
    public /* bridge */ /* synthetic */ void mo10308i() {
        super.i();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: j */
    public /* bridge */ /* synthetic */ void mo10307j() {
        super.j();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: k */
    public /* bridge */ /* synthetic */ C8725o mo10306k() {
        return super.k();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: l */
    public /* bridge */ /* synthetic */ C8685d mo10305l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: m */
    public /* bridge */ /* synthetic */ C8743z mo10304m() {
        return super.m();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: n */
    public /* bridge */ /* synthetic */ C8733s mo10303n() {
        return super.n();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: o */
    public /* bridge */ /* synthetic */ C8693e mo10302o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: p */
    public /* bridge */ /* synthetic */ AbstractC4682e mo10301p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: q */
    public /* bridge */ /* synthetic */ Context mo10300q() {
        return super.q();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: r */
    public /* bridge */ /* synthetic */ C8727q mo10299r() {
        return super.r();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: s */
    public /* bridge */ /* synthetic */ C8723m mo10298s() {
        return super.s();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: t */
    public /* bridge */ /* synthetic */ C8662ah mo10297t() {
        return super.t();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: u */
    public /* bridge */ /* synthetic */ C8710g mo10296u() {
        return super.u();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: v */
    public /* bridge */ /* synthetic */ C8663ai mo10295v() {
        return super.v();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: w */
    public /* bridge */ /* synthetic */ C8643ab mo10294w() {
        return super.w();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: x */
    public /* bridge */ /* synthetic */ C8654af mo10293x() {
        return super.x();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: y */
    public /* bridge */ /* synthetic */ C8726p mo10292y() {
        return super.y();
    }

    @WorkerThread
    /* renamed from: z */
    public void m10565z() {
        mo10307j();
        mo10294w().m10844D().m10831a("Application backgrounded. Logging engagement");
        long m10788a = mo10293x().f27698l.m10788a();
        if (m10788a <= 0) {
            mo10294w().m10832z().m10830a("Not logging non-positive engagement time", Long.valueOf(m10788a));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("_et", m10788a);
        mo10305l().m10632a("auto", "_e", bundle);
        mo10293x().f27698l.m10787a(0L);
    }
}
