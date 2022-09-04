package com.google.android.gms.p239g;

import android.support.annotation.NonNull;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.g.k */
/* loaded from: classes2.dex */
public class C5297k<TResult, TContinuationResult> implements AbstractC5282c, AbstractC5283d<TContinuationResult>, AbstractC5305o<TResult> {

    /* renamed from: a */
    private final Executor f19173a;

    /* renamed from: b */
    private final AbstractC5280a<TResult, AbstractC5285f<TContinuationResult>> f19174b;

    /* renamed from: c */
    private final C5307q<TContinuationResult> f19175c;

    public C5297k(@NonNull Executor executor, @NonNull AbstractC5280a<TResult, AbstractC5285f<TContinuationResult>> abstractC5280a, @NonNull C5307q<TContinuationResult> c5307q) {
        this.f19173a = executor;
        this.f19174b = abstractC5280a;
        this.f19175c = c5307q;
    }

    @Override // com.google.android.gms.p239g.AbstractC5305o
    /* renamed from: a */
    public void mo20806a() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.p239g.AbstractC5305o
    /* renamed from: a */
    public void mo20805a(@NonNull final AbstractC5285f<TResult> abstractC5285f) {
        this.f19173a.execute(new Runnable() { // from class: com.google.android.gms.g.k.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    AbstractC5285f abstractC5285f2 = (AbstractC5285f) C5297k.this.f19174b.mo7250a(abstractC5285f);
                    if (abstractC5285f2 == null) {
                        C5297k.this.mo7035a((Exception) new NullPointerException("Continuation returned null"));
                        return;
                    }
                    abstractC5285f2.mo7015a(C5287h.f19157b, (AbstractC5283d) C5297k.this);
                    abstractC5285f2.mo7016a(C5287h.f19157b, (AbstractC5282c) C5297k.this);
                } catch (C5284e e) {
                    if (e.getCause() instanceof Exception) {
                        C5297k.this.f19175c.m20799a((Exception) e.getCause());
                    } else {
                        C5297k.this.f19175c.m20799a((Exception) e);
                    }
                } catch (Exception e2) {
                    C5297k.this.f19175c.m20799a(e2);
                }
            }
        });
    }

    @Override // com.google.android.gms.p239g.AbstractC5282c
    /* renamed from: a */
    public void mo7035a(@NonNull Exception exc) {
        this.f19175c.m20799a(exc);
    }

    @Override // com.google.android.gms.p239g.AbstractC5283d
    /* renamed from: a */
    public void mo7033a(TContinuationResult tcontinuationresult) {
        this.f19175c.m20798a((C5307q<TContinuationResult>) tcontinuationresult);
    }
}
