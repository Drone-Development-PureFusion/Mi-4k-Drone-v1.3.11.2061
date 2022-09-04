package com.google.android.gms.location.places;

import android.support.annotation.Nullable;
import android.support.annotation.RequiresPermission;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.Status;
/* renamed from: com.google.android.gms.location.places.f */
/* loaded from: classes2.dex */
public interface AbstractC8242f {
    @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    /* renamed from: a */
    AbstractC4494i<C8244h> mo12214a(AbstractC4489g abstractC4489g, @Nullable PlaceFilter placeFilter);

    /* renamed from: a */
    AbstractC4494i<Status> mo12213a(AbstractC4489g abstractC4489g, PlaceReport placeReport);
}
