package com.google.android.gms.iid;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.interfaces.RSAPrivateKey;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import org.p286a.p287a.C11086e;
/* renamed from: com.google.android.gms.iid.d */
/* loaded from: classes2.dex */
public class C6100d {

    /* renamed from: a */
    static String f20629a = null;

    /* renamed from: b */
    static int f20630b = 0;

    /* renamed from: c */
    static int f20631c = 0;

    /* renamed from: d */
    static int f20632d = 0;

    /* renamed from: e */
    Context f20633e;

    /* renamed from: f */
    Map<String, Object> f20634f = new HashMap();

    /* renamed from: g */
    Messenger f20635g;

    /* renamed from: h */
    Messenger f20636h;

    /* renamed from: i */
    MessengerCompat f20637i;

    /* renamed from: j */
    PendingIntent f20638j;

    /* renamed from: k */
    long f20639k;

    /* renamed from: l */
    long f20640l;

    /* renamed from: m */
    int f20641m;

    /* renamed from: n */
    int f20642n;

    /* renamed from: o */
    long f20643o;

    public C6100d(Context context) {
        this.f20633e = context;
    }

    /* renamed from: a */
    public static String m18734a(Context context) {
        if (f20629a != null) {
            return f20629a;
        }
        f20630b = Process.myUid();
        PackageManager packageManager = context.getPackageManager();
        for (ResolveInfo resolveInfo : packageManager.queryIntentServices(new Intent("com.google.android.c2dm.intent.REGISTER"), 0)) {
            if (packageManager.checkPermission("com.google.android.c2dm.permission.RECEIVE", resolveInfo.serviceInfo.packageName) == 0) {
                try {
                    ApplicationInfo applicationInfo = packageManager.getApplicationInfo(resolveInfo.serviceInfo.packageName, 0);
                    Log.w("InstanceID/Rpc", new StringBuilder(17).append("Found ").append(applicationInfo.uid).toString());
                    f20631c = applicationInfo.uid;
                    f20629a = resolveInfo.serviceInfo.packageName;
                    return f20629a;
                } catch (PackageManager.NameNotFoundException e) {
                }
            } else {
                String valueOf = String.valueOf(resolveInfo.serviceInfo.packageName);
                String valueOf2 = String.valueOf("com.google.android.c2dm.intent.REGISTER");
                Log.w("InstanceID/Rpc", new StringBuilder(String.valueOf(valueOf).length() + 56 + String.valueOf(valueOf2).length()).append("Possible malicious package ").append(valueOf).append(" declares ").append(valueOf2).append(" without permission").toString());
            }
        }
        Log.w("InstanceID/Rpc", "Failed to resolve REGISTER intent, falling back");
        try {
            ApplicationInfo applicationInfo2 = packageManager.getApplicationInfo("com.google.android.gms", 0);
            f20629a = applicationInfo2.packageName;
            f20631c = applicationInfo2.uid;
            return f20629a;
        } catch (PackageManager.NameNotFoundException e2) {
            try {
                ApplicationInfo applicationInfo3 = packageManager.getApplicationInfo("com.google.android.gsf", 0);
                f20629a = applicationInfo3.packageName;
                f20631c = applicationInfo3.uid;
                return f20629a;
            } catch (PackageManager.NameNotFoundException e3) {
                Log.w("InstanceID/Rpc", "Both Google Play Services and legacy GSF package are missing");
                return null;
            }
        }
    }

    /* renamed from: a */
    static String m18724a(KeyPair keyPair, String... strArr) {
        try {
            byte[] bytes = TextUtils.join("\n", strArr).getBytes("UTF-8");
            try {
                PrivateKey privateKey = keyPair.getPrivate();
                Signature signature = Signature.getInstance(privateKey instanceof RSAPrivateKey ? "SHA256withRSA" : "SHA256withECDSA");
                signature.initSign(privateKey);
                signature.update(bytes);
                return C6095a.m18751a(signature.sign());
            } catch (GeneralSecurityException e) {
                Log.e("InstanceID/Rpc", "Unable to sign registration request", e);
                return null;
            }
        } catch (UnsupportedEncodingException e2) {
            Log.e("InstanceID/Rpc", "Unable to encode string", e2);
            return null;
        }
    }

    /* renamed from: a */
    private void m18728a(Object obj) {
        synchronized (getClass()) {
            for (String str : this.f20634f.keySet()) {
                Object obj2 = this.f20634f.get(str);
                this.f20634f.put(str, obj);
                m18727a(obj2, obj);
            }
        }
    }

