package com.google.android.gms.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AbstractC4510u;
import java.util.Iterator;
/* loaded from: classes2.dex */
public class ahr extends ahm {
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.android.gms.internal.aic, com.google.android.gms.common.util.a] */
    @Override // com.google.android.gms.internal.ahm, com.google.android.gms.internal.aij
    /* renamed from: a */
    public void mo14499a() {
        ?? r2 = 0;
        super.mo14499a();
        Iterator it2 = r2.iterator();
        while (it2.hasNext()) {
            ((AbstractC4510u) it2.next()).m23942a();
        }
        r2.clear();
        r2.m17307a(this);
    }

    @Override // com.google.android.gms.internal.ahm
    /* renamed from: a */
    protected void mo17206a(ConnectionResult connectionResult, int i) {
        aic aicVar = null;
        aicVar.m17302b(connectionResult, i);
    }

    @Override // com.google.android.gms.internal.ahm
    /* renamed from: c */
    protected void mo17205c() {
        aic aicVar = null;
        aicVar.m17304b();
    }
}
