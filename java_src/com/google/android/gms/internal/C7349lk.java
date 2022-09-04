package com.google.android.gms.internal;
/* renamed from: com.google.android.gms.internal.lk */
/* loaded from: classes2.dex */
public class C7349lk extends AbstractC7336lb {

    /* renamed from: a */
    private static final C7349lk f24541a = new C7349lk();

    private C7349lk() {
    }

    /* renamed from: d */
    public static C7349lk m14731d() {
        return f24541a;
    }

    @Override // java.util.Comparator
    /* renamed from: a */
    public int compare(C7343lg c7343lg, C7343lg c7343lg2) {
        return C7347li.m14736a(c7343lg.m14752c(), c7343lg.m14751d().mo14737f(), c7343lg2.m14752c(), c7343lg2.m14751d().mo14737f());
    }

    @Override // com.google.android.gms.internal.AbstractC7336lb
    /* renamed from: a */
    public C7343lg mo14703a(C7319kv c7319kv, AbstractC7344lh abstractC7344lh) {
        return new C7343lg(c7319kv, new C7355lo("[PRIORITY-POST]", abstractC7344lh));
    }

    @Override // com.google.android.gms.internal.AbstractC7336lb
    /* renamed from: a */
    public boolean mo14701a(AbstractC7344lh abstractC7344lh) {
        return !abstractC7344lh.mo14737f().mo14739b();
    }

    @Override // com.google.android.gms.internal.AbstractC7336lb
    /* renamed from: b */
    public C7343lg mo14700b() {
        return mo14703a(C7319kv.m14827b(), AbstractC7344lh.f24536d);
    }

    @Override // com.google.android.gms.internal.AbstractC7336lb
    /* renamed from: c */
    public String mo14699c() {
        throw new IllegalArgumentException("Can't get query definition on priority index!");
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        return obj instanceof C7349lk;
    }

    public int hashCode() {
        return 3155577;
    }

    public String toString() {
        return "PriorityIndex";
    }
}
