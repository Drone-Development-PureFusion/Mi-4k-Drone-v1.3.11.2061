package com.google.android.gms.p239g;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.concurrent.Executor;
/* renamed from: com.google.android.gms.g.f */
/* loaded from: classes2.dex */
public abstract class AbstractC5285f<TResult> {
    @NonNull
    /* renamed from: a */
    public AbstractC5285f<TResult> mo20802a(@NonNull Activity activity, @NonNull AbstractC5281b<TResult> abstractC5281b) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    @NonNull
    /* renamed from: a */
    public abstract AbstractC5285f<TResult> mo7025a(@NonNull Activity activity, @NonNull AbstractC5282c abstractC5282c);

    @NonNull
    /* renamed from: a */
    public abstract AbstractC5285f<TResult> mo7024a(@NonNull Activity activity, @NonNull AbstractC5283d<? super TResult> abstractC5283d);

    @NonNull
    /* renamed from: a */
    public <TContinuationResult> AbstractC5285f<TContinuationResult> mo20801a(@NonNull AbstractC5280a<TResult, TContinuationResult> abstractC5280a) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    @NonNull
    /* renamed from: a */
    public AbstractC5285f<TResult> mo20800a(@NonNull AbstractC5281b<TResult> abstractC5281b) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    @NonNull
    /* renamed from: a */
    public abstract AbstractC5285f<TResult> mo7021a(@NonNull AbstractC5282c abstractC5282c);

    @NonNull
    /* renamed from: a */
    public abstract AbstractC5285f<TResult> mo7020a(@NonNull AbstractC5283d<? super TResult> abstractC5283d);

    @NonNull
    /* renamed from: a */
    public <TContinuationResult> AbstractC5285f<TContinuationResult> mo20797a(@NonNull Executor executor, @NonNull AbstractC5280a<TResult, TContinuationResult> abstractC5280a) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    @NonNull
    /* renamed from: a */
    public AbstractC5285f<TResult> mo20796a(@NonNull Executor executor, @NonNull AbstractC5281b<TResult> abstractC5281b) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    @NonNull
    /* renamed from: a */
    public abstract AbstractC5285f<TResult> mo7016a(@NonNull Executor executor, @NonNull AbstractC5282c abstractC5282c);

    @NonNull
    /* renamed from: a */
    public abstract AbstractC5285f<TResult> mo7015a(@NonNull Executor executor, @NonNull AbstractC5283d<? super TResult> abstractC5283d);

    /* renamed from: a */
    public abstract <X extends Throwable> TResult mo7017a(@NonNull Class<X> cls);

    /* renamed from: a */
    public abstract boolean mo7028a();

    @NonNull
    /* renamed from: b */
    public <TContinuationResult> AbstractC5285f<TContinuationResult> mo20795b(@NonNull AbstractC5280a<TResult, AbstractC5285f<TContinuationResult>> abstractC5280a) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    @NonNull
    /* renamed from: b */
    public <TContinuationResult> AbstractC5285f<TContinuationResult> mo20794b(@NonNull Executor executor, @NonNull AbstractC5280a<TResult, AbstractC5285f<TContinuationResult>> abstractC5280a) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    /* renamed from: b */
    public abstract boolean mo7012b();

    /* renamed from: c */
    public abstract TResult mo6998c();

    @Nullable
    /* renamed from: d */
    public abstract Exception mo6993d();
}
