package com.google.android.gms.internal;

import java.lang.reflect.Type;
import java.util.Collection;
/* renamed from: com.google.android.gms.internal.pc */
/* loaded from: classes2.dex */
public final class C7539pc implements AbstractC7489ok {

    /* renamed from: a */
    private final C7500os f25052a;

    /* renamed from: com.google.android.gms.internal.pc$a */
    /* loaded from: classes2.dex */
    private static final class C7540a<E> extends AbstractC7488oj<Collection<E>> {

        /* renamed from: a */
        private final AbstractC7488oj<E> f25053a;

        /* renamed from: b */
        private final AbstractC7525ox<? extends Collection<E>> f25054b;

        public C7540a(C7459nr c7459nr, Type type, AbstractC7488oj<E> abstractC7488oj, AbstractC7525ox<? extends Collection<E>> abstractC7525ox) {
            this.f25053a = new C7561pm(c7459nr, abstractC7488oj, type);
            this.f25054b = abstractC7525ox;
        }

        @Override // com.google.android.gms.internal.AbstractC7488oj
        /* renamed from: a */
        public Collection<E> mo14172b(C7598pp c7598pp) {
            if (c7598pp.mo14146f() == EnumC7600pq.NULL) {
                c7598pp.mo14142j();
                return null;
            }
            Collection<E> mo14275a = this.f25054b.mo14275a();
            c7598pp.mo14165a();
            while (c7598pp.mo14147e()) {
                mo14275a.add(this.f25053a.mo14172b(c7598pp));
            }
            c7598pp.mo14158b();
            return mo14275a;
        }

        @Override // com.google.android.gms.internal.AbstractC7488oj
        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo14173a(C7602ps c7602ps, Object obj) {
            m14265a(c7602ps, (Collection) ((Collection) obj));
        }

        /* renamed from: a */
        public void m14265a(C7602ps c7602ps, Collection<E> collection) {
            if (collection == null) {
                c7602ps.mo14095f();
                return;
            }
            c7602ps.mo14107b();
            for (E e : collection) {
                this.f25053a.mo14173a(c7602ps, e);
            }
            c7602ps.mo14103c();
        }
    }

    public C7539pc(C7500os c7500os) {
        this.f25052a = c7500os;
    }

    @Override // com.google.android.gms.internal.AbstractC7489ok
    /* renamed from: a */
    public <T> AbstractC7488oj<T> mo14182a(C7459nr c7459nr, C7597po<T> c7597po) {
        Type m14168b = c7597po.m14168b();
        Class<? super T> m14171a = c7597po.m14171a();
        if (!Collection.class.isAssignableFrom(m14171a)) {
            return null;
        }
        Type m14325a = C7496or.m14325a(m14168b, (Class<?>) m14171a);
        return new C7540a(c7459nr, m14325a, c7459nr.m14403a((C7597po) C7597po.m14169a(m14325a)), this.f25052a.m14306a(c7597po));
    }
}
