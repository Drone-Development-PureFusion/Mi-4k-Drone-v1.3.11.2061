package com.google.android.gms.analytics;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.RequiresPermission;
import com.google.android.gms.analytics.internal.C3901l;
/* loaded from: classes2.dex */
public final class AnalyticsService extends Service implements C3901l.AbstractC3904a {

    /* renamed from: a */
    private C3901l f14879a;

    /* renamed from: b */
    private C3901l m26635b() {
        if (this.f14879a == null) {
            this.f14879a = new C3901l(this);
        }
        return this.f14879a;
    }

    @Override // com.google.android.gms.analytics.internal.C3901l.AbstractC3904a
    /* renamed from: a */
    public Context mo26224a() {
        return this;
    }

    @Override // com.google.android.gms.analytics.internal.C3901l.AbstractC3904a
    /* renamed from: a */
    public boolean mo26223a(int i) {
        return stopSelfResult(i);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return m26635b().m26231a(intent);
    }

    @Override // android.app.Service
    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"})
    public void onCreate() {
        super.onCreate();
        m26635b().m26233a();
    }

    @Override // android.app.Service
    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"})
    public void onDestroy() {
        m26635b().m26228b();
        super.onDestroy();
    }

    @Override // android.app.Service
    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"})
    public int onStartCommand(Intent intent, int i, int i2) {
        return m26635b().m26230a(intent, i, i2);
    }
}
