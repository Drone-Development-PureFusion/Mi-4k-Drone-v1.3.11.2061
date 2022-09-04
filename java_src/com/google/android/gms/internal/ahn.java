package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.AbstractC4500k;
import com.google.android.gms.common.api.AbstractC4502m;
import com.google.android.gms.common.api.AbstractC4503n;
import com.google.android.gms.common.api.AbstractC4505p;
import com.google.android.gms.common.api.AbstractC4506q;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC4562ad;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.internal.aix;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public abstract class ahn<R extends AbstractC4502m> extends AbstractC4494i<R> {

    /* renamed from: i */
    static final ThreadLocal<Boolean> f21749i = new ThreadLocal<Boolean>() { // from class: com.google.android.gms.internal.ahn.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public Boolean initialValue() {
            return false;
        }
    };

    /* renamed from: a */
    private final Object f21750a;

    /* renamed from: b */
    private final CountDownLatch f21751b;

    /* renamed from: c */
    private final ArrayList<AbstractC4494i.AbstractC4495a> f21752c;

    /* renamed from: d */
    private AbstractC4503n<? super R> f21753d;

    /* renamed from: e */
    private final AtomicReference<aix.AbstractC6391b> f21754e;

    /* renamed from: f */
    private R f21755f;

    /* renamed from: g */
    private C6350b f21756g;

    /* renamed from: h */
    private volatile boolean f21757h;

    /* renamed from: j */
    protected final HandlerC6349a<R> f21758j;

    /* renamed from: k */
    protected final WeakReference<AbstractC4489g> f21759k;

    /* renamed from: l */
    private boolean f21760l;

    /* renamed from: m */
    private boolean f21761m;

    /* renamed from: n */
    private AbstractC4562ad f21762n;

    /* renamed from: o */
    private volatile aiw<R> f21763o;

    /* renamed from: p */
    private boolean f21764p;

    /* renamed from: com.google.android.gms.internal.ahn$a */
    /* loaded from: classes2.dex */
    public static class HandlerC6349a<R extends AbstractC4502m> extends Handler {
        public HandlerC6349a() {
            this(Looper.getMainLooper());
        }

        public HandlerC6349a(Looper looper) {
            super(looper);
        }

        /* renamed from: a */
        public void m17454a() {
            removeMessages(2);
        }

        /* renamed from: a */
        public void m17453a(AbstractC4503n<? super R> abstractC4503n, R r) {
            sendMessage(obtainMessage(1, new Pair(abstractC4503n, r)));
        }

        /* renamed from: a */
        public void m17452a(ahn<R> ahnVar, long j) {
            sendMessageDelayed(obtainMessage(2, ahnVar), j);
        }

        /* renamed from: b */
        protected void m17451b(AbstractC4503n<? super R> abstractC4503n, R r) {
            try {
                abstractC4503n.mo7161a(r);
            } catch (RuntimeException e) {
                ahn.m17462c(r);
                throw e;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    Pair pair = (Pair) message.obj;
                    m17451b((AbstractC4503n) pair.first, (AbstractC4502m) pair.second);
                    return;
                case 2:
                    ((ahn) message.obj).m17461d(Status.f16789d);
                    return;
                default:
                    Log.wtf("BasePendingResult", new StringBuilder(45).append("Don't know how to handle message: ").append(message.what).toString(), new Exception());
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.internal.ahn$b */
    /* loaded from: classes2.dex */
    public final class C6350b {
        private C6350b() {
        }

        protected void finalize() {
            ahn.m17462c(ahn.this.f21755f);
            super.finalize();
        }
    }

    @Deprecated
    ahn() {
        this.f21750a = new Object();
        this.f21751b = new CountDownLatch(1);
        this.f21752c = new ArrayList<>();
        this.f21754e = new AtomicReference<>();
        this.f21764p = false;
        this.f21758j = new HandlerC6349a<>(Looper.getMainLooper());
        this.f21759k = new WeakReference<>(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Deprecated
    public ahn(Looper looper) {
        this.f21750a = new Object();
        this.f21751b = new CountDownLatch(1);
        this.f21752c = new ArrayList<>();
        this.f21754e = new AtomicReference<>();
        this.f21764p = false;
        this.f21758j = new HandlerC6349a<>(looper);
        this.f21759k = new WeakReference<>(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ahn(AbstractC4489g abstractC4489g) {
        this.f21750a = new Object();
        this.f21751b = new CountDownLatch(1);
        this.f21752c = new ArrayList<>();
        this.f21754e = new AtomicReference<>();
        this.f21764p = false;
        this.f21758j = new HandlerC6349a<>(abstractC4489g != null ? abstractC4489g.mo17251c() : Looper.getMainLooper());
        this.f21759k = new WeakReference<>(abstractC4489g);
    }

    /* renamed from: a */
    private void m17469a(R r) {
        this.f21755f = r;
        this.f21762n = null;
        this.f21751b.countDown();
        Status mo7645a = this.f21755f.mo7645a();
        if (this.f21760l) {
            this.f21753d = null;
        } else if (this.f21753d != null) {
            this.f21758j.m17454a();
            this.f21758j.m17453a((AbstractC4503n<? super AbstractC4503n<? super R>>) this.f21753d, (AbstractC4503n<? super R>) m17463c());
        } else if (this.f21755f instanceof AbstractC4500k) {
            this.f21756g = new C6350b();
        }
        Iterator<AbstractC4494i.AbstractC4495a> it2 = this.f21752c.iterator();
        while (it2.hasNext()) {
            it2.next().mo17524a(mo7645a);
        }
        this.f21752c.clear();
    }

    /* renamed from: b */
    private void m17465b() {
        aix.AbstractC6391b andSet = this.f21754e.getAndSet(null);
        if (andSet != null) {
            andSet.mo17165a(this);
        }
    }

    /* renamed from: c */
    private R m17463c() {
        R r;
        boolean z = true;
        synchronized (this.f21750a) {
            if (this.f21757h) {
                z = false;
            }
            C4588d.m23622a(z, "Result has already been consumed.");
            C4588d.m23622a(m17460i(), "Result is not ready.");
            r = this.f21755f;
            this.f21755f = null;
            this.f21753d = null;
            this.f21757h = true;
        }
        m17465b();
        return r;
    }

    /* renamed from: c */
    public static void m17462c(AbstractC4502m abstractC4502m) {
        if (abstractC4502m instanceof AbstractC4500k) {
            try {
                ((AbstractC4500k) abstractC4502m).mo7804b();
            } catch (RuntimeException e) {
                String valueOf = String.valueOf(abstractC4502m);
                Log.w("BasePendingResult", new StringBuilder(String.valueOf(valueOf).length() + 18).append("Unable to release ").append(valueOf).toString(), e);
            }
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC4494i
    /* renamed from: a */
    public final R mo13675a(long j, TimeUnit timeUnit) {
        boolean z = true;
        C4588d.m23622a(j <= 0 || Looper.myLooper() != Looper.getMainLooper(), "await must not be called on the UI thread when time is greater than zero.");
        C4588d.m23622a(!this.f21757h, "Result has already been consumed.");
        if (this.f21763o != null) {
            z = false;
        }
        C4588d.m23622a(z, "Cannot await if then() has been called.");
        try {
            if (!this.f21751b.await(j, timeUnit)) {
                m17461d(Status.f16789d);
            }
        } catch (InterruptedException e) {
            m17461d(Status.f16787b);
        }
        C4588d.m23622a(m17460i(), "Result is not ready.");
        return m17463c();
    }

    @Override // com.google.android.gms.common.api.AbstractC4494i
    /* renamed from: a */
    public <S extends AbstractC4502m> AbstractC4506q<S> mo17196a(AbstractC4505p<? super R, ? extends S> abstractC4505p) {
        AbstractC4506q<S> mo17187a;
        boolean z = true;
        C4588d.m23622a(!this.f21757h, "Result has already been consumed.");
        synchronized (this.f21750a) {
            C4588d.m23622a(this.f21763o == null, "Cannot call then() twice.");
            if (this.f21753d != null) {
                z = false;
            }
            C4588d.m23622a(z, "Cannot call then() if callbacks are set.");
            this.f21764p = true;
            this.f21763o = new aiw<>(this.f21759k);
            mo17187a = this.f21763o.mo17187a(abstractC4505p);
            if (m17460i()) {
                this.f21758j.m17453a(this.f21763o, (aiw<R>) m17463c());
            } else {
                this.f21753d = this.f21763o;
            }
        }
        return mo17187a;
    }

    @Override // com.google.android.gms.common.api.AbstractC4494i
    /* renamed from: a */
    public void mo13676a() {
        synchronized (this.f21750a) {
            if (this.f21760l || this.f21757h) {
                return;
            }
            if (this.f21762n != null) {
                try {
                    this.f21762n.mo23699a();
                } catch (RemoteException e) {
                }
            }
            m17462c(this.f21755f);
            this.f21760l = true;
            m17469a((ahn<R>) mo7807b(Status.f16790e));
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC4494i
    /* renamed from: a */
    public final void mo17197a(AbstractC4494i.AbstractC4495a abstractC4495a) {
        boolean z = true;
        C4588d.m23622a(!this.f21757h, "Result has already been consumed.");
        if (abstractC4495a == null) {
            z = false;
        }
        C4588d.m23618b(z, "Callback cannot be null.");
        synchronized (this.f21750a) {
            if (m17460i()) {
                abstractC4495a.mo17524a(this.f21755f.mo7645a());
            } else {
                this.f21752c.add(abstractC4495a);
            }
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC4494i
    /* renamed from: a */
    public final void mo13673a(AbstractC4503n<? super R> abstractC4503n) {
        boolean z = true;
        synchronized (this.f21750a) {
            if (abstractC4503n == null) {
                this.f21753d = null;
                return;
            }
            C4588d.m23622a(!this.f21757h, "Result has already been consumed.");
            if (this.f21763o != null) {
                z = false;
            }
            C4588d.m23622a(z, "Cannot set callbacks if then() has been called.");
            if (mo13670e()) {
                return;
            }
            if (m17460i()) {
                this.f21758j.m17453a((AbstractC4503n<? super AbstractC4503n<? super R>>) abstractC4503n, (AbstractC4503n<? super R>) m17463c());
            } else {
                this.f21753d = abstractC4503n;
            }
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC4494i
    /* renamed from: a */
    public final void mo13672a(AbstractC4503n<? super R> abstractC4503n, long j, TimeUnit timeUnit) {
        boolean z = true;
        synchronized (this.f21750a) {
            if (abstractC4503n == null) {
                this.f21753d = null;
                return;
            }
            C4588d.m23622a(!this.f21757h, "Result has already been consumed.");
            if (this.f21763o != null) {
                z = false;
            }
            C4588d.m23622a(z, "Cannot set callbacks if then() has been called.");
            if (mo13670e()) {
                return;
            }
            if (m17460i()) {
                this.f21758j.m17453a((AbstractC4503n<? super AbstractC4503n<? super R>>) abstractC4503n, (AbstractC4503n<? super R>) m17463c());
            } else {
                this.f21753d = abstractC4503n;
                this.f21758j.m17452a(this, timeUnit.toMillis(j));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final void m17468a(AbstractC4562ad abstractC4562ad) {
        synchronized (this.f21750a) {
            this.f21762n = abstractC4562ad;
        }
    }

    /* renamed from: a */
    public void m17466a(aix.AbstractC6391b abstractC6391b) {
        this.f21754e.set(abstractC6391b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public abstract R mo7807b(Status status);

    /* renamed from: b */
    public final void m17464b(R r) {
        boolean z = true;
        synchronized (this.f21750a) {
            if (this.f21761m || this.f21760l || (m17460i() && m17456m())) {
                m17462c(r);
                return;
            }
            C4588d.m23622a(!m17460i(), "Results have already been set");
            if (this.f21757h) {
                z = false;
            }
            C4588d.m23622a(z, "Result has already been consumed");
            m17469a((ahn<R>) r);
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC4494i
    /* renamed from: d */
    public final R mo13671d() {
        boolean z = true;
        C4588d.m23622a(Looper.myLooper() != Looper.getMainLooper(), "await must not be called on the UI thread");
        C4588d.m23622a(!this.f21757h, "Result has already been consumed");
        if (this.f21763o != null) {
            z = false;
        }
        C4588d.m23622a(z, "Cannot await if then() has been called.");
        try {
            this.f21751b.await();
        } catch (InterruptedException e) {
            m17461d(Status.f16787b);
        }
        C4588d.m23622a(m17460i(), "Result is not ready.");
        return m17463c();
    }

    /* renamed from: d */
    public final void m17461d(Status status) {
        synchronized (this.f21750a) {
            if (!m17460i()) {
                m17464b((ahn<R>) mo7807b(status));
                this.f21761m = true;
            }
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC4494i
    /* renamed from: e */
    public boolean mo13670e() {
        boolean z;
        synchronized (this.f21750a) {
            z = this.f21760l;
        }
        return z;
    }

    @Override // com.google.android.gms.common.api.AbstractC4494i
    /* renamed from: f */
    public Integer mo17194f() {
        return null;
    }

    /* renamed from: i */
    public final boolean m17460i() {
        return this.f21751b.getCount() == 0;
    }

    /* renamed from: j */
    public boolean m17459j() {
        boolean mo13670e;
        synchronized (this.f21750a) {
            if (this.f21759k.get() == null || !this.f21764p) {
                mo13676a();
            }
            mo13670e = mo13670e();
        }
        return mo13670e;
    }

    /* renamed from: k */
    public void m17458k() {
        mo13673a((AbstractC4503n) null);
    }

    /* renamed from: l */
    public void m17457l() {
        this.f21764p = this.f21764p || f21749i.get().booleanValue();
    }

    /* renamed from: m */
    boolean m17456m() {
        return false;
    }
}
