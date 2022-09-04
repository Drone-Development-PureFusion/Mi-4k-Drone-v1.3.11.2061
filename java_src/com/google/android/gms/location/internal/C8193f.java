package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.AbstractC8167f;
import com.google.android.gms.location.AbstractC8170h;
import com.google.android.gms.location.C8229n;
import com.google.android.gms.location.GeofencingRequest;
import java.util.List;
/* renamed from: com.google.android.gms.location.internal.f */
/* loaded from: classes.dex */
public class C8193f implements AbstractC8170h {

    /* renamed from: com.google.android.gms.location.internal.f$a */
    /* loaded from: classes2.dex */
    private static abstract class AbstractC8197a extends C8229n.AbstractC8231a<Status> {
        public AbstractC8197a(AbstractC4489g abstractC4489g) {
            super(abstractC4489g);
        }

        @Override // com.google.android.gms.internal.ahn
        /* renamed from: a */
        public Status mo7807b(Status status) {
            return status;
        }
    }

    @Override // com.google.android.gms.location.AbstractC8170h
    /* renamed from: a */
    public AbstractC4494i<Status> mo12482a(AbstractC4489g abstractC4489g, final PendingIntent pendingIntent) {
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC8197a(abstractC4489g) { // from class: com.google.android.gms.location.internal.f.2
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C8215l c8215l) {
                c8215l.m12415a(pendingIntent, this);
            }
        });
    }

    @Override // com.google.android.gms.location.AbstractC8170h
    /* renamed from: a */
    public AbstractC4494i<Status> mo12481a(AbstractC4489g abstractC4489g, final GeofencingRequest geofencingRequest, final PendingIntent pendingIntent) {
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC8197a(abstractC4489g) { // from class: com.google.android.gms.location.internal.f.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C8215l c8215l) {
                c8215l.m12412a(geofencingRequest, pendingIntent, this);
            }
        });
    }

    @Override // com.google.android.gms.location.AbstractC8170h
    /* renamed from: a */
    public AbstractC4494i<Status> mo12480a(AbstractC4489g abstractC4489g, final List<String> list) {
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC8197a(abstractC4489g) { // from class: com.google.android.gms.location.internal.f.3
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C8215l c8215l) {
                c8215l.m12404a(list, this);
            }
        });
    }

    @Override // com.google.android.gms.location.AbstractC8170h
    @Deprecated
    /* renamed from: a */
    public AbstractC4494i<Status> mo12479a(AbstractC4489g abstractC4489g, List<AbstractC8167f> list, PendingIntent pendingIntent) {
        GeofencingRequest.C8155a c8155a = new GeofencingRequest.C8155a();
        c8155a.m12635a(list);
        c8155a.m12637a(5);
        return mo12481a(abstractC4489g, c8155a.m12638a(), pendingIntent);
    }
}
