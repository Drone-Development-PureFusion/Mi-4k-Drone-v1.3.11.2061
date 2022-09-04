package com.xiaomi.channel.commonutils.reflect;

import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.xiaomi.channel.commonutils.reflect.a */
/* loaded from: classes2.dex */
public class C10426a {

    /* renamed from: a */
    private static final Map<Class<?>, Class<?>> f32377a = new HashMap();

    /* renamed from: com.xiaomi.channel.commonutils.reflect.a$a */
    /* loaded from: classes2.dex */
    public static class C10427a<T> {

        /* renamed from: a */
        public final Class<? extends T> f32378a;

        /* renamed from: b */
        public final T f32379b;
    }

    static {
        f32377a.put(Boolean.class, Boolean.TYPE);
        f32377a.put(Byte.class, Byte.TYPE);
        f32377a.put(Character.class, Character.TYPE);
        f32377a.put(Short.class, Short.TYPE);
        f32377a.put(Integer.class, Integer.TYPE);
        f32377a.put(Float.class, Float.TYPE);
        f32377a.put(Long.class, Long.TYPE);
        f32377a.put(Double.class, Double.TYPE);
        f32377a.put(Boolean.TYPE, Boolean.TYPE);
        f32377a.put(Byte.TYPE, Byte.TYPE);
        f32377a.put(Character.TYPE, Character.TYPE);
        f32377a.put(Short.TYPE, Short.TYPE);
        f32377a.put(Integer.TYPE, Integer.TYPE);
        f32377a.put(Float.TYPE, Float.TYPE);
        f32377a.put(Long.TYPE, Long.TYPE);
        f32377a.put(Double.TYPE, Double.TYPE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Class<? extends java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* renamed from: a */
    public static <T> T m5205a(Class<? extends Object> cls, Object obj, String str) {
        Field field = null;
        while (field == null) {
            try {
                field = cls.getDeclaredField(str);
                field.setAccessible(true);
                continue;
            } catch (NoSuchFieldException e) {
                cls = cls.getSuperclass();
                continue;
            }
            if (cls == 0) {
                throw new NoSuchFieldException();
            }
        }
        field.setAccessible(true);
        return (T) field.get(obj);
    }

    /* renamed from: a */
    public static <T> T m5204a(Class<? extends Object> cls, String str) {
        try {
            return (T) m5205a(cls, (Object) null, str);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return null;
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static <T> T m5202a(Class<?> cls, String str, Object... objArr) {
        return (T) m5203a(cls, str, m5197a(objArr)).invoke(null, m5194b(objArr));
    }

    /* renamed from: a */
    public static <T> T m5201a(Object obj, String str) {
        try {
            return (T) m5205a((Class<? extends Object>) obj.getClass(), obj, str);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return null;
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static <T> T m5200a(Object obj, String str, Object... objArr) {
        try {
            return (T) m5195b(obj, str, objArr);
        } catch (Exception e) {
            Log.w("JavaCalls", "Meet exception when call Method '" + str + "' in " + obj, e);
            return null;
        }
    }

    /* renamed from: a */
    public static <T> T m5199a(String str, String str2, Object... objArr) {
        try {
            return (T) m5202a(Class.forName(str), str2, objArr);
        } catch (Exception e) {
            Log.w("JavaCalls", "Meet exception when call Method '" + str2 + "' in " + str, e);
            return null;
        }
    }

    /* renamed from: a */
    private static Method m5203a(Class<?> cls, String str, Class<?>... clsArr) {
        Method m5196a = m5196a(cls.getDeclaredMethods(), str, clsArr);
        if (m5196a != null) {
            m5196a.setAccessible(true);
            return m5196a;
        } else if (cls.getSuperclass() == null) {
            throw new NoSuchMethodException();
        } else {
            return m5203a((Class<?>) cls.getSuperclass(), str, clsArr);
        }
    }

    /* renamed from: a */
    private static Method m5196a(Method[] methodArr, String str, Class<?>[] clsArr) {
        if (str == null) {
            throw new NullPointerException("Method name must not be null.");
        }
        for (Method method : methodArr) {
            if (method.getName().equals(str) && m5198a(method.getParameterTypes(), clsArr)) {
                return method;
            }
        }
        return null;
    }

    /* renamed from: a */
    private static boolean m5198a(Class<?>[] clsArr, Class<?>[] clsArr2) {
        if (clsArr == null) {
            return clsArr2 == null || clsArr2.length == 0;
        } else if (clsArr2 == null) {
            return clsArr.length == 0;
        } else if (clsArr.length != clsArr2.length) {
            return false;
        } else {
            for (int i = 0; i < clsArr.length; i++) {
                if (!clsArr[i].isAssignableFrom(clsArr2[i]) && (!f32377a.containsKey(clsArr[i]) || !f32377a.get(clsArr[i]).equals(f32377a.get(clsArr2[i])))) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: a */
    private static Class<?>[] m5197a(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        Class<?>[] clsArr = new Class[objArr.length];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= objArr.length) {
                return clsArr;
            }
            Object obj = objArr[i2];
            if (obj == null || !(obj instanceof C10427a)) {
                clsArr[i2] = obj == null ? null : obj.getClass();
            } else {
                clsArr[i2] = ((C10427a) obj).f32378a;
            }
            i = i2 + 1;
        }
    }

    /* renamed from: b */
    public static <T> T m5195b(Object obj, String str, Object... objArr) {
        return (T) m5203a(obj.getClass(), str, m5197a(objArr)).invoke(obj, m5194b(objArr));
    }

    /* renamed from: b */
    private static Object[] m5194b(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        Object[] objArr2 = new Object[objArr.length];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= objArr.length) {
                return objArr2;
            }
            Object obj = objArr[i2];
            if (obj == null || !(obj instanceof C10427a)) {
                objArr2[i2] = obj;
            } else {
                objArr2[i2] = ((C10427a) obj).f32379b;
            }
            i = i2 + 1;
        }
    }
}
