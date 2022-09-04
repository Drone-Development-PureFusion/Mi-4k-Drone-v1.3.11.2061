package com.google.android.gms.common.util;

import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C4588d;
import java.util.Set;
/* renamed from: com.google.android.gms.common.util.v */
/* loaded from: classes2.dex */
public final class C4699v {
    /* renamed from: a */
    public static String[] m23095a(Set<Scope> set) {
        C4588d.m23626a(set, "scopes can't be null.");
        return m23094a((Scope[]) set.toArray(new Scope[set.size()]));
    }

    /* renamed from: a */
    public static String[] m23094a(Scope[] scopeArr) {
        C4588d.m23626a(scopeArr, "scopes can't be null.");
        String[] strArr = new String[scopeArr.length];
        for (int i = 0; i < scopeArr.length; i++) {
            strArr[i] = scopeArr[i].m24024a();
        }
        return strArr;
    }
}
