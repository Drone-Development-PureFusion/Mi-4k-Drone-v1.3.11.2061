package p070c.p072b;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import org.p328c.p337b.C11559h;
/* renamed from: c.b.n */
/* loaded from: classes.dex */
public class C0759n implements AbstractC0753i {

    /* renamed from: a */
    private String f1419a;

    /* renamed from: b */
    private Vector<AbstractC0753i> f1420b;

    public C0759n() {
        this.f1420b = new Vector<>(10);
    }

    public C0759n(Class<?> cls) {
        this.f1420b = new Vector<>(10);
        m38151c(cls);
    }

    public C0759n(Class<? extends AbstractC0754j> cls, String str) {
        this(cls);
        m38154b(str);
    }

    public C0759n(String str) {
        this.f1420b = new Vector<>(10);
        m38154b(str);
    }

    public C0759n(Class<?>... clsArr) {
        this.f1420b = new Vector<>(10);
        for (Class<?> cls : clsArr) {
            m38164a(m38149d(cls));
        }
    }

    public C0759n(Class<? extends AbstractC0754j>[] clsArr, String str) {
        this(clsArr);
        m38154b(str);
    }

    /* renamed from: a */
    public static AbstractC0753i m38160a(Class<?> cls, String str) {
        Object newInstance;
        try {
            Constructor<?> m38161a = m38161a(cls);
            try {
                if (m38161a.getParameterTypes().length == 0) {
                    Object newInstance2 = m38161a.newInstance(new Object[0]);
                    if (newInstance2 instanceof AbstractC0754j) {
                        ((AbstractC0754j) newInstance2).m38201e(str);
                        newInstance = newInstance2;
                    } else {
                        newInstance = newInstance2;
                    }
                } else {
                    newInstance = m38161a.newInstance(str);
                }
                return (AbstractC0753i) newInstance;
            } catch (IllegalAccessException e) {
                return m38159a("Cannot access test case: " + str + " (" + m38158a(e) + ")");
            } catch (InstantiationException e2) {
                return m38159a("Cannot instantiate test case: " + str + " (" + m38158a(e2) + ")");
            } catch (InvocationTargetException e3) {
                return m38159a("Exception in constructor: " + str + " (" + m38158a(e3.getTargetException()) + ")");
            }
        } catch (NoSuchMethodException e4) {
            return m38159a("Class " + cls.getName() + " has no public constructor TestCase(String name) or TestCase()");
        }
    }

    /* renamed from: a */
    public static AbstractC0753i m38159a(final String str) {
        return new AbstractC0754j("warning") { // from class: c.b.n.1
            @Override // p070c.p072b.AbstractC0754j
            /* renamed from: f */
            protected void mo38147f() {
                c(str);
            }
        };
    }

    /* renamed from: a */
    private static String m38158a(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* renamed from: a */
    public static Constructor<?> m38161a(Class<?> cls) {
        try {
            return cls.getConstructor(String.class);
        } catch (NoSuchMethodException e) {
            return cls.getConstructor(new Class[0]);
        }
    }

    /* renamed from: a */
    private void m38156a(Method method, List<String> list, Class<?> cls) {
        String name = method.getName();
        if (list.contains(name)) {
            return;
        }
        if (m38157a(method)) {
            list.add(name);
            m38164a(m38160a(cls, name));
        } else if (!m38153b(method)) {
        } else {
            m38164a(m38159a("Test method isn't public: " + method.getName() + "(" + cls.getCanonicalName() + ")"));
        }
    }

    /* renamed from: a */
    private boolean m38157a(Method method) {
        return m38153b(method) && Modifier.isPublic(method.getModifiers());
    }

    /* renamed from: b */
    private boolean m38153b(Method method) {
        return method.getParameterTypes().length == 0 && method.getName().startsWith("test") && method.getReturnType().equals(Void.TYPE);
    }

    /* renamed from: c */
    private void m38151c(Class<?> cls) {
        this.f1419a = cls.getName();
        try {
            m38161a(cls);
            if (!Modifier.isPublic(cls.getModifiers())) {
                m38164a(m38159a("Class " + cls.getName() + " is not public"));
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (Class<?> cls2 = cls; AbstractC0753i.class.isAssignableFrom(cls2); cls2 = cls2.getSuperclass()) {
                for (Method method : C11559h.m780a(cls2)) {
                    m38156a(method, arrayList, cls);
                }
            }
            if (this.f1420b.size() != 0) {
                return;
            }
            m38164a(m38159a("No tests found in " + cls.getName()));
        } catch (NoSuchMethodException e) {
            m38164a(m38159a("Class " + cls.getName() + " has no public constructor TestCase(String name) or TestCase()"));
        }
    }

    /* renamed from: d */
    private AbstractC0753i m38149d(Class<?> cls) {
        return AbstractC0754j.class.isAssignableFrom(cls) ? new C0759n(cls.asSubclass(AbstractC0754j.class)) : m38159a(cls.getCanonicalName() + " does not extend TestCase");
    }

    @Override // p070c.p072b.AbstractC0753i
    /* renamed from: a */
    public int mo38166a() {
        int i = 0;
        Iterator<AbstractC0753i> it2 = this.f1420b.iterator();
        while (true) {
            int i2 = i;
            if (it2.hasNext()) {
                i = it2.next().mo38166a() + i2;
            } else {
                return i2;
            }
        }
    }

    /* renamed from: a */
    public AbstractC0753i m38165a(int i) {
        return this.f1420b.get(i);
    }

    /* renamed from: a */
    public void m38164a(AbstractC0753i abstractC0753i) {
        this.f1420b.add(abstractC0753i);
    }

    /* renamed from: a */
    public void mo38163a(AbstractC0753i abstractC0753i, C0757m c0757m) {
        abstractC0753i.mo38162a(c0757m);
    }

    @Override // p070c.p072b.AbstractC0753i
    /* renamed from: a */
    public void mo38162a(C0757m c0757m) {
        Iterator<AbstractC0753i> it2 = this.f1420b.iterator();
        while (it2.hasNext()) {
            AbstractC0753i next = it2.next();
            if (c0757m.m38171f()) {
                return;
            }
            mo38163a(next, c0757m);
        }
    }

    /* renamed from: b */
    public void m38155b(Class<? extends AbstractC0754j> cls) {
        m38164a(new C0759n(cls));
    }

    /* renamed from: b */
    public void m38154b(String str) {
        this.f1419a = str;
    }

    /* renamed from: c */
    public String m38152c() {
        return this.f1419a;
    }

    /* renamed from: d */
    public int m38150d() {
        return this.f1420b.size();
    }

    /* renamed from: e */
    public Enumeration<AbstractC0753i> m38148e() {
        return this.f1420b.elements();
    }

    public String toString() {
        return m38152c() != null ? m38152c() : super.toString();
    }
}
