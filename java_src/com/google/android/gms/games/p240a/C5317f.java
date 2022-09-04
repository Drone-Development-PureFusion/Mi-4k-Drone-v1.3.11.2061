package com.google.android.gms.games.p240a;

import com.google.android.gms.common.data.AbstractC4521a;
import com.google.android.gms.common.data.DataHolder;
/* renamed from: com.google.android.gms.games.a.f */
/* loaded from: classes2.dex */
public final class C5317f extends AbstractC4521a<AbstractC5316e> {

    /* renamed from: b */
    private final C5318g f19278b;

    public C5317f(DataHolder dataHolder) {
        super(dataHolder);
        this.f19278b = new C5318g(dataHolder.m23881f());
    }

    /* renamed from: a */
    public C5318g m20697a() {
        return this.f19278b;
    }

    @Override // com.google.android.gms.common.data.AbstractC4521a, com.google.android.gms.common.data.AbstractC4522b
    /* renamed from: b */
    public AbstractC5316e mo9715a(int i) {
        return new C5322i(this.f16904a, i);
    }
}
