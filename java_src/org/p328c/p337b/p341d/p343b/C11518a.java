package org.p328c.p337b.p341d.p343b;

import java.lang.annotation.Annotation;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import org.p328c.AbstractC11687h;
import org.p328c.AbstractC11694l;
import org.p328c.p346d.AbstractC11576f;
import org.p328c.p346d.AbstractC11585l;
import org.p328c.p350f.p351a.AbstractC11642c;
import org.p328c.p350f.p351a.C11651k;
/* renamed from: org.c.b.d.b.a */
/* loaded from: classes.dex */
public class C11518a {

    /* renamed from: a */
    public static final C11518a f36629a = m878a().m866a(new C11521b()).m866a(new C11526g()).m866a(new C11525f()).m866a(new C11523d()).m865b();

    /* renamed from: b */
    public static final C11518a f36630b = m874b().m866a(new C11524e()).m866a(new C11525f()).m866a(new C11522c()).m865b();

    /* renamed from: c */
    public static final C11518a f36631c = m878a().m868a().m866a(new C11521b()).m866a(new C11526g()).m866a(new C11525f()).m866a(new C11528i()).m865b();

    /* renamed from: d */
    public static final C11518a f36632d = m874b().m868a().m866a(new C11524e()).m866a(new C11525f()).m866a(new C11527h()).m865b();

    /* renamed from: e */
    private final Class<? extends Annotation> f36633e;

    /* renamed from: f */
    private final boolean f36634f;

    /* renamed from: g */
    private final List<AbstractC11529j> f36635g;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: org.c.b.d.b.a$a */
    /* loaded from: classes2.dex */
    public static class C11520a {

        /* renamed from: a */
        private final Class<? extends Annotation> f36636a;

        /* renamed from: b */
        private boolean f36637b;

        /* renamed from: c */
        private final List<AbstractC11529j> f36638c;

        private C11520a(Class<? extends Annotation> cls) {
            this.f36636a = cls;
            this.f36637b = false;
            this.f36638c = new ArrayList();
        }

        /* renamed from: a */
        C11520a m868a() {
            this.f36637b = true;
            return this;
        }

        /* renamed from: a */
        C11520a m866a(AbstractC11529j abstractC11529j) {
            this.f36638c.add(abstractC11529j);
            return this;
        }

        /* renamed from: b */
        C11518a m865b() {
            return new C11518a(this);
        }
    }

    /* renamed from: org.c.b.d.b.a$b */
    /* loaded from: classes2.dex */
    private static final class C11521b implements AbstractC11529j {
        private C11521b() {
        }

        /* renamed from: a */
        private boolean m862a(AbstractC11642c<?> abstractC11642c) {
            return Modifier.isPublic(abstractC11642c.mo443f().getModifiers());
        }

        @Override // org.p328c.p337b.p341d.p343b.C11518a.AbstractC11529j
        /* renamed from: a */
        public void mo861a(AbstractC11642c<?> abstractC11642c, Class<? extends Annotation> cls, List<Throwable> list) {
            if (!m862a(abstractC11642c)) {
                list.add(new C11530b(abstractC11642c, cls, "must be declared in a public class."));
            }
        }
    }

    /* renamed from: org.c.b.d.b.a$c */
    /* loaded from: classes2.dex */
    private static final class C11522c implements AbstractC11529j {
        private C11522c() {
        }

        @Override // org.p328c.p337b.p341d.p343b.C11518a.AbstractC11529j
        /* renamed from: a */
        public void mo861a(AbstractC11642c<?> abstractC11642c, Class<? extends Annotation> cls, List<Throwable> list) {
            if (!C11518a.m871d(abstractC11642c)) {
                list.add(new C11530b(abstractC11642c, cls, "must implement MethodRule or TestRule."));
            }
        }
    }

    /* renamed from: org.c.b.d.b.a$d */
    /* loaded from: classes2.dex */
    private static final class C11523d implements AbstractC11529j {
        private C11523d() {
        }

        @Override // org.p328c.p337b.p341d.p343b.C11518a.AbstractC11529j
        /* renamed from: a */
        public void mo861a(AbstractC11642c<?> abstractC11642c, Class<? extends Annotation> cls, List<Throwable> list) {
            if (!C11518a.m870e(abstractC11642c)) {
                list.add(new C11530b(abstractC11642c, cls, "must implement TestRule."));
            }
        }
    }

    /* renamed from: org.c.b.d.b.a$e */
    /* loaded from: classes2.dex */
    private static final class C11524e implements AbstractC11529j {
        private C11524e() {
        }

