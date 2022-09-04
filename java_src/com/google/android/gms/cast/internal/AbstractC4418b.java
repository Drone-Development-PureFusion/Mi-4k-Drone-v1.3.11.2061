package com.google.android.gms.cast.internal;

import com.google.android.gms.cast.C4201a;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4502m;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ahl;
/* renamed from: com.google.android.gms.cast.internal.b */
/* loaded from: classes2.dex */
public abstract class AbstractC4418b<R extends AbstractC4502m> extends ahl.AbstractC6343a<R, C4423e> {
    public AbstractC4418b(AbstractC4489g abstractC4489g) {
        super(C4201a.f16031k, abstractC4489g);
    }

    /* renamed from: a */
    public void m24269a(int i) {
        b((AbstractC4418b<R>) b(new Status(i)));
    }

    /* renamed from: a */
    public void m24268a(int i, String str) {
        b((AbstractC4418b<R>) b(new Status(i, str, null)));
    }
}
