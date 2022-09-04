package com.google.android.gms.awareness.fence;

import android.support.annotation.RequiresPermission;
import com.google.android.gms.contextmanager.fence.internal.C4751n;
import com.google.android.gms.contextmanager.fence.internal.ContextFenceStub;
/* renamed from: com.google.android.gms.awareness.fence.g */
/* loaded from: classes2.dex */
public final class C4102g {
    private C4102g() {
    }

    @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    /* renamed from: a */
    public static AwarenessFence m25481a(double d, double d2, double d3) {
        return ContextFenceStub.m22987a(C4751n.m22898a((int) (d * 1.0E7d), (int) (1.0E7d * d2), d3));
    }

    @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    /* renamed from: a */
    public static AwarenessFence m25480a(double d, double d2, double d3, long j) {
        return ContextFenceStub.m22987a(C4751n.m22897a((int) (d * 1.0E7d), (int) (1.0E7d * d2), d3, j));
    }

    @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    /* renamed from: b */
    public static AwarenessFence m25479b(double d, double d2, double d3) {
        return ContextFenceStub.m22987a(C4751n.m22895b((int) (d * 1.0E7d), (int) (1.0E7d * d2), d3));
    }
}
