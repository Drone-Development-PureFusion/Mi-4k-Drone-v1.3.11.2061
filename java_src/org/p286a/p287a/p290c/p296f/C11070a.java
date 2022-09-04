package org.p286a.p287a.p290c.p296f;

import java.lang.reflect.InvocationTargetException;
import org.p286a.p287a.p288a.AbstractC11008b;
@AbstractC11008b
/* renamed from: org.a.a.c.f.a */
/* loaded from: classes2.dex */
public class C11070a {
    private C11070a() {
    }

    /* renamed from: a */
    public static <T> T m2157a(T t) {
        if (t == null) {
            return null;
        }
        if (!(t instanceof Cloneable)) {
            throw new CloneNotSupportedException();
        }
        try {
            try {
                return (T) t.getClass().getMethod("clone", null).invoke(t, null);
            } catch (IllegalAccessException e) {
                throw new IllegalAccessError(e.getMessage());
            } catch (InvocationTargetException e2) {
                Throwable cause = e2.getCause();
                if (!(cause instanceof CloneNotSupportedException)) {
                    throw new Error("Unexpected exception", cause);
                }
                throw ((CloneNotSupportedException) cause);
            }
        } catch (NoSuchMethodException e3) {
            throw new NoSuchMethodError(e3.getMessage());
        }
    }

    /* renamed from: b */
    public static Object m2156b(Object obj) {
        return m2157a(obj);
    }
}