    /* renamed from: a */
    private void m18727a(Object obj, Object obj2) {
        if (obj instanceof ConditionVariable) {
            ((ConditionVariable) obj).open();
        }
        if (obj instanceof Messenger) {
            Messenger messenger = (Messenger) obj;
            Message obtain = Message.obtain();
            obtain.obj = obj2;
            try {
                messenger.send(obtain);
            } catch (RemoteException e) {
                String valueOf = String.valueOf(e);
                Log.w("InstanceID/Rpc", new StringBuilder(String.valueOf(valueOf).length() + 24).append("Failed to send response ").append(valueOf).toString());
            }
        }
    }

    /* renamed from: a */
    private void m18726a(String str) {
        if (!"com.google.android.gsf".equals(f20629a)) {
            return;
        }
        this.f20641m++;
        if (this.f20641m < 3) {
            return;
        }
        if (this.f20641m == 3) {
            this.f20642n = new Random().nextInt(1000) + 1000;
        }
        this.f20642n *= 2;
        this.f20643o = SystemClock.elapsedRealtime() + this.f20642n;
        Log.w("InstanceID/Rpc", new StringBuilder(String.valueOf(str).length() + 31).append("Backoff due to ").append(str).append(" for ").append(this.f20642n).toString());
    }

    /* renamed from: a */
    private void m18725a(String str, Object obj) {
        synchronized (getClass()) {
            Object obj2 = this.f20634f.get(str);
            this.f20634f.put(str, obj);
            m18727a(obj2, obj);
        }
    }

