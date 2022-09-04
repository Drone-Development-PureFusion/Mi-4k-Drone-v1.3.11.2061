package com.xiaomi.metok.geofencing;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.xiaomi.metok.geofencing.AbstractC10464c;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.xiaomi.metok.geofencing.b */
/* loaded from: classes2.dex */
public class ServiceConnectionC10463b implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ C10462a f32535a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ServiceConnectionC10463b(C10462a c10462a) {
        this.f32535a = c10462a;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Log.v("GeoFencingServiceWrapper", "*** GeoFencingService connected (yay!)");
        this.f32535a.f32532b = AbstractC10464c.AbstractBinderC10465a.m5059a(iBinder);
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        Log.v("GeoFencingServiceWrapper", "*** GeoFencingService disconnected (boo!)");
        this.f32535a.f32532b = null;
    }
}
