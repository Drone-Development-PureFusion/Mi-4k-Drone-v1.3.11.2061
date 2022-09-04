package com.google.android.gms.gcm;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.support.annotation.RequiresPermission;
import android.util.Log;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.android.gms.iid.C6095a;
import com.google.android.gms.iid.C6100d;
import com.xiaomi.mipush.sdk.PushMessageHelper;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: com.google.android.gms.gcm.c */
/* loaded from: classes.dex */
public class C6067c {

    /* renamed from: d */
    public static final String f20541d = "SERVICE_NOT_AVAILABLE";

    /* renamed from: e */
    public static final String f20542e = "MAIN_THREAD";
    @Deprecated

    /* renamed from: f */
    public static final String f20543f = "deleted_messages";
    @Deprecated

    /* renamed from: g */
    public static final String f20544g = "gcm";
    @Deprecated

    /* renamed from: h */
    public static final String f20545h = "send_event";
    @Deprecated

    /* renamed from: i */
    public static final String f20546i = "send_error";

    /* renamed from: j */
    public static final String f20547j = "GCM";

    /* renamed from: k */
    static C6067c f20548k;

    /* renamed from: m */
    private Context f20551m;

    /* renamed from: n */
    private PendingIntent f20552n;

    /* renamed from: a */
    public static int f20538a = 5000000;

    /* renamed from: b */
    public static int f20539b = 6500000;

    /* renamed from: c */
    public static int f20540c = 7000000;

    /* renamed from: p */
    private static final AtomicInteger f20549p = new AtomicInteger(1);

    /* renamed from: q */
    private final BlockingQueue<Intent> f20554q = new LinkedBlockingQueue();

    /* renamed from: o */
    private Map<String, Handler> f20553o = Collections.synchronizedMap(new HashMap());

