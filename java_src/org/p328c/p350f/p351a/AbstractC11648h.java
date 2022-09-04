package org.p328c.p350f.p351a;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.p328c.p337b.p341d.C11517b;
import org.p328c.p347e.AbstractC11637l;
/* renamed from: org.c.f.a.h */
/* loaded from: classes.dex */
public abstract class AbstractC11648h {

    /* renamed from: a */
    private final Set<Class<?>> f36792a = new HashSet();

    /* renamed from: a */
    private List<AbstractC11637l> m429a(Class<?>[] clsArr) {
        ArrayList arrayList = new ArrayList();
        for (Class<?> cls : clsArr) {
            AbstractC11637l m428c = m428c(cls);
            if (m428c != null) {
                arrayList.add(m428c);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public List<AbstractC11637l> m431a(Class<?> cls, List<Class<?>> list) {
        return m430a(cls, (Class[]) list.toArray(new Class[0]));
    }

    /* renamed from: a */
    public List<AbstractC11637l> m430a(Class<?> cls, Class<?>[] clsArr) {
        m427d(cls);
        try {
            return m429a(clsArr);
        } finally {
            m426e(cls);
        }
    }

    /* renamed from: a */
    public abstract AbstractC11637l mo432a(Class<?> cls);

    /* renamed from: c */
    public AbstractC11637l m428c(Class<?> cls) {
        try {
            return mo432a(cls);
        } catch (Throwable th) {
            return new C11517b(cls, th);
        }
    }

    /* renamed from: d */
    Class<?> m427d(Class<?> cls) {
        if (!this.f36792a.add(cls)) {
            throw new C11645e(String.format("class '%s' (possibly indirectly) contains itself as a SuiteClass", cls.getName()));
        }
        return cls;
    }

    /* renamed from: e */
    void m426e(Class<?> cls) {
        this.f36792a.remove(cls);
    }
}
