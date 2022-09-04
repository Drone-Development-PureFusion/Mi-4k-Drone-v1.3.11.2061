package p005b.p006a.p007a.p029b.p036g.p041e;

import com.google.android.gms.analytics.p229a.C3833b;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import p005b.p006a.p007a.p029b.p036g.p040d.AbstractC0473e;
import p005b.p006a.p007a.p029b.p036g.p040d.C0474f;
import p005b.p006a.p007a.p029b.p055o.C0662f;
import p005b.p006a.p007a.p029b.p058r.C0725v;
import p005b.p006a.p007a.p029b.p058r.EnumC0702a;
/* renamed from: b.a.a.b.g.e.f */
/* loaded from: classes.dex */
public class C0491f extends C0662f {

    /* renamed from: a */
    protected Object f674a;

    /* renamed from: b */
    protected Class<?> f675b;

    /* renamed from: c */
    protected C0490e[] f676c;

    /* renamed from: d */
    protected C0489d[] f677d;

    public C0491f(Object obj) {
        this.f674a = obj;
        this.f675b = obj.getClass();
    }

    /* renamed from: a */
    private Class<?> m39121a(Method method) {
        if (method == null) {
            return null;
        }
        Class<?>[] parameterTypes = method.getParameterTypes();
        if (parameterTypes.length != 1) {
            return null;
        }
        return parameterTypes[0];
    }

    /* renamed from: a */
    private boolean m39130a(Class<?> cls) {
        if (cls.isInterface()) {
            return false;
        }
        try {
            return cls.newInstance() != null;
        } catch (IllegalAccessException e) {
            return false;
        } catch (InstantiationException e2) {
            return false;
        }
    }

    /* renamed from: a */
    private boolean m39122a(String str, Method method, Class<?>[] clsArr, Object obj) {
        Class<?> cls = obj.getClass();
        if (clsArr.length != 1) {
            c("Wrong number of parameters in setter method for property [" + str + "] in " + this.f674a.getClass().getName());
            return false;
        } else if (clsArr[0].isAssignableFrom(obj.getClass())) {
            return true;
        } else {
            c("A \"" + cls.getName() + "\" object is not assignable to a \"" + clsArr[0].getName() + "\" variable.");
            c("The class \"" + clsArr[0].getName() + "\" was loaded by ");
            c("[" + clsArr[0].getClassLoader() + "] whereas object of type ");
            c("\"" + cls.getName() + "\" was loaded by [" + cls.getClassLoader() + "].");
            return false;
        }
    }

    /* renamed from: b */
    private EnumC0702a m39114b(Method method) {
        Class<?> m39121a = m39121a(method);
        return m39121a == null ? EnumC0702a.NOT_FOUND : C0493g.m39104a(m39121a) ? EnumC0702a.AS_BASIC_PROPERTY : EnumC0702a.AS_COMPLEX_PROPERTY;
    }

    /* renamed from: g */
    private Method m39111g(String str) {
        return m39118b(C3833b.f14899c + m39109i(str));
    }

    /* renamed from: h */
    private Method m39110h(String str) {
        C0490e m39112f = m39112f(C0488c.m39143a(str));
        if (m39112f != null) {
            return m39112f.m39136b();
        }
        return null;
    }

