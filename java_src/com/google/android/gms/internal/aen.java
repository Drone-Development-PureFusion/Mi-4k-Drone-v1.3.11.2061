package com.google.android.gms.internal;

import android.accounts.Account;
import com.google.android.gms.auth.p230a.AbstractC3976b;
import com.google.android.gms.auth.p230a.AbstractC3978c;
import com.google.android.gms.auth.p230a.AbstractC3981d;
import com.google.android.gms.auth.p230a.C3974a;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.AbstractC4502m;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ahl;
/* loaded from: classes2.dex */
public class aen implements AbstractC3976b {

    /* renamed from: a */
    private static final Status f21362a = new Status(13);

    /* renamed from: com.google.android.gms.internal.aen$a */
    /* loaded from: classes2.dex */
    static class BinderC6245a extends AbstractC3978c.AbstractBinderC3979a {
        BinderC6245a() {
        }

        /* renamed from: a */
        public void mo17841a(Account account) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: a */
        public void mo17840a(boolean z) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.internal.aen$b */
    /* loaded from: classes2.dex */
    public static class C6246b implements AbstractC3976b.AbstractC3977a {

        /* renamed from: a */
        private final Status f21371a;

        /* renamed from: b */
        private final Account f21372b;

        public C6246b(Status status, Account account) {
            this.f21371a = status;
            this.f21372b = account;
        }

        @Override // com.google.android.gms.common.api.AbstractC4502m
        /* renamed from: a */
        public Status mo7645a() {
            return this.f21371a;
        }

        @Override // com.google.android.gms.auth.p230a.AbstractC3976b.AbstractC3977a
        /* renamed from: b */
        public Account mo17839b() {
            return this.f21372b;
        }
    }

    /* renamed from: com.google.android.gms.internal.aen$c */
    /* loaded from: classes2.dex */
    static class C6247c implements AbstractC4502m {

        /* renamed from: a */
        private final Status f21373a;

        public C6247c(Status status) {
            this.f21373a = status;
        }

        @Override // com.google.android.gms.common.api.AbstractC4502m
        /* renamed from: a */
        public Status mo7645a() {
            return this.f21373a;
        }
    }

    @Override // com.google.android.gms.auth.p230a.AbstractC3976b
    /* renamed from: a */
    public AbstractC4494i<AbstractC4502m> mo17848a(AbstractC4489g abstractC4489g, final Account account) {
        return abstractC4489g.mo17253b((AbstractC4489g) new ahl.AbstractC6343a<AbstractC4502m, aeo>(C3974a.f15348a, abstractC4489g) { // from class: com.google.android.gms.internal.aen.3
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(aeo aeoVar) {
                ((AbstractC3981d) aeoVar.G()).mo25853a(new BinderC6245a() { // from class: com.google.android.gms.internal.aen.3.1
                    @Override // com.google.android.gms.internal.aen.BinderC6245a, com.google.android.gms.auth.p230a.AbstractC3978c
                    /* renamed from: a */
                    public void mo17840a(boolean z) {
                        b((C62433) new C6247c(z ? Status.f16786a : aen.f21362a));
                    }
                }, account);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahn
            /* renamed from: b */
            public AbstractC4502m mo7807b(Status status) {
                return new C6247c(status);
            }
        });
    }

    @Override // com.google.android.gms.auth.p230a.AbstractC3976b
    /* renamed from: a */
    public AbstractC4494i<AbstractC3976b.AbstractC3977a> mo17847a(AbstractC4489g abstractC4489g, final String str) {
        return abstractC4489g.mo17253b((AbstractC4489g) new ahl.AbstractC6343a<AbstractC3976b.AbstractC3977a, aeo>(C3974a.f15348a, abstractC4489g) { // from class: com.google.android.gms.internal.aen.2
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahn
            /* renamed from: a */
            public AbstractC3976b.AbstractC3977a mo7807b(Status status) {
                return new C6246b(status, null);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(aeo aeoVar) {
                ((AbstractC3981d) aeoVar.G()).mo25852a(new BinderC6245a() { // from class: com.google.android.gms.internal.aen.2.1
                    @Override // com.google.android.gms.internal.aen.BinderC6245a, com.google.android.gms.auth.p230a.AbstractC3978c
                    /* renamed from: a */
                    public void mo17841a(Account account) {
                        b((C62412) new C6246b(account != null ? Status.f16786a : aen.f21362a, account));
                    }
                }, str);
            }
        });
    }

    @Override // com.google.android.gms.auth.p230a.AbstractC3976b
    /* renamed from: a */
    public void mo17846a(AbstractC4489g abstractC4489g, final boolean z) {
        abstractC4489g.mo17253b((AbstractC4489g) new ahl.AbstractC6343a<AbstractC4502m, aeo>(C3974a.f15348a, abstractC4489g) { // from class: com.google.android.gms.internal.aen.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(aeo aeoVar) {
                ((AbstractC3981d) aeoVar.G()).mo25851a(z);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahn
            /* renamed from: b */
            public AbstractC4502m mo7807b(Status status) {
                return null;
            }
        });
    }
}
