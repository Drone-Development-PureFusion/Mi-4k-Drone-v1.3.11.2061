package org.p328c.p337b.p341d;

import java.lang.reflect.Method;
import java.util.List;
import org.p328c.AbstractC11439a;
import org.p328c.AbstractC11638f;
import org.p328c.AbstractC11693k;
import org.p328c.AbstractC11695m;
@Deprecated
/* renamed from: org.c.b.d.k */
/* loaded from: classes.dex */
public class C11555k {

    /* renamed from: a */
    private final Method f36680a;

    /* renamed from: b */
    private C11554j f36681b;

    public C11555k(Method method, C11554j c11554j) {
        this.f36680a = method;
        this.f36681b = c11554j;
    }

    /* renamed from: a */
    public void m788a(Object obj) {
        this.f36680a.invoke(obj, new Object[0]);
    }

    /* renamed from: a */
    public boolean m789a() {
        return this.f36680a.getAnnotation(AbstractC11693k.class) != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean m787a(Throwable th) {
        return !m785c().isAssignableFrom(th.getClass());
    }

    /* renamed from: b */
    public long m786b() {
        AbstractC11695m abstractC11695m = (AbstractC11695m) this.f36680a.getAnnotation(AbstractC11695m.class);
        if (abstractC11695m == null) {
            return 0L;
        }
        return abstractC11695m.m278b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public Class<? extends Throwable> m785c() {
        AbstractC11695m abstractC11695m = (AbstractC11695m) this.f36680a.getAnnotation(AbstractC11695m.class);
        if (abstractC11695m == null || abstractC11695m.m279a() == AbstractC11695m.C11696a.class) {
            return null;
        }
        return abstractC11695m.m279a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean m784d() {
        return m785c() != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public List<Method> m783e() {
        return this.f36681b.m799a(AbstractC11638f.class);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public List<Method> m782f() {
        return this.f36681b.m799a(AbstractC11439a.class);
    }
}
