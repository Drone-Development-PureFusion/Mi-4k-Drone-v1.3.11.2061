package com.google.android.gms.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.oi */
/* loaded from: classes2.dex */
public final class C7485oi<T> extends AbstractC7488oj<T> {

    /* renamed from: a */
    private final AbstractC7480of<T> f24959a;

    /* renamed from: b */
    private final AbstractC7470nw<T> f24960b;

    /* renamed from: c */
    private final C7459nr f24961c;

    /* renamed from: d */
    private final C7597po<T> f24962d;

    /* renamed from: e */
    private final AbstractC7489ok f24963e;

    /* renamed from: f */
    private AbstractC7488oj<T> f24964f;

    /* renamed from: com.google.android.gms.internal.oi$a */
    /* loaded from: classes2.dex */
    private static class C7487a implements AbstractC7489ok {

        /* renamed from: a */
        private final C7597po<?> f24965a;

        /* renamed from: b */
        private final boolean f24966b;

        /* renamed from: c */
        private final Class<?> f24967c;

        /* renamed from: d */
        private final AbstractC7480of<?> f24968d;

        /* renamed from: e */
        private final AbstractC7470nw<?> f24969e;

        private C7487a(Object obj, C7597po<?> c7597po, boolean z, Class<?> cls) {
            this.f24968d = obj instanceof AbstractC7480of ? (AbstractC7480of) obj : null;
            this.f24969e = obj instanceof AbstractC7470nw ? (AbstractC7470nw) obj : null;
            C7494op.m14329a((this.f24968d == null && this.f24969e == null) ? false : true);
            this.f24965a = c7597po;
            this.f24966b = z;
            this.f24967c = cls;
        }

        @Override // com.google.android.gms.internal.AbstractC7489ok
        /* renamed from: a */
        public <T> AbstractC7488oj<T> mo14182a(C7459nr c7459nr, C7597po<T> c7597po) {
            if (this.f24965a != null ? this.f24965a.equals(c7597po) || (this.f24966b && this.f24965a.m14168b() == c7597po.m14171a()) : this.f24967c.isAssignableFrom(c7597po.m14171a())) {
                return new C7485oi(this.f24968d, this.f24969e, c7459nr, c7597po, this);
            }
            return null;
        }
    }

    private C7485oi(AbstractC7480of<T> abstractC7480of, AbstractC7470nw<T> abstractC7470nw, C7459nr c7459nr, C7597po<T> c7597po, AbstractC7489ok abstractC7489ok) {
        this.f24959a = abstractC7480of;
        this.f24960b = abstractC7470nw;
        this.f24961c = c7459nr;
        this.f24962d = c7597po;
        this.f24963e = abstractC7489ok;
    }

    /* renamed from: a */
    private AbstractC7488oj<T> m14339a() {
        AbstractC7488oj<T> abstractC7488oj = this.f24964f;
        if (abstractC7488oj != null) {
            return abstractC7488oj;
        }
        AbstractC7488oj<T> m14404a = this.f24961c.m14404a(this.f24963e, this.f24962d);
        this.f24964f = m14404a;
        return m14404a;
    }

    /* renamed from: a */
    public static AbstractC7489ok m14338a(C7597po<?> c7597po, Object obj) {
        return new C7487a(obj, c7597po, false, null);
    }

    /* renamed from: b */
    public static AbstractC7489ok m14337b(C7597po<?> c7597po, Object obj) {
        return new C7487a(obj, c7597po, c7597po.m14168b() == c7597po.m14171a(), null);
    }

    @Override // com.google.android.gms.internal.AbstractC7488oj
    /* renamed from: a */
    public void mo14173a(C7602ps c7602ps, T t) {
        if (this.f24959a == null) {
            m14339a().mo14173a(c7602ps, t);
        } else if (t == null) {
            c7602ps.mo14095f();
        } else {
            C7527oz.m14271a(this.f24959a.mo14340a(t, this.f24962d.m14168b(), this.f24961c.f24927b), c7602ps);
        }
    }

    @Override // com.google.android.gms.internal.AbstractC7488oj
    /* renamed from: b */
    public T mo14172b(C7598pp c7598pp) {
        if (this.f24960b == null) {
            return m14339a().mo14172b(c7598pp);
        }
        AbstractC7471nx m14270a = C7527oz.m14270a(c7598pp);
        if (m14270a.m14368k()) {
            return null;
        }
        try {
            return this.f24960b.mo14372b(m14270a, this.f24962d.m14168b(), this.f24961c.f24926a);
        } catch (C7476ob e) {
            throw e;
        } catch (Exception e2) {
            throw new C7476ob(e2);
        }
    }
}
