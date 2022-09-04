package org.p328c.p337b.p338a;

import org.p328c.p337b.p341d.C11553i;
import org.p328c.p347e.AbstractC11637l;
import org.p328c.p350f.p351a.AbstractC11648h;
import p070c.p073c.AbstractC0761a;
/* renamed from: org.c.b.a.h */
/* loaded from: classes2.dex */
public class C11502h extends AbstractC11648h {
    @Override // org.p328c.p350f.p351a.AbstractC11648h
    /* renamed from: a */
    public AbstractC11637l mo432a(Class<?> cls) {
        if (m916b(cls)) {
            return new C11553i(cls);
        }
        return null;
    }

    /* renamed from: b */
    public boolean m916b(Class<?> cls) {
        try {
            cls.getMethod(AbstractC0761a.f1422a, new Class[0]);
            return true;
        } catch (NoSuchMethodException e) {
            return false;
        }
    }
}
