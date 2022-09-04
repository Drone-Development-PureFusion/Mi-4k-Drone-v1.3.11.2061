package com.google.android.gms.cast.framework.media;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.cast.framework.C4251c;
import com.google.android.gms.cast.internal.C4440m;
import com.google.android.gms.internal.afc;
import com.google.android.gms.p232c.BinderC4173f;
/* loaded from: classes.dex */
public class MediaNotificationService extends Service {

    /* renamed from: a */
    public static final String f16264a = "com.google.android.gms.cast.framework.action.UPDATE_NOTIFICATION";

    /* renamed from: b */
    private static final C4440m f16265b = new C4440m("MediaNotificationService");

    /* renamed from: c */
    private AbstractC4338f f16266c;

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        try {
            return this.f16266c.mo24484a(intent);
        } catch (RemoteException e) {
            f16265b.m24163a(e, "Unable to call %s on %s.", "onBind", AbstractC4338f.class.getSimpleName());
            return null;
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f16266c = afc.m17814a(this, C4251c.m24868a(this).m24854f(), BinderC4173f.m25293a((Object) null), C4251c.m24868a(this).m24870a().m24907g());
        try {
            this.f16266c.mo24485a();
        } catch (RemoteException e) {
            f16265b.m24163a(e, "Unable to call %s on %s.", "onCreate", AbstractC4338f.class.getSimpleName());
        }
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        try {
            this.f16266c.mo24482b();
        } catch (RemoteException e) {
            f16265b.m24163a(e, "Unable to call %s on %s.", "onDestroy", AbstractC4338f.class.getSimpleName());
        }
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        try {
            return this.f16266c.mo24483a(intent, i, i2);
        } catch (RemoteException e) {
            f16265b.m24163a(e, "Unable to call %s on %s.", "onStartCommand", AbstractC4338f.class.getSimpleName());
            return 1;
        }
    }
}
