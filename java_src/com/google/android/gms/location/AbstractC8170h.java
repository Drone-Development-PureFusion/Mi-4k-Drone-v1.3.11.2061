package com.google.android.gms.location;

import android.app.PendingIntent;
import android.support.annotation.RequiresPermission;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.Status;
import java.util.List;
/* renamed from: com.google.android.gms.location.h */
/* loaded from: classes.dex */
public interface AbstractC8170h {
    /* renamed from: a */
    AbstractC4494i<Status> mo12482a(AbstractC4489g abstractC4489g, PendingIntent pendingIntent);

    @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    /* renamed from: a */
    AbstractC4494i<Status> mo12481a(AbstractC4489g abstractC4489g, GeofencingRequest geofencingRequest, PendingIntent pendingIntent);

    /* renamed from: a */
    AbstractC4494i<Status> mo12480a(AbstractC4489g abstractC4489g, List<String> list);

    @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    @Deprecated
    /* renamed from: a */
    AbstractC4494i<Status> mo12479a(AbstractC4489g abstractC4489g, List<AbstractC8167f> list, PendingIntent pendingIntent);
}
