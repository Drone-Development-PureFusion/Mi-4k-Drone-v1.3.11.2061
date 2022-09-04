package p000a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
/* renamed from: a.l */
/* loaded from: classes.dex */
public class C0018l<TResult> {

    /* renamed from: e */
    private boolean f53e;

    /* renamed from: f */
    private boolean f54f;

    /* renamed from: g */
    private TResult f55g;

    /* renamed from: h */
    private Exception f56h;

    /* renamed from: a */
    public static final ExecutorService f49a = C0012h.m39950a();

    /* renamed from: c */
    private static final Executor f51c = C0012h.m39949b();

    /* renamed from: b */
    public static final Executor f50b = C0001b.m39983b();

    /* renamed from: d */
    private final Object f52d = new Object();

    /* renamed from: i */
    private List<AbstractC0016j<TResult, Void>> f57i = new ArrayList();

    /* renamed from: a.l$a */
    /* loaded from: classes.dex */
    public class C0030a {
        private C0030a() {
        }

        /* renamed from: a */
        public C0018l<TResult> m39893a() {
            return C0018l.this;
        }

        /* renamed from: a */
        public boolean m39892a(Exception exc) {
            boolean z = true;
            synchronized (C0018l.this.f52d) {
                if (C0018l.this.f53e) {
                    z = false;
                } else {
                    C0018l.this.f53e = true;
                    C0018l.this.f56h = exc;
                    C0018l.this.f52d.notifyAll();
                    C0018l.this.m39902k();
                }
            }
            return z;
        }

        /* renamed from: a */
        public boolean m39891a(TResult tresult) {
            boolean z = true;
            synchronized (C0018l.this.f52d) {
                if (C0018l.this.f53e) {
                    z = false;
                } else {
                    C0018l.this.f53e = true;
                    C0018l.this.f55g = tresult;
                    C0018l.this.f52d.notifyAll();
                    C0018l.this.m39902k();
                }
            }
            return z;
        }

        /* renamed from: b */
        public void m39889b(Exception exc) {
            if (!m39892a(exc)) {
                throw new IllegalStateException("Cannot set the error on a completed task.");
            }
        }

        /* renamed from: b */
        public void m39888b(TResult tresult) {
            if (!m39891a((C0030a) tresult)) {
                throw new IllegalStateException("Cannot set the result of a completed task.");
            }
        }

        /* renamed from: b */
        public boolean m39890b() {
            boolean z = true;
            synchronized (C0018l.this.f52d) {
                if (C0018l.this.f53e) {
                    z = false;
                } else {
                    C0018l.this.f53e = true;
                    C0018l.this.f54f = true;
                    C0018l.this.f52d.notifyAll();
                    C0018l.this.m39902k();
                }
            }
            return z;
        }

        /* renamed from: c */
        public void m39887c() {
            if (!m39890b()) {
                throw new IllegalStateException("Cannot cancel a completed task.");
            }
        }
    }

    private C0018l() {
    }

    /* renamed from: a */
    public static <TResult> C0018l<TResult>.C0030a m39939a() {
        C0018l c0018l = new C0018l();
        c0018l.getClass();
        return new C0030a();
    }

    /* renamed from: a */
    public static <TResult> C0018l<TResult> m39931a(Exception exc) {
        C0030a m39939a = m39939a();
        m39939a.m39889b(exc);
        return m39939a.m39893a();
    }

    /* renamed from: a */
    public static <TResult> C0018l<TResult> m39930a(TResult tresult) {
        C0030a m39939a = m39939a();
        m39939a.m39888b((C0030a) tresult);
        return m39939a.m39893a();
    }

    /* renamed from: a */
    public static C0018l<Void> m39929a(Collection<? extends C0018l<?>> collection) {
        if (collection.size() == 0) {
            return m39930a((Object) null);
        }
        final C0030a m39939a = m39939a();
        final ArrayList arrayList = new ArrayList();
        final Object obj = new Object();
        final AtomicInteger atomicInteger = new AtomicInteger(collection.size());
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        for (C0018l<?> c0018l : collection) {
            c0018l.m39938a(new AbstractC0016j<Object, Void>() { // from class: a.l.4
                @Override // p000a.AbstractC0016j
                /* renamed from: a */
                public Void mo40096then(C0018l<Object> c0018l2) {
                    if (c0018l2.m39912d()) {
                        synchronized (obj) {
                            arrayList.add(c0018l2.m39907f());
                        }
                    }
                    if (c0018l2.m39917c()) {
                        atomicBoolean.set(true);
                    }
                    if (atomicInteger.decrementAndGet() == 0) {
                        if (arrayList.size() != 0) {
                            if (arrayList.size() == 1) {
                                m39939a.m39889b((Exception) arrayList.get(0));
                            } else {
                                m39939a.m39889b((Exception) new C0000a(String.format("There were %d exceptions.", Integer.valueOf(arrayList.size())), (Throwable[]) arrayList.toArray(new Throwable[arrayList.size()])));
                            }
                        } else if (atomicBoolean.get()) {
                            m39939a.m39887c();
                        } else {
                            m39939a.m39888b((C0030a) null);
                        }
                    }
                    return null;
                }
            });
        }
        return m39939a.m39893a();
    }

