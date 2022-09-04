package com.google.android.gms.internal;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.C4467a;
import com.google.android.gms.common.internal.C4588d;
/* loaded from: classes2.dex */
public class aho implements AbstractC4489g.AbstractC4491b, AbstractC4489g.AbstractC4492c {

    /* renamed from: a */
    public final C4467a<?> f21766a;

    /* renamed from: d */
    private final int f21767d;

    /* renamed from: e */
    private ahp f21768e;

    public aho(C4467a<?> c4467a, int i) {
        this.f21766a = c4467a;
        this.f21767d = i;
    }

    /* renamed from: a */
    private void m17450a() {
        C4588d.m23626a(this.f21768e, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
    }

    @Override // com.google.android.gms.common.api.AbstractC4489g.AbstractC4491b
    /* renamed from: a */
    public void mo17285a(int i) {
        m17450a();
        this.f21768e.a(i);
    }

    @Override // com.google.android.gms.common.api.AbstractC4489g.AbstractC4491b
    /* renamed from: a */
    public void mo17281a(@Nullable Bundle bundle) {
        m17450a();
        this.f21768e.a(bundle);
    }

    @Override // com.google.android.gms.common.api.AbstractC4489g.AbstractC4492c
    /* renamed from: a */
    public void mo17280a(@NonNull ConnectionResult connectionResult) {
        m17450a();
        this.f21768e.mo17279a(connectionResult, this.f21766a, this.f21767d);
    }

    /* renamed from: a */
    public void m17449a(ahp ahpVar) {
        this.f21768e = ahpVar;
    }
}
