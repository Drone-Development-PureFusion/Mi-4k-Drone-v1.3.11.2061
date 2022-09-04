package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.AbstractC4638w;
import com.google.android.gms.common.internal.C4626s;
import com.google.android.gms.fitness.C5182j;
import java.util.Set;
/* loaded from: classes2.dex */
public abstract class akn<T extends IInterface> extends AbstractC4638w<T> {
    /* JADX INFO: Access modifiers changed from: protected */
    public akn(Context context, Looper looper, int i, AbstractC4489g.AbstractC4491b abstractC4491b, AbstractC4489g.AbstractC4492c abstractC4492c, C4626s c4626s) {
        super(context, looper, i, c4626s, abstractC4491b, abstractC4492c);
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: H */
    public boolean mo15921H() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: a */
    public abstract String mo7443a();

    @Override // com.google.android.gms.common.internal.AbstractC4638w
    /* renamed from: a */
    protected Set<Scope> mo17015a(Set<Scope> set) {
        return C5182j.m21395a(set);
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: b */
    public abstract T mo7440b(IBinder iBinder);

    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: b */
    public abstract String mo7441b();

    @Override // com.google.android.gms.common.internal.AbstractC4600p, com.google.android.gms.common.api.C4467a.AbstractC4477f
    /* renamed from: v */
    public boolean mo9364v() {
        return !akk.m17027a(B());
    }
}
