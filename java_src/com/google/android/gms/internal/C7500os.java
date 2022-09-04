package com.google.android.gms.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import org.codehaus.jackson.org.objectweb.asm.Opcodes;
/* renamed from: com.google.android.gms.internal.os */
/* loaded from: classes2.dex */
public final class C7500os {

    /* renamed from: a */
    private final Map<Type, AbstractC7467nt<?>> f24977a;

    public C7500os(Map<Type, AbstractC7467nt<?>> map) {
        this.f24977a = map;
    }

    /* renamed from: a */
    private <T> AbstractC7525ox<T> m14305a(Class<? super T> cls) {
        try {
            final Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return new AbstractC7525ox<T>() { // from class: com.google.android.gms.internal.os.9
                /* JADX WARN: Type inference failed for: r0v5, types: [T, java.lang.Object] */
                @Override // com.google.android.gms.internal.AbstractC7525ox
                /* renamed from: a */
                public T mo14275a() {
                    try {
                        return declaredConstructor.newInstance(null);
                    } catch (IllegalAccessException e) {
                        throw new AssertionError(e);
                    } catch (InstantiationException e2) {
                        String valueOf = String.valueOf(declaredConstructor);
                        throw new RuntimeException(new StringBuilder(String.valueOf(valueOf).length() + 30).append("Failed to invoke ").append(valueOf).append(" with no args").toString(), e2);
                    } catch (InvocationTargetException e3) {
                        String valueOf2 = String.valueOf(declaredConstructor);
                        throw new RuntimeException(new StringBuilder(String.valueOf(valueOf2).length() + 30).append("Failed to invoke ").append(valueOf2).append(" with no args").toString(), e3.getTargetException());
                    }
                }
            };
        } catch (NoSuchMethodException e) {
            return null;
        }
    }

