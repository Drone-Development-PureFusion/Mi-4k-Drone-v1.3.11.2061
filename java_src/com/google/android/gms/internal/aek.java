package com.google.android.gms.internal;

import android.content.Intent;
import com.google.android.gms.appinvite.AbstractC3971d;
import com.google.android.gms.common.api.Status;
/* loaded from: classes2.dex */
public class aek implements AbstractC3971d {

    /* renamed from: a */
    private final Status f21358a;

    /* renamed from: b */
    private final Intent f21359b;

    public aek(Status status, Intent intent) {
        this.f21358a = status;
        this.f21359b = intent;
    }

    @Override // com.google.android.gms.appinvite.AbstractC3971d, com.google.android.gms.common.api.AbstractC4502m
    /* renamed from: a */
    public Status mo7645a() {
        return this.f21358a;
    }

    @Override // com.google.android.gms.appinvite.AbstractC3971d
    /* renamed from: b */
    public Intent mo17857b() {
        return this.f21359b;
    }
}
