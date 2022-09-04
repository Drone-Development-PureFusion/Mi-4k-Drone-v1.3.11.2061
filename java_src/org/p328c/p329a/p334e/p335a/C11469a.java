package org.p328c.p329a.p334e.p335a;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.p328c.C11567d;
import org.p328c.p329a.p334e.AbstractC11468a;
import org.p328c.p329a.p334e.AbstractC11477b;
import org.p328c.p329a.p334e.AbstractC11482e;
import org.p328c.p329a.p334e.AbstractC11484g;
import org.p328c.p329a.p334e.C11481d;
import org.p328c.p350f.p351a.C11641b;
import org.p328c.p350f.p351a.C11643d;
import org.p328c.p350f.p351a.C11651k;
/* renamed from: org.c.a.e.a.a */
/* loaded from: classes.dex */
public class C11469a extends AbstractC11482e {

    /* renamed from: a */
    private final C11651k f36576a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: org.c.a.e.a.a$a */
    /* loaded from: classes.dex */
    public static class C11471a extends AbstractC11484g {

        /* renamed from: a */
        private final C11643d f36577a;

        private C11471a(C11643d c11643d) {
            this.f36577a = c11643d;
        }

        @Override // org.p328c.p329a.p334e.AbstractC11484g
        /* renamed from: a */
        public Object mo942a() {
            try {
                return this.f36577a.m455a((Object) null, new Object[0]);
            } catch (IllegalAccessException e) {
                throw new RuntimeException("unexpected: getMethods returned an inaccessible method");
            } catch (IllegalArgumentException e2) {
                throw new RuntimeException("unexpected: argument length is checked");
            } catch (Throwable th) {
                AbstractC11468a abstractC11468a = (AbstractC11468a) this.f36577a.mo424a((Class<Annotation>) AbstractC11468a.class);
                C11567d.m685a(abstractC11468a == null || !C11469a.m988b(abstractC11468a.m996b(), th));
                throw new AbstractC11484g.C11486a(th);
            }
        }

        @Override // org.p328c.p329a.p334e.AbstractC11484g
        /* renamed from: b */
        public String mo941b() {
            return this.f36577a.mo450b();
        }
    }

    public C11469a(C11651k c11651k) {
        this.f36576a = c11651k;
    }

    /* renamed from: a */
    private Object m994a(Field field) {
        try {
            return field.get(null);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("unexpected: getFields returned an inaccessible field");
        } catch (IllegalArgumentException e2) {
            throw new RuntimeException("unexpected: field from getClass doesn't exist on object");
        }
    }

    /* renamed from: a */
    private void m995a(Class<?> cls, C11481d c11481d, String str, List<AbstractC11484g> list, Object obj) {
        if (cls.isArray()) {
            m992a(c11481d, str, list, obj);
        } else if (!Iterable.class.isAssignableFrom(cls)) {
        } else {
            m993a(c11481d, str, list, (Iterable) obj);
        }
    }

    /* renamed from: a */
    private void m993a(C11481d c11481d, String str, List<AbstractC11484g> list, Iterable<?> iterable) {
        int i = 0;
        for (Object obj : iterable) {
            if (c11481d.m957a(obj)) {
                list.add(AbstractC11484g.m943a(str + "[" + i + "]", obj));
            }
            i++;
        }
    }

    /* renamed from: a */
    private void m992a(C11481d c11481d, String str, List<AbstractC11484g> list, Object obj) {
        for (int i = 0; i < Array.getLength(obj); i++) {
            Object obj2 = Array.get(obj, i);
            if (c11481d.m957a(obj2)) {
                list.add(AbstractC11484g.m943a(str + "[" + i + "]", obj2));
            }
        }
    }

    /* renamed from: a */
    private void m991a(C11481d c11481d, List<AbstractC11484g> list) {
        Iterator<C11643d> it2 = mo968b(c11481d).iterator();
        while (it2.hasNext()) {
            C11643d next = it2.next();
            Class<?> m442i = next.m442i();
            if ((m442i.isArray() && c11481d.m950b(m442i.getComponentType())) || Iterable.class.isAssignableFrom(m442i)) {
                try {
                    m995a(m442i, c11481d, next.mo450b(), list, next.m455a((Object) null, new Object[0]));
                } finally {
                }
            }
        }
    }

    /* renamed from: b */
    private void m989b(C11481d c11481d, List<AbstractC11484g> list) {
        for (C11643d c11643d : mo965e(c11481d)) {
            if (c11481d.m959a(c11643d.mo444e())) {
                list.add(new C11471a(c11643d));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static boolean m988b(Class<?>[] clsArr, Object obj) {
        for (Class<?> cls : clsArr) {
            if (cls.isAssignableFrom(obj.getClass())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private void m987c(C11481d c11481d, List<AbstractC11484g> list) {
        for (Field field : mo966d(c11481d)) {
            m995a(field.getType(), c11481d, field.getName(), list, m994a(field));
        }
    }

    /* renamed from: d */
    private void m986d(C11481d c11481d, List<AbstractC11484g> list) {
        for (Field field : mo967c(c11481d)) {
            Object m994a = m994a(field);
            if (c11481d.m957a(m994a)) {
                list.add(AbstractC11484g.m943a(field.getName(), m994a));
            }
        }
    }

    @Override // org.p328c.p329a.p334e.AbstractC11482e
    /* renamed from: a */
    public List<AbstractC11484g> mo945a(C11481d c11481d) {
        ArrayList arrayList = new ArrayList();
        m986d(c11481d, arrayList);
        m987c(c11481d, arrayList);
        m989b(c11481d, arrayList);
        m991a(c11481d, arrayList);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public Collection<C11643d> mo968b(C11481d c11481d) {
        return this.f36576a.m417b(AbstractC11477b.class);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public Collection<Field> mo967c(C11481d c11481d) {
        List<C11641b> m413c = this.f36576a.m413c(AbstractC11468a.class);
        ArrayList arrayList = new ArrayList();
        for (C11641b c11641b : m413c) {
            arrayList.add(c11641b.m459d());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public Collection<Field> mo966d(C11481d c11481d) {
        List<C11641b> m413c = this.f36576a.m413c(AbstractC11477b.class);
        ArrayList arrayList = new ArrayList();
        for (C11641b c11641b : m413c) {
            arrayList.add(c11641b.m459d());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public Collection<C11643d> mo965e(C11481d c11481d) {
        return this.f36576a.m417b(AbstractC11468a.class);
    }
}