    /* renamed from: a */
    private <T> AbstractC7525ox<T> m14304a(final Type type, Class<? super T> cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            return SortedSet.class.isAssignableFrom(cls) ? new AbstractC7525ox<T>() { // from class: com.google.android.gms.internal.os.10
                /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.TreeSet] */
                @Override // com.google.android.gms.internal.AbstractC7525ox
                /* renamed from: a */
                public T mo14275a() {
                    return new TreeSet();
                }
            } : EnumSet.class.isAssignableFrom(cls) ? new AbstractC7525ox<T>() { // from class: com.google.android.gms.internal.os.11
                /* JADX WARN: Type inference failed for: r0v19, types: [T, java.util.EnumSet] */
                @Override // com.google.android.gms.internal.AbstractC7525ox
                /* renamed from: a */
                public T mo14275a() {
                    if (!(type instanceof ParameterizedType)) {
                        String valueOf = String.valueOf(type.toString());
                        throw new C7472ny(valueOf.length() != 0 ? "Invalid EnumSet type: ".concat(valueOf) : new String("Invalid EnumSet type: "));
                    }
                    Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                    if (type2 instanceof Class) {
                        return EnumSet.noneOf((Class) type2);
                    }
                    String valueOf2 = String.valueOf(type.toString());
                    throw new C7472ny(valueOf2.length() != 0 ? "Invalid EnumSet type: ".concat(valueOf2) : new String("Invalid EnumSet type: "));
                }
            } : Set.class.isAssignableFrom(cls) ? new AbstractC7525ox<T>() { // from class: com.google.android.gms.internal.os.12
                /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.LinkedHashSet] */
                @Override // com.google.android.gms.internal.AbstractC7525ox
                /* renamed from: a */
                public T mo14275a() {
                    return new LinkedHashSet();
                }
            } : Queue.class.isAssignableFrom(cls) ? new AbstractC7525ox<T>() { // from class: com.google.android.gms.internal.os.2
                /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.LinkedList] */
                @Override // com.google.android.gms.internal.AbstractC7525ox
                /* renamed from: a */
                public T mo14275a() {
                    return new LinkedList();
                }
            } : new AbstractC7525ox<T>() { // from class: com.google.android.gms.internal.os.3
                /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.ArrayList] */
                @Override // com.google.android.gms.internal.AbstractC7525ox
                /* renamed from: a */
                public T mo14275a() {
                    return new ArrayList();
                }
            };
        } else if (!Map.class.isAssignableFrom(cls)) {
            return null;
        } else {
            return SortedMap.class.isAssignableFrom(cls) ? new AbstractC7525ox<T>() { // from class: com.google.android.gms.internal.os.4
                /* JADX WARN: Type inference failed for: r0v0, types: [java.util.TreeMap, T] */
                @Override // com.google.android.gms.internal.AbstractC7525ox
                /* renamed from: a */
                public T mo14275a() {
                    return new TreeMap();
                }
            } : (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(C7597po.m14169a(((ParameterizedType) type).getActualTypeArguments()[0]).m14171a())) ? new AbstractC7525ox<T>() { // from class: com.google.android.gms.internal.os.6
                /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ow, T] */
                @Override // com.google.android.gms.internal.AbstractC7525ox
                /* renamed from: a */
                public T mo14275a() {
                    return new C7517ow();
                }
            } : new AbstractC7525ox<T>() { // from class: com.google.android.gms.internal.os.5
                /* JADX WARN: Type inference failed for: r0v0, types: [java.util.LinkedHashMap, T] */
                @Override // com.google.android.gms.internal.AbstractC7525ox
                /* renamed from: a */
                public T mo14275a() {
                    return new LinkedHashMap();
                }
            };
        }
    }

    /* renamed from: b */
    private <T> AbstractC7525ox<T> m14303b(final Type type, final Class<? super T> cls) {
        return new AbstractC7525ox<T>() { // from class: com.google.android.gms.internal.os.7

            /* renamed from: d */
            private final AbstractC7532pa f24993d = AbstractC7532pa.m14268a();

            /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
            @Override // com.google.android.gms.internal.AbstractC7525ox
            /* renamed from: a */
            public T mo14275a() {
                try {
                    return this.f24993d.mo14267a(cls);
                } catch (Exception e) {
                    String valueOf = String.valueOf(type);
                    throw new RuntimeException(new StringBuilder(String.valueOf(valueOf).length() + Opcodes.INEG).append("Unable to invoke no-args constructor for ").append(valueOf).append(". ").append("Register an InstanceCreator with Gson for this type may fix this problem.").toString(), e);
                }
            }
        };
    }

    /* renamed from: a */
    public <T> AbstractC7525ox<T> m14306a(C7597po<T> c7597po) {
        final Type m14168b = c7597po.m14168b();
        Class<? super T> m14171a = c7597po.m14171a();
        final AbstractC7467nt<?> abstractC7467nt = this.f24977a.get(m14168b);
        if (abstractC7467nt != null) {
            return new AbstractC7525ox<T>() { // from class: com.google.android.gms.internal.os.1
                /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
                @Override // com.google.android.gms.internal.AbstractC7525ox
                /* renamed from: a */
                public T mo14275a() {
                    return abstractC7467nt.m14376a(m14168b);
                }
            };
        }
        final AbstractC7467nt<?> abstractC7467nt2 = this.f24977a.get(m14171a);
        if (abstractC7467nt2 != null) {
            return new AbstractC7525ox<T>() { // from class: com.google.android.gms.internal.os.8
                /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
                @Override // com.google.android.gms.internal.AbstractC7525ox
                /* renamed from: a */
                public T mo14275a() {
                    return abstractC7467nt2.m14376a(m14168b);
                }
            };
        }
        AbstractC7525ox<T> m14305a = m14305a(m14171a);
        if (m14305a != null) {
            return m14305a;
        }
        AbstractC7525ox<T> m14304a = m14304a(m14168b, m14171a);
        return m14304a == null ? m14303b(m14168b, m14171a) : m14304a;
    }

    public String toString() {
        return this.f24977a.toString();
    }
}
