package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.apf;
import com.google.android.gms.internal.apy;
import com.google.android.gms.p232c.AbstractC4170e;
import com.google.android.gms.p232c.BinderC4173f;
import com.google.android.gms.tagmanager.AbstractC9048al;
@DynamiteApi
/* loaded from: classes2.dex */
public class TagManagerServiceProviderImpl extends AbstractC9048al.AbstractBinderC9049a {

    /* renamed from: a */
    private static volatile apy f28663a;

    @Override // com.google.android.gms.tagmanager.AbstractC9048al
    public apf getService(AbstractC4170e abstractC4170e, AbstractC9042aj abstractC9042aj, AbstractC9032af abstractC9032af) {
        apy apyVar = f28663a;
        if (apyVar == null) {
            synchronized (TagManagerServiceProviderImpl.class) {
                apyVar = f28663a;
                if (apyVar == null) {
                    apy apyVar2 = new apy((Context) BinderC4173f.m25294a(abstractC4170e), abstractC9042aj, abstractC9032af);
                    f28663a = apyVar2;
                    apyVar = apyVar2;
                }
            }
        }
        return apyVar;
    }
}
