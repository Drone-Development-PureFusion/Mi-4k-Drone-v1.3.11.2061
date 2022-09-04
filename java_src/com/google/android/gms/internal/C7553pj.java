package com.google.android.gms.internal;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
/* renamed from: com.google.android.gms.internal.pj */
/* loaded from: classes2.dex */
public final class C7553pj implements AbstractC7489ok {

    /* renamed from: a */
    private final C7500os f25077a;

    /* renamed from: b */
    private final AbstractC7458nq f25078b;

    /* renamed from: c */
    private final C7513ot f25079c;

    /* renamed from: com.google.android.gms.internal.pj$a */
    /* loaded from: classes2.dex */
    public static final class C7555a<T> extends AbstractC7488oj<T> {

        /* renamed from: a */
        private final AbstractC7525ox<T> f25086a;

        /* renamed from: b */
        private final Map<String, AbstractC7556b> f25087b;

        private C7555a(AbstractC7525ox<T> abstractC7525ox, Map<String, AbstractC7556b> map) {
            this.f25086a = abstractC7525ox;
            this.f25087b = map;
        }

        @Override // com.google.android.gms.internal.AbstractC7488oj
        /* renamed from: a */
        public void mo14173a(C7602ps c7602ps, T t) {
            if (t == null) {
                c7602ps.mo14095f();
                return;
            }
            c7602ps.mo14100d();
            try {
                for (AbstractC7556b abstractC7556b : this.f25087b.values()) {
                    if (abstractC7556b.mo14237a(t)) {
                        c7602ps.mo14109a(abstractC7556b.f25088g);
                        abstractC7556b.mo14238a(c7602ps, t);
                    }
                }
                c7602ps.mo14097e();
            } catch (IllegalAccessException e) {
                throw new AssertionError();
            }
        }

