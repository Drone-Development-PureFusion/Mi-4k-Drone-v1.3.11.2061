package com.google.android.gms.games.multiplayer.turnbased;

import com.google.android.gms.common.data.AbstractC4534m;
import com.google.android.gms.common.data.DataHolder;
/* renamed from: com.google.android.gms.games.multiplayer.turnbased.c */
/* loaded from: classes2.dex */
public final class C5965c extends AbstractC4534m<TurnBasedMatch> {
    public C5965c(DataHolder dataHolder) {
        super(dataHolder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.data.AbstractC4534m
    /* renamed from: b */
    public TurnBasedMatch mo7644a(int i, int i2) {
        return new TurnBasedMatchRef(this.f16904a, i, i2);
    }

    @Override // com.google.android.gms.common.data.AbstractC4534m
    /* renamed from: h */
    protected String mo7642h() {
        return "external_match_id";
    }
}
