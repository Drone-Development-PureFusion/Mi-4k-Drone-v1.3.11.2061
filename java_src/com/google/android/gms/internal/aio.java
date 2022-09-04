package com.google.android.gms.internal;

import android.support.annotation.NonNull;
import com.google.android.gms.common.api.AbstractC4493h;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.AbstractC4502m;
import com.google.android.gms.common.api.AbstractC4503n;
import com.google.android.gms.common.api.AbstractC4505p;
import com.google.android.gms.common.api.AbstractC4506q;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public final class aio<R extends AbstractC4502m> extends AbstractC4493h<R> {

    /* renamed from: a */
    private final ahn<R> f21949a;

    public aio(AbstractC4494i<R> abstractC4494i) {
        if (!(abstractC4494i instanceof ahn)) {
            throw new IllegalArgumentException("OptionalPendingResult can only wrap PendingResults generated by an API call.");
        }
        this.f21949a = (ahn) abstractC4494i;
    }

    @Override // com.google.android.gms.common.api.AbstractC4494i
    /* renamed from: a */
    public R mo13675a(long j, TimeUnit timeUnit) {
        return this.f21949a.mo13675a(j, timeUnit);
    }

    @Override // com.google.android.gms.common.api.AbstractC4494i
    @NonNull
    /* renamed from: a */
    public <S extends AbstractC4502m> AbstractC4506q<S> mo17196a(@NonNull AbstractC4505p<? super R, ? extends S> abstractC4505p) {
        return this.f21949a.mo17196a(abstractC4505p);
    }

    @Override // com.google.android.gms.common.api.AbstractC4494i
    /* renamed from: a */
    public void mo13676a() {
        this.f21949a.mo13676a();
    }

    @Override // com.google.android.gms.common.api.AbstractC4494i
    /* renamed from: a */
    public void mo17197a(AbstractC4494i.AbstractC4495a abstractC4495a) {
        this.f21949a.mo17197a(abstractC4495a);
    }

    @Override // com.google.android.gms.common.api.AbstractC4494i
    /* renamed from: a */
    public void mo13673a(AbstractC4503n<? super R> abstractC4503n) {
        this.f21949a.mo13673a(abstractC4503n);
    }

    @Override // com.google.android.gms.common.api.AbstractC4494i
    /* renamed from: a */
    public void mo13672a(AbstractC4503n<? super R> abstractC4503n, long j, TimeUnit timeUnit) {
        this.f21949a.mo13672a(abstractC4503n, j, timeUnit);
    }

    @Override // com.google.android.gms.common.api.AbstractC4493h
    /* renamed from: b */
    public boolean mo17202b() {
        return this.f21949a.m17460i();
    }

    @Override // com.google.android.gms.common.api.AbstractC4493h
    /* renamed from: c */
    public R mo17201c() {
        if (mo17202b()) {
            return mo13675a(0L, TimeUnit.MILLISECONDS);
        }
        throw new IllegalStateException("Result is not available. Check that isDone() returns true before calling get().");
    }

    @Override // com.google.android.gms.common.api.AbstractC4494i
    /* renamed from: d */
    public R mo13671d() {
        return this.f21949a.mo13671d();
    }

    @Override // com.google.android.gms.common.api.AbstractC4494i
    /* renamed from: e */
    public boolean mo13670e() {
        return this.f21949a.mo13670e();
    }

    @Override // com.google.android.gms.common.api.AbstractC4494i
    /* renamed from: f */
    public Integer mo17194f() {
        return this.f21949a.mo17194f();
    }
}
