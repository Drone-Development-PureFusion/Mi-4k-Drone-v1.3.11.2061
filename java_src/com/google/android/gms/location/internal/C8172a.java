package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.AbstractC8163b;
import com.google.android.gms.location.C8158a;
/* renamed from: com.google.android.gms.location.internal.a */
/* loaded from: classes2.dex */
public class C8172a implements AbstractC8163b {

    /* renamed from: com.google.android.gms.location.internal.a$a */
    /* loaded from: classes2.dex */
    private static abstract class AbstractC8175a extends C8158a.AbstractC8160a<Status> {
        public AbstractC8175a(AbstractC4489g abstractC4489g) {
            super(abstractC4489g);
        }

        @Override // com.google.android.gms.internal.ahn
        /* renamed from: a */
        public Status mo7807b(Status status) {
            return status;
        }
    }

    @Override // com.google.android.gms.location.AbstractC8163b
    /* renamed from: a */
    public AbstractC4494i<Status> mo12519a(AbstractC4489g abstractC4489g, final long j, final PendingIntent pendingIntent) {
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC8175a(abstractC4489g) { // from class: com.google.android.gms.location.internal.a.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C8215l c8215l) {
                c8215l.m12417a(j, pendingIntent);
                b((C81731) Status.f16786a);
            }
        });
    }

    @Override // com.google.android.gms.location.AbstractC8163b
    /* renamed from: a */
    public AbstractC4494i<Status> mo12518a(AbstractC4489g abstractC4489g, final PendingIntent pendingIntent) {
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC8175a(abstractC4489g) { // from class: com.google.android.gms.location.internal.a.2
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C8215l c8215l) {
                c8215l.m12416a(pendingIntent);
                b((C81742) Status.f16786a);
            }
        });
    }
}
