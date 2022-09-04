package com.google.android.gms.fitness;

import com.google.android.gms.common.C4538f;
import com.google.android.gms.common.api.Scope;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
/* renamed from: com.google.android.gms.fitness.j */
/* loaded from: classes2.dex */
public final class C5182j {
    /* renamed from: a */
    public static Scope m21396a(Scope scope) {
        return scope.equals(new Scope(C4538f.f16931k)) ? new Scope(C4538f.f16932l) : scope.equals(new Scope(C4538f.f16933m)) ? new Scope(C4538f.f16934n) : scope.equals(new Scope(C4538f.f16935o)) ? new Scope(C4538f.f16936p) : scope.equals(new Scope(C4538f.f16937q)) ? new Scope(C4538f.f16938r) : scope;
    }

    /* renamed from: a */
    public static Set<Scope> m21395a(Collection<Scope> collection) {
        HashSet hashSet = new HashSet(collection.size());
        for (Scope scope : collection) {
            Scope m21396a = m21396a(scope);
            if (m21396a.equals(scope) || !collection.contains(m21396a)) {
                hashSet.add(scope);
            }
        }
        return hashSet;
    }
}
