package com.google.android.gms.internal;

import com.google.android.gms.internal.AbstractC7246jh;
/* renamed from: com.google.android.gms.internal.jf */
/* loaded from: classes2.dex */
public class C7244jf extends AbstractC7246jh {

    /* renamed from: a */
    static final /* synthetic */ boolean f24317a;

    static {
        f24317a = !C7244jf.class.desiredAssertionStatus();
    }

    public C7244jf(C7248ji c7248ji, C7160ij c7160ij) {
        super(AbstractC7246jh.EnumC7247a.ListenComplete, c7248ji, c7160ij);
        if (f24317a || !c7248ji.m15096a()) {
            return;
        }
        throw new AssertionError("Can't have a listen complete from a user source");
    }

    @Override // com.google.android.gms.internal.AbstractC7246jh
    /* renamed from: a */
    public AbstractC7246jh mo15090a(C7319kv c7319kv) {
        return this.f24321d.m15356h() ? new C7244jf(this.f24320c, C7160ij.m15371a()) : new C7244jf(this.f24320c, this.f24321d.m15361e());
    }

    public String toString() {
        return String.format("ListenComplete { path=%s, source=%s }", c(), d());
    }
}
