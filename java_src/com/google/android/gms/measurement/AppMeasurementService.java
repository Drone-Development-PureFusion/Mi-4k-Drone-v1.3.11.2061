package com.google.android.gms.measurement;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.MainThread;
import com.google.android.gms.measurement.internal.C8706f;
/* loaded from: classes.dex */
public final class AppMeasurementService extends Service implements C8706f.AbstractC8709a {

    /* renamed from: a */
    private C8706f f27592a;

    /* renamed from: b */
    private C8706f m10900b() {
        if (this.f27592a == null) {
            this.f27592a = new C8706f(this);
        }
        return this.f27592a;
    }

    @Override // com.google.android.gms.measurement.internal.C8706f.AbstractC8709a
    /* renamed from: a */
    public Context mo10578a() {
        return this;
    }

    @Override // com.google.android.gms.measurement.internal.C8706f.AbstractC8709a
    /* renamed from: a */
    public boolean mo10577a(int i) {
        return stopSelfResult(i);
    }

    @Override // android.app.Service
    @MainThread
    public IBinder onBind(Intent intent) {
        return m10900b().m10586a(intent);
    }

    @Override // android.app.Service
    @MainThread
    public void onCreate() {
        super.onCreate();
        m10900b().m10588a();
    }

    @Override // android.app.Service
    @MainThread
    public void onDestroy() {
        m10900b().m10583b();
        super.onDestroy();
    }

    @Override // android.app.Service
    @MainThread
    public void onRebind(Intent intent) {
        m10900b().m10579c(intent);
    }

    @Override // android.app.Service
    @MainThread
    public int onStartCommand(Intent intent, int i, int i2) {
        int m10585a = m10900b().m10585a(intent, i, i2);
        AppMeasurementReceiver.completeWakefulIntent(intent);
        return m10585a;
    }

    @Override // android.app.Service
    @MainThread
    public boolean onUnbind(Intent intent) {
        return m10900b().m10582b(intent);
    }
}
