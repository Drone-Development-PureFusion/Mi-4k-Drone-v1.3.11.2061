package org.p328c.p337b.p341d;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import p070c.p072b.AbstractC0753i;
import p070c.p073c.AbstractC0761a;
/* renamed from: org.c.b.d.i */
/* loaded from: classes2.dex */
public class C11553i extends C11542e {
    public C11553i(Class<?> cls) {
        super(m801a(cls));
    }

    /* renamed from: a */
    public static AbstractC0753i m801a(Class<?> cls) {
        try {
            Method method = cls.getMethod(AbstractC0761a.f1422a, new Class[0]);
            if (Modifier.isStatic(method.getModifiers())) {
                return (AbstractC0753i) method.invoke(null, new Object[0]);
            }
            throw new Exception(cls.getName() + ".suite() must be static");
        } catch (InvocationTargetException e) {
            throw e.getCause();
        }
    }
}
