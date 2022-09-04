package org.p286a.p287a.p318m;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import org.p286a.p287a.p288a.AbstractC11009c;
import org.p286a.p287a.p318m.AbstractC11337e;
import org.p286a.p287a.p320o.C11354a;
import org.p286a.p287a.p320o.C11355b;
@AbstractC11009c
/* renamed from: org.a.a.m.i */
/* loaded from: classes2.dex */
abstract class AbstractC11341i<T, C, E extends AbstractC11337e<T, C>> {

    /* renamed from: a */
    private final T f36417a;

    /* renamed from: b */
    private final Set<E> f36418b = new HashSet();

    /* renamed from: c */
    private final LinkedList<E> f36419c = new LinkedList<>();

    /* renamed from: d */
    private final LinkedList<AbstractFutureC11339g<E>> f36420d = new LinkedList<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC11341i(T t) {
        this.f36417a = t;
    }

    /* renamed from: a */
    public final T m1375a() {
        return this.f36417a;
    }

    /* renamed from: a */
    protected abstract E mo1374a(C c);

    /* renamed from: a */
    public void m1372a(E e, boolean z) {
        C11354a.m1321a(e, "Pool entry");
        C11355b.m1311a(this.f36418b.remove(e), "Entry %s has not been leased from this pool", e);
        if (z) {
            this.f36419c.addFirst(e);
        }
    }

    /* renamed from: a */
    public void m1371a(AbstractFutureC11339g<E> abstractFutureC11339g) {
        if (abstractFutureC11339g == null) {
            return;
        }
        this.f36420d.add(abstractFutureC11339g);
    }

    /* renamed from: a */
    public boolean m1373a(E e) {
        C11354a.m1321a(e, "Pool entry");
        return this.f36419c.remove(e) || this.f36418b.remove(e);
    }

    /* renamed from: b */
    public int m1370b() {
        return this.f36418b.size();
    }

    /* renamed from: b */
    public E m1369b(Object obj) {
        if (!this.f36419c.isEmpty()) {
            if (obj != null) {
                Iterator<E> it2 = this.f36419c.iterator();
                while (it2.hasNext()) {
                    E next = it2.next();
                    if (obj.equals(next.m1386l())) {
                        it2.remove();
                        this.f36418b.add(next);
                        return next;
                    }
                }
            }
            Iterator<E> it3 = this.f36419c.iterator();
            while (it3.hasNext()) {
                E next2 = it3.next();
                if (next2.m1386l() == null) {
                    it3.remove();
                    this.f36418b.add(next2);
                    return next2;
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public void m1368b(AbstractFutureC11339g<E> abstractFutureC11339g) {
        if (abstractFutureC11339g == null) {
            return;
        }
        this.f36420d.remove(abstractFutureC11339g);
    }

    /* renamed from: c */
    public int m1367c() {
        return this.f36420d.size();
    }

    /* renamed from: c */
    public E m1366c(C c) {
        E mo1374a = mo1374a((AbstractC11341i<T, C, E>) c);
        this.f36418b.add(mo1374a);
        return mo1374a;
    }

    /* renamed from: d */
    public int m1365d() {
        return this.f36419c.size();
    }

    /* renamed from: e */
    public int m1364e() {
        return this.f36419c.size() + this.f36418b.size();
    }

    /* renamed from: f */
    public E m1363f() {
        if (!this.f36419c.isEmpty()) {
            return this.f36419c.getLast();
        }
        return null;
    }

    /* renamed from: g */
    public AbstractFutureC11339g<E> m1362g() {
        return this.f36420d.poll();
    }

    /* renamed from: h */
    public void m1361h() {
        Iterator<AbstractFutureC11339g<E>> it2 = this.f36420d.iterator();
        while (it2.hasNext()) {
            it2.next().cancel(true);
        }
        this.f36420d.clear();
        Iterator<E> it3 = this.f36419c.iterator();
        while (it3.hasNext()) {
            it3.next().mo1392f();
        }
        this.f36419c.clear();
        for (E e : this.f36418b) {
            e.mo1392f();
        }
        this.f36418b.clear();
    }

    public String toString() {
        return "[route: " + this.f36417a + "][leased: " + this.f36418b.size() + "][available: " + this.f36419c.size() + "][pending: " + this.f36420d.size() + "]";
    }
}
