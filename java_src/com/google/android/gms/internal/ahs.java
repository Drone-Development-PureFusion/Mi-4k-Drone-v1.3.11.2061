package com.google.android.gms.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.internal.ail;
/* loaded from: classes2.dex */
public abstract class ahs<L> implements ail.AbstractC6386c<L> {

    /* renamed from: a */
    private final DataHolder f21786a;

    /* JADX INFO: Access modifiers changed from: protected */
    public ahs(DataHolder dataHolder) {
        this.f21786a = dataHolder;
    }

    @Override // com.google.android.gms.internal.ail.AbstractC6386c
    /* renamed from: a */
    public void mo7919a() {
        if (this.f21786a != null) {
            this.f21786a.close();
        }
    }

    @Override // com.google.android.gms.internal.ail.AbstractC6386c
    /* renamed from: a */
    public final void mo7917a(L l) {
        mo17424a(l, this.f21786a);
    }

    /* renamed from: a */
    protected abstract void mo17424a(L l, DataHolder dataHolder);
}
