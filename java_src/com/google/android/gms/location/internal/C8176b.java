package com.google.android.gms.location.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.internal.AbstractC4638w;
import com.google.android.gms.common.internal.C4626s;
import com.google.android.gms.location.internal.AbstractC8204i;
/* renamed from: com.google.android.gms.location.internal.b */
/* loaded from: classes2.dex */
public class C8176b extends AbstractC4638w<AbstractC8204i> {

    /* renamed from: a */
    protected final AbstractC8222p<AbstractC8204i> f26769a = new AbstractC8222p<AbstractC8204i>() { // from class: com.google.android.gms.location.internal.b.1
        @Override // com.google.android.gms.location.internal.AbstractC8222p
        /* renamed from: a */
        public void mo12386a() {
            C8176b.this.F();
        }

        @Override // com.google.android.gms.location.internal.AbstractC8222p
        /* renamed from: b */
        public AbstractC8204i mo12385c() {
            return (AbstractC8204i) C8176b.this.G();
        }
    };

    /* renamed from: e */
    private final String f26770e;

    public C8176b(Context context, Looper looper, AbstractC4489g.AbstractC4491b abstractC4491b, AbstractC4489g.AbstractC4492c abstractC4492c, String str, C4626s c4626s) {
        super(context, looper, 23, c4626s, abstractC4491b, abstractC4492c);
        this.f26770e = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: a */
    public AbstractC8204i mo7440b(IBinder iBinder) {
        return AbstractC8204i.AbstractBinderC8205a.m12471a(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: a */
    protected String mo7443a() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: b */
    protected String mo7441b() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: c */
    public Bundle mo9367c() {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", this.f26770e);
        return bundle;
    }
}
