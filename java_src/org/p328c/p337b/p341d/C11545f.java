package org.p328c.p337b.p341d;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.p328c.p347e.AbstractC11637l;
import org.p328c.p347e.C11622c;
import org.p328c.p347e.p348a.AbstractC11598a;
import org.p328c.p347e.p348a.AbstractC11602b;
import org.p328c.p347e.p348a.AbstractC11604d;
import org.p328c.p347e.p348a.C11603c;
import org.p328c.p347e.p348a.C11605e;
import org.p328c.p347e.p349b.C11608a;
import org.p328c.p347e.p349b.C11611c;
@Deprecated
/* renamed from: org.c.b.d.f */
/* loaded from: classes.dex */
public class C11545f extends AbstractC11637l implements AbstractC11602b, AbstractC11604d {

    /* renamed from: a */
    private final List<Method> f36663a = m829a();

    /* renamed from: b */
    private C11554j f36664b;

    public C11545f(Class<?> cls) {
        this.f36664b = new C11554j(cls);
        m825b();
    }

    /* renamed from: a */
    private void m826a(C11611c c11611c, C11622c c11622c, Throwable th) {
        c11611c.m560b(c11622c);
        c11611c.m568a(new C11608a(c11622c, th));
        c11611c.m556d(c11622c);
    }

    /* renamed from: a */
    protected List<Method> m829a() {
        return this.f36664b.m800a();
    }

    /* renamed from: a */
    protected C11555k m828a(Method method) {
        return new C11555k(method, this.f36664b);
    }

    /* renamed from: a */
    protected void m827a(Method method, C11611c c11611c) {
        C11622c m821c = m821c(method);
        try {
            new C11548g(m818f(), m828a(method), c11611c, m821c).m815a();
        } catch (InvocationTargetException e) {
            m826a(c11611c, m821c, e.getCause());
        } catch (Exception e2) {
            m826a(c11611c, m821c, e2);
        }
    }

    @Override // org.p328c.p347e.p348a.AbstractC11602b
    /* renamed from: a */
    public void mo344a(AbstractC11598a abstractC11598a) {
        Iterator<Method> it2 = this.f36663a.iterator();
        while (it2.hasNext()) {
            if (!abstractC11598a.mo579a(m821c(it2.next()))) {
                it2.remove();
            }
        }
        if (this.f36663a.isEmpty()) {
            throw new C11603c();
        }
    }

    @Override // org.p328c.p347e.p348a.AbstractC11604d
    /* renamed from: a */
    public void mo342a(final C11605e c11605e) {
        Collections.sort(this.f36663a, new Comparator<Method>() { // from class: org.c.b.d.f.2
            @Override // java.util.Comparator
            /* renamed from: a */
            public int compare(Method method, Method method2) {
                return c11605e.compare(C11545f.this.m821c(method), C11545f.this.m821c(method2));
            }
        });
    }

    @Override // org.p328c.p347e.AbstractC11637l
    /* renamed from: a */
    public void mo341a(final C11611c c11611c) {
        new C11513a(c11611c, this.f36664b, mo327d(), new Runnable() { // from class: org.c.b.d.f.1
            @Override // java.lang.Runnable
            public void run() {
                C11545f.this.m823b(c11611c);
            }
        }).m891b();
    }

    /* renamed from: b */
    protected String m824b(Method method) {
        return method.getName();
    }

    /* renamed from: b */
    protected void m825b() {
        C11552h c11552h = new C11552h(this.f36664b);
        c11552h.m804c();
        c11552h.m803d();
    }

    /* renamed from: b */
    protected void m823b(C11611c c11611c) {
        for (Method method : this.f36663a) {
            m827a(method, c11611c);
        }
    }

    /* renamed from: c */
    protected C11622c m821c(Method method) {
        return C11622c.m548a(m817g().m791e(), m824b(method), m820d(method));
    }

    /* renamed from: c */
    protected Annotation[] m822c() {
        return this.f36664b.m791e().getAnnotations();
    }

    @Override // org.p328c.p347e.AbstractC11637l, org.p328c.p347e.AbstractC11607b
    /* renamed from: d */
    public C11622c mo327d() {
        C11622c m543a = C11622c.m543a(m819e(), m822c());
        for (Method method : this.f36663a) {
            m543a.m542a(m821c(method));
        }
        return m543a;
    }

    /* renamed from: d */
    protected Annotation[] m820d(Method method) {
        return method.getAnnotations();
    }

    /* renamed from: e */
    protected String m819e() {
        return m817g().m790f();
    }

    /* renamed from: f */
    protected Object m818f() {
        return m817g().m792d().newInstance(new Object[0]);
    }

    /* renamed from: g */
    protected C11554j m817g() {
        return this.f36664b;
    }
}
