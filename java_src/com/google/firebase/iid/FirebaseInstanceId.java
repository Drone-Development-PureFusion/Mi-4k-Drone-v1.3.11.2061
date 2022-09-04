package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import android.support.p001v4.util.ArrayMap;
import android.util.Base64;
import android.util.Log;
import com.google.firebase.C9751b;
import com.google.firebase.iid.C9914f;
import java.io.IOException;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import org.p356d.AbstractC11759f;
/* loaded from: classes.dex */
public class FirebaseInstanceId {

    /* renamed from: a */
    private static Map<String, FirebaseInstanceId> f30790a = new ArrayMap();

    /* renamed from: b */
    private static C9911d f30791b;

    /* renamed from: c */
    private final C9751b f30792c;

    /* renamed from: d */
    private final C9910c f30793d;

    /* renamed from: e */
    private final String f30794e = m6615b();

    private FirebaseInstanceId(C9751b c9751b, C9910c c9910c) {
        this.f30792c = c9751b;
        this.f30793d = c9910c;
        if (this.f30794e == null) {
            throw new IllegalStateException("IID failing to initialize, FirebaseApp is missing project ID");
        }
        FirebaseInstanceIdService.m6590a(this.f30792c.m7224a(), this);
    }

    /* renamed from: a */
    public static FirebaseInstanceId m6622a() {
        return getInstance(C9751b.m7205d());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m6621a(Context context) {
        return m6622a().f30792c.m7208c().m6637b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m6617a(KeyPair keyPair) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(keyPair.getPublic().getEncoded());
            digest[0] = (byte) (((digest[0] & 15) + 112) & 255);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException e) {
            Log.w("FirebaseInstanceId", "Unexpected error, device missing required alghorithms");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m6616a(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m6620a(Context context, C9914f c9914f) {
        c9914f.m6535c();
        Intent intent = new Intent();
        intent.putExtra("CMD", "RST");
        context.sendBroadcast(FirebaseInstanceIdInternalReceiver.m6600a(context, intent));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static int m6614b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            String valueOf = String.valueOf(e);
            Log.w("FirebaseInstanceId", new StringBuilder(String.valueOf(valueOf).length() + 38).append("Never happens: can't find own package ").append(valueOf).toString());
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static String m6610c(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            String valueOf = String.valueOf(e);
            Log.w("FirebaseInstanceId", new StringBuilder(String.valueOf(valueOf).length() + 38).append("Never happens: can't find own package ").append(valueOf).toString());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static void m6607d(Context context) {
        Intent intent = new Intent();
        intent.setPackage(context.getPackageName());
        intent.putExtra("CMD", "SYNC");
        context.sendBroadcast(FirebaseInstanceIdInternalReceiver.m6600a(context, intent));
    }

    @Keep
    public static synchronized FirebaseInstanceId getInstance(@NonNull C9751b c9751b) {
        FirebaseInstanceId firebaseInstanceId;
        synchronized (FirebaseInstanceId.class) {
            firebaseInstanceId = f30790a.get(c9751b.m7208c().m6637b());
            if (firebaseInstanceId == null) {
                C9910c m6572a = C9910c.m6572a(c9751b.m7224a(), null);
                if (f30791b == null) {
                    f30791b = new C9911d(m6572a.m6566d());
                }
                firebaseInstanceId = new FirebaseInstanceId(c9751b, m6572a);
                f30790a.put(c9751b.m7208c().m6637b(), firebaseInstanceId);
            }
        }
        return firebaseInstanceId;
    }

    @WorkerThread
    /* renamed from: a */
    public String m6618a(String str, String str2) {
        return this.f30793d.m6569b(str, str2, null);
    }

    /* renamed from: a */
    public void m6619a(String str) {
        f30791b.m6563a(str);
        FirebaseInstanceIdService.m6591a(this.f30792c.m7224a());
    }

    /* renamed from: b */
    String m6615b() {
        String m6633d = this.f30792c.m7208c().m6633d();
        if (m6633d != null) {
            return m6633d;
        }
        String m6637b = this.f30792c.m7208c().m6637b();
        if (!m6637b.startsWith("1:")) {
            return m6637b;
        }
        String[] split = m6637b.split(":");
        if (split.length < 2) {
            return null;
        }
        String str = split[1];
        if (!str.isEmpty()) {
            return str;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m6613b(String str) {
        if (m6605f() == null) {
            throw new IOException("token not available");
        }
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf("/topics/");
        String valueOf2 = String.valueOf(str);
        bundle.putString("gcm.topic", valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
        C9910c c9910c = this.f30793d;
        String m6605f = m6605f();
        String valueOf3 = String.valueOf("/topics/");
        String valueOf4 = String.valueOf(str);
        c9910c.m6569b(m6605f, valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3), bundle);
    }

    @WorkerThread
    /* renamed from: b */
    public void m6612b(String str, String str2) {
        this.f30793d.m6571a(str, str2, null);
    }

    /* renamed from: c */
    public String m6611c() {
        return m6617a(this.f30793d.m6573a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m6609c(String str) {
        if (m6605f() == null) {
            throw new IOException("token not available");
        }
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf("/topics/");
        String valueOf2 = String.valueOf(str);
        bundle.putString("gcm.topic", valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
        C9910c c9910c = this.f30793d;
        String m6605f = m6605f();
        String valueOf3 = String.valueOf("/topics/");
        String valueOf4 = String.valueOf(str);
        c9910c.m6571a(m6605f, valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3), bundle);
    }

    /* renamed from: d */
    public long m6608d() {
        return this.f30793d.m6570b();
    }

    /* renamed from: e */
    public void m6606e() {
        this.f30793d.m6571a(AbstractC11759f.f37104a, AbstractC11759f.f37104a, null);
        this.f30793d.m6568c();
    }

    @Nullable
    /* renamed from: f */
    public String m6605f() {
        C9914f.C9915a m6604g = m6604g();
        if (m6604g == null || m6604g.m6526b(C9910c.f30805e)) {
            FirebaseInstanceIdService.m6591a(this.f30792c.m7224a());
        }
        if (m6604g != null) {
            return m6604g.f30832a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    /* renamed from: g */
    public C9914f.C9915a m6604g() {
        return this.f30793d.m6566d().m6540a("", this.f30794e, AbstractC11759f.f37104a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public String m6603h() {
        return m6618a(this.f30794e, AbstractC11759f.f37104a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public C9911d m6602i() {
        return f30791b;
    }
}
