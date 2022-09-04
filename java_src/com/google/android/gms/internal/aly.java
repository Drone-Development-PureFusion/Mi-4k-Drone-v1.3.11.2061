package com.google.android.gms.internal;

import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.AbstractC5174g;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Subscription;
import com.google.android.gms.fitness.request.ListSubscriptionsRequest;
import com.google.android.gms.fitness.request.SubscribeRequest;
import com.google.android.gms.fitness.request.UnsubscribeRequest;
import com.google.android.gms.fitness.result.ListSubscriptionsResult;
import com.google.android.gms.internal.ahl;
import com.google.android.gms.internal.akt;
import com.google.android.gms.internal.all;
/* loaded from: classes2.dex */
public class aly implements AbstractC5174g {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.internal.aly$a */
    /* loaded from: classes2.dex */
    public static class BinderC6541a extends all.AbstractBinderC6502a {

        /* renamed from: a */
        private final ahl.AbstractC6344b<ListSubscriptionsResult> f22224a;

        private BinderC6541a(ahl.AbstractC6344b<ListSubscriptionsResult> abstractC6344b) {
            this.f22224a = abstractC6344b;
        }

        @Override // com.google.android.gms.internal.all
        /* renamed from: a */
        public void mo16877a(ListSubscriptionsResult listSubscriptionsResult) {
            this.f22224a.mo7413a(listSubscriptionsResult);
        }
    }

    /* renamed from: b */
    private AbstractC4494i<Status> m16886b(AbstractC4489g abstractC4489g, final Subscription subscription) {
        return abstractC4489g.mo17255a((AbstractC4489g) new akt.AbstractC6465c(abstractC4489g) { // from class: com.google.android.gms.internal.aly.3
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(akt aktVar) {
                ((alh) aktVar.G()).mo16956a(new SubscribeRequest(subscription, false, new amb(this)));
            }
        });
    }

    @Override // com.google.android.gms.fitness.AbstractC5174g
    /* renamed from: a */
    public AbstractC4494i<ListSubscriptionsResult> mo16892a(AbstractC4489g abstractC4489g) {
        return abstractC4489g.mo17255a((AbstractC4489g) new akt.AbstractC6463a<ListSubscriptionsResult>(abstractC4489g) { // from class: com.google.android.gms.internal.aly.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahn
            /* renamed from: a */
            public ListSubscriptionsResult mo7807b(Status status) {
                return ListSubscriptionsResult.m20927a(status);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(akt aktVar) {
                ((alh) aktVar.G()).mo16957a(new ListSubscriptionsRequest(null, new BinderC6541a(this)));
            }
        });
    }

    @Override // com.google.android.gms.fitness.AbstractC5174g
    /* renamed from: a */
    public AbstractC4494i<Status> mo16891a(AbstractC4489g abstractC4489g, DataSource dataSource) {
        return m16886b(abstractC4489g, new Subscription.C5137a().m21526a(dataSource).m21527a());
    }

    @Override // com.google.android.gms.fitness.AbstractC5174g
    /* renamed from: a */
    public AbstractC4494i<Status> mo16890a(AbstractC4489g abstractC4489g, DataType dataType) {
        return m16886b(abstractC4489g, new Subscription.C5137a().m21525a(dataType).m21527a());
    }

    @Override // com.google.android.gms.fitness.AbstractC5174g
    /* renamed from: a */
    public AbstractC4494i<Status> mo16889a(AbstractC4489g abstractC4489g, Subscription subscription) {
        return subscription.m21533b() == null ? mo16888b(abstractC4489g, subscription.m21535a()) : mo16887b(abstractC4489g, subscription.m21533b());
    }

    @Override // com.google.android.gms.fitness.AbstractC5174g
    /* renamed from: b */
    public AbstractC4494i<Status> mo16888b(AbstractC4489g abstractC4489g, final DataSource dataSource) {
        return abstractC4489g.mo17253b((AbstractC4489g) new akt.AbstractC6465c(abstractC4489g) { // from class: com.google.android.gms.internal.aly.5
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(akt aktVar) {
                ((alh) aktVar.G()).mo16955a(new UnsubscribeRequest(null, dataSource, new amb(this)));
            }
        });
    }

    @Override // com.google.android.gms.fitness.AbstractC5174g
    /* renamed from: b */
    public AbstractC4494i<Status> mo16887b(AbstractC4489g abstractC4489g, final DataType dataType) {
        return abstractC4489g.mo17253b((AbstractC4489g) new akt.AbstractC6465c(abstractC4489g) { // from class: com.google.android.gms.internal.aly.4
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(akt aktVar) {
                ((alh) aktVar.G()).mo16955a(new UnsubscribeRequest(dataType, null, new amb(this)));
            }
        });
    }

    @Override // com.google.android.gms.fitness.AbstractC5174g
    /* renamed from: c */
    public AbstractC4494i<ListSubscriptionsResult> mo16885c(AbstractC4489g abstractC4489g, final DataType dataType) {
        return abstractC4489g.mo17255a((AbstractC4489g) new akt.AbstractC6463a<ListSubscriptionsResult>(abstractC4489g) { // from class: com.google.android.gms.internal.aly.2
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahn
            /* renamed from: a */
            public ListSubscriptionsResult mo7807b(Status status) {
                return ListSubscriptionsResult.m20927a(status);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(akt aktVar) {
                ((alh) aktVar.G()).mo16957a(new ListSubscriptionsRequest(dataType, new BinderC6541a(this)));
            }
        });
    }
}
