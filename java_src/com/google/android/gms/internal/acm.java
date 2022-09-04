package com.google.android.gms.internal;

import java.util.concurrent.TimeUnit;
@aaa
/* loaded from: classes.dex */
public class acm<T> implements aco<T> {

    /* renamed from: a */
    private final T f21143a;

    /* renamed from: b */
    private final acp f21144b = new acp();

    public acm(T t) {
        this.f21143a = t;
        this.f21144b.m18202a();
    }

    @Override // com.google.android.gms.internal.aco
    /* renamed from: a */
    public void mo18203a(Runnable runnable) {
        this.f21144b.m18201a(runnable);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public T get() {
        return this.f21143a;
    }

    @Override // java.util.concurrent.Future
    public T get(long j, TimeUnit timeUnit) {
        return this.f21143a;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return true;
    }
}
