package com.google.android.gms.iid;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import java.io.IOException;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import org.p356d.AbstractC11759f;
/* renamed from: com.google.android.gms.iid.a */
/* loaded from: classes2.dex */
public class C6095a {

    /* renamed from: a */
    public static final String f20615a = "SERVICE_NOT_AVAILABLE";

    /* renamed from: b */
    public static final String f20616b = "TIMEOUT";

    /* renamed from: c */
    public static final String f20617c = "MISSING_INSTANCEID_SERVICE";

    /* renamed from: d */
    public static final String f20618d = "RETRY_LATER";

    /* renamed from: e */
    public static final String f20619e = "MAIN_THREAD";

    /* renamed from: f */
    static Map<String, C6095a> f20620f = new HashMap();

    /* renamed from: k */
    static String f20621k;

    /* renamed from: l */
    private static C6102e f20622l;

    /* renamed from: m */
    private static C6100d f20623m;

    /* renamed from: g */
    Context f20624g;

    /* renamed from: h */
    KeyPair f20625h;

    /* renamed from: i */
    String f20626i;

    /* renamed from: j */
    long f20627j;

    protected C6095a(Context context, String str, Bundle bundle) {
        this.f20626i = "";
        this.f20624g = context.getApplicationContext();
        this.f20626i = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m18756a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            String valueOf = String.valueOf(e);
            Log.w("InstanceID", new StringBuilder(String.valueOf(valueOf).length() + 38).append("Never happens: can't find own package ").append(valueOf).toString());
            return 0;
        }
    }

    /* renamed from: a */
    public static synchronized C6095a m18755a(Context context, Bundle bundle) {
        C6095a c6095a;
        synchronized (C6095a.class) {
            String string = bundle == null ? "" : bundle.getString("subtype");
            String str = string == null ? "" : string;
            Context applicationContext = context.getApplicationContext();
            if (f20622l == null) {
                f20622l = new C6102e(applicationContext);
                f20623m = new C6100d(applicationContext);
            }
            f20621k = Integer.toString(m18756a(applicationContext));
            c6095a = f20620f.get(str);
            if (c6095a == null) {
                c6095a = new C6095a(applicationContext, str, bundle);
                f20620f.put(str, c6095a);
            }
        }
        return c6095a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m18752a(KeyPair keyPair) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(keyPair.getPublic().getEncoded());
            digest[0] = (byte) (((digest[0] & 15) + 112) & 255);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException e) {
            Log.w("InstanceID", "Unexpected error, device missing required alghorithms");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m18751a(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static String m18749b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            String valueOf = String.valueOf(e);
            Log.w("InstanceID", new StringBuilder(String.valueOf(valueOf).length() + 38).append("Never happens: can't find own package ").append(valueOf).toString());
            return null;
        }
    }

    /* renamed from: c */
    public static C6095a m18745c(Context context) {
        return m18755a(context, (Bundle) null);
    }

    /* renamed from: a */
    KeyPair m18757a() {
        if (this.f20625h == null) {
            this.f20625h = f20622l.m18707c(this.f20626i);
        }
        if (this.f20625h == null) {
            this.f20627j = System.currentTimeMillis();
            this.f20625h = f20622l.m18714a(this.f20626i, this.f20627j);
        }
        return this.f20625h;
    }

    /* renamed from: a */
    public void m18754a(String str, String str2) {
        m18753a(str, str2, null);
    }

    /* renamed from: a */
    public void m18753a(String str, String str2, Bundle bundle) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IOException("MAIN_THREAD");
        }
        f20622l.m18708b(this.f20626i, str, str2);
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putString("sender", str);
        if (str2 != null) {
            bundle.putString("scope", str2);
        }
        bundle.putString("subscription", str);
        bundle.putString("delete", "1");
        bundle.putString("X-delete", "1");
        bundle.putString("subtype", "".equals(this.f20626i) ? str : this.f20626i);
        if (!"".equals(this.f20626i)) {
            str = this.f20626i;
        }
        bundle.putString("X-subtype", str);
        f20623m.m18721b(f20623m.m18731a(bundle, m18757a()));
    }

    /* renamed from: b */
    public String m18750b() {
        return m18752a(m18757a());
    }

    /* renamed from: b */
    public String m18748b(String str, String str2) {
        return m18747b(str, str2, null);
    }

    /* renamed from: b */
    public String m18747b(String str, String str2, Bundle bundle) {
        boolean z = false;
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IOException("MAIN_THREAD");
        }
        boolean z2 = true;
        String m18712a = m18739h() ? null : f20622l.m18712a(this.f20626i, str, str2);
        if (m18712a == null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            if (bundle.getString("ttl") != null) {
                z2 = false;
            }
            if (!"jwt".equals(bundle.getString("type"))) {
                z = z2;
            }
            m18712a = m18744c(str, str2, bundle);
            if (m18712a != null && z) {
                f20622l.m18711a(this.f20626i, str, str2, m18712a, f20621k);
            }
        }
        return m18712a;
    }

    /* renamed from: c */
    public long m18746c() {
        String m18713a;
        if (this.f20627j == 0 && (m18713a = f20622l.m18713a(this.f20626i, "cre")) != null) {
            this.f20627j = Long.parseLong(m18713a);
        }
        return this.f20627j;
    }

    /* renamed from: c */
    public String m18744c(String str, String str2, Bundle bundle) {
        if (str2 != null) {
            bundle.putString("scope", str2);
        }
        bundle.putString("sender", str);
        String str3 = "".equals(this.f20626i) ? str : this.f20626i;
        if (!bundle.containsKey("legacy.register")) {
            bundle.putString("subscription", str);
            bundle.putString("subtype", str3);
            bundle.putString("X-subscription", str);
            bundle.putString("X-subtype", str3);
        }
        return f20623m.m18721b(f20623m.m18731a(bundle, m18757a()));
    }

    /* renamed from: d */
    public void m18743d() {
        m18753a(AbstractC11759f.f37104a, AbstractC11759f.f37104a, null);
        m18742e();
    }

    /* renamed from: e */
    public void m18742e() {
        this.f20627j = 0L;
        f20622l.m18705d(this.f20626i);
        this.f20625h = null;
    }

    /* renamed from: f */
    public C6102e m18741f() {
        return f20622l;
    }

    /* renamed from: g */
    public C6100d m18740g() {
        return f20623m;
    }

    /* renamed from: h */
    boolean m18739h() {
        String m18715a;
        String m18715a2 = f20622l.m18715a("appVersion");
        if (m18715a2 == null || !m18715a2.equals(f20621k) || (m18715a = f20622l.m18715a("lastToken")) == null) {
            return true;
        }
        return (System.currentTimeMillis() / 1000) - Long.valueOf(Long.parseLong(m18715a)).longValue() > 604800;
    }
}
