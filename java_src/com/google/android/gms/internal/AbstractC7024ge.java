package com.google.android.gms.internal;

import android.support.annotation.NonNull;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.internal.AbstractC7011fz;
import com.google.firebase.C9751b;
import com.google.firebase.auth.AbstractC9739n;
import com.google.firebase.auth.api.model.CreateAuthUriResponse;
import com.google.firebase.auth.api.model.GetAccountInfoUser;
import com.google.firebase.auth.api.model.GetTokenResponse;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ge */
/* loaded from: classes2.dex */
public abstract class AbstractC7024ge<SuccessT, CallbackT> {

    /* renamed from: a */
    protected final int f23703a;

    /* renamed from: b */
    protected final BinderC7026a f23704b = new BinderC7026a();

    /* renamed from: c */
    protected C9751b f23705c;

    /* renamed from: d */
    protected AbstractC9739n f23706d;

    /* renamed from: e */
    protected AbstractC7015ga f23707e;

    /* renamed from: f */
    protected CallbackT f23708f;

    /* renamed from: g */
    protected AbstractC7023gd<SuccessT> f23709g;

    /* renamed from: h */
    protected GetTokenResponse f23710h;

    /* renamed from: i */
    protected GetAccountInfoUser f23711i;

    /* renamed from: j */
    protected CreateAuthUriResponse f23712j;

    /* renamed from: k */
    boolean f23713k;

    /* renamed from: l */
    SuccessT f23714l;

    /* renamed from: m */
    Status f23715m;

    /* renamed from: n */
    private boolean f23716n;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.internal.ge$a */
    /* loaded from: classes2.dex */
    public class BinderC7026a extends AbstractC7011fz.AbstractBinderC7012a {
        private BinderC7026a() {
        }

        @Override // com.google.android.gms.internal.AbstractC7011fz
        /* renamed from: a */
        public void mo15762a() {
            C4588d.m23622a(AbstractC7024ge.this.f23703a == 4, new StringBuilder(36).append("Unexpected response type ").append(AbstractC7024ge.this.f23703a).toString());
            AbstractC7024ge.this.m15763d();
        }

        @Override // com.google.android.gms.internal.AbstractC7011fz
        /* renamed from: a */
        public void mo15761a(@NonNull Status status) {
            AbstractC7024ge.this.m15773a(status);
        }

        @Override // com.google.android.gms.internal.AbstractC7011fz
        /* renamed from: a */
        public void mo15760a(@NonNull CreateAuthUriResponse createAuthUriResponse) {
            C4588d.m23622a(AbstractC7024ge.this.f23703a == 3, new StringBuilder(36).append("Unexpected response type ").append(AbstractC7024ge.this.f23703a).toString());
            AbstractC7024ge.this.f23712j = createAuthUriResponse;
            AbstractC7024ge.this.m15763d();
        }

        @Override // com.google.android.gms.internal.AbstractC7011fz
        /* renamed from: a */
        public void mo15759a(@NonNull GetTokenResponse getTokenResponse) {
            boolean z = true;
            if (AbstractC7024ge.this.f23703a != 1) {
                z = false;
            }
            C4588d.m23622a(z, new StringBuilder(37).append("Unexpected response type: ").append(AbstractC7024ge.this.f23703a).toString());
            AbstractC7024ge.this.f23710h = getTokenResponse;
            AbstractC7024ge.this.m15763d();
        }

        @Override // com.google.android.gms.internal.AbstractC7011fz
        /* renamed from: a */
        public void mo15758a(@NonNull GetTokenResponse getTokenResponse, @NonNull GetAccountInfoUser getAccountInfoUser) {
            C4588d.m23622a(AbstractC7024ge.this.f23703a == 2, new StringBuilder(37).append("Unexpected response type: ").append(AbstractC7024ge.this.f23703a).toString());
            AbstractC7024ge.this.f23710h = getTokenResponse;
            AbstractC7024ge.this.f23711i = getAccountInfoUser;
            AbstractC7024ge.this.m15763d();
        }

        @Override // com.google.android.gms.internal.AbstractC7011fz
        /* renamed from: b */
        public void mo15757b() {
            C4588d.m23622a(AbstractC7024ge.this.f23703a == 5, new StringBuilder(36).append("Unexpected response type ").append(AbstractC7024ge.this.f23703a).toString());
            AbstractC7024ge.this.m15763d();
        }

        @Override // com.google.android.gms.internal.AbstractC7011fz
        /* renamed from: c */
        public void mo15756c() {
            C4588d.m23622a(AbstractC7024ge.this.f23703a == 6, new StringBuilder(36).append("Unexpected response type ").append(AbstractC7024ge.this.f23703a).toString());
            AbstractC7024ge.this.m15763d();
        }
    }

    public AbstractC7024ge(int i) {
        this.f23703a = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public void m15763d() {
        mo15766b();
        C4588d.m23622a(this.f23716n, "no success or failure set on method implementation");
    }

    /* renamed from: a */
    public AbstractC7024ge<SuccessT, CallbackT> m15771a(AbstractC7023gd<SuccessT> abstractC7023gd) {
        this.f23709g = abstractC7023gd;
        return this;
    }

    /* renamed from: a */
    public AbstractC7024ge<SuccessT, CallbackT> m15769a(AbstractC9739n abstractC9739n) {
        this.f23706d = (AbstractC9739n) C4588d.m23626a(abstractC9739n, "firebaseUser cannot be null");
        return this;
    }

    /* renamed from: a */
    public AbstractC7024ge<SuccessT, CallbackT> m15768a(C9751b c9751b) {
        this.f23705c = (C9751b) C4588d.m23626a(c9751b, "firebaseApp cannot be null");
        return this;
    }

    /* renamed from: a */
    public AbstractC7024ge<SuccessT, CallbackT> m15767a(CallbackT callbackt) {
        this.f23708f = (CallbackT) C4588d.m23626a(callbackt, "external callback cannot be null");
        return this;
    }

    /* renamed from: a */
    protected abstract void mo15774a();

    /* renamed from: a */
    public void m15773a(Status status) {
        this.f23716n = true;
        this.f23713k = false;
        this.f23715m = status;
        this.f23709g.mo15775a(null, status);
    }

    /* renamed from: a */
    public void m15772a(AbstractC7015ga abstractC7015ga) {
        this.f23707e = abstractC7015ga;
        mo15774a();
    }

    /* renamed from: b */
    public abstract void mo15766b();

    /* renamed from: b */
    public void m15765b(SuccessT successt) {
        this.f23716n = true;
        this.f23713k = true;
        this.f23714l = successt;
        this.f23709g.mo15775a(successt, null);
    }

    /* renamed from: c */
    public void m15764c() {
        m15765b(null);
    }
}
