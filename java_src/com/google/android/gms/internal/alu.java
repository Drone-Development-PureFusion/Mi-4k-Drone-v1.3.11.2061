package com.google.android.gms.internal;

import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.AbstractC5127b;
import com.google.android.gms.fitness.request.DataTypeCreateRequest;
import com.google.android.gms.fitness.request.DataTypeReadRequest;
import com.google.android.gms.fitness.request.DisableFitRequest;
import com.google.android.gms.fitness.result.DataTypeResult;
import com.google.android.gms.internal.ahl;
import com.google.android.gms.internal.akp;
import com.google.android.gms.internal.akz;
/* loaded from: classes2.dex */
public class alu implements AbstractC5127b {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.internal.alu$a */
    /* loaded from: classes2.dex */
    public static class BinderC6526a extends akz.AbstractBinderC6478a {

        /* renamed from: a */
        private final ahl.AbstractC6344b<DataTypeResult> f22194a;

        private BinderC6526a(ahl.AbstractC6344b<DataTypeResult> abstractC6344b) {
            this.f22194a = abstractC6344b;
        }

        @Override // com.google.android.gms.internal.akz
        /* renamed from: a */
        public void mo16914a(DataTypeResult dataTypeResult) {
            this.f22194a.mo7413a(dataTypeResult);
        }
    }

    @Override // com.google.android.gms.fitness.AbstractC5127b
    /* renamed from: a */
    public AbstractC4494i<Status> mo16922a(AbstractC4489g abstractC4489g) {
        return abstractC4489g.mo17253b((AbstractC4489g) new akp.AbstractC6457c(abstractC4489g) { // from class: com.google.android.gms.internal.alu.3
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(akp akpVar) {
                ((ald) akpVar.G()).mo16976a(new DisableFitRequest(new amb(this)));
            }
        });
    }

    @Override // com.google.android.gms.fitness.AbstractC5127b
    /* renamed from: a */
    public AbstractC4494i<DataTypeResult> mo16921a(AbstractC4489g abstractC4489g, final DataTypeCreateRequest dataTypeCreateRequest) {
        return abstractC4489g.mo17253b((AbstractC4489g) new akp.AbstractC6455a<DataTypeResult>(abstractC4489g) { // from class: com.google.android.gms.internal.alu.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahn
            /* renamed from: a */
            public DataTypeResult mo7807b(Status status) {
                return DataTypeResult.m20936a(status);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(akp akpVar) {
                ((ald) akpVar.G()).mo16978a(new DataTypeCreateRequest(dataTypeCreateRequest, new BinderC6526a(this)));
            }
        });
    }

    @Override // com.google.android.gms.fitness.AbstractC5127b
    /* renamed from: a */
    public AbstractC4494i<DataTypeResult> mo16920a(AbstractC4489g abstractC4489g, final String str) {
        return abstractC4489g.mo17255a((AbstractC4489g) new akp.AbstractC6455a<DataTypeResult>(abstractC4489g) { // from class: com.google.android.gms.internal.alu.2
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahn
            /* renamed from: a */
            public DataTypeResult mo7807b(Status status) {
                return DataTypeResult.m20936a(status);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(akp akpVar) {
                ((ald) akpVar.G()).mo16977a(new DataTypeReadRequest(str, new BinderC6526a(this)));
            }
        });
    }
}
