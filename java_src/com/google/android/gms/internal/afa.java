package com.google.android.gms.internal;

import com.google.android.gms.auth.api.proxy.AbstractC4036b;
import com.google.android.gms.auth.api.proxy.ProxyResponse;
import com.google.android.gms.common.api.Status;
/* loaded from: classes2.dex */
class afa implements AbstractC4036b.AbstractC4037a {

    /* renamed from: a */
    private Status f21382a;

    /* renamed from: b */
    private ProxyResponse f21383b;

    public afa(ProxyResponse proxyResponse) {
        this.f21383b = proxyResponse;
        this.f21382a = Status.f16786a;
    }

    public afa(Status status) {
        this.f21382a = status;
    }

    @Override // com.google.android.gms.common.api.AbstractC4502m
    /* renamed from: a */
    public Status mo7645a() {
        return this.f21382a;
    }

    @Override // com.google.android.gms.auth.api.proxy.AbstractC4036b.AbstractC4037a
    /* renamed from: b */
    public ProxyResponse mo17820b() {
        return this.f21383b;
    }
}
