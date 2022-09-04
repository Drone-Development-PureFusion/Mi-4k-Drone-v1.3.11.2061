package com.google.android.gms.auth.api.signin.internal;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.auth.api.C3984a;
import com.google.android.gms.auth.api.signin.AbstractC4044a;
import com.google.android.gms.auth.api.signin.C4045b;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4493h;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.AbstractC4502m;
import com.google.android.gms.common.api.C4467a;
import com.google.android.gms.common.api.C4496j;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.internal.ahl;
import com.google.android.gms.internal.aio;
import java.util.HashSet;
/* renamed from: com.google.android.gms.auth.api.signin.internal.b */
/* loaded from: classes2.dex */
public class C4053b implements AbstractC4044a {

    /* renamed from: com.google.android.gms.auth.api.signin.internal.b$a */
    /* loaded from: classes2.dex */
    private abstract class AbstractC4060a<R extends AbstractC4502m> extends ahl.AbstractC6343a<R, C4061c> {
        public AbstractC4060a(AbstractC4489g abstractC4489g) {
            super(C3984a.f15359f, abstractC4489g);
        }
    }

    /* renamed from: a */
    private AbstractC4493h<C4045b> m25613a(AbstractC4489g abstractC4489g, final GoogleSignInOptions googleSignInOptions) {
        Log.d("GoogleSignInApiImpl", "trySilentSignIn");
        return new aio(abstractC4489g.mo17255a((AbstractC4489g) new AbstractC4060a<C4045b>(abstractC4489g) { // from class: com.google.android.gms.auth.api.signin.internal.b.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahn
            /* renamed from: a */
            public C4045b mo7807b(Status status) {
                return new C4045b(null, status);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C4061c c4061c) {
                final C4073j m25582a = C4073j.m25582a(c4061c.B());
                ((AbstractC4068g) c4061c.G()).mo25592a(new BinderC4052a() { // from class: com.google.android.gms.auth.api.signin.internal.b.1.1
                    @Override // com.google.android.gms.auth.api.signin.internal.BinderC4052a, com.google.android.gms.auth.api.signin.internal.AbstractC4065f
                    /* renamed from: a */
                    public void mo25596a(GoogleSignInAccount googleSignInAccount, Status status) {
                        if (googleSignInAccount != null) {
                            m25582a.m25577b(googleSignInAccount, googleSignInOptions);
                        }
                        b((C40541) new C4045b(googleSignInAccount, status));
                    }
                }, googleSignInOptions);
            }
        }));
    }

    /* renamed from: a */
    private boolean m25617a(Account account, Account account2) {
        return account == null ? account2 == null : account.equals(account2);
    }

    /* renamed from: e */
    private GoogleSignInOptions m25609e(AbstractC4489g abstractC4489g) {
        return ((C4061c) abstractC4489g.mo17383a((C4467a.C4475d<C4467a.AbstractC4477f>) C3984a.f15356c)).m25601n_();
    }

    @Override // com.google.android.gms.auth.api.signin.AbstractC4044a
    /* renamed from: a */
    public Intent mo25614a(AbstractC4489g abstractC4489g) {
        C4588d.m23627a(abstractC4489g);
        return ((C4061c) abstractC4489g.mo17383a((C4467a.C4475d<C4467a.AbstractC4477f>) C3984a.f15356c)).mo23565e();
    }

    /* renamed from: a */
    public C4045b m25616a(Context context, GoogleSignInOptions googleSignInOptions) {
        GoogleSignInAccount m25583a;
        Log.d("GoogleSignInApiImpl", "getSavedSignInResultIfEligible");
        C4588d.m23627a(googleSignInOptions);
        C4073j m25582a = C4073j.m25582a(context);
        GoogleSignInOptions m25578b = m25582a.m25578b();
        if (m25578b != null && m25617a(m25578b.m25664c(), googleSignInOptions.m25664c()) && !googleSignInOptions.m25660e()) {
            if ((googleSignInOptions.m25662d() && (!m25578b.m25662d() || !googleSignInOptions.m25656g().equals(m25578b.m25656g()))) || !new HashSet(m25578b.m25669a()).containsAll(new HashSet(googleSignInOptions.m25669a())) || (m25583a = m25582a.m25583a()) == null || m25583a.m25676j()) {
                return null;
            }
            return new C4045b(m25583a, Status.f16786a);
        }
        return null;
    }

