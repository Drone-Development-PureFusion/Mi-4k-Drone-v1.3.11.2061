package com.google.android.gms.internal;

import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ahl;
import com.google.android.gms.internal.ajh;
/* loaded from: classes2.dex */
public final class ajf implements aje {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.internal.ajf$a */
    /* loaded from: classes2.dex */
    public static class BinderC6406a extends ajc {

        /* renamed from: a */
        private final ahl.AbstractC6344b<Status> f22010a;

        public BinderC6406a(ahl.AbstractC6344b<Status> abstractC6344b) {
            this.f22010a = abstractC6344b;
        }

        @Override // com.google.android.gms.internal.ajc, com.google.android.gms.internal.ajj
        /* renamed from: a */
        public void mo17122a(int i) {
            this.f22010a.mo7413a(new Status(i));
        }
    }

    @Override // com.google.android.gms.internal.aje
    /* renamed from: a */
    public AbstractC4494i<Status> mo17135a(AbstractC4489g abstractC4489g) {
        return abstractC4489g.mo17253b((AbstractC4489g) new ajh.AbstractC6409a(abstractC4489g) { // from class: com.google.android.gms.internal.ajf.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(aji ajiVar) {
                ((ajk) ajiVar.G()).mo17120a(new BinderC6406a(this));
            }
        });
    }
}
