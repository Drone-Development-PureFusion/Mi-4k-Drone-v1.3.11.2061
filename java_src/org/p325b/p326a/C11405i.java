package org.p325b.p326a;

import java.lang.reflect.Array;
import org.p325b.AbstractC11415b;
import org.p325b.AbstractC11428g;
import org.p325b.AbstractC11431i;
import org.p325b.AbstractC11433k;
/* renamed from: org.b.a.i */
/* loaded from: classes.dex */
public class C11405i<T> extends AbstractC11415b<T> {

    /* renamed from: a */
    private final Object f36522a;

    public C11405i(T t) {
        this.f36522a = t;
    }

    /* renamed from: a */
    private static boolean m1166a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : (obj2 == null || !m1163c(obj)) ? obj.equals(obj2) : m1163c(obj2) && m1164b(obj, obj2);
    }

    @AbstractC11431i
    /* renamed from: b */
    public static <T> AbstractC11433k<T> m1165b(T t) {
        return new C11405i(t);
    }

    /* renamed from: b */
    private static boolean m1164b(Object obj, Object obj2) {
        return m1162c(obj, obj2) && m1161d(obj, obj2);
    }

    /* renamed from: c */
    private static boolean m1163c(Object obj) {
        return obj.getClass().isArray();
    }

    /* renamed from: c */
    private static boolean m1162c(Object obj, Object obj2) {
        return Array.getLength(obj) == Array.getLength(obj2);
    }

    /* renamed from: d */
    private static boolean m1161d(Object obj, Object obj2) {
        for (int i = 0; i < Array.getLength(obj); i++) {
            if (!m1166a(Array.get(obj, i), Array.get(obj2, i))) {
                return false;
            }
        }
        return true;
    }

    @Override // org.p325b.AbstractC11435m
    /* renamed from: a */
    public void mo905a(AbstractC11428g abstractC11428g) {
        abstractC11428g.mo1087a(this.f36522a);
    }

    @Override // org.p325b.AbstractC11433k
    /* renamed from: a */
    public boolean mo900a(Object obj) {
        return m1166a(obj, this.f36522a);
    }
}
