package com.google.android.gms.contextmanager.fence.internal;

import com.google.android.gms.awareness.AbstractC4092d;
import com.google.android.gms.awareness.fence.AbstractC4097c;
import com.google.android.gms.awareness.fence.AbstractC4099e;
import com.google.android.gms.awareness.fence.FenceQueryRequest;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.contextmanager.internal.C4758c;
import com.google.android.gms.contextmanager.internal.C4764d;
/* renamed from: com.google.android.gms.contextmanager.fence.internal.c */
/* loaded from: classes2.dex */
public class C4734c implements AbstractC4092d {
    @Override // com.google.android.gms.awareness.AbstractC4092d
    /* renamed from: a */
    public AbstractC4494i<AbstractC4097c> mo22932a(AbstractC4489g abstractC4489g, final FenceQueryRequest fenceQueryRequest) {
        return abstractC4489g.mo17255a((AbstractC4489g) new C4758c.AbstractC4759a(abstractC4489g) { // from class: com.google.android.gms.contextmanager.fence.internal.c.2
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C4764d c4764d) {
                c4764d.m22810a(this, (FenceQueryRequestImpl) fenceQueryRequest);
            }
        });
    }

    @Override // com.google.android.gms.awareness.AbstractC4092d
    /* renamed from: a */
    public AbstractC4494i<Status> mo22931a(AbstractC4489g abstractC4489g, final AbstractC4099e abstractC4099e) {
        return abstractC4489g.mo17255a((AbstractC4489g) new C4758c.AbstractC4763c(abstractC4489g) { // from class: com.google.android.gms.contextmanager.fence.internal.c.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C4764d c4764d) {
                c4764d.m22809a(this, (FenceUpdateRequestImpl) abstractC4099e);
            }
        });
    }
}
