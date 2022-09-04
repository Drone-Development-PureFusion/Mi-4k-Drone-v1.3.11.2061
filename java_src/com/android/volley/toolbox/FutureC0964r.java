package com.android.volley.toolbox;

import com.android.volley.AbstractC0916n;
import com.android.volley.C0924p;
import com.android.volley.C0967u;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* renamed from: com.android.volley.toolbox.r */
/* loaded from: classes.dex */
public class FutureC0964r<T> implements C0924p.AbstractC0925a, C0924p.AbstractC0926b<T>, Future<T> {

    /* renamed from: a */
    private AbstractC0916n<?> f2158a;

    /* renamed from: b */
    private boolean f2159b = false;

    /* renamed from: c */
    private T f2160c;

    /* renamed from: d */
    private C0967u f2161d;

    private FutureC0964r() {
    }

    /* renamed from: a */
    public static <E> FutureC0964r<E> m37274a() {
        return new FutureC0964r<>();
    }

    /* renamed from: a */
    private synchronized T m37272a(Long l) {
        T t;
        if (this.f2161d != null) {
            throw new ExecutionException(this.f2161d);
        }
        if (this.f2159b) {
            t = this.f2160c;
        } else {
            if (l == null) {
                wait(0L);
            } else if (l.longValue() > 0) {
                wait(l.longValue());
            }
            if (this.f2161d != null) {
                throw new ExecutionException(this.f2161d);
            }
            if (!this.f2159b) {
                throw new TimeoutException();
            }
            t = this.f2160c;
        }
        return t;
    }

    /* renamed from: a */
    public void m37273a(AbstractC0916n<?> abstractC0916n) {
        this.f2158a = abstractC0916n;
    }

    @Override // com.android.volley.C0924p.AbstractC0925a
    /* renamed from: a */
    public synchronized void mo29150a(C0967u c0967u) {
        this.f2161d = c0967u;
        notifyAll();
    }

    @Override // com.android.volley.C0924p.AbstractC0926b
    /* renamed from: a */
    public synchronized void mo34899a(T t) {
        this.f2159b = true;
        this.f2160c = t;
        notifyAll();
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean cancel(boolean z) {
        boolean z2 = false;
        synchronized (this) {
            if (this.f2158a != null && !isDone()) {
                this.f2158a.m37404l();
                z2 = true;
            }
        }
        return z2;
    }

    @Override // java.util.concurrent.Future
    public T get() {
        try {
            return m37272a((Long) null);
        } catch (TimeoutException e) {
            throw new AssertionError(e);
        }
    }

    @Override // java.util.concurrent.Future
    public T get(long j, TimeUnit timeUnit) {
        return m37272a(Long.valueOf(TimeUnit.MILLISECONDS.convert(j, timeUnit)));
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        if (this.f2158a == null) {
            return false;
        }
        return this.f2158a.mo37356m();
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isDone() {
        boolean z;
        if (!this.f2159b && this.f2161d == null) {
            if (!isCancelled()) {
                z = false;
            }
        }
        z = true;
        return z;
    }
}
