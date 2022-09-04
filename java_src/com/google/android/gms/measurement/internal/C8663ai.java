package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.support.annotation.NonNull;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.util.AbstractC4682e;
import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
/* renamed from: com.google.android.gms.measurement.internal.ai */
/* loaded from: classes2.dex */
public class C8663ai extends AbstractC8683b {

    /* renamed from: j */
    private static final AtomicLong f27734j = new AtomicLong(Long.MIN_VALUE);

    /* renamed from: a */
    private C8667d f27735a;

    /* renamed from: b */
    private C8667d f27736b;

    /* renamed from: i */
    private volatile boolean f27743i;

    /* renamed from: g */
    private final Object f27741g = new Object();

    /* renamed from: h */
    private final Semaphore f27742h = new Semaphore(2);

    /* renamed from: c */
    private final PriorityBlockingQueue<FutureTask<?>> f27737c = new PriorityBlockingQueue<>();

    /* renamed from: d */
    private final BlockingQueue<FutureTask<?>> f27738d = new LinkedBlockingQueue();

    /* renamed from: e */
    private final Thread.UncaughtExceptionHandler f27739e = new C8665b("Thread death: Uncaught exception on worker thread");

    /* renamed from: f */
    private final Thread.UncaughtExceptionHandler f27740f = new C8665b("Thread death: Uncaught exception on network thread");

    /* renamed from: com.google.android.gms.measurement.internal.ai$a */
    /* loaded from: classes2.dex */
    static class C8664a extends RuntimeException {
    }

    /* renamed from: com.google.android.gms.measurement.internal.ai$b */
    /* loaded from: classes2.dex */
    private final class C8665b implements Thread.UncaughtExceptionHandler {

        /* renamed from: b */
        private final String f27745b;

