package org.p328c.p350f;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.p328c.AbstractC11493b;
import org.p328c.AbstractC11675g;
import org.p328c.AbstractC11687h;
import org.p328c.p337b.C11503b;
import org.p328c.p337b.p341d.p342a.C11514a;
import org.p328c.p337b.p341d.p343b.C11518a;
import org.p328c.p337b.p341d.p344c.C11539e;
import org.p328c.p337b.p341d.p344c.C11540f;
import org.p328c.p346d.AbstractC11585l;
import org.p328c.p346d.C11578h;
import org.p328c.p347e.AbstractC11637l;
import org.p328c.p347e.C11622c;
import org.p328c.p347e.p348a.AbstractC11598a;
import org.p328c.p347e.p348a.AbstractC11602b;
import org.p328c.p347e.p348a.AbstractC11604d;
import org.p328c.p347e.p348a.C11603c;
import org.p328c.p347e.p348a.C11605e;
import org.p328c.p347e.p349b.C11611c;
import org.p328c.p347e.p349b.C11620d;
import org.p328c.p350f.p351a.AbstractC11649i;
import org.p328c.p350f.p351a.AbstractC11650j;
import org.p328c.p350f.p351a.C11643d;
import org.p328c.p350f.p351a.C11645e;
import org.p328c.p350f.p351a.C11651k;
import org.p328c.p353g.AbstractC11685e;
import org.p328c.p353g.C11678c;
import org.p328c.p353g.C11684d;
/* renamed from: org.c.f.f */
/* loaded from: classes.dex */
public abstract class AbstractC11668f<T> extends AbstractC11637l implements AbstractC11602b, AbstractC11604d {

    /* renamed from: a */
    private static final List<AbstractC11685e> f36815a = Arrays.asList(new C11678c(), new C11684d());

    /* renamed from: c */
    private final C11651k f36817c;

    /* renamed from: b */
    private final Object f36816b = new Object();

    /* renamed from: d */
    private volatile Collection<T> f36818d = null;

    /* renamed from: e */
    private volatile AbstractC11649i f36819e = new AbstractC11649i() { // from class: org.c.f.f.1
        @Override // org.p328c.p350f.p351a.AbstractC11649i
        /* renamed from: a */
        public void mo320a() {
        }

        @Override // org.p328c.p350f.p351a.AbstractC11649i
        /* renamed from: a */
        public void mo319a(Runnable runnable) {
            runnable.run();
        }
    };

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11668f(Class<?> cls) {
        this.f36817c = m347a(cls);
        m336b();
    }

