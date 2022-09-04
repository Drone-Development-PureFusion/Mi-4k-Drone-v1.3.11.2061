package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.util.Log;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.fitness.AbstractC5172f;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.request.DailyTotalRequest;
import com.google.android.gms.fitness.request.DataDeleteRequest;
import com.google.android.gms.fitness.request.DataInsertRequest;
import com.google.android.gms.fitness.request.DataReadRequest;
import com.google.android.gms.fitness.request.DataUpdateListenerRegistrationRequest;
import com.google.android.gms.fitness.request.DataUpdateListenerUnregistrationRequest;
import com.google.android.gms.fitness.request.DataUpdateRequest;
import com.google.android.gms.fitness.result.DailyTotalResult;
import com.google.android.gms.fitness.result.DataReadResult;
import com.google.android.gms.internal.ahl;
import com.google.android.gms.internal.akr;
import com.google.android.gms.internal.akw;
import com.google.android.gms.internal.akx;
/* loaded from: classes2.dex */
public class alw implements AbstractC5172f {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.internal.alw$a */
    /* loaded from: classes2.dex */
    public static class BinderC6535a extends akx.AbstractBinderC6474a {

        /* renamed from: a */
        private final ahl.AbstractC6344b<DataReadResult> f22212a;

        /* renamed from: b */
        private int f22213b;

        /* renamed from: c */
        private DataReadResult f22214c;

        private BinderC6535a(ahl.AbstractC6344b<DataReadResult> abstractC6344b) {
            this.f22213b = 0;
            this.f22214c = null;
            this.f22212a = abstractC6344b;
        }

        @Override // com.google.android.gms.internal.akx
        /* renamed from: a */
        public void mo16893a(DataReadResult dataReadResult) {
            synchronized (this) {
                if (Log.isLoggable("Fitness", 2)) {
                    Log.v("Fitness", new StringBuilder(33).append("Received batch result ").append(this.f22213b).toString());
                }
                if (this.f22214c == null) {
                    this.f22214c = dataReadResult;
                } else {
                    this.f22214c.m20953a(dataReadResult);
                }
                this.f22213b++;
                if (this.f22213b == this.f22214c.m20949d()) {
                    this.f22212a.mo7413a(this.f22214c);
                }
            }
        }
    }

