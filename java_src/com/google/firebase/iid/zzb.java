package com.google.firebase.iid;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.VisibleForTesting;
import android.support.p001v4.content.WakefulBroadcastReceiver;
import android.util.Log;
import com.google.android.gms.iid.MessengerCompat;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* loaded from: classes.dex */
public abstract class zzb extends Service {

    /* renamed from: d */
    private int f30838d;

    /* renamed from: a */
    MessengerCompat f30835a = new MessengerCompat(new Handler(Looper.getMainLooper()) { // from class: com.google.firebase.iid.zzb.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int m18762a = MessengerCompat.m18762a(message);
            C9912e.m6560a((Context) zzb.this);
            zzb.this.getPackageManager();
            if (m18762a == C9912e.f30815c || m18762a == C9912e.f30814b) {
                zzb.this.mo6516b((Intent) message.obj);
                return;
            }
            int i = C9912e.f30814b;
            Log.w("FirebaseInstanceId", new StringBuilder(77).append("Message from unexpected caller ").append(m18762a).append(" mine=").append(i).append(" appid=").append(C9912e.f30815c).toString());
        }
    });
    @VisibleForTesting

    /* renamed from: b */
    final ExecutorService f30836b = Executors.newSingleThreadExecutor();

    /* renamed from: c */
    private final Object f30837c = new Object();

    /* renamed from: e */
    private int f30839e = 0;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public void m6523d(Intent intent) {
        if (intent != null) {
            WakefulBroadcastReceiver.completeWakefulIntent(intent);
        }
        synchronized (this.f30837c) {
            this.f30839e--;
            if (this.f30839e == 0) {
                m6524b(this.f30838d);
            }
        }
    }

    /* renamed from: a */
    public boolean mo6521a(Intent intent) {
        return false;
    }

    /* renamed from: b */
    public abstract void mo6516b(Intent intent);

    /* renamed from: b */
    boolean m6524b(int i) {
        return stopSelfResult(i);
    }

    /* renamed from: c */
    protected abstract Intent mo6514c(Intent intent);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        if (intent == null || !"com.google.firebase.INSTANCE_ID_EVENT".equals(intent.getAction())) {
            return null;
        }
        return this.f30835a.m18763a();
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i, int i2) {
        synchronized (this.f30837c) {
            this.f30838d = i2;
            this.f30839e++;
        }
        final Intent mo6514c = mo6514c(intent);
        if (mo6514c == null) {
            m6523d(intent);
            return 2;
        } else if (mo6521a(mo6514c)) {
            m6523d(intent);
            return 2;
        } else {
            this.f30836b.execute(new Runnable() { // from class: com.google.firebase.iid.zzb.2
                @Override // java.lang.Runnable
                public void run() {
                    zzb.this.mo6516b(mo6514c);
                    zzb.this.m6523d(intent);
                }
            });
            return 3;
        }
    }
}
