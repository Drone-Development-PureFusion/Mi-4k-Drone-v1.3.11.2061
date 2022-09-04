package com.google.android.gms.awareness.fence;

import android.support.annotation.RequiresPermission;
import com.google.android.gms.awareness.state.BeaconState;
import com.google.android.gms.contextmanager.fence.internal.C4737d;
import com.google.android.gms.contextmanager.fence.internal.ContextFenceStub;
import java.util.Collection;
/* renamed from: com.google.android.gms.awareness.fence.a */
/* loaded from: classes2.dex */
public final class C4095a {
    private C4095a() {
    }

    @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    /* renamed from: a */
    public static AwarenessFence m25497a(Collection<BeaconState.TypeFilter> collection) {
        return (collection == null || collection.isEmpty()) ? m25496a(new BeaconState.TypeFilter[0]) : m25496a((BeaconState.TypeFilter[]) collection.toArray(new BeaconState.TypeFilter[collection.size()]));
    }

    @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    /* renamed from: a */
    public static AwarenessFence m25496a(BeaconState.TypeFilter... typeFilterArr) {
        return ContextFenceStub.m22988a(C4737d.m22926a(typeFilterArr));
    }

    @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    /* renamed from: b */
    public static AwarenessFence m25495b(Collection<BeaconState.TypeFilter> collection) {
        return (collection == null || collection.isEmpty()) ? m25494b(new BeaconState.TypeFilter[0]) : m25494b((BeaconState.TypeFilter[]) collection.toArray(new BeaconState.TypeFilter[collection.size()]));
    }

    @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    /* renamed from: b */
    public static AwarenessFence m25494b(BeaconState.TypeFilter... typeFilterArr) {
        return ContextFenceStub.m22988a(C4737d.m22925b(typeFilterArr));
    }

    @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    /* renamed from: c */
    public static AwarenessFence m25493c(Collection<BeaconState.TypeFilter> collection) {
        return (collection == null || collection.isEmpty()) ? m25492c(new BeaconState.TypeFilter[0]) : m25492c((BeaconState.TypeFilter[]) collection.toArray(new BeaconState.TypeFilter[collection.size()]));
    }

    @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    /* renamed from: c */
    public static AwarenessFence m25492c(BeaconState.TypeFilter... typeFilterArr) {
        return ContextFenceStub.m22988a(C4737d.m22924c(typeFilterArr));
    }
}
