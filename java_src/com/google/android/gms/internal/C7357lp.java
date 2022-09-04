package com.google.android.gms.internal;
/* renamed from: com.google.android.gms.internal.lp */
/* loaded from: classes2.dex */
public class C7357lp extends AbstractC7336lb {

    /* renamed from: a */
    private static final C7357lp f24553a = new C7357lp();

    private C7357lp() {
    }

    /* renamed from: d */
    public static C7357lp m14698d() {
        return f24553a;
    }

    @Override // java.util.Comparator
    /* renamed from: a */
    public int compare(C7343lg c7343lg, C7343lg c7343lg2) {
        int compareTo = c7343lg.m14751d().compareTo(c7343lg2.m14751d());
        return compareTo == 0 ? c7343lg.m14752c().compareTo(c7343lg2.m14752c()) : compareTo;
    }

    @Override // com.google.android.gms.internal.AbstractC7336lb
    /* renamed from: a */
    public C7343lg mo14703a(C7319kv c7319kv, AbstractC7344lh abstractC7344lh) {
        return new C7343lg(c7319kv, abstractC7344lh);
    }

    @Override // com.google.android.gms.internal.AbstractC7336lb
    /* renamed from: a */
    public boolean mo14701a(AbstractC7344lh abstractC7344lh) {
        return true;
    }

    @Override // com.google.android.gms.internal.AbstractC7336lb
    /* renamed from: b */
    public C7343lg mo14700b() {
        return new C7343lg(C7319kv.m14827b(), AbstractC7344lh.f24536d);
    }

    @Override // com.google.android.gms.internal.AbstractC7336lb
    /* renamed from: c */
    public String mo14699c() {
        return ".value";
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        return obj instanceof C7357lp;
    }

    public int hashCode() {
        return 4;
    }

    public String toString() {
        return "ValueIndex";
    }
}
