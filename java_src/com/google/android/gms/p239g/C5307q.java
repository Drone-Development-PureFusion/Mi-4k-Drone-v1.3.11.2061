package com.google.android.gms.p239g;

import android.app.Activity;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.internal.aij;
import com.google.android.gms.internal.aik;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.g.q */
/* loaded from: classes2.dex */
public final class C5307q<TResult> extends AbstractC5285f<TResult> {

    /* renamed from: a */
    private final Object f19196a = new Object();

    /* renamed from: b */
    private final C5306p<TResult> f19197b = new C5306p<>();

    /* renamed from: c */
    private boolean f19198c;

    /* renamed from: d */
    private TResult f19199d;

    /* renamed from: e */
    private Exception f19200e;

    /* renamed from: com.google.android.gms.g.q$a */
    /* loaded from: classes2.dex */
    private static class C5308a extends aij {

        /* renamed from: a */
        private final List<WeakReference<AbstractC5305o<?>>> f19201a = new ArrayList();

        private C5308a(aik aikVar) {
            super(aikVar);
            this.f21940d.mo12684a("TaskOnStopCallback", this);
        }

        /* renamed from: a */
        public static C5308a m20790a(Activity activity) {
            aik b = b(activity);
            C5308a c5308a = (C5308a) b.mo12683a("TaskOnStopCallback", C5308a.class);
            return c5308a == null ? new C5308a(b) : c5308a;
        }

        @Override // com.google.android.gms.internal.aij
        @MainThread
        /* renamed from: a */
        public void mo14499a() {
            synchronized (this.f19201a) {
                for (WeakReference<AbstractC5305o<?>> weakReference : this.f19201a) {
                    AbstractC5305o<?> abstractC5305o = weakReference.get();
                    if (abstractC5305o != null) {
                        abstractC5305o.mo20806a();
                    }
                }
                this.f19201a.clear();
            }
        }

        /* renamed from: a */
        public <T> void m20789a(AbstractC5305o<T> abstractC5305o) {
            synchronized (this.f19201a) {
                this.f19201a.add(new WeakReference<>(abstractC5305o));
            }
        }
    }

    /* renamed from: e */
    private void m20793e() {
        C4588d.m23622a(this.f19198c, "Task is not yet complete");
    }

    /* renamed from: f */
    private void m20792f() {
        C4588d.m23622a(!this.f19198c, "Task is already complete");
    }

    /* renamed from: g */
    private void m20791g() {
        synchronized (this.f19196a) {
            if (!this.f19198c) {
                return;
            }
            this.f19197b.m20804a(this);
        }
    }

    @Override // com.google.android.gms.p239g.AbstractC5285f
    @NonNull
    /* renamed from: a */
    public AbstractC5285f<TResult> mo20802a(@NonNull Activity activity, @NonNull AbstractC5281b<TResult> abstractC5281b) {
        C5299l c5299l = new C5299l(C5287h.f19156a, abstractC5281b);
        this.f19197b.m20803a(c5299l);
        C5308a.m20790a(activity).m20789a(c5299l);
        m20791g();
        return this;
    }

    @Override // com.google.android.gms.p239g.AbstractC5285f
    @NonNull
    /* renamed from: a */
    public AbstractC5285f<TResult> mo7025a(@NonNull Activity activity, @NonNull AbstractC5282c abstractC5282c) {
        C5301m c5301m = new C5301m(C5287h.f19156a, abstractC5282c);
        this.f19197b.m20803a(c5301m);
        C5308a.m20790a(activity).m20789a(c5301m);
        m20791g();
        return this;
    }

    @Override // com.google.android.gms.p239g.AbstractC5285f
    @NonNull
    /* renamed from: a */
    public AbstractC5285f<TResult> mo7024a(@NonNull Activity activity, @NonNull AbstractC5283d<? super TResult> abstractC5283d) {
        C5303n c5303n = new C5303n(C5287h.f19156a, abstractC5283d);
        this.f19197b.m20803a(c5303n);
        C5308a.m20790a(activity).m20789a(c5303n);
        m20791g();
        return this;
    }

    @Override // com.google.android.gms.p239g.AbstractC5285f
    @NonNull
    /* renamed from: a */
    public <TContinuationResult> AbstractC5285f<TContinuationResult> mo20801a(@NonNull AbstractC5280a<TResult, TContinuationResult> abstractC5280a) {
        return mo20797a(C5287h.f19156a, abstractC5280a);
    }

    @Override // com.google.android.gms.p239g.AbstractC5285f
    @NonNull
    /* renamed from: a */
    public AbstractC5285f<TResult> mo20800a(@NonNull AbstractC5281b<TResult> abstractC5281b) {
        return mo20796a(C5287h.f19156a, abstractC5281b);
    }

    @Override // com.google.android.gms.p239g.AbstractC5285f
    @NonNull
    /* renamed from: a */
    public AbstractC5285f<TResult> mo7021a(@NonNull AbstractC5282c abstractC5282c) {
        return mo7016a(C5287h.f19156a, abstractC5282c);
    }

