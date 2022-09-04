package com.google.android.gms.common.api;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.android.gms.common.api.AbstractC4502m;
import java.util.concurrent.TimeUnit;
/* renamed from: com.google.android.gms.common.api.i */
/* loaded from: classes.dex */
public abstract class AbstractC4494i<R extends AbstractC4502m> {

    /* renamed from: com.google.android.gms.common.api.i$a */
    /* loaded from: classes2.dex */
    public interface AbstractC4495a {
        /* renamed from: a */
        void mo17524a(Status status);
    }

    @NonNull
    /* renamed from: a */
    public abstract R mo13675a(long j, @NonNull TimeUnit timeUnit);

    @NonNull
    /* renamed from: a */
    public <S extends AbstractC4502m> AbstractC4506q<S> mo17196a(@NonNull AbstractC4505p<? super R, ? extends S> abstractC4505p) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public abstract void mo13676a();

    /* renamed from: a */
    public void mo17197a(@NonNull AbstractC4495a abstractC4495a) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public abstract void mo13673a(@NonNull AbstractC4503n<? super R> abstractC4503n);

    /* renamed from: a */
    public abstract void mo13672a(@NonNull AbstractC4503n<? super R> abstractC4503n, long j, @NonNull TimeUnit timeUnit);

    @NonNull
    /* renamed from: d */
    public abstract R mo13671d();

    /* renamed from: e */
    public abstract boolean mo13670e();

    @Nullable
    /* renamed from: f */
    public Integer mo17194f() {
        throw new UnsupportedOperationException();
    }
}
