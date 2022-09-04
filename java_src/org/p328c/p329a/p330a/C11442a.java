package org.p328c.p329a.p330a;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.p328c.p347e.C11622c;
import org.p328c.p347e.p348a.AbstractC11598a;
import org.p328c.p347e.p348a.C11603c;
import org.p328c.p350f.C11673g;
import org.p328c.p350f.p351a.AbstractC11648h;
import org.p328c.p350f.p351a.C11645e;
/* renamed from: org.c.a.a.a */
/* loaded from: classes.dex */
public class C11442a extends C11673g {

    /* renamed from: org.c.a.a.a$a */
    /* loaded from: classes.dex */
    public static class C11443a extends AbstractC11598a {

        /* renamed from: b */
        private final Set<Class<?>> f36554b;

        /* renamed from: c */
        private final Set<Class<?>> f36555c;

        /* renamed from: d */
        private final boolean f36556d;

        /* renamed from: e */
        private final boolean f36557e;

        /* JADX INFO: Access modifiers changed from: protected */
        public C11443a(boolean z, Set<Class<?>> set, boolean z2, Set<Class<?>> set2) {
            this.f36556d = z;
            this.f36557e = z2;
            this.f36554b = m1054a(set);
            this.f36555c = m1054a(set2);
        }

        /* renamed from: a */
        private static Set<Class<?>> m1054a(Set<Class<?>> set) {
            HashSet hashSet = new HashSet();
            if (set != null) {
                hashSet.addAll(set);
            }
            hashSet.remove(null);
            return hashSet;
        }

        /* renamed from: a */
        public static C11443a m1055a(Class<?> cls) {
            return m1051a(true, (Class<?>[]) new Class[]{cls});
        }

        /* renamed from: a */
        public static C11443a m1052a(boolean z, Set<Class<?>> set, boolean z2, Set<Class<?>> set2) {
            return new C11443a(z, set, z2, set2);
        }

        /* renamed from: a */
        public static C11443a m1051a(boolean z, Class<?>... clsArr) {
            if (m1044c(clsArr)) {
                throw new NullPointerException("has null category");
            }
            return m1052a(z, C11442a.m1060b(clsArr), true, null);
        }

        /* renamed from: a */
        public static C11443a m1050a(Class<?>... clsArr) {
            return m1051a(true, clsArr);
        }

