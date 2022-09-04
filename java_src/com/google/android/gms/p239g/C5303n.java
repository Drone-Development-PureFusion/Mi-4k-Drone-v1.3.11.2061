package com.google.android.gms.p239g;

import android.support.annotation.NonNull;
import java.util.concurrent.Executor;
/* renamed from: com.google.android.gms.g.n */
/* loaded from: classes2.dex */
class C5303n<TResult> implements AbstractC5305o<TResult> {

    /* renamed from: a */
    private final Executor f19188a;

    /* renamed from: b */
    private final Object f19189b = new Object();

    /* renamed from: c */
    private AbstractC5283d<? super TResult> f19190c;

    public C5303n(@NonNull Executor executor, @NonNull AbstractC5283d<? super TResult> abstractC5283d) {
        this.f19188a = executor;
        this.f19190c = abstractC5283d;
    }

    @Override // com.google.android.gms.p239g.AbstractC5305o
    /* renamed from: a */
    public void mo20806a() {
        synchronized (this.f19189b) {
            this.f19190c = null;
        }
    }

    @Override // com.google.android.gms.p239g.AbstractC5305o
    /* renamed from: a */
    public void mo20805a(@NonNull final AbstractC5285f<TResult> abstractC5285f) {
        if (abstractC5285f.mo7012b()) {
            synchronized (this.f19189b) {
                if (this.f19190c != null) {
                    this.f19188a.execute(new Runnable() { // from class: com.google.android.gms.g.n.1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.lang.Runnable
                        public void run() {
                            synchronized (C5303n.this.f19189b) {
                                if (C5303n.this.f19190c != null) {
                                    C5303n.this.f19190c.mo7033a(abstractC5285f.mo6998c());
                                }
                            }
                        }
                    });
                }
            }
        }
    }
}
