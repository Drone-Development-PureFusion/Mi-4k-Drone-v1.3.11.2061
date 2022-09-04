package org.p328c.p337b.p341d.p343b;

import java.lang.annotation.Annotation;
import org.p328c.p350f.p351a.AbstractC11642c;
/* renamed from: org.c.b.d.b.b */
/* loaded from: classes2.dex */
class C11530b extends Exception {
    public C11530b(AbstractC11642c<?> abstractC11642c, Class<? extends Annotation> cls, String str) {
        super(String.format("The @%s '%s' %s", cls.getSimpleName(), abstractC11642c.mo450b(), str));
    }
}
