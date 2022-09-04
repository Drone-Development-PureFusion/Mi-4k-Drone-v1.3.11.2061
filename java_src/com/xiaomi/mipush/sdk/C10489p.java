package com.xiaomi.mipush.sdk;

import android.content.Context;
/* renamed from: com.xiaomi.mipush.sdk.p */
/* loaded from: classes.dex */
public class C10489p {

    /* renamed from: a */
    private static C10489p f32586a = null;

    /* renamed from: b */
    private Context f32587b;

    /* renamed from: c */
    private C10483j f32588c = new C10483j();

    private C10489p(Context context) {
        this.f32587b = context.getApplicationContext();
        if (this.f32587b == null) {
            this.f32587b = context;
        }
    }

    /* renamed from: a */
    public static C10489p m4970a(Context context) {
        if (f32586a == null) {
            synchronized (C10489p.class) {
                if (f32586a == null) {
                    f32586a = new C10489p(context);
                }
            }
        }
        return f32586a;
    }

    /* renamed from: a */
    public synchronized String m4971a() {
        return this.f32587b.getSharedPreferences(MiPushClient.PREF_EXTRA, 0).getString("enable_disable_sync_status", "");
    }

    /* renamed from: a */
    public void m4969a(String str) {
        synchronized (this) {
            if (this.f32588c == null) {
                this.f32588c = new C10483j();
            }
            this.f32588c.f32578a = 0;
            this.f32588c.f32579b = str;
        }
    }

    /* renamed from: b */
    public void m4968b(String str) {
        synchronized (this) {
            if (this.f32588c == null) {
                this.f32588c = new C10483j();
            }
            this.f32588c.f32578a++;
            this.f32588c.f32579b = str;
        }
    }

    /* renamed from: c */
    public int m4967c(String str) {
        int i;
        synchronized (this) {
            i = (this.f32588c == null || !this.f32588c.f32579b.equals(str)) ? 0 : this.f32588c.f32578a;
        }
        return i;
    }

    /* renamed from: d */
    public void m4966d(String str) {
        synchronized (this) {
            if (this.f32588c != null && this.f32588c.f32579b.equals(str)) {
                this.f32588c = null;
            }
        }
    }

    /* renamed from: e */
    public boolean m4965e(String str) {
        boolean z;
        synchronized (this) {
            z = this.f32588c != null && this.f32588c.f32579b.equals(str);
        }
        return z;
    }

    /* renamed from: f */
    public synchronized void m4964f(String str) {
        this.f32587b.getSharedPreferences(MiPushClient.PREF_EXTRA, 0).edit().putString("enable_disable_sync_status", str).commit();
    }
}
