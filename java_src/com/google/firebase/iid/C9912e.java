package com.google.firebase.iid;

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
import com.google.android.gms.iid.C6095a;
import com.google.android.gms.iid.MessengerCompat;
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
/* renamed from: com.google.firebase.iid.e */
/* loaded from: classes.dex */
public class C9912e {

    /* renamed from: a */
    static String f30813a = null;

    /* renamed from: b */
    static int f30814b = 0;

    /* renamed from: c */
    static int f30815c = 0;

    /* renamed from: d */
    static int f30816d = 0;

    /* renamed from: e */
    Context f30817e;

    /* renamed from: f */
    Map<String, Object> f30818f = new HashMap();

    /* renamed from: g */
    Messenger f30819g;

    /* renamed from: h */
    Messenger f30820h;

    /* renamed from: i */
    MessengerCompat f30821i;

    /* renamed from: j */
    PendingIntent f30822j;

    /* renamed from: k */
    long f30823k;

    /* renamed from: l */
    long f30824l;

    /* renamed from: m */
    int f30825m;

    /* renamed from: n */
    int f30826n;

    /* renamed from: o */
    long f30827o;

    public C9912e(Context context) {
        this.f30817e = context;
    }

    /* renamed from: a */
    public static String m6560a(Context context) {
        if (f30813a != null) {
            return f30813a;
        }
        f30814b = Process.myUid();
        PackageManager packageManager = context.getPackageManager();
        for (ResolveInfo resolveInfo : packageManager.queryIntentServices(new Intent("com.google.android.c2dm.intent.REGISTER"), 0)) {
            if (packageManager.checkPermission("com.google.android.c2dm.permission.RECEIVE", resolveInfo.serviceInfo.packageName) == 0) {
                try {
                    ApplicationInfo applicationInfo = packageManager.getApplicationInfo(resolveInfo.serviceInfo.packageName, 0);
                    Log.w("InstanceID/Rpc", new StringBuilder(17).append("Found ").append(applicationInfo.uid).toString());
                    f30815c = applicationInfo.uid;
                    f30813a = resolveInfo.serviceInfo.packageName;
                    return f30813a;
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
            f30813a = applicationInfo2.packageName;
            f30815c = applicationInfo2.uid;
            return f30813a;
        } catch (PackageManager.NameNotFoundException e2) {
            try {
                ApplicationInfo applicationInfo3 = packageManager.getApplicationInfo("com.google.android.gsf", 0);
                f30813a = applicationInfo3.packageName;
                f30815c = applicationInfo3.uid;
                return f30813a;
            } catch (PackageManager.NameNotFoundException e3) {
                Log.w("InstanceID/Rpc", "Both Google Play Services and legacy GSF package are missing");
                return null;
            }
        }
    }

    /* renamed from: a */
    static String m6550a(KeyPair keyPair, String... strArr) {
        try {
            byte[] bytes = TextUtils.join("\n", strArr).getBytes("UTF-8");
            try {
                PrivateKey privateKey = keyPair.getPrivate();
                Signature signature = Signature.getInstance(privateKey instanceof RSAPrivateKey ? "SHA256withRSA" : "SHA256withECDSA");
                signature.initSign(privateKey);
                signature.update(bytes);
                return FirebaseInstanceId.m6616a(signature.sign());
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
    private void m6554a(Object obj) {
        synchronized (getClass()) {
            for (String str : this.f30818f.keySet()) {
                Object obj2 = this.f30818f.get(str);
                this.f30818f.put(str, obj);
                m6553a(obj2, obj);
            }
        }
    }

    /* renamed from: a */
    private void m6553a(Object obj, Object obj2) {
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
    private void m6552a(String str) {
        if (!"com.google.android.gsf".equals(f30813a)) {
            return;
        }
        this.f30825m++;
        if (this.f30825m < 3) {
            return;
        }
        if (this.f30825m == 3) {
            this.f30826n = new Random().nextInt(1000) + 1000;
        }
        this.f30826n *= 2;
        this.f30827o = SystemClock.elapsedRealtime() + this.f30826n;
        Log.w("InstanceID/Rpc", new StringBuilder(String.valueOf(str).length() + 31).append("Backoff due to ").append(str).append(" for ").append(this.f30826n).toString());
    }

    /* renamed from: a */
    private void m6551a(String str, Object obj) {
        synchronized (getClass()) {
            Object obj2 = this.f30818f.get(str);
            this.f30818f.put(str, obj);
            m6553a(obj2, obj);
        }
    }

    /* renamed from: b */
    private static int m6548b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(m6560a(context), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            return -1;
        }
    }

    /* renamed from: b */
    private Intent m6546b(Bundle bundle, KeyPair keyPair) {
        Intent intent;
        ConditionVariable conditionVariable = new ConditionVariable();
        String m6549b = m6549b();
        synchronized (getClass()) {
            this.f30818f.put(m6549b, conditionVariable);
        }
        m6556a(bundle, keyPair, m6549b);
        conditionVariable.block(NotificationOptions.f16268b);
        synchronized (getClass()) {
            Object remove = this.f30818f.remove(m6549b);
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
    public static synchronized String m6549b() {
        String num;
        synchronized (C9912e.class) {
            int i = f30816d;
            f30816d = i + 1;
            num = Integer.toString(i);
        }
        return num;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public Intent m6557a(Bundle bundle, KeyPair keyPair) {
        Intent m6546b = m6546b(bundle, keyPair);
        return (m6546b == null || !m6546b.hasExtra("google.messenger")) ? m6546b : m6546b(bundle, keyPair);
    }

    /* renamed from: a */
    void m6561a() {
        if (this.f30819g != null) {
            return;
        }
        m6560a(this.f30817e);
        this.f30819g = new Messenger(new Handler(Looper.getMainLooper()) { // from class: com.google.firebase.iid.e.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                C9912e.this.m6555a(message);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void m6559a(Intent intent) {
        if (this.f30822j == null) {
            Intent intent2 = new Intent();
            intent2.setPackage("com.google.example.invalidpackage");
            this.f30822j = PendingIntent.getBroadcast(this.f30817e, 0, intent2, 0);
        }
        intent.putExtra("app", this.f30822j);
    }

    /* renamed from: a */
    protected void m6558a(Intent intent, String str) {
        this.f30823k = SystemClock.elapsedRealtime();
        intent.putExtra("kid", new StringBuilder(String.valueOf(str).length() + 5).append("|ID|").append(str).append("|").toString());
        intent.putExtra("X-kid", new StringBuilder(String.valueOf(str).length() + 5).append("|ID|").append(str).append("|").toString());
        boolean equals = "com.google.android.gsf".equals(f30813a);
        if (Log.isLoggable("InstanceID/Rpc", 3)) {
            String valueOf = String.valueOf(intent.getExtras());
            Log.d("InstanceID/Rpc", new StringBuilder(String.valueOf(valueOf).length() + 8).append("Sending ").append(valueOf).toString());
        }
        if (equals) {
            this.f30817e.startService(intent);
            return;
        }
        intent.putExtra("google.messenger", this.f30819g);
        if (this.f30820h != null || this.f30821i != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                if (this.f30820h != null) {
                    this.f30820h.send(obtain);
                } else {
                    this.f30821i.m18761b(obtain);
                }
                return;
            } catch (RemoteException e) {
                if (Log.isLoggable("InstanceID/Rpc", 3)) {
                    Log.d("InstanceID/Rpc", "Messenger failed, fallback to startService");
                }
            }
        }
        this.f30817e.startService(intent);
    }

    /* renamed from: a */
    public void m6556a(Bundle bundle, KeyPair keyPair, String str) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f30827o != 0 && elapsedRealtime <= this.f30827o) {
            Log.w("InstanceID/Rpc", new StringBuilder(78).append("Backoff mode, next request attempt: ").append(this.f30827o - elapsedRealtime).append(" interval: ").append(this.f30826n).toString());
            throw new IOException(C6095a.f20618d);
        }
        m6561a();
        if (f30813a == null) {
            throw new IOException(C6095a.f20617c);
        }
        this.f30823k = SystemClock.elapsedRealtime();
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage(f30813a);
        bundle.putString("gmsv", Integer.toString(m6548b(this.f30817e)));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", Integer.toString(FirebaseInstanceId.m6614b(this.f30817e)));
        bundle.putString("app_ver_name", FirebaseInstanceId.m6610c(this.f30817e));
        bundle.putString("cliv", "fiid-9683000");
        bundle.putString("appid", FirebaseInstanceId.m6617a(keyPair));
        String m6621a = FirebaseInstanceId.m6621a(this.f30817e);
        if (m6621a != null) {
            bundle.putString("gmp_app_id", m6621a);
        }
        String m6616a = FirebaseInstanceId.m6616a(keyPair.getPublic().getEncoded());
        bundle.putString("pub2", m6616a);
        bundle.putString("sig", m6550a(keyPair, this.f30817e.getPackageName(), m6616a));
        intent.putExtras(bundle);
        m6559a(intent);
        m6558a(intent, str);
    }

    /* renamed from: a */
    public void m6555a(Message message) {
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
                this.f30821i = (MessengerCompat) parcelableExtra;
            }
            if (parcelableExtra instanceof Messenger) {
                this.f30820h = (Messenger) parcelableExtra;
            }
        }
        m6544d((Intent) message.obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public String m6547b(Intent intent) {
        if (intent == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String stringExtra = intent.getStringExtra("registration_id");
        if (stringExtra == null) {
            stringExtra = intent.getStringExtra("unregistered");
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
    void m6545c(Intent intent) {
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
            m6554a((Object) str2);
        } else {
            m6551a(str, (Object) str2);
        }
        long longExtra = intent.getLongExtra(C11086e.f35695Q, 0L);
        if (longExtra > 0) {
            this.f30824l = SystemClock.elapsedRealtime();
            this.f30826n = ((int) longExtra) * 1000;
            this.f30827o = SystemClock.elapsedRealtime() + this.f30826n;
            Log.w("InstanceID/Rpc", new StringBuilder(52).append("Explicit request from server to backoff: ").append(this.f30826n).toString());
        } else if (!"SERVICE_NOT_AVAILABLE".equals(str2) && !"AUTHENTICATION_FAILED".equals(str2)) {
        } else {
            m6552a(str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m6544d(Intent intent) {
        String str;
        if (intent == null) {
            if (!Log.isLoggable("InstanceID/Rpc", 3)) {
                return;
            }
            Log.d("InstanceID/Rpc", "Unexpected response: null");
        } else if (!"com.google.android.c2dm.intent.REGISTRATION".equals(intent.getAction())) {
            if (!Log.isLoggable("InstanceID/Rpc", 3)) {
                return;
            }
            String valueOf = String.valueOf(intent.getAction());
            Log.d("InstanceID/Rpc", valueOf.length() != 0 ? "Unexpected response ".concat(valueOf) : new String("Unexpected response "));
        } else {
            String stringExtra = intent.getStringExtra("registration_id");
            if (stringExtra == null) {
                stringExtra = intent.getStringExtra("unregistered");
            }
            if (stringExtra == null) {
                m6545c(intent);
                return;
            }
            this.f30823k = SystemClock.elapsedRealtime();
            this.f30827o = 0L;
            this.f30825m = 0;
            this.f30826n = 0;
            if (Log.isLoggable("InstanceID/Rpc", 3)) {
                String valueOf2 = String.valueOf(intent.getExtras());
                Log.d("InstanceID/Rpc", new StringBuilder(String.valueOf(stringExtra).length() + 16 + String.valueOf(valueOf2).length()).append("AppIDResponse: ").append(stringExtra).append(" ").append(valueOf2).toString());
            }
            if (stringExtra.startsWith("|")) {
                String[] split = stringExtra.split("\\|");
                if (!"ID".equals(split[1])) {
                    String valueOf3 = String.valueOf(stringExtra);
                    Log.w("InstanceID/Rpc", valueOf3.length() != 0 ? "Unexpected structured response ".concat(valueOf3) : new String("Unexpected structured response "));
                }
                String str2 = split[2];
                if (split.length > 4) {
                    if ("SYNC".equals(split[3])) {
                        FirebaseInstanceId.m6607d(this.f30817e);
                    } else if ("RST".equals(split[3])) {
                        FirebaseInstanceId.m6620a(this.f30817e, C9910c.m6572a(this.f30817e, null).m6566d());
                        intent.removeExtra("registration_id");
                        m6551a(str2, (Object) intent);
                        return;
                    }
                }
                String str3 = split[split.length - 1];
                if (str3.startsWith(":")) {
                    str3 = str3.substring(1);
                }
                intent.putExtra("registration_id", str3);
                str = str2;
            } else {
                str = null;
            }
            if (str == null) {
                m6554a((Object) intent);
            } else {
                m6551a(str, (Object) intent);
            }
        }
    }
}
