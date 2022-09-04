package org.p286a.p287a.p318m;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.p286a.p287a.p288a.AbstractC11010d;
import org.p286a.p287a.p297d.AbstractC11085c;
import org.p286a.p287a.p318m.AbstractC11337e;
import org.p286a.p287a.p320o.C11354a;
import org.p286a.p287a.p320o.C11355b;
@AbstractC11010d
/* renamed from: org.a.a.m.a */
/* loaded from: classes2.dex */
public abstract class AbstractC11329a<T, C, E extends AbstractC11337e<T, C>> implements AbstractC11335c<T, E>, AbstractC11336d<T> {

    /* renamed from: b */
    private final AbstractC11334b<T, C> f36381b;

    /* renamed from: h */
    private volatile boolean f36387h;

    /* renamed from: i */
    private volatile int f36388i;

    /* renamed from: j */
    private volatile int f36389j;

    /* renamed from: a */
    private final Lock f36380a = new ReentrantLock();

    /* renamed from: c */
    private final Map<T, AbstractC11341i<T, C, E>> f36382c = new HashMap();

    /* renamed from: d */
    private final Set<E> f36383d = new HashSet();

    /* renamed from: e */
    private final LinkedList<E> f36384e = new LinkedList<>();

    /* renamed from: f */
    private final LinkedList<AbstractFutureC11339g<E>> f36385f = new LinkedList<>();

    /* renamed from: g */
    private final Map<T, Integer> f36386g = new HashMap();

