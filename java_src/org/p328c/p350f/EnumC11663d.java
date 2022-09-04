package org.p328c.p350f;

import java.lang.reflect.Method;
import java.util.Comparator;
import org.p328c.p337b.C11559h;
/* renamed from: org.c.f.d */
/* loaded from: classes.dex */
public enum EnumC11663d {
    NAME_ASCENDING(C11559h.f36684b),
    JVM(null),
    DEFAULT(C11559h.f36683a);
    

    /* renamed from: d */
    private final Comparator<Method> f36811d;

    EnumC11663d(Comparator comparator) {
        this.f36811d = comparator;
    }

    /* renamed from: a */
    public Comparator<Method> m360a() {
        return this.f36811d;
    }
}
