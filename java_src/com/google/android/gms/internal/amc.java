package com.google.android.gms.internal;

import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.C4496j;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.AbstractC5126a;
import com.google.android.gms.fitness.C5171e;
import com.google.android.gms.fitness.data.BleDevice;
import com.google.android.gms.fitness.request.AbstractC5202a;
import com.google.android.gms.fitness.request.StartBleScanRequest;
import com.google.android.gms.fitness.result.BleDevicesResult;
/* loaded from: classes2.dex */
public class amc implements AbstractC5126a {

    /* renamed from: a */
    private static final Status f22257a = new Status(C5171e.f18804B);

    @Override // com.google.android.gms.fitness.AbstractC5126a
    /* renamed from: a */
    public AbstractC4494i<BleDevicesResult> mo16843a(AbstractC4489g abstractC4489g) {
        return C4496j.m23951a(BleDevicesResult.m20967a(f22257a), abstractC4489g);
    }

    @Override // com.google.android.gms.fitness.AbstractC5126a
    /* renamed from: a */
    public AbstractC4494i<Status> mo16842a(AbstractC4489g abstractC4489g, BleDevice bleDevice) {
        return C4496j.m23953a(f22257a, abstractC4489g);
    }

    @Override // com.google.android.gms.fitness.AbstractC5126a
    /* renamed from: a */
    public AbstractC4494i<Status> mo16841a(AbstractC4489g abstractC4489g, StartBleScanRequest startBleScanRequest) {
        return C4496j.m23953a(f22257a, abstractC4489g);
    }

    @Override // com.google.android.gms.fitness.AbstractC5126a
    /* renamed from: a */
    public AbstractC4494i<Status> mo16840a(AbstractC4489g abstractC4489g, AbstractC5202a abstractC5202a) {
        return C4496j.m23953a(f22257a, abstractC4489g);
    }

    @Override // com.google.android.gms.fitness.AbstractC5126a
    /* renamed from: a */
    public AbstractC4494i<Status> mo16839a(AbstractC4489g abstractC4489g, String str) {
        return C4496j.m23953a(f22257a, abstractC4489g);
    }

    @Override // com.google.android.gms.fitness.AbstractC5126a
    /* renamed from: b */
    public AbstractC4494i<Status> mo16838b(AbstractC4489g abstractC4489g, BleDevice bleDevice) {
        return C4496j.m23953a(f22257a, abstractC4489g);
    }

    @Override // com.google.android.gms.fitness.AbstractC5126a
    /* renamed from: b */
    public AbstractC4494i<Status> mo16837b(AbstractC4489g abstractC4489g, String str) {
        return C4496j.m23953a(f22257a, abstractC4489g);
    }
}
