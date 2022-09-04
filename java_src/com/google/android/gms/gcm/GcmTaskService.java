package com.google.android.gms.gcm;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.Process;
import android.os.RemoteException;
import android.support.annotation.CallSuper;
import android.util.Log;
import com.google.android.gms.gcm.AbstractC6072f;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes2.dex */
public abstract class GcmTaskService extends Service {

    /* renamed from: a */
    public static final String f20490a = "com.google.android.gms.permission.BIND_NETWORK_TASK_SERVICE";

    /* renamed from: b */
    public static final String f20491b = "com.google.android.gms.gcm.ACTION_TASK_READY";

    /* renamed from: c */
    public static final String f20492c = "com.google.android.gms.gcm.SERVICE_ACTION_INITIALIZE";

    /* renamed from: d */
    private final Set<String> f20493d = new HashSet();

    /* renamed from: e */
    private int f20494e;

    /* renamed from: com.google.android.gms.gcm.GcmTaskService$a */
    /* loaded from: classes2.dex */
    private class C6058a extends Thread {

        /* renamed from: b */
        private final String f20496b;

        /* renamed from: c */
        private final AbstractC6072f f20497c;

        /* renamed from: d */
        private final Bundle f20498d;

        C6058a(String str, IBinder iBinder, Bundle bundle) {
            super(String.valueOf(str).concat(" GCM Task"));
            this.f20496b = str;
            this.f20497c = AbstractC6072f.AbstractBinderC6073a.m18815a(iBinder);
            this.f20498d = bundle;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(10);
            try {
                this.f20497c.mo18814a(GcmTaskService.this.m18922a(new C6069d(this.f20496b, this.f20498d)));
            } catch (RemoteException e) {
                String valueOf = String.valueOf(this.f20496b);
                Log.e("GcmTaskService", valueOf.length() != 0 ? "Error reporting result of operation to scheduler for ".concat(valueOf) : new String("Error reporting result of operation to scheduler for "));
            } finally {
                GcmTaskService.this.m18921a(this.f20496b);
            }
        }
    }

    /* renamed from: a */
    private void m18924a(int i) {
        synchronized (this.f20493d) {
            this.f20494e = i;
            if (this.f20493d.size() == 0) {
                stopSelf(this.f20494e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m18921a(String str) {
        synchronized (this.f20493d) {
            this.f20493d.remove(str);
            if (this.f20493d.size() == 0) {
                stopSelf(this.f20494e);
            }
        }
    }

    /* renamed from: a */
    public abstract int m18922a(C6069d c6069d);

    /* renamed from: a */
    public void m18925a() {
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    @CallSuper
    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent != null) {
            try {
                intent.setExtrasClassLoader(PendingCallback.class.getClassLoader());
                String action = intent.getAction();
                if (f20491b.equals(action)) {
                    String stringExtra = intent.getStringExtra("tag");
                    Parcelable parcelableExtra = intent.getParcelableExtra("callback");
                    Bundle bundle = (Bundle) intent.getParcelableExtra("extras");
                    if (parcelableExtra == null || !(parcelableExtra instanceof PendingCallback)) {
                        String valueOf = String.valueOf(getPackageName());
                        Log.e("GcmTaskService", new StringBuilder(String.valueOf(valueOf).length() + 47 + String.valueOf(stringExtra).length()).append(valueOf).append(" ").append(stringExtra).append(": Could not process request, invalid callback.").toString());
                    } else {
                        synchronized (this.f20493d) {
                            this.f20493d.add(stringExtra);
                        }
                        new C6058a(stringExtra, ((PendingCallback) parcelableExtra).m18905a(), bundle).start();
                    }
                } else if (f20492c.equals(action)) {
                    m18925a();
                } else {
                    Log.e("GcmTaskService", new StringBuilder(String.valueOf(action).length() + 37).append("Unknown action received ").append(action).append(", terminating").toString());
                }
            } finally {
                m18924a(i2);
            }
        }
        return 2;
    }
}
