package com.google.android.gms.awareness;

import android.support.annotation.RequiresPermission;
import com.google.android.gms.awareness.snapshot.AbstractC4105a;
import com.google.android.gms.awareness.snapshot.AbstractC4106b;
import com.google.android.gms.awareness.snapshot.AbstractC4107c;
import com.google.android.gms.awareness.snapshot.AbstractC4108d;
import com.google.android.gms.awareness.snapshot.AbstractC4109e;
import com.google.android.gms.awareness.snapshot.AbstractC4110f;
import com.google.android.gms.awareness.state.BeaconState;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import java.util.Collection;
/* renamed from: com.google.android.gms.awareness.e */
/* loaded from: classes2.dex */
public interface AbstractC4093e {
    @RequiresPermission("com.google.android.gms.permission.ACTIVITY_RECOGNITION")
    /* renamed from: a */
    AbstractC4494i<AbstractC4106b> mo25398a(AbstractC4489g abstractC4489g);

    @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    /* renamed from: a */
    AbstractC4494i<AbstractC4105a> mo25394a(AbstractC4489g abstractC4489g, Collection<BeaconState.TypeFilter> collection);

    @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    /* renamed from: a */
    AbstractC4494i<AbstractC4105a> mo25393a(AbstractC4489g abstractC4489g, BeaconState.TypeFilter... typeFilterArr);

    /* renamed from: b */
    AbstractC4494i<AbstractC4107c> mo25390b(AbstractC4489g abstractC4489g);

    @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    /* renamed from: c */
    AbstractC4494i<AbstractC4108d> mo25389c(AbstractC4489g abstractC4489g);

    @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    /* renamed from: d */
    AbstractC4494i<AbstractC4109e> mo25388d(AbstractC4489g abstractC4489g);

    @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    /* renamed from: e */
    AbstractC4494i<AbstractC4110f> mo25387e(AbstractC4489g abstractC4489g);
}
