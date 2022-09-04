package com.p081b.p083b;
/* renamed from: com.b.b.d */
/* loaded from: classes.dex */
public abstract class AbstractC1026d<T, V> {

    /* renamed from: a */
    private final String f2325a;

    /* renamed from: b */
    private final Class<V> f2326b;

    public AbstractC1026d(Class<V> cls, String str) {
        this.f2325a = str;
        this.f2326b = cls;
    }

    /* renamed from: a */
    public static <T, V> AbstractC1026d<T, V> m37042a(Class<T> cls, Class<V> cls2, String str) {
        return new C1027e(cls, cls2, str);
    }

    /* renamed from: a */
    public abstract V mo37037a(T t);

    /* renamed from: a */
    public void mo37036a(T t, V v) {
        throw new UnsupportedOperationException("Property " + m37041b() + " is read-only");
    }

    /* renamed from: a */
    public boolean mo37039a() {
        return false;
    }

    /* renamed from: b */
    public String m37041b() {
        return this.f2325a;
    }

    /* renamed from: c */
    public Class<V> m37040c() {
        return this.f2326b;
    }
}
