package com.google.android.gms.location;

import android.app.PendingIntent;
import android.support.annotation.RequiresPermission;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.Status;
/* renamed from: com.google.android.gms.location.b */
/* loaded from: classes2.dex */
public interface AbstractC8163b {
    @RequiresPermission("com.google.android.gms.permission.ACTIVITY_RECOGNITION")
    /* renamed from: a */
    AbstractC4494i<Status> mo12519a(AbstractC4489g abstractC4489g, long j, PendingIntent pendingIntent);

    @RequiresPermission("com.google.android.gms.permission.ACTIVITY_RECOGNITION")
    /* renamed from: a */
    AbstractC4494i<Status> mo12518a(AbstractC4489g abstractC4489g, PendingIntent pendingIntent);
}
