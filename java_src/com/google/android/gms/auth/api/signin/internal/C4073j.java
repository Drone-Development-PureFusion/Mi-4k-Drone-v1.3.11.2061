package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.C4588d;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
/* renamed from: com.google.android.gms.auth.api.signin.internal.j */
/* loaded from: classes.dex */
public class C4073j {

    /* renamed from: a */
    private static final Lock f15575a = new ReentrantLock();

    /* renamed from: b */
    private static C4073j f15576b;

    /* renamed from: c */
    private final Lock f15577c = new ReentrantLock();

    /* renamed from: d */
    private final SharedPreferences f15578d;

    C4073j(Context context) {
        this.f15578d = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    /* renamed from: a */
    public static C4073j m25582a(Context context) {
        C4588d.m23627a(context);
        f15575a.lock();
        try {
            if (f15576b == null) {
                f15576b = new C4073j(context.getApplicationContext());
            }
            return f15576b;
        } finally {
            f15575a.unlock();
        }
    }

    /* renamed from: b */
    private String m25575b(String str, String str2) {
        String valueOf = String.valueOf(":");
        return new StringBuilder(String.valueOf(str).length() + 0 + String.valueOf(valueOf).length() + String.valueOf(str2).length()).append(str).append(valueOf).append(str2).toString();
    }

    /* renamed from: a */
    public GoogleSignInAccount m25583a() {
        return m25580a(m25573c("defaultGoogleSignInAccount"));
    }

    /* renamed from: a */
    GoogleSignInAccount m25580a(String str) {
        String m25573c;
        if (!TextUtils.isEmpty(str) && (m25573c = m25573c(m25575b("googleSignInAccount", str))) != null) {
            try {
                return GoogleSignInAccount.m25687a(m25573c);
            } catch (JSONException e) {
                return null;
            }
        }
        return null;
    }

    /* renamed from: a */
    void m25581a(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        C4588d.m23627a(googleSignInAccount);
        C4588d.m23627a(googleSignInOptions);
        String m25675k = googleSignInAccount.m25675k();
        m25579a(m25575b("googleSignInAccount", m25675k), googleSignInAccount.m25672n());
        m25579a(m25575b("googleSignInOptions", m25675k), googleSignInOptions.m25653i());
    }

    /* renamed from: a */
    protected void m25579a(String str, String str2) {
        this.f15577c.lock();
        try {
            this.f15578d.edit().putString(str, str2).apply();
        } finally {
            this.f15577c.unlock();
        }
    }

    /* renamed from: b */
    public GoogleSignInOptions m25578b() {
        return m25576b(m25573c("defaultGoogleSignInAccount"));
    }

    /* renamed from: b */
    GoogleSignInOptions m25576b(String str) {
        String m25573c;
        if (!TextUtils.isEmpty(str) && (m25573c = m25573c(m25575b("googleSignInOptions", str))) != null) {
            try {
                return GoogleSignInOptions.m25667a(m25573c);
            } catch (JSONException e) {
                return null;
            }
        }
        return null;
    }

    /* renamed from: b */
    public void m25577b(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        C4588d.m23627a(googleSignInAccount);
        C4588d.m23627a(googleSignInOptions);
        m25579a("defaultGoogleSignInAccount", googleSignInAccount.m25675k());
        m25581a(googleSignInAccount, googleSignInOptions);
    }

    /* renamed from: c */
    protected String m25573c(String str) {
        this.f15577c.lock();
        try {
            return this.f15578d.getString(str, null);
        } finally {
            this.f15577c.unlock();
        }
    }

    /* renamed from: c */
    public void m25574c() {
        String m25573c = m25573c("defaultGoogleSignInAccount");
        m25571e("defaultGoogleSignInAccount");
        m25572d(m25573c);
    }

    /* renamed from: d */
    void m25572d(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m25571e(m25575b("googleSignInAccount", str));
        m25571e(m25575b("googleSignInOptions", str));
    }

    /* renamed from: e */
    protected void m25571e(String str) {
        this.f15577c.lock();
        try {
            this.f15578d.edit().remove(str).apply();
        } finally {
            this.f15577c.unlock();
        }
    }
}
