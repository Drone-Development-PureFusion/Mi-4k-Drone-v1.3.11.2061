package com.google.android.gms.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AbstractC4502m;
import com.google.android.gms.common.api.C4467a;
import com.google.android.gms.internal.ahl;
import java.util.Collections;
/* loaded from: classes2.dex */
public class ahx implements ahz {

    /* renamed from: a */
    private final aia f21833a;

    public ahx(aia aiaVar) {
        this.f21833a = aiaVar;
    }

    @Override // com.google.android.gms.internal.ahz
    /* renamed from: a */
    public <A extends C4467a.AbstractC4474c, R extends AbstractC4502m, T extends ahl.AbstractC6343a<R, A>> T mo17335a(T t) {
        this.f21833a.f21876i.f21834c.add(t);
        return t;
    }

    @Override // com.google.android.gms.internal.ahz
    /* renamed from: a */
    public void mo17339a() {
        this.f21833a.m17324j();
        this.f21833a.f21876i.f21837f = Collections.emptySet();
    }

    @Override // com.google.android.gms.internal.ahz
    /* renamed from: a */
    public void mo17338a(int i) {
    }

    @Override // com.google.android.gms.internal.ahz
    /* renamed from: a */
    public void mo17337a(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ahz
    /* renamed from: a */
    public void mo17336a(ConnectionResult connectionResult, C4467a<?> c4467a, int i) {
    }

    @Override // com.google.android.gms.internal.ahz
    /* renamed from: b */
    public <A extends C4467a.AbstractC4474c, T extends ahl.AbstractC6343a<? extends AbstractC4502m, A>> T mo17333b(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // com.google.android.gms.internal.ahz
    /* renamed from: b */
    public boolean mo17334b() {
        return true;
    }

    @Override // com.google.android.gms.internal.ahz
    /* renamed from: c */
    public void mo17332c() {
        this.f21833a.m17326h();
    }
}
