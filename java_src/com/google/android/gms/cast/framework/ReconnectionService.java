package com.google.android.gms.cast.framework;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.cast.internal.C4440m;
import com.google.android.gms.internal.afc;
/* loaded from: classes.dex */
public class ReconnectionService extends Service {

    /* renamed from: a */
    private static final C4440m f16134a = new C4440m("ReconnectionService");

    /* renamed from: b */
    private AbstractC4374y f16135b;

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        try {
            return this.f16135b.mo24375a(intent);
        } catch (RemoteException e) {
            f16134a.m24163a(e, "Unable to call %s on %s.", "onBind", AbstractC4374y.class.getSimpleName());
            return null;
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        C4251c m24868a = C4251c.m24868a(this);
        this.f16135b = afc.m17815a(this, m24868a.m24862b().m24711c(), m24868a.m24855e().m24421a());
        try {
            this.f16135b.mo24376a();
        } catch (RemoteException e) {
            f16134a.m24163a(e, "Unable to call %s on %s.", "onCreate", AbstractC4374y.class.getSimpleName());
        }
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        try {
            this.f16135b.mo24373b();
        } catch (RemoteException e) {
            f16134a.m24163a(e, "Unable to call %s on %s.", "onDestroy", AbstractC4374y.class.getSimpleName());
        }
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        try {
            return this.f16135b.mo24374a(intent, i, i2);
        } catch (RemoteException e) {
            f16134a.m24163a(e, "Unable to call %s on %s.", "onStartCommand", AbstractC4374y.class.getSimpleName());
            return 1;
        }
    }
}
