package com.xiaomi.metok.geofencing;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.RemoteException;
import android.util.Log;
/* renamed from: com.xiaomi.metok.geofencing.a */
/* loaded from: classes2.dex */
public class C10462a {

    /* renamed from: a */
    private Context f32531a;

    /* renamed from: b */
    private AbstractC10464c f32532b;

    /* renamed from: c */
    private boolean f32533c;

    /* renamed from: d */
    private final ServiceConnection f32534d = new ServiceConnectionC10463b(this);

    public C10462a(Context context) {
        this.f32533c = false;
        this.f32531a = context;
        this.f32533c = false;
        m5063a(context);
    }

    /* renamed from: a */
    public void m5063a(Context context) {
        if (!this.f32533c && context != null) {
            if (this.f32532b != null) {
                Log.d("GeoFencingServiceWrapper", "GeoFencingService already started");
                return;
            }
            Intent intent = new Intent("com.xiaomi.metok.GeoFencingService");
            intent.setPackage("com.xiaomi.metok");
            try {
                if (!context.bindService(intent, this.f32534d, 1)) {
                    Log.d("GeoFencingServiceWrapper", "Can't bind GeoFencingService");
                    this.f32533c = false;
                } else {
                    Log.d("GeoFencingServiceWrapper", "GeoFencingService started");
                    this.f32533c = true;
                }
            } catch (SecurityException e) {
                Log.e("GeoFencingServiceWrapper", "SecurityException:" + e);
            }
        }
    }

    /* renamed from: a */
    public void m5062a(Context context, double d, double d2, float f, long j, String str, String str2, String str3) {
        m5063a(context);
        if (this.f32532b != null) {
            try {
                this.f32532b.mo5056a(d, d2, f, j, str, str2, str3);
                Log.d("GeoFencingServiceWrapper", "calling registerFenceListener success");
            } catch (RemoteException e) {
                throw new RuntimeException("GeoFencingService has died", e);
            }
        }
    }

    /* renamed from: a */
    public void m5061a(Context context, String str, String str2) {
        m5063a(context);
        if (this.f32532b != null) {
            try {
                this.f32532b.mo5053a(str, str2);
                Log.d("GeoFencingServiceWrapper", "calling unregisterFenceListener success");
            } catch (RemoteException e) {
                throw new RuntimeException("GeoFencingService has died", e);
            }
        }
    }
}
