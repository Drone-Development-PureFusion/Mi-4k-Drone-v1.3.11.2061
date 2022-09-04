package com.p120c.p121a.p129b.p130a.p131a;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractQueue;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import org.p286a.p287a.p299f.p302c.C11125l;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: com.c.a.b.a.a.d */
/* loaded from: classes.dex */
public class C1290d<E> extends AbstractQueue<E> implements AbstractBlockingQueueC1287a<E>, Serializable {
    private static final long serialVersionUID = -387911632671998426L;

    /* renamed from: a */
    transient C1295d<E> f3228a;

    /* renamed from: b */
    transient C1295d<E> f3229b;

    /* renamed from: c */
    final ReentrantLock f3230c;

    /* renamed from: d */
    private transient int f3231d;

    /* renamed from: e */
    private final int f3232e;

    /* renamed from: f */
    private final Condition f3233f;

    /* renamed from: g */
    private final Condition f3234g;

    /* renamed from: com.c.a.b.a.a.d$a */
    /* loaded from: classes.dex */
    private abstract class AbstractC1292a implements Iterator<E> {

        /* renamed from: a */
        C1295d<E> f3235a;

        /* renamed from: b */
        E f3236b;

        /* renamed from: d */
        private C1295d<E> f3238d;

        AbstractC1292a() {
            ReentrantLock reentrantLock = C1290d.this.f3230c;
            reentrantLock.lock();
            try {
                this.f3235a = mo35915a();
                this.f3236b = this.f3235a == null ? null : this.f3235a.f3241a;
            } finally {
                reentrantLock.unlock();
            }
        }

        /* renamed from: b */
        private C1295d<E> m35916b(C1295d<E> c1295d) {
            while (true) {
                C1295d<E> mo35914a = mo35914a(c1295d);
                if (mo35914a == null) {
                    return null;
                }
                if (mo35914a.f3241a != null) {
                    return mo35914a;
                }
                if (mo35914a == c1295d) {
                    return mo35915a();
                }
                c1295d = mo35914a;
            }
        }

        /* renamed from: a */
        abstract C1295d<E> mo35915a();

        /* renamed from: a */
        abstract C1295d<E> mo35914a(C1295d<E> c1295d);

