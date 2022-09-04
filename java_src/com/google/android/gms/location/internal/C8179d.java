package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Looper;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ahl;
import com.google.android.gms.location.AbstractC8166e;
import com.google.android.gms.location.AbstractC8226k;
import com.google.android.gms.location.AbstractC8227l;
import com.google.android.gms.location.C8229n;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.internal.AbstractC8198g;
/* renamed from: com.google.android.gms.location.internal.d */
/* loaded from: classes2.dex */
public class C8179d implements AbstractC8166e {

    /* renamed from: com.google.android.gms.location.internal.d$a */
    /* loaded from: classes2.dex */
    private static abstract class AbstractC8190a extends C8229n.AbstractC8231a<Status> {
        public AbstractC8190a(AbstractC4489g abstractC4489g) {
            super(abstractC4489g);
        }

        @Override // com.google.android.gms.internal.ahn
        /* renamed from: a */
        public Status mo7807b(Status status) {
            return status;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.location.internal.d$b */
    /* loaded from: classes2.dex */
    public static class BinderC8191b extends AbstractC8198g.AbstractBinderC8199a {

        /* renamed from: a */
        private final ahl.AbstractC6344b<Status> f26797a;

        public BinderC8191b(ahl.AbstractC6344b<Status> abstractC6344b) {
            this.f26797a = abstractC6344b;
        }

        @Override // com.google.android.gms.location.internal.AbstractC8198g
        /* renamed from: a */
        public void mo12473a(FusedLocationProviderResult fusedLocationProviderResult) {
            this.f26797a.mo7413a(fusedLocationProviderResult.mo7645a());
        }
    }

    @Override // com.google.android.gms.location.AbstractC8166e
    /* renamed from: a */
    public Location mo12508a(AbstractC4489g abstractC4489g) {
        try {
            return C8229n.m12372a(abstractC4489g).m12402h();
        } catch (Exception e) {
            return null;
        }
    }

    @Override // com.google.android.gms.location.AbstractC8166e
    /* renamed from: a */
    public AbstractC4494i<Status> mo12507a(AbstractC4489g abstractC4489g, final PendingIntent pendingIntent) {
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC8190a(abstractC4489g) { // from class: com.google.android.gms.location.internal.d.2
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C8215l c8215l) {
                c8215l.m12414a(pendingIntent, new BinderC8191b(this));
            }
        });
    }

    @Override // com.google.android.gms.location.AbstractC8166e
    /* renamed from: a */
    public AbstractC4494i<Status> mo12506a(AbstractC4489g abstractC4489g, final Location location) {
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC8190a(abstractC4489g) { // from class: com.google.android.gms.location.internal.d.5
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C8215l c8215l) {
                c8215l.m12413a(location);
                b((C81855) Status.f16786a);
            }
        });
    }

    @Override // com.google.android.gms.location.AbstractC8166e
    /* renamed from: a */
    public AbstractC4494i<Status> mo12505a(AbstractC4489g abstractC4489g, final LocationRequest locationRequest, final PendingIntent pendingIntent) {
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC8190a(abstractC4489g) { // from class: com.google.android.gms.location.internal.d.9
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C8215l c8215l) {
                c8215l.m12411a(locationRequest, pendingIntent, new BinderC8191b(this));
            }
        });
    }

    @Override // com.google.android.gms.location.AbstractC8166e
    /* renamed from: a */
    public AbstractC4494i<Status> mo12504a(AbstractC4489g abstractC4489g, final LocationRequest locationRequest, final AbstractC8226k abstractC8226k, final Looper looper) {
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC8190a(abstractC4489g) { // from class: com.google.android.gms.location.internal.d.8
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C8215l c8215l) {
                c8215l.m12408a(LocationRequestInternal.m12547a(locationRequest), abstractC8226k, looper, new BinderC8191b(this));
            }
        });
    }

    @Override // com.google.android.gms.location.AbstractC8166e
    /* renamed from: a */
    public AbstractC4494i<Status> mo12503a(AbstractC4489g abstractC4489g, final LocationRequest locationRequest, final AbstractC8227l abstractC8227l) {
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC8190a(abstractC4489g) { // from class: com.google.android.gms.location.internal.d.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C8215l c8215l) {
                c8215l.m12410a(locationRequest, abstractC8227l, (Looper) null, new BinderC8191b(this));
            }
        });
    }

    @Override // com.google.android.gms.location.AbstractC8166e
    /* renamed from: a */
    public AbstractC4494i<Status> mo12502a(AbstractC4489g abstractC4489g, final LocationRequest locationRequest, final AbstractC8227l abstractC8227l, final Looper looper) {
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC8190a(abstractC4489g) { // from class: com.google.android.gms.location.internal.d.7
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C8215l c8215l) {
                c8215l.m12410a(locationRequest, abstractC8227l, looper, new BinderC8191b(this));
            }
        });
    }

    @Override // com.google.android.gms.location.AbstractC8166e
    /* renamed from: a */
    public AbstractC4494i<Status> mo12501a(AbstractC4489g abstractC4489g, final AbstractC8226k abstractC8226k) {
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC8190a(abstractC4489g) { // from class: com.google.android.gms.location.internal.d.3
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C8215l c8215l) {
                c8215l.m12406a(abstractC8226k, new BinderC8191b(this));
            }
        });
    }

    @Override // com.google.android.gms.location.AbstractC8166e
    /* renamed from: a */
    public AbstractC4494i<Status> mo12500a(AbstractC4489g abstractC4489g, final AbstractC8227l abstractC8227l) {
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC8190a(abstractC4489g) { // from class: com.google.android.gms.location.internal.d.10
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C8215l c8215l) {
                c8215l.m12405a(abstractC8227l, new BinderC8191b(this));
            }
        });
    }

    @Override // com.google.android.gms.location.AbstractC8166e
    /* renamed from: a */
    public AbstractC4494i<Status> mo12499a(AbstractC4489g abstractC4489g, final boolean z) {
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC8190a(abstractC4489g) { // from class: com.google.android.gms.location.internal.d.4
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C8215l c8215l) {
                c8215l.m12403a(z);
                b((C81844) Status.f16786a);
            }
        });
    }

    @Override // com.google.android.gms.location.AbstractC8166e
    /* renamed from: b */
    public LocationAvailability mo12498b(AbstractC4489g abstractC4489g) {
        try {
            return C8229n.m12372a(abstractC4489g).m12401i();
        } catch (Exception e) {
            return null;
        }
    }

    @Override // com.google.android.gms.location.AbstractC8166e
    /* renamed from: c */
    public AbstractC4494i<Status> mo12497c(AbstractC4489g abstractC4489g) {
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC8190a(abstractC4489g) { // from class: com.google.android.gms.location.internal.d.6
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C8215l c8215l) {
                c8215l.m12407a((AbstractC8198g) new BinderC8191b(this));
            }
        });
    }
}
