package com.google.firebase.iid;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.annotation.WorkerThread;
import android.util.Log;
import com.google.android.gms.drive.AbstractC4808e;
import com.google.firebase.C9751b;
import com.google.firebase.iid.C9914f;
import com.google.zxing.client.result.optional.NDEFRecord;
import java.io.IOException;
/* loaded from: classes.dex */
public class FirebaseInstanceIdService extends zzb {

    /* renamed from: c */
    private static BroadcastReceiver f30797c;

    /* renamed from: d */
    private static final Object f30798d = new Object();

    /* renamed from: e */
    private static boolean f30799e = false;

    /* renamed from: f */
    private boolean f30800f = false;

    /* renamed from: a */
    private C9910c m6585a(String str) {
        if (str == null) {
            return C9910c.m6572a(this, null);
        }
        Bundle bundle = new Bundle();
        bundle.putString("subtype", str);
        return C9910c.m6572a(this, bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m6591a(Context context) {
        if (C9912e.m6560a(context) == null) {
            return;
        }
        synchronized (f30798d) {
            if (!f30799e) {
                context.sendBroadcast(m6582c(0));
                f30799e = true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m6590a(Context context, FirebaseInstanceId firebaseInstanceId) {
        synchronized (f30798d) {
            if (f30799e) {
                return;
            }
            C9914f.C9915a m6604g = firebaseInstanceId.m6604g();
            if (m6604g != null && !m6604g.m6526b(C9910c.f30805e) && firebaseInstanceId.m6602i().m6564a() == null) {
                return;
            }
            m6591a(context);
        }
    }

    /* renamed from: a */
    private void m6589a(Intent intent, String str) {
        boolean m6581c = m6581c(this);
        final int m6583b = m6583b(intent, m6581c);
        Log.d("FirebaseInstanceId", new StringBuilder(String.valueOf(str).length() + 47).append("background sync failed: ").append(str).append(", retry in ").append(m6583b).append("s").toString());
        synchronized (f30798d) {
            m6580d(m6583b);
            f30799e = true;
        }
        if (!m6581c) {
            if (this.f30800f) {
                Log.d("FirebaseInstanceId", "device not connected. Connectivity change received registered");
            }
            if (f30797c == null) {
                f30797c = new BroadcastReceiver() { // from class: com.google.firebase.iid.FirebaseInstanceIdService.1
                    @Override // android.content.BroadcastReceiver
                    public void onReceive(Context context, Intent intent2) {
                        if (FirebaseInstanceIdService.m6581c(context)) {
                            if (FirebaseInstanceIdService.this.f30800f) {
                                Log.d("FirebaseInstanceId", "connectivity changed. starting background sync.");
                            }
                            FirebaseInstanceIdService.this.getApplicationContext().unregisterReceiver(this);
                            context.sendBroadcast(FirebaseInstanceIdService.m6582c(m6583b));
                        }
                    }
                };
            }
            getApplicationContext().registerReceiver(f30797c, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
    }

    /* renamed from: a */
    private void m6588a(Intent intent, boolean z) {
        synchronized (f30798d) {
            f30799e = false;
        }
        if (C9912e.m6560a((Context) this) == null) {
            return;
        }
        FirebaseInstanceId m6622a = FirebaseInstanceId.m6622a();
        if (m6622a.m6604g() == null) {
            try {
                if (m6622a.m6603h() == null) {
                    m6589a(intent, "returned token is null");
                    return;
                }
                if (this.f30800f) {
                    Log.d("FirebaseInstanceId", "get master token succeeded");
                }
                m6590a(this, m6622a);
                m6593a();
                return;
            } catch (IOException e) {
                m6589a(intent, e.getMessage());
                return;
            } catch (SecurityException e2) {
                Log.e("FirebaseInstanceId", "Unable to get master token", e2);
                return;
            }
        }
        C9911d m6602i = m6622a.m6602i();
        for (String m6564a = m6602i.m6564a(); m6564a != null; m6564a = m6602i.m6564a()) {
            String[] split = m6564a.split("!");
            if (split.length == 2) {
                String str = split[0];
                String str2 = split[1];
                char c = 65535;
                try {
                    switch (str.hashCode()) {
                        case 83:
                            if (str.equals("S")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 85:
                            if (str.equals(NDEFRecord.URI_WELL_KNOWN_TYPE)) {
                                c = 1;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            FirebaseInstanceId.m6622a().m6613b(str2);
                            if (this.f30800f) {
                                Log.d("FirebaseInstanceId", "subscribe operation succeeded");
                                break;
                            } else {
                                continue;
                            }
                        case 1:
                            FirebaseInstanceId.m6622a().m6609c(str2);
                            if (this.f30800f) {
                                Log.d("FirebaseInstanceId", "unsubscribe operation succeeded");
                                break;
                            } else {
                                continue;
                            }
                    }
                } catch (IOException e3) {
                    m6589a(intent, e3.getMessage());
                    return;
                }
            }
            m6602i.m6562b(m6564a);
        }
        Log.d("FirebaseInstanceId", "topic sync succeeded");
    }

    /* renamed from: a */
    private void m6586a(C9912e c9912e, Bundle bundle) {
        String m6560a = C9912e.m6560a((Context) this);
        if (m6560a == null) {
            Log.w("FirebaseInstanceId", "Unable to respond to ping due to missing target package");
            return;
        }
        Intent intent = new Intent("com.google.android.gcm.intent.SEND");
        intent.setPackage(m6560a);
        intent.putExtras(bundle);
        c9912e.m6559a(intent);
        intent.putExtra("google.to", "google.com/iid");
        intent.putExtra("google.message_id", C9912e.m6549b());
        sendOrderedBroadcast(intent, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
    }

    /* renamed from: b */
    private int m6583b(Intent intent, boolean z) {
        int intExtra = intent == null ? 10 : intent.getIntExtra("next_retry_delay_in_seconds", 0);
        if (intExtra >= 10 || z) {
            if (intExtra < 10) {
                return 10;
            }
            if (intExtra <= 28800) {
                return intExtra;
            }
            return 28800;
        }
        return 30;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static Intent m6582c(int i) {
        Context m7224a = C9751b.m7205d().m7224a();
        Intent intent = new Intent("ACTION_TOKEN_REFRESH_RETRY");
        intent.putExtra("next_retry_delay_in_seconds", i);
        return FirebaseInstanceIdInternalReceiver.m6600a(m7224a, intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static boolean m6581c(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* renamed from: d */
    private void m6580d(int i) {
        ((AlarmManager) getSystemService("alarm")).set(3, SystemClock.elapsedRealtime() + (i * 1000), PendingIntent.getBroadcast(this, 0, m6582c(i * 2), AbstractC4808e.f17570a_));
    }

    /* renamed from: e */
    private String m6578e(Intent intent) {
        String stringExtra = intent.getStringExtra("subtype");
        return stringExtra == null ? "" : stringExtra;
    }

    @WorkerThread
    /* renamed from: a */
    public void m6593a() {
    }

    @Override // com.google.firebase.iid.zzb
    /* renamed from: a */
    public boolean mo6521a(Intent intent) {
        this.f30800f = Log.isLoggable("FirebaseInstanceId", 3);
        if (intent.getStringExtra("error") == null && intent.getStringExtra("registration_id") == null) {
            return false;
        }
        String m6578e = m6578e(intent);
        if (this.f30800f) {
            String valueOf = String.valueOf(m6578e);
            Log.d("FirebaseInstanceId", valueOf.length() != 0 ? "Register result in service ".concat(valueOf) : new String("Register result in service "));
        }
        m6585a(m6578e).m6565e().m6544d(intent);
        return true;
    }

    @Override // com.google.firebase.iid.zzb
    /* renamed from: b */
    public void mo6516b(Intent intent) {
        boolean z;
        String action = intent.getAction();
        if (action == null) {
            action = "";
        }
        switch (action.hashCode()) {
            case -1737547627:
                if (action.equals("ACTION_TOKEN_REFRESH_RETRY")) {
                    z = false;
                    break;
                }
            default:
                z = true;
                break;
        }
        switch (z) {
            case false:
                m6588a(intent, false);
                return;
            default:
                m6579d(intent);
                return;
        }
    }

    @Override // com.google.firebase.iid.zzb
    /* renamed from: c */
    protected Intent mo6514c(Intent intent) {
        return FirebaseInstanceIdInternalReceiver.m6601a();
    }

    /* renamed from: d */
    public void m6579d(Intent intent) {
        String m6578e = m6578e(intent);
        C9910c m6585a = m6585a(m6578e);
        String stringExtra = intent.getStringExtra("CMD");
        if (this.f30800f) {
            String valueOf = String.valueOf(intent.getExtras());
            Log.d("FirebaseInstanceId", new StringBuilder(String.valueOf(m6578e).length() + 18 + String.valueOf(stringExtra).length() + String.valueOf(valueOf).length()).append("Service command ").append(m6578e).append(" ").append(stringExtra).append(" ").append(valueOf).toString());
        }
        if (intent.getStringExtra("unregistered") != null) {
            C9914f m6566d = m6585a.m6566d();
            if (m6578e == null) {
                m6578e = "";
            }
            m6566d.m6532d(m6578e);
            m6585a.m6565e().m6544d(intent);
        } else if ("gcm.googleapis.com/refresh".equals(intent.getStringExtra("from"))) {
            m6585a.m6566d().m6532d(m6578e);
            m6588a(intent, false);
        } else if ("RST".equals(stringExtra)) {
            m6585a.m6568c();
            m6588a(intent, true);
        } else if ("RST_FULL".equals(stringExtra)) {
            if (m6585a.m6566d().m6538b()) {
                return;
            }
            m6585a.m6568c();
            m6585a.m6566d().m6535c();
            m6588a(intent, true);
        } else if ("SYNC".equals(stringExtra)) {
            m6585a.m6566d().m6532d(m6578e);
            m6588a(intent, false);
        } else if (!"PING".equals(stringExtra)) {
        } else {
            m6586a(m6585a.m6565e(), intent.getExtras());
        }
    }
}
