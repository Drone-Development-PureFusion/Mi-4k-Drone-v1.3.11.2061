package com.google.android.gms.internal;

import android.util.Log;
import com.google.firebase.database.AbstractC9873f;
import com.google.firebase.database.AbstractC9876h;
import com.google.firebase.database.AbstractC9877i;
import com.google.firebase.database.AbstractC9889m;
import com.google.firebase.database.AbstractC9896p;
import com.google.firebase.database.C9866d;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* renamed from: com.google.android.gms.internal.mm */
/* loaded from: classes2.dex */
public class C7395mm {

    /* renamed from: a */
    private static final ConcurrentMap<Class<?>, C7396a<?>> f24623a = new ConcurrentHashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.internal.mm$a */
    /* loaded from: classes2.dex */
    public static class C7396a<T> {

        /* renamed from: a */
        private final Class<T> f24624a;

        /* renamed from: b */
        private final Constructor<T> f24625b;

        /* renamed from: c */
        private final boolean f24626c;

        /* renamed from: d */
        private final boolean f24627d;

        /* renamed from: e */
        private final Map<String, String> f24628e;

        /* renamed from: f */
        private final Map<String, Method> f24629f;

        /* renamed from: g */
        private final Map<String, Method> f24630g;

        /* renamed from: h */
        private final Map<String, Field> f24631h;

        public C7396a(Class<T> cls) {
            Constructor<T> constructor;
            Method[] methods;
            Field[] fields;
            Method[] declaredMethods;
            Field[] declaredFields;
            this.f24624a = cls;
            this.f24626c = cls.isAnnotationPresent(AbstractC9896p.class);
            this.f24627d = !cls.isAnnotationPresent(AbstractC9877i.class);
            this.f24628e = new HashMap();
            this.f24630g = new HashMap();
            this.f24629f = new HashMap();
            this.f24631h = new HashMap();
            try {
                constructor = cls.getDeclaredConstructor(new Class[0]);
                constructor.setAccessible(true);
            } catch (NoSuchMethodException e) {
                constructor = null;
            }
            this.f24625b = constructor;
            for (Method method : cls.getMethods()) {
                if (m14566a(method)) {
                    String m14558c = m14558c(method);
                    m14569a(m14558c);
                    method.setAccessible(true);
                    if (this.f24629f.containsKey(m14558c)) {
                        String valueOf = String.valueOf(method.getName());
                        throw new C9866d(valueOf.length() != 0 ? "Found conflicting getters for name: ".concat(valueOf) : new String("Found conflicting getters for name: "));
                    }
                    this.f24629f.put(m14558c, method);
                }
            }
            for (Field field : cls.getFields()) {
                if (m14567a(field)) {
                    m14569a(m14560b(field));
                }
            }
            Class<T> cls2 = cls;
            while (true) {
                for (Method method2 : cls2.getDeclaredMethods()) {
                    if (m14559b(method2)) {
                        String m14558c2 = m14558c(method2);
                        String str = this.f24628e.get(m14558c2.toLowerCase());
                        if (str == null) {
                            continue;
                        } else if (!str.equals(m14558c2)) {
                            String valueOf2 = String.valueOf(method2.getName());
                            throw new C9866d(valueOf2.length() != 0 ? "Found setter with invalid case-sensitive name: ".concat(valueOf2) : new String("Found setter with invalid case-sensitive name: "));
                        } else {
                            Method method3 = this.f24630g.get(m14558c2);
                            if (method3 == null) {
                                method2.setAccessible(true);
                                this.f24630g.put(m14558c2, method2);
                            } else if (!m14565a(method2, method3)) {
                                String valueOf3 = String.valueOf(method2.getName());
                                String valueOf4 = String.valueOf(method3.getName());
                                String valueOf5 = String.valueOf(method3.getDeclaringClass().getName());
                                throw new C9866d(new StringBuilder(String.valueOf(valueOf3).length() + 69 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length()).append("Found a conflicting setters with name: ").append(valueOf3).append(" (conflicts with ").append(valueOf4).append(" defined on ").append(valueOf5).append(")").toString());
                            }
                        }
                    }
                }
                for (Field field2 : cls2.getDeclaredFields()) {
                    String m14560b = m14560b(field2);
                    if (this.f24628e.containsKey(m14560b.toLowerCase()) && !this.f24631h.containsKey(m14560b)) {
                        field2.setAccessible(true);
                        this.f24631h.put(m14560b, field2);
                    }
                }
                Class<T> superclass = cls2.getSuperclass();
                if (superclass == null || superclass.equals(Object.class)) {
                    break;
                }
                cls2 = superclass;
            }
            if (this.f24628e.isEmpty()) {
                String valueOf6 = String.valueOf(cls.getName());
                throw new C9866d(valueOf6.length() != 0 ? "No properties to serialize found on class ".concat(valueOf6) : new String("No properties to serialize found on class "));
            }
        }

