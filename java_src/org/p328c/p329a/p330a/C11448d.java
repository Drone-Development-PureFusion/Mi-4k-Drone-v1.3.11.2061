package org.p328c.p329a.p330a;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.p328c.AbstractC11439a;
import org.p328c.AbstractC11493b;
import org.p328c.AbstractC11638f;
import org.p328c.AbstractC11675g;
import org.p328c.p350f.p351a.C11643d;
import org.p328c.p353g.AbstractC11676a;
/* renamed from: org.c.a.a.d */
/* loaded from: classes.dex */
public final class C11448d extends AbstractC11676a {

    /* renamed from: a */
    private static final Set<Class<? extends Annotation>> f36558a = Collections.unmodifiableSet(new HashSet(Arrays.asList(AbstractC11675g.class, AbstractC11493b.class, AbstractC11638f.class, AbstractC11439a.class)));

    /* renamed from: a */
    private void m1034a(List<Exception> list, Class<?> cls) {
        list.add(new Exception(String.format("@%s can not be combined with @Category", cls.getSimpleName())));
    }

    @Override // org.p328c.p353g.AbstractC11676a
    /* renamed from: a */
    public List<Exception> mo308a(C11643d c11643d) {
        Annotation[] mo425a;
        ArrayList arrayList = new ArrayList();
        for (Annotation annotation : c11643d.mo425a()) {
            for (Class<? extends Annotation> cls : f36558a) {
                if (annotation.annotationType().isAssignableFrom(cls)) {
                    m1034a(arrayList, cls);
                }
            }
        }
        return Collections.unmodifiableList(arrayList);
    }
}