        public C8665b(String str) {
            C4588d.m23627a(str);
            this.f27745b = str;
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public synchronized void uncaughtException(Thread thread, Throwable th) {
            C8663ai.this.mo10294w().m10834f().m10830a(this.f27745b, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.measurement.internal.ai$c */
    /* loaded from: classes2.dex */
    public final class C8666c<V> extends FutureTask<V> implements Comparable<C8666c> {

        /* renamed from: b */
        private final long f27747b = C8663ai.f27734j.getAndIncrement();

        /* renamed from: c */
        private final boolean f27748c;

        /* renamed from: d */
        private final String f27749d;

        C8666c(Runnable runnable, boolean z, String str) {
            super(runnable, null);
            C4588d.m23627a(str);
            this.f27749d = str;
            this.f27748c = z;
            if (this.f27747b == Long.MAX_VALUE) {
                C8663ai.this.mo10294w().m10834f().m10831a("Tasks index overflow");
            }
        }

        C8666c(Callable<V> callable, boolean z, String str) {
            super(callable);
            C4588d.m23627a(str);
            this.f27749d = str;
            this.f27748c = z;
            if (this.f27747b == Long.MAX_VALUE) {
                C8663ai.this.mo10294w().m10834f().m10831a("Tasks index overflow");
            }
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(@NonNull C8666c c8666c) {
            if (this.f27748c != c8666c.f27748c) {
                return this.f27748c ? -1 : 1;
            } else if (this.f27747b < c8666c.f27747b) {
                return -1;
            } else {
                if (this.f27747b > c8666c.f27747b) {
                    return 1;
                }
                C8663ai.this.mo10294w().m10833g().m10830a("Two tasks share the same index. index", Long.valueOf(this.f27747b));
                return 0;
            }
        }

        @Override // java.util.concurrent.FutureTask
        protected void setException(Throwable th) {
            C8663ai.this.mo10294w().m10834f().m10830a(this.f27749d, th);
            if (th instanceof C8664a) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
            super.setException(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.measurement.internal.ai$d */
    /* loaded from: classes2.dex */
    public final class C8667d extends Thread {

        /* renamed from: b */
        private final Object f27751b = new Object();

        /* renamed from: c */
        private final BlockingQueue<FutureTask<?>> f27752c;

        public C8667d(String str, BlockingQueue<FutureTask<?>> blockingQueue) {
            C4588d.m23627a(str);
            C4588d.m23627a(blockingQueue);
            this.f27752c = blockingQueue;
            setName(str);
        }

        /* renamed from: a */
        private void m10749a(InterruptedException interruptedException) {
            C8663ai.this.mo10294w().m10832z().m10830a(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
        }

        /* renamed from: a */
        public void m10750a() {
            synchronized (this.f27751b) {
                this.f27751b.notifyAll();
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            boolean z = false;
            while (!z) {
                try {
                    C8663ai.this.f27742h.acquire();
                    z = true;
                } catch (InterruptedException e) {
                    m10749a(e);
                }
            }
            while (true) {
                try {
                    FutureTask<?> poll = this.f27752c.poll();
                    if (poll == null) {
                        synchronized (this.f27751b) {
                            if (this.f27752c.peek() == null && !C8663ai.this.f27743i) {
                                try {
                                    this.f27751b.wait(NotificationOptions.f16268b);
                                } catch (InterruptedException e2) {
                                    m10749a(e2);
                                }
                            }
                        }
                        synchronized (C8663ai.this.f27741g) {
                            if (this.f27752c.peek() == null) {
                                break;
                            }
                        }
                    } else {
                        poll.run();
                    }
                } catch (Throwable th) {
                    synchronized (C8663ai.this.f27741g) {
                        C8663ai.this.f27742h.release();
                        C8663ai.this.f27741g.notifyAll();
                        if (this == C8663ai.this.f27735a) {
                            C8663ai.this.f27735a = null;
                        } else if (this == C8663ai.this.f27736b) {
                            C8663ai.this.f27736b = null;
                        } else {
                            C8663ai.this.mo10294w().m10834f().m10831a("Current scheduler thread is neither worker nor network");
                        }
                        throw th;
                    }
                }
            }
            synchronized (C8663ai.this.f27741g) {
                C8663ai.this.f27742h.release();
                C8663ai.this.f27741g.notifyAll();
                if (this == C8663ai.this.f27735a) {
                    C8663ai.this.f27735a = null;
                } else if (this == C8663ai.this.f27736b) {
                    C8663ai.this.f27736b = null;
                } else {
                    C8663ai.this.mo10294w().m10834f().m10831a("Current scheduler thread is neither worker nor network");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8663ai(C8668aj c8668aj) {
        super(c8668aj);
    }

    /* renamed from: a */
    private void m10765a(C8666c<?> c8666c) {
        synchronized (this.f27741g) {
            this.f27737c.add(c8666c);
            if (this.f27735a == null) {
                this.f27735a = new C8667d("Measurement Worker", this.f27737c);
                this.f27735a.setUncaughtExceptionHandler(this.f27739e);
                this.f27735a.start();
            } else {
                this.f27735a.m10750a();
            }
        }
    }

    /* renamed from: a */
    private void m10760a(FutureTask<?> futureTask) {
        synchronized (this.f27741g) {
            this.f27738d.add(futureTask);
            if (this.f27736b == null) {
                this.f27736b = new C8667d("Measurement Network", this.f27738d);
                this.f27736b.setUncaughtExceptionHandler(this.f27740f);
                this.f27736b.start();
            } else {
                this.f27736b.m10750a();
            }
        }
    }

    /* renamed from: a */
    public <V> Future<V> m10761a(Callable<V> callable) {
        c();
        C4588d.m23627a(callable);
        C8666c<?> c8666c = new C8666c<>((Callable<?>) callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.f27735a) {
            c8666c.run();
        } else {
            m10765a(c8666c);
        }
        return c8666c;
    }

    /* renamed from: a */
    public void m10762a(Runnable runnable) {
        c();
        C4588d.m23627a(runnable);
        m10765a(new C8666c<>(runnable, false, "Task exception on worker thread"));
    }

    /* renamed from: b */
    public <V> Future<V> m10756b(Callable<V> callable) {
        c();
        C4588d.m23627a(callable);
        C8666c<?> c8666c = new C8666c<>((Callable<?>) callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f27735a) {
            c8666c.run();
        } else {
            m10765a(c8666c);
        }
        return c8666c;
    }

    /* renamed from: b */
    public void m10757b(Runnable runnable) {
        c();
        C4588d.m23627a(runnable);
        m10760a((FutureTask<?>) new C8666c(runnable, false, "Task exception on network thread"));
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC8683b
    /* renamed from: e */
    protected void mo10312e() {
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: h */
    public /* bridge */ /* synthetic */ void mo10309h() {
        super.h();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: i */
    public void mo10308i() {
        if (Thread.currentThread() != this.f27736b) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: j */
    public void mo10307j() {
        if (Thread.currentThread() != this.f27735a) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: k */
    public /* bridge */ /* synthetic */ C8725o mo10306k() {
        return super.k();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: l */
    public /* bridge */ /* synthetic */ C8685d mo10305l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: m */
    public /* bridge */ /* synthetic */ C8743z mo10304m() {
        return super.m();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: n */
    public /* bridge */ /* synthetic */ C8733s mo10303n() {
        return super.n();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: o */
    public /* bridge */ /* synthetic */ C8693e mo10302o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: p */
    public /* bridge */ /* synthetic */ AbstractC4682e mo10301p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: q */
    public /* bridge */ /* synthetic */ Context mo10300q() {
        return super.q();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: r */
    public /* bridge */ /* synthetic */ C8727q mo10299r() {
        return super.r();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: s */
    public /* bridge */ /* synthetic */ C8723m mo10298s() {
        return super.s();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: t */
    public /* bridge */ /* synthetic */ C8662ah mo10297t() {
        return super.t();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: u */
    public /* bridge */ /* synthetic */ C8710g mo10296u() {
        return super.u();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: v */
    public /* bridge */ /* synthetic */ C8663ai mo10295v() {
        return super.v();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: w */
    public /* bridge */ /* synthetic */ C8643ab mo10294w() {
        return super.w();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: x */
    public /* bridge */ /* synthetic */ C8654af mo10293x() {
        return super.x();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: y */
    public /* bridge */ /* synthetic */ C8726p mo10292y() {
        return super.y();
    }
}
