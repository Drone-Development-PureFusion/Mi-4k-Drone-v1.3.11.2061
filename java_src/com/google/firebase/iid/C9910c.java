package com.google.firebase.iid;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.firebase.iid.C9914f;
import java.io.IOException;
import java.security.KeyPair;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.google.firebase.iid.c */
/* loaded from: classes.dex */
public class C9910c {

    /* renamed from: a */
    static Map<String, C9910c> f30804a = new HashMap();

    /* renamed from: e */
    static String f30805e;

    /* renamed from: f */
    private static C9914f f30806f;

    /* renamed from: g */
    private static C9912e f30807g;

    /* renamed from: b */
    Context f30808b;

    /* renamed from: c */
    KeyPair f30809c;

    /* renamed from: d */
    String f30810d;

    protected C9910c(Context context, String str, Bundle bundle) {
        this.f30810d = "";
        this.f30808b = context.getApplicationContext();
        this.f30810d = str;
    }

    /* renamed from: a */
    public static synchronized C9910c m6572a(Context context, Bundle bundle) {
        C9910c c9910c;
        synchronized (C9910c.class) {
            String string = bundle == null ? "" : bundle.getString("subtype");
            String str = string == null ? "" : string;
            Context applicationContext = context.getApplicationContext();
            if (f30806f == null) {
                f30806f = new C9914f(applicationContext);
                f30807g = new C9912e(applicationContext);
            }
            f30805e = Integer.toString(FirebaseInstanceId.m6614b(applicationContext));
            c9910c = f30804a.get(str);
            if (c9910c == null) {
                c9910c = new C9910c(applicationContext, str, bundle);
                f30804a.put(str, c9910c);
            }
        }
        return c9910c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public KeyPair m6573a() {
        if (this.f30809c == null) {
            this.f30809c = f30806f.m6531e(this.f30810d);
        }
        if (this.f30809c == null) {
            this.f30809c = f30806f.m6537b(this.f30810d);
        }
        return this.f30809c;
    }

    /* renamed from: a */
    public void m6571a(String str, String str2, Bundle bundle) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IOException("MAIN_THREAD");
        }
        f30806f.m6536b(this.f30810d, str, str2);
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
        bundle.putString("subtype", "".equals(this.f30810d) ? str : this.f30810d);
        if (!"".equals(this.f30810d)) {
            str = this.f30810d;
        }
        bundle.putString("X-subtype", str);
        f30807g.m6547b(f30807g.m6557a(bundle, m6573a()));
    }

    /* renamed from: b */
    public long m6570b() {
        return f30806f.m6542a(this.f30810d);
    }

    /* renamed from: b */
    public String m6569b(String str, String str2, Bundle bundle) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IOException("MAIN_THREAD");
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        boolean z = true;
        if (bundle.getString("ttl") != null || "jwt".equals(bundle.getString("type"))) {
            z = false;
        } else {
            C9914f.C9915a m6540a = f30806f.m6540a(this.f30810d, str, str2);
            if (m6540a != null && !m6540a.m6526b(f30805e)) {
                return m6540a.f30832a;
            }
        }
        String m6567c = m6567c(str, str2, bundle);
        if (m6567c == null || !z) {
            return m6567c;
        }
        f30806f.m6539a(this.f30810d, str, str2, m6567c, f30805e);
        return m6567c;
    }

    /* renamed from: c */
    public String m6567c(String str, String str2, Bundle bundle) {
        if (str2 != null) {
            bundle.putString("scope", str2);
        }
        bundle.putString("sender", str);
        String str3 = "".equals(this.f30810d) ? str : this.f30810d;
        if (!bundle.containsKey("legacy.register")) {
            bundle.putString("subscription", str);
            bundle.putString("subtype", str3);
            bundle.putString("X-subscription", str);
            bundle.putString("X-subtype", str3);
        }
        return f30807g.m6547b(f30807g.m6557a(bundle, m6573a()));
    }

    /* renamed from: c */
    public void m6568c() {
        f30806f.m6534c(this.f30810d);
        this.f30809c = null;
    }

    /* renamed from: d */
    public C9914f m6566d() {
        return f30806f;
    }

    /* renamed from: e */
    public C9912e m6565e() {
        return f30807g;
    }
}
