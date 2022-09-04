package org.p328c.p329a.p334e;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* renamed from: org.c.a.e.d */
/* loaded from: classes.dex */
public class C11481d {

    /* renamed from: a */
    private static final Map<Class<?>, Class<?>> f36582a = m949c();

    /* renamed from: b */
    private final Class<?> f36583b;

    /* renamed from: c */
    private final Annotation[] f36584c;

    private C11481d(Class<?> cls, Annotation[] annotationArr) {
        this.f36583b = cls;
        this.f36584c = annotationArr;
    }

    /* renamed from: a */
    private <T extends Annotation> T m952a(Annotation[] annotationArr, Class<T> cls, int i) {
        if (i == 0) {
            return null;
        }
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return cls.cast(annotation);
            }
            Annotation m952a = m952a(annotation.annotationType().getAnnotations(), cls, i - 1);
            if (m952a != null) {
                return cls.cast(m952a);
            }
        }
        return null;
    }

    /* renamed from: a */
    public static ArrayList<C11481d> m955a(Method method) {
        return m953a(method.getParameterTypes(), method.getParameterAnnotations());
    }

    /* renamed from: a */
    private static ArrayList<C11481d> m953a(Class<?>[] clsArr, Annotation[][] annotationArr) {
        ArrayList<C11481d> arrayList = new ArrayList<>();
        for (int i = 0; i < clsArr.length; i++) {
            arrayList.add(new C11481d(clsArr[i], annotationArr[i]));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static List<C11481d> m956a(Constructor<?> constructor) {
        return m953a(constructor.getParameterTypes(), constructor.getParameterAnnotations());
    }

    /* renamed from: a */
    private static <T> void m954a(Map<T, T> map, T t, T t2) {
        map.put(t, t2);
        map.put(t2, t);
    }

    /* renamed from: a */
    private boolean m958a(Class<?> cls, Class<?> cls2) {
        if (f36582a.containsKey(cls2)) {
            return cls.isAssignableFrom(f36582a.get(cls2));
        }
        return false;
    }

    /* renamed from: c */
    private static Map<Class<?>, Class<?>> m949c() {
        HashMap hashMap = new HashMap();
        m954a(hashMap, Boolean.TYPE, Boolean.class);
        m954a(hashMap, Byte.TYPE, Byte.class);
        m954a(hashMap, Short.TYPE, Short.class);
        m954a(hashMap, Character.TYPE, Character.class);
        m954a(hashMap, Integer.TYPE, Integer.class);
        m954a(hashMap, Long.TYPE, Long.class);
        m954a(hashMap, Float.TYPE, Float.class);
        m954a(hashMap, Double.TYPE, Double.class);
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: a */
    public Class<?> m960a() {
        return this.f36583b;
    }

    /* renamed from: a */
    public boolean m959a(Class<?> cls) {
        return this.f36583b.isAssignableFrom(cls) || m958a(this.f36583b, cls);
    }

    /* renamed from: a */
    public boolean m957a(Object obj) {
        return obj == null ? !this.f36583b.isPrimitive() : m959a(obj.getClass());
    }

    /* renamed from: b */
    public List<Annotation> m951b() {
        return Arrays.asList(this.f36584c);
    }

    /* renamed from: b */
    public boolean m950b(Class<?> cls) {
        return cls.isAssignableFrom(this.f36583b) || m958a(cls, this.f36583b) || m959a(cls);
    }

    /* renamed from: c */
    public boolean m948c(Class<? extends Annotation> cls) {
        return m946e(cls) != null;
    }

    /* renamed from: d */
    public <T extends Annotation> T m947d(Class<T> cls) {
        return (T) m952a(this.f36584c, cls, 3);
    }

    /* renamed from: e */
    public <T extends Annotation> T m946e(Class<T> cls) {
        for (Annotation annotation : m951b()) {
            if (cls.isInstance(annotation)) {
                return cls.cast(annotation);
            }
        }
        return null;
    }
}
