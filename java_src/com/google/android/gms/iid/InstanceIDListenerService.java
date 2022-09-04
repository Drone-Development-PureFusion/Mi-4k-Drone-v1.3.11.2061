package com.google.android.gms.iid;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.support.p001v4.content.WakefulBroadcastReceiver;
import android.util.Log;
import com.tencent.tauth.AuthActivity;
/* loaded from: classes2.dex */
public class InstanceIDListenerService extends Service {

    /* renamed from: a */
    static String f20601a = AuthActivity.ACTION_KEY;

    /* renamed from: f */
    private static String f20602f = "google.com/iid";

    /* renamed from: g */
    private static String f20603g = "CMD";

    /* renamed from: h */
    private static String f20604h = "gcm.googleapis.com/refresh";

    /* renamed from: b */
    MessengerCompat f20605b = new MessengerCompat(new Handler(Looper.getMainLooper()) { // from class: com.google.android.gms.iid.InstanceIDListenerService.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            InstanceIDListenerService.this.m18767a(message, MessengerCompat.m18762a(message));
        }
    });

    /* renamed from: c */
    BroadcastReceiver f20606c = new BroadcastReceiver() { // from class: com.google.android.gms.iid.InstanceIDListenerService.2
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (Log.isLoggable("InstanceID", 3)) {
                intent.getStringExtra("registration_id");
                String valueOf = String.valueOf(intent.getExtras());
                Log.d("InstanceID", new StringBuilder(String.valueOf(valueOf).length() + 46).append("Received GSF callback using dynamic receiver: ").append(valueOf).toString());
            }
            InstanceIDListenerService.this.m18768a(intent);
            InstanceIDListenerService.this.m18772a();
        }
    };

    /* renamed from: d */
    int f20607d;

    /* renamed from: e */
    int f20608e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m18770a(Context context) {
        Intent intent = new Intent("com.google.android.gms.iid.InstanceID");
        intent.setPackage(context.getPackageName());
        intent.putExtra(f20603g, "SYNC");
        context.startService(intent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m18769a(Context context, C6102e c6102e) {
        c6102e.m18710b();
        Intent intent = new Intent("com.google.android.gms.iid.InstanceID");
        intent.putExtra(f20603g, "RST");
        intent.setPackage(context.getPackageName());
        context.startService(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m18767a(Message message, int i) {
        C6100d.m18734a((Context) this);
        getPackageManager();
        if (i == C6100d.f20631c || i == C6100d.f20630b) {
            m18768a((Intent) message.obj);
            return;
        }
        int i2 = C6100d.f20630b;
        Log.w("InstanceID", new StringBuilder(77).append("Message from unexpected caller ").append(i).append(" mine=").append(i2).append(" appid=").append(C6100d.f20631c).toString());
    }

    /* renamed from: a */
    void m18772a() {
        synchronized (this) {
            this.f20607d--;
            if (this.f20607d == 0) {
                stopSelf(this.f20608e);
            }
            if (Log.isLoggable("InstanceID", 3)) {
                Log.d("InstanceID", new StringBuilder(28).append("Stop ").append(this.f20607d).append(" ").append(this.f20608e).toString());
            }
        }
    }

    /* renamed from: a */
    void m18771a(int i) {
        synchronized (this) {
            this.f20607d++;
            if (i > this.f20608e) {
                this.f20608e = i;
            }
        }
    }

    /* renamed from: a */
    public void m18768a(Intent intent) {
        C6095a m18755a;
        String stringExtra = intent.getStringExtra("subtype");
        if (stringExtra == null) {
            m18755a = C6095a.m18745c(this);
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("subtype", stringExtra);
            m18755a = C6095a.m18755a(this, bundle);
        }
        String stringExtra2 = intent.getStringExtra(f20603g);
        if (intent.getStringExtra("error") != null || intent.getStringExtra("registration_id") != null) {
            if (Log.isLoggable("InstanceID", 3)) {
                String valueOf = String.valueOf(stringExtra);
                Log.d("InstanceID", valueOf.length() != 0 ? "Register result in service ".concat(valueOf) : new String("Register result in service "));
            }
            m18755a.m18740g().m18718d(intent);
            return;
        }
        if (Log.isLoggable("InstanceID", 3)) {
            String valueOf2 = String.valueOf(intent.getExtras());
            Log.d("InstanceID", new StringBuilder(String.valueOf(stringExtra).length() + 18 + String.valueOf(stringExtra2).length() + String.valueOf(valueOf2).length()).append("Service command ").append(stringExtra).append(" ").append(stringExtra2).append(" ").append(valueOf2).toString());
        }
        if (intent.getStringExtra("unregistered") != null) {
            C6102e m18741f = m18755a.m18741f();
            if (stringExtra == null) {
                stringExtra = "";
            }
            m18741f.m18704e(stringExtra);
            m18755a.m18740g().m18718d(intent);
        } else if (f20604h.equals(intent.getStringExtra("from"))) {
            m18755a.m18741f().m18704e(stringExtra);
            m18765a(false);
        } else if ("RST".equals(stringExtra2)) {
            m18755a.m18742e();
            m18765a(true);
        } else if ("RST_FULL".equals(stringExtra2)) {
            if (m18755a.m18741f().m18717a()) {
                return;
            }
            m18755a.m18741f().m18710b();
            m18765a(true);
        } else if (!"SYNC".equals(stringExtra2)) {
            if ("PING".equals(stringExtra2)) {
            }
        } else {
            m18755a.m18741f().m18704e(stringExtra);
            m18765a(false);
        }
    }

    /* renamed from: a */
    public void m18765a(boolean z) {
        m18764b();
    }

    /* renamed from: b */
    public void m18764b() {
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        if (intent == null || !"com.google.android.gms.iid.InstanceID".equals(intent.getAction())) {
            return null;
        }
        return this.f20605b.m18763a();
    }

    @Override // android.app.Service
    public void onCreate() {
        IntentFilter intentFilter = new IntentFilter("com.google.android.c2dm.intent.REGISTRATION");
        intentFilter.addCategory(getPackageName());
        registerReceiver(this.f20606c, intentFilter, "com.google.android.c2dm.permission.RECEIVE", null);
    }

    @Override // android.app.Service
    public void onDestroy() {
        unregisterReceiver(this.f20606c);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        Intent intent2;
        m18771a(i2);
        if (intent == null) {
            return 2;
        }
        try {
            if ("com.google.android.gms.iid.InstanceID".equals(intent.getAction())) {
                if (Build.VERSION.SDK_INT <= 18 && (intent2 = (Intent) intent.getParcelableExtra("GSF")) != null) {
                    startService(intent2);
                    m18772a();
                    return 1;
                }
                m18768a(intent);
            }
            m18772a();
            if (intent.getStringExtra("from") != null) {
                WakefulBroadcastReceiver.completeWakefulIntent(intent);
            }
            return 2;
        } finally {
            m18772a();
        }
    }
}
