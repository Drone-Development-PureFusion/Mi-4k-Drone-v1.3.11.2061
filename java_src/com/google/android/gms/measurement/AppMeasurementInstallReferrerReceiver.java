package com.google.android.gms.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.MainThread;
import com.google.android.gms.measurement.internal.C8659ag;
/* loaded from: classes.dex */
public final class AppMeasurementInstallReferrerReceiver extends BroadcastReceiver implements C8659ag.AbstractC8661a {

    /* renamed from: a */
    private C8659ag f27590a;

    /* renamed from: a */
    private C8659ag m10902a() {
        if (this.f27590a == null) {
            this.f27590a = new C8659ag(this);
        }
        return this.f27590a;
    }

    @Override // com.google.android.gms.measurement.internal.C8659ag.AbstractC8661a
    /* renamed from: a */
    public void mo10777a(Context context, Intent intent) {
    }

    @Override // android.content.BroadcastReceiver
    @MainThread
    public void onReceive(Context context, Intent intent) {
        m10902a().m10779a(context, intent);
    }
}
