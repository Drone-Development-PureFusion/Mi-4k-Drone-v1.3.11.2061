package com.google.android.gms.fitness;

import android.support.annotation.RequiresPermission;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Subscription;
import com.google.android.gms.fitness.result.ListSubscriptionsResult;
/* renamed from: com.google.android.gms.fitness.g */
/* loaded from: classes2.dex */
public interface AbstractC5174g {
    /* renamed from: a */
    AbstractC4494i<ListSubscriptionsResult> mo16892a(AbstractC4489g abstractC4489g);

    @RequiresPermission(anyOf = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.BODY_SENSORS"}, conditional = true)
    /* renamed from: a */
    AbstractC4494i<Status> mo16891a(AbstractC4489g abstractC4489g, DataSource dataSource);

    @RequiresPermission(anyOf = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.BODY_SENSORS"}, conditional = true)
    /* renamed from: a */
    AbstractC4494i<Status> mo16890a(AbstractC4489g abstractC4489g, DataType dataType);

    /* renamed from: a */
    AbstractC4494i<Status> mo16889a(AbstractC4489g abstractC4489g, Subscription subscription);

    /* renamed from: b */
    AbstractC4494i<Status> mo16888b(AbstractC4489g abstractC4489g, DataSource dataSource);

    /* renamed from: b */
    AbstractC4494i<Status> mo16887b(AbstractC4489g abstractC4489g, DataType dataType);

    /* renamed from: c */
    AbstractC4494i<ListSubscriptionsResult> mo16885c(AbstractC4489g abstractC4489g, DataType dataType);
}
