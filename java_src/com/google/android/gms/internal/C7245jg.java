package com.google.android.gms.internal;

import com.google.android.gms.internal.AbstractC7246jh;
/* renamed from: com.google.android.gms.internal.jg */
/* loaded from: classes2.dex */
public class C7245jg extends AbstractC7246jh {

    /* renamed from: a */
    private final C7142ia f24318a;

    public C7245jg(C7248ji c7248ji, C7160ij c7160ij, C7142ia c7142ia) {
        super(AbstractC7246jh.EnumC7247a.Merge, c7248ji, c7160ij);
        this.f24318a = c7142ia;
    }

    /* renamed from: a */
    public C7142ia m15100a() {
        return this.f24318a;
    }

    @Override // com.google.android.gms.internal.AbstractC7246jh
    /* renamed from: a */
    public AbstractC7246jh mo15090a(C7319kv c7319kv) {
        if (!this.f24321d.m15356h()) {
            if (!this.f24321d.m15363d().equals(c7319kv)) {
                return null;
            }
            return new C7245jg(this.f24320c, this.f24321d.m15361e(), this.f24318a);
        }
        C7142ia m15421d = this.f24318a.m15421d(new C7160ij(c7319kv));
        if (m15421d.m15420e()) {
            return null;
        }
        return m15421d.m15427b() != null ? new C7250jj(this.f24320c, C7160ij.m15371a(), m15421d.m15427b()) : new C7245jg(this.f24320c, C7160ij.m15371a(), m15421d);
    }

    public String toString() {
        return String.format("Merge { path=%s, source=%s, children=%s }", c(), d(), this.f24318a);
    }
}
