package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.wearable.internal.AbstractC9612v;
/* renamed from: com.google.android.gms.wearable.internal.bl */
/* loaded from: classes2.dex */
public final class BinderC9574bl extends AbstractC9612v.AbstractBinderC9613a {

    /* renamed from: a */
    private final Object f30107a = new Object();

    /* renamed from: b */
    private AbstractC9575bm f30108b;

    /* renamed from: c */
    private C9565be f30109c;

    @Override // com.google.android.gms.wearable.internal.AbstractC9612v
    /* renamed from: a */
    public void mo7735a(int i, int i2) {
        AbstractC9575bm abstractC9575bm;
        C9565be c9565be;
        synchronized (this.f30107a) {
            abstractC9575bm = this.f30108b;
            c9565be = new C9565be(i, i2);
            this.f30109c = c9565be;
        }
        if (abstractC9575bm != null) {
            abstractC9575bm.mo7845a(c9565be);
        }
    }

    /* renamed from: a */
    public void m7846a(AbstractC9575bm abstractC9575bm) {
        C9565be c9565be;
        synchronized (this.f30107a) {
            this.f30108b = (AbstractC9575bm) C4588d.m23627a(abstractC9575bm);
            c9565be = this.f30109c;
        }
        if (c9565be != null) {
            abstractC9575bm.mo7845a(c9565be);
        }
    }
}
