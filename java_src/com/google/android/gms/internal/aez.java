package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.auth.api.proxy.AbstractC4036b;
import com.google.android.gms.auth.api.proxy.ProxyRequest;
import com.google.android.gms.auth.api.proxy.ProxyResponse;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.internal.C4588d;
/* loaded from: classes2.dex */
public class aez implements AbstractC4036b {
    @Override // com.google.android.gms.auth.api.proxy.AbstractC4036b
    /* renamed from: a */
    public AbstractC4494i<AbstractC4036b.AbstractC4037a> mo17823a(AbstractC4489g abstractC4489g, final ProxyRequest proxyRequest) {
        C4588d.m23627a(abstractC4489g);
        C4588d.m23627a(proxyRequest);
        return abstractC4489g.mo17253b((AbstractC4489g) new aey(abstractC4489g) { // from class: com.google.android.gms.internal.aez.1
            @Override // com.google.android.gms.internal.aey
            /* renamed from: a */
            protected void mo17822a(Context context, aex aexVar) {
                aexVar.mo17826a(new aeu() { // from class: com.google.android.gms.internal.aez.1.1
                    @Override // com.google.android.gms.internal.aeu, com.google.android.gms.internal.aew
                    /* renamed from: a */
                    public void mo17821a(ProxyResponse proxyResponse) {
                        b((C62561) new afa(proxyResponse));
                    }
                }, proxyRequest);
            }
        });
    }
}
