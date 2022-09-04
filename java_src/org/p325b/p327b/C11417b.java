package org.p325b.p327b;

import java.lang.reflect.Method;
/* renamed from: org.b.b.b */
/* loaded from: classes2.dex */
public class C11417b {

    /* renamed from: a */
    private final String f36531a;

    /* renamed from: b */
    private final int f36532b;

    /* renamed from: c */
    private final int f36533c;

    public C11417b(String str, int i, int i2) {
        this.f36531a = str;
        this.f36532b = i;
        this.f36533c = i2;
    }

    /* renamed from: a */
    public Class<?> m1140a(Class<?> cls) {
        Method[] declaredMethods;
        while (cls != Object.class) {
            for (Method method : cls.getDeclaredMethods()) {
                if (m1139a(method)) {
                    return m1138b(method);
                }
            }
            cls = cls.getSuperclass();
        }
        throw new Error("Cannot determine correct type for " + this.f36531a + "() method.");
    }

    /* renamed from: a */
    protected boolean m1139a(Method method) {
        return method.getName().equals(this.f36531a) && method.getParameterTypes().length == this.f36532b && !method.isSynthetic();
    }

    /* renamed from: b */
    protected Class<?> m1138b(Method method) {
        return method.getParameterTypes()[this.f36533c];
    }
}