    @Override // com.google.android.gms.p239g.AbstractC5285f
    @NonNull
    /* renamed from: a */
    public AbstractC5285f<TResult> mo7020a(@NonNull AbstractC5283d<? super TResult> abstractC5283d) {
        return mo7015a(C5287h.f19156a, abstractC5283d);
    }

    @Override // com.google.android.gms.p239g.AbstractC5285f
    @NonNull
    /* renamed from: a */
    public <TContinuationResult> AbstractC5285f<TContinuationResult> mo20797a(@NonNull Executor executor, @NonNull AbstractC5280a<TResult, TContinuationResult> abstractC5280a) {
        C5307q c5307q = new C5307q();
        this.f19197b.m20803a(new C5295j(executor, abstractC5280a, c5307q));
        m20791g();
        return c5307q;
    }

    @Override // com.google.android.gms.p239g.AbstractC5285f
    @NonNull
    /* renamed from: a */
    public AbstractC5285f<TResult> mo20796a(@NonNull Executor executor, @NonNull AbstractC5281b<TResult> abstractC5281b) {
        this.f19197b.m20803a(new C5299l(executor, abstractC5281b));
        m20791g();
        return this;
    }

    @Override // com.google.android.gms.p239g.AbstractC5285f
    @NonNull
    /* renamed from: a */
    public AbstractC5285f<TResult> mo7016a(@NonNull Executor executor, @NonNull AbstractC5282c abstractC5282c) {
        this.f19197b.m20803a(new C5301m(executor, abstractC5282c));
        m20791g();
        return this;
    }

    @Override // com.google.android.gms.p239g.AbstractC5285f
    @NonNull
    /* renamed from: a */
    public AbstractC5285f<TResult> mo7015a(@NonNull Executor executor, @NonNull AbstractC5283d<? super TResult> abstractC5283d) {
        this.f19197b.m20803a(new C5303n(executor, abstractC5283d));
        m20791g();
        return this;
    }

    @Override // com.google.android.gms.p239g.AbstractC5285f
    /* renamed from: a */
    public <X extends Throwable> TResult mo7017a(@NonNull Class<X> cls) {
        TResult tresult;
        synchronized (this.f19196a) {
            m20793e();
            if (cls.isInstance(this.f19200e)) {
                throw cls.cast(this.f19200e);
            }
            if (this.f19200e != null) {
                throw new C5284e(this.f19200e);
            }
            tresult = this.f19199d;
        }
        return tresult;
    }

    /* renamed from: a */
    public void m20799a(@NonNull Exception exc) {
        C4588d.m23626a(exc, "Exception must not be null");
        synchronized (this.f19196a) {
            m20792f();
            this.f19198c = true;
            this.f19200e = exc;
        }
        this.f19197b.m20804a(this);
    }

    /* renamed from: a */
    public void m20798a(TResult tresult) {
        synchronized (this.f19196a) {
            m20792f();
            this.f19198c = true;
            this.f19199d = tresult;
        }
        this.f19197b.m20804a(this);
    }

    @Override // com.google.android.gms.p239g.AbstractC5285f
    /* renamed from: a */
    public boolean mo7028a() {
        boolean z;
        synchronized (this.f19196a) {
            z = this.f19198c;
        }
        return z;
    }

    @Override // com.google.android.gms.p239g.AbstractC5285f
    @NonNull
    /* renamed from: b */
    public <TContinuationResult> AbstractC5285f<TContinuationResult> mo20795b(@NonNull AbstractC5280a<TResult, AbstractC5285f<TContinuationResult>> abstractC5280a) {
        return mo20794b(C5287h.f19156a, abstractC5280a);
    }

    @Override // com.google.android.gms.p239g.AbstractC5285f
    @NonNull
    /* renamed from: b */
    public <TContinuationResult> AbstractC5285f<TContinuationResult> mo20794b(@NonNull Executor executor, @NonNull AbstractC5280a<TResult, AbstractC5285f<TContinuationResult>> abstractC5280a) {
        C5307q c5307q = new C5307q();
        this.f19197b.m20803a(new C5297k(executor, abstractC5280a, c5307q));
        m20791g();
        return c5307q;
    }

    @Override // com.google.android.gms.p239g.AbstractC5285f
    /* renamed from: b */
    public boolean mo7012b() {
        boolean z;
        synchronized (this.f19196a) {
            z = this.f19198c && this.f19200e == null;
        }
        return z;
    }

    @Override // com.google.android.gms.p239g.AbstractC5285f
    /* renamed from: c */
    public TResult mo6998c() {
        TResult tresult;
        synchronized (this.f19196a) {
            m20793e();
            if (this.f19200e != null) {
                throw new C5284e(this.f19200e);
            }
            tresult = this.f19199d;
        }
        return tresult;
    }

    @Override // com.google.android.gms.p239g.AbstractC5285f
    @Nullable
    /* renamed from: d */
    public Exception mo6993d() {
        Exception exc;
        synchronized (this.f19196a) {
            exc = this.f19200e;
        }
        return exc;
    }
}
