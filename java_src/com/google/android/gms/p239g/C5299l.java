package com.google.android.gms.p239g;

import android.support.annotation.NonNull;
import java.util.concurrent.Executor;
/* renamed from: com.google.android.gms.g.l */
/* loaded from: classes2.dex */
class C5299l<TResult> implements AbstractC5305o<TResult> {

    /* renamed from: a */
    private final Executor f19178a;

    /* renamed from: b */
    private final Object f19179b = new Object();

    /* renamed from: c */
    private AbstractC5281b<TResult> f19180c;

    public C5299l(@NonNull Executor executor, @NonNull AbstractC5281b<TResult> abstractC5281b) {
        this.f19178a = executor;
        this.f19180c = abstractC5281b;
    }

    @Override // com.google.android.gms.p239g.AbstractC5305o
    /* renamed from: a */
    public void mo20806a() {
        synchronized (this.f19179b) {
            this.f19180c = null;
        }
    }

    @Override // com.google.android.gms.p239g.AbstractC5305o
    /* renamed from: a */
    public void mo20805a(@NonNull final AbstractC5285f<TResult> abstractC5285f) {
        synchronized (this.f19179b) {
            if (this.f19180c == null) {
                return;
            }
            this.f19178a.execute(new Runnable() { // from class: com.google.android.gms.g.l.1
                @Override // java.lang.Runnable
                public void run() {
                    synchronized (C5299l.this.f19179b) {
                        if (C5299l.this.f19180c != null) {
                            C5299l.this.f19180c.mo7422a(abstractC5285f);
                        }
                    }
                }
            });
        }
    }
}
