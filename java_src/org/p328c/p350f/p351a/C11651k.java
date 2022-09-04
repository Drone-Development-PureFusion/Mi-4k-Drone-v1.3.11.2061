package org.p328c.p350f.p351a;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import org.p328c.AbstractC11638f;
import org.p328c.AbstractC11675g;
import org.p328c.C11565c;
import org.p328c.p337b.C11559h;
/* renamed from: org.c.f.a.k */
/* loaded from: classes.dex */
public class C11651k implements AbstractC11640a {

    /* renamed from: a */
    private static final C11653a f36793a = new C11653a();

    /* renamed from: b */
    private static final C11654b f36794b = new C11654b();

    /* renamed from: c */
    private final Class<?> f36795c;

    /* renamed from: d */
    private final Map<Class<? extends Annotation>, List<C11643d>> f36796d;

    /* renamed from: e */
    private final Map<Class<? extends Annotation>, List<C11641b>> f36797e;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: org.c.f.a.k$a */
    /* loaded from: classes2.dex */
    public static class C11653a implements Comparator<Field> {
        private C11653a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(Field field, Field field2) {
            return field.getName().compareTo(field2.getName());
        }
    }

    /* renamed from: org.c.f.a.k$b */
    /* loaded from: classes2.dex */
    private static class C11654b implements Comparator<C11643d> {
        private C11654b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(C11643d c11643d, C11643d c11643d2) {
            return C11559h.f36684b.compare(c11643d.m445d(), c11643d2.m445d());
        }
    }

    public C11651k(Class<?> cls) {
        this.f36795c = cls;
        if (cls == null || cls.getConstructors().length <= 1) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            m420a(linkedHashMap, linkedHashMap2);
            this.f36796d = m422a(linkedHashMap);
            this.f36797e = m422a(linkedHashMap2);
            return;
        }
        throw new IllegalArgumentException("Test class can only have one constructor");
    }

    /* renamed from: a */
    private static <T> List<T> m421a(Map<Class<? extends Annotation>, List<T>> map, Class<? extends Annotation> cls, boolean z) {
        if (!map.containsKey(cls) && z) {
            map.put(cls, new ArrayList());
        }
        List<T> list = map.get(cls);
        return list == null ? Collections.emptyList() : list;
    }

    /* renamed from: a */
    private static <T extends AbstractC11642c<T>> Map<Class<? extends Annotation>, List<T>> m422a(Map<Class<? extends Annotation>, List<T>> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<Class<? extends Annotation>, List<T>> entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), Collections.unmodifiableList(entry.getValue()));
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }

    /* renamed from: a */
    protected static <T extends AbstractC11642c<T>> void m419a(T t, Map<Class<? extends Annotation>, List<T>> map) {
        for (Annotation annotation : t.a()) {
            Class<? extends Annotation> annotationType = annotation.annotationType();
            List<T> m421a = m421a((Map) map, annotationType, true);
            if (t.m458a(m421a)) {
                return;
            }
            if (m409e(annotationType)) {
                m421a.add(0, t);
            } else {
                m421a.add(t);
            }
        }
    }

    /* renamed from: b */
    private <T> List<T> m415b(Map<?, List<T>> map) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (List<T> list : map.values()) {
            linkedHashSet.addAll(list);
        }
        return new ArrayList(linkedHashSet);
    }

    /* renamed from: d */
    private static Field[] m411d(Class<?> cls) {
        Field[] declaredFields = cls.getDeclaredFields();
        Arrays.sort(declaredFields, f36793a);
        return declaredFields;
    }

    /* renamed from: e */
    private static boolean m409e(Class<? extends Annotation> cls) {
        return cls.equals(AbstractC11638f.class) || cls.equals(AbstractC11675g.class);
    }

    /* renamed from: f */
    private static List<Class<?>> m407f(Class<?> cls) {
        ArrayList arrayList = new ArrayList();
        while (cls != null) {
            arrayList.add(cls);
            cls = cls.getSuperclass();
        }
        return arrayList;
    }

    @Override // org.p328c.p350f.p351a.AbstractC11640a
    /* renamed from: a */
    public <T extends Annotation> T mo424a(Class<T> cls) {
        if (this.f36795c == null) {
            return null;
        }
        return (T) this.f36795c.getAnnotation(cls);
    }

    /* renamed from: a */
    public <T> List<T> m423a(Object obj, Class<? extends Annotation> cls, Class<T> cls2) {
        ArrayList arrayList = new ArrayList();
        for (C11641b c11641b : m413c(cls)) {
            try {
                Object m461a = c11641b.m461a(obj);
                if (cls2.isInstance(m461a)) {
                    arrayList.add(cls2.cast(m461a));
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException("How did getFields return a field we couldn't access?", e);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    protected void m420a(Map<Class<? extends Annotation>, List<C11643d>> map, Map<Class<? extends Annotation>, List<C11641b>> map2) {
        for (Class<?> cls : m407f(this.f36795c)) {
            for (Method method : C11559h.m780a(cls)) {
                m419a(new C11643d(method), map);
            }
            Field[] m411d = m411d(cls);
            for (Field field : m411d) {
                m419a(new C11641b(field), map2);
            }
        }
    }

    @Override // org.p328c.p350f.p351a.AbstractC11640a
    /* renamed from: a */
    public Annotation[] mo425a() {
        return this.f36795c == null ? new Annotation[0] : this.f36795c.getAnnotations();
    }

    /* renamed from: b */
    public List<C11643d> m418b() {
        List<C11643d> m415b = m415b(this.f36796d);
        Collections.sort(m415b, f36794b);
        return m415b;
    }

    /* renamed from: b */
    public List<C11643d> m417b(Class<? extends Annotation> cls) {
        return Collections.unmodifiableList(m421a((Map) this.f36796d, cls, false));
    }

    /* renamed from: b */
    public <T> List<T> m416b(Object obj, Class<? extends Annotation> cls, Class<T> cls2) {
        ArrayList arrayList = new ArrayList();
        for (C11643d c11643d : m417b(cls)) {
            try {
                if (cls2.isAssignableFrom(c11643d.m442i())) {
                    arrayList.add(cls2.cast(c11643d.m455a(obj, new Object[0])));
                }
            } catch (Throwable th) {
                throw new RuntimeException("Exception in " + c11643d.mo450b(), th);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public List<C11641b> m414c() {
        return m415b(this.f36797e);
    }

    /* renamed from: c */
    public List<C11641b> m413c(Class<? extends Annotation> cls) {
        return Collections.unmodifiableList(m421a((Map) this.f36797e, cls, false));
    }

    /* renamed from: d */
    public Class<?> m412d() {
        return this.f36795c;
    }

    /* renamed from: e */
    public String m410e() {
        return this.f36795c == null ? "null" : this.f36795c.getName();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f36795c == ((C11651k) obj).f36795c;
    }

    /* renamed from: f */
    public Constructor<?> m408f() {
        Constructor<?>[] constructors = this.f36795c.getConstructors();
        C11565c.m727b(1L, constructors.length);
        return constructors[0];
    }

    /* renamed from: g */
    public boolean m406g() {
        return Modifier.isPublic(this.f36795c.getModifiers());
    }

    /* renamed from: h */
    public boolean m405h() {
        return this.f36795c.isMemberClass() && !Modifier.isStatic(this.f36795c.getModifiers());
    }

    public int hashCode() {
        if (this.f36795c == null) {
            return 0;
        }
        return this.f36795c.hashCode();
    }
}
