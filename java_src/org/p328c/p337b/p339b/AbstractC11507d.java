package org.p328c.p337b.p339b;

import java.lang.reflect.Method;
import org.p325b.AbstractC11415b;
import org.p328c.p337b.C11559h;
@Deprecated
/* renamed from: org.c.b.b.d */
/* loaded from: classes.dex */
public abstract class AbstractC11507d<T> extends AbstractC11415b<T> {

    /* renamed from: a */
    private Class<?> f36612a;

    protected AbstractC11507d() {
        this.f36612a = m901a(getClass());
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected AbstractC11507d(Class<T> cls) {
        this.f36612a = cls;
    }

    /* renamed from: a */
    private static Class<?> m901a(Class<?> cls) {
        Method[] m780a;
        while (cls != Object.class) {
            for (Method method : C11559h.m780a(cls)) {
                if (m899a(method)) {
                    return method.getParameterTypes()[0];
                }
            }
            cls = cls.getSuperclass();
        }
        throw new Error("Cannot determine correct type for matchesSafely() method.");
    }

    /* renamed from: a */
    private static boolean m899a(Method method) {
        return method.getName().equals("matchesSafely") && method.getParameterTypes().length == 1 && !method.isSynthetic();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.p325b.AbstractC11433k
    /* renamed from: a */
    public final boolean mo900a(Object obj) {
        return obj != 0 && this.f36612a.isInstance(obj) && m898b(obj);
    }

    /* renamed from: b */
    public abstract boolean m898b(T t);
}