    /* renamed from: l */
    final Messenger f20550l = new Messenger(new Handler(Looper.getMainLooper()) { // from class: com.google.android.gms.gcm.c.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null || !(message.obj instanceof Intent)) {
                Log.w(C6067c.f20547j, "Dropping invalid message");
            }
            Intent intent = (Intent) message.obj;
            if ("com.google.android.c2dm.intent.REGISTRATION".equals(intent.getAction())) {
                C6067c.this.f20554q.add(intent);
            } else if (C6067c.this.m18833c(intent)) {
            } else {
                intent.setPackage(C6067c.this.f20551m.getPackageName());
                C6067c.this.f20551m.sendBroadcast(intent);
            }
        }
    });

    /* renamed from: a */
    public static synchronized C6067c m18851a(Context context) {
        C6067c c6067c;
        synchronized (C6067c.class) {
            if (f20548k == null) {
                f20548k = new C6067c();
                f20548k.f20551m = context.getApplicationContext();
            }
            c6067c = f20548k;
        }
        return c6067c;
    }

    /* renamed from: a */
    static String m18849a(Intent intent, String str) {
        if (intent == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String stringExtra = intent.getStringExtra(str);
        if (stringExtra != null) {
            return stringExtra;
        }
        String stringExtra2 = intent.getStringExtra("error");
        if (stringExtra2 == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        throw new IOException(stringExtra2);
    }

    /* renamed from: a */
    private String m18845a(String str) {
        int indexOf = str.indexOf(64);
        if (indexOf > 0) {
            str = str.substring(0, indexOf);
        }
        return C6095a.m18745c(this.f20551m).m18741f().m18712a("", str, f20547j);
    }

    /* renamed from: a */
    private void m18844a(String str, String str2, long j, int i, Bundle bundle) {
        if (str == null) {
            throw new IllegalArgumentException("Missing 'to'");
        }
        String m18839b = m18839b(this.f20551m);
        if (m18839b == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        Intent intent = new Intent("com.google.android.gcm.intent.SEND");
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        m18838b(intent);
        intent.setPackage(m18839b);
        intent.putExtra("google.to", str);
        intent.putExtra("google.message_id", str2);
        intent.putExtra("google.ttl", Long.toString(j));
        intent.putExtra("google.delay", Integer.toString(i));
        intent.putExtra("google.from", m18845a(str));
        if (!m18839b.contains(".gsf")) {
            this.f20551m.sendOrderedBroadcast(intent, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
            return;
        }
        Bundle bundle2 = new Bundle();
        for (String str3 : bundle.keySet()) {
            Object obj = bundle.get(str3);
            if (obj instanceof String) {
                String valueOf = String.valueOf(str3);
                bundle2.putString(valueOf.length() != 0 ? "gcm.".concat(valueOf) : new String("gcm."), (String) obj);
            }
        }
        bundle2.putString("google.to", str);
        bundle2.putString("google.message_id", str2);
        C6095a.m18745c(this.f20551m).m18744c(f20547j, "upstream", bundle2);
    }

    /* renamed from: b */
    public static String m18839b(Context context) {
        return C6100d.m18734a(context);
    }

    /* renamed from: c */
    public static int m18834c(Context context) {
        PackageManager packageManager = context.getPackageManager();
        String m18839b = m18839b(context);
        if (m18839b != null) {
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(m18839b, 0);
                if (packageInfo != null) {
                    return packageInfo.versionCode;
                }
            } catch (PackageManager.NameNotFoundException e) {
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public boolean m18833c(Intent intent) {
        Handler remove;
        String stringExtra = intent.getStringExtra("In-Reply-To");
        if (stringExtra == null && intent.hasExtra("error")) {
            stringExtra = intent.getStringExtra("google.message_id");
        }
        if (stringExtra == null || (remove = this.f20553o.remove(stringExtra)) == null) {
            return false;
        }
        Message obtain = Message.obtain();
        obtain.obj = intent;
        return remove.sendMessage(obtain);
    }

    /* renamed from: d */
    private String m18832d() {
        String valueOf = String.valueOf("google.rpc");
        String valueOf2 = String.valueOf(String.valueOf(f20549p.getAndIncrement()));
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    @Deprecated
    /* renamed from: a */
    Intent m18848a(Bundle bundle) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IOException("MAIN_THREAD");
        }
        if (m18834c(this.f20551m) < 0) {
            throw new IOException("Google Play Services missing");
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage(m18839b(this.f20551m));
        m18838b(intent);
        intent.putExtra("google.message_id", m18832d());
        intent.putExtras(bundle);
        intent.putExtra("google.messenger", this.f20550l);
        this.f20551m.startService(intent);
        try {
            return this.f20554q.poll(NotificationOptions.f16268b, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw new IOException(e.getMessage());
        }
    }

    /* renamed from: a */
    public String m18850a(Intent intent) {
        if (!"com.google.android.c2dm.intent.RECEIVE".equals(intent.getAction())) {
            return null;
        }
        String stringExtra = intent.getStringExtra(PushMessageHelper.MESSAGE_TYPE);
        return stringExtra == null ? f20544g : stringExtra;
    }

    @RequiresPermission("com.google.android.c2dm.permission.RECEIVE")
    @Deprecated
    /* renamed from: a */
    public synchronized String m18841a(String... strArr) {
        String m18849a;
        String m18839b = m18839b(this.f20551m);
        if (m18839b == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String m18836b = m18836b(strArr);
        Bundle bundle = new Bundle();
        if (m18839b.contains(".gsf")) {
            bundle.putString("legacy.sender", m18836b);
            m18849a = C6095a.m18745c(this.f20551m).m18747b(m18836b, f20547j, bundle);
        } else {
            bundle.putString("sender", m18836b);
            m18849a = m18849a(m18848a(bundle), "registration_id");
        }
        return m18849a;
    }

    /* renamed from: a */
    public void m18852a() {
        f20548k = null;
        C6070e.f20558a = null;
        m18835c();
    }

    @RequiresPermission("com.google.android.c2dm.permission.RECEIVE")
    /* renamed from: a */
    public void m18843a(String str, String str2, long j, Bundle bundle) {
        m18844a(str, str2, j, -1, bundle);
    }

    @RequiresPermission("com.google.android.c2dm.permission.RECEIVE")
    /* renamed from: a */
    public void m18842a(String str, String str2, Bundle bundle) {
        m18843a(str, str2, -1L, bundle);
    }

    /* renamed from: b */
    String m18836b(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            throw new IllegalArgumentException("No senderIds");
        }
        StringBuilder sb = new StringBuilder(strArr[0]);
        for (int i = 1; i < strArr.length; i++) {
            sb.append(C0494h.f736x).append(strArr[i]);
        }
        return sb.toString();
    }

    @RequiresPermission("com.google.android.c2dm.permission.RECEIVE")
    @Deprecated
    /* renamed from: b */
    public synchronized void m18840b() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IOException("MAIN_THREAD");
        }
        C6095a.m18745c(this.f20551m).m18743d();
    }

    /* renamed from: b */
    synchronized void m18838b(Intent intent) {
        if (this.f20552n == null) {
            Intent intent2 = new Intent();
            intent2.setPackage("com.google.example.invalidpackage");
            this.f20552n = PendingIntent.getBroadcast(this.f20551m, 0, intent2, 0);
        }
        intent.putExtra("app", this.f20552n);
    }

    /* renamed from: c */
    synchronized void m18835c() {
        if (this.f20552n != null) {
            this.f20552n.cancel();
            this.f20552n = null;
        }
    }
}
