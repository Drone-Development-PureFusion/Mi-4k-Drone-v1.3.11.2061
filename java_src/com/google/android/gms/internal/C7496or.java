package com.google.android.gms.internal;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;
import p005b.p006a.p007a.p008a.p026n.C0363a;
/* renamed from: com.google.android.gms.internal.or */
/* loaded from: classes2.dex */
public final class C7496or {

    /* renamed from: a */
    static final Type[] f24970a = new Type[0];

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.internal.or$a */
    /* loaded from: classes2.dex */
    public static final class C7497a implements Serializable, GenericArrayType {

        /* renamed from: a */
        private final Type f24971a;

        public C7497a(Type type) {
            this.f24971a = C7496or.m14312d(type);
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && C7496or.m14321a((Type) this, (Type) ((GenericArrayType) obj));
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.f24971a;
        }

        public int hashCode() {
            return this.f24971a.hashCode();
        }

        public String toString() {
            return String.valueOf(C7496or.m14310f(this.f24971a)).concat("[]");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.internal.or$b */
    /* loaded from: classes2.dex */
    public static final class C7498b implements Serializable, ParameterizedType {

        /* renamed from: a */
        private final Type f24972a;

        /* renamed from: b */
        private final Type f24973b;

        /* renamed from: c */
        private final Type[] f24974c;

        public C7498b(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                C7494op.m14329a(type != null || (Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null));
            }
            this.f24972a = type == null ? null : C7496or.m14312d(type);
            this.f24973b = C7496or.m14312d(type2);
            this.f24974c = (Type[]) typeArr.clone();
            for (int i = 0; i < this.f24974c.length; i++) {
                C7494op.m14330a(this.f24974c[i]);
                C7496or.m14307i(this.f24974c[i]);
                this.f24974c[i] = C7496or.m14312d(this.f24974c[i]);
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && C7496or.m14321a((Type) this, (Type) ((ParameterizedType) obj));
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.f24974c.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.f24972a;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.f24973b;
        }

        public int hashCode() {
            return (Arrays.hashCode(this.f24974c) ^ this.f24973b.hashCode()) ^ C7496or.m14317b((Object) this.f24972a);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder((this.f24974c.length + 1) * 30);
            sb.append(C7496or.m14310f(this.f24973b));
            if (this.f24974c.length == 0) {
                return sb.toString();
            }
            sb.append("<").append(C7496or.m14310f(this.f24974c[0]));
            for (int i = 1; i < this.f24974c.length; i++) {
                sb.append(", ").append(C7496or.m14310f(this.f24974c[i]));
            }
            return sb.append(">").toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.internal.or$c */
    /* loaded from: classes2.dex */
    public static final class C7499c implements Serializable, WildcardType {

        /* renamed from: a */
        private final Type f24975a;

        /* renamed from: b */
        private final Type f24976b;

        public C7499c(Type[] typeArr, Type[] typeArr2) {
            boolean z = true;
            C7494op.m14329a(typeArr2.length <= 1);
            C7494op.m14329a(typeArr.length == 1);
            if (typeArr2.length != 1) {
                C7494op.m14330a(typeArr[0]);
                C7496or.m14307i(typeArr[0]);
                this.f24976b = null;
                this.f24975a = C7496or.m14312d(typeArr[0]);
                return;
            }
            C7494op.m14330a(typeArr2[0]);
            C7496or.m14307i(typeArr2[0]);
            C7494op.m14329a(typeArr[0] != Object.class ? false : z);
            this.f24976b = C7496or.m14312d(typeArr2[0]);
            this.f24975a = Object.class;
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && C7496or.m14321a((Type) this, (Type) ((WildcardType) obj));
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            return this.f24976b != null ? new Type[]{this.f24976b} : C7496or.f24970a;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.f24975a};
        }

        public int hashCode() {
            return (this.f24976b != null ? this.f24976b.hashCode() + 31 : 1) ^ (this.f24975a.hashCode() + 31);
        }

        public String toString() {
            if (this.f24976b != null) {
                String valueOf = String.valueOf(C7496or.m14310f(this.f24976b));
                return valueOf.length() != 0 ? "? super ".concat(valueOf) : new String("? super ");
            } else if (this.f24975a == Object.class) {
                return C0363a.f360a;
            } else {
                String valueOf2 = String.valueOf(C7496or.m14310f(this.f24975a));
                return valueOf2.length() != 0 ? "? extends ".concat(valueOf2) : new String("? extends ");
            }
        }
    }

    /* renamed from: a */
    private static int m14318a(Object[] objArr, Object obj) {
        for (int i = 0; i < objArr.length; i++) {
            if (obj.equals(objArr[i])) {
                return i;
            }
        }
        throw new NoSuchElementException();
    }

    /* renamed from: a */
    private static Class<?> m14319a(TypeVariable<?> typeVariable) {
        Object genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    /* renamed from: a */
    public static GenericArrayType m14326a(Type type) {
        return new C7497a(type);
    }

    /* renamed from: a */
    public static ParameterizedType m14320a(Type type, Type type2, Type... typeArr) {
        return new C7498b(type, type2, typeArr);
    }

    /* renamed from: a */
    public static Type m14325a(Type type, Class<?> cls) {
        Type m14314b = m14314b(type, cls, Collection.class);
        if (m14314b instanceof WildcardType) {
            m14314b = ((WildcardType) m14314b).getUpperBounds()[0];
        }
        return m14314b instanceof ParameterizedType ? ((ParameterizedType) m14314b).getActualTypeArguments()[0] : Object.class;
    }

    /* renamed from: a */
    static Type m14324a(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                if (interfaces[i] == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(interfaces[i])) {
                    return m14324a(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return m14324a(cls.getGenericSuperclass(), (Class<?>) superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* renamed from: a */
    public static Type m14323a(Type type, Class<?> cls, Type type2) {
        Type m14323a;
        while (true) {
            Type type3 = type2;
            if (!(type3 instanceof TypeVariable)) {
                if ((type3 instanceof Class) && ((Class) type3).isArray()) {
                    Class cls2 = (Class) type3;
                    Class<?> componentType = cls2.getComponentType();
                    Type m14323a2 = m14323a(type, cls, (Type) componentType);
                    return componentType != m14323a2 ? m14326a(m14323a2) : cls2;
                } else if (type3 instanceof GenericArrayType) {
                    GenericArrayType genericArrayType = (GenericArrayType) type3;
                    Type genericComponentType = genericArrayType.getGenericComponentType();
                    Type m14323a3 = m14323a(type, cls, genericComponentType);
                    return genericComponentType != m14323a3 ? m14326a(m14323a3) : genericArrayType;
                } else if (!(type3 instanceof ParameterizedType)) {
                    if (!(type3 instanceof WildcardType)) {
                        return type3;
                    }
                    WildcardType wildcardType = (WildcardType) type3;
                    Type[] lowerBounds = wildcardType.getLowerBounds();
                    Type[] upperBounds = wildcardType.getUpperBounds();
                    if (lowerBounds.length != 1) {
                        return (upperBounds.length != 1 || (m14323a = m14323a(type, cls, upperBounds[0])) == upperBounds[0]) ? wildcardType : m14316b(m14323a);
                    }
                    Type m14323a4 = m14323a(type, cls, lowerBounds[0]);
                    return m14323a4 != lowerBounds[0] ? m14313c(m14323a4) : wildcardType;
                } else {
                    ParameterizedType parameterizedType = (ParameterizedType) type3;
                    Type ownerType = parameterizedType.getOwnerType();
                    Type m14323a5 = m14323a(type, cls, ownerType);
                    boolean z = m14323a5 != ownerType;
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    int length = actualTypeArguments.length;
                    boolean z2 = z;
                    Type[] typeArr = actualTypeArguments;
                    for (int i = 0; i < length; i++) {
                        Type m14323a6 = m14323a(type, cls, typeArr[i]);
                        if (m14323a6 != typeArr[i]) {
                            if (!z2) {
                                typeArr = (Type[]) typeArr.clone();
                                z2 = true;
                            }
                            typeArr[i] = m14323a6;
                        }
                    }
                    return z2 ? m14320a(m14323a5, parameterizedType.getRawType(), typeArr) : parameterizedType;
                }
            }
            TypeVariable typeVariable = (TypeVariable) type3;
            type2 = m14322a(type, cls, (TypeVariable<?>) typeVariable);
            if (type2 == typeVariable) {
                return type2;
            }
        }
    }

    /* renamed from: a */
    static Type m14322a(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class<?> m14319a = m14319a(typeVariable);
        if (m14319a == null) {
            return typeVariable;
        }
        Type m14324a = m14324a(type, cls, m14319a);
        if (!(m14324a instanceof ParameterizedType)) {
            return typeVariable;
        }
        return ((ParameterizedType) m14324a).getActualTypeArguments()[m14318a((Object[]) m14319a.getTypeParameters(), (Object) typeVariable)];
    }

    /* renamed from: a */
    static boolean m14327a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: a */
    public static boolean m14321a(Type type, Type type2) {
        boolean z = true;
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            if (!m14327a((Object) parameterizedType.getOwnerType(), (Object) parameterizedType2.getOwnerType()) || !parameterizedType.getRawType().equals(parameterizedType2.getRawType()) || !Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments())) {
                z = false;
            }
            return z;
        } else if (type instanceof GenericArrayType) {
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return m14321a(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
        } else if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            if (!Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) || !Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds())) {
                z = false;
            }
            return z;
        } else if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        } else {
            TypeVariable typeVariable = (TypeVariable) type;
            TypeVariable typeVariable2 = (TypeVariable) type2;
            if (typeVariable.getGenericDeclaration() != typeVariable2.getGenericDeclaration() || !typeVariable.getName().equals(typeVariable2.getName())) {
                z = false;
            }
            return z;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static int m14317b(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    /* renamed from: b */
    static Type m14314b(Type type, Class<?> cls, Class<?> cls2) {
        C7494op.m14329a(cls2.isAssignableFrom(cls));
        return m14323a(type, cls, m14324a(type, cls, cls2));
    }

    /* renamed from: b */
    public static WildcardType m14316b(Type type) {
        return new C7499c(new Type[]{type}, f24970a);
    }

    /* renamed from: b */
    public static Type[] m14315b(Type type, Class<?> cls) {
        if (type == Properties.class) {
            return new Type[]{String.class, String.class};
        }
        Type m14314b = m14314b(type, cls, Map.class);
        return m14314b instanceof ParameterizedType ? ((ParameterizedType) m14314b).getActualTypeArguments() : new Type[]{Object.class, Object.class};
    }

    /* renamed from: c */
    public static WildcardType m14313c(Type type) {
        return new C7499c(new Type[]{Object.class}, new Type[]{type});
    }

    /* renamed from: d */
    public static Type m14312d(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new C7497a(m14312d(cls.getComponentType())) : cls;
        } else if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new C7498b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            return new C7497a(((GenericArrayType) type).getGenericComponentType());
        } else {
            if (!(type instanceof WildcardType)) {
                return type;
            }
            WildcardType wildcardType = (WildcardType) type;
            return new C7499c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
        }
    }

    /* renamed from: e */
    public static Class<?> m14311e(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            C7494op.m14329a(rawType instanceof Class);
            return (Class) rawType;
        } else if (type instanceof GenericArrayType) {
            return Array.newInstance(m14311e(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        } else {
            if (type instanceof TypeVariable) {
                return Object.class;
            }
            if (type instanceof WildcardType) {
                return m14311e(((WildcardType) type).getUpperBounds()[0]);
            }
            String name = type == null ? "null" : type.getClass().getName();
            String valueOf = String.valueOf("Expected a Class, ParameterizedType, or GenericArrayType, but <");
            String valueOf2 = String.valueOf(type);
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 13 + String.valueOf(valueOf2).length() + String.valueOf(name).length()).append(valueOf).append(valueOf2).append("> is of type ").append(name).toString());
        }
    }

    /* renamed from: f */
    public static String m14310f(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    /* renamed from: g */
    public static Type m14309g(Type type) {
        return type instanceof GenericArrayType ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static void m14307i(Type type) {
        C7494op.m14329a(!(type instanceof Class) || !((Class) type).isPrimitive());
    }
}
