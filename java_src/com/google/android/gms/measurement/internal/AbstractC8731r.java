package com.google.android.gms.measurement.internal;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.internal.C4588d;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.r */
/* loaded from: classes2.dex */
public abstract class AbstractC8731r {

    /* renamed from: b */
    private static volatile Handler f27927b;

    /* renamed from: a */
    private final C8668aj f27928a;

    /* renamed from: d */
    private volatile long f27930d;

    /* renamed from: e */
    private boolean f27931e = true;

    /* renamed from: c */
    private final Runnable f27929c = new Runnable() { // from class: com.google.android.gms.measurement.internal.r.1
        @Override // java.lang.Runnable
        public void run() {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                AbstractC8731r.this.f27928a.m10696h().m10762a(this);
                return;
            }
            boolean m10357b = AbstractC8731r.this.m10357b();
            AbstractC8731r.this.f27930d = 0L;
            if (!m10357b || !AbstractC8731r.this.f27931e) {
                return;
            }
            AbstractC8731r.this.mo10361a();
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC8731r(C8668aj c8668aj) {
        C4588d.m23627a(c8668aj);
        this.f27928a = c8668aj;
    }

    /* renamed from: d */
    private Handler m10354d() {
        Handler handler;
        if (f27927b != null) {
            return f27927b;
        }
        synchronized (AbstractC8731r.class) {
            if (f27927b == null) {
                f27927b = new Handler(this.f27928a.m10686r().getMainLooper());
            }
            handler = f27927b;
        }
        return handler;
    }

    /* renamed from: a */
    public abstract void mo10361a();

    /* renamed from: a */
    public void m10360a(long j) {
        m10355c();
        if (j >= 0) {
            this.f27930d = this.f27928a.m10685s().mo16434a();
            if (m10354d().postDelayed(this.f27929c, j)) {
                return;
            }
            this.f27928a.m10698f().m10834f().m10830a("Failed to schedule delayed post. time", Long.valueOf(j));
        }
    }

    /* renamed from: b */
    public boolean m10357b() {
        return this.f27930d != 0;
    }

    /* renamed from: c */
    public void m10355c() {
        this.f27930d = 0L;
        m10354d().removeCallbacks(this.f27929c);
    }
}
