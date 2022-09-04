package org.p328c.p350f.p351a;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.List;
/* renamed from: org.c.f.a.g */
/* loaded from: classes2.dex */
class C11647g {

    /* renamed from: a */
    private final Method f36791a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11647g(Method method) {
        this.f36791a = method;
    }

    /* renamed from: a */
    private void m437a(GenericArrayType genericArrayType, List<Throwable> list) {
        m435a(genericArrayType.getGenericComponentType(), list);
    }

    /* renamed from: a */
    private void m436a(ParameterizedType parameterizedType, List<Throwable> list) {
        for (Type type : parameterizedType.getActualTypeArguments()) {
            m435a(type, list);
        }
    }

    /* renamed from: a */
    private void m435a(Type type, List<Throwable> list) {
        if (type instanceof TypeVariable) {
            list.add(new Exception("Method " + this.f36791a.getName() + "() contains unresolved type variable " + type));
        } else if (type instanceof ParameterizedType) {
            m436a((ParameterizedType) type, list);
        } else if (type instanceof WildcardType) {
            m434a((WildcardType) type, list);
        } else if (!(type instanceof GenericArrayType)) {
        } else {
            m437a((GenericArrayType) type, list);
        }
    }

    /* renamed from: a */
    private void m434a(WildcardType wildcardType, List<Throwable> list) {
        for (Type type : wildcardType.getUpperBounds()) {
            m435a(type, list);
        }
        for (Type type2 : wildcardType.getLowerBounds()) {
            m435a(type2, list);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m433a(List<Throwable> list) {
        for (Type type : this.f36791a.getGenericParameterTypes()) {
            m435a(type, list);
        }
    }
}
