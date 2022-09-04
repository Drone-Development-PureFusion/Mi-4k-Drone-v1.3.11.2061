package com.google.android.gms.analytics.internal;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.internal.C4588d;
/* renamed from: com.google.android.gms.analytics.internal.aj */
/* loaded from: classes2.dex */
abstract class AbstractC3876aj {

    /* renamed from: b */
    private static volatile Handler f15011b;

    /* renamed from: a */
    private final C3922v f15012a;

    /* renamed from: c */
    private final Runnable f15013c = new Runnable() { // from class: com.google.android.gms.analytics.internal.aj.1
        @Override // java.lang.Runnable
        public void run() {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                AbstractC3876aj.this.f15012a.m26106h().m25969a(this);
                return;
            }
            boolean m26351c = AbstractC3876aj.this.m26351c();
            AbstractC3876aj.this.f15014d = 0L;
            if (!m26351c || AbstractC3876aj.m26352b(AbstractC3876aj.this)) {
                return;
            }
            AbstractC3876aj.this.mo26053a();
        }
    };

    /* renamed from: d */
    private volatile long f15014d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC3876aj(C3922v c3922v) {
        C4588d.m23627a(c3922v);
        this.f15012a = c3922v;
    }

    /* renamed from: b */
    static /* synthetic */ boolean m26352b(AbstractC3876aj abstractC3876aj) {
        return false;
    }

    /* renamed from: e */
    private Handler m26349e() {
        Handler handler;
        if (f15011b != null) {
            return f15011b;
        }
        synchronized (AbstractC3876aj.class) {
            if (f15011b == null) {
                f15011b = new Handler(this.f15012a.m26112b().getMainLooper());
            }
            handler = f15011b;
        }
        return handler;
    }

    /* renamed from: a */
    public abstract void mo26053a();

    /* renamed from: a */
    public void m26357a(long j) {
        m26350d();
        if (j >= 0) {
            this.f15014d = this.f15012a.m26110d().mo16434a();
            if (m26349e().postDelayed(this.f15013c, j)) {
                return;
            }
            this.f15012a.m26108f().e("Failed to schedule delayed post. time", Long.valueOf(j));
        }
    }

    /* renamed from: b */
    public long m26354b() {
        if (this.f15014d == 0) {
            return 0L;
        }
        return Math.abs(this.f15012a.m26110d().mo16434a() - this.f15014d);
    }

    /* renamed from: b */
    public void m26353b(long j) {
        long j2 = 0;
        if (!m26351c()) {
            return;
        }
        if (j < 0) {
            m26350d();
            return;
        }
        long abs = j - Math.abs(this.f15012a.m26110d().mo16434a() - this.f15014d);
        if (abs >= 0) {
            j2 = abs;
        }
        m26349e().removeCallbacks(this.f15013c);
        if (m26349e().postDelayed(this.f15013c, j2)) {
            return;
        }
        this.f15012a.m26108f().e("Failed to adjust delayed post. time", Long.valueOf(j2));
    }

    /* renamed from: c */
    public boolean m26351c() {
        return this.f15014d != 0;
    }

    /* renamed from: d */
    public void m26350d() {
        this.f15014d = 0L;
        m26349e().removeCallbacks(this.f15013c);
    }
}
