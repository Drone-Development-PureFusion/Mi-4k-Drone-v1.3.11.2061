package com.google.android.gms.measurement;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.MainThread;
import android.support.p001v4.content.WakefulBroadcastReceiver;
import com.google.android.gms.measurement.internal.C8659ag;
/* loaded from: classes.dex */
public final class AppMeasurementReceiver extends WakefulBroadcastReceiver implements C8659ag.AbstractC8661a {

    /* renamed from: a */
    private C8659ag f27591a;

    /* renamed from: a */
    private C8659ag m10901a() {
        if (this.f27591a == null) {
            this.f27591a = new C8659ag(this);
        }
        return this.f27591a;
    }

    @Override // com.google.android.gms.measurement.internal.C8659ag.AbstractC8661a
    @MainThread
    /* renamed from: a */
    public void mo10777a(Context context, Intent intent) {
        startWakefulService(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    @MainThread
    public void onReceive(Context context, Intent intent) {
        m10901a().m10779a(context, intent);
    }
}
