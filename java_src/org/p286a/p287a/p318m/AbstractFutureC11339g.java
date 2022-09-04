package org.p286a.p287a.p318m;

import java.io.IOException;
import java.util.Date;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import org.p286a.p287a.p288a.AbstractC11010d;
import org.p286a.p287a.p297d.AbstractC11085c;
import org.p286a.p287a.p320o.C11354a;
/* JADX INFO: Access modifiers changed from: package-private */
@AbstractC11010d
/* renamed from: org.a.a.m.g */
/* loaded from: classes2.dex */
public abstract class AbstractFutureC11339g<T> implements Future<T> {

    /* renamed from: a */
    private final Lock f36407a;

    /* renamed from: b */
    private final AbstractC11085c<T> f36408b;

    /* renamed from: c */
    private final Condition f36409c;

    /* renamed from: d */
    private volatile boolean f36410d;

    /* renamed from: e */
    private volatile boolean f36411e;

    /* renamed from: f */
    private T f36412f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractFutureC11339g(Lock lock, AbstractC11085c<T> abstractC11085c) {
        this.f36407a = lock;
        this.f36409c = lock.newCondition();
        this.f36408b = abstractC11085c;
    }

    /* renamed from: a */
    public void m1382a() {
        this.f36407a.lock();
        try {
            this.f36409c.signalAll();
        } finally {
            this.f36407a.unlock();
        }
    }

    /* renamed from: a */
    public boolean m1381a(Date date) {
        boolean z;
        this.f36407a.lock();
        try {
            if (this.f36410d) {
                throw new InterruptedException("Operation interrupted");
            }
            if (date != null) {
                z = this.f36409c.awaitUntil(date);
            } else {
                this.f36409c.await();
                z = true;
            }
            if (!this.f36410d) {
                return z;
            }
            throw new InterruptedException("Operation interrupted");
        } finally {
            this.f36407a.unlock();
        }
    }

    /* renamed from: b */
    protected abstract T mo1380b(long j, TimeUnit timeUnit);

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        this.f36407a.lock();
        try {
            if (this.f36411e) {
                return false;
            }
            this.f36411e = true;
            this.f36410d = true;
            if (this.f36408b != null) {
                this.f36408b.m2071a();
            }
            this.f36409c.signalAll();
            return true;
        } finally {
            this.f36407a.unlock();
        }
    }

    @Override // java.util.concurrent.Future
    public T get() {
        try {
            return get(0L, TimeUnit.MILLISECONDS);
        } catch (TimeoutException e) {
            throw new ExecutionException(e);
        }
    }

    @Override // java.util.concurrent.Future
    public T get(long j, TimeUnit timeUnit) {
        T t;
        C11354a.m1321a(timeUnit, "Time unit");
        this.f36407a.lock();
        try {
            try {
                if (this.f36411e) {
                    t = this.f36412f;
                } else {
                    this.f36412f = mo1380b(j, timeUnit);
                    this.f36411e = true;
                    if (this.f36408b != null) {
                        this.f36408b.m2069a((AbstractC11085c<T>) this.f36412f);
                    }
                    t = this.f36412f;
                }
                return t;
            } catch (IOException e) {
                this.f36411e = true;
                this.f36412f = null;
                if (this.f36408b != null) {
                    this.f36408b.m2070a((Exception) e);
                }
                throw new ExecutionException(e);
            }
        } finally {
            this.f36407a.unlock();
        }
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f36410d;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f36411e;
    }
}
