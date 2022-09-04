package org.p286a.p287a.p290c.p296f;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.p286a.p287a.p288a.AbstractC11008b;
@AbstractC11008b
/* renamed from: org.a.a.c.f.e */
/* loaded from: classes2.dex */
public class C11076e implements AbstractC11075d {

    /* renamed from: a */
    private final Method f35635a;

    public C11076e() {
        try {
            this.f35635a = Class.forName("java.net.IDN").getMethod("toUnicode", String.class);
        } catch (NoSuchMethodException e) {
            throw new IllegalStateException(e.getMessage(), e);
        } catch (SecurityException e2) {
            throw new IllegalStateException(e2.getMessage(), e2);
        }
    }

    @Override // org.p286a.p287a.p290c.p296f.AbstractC11075d
    /* renamed from: a */
    public String mo2140a(String str) {
        try {
            return (String) this.f35635a.invoke(null, str);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e.getMessage(), e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            throw new RuntimeException(cause.getMessage(), cause);
        }
    }
}
