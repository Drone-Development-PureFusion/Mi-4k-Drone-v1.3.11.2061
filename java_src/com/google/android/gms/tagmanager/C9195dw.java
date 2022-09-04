package com.google.android.gms.tagmanager;

import android.util.Log;
/* renamed from: com.google.android.gms.tagmanager.dw */
/* loaded from: classes2.dex */
public class C9195dw implements AbstractC9066ax {

    /* renamed from: a */
    private int f29002a = 5;

    @Override // com.google.android.gms.tagmanager.AbstractC9066ax
    /* renamed from: a */
    public void mo8980a(int i) {
        this.f29002a = i;
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9066ax
    /* renamed from: a */
    public void mo8979a(String str) {
        if (this.f29002a <= 6) {
            Log.e("GoogleTagManager", str);
        }
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9066ax
    /* renamed from: a */
    public void mo8978a(String str, Throwable th) {
        if (this.f29002a <= 6) {
            Log.e("GoogleTagManager", str, th);
        }
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9066ax
    /* renamed from: b */
    public void mo8977b(String str) {
        if (this.f29002a <= 5) {
            Log.w("GoogleTagManager", str);
        }
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9066ax
    /* renamed from: b */
    public void mo8976b(String str, Throwable th) {
        if (this.f29002a <= 5) {
            Log.w("GoogleTagManager", str, th);
        }
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9066ax
    /* renamed from: c */
    public void mo8975c(String str) {
        if (this.f29002a <= 4) {
            Log.i("GoogleTagManager", str);
        }
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9066ax
    /* renamed from: d */
    public void mo8974d(String str) {
        if (this.f29002a <= 3) {
            Log.d("GoogleTagManager", str);
        }
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9066ax
    /* renamed from: e */
    public void mo8973e(String str) {
        if (this.f29002a <= 2) {
            Log.v("GoogleTagManager", str);
        }
    }
}
