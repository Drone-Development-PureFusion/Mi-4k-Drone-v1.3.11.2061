package org.p328c.p337b.p341d;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import org.p328c.AbstractC11439a;
import org.p328c.AbstractC11493b;
import org.p328c.AbstractC11638f;
import org.p328c.AbstractC11675g;
import org.p328c.AbstractC11695m;
@Deprecated
/* renamed from: org.c.b.d.h */
/* loaded from: classes.dex */
public class C11552h {

    /* renamed from: a */
    private final List<Throwable> f36677a = new ArrayList();

    /* renamed from: b */
    private C11554j f36678b;

    public C11552h(C11554j c11554j) {
        this.f36678b = c11554j;
    }

    /* renamed from: a */
    private void m806a(Class<? extends Annotation> cls, boolean z) {
        for (Method method : this.f36678b.m799a(cls)) {
            if (Modifier.isStatic(method.getModifiers()) != z) {
                this.f36677a.add(new Exception("Method " + method.getName() + "() " + (z ? "should" : "should not") + " be static"));
            }
            if (!Modifier.isPublic(method.getDeclaringClass().getModifiers())) {
                this.f36677a.add(new Exception("Class " + method.getDeclaringClass().getName() + " should be public"));
            }
            if (!Modifier.isPublic(method.getModifiers())) {
                this.f36677a.add(new Exception("Method " + method.getName() + " should be public"));
            }
            if (method.getReturnType() != Void.TYPE) {
                this.f36677a.add(new Exception("Method " + method.getName() + " should be void"));
            }
            if (method.getParameterTypes().length != 0) {
                this.f36677a.add(new Exception("Method " + method.getName() + " should have no parameters"));
            }
        }
    }

    /* renamed from: a */
    public void m807a() {
        m806a(AbstractC11439a.class, false);
        m806a(AbstractC11638f.class, false);
        m806a(AbstractC11695m.class, false);
        if (this.f36678b.m799a(AbstractC11695m.class).size() == 0) {
            this.f36677a.add(new Exception("No runnable methods"));
        }
    }

    /* renamed from: b */
    public void m805b() {
        m806a(AbstractC11675g.class, true);
        m806a(AbstractC11493b.class, true);
    }

    /* renamed from: c */
    public List<Throwable> m804c() {
        m802e();
        m805b();
        m807a();
        return this.f36677a;
    }

    /* renamed from: d */
    public void m803d() {
        if (!this.f36677a.isEmpty()) {
            throw new C11541d(this.f36677a);
        }
    }

    /* renamed from: e */
    public void m802e() {
        try {
            this.f36678b.m792d();
        } catch (Exception e) {
            this.f36677a.add(new Exception("Test class should have public zero-argument constructor", e));
        }
    }
}
