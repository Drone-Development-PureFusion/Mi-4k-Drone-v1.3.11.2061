package org.p328c.p350f.p352b;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.List;
import org.p328c.p347e.p349b.C11611c;
import org.p328c.p350f.C11656b;
import org.p328c.p350f.C11664e;
import org.p328c.p350f.p351a.AbstractC11650j;
import org.p328c.p350f.p351a.C11641b;
import org.p328c.p350f.p351a.C11643d;
/* renamed from: org.c.f.b.a */
/* loaded from: classes.dex */
public class C11658a extends C11656b {

    /* renamed from: a */
    private final Object[] f36802a;

    /* renamed from: b */
    private final String f36803b;

    public C11658a(C11661d c11661d) {
        super(c11661d.m362b().m412d());
        this.f36802a = c11661d.m361c().toArray(new Object[c11661d.m361c().size()]);
        this.f36803b = c11661d.m364a();
    }

    /* renamed from: j */
    private Object m369j() {
        return g().m408f().newInstance(this.f36802a);
    }

    /* renamed from: k */
    private Object m368k() {
        List<C11641b> m367l = m367l();
        if (m367l.size() != this.f36802a.length) {
            throw new Exception("Wrong number of parameters and @Parameter fields. @Parameter fields counted: " + m367l.size() + ", available parameters: " + this.f36802a.length + ".");
        }
        Object newInstance = g().m412d().newInstance();
        for (C11641b c11641b : m367l) {
            Field m459d = c11641b.m459d();
            int m351a = ((C11664e.AbstractC11665a) m459d.getAnnotation(C11664e.AbstractC11665a.class)).m351a();
            try {
                m459d.set(newInstance, this.f36802a[m351a]);
            } catch (IllegalArgumentException e) {
                throw new Exception(g().m410e() + ": Trying to set " + m459d.getName() + " with the value " + this.f36802a[m351a] + " that is not the right type (" + this.f36802a[m351a].getClass().getSimpleName() + " instead of " + m459d.getType().getSimpleName() + ").", e);
            }
        }
        return newInstance;
    }

    /* renamed from: l */
    private List<C11641b> m367l() {
        return g().m413c(C11664e.AbstractC11665a.class);
    }

    /* renamed from: m */
    private boolean m366m() {
        return !m367l().isEmpty();
    }

    @Override // org.p328c.p350f.C11656b
    /* renamed from: b */
    public Object mo373b() {
        return m366m() ? m368k() : m369j();
    }

    @Override // org.p328c.p350f.AbstractC11668f
    /* renamed from: b */
    protected AbstractC11650j mo333b(C11611c c11611c) {
        return c(c11611c);
    }

    @Override // org.p328c.p350f.C11656b
    /* renamed from: b */
    protected void mo372b(List<Throwable> list) {
        e(list);
        if (m366m()) {
            f(list);
        }
    }

    @Override // org.p328c.p350f.C11656b
    /* renamed from: d */
    protected String mo371d(C11643d c11643d) {
        return c11643d.mo450b() + mo324f();
    }

    @Override // org.p328c.p350f.AbstractC11668f
    /* renamed from: f */
    protected String mo324f() {
        return this.f36803b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.p328c.p350f.C11656b
    /* renamed from: h */
    public void mo370h(List<Throwable> list) {
        super.mo370h(list);
        if (m366m()) {
            List<C11641b> m367l = m367l();
            int[] iArr = new int[m367l.size()];
            for (C11641b c11641b : m367l) {
                int m351a = ((C11664e.AbstractC11665a) c11641b.m459d().getAnnotation(C11664e.AbstractC11665a.class)).m351a();
                if (m351a < 0 || m351a > m367l.size() - 1) {
                    list.add(new Exception("Invalid @Parameter value: " + m351a + ". @Parameter fields counted: " + m367l.size() + ". Please use an index between 0 and " + (m367l.size() - 1) + "."));
                } else {
                    iArr[m351a] = iArr[m351a] + 1;
                }
            }
            for (int i = 0; i < iArr.length; i++) {
                int i2 = iArr[i];
                if (i2 == 0) {
                    list.add(new Exception("@Parameter(" + i + ") is never used."));
                } else if (i2 > 1) {
                    list.add(new Exception("@Parameter(" + i + ") is used more than once (" + i2 + ")."));
                }
            }
        }
    }

    @Override // org.p328c.p350f.AbstractC11668f
    /* renamed from: i */
    protected Annotation[] mo322i() {
        return new Annotation[0];
    }
}
