package org.p328c.p329a.p334e;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.p328c.C11565c;
import org.p328c.C11567d;
import org.p328c.p329a.p334e.p335a.C11472b;
import org.p328c.p329a.p334e.p335a.C11475e;
import org.p328c.p337b.C11503b;
import org.p328c.p350f.C11656b;
import org.p328c.p350f.p351a.AbstractC11650j;
import org.p328c.p350f.p351a.C11643d;
import org.p328c.p350f.p351a.C11651k;
/* renamed from: org.c.a.e.h */
/* loaded from: classes2.dex */
public class C11487h extends C11656b {

    /* renamed from: org.c.a.e.h$a */
    /* loaded from: classes2.dex */
    public static class C11488a extends AbstractC11650j {

        /* renamed from: b */
        private final C11643d f36588b;

        /* renamed from: c */
        private final C11651k f36589c;

        /* renamed from: a */
        private int f36587a = 0;

        /* renamed from: d */
        private List<C11503b> f36590d = new ArrayList();

        public C11488a(C11643d c11643d, C11651k c11651k) {
            this.f36588b = c11643d;
            this.f36589c = c11651k;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public AbstractC11650j m932a(final C11643d c11643d, final C11472b c11472b, final Object obj) {
            return new AbstractC11650j() { // from class: org.c.a.e.h.a.2
                @Override // org.p328c.p350f.p351a.AbstractC11650j
                /* renamed from: a */
                public void mo318a() {
                    Object[] m974e = c11472b.m974e();
                    if (!C11488a.this.m927d()) {
                        C11567d.m684a(m974e);
                    }
                    c11643d.m455a(obj, m974e);
                }
            };
        }

        /* renamed from: c */
        private C11651k m929c() {
            return this.f36589c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public boolean m927d() {
            AbstractC11492i abstractC11492i = (AbstractC11492i) this.f36588b.m445d().getAnnotation(AbstractC11492i.class);
            if (abstractC11492i == null) {
                return false;
            }
            return abstractC11492i.m926a();
        }

        @Override // org.p328c.p350f.p351a.AbstractC11650j
        /* renamed from: a */
        public void mo318a() {
            m936a(C11472b.m982a(this.f36588b.m445d(), m929c()));
            boolean z = this.f36588b.mo424a((Class<Annotation>) AbstractC11492i.class) != null;
            if (this.f36587a != 0 || !z) {
                return;
            }
            C11565c.m757a("Never found parameters that satisfied method assumptions.  Violated assumptions: " + this.f36590d);
        }

        /* renamed from: a */
        protected void m937a(Throwable th, Object... objArr) {
            if (objArr.length == 0) {
                throw th;
            }
            throw new C11475e(th, this.f36588b.mo450b(), objArr);
        }

        /* renamed from: a */
        protected void m936a(C11472b c11472b) {
            if (!c11472b.m985a()) {
                m930b(c11472b);
            } else {
                m928c(c11472b);
            }
        }

        /* renamed from: a */
        protected void m933a(C11503b c11503b) {
            this.f36590d.add(c11503b);
        }

        /* renamed from: b */
        protected void m931b() {
            this.f36587a++;
        }

        /* renamed from: b */
        protected void m930b(C11472b c11472b) {
            for (AbstractC11484g abstractC11484g : c11472b.m976c()) {
                m936a(c11472b.m980a(abstractC11484g));
            }
        }

        /* renamed from: c */
        protected void m928c(final C11472b c11472b) {
            new C11656b(m929c().m412d()) { // from class: org.c.a.e.h.a.1
                @Override // org.p328c.p350f.C11656b
                /* renamed from: a */
                public AbstractC11650j mo398a(C11643d c11643d) {
                    final AbstractC11650j mo398a = super.mo398a(c11643d);
                    return new AbstractC11650j() { // from class: org.c.a.e.h.a.1.1
                        @Override // org.p328c.p350f.p351a.AbstractC11650j
                        /* renamed from: a */
                        public void mo318a() {
                            try {
                                mo398a.mo318a();
                                C11488a.this.m931b();
                            } catch (C11503b e) {
                                C11488a.this.m933a(e);
                            } catch (Throwable th) {
                                C11488a.this.m937a(th, c11472b.m979a(C11488a.this.m927d()));
                            }
                        }
                    };
                }

                @Override // org.p328c.p350f.C11656b
                /* renamed from: a */
                protected AbstractC11650j mo397a(C11643d c11643d, Object obj) {
                    return C11488a.this.m932a(c11643d, c11472b, obj);
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // org.p328c.p350f.C11656b, org.p328c.p350f.AbstractC11668f
                /* renamed from: a */
                public void mo345a(List<Throwable> list) {
                }

                @Override // org.p328c.p350f.C11656b
                /* renamed from: b */
                public Object mo373b() {
                    Object[] m975d = c11472b.m975d();
                    if (!C11488a.this.m927d()) {
                        C11567d.m684a(m975d);
                    }
                    return g().m408f().newInstance(m975d);
                }
            }.mo398a(this.f36588b).mo318a();
        }
    }

    public C11487h(Class<?> cls) {
        super(cls);
    }

    /* renamed from: a */
    private void m940a(Class<? extends AbstractC11482e> cls, List<Throwable> list) {
        Constructor<?>[] constructors = cls.getConstructors();
        if (constructors.length != 1) {
            list.add(new Error("ParameterSupplier " + cls.getName() + " must have only one constructor (either empty or taking only a TestClass)"));
            return;
        }
        Class<?>[] parameterTypes = constructors[0].getParameterTypes();
        if (parameterTypes.length == 0 || parameterTypes[0].equals(C11651k.class)) {
            return;
        }
        list.add(new Error("ParameterSupplier " + cls.getName() + " constructor must take either nothing or a single TestClass instance"));
    }

    /* renamed from: i */
    private void m939i(List<Throwable> list) {
        Field[] declaredFields;
        for (Field field : g().m412d().getDeclaredFields()) {
            if (field.getAnnotation(AbstractC11468a.class) != null || field.getAnnotation(AbstractC11477b.class) != null) {
                if (!Modifier.isStatic(field.getModifiers())) {
                    list.add(new Error("DataPoint field " + field.getName() + " must be static"));
                }
                if (!Modifier.isPublic(field.getModifiers())) {
                    list.add(new Error("DataPoint field " + field.getName() + " must be public"));
                }
            }
        }
    }

    /* renamed from: j */
    private void m938j(List<Throwable> list) {
        Method[] declaredMethods;
        for (Method method : g().m412d().getDeclaredMethods()) {
            if (method.getAnnotation(AbstractC11468a.class) != null || method.getAnnotation(AbstractC11477b.class) != null) {
                if (!Modifier.isStatic(method.getModifiers())) {
                    list.add(new Error("DataPoint method " + method.getName() + " must be static"));
                }
                if (!Modifier.isPublic(method.getModifiers())) {
                    list.add(new Error("DataPoint method " + method.getName() + " must be public"));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.p328c.p350f.C11656b
    /* renamed from: a */
    public List<C11643d> mo400a() {
        ArrayList arrayList = new ArrayList(super.mo400a());
        List<C11643d> m417b = g().m417b(AbstractC11492i.class);
        arrayList.removeAll(m417b);
        arrayList.addAll(m417b);
        return arrayList;
    }

    @Override // org.p328c.p350f.C11656b
    /* renamed from: a */
    public AbstractC11650j mo398a(C11643d c11643d) {
        return new C11488a(c11643d, g());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.p328c.p350f.C11656b, org.p328c.p350f.AbstractC11668f
    /* renamed from: a */
    public void mo345a(List<Throwable> list) {
        super.mo345a(list);
        m939i(list);
        m938j(list);
    }

    @Override // org.p328c.p350f.C11656b
    /* renamed from: b */
    protected void mo372b(List<Throwable> list) {
        e(list);
    }

    @Override // org.p328c.p350f.C11656b
    /* renamed from: c */
    protected void mo387c(List<Throwable> list) {
        for (C11643d c11643d : mo400a()) {
            if (c11643d.mo424a((Class<Annotation>) AbstractC11492i.class) != null) {
                c11643d.m447b(false, list);
                c11643d.m449b(list);
            } else {
                c11643d.m451a(false, list);
            }
            Iterator<C11481d> it2 = C11481d.m955a(c11643d.m445d()).iterator();
            while (it2.hasNext()) {
                AbstractC11483f abstractC11483f = (AbstractC11483f) it2.next().m947d(AbstractC11483f.class);
                if (abstractC11483f != null) {
                    m940a(abstractC11483f.m944a(), list);
                }
            }
        }
    }
}
