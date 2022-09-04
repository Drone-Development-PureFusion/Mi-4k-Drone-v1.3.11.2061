package com.google.android.gms.internal;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.google.android.gms.internal.oy */
/* loaded from: classes2.dex */
public final class C7526oy {

    /* renamed from: a */
    private static final Map<Class<?>, Class<?>> f25038a;

    /* renamed from: b */
    private static final Map<Class<?>, Class<?>> f25039b;

    static {
        HashMap hashMap = new HashMap(16);
        HashMap hashMap2 = new HashMap(16);
        m14272a(hashMap, hashMap2, Boolean.TYPE, Boolean.class);
        m14272a(hashMap, hashMap2, Byte.TYPE, Byte.class);
        m14272a(hashMap, hashMap2, Character.TYPE, Character.class);
        m14272a(hashMap, hashMap2, Double.TYPE, Double.class);
        m14272a(hashMap, hashMap2, Float.TYPE, Float.class);
        m14272a(hashMap, hashMap2, Integer.TYPE, Integer.class);
        m14272a(hashMap, hashMap2, Long.TYPE, Long.class);
        m14272a(hashMap, hashMap2, Short.TYPE, Short.class);
        m14272a(hashMap, hashMap2, Void.TYPE, Void.class);
        f25038a = Collections.unmodifiableMap(hashMap);
        f25039b = Collections.unmodifiableMap(hashMap2);
    }

    /* renamed from: a */
    public static <T> Class<T> m14274a(Class<T> cls) {
        Class<T> cls2 = (Class<T>) f25038a.get(C7494op.m14330a(cls));
        return cls2 == null ? cls : cls2;
    }

    /* renamed from: a */
    private static void m14272a(Map<Class<?>, Class<?>> map, Map<Class<?>, Class<?>> map2, Class<?> cls, Class<?> cls2) {
        map.put(cls, cls2);
        map2.put(cls2, cls);
    }

    /* renamed from: a */
    public static boolean m14273a(Type type) {
        return f25038a.containsKey(type);
    }
}
