package org.p328c.p337b.p341d.p344c;

import java.lang.Thread;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.p328c.p350f.p351a.AbstractC11650j;
import org.p328c.p350f.p351a.C11646f;
import org.p328c.p350f.p351a.C11655l;
/* renamed from: org.c.b.d.c.c */
/* loaded from: classes.dex */
public class C11534c extends AbstractC11650j {

    /* renamed from: a */
    private final AbstractC11650j f36642a;

    /* renamed from: b */
    private final TimeUnit f36643b;

    /* renamed from: c */
    private final long f36644c;

    /* renamed from: d */
    private final boolean f36645d;

    /* renamed from: e */
    private volatile ThreadGroup f36646e;

    /* renamed from: org.c.b.d.c.c$a */
    /* loaded from: classes2.dex */
    public static class C11536a {

        /* renamed from: a */
        private boolean f36647a;

        /* renamed from: b */
        private long f36648b;

        /* renamed from: c */
        private TimeUnit f36649c;

        private C11536a() {
            this.f36647a = false;
            this.f36648b = 0L;
            this.f36649c = TimeUnit.SECONDS;
        }

        /* renamed from: a */
        public C11536a m851a(long j, TimeUnit timeUnit) {
            if (j < 0) {
                throw new IllegalArgumentException("timeout must be non-negative");
            }
            if (timeUnit == null) {
                throw new NullPointerException("TimeUnit cannot be null");
            }
            this.f36648b = j;
            this.f36649c = timeUnit;
            return this;
        }

        /* renamed from: a */
        public C11536a m848a(boolean z) {
            this.f36647a = z;
            return this;
        }

        /* renamed from: a */
        public C11534c m849a(AbstractC11650j abstractC11650j) {
            if (abstractC11650j == null) {
                throw new NullPointerException("statement cannot be null");
            }
            return new C11534c(this, abstractC11650j);
        }
    }

    /* renamed from: org.c.b.d.c.c$b */
    /* loaded from: classes2.dex */
    private class CallableC11537b implements Callable<Throwable> {

        /* renamed from: b */
        private final CountDownLatch f36651b;

        private CallableC11537b() {
            this.f36651b = new CountDownLatch(1);
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Throwable call() {
            try {
                this.f36651b.countDown();
                C11534c.this.f36642a.mo318a();
                return null;
            } catch (Exception e) {
                throw e;
            } catch (Throwable th) {
                return th;
            }
        }

        /* renamed from: b */
        public void m844b() {
            this.f36651b.await();
        }
    }

    private C11534c(C11536a c11536a, AbstractC11650j abstractC11650j) {
        this.f36646e = null;
        this.f36642a = abstractC11650j;
        this.f36644c = c11536a.f36648b;
        this.f36643b = c11536a.f36649c;
        this.f36645d = c11536a.f36647a;
    }

    @Deprecated
    public C11534c(AbstractC11650j abstractC11650j, long j) {
        this(m855b().m851a(j, TimeUnit.MILLISECONDS), abstractC11650j);
    }

    /* renamed from: a */
    private Exception m860a(Thread thread) {
        StackTraceElement[] stackTrace = thread.getStackTrace();
        Thread m853c = this.f36645d ? m853c(thread) : null;
        C11655l c11655l = new C11655l(this.f36644c, this.f36643b);
        if (stackTrace != null) {
            c11655l.setStackTrace(stackTrace);
            thread.interrupt();
        }
        if (m853c != null) {
            Exception exc = new Exception("Appears to be stuck in thread " + m853c.getName());
            exc.setStackTrace(m854b(m853c));
            return new C11646f(Arrays.asList(c11655l, exc));
        }
        return c11655l;
    }

    /* renamed from: a */
    private Throwable m858a(FutureTask<Throwable> futureTask, Thread thread) {
        try {
            return this.f36644c > 0 ? futureTask.get(this.f36644c, this.f36643b) : futureTask.get();
        } catch (InterruptedException e) {
            return e;
        } catch (ExecutionException e2) {
            return e2.getCause();
        } catch (TimeoutException e3) {
            return m860a(thread);
        }
    }

    /* renamed from: a */
    private Thread[] m859a(ThreadGroup threadGroup) {
        int max = Math.max(threadGroup.activeCount() * 2, 100);
        int i = 0;
        do {
            Thread[] threadArr = new Thread[max];
            int enumerate = threadGroup.enumerate(threadArr);
            if (enumerate < max) {
                return m856a(threadArr, enumerate);
            }
            max += 100;
            i++;
        } while (i < 5);
        return null;
    }

    /* renamed from: a */
    private Thread[] m856a(Thread[] threadArr, int i) {
        int min = Math.min(i, threadArr.length);
        Thread[] threadArr2 = new Thread[min];
        for (int i2 = 0; i2 < min; i2++) {
            threadArr2[i2] = threadArr[i2];
        }
        return threadArr2;
    }

    /* renamed from: b */
    public static C11536a m855b() {
        return new C11536a();
    }

    /* renamed from: b */
    private StackTraceElement[] m854b(Thread thread) {
        try {
            return thread.getStackTrace();
        } catch (SecurityException e) {
            return new StackTraceElement[0];
        }
    }

    /* renamed from: c */
    private Thread m853c(Thread thread) {
        Thread[] m859a;
        Thread thread2;
        if (this.f36646e == null || (m859a = m859a(this.f36646e)) == null) {
            return null;
        }
        int length = m859a.length;
        int i = 0;
        Thread thread3 = null;
        long j = 0;
        while (i < length) {
            Thread thread4 = m859a[i];
            if (thread4.getState() == Thread.State.RUNNABLE) {
                long m852d = m852d(thread4);
                if (thread3 == null || m852d > j) {
                    j = m852d;
                    thread2 = thread4;
                    i++;
                    thread3 = thread2;
                }
            }
            thread2 = thread3;
            i++;
            thread3 = thread2;
        }
        if (thread3 == thread) {
            thread3 = null;
        }
        return thread3;
    }

    /* renamed from: d */
    private long m852d(Thread thread) {
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        if (threadMXBean.isThreadCpuTimeSupported()) {
            try {
                return threadMXBean.getThreadCpuTime(thread.getId());
            } catch (UnsupportedOperationException e) {
            }
        }
        return 0L;
    }

    @Override // org.p328c.p350f.p351a.AbstractC11650j
    /* renamed from: a */
    public void mo318a() {
        CallableC11537b callableC11537b = new CallableC11537b();
        FutureTask<Throwable> futureTask = new FutureTask<>(callableC11537b);
        this.f36646e = new ThreadGroup("FailOnTimeoutGroup");
        Thread thread = new Thread(this.f36646e, futureTask, "Time-limited test");
        thread.setDaemon(true);
        thread.start();
        callableC11537b.m844b();
        Throwable m858a = m858a(futureTask, thread);
        if (m858a != null) {
            throw m858a;
        }
    }
}
