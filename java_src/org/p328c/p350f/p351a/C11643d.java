package org.p328c.p350f.p351a;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;
import org.p328c.p337b.p341d.p342a.AbstractC11516c;
/* renamed from: org.c.f.a.d */
/* loaded from: classes.dex */
public class C11643d extends AbstractC11642c<C11643d> {

    /* renamed from: a */
    private final Method f36785a;

    public C11643d(Method method) {
        if (method == null) {
            throw new NullPointerException("FrameworkMethod cannot be created without an underlying method.");
        }
        this.f36785a = method;
    }

    /* renamed from: j */
    private Class<?>[] m441j() {
        return this.f36785a.getParameterTypes();
    }

    /* renamed from: a */
    public Object m455a(final Object obj, final Object... objArr) {
        return new AbstractC11516c() { // from class: org.c.f.a.d.1
            @Override // org.p328c.p337b.p341d.p342a.AbstractC11516c
            /* renamed from: b */
            protected Object mo374b() {
                return C11643d.this.f36785a.invoke(obj, objArr);
            }
        }.a();
    }

    @Override // org.p328c.p350f.p351a.AbstractC11640a
    /* renamed from: a */
    public <T extends Annotation> T mo424a(Class<T> cls) {
        return (T) this.f36785a.getAnnotation(cls);
    }

    /* renamed from: a */
    public void m451a(boolean z, List<Throwable> list) {
        m447b(z, list);
        if (this.f36785a.getParameterTypes().length != 0) {
            list.add(new Exception("Method " + this.f36785a.getName() + " should have no parameters"));
        }
    }

    @Deprecated
    /* renamed from: a */
    public boolean m454a(Type type) {
        return m441j().length == 0 && (type instanceof Class) && ((Class) type).isAssignableFrom(this.f36785a.getReturnType());
    }

    @Override // org.p328c.p350f.p351a.AbstractC11642c
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public boolean mo453a(C11643d c11643d) {
        if (c11643d.mo450b().equals(mo450b()) && c11643d.m441j().length == m441j().length) {
            for (int i = 0; i < c11643d.m441j().length; i++) {
                if (!c11643d.m441j()[i].equals(m441j()[i])) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override // org.p328c.p350f.p351a.AbstractC11640a
    /* renamed from: a */
    public Annotation[] mo425a() {
        return this.f36785a.getAnnotations();
    }

    @Override // org.p328c.p350f.p351a.AbstractC11642c
    /* renamed from: b */
    public String mo450b() {
        return this.f36785a.getName();
    }

    /* renamed from: b */
    public void m449b(List<Throwable> list) {
        new C11647g(this.f36785a).m433a(list);
    }

    /* renamed from: b */
    public void m447b(boolean z, List<Throwable> list) {
        if (g() != z) {
            list.add(new Exception("Method " + this.f36785a.getName() + "() " + (z ? "should" : "should not") + " be static"));
        }
        if (!h()) {
            list.add(new Exception("Method " + this.f36785a.getName() + "() should be public"));
        }
        if (this.f36785a.getReturnType() != Void.TYPE) {
            list.add(new Exception("Method " + this.f36785a.getName() + "() should be void"));
        }
    }

    @Override // org.p328c.p350f.p351a.AbstractC11642c
    /* renamed from: c */
    protected int mo446c() {
        return this.f36785a.getModifiers();
    }

    /* renamed from: d */
    public Method m445d() {
        return this.f36785a;
    }

    @Override // org.p328c.p350f.p351a.AbstractC11642c
    /* renamed from: e */
    public Class<?> mo444e() {
        return m442i();
    }

    public boolean equals(Object obj) {
        if (!C11643d.class.isInstance(obj)) {
            return false;
        }
        return ((C11643d) obj).f36785a.equals(this.f36785a);
    }

    @Override // org.p328c.p350f.p351a.AbstractC11642c
    /* renamed from: f */
    public Class<?> mo443f() {
        return this.f36785a.getDeclaringClass();
    }

    public int hashCode() {
        return this.f36785a.hashCode();
    }

    /* renamed from: i */
    public Class<?> m442i() {
        return this.f36785a.getReturnType();
    }

    public String toString() {
        return this.f36785a.toString();
    }
}
