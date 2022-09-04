package com.google.firebase.messaging;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.WorkerThread;
import android.util.Log;
import com.google.android.gms.gcm.C6067c;
import com.google.firebase.iid.FirebaseInstanceIdInternalReceiver;
import com.google.firebase.iid.zzb;
import com.xiaomi.mipush.sdk.PushMessageHelper;
import java.util.Iterator;
/* loaded from: classes.dex */
public class FirebaseMessagingService extends zzb {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m6520a(Bundle bundle) {
        Iterator<String> it2 = bundle.keySet().iterator();
        while (it2.hasNext()) {
            String next = it2.next();
            if (next != null && next.startsWith("google.c.")) {
                it2.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static boolean m6515b(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return "1".equals(bundle.getString("google.c.a.e"));
    }

    /* renamed from: d */
    private void m6513d(Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException e) {
                Log.e("FirebaseMessaging", "Notification pending intent canceled");
            }
        }
        if (m6515b(intent.getExtras())) {
            C9924d.m6450b(this, intent);
        }
    }

    /* renamed from: e */
    private void m6512e(Intent intent) {
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
                if (m6515b(intent.getExtras())) {
                    C9924d.m6452a(this, intent);
                }
                m6511f(intent);
                return;
            case 1:
                m6522a();
                return;
            case 2:
                m6518a(intent.getStringExtra("google.message_id"));
                return;
            case 3:
                m6517a(m6510g(intent), new C9922b(intent.getStringExtra("error")));
                return;
            default:
                String valueOf = String.valueOf(stringExtra);
                Log.w("FirebaseMessaging", valueOf.length() != 0 ? "Received message with unknown type: ".concat(valueOf) : new String("Received message with unknown type: "));
                return;
        }
    }

    /* renamed from: f */
    private void m6511f(Intent intent) {
        Bundle extras = intent.getExtras();
        extras.remove("android.support.content.wakelockid");
        if (C9923c.m6469a(extras)) {
            if (!C9923c.m6464b(this)) {
                C9923c.m6471a(this).m6463b(extras);
                return;
            } else if (m6515b(extras)) {
                C9924d.m6448d(this, intent);
            }
        }
        m6519a(new RemoteMessage(extras));
    }

    /* renamed from: g */
    private String m6510g(Intent intent) {
        String stringExtra = intent.getStringExtra("google.message_id");
        return stringExtra == null ? intent.getStringExtra("message_id") : stringExtra;
    }

    @WorkerThread
    /* renamed from: a */
    public void m6522a() {
    }

    @WorkerThread
    /* renamed from: a */
    public void m6519a(RemoteMessage remoteMessage) {
    }

    @WorkerThread
    /* renamed from: a */
    public void m6518a(String str) {
    }

    @WorkerThread
    /* renamed from: a */
    public void m6517a(String str, Exception exc) {
    }

    @Override // com.google.firebase.iid.zzb
    /* renamed from: a */
    public boolean mo6521a(Intent intent) {
        if ("com.google.firebase.messaging.NOTIFICATION_OPEN".equals(intent.getAction())) {
            m6513d(intent);
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.firebase.iid.zzb
    /* renamed from: b */
    public void mo6516b(Intent intent) {
        boolean z;
        String action = intent.getAction();
        if (action == null) {
            action = "";
        }
        switch (action.hashCode()) {
            case 75300319:
                if (action.equals("com.google.firebase.messaging.NOTIFICATION_DISMISS")) {
                    z = true;
                    break;
                }
                z = true;
                break;
            case 366519424:
                if (action.equals("com.google.android.c2dm.intent.RECEIVE")) {
                    z = false;
                    break;
                }
                z = true;
                break;
            default:
                z = true;
                break;
        }
        switch (z) {
            case false:
                m6512e(intent);
                return;
            case true:
                if (!m6515b(intent.getExtras())) {
                    return;
                }
                C9924d.m6449c(this, intent);
                return;
            default:
                String valueOf = String.valueOf(intent.getAction());
                Log.d("FirebaseMessaging", valueOf.length() != 0 ? "Unknown intent action: ".concat(valueOf) : new String("Unknown intent action: "));
                return;
        }
    }

    @Override // com.google.firebase.iid.zzb
    /* renamed from: c */
    protected Intent mo6514c(Intent intent) {
        return FirebaseInstanceIdInternalReceiver.m6598b();
    }
}
