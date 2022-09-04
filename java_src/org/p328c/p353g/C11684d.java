package org.p328c.p353g;

import java.util.Collections;
import java.util.List;
import org.p328c.p350f.p351a.C11651k;
/* renamed from: org.c.g.d */
/* loaded from: classes.dex */
public class C11684d implements AbstractC11685e {

    /* renamed from: a */
    private static final List<Exception> f36833a = Collections.emptyList();

    @Override // org.p328c.p353g.AbstractC11685e
    /* renamed from: a */
    public List<Exception> mo298a(C11651k c11651k) {
        return c11651k.m406g() ? f36833a : Collections.singletonList(new Exception("The class " + c11651k.m410e() + " is not public."));
    }
}
