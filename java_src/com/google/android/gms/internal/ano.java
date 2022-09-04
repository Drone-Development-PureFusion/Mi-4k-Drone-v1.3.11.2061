package com.google.android.gms.internal;

import android.content.Intent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.p237e.AbstractC5121b;
/* loaded from: classes2.dex */
class ano implements AbstractC5121b.AbstractC5122a {

    /* renamed from: a */
    private final Status f22491a;

    /* renamed from: b */
    private final Intent f22492b;

    public ano(Status status, Intent intent) {
        this.f22491a = (Status) C4588d.m23627a(status);
        this.f22492b = intent;
    }

    @Override // com.google.android.gms.common.api.AbstractC4502m
    /* renamed from: a */
    public Status mo7645a() {
        return this.f22491a;
    }

    @Override // com.google.android.gms.p237e.AbstractC5121b.AbstractC5122a
    /* renamed from: b */
    public Intent mo16608b() {
        return this.f22492b;
    }
}