        /* renamed from: a */
        private static String m14568a(AccessibleObject accessibleObject) {
            if (accessibleObject.isAnnotationPresent(AbstractC9889m.class)) {
                return ((AbstractC9889m) accessibleObject.getAnnotation(AbstractC9889m.class)).m6694a();
            }
            return null;
        }

        /* renamed from: a */
        private Type m14564a(Type type, Map<TypeVariable<Class<T>>, Type> map) {
            if (type instanceof TypeVariable) {
                Type type2 = map.get(type);
                if (type2 != null) {
                    return type2;
                }
                String valueOf = String.valueOf(type);
                throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 23).append("Could not resolve type ").append(valueOf).toString());
            }
            return type;
        }

        /* renamed from: a */
        private void m14569a(String str) {
            String put = this.f24628e.put(str.toLowerCase(), str);
            if (put == null || str.equals(put)) {
                return;
            }
            String valueOf = String.valueOf(str.toLowerCase());
            throw new C9866d(valueOf.length() != 0 ? "Found two getters or fields with conflicting case sensitivity for property: ".concat(valueOf) : new String("Found two getters or fields with conflicting case sensitivity for property: "));
        }

        /* renamed from: a */
        private static boolean m14567a(Field field) {
            return !field.getDeclaringClass().equals(Object.class) && Modifier.isPublic(field.getModifiers()) && !Modifier.isStatic(field.getModifiers()) && !Modifier.isTransient(field.getModifiers()) && !field.isAnnotationPresent(AbstractC9873f.class);
        }

        /* renamed from: a */
        private static boolean m14566a(Method method) {
            return (method.getName().startsWith("get") || method.getName().startsWith("is")) && !method.getDeclaringClass().equals(Object.class) && Modifier.isPublic(method.getModifiers()) && !Modifier.isStatic(method.getModifiers()) && !method.getReturnType().equals(Void.TYPE) && method.getParameterTypes().length == 0 && !method.isAnnotationPresent(AbstractC9873f.class);
        }

        /* renamed from: a */
        private static boolean m14565a(Method method, Method method2) {
            C7392mk.m14606a(method.getDeclaringClass().isAssignableFrom(method2.getDeclaringClass()), "Expected override from a base class");
            C7392mk.m14606a(method.getReturnType().equals(Void.TYPE), "Expected void return type");
            C7392mk.m14606a(method2.getReturnType().equals(Void.TYPE), "Expected void return type");
            Class<?>[] parameterTypes = method.getParameterTypes();
            Class<?>[] parameterTypes2 = method2.getParameterTypes();
            C7392mk.m14606a(parameterTypes.length == 1, "Expected exactly one parameter");
            C7392mk.m14606a(parameterTypes2.length == 1, "Expected exactly one parameter");
            return method.getName().equals(method2.getName()) && parameterTypes[0].equals(parameterTypes2[0]);
        }

        /* renamed from: b */
        private static String m14561b(String str) {
            String[] strArr = {"get", "set", "is"};
            String str2 = null;
            int i = 0;
            while (i < 3) {
                String str3 = strArr[i];
                if (!str.startsWith(str3)) {
                    str3 = str2;
                }
                i++;
                str2 = str3;
            }
            if (str2 == null) {
                String valueOf = String.valueOf(str);
                throw new IllegalArgumentException(valueOf.length() != 0 ? "Unknown Bean prefix for method: ".concat(valueOf) : new String("Unknown Bean prefix for method: "));
            }
            char[] charArray = str.substring(str2.length()).toCharArray();
            for (int i2 = 0; i2 < charArray.length && Character.isUpperCase(charArray[i2]); i2++) {
                charArray[i2] = Character.toLowerCase(charArray[i2]);
            }
            return new String(charArray);
        }

        /* renamed from: b */
        private static String m14560b(Field field) {
            String m14568a = m14568a((AccessibleObject) field);
            return m14568a != null ? m14568a : field.getName();
        }

        /* renamed from: b */
        private static boolean m14559b(Method method) {
            return method.getName().startsWith("set") && !method.getDeclaringClass().equals(Object.class) && !Modifier.isStatic(method.getModifiers()) && method.getReturnType().equals(Void.TYPE) && method.getParameterTypes().length == 1 && !method.isAnnotationPresent(AbstractC9873f.class);
        }

        /* renamed from: c */
        private static String m14558c(Method method) {
            String m14568a = m14568a((AccessibleObject) method);
            return m14568a != null ? m14568a : m14561b(method.getName());
        }

        /* renamed from: a */
        public T m14563a(Map<String, Object> map) {
            return m14562a(map, Collections.emptyMap());
        }

        /* renamed from: a */
        public T m14562a(Map<String, Object> map, Map<TypeVariable<Class<T>>, Type> map2) {
            if (this.f24625b == null) {
                String valueOf = String.valueOf(this.f24624a.getName());
                throw new C9866d(new StringBuilder(String.valueOf(valueOf).length() + 49).append("Class ").append(valueOf).append(" is missing a constructor with no arguments").toString());
            }
            try {
                T newInstance = this.f24625b.newInstance(new Object[0]);
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (this.f24630g.containsKey(key)) {
                        Method method = this.f24630g.get(key);
                        Type[] genericParameterTypes = method.getGenericParameterTypes();
                        if (genericParameterTypes.length != 1) {
                            throw new IllegalStateException("Setter does not have exactly one parameter");
                        }
                        try {
                            method.invoke(newInstance, C7395mm.m14582b(entry.getValue(), m14564a(genericParameterTypes[0], map2)));
                        } catch (IllegalAccessException e) {
                            throw new RuntimeException(e);
                        } catch (InvocationTargetException e2) {
                            throw new RuntimeException(e2);
                        }
                    } else if (this.f24631h.containsKey(key)) {
                        Field field = this.f24631h.get(key);
                        try {
                            field.set(newInstance, C7395mm.m14582b(entry.getValue(), m14564a(field.getGenericType(), map2)));
                        } catch (IllegalAccessException e3) {
                            throw new RuntimeException(e3);
                        }
                    } else {
                        String valueOf2 = String.valueOf(this.f24624a.getName());
                        String sb = new StringBuilder(String.valueOf(key).length() + 36 + String.valueOf(valueOf2).length()).append("No setter/field for ").append(key).append(" found on class ").append(valueOf2).toString();
                        if (this.f24628e.containsKey(key.toLowerCase())) {
                            sb = String.valueOf(sb).concat(" (fields/setters are case sensitive!)");
                        }
                        if (this.f24626c) {
                            throw new C9866d(sb);
                        }
                        if (this.f24627d) {
                            Log.w("ClassMapper", sb);
                        }
                    }
                }
                return newInstance;
            } catch (IllegalAccessException e4) {
                throw new RuntimeException(e4);
            } catch (InstantiationException e5) {
                throw new RuntimeException(e5);
            } catch (InvocationTargetException e6) {
                throw new RuntimeException(e6);
            }
        }

        /* renamed from: a */
        public Map<String, Object> m14570a(T t) {
            Object obj;
            if (!this.f24624a.isAssignableFrom(t.getClass())) {
                String valueOf = String.valueOf(t.getClass());
                String valueOf2 = String.valueOf(this.f24624a);
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 59 + String.valueOf(valueOf2).length()).append("Can't serialize object of class ").append(valueOf).append(" with BeanMapper for class ").append(valueOf2).toString());
            }
            HashMap hashMap = new HashMap();
            for (String str : this.f24628e.values()) {
                if (this.f24629f.containsKey(str)) {
                    try {
                        obj = this.f24629f.get(str).invoke(t, new Object[0]);
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    } catch (InvocationTargetException e2) {
                        throw new RuntimeException(e2);
                    }
                } else {
                    Field field = this.f24631h.get(str);
                    if (field == null) {
                        String valueOf3 = String.valueOf(str);
                        throw new IllegalStateException(valueOf3.length() != 0 ? "Bean property without field or getter:".concat(valueOf3) : new String("Bean property without field or getter:"));
                    }
                    try {
                        obj = field.get(t);
                    } catch (IllegalAccessException e3) {
                        throw new RuntimeException(e3);
                    }
                }
                hashMap.put(str, C7395mm.m14581c(obj));
            }
            return hashMap;
        }
    }

    /* renamed from: a */
    private static <T> C7396a<T> m14591a(Class<T> cls) {
        C7396a<T> c7396a = (C7396a<T>) f24623a.get(cls);
        if (c7396a == null) {
            C7396a<T> c7396a2 = new C7396a<>(cls);
            f24623a.put(cls, c7396a2);
            return c7396a2;
        }
        return c7396a;
    }

    /* renamed from: a */
    public static Object m14590a(Object obj) {
        return m14581c(obj);
    }

    /* renamed from: a */
    public static <T> T m14589a(Object obj, AbstractC9876h<T> abstractC9876h) {
        Type genericSuperclass = abstractC9876h.getClass().getGenericSuperclass();
        if (!(genericSuperclass instanceof ParameterizedType)) {
            String valueOf = String.valueOf(genericSuperclass);
            throw new C9866d(new StringBuilder(String.valueOf(valueOf).length() + 47).append("Not a direct subclass of GenericTypeIndicator: ").append(valueOf).toString());
        }
        ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
        if (parameterizedType.getRawType().equals(AbstractC9876h.class)) {
            return (T) m14582b(obj, parameterizedType.getActualTypeArguments()[0]);
        }
        String valueOf2 = String.valueOf(genericSuperclass);
        throw new C9866d(new StringBuilder(String.valueOf(valueOf2).length() + 47).append("Not a direct subclass of GenericTypeIndicator: ").append(valueOf2).toString());
    }

    /* renamed from: a */
    public static <T> T m14588a(Object obj, Class<T> cls) {
        return (T) m14583b(obj, (Class<Object>) cls);
    }

    /* JADX WARN: Type inference failed for: r0v26, types: [java.util.List, T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v8, types: [T, java.util.HashMap] */
    /* renamed from: a */
    private static <T> T m14587a(Object obj, ParameterizedType parameterizedType) {
        Class cls = (Class) parameterizedType.getRawType();
        if (List.class.isAssignableFrom(cls)) {
            Type type = parameterizedType.getActualTypeArguments()[0];
            if (!(obj instanceof List)) {
                String valueOf = String.valueOf(obj.getClass());
                throw new C9866d(new StringBuilder(String.valueOf(valueOf).length() + 47).append("Expected a List while deserializing, but got a ").append(valueOf).toString());
            }
            List<Object> list = (List) obj;
            ?? r0 = (T) new ArrayList(list.size());
            for (Object obj2 : list) {
                r0.add(m14582b(obj2, type));
            }
            return r0;
        } else if (Map.class.isAssignableFrom(cls)) {
            Type type2 = parameterizedType.getActualTypeArguments()[0];
            Type type3 = parameterizedType.getActualTypeArguments()[1];
            if (!type2.equals(String.class)) {
                String valueOf2 = String.valueOf(type2);
                throw new C9866d(new StringBuilder(String.valueOf(valueOf2).length() + 70).append("Only Maps with string keys are supported, but found Map with key type ").append(valueOf2).toString());
            }
            Map<String, Object> m14579d = m14579d(obj);
            ?? r2 = (T) new HashMap();
            for (Map.Entry<String, Object> entry : m14579d.entrySet()) {
                r2.put(entry.getKey(), m14582b(entry.getValue(), type3));
            }
            return r2;
        } else if (Collection.class.isAssignableFrom(cls)) {
            throw new C9866d("Collections are not supported, please use Lists instead");
        } else {
            Map<String, Object> m14579d2 = m14579d(obj);
            C7396a m14591a = m14591a(cls);
            HashMap hashMap = new HashMap();
            TypeVariable<Class<T>>[] typeParameters = m14591a.f24624a.getTypeParameters();
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            if (actualTypeArguments.length != typeParameters.length) {
                throw new IllegalStateException("Mismatched lengths for type variables and actual types");
            }
            for (int i = 0; i < typeParameters.length; i++) {
                hashMap.put(typeParameters[i], actualTypeArguments[i]);
            }
            return (T) m14591a.m14562a(m14579d2, hashMap);
        }
    }

    /* renamed from: a */
    public static Map<String, Object> m14585a(Map<String, Object> map) {
        Object m14581c = m14581c(map);
        C7392mk.m14607a(m14581c instanceof Map);
        return (Map) m14581c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    private static <T> T m14583b(Object obj, Class<T> cls) {
        if (obj == 0) {
            return null;
        }
        if (cls.isPrimitive() || Number.class.isAssignableFrom(cls) || Boolean.class.isAssignableFrom(cls) || Character.class.isAssignableFrom(cls)) {
            return (T) m14580c(obj, cls);
        }
        if (String.class.isAssignableFrom(cls)) {
            return (T) m14572i(obj);
        }
        if (cls.isArray()) {
            throw new C9866d("Converting to Arrays is not supported, please use Listsinstead");
        }
        if (cls.getTypeParameters().length <= 0) {
            return !cls.equals(Object.class) ? cls.isEnum() ? (T) m14578d(obj, cls) : (T) m14576e(obj, cls) : obj;
        }
        String valueOf = String.valueOf(cls.getName());
        throw new C9866d(new StringBuilder(String.valueOf(valueOf).length() + 75).append("Class ").append(valueOf).append(" has generic type parameters, please use GenericTypeIndicator instead").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static <T> T m14582b(Object obj, Type type) {
        if (obj == null) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return (T) m14587a(obj, (ParameterizedType) type);
        }
        if (type instanceof Class) {
            return (T) m14583b(obj, (Class<Object>) type);
        }
        if (type instanceof WildcardType) {
            throw new C9866d("Generic wildcard types are not supported");
        }
        if (type instanceof GenericArrayType) {
            throw new C9866d("Generic Arrays are not supported, please use Lists instead");
        }
        String valueOf = String.valueOf(type);
        throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 26).append("Unknown type encountered: ").append(valueOf).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static <T> Object m14581c(T t) {
        if (t == null) {
            return null;
        }
        if (t instanceof Number) {
            if (t instanceof Float) {
                return Double.valueOf(((Float) t).doubleValue());
            }
            if (t instanceof Short) {
                throw new C9866d("Shorts are not supported, please use int or long");
            }
            if (!(t instanceof Byte)) {
                return t;
            }
            throw new C9866d("Bytes are not supported, please use int or long");
        } else if ((t instanceof String) || (t instanceof Boolean)) {
            return t;
        } else {
            if (t instanceof Character) {
                throw new C9866d("Characters are not supported, please strings");
            }
            if (t instanceof Map) {
                HashMap hashMap = new HashMap();
                for (Map.Entry entry : ((Map) t).entrySet()) {
                    Object key = entry.getKey();
                    if (!(key instanceof String)) {
                        throw new C9866d("Maps with non-string keys are not supported");
                    }
                    hashMap.put((String) key, m14581c(entry.getValue()));
                }
                return hashMap;
            } else if (!(t instanceof Collection)) {
                if (t.getClass().isArray()) {
                    throw new C9866d("Serializing Arrays is not supported, please use Lists instead");
                }
                return t instanceof Enum ? ((Enum) t).name() : m14591a((Class) t.getClass()).m14570a((C7396a) t);
            } else if (!(t instanceof List)) {
                throw new C9866d("Serializing Collections is not supported, please use Lists instead");
            } else {
                List<Object> list = (List) t;
                ArrayList arrayList = new ArrayList(list.size());
                for (Object obj : list) {
                    arrayList.add(m14581c(obj));
                }
                return arrayList;
            }
        }
    }

    /* renamed from: c */
    private static <T> T m14580c(Object obj, Class<T> cls) {
        if (Integer.class.isAssignableFrom(cls) || Integer.TYPE.isAssignableFrom(cls)) {
            return (T) m14577e(obj);
        }
        if (Boolean.class.isAssignableFrom(cls) || Boolean.TYPE.isAssignableFrom(cls)) {
            return (T) m14573h(obj);
        }
        if (Double.class.isAssignableFrom(cls) || Double.TYPE.isAssignableFrom(cls)) {
            return (T) m14574g(obj);
        }
        if (Long.class.isAssignableFrom(cls) || Long.TYPE.isAssignableFrom(cls)) {
            return (T) m14575f(obj);
        }
        if (Float.class.isAssignableFrom(cls) || Float.TYPE.isAssignableFrom(cls)) {
            return (T) Float.valueOf(m14574g(obj).floatValue());
        }
        if (Short.class.isAssignableFrom(cls) || Short.TYPE.isAssignableFrom(cls)) {
            throw new C9866d("Deserializing to shorts is not supported");
        }
        if (Byte.class.isAssignableFrom(cls) || Byte.TYPE.isAssignableFrom(cls)) {
            throw new C9866d("Deserializing to bytes is not supported");
        }
        if (Character.class.isAssignableFrom(cls) || Character.TYPE.isAssignableFrom(cls)) {
            throw new C9866d("Deserializing to char is not supported");
        }
        String valueOf = String.valueOf(cls);
        throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 24).append("Unknown primitive type: ").append(valueOf).toString());
    }

    /* renamed from: d */
    private static <T> T m14578d(Object obj, Class<T> cls) {
        if (!(obj instanceof String)) {
            String valueOf = String.valueOf(cls);
            String valueOf2 = String.valueOf(obj.getClass());
            throw new C9866d(new StringBuilder(String.valueOf(valueOf).length() + 57 + String.valueOf(valueOf2).length()).append("Expected a String while deserializing to enum ").append(valueOf).append(" but got a ").append(valueOf2).toString());
        }
        String str = (String) obj;
        try {
            return (T) Enum.valueOf(cls, str);
        } catch (IllegalArgumentException e) {
            String valueOf3 = String.valueOf(cls.getName());
            throw new C9866d(new StringBuilder(String.valueOf(valueOf3).length() + 42 + String.valueOf(str).length()).append("Could not find enum value of ").append(valueOf3).append(" for value \"").append(str).append("\"").toString());
        }
    }

    /* renamed from: d */
    private static Map<String, Object> m14579d(Object obj) {
        if (obj instanceof Map) {
            return (Map) obj;
        }
        String valueOf = String.valueOf(obj.getClass());
        throw new C9866d(new StringBuilder(String.valueOf(valueOf).length() + 46).append("Expected a Map while deserializing, but got a ").append(valueOf).toString());
    }

    /* renamed from: e */
    private static Integer m14577e(Object obj) {
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        if (!(obj instanceof Long) && !(obj instanceof Double)) {
            String valueOf = String.valueOf(obj.getClass().getName());
            throw new C9866d(new StringBuilder(String.valueOf(valueOf).length() + 41).append("Failed to convert a value of type ").append(valueOf).append(" to int").toString());
        }
        double doubleValue = ((Number) obj).doubleValue();
        if (doubleValue >= -2.147483648E9d && doubleValue <= 2.147483647E9d) {
            return Integer.valueOf(((Number) obj).intValue());
        }
        throw new C9866d(new StringBuilder(124).append("Numeric value out of 32-bit integer range: ").append(doubleValue).append(". Did you mean to use a long or double instead of an int?").toString());
    }

    /* renamed from: e */
    private static <T> T m14576e(Object obj, Class<T> cls) {
        C7396a m14591a = m14591a((Class) cls);
        if (obj instanceof Map) {
            return (T) m14591a.m14563a(m14579d(obj));
        }
        String valueOf = String.valueOf(obj.getClass().getName());
        String valueOf2 = String.valueOf(cls.getName());
        throw new C9866d(new StringBuilder(String.valueOf(valueOf).length() + 38 + String.valueOf(valueOf2).length()).append("Can't convert object of type ").append(valueOf).append(" to type ").append(valueOf2).toString());
    }

    /* renamed from: f */
    private static Long m14575f(Object obj) {
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).longValue());
        }
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (!(obj instanceof Double)) {
            String valueOf = String.valueOf(obj.getClass().getName());
            throw new C9866d(new StringBuilder(String.valueOf(valueOf).length() + 42).append("Failed to convert a value of type ").append(valueOf).append(" to long").toString());
        }
        Double d = (Double) obj;
        if (d.doubleValue() >= -9.223372036854776E18d && d.doubleValue() <= 9.223372036854776E18d) {
            return Long.valueOf(d.longValue());
        }
        String valueOf2 = String.valueOf(d);
        throw new C9866d(new StringBuilder(String.valueOf(valueOf2).length() + 89).append("Numeric value out of 64-bit long range: ").append(valueOf2).append(". Did you mean to use a double instead of a long?").toString());
    }

    /* renamed from: g */
    private static Double m14574g(Object obj) {
        if (obj instanceof Integer) {
            return Double.valueOf(((Integer) obj).doubleValue());
        }
        if (!(obj instanceof Long)) {
            if (obj instanceof Double) {
                return (Double) obj;
            }
            String valueOf = String.valueOf(obj.getClass().getName());
            throw new C9866d(new StringBuilder(String.valueOf(valueOf).length() + 44).append("Failed to convert a value of type ").append(valueOf).append(" to double").toString());
        }
        Double valueOf2 = Double.valueOf(((Long) obj).doubleValue());
        if (valueOf2.longValue() == ((Long) obj).longValue()) {
            return valueOf2;
        }
        String valueOf3 = String.valueOf(obj);
        throw new C9866d(new StringBuilder(String.valueOf(valueOf3).length() + 97).append("Loss of precision while converting number to double: ").append(valueOf3).append(". Did you mean to use a 64-bit long instead?").toString());
    }

    /* renamed from: h */
    private static Boolean m14573h(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        String valueOf = String.valueOf(obj.getClass().getName());
        throw new C9866d(new StringBuilder(String.valueOf(valueOf).length() + 43).append("Failed to convert value of type ").append(valueOf).append(" to boolean").toString());
    }

    /* renamed from: i */
    private static String m14572i(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        String valueOf = String.valueOf(obj.getClass().getName());
        throw new C9866d(new StringBuilder(String.valueOf(valueOf).length() + 42).append("Failed to convert value of type ").append(valueOf).append(" to String").toString());
    }
}
