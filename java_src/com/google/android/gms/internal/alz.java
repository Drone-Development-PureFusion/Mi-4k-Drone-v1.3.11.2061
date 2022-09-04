package com.google.android.gms.internal;

import android.app.PendingIntent;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.C4496j;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.AbstractC5175h;
import com.google.android.gms.fitness.data.AbstractC5167y;
import com.google.android.gms.fitness.request.AbstractC5221b;
import com.google.android.gms.fitness.request.BinderC5214aj;
import com.google.android.gms.fitness.request.C5222c;
import com.google.android.gms.fitness.request.DataSourcesRequest;
import com.google.android.gms.fitness.request.SensorRegistrationRequest;
import com.google.android.gms.fitness.request.SensorUnregistrationRequest;
import com.google.android.gms.fitness.result.DataSourcesResult;
import com.google.android.gms.internal.ahl;
import com.google.android.gms.internal.aku;
import com.google.android.gms.internal.aky;
import com.google.android.gms.internal.alq;
/* loaded from: classes2.dex */
public class alz implements AbstractC5175h {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.internal.alz$a */
    /* loaded from: classes2.dex */
    public interface AbstractC6546a {
        /* renamed from: a */
        void mo16864a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.internal.alz$b */
    /* loaded from: classes2.dex */
    public static class BinderC6547b extends aky.AbstractBinderC6476a {

        /* renamed from: a */
        private final ahl.AbstractC6344b<DataSourcesResult> f22237a;

        private BinderC6547b(ahl.AbstractC6344b<DataSourcesResult> abstractC6344b) {
            this.f22237a = abstractC6344b;
        }

        @Override // com.google.android.gms.internal.aky
        /* renamed from: a */
        public void mo16863a(DataSourcesResult dataSourcesResult) {
            this.f22237a.mo7413a(dataSourcesResult);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.internal.alz$c */
    /* loaded from: classes2.dex */
    public static class BinderC6548c extends alq.AbstractBinderC6512a {

        /* renamed from: a */
        private final ahl.AbstractC6344b<Status> f22238a;

        /* renamed from: b */
        private final AbstractC6546a f22239b;

        private BinderC6548c(ahl.AbstractC6344b<Status> abstractC6344b, AbstractC6546a abstractC6546a) {
            this.f22238a = abstractC6344b;
            this.f22239b = abstractC6546a;
        }

        @Override // com.google.android.gms.internal.alq
        /* renamed from: a */
        public void mo16844a(Status status) {
            if (this.f22239b != null && status.m24018f()) {
                this.f22239b.mo16864a();
            }
            this.f22238a.mo7413a(status);
        }
    }

    /* renamed from: a */
    private AbstractC4494i<Status> m16875a(AbstractC4489g abstractC4489g, final AbstractC5167y abstractC5167y, final PendingIntent pendingIntent, final AbstractC6546a abstractC6546a) {
        return abstractC4489g.mo17253b((AbstractC4489g) new aku.AbstractC6468c(abstractC4489g) { // from class: com.google.android.gms.internal.alz.4
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.aku.AbstractC6468c, com.google.android.gms.internal.ahn
            /* renamed from: a */
            public Status mo7807b(Status status) {
                return status;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(aku akuVar) {
                ((alj) akuVar.G()).mo16947a(new SensorUnregistrationRequest(abstractC5167y, pendingIntent, new BinderC6548c(this, abstractC6546a)));
            }
        });
    }

    /* renamed from: a */
    private AbstractC4494i<Status> m16871a(AbstractC4489g abstractC4489g, final C5222c c5222c, final AbstractC5167y abstractC5167y, final PendingIntent pendingIntent) {
        return abstractC4489g.mo17255a((AbstractC4489g) new aku.AbstractC6468c(abstractC4489g) { // from class: com.google.android.gms.internal.alz.2
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.aku.AbstractC6468c, com.google.android.gms.internal.ahn
            /* renamed from: a */
            public Status mo7807b(Status status) {
                return status;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(aku akuVar) {
                ((alj) akuVar.G()).mo16948a(new SensorRegistrationRequest(c5222c, abstractC5167y, pendingIntent, new amb(this)));
            }
        });
    }

    @Override // com.google.android.gms.fitness.AbstractC5175h
    /* renamed from: a */
    public AbstractC4494i<Status> mo16876a(AbstractC4489g abstractC4489g, PendingIntent pendingIntent) {
        return m16875a(abstractC4489g, (AbstractC5167y) null, pendingIntent, (AbstractC6546a) null);
    }

    @Override // com.google.android.gms.fitness.AbstractC5175h
    /* renamed from: a */
    public AbstractC4494i<DataSourcesResult> mo16874a(AbstractC4489g abstractC4489g, final DataSourcesRequest dataSourcesRequest) {
        return abstractC4489g.mo17255a((AbstractC4489g) new aku.AbstractC6466a<DataSourcesResult>(abstractC4489g) { // from class: com.google.android.gms.internal.alz.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahn
            /* renamed from: a */
            public DataSourcesResult mo7807b(Status status) {
                return DataSourcesResult.m20943a(status);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(aku akuVar) {
                ((alj) akuVar.G()).mo16949a(new DataSourcesRequest(dataSourcesRequest, new BinderC6547b(this)));
            }
        });
    }

    @Override // com.google.android.gms.fitness.AbstractC5175h
    /* renamed from: a */
    public AbstractC4494i<Status> mo16873a(AbstractC4489g abstractC4489g, final AbstractC5221b abstractC5221b) {
        BinderC5214aj m21078b = BinderC5214aj.C5216a.m21080a().m21078b(abstractC5221b);
        return m21078b == null ? C4496j.m23953a(Status.f16786a, abstractC4489g) : m16875a(abstractC4489g, m21078b, (PendingIntent) null, new AbstractC6546a() { // from class: com.google.android.gms.internal.alz.3
            @Override // com.google.android.gms.internal.alz.AbstractC6546a
            /* renamed from: a */
            public void mo16864a() {
                BinderC5214aj.C5216a.m21080a().m21077c(abstractC5221b);
            }
        });
    }

    @Override // com.google.android.gms.fitness.AbstractC5175h
    /* renamed from: a */
    public AbstractC4494i<Status> mo16872a(AbstractC4489g abstractC4489g, C5222c c5222c, PendingIntent pendingIntent) {
        return m16871a(abstractC4489g, c5222c, (AbstractC5167y) null, pendingIntent);
    }

    @Override // com.google.android.gms.fitness.AbstractC5175h
    /* renamed from: a */
    public AbstractC4494i<Status> mo16870a(AbstractC4489g abstractC4489g, C5222c c5222c, AbstractC5221b abstractC5221b) {
        return m16871a(abstractC4489g, c5222c, BinderC5214aj.C5216a.m21080a().m21079a(abstractC5221b), (PendingIntent) null);
    }
}
