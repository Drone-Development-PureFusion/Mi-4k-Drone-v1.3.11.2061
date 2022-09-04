package com.google.android.gms.gcm;

import android.annotation.TargetApi;
import android.app.Service;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import com.xiaomi.mipush.sdk.PushMessageHelper;
import java.util.Iterator;
/* loaded from: classes2.dex */
public abstract class GcmListenerService extends Service {

    /* renamed from: b */
    private int f20483b;

    /* renamed from: a */
    private final Object f20482a = new Object();

    /* renamed from: c */
    private int f20484c = 0;

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.gcm.GcmListenerService$2] */
    @TargetApi(11)
    /* renamed from: a */
    private void m18940a(final Intent intent) {
        if (Build.VERSION.SDK_INT >= 11) {
            AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable() { // from class: com.google.android.gms.gcm.GcmListenerService.1
                @Override // java.lang.Runnable
                public void run() {
                    GcmListenerService.this.m18933b(intent);
                }
            });
        } else {
            new AsyncTask<Void, Void, Void>() { // from class: com.google.android.gms.gcm.GcmListenerService.2
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // android.os.AsyncTask
                /* renamed from: a */
                public Void doInBackground(Void... voidArr) {
                    GcmListenerService.this.m18933b(intent);
                    return null;
                }
            }.execute(new Void[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m18939a(Bundle bundle) {
        Iterator<String> it2 = bundle.keySet().iterator();
        while (it2.hasNext()) {
            String next = it2.next();
            if (next != null && next.startsWith("google.c.")) {
                it2.remove();
            }
        }
    }

    /* renamed from: b */
    private void m18934b() {
        synchronized (this.f20482a) {
            this.f20484c--;
            if (this.f20484c == 0) {
                m18941a(this.f20483b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m18933b(Intent intent) {
        try {
            String action = intent.getAction();
            char c = 65535;
            switch (action.hashCode()) {
                case 366519424:
                    if (action.equals("com.google.android.c2dm.intent.RECEIVE")) {
                        c = 0;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    m18932c(intent);
                    break;
                default:
                    String valueOf = String.valueOf(intent.getAction());
                    Log.d("GcmListenerService", valueOf.length() != 0 ? "Unknown intent action: ".concat(valueOf) : new String("Unknown intent action: "));
                    break;
            }
            m18934b();
        } finally {
            GcmReceiver.completeWakefulIntent(intent);
        }
    }

    /* renamed from: c */
    private void m18932c(Intent intent) {
        String stringExtra = intent.getStringExtra(PushMessageHelper.MESSAGE_TYPE);
        if (stringExtra == null) {
            stringExtra = C6067c.f20544g;
        }
        char c = 65535;
        switch (stringExtra.hashCode()) {
            case -2062414158:
                if (stringExtra.equals(C6067c.f20543f)) {
                    c = 1;
                    break;
                }
                break;
            case 102161:
                if (stringExtra.equals(C6067c.f20544g)) {
                    c = 0;
                    break;
                }
                break;
            case 814694033:
                if (stringExtra.equals(C6067c.f20546i)) {
                    c = 3;
                    break;
                }
                break;
            case 814800675:
                if (stringExtra.equals(C6067c.f20545h)) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                m18931d(intent);
                return;
            case 1:
                m18942a();
                return;
            case 2:
                m18937a(intent.getStringExtra("google.message_id"));
                return;
            case 3:
                m18935a(m18930e(intent), intent.getStringExtra("error"));
                return;
            default:
                String valueOf = String.valueOf(stringExtra);
                Log.w("GcmListenerService", valueOf.length() != 0 ? "Received message with unknown type: ".concat(valueOf) : new String("Received message with unknown type: "));
                return;
        }
    }

    /* renamed from: d */
    private void m18931d(Intent intent) {
        Bundle extras = intent.getExtras();
        extras.remove(PushMessageHelper.MESSAGE_TYPE);
        extras.remove("android.support.content.wakelockid");
        if (C6070e.m18827a(extras)) {
            if (!C6070e.m18823b(this)) {
                C6070e.m18828a(this).m18819c(extras);
                return;
            }
            C6070e.m18822b(extras);
        }
        String string = extras.getString("from");
        extras.remove("from");
        m18939a(extras);
        m18936a(string, extras);
    }

    /* renamed from: e */
    private String m18930e(Intent intent) {
        String stringExtra = intent.getStringExtra("google.message_id");
        return stringExtra == null ? intent.getStringExtra("message_id") : stringExtra;
    }

    /* renamed from: a */
    public void m18942a() {
    }

    /* renamed from: a */
    public void m18937a(String str) {
    }

    /* renamed from: a */
    public void m18936a(String str, Bundle bundle) {
    }

    /* renamed from: a */
    public void m18935a(String str, String str2) {
    }

    /* renamed from: a */
    boolean m18941a(int i) {
        return stopSelfResult(i);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.f20482a) {
            this.f20483b = i2;
            this.f20484c++;
        }
        if (intent == null) {
            m18934b();
            return 2;
        }
        m18940a(intent);
        return 3;
    }
}
