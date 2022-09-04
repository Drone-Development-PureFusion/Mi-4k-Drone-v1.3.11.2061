package com.google.android.gms.internal;
/* renamed from: com.google.android.gms.internal.lj */
/* loaded from: classes2.dex */
public class C7348lj extends AbstractC7336lb {

    /* renamed from: a */
    private final C7160ij f24540a;

    public C7348lj(C7160ij c7160ij) {
        if (c7160ij.m15355i() != 1 || !c7160ij.m15363d().m14822f()) {
            this.f24540a = c7160ij;
            return;
        }
        throw new IllegalArgumentException("Can't create PathIndex with '.priority' as key. Please use PriorityIndex instead!");
    }

    @Override // java.util.Comparator
    /* renamed from: a */
    public int compare(C7343lg c7343lg, C7343lg c7343lg2) {
        int compareTo = c7343lg.m14751d().mo14750a(this.f24540a).compareTo(c7343lg2.m14751d().mo14750a(this.f24540a));
        return compareTo == 0 ? c7343lg.m14752c().compareTo(c7343lg2.m14752c()) : compareTo;
    }

    @Override // com.google.android.gms.internal.AbstractC7336lb
    /* renamed from: a */
    public C7343lg mo14703a(C7319kv c7319kv, AbstractC7344lh abstractC7344lh) {
        return new C7343lg(c7319kv, C7335la.m14778j().mo14749a(this.f24540a, abstractC7344lh));
    }

    @Override // com.google.android.gms.internal.AbstractC7336lb
    /* renamed from: a */
    public boolean mo14701a(AbstractC7344lh abstractC7344lh) {
        return !abstractC7344lh.mo14750a(this.f24540a).mo14739b();
    }

    @Override // com.google.android.gms.internal.AbstractC7336lb
    /* renamed from: b */
    public C7343lg mo14700b() {
        return new C7343lg(C7319kv.m14827b(), C7335la.m14778j().mo14749a(this.f24540a, AbstractC7344lh.f24536d));
    }

    @Override // com.google.android.gms.internal.AbstractC7336lb
    /* renamed from: c */
    public String mo14699c() {
        return this.f24540a.m15367b();
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f24540a.equals(((C7348lj) obj).f24540a);
    }

    public int hashCode() {
        return this.f24540a.hashCode();
    }
}
