package org.p328c.p350f;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import org.p328c.AbstractC11439a;
import org.p328c.AbstractC11638f;
import org.p328c.AbstractC11693k;
import org.p328c.AbstractC11694l;
import org.p328c.AbstractC11695m;
import org.p328c.p337b.p341d.p342a.AbstractC11516c;
import org.p328c.p337b.p341d.p343b.C11518a;
import org.p328c.p337b.p341d.p344c.C11532a;
import org.p328c.p337b.p341d.p344c.C11533b;
import org.p328c.p337b.p341d.p344c.C11534c;
import org.p328c.p337b.p341d.p344c.C11538d;
import org.p328c.p337b.p341d.p344c.C11539e;
import org.p328c.p337b.p341d.p344c.C11540f;
import org.p328c.p346d.AbstractC11576f;
import org.p328c.p346d.AbstractC11585l;
import org.p328c.p346d.C11578h;
import org.p328c.p347e.C11622c;
import org.p328c.p347e.p349b.C11611c;
import org.p328c.p350f.p351a.AbstractC11650j;
import org.p328c.p350f.p351a.C11643d;
/* renamed from: org.c.f.b */
/* loaded from: classes.dex */
public class C11656b extends AbstractC11668f<C11643d> {

    /* renamed from: a */
    private final ConcurrentHashMap<C11643d, C11622c> f36800a = new ConcurrentHashMap<>();

    public C11656b(Class<?> cls) {
        super(cls);
    }

    /* renamed from: a */
    private Class<? extends Throwable> m392a(AbstractC11695m abstractC11695m) {
        if (abstractC11695m == null || abstractC11695m.m279a() == AbstractC11695m.C11696a.class) {
            return null;
        }
        return abstractC11695m.m279a();
    }

    /* renamed from: a */
    private AbstractC11650j m395a(C11643d c11643d, List<AbstractC11585l> list, Object obj, AbstractC11650j abstractC11650j) {
        for (AbstractC11576f abstractC11576f : m381e(obj)) {
            if (!list.contains(abstractC11576f)) {
                abstractC11650j = abstractC11576f.mo603a(abstractC11650j, c11643d, obj);
            }
        }
        return abstractC11650j;
    }

    /* renamed from: a */
    private AbstractC11650j m394a(C11643d c11643d, List<AbstractC11585l> list, AbstractC11650j abstractC11650j) {
        return list.isEmpty() ? abstractC11650j : new C11578h(abstractC11650j, list, mo311d(c11643d));
    }

    /* renamed from: b */
    private boolean m388b(AbstractC11695m abstractC11695m) {
        return m392a(abstractC11695m) != null;
    }

    /* renamed from: c */
    private long m384c(AbstractC11695m abstractC11695m) {
        if (abstractC11695m == null) {
            return 0L;
        }
        return abstractC11695m.m278b();
    }

    /* renamed from: e */
    private List<AbstractC11576f> m381e(Object obj) {
        return m399a(obj);
    }

    /* renamed from: e */
    private AbstractC11650j m379e(C11643d c11643d, Object obj, AbstractC11650j abstractC11650j) {
        List<AbstractC11585l> m391b = m391b(obj);
        return m394a(c11643d, m391b, m395a(c11643d, m391b, obj, abstractC11650j));
    }

    /* renamed from: i */
    private void m376i(List<Throwable> list) {
        C11518a.f36632d.m875a(g(), list);
    }

