package com.google.android.gms.internal;

import android.util.Log;
/* loaded from: classes2.dex */
public class aot implements AbstractC6711api {

    /* renamed from: a */
    private boolean f22661a = true;

    /* renamed from: b */
    private int f22662b = 5;

    @Override // com.google.android.gms.internal.AbstractC6711api
    /* renamed from: a */
    public void mo16390a(String str) {
        if (m16436a(6)) {
            Log.e("GoogleTagManager", str);
        }
    }

    @Override // com.google.android.gms.internal.AbstractC6711api
    /* renamed from: a */
    public void mo16389a(String str, Throwable th) {
        if (m16436a(6)) {
            Log.e("GoogleTagManager", str, th);
        }
    }

    /* renamed from: a */
    public boolean m16436a(int i) {
        return (this.f22661a && Log.isLoggable("GoogleTagManager", i)) || (!this.f22661a && this.f22662b <= i);
    }

    @Override // com.google.android.gms.internal.AbstractC6711api
    /* renamed from: b */
    public void mo16388b(String str) {
        if (m16436a(5)) {
            Log.w("GoogleTagManager", str);
        }
    }

    @Override // com.google.android.gms.internal.AbstractC6711api
    /* renamed from: b */
    public void mo16387b(String str, Throwable th) {
        if (m16436a(5)) {
            Log.w("GoogleTagManager", str, th);
        }
    }

    @Override // com.google.android.gms.internal.AbstractC6711api
    /* renamed from: c */
    public void mo16386c(String str) {
        if (m16436a(4)) {
            Log.i("GoogleTagManager", str);
        }
    }

    @Override // com.google.android.gms.internal.AbstractC6711api
    /* renamed from: d */
    public void mo16385d(String str) {
        if (m16436a(2)) {
            Log.v("GoogleTagManager", str);
        }
    }
}
