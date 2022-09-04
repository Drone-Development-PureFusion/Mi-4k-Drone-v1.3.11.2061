package com.google.android.gms.internal;

import java.lang.Comparable;
import java.util.Comparator;
/* renamed from: com.google.android.gms.internal.hi */
/* loaded from: classes2.dex */
public class C7089hi<A extends Comparable<A>> implements Comparator<A> {

    /* renamed from: a */
    private static C7089hi f23879a = new C7089hi();

    private C7089hi() {
    }

    /* renamed from: a */
    public static <T extends Comparable<T>> C7089hi<T> m15602a(Class<T> cls) {
        return f23879a;
    }

    @Override // java.util.Comparator
    /* renamed from: a */
    public int compare(A a, A a2) {
        return a.compareTo(a2);
    }
}
