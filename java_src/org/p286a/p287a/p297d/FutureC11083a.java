package org.p286a.p287a.p297d;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.p286a.p287a.p320o.C11354a;
/* renamed from: org.a.a.d.a */
/* loaded from: classes2.dex */
public class FutureC11083a<T> implements Future<T>, AbstractC11084b {

    /* renamed from: a */
    private final AbstractC11085c<T> f35674a;

    /* renamed from: b */
    private volatile boolean f35675b;

    /* renamed from: c */
    private volatile boolean f35676c;

    /* renamed from: d */
    private volatile T f35677d;

    /* renamed from: e */
    private volatile Exception f35678e;

    public FutureC11083a(AbstractC11085c<T> abstractC11085c) {
        this.f35674a = abstractC11085c;
    }

    /* renamed from: b */
    private T m2072b() {
        if (this.f35678e != null) {
            throw new ExecutionException(this.f35678e);
        }
        return this.f35677d;
    }

    @Override // org.p286a.p287a.p297d.AbstractC11084b
    /* renamed from: a */
    public boolean mo1532a() {
        return cancel(true);
    }

    /* renamed from: a */
    public boolean m2074a(Exception exc) {
        boolean z = true;
        synchronized (this) {
            if (this.f35675b) {
                z = false;
            } else {
                this.f35675b = true;
                this.f35678e = exc;
                notifyAll();
                if (this.f35674a != null) {
                    this.f35674a.m2070a(exc);
                }
            }
        }
        return z;
    }

    /* renamed from: a */
    public boolean m2073a(T t) {
        boolean z = true;
        synchronized (this) {
            if (this.f35675b) {
                z = false;
            } else {
                this.f35675b = true;
                this.f35677d = t;
                notifyAll();
                if (this.f35674a != null) {
                    this.f35674a.m2069a((AbstractC11085c<T>) t);
                }
            }
        }
        return z;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        boolean z2 = true;
        synchronized (this) {
            if (this.f35675b) {
                z2 = false;
            } else {
                this.f35675b = true;
                this.f35676c = true;
                notifyAll();
                if (this.f35674a != null) {
                    this.f35674a.m2071a();
                }
            }
        }
        return z2;
    }

    @Override // java.util.concurrent.Future
    public synchronized T get() {
        while (!this.f35675b) {
            wait();
        }
        return m2072b();
    }

    @Override // java.util.concurrent.Future
    public synchronized T get(long j, TimeUnit timeUnit) {
        T m2072b;
        C11354a.m1321a(timeUnit, "Time unit");
        long millis = timeUnit.toMillis(j);
        long currentTimeMillis = millis <= 0 ? 0L : System.currentTimeMillis();
        if (!this.f35675b) {
            if (millis <= 0) {
                throw new TimeoutException();
            }
            long j2 = millis;
            do {
                wait(j2);
                if (this.f35675b) {
                    m2072b = m2072b();
                } else {
                    j2 = millis - (System.currentTimeMillis() - currentTimeMillis);
                }
            } while (j2 > 0);
            throw new TimeoutException();
        }
        m2072b = m2072b();
        return m2072b;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f35676c;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f35675b;
    }
}
