package com.google.android.gms.internal;

import java.util.Comparator;
/* renamed from: com.google.android.gms.internal.lb */
/* loaded from: classes2.dex */
public abstract class AbstractC7336lb implements Comparator<C7343lg> {
    /* renamed from: a */
    public static AbstractC7336lb m14774a(String str) {
        if (str.equals(".value")) {
            return C7357lp.m14698d();
        }
        if (str.equals(".key")) {
            return C7338ld.m14761d();
        }
        if (!str.equals(".priority")) {
            return new C7348lj(new C7160ij(str));
        }
        throw new IllegalStateException("queryDefinition shouldn't ever be .priority since it's the default");
    }

    /* renamed from: a */
    public int m14776a(C7343lg c7343lg, C7343lg c7343lg2, boolean z) {
        return z ? compare(c7343lg2, c7343lg) : compare(c7343lg, c7343lg2);
    }

    /* renamed from: a */
    public C7343lg m14777a() {
        return C7343lg.m14754a();
    }

    /* renamed from: a */
    public abstract C7343lg mo14703a(C7319kv c7319kv, AbstractC7344lh abstractC7344lh);

    /* renamed from: a */
    public abstract boolean mo14701a(AbstractC7344lh abstractC7344lh);

    /* renamed from: a */
    public boolean m14775a(AbstractC7344lh abstractC7344lh, AbstractC7344lh abstractC7344lh2) {
        return compare(new C7343lg(C7319kv.m14830a(), abstractC7344lh), new C7343lg(C7319kv.m14830a(), abstractC7344lh2)) != 0;
    }

    /* renamed from: b */
    public abstract C7343lg mo14700b();

    /* renamed from: c */
    public abstract String mo14699c();
}
