package com.google.android.gms.internal;

import com.google.android.gms.internal.C7271ju;
/* renamed from: com.google.android.gms.internal.jr */
/* loaded from: classes2.dex */
public class C7259jr {

    /* renamed from: b */
    private static final AbstractC7275jv<Boolean> f24346b = new AbstractC7275jv<Boolean>() { // from class: com.google.android.gms.internal.jr.1
        @Override // com.google.android.gms.internal.AbstractC7275jv
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public boolean mo14977a(Boolean bool) {
            return !bool.booleanValue();
        }
    };

    /* renamed from: c */
    private static final AbstractC7275jv<Boolean> f24347c = new AbstractC7275jv<Boolean>() { // from class: com.google.android.gms.internal.jr.2
        @Override // com.google.android.gms.internal.AbstractC7275jv
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public boolean mo14977a(Boolean bool) {
            return bool.booleanValue();
        }
    };

    /* renamed from: d */
    private static final C7271ju<Boolean> f24348d = new C7271ju<>(true);

    /* renamed from: e */
    private static final C7271ju<Boolean> f24349e = new C7271ju<>(false);

    /* renamed from: a */
    private final C7271ju<Boolean> f24350a;

    public C7259jr() {
        this.f24350a = C7271ju.m15000a();
    }

    private C7259jr(C7271ju<Boolean> c7271ju) {
        this.f24350a = c7271ju;
    }

    /* renamed from: a */
    public C7259jr m15041a(C7319kv c7319kv) {
        C7271ju<Boolean> m14992a = this.f24350a.m14992a(c7319kv);
        return new C7259jr(m14992a == null ? new C7271ju<>(this.f24350a.m14990b()) : (m14992a.m14990b() != null || this.f24350a.m14990b() == null) ? m14992a : m14992a.m14995a(C7160ij.m15371a(), (C7160ij) this.f24350a.m14990b()));
    }

    /* renamed from: a */
    public <T> T m15040a(T t, final C7271ju.AbstractC7274a<Void, T> abstractC7274a) {
        return (T) this.f24350a.m14991a((C7271ju<Boolean>) t, new C7271ju.AbstractC7274a<Boolean, T>() { // from class: com.google.android.gms.internal.jr.3
            /* JADX WARN: Type inference failed for: r5v1, types: [T, java.lang.Object] */
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public T m15034a(C7160ij c7160ij, Boolean bool, T t2) {
                return !bool.booleanValue() ? abstractC7274a.mo14978a(c7160ij, null, t2) : t2;
            }

            @Override // com.google.android.gms.internal.C7271ju.AbstractC7274a
            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo14978a(C7160ij c7160ij, Boolean bool, Object obj) {
                return m15034a(c7160ij, bool, (Boolean) obj);
            }
        });
    }

    /* renamed from: a */
    public boolean m15043a() {
        return this.f24350a.m14993a(f24347c);
    }

    /* renamed from: a */
    public boolean m15042a(C7160ij c7160ij) {
        Boolean m14989b = this.f24350a.m14989b(c7160ij);
        return m14989b != null && m14989b.booleanValue();
    }

    /* renamed from: b */
    public boolean m15039b(C7160ij c7160ij) {
        Boolean m14989b = this.f24350a.m14989b(c7160ij);
        return m14989b != null && !m14989b.booleanValue();
    }

    /* renamed from: c */
    public C7259jr m15038c(C7160ij c7160ij) {
        if (this.f24350a.m14988b(c7160ij, f24346b) != null) {
            throw new IllegalArgumentException("Can't prune path that was kept previously!");
        }
        return this.f24350a.m14988b(c7160ij, f24347c) != null ? this : new C7259jr(this.f24350a.m14997a(c7160ij, f24348d));
    }

    /* renamed from: d */
    public C7259jr m15037d(C7160ij c7160ij) {
        return this.f24350a.m14988b(c7160ij, f24346b) != null ? this : new C7259jr(this.f24350a.m14997a(c7160ij, f24349e));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7259jr) && this.f24350a.equals(((C7259jr) obj).f24350a);
    }

    public int hashCode() {
        return this.f24350a.hashCode();
    }

    public String toString() {
        String valueOf = String.valueOf(this.f24350a.toString());
        return new StringBuilder(String.valueOf(valueOf).length() + 14).append("{PruneForest:").append(valueOf).append("}").toString();
    }
}
