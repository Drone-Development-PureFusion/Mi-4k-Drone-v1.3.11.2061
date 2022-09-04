package com.google.android.gms.internal;

import com.google.android.gms.internal.AbstractC7246jh;
/* renamed from: com.google.android.gms.internal.je */
/* loaded from: classes2.dex */
public class C7243je extends AbstractC7246jh {

    /* renamed from: a */
    private final boolean f24315a;

    /* renamed from: e */
    private final C7271ju<Boolean> f24316e;

    public C7243je(C7160ij c7160ij, C7271ju<Boolean> c7271ju, boolean z) {
        super(AbstractC7246jh.EnumC7247a.AckUserWrite, C7248ji.f24327a, c7160ij);
        this.f24316e = c7271ju;
        this.f24315a = z;
    }

    @Override // com.google.android.gms.internal.AbstractC7246jh
    /* renamed from: a */
    public AbstractC7246jh mo15090a(C7319kv c7319kv) {
        if (!this.f24321d.m15356h()) {
            C7392mk.m14606a(this.f24321d.m15363d().equals(c7319kv), "operationForChild called for unrelated child.");
            return new C7243je(this.f24321d.m15361e(), this.f24316e, this.f24315a);
        } else if (this.f24316e.m14990b() == null) {
            return new C7243je(C7160ij.m15371a(), this.f24316e.m14986c(new C7160ij(c7319kv)), this.f24315a);
        } else {
            C7392mk.m14606a(this.f24316e.m14987c().mo15614d(), "affectedTree should not have overlapping affected paths.");
            return this;
        }
    }

    /* renamed from: a */
    public C7271ju<Boolean> m15102a() {
        return this.f24316e;
    }

    /* renamed from: b */
    public boolean m15101b() {
        return this.f24315a;
    }

    public String toString() {
        return String.format("AckUserWrite { path=%s, revert=%s, affectedTree=%s }", c(), Boolean.valueOf(this.f24315a), this.f24316e);
    }
}
