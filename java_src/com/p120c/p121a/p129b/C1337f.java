package com.p120c.p121a.p129b;

import com.p120c.p121a.p129b.p135e.AbstractC1333a;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.c.a.b.f */
/* loaded from: classes.dex */
public class C1337f {

    /* renamed from: a */
    final C1328e f3451a;

    /* renamed from: b */
    private Executor f3452b;

    /* renamed from: c */
    private Executor f3453c;

    /* renamed from: e */
    private final Map<Integer, String> f3455e = Collections.synchronizedMap(new HashMap());

    /* renamed from: f */
    private final Map<String, ReentrantLock> f3456f = new WeakHashMap();

    /* renamed from: g */
    private final AtomicBoolean f3457g = new AtomicBoolean(false);

    /* renamed from: h */
    private final AtomicBoolean f3458h = new AtomicBoolean(false);

    /* renamed from: i */
    private final AtomicBoolean f3459i = new AtomicBoolean(false);

    /* renamed from: j */
    private final Object f3460j = new Object();

    /* renamed from: d */
    private Executor f3454d = C1284a.m35960a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1337f(C1328e c1328e) {
        this.f3451a = c1328e;
        this.f3452b = c1328e.f3396g;
        this.f3453c = c1328e.f3397h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public void m35657h() {
        if (!this.f3451a.f3398i && ((ExecutorService) this.f3452b).isShutdown()) {
            this.f3452b = m35656i();
        }
        if (this.f3451a.f3399j || !((ExecutorService) this.f3453c).isShutdown()) {
            return;
        }
        this.f3453c = m35656i();
    }

    /* renamed from: i */
    private Executor m35656i() {
        return C1284a.m35959a(this.f3451a.f3400k, this.f3451a.f3401l, this.f3451a.f3402m);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public String m35675a(AbstractC1333a abstractC1333a) {
        return this.f3455e.get(Integer.valueOf(abstractC1333a.mo35677f()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public ReentrantLock m35669a(String str) {
        ReentrantLock reentrantLock = this.f3456f.get(str);
        if (reentrantLock == null) {
            ReentrantLock reentrantLock2 = new ReentrantLock();
            this.f3456f.put(str, reentrantLock2);
            return reentrantLock2;
        }
        return reentrantLock;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m35676a() {
        this.f3457g.set(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m35674a(AbstractC1333a abstractC1333a, String str) {
        this.f3455e.put(Integer.valueOf(abstractC1333a.mo35677f()), str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m35672a(final RunnableC1345h runnableC1345h) {
        this.f3454d.execute(new Runnable() { // from class: com.c.a.b.f.1
            @Override // java.lang.Runnable
            public void run() {
                File mo35979a = C1337f.this.f3451a.f3404o.mo35979a(runnableC1345h.m35649a());
                boolean z = mo35979a != null && mo35979a.exists();
                C1337f.this.m35657h();
                if (z) {
                    C1337f.this.f3453c.execute(runnableC1345h);
                } else {
                    C1337f.this.f3452b.execute(runnableC1345h);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m35671a(RunnableC1350i runnableC1350i) {
        m35657h();
        this.f3453c.execute(runnableC1350i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m35670a(Runnable runnable) {
        this.f3454d.execute(runnable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m35668a(boolean z) {
        this.f3458h.set(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m35667b() {
        this.f3457g.set(false);
        synchronized (this.f3460j) {
            this.f3460j.notifyAll();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m35666b(AbstractC1333a abstractC1333a) {
        this.f3455e.remove(Integer.valueOf(abstractC1333a.mo35677f()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m35664b(boolean z) {
        this.f3459i.set(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m35663c() {
        if (!this.f3451a.f3398i) {
            ((ExecutorService) this.f3452b).shutdownNow();
        }
        if (!this.f3451a.f3399j) {
            ((ExecutorService) this.f3453c).shutdownNow();
        }
        this.f3455e.clear();
        this.f3456f.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public AtomicBoolean m35661d() {
        return this.f3457g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public Object m35660e() {
        return this.f3460j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean m35659f() {
        return this.f3458h.get();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean m35658g() {
        return this.f3459i.get();
    }
}
