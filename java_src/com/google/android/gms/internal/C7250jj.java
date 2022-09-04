package com.google.android.gms.internal;

import com.google.android.gms.internal.AbstractC7246jh;
/* renamed from: com.google.android.gms.internal.jj */
/* loaded from: classes2.dex */
public class C7250jj extends AbstractC7246jh {

    /* renamed from: a */
    private final AbstractC7344lh f24336a;

    public C7250jj(C7248ji c7248ji, C7160ij c7160ij, AbstractC7344lh abstractC7344lh) {
        super(AbstractC7246jh.EnumC7247a.Overwrite, c7248ji, c7160ij);
        this.f24336a = abstractC7344lh;
    }

    @Override // com.google.android.gms.internal.AbstractC7246jh
    /* renamed from: a */
    public AbstractC7246jh mo15090a(C7319kv c7319kv) {
        return this.f24321d.m15356h() ? new C7250jj(this.f24320c, C7160ij.m15371a(), this.f24336a.mo14738c(c7319kv)) : new C7250jj(this.f24320c, this.f24321d.m15361e(), this.f24336a);
    }

    /* renamed from: a */
    public AbstractC7344lh m15091a() {
        return this.f24336a;
    }

    public String toString() {
        return String.format("Overwrite { path=%s, source=%s, snapshot=%s }", c(), d(), this.f24336a);
    }
}
