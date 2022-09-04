package org.p328c.p353g;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.p328c.p350f.p351a.AbstractC11640a;
import org.p328c.p350f.p351a.C11641b;
import org.p328c.p350f.p351a.C11643d;
import org.p328c.p350f.p351a.C11651k;
/* renamed from: org.c.g.c */
/* loaded from: classes.dex */
public final class C11678c implements AbstractC11685e {

    /* renamed from: a */
    private static final List<AbstractC11680a<?>> f36831a = Arrays.asList(new C11681b(), new C11683d(), new C11682c());

    /* renamed from: org.c.g.c$a */
    /* loaded from: classes.dex */
    private static abstract class AbstractC11680a<T extends AbstractC11640a> {

        /* renamed from: a */
        private static final C11677b f36832a = new C11677b();

        private AbstractC11680a() {
        }

        /* renamed from: a */
        private List<Exception> m305a(T t) {
            ArrayList arrayList = new ArrayList();
            for (Annotation annotation : t.mo425a()) {
                AbstractC11686f abstractC11686f = (AbstractC11686f) annotation.annotationType().getAnnotation(AbstractC11686f.class);
                if (abstractC11686f != null) {
                    arrayList.addAll(mo300a(f36832a.m306a(abstractC11686f), t));
                }
            }
            return arrayList;
        }

        /* renamed from: a */
        abstract Iterable<T> mo301a(C11651k c11651k);

        /* renamed from: a */
        abstract List<Exception> mo300a(AbstractC11676a abstractC11676a, T t);

        /* renamed from: b */
        public List<Exception> m304b(C11651k c11651k) {
            ArrayList arrayList = new ArrayList();
            for (T t : mo301a(c11651k)) {
                arrayList.addAll(m305a((AbstractC11680a<T>) t));
            }
            return arrayList;
        }
    }

    /* renamed from: org.c.g.c$b */
    /* loaded from: classes.dex */
    private static class C11681b extends AbstractC11680a<C11651k> {
        private C11681b() {
            super();
        }

        @Override // org.p328c.p353g.C11678c.AbstractC11680a
        /* renamed from: a */
        Iterable<C11651k> mo301a(C11651k c11651k) {
            return Collections.singletonList(c11651k);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // org.p328c.p353g.C11678c.AbstractC11680a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public List<Exception> mo300a(AbstractC11676a abstractC11676a, C11651k c11651k) {
            return abstractC11676a.m307a(c11651k);
        }
    }

    /* renamed from: org.c.g.c$c */
    /* loaded from: classes.dex */
    private static class C11682c extends AbstractC11680a<C11641b> {
        private C11682c() {
            super();
        }

        @Override // org.p328c.p353g.C11678c.AbstractC11680a
        /* renamed from: a */
        Iterable<C11641b> mo301a(C11651k c11651k) {
            return c11651k.m414c();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // org.p328c.p353g.C11678c.AbstractC11680a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public List<Exception> mo300a(AbstractC11676a abstractC11676a, C11641b c11641b) {
            return abstractC11676a.m309a(c11641b);
        }
    }

    /* renamed from: org.c.g.c$d */
    /* loaded from: classes.dex */
    private static class C11683d extends AbstractC11680a<C11643d> {
        private C11683d() {
            super();
        }

        @Override // org.p328c.p353g.C11678c.AbstractC11680a
        /* renamed from: a */
        Iterable<C11643d> mo301a(C11651k c11651k) {
            return c11651k.m418b();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // org.p328c.p353g.C11678c.AbstractC11680a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public List<Exception> mo300a(AbstractC11676a abstractC11676a, C11643d c11643d) {
            return abstractC11676a.mo308a(c11643d);
        }
    }

    @Override // org.p328c.p353g.AbstractC11685e
    /* renamed from: a */
    public List<Exception> mo298a(C11651k c11651k) {
        ArrayList arrayList = new ArrayList();
        for (AbstractC11680a<?> abstractC11680a : f36831a) {
            arrayList.addAll(abstractC11680a.m304b(c11651k));
        }
        return arrayList;
    }
}