        /* renamed from: a */
        private boolean m1053a(Set<Class<?>> set, Set<Class<?>> set2) {
            for (Class<?> cls : set2) {
                if (C11442a.m1062b(set, cls)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        public static C11443a m1049b(Class<?> cls) {
            return m1047b(true, (Class<?>[]) new Class[]{cls});
        }

        /* renamed from: b */
        public static C11443a m1047b(boolean z, Class<?>... clsArr) {
            if (m1044c(clsArr)) {
                throw new NullPointerException("has null category");
            }
            return m1052a(true, null, z, C11442a.m1060b(clsArr));
        }

        /* renamed from: b */
        public static C11443a m1046b(Class<?>... clsArr) {
            return m1047b(true, clsArr);
        }

        /* renamed from: b */
        private boolean m1048b(Set<Class<?>> set, Set<Class<?>> set2) {
            for (Class<?> cls : set2) {
                if (!C11442a.m1062b(set, cls)) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: c */
        private boolean m1045c(C11622c c11622c) {
            Set<Class<?>> m1043d = m1043d(c11622c);
            if (m1043d.isEmpty()) {
                return this.f36554b.isEmpty();
            }
            if (!this.f36555c.isEmpty()) {
                if (this.f36557e) {
                    if (m1053a(m1043d, this.f36555c)) {
                        return false;
                    }
                } else if (m1048b(m1043d, this.f36555c)) {
                    return false;
                }
            }
            if (this.f36554b.isEmpty()) {
                return true;
            }
            return this.f36556d ? m1053a(m1043d, this.f36554b) : m1048b(m1043d, this.f36554b);
        }

        /* renamed from: c */
        private static boolean m1044c(Class<?>... clsArr) {
            if (clsArr == null) {
                return false;
            }
            for (Class<?> cls : clsArr) {
                if (cls == null) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: d */
        private static Set<Class<?>> m1043d(C11622c c11622c) {
            HashSet hashSet = new HashSet();
            Collections.addAll(hashSet, m1041f(c11622c));
            Collections.addAll(hashSet, m1041f(m1042e(c11622c)));
            return hashSet;
        }

        /* renamed from: e */
        private static C11622c m1042e(C11622c c11622c) {
            Class<?> m533i = c11622c.m533i();
            if (m533i == null) {
                return null;
            }
            return C11622c.m550a(m533i);
        }

        /* renamed from: f */
        private static Class<?>[] m1041f(C11622c c11622c) {
            if (c11622c == null) {
                return new Class[0];
            }
            AbstractC11446b abstractC11446b = (AbstractC11446b) c11622c.m540b(AbstractC11446b.class);
            return abstractC11446b == null ? new Class[0] : abstractC11446b.m1036a();
        }

        @Override // org.p328c.p347e.p348a.AbstractC11598a
        /* renamed from: a */
        public String mo580a() {
            return toString();
        }

        @Override // org.p328c.p347e.p348a.AbstractC11598a
        /* renamed from: a */
        public boolean mo579a(C11622c c11622c) {
            if (m1045c(c11622c)) {
                return true;
            }
            Iterator<C11622c> it2 = c11622c.m541b().iterator();
            while (it2.hasNext()) {
                if (mo579a(it2.next())) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            StringBuilder append = new StringBuilder("categories ").append(this.f36554b.isEmpty() ? "[all]" : this.f36554b);
            if (!this.f36555c.isEmpty()) {
                append.append(" - ").append(this.f36555c);
            }
            return append.toString();
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: org.c.a.a.a$b */
    /* loaded from: classes.dex */
    public @interface AbstractC11444b {
        /* renamed from: a */
        Class<?>[] m1040a() default {};

        /* renamed from: b */
        boolean m1039b() default true;
    }

    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: org.c.a.a.a$c */
    /* loaded from: classes.dex */
    public @interface AbstractC11445c {
        /* renamed from: a */
        Class<?>[] m1038a() default {};

        /* renamed from: b */
        boolean m1037b() default true;
    }

    public C11442a(Class<?> cls, AbstractC11648h abstractC11648h) {
        super(cls, abstractC11648h);
        try {
            a(C11443a.m1052a(m1059c(cls), m1063b(cls), m1056e(cls), m1057d(cls)));
            m1065a(d());
        } catch (C11603c e) {
            throw new C11645e(e);
        }
    }

    /* renamed from: a */
    private static void m1065a(C11622c c11622c) {
        if (!m1058c(c11622c)) {
            m1061b(c11622c);
        }
        Iterator<C11622c> it2 = c11622c.m541b().iterator();
        while (it2.hasNext()) {
            m1065a(it2.next());
        }
    }

    /* renamed from: b */
    private static Set<Class<?>> m1063b(Class<?> cls) {
        AbstractC11445c abstractC11445c = (AbstractC11445c) cls.getAnnotation(AbstractC11445c.class);
        return m1060b(abstractC11445c == null ? null : abstractC11445c.m1038a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static Set<Class<?>> m1060b(Class<?>... clsArr) {
        HashSet hashSet = new HashSet();
        if (clsArr != null) {
            Collections.addAll(hashSet, clsArr);
        }
        return hashSet;
    }

    /* renamed from: b */
    private static void m1061b(C11622c c11622c) {
        Iterator<C11622c> it2 = c11622c.m541b().iterator();
        while (it2.hasNext()) {
            C11622c next = it2.next();
            if (next.m540b(AbstractC11446b.class) != null) {
                throw new C11645e("Category annotations on Parameterized classes are not supported on individual methods.");
            }
            m1061b(next);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static boolean m1062b(Set<Class<?>> set, Class<?> cls) {
        for (Class<?> cls2 : set) {
            if (cls.isAssignableFrom(cls2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private static boolean m1059c(Class<?> cls) {
        AbstractC11445c abstractC11445c = (AbstractC11445c) cls.getAnnotation(AbstractC11445c.class);
        return abstractC11445c == null || abstractC11445c.m1037b();
    }

    /* renamed from: c */
    private static boolean m1058c(C11622c c11622c) {
        Iterator<C11622c> it2 = c11622c.m541b().iterator();
        while (it2.hasNext()) {
            if (it2.next().m533i() == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    private static Set<Class<?>> m1057d(Class<?> cls) {
        AbstractC11444b abstractC11444b = (AbstractC11444b) cls.getAnnotation(AbstractC11444b.class);
        return m1060b(abstractC11444b == null ? null : abstractC11444b.m1040a());
    }

    /* renamed from: e */
    private static boolean m1056e(Class<?> cls) {
        AbstractC11444b abstractC11444b = (AbstractC11444b) cls.getAnnotation(AbstractC11444b.class);
        return abstractC11444b == null || abstractC11444b.m1039b();
    }
}
