package com.google.android.gms.games.stats;

import com.google.android.gms.common.data.AbstractC4521a;
import com.google.android.gms.common.data.DataHolder;
/* renamed from: com.google.android.gms.games.stats.a */
/* loaded from: classes2.dex */
public final class C6026a extends AbstractC4521a<PlayerStats> {
    public C6026a(DataHolder dataHolder) {
        super(dataHolder);
    }

    @Override // com.google.android.gms.common.data.AbstractC4521a, com.google.android.gms.common.data.AbstractC4522b
    /* renamed from: b */
    public PlayerStats mo9715a(int i) {
        return new PlayerStatsRef(this.f16904a, i);
    }
}
