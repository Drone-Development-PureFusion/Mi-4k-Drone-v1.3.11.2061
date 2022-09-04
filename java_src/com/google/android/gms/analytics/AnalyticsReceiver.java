package com.google.android.gms.analytics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.RequiresPermission;
import com.google.android.gms.analytics.internal.C3900k;
/* loaded from: classes2.dex */
public final class AnalyticsReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private C3900k f14878a;

    /* renamed from: a */
    private C3900k m26636a() {
        if (this.f14878a == null) {
            this.f14878a = new C3900k();
        }
        return this.f14878a;
    }

    @Override // android.content.BroadcastReceiver
    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"})
    public void onReceive(Context context, Intent intent) {
        m26636a().m26234a(context, intent);
    }
}
