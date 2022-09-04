package com.google.firebase.crash.internal.service;

import android.app.IntentService;
import android.content.Intent;
import android.os.RemoteException;
import android.support.annotation.Keep;
import android.util.Log;
import com.google.android.gms.p232c.BinderC4173f;
import com.google.firebase.crash.internal.AbstractC9816e;
import com.google.firebase.crash.internal.C9822g;
/* loaded from: classes.dex */
public final class FirebaseCrashReceiverService extends IntentService {

    /* renamed from: h */
    private AbstractC9816e f30649h;

    /* renamed from: f */
    private static final String f30647f = FirebaseCrashReceiverService.class.getSimpleName();

    /* renamed from: g */
    private static final String f30648g = FirebaseCrashReceiverService.class.getName();

    /* renamed from: a */
    public static final String f30642a = String.valueOf(f30648g).concat(".SAVE");

    /* renamed from: b */
    public static final String f30643b = String.valueOf(f30648g).concat(".CRASH_REPORT");

    /* renamed from: c */
    public static final String f30644c = String.valueOf(f30648g).concat(".CRASH_TIME");

    /* renamed from: d */
    public static final String f30645d = String.valueOf(f30648g).concat(".API_KEY");

    /* renamed from: e */
    public static final String f30646e = String.valueOf(f30648g).concat(".IS_FATAL");

    @Keep
    public FirebaseCrashReceiverService() {
        super(FirebaseCrashReceiverService.class.getSimpleName());
    }

    @Override // android.app.IntentService, android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            C9822g.m6884a().m6883a(getApplicationContext());
            this.f30649h = C9822g.m6884a().m6881c();
            this.f30649h.mo6890a(BinderC4173f.m25293a(this));
        } catch (RemoteException | C9822g.C9824a e) {
            Log.e(f30647f, "Unexpected failure remoting onCreate()", e);
            this.f30649h = null;
        }
    }

    @Override // android.app.IntentService, android.app.Service
    public void onDestroy() {
        if (this.f30649h != null) {
            try {
                this.f30649h.mo6891a();
            } catch (RemoteException e) {
                Log.e(f30647f, "Unexpected failure remoting onDestroy()", e);
            }
        }
        super.onDestroy();
    }

    @Override // android.app.IntentService
    protected void onHandleIntent(Intent intent) {
        if (this.f30649h != null) {
            try {
                this.f30649h.mo6889b(BinderC4173f.m25293a(intent));
            } catch (RemoteException e) {
                Log.e(f30647f, "Unexpected failure remoting onHandleIntent()", e);
            }
        }
    }
}
