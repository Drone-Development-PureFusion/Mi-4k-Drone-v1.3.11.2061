package com.google.android.gms.fitness;

import android.support.annotation.RequiresPermission;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.data.BleDevice;
import com.google.android.gms.fitness.request.AbstractC5202a;
import com.google.android.gms.fitness.request.StartBleScanRequest;
import com.google.android.gms.fitness.result.BleDevicesResult;
/* renamed from: com.google.android.gms.fitness.a */
/* loaded from: classes2.dex */
public interface AbstractC5126a {
    /* renamed from: a */
    AbstractC4494i<BleDevicesResult> mo16843a(AbstractC4489g abstractC4489g);

    /* renamed from: a */
    AbstractC4494i<Status> mo16842a(AbstractC4489g abstractC4489g, BleDevice bleDevice);

    @RequiresPermission("android.permission.BLUETOOTH_ADMIN")
    /* renamed from: a */
    AbstractC4494i<Status> mo16841a(AbstractC4489g abstractC4489g, StartBleScanRequest startBleScanRequest);

    /* renamed from: a */
    AbstractC4494i<Status> mo16840a(AbstractC4489g abstractC4489g, AbstractC5202a abstractC5202a);

    /* renamed from: a */
    AbstractC4494i<Status> mo16839a(AbstractC4489g abstractC4489g, String str);

    /* renamed from: b */
    AbstractC4494i<Status> mo16838b(AbstractC4489g abstractC4489g, BleDevice bleDevice);

    /* renamed from: b */
    AbstractC4494i<Status> mo16837b(AbstractC4489g abstractC4489g, String str);
}