    @Override // com.google.android.gms.auth.api.signin.AbstractC4044a
    /* renamed from: a */
    public C4045b mo25615a(Intent intent) {
        if (intent == null || (!intent.hasExtra("googleSignInStatus") && !intent.hasExtra("googleSignInAccount"))) {
            return null;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) intent.getParcelableExtra("googleSignInAccount");
        Status status = (Status) intent.getParcelableExtra("googleSignInStatus");
        if (googleSignInAccount != null) {
            status = Status.f16786a;
        }
        return new C4045b(googleSignInAccount, status);
    }

    @Override // com.google.android.gms.auth.api.signin.AbstractC4044a
    /* renamed from: b */
    public AbstractC4493h<C4045b> mo25612b(AbstractC4489g abstractC4489g) {
        GoogleSignInOptions m25609e = m25609e(abstractC4489g);
        C4045b m25616a = m25616a(abstractC4489g.mo17372b(), m25609e);
        return m25616a != null ? C4496j.m23949b(m25616a, abstractC4489g) : m25613a(abstractC4489g, m25609e);
    }

    @Override // com.google.android.gms.auth.api.signin.AbstractC4044a
    /* renamed from: c */
    public AbstractC4494i<Status> mo25611c(AbstractC4489g abstractC4489g) {
        C4073j.m25582a(abstractC4489g.mo17372b()).m25574c();
        for (AbstractC4489g abstractC4489g2 : AbstractC4489g.m23980a()) {
            abstractC4489g2.mo17359d();
        }
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC4060a<Status>(abstractC4489g) { // from class: com.google.android.gms.auth.api.signin.internal.b.2
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahn
            /* renamed from: a */
            public Status mo7807b(Status status) {
                return status;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C4061c c4061c) {
                ((AbstractC4068g) c4061c.G()).mo25591b(new BinderC4052a() { // from class: com.google.android.gms.auth.api.signin.internal.b.2.1
                    @Override // com.google.android.gms.auth.api.signin.internal.BinderC4052a, com.google.android.gms.auth.api.signin.internal.AbstractC4065f
                    /* renamed from: a */
                    public void mo25595a(Status status) {
                        b((C40562) status);
                    }
                }, c4061c.m25601n_());
            }
        });
    }

    @Override // com.google.android.gms.auth.api.signin.AbstractC4044a
    /* renamed from: d */
    public AbstractC4494i<Status> mo25610d(AbstractC4489g abstractC4489g) {
        C4073j.m25582a(abstractC4489g.mo17372b()).m25574c();
        for (AbstractC4489g abstractC4489g2 : AbstractC4489g.m23980a()) {
            abstractC4489g2.mo17359d();
        }
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC4060a<Status>(abstractC4489g) { // from class: com.google.android.gms.auth.api.signin.internal.b.3
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahn
            /* renamed from: a */
            public Status mo7807b(Status status) {
                return status;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C4061c c4061c) {
                ((AbstractC4068g) c4061c.G()).mo25590c(new BinderC4052a() { // from class: com.google.android.gms.auth.api.signin.internal.b.3.1
                    @Override // com.google.android.gms.auth.api.signin.internal.BinderC4052a, com.google.android.gms.auth.api.signin.internal.AbstractC4065f
                    /* renamed from: b */
                    public void mo25594b(Status status) {
                        b((C40583) status);
                    }
                }, c4061c.m25601n_());
            }
        });
    }
}