    /* renamed from: a */
    private boolean m348a() {
        for (T t : m321j()) {
            if (!mo331c((AbstractC11668f<T>) t)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private boolean m343a(AbstractC11598a abstractC11598a, T t) {
        return abstractC11598a.mo579a(mo311d((AbstractC11668f<T>) t));
    }

    /* renamed from: b */
    private Comparator<? super T> m334b(final C11605e c11605e) {
        return (Comparator<T>) new Comparator<T>() { // from class: org.c.f.f.4
            @Override // java.util.Comparator
            public int compare(T t, T t2) {
                return c11605e.compare(AbstractC11668f.this.mo311d((AbstractC11668f) t), AbstractC11668f.this.mo311d((AbstractC11668f) t2));
            }
        };
    }

    /* renamed from: b */
    private void m336b() {
        ArrayList arrayList = new ArrayList();
        mo345a(arrayList);
        if (!arrayList.isEmpty()) {
            throw new C11645e(arrayList);
        }
    }

    /* renamed from: b */
    private void m335b(List<Throwable> list) {
        if (m323g().m412d() != null) {
            for (AbstractC11685e abstractC11685e : f36815a) {
                list.addAll(abstractC11685e.mo298a(m323g()));
            }
        }
    }

    /* renamed from: c */
    private AbstractC11650j m328c(AbstractC11650j abstractC11650j) {
        List<AbstractC11585l> m325e = m325e();
        return m325e.isEmpty() ? abstractC11650j : new C11578h(abstractC11650j, m325e, mo327d());
    }

    /* renamed from: c */
    private void m330c(List<Throwable> list) {
        C11518a.f36629a.m875a(m323g(), list);
        C11518a.f36631c.m875a(m323g(), list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public void m326d(final C11611c c11611c) {
        AbstractC11649i abstractC11649i = this.f36819e;
        try {
            for (final T t : m321j()) {
                abstractC11649i.mo319a(new Runnable() { // from class: org.c.f.f.3
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.lang.Runnable
                    public void run() {
                        AbstractC11668f.this.mo316a((AbstractC11668f) t, c11611c);
                    }
                });
            }
        } finally {
            abstractC11649i.mo320a();
        }
    }

    /* renamed from: j */
    private Collection<T> m321j() {
        if (this.f36818d == null) {
            synchronized (this.f36816b) {
                if (this.f36818d == null) {
                    this.f36818d = Collections.unmodifiableCollection(mo312c());
                }
            }
        }
        return this.f36818d;
    }

    /* renamed from: a */
    protected AbstractC11650j m339a(AbstractC11650j abstractC11650j) {
        List<C11643d> m417b = this.f36817c.m417b(AbstractC11675g.class);
        return m417b.isEmpty() ? abstractC11650j : new C11540f(abstractC11650j, m417b, null);
    }

    /* renamed from: a */
    protected C11651k m347a(Class<?> cls) {
        return new C11651k(cls);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m346a(Class<? extends Annotation> cls, boolean z, List<Throwable> list) {
        for (C11643d c11643d : m323g().m417b(cls)) {
            c11643d.m451a(z, list);
        }
    }

    /* renamed from: a */
    protected abstract void mo316a(T t, C11611c c11611c);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void mo345a(List<Throwable> list) {
        m346a(AbstractC11675g.class, true, list);
        m346a(AbstractC11493b.class, true, list);
        m330c(list);
        m335b(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.p328c.p347e.p348a.AbstractC11602b
    /* renamed from: a */
    public void mo344a(AbstractC11598a abstractC11598a) {
        synchronized (this.f36816b) {
            ArrayList arrayList = new ArrayList(m321j());
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                if (m343a(abstractC11598a, (AbstractC11598a) next)) {
                    try {
                        abstractC11598a.mo582a(next);
                    } catch (C11603c e) {
                        it2.remove();
                    }
                } else {
                    it2.remove();
                }
            }
            this.f36818d = Collections.unmodifiableCollection(arrayList);
            if (this.f36818d.isEmpty()) {
                throw new C11603c();
            }
        }
    }

    @Override // org.p328c.p347e.p348a.AbstractC11604d
    /* renamed from: a */
    public void mo342a(C11605e c11605e) {
        synchronized (this.f36816b) {
            for (T t : m321j()) {
                c11605e.m578a(t);
            }
            ArrayList arrayList = new ArrayList(m321j());
            Collections.sort(arrayList, m334b(c11605e));
            this.f36818d = Collections.unmodifiableCollection(arrayList);
        }
    }

    @Override // org.p328c.p347e.AbstractC11637l
    /* renamed from: a */
    public void mo341a(C11611c c11611c) {
        C11514a c11514a = new C11514a(c11611c, mo327d());
        try {
            mo333b(c11611c).mo318a();
        } catch (C11503b e) {
            c11514a.m886a(e);
        } catch (C11620d e2) {
            throw e2;
        } catch (Throwable th) {
            c11514a.m887a(th);
        }
    }

    /* renamed from: a */
    public void m340a(AbstractC11649i abstractC11649i) {
        this.f36819e = abstractC11649i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final void m338a(AbstractC11650j abstractC11650j, C11622c c11622c, C11611c c11611c) {
        C11514a c11514a = new C11514a(c11611c, c11622c);
        c11514a.m884b();
        try {
            try {
                abstractC11650j.mo318a();
                c11514a.m888a();
            } catch (C11503b e) {
                c11514a.m886a(e);
                c11514a.m888a();
            } catch (Throwable th) {
                c11514a.m887a(th);
                c11514a.m888a();
            }
        } catch (Throwable th2) {
            c11514a.m888a();
            throw th2;
        }
    }

    /* renamed from: b */
    protected AbstractC11650j mo333b(C11611c c11611c) {
        AbstractC11650j m329c = m329c(c11611c);
        return !m348a() ? m328c(m332b(m339a(m329c))) : m329c;
    }

    /* renamed from: b */
    protected AbstractC11650j m332b(AbstractC11650j abstractC11650j) {
        List<C11643d> m417b = this.f36817c.m417b(AbstractC11493b.class);
        return m417b.isEmpty() ? abstractC11650j : new C11539e(abstractC11650j, m417b, null);
    }

    /* renamed from: c */
    protected abstract List<T> mo312c();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public AbstractC11650j m329c(final C11611c c11611c) {
        return new AbstractC11650j() { // from class: org.c.f.f.2
            @Override // org.p328c.p350f.p351a.AbstractC11650j
            /* renamed from: a */
            public void mo318a() {
                AbstractC11668f.this.m326d(c11611c);
            }
        };
    }

    /* renamed from: c */
    protected boolean mo331c(T t) {
        return false;
    }

    @Override // org.p328c.p347e.AbstractC11637l, org.p328c.p347e.AbstractC11607b
    /* renamed from: d */
    public C11622c mo327d() {
        C11622c m543a = C11622c.m543a(mo324f(), mo322i());
        for (T t : m321j()) {
            m543a.m542a(mo311d((AbstractC11668f<T>) t));
        }
        return m543a;
    }

    /* renamed from: d */
    protected abstract C11622c mo311d(T t);

    /* renamed from: e */
    protected List<AbstractC11585l> m325e() {
        List<AbstractC11585l> m416b = this.f36817c.m416b(null, AbstractC11687h.class, AbstractC11585l.class);
        m416b.addAll(this.f36817c.m423a((Object) null, AbstractC11687h.class, AbstractC11585l.class));
        return m416b;
    }

    /* renamed from: f */
    protected String mo324f() {
        return this.f36817c.m410e();
    }

    /* renamed from: g */
    public final C11651k m323g() {
        return this.f36817c;
    }

    /* renamed from: i */
    protected Annotation[] mo322i() {
        return this.f36817c.mo425a();
    }
}
