package com.google.android.gms.location;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Looper;
import android.support.annotation.RequiresPermission;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.Status;
/* renamed from: com.google.android.gms.location.e */
/* loaded from: classes.dex */
public interface AbstractC8166e {
    @Deprecated

    /* renamed from: a */
    public static final String f26711a = "com.google.android.location.LOCATION";

    /* renamed from: b */
    public static final String f26712b = "mockLocation";

    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* renamed from: a */
    Location mo12508a(AbstractC4489g abstractC4489g);

    /* renamed from: a */
    AbstractC4494i<Status> mo12507a(AbstractC4489g abstractC4489g, PendingIntent pendingIntent);

    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* renamed from: a */
    AbstractC4494i<Status> mo12506a(AbstractC4489g abstractC4489g, Location location);

    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* renamed from: a */
    AbstractC4494i<Status> mo12505a(AbstractC4489g abstractC4489g, LocationRequest locationRequest, PendingIntent pendingIntent);

    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* renamed from: a */
    AbstractC4494i<Status> mo12504a(AbstractC4489g abstractC4489g, LocationRequest locationRequest, AbstractC8226k abstractC8226k, Looper looper);

    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* renamed from: a */
    AbstractC4494i<Status> mo12503a(AbstractC4489g abstractC4489g, LocationRequest locationRequest, AbstractC8227l abstractC8227l);

    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* renamed from: a */
    AbstractC4494i<Status> mo12502a(AbstractC4489g abstractC4489g, LocationRequest locationRequest, AbstractC8227l abstractC8227l, Looper looper);

    /* renamed from: a */
    AbstractC4494i<Status> mo12501a(AbstractC4489g abstractC4489g, AbstractC8226k abstractC8226k);

    /* renamed from: a */
    AbstractC4494i<Status> mo12500a(AbstractC4489g abstractC4489g, AbstractC8227l abstractC8227l);

    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* renamed from: a */
    AbstractC4494i<Status> mo12499a(AbstractC4489g abstractC4489g, boolean z);

    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* renamed from: b */
    LocationAvailability mo12498b(AbstractC4489g abstractC4489g);

    /* renamed from: c */
    AbstractC4494i<Status> mo12497c(AbstractC4489g abstractC4489g);
}
