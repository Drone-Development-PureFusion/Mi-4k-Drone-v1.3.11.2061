package com.google.firebase.crash.internal.service;

import android.app.IntentService;
import android.content.Intent;
import android.os.RemoteException;
import android.support.annotation.Keep;
import android.util.Log;
import com.google.android.gms.p232c.BinderC4173f;
import com.google.firebase.crash.internal.AbstractC9819f;
import com.google.firebase.crash.internal.C9822g;
/* loaded from: classes.dex */
public final class FirebaseCrashSenderService extends IntentService {

    /* renamed from: e */
    private AbstractC9819f f30654e;

    /* renamed from: c */
    private static final String f30652c = FirebaseCrashSenderService.class.getSimpleName();

    /* renamed from: d */
    private static final String f30653d = FirebaseCrashSenderService.class.getName();

    /* renamed from: a */
    public static final String f30650a = String.valueOf(f30653d).concat(".SEND");

    /* renamed from: b */
    public static final String f30651b = String.valueOf(f30653d).concat(".API_KEY");

    @Keep
    public FirebaseCrashSenderService() {
        super(FirebaseCrashSenderService.class.getSimpleName());
    }

    @Override // android.app.IntentService, android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            C9822g.m6884a().m6883a(getApplicationContext());
            this.f30654e = C9822g.m6884a().m6880d();
            this.f30654e.mo6886a(BinderC4173f.m25293a(this));
        } catch (RemoteException | C9822g.C9824a e) {
            Log.e(f30652c, "Unexpected failure remoting onCreate()", e);
            this.f30654e = null;
        }
    }

    @Override // android.app.IntentService, android.app.Service
    public void onDestroy() {
        if (this.f30654e != null) {
            try {
                this.f30654e.mo6887a();
            } catch (RemoteException e) {
                Log.e(f30652c, "Unexpected failure remoting onDestroy()", e);
            }
        }
        super.onDestroy();
    }

    @Override // android.app.IntentService
    protected void onHandleIntent(Intent intent) {
        if (this.f30654e != null) {
            try {
                this.f30654e.mo6885b(BinderC4173f.m25293a(intent));
            } catch (RemoteException e) {
                Log.e(f30652c, "Unexpected failure remoting onRunTask()", e);
            }
        }
    }
}
