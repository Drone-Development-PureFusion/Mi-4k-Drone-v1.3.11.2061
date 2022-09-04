package com.google.android.gms.internal;

import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.AbstractC5126a;
import com.google.android.gms.fitness.data.BleDevice;
import com.google.android.gms.fitness.request.AbstractC5202a;
import com.google.android.gms.fitness.request.ClaimBleDeviceRequest;
import com.google.android.gms.fitness.request.ListClaimedBleDevicesRequest;
import com.google.android.gms.fitness.request.StartBleScanRequest;
import com.google.android.gms.fitness.request.StopBleScanRequest;
import com.google.android.gms.fitness.request.UnclaimBleDeviceRequest;
import com.google.android.gms.fitness.result.BleDevicesResult;
import com.google.android.gms.internal.ahl;
import com.google.android.gms.internal.ako;
import com.google.android.gms.internal.amd;
/* loaded from: classes2.dex */
public class alt implements AbstractC5126a {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.internal.alt$a */
    /* loaded from: classes2.dex */
    public static class BinderC6522a extends amd.AbstractBinderC6558a {

        /* renamed from: a */
        private final ahl.AbstractC6344b<BleDevicesResult> f22188a;

        private BinderC6522a(ahl.AbstractC6344b<BleDevicesResult> abstractC6344b) {
            this.f22188a = abstractC6344b;
        }

        @Override // com.google.android.gms.internal.amd
        /* renamed from: a */
        public void mo16835a(BleDevicesResult bleDevicesResult) {
            this.f22188a.mo7413a(bleDevicesResult);
        }
    }

    @Override // com.google.android.gms.fitness.AbstractC5126a
    /* renamed from: a */
    public AbstractC4494i<BleDevicesResult> mo16843a(AbstractC4489g abstractC4489g) {
        return abstractC4489g.mo17255a((AbstractC4489g) new ako.AbstractC6452a<BleDevicesResult>(abstractC4489g) { // from class: com.google.android.gms.internal.alt.6
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahn
            /* renamed from: a */
            public BleDevicesResult mo7807b(Status status) {
                return BleDevicesResult.m20967a(status);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(ako akoVar) {
                ((alc) akoVar.G()).mo16983a(new ListClaimedBleDevicesRequest(new BinderC6522a(this)));
            }
        });
    }

    @Override // com.google.android.gms.fitness.AbstractC5126a
    /* renamed from: a */
    public AbstractC4494i<Status> mo16842a(AbstractC4489g abstractC4489g, final BleDevice bleDevice) {
        return abstractC4489g.mo17253b((AbstractC4489g) new ako.AbstractC6454c(abstractC4489g) { // from class: com.google.android.gms.internal.alt.4
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(ako akoVar) {
                ((alc) akoVar.G()).mo16984a(new ClaimBleDeviceRequest(bleDevice.m21758a(), bleDevice, new amb(this)));
            }
        });
    }

    @Override // com.google.android.gms.fitness.AbstractC5126a
    /* renamed from: a */
    public AbstractC4494i<Status> mo16841a(AbstractC4489g abstractC4489g, final StartBleScanRequest startBleScanRequest) {
        return abstractC4489g.mo17255a((AbstractC4489g) new ako.AbstractC6454c(abstractC4489g) { // from class: com.google.android.gms.internal.alt.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(ako akoVar) {
                ((alc) akoVar.G()).mo16982a(new StartBleScanRequest(startBleScanRequest, new amb(this)));
            }
        });
    }

    @Override // com.google.android.gms.fitness.AbstractC5126a
    /* renamed from: a */
    public AbstractC4494i<Status> mo16840a(AbstractC4489g abstractC4489g, final AbstractC5202a abstractC5202a) {
        return abstractC4489g.mo17255a((AbstractC4489g) new ako.AbstractC6454c(abstractC4489g) { // from class: com.google.android.gms.internal.alt.2
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(ako akoVar) {
                ((alc) akoVar.G()).mo16981a(new StopBleScanRequest(abstractC5202a, new amb(this)));
            }
        });
    }

    @Override // com.google.android.gms.fitness.AbstractC5126a
    /* renamed from: a */
    public AbstractC4494i<Status> mo16839a(AbstractC4489g abstractC4489g, final String str) {
        return abstractC4489g.mo17253b((AbstractC4489g) new ako.AbstractC6454c(abstractC4489g) { // from class: com.google.android.gms.internal.alt.3
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(ako akoVar) {
                ((alc) akoVar.G()).mo16984a(new ClaimBleDeviceRequest(str, null, new amb(this)));
            }
        });
    }

    @Override // com.google.android.gms.fitness.AbstractC5126a
    /* renamed from: b */
    public AbstractC4494i<Status> mo16838b(AbstractC4489g abstractC4489g, BleDevice bleDevice) {
        return mo16837b(abstractC4489g, bleDevice.m21758a());
    }

    @Override // com.google.android.gms.fitness.AbstractC5126a
    /* renamed from: b */
    public AbstractC4494i<Status> mo16837b(AbstractC4489g abstractC4489g, final String str) {
        return abstractC4489g.mo17253b((AbstractC4489g) new ako.AbstractC6454c(abstractC4489g) { // from class: com.google.android.gms.internal.alt.5
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(ako akoVar) {
                ((alc) akoVar.G()).mo16980a(new UnclaimBleDeviceRequest(str, new amb(this)));
            }
        });
    }
}