    /* renamed from: b */
    private static int m18722b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(m18734a(context), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            return -1;
        }
    }

    /* renamed from: b */
    private Intent m18720b(Bundle bundle, KeyPair keyPair) {
        Intent intent;
        ConditionVariable conditionVariable = new ConditionVariable();
        String m18723b = m18723b();
        synchronized (getClass()) {
            this.f20634f.put(m18723b, conditionVariable);
        }
        m18730a(bundle, keyPair, m18723b);
        conditionVariable.block(NotificationOptions.f16268b);
        synchronized (getClass()) {
            Object remove = this.f20634f.remove(m18723b);
            if (!(remove instanceof Intent)) {
                if (remove instanceof String) {
                    throw new IOException((String) remove);
                }
                String valueOf = String.valueOf(remove);
                Log.w("InstanceID/Rpc", new StringBuilder(String.valueOf(valueOf).length() + 12).append("No response ").append(valueOf).toString());
                throw new IOException(C6095a.f20616b);
            }
            intent = (Intent) remove;
        }
        return intent;
    }

    /* renamed from: b */
    public static synchronized String m18723b() {
        String num;
        synchronized (C6100d.class) {
            int i = f20632d;
            f20632d = i + 1;
            num = Integer.toString(i);
        }
        return num;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public Intent m18731a(Bundle bundle, KeyPair keyPair) {
        Intent m18720b = m18720b(bundle, keyPair);
        return (m18720b == null || !m18720b.hasExtra("google.messenger")) ? m18720b : m18720b(bundle, keyPair);
    }

    /* renamed from: a */
    void m18735a() {
        if (this.f20635g != null) {
            return;
        }
        m18734a(this.f20633e);
        this.f20635g = new Messenger(new Handler(Looper.getMainLooper()) { // from class: com.google.android.gms.iid.d.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                C6100d.this.m18729a(message);
            }
        });
    }

    /* renamed from: a */
    synchronized void m18733a(Intent intent) {
        if (this.f20638j == null) {
            Intent intent2 = new Intent();
            intent2.setPackage("com.google.example.invalidpackage");
            this.f20638j = PendingIntent.getBroadcast(this.f20633e, 0, intent2, 0);
        }
        intent.putExtra("app", this.f20638j);
    }

    /* renamed from: a */
    protected void m18732a(Intent intent, String str) {
        this.f20639k = SystemClock.elapsedRealtime();
        intent.putExtra("kid", new StringBuilder(String.valueOf(str).length() + 5).append("|ID|").append(str).append("|").toString());
        intent.putExtra("X-kid", new StringBuilder(String.valueOf(str).length() + 5).append("|ID|").append(str).append("|").toString());
        boolean equals = "com.google.android.gsf".equals(f20629a);
        String stringExtra = intent.getStringExtra("useGsf");
        if (stringExtra != null) {
            equals = "1".equals(stringExtra);
        }
        if (Log.isLoggable("InstanceID/Rpc", 3)) {
            String valueOf = String.valueOf(intent.getExtras());
            Log.d("InstanceID/Rpc", new StringBuilder(String.valueOf(valueOf).length() + 8).append("Sending ").append(valueOf).toString());
        }
        if (this.f20636h != null) {
            intent.putExtra("google.messenger", this.f20635g);
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                this.f20636h.send(obtain);
                return;
            } catch (RemoteException e) {
                if (Log.isLoggable("InstanceID/Rpc", 3)) {
                    Log.d("InstanceID/Rpc", "Messenger failed, fallback to startService");
                }
            }
        }
        if (equals) {
            Intent intent2 = new Intent("com.google.android.gms.iid.InstanceID");
            intent2.setPackage(this.f20633e.getPackageName());
            intent2.putExtra("GSF", intent);
            this.f20633e.startService(intent2);
            return;
        }
        intent.putExtra("google.messenger", this.f20635g);
        intent.putExtra("messenger2", "1");
        if (this.f20637i != null) {
            Message obtain2 = Message.obtain();
            obtain2.obj = intent;
            try {
                this.f20637i.m18761b(obtain2);
                return;
            } catch (RemoteException e2) {
                if (Log.isLoggable("InstanceID/Rpc", 3)) {
                    Log.d("InstanceID/Rpc", "Messenger failed, fallback to startService");
                }
            }
        }
        this.f20633e.startService(intent);
    }

    /* renamed from: a */
    void m18730a(Bundle bundle, KeyPair keyPair, String str) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f20643o != 0 && elapsedRealtime <= this.f20643o) {
            Log.w("InstanceID/Rpc", new StringBuilder(78).append("Backoff mode, next request attempt: ").append(this.f20643o - elapsedRealtime).append(" interval: ").append(this.f20642n).toString());
            throw new IOException(C6095a.f20618d);
        }
        m18735a();
        if (f20629a == null) {
            throw new IOException(C6095a.f20617c);
        }
        this.f20639k = SystemClock.elapsedRealtime();
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage(f20629a);
        bundle.putString("gmsv", Integer.toString(m18722b(this.f20633e)));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", Integer.toString(C6095a.m18756a(this.f20633e)));
        bundle.putString("app_ver_name", C6095a.m18749b(this.f20633e));
        bundle.putString("cliv", "iid-9683000");
        bundle.putString("appid", C6095a.m18752a(keyPair));
        String m18751a = C6095a.m18751a(keyPair.getPublic().getEncoded());
        bundle.putString("pub2", m18751a);
        bundle.putString("sig", m18724a(keyPair, this.f20633e.getPackageName(), m18751a));
        intent.putExtras(bundle);
        m18733a(intent);
        m18732a(intent, str);
    }

    /* renamed from: a */
    public void m18729a(Message message) {
        if (message == null) {
            return;
        }
        if (!(message.obj instanceof Intent)) {
            Log.w("InstanceID/Rpc", "Dropping invalid message");
            return;
        }
        Intent intent = (Intent) message.obj;
        intent.setExtrasClassLoader(MessengerCompat.class.getClassLoader());
        if (intent.hasExtra("google.messenger")) {
            Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
            if (parcelableExtra instanceof MessengerCompat) {
                this.f20637i = (MessengerCompat) parcelableExtra;
            }
            if (parcelableExtra instanceof Messenger) {
                this.f20636h = (Messenger) parcelableExtra;
            }
        }
        m18718d((Intent) message.obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public String m18721b(Intent intent) {
        if (intent == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String stringExtra = intent.getStringExtra("registration_id");
        if (stringExtra == null) {
            stringExtra = intent.getStringExtra("unregistered");
        }
        intent.getLongExtra(C11086e.f35695Q, 0L);
        if (stringExtra != null) {
        }
        if (stringExtra != null) {
            return stringExtra;
        }
        String stringExtra2 = intent.getStringExtra("error");
        if (stringExtra2 != null) {
            throw new IOException(stringExtra2);
        }
        String valueOf = String.valueOf(intent.getExtras());
        Log.w("InstanceID/Rpc", new StringBuilder(String.valueOf(valueOf).length() + 29).append("Unexpected response from GCM ").append(valueOf).toString(), new Throwable());
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    /* renamed from: c */
    void m18719c(Intent intent) {
        String str;
        String str2;
        String stringExtra = intent.getStringExtra("error");
        if (stringExtra == null) {
            String valueOf = String.valueOf(intent.getExtras());
            Log.w("InstanceID/Rpc", new StringBuilder(String.valueOf(valueOf).length() + 49).append("Unexpected response, no error or registration id ").append(valueOf).toString());
            return;
        }
        if (Log.isLoggable("InstanceID/Rpc", 3)) {
            String valueOf2 = String.valueOf(stringExtra);
            Log.d("InstanceID/Rpc", valueOf2.length() != 0 ? "Received InstanceID error ".concat(valueOf2) : new String("Received InstanceID error "));
        }
        if (stringExtra.startsWith("|")) {
            String[] split = stringExtra.split("\\|");
            if (!"ID".equals(split[1])) {
                String valueOf3 = String.valueOf(stringExtra);
                Log.w("InstanceID/Rpc", valueOf3.length() != 0 ? "Unexpected structured response ".concat(valueOf3) : new String("Unexpected structured response "));
            }
            if (split.length > 2) {
                str = split[2];
                str2 = split[3];
                if (str2.startsWith(":")) {
                    str2 = str2.substring(1);
                }
            } else {
                str2 = "UNKNOWN";
                str = null;
            }
            intent.putExtra("error", str2);
        } else {
            str = null;
            str2 = stringExtra;
        }
        if (str == null) {
            m18728a((Object) str2);
        } else {
            m18725a(str, (Object) str2);
        }
        long longExtra = intent.getLongExtra(C11086e.f35695Q, 0L);
        if (longExtra > 0) {
            this.f20640l = SystemClock.elapsedRealtime();
            this.f20642n = ((int) longExtra) * 1000;
            this.f20643o = SystemClock.elapsedRealtime() + this.f20642n;
            Log.w("InstanceID/Rpc", new StringBuilder(52).append("Explicit request from server to backoff: ").append(this.f20642n).toString());
        } else if (!"SERVICE_NOT_AVAILABLE".equals(str2) && !"AUTHENTICATION_FAILED".equals(str2)) {
        } else {
            m18726a(str2);
        }
    }

    /* renamed from: d */
    public void m18718d(Intent intent) {
        if (intent == null) {
            if (!Log.isLoggable("InstanceID/Rpc", 3)) {
                return;
            }
            Log.d("InstanceID/Rpc", "Unexpected response: null");
            return;
        }
        String action = intent.getAction();
        if (!"com.google.android.c2dm.intent.REGISTRATION".equals(action) && !"com.google.android.gms.iid.InstanceID".equals(action)) {
            if (!Log.isLoggable("InstanceID/Rpc", 3)) {
                return;
            }
            String valueOf = String.valueOf(intent.getAction());
            Log.d("InstanceID/Rpc", valueOf.length() != 0 ? "Unexpected response ".concat(valueOf) : new String("Unexpected response "));
            return;
        }
        String stringExtra = intent.getStringExtra("registration_id");
        String stringExtra2 = stringExtra == null ? intent.getStringExtra("unregistered") : stringExtra;
        if (stringExtra2 == null) {
            m18719c(intent);
            return;
        }
        this.f20639k = SystemClock.elapsedRealtime();
        this.f20643o = 0L;
        this.f20641m = 0;
        this.f20642n = 0;
        if (Log.isLoggable("InstanceID/Rpc", 3)) {
            String valueOf2 = String.valueOf(intent.getExtras());
            Log.d("InstanceID/Rpc", new StringBuilder(String.valueOf(stringExtra2).length() + 16 + String.valueOf(valueOf2).length()).append("AppIDResponse: ").append(stringExtra2).append(" ").append(valueOf2).toString());
        }
        String str = null;
        if (stringExtra2.startsWith("|")) {
            String[] split = stringExtra2.split("\\|");
            if (!"ID".equals(split[1])) {
                String valueOf3 = String.valueOf(stringExtra2);
                Log.w("InstanceID/Rpc", valueOf3.length() != 0 ? "Unexpected structured response ".concat(valueOf3) : new String("Unexpected structured response "));
            }
            String str2 = split[2];
            if (split.length > 4) {
                if ("SYNC".equals(split[3])) {
                    InstanceIDListenerService.m18770a(this.f20633e);
                } else if ("RST".equals(split[3])) {
                    InstanceIDListenerService.m18769a(this.f20633e, C6095a.m18745c(this.f20633e).m18741f());
                    intent.removeExtra("registration_id");
                    m18725a(str2, (Object) intent);
                    return;
                }
            }
            String str3 = split[split.length - 1];
            if (str3.startsWith(":")) {
                str3 = str3.substring(1);
            }
            intent.putExtra("registration_id", str3);
            str = str2;
        }
        if (str == null) {
            m18728a((Object) intent);
        } else {
            m18725a(str, (Object) intent);
        }
    }
}
