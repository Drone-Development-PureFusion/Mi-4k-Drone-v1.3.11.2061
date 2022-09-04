package p005b.p006a.p007a.p029b.p042h.p043a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p005b.p006a.p007a.p029b.p042h.p043a.AbstractRunnableC0498b;
import p005b.p006a.p007a.p029b.p055o.C0662f;
/* renamed from: b.a.a.b.h.a.d */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC0500d<T extends AbstractRunnableC0498b> extends C0662f implements AbstractRunnableC0509k<T>, Runnable {

    /* renamed from: a */
    private final Lock f750a = new ReentrantLock();

    /* renamed from: b */
    private final Collection<T> f751b = new ArrayList();

    /* renamed from: c */
    private final AbstractC0508j<T> f752c;

    /* renamed from: d */
    private final Executor f753d;

    /* renamed from: e */
    private boolean f754e;

    /* renamed from: b.a.a.b.h.a.d$a */
    /* loaded from: classes.dex */
    private class C0502a implements AbstractRunnableC0498b {

        /* renamed from: b */
        private final T f757b;

        public C0502a(T t) {
            this.f757b = t;
        }

        @Override // p005b.p006a.p007a.p029b.p042h.p043a.AbstractRunnableC0498b, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f757b.close();
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractRunnableC0500d.this.m39084b(this.f757b);
            try {
                this.f757b.run();
            } finally {
                AbstractRunnableC0500d.this.m39081c((AbstractRunnableC0500d) this.f757b);
            }
        }
    }

    public AbstractRunnableC0500d(AbstractC0508j<T> abstractC0508j, Executor executor) {
        this.f752c = abstractC0508j;
        this.f753d = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m39084b(T t) {
        this.f750a.lock();
        try {
            this.f751b.add(t);
        } finally {
            this.f750a.unlock();
        }
    }

    /* renamed from: c */
    private Collection<T> m39082c() {
        this.f750a.lock();
        try {
            return new ArrayList(this.f751b);
        } finally {
            this.f750a.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m39081c(T t) {
        this.f750a.lock();
        try {
            this.f751b.remove(t);
        } finally {
            this.f750a.unlock();
        }
    }

    @Override // p005b.p006a.p007a.p029b.p042h.p043a.AbstractRunnableC0509k
    /* renamed from: a */
    public void mo39072a(AbstractC0499c<T> abstractC0499c) {
        for (T t : m39082c()) {
            try {
                abstractC0499c.mo39056a(t);
            } catch (RuntimeException e) {
                c(t + ": " + e);
            }
        }
    }

    /* renamed from: a */
    protected void m39085a(boolean z) {
        this.f754e = z;
    }

    @Override // p005b.p006a.p007a.p029b.p042h.p043a.AbstractRunnableC0509k
    /* renamed from: a */
    public boolean mo39073a() {
        return this.f754e;
    }

    /* renamed from: a */
    protected abstract boolean mo39079a(T t);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p005b.p006a.p007a.p029b.p042h.p043a.AbstractRunnableC0509k
    /* renamed from: b */
    public void mo39071b() {
        this.f752c.close();
        mo39072a((AbstractC0499c) new AbstractC0499c<T>() { // from class: b.a.a.b.h.a.d.1
            @Override // p005b.p006a.p007a.p029b.p042h.p043a.AbstractC0499c
            /* renamed from: a */
            public void mo39056a(T t) {
                t.close();
            }
        });
    }

    @Override // java.lang.Runnable
    public void run() {
        m39085a(true);
        try {
            d("listening on " + this.f752c);
            while (!Thread.currentThread().isInterrupted()) {
                T mo39054a = this.f752c.mo39054a();
                if (!mo39079a((AbstractRunnableC0500d<T>) mo39054a)) {
                    c(mo39054a + ": connection dropped");
                    mo39054a.close();
                } else {
                    try {
                        this.f753d.execute(new C0502a(mo39054a));
                    } catch (RejectedExecutionException e) {
                        c(mo39054a + ": connection dropped");
                        mo39054a.close();
                    }
                }
            }
        } catch (InterruptedException e2) {
        } catch (Exception e3) {
            c("listener: " + e3);
        }
        m39085a(false);
        d("shutting down");
        this.f752c.close();
    }
}
