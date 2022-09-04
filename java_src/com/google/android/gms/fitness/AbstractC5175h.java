package com.google.android.gms.fitness;

import android.app.PendingIntent;
import android.support.annotation.RequiresPermission;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.request.AbstractC5221b;
import com.google.android.gms.fitness.request.C5222c;
import com.google.android.gms.fitness.request.DataSourcesRequest;
import com.google.android.gms.fitness.result.DataSourcesResult;
/* renamed from: com.google.android.gms.fitness.h */
/* loaded from: classes2.dex */
public interface AbstractC5175h {
    /* renamed from: a */
    AbstractC4494i<Status> mo16876a(AbstractC4489g abstractC4489g, PendingIntent pendingIntent);

    @RequiresPermission(anyOf = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.BODY_SENSORS"}, conditional = true)
    /* renamed from: a */
    AbstractC4494i<DataSourcesResult> mo16874a(AbstractC4489g abstractC4489g, DataSourcesRequest dataSourcesRequest);

    /* renamed from: a */
    AbstractC4494i<Status> mo16873a(AbstractC4489g abstractC4489g, AbstractC5221b abstractC5221b);

    @RequiresPermission(anyOf = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.BODY_SENSORS"}, conditional = true)
    /* renamed from: a */
    AbstractC4494i<Status> mo16872a(AbstractC4489g abstractC4489g, C5222c c5222c, PendingIntent pendingIntent);

    @RequiresPermission(anyOf = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.BODY_SENSORS"}, conditional = true)
    /* renamed from: a */
    AbstractC4494i<Status> mo16870a(AbstractC4489g abstractC4489g, C5222c c5222c, AbstractC5221b abstractC5221b);
}