    public AbstractC11329a(AbstractC11334b<T, C> abstractC11334b, int i, int i2) {
        this.f36381b = (AbstractC11334b) C11354a.m1321a(abstractC11334b, "Connection factory");
        this.f36388i = C11354a.m1317b(i, "Max per route value");
        this.f36389j = C11354a.m1317b(i2, "Max total value");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public E m1421a(T t, Object obj, long j, TimeUnit timeUnit, AbstractFutureC11339g<E> abstractFutureC11339g) {
        Date date = null;
        if (j > 0) {
            date = new Date(System.currentTimeMillis() + timeUnit.toMillis(j));
        }
        this.f36380a.lock();
        try {
            AbstractC11341i m1412c = m1412c(t);
            E e = null;
            while (e == null) {
                C11355b.m1312a(!this.f36387h, "Connection pool shut down");
                while (true) {
                    e = (E) m1412c.m1369b(obj);
                    if (e != null && (e.mo1393e() || e.mo1396a(System.currentTimeMillis()))) {
                        e.mo1392f();
                        this.f36384e.remove(e);
                        m1412c.m1372a(e, false);
                    }
                }
                if (e != null) {
                    this.f36384e.remove(e);
                    this.f36383d.add(e);
                    return e;
                }
                int m1411d = m1411d(t);
                int max = Math.max(0, (m1412c.m1364e() + 1) - m1411d);
                if (max > 0) {
                    for (int i = 0; i < max; i++) {
                        AbstractC11337e m1363f = m1412c.m1363f();
                        if (m1363f == null) {
                            break;
                        }
                        m1363f.mo1392f();
                        this.f36384e.remove(m1363f);
                        m1412c.m1373a((AbstractC11341i) m1363f);
                    }
                }
                if (m1412c.m1364e() < m1411d) {
                    int max2 = Math.max(this.f36389j - this.f36383d.size(), 0);
                    if (max2 > 0) {
                        if (this.f36384e.size() > max2 - 1 && !this.f36384e.isEmpty()) {
                            E removeLast = this.f36384e.removeLast();
                            removeLast.mo1392f();
                            m1412c(removeLast.m1390h()).m1373a((AbstractC11341i) removeLast);
                        }
                        E e2 = (E) m1412c.m1366c(this.f36381b.mo1407a(t));
                        this.f36383d.add(e2);
                        return e2;
                    }
                }
                m1412c.m1371a((AbstractFutureC11339g) abstractFutureC11339g);
                this.f36385f.add(abstractFutureC11339g);
                boolean m1381a = abstractFutureC11339g.m1381a(date);
                m1412c.m1368b((AbstractFutureC11339g) abstractFutureC11339g);
                this.f36385f.remove(abstractFutureC11339g);
                if (!m1381a && date != null && date.getTime() <= System.currentTimeMillis()) {
                    break;
                }
            }
            throw new TimeoutException("Timeout waiting for connection");
        } finally {
            this.f36380a.unlock();
        }
    }

    /* renamed from: c */
    private AbstractC11341i<T, C, E> m1412c(final T t) {
        AbstractC11341i<T, C, E> abstractC11341i = this.f36382c.get(t);
        if (abstractC11341i == null) {
            AbstractC11341i<T, C, E> abstractC11341i2 = (AbstractC11341i<T, C, E>) new AbstractC11341i<T, C, E>(t) { // from class: org.a.a.m.a.1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // org.p286a.p287a.p318m.AbstractC11341i
                /* renamed from: a */
                protected E mo1374a(C c) {
                    return (E) AbstractC11329a.this.mo1422a((AbstractC11329a) t, (Object) c);
                }
            };
            this.f36382c.put(t, abstractC11341i2);
            return abstractC11341i2;
        }
        return abstractC11341i;
    }

    /* renamed from: d */
    private int m1411d(T t) {
        Integer num = this.f36386g.get(t);
        return num != null ? num.intValue() : this.f36388i;
    }

    /* renamed from: g */
    private void m1409g() {
        Iterator<Map.Entry<T, AbstractC11341i<T, C, E>>> it2 = this.f36382c.entrySet().iterator();
        while (it2.hasNext()) {
            AbstractC11341i<T, C, E> value = it2.next().getValue();
            if (value.m1364e() + value.m1367c() == 0) {
                it2.remove();
            }
        }
    }

    @Override // org.p286a.p287a.p318m.AbstractC11335c
    /* renamed from: a */
    public Future<E> mo1406a(final T t, final Object obj, AbstractC11085c<E> abstractC11085c) {
        C11354a.m1321a(t, "Route");
        C11355b.m1312a(!this.f36387h, "Connection pool shut down");
        return new AbstractFutureC11339g<E>(this.f36380a, abstractC11085c) { // from class: org.a.a.m.a.2
            @Override // org.p286a.p287a.p318m.AbstractFutureC11339g
            /* renamed from: a */
            public E mo1380b(long j, TimeUnit timeUnit) {
                E e = (E) AbstractC11329a.this.m1421a(t, obj, j, timeUnit, this);
                AbstractC11329a.this.m1419a((AbstractC11329a) e);
                return e;
            }
        };
    }

    /* renamed from: a */
    protected abstract E mo1422a(T t, C c);

    @Override // org.p286a.p287a.p318m.AbstractC11336d
    /* renamed from: a */
    public C11340h mo1403a(T t) {
        C11354a.m1321a(t, "Route");
        this.f36380a.lock();
        try {
            AbstractC11341i<T, C, E> m1412c = m1412c(t);
            return new C11340h(m1412c.m1370b(), m1412c.m1367c(), m1412c.m1365d(), m1411d(t));
        } finally {
            this.f36380a.unlock();
        }
    }

    @Override // org.p286a.p287a.p318m.AbstractC11336d
    /* renamed from: a */
    public void mo1404a(int i) {
        C11354a.m1317b(i, "Max value");
        this.f36380a.lock();
        try {
            this.f36389j = i;
        } finally {
            this.f36380a.unlock();
        }
    }

    /* renamed from: a */
    public void m1423a(long j, TimeUnit timeUnit) {
        long j2 = 0;
        C11354a.m1321a(timeUnit, "Time unit");
        long millis = timeUnit.toMillis(j);
        if (millis >= 0) {
            j2 = millis;
        }
        final long currentTimeMillis = System.currentTimeMillis() - j2;
        m1417a((AbstractC11338f) new AbstractC11338f<T, C>() { // from class: org.a.a.m.a.3
            @Override // org.p286a.p287a.p318m.AbstractC11338f
            /* renamed from: a */
            public void mo1383a(AbstractC11337e<T, C> abstractC11337e) {
                if (abstractC11337e.m1385m() <= currentTimeMillis) {
                    abstractC11337e.mo1392f();
                }
            }
        });
    }

    @Override // org.p286a.p287a.p318m.AbstractC11336d
    /* renamed from: a */
    public void mo1402a(T t, int i) {
        C11354a.m1321a(t, "Route");
        C11354a.m1317b(i, "Max per route value");
        this.f36380a.lock();
        try {
            this.f36386g.put(t, Integer.valueOf(i));
        } finally {
            this.f36380a.unlock();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.p286a.p287a.p318m.AbstractC11335c
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo1405a(Object obj, boolean z) {
        m1418a((AbstractC11329a<T, C, E>) ((AbstractC11337e) obj), z);
    }

    /* renamed from: a */
    protected void m1419a(E e) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public void m1418a(E e, boolean z) {
        this.f36380a.lock();
        try {
            if (this.f36383d.remove(e)) {
                AbstractC11341i m1412c = m1412c(e.m1390h());
                m1412c.m1372a(e, z);
                if (!z || this.f36387h) {
                    e.mo1392f();
                } else {
                    this.f36384e.addFirst(e);
                    m1414b((AbstractC11329a<T, C, E>) e);
                }
                AbstractFutureC11339g<E> m1362g = m1412c.m1362g();
                if (m1362g != null) {
                    this.f36385f.remove(m1362g);
                } else {
                    m1362g = this.f36385f.poll();
                }
                if (m1362g != null) {
                    m1362g.m1382a();
                }
            }
        } finally {
            this.f36380a.unlock();
        }
    }

    /* renamed from: a */
    protected void m1417a(AbstractC11338f<T, C> abstractC11338f) {
        this.f36380a.lock();
        try {
            Iterator<E> it2 = this.f36384e.iterator();
            while (it2.hasNext()) {
                E next = it2.next();
                abstractC11338f.mo1383a(next);
                if (next.mo1393e()) {
                    m1412c(next.m1390h()).m1373a((AbstractC11341i<T, C, E>) next);
                    it2.remove();
                }
            }
            m1409g();
        } finally {
            this.f36380a.unlock();
        }
    }

    /* renamed from: a */
    public boolean m1424a() {
        return this.f36387h;
    }

    @Override // org.p286a.p287a.p318m.AbstractC11336d
    /* renamed from: b */
    public int mo1400b(T t) {
        C11354a.m1321a(t, "Route");
        this.f36380a.lock();
        try {
            return m1411d(t);
        } finally {
            this.f36380a.unlock();
        }
    }

    /* renamed from: b */
    public Future<E> m1415b(T t, Object obj) {
        return mo1406a(t, obj, null);
    }

    /* renamed from: b */
    public void m1416b() {
        if (this.f36387h) {
            return;
        }
        this.f36387h = true;
        this.f36380a.lock();
        try {
            Iterator<E> it2 = this.f36384e.iterator();
            while (it2.hasNext()) {
                it2.next().mo1392f();
            }
            for (E e : this.f36383d) {
                e.mo1392f();
            }
            for (AbstractC11341i<T, C, E> abstractC11341i : this.f36382c.values()) {
                abstractC11341i.m1361h();
            }
            this.f36382c.clear();
            this.f36383d.clear();
            this.f36384e.clear();
        } finally {
            this.f36380a.unlock();
        }
    }

    @Override // org.p286a.p287a.p318m.AbstractC11336d
    /* renamed from: b */
    public void mo1401b(int i) {
        C11354a.m1317b(i, "Max per route value");
        this.f36380a.lock();
        try {
            this.f36388i = i;
        } finally {
            this.f36380a.unlock();
        }
    }

    /* renamed from: b */
    protected void m1414b(E e) {
    }

    /* renamed from: b */
    protected void m1413b(AbstractC11338f<T, C> abstractC11338f) {
        this.f36380a.lock();
        try {
            for (E e : this.f36383d) {
                abstractC11338f.mo1383a(e);
            }
        } finally {
            this.f36380a.unlock();
        }
    }

    @Override // org.p286a.p287a.p318m.AbstractC11336d
    /* renamed from: c */
    public int mo1399c() {
        this.f36380a.lock();
        try {
            return this.f36389j;
        } finally {
            this.f36380a.unlock();
        }
    }

    @Override // org.p286a.p287a.p318m.AbstractC11336d
    /* renamed from: d */
    public int mo1398d() {
        this.f36380a.lock();
        try {
            return this.f36388i;
        } finally {
            this.f36380a.unlock();
        }
    }

    @Override // org.p286a.p287a.p318m.AbstractC11336d
    /* renamed from: e */
    public C11340h mo1397e() {
        this.f36380a.lock();
        try {
            return new C11340h(this.f36383d.size(), this.f36385f.size(), this.f36384e.size(), this.f36389j);
        } finally {
            this.f36380a.unlock();
        }
    }

    /* renamed from: f */
    public void m1410f() {
        final long currentTimeMillis = System.currentTimeMillis();
        m1417a((AbstractC11338f) new AbstractC11338f<T, C>() { // from class: org.a.a.m.a.4
            @Override // org.p286a.p287a.p318m.AbstractC11338f
            /* renamed from: a */
            public void mo1383a(AbstractC11337e<T, C> abstractC11337e) {
                if (abstractC11337e.mo1396a(currentTimeMillis)) {
                    abstractC11337e.mo1392f();
                }
            }
        });
    }

    public String toString() {
        return "[leased: " + this.f36383d + "][available: " + this.f36384e + "][pending: " + this.f36385f + "]";
    }
}
