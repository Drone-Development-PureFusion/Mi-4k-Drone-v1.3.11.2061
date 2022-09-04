package com.google.android.gms.games;

import com.google.android.gms.common.data.AbstractC4521a;
import com.google.android.gms.common.data.DataHolder;
/* renamed from: com.google.android.gms.games.a */
/* loaded from: classes2.dex */
public final class C5311a extends AbstractC4521a<Game> {
    public C5311a(DataHolder dataHolder) {
        super(dataHolder);
    }

    @Override // com.google.android.gms.common.data.AbstractC4521a, com.google.android.gms.common.data.AbstractC4522b
    /* renamed from: b */
    public Game mo9715a(int i) {
        return new GameRef(this.f16904a, i);
    }
}
