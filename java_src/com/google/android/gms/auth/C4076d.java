package com.google.android.gms.auth;

import android.content.Intent;
/* renamed from: com.google.android.gms.auth.d */
/* loaded from: classes2.dex */
public class C4076d extends C3973a {

    /* renamed from: a */
    private final Intent f15591a;

    public C4076d(String str, Intent intent) {
        super(str);
        this.f15591a = intent;
    }

    /* renamed from: b */
    public Intent m25550b() {
        if (this.f15591a == null) {
            return null;
        }
        return new Intent(this.f15591a);
    }
}
