package com.google.android.gms.internal;
/* renamed from: com.google.android.gms.internal.ld */
/* loaded from: classes2.dex */
public class C7338ld extends AbstractC7336lb {

    /* renamed from: a */
    static final /* synthetic */ boolean f24520a;

    /* renamed from: b */
    private static final C7338ld f24521b;

    static {
        f24520a = !C7338ld.class.desiredAssertionStatus();
        f24521b = new C7338ld();
    }

    private C7338ld() {
    }

    /* renamed from: d */
    public static C7338ld m14761d() {
        return f24521b;
    }

    @Override // java.util.Comparator
    /* renamed from: a */
    public int compare(C7343lg c7343lg, C7343lg c7343lg2) {
        return c7343lg.m14752c().compareTo(c7343lg2.m14752c());
    }

    @Override // com.google.android.gms.internal.AbstractC7336lb
    /* renamed from: a */
    public C7343lg mo14703a(C7319kv c7319kv, AbstractC7344lh abstractC7344lh) {
        if (f24520a || (abstractC7344lh instanceof C7355lo)) {
            return new C7343lg(C7319kv.m14828a((String) abstractC7344lh.mo14710a()), C7335la.m14778j());
        }
        throw new AssertionError();
    }

    @Override // com.google.android.gms.internal.AbstractC7336lb
    /* renamed from: a */
    public boolean mo14701a(AbstractC7344lh abstractC7344lh) {
        return true;
    }

    @Override // com.google.android.gms.internal.AbstractC7336lb
    /* renamed from: b */
    public C7343lg mo14700b() {
        return C7343lg.m14753b();
    }

    @Override // com.google.android.gms.internal.AbstractC7336lb
    /* renamed from: c */
    public String mo14699c() {
        return ".key";
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        return obj instanceof C7338ld;
    }

    public int hashCode() {
        return 37;
    }

    public String toString() {
        return "KeyIndex";
    }
}
