package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.internal.C4073j;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.internal.AbstractC4559ac;
import com.google.android.gms.common.internal.AbstractC4600p;
import com.google.android.gms.common.internal.AbstractC4638w;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.C4626s;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.internal.aok;
import com.google.android.gms.internal.aom;
import com.google.android.gms.signin.internal.AbstractC9012e;
/* renamed from: com.google.android.gms.signin.internal.g */
/* loaded from: classes2.dex */
public class C9016g extends AbstractC4638w<AbstractC9012e> implements aok {

    /* renamed from: a */
    private final boolean f28657a;

    /* renamed from: e */
    private final C4626s f28658e;

    /* renamed from: f */
    private final Bundle f28659f;

    /* renamed from: g */
    private Integer f28660g;

    public C9016g(Context context, Looper looper, boolean z, C4626s c4626s, Bundle bundle, AbstractC4489g.AbstractC4491b abstractC4491b, AbstractC4489g.AbstractC4492c abstractC4492c) {
        super(context, looper, 44, c4626s, abstractC4491b, abstractC4492c);
        this.f28657a = z;
        this.f28658e = c4626s;
        this.f28659f = bundle;
        this.f28660g = c4626s.m23523l();
    }

    public C9016g(Context context, Looper looper, boolean z, C4626s c4626s, aom aomVar, AbstractC4489g.AbstractC4491b abstractC4491b, AbstractC4489g.AbstractC4492c abstractC4492c) {
        this(context, looper, z, c4626s, m9369a(c4626s), abstractC4491b, abstractC4492c);
    }

    /* renamed from: a */
    public static Bundle m9369a(C4626s c4626s) {
        aom m23524k = c4626s.m23524k();
        Integer m23523l = c4626s.m23523l();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", c4626s.m23533b());
        if (m23523l != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", m23523l.intValue());
        }
        if (m23524k != null) {
            bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", m23524k.m16499a());
            bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", m23524k.m16498b());
            bundle.putString("com.google.android.gms.signin.internal.serverClientId", m23524k.m16497c());
            bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
            bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", m23524k.m16496d());
            bundle.putString("com.google.android.gms.signin.internal.hostedDomain", m23524k.m16495e());
            bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", m23524k.m16494f());
            if (m23524k.m16493g() != null) {
                bundle.putLong("com.google.android.gms.signin.internal.authApiSignInModuleVersion", m23524k.m16493g().longValue());
            }
            if (m23524k.m16492h() != null) {
                bundle.putLong("com.google.android.gms.signin.internal.realClientLibraryVersion", m23524k.m16492h().longValue());
            }
        }
        return bundle;
    }

    /* renamed from: i */
    private ResolveAccountRequest m9365i() {
        Account m23532c = this.f28658e.m23532c();
        GoogleSignInAccount googleSignInAccount = null;
        if ("<<default account>>".equals(m23532c.name)) {
            googleSignInAccount = C4073j.m25582a(B()).m25583a();
        }
        return new ResolveAccountRequest(m23532c, this.f28660g.intValue(), googleSignInAccount);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: a */
    public AbstractC9012e mo7440b(IBinder iBinder) {
        return AbstractC9012e.AbstractBinderC9013a.m9385a(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: a */
    protected String mo7443a() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // com.google.android.gms.internal.aok
    /* renamed from: a */
    public void mo9370a(AbstractC4559ac abstractC4559ac, boolean z) {
        try {
            ((AbstractC9012e) G()).mo9380a(abstractC4559ac, this.f28660g.intValue(), z);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }

    @Override // com.google.android.gms.internal.aok
    /* renamed from: a */
    public void mo9368a(AbstractC9009d abstractC9009d) {
        C4588d.m23626a(abstractC9009d, "Expecting a valid ISignInCallbacks");
        try {
            ((AbstractC9012e) G()).mo9377a(new SignInRequest(m9365i()), abstractC9009d);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                abstractC9009d.mo9387a(new SignInResponse(8));
            } catch (RemoteException e2) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: b */
    protected String mo7441b() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: c */
    public Bundle mo9367c() {
        if (!B().getPackageName().equals(this.f28658e.m23527h())) {
            this.f28659f.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f28658e.m23527h());
        }
        return this.f28659f;
    }

    @Override // com.google.android.gms.internal.aok
    /* renamed from: h */
    public void mo9366h() {
        a(new AbstractC4600p.C4609i());
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p, com.google.android.gms.common.api.C4467a.AbstractC4477f
    /* renamed from: v */
    public boolean mo9364v() {
        return this.f28657a;
    }

    @Override // com.google.android.gms.internal.aok
    /* renamed from: y_ */
    public void mo9363y_() {
        try {
            ((AbstractC9012e) G()).mo9384a(this.f28660g.intValue());
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }
}
