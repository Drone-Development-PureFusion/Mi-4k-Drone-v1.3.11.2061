package com.google.android.gms.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import com.baidu.android.common.security.RSAUtil;
import com.google.android.gms.common.util.C4701x;
import java.io.File;
import java.io.IOException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
/* renamed from: com.google.android.gms.iid.e */
/* loaded from: classes2.dex */
public class C6102e {

    /* renamed from: a */
    SharedPreferences f20645a;

    /* renamed from: b */
    Context f20646b;

    public C6102e(Context context) {
        this(context, "com.google.android.gms.appid");
    }

    public C6102e(Context context, String str) {
        this.f20646b = context;
        this.f20645a = context.getSharedPreferences(str, 4);
        String valueOf = String.valueOf(str);
        String valueOf2 = String.valueOf("-no-backup");
        m18702g(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
    }

    /* renamed from: c */
    private String m18706c(String str, String str2, String str3) {
        String valueOf = String.valueOf("|T|");
        return new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(valueOf).length() + String.valueOf(str2).length() + String.valueOf(str3).length()).append(str).append(valueOf).append(str2).append("|").append(str3).toString();
    }

    /* renamed from: g */
    private void m18702g(String str) {
        File file = new File(C4701x.m23092a(this.f20646b), str);
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile() || m18717a()) {
                return;
            }
            Log.i("InstanceID/Store", "App restored, clearing state");
            InstanceIDListenerService.m18769a(this.f20646b, this);
        } catch (IOException e) {
            if (!Log.isLoggable("InstanceID/Store", 3)) {
                return;
            }
            String valueOf = String.valueOf(e.getMessage());
            Log.d("InstanceID/Store", valueOf.length() != 0 ? "Error creating file in no backup dir: ".concat(valueOf) : new String("Error creating file in no backup dir: "));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized String m18715a(String str) {
        return this.f20645a.getString(str, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized String m18713a(String str, String str2) {
        SharedPreferences sharedPreferences;
        String valueOf;
        sharedPreferences = this.f20645a;
        valueOf = String.valueOf("|S|");
        return sharedPreferences.getString(new StringBuilder(String.valueOf(str).length() + 0 + String.valueOf(valueOf).length() + String.valueOf(str2).length()).append(str).append(valueOf).append(str2).toString(), null);
    }

    /* renamed from: a */
    public synchronized String m18712a(String str, String str2, String str3) {
        return this.f20645a.getString(m18706c(str, str2, str3), null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized KeyPair m18714a(String str, long j) {
        KeyPair m18738a;
        m18738a = C6096b.m18738a();
        SharedPreferences.Editor edit = this.f20645a.edit();
        m18716a(edit, str, "|P|", C6095a.m18751a(m18738a.getPublic().getEncoded()));
        m18716a(edit, str, "|K|", C6095a.m18751a(m18738a.getPrivate().getEncoded()));
        m18716a(edit, str, "cre", Long.toString(j));
        edit.commit();
        return m18738a;
    }

    /* renamed from: a */
    synchronized void m18716a(SharedPreferences.Editor editor, String str, String str2, String str3) {
        String valueOf = String.valueOf("|S|");
        editor.putString(new StringBuilder(String.valueOf(str).length() + 0 + String.valueOf(valueOf).length() + String.valueOf(str2).length()).append(str).append(valueOf).append(str2).toString(), str3);
    }

    /* renamed from: a */
    public synchronized void m18711a(String str, String str2, String str3, String str4, String str5) {
        String m18706c = m18706c(str, str2, str3);
        SharedPreferences.Editor edit = this.f20645a.edit();
        edit.putString(m18706c, str4);
        edit.putString("appVersion", str5);
        edit.putString("lastToken", Long.toString(System.currentTimeMillis() / 1000));
        edit.commit();
    }

    /* renamed from: a */
    public boolean m18717a() {
        return this.f20645a.getAll().isEmpty();
    }

    /* renamed from: b */
    public synchronized void m18710b() {
        this.f20645a.edit().clear().commit();
    }

    /* renamed from: b */
    public synchronized void m18709b(String str) {
        SharedPreferences.Editor edit = this.f20645a.edit();
        for (String str2 : this.f20645a.getAll().keySet()) {
            if (str2.startsWith(str)) {
                edit.remove(str2);
            }
        }
        edit.commit();
    }

    /* renamed from: b */
    public synchronized void m18708b(String str, String str2, String str3) {
        String m18706c = m18706c(str, str2, str3);
        SharedPreferences.Editor edit = this.f20645a.edit();
        edit.remove(m18706c);
        edit.commit();
    }

    /* renamed from: c */
    public KeyPair m18707c(String str) {
        return m18703f(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m18705d(String str) {
        m18709b(String.valueOf(str).concat("|"));
    }

    /* renamed from: e */
    public void m18704e(String str) {
        m18709b(String.valueOf(str).concat("|T|"));
    }

    /* renamed from: f */
    KeyPair m18703f(String str) {
        String m18713a = m18713a(str, "|P|");
        String m18713a2 = m18713a(str, "|K|");
        if (m18713a == null || m18713a2 == null) {
            return null;
        }
        try {
            byte[] decode = Base64.decode(m18713a, 8);
            byte[] decode2 = Base64.decode(m18713a2, 8);
            KeyFactory keyFactory = KeyFactory.getInstance(RSAUtil.ALGORITHM_RSA);
            return new KeyPair(keyFactory.generatePublic(new X509EncodedKeySpec(decode)), keyFactory.generatePrivate(new PKCS8EncodedKeySpec(decode2)));
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            String valueOf = String.valueOf(e);
            Log.w("InstanceID/Store", new StringBuilder(String.valueOf(valueOf).length() + 19).append("Invalid key stored ").append(valueOf).toString());
            InstanceIDListenerService.m18769a(this.f20646b, this);
            return null;
        }
    }
}
