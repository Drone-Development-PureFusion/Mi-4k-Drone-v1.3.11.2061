package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.C3984a;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.AbstractC4063e;
import com.google.android.gms.common.C4536e;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.C4467a;
/* renamed from: com.google.android.gms.auth.api.signin.internal.h */
/* loaded from: classes.dex */
public class BinderC4071h extends AbstractC4063e.AbstractBinderC4064a {

    /* renamed from: a */
    private final Context f15574a;

    public BinderC4071h(Context context) {
        this.f15574a = context;
    }

    /* renamed from: b */
    private void m25588b() {
        if (!C4536e.c(this.f15574a, Binder.getCallingUid())) {
            throw new SecurityException(new StringBuilder(52).append("Calling UID ").append(Binder.getCallingUid()).append(" is not Google Play services.").toString());
        }
    }

    /* renamed from: c */
    private void m25587c() {
        C4073j m25582a = C4073j.m25582a(this.f15574a);
        GoogleSignInAccount m25583a = m25582a.m25583a();
        GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.f15525d;
        if (m25583a != null) {
            googleSignInOptions = m25582a.m25578b();
        }
        AbstractC4489g m23957c = new AbstractC4489g.C4490a(this.f15574a).m23967a((C4467a<C4467a<GoogleSignInOptions>>) C3984a.f15359f, (C4467a<GoogleSignInOptions>) googleSignInOptions).m23957c();
        try {
            if (m23957c.mo17357f().m24047b()) {
                if (m25583a != null) {
                    C3984a.f15364k.mo25610d(m23957c);
                } else {
                    m23957c.mo17354i();
                }
            }
        } finally {
            m23957c.mo17356g();
        }
    }

    @Override // com.google.android.gms.auth.api.signin.internal.AbstractC4063e
    /* renamed from: a */
    public void mo25589a() {
        m25588b();
        m25587c();
    }
}
