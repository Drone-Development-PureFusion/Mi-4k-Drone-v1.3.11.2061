package com.google.android.gms.internal;

import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.C3779u;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
@aaa
/* loaded from: classes.dex */
public class acl<T> implements aco<T> {

    /* renamed from: b */
    private T f21138b;

    /* renamed from: c */
    private Throwable f21139c;

    /* renamed from: d */
    private boolean f21140d;

    /* renamed from: e */
    private boolean f21141e;

    /* renamed from: a */
    private final Object f21137a = new Object();

    /* renamed from: f */
    private final acp f21142f = new acp();

    /* renamed from: a */
    private boolean m18211a() {
        return this.f21139c != null || this.f21140d;
    }

    @Override // com.google.android.gms.internal.aco
    /* renamed from: a */
    public void mo18203a(Runnable runnable) {
        this.f21142f.m18201a(runnable);
    }

    /* renamed from: a */
    public void m18210a(Throwable th) {
        synchronized (this.f21137a) {
            if (this.f21141e) {
                return;
            }
            if (m18211a()) {
                C3779u.m26886i().m18451a(new IllegalStateException("Provided CallbackFuture with multiple values."), "CallbackFuture.provideException");
                return;
            }
            this.f21139c = th;
            this.f21137a.notifyAll();
            this.f21142f.m18202a();
        }
    }

    /* renamed from: b */
    public void m18209b(@Nullable T t) {
        synchronized (this.f21137a) {
            if (this.f21141e) {
                return;
            }
            if (m18211a()) {
                C3779u.m26886i().m18451a(new IllegalStateException("Provided CallbackFuture with multiple values."), "CallbackFuture.provideValue");
                return;
            }
            this.f21140d = true;
            this.f21138b = t;
            this.f21137a.notifyAll();
            this.f21142f.m18202a();
        }
    }

    /* renamed from: b */
    public void m18208b(Runnable runnable) {
        this.f21142f.m18200b(runnable);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        boolean z2 = false;
        if (z) {
            synchronized (this.f21137a) {
                if (!m18211a()) {
                    this.f21141e = true;
                    this.f21140d = true;
                    this.f21137a.notifyAll();
                    this.f21142f.m18202a();
                    z2 = true;
                }
            }
        }
        return z2;
    }

    @Override // java.util.concurrent.Future
    public T get() {
        T t;
        synchronized (this.f21137a) {
            if (!m18211a()) {
                try {
                    this.f21137a.wait();
                } catch (InterruptedException e) {
                    throw e;
                }
            }
            if (this.f21139c != null) {
                throw new ExecutionException(this.f21139c);
            }
            if (this.f21141e) {
                throw new CancellationException("CallbackFuture was cancelled.");
            }
            t = this.f21138b;
        }
        return t;
    }

    @Override // java.util.concurrent.Future
    public T get(long j, TimeUnit timeUnit) {
        T t;
        synchronized (this.f21137a) {
            if (!m18211a()) {
                try {
                    long millis = timeUnit.toMillis(j);
                    if (millis != 0) {
                        this.f21137a.wait(millis);
                    }
                } catch (InterruptedException e) {
                    throw e;
                }
            }
            if (this.f21139c != null) {
                throw new ExecutionException(this.f21139c);
            }
            if (!this.f21140d) {
                throw new TimeoutException("CallbackFuture timed out.");
            }
            if (this.f21141e) {
                throw new CancellationException("CallbackFuture was cancelled.");
            }
            t = this.f21138b;
        }
        return t;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        boolean z;
        synchronized (this.f21137a) {
            z = this.f21141e;
        }
        return z;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        boolean m18211a;
        synchronized (this.f21137a) {
            m18211a = m18211a();
        }
        return m18211a;
    }
}