    /* renamed from: i */
    private String m39109i(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    /* renamed from: a */
    public EnumC0702a m39129a(String str) {
        Method m39111g = m39111g(str);
        if (m39111g != null) {
            switch (m39114b(m39111g)) {
                case NOT_FOUND:
                    return EnumC0702a.NOT_FOUND;
                case AS_BASIC_PROPERTY:
                    return EnumC0702a.AS_BASIC_PROPERTY_COLLECTION;
                case AS_COMPLEX_PROPERTY:
                    return EnumC0702a.AS_COMPLEX_PROPERTY_COLLECTION;
            }
        }
        Method m39110h = m39110h(str);
        return m39110h != null ? m39114b(m39110h) : EnumC0702a.NOT_FOUND;
    }

    /* renamed from: a */
    public Class<?> m39127a(String str, EnumC0702a enumC0702a, C0474f c0474f) {
        Class<?> m39225a = c0474f.m39225a(this.f674a.getClass(), str);
        if (m39225a != null) {
            return m39225a;
        }
        Method m39128a = m39128a(str, enumC0702a);
        if (m39128a == null) {
            return null;
        }
        Class<?> m39123a = m39123a(str, m39128a);
        return m39123a == null ? m39115b(str, m39128a) : m39123a;
    }

    /* renamed from: a */
    Class<?> m39123a(String str, Method method) {
        AbstractC0473e abstractC0473e = (AbstractC0473e) m39126a(str, AbstractC0473e.class, method);
        if (abstractC0473e != null) {
            return abstractC0473e.m39226a();
        }
        return null;
    }

    /* renamed from: a */
    <T extends Annotation> T m39126a(String str, Class<T> cls, Method method) {
        if (method != null) {
            return (T) method.getAnnotation(cls);
        }
        return null;
    }

    /* renamed from: a */
    Method m39128a(String str, EnumC0702a enumC0702a) {
        String m39109i = m39109i(str);
        if (enumC0702a == EnumC0702a.AS_COMPLEX_PROPERTY_COLLECTION) {
            return m39111g(m39109i);
        }
        if (enumC0702a != EnumC0702a.AS_COMPLEX_PROPERTY) {
            throw new IllegalStateException(enumC0702a + " not allowed here");
        }
        return m39110h(m39109i);
    }

    /* renamed from: a */
    protected void m39132a() {
        try {
            this.f676c = C0488c.m39142b(this.f675b);
            this.f677d = C0488c.m39144a(this.f675b);
        } catch (C0487b e) {
            c("Failed to introspect " + this.f674a + ": " + e.getMessage());
            this.f676c = new C0490e[0];
            this.f677d = new C0489d[0];
        }
    }

    /* renamed from: a */
    public void m39131a(C0490e c0490e, String str, String str2) {
        Method m39136b = c0490e.m39136b();
        if (m39136b == null) {
            throw new C0725v("No setter for property [" + str + "].");
        }
        Class<?>[] parameterTypes = m39136b.getParameterTypes();
        if (parameterTypes.length != 1) {
            throw new C0725v("#params for setter != 1");
        }
        try {
            Object m39105a = C0493g.m39105a(this, str2, parameterTypes[0]);
            if (m39105a == null) {
                throw new C0725v("Conversion to type [" + parameterTypes[0] + "] failed.");
            }
            try {
                m39136b.invoke(this.f674a, m39105a);
            } catch (Exception e) {
                throw new C0725v(e);
            }
        } catch (Throwable th) {
            throw new C0725v("Conversion to type [" + parameterTypes[0] + "] failed. ", th);
        }
    }

    /* renamed from: a */
    public void m39125a(String str, Object obj) {
        Method m39111g = m39111g(str);
        if (m39111g == null) {
            c("Could not find method [add" + str + "] in class [" + this.f675b.getName() + "].");
        } else if (!m39122a(str, m39111g, m39111g.getParameterTypes(), obj)) {
        } else {
            m39120a(m39111g, obj);
        }
    }

    /* renamed from: a */
    public void m39124a(String str, String str2) {
        if (str2 == null) {
            return;
        }
        String m39143a = C0488c.m39143a(str);
        C0490e m39112f = m39112f(m39143a);
        if (m39112f == null) {
            e("No such property [" + m39143a + "] in " + this.f675b.getName() + ".");
            return;
        }
        try {
            m39131a(m39112f, m39143a, str2);
        } catch (C0725v e) {
            c("Failed to set property [" + m39143a + "] to value \"" + str2 + "\". ", e);
        }
    }

    /* renamed from: a */
    void m39120a(Method method, Object obj) {
        Class<?> cls = obj.getClass();
        try {
            method.invoke(this.f674a, obj);
        } catch (Exception e) {
            a("Could not invoke method " + method.getName() + " in class " + this.f674a.getClass().getName() + " with parameter of type " + cls.getName(), (Throwable) e);
        }
    }

    /* renamed from: b */
    public Class<?> m39119b() {
        return this.f675b;
    }

    /* renamed from: b */
    Class<?> m39115b(String str, Method method) {
        Class<?> m39121a = m39121a(method);
        if (m39121a != null && m39130a(m39121a)) {
            return m39121a;
        }
        return null;
    }

    /* renamed from: b */
    protected Method m39118b(String str) {
        if (this.f677d == null) {
            m39132a();
        }
        for (int i = 0; i < this.f677d.length; i++) {
            if (str.equals(this.f677d[i].m39141a())) {
                return this.f677d[i].m39140b();
            }
        }
        return null;
    }

    /* renamed from: b */
    public void m39117b(String str, Object obj) {
        C0490e m39112f = m39112f(C0488c.m39143a(str));
        if (m39112f == null) {
            e("Could not find PropertyDescriptor for [" + str + "] in " + this.f675b.getName());
            return;
        }
        Method m39136b = m39112f.m39136b();
        if (m39136b == null) {
            e("Not setter method for property [" + str + "] in " + this.f674a.getClass().getName());
        } else if (!m39122a(str, m39136b, m39136b.getParameterTypes(), obj)) {
        } else {
            try {
                m39120a(m39136b, obj);
            } catch (Exception e) {
                a("Could not set component " + this.f674a + " for parent component " + this.f674a, (Throwable) e);
            }
        }
    }

    /* renamed from: b */
    public void m39116b(String str, String str2) {
        if (str2 == null) {
            return;
        }
        String m39109i = m39109i(str);
        Method m39111g = m39111g(m39109i);
        if (m39111g == null) {
            c("No adder for property [" + m39109i + "].");
            return;
        }
        Class<?>[] parameterTypes = m39111g.getParameterTypes();
        m39122a(m39109i, m39111g, parameterTypes, str2);
        try {
            if (C0493g.m39105a(this, str2, parameterTypes[0]) == null) {
                return;
            }
            m39120a(m39111g, str2);
        } catch (Throwable th) {
            a("Conversion to type [" + parameterTypes[0] + "] failed. ", th);
        }
    }

    /* renamed from: c */
    public Object m39113c() {
        return this.f674a;
    }

    /* renamed from: f */
    protected C0490e m39112f(String str) {
        if (this.f676c == null) {
            m39132a();
        }
        for (int i = 0; i < this.f676c.length; i++) {
            if (str.equals(this.f676c[i].m39139a())) {
                return this.f676c[i];
            }
        }
        return null;
    }
}
