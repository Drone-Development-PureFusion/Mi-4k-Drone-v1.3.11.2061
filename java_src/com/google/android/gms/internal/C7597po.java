package com.google.android.gms.internal;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
/* renamed from: com.google.android.gms.internal.po */
/* loaded from: classes2.dex */
public class C7597po<T> {

    /* renamed from: a */
    final Class<? super T> f25159a;

    /* renamed from: b */
    final Type f25160b;

    /* renamed from: c */
    final int f25161c;

    protected C7597po() {
        this.f25160b = m14170a(getClass());
        this.f25159a = (Class<? super T>) C7496or.m14311e(this.f25160b);
        this.f25161c = this.f25160b.hashCode();
    }

    C7597po(Type type) {
        this.f25160b = C7496or.m14312d((Type) C7494op.m14330a(type));
        this.f25159a = (Class<? super T>) C7496or.m14311e(this.f25160b);
        this.f25161c = this.f25160b.hashCode();
    }

    /* renamed from: a */
    public static C7597po<?> m14169a(Type type) {
        return new C7597po<>(type);
    }

    /* renamed from: a */
    static Type m14170a(Class<?> cls) {
        Type genericSuperclass = cls.getGenericSuperclass();
        if (genericSuperclass instanceof Class) {
            throw new RuntimeException("Missing type parameter.");
        }
        return C7496or.m14312d(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
    }

    /* renamed from: b */
    public static <T> C7597po<T> m14167b(Class<T> cls) {
        return new C7597po<>(cls);
    }

    /* renamed from: a */
    public final Class<? super T> m14171a() {
        return this.f25159a;
    }

    /* renamed from: b */
    public final Type m14168b() {
        return this.f25160b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C7597po) && C7496or.m14321a(this.f25160b, ((C7597po) obj).f25160b);
    }

    public final int hashCode() {
        return this.f25161c;
    }

    public final String toString() {
        return C7496or.m14310f(this.f25160b);
    }
}
