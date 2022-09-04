package com.google.android.gms.games;

import com.google.android.gms.common.data.AbstractC4521a;
import com.google.android.gms.common.data.DataHolder;
/* renamed from: com.google.android.gms.games.j */
/* loaded from: classes2.dex */
public final class C5932j extends AbstractC4521a<Player> {
    public C5932j(DataHolder dataHolder) {
        super(dataHolder);
    }

    @Override // com.google.android.gms.common.data.AbstractC4521a, com.google.android.gms.common.data.AbstractC4522b
    /* renamed from: b */
    public Player mo9715a(int i) {
        return new PlayerRef(this.f16904a, i);
    }
}
