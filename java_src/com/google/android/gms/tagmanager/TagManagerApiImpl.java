package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.aph;
import com.google.android.gms.internal.apl;
import com.google.android.gms.internal.apx;
import com.google.android.gms.p232c.AbstractC4170e;
import com.google.android.gms.p232c.BinderC4173f;
import com.google.android.gms.tagmanager.AbstractC9045ak;
@DynamiteApi
/* loaded from: classes.dex */
public class TagManagerApiImpl extends AbstractC9045ak.AbstractBinderC9046a {

    /* renamed from: a */
    private apx f28662a;

    @Override // com.google.android.gms.tagmanager.AbstractC9045ak
    public void initialize(AbstractC4170e abstractC4170e, AbstractC9042aj abstractC9042aj, AbstractC9032af abstractC9032af) {
        this.f28662a = apx.m16277a((Context) BinderC4173f.m25294a(abstractC4170e), abstractC9042aj, abstractC9032af);
        this.f28662a.m16278a();
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9045ak
    @Deprecated
    public void preview(Intent intent, AbstractC4170e abstractC4170e) {
        aph.m16394b("Deprecated. Please use previewIntent instead.");
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9045ak
    public void previewIntent(Intent intent, AbstractC4170e abstractC4170e, AbstractC4170e abstractC4170e2, AbstractC9042aj abstractC9042aj, AbstractC9032af abstractC9032af) {
        Context context = (Context) BinderC4173f.m25294a(abstractC4170e);
        this.f28662a = apx.m16277a(context, abstractC9042aj, abstractC9032af);
        new apl(intent, context, (Context) BinderC4173f.m25294a(abstractC4170e2), this.f28662a).m16357a();
    }
}
