package org.p286a.p287a.p319n;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.p286a.p287a.p288a.AbstractC11009c;
@AbstractC11009c
/* renamed from: org.a.a.n.b */
/* loaded from: classes2.dex */
final class C11343b<E> {

    /* renamed from: a */
    private final LinkedList<E> f36423a = new LinkedList<>();

    /* renamed from: b */
    private final Map<Class<?>, E> f36424b = new HashMap();

    /* renamed from: c */
    private void m1352c(E e) {
        E remove = this.f36424b.remove(e.getClass());
        if (remove != null) {
            this.f36423a.remove(remove);
        }
        this.f36424b.put(e.getClass(), e);
    }

    /* renamed from: a */
    public LinkedList<E> m1359a() {
        return new LinkedList<>(this.f36423a);
    }

    /* renamed from: a */
    public C11343b<E> m1358a(E e) {
        if (e != null) {
            m1352c(e);
            this.f36423a.addFirst(e);
        }
        return this;
    }

    /* renamed from: a */
    public C11343b<E> m1357a(Collection<E> collection) {
        if (collection != null) {
            for (E e : collection) {
                m1358a((C11343b<E>) e);
            }
        }
        return this;
    }

    /* renamed from: a */
    public C11343b<E> m1356a(E... eArr) {
        if (eArr != null) {
            for (E e : eArr) {
                m1358a((C11343b<E>) e);
            }
        }
        return this;
    }

    /* renamed from: b */
    public C11343b<E> m1355b(E e) {
        if (e != null) {
            m1352c(e);
            this.f36423a.addLast(e);
        }
        return this;
    }

    /* renamed from: b */
    public C11343b<E> m1354b(Collection<E> collection) {
        if (collection != null) {
            for (E e : collection) {
                m1355b((C11343b<E>) e);
            }
        }
        return this;
    }

    /* renamed from: b */
    public C11343b<E> m1353b(E... eArr) {
        if (eArr != null) {
            for (E e : eArr) {
                m1355b((C11343b<E>) e);
            }
        }
        return this;
    }
}
