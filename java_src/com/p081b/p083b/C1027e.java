package com.p081b.p083b;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* renamed from: com.b.b.e */
/* loaded from: classes.dex */
class C1027e<T, V> extends AbstractC1026d<T, V> {

    /* renamed from: a */
    private static final String f2327a = "get";

    /* renamed from: b */
    private static final String f2328b = "is";

    /* renamed from: c */
    private static final String f2329c = "set";

    /* renamed from: d */
    private Method f2330d;

    /* renamed from: e */
    private Method f2331e;

    /* renamed from: f */
    private Field f2332f;

    public C1027e(Class<T> cls, Class<V> cls2, String str) {
        super(cls2, str);
        String str2 = Character.toUpperCase(str.charAt(0)) + str.substring(1);
        String str3 = f2327a + str2;
        try {
            this.f2331e = cls.getMethod(str3, null);
        } catch (NoSuchMethodException e) {
            try {
                this.f2331e = cls.getDeclaredMethod(str3, null);
                this.f2331e.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                String str4 = f2328b + str2;
                try {
                    this.f2331e = cls.getMethod(str4, null);
                } catch (NoSuchMethodException e3) {
                    try {
                        this.f2331e = cls.getDeclaredMethod(str4, null);
                        this.f2331e.setAccessible(true);
                    } catch (NoSuchMethodException e4) {
                        try {
                            this.f2332f = cls.getField(str);
                            Class<?> type = this.f2332f.getType();
                            if (m37038a((Class) cls2, (Class) type)) {
                                return;
                            }
                            throw new C1025c("Underlying type (" + type + ") does not match Property type (" + cls2 + ")");
                        } catch (NoSuchFieldException e5) {
                            throw new C1025c("No accessor method or field found for property with name " + str);
                        }
                    }
                }
            }
        }
        Class<?> returnType = this.f2331e.getReturnType();
        if (!m37038a((Class) cls2, (Class) returnType)) {
            throw new C1025c("Underlying type (" + returnType + ") does not match Property type (" + cls2 + ")");
        }
        try {
            this.f2330d = cls.getDeclaredMethod(f2329c + str2, returnType);
            this.f2330d.setAccessible(true);
        } catch (NoSuchMethodException e6) {
        }
    }

    /* renamed from: a */
    private boolean m37038a(Class<V> cls, Class cls2) {
        if (cls2 != cls) {
            if (!cls2.isPrimitive()) {
                return false;
            }
            return (cls2 == Float.TYPE && cls == Float.class) || (cls2 == Integer.TYPE && cls == Integer.class) || ((cls2 == Boolean.TYPE && cls == Boolean.class) || ((cls2 == Long.TYPE && cls == Long.class) || ((cls2 == Double.TYPE && cls == Double.class) || ((cls2 == Short.TYPE && cls == Short.class) || ((cls2 == Byte.TYPE && cls == Byte.class) || (cls2 == Character.TYPE && cls == Character.class))))));
        }
        return true;
    }

    @Override // com.p081b.p083b.AbstractC1026d
    /* renamed from: a */
    public V mo37037a(T t) {
        if (this.f2331e != null) {
            try {
                return (V) this.f2331e.invoke(t, null);
            } catch (IllegalAccessException e) {
                throw new AssertionError();
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        } else if (this.f2332f == null) {
            throw new AssertionError();
        } else {
            try {
                return (V) this.f2332f.get(t);
            } catch (IllegalAccessException e3) {
                throw new AssertionError();
            }
        }
    }

    @Override // com.p081b.p083b.AbstractC1026d
    /* renamed from: a */
    public void mo37036a(T t, V v) {
        if (this.f2330d != null) {
            try {
                this.f2330d.invoke(t, v);
            } catch (IllegalAccessException e) {
                throw new AssertionError();
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        } else if (this.f2332f == null) {
            throw new UnsupportedOperationException("Property " + b() + " is read-only");
        } else {
            try {
                this.f2332f.set(t, v);
            } catch (IllegalAccessException e3) {
                throw new AssertionError();
            }
        }
    }

    @Override // com.p081b.p083b.AbstractC1026d
    /* renamed from: a */
    public boolean mo37039a() {
        return this.f2330d == null && this.f2332f == null;
    }
}