        @Override // com.google.android.gms.internal.AbstractC7488oj
        /* renamed from: b */
        public T mo14172b(C7598pp c7598pp) {
            if (c7598pp.mo14146f() == EnumC7600pq.NULL) {
                c7598pp.mo14142j();
                return null;
            }
            T mo14275a = this.f25086a.mo14275a();
            try {
                c7598pp.mo14152c();
                while (c7598pp.mo14147e()) {
                    AbstractC7556b abstractC7556b = this.f25087b.get(c7598pp.mo14145g());
                    if (abstractC7556b == null || !abstractC7556b.f25090i) {
                        c7598pp.mo14138n();
                    } else {
                        abstractC7556b.mo14239a(c7598pp, mo14275a);
                    }
                }
                c7598pp.mo14149d();
                return mo14275a;
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (IllegalStateException e2) {
                throw new C7481og(e2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.internal.pj$b */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC7556b {

        /* renamed from: g */
        final String f25088g;

        /* renamed from: h */
        final boolean f25089h;

        /* renamed from: i */
        final boolean f25090i;

        protected AbstractC7556b(String str, boolean z, boolean z2) {
            this.f25088g = str;
            this.f25089h = z;
            this.f25090i = z2;
        }

        /* renamed from: a */
        abstract void mo14239a(C7598pp c7598pp, Object obj);

        /* renamed from: a */
        abstract void mo14238a(C7602ps c7602ps, Object obj);

        /* renamed from: a */
        abstract boolean mo14237a(Object obj);
    }

    public C7553pj(C7500os c7500os, AbstractC7458nq abstractC7458nq, C7513ot c7513ot) {
        this.f25077a = c7500os;
        this.f25078b = abstractC7458nq;
        this.f25079c = c7513ot;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public AbstractC7488oj<?> m14245a(C7459nr c7459nr, Field field, C7597po<?> c7597po) {
        AbstractC7488oj<?> m14260a;
        AbstractC7490ol abstractC7490ol = (AbstractC7490ol) field.getAnnotation(AbstractC7490ol.class);
        return (abstractC7490ol == null || (m14260a = C7543pe.m14260a(this.f25077a, c7459nr, c7597po, abstractC7490ol)) == null) ? c7459nr.m14403a((C7597po) c7597po) : m14260a;
    }

    /* renamed from: a */
    private AbstractC7556b m14244a(final C7459nr c7459nr, final Field field, String str, final C7597po<?> c7597po, boolean z, boolean z2) {
        final boolean m14273a = C7526oy.m14273a((Type) c7597po.m14171a());
        return new AbstractC7556b(str, z, z2) { // from class: com.google.android.gms.internal.pj.1

            /* renamed from: a */
            final AbstractC7488oj<?> f25080a;

            {
                this.f25080a = C7553pj.this.m14245a(c7459nr, field, c7597po);
            }

            @Override // com.google.android.gms.internal.C7553pj.AbstractC7556b
            /* renamed from: a */
            void mo14239a(C7598pp c7598pp, Object obj) {
                Object mo14172b = this.f25080a.mo14172b(c7598pp);
                if (mo14172b != null || !m14273a) {
                    field.set(obj, mo14172b);
                }
            }

            @Override // com.google.android.gms.internal.C7553pj.AbstractC7556b
            /* renamed from: a */
            void mo14238a(C7602ps c7602ps, Object obj) {
                new C7561pm(c7459nr, this.f25080a, c7597po.m14168b()).mo14173a(c7602ps, (C7602ps) field.get(obj));
            }

            @Override // com.google.android.gms.internal.C7553pj.AbstractC7556b
            /* renamed from: a */
            public boolean mo14237a(Object obj) {
                return this.f25089h && field.get(obj) != obj;
            }
        };
    }

    /* renamed from: a */
    static List<String> m14247a(AbstractC7458nq abstractC7458nq, Field field) {
        AbstractC7491om abstractC7491om = (AbstractC7491om) field.getAnnotation(AbstractC7491om.class);
        LinkedList linkedList = new LinkedList();
        if (abstractC7491om == null) {
            linkedList.add(abstractC7458nq.mo14413a(field));
        } else {
            linkedList.add(abstractC7491om.m14334a());
            String[] m14333b = abstractC7491om.m14333b();
            for (String str : m14333b) {
                linkedList.add(str);
            }
        }
        return linkedList;
    }

    /* renamed from: a */
    private List<String> m14242a(Field field) {
        return m14247a(this.f25078b, field);
    }

    /* renamed from: a */
    private Map<String, AbstractC7556b> m14246a(C7459nr c7459nr, C7597po<?> c7597po, Class<?> cls) {
        Field[] declaredFields;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        Type m14168b = c7597po.m14168b();
        while (cls != Object.class) {
            for (Field field : cls.getDeclaredFields()) {
                boolean m14241a = m14241a(field, true);
                boolean m14241a2 = m14241a(field, false);
                if (m14241a || m14241a2) {
                    field.setAccessible(true);
                    Type m14323a = C7496or.m14323a(c7597po.m14168b(), cls, field.getGenericType());
                    List<String> m14242a = m14242a(field);
                    AbstractC7556b abstractC7556b = null;
                    int i = 0;
                    while (i < m14242a.size()) {
                        String str = m14242a.get(i);
                        if (i != 0) {
                            m14241a = false;
                        }
                        AbstractC7556b abstractC7556b2 = (AbstractC7556b) linkedHashMap.put(str, m14244a(c7459nr, field, str, C7597po.m14169a(m14323a), m14241a, m14241a2));
                        if (abstractC7556b != null) {
                            abstractC7556b2 = abstractC7556b;
                        }
                        i++;
                        abstractC7556b = abstractC7556b2;
                    }
                    if (abstractC7556b != null) {
                        String valueOf = String.valueOf(m14168b);
                        String str2 = abstractC7556b.f25088g;
                        throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 37 + String.valueOf(str2).length()).append(valueOf).append(" declares multiple JSON fields named ").append(str2).toString());
                    }
                }
            }
            c7597po = C7597po.m14169a(C7496or.m14323a(c7597po.m14168b(), cls, cls.getGenericSuperclass()));
            cls = c7597po.m14171a();
        }
        return linkedHashMap;
    }

    /* renamed from: a */
    static boolean m14240a(Field field, boolean z, C7513ot c7513ot) {
        return !c7513ot.m14296a(field.getType(), z) && !c7513ot.m14295a(field, z);
    }

    @Override // com.google.android.gms.internal.AbstractC7489ok
    /* renamed from: a */
    public <T> AbstractC7488oj<T> mo14182a(C7459nr c7459nr, C7597po<T> c7597po) {
        Class<? super T> m14171a = c7597po.m14171a();
        if (!Object.class.isAssignableFrom(m14171a)) {
            return null;
        }
        return new C7555a(this.f25077a.m14306a(c7597po), m14246a(c7459nr, (C7597po<?>) c7597po, (Class<?>) m14171a));
    }

    /* renamed from: a */
    public boolean m14241a(Field field, boolean z) {
        return m14240a(field, z, this.f25079c);
    }
}
