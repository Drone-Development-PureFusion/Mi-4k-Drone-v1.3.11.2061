package com.google.android.gms.nearby.messages.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ahl;
import com.google.android.gms.nearby.messages.internal.AbstractC8853k;
/* renamed from: com.google.android.gms.nearby.messages.internal.v */
/* loaded from: classes2.dex */
final class BinderC8897v extends AbstractC8853k.AbstractBinderC8854a {

    /* renamed from: a */
    private final ahl.AbstractC6344b<Status> f28382a;

    /* renamed from: b */
    private boolean f28383b;

    private BinderC8897v(ahl.AbstractC6344b<Status> abstractC6344b) {
        this.f28382a = abstractC6344b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static BinderC8897v m9781a(ahl.AbstractC6344b<Status> abstractC6344b) {
        return new BinderC8897v(abstractC6344b);
    }

    @Override // com.google.android.gms.nearby.messages.internal.AbstractC8853k
    /* renamed from: a */
    public void mo9782a(Status status) {
        if (!this.f28383b) {
            this.f28382a.mo7413a(status);
            this.f28383b = true;
        }
    }
}
