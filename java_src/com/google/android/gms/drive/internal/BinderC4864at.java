package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ahl;
/* renamed from: com.google.android.gms.drive.internal.at */
/* loaded from: classes2.dex */
public class BinderC4864at extends BinderC4879bc {

    /* renamed from: a */
    private final ahl.AbstractC6344b<Status> f17841a;

    public BinderC4864at(ahl.AbstractC6344b<Status> abstractC6344b) {
        this.f17841a = abstractC6344b;
    }

    @Override // com.google.android.gms.drive.internal.BinderC4879bc, com.google.android.gms.drive.internal.AbstractC4967o
    /* renamed from: a */
    public void mo22276a() {
        this.f17841a.mo7413a(Status.f16786a);
    }

    @Override // com.google.android.gms.drive.internal.BinderC4879bc, com.google.android.gms.drive.internal.AbstractC4967o
    /* renamed from: a */
    public void mo22275a(Status status) {
        this.f17841a.mo7413a(status);
    }
}
