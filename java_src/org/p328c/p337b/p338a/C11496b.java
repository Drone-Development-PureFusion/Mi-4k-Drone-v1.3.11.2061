package org.p328c.p337b.p338a;

import java.lang.reflect.Modifier;
import org.p328c.p347e.AbstractC11636k;
import org.p328c.p347e.AbstractC11637l;
import org.p328c.p350f.p351a.AbstractC11648h;
import org.p328c.p350f.p351a.C11645e;
/* renamed from: org.c.b.a.b */
/* loaded from: classes2.dex */
public class C11496b extends AbstractC11648h {

    /* renamed from: a */
    private static final String f36602a = "Custom runner class %s should have a public constructor with signature %s(Class testClass)";

    /* renamed from: b */
    private final AbstractC11648h f36603b;

    public C11496b(AbstractC11648h abstractC11648h) {
        this.f36603b = abstractC11648h;
    }

    /* renamed from: b */
    private Class<?> m918b(Class<?> cls) {
        if (!cls.isMemberClass() || Modifier.isStatic(cls.getModifiers())) {
            return null;
        }
        return cls.getEnclosingClass();
    }

    @Override // org.p328c.p350f.p351a.AbstractC11648h
    /* renamed from: a */
    public AbstractC11637l mo432a(Class<?> cls) {
        Class<?> cls2 = cls;
        while (cls2 != null) {
            AbstractC11636k abstractC11636k = (AbstractC11636k) cls2.getAnnotation(AbstractC11636k.class);
            if (abstractC11636k != null) {
                return m919a(abstractC11636k.m463a(), cls);
            }
            cls2 = m918b(cls2);
        }
        return null;
    }

    /* renamed from: a */
    public AbstractC11637l m919a(Class<? extends AbstractC11637l> cls, Class<?> cls2) {
        try {
            return cls.getConstructor(Class.class).newInstance(cls2);
        } catch (NoSuchMethodException e) {
            try {
                return cls.getConstructor(Class.class, AbstractC11648h.class).newInstance(cls2, this.f36603b);
            } catch (NoSuchMethodException e2) {
                String simpleName = cls.getSimpleName();
                throw new C11645e(String.format(f36602a, simpleName, simpleName));
            }
        }
    }
}
