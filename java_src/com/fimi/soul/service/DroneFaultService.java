package com.fimi.soul.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.fimi.kernel.C1642c;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
/* loaded from: classes.dex */
public class DroneFaultService extends Service implements C2104d.AbstractC2106b {

    /* renamed from: a */
    public C2083a f11411a;

    /* renamed from: b */
    public DroidPlannerApp f11412b;

    /* renamed from: com.fimi.soul.service.DroneFaultService$1 */
    /* loaded from: classes.dex */
    static /* synthetic */ class C30481 {

        /* renamed from: a */
        static final /* synthetic */ int[] f11413a = new int[C2104d.EnumC2105a.values().length];
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f11412b = (DroidPlannerApp) getApplication();
        this.f11411a = this.f11412b.f4493a;
        this.f11411a.mo32908a(this);
    }

    @Override // android.app.Service
    public void onDestroy() {
        startService(new Intent(this, DroneFaultService.class));
        this.f11411a.mo32903b(this);
        super.onDestroy();
    }

    @Override // com.fimi.soul.drone.C2104d.AbstractC2106b
    public void onDroneEvent(C2104d.EnumC2105a enumC2105a, C2083a c2083a) {
        if (C1642c.m34886d() == null) {
            stopSelf();
        } else {
            int i = C30481.f11413a[enumC2105a.ordinal()];
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        return super.onStartCommand(intent, i, i2);
    }
}