    /* renamed from: j */
    private boolean m375j() {
        return g().m412d().getConstructors().length == 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public List<C11643d> mo400a() {
        return g().m417b(AbstractC11695m.class);
    }

    /* renamed from: a */
    protected List<AbstractC11576f> m399a(Object obj) {
        List<AbstractC11576f> m416b = g().m416b(obj, AbstractC11694l.class, AbstractC11576f.class);
        m416b.addAll(g().m423a(obj, AbstractC11694l.class, AbstractC11576f.class));
        return m416b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC11650j mo398a(C11643d c11643d) {
        try {
            Object a = new AbstractC11516c() { // from class: org.c.f.b.1
                @Override // org.p328c.p337b.p341d.p342a.AbstractC11516c
                /* renamed from: b */
                protected Object mo374b() {
                    return C11656b.this.mo373b();
                }
            }.a();
            return m379e(c11643d, a, m382d(c11643d, a, m385c(c11643d, a, m389b(c11643d, a, m396a(c11643d, a, mo397a(c11643d, a))))));
        } catch (Throwable th) {
            return new C11533b(th);
        }
    }

    /* renamed from: a */
    protected AbstractC11650j mo397a(C11643d c11643d, Object obj) {
        return new C11538d(c11643d, obj);
    }

    /* renamed from: a */
    protected AbstractC11650j m396a(C11643d c11643d, Object obj, AbstractC11650j abstractC11650j) {
        AbstractC11695m abstractC11695m = (AbstractC11695m) c11643d.mo424a((Class<Annotation>) AbstractC11695m.class);
        return m388b(abstractC11695m) ? new C11532a(abstractC11650j, m392a(abstractC11695m)) : abstractC11650j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.p328c.p350f.AbstractC11668f
    /* renamed from: a */
    public void mo345a(List<Throwable> list) {
        super.mo345a(list);
        m383d(list);
        mo372b(list);
        m377g(list);
        mo370h(list);
        m376i(list);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.p328c.p350f.AbstractC11668f
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void mo316a(C11643d c11643d, C11611c c11611c) {
        C11622c mo311d = mo311d(c11643d);
        if (mo331c(c11643d)) {
            c11611c.m558c(mo311d);
        } else {
            a(mo398a(c11643d), mo311d, c11611c);
        }
    }

    /* renamed from: b */
    protected Object mo373b() {
        return g().m408f().newInstance(new Object[0]);
    }

    /* renamed from: b */
    protected List<AbstractC11585l> m391b(Object obj) {
        List<AbstractC11585l> m416b = g().m416b(obj, AbstractC11694l.class, AbstractC11585l.class);
        m416b.addAll(g().m423a(obj, AbstractC11694l.class, AbstractC11585l.class));
        return m416b;
    }

    @Deprecated
    /* renamed from: b */
    protected AbstractC11650j m389b(C11643d c11643d, Object obj, AbstractC11650j abstractC11650j) {
        long m384c = m384c((AbstractC11695m) c11643d.mo424a((Class<Annotation>) AbstractC11695m.class));
        return m384c <= 0 ? abstractC11650j : C11534c.m855b().m851a(m384c, TimeUnit.MILLISECONDS).m849a(abstractC11650j);
    }

    /* renamed from: b */
    protected void mo372b(List<Throwable> list) {
        m380e(list);
        m378f(list);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.p328c.p350f.AbstractC11668f
    /* renamed from: b */
    public boolean mo331c(C11643d c11643d) {
        return c11643d.mo424a((Class<Annotation>) AbstractC11693k.class) != null;
    }

    @Override // org.p328c.p350f.AbstractC11668f
    /* renamed from: c */
    protected List<C11643d> mo312c() {
        return mo400a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.p328c.p350f.AbstractC11668f
    /* renamed from: c  reason: avoid collision after fix types in other method */
    public C11622c mo311d(C11643d c11643d) {
        C11622c c11622c = this.f36800a.get(c11643d);
        if (c11622c == null) {
            C11622c m548a = C11622c.m548a(g().m412d(), mo371d(c11643d), c11643d.mo425a());
            this.f36800a.putIfAbsent(c11643d, m548a);
            return m548a;
        }
        return c11622c;
    }

    /* renamed from: c */
    protected AbstractC11650j m385c(C11643d c11643d, Object obj, AbstractC11650j abstractC11650j) {
        List<C11643d> m417b = g().m417b(AbstractC11638f.class);
        return m417b.isEmpty() ? abstractC11650j : new C11540f(abstractC11650j, m417b, obj);
    }

    /* renamed from: c */
    protected void mo387c(List<Throwable> list) {
        a(AbstractC11695m.class, false, list);
    }

    /* renamed from: d  reason: avoid collision after fix types in other method */
    protected String mo371d(C11643d c11643d) {
        return c11643d.mo450b();
    }

    /* renamed from: d */
    protected AbstractC11650j m382d(C11643d c11643d, Object obj, AbstractC11650j abstractC11650j) {
        List<C11643d> m417b = g().m417b(AbstractC11439a.class);
        return m417b.isEmpty() ? abstractC11650j : new C11539e(abstractC11650j, m417b, obj);
    }

    /* renamed from: d */
    protected void m383d(List<Throwable> list) {
        if (g().m405h()) {
            list.add(new Exception("The inner class " + g().m410e() + " is not static."));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public void m380e(List<Throwable> list) {
        if (!m375j()) {
            list.add(new Exception("Test class should have exactly one public constructor"));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f */
    public void m378f(List<Throwable> list) {
        if (g().m405h() || !m375j() || g().m408f().getParameterTypes().length == 0) {
            return;
        }
        list.add(new Exception("Test class should have exactly one public zero-argument constructor"));
    }

    @Deprecated
    /* renamed from: g */
    protected void m377g(List<Throwable> list) {
        a(AbstractC11439a.class, false, list);
        a(AbstractC11638f.class, false, list);
        mo387c(list);
        if (mo400a().size() == 0) {
            list.add(new Exception("No runnable methods"));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public void mo370h(List<Throwable> list) {
        C11518a.f36630b.m875a(g(), list);
    }
}