    /* renamed from: a */
    public static <TResult> C0018l<TResult> m39928a(Callable<TResult> callable) {
        return m39925a(callable, f49a);
    }

    /* renamed from: a */
    public static <TResult> C0018l<TResult> m39925a(final Callable<TResult> callable, Executor executor) {
        final C0030a m39939a = m39939a();
        executor.execute(new Runnable() { // from class: a.l.3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                try {
                    C0030a.this.m39888b((C0030a) callable.call());
                } catch (Exception e) {
                    C0030a.this.m39889b(e);
                }
            }
        });
        return m39939a.m39893a();
    }

    /* renamed from: b */
    public static <TResult> C0018l<TResult> m39918b(Callable<TResult> callable) {
        return m39925a(callable, f51c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static <TContinuationResult, TResult> void m39914c(final C0018l<TContinuationResult>.C0030a c0030a, final AbstractC0016j<TResult, TContinuationResult> abstractC0016j, final C0018l<TResult> c0018l, Executor executor) {
        executor.execute(new Runnable() { // from class: a.l.10
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                try {
                    c0030a.m39888b((C0030a) AbstractC0016j.this.mo40096then(c0018l));
                } catch (Exception e) {
                    c0030a.m39889b(e);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static <TContinuationResult, TResult> void m39909d(final C0018l<TContinuationResult>.C0030a c0030a, final AbstractC0016j<TResult, C0018l<TContinuationResult>> abstractC0016j, final C0018l<TResult> c0018l, Executor executor) {
        executor.execute(new Runnable() { // from class: a.l.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    C0018l c0018l2 = (C0018l) AbstractC0016j.this.mo40096then(c0018l);
                    if (c0018l2 == null) {
                        c0030a.m39888b((C0030a) null);
                    } else {
                        c0018l2.m39938a((AbstractC0016j) new AbstractC0016j<TContinuationResult, Void>() { // from class: a.l.2.1
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // p000a.AbstractC0016j
                            /* renamed from: a */
                            public Void mo40096then(C0018l<TContinuationResult> c0018l3) {
                                if (c0018l3.m39917c()) {
                                    c0030a.m39887c();
                                    return null;
                                } else if (c0018l3.m39912d()) {
                                    c0030a.m39889b(c0018l3.m39907f());
                                    return null;
                                } else {
                                    c0030a.m39888b((C0030a) c0018l3.m39908e());
                                    return null;
                                }
                            }
                        });
                    }
                } catch (Exception e) {
                    c0030a.m39889b(e);
                }
            }
        });
    }

    /* renamed from: h */
    public static <TResult> C0018l<TResult> m39905h() {
        C0030a m39939a = m39939a();
        m39939a.m39887c();
        return m39939a.m39893a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public void m39902k() {
        synchronized (this.f52d) {
            for (AbstractC0016j<TResult, Void> abstractC0016j : this.f57i) {
                try {
                    abstractC0016j.mo40096then(this);
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception e2) {
                    throw new RuntimeException(e2);
                }
            }
            this.f57i = null;
        }
    }

    /* renamed from: a */
    public <TContinuationResult> C0018l<TContinuationResult> m39938a(AbstractC0016j<TResult, TContinuationResult> abstractC0016j) {
        return m39937a(abstractC0016j, f51c);
    }

    /* renamed from: a */
    public <TContinuationResult> C0018l<TContinuationResult> m39937a(final AbstractC0016j<TResult, TContinuationResult> abstractC0016j, final Executor executor) {
        boolean m39924b;
        final C0030a m39939a = m39939a();
        synchronized (this.f52d) {
            m39924b = m39924b();
            if (!m39924b) {
                this.f57i.add(new AbstractC0016j<TResult, Void>() { // from class: a.l.6
                    @Override // p000a.AbstractC0016j
                    /* renamed from: a */
                    public Void mo40096then(C0018l<TResult> c0018l) {
                        C0018l.m39914c(m39939a, abstractC0016j, c0018l, executor);
                        return null;
                    }
                });
            }
        }
        if (m39924b) {
            m39914c(m39939a, abstractC0016j, this, executor);
        }
        return m39939a.m39893a();
    }

    /* renamed from: a */
    public C0018l<Void> m39927a(Callable<Boolean> callable, AbstractC0016j<Void, C0018l<Void>> abstractC0016j) {
        return m39926a(callable, abstractC0016j, f51c);
    }

    /* renamed from: a */
    public C0018l<Void> m39926a(final Callable<Boolean> callable, final AbstractC0016j<Void, C0018l<Void>> abstractC0016j, final Executor executor) {
        final C0015i c0015i = new C0015i();
        c0015i.m39944a(new AbstractC0016j<Void, C0018l<Void>>() { // from class: a.l.5
            @Override // p000a.AbstractC0016j
            /* renamed from: a */
            public C0018l<Void> mo40096then(C0018l<Void> c0018l) {
                return ((Boolean) callable.call()).booleanValue() ? C0018l.m39930a((Object) null).m39910d(abstractC0016j, executor).m39910d((AbstractC0016j) c0015i.m39945a(), executor) : C0018l.m39930a((Object) null);
            }
        });
        return m39903j().m39922b((AbstractC0016j) c0015i.m39945a(), executor);
    }

    /* renamed from: b */
    public <TContinuationResult> C0018l<TContinuationResult> m39923b(AbstractC0016j<TResult, C0018l<TContinuationResult>> abstractC0016j) {
        return m39922b(abstractC0016j, f51c);
    }

    /* renamed from: b */
    public <TContinuationResult> C0018l<TContinuationResult> m39922b(final AbstractC0016j<TResult, C0018l<TContinuationResult>> abstractC0016j, final Executor executor) {
        boolean m39924b;
        final C0030a m39939a = m39939a();
        synchronized (this.f52d) {
            m39924b = m39924b();
            if (!m39924b) {
                this.f57i.add(new AbstractC0016j<TResult, Void>() { // from class: a.l.7
                    @Override // p000a.AbstractC0016j
                    /* renamed from: a */
                    public Void mo40096then(C0018l<TResult> c0018l) {
                        C0018l.m39909d(m39939a, abstractC0016j, c0018l, executor);
                        return null;
                    }
                });
            }
        }
        if (m39924b) {
            m39909d(m39939a, abstractC0016j, this, executor);
        }
        return m39939a.m39893a();
    }

    /* renamed from: b */
    public boolean m39924b() {
        boolean z;
        synchronized (this.f52d) {
            z = this.f53e;
        }
        return z;
    }

    /* renamed from: c */
    public <TContinuationResult> C0018l<TContinuationResult> m39916c(AbstractC0016j<TResult, TContinuationResult> abstractC0016j) {
        return m39915c(abstractC0016j, f51c);
    }

    /* renamed from: c */
    public <TContinuationResult> C0018l<TContinuationResult> m39915c(final AbstractC0016j<TResult, TContinuationResult> abstractC0016j, Executor executor) {
        return m39922b(new AbstractC0016j<TResult, C0018l<TContinuationResult>>() { // from class: a.l.8
            @Override // p000a.AbstractC0016j
            /* renamed from: a */
            public C0018l<TContinuationResult> mo40096then(C0018l<TResult> c0018l) {
                return c0018l.m39912d() ? C0018l.m39931a(c0018l.m39907f()) : c0018l.m39917c() ? C0018l.m39905h() : c0018l.m39938a((AbstractC0016j) abstractC0016j);
            }
        }, executor);
    }

    /* renamed from: c */
    public boolean m39917c() {
        boolean z;
        synchronized (this.f52d) {
            z = this.f54f;
        }
        return z;
    }

    /* renamed from: d */
    public <TContinuationResult> C0018l<TContinuationResult> m39911d(AbstractC0016j<TResult, C0018l<TContinuationResult>> abstractC0016j) {
        return m39910d(abstractC0016j, f51c);
    }

    /* renamed from: d */
    public <TContinuationResult> C0018l<TContinuationResult> m39910d(final AbstractC0016j<TResult, C0018l<TContinuationResult>> abstractC0016j, Executor executor) {
        return m39922b(new AbstractC0016j<TResult, C0018l<TContinuationResult>>() { // from class: a.l.9
            @Override // p000a.AbstractC0016j
            /* renamed from: a */
            public C0018l<TContinuationResult> mo40096then(C0018l<TResult> c0018l) {
                return c0018l.m39912d() ? C0018l.m39931a(c0018l.m39907f()) : c0018l.m39917c() ? C0018l.m39905h() : c0018l.m39923b(abstractC0016j);
            }
        }, executor);
    }

    /* renamed from: d */
    public boolean m39912d() {
        boolean z;
        synchronized (this.f52d) {
            z = this.f56h != null;
        }
        return z;
    }

    /* renamed from: e */
    public TResult m39908e() {
        TResult tresult;
        synchronized (this.f52d) {
            tresult = this.f55g;
        }
        return tresult;
    }

    /* renamed from: f */
    public Exception m39907f() {
        Exception exc;
        synchronized (this.f52d) {
            exc = this.f56h;
        }
        return exc;
    }

    /* renamed from: g */
    public void m39906g() {
        synchronized (this.f52d) {
            if (!m39924b()) {
                this.f52d.wait();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: i */
    public <TOut> C0018l<TOut> m39904i() {
        return this;
    }

    /* renamed from: j */
    public C0018l<Void> m39903j() {
        return m39923b((AbstractC0016j<TResult, C0018l<Void>>) new AbstractC0016j<TResult, C0018l<Void>>() { // from class: a.l.1
            @Override // p000a.AbstractC0016j
            /* renamed from: a */
            public C0018l<Void> mo40096then(C0018l<TResult> c0018l) {
                return c0018l.m39917c() ? C0018l.m39905h() : c0018l.m39912d() ? C0018l.m39931a(c0018l.m39907f()) : C0018l.m39930a((Object) null);
            }
        });
    }
}
