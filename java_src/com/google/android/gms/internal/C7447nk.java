package com.google.android.gms.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.RemoteException;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import com.google.android.gms.p232c.BinderC4173f;
import com.google.android.gms.p239g.C5286g;
import com.google.firebase.p254c.C9774g;
import java.io.InputStream;
import java.net.SocketException;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.nk */
/* loaded from: classes2.dex */
public class C7447nk {

    /* renamed from: a */
    static final /* synthetic */ boolean f24906a;

    /* renamed from: b */
    private AbstractC7440nh f24907b;

    /* renamed from: c */
    private Exception f24908c;

    /* renamed from: d */
    private int f24909d;

    /* renamed from: e */
    private Exception f24910e;

    static {
        f24906a = !C7447nk.class.desiredAssertionStatus();
    }

    public C7447nk(@NonNull AbstractC7440nh abstractC7440nh) {
        this.f24907b = abstractC7440nh;
    }

    /* renamed from: a */
    private boolean m14440a(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            this.f24909d = -2;
            this.f24910e = new SocketException("Network subsystem is unavailable");
            return false;
        }
        return true;
    }

    @Nullable
    /* renamed from: a */
    public String m14438a(String str) {
        try {
            return this.f24907b.mo14473c(str);
        } catch (RemoteException e) {
            String valueOf = String.valueOf(str);
            Log.e("NetworkRequestProxy", valueOf.length() != 0 ? "getResultString failed with a RemoteException:".concat(valueOf) : new String("getResultString failed with a RemoteException:"), e);
            return null;
        }
    }

    /* renamed from: a */
    public void m14441a() {
        try {
            this.f24909d = 0;
            this.f24910e = null;
            this.f24907b.mo14479a();
        } catch (RemoteException e) {
            this.f24908c = e;
            Log.e("NetworkRequestProxy", "reset failed with a RemoteException:", e);
        }
    }

    /* renamed from: a */
    public <TResult> void m14439a(C5286g<TResult> c5286g, TResult tresult) {
        Exception m14431f = m14431f();
        if (m14429h() && m14431f == null) {
            c5286g.m20830a((C5286g<TResult>) tresult);
            return;
        }
        C9774g m7116a = C9774g.m7116a(m14431f, m14430g());
        if (!f24906a && m7116a == null) {
            throw new AssertionError();
        }
        c5286g.m20831a((Exception) m7116a);
    }

    /* renamed from: a */
    public void m14437a(@Nullable String str, @NonNull Context context) {
        try {
            if (!m14440a(context)) {
                return;
            }
            this.f24907b.mo14478a(str);
        } catch (RemoteException e) {
            this.f24908c = e;
            Log.e("NetworkRequestProxy", "performRequest failed with a RemoteException:", e);
        }
    }

    /* renamed from: b */
    public void m14436b() {
        try {
            this.f24907b.mo14476b();
        } catch (RemoteException e) {
            this.f24908c = e;
            Log.e("NetworkRequestProxy", "performRequestEnd failed with a RemoteException:", e);
        }
    }

    /* renamed from: b */
    public void m14435b(@Nullable String str) {
        try {
            this.f24907b.mo14475b(str);
        } catch (RemoteException e) {
            this.f24908c = e;
            Log.e("NetworkRequestProxy", "performRequestStart failed with a RemoteException:", e);
        }
    }

    @Nullable
    /* renamed from: c */
    public InputStream m14434c() {
        try {
            return (InputStream) BinderC4173f.m25294a(this.f24907b.mo14474c());
        } catch (RemoteException e) {
            this.f24908c = e;
            Log.e("NetworkRequestProxy", "getStream failed with a RemoteException:", e);
            return null;
        }
    }

    @NonNull
    /* renamed from: d */
    public JSONObject m14433d() {
        return (JSONObject) BinderC4173f.m25294a(this.f24907b.mo14472d());
    }

    @Nullable
    /* renamed from: e */
    public String m14432e() {
        try {
            this.f24907b.mo14471e();
            return null;
        } catch (RemoteException e) {
            this.f24908c = e;
            Log.e("NetworkRequestProxy", "getRawResult failed with a RemoteException:", e);
            return null;
        }
    }

    @Nullable
    /* renamed from: f */
    public Exception m14431f() {
        try {
            return this.f24910e != null ? this.f24910e : this.f24908c != null ? this.f24908c : (Exception) BinderC4173f.m25294a(this.f24907b.mo14469g());
        } catch (RemoteException e) {
            this.f24908c = e;
            Log.e("NetworkRequestProxy", "getException failed with a RemoteException:", e);
            return null;
        }
    }

    /* renamed from: g */
    public int m14430g() {
        try {
            return this.f24909d != 0 ? this.f24909d : this.f24907b.mo14468h();
        } catch (RemoteException e) {
            this.f24908c = e;
            Log.e("NetworkRequestProxy", "getResultCode failed with a RemoteException:", e);
            return 0;
        }
    }

    /* renamed from: h */
    public boolean m14429h() {
        try {
            if (this.f24909d != -2 && this.f24910e == null) {
                return this.f24907b.mo14467i();
            }
            return false;
        } catch (RemoteException e) {
            this.f24908c = e;
            Log.e("NetworkRequestProxy", "isResultSuccess failed with a RemoteException:", e);
            return false;
        }
    }

    /* renamed from: i */
    public int m14428i() {
        try {
            return this.f24907b.mo14466j();
        } catch (RemoteException e) {
            this.f24908c = e;
            Log.e("NetworkRequestProxy", "getResultingContentLength failed with a RemoteException:", e);
            return 0;
        }
    }
}
