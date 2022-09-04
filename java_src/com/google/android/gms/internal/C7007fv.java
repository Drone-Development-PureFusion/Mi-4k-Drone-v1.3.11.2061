package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.internal.AbstractC4638w;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.C4626s;
import com.google.android.gms.internal.AbstractC7015ga;
import com.google.android.gms.internal.C7018gb;
/* renamed from: com.google.android.gms.internal.fv */
/* loaded from: classes2.dex */
public class C7007fv extends AbstractC4638w<AbstractC7015ga> implements AbstractC7006fu {

    /* renamed from: a */
    private static ajl f23691a = new ajl("FirebaseAuth", "FirebaseAuth:");

    /* renamed from: e */
    private final Context f23692e;

    /* renamed from: f */
    private final C7018gb.C7020a f23693f;

    public C7007fv(Context context, Looper looper, C4626s c4626s, C7018gb.C7020a c7020a, AbstractC4489g.AbstractC4491b abstractC4491b, AbstractC4489g.AbstractC4492c abstractC4492c) {
        super(context, looper, 112, c4626s, abstractC4491b, abstractC4492c);
        this.f23692e = (Context) C4588d.m23627a(context);
        this.f23693f = c7020a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: a */
    public AbstractC7015ga mo7440b(IBinder iBinder) {
        return AbstractC7015ga.AbstractBinderC7016a.m15798a(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: a */
    protected String mo7443a() {
        return "com.google.firebase.auth.api.gms.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: b */
    protected String mo7441b() {
        return "com.google.firebase.auth.api.internal.IFirebaseAuthService";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: c */
    public Bundle mo9367c() {
        Bundle c = super.c();
        if (c == null) {
            c = new Bundle();
        }
        if (this.f23693f != null) {
            c.putString("com.google.firebase.auth.API_KEY", this.f23693f.m15777a());
        }
        return c;
    }

    @Override // com.google.android.gms.internal.AbstractC7006fu
    /* renamed from: t_ */
    public /* synthetic */ AbstractC7015ga mo15808t_() {
        return (AbstractC7015ga) super.G();
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p, com.google.android.gms.common.api.C4467a.AbstractC4477f
    /* renamed from: w */
    public boolean mo7943w() {
        return akb.m17065a(this.f23692e, "com.google.firebase.auth") == 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: y */
    protected String mo7942y() {
        boolean z;
        boolean z2;
        String m15749a = C7029gh.m15749a("firebear.preference");
        if (TextUtils.isEmpty(m15749a)) {
            m15749a = "default";
        }
        switch (m15749a.hashCode()) {
            case 103145323:
                if (m15749a.equals("local")) {
                    z = false;
                    break;
                }
                z = true;
                break;
            case 1544803905:
                if (m15749a.equals("default")) {
                    z = true;
                    break;
                }
                z = true;
                break;
            default:
                z = true;
                break;
        }
        switch (z) {
            case false:
            case true:
                break;
            default:
                m15749a = "default";
                break;
        }
        switch (m15749a.hashCode()) {
            case 103145323:
                if (m15749a.equals("local")) {
                    z2 = false;
                    break;
                }
            default:
                z2 = true;
                break;
        }
        switch (z2) {
            case false:
                f23691a.m17117a("Loading fallback module override.", new Object[0]);
                return this.f23692e.getPackageName();
            default:
                f23691a.m17117a("Loading module via default loading order.", new Object[0]);
                if (akb.m17061b(this.f23692e, "com.google.android.gms.firebase_auth") >= akb.m17065a(this.f23692e, "com.google.firebase.auth")) {
                    f23691a.m17117a("Loading remote module.", new Object[0]);
                    return "com.google.android.gms";
                }
                f23691a.m17117a("Loading fallback module.", new Object[0]);
                return this.f23692e.getPackageName();
        }
    }
}
