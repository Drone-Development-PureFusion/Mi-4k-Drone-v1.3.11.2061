package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.C3779u;
import com.google.android.gms.internal.C8113zn;
import com.google.android.gms.internal.abi;
import com.google.android.gms.internal.acz;
@aaa
/* renamed from: com.google.android.gms.internal.zo */
/* loaded from: classes.dex */
public class C8115zo extends AbstractC8104zj implements acz.AbstractC6197a {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C8115zo(Context context, abi.C6129a c6129a, acy acyVar, C8113zn.AbstractC8114a abstractC8114a) {
        super(context, c6129a, acyVar, abstractC8114a);
    }

    @Override // com.google.android.gms.internal.AbstractC8104zj
    /* renamed from: b */
    protected void mo12798b() {
        if (this.f26457e.f14569e != -2) {
            return;
        }
        this.f26455c.mo18084l().m18174a(this);
        mo12793f();
        abr.a("Loading HTML in WebView.");
        this.f26455c.loadDataWithBaseURL(C3779u.m26890e().m18347a(this.f26457e.f14566b), this.f26457e.f14567c, "text/html", "UTF-8", null);
    }

    /* renamed from: f */
    protected void mo12793f() {
    }
}