    /* renamed from: a */
    private AbstractC4494i<Status> m16911a(AbstractC4489g abstractC4489g, final DataSet dataSet, final boolean z) {
        C4588d.m23626a(dataSet, "Must set the data set");
        C4588d.m23622a(!dataSet.m21697d().isEmpty(), "Cannot use an empty data set");
        C4588d.m23626a(dataSet.m21702b().m21683e(), "Must set the app package name for the data source");
        return abstractC4489g.mo17255a((AbstractC4489g) new akr.AbstractC6461c(abstractC4489g) { // from class: com.google.android.gms.internal.alw.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(akr akrVar) {
                ((alf) akrVar.G()).mo16970a(new DataInsertRequest(dataSet, new amb(this), z));
            }
        });
    }

    /* renamed from: a */
    private AbstractC4494i<DailyTotalResult> m16909a(AbstractC4489g abstractC4489g, final DataType dataType, final boolean z) {
        return abstractC4489g.mo17255a((AbstractC4489g) new akr.AbstractC6459a<DailyTotalResult>(abstractC4489g) { // from class: com.google.android.gms.internal.alw.7
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahn
            /* renamed from: a */
            public DailyTotalResult mo7807b(Status status) {
                return DailyTotalResult.m20962a(status, dataType);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(akr akrVar) {
                ((alf) akrVar.G()).mo16972a(new DailyTotalRequest(new akw.AbstractBinderC6472a() { // from class: com.google.android.gms.internal.alw.7.1
                    @Override // com.google.android.gms.internal.akw
                    /* renamed from: a */
                    public void mo16894a(DailyTotalResult dailyTotalResult) {
                        b((C65337) dailyTotalResult);
                    }
                }, dataType, z));
            }
        });
    }

    @Override // com.google.android.gms.fitness.AbstractC5172f
    /* renamed from: a */
    public AbstractC4494i<Status> mo16913a(AbstractC4489g abstractC4489g, final PendingIntent pendingIntent) {
        return abstractC4489g.mo17253b((AbstractC4489g) new akr.AbstractC6461c(abstractC4489g) { // from class: com.google.android.gms.internal.alw.5
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(akr akrVar) {
                ((alf) akrVar.G()).mo16967a(new DataUpdateListenerUnregistrationRequest(pendingIntent, new amb(this)));
            }
        });
    }

    @Override // com.google.android.gms.fitness.AbstractC5172f
    /* renamed from: a */
    public AbstractC4494i<Status> mo16912a(AbstractC4489g abstractC4489g, DataSet dataSet) {
        return m16911a(abstractC4489g, dataSet, false);
    }

    @Override // com.google.android.gms.fitness.AbstractC5172f
    /* renamed from: a */
    public AbstractC4494i<DailyTotalResult> mo16910a(AbstractC4489g abstractC4489g, DataType dataType) {
        return m16909a(abstractC4489g, dataType, false);
    }

    @Override // com.google.android.gms.fitness.AbstractC5172f
    /* renamed from: a */
    public AbstractC4494i<Status> mo16908a(AbstractC4489g abstractC4489g, final DataDeleteRequest dataDeleteRequest) {
        return abstractC4489g.mo17255a((AbstractC4489g) new akr.AbstractC6461c(abstractC4489g) { // from class: com.google.android.gms.internal.alw.2
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(akr akrVar) {
                ((alf) akrVar.G()).mo16971a(new DataDeleteRequest(dataDeleteRequest, new amb(this)));
            }
        });
    }

    @Override // com.google.android.gms.fitness.AbstractC5172f
    /* renamed from: a */
    public AbstractC4494i<DataReadResult> mo16907a(AbstractC4489g abstractC4489g, final DataReadRequest dataReadRequest) {
        return abstractC4489g.mo17255a((AbstractC4489g) new akr.AbstractC6459a<DataReadResult>(abstractC4489g) { // from class: com.google.android.gms.internal.alw.6
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahn
            /* renamed from: a */
            public DataReadResult mo7807b(Status status) {
                return DataReadResult.m20958a(status, dataReadRequest.m21352a(), dataReadRequest.m21349b());
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(akr akrVar) {
                ((alf) akrVar.G()).mo16969a(new DataReadRequest(dataReadRequest, new BinderC6535a(this)));
            }
        });
    }

    @Override // com.google.android.gms.fitness.AbstractC5172f
    /* renamed from: a */
    public AbstractC4494i<Status> mo16906a(AbstractC4489g abstractC4489g, final DataUpdateListenerRegistrationRequest dataUpdateListenerRegistrationRequest) {
        return abstractC4489g.mo17255a((AbstractC4489g) new akr.AbstractC6461c(abstractC4489g) { // from class: com.google.android.gms.internal.alw.4
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(akr akrVar) {
                ((alf) akrVar.G()).mo16968a(new DataUpdateListenerRegistrationRequest(dataUpdateListenerRegistrationRequest, new amb(this)));
            }
        });
    }

    @Override // com.google.android.gms.fitness.AbstractC5172f
    /* renamed from: a */
    public AbstractC4494i<Status> mo16905a(AbstractC4489g abstractC4489g, final DataUpdateRequest dataUpdateRequest) {
        C4588d.m23626a(dataUpdateRequest.m21256c(), "Must set the data set");
        C4588d.m23628a(dataUpdateRequest.m21261a(), "Must set a non-zero value for startTimeMillis/startTime");
        C4588d.m23628a(dataUpdateRequest.m21258b(), "Must set a non-zero value for endTimeMillis/endTime");
        return abstractC4489g.mo17255a((AbstractC4489g) new akr.AbstractC6461c(abstractC4489g) { // from class: com.google.android.gms.internal.alw.3
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(akr akrVar) {
                ((alf) akrVar.G()).mo16966a(new DataUpdateRequest(dataUpdateRequest, new amb(this)));
            }
        });
    }

    @Override // com.google.android.gms.fitness.AbstractC5172f
    /* renamed from: b */
    public AbstractC4494i<DailyTotalResult> mo16904b(AbstractC4489g abstractC4489g, DataType dataType) {
        return m16909a(abstractC4489g, dataType, true);
    }
}
