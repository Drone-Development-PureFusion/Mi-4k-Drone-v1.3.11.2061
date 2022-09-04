package com.android.volley;

import android.content.Intent;
/* renamed from: com.android.volley.a */
/* loaded from: classes.dex */
public class C0899a extends C0967u {

    /* renamed from: b */
    private Intent f1978b;

    public C0899a() {
    }

    public C0899a(Intent intent) {
        this.f1978b = intent;
    }

    public C0899a(C0912j c0912j) {
        super(c0912j);
    }

    public C0899a(String str) {
        super(str);
    }

    public C0899a(String str, Exception exc) {
        super(str, exc);
    }

    /* renamed from: a */
    public Intent m37444a() {
        return this.f1978b;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f1978b != null ? "User needs to (re)enter credentials." : super.getMessage();
    }
}
