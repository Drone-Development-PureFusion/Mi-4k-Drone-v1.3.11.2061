package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
/* renamed from: com.google.android.gms.internal.lm */
/* loaded from: classes2.dex */
public class C7351lm {

    /* renamed from: a */
    static final /* synthetic */ boolean f24542a;

    /* renamed from: b */
    private final C7160ij f24543b;

    /* renamed from: c */
    private final C7160ij f24544c;

    /* renamed from: d */
    private final AbstractC7344lh f24545d;

    static {
        f24542a = !C7351lm.class.desiredAssertionStatus();
    }

    public C7351lm(C7120ht c7120ht) {
        C7160ij c7160ij = null;
        List<String> m15488a = c7120ht.m15488a();
        this.f24543b = m15488a != null ? new C7160ij(m15488a) : null;
        List<String> m15487b = c7120ht.m15487b();
        this.f24544c = m15487b != null ? new C7160ij(m15487b) : c7160ij;
        this.f24545d = C7347li.m14735a(c7120ht.m15486c());
    }

    /* renamed from: a */
    private AbstractC7344lh m14727a(C7160ij c7160ij, AbstractC7344lh abstractC7344lh, AbstractC7344lh abstractC7344lh2) {
        boolean z = true;
        int compareTo = this.f24543b == null ? 1 : c7160ij.compareTo(this.f24543b);
        int compareTo2 = this.f24544c == null ? -1 : c7160ij.compareTo(this.f24544c);
        boolean z2 = this.f24543b != null && c7160ij.m15366b(this.f24543b);
        if (this.f24544c == null || !c7160ij.m15366b(this.f24544c)) {
            z = false;
        }
        if (compareTo <= 0 || compareTo2 >= 0 || z) {
            if (compareTo > 0 && z && abstractC7344lh2.mo14743e()) {
                return abstractC7344lh2;
            }
            if (compareTo > 0 && compareTo2 == 0) {
                if (!f24542a && !z) {
                    throw new AssertionError();
                }
                if (!f24542a && abstractC7344lh2.mo14743e()) {
                    throw new AssertionError();
                }
                return abstractC7344lh.mo14743e() ? C7335la.m14778j() : abstractC7344lh;
            } else if (!z2 && !z) {
                if (!f24542a && compareTo2 <= 0 && compareTo > 0) {
                    throw new AssertionError();
                }
                return abstractC7344lh;
            } else {
                HashSet hashSet = new HashSet();
                Iterator<C7343lg> it2 = abstractC7344lh.iterator();
                while (it2.hasNext()) {
                    hashSet.add(it2.next().m14752c());
                }
                Iterator<C7343lg> it3 = abstractC7344lh2.iterator();
                while (it3.hasNext()) {
                    hashSet.add(it3.next().m14752c());
                }
                ArrayList<C7319kv> arrayList = new ArrayList(hashSet.size() + 1);
                arrayList.addAll(hashSet);
                if (!abstractC7344lh2.mo14737f().mo14739b() || !abstractC7344lh.mo14737f().mo14739b()) {
                    arrayList.add(C7319kv.m14825c());
                }
                AbstractC7344lh abstractC7344lh3 = abstractC7344lh;
                for (C7319kv c7319kv : arrayList) {
                    AbstractC7344lh mo14738c = abstractC7344lh.mo14738c(c7319kv);
                    AbstractC7344lh m14727a = m14727a(c7160ij.m15368a(c7319kv), abstractC7344lh.mo14738c(c7319kv), abstractC7344lh2.mo14738c(c7319kv));
                    abstractC7344lh3 = m14727a != mo14738c ? abstractC7344lh3.mo14748a(c7319kv, m14727a) : abstractC7344lh3;
                }
                return abstractC7344lh3;
            }
        }
        return abstractC7344lh2;
    }

    /* renamed from: a */
    public AbstractC7344lh m14726a(AbstractC7344lh abstractC7344lh) {
        return m14727a(C7160ij.m15371a(), abstractC7344lh, this.f24545d);
    }

    public String toString() {
        String valueOf = String.valueOf(this.f24543b);
        String valueOf2 = String.valueOf(this.f24544c);
        String valueOf3 = String.valueOf(this.f24545d);
        return new StringBuilder(String.valueOf(valueOf).length() + 55 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length()).append("RangeMerge{optExclusiveStart=").append(valueOf).append(", optInclusiveEnd=").append(valueOf2).append(", snap=").append(valueOf3).append("}").toString();
    }
}
