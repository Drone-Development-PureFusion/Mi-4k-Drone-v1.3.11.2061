package com.google.android.gms.p239g;

import android.support.annotation.NonNull;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.g.j */
/* loaded from: classes2.dex */
public class C5295j<TResult, TContinuationResult> implements AbstractC5305o<TResult> {

    /* renamed from: a */
    private final Executor f19168a;

    /* renamed from: b */
    private final AbstractC5280a<TResult, TContinuationResult> f19169b;

    /* renamed from: c */
    private final C5307q<TContinuationResult> f19170c;

    public C5295j(@NonNull Executor executor, @NonNull AbstractC5280a<TResult, TContinuationResult> abstractC5280a, @NonNull C5307q<TContinuationResult> c5307q) {
        this.f19168a = executor;
        this.f19169b = abstractC5280a;
        this.f19170c = c5307q;
    }

    @Override // com.google.android.gms.p239g.AbstractC5305o
    /* renamed from: a */
    public void mo20806a() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.p239g.AbstractC5305o
    /* renamed from: a */
    public void mo20805a(@NonNull final AbstractC5285f<TResult> abstractC5285f) {
        this.f19168a.execute(new Runnable() { // from class: com.google.android.gms.g.j.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                try {
                    C5295j.this.f19170c.m20798a((C5307q) C5295j.this.f19169b.mo7250a(abstractC5285f));
                } catch (C5284e e) {
                    if (e.getCause() instanceof Exception) {
                        C5295j.this.f19170c.m20799a((Exception) e.getCause());
                    } else {
                        C5295j.this.f19170c.m20799a((Exception) e);
                    }
                } catch (Exception e2) {
                    C5295j.this.f19170c.m20799a(e2);
                }
            }
        });
    }
}
