package org.p328c.p329a.p330a;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.p328c.p329a.p330a.C11442a;
import org.p328c.p347e.p348a.AbstractC11598a;
/* renamed from: org.c.a.a.f */
/* loaded from: classes2.dex */
public final class C11451f extends AbstractC11447c {

    /* renamed from: org.c.a.a.f$a */
    /* loaded from: classes2.dex */
    private static class C11452a extends C11442a.C11443a {
        public C11452a(List<Class<?>> list) {
            this(new HashSet(list));
        }

        public C11452a(Set<Class<?>> set) {
            super(true, set, true, null);
        }

        @Override // org.p328c.p329a.p330a.C11442a.C11443a, org.p328c.p347e.p348a.AbstractC11598a
        /* renamed from: a */
        public String mo580a() {
            return "includes " + super.mo580a();
        }
    }

    @Override // org.p328c.p329a.p330a.AbstractC11447c
    /* renamed from: a */
    protected AbstractC11598a mo1033a(List<Class<?>> list) {
        return new C11452a(list);
    }
}