        /* renamed from: b */
        void m35917b() {
            ReentrantLock reentrantLock = C1290d.this.f3230c;
            reentrantLock.lock();
            try {
                this.f3235a = m35916b(this.f3235a);
                this.f3236b = this.f3235a == null ? null : this.f3235a.f3241a;
            } finally {
                reentrantLock.unlock();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f3235a != null;
        }

        @Override // java.util.Iterator
        public E next() {
            if (this.f3235a == null) {
                throw new NoSuchElementException();
            }
            this.f3238d = this.f3235a;
            E e = this.f3236b;
            m35917b();
            return e;
        }

        @Override // java.util.Iterator
        public void remove() {
            C1295d<E> c1295d = this.f3238d;
            if (c1295d == null) {
                throw new IllegalStateException();
            }
            this.f3238d = null;
            ReentrantLock reentrantLock = C1290d.this.f3230c;
            reentrantLock.lock();
            try {
                if (c1295d.f3241a != null) {
                    C1290d.this.m35945a((C1295d) c1295d);
                }
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    /* renamed from: com.c.a.b.a.a.d$b */
    /* loaded from: classes.dex */
    private class C1293b extends C1290d<E>.AbstractC1292a {
        private C1293b() {
            super();
        }

        @Override // com.p120c.p121a.p129b.p130a.p131a.C1290d.AbstractC1292a
        /* renamed from: a */
        C1295d<E> mo35915a() {
            return C1290d.this.f3229b;
        }

        @Override // com.p120c.p121a.p129b.p130a.p131a.C1290d.AbstractC1292a
        /* renamed from: a */
        C1295d<E> mo35914a(C1295d<E> c1295d) {
            return c1295d.f3242b;
        }
    }

    /* renamed from: com.c.a.b.a.a.d$c */
    /* loaded from: classes.dex */
    private class C1294c extends C1290d<E>.AbstractC1292a {
        private C1294c() {
            super();
        }

        @Override // com.p120c.p121a.p129b.p130a.p131a.C1290d.AbstractC1292a
        /* renamed from: a */
        C1295d<E> mo35915a() {
            return C1290d.this.f3228a;
        }

        @Override // com.p120c.p121a.p129b.p130a.p131a.C1290d.AbstractC1292a
        /* renamed from: a */
        C1295d<E> mo35914a(C1295d<E> c1295d) {
            return c1295d.f3243c;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.c.a.b.a.a.d$d */
    /* loaded from: classes.dex */
    public static final class C1295d<E> {

        /* renamed from: a */
        E f3241a;

        /* renamed from: b */
        C1295d<E> f3242b;

        /* renamed from: c */
        C1295d<E> f3243c;

        C1295d(E e) {
            this.f3241a = e;
        }
    }

    public C1290d() {
        this(Integer.MAX_VALUE);
    }

    public C1290d(int i) {
        this.f3230c = new ReentrantLock();
        this.f3233f = this.f3230c.newCondition();
        this.f3234g = this.f3230c.newCondition();
        if (i <= 0) {
            throw new IllegalArgumentException();
        }
        this.f3232e = i;
    }

    public C1290d(Collection<? extends E> collection) {
        this(Integer.MAX_VALUE);
        ReentrantLock reentrantLock = this.f3230c;
        reentrantLock.lock();
        try {
            for (E e : collection) {
                if (e == null) {
                    throw new NullPointerException();
                }
                if (!m35936c((C1295d) new C1295d<>(e))) {
                    throw new IllegalStateException("Deque full");
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: b */
    private boolean m35940b(C1295d<E> c1295d) {
        if (this.f3231d >= this.f3232e) {
            return false;
        }
        C1295d<E> c1295d2 = this.f3228a;
        c1295d.f3243c = c1295d2;
        this.f3228a = c1295d;
        if (this.f3229b == null) {
            this.f3229b = c1295d;
        } else {
            c1295d2.f3242b = c1295d;
        }
        this.f3231d++;
        this.f3233f.signal();
        return true;
    }

    /* renamed from: c */
    private boolean m35936c(C1295d<E> c1295d) {
        if (this.f3231d >= this.f3232e) {
            return false;
        }
        C1295d<E> c1295d2 = this.f3229b;
        c1295d.f3242b = c1295d2;
        this.f3229b = c1295d;
        if (this.f3228a == null) {
            this.f3228a = c1295d;
        } else {
            c1295d2.f3243c = c1295d;
        }
        this.f3231d++;
        this.f3233f.signal();
        return true;
    }

    /* renamed from: m */
    private E m35919m() {
        C1295d<E> c1295d = this.f3228a;
        if (c1295d == null) {
            return null;
        }
        C1295d<E> c1295d2 = c1295d.f3243c;
        E e = c1295d.f3241a;
        c1295d.f3241a = null;
        c1295d.f3243c = c1295d;
        this.f3228a = c1295d2;
        if (c1295d2 == null) {
            this.f3229b = null;
        } else {
            c1295d2.f3242b = null;
        }
        this.f3231d--;
        this.f3234g.signal();
        return e;
    }

    /* renamed from: n */
    private E m35918n() {
        C1295d<E> c1295d = this.f3229b;
        if (c1295d == null) {
            return null;
        }
        C1295d<E> c1295d2 = c1295d.f3242b;
        E e = c1295d.f3241a;
        c1295d.f3241a = null;
        c1295d.f3242b = c1295d;
        this.f3229b = c1295d2;
        if (c1295d2 == null) {
            this.f3228a = null;
        } else {
            c1295d2.f3243c = null;
        }
        this.f3231d--;
        this.f3234g.signal();
        return e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.f3231d = 0;
        this.f3228a = null;
        this.f3229b = null;
        while (true) {
            Object readObject = objectInputStream.readObject();
            if (readObject == null) {
                return;
            }
            add(readObject);
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        ReentrantLock reentrantLock = this.f3230c;
        reentrantLock.lock();
        try {
            objectOutputStream.defaultWriteObject();
            for (C1295d<E> c1295d = this.f3228a; c1295d != null; c1295d = c1295d.f3243c) {
                objectOutputStream.writeObject(c1295d.f3241a);
            }
            objectOutputStream.writeObject(null);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // com.p120c.p121a.p129b.p130a.p131a.AbstractBlockingQueueC1287a
    /* renamed from: a */
    public E mo35947a() {
        ReentrantLock reentrantLock = this.f3230c;
        reentrantLock.lock();
        while (true) {
            try {
                E m35919m = m35919m();
                if (m35919m != null) {
                    return m35919m;
                }
                this.f3233f.await();
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    @Override // com.p120c.p121a.p129b.p130a.p131a.AbstractBlockingQueueC1287a
    /* renamed from: a */
    public E mo35946a(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        ReentrantLock reentrantLock = this.f3230c;
        reentrantLock.lockInterruptibly();
        while (true) {
            try {
                long j2 = nanos;
                E m35919m = m35919m();
                if (m35919m != null) {
                    return m35919m;
                }
                if (j2 <= 0) {
                    return null;
                }
                nanos = this.f3233f.awaitNanos(j2);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    /* renamed from: a */
    void m35945a(C1295d<E> c1295d) {
        C1295d<E> c1295d2 = c1295d.f3242b;
        C1295d<E> c1295d3 = c1295d.f3243c;
        if (c1295d2 == null) {
            m35919m();
        } else if (c1295d3 == null) {
            m35918n();
        } else {
            c1295d2.f3243c = c1295d3;
            c1295d3.f3242b = c1295d2;
            c1295d.f3241a = null;
            this.f3231d--;
            this.f3234g.signal();
        }
    }

    @Override // com.p120c.p121a.p129b.p130a.p131a.AbstractBlockingQueueC1287a, com.p120c.p121a.p129b.p130a.p131a.AbstractC1288b
    /* renamed from: a */
    public void mo35944a(E e) {
        if (!mo35935c((C1290d<E>) e)) {
            throw new IllegalStateException("Deque full");
        }
    }

    @Override // com.p120c.p121a.p129b.p130a.p131a.AbstractBlockingQueueC1287a
    /* renamed from: a */
    public boolean mo35943a(E e, long j, TimeUnit timeUnit) {
        if (e == null) {
            throw new NullPointerException();
        }
        C1295d<E> c1295d = new C1295d<>(e);
        long nanos = timeUnit.toNanos(j);
        ReentrantLock reentrantLock = this.f3230c;
        reentrantLock.lockInterruptibly();
        while (!m35940b((C1295d) c1295d)) {
            try {
                if (nanos <= 0) {
                    return false;
                }
                nanos = this.f3234g.awaitNanos(nanos);
            } finally {
                reentrantLock.unlock();
            }
        }
        return true;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue, com.p120c.p121a.p129b.p130a.p131a.AbstractBlockingQueueC1287a, com.p120c.p121a.p129b.p130a.p131a.AbstractC1288b, java.util.concurrent.BlockingQueue
    public boolean add(E e) {
        mo35939b((C1290d<E>) e);
        return true;
    }

    @Override // com.p120c.p121a.p129b.p130a.p131a.AbstractBlockingQueueC1287a
    /* renamed from: b */
    public E mo35942b() {
        ReentrantLock reentrantLock = this.f3230c;
        reentrantLock.lock();
        while (true) {
            try {
                E m35918n = m35918n();
                if (m35918n != null) {
                    return m35918n;
                }
                this.f3233f.await();
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    @Override // com.p120c.p121a.p129b.p130a.p131a.AbstractBlockingQueueC1287a
    /* renamed from: b */
    public E mo35941b(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        ReentrantLock reentrantLock = this.f3230c;
        reentrantLock.lockInterruptibly();
        while (true) {
            try {
                long j2 = nanos;
                E m35918n = m35918n();
                if (m35918n != null) {
                    return m35918n;
                }
                if (j2 <= 0) {
                    return null;
                }
                nanos = this.f3233f.awaitNanos(j2);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    @Override // com.p120c.p121a.p129b.p130a.p131a.AbstractBlockingQueueC1287a, com.p120c.p121a.p129b.p130a.p131a.AbstractC1288b
    /* renamed from: b */
    public void mo35939b(E e) {
        if (!mo35933d(e)) {
            throw new IllegalStateException("Deque full");
        }
    }

    @Override // com.p120c.p121a.p129b.p130a.p131a.AbstractBlockingQueueC1287a
    /* renamed from: b */
    public boolean mo35938b(E e, long j, TimeUnit timeUnit) {
        if (e == null) {
            throw new NullPointerException();
        }
        C1295d<E> c1295d = new C1295d<>(e);
        long nanos = timeUnit.toNanos(j);
        ReentrantLock reentrantLock = this.f3230c;
        reentrantLock.lockInterruptibly();
        while (!m35936c((C1295d) c1295d)) {
            try {
                if (nanos <= 0) {
                    return false;
                }
                nanos = this.f3234g.awaitNanos(nanos);
            } finally {
                reentrantLock.unlock();
            }
        }
        return true;
    }

    @Override // com.p120c.p121a.p129b.p130a.p131a.AbstractC1288b
    /* renamed from: c */
    public E mo35937c() {
        E mo35932e = mo35932e();
        if (mo35932e == null) {
            throw new NoSuchElementException();
        }
        return mo35932e;
    }

    @Override // com.p120c.p121a.p129b.p130a.p131a.AbstractBlockingQueueC1287a, com.p120c.p121a.p129b.p130a.p131a.AbstractC1288b
    /* renamed from: c */
    public boolean mo35935c(E e) {
        if (e == null) {
            throw new NullPointerException();
        }
        C1295d<E> c1295d = new C1295d<>(e);
        ReentrantLock reentrantLock = this.f3230c;
        reentrantLock.lock();
        try {
            return m35940b((C1295d) c1295d);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        ReentrantLock reentrantLock = this.f3230c;
        reentrantLock.lock();
        try {
            C1295d<E> c1295d = this.f3228a;
            while (c1295d != null) {
                c1295d.f3241a = null;
                C1295d<E> c1295d2 = c1295d.f3243c;
                c1295d.f3242b = null;
                c1295d.f3243c = null;
                c1295d = c1295d2;
            }
            this.f3229b = null;
            this.f3228a = null;
            this.f3231d = 0;
            this.f3234g.signalAll();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.p120c.p121a.p129b.p130a.p131a.AbstractBlockingQueueC1287a, com.p120c.p121a.p129b.p130a.p131a.AbstractC1288b, java.util.concurrent.BlockingQueue
    public boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        ReentrantLock reentrantLock = this.f3230c;
        reentrantLock.lock();
        try {
            for (C1295d<E> c1295d = this.f3228a; c1295d != null; c1295d = c1295d.f3243c) {
                if (obj.equals(c1295d.f3241a)) {
                    return true;
                }
            }
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // com.p120c.p121a.p129b.p130a.p131a.AbstractC1288b
    /* renamed from: d */
    public E mo35934d() {
        E mo35930f = mo35930f();
        if (mo35930f == null) {
            throw new NoSuchElementException();
        }
        return mo35930f;
    }

    @Override // com.p120c.p121a.p129b.p130a.p131a.AbstractBlockingQueueC1287a, com.p120c.p121a.p129b.p130a.p131a.AbstractC1288b
    /* renamed from: d */
    public boolean mo35933d(E e) {
        if (e == null) {
            throw new NullPointerException();
        }
        C1295d<E> c1295d = new C1295d<>(e);
        ReentrantLock reentrantLock = this.f3230c;
        reentrantLock.lock();
        try {
            return m35936c((C1295d) c1295d);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(Collection<? super E> collection) {
        return drainTo(collection, Integer.MAX_VALUE);
    }

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(Collection<? super E> collection, int i) {
        if (collection == null) {
            throw new NullPointerException();
        }
        if (collection == this) {
            throw new IllegalArgumentException();
        }
        ReentrantLock reentrantLock = this.f3230c;
        reentrantLock.lock();
        try {
            int min = Math.min(i, this.f3231d);
            for (int i2 = 0; i2 < min; i2++) {
                collection.add((E) this.f3228a.f3241a);
                m35919m();
            }
            return min;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // com.p120c.p121a.p129b.p130a.p131a.AbstractC1288b
    /* renamed from: e */
    public E mo35932e() {
        ReentrantLock reentrantLock = this.f3230c;
        reentrantLock.lock();
        try {
            return m35919m();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // com.p120c.p121a.p129b.p130a.p131a.AbstractBlockingQueueC1287a
    /* renamed from: e */
    public void mo35931e(E e) {
        if (e == null) {
            throw new NullPointerException();
        }
        C1295d<E> c1295d = new C1295d<>(e);
        ReentrantLock reentrantLock = this.f3230c;
        reentrantLock.lock();
        while (!m35940b((C1295d) c1295d)) {
            try {
                this.f3234g.await();
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    @Override // java.util.AbstractQueue, java.util.Queue, com.p120c.p121a.p129b.p130a.p131a.AbstractBlockingQueueC1287a, com.p120c.p121a.p129b.p130a.p131a.AbstractC1288b
    public E element() {
        return mo35928g();
    }

    @Override // com.p120c.p121a.p129b.p130a.p131a.AbstractC1288b
    /* renamed from: f */
    public E mo35930f() {
        ReentrantLock reentrantLock = this.f3230c;
        reentrantLock.lock();
        try {
            return m35918n();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // com.p120c.p121a.p129b.p130a.p131a.AbstractBlockingQueueC1287a
    /* renamed from: f */
    public void mo35929f(E e) {
        if (e == null) {
            throw new NullPointerException();
        }
        C1295d<E> c1295d = new C1295d<>(e);
        ReentrantLock reentrantLock = this.f3230c;
        reentrantLock.lock();
        while (!m35936c((C1295d) c1295d)) {
            try {
                this.f3234g.await();
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    @Override // com.p120c.p121a.p129b.p130a.p131a.AbstractC1288b
    /* renamed from: g */
    public E mo35928g() {
        E mo35924i = mo35924i();
        if (mo35924i == null) {
            throw new NoSuchElementException();
        }
        return mo35924i;
    }

    @Override // com.p120c.p121a.p129b.p130a.p131a.AbstractBlockingQueueC1287a, com.p120c.p121a.p129b.p130a.p131a.AbstractC1288b
    /* renamed from: g */
    public boolean mo35927g(Object obj) {
        if (obj == null) {
            return false;
        }
        ReentrantLock reentrantLock = this.f3230c;
        reentrantLock.lock();
        try {
            for (C1295d<E> c1295d = this.f3228a; c1295d != null; c1295d = c1295d.f3243c) {
                if (obj.equals(c1295d.f3241a)) {
                    m35945a((C1295d) c1295d);
                    return true;
                }
            }
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // com.p120c.p121a.p129b.p130a.p131a.AbstractC1288b
    /* renamed from: h */
    public E mo35926h() {
        E mo35922j = mo35922j();
        if (mo35922j == null) {
            throw new NoSuchElementException();
        }
        return mo35922j;
    }

    @Override // com.p120c.p121a.p129b.p130a.p131a.AbstractBlockingQueueC1287a, com.p120c.p121a.p129b.p130a.p131a.AbstractC1288b
    /* renamed from: h */
    public boolean mo35925h(Object obj) {
        if (obj == null) {
            return false;
        }
        ReentrantLock reentrantLock = this.f3230c;
        reentrantLock.lock();
        try {
            for (C1295d<E> c1295d = this.f3229b; c1295d != null; c1295d = c1295d.f3242b) {
                if (obj.equals(c1295d.f3241a)) {
                    m35945a((C1295d) c1295d);
                    return true;
                }
            }
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // com.p120c.p121a.p129b.p130a.p131a.AbstractC1288b
    /* renamed from: i */
    public E mo35924i() {
        ReentrantLock reentrantLock = this.f3230c;
        reentrantLock.lock();
        try {
            return this.f3228a == null ? null : this.f3228a.f3241a;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // com.p120c.p121a.p129b.p130a.p131a.AbstractBlockingQueueC1287a, com.p120c.p121a.p129b.p130a.p131a.AbstractC1288b
    /* renamed from: i */
    public void mo35923i(E e) {
        mo35944a((C1290d<E>) e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.p120c.p121a.p129b.p130a.p131a.AbstractBlockingQueueC1287a, com.p120c.p121a.p129b.p130a.p131a.AbstractC1288b
    public Iterator<E> iterator() {
        return new C1294c();
    }

    @Override // com.p120c.p121a.p129b.p130a.p131a.AbstractC1288b
    /* renamed from: j */
    public E mo35922j() {
        ReentrantLock reentrantLock = this.f3230c;
        reentrantLock.lock();
        try {
            return this.f3229b == null ? null : this.f3229b.f3241a;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // com.p120c.p121a.p129b.p130a.p131a.AbstractC1288b
    /* renamed from: k */
    public E mo35921k() {
        return mo35937c();
    }

    @Override // com.p120c.p121a.p129b.p130a.p131a.AbstractC1288b
    /* renamed from: l */
    public Iterator<E> mo35920l() {
        return new C1293b();
    }

    public boolean offer(E e) {
        return mo35933d(e);
    }

    @Override // com.p120c.p121a.p129b.p130a.p131a.AbstractBlockingQueueC1287a, java.util.concurrent.BlockingQueue
    public boolean offer(E e, long j, TimeUnit timeUnit) {
        return mo35938b(e, j, timeUnit);
    }

    @Override // java.util.Queue, com.p120c.p121a.p129b.p130a.p131a.AbstractBlockingQueueC1287a, com.p120c.p121a.p129b.p130a.p131a.AbstractC1288b
    public E peek() {
        return mo35924i();
    }

    @Override // java.util.Queue, com.p120c.p121a.p129b.p130a.p131a.AbstractBlockingQueueC1287a, com.p120c.p121a.p129b.p130a.p131a.AbstractC1288b
    public E poll() {
        return mo35932e();
    }

    @Override // com.p120c.p121a.p129b.p130a.p131a.AbstractBlockingQueueC1287a, java.util.concurrent.BlockingQueue
    public E poll(long j, TimeUnit timeUnit) {
        return mo35946a(j, timeUnit);
    }

    @Override // com.p120c.p121a.p129b.p130a.p131a.AbstractBlockingQueueC1287a, java.util.concurrent.BlockingQueue
    public void put(E e) {
        mo35929f(e);
    }

    @Override // java.util.concurrent.BlockingQueue
    public int remainingCapacity() {
        ReentrantLock reentrantLock = this.f3230c;
        reentrantLock.lock();
        try {
            return this.f3232e - this.f3231d;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.util.AbstractQueue, java.util.Queue, com.p120c.p121a.p129b.p130a.p131a.AbstractBlockingQueueC1287a, com.p120c.p121a.p129b.p130a.p131a.AbstractC1288b
    public E remove() {
        return mo35937c();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.p120c.p121a.p129b.p130a.p131a.AbstractBlockingQueueC1287a, com.p120c.p121a.p129b.p130a.p131a.AbstractC1288b, java.util.concurrent.BlockingQueue
    public boolean remove(Object obj) {
        return mo35927g(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.p120c.p121a.p129b.p130a.p131a.AbstractBlockingQueueC1287a, com.p120c.p121a.p129b.p130a.p131a.AbstractC1288b
    public int size() {
        ReentrantLock reentrantLock = this.f3230c;
        reentrantLock.lock();
        try {
            return this.f3231d;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // com.p120c.p121a.p129b.p130a.p131a.AbstractBlockingQueueC1287a, java.util.concurrent.BlockingQueue
    public E take() {
        return mo35947a();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public Object[] toArray() {
        ReentrantLock reentrantLock = this.f3230c;
        reentrantLock.lock();
        try {
            Object[] objArr = new Object[this.f3231d];
            int i = 0;
            C1295d<E> c1295d = this.f3228a;
            while (c1295d != null) {
                int i2 = i + 1;
                objArr[i] = c1295d.f3241a;
                c1295d = c1295d.f3243c;
                i = i2;
            }
            return objArr;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v6 */
    @Override // java.util.AbstractCollection, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        ReentrantLock reentrantLock = this.f3230c;
        reentrantLock.lock();
        try {
            if (tArr.length < this.f3231d) {
                tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f3231d);
            }
            int i = 0;
            C1295d<E> c1295d = this.f3228a;
            while (c1295d != null) {
                tArr[i] = c1295d.f3241a;
                c1295d = c1295d.f3243c;
                i++;
            }
            if (tArr.length > i) {
                tArr[i] = null;
            }
            return tArr;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        String sb;
        ReentrantLock reentrantLock = this.f3230c;
        reentrantLock.lock();
        try {
            C1295d<E> c1295d = this.f3228a;
            if (c1295d == null) {
                sb = "[]";
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append('[');
                while (true) {
                    C1295d<E> c1295d2 = c1295d;
                    Object obj = c1295d2.f3241a;
                    if (obj == this) {
                        obj = "(this Collection)";
                    }
                    sb2.append(obj);
                    c1295d = c1295d2.f3243c;
                    if (c1295d == null) {
                        break;
                    }
                    sb2.append(C0494h.f736x).append(C11125l.f35805c);
                }
                sb = sb2.append(']').toString();
            }
            return sb;
        } finally {
            reentrantLock.unlock();
        }
    }
}
