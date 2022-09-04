package com.google.android.gms.internal;

import java.util.Collections;
import java.util.List;
/* renamed from: com.google.android.gms.internal.hk */
/* loaded from: classes2.dex */
public class C7092hk {

    /* renamed from: a */
    private final List<List<String>> f23893a;

    /* renamed from: b */
    private final List<String> f23894b;

    public C7092hk(List<List<String>> list, List<String> list2) {
        if (list.size() != list2.size() - 1) {
            throw new IllegalArgumentException("Number of posts need to be n-1 for n hashes in CompoundHash");
        }
        this.f23893a = list;
        this.f23894b = list2;
    }

    /* renamed from: a */
    public List<List<String>> m15597a() {
        return Collections.unmodifiableList(this.f23893a);
    }

    /* renamed from: b */
    public List<String> m15596b() {
        return Collections.unmodifiableList(this.f23894b);
    }
}
