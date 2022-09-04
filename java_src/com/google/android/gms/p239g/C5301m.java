package com.google.android.gms.p239g;

import android.support.annotation.NonNull;
import java.util.concurrent.Executor;
/* renamed from: com.google.android.gms.g.m */
/* loaded from: classes2.dex */
class C5301m<TResult> implements AbstractC5305o<TResult> {

    /* renamed from: a */
    private final Executor f19183a;

    /* renamed from: b */
    private final Object f19184b = new Object();

    /* renamed from: c */
    private AbstractC5282c f19185c;

    public C5301m(@NonNull Executor executor, @NonNull AbstractC5282c abstractC5282c) {
        this.f19183a = executor;
        this.f19185c = abstractC5282c;
    }

    @Override // com.google.android.gms.p239g.AbstractC5305o
    /* renamed from: a */
    public void mo20806a() {
        synchronized (this.f19184b) {
            this.f19185c = null;
        }
    }

    @Override // com.google.android.gms.p239g.AbstractC5305o
    /* renamed from: a */
    public void mo20805a(@NonNull final AbstractC5285f<TResult> abstractC5285f) {
        if (!abstractC5285f.mo7012b()) {
            synchronized (this.f19184b) {
                if (this.f19185c != null) {
                    this.f19183a.execute(new Runnable() { // from class: com.google.android.gms.g.m.1
                        @Override // java.lang.Runnable
                        public void run() {
                            synchronized (C5301m.this.f19184b) {
                                if (C5301m.this.f19185c != null) {
                                    C5301m.this.f19185c.mo7035a(abstractC5285f.mo6993d());
                                }
                            }
                        }
                    });
                }
            }
        }
    }
}