        @Override // org.p328c.p337b.p341d.p343b.C11518a.AbstractC11529j
        /* renamed from: a */
        public void mo861a(AbstractC11642c<?> abstractC11642c, Class<? extends Annotation> cls, List<Throwable> list) {
            boolean m869f = C11518a.m869f(abstractC11642c);
            boolean z = abstractC11642c.a((Class<Annotation>) AbstractC11687h.class) != null;
            if (abstractC11642c.m457g()) {
                if (!m869f && z) {
                    return;
                }
                list.add(new C11530b(abstractC11642c, cls, C11518a.m869f(abstractC11642c) ? "must not be static." : "must not be static or it must be annotated with @ClassRule."));
            }
        }
    }

    /* renamed from: org.c.b.d.b.a$f */
    /* loaded from: classes2.dex */
    private static final class C11525f implements AbstractC11529j {
        private C11525f() {
        }

        @Override // org.p328c.p337b.p341d.p343b.C11518a.AbstractC11529j
        /* renamed from: a */
        public void mo861a(AbstractC11642c<?> abstractC11642c, Class<? extends Annotation> cls, List<Throwable> list) {
            if (!abstractC11642c.m456h()) {
                list.add(new C11530b(abstractC11642c, cls, "must be public."));
            }
        }
    }

    /* renamed from: org.c.b.d.b.a$g */
    /* loaded from: classes2.dex */
    private static final class C11526g implements AbstractC11529j {
        private C11526g() {
        }

        @Override // org.p328c.p337b.p341d.p343b.C11518a.AbstractC11529j
        /* renamed from: a */
        public void mo861a(AbstractC11642c<?> abstractC11642c, Class<? extends Annotation> cls, List<Throwable> list) {
            if (!abstractC11642c.m457g()) {
                list.add(new C11530b(abstractC11642c, cls, "must be static."));
            }
        }
    }

    /* renamed from: org.c.b.d.b.a$h */
    /* loaded from: classes2.dex */
    private static final class C11527h implements AbstractC11529j {
        private C11527h() {
        }

        @Override // org.p328c.p337b.p341d.p343b.C11518a.AbstractC11529j
        /* renamed from: a */
        public void mo861a(AbstractC11642c<?> abstractC11642c, Class<? extends Annotation> cls, List<Throwable> list) {
            if (!C11518a.m871d(abstractC11642c)) {
                list.add(new C11530b(abstractC11642c, cls, "must return an implementation of MethodRule or TestRule."));
            }
        }
    }

    /* renamed from: org.c.b.d.b.a$i */
    /* loaded from: classes2.dex */
    private static final class C11528i implements AbstractC11529j {
        private C11528i() {
        }

        @Override // org.p328c.p337b.p341d.p343b.C11518a.AbstractC11529j
        /* renamed from: a */
        public void mo861a(AbstractC11642c<?> abstractC11642c, Class<? extends Annotation> cls, List<Throwable> list) {
            if (!C11518a.m870e(abstractC11642c)) {
                list.add(new C11530b(abstractC11642c, cls, "must return an implementation of TestRule."));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: org.c.b.d.b.a$j */
    /* loaded from: classes2.dex */
    public interface AbstractC11529j {
        /* renamed from: a */
        void mo861a(AbstractC11642c<?> abstractC11642c, Class<? extends Annotation> cls, List<Throwable> list);
    }

    C11518a(C11520a c11520a) {
        this.f36633e = c11520a.f36636a;
        this.f36634f = c11520a.f36637b;
        this.f36635g = c11520a.f36638c;
    }

    /* renamed from: a */
    private static C11520a m878a() {
        return new C11520a(AbstractC11687h.class);
    }

    /* renamed from: a */
    private void m876a(AbstractC11642c<?> abstractC11642c, List<Throwable> list) {
        for (AbstractC11529j abstractC11529j : this.f36635g) {
            abstractC11529j.mo861a(abstractC11642c, this.f36633e, list);
        }
    }

    /* renamed from: b */
    private static C11520a m874b() {
        return new C11520a(AbstractC11694l.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static boolean m871d(AbstractC11642c<?> abstractC11642c) {
        return m869f(abstractC11642c) || m870e(abstractC11642c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static boolean m870e(AbstractC11642c<?> abstractC11642c) {
        return AbstractC11585l.class.isAssignableFrom(abstractC11642c.mo444e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static boolean m869f(AbstractC11642c<?> abstractC11642c) {
        return AbstractC11576f.class.isAssignableFrom(abstractC11642c.mo444e());
    }

    /* renamed from: a */
    public void m875a(C11651k c11651k, List<Throwable> list) {
        for (AbstractC11642c<?> abstractC11642c : this.f36634f ? c11651k.m417b(this.f36633e) : c11651k.m413c(this.f36633e)) {
            m876a(abstractC11642c, list);
        }
    }
}
