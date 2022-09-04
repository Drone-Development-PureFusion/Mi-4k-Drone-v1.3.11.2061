package com.google.android.gms.common;

import android.content.Intent;
/* renamed from: com.google.android.gms.common.g */
/* loaded from: classes2.dex */
public class C4539g extends Exception {

    /* renamed from: a */
    private final Intent f16939a;

    public C4539g(String str, Intent intent) {
        super(str);
        this.f16939a = intent;
    }

    /* renamed from: b */
    public Intent m23802b() {
        return new Intent(this.f16939a);
    }
}
