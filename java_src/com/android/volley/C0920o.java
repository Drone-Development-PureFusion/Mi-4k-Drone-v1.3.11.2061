package com.android.volley;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
/* renamed from: com.android.volley.o */
/* loaded from: classes.dex */
public class C0920o {

    /* renamed from: f */
    private static final int f2053f = 4;

    /* renamed from: a */
    private AtomicInteger f2054a;

    /* renamed from: b */
    private final Map<String, Queue<AbstractC0916n<?>>> f2055b;

    /* renamed from: c */
    private final Set<AbstractC0916n<?>> f2056c;

    /* renamed from: d */
    private final PriorityBlockingQueue<AbstractC0916n<?>> f2057d;

    /* renamed from: e */
    private final PriorityBlockingQueue<AbstractC0916n<?>> f2058e;

    /* renamed from: g */
    private final AbstractC0900b f2059g;

    /* renamed from: h */
    private final AbstractC0909g f2060h;

    /* renamed from: i */
    private final AbstractC0927q f2061i;

    /* renamed from: j */
    private C0910h[] f2062j;

    /* renamed from: k */
    private C0902c f2063k;

    /* renamed from: l */
    private List<AbstractC0923b> f2064l;

    /* renamed from: com.android.volley.o$a */
    /* loaded from: classes.dex */
    public interface AbstractC0922a {
        /* renamed from: a */
        boolean mo37386a(AbstractC0916n<?> abstractC0916n);
    }

    /* renamed from: com.android.volley.o$b */
    /* loaded from: classes.dex */
    public interface AbstractC0923b<T> {
        /* renamed from: a */
        void m37385a(AbstractC0916n<T> abstractC0916n);
    }

    public C0920o(AbstractC0900b abstractC0900b, AbstractC0909g abstractC0909g) {
        this(abstractC0900b, abstractC0909g, 4);
    }

    public C0920o(AbstractC0900b abstractC0900b, AbstractC0909g abstractC0909g, int i) {
        this(abstractC0900b, abstractC0909g, i, new C0905e(new Handler(Looper.getMainLooper())));
    }

    public C0920o(AbstractC0900b abstractC0900b, AbstractC0909g abstractC0909g, int i, AbstractC0927q abstractC0927q) {
        this.f2054a = new AtomicInteger();
        this.f2055b = new HashMap();
        this.f2056c = new HashSet();
        this.f2057d = new PriorityBlockingQueue<>();
        this.f2058e = new PriorityBlockingQueue<>();
        this.f2064l = new ArrayList();
        this.f2059g = abstractC0900b;
        this.f2060h = abstractC0909g;
        this.f2062j = new C0910h[i];
        this.f2061i = abstractC0927q;
    }

    /* renamed from: a */
    public <T> AbstractC0916n<T> m37395a(AbstractC0916n<T> abstractC0916n) {
        abstractC0916n.m37425a(this);
        synchronized (this.f2056c) {
            this.f2056c.add(abstractC0916n);
        }
        abstractC0916n.m37429a(m37388c());
        abstractC0916n.m37421a("add-to-queue");
        if (!abstractC0916n.m37399w()) {
            this.f2058e.add(abstractC0916n);
        } else {
            synchronized (this.f2055b) {
                String m37406j = abstractC0916n.m37406j();
                if (this.f2055b.containsKey(m37406j)) {
                    Queue<AbstractC0916n<?>> queue = this.f2055b.get(m37406j);
                    if (queue == null) {
                        queue = new LinkedList<>();
                    }
                    queue.add(abstractC0916n);
                    this.f2055b.put(m37406j, queue);
                    if (C0968v.f2167b) {
                        C0968v.m37262a("Request for cacheKey=%s is in flight, putting on hold.", m37406j);
                    }
                } else {
                    this.f2055b.put(m37406j, null);
                    this.f2057d.add(abstractC0916n);
                }
            }
        }
        return abstractC0916n;
    }

    /* renamed from: a */
    public void m37396a() {
        m37391b();
        this.f2063k = new C0902c(this.f2057d, this.f2058e, this.f2059g, this.f2061i);
        this.f2063k.start();
        for (int i = 0; i < this.f2062j.length; i++) {
            C0910h c0910h = new C0910h(this.f2058e, this.f2060h, this.f2059g, this.f2061i);
            this.f2062j[i] = c0910h;
            c0910h.start();
        }
    }

    /* renamed from: a */
    public void m37394a(AbstractC0922a abstractC0922a) {
        synchronized (this.f2056c) {
            for (AbstractC0916n<?> abstractC0916n : this.f2056c) {
                if (abstractC0922a.mo37386a(abstractC0916n)) {
                    abstractC0916n.m37404l();
                }
            }
        }
    }

    /* renamed from: a */
    public <T> void m37393a(AbstractC0923b<T> abstractC0923b) {
        synchronized (this.f2064l) {
            this.f2064l.add(abstractC0923b);
        }
    }

    /* renamed from: a */
    public void m37392a(final Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("Cannot cancelAll with a null tag");
        }
        m37394a(new AbstractC0922a() { // from class: com.android.volley.o.1
            @Override // com.android.volley.C0920o.AbstractC0922a
            /* renamed from: a */
            public boolean mo37386a(AbstractC0916n<?> abstractC0916n) {
                return abstractC0916n.m37418b() == obj;
            }
        });
    }

    /* renamed from: b */
    public void m37391b() {
        if (this.f2063k != null) {
            this.f2063k.m37441a();
        }
        for (int i = 0; i < this.f2062j.length; i++) {
            if (this.f2062j[i] != null) {
                this.f2062j[i].m37435a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public <T> void m37390b(AbstractC0916n<T> abstractC0916n) {
        synchronized (this.f2056c) {
            this.f2056c.remove(abstractC0916n);
        }
        synchronized (this.f2064l) {
            for (AbstractC0923b abstractC0923b : this.f2064l) {
                abstractC0923b.m37385a(abstractC0916n);
            }
        }
        if (abstractC0916n.m37399w()) {
            synchronized (this.f2055b) {
                String m37406j = abstractC0916n.m37406j();
                Queue<AbstractC0916n<?>> remove = this.f2055b.remove(m37406j);
                if (remove != null) {
                    if (C0968v.f2167b) {
                        C0968v.m37262a("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(remove.size()), m37406j);
                    }
                    this.f2057d.addAll(remove);
                }
            }
        }
    }

    /* renamed from: b */
    public <T> void m37389b(AbstractC0923b<T> abstractC0923b) {
        synchronized (this.f2064l) {
            this.f2064l.remove(abstractC0923b);
        }
    }

    /* renamed from: c */
    public int m37388c() {
        return this.f2054a.incrementAndGet();
    }

    /* renamed from: d */
    public AbstractC0900b m37387d() {
        return this.f2059g;
    }
}
