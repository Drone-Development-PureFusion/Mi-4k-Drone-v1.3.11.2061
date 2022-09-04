package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.baidu.android.common.security.RSAUtil;
import com.google.android.gms.common.util.C4701x;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.io.IOException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.iid.f */
/* loaded from: classes.dex */
public class C9914f {

    /* renamed from: a */
    SharedPreferences f30829a;

    /* renamed from: b */
    Context f30830b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.iid.f$a */
    /* loaded from: classes.dex */
    public static class C9915a {

        /* renamed from: d */
        private static final long f30831d = TimeUnit.DAYS.toMillis(7);

        /* renamed from: a */
        final String f30832a;

        /* renamed from: b */
        final String f30833b;

        /* renamed from: c */
        final long f30834c;

        private C9915a(String str, String str2, long j) {
            this.f30832a = str;
            this.f30833b = str2;
            this.f30834c = j;
        }

        /* renamed from: a */
        static C9915a m6528a(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (!str.startsWith("{")) {
                return new C9915a(str, null, 0L);
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new C9915a(jSONObject.getString(Constants.EXTRA_KEY_TOKEN), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
            } catch (JSONException e) {
                String valueOf = String.valueOf(e);
                Log.w("InstanceID/Store", new StringBuilder(String.valueOf(valueOf).length() + 23).append("Failed to parse token: ").append(valueOf).toString());
                return null;
            }
        }

        /* renamed from: a */
        static String m6527a(String str, String str2, long j) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(Constants.EXTRA_KEY_TOKEN, str);
                jSONObject.put("appVersion", str2);
                jSONObject.put("timestamp", j);
                return jSONObject.toString();
            } catch (JSONException e) {
                String valueOf = String.valueOf(e);
                Log.w("InstanceID/Store", new StringBuilder(String.valueOf(valueOf).length() + 24).append("Failed to encode token: ").append(valueOf).toString());
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean m6526b(String str) {
            return System.currentTimeMillis() > this.f30834c + f30831d || !str.equals(this.f30833b);
        }
    }

    public C9914f(Context context) {
        this(context, "com.google.android.gms.appid");
    }

    public C9914f(Context context, String str) {
        this.f30830b = context;
        this.f30829a = context.getSharedPreferences(str, 4);
        String valueOf = String.valueOf(str);
        String valueOf2 = String.valueOf("-no-backup");
        m6530f(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
    }

    /* renamed from: a */
    private String m6541a(String str, String str2) {
        String valueOf = String.valueOf("|S|");
        return new StringBuilder(String.valueOf(str).length() + 0 + String.valueOf(valueOf).length() + String.valueOf(str2).length()).append(str).append(valueOf).append(str2).toString();
    }

    /* renamed from: c */
    private String m6533c(String str, String str2, String str3) {
        String valueOf = String.valueOf("|T|");
        return new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(valueOf).length() + String.valueOf(str2).length() + String.valueOf(str3).length()).append(str).append(valueOf).append(str2).append("|").append(str3).toString();
    }

    /* renamed from: f */
    private void m6530f(String str) {
        File file = new File(C4701x.m23092a(this.f30830b), str);
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile() || m6538b()) {
                return;
            }
            Log.i("InstanceID/Store", "App restored, clearing state");
            FirebaseInstanceId.m6620a(this.f30830b, this);
        } catch (IOException e) {
            if (!Log.isLoggable("InstanceID/Store", 3)) {
                return;
            }
            String valueOf = String.valueOf(e.getMessage());
            Log.d("InstanceID/Store", valueOf.length() != 0 ? "Error creating file in no backup dir: ".concat(valueOf) : new String("Error creating file in no backup dir: "));
        }
    }

    /* renamed from: g */
    private void m6529g(String str) {
        SharedPreferences.Editor edit = this.f30829a.edit();
        for (String str2 : this.f30829a.getAll().keySet()) {
            if (str2.startsWith(str)) {
                edit.remove(str2);
            }
        }
        edit.commit();
    }

    /* renamed from: a */
    public synchronized long m6542a(String str) {
        long parseLong;
        String string = this.f30829a.getString(m6541a(str, "cre"), null);
        if (string != null) {
            try {
                parseLong = Long.parseLong(string);
            } catch (NumberFormatException e) {
            }
        }
        parseLong = 0;
        return parseLong;
    }

    /* renamed from: a */
    public SharedPreferences m6543a() {
        return this.f30829a;
    }

    /* renamed from: a */
    public synchronized C9915a m6540a(String str, String str2, String str3) {
        return C9915a.m6528a(this.f30829a.getString(m6533c(str, str2, str3), null));
    }

    /* renamed from: a */
    public synchronized void m6539a(String str, String str2, String str3, String str4, String str5) {
        String m6527a = C9915a.m6527a(str4, str5, System.currentTimeMillis());
        if (m6527a != null) {
            SharedPreferences.Editor edit = this.f30829a.edit();
            edit.putString(m6533c(str, str2, str3), m6527a);
            edit.commit();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized KeyPair m6537b(String str) {
        KeyPair m6577a;
        m6577a = C9908a.m6577a();
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor edit = this.f30829a.edit();
        edit.putString(m6541a(str, "|P|"), FirebaseInstanceId.m6616a(m6577a.getPublic().getEncoded()));
        edit.putString(m6541a(str, "|K|"), FirebaseInstanceId.m6616a(m6577a.getPrivate().getEncoded()));
        edit.putString(m6541a(str, "cre"), Long.toString(currentTimeMillis));
        edit.commit();
        return m6577a;
    }

    /* renamed from: b */
    public synchronized void m6536b(String str, String str2, String str3) {
        String m6533c = m6533c(str, str2, str3);
        SharedPreferences.Editor edit = this.f30829a.edit();
        edit.remove(m6533c);
        edit.commit();
    }

    /* renamed from: b */
    public synchronized boolean m6538b() {
        return this.f30829a.getAll().isEmpty();
    }

    /* renamed from: c */
    public synchronized void m6535c() {
        this.f30829a.edit().clear().commit();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public synchronized void m6534c(String str) {
        m6529g(String.valueOf(str).concat("|"));
    }

    /* renamed from: d */
    public synchronized void m6532d(String str) {
        m6529g(String.valueOf(str).concat("|T|"));
    }

    /* renamed from: e */
    public synchronized KeyPair m6531e(String str) {
        KeyPair keyPair;
        String string = this.f30829a.getString(m6541a(str, "|P|"), null);
        String string2 = this.f30829a.getString(m6541a(str, "|K|"), null);
        if (string == null || string2 == null) {
            keyPair = null;
        } else {
            try {
                byte[] decode = Base64.decode(string, 8);
                byte[] decode2 = Base64.decode(string2, 8);
                KeyFactory keyFactory = KeyFactory.getInstance(RSAUtil.ALGORITHM_RSA);
                keyPair = new KeyPair(keyFactory.generatePublic(new X509EncodedKeySpec(decode)), keyFactory.generatePrivate(new PKCS8EncodedKeySpec(decode2)));
            } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
                String valueOf = String.valueOf(e);
                Log.w("InstanceID/Store", new StringBuilder(String.valueOf(valueOf).length() + 19).append("Invalid key stored ").append(valueOf).toString());
                FirebaseInstanceId.m6620a(this.f30830b, this);
                keyPair = null;
            }
        }
        return keyPair;
    }
}
