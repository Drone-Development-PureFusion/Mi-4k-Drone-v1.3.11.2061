package com.google.android.gms.auth.api.credentials.internal;

import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.auth.api.C3984a;
import com.google.android.gms.auth.api.credentials.AbstractC4003a;
import com.google.android.gms.auth.api.credentials.AbstractC4004b;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.auth.api.credentials.PasswordSpecification;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.C4467a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.drive.AbstractC4808e;
import com.google.android.gms.internal.ahl;
/* renamed from: com.google.android.gms.auth.api.credentials.internal.e */
/* loaded from: classes2.dex */
public final class C4016e implements AbstractC4004b {

    /* renamed from: com.google.android.gms.auth.api.credentials.internal.e$a */
    /* loaded from: classes2.dex */
    private static class BinderC4022a extends BinderC4012a {

        /* renamed from: a */
        private ahl.AbstractC6344b<Status> f15463a;

        BinderC4022a(ahl.AbstractC6344b<Status> abstractC6344b) {
            this.f15463a = abstractC6344b;
        }

        @Override // com.google.android.gms.auth.api.credentials.internal.BinderC4012a, com.google.android.gms.auth.api.credentials.internal.AbstractC4027j
        /* renamed from: a */
        public void mo25719a(Status status) {
            this.f15463a.mo7413a(status);
        }
    }

    /* renamed from: b */
    private PasswordSpecification m25736b(AbstractC4489g abstractC4489g) {
        C3984a.C3988a m25727d = ((C4024g) abstractC4489g.mo17383a((C4467a.C4475d<C4467a.AbstractC4477f>) C3984a.f15354a)).m25727d();
        return (m25727d == null || m25727d.m25846a() == null) ? PasswordSpecification.f15422a : m25727d.m25846a();
    }

    @Override // com.google.android.gms.auth.api.credentials.AbstractC4004b
    /* renamed from: a */
    public PendingIntent mo25737a(AbstractC4489g abstractC4489g, HintRequest hintRequest) {
        C4588d.m23626a(abstractC4489g, "client must not be null");
        C4588d.m23626a(hintRequest, "request must not be null");
        C4588d.m23618b(abstractC4489g.mo17382a((C4467a<?>) C3984a.f15358e), "Auth.CREDENTIALS_API must be added to GoogleApiClient to use this API");
        return PendingIntent.getActivity(abstractC4489g.mo17372b(), 2000, C4014c.m25743a(abstractC4489g.mo17372b(), hintRequest, m25736b(abstractC4489g)), AbstractC4808e.f17570a_);
    }

    @Override // com.google.android.gms.auth.api.credentials.AbstractC4004b
    /* renamed from: a */
    public AbstractC4494i<Status> mo25740a(AbstractC4489g abstractC4489g) {
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC4023f<Status>(abstractC4489g) { // from class: com.google.android.gms.auth.api.credentials.internal.e.4
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahn
            /* renamed from: a */
            public Status mo7807b(Status status) {
                return status;
            }

            @Override // com.google.android.gms.auth.api.credentials.internal.AbstractC4023f
            /* renamed from: a */
            protected void mo25730a(Context context, AbstractC4030k abstractC4030k) {
                abstractC4030k.mo25715a(new BinderC4022a(this));
            }
        });
    }

    @Override // com.google.android.gms.auth.api.credentials.AbstractC4004b
    /* renamed from: a */
    public AbstractC4494i<Status> mo25739a(AbstractC4489g abstractC4489g, final Credential credential) {
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC4023f<Status>(abstractC4489g) { // from class: com.google.android.gms.auth.api.credentials.internal.e.2
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahn
            /* renamed from: a */
            public Status mo7807b(Status status) {
                return status;
            }

            @Override // com.google.android.gms.auth.api.credentials.internal.AbstractC4023f
            /* renamed from: a */
            protected void mo25730a(Context context, AbstractC4030k abstractC4030k) {
                abstractC4030k.mo25711a(new BinderC4022a(this), new SaveRequest(credential));
            }
        });
    }

    @Override // com.google.android.gms.auth.api.credentials.AbstractC4004b
    /* renamed from: a */
    public AbstractC4494i<AbstractC4003a> mo25738a(AbstractC4489g abstractC4489g, final CredentialRequest credentialRequest) {
        return abstractC4489g.mo17255a((AbstractC4489g) new AbstractC4023f<AbstractC4003a>(abstractC4489g) { // from class: com.google.android.gms.auth.api.credentials.internal.e.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahn
            /* renamed from: a */
            public AbstractC4003a mo7807b(Status status) {
                return C4015d.m25742a(status);
            }

            @Override // com.google.android.gms.auth.api.credentials.internal.AbstractC4023f
            /* renamed from: a */
            protected void mo25730a(Context context, AbstractC4030k abstractC4030k) {
                abstractC4030k.mo25714a(new BinderC4012a() { // from class: com.google.android.gms.auth.api.credentials.internal.e.1.1
                    @Override // com.google.android.gms.auth.api.credentials.internal.BinderC4012a, com.google.android.gms.auth.api.credentials.internal.AbstractC4027j
                    /* renamed from: a */
                    public void mo25719a(Status status) {
                        b((C40171) C4015d.m25742a(status));
                    }

                    @Override // com.google.android.gms.auth.api.credentials.internal.BinderC4012a, com.google.android.gms.auth.api.credentials.internal.AbstractC4027j
                    /* renamed from: a */
                    public void mo25718a(Status status, Credential credential) {
                        b((C40171) new C4015d(status, credential));
                    }
                }, credentialRequest);
            }
        });
    }

    @Override // com.google.android.gms.auth.api.credentials.AbstractC4004b
    /* renamed from: b */
    public AbstractC4494i<Status> mo25735b(AbstractC4489g abstractC4489g, final Credential credential) {
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC4023f<Status>(abstractC4489g) { // from class: com.google.android.gms.auth.api.credentials.internal.e.3
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahn
            /* renamed from: a */
            public Status mo7807b(Status status) {
                return status;
            }

            @Override // com.google.android.gms.auth.api.credentials.internal.AbstractC4023f
            /* renamed from: a */
            protected void mo25730a(Context context, AbstractC4030k abstractC4030k) {
                abstractC4030k.mo25713a(new BinderC4022a(this), new DeleteRequest(credential));
            }
        });
    }
}
