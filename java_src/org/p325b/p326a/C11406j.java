package org.p325b.p326a;

import org.p325b.AbstractC11428g;
import org.p325b.AbstractC11430h;
import org.p325b.AbstractC11431i;
import org.p325b.AbstractC11433k;
/* renamed from: org.b.a.j */
/* loaded from: classes.dex */
public class C11406j extends AbstractC11430h<Object> {

    /* renamed from: a */
    private final Class<?> f36523a;

    /* renamed from: b */
    private final Class<?> f36524b;

    public C11406j(Class<?> cls) {
        this.f36523a = cls;
        this.f36524b = m1158c(cls);
    }

    @AbstractC11431i
    /* renamed from: a */
    public static <T> AbstractC11433k<T> m1160a(Class<?> cls) {
        return new C11406j(cls);
    }

    @AbstractC11431i
    /* renamed from: b */
    public static <T> AbstractC11433k<T> m1159b(Class<T> cls) {
        return new C11406j(cls);
    }

    /* renamed from: c */
    private static Class<?> m1158c(Class<?> cls) {
        return Boolean.TYPE.equals(cls) ? Boolean.class : Byte.TYPE.equals(cls) ? Byte.class : Character.TYPE.equals(cls) ? Character.class : Double.TYPE.equals(cls) ? Double.class : Float.TYPE.equals(cls) ? Float.class : Integer.TYPE.equals(cls) ? Integer.class : Long.TYPE.equals(cls) ? Long.class : Short.TYPE.equals(cls) ? Short.class : cls;
    }

    @Override // org.p325b.AbstractC11435m
    /* renamed from: a */
    public void mo905a(AbstractC11428g abstractC11428g) {
        abstractC11428g.mo1086a("an instance of ").mo1086a(this.f36523a.getName());
    }

    @Override // org.p325b.AbstractC11430h
    /* renamed from: b */
    protected boolean mo1081b(Object obj, AbstractC11428g abstractC11428g) {
        if (obj == null) {
            abstractC11428g.mo1086a("null");
            return false;
        } else if (this.f36524b.isInstance(obj)) {
            return true;
        } else {
            abstractC11428g.mo1087a(obj).mo1086a(" is a " + obj.getClass().getName());
            return false;
        }
    }
}
