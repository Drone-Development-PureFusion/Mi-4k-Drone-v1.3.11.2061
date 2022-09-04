package org.p328c.p337b.p338a;

import org.p328c.p337b.p341d.C11542e;
import org.p328c.p347e.AbstractC11637l;
import org.p328c.p350f.p351a.AbstractC11648h;
import p070c.p072b.AbstractC0754j;
/* renamed from: org.c.b.a.e */
/* loaded from: classes2.dex */
public class C11499e extends AbstractC11648h {
    @Override // org.p328c.p350f.p351a.AbstractC11648h
    /* renamed from: a */
    public AbstractC11637l mo432a(Class<?> cls) {
        if (m917b(cls)) {
            return new C11542e(cls);
        }
        return null;
    }

    /* renamed from: b */
    boolean m917b(Class<?> cls) {
        return AbstractC0754j.class.isAssignableFrom(cls);
    }
}
