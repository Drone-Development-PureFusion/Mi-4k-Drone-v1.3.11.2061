package com.google.android.gms.p239g;

import android.support.annotation.NonNull;
import com.google.android.gms.common.internal.C4588d;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* renamed from: com.google.android.gms.g.i */
/* loaded from: classes2.dex */
public final class C5290i {

    /* renamed from: com.google.android.gms.g.i$a */
    /* loaded from: classes2.dex */
    private static final class C5292a implements AbstractC5293b {

        /* renamed from: a */
        private final CountDownLatch f19161a;

        private C5292a() {
            this.f19161a = new CountDownLatch(1);
        }

        /* renamed from: a */
        public void m20819a() {
            this.f19161a.await();
        }

        @Override // com.google.android.gms.p239g.AbstractC5282c
        /* renamed from: a */
        public void mo7035a(@NonNull Exception exc) {
            this.f19161a.countDown();
        }

        @Override // com.google.android.gms.p239g.AbstractC5283d
        /* renamed from: a */
        public void mo7033a(Object obj) {
            this.f19161a.countDown();
        }

        /* renamed from: a */
        public boolean m20818a(long j, TimeUnit timeUnit) {
            return this.f19161a.await(j, timeUnit);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.g.i$b */
    /* loaded from: classes2.dex */
    public interface AbstractC5293b extends AbstractC5282c, AbstractC5283d<Object> {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.g.i$c */
    /* loaded from: classes2.dex */
    public static final class C5294c implements AbstractC5293b {

        /* renamed from: a */
        private final Object f19162a = new Object();

        /* renamed from: b */
        private final int f19163b;

        /* renamed from: c */
        private final C5307q<Void> f19164c;

        /* renamed from: d */
        private int f19165d;

        /* renamed from: e */
        private int f19166e;

        /* renamed from: f */
        private Exception f19167f;

        public C5294c(int i, C5307q<Void> c5307q) {
            this.f19163b = i;
            this.f19164c = c5307q;
        }

        /* renamed from: a */
        private void m20817a() {
            if (this.f19165d + this.f19166e == this.f19163b) {
                if (this.f19167f == null) {
                    this.f19164c.m20798a((C5307q<Void>) null);
                    return;
                }
                C5307q<Void> c5307q = this.f19164c;
                int i = this.f19166e;
                c5307q.m20799a(new ExecutionException(new StringBuilder(54).append(i).append(" out of ").append(this.f19163b).append(" underlying tasks failed").toString(), this.f19167f));
            }
        }

        @Override // com.google.android.gms.p239g.AbstractC5282c
        /* renamed from: a */
        public void mo7035a(@NonNull Exception exc) {
            synchronized (this.f19162a) {
                this.f19166e++;
                this.f19167f = exc;
                m20817a();
            }
        }

        @Override // com.google.android.gms.p239g.AbstractC5283d
        /* renamed from: a */
        public void mo7033a(Object obj) {
            synchronized (this.f19162a) {
                this.f19165d++;
                m20817a();
            }
        }
    }

    private C5290i() {
    }

    /* renamed from: a */
    public static <TResult> AbstractC5285f<TResult> m20826a(@NonNull Exception exc) {
        C5307q c5307q = new C5307q();
        c5307q.m20799a(exc);
        return c5307q;
    }

    /* renamed from: a */
    public static <TResult> AbstractC5285f<TResult> m20825a(TResult tresult) {
        C5307q c5307q = new C5307q();
        c5307q.m20798a((C5307q) tresult);
        return c5307q;
    }

    /* renamed from: a */
    public static AbstractC5285f<Void> m20824a(Collection<? extends AbstractC5285f<?>> collection) {
        if (collection.isEmpty()) {
            return m20825a((Object) null);
        }
        for (AbstractC5285f<?> abstractC5285f : collection) {
            if (abstractC5285f == null) {
                throw new NullPointerException("null tasks are not accepted");
            }
        }
        C5307q c5307q = new C5307q();
        C5294c c5294c = new C5294c(collection.size(), c5307q);
        for (AbstractC5285f<?> abstractC5285f2 : collection) {
            m20827a(abstractC5285f2, c5294c);
        }
        return c5307q;
    }

    /* renamed from: a */
    public static <TResult> AbstractC5285f<TResult> m20823a(@NonNull Callable<TResult> callable) {
        return m20822a(C5287h.f19156a, callable);
    }

    /* renamed from: a */
    public static <TResult> AbstractC5285f<TResult> m20822a(@NonNull Executor executor, @NonNull final Callable<TResult> callable) {
        C4588d.m23626a(executor, "Executor must not be null");
        C4588d.m23626a(callable, "Callback must not be null");
        final C5307q c5307q = new C5307q();
        executor.execute(new Runnable() { // from class: com.google.android.gms.g.i.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    C5307q.this.m20798a((C5307q) callable.call());
                } catch (Exception e) {
                    C5307q.this.m20799a(e);
                }
            }
        });
        return c5307q;
    }

    /* renamed from: a */
    public static AbstractC5285f<Void> m20821a(AbstractC5285f<?>... abstractC5285fArr) {
        return abstractC5285fArr.length == 0 ? m20825a((Object) null) : m20824a((Collection<? extends AbstractC5285f<?>>) Arrays.asList(abstractC5285fArr));
    }

    /* renamed from: a */
    public static <TResult> TResult m20829a(@NonNull AbstractC5285f<TResult> abstractC5285f) {
        C4588d.m23631a();
        C4588d.m23626a(abstractC5285f, "Task must not be null");
        if (abstractC5285f.mo7028a()) {
            return (TResult) m20820b(abstractC5285f);
        }
        C5292a c5292a = new C5292a();
        m20827a((AbstractC5285f<?>) abstractC5285f, (AbstractC5293b) c5292a);
        c5292a.m20819a();
        return (TResult) m20820b(abstractC5285f);
    }

    /* renamed from: a */
    public static <TResult> TResult m20828a(@NonNull AbstractC5285f<TResult> abstractC5285f, long j, @NonNull TimeUnit timeUnit) {
        C4588d.m23631a();
        C4588d.m23626a(abstractC5285f, "Task must not be null");
        C4588d.m23626a(timeUnit, "TimeUnit must not be null");
        if (abstractC5285f.mo7028a()) {
            return (TResult) m20820b(abstractC5285f);
        }
        C5292a c5292a = new C5292a();
        m20827a((AbstractC5285f<?>) abstractC5285f, (AbstractC5293b) c5292a);
        if (c5292a.m20818a(j, timeUnit)) {
            return (TResult) m20820b(abstractC5285f);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    /* renamed from: a */
    private static void m20827a(AbstractC5285f<?> abstractC5285f, AbstractC5293b abstractC5293b) {
        abstractC5285f.mo7015a(C5287h.f19157b, (AbstractC5283d<? super Object>) abstractC5293b);
        abstractC5285f.mo7016a(C5287h.f19157b, (AbstractC5282c) abstractC5293b);
    }

    /* renamed from: b */
    private static <TResult> TResult m20820b(AbstractC5285f<TResult> abstractC5285f) {
        if (abstractC5285f.mo7012b()) {
            return abstractC5285f.mo6998c();
        }
        throw new ExecutionException(abstractC5285f.mo6993d());
    }
}
