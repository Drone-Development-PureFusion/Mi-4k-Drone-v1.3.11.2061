package com.google.android.gms.games.internal.player;

import com.google.android.gms.common.data.AbstractC4521a;
import com.google.android.gms.common.data.DataHolder;
/* renamed from: com.google.android.gms.games.internal.player.d */
/* loaded from: classes2.dex */
public class C5926d extends AbstractC4521a<StockProfileImage> {
    public C5926d(DataHolder dataHolder) {
        super(dataHolder);
    }

    @Override // com.google.android.gms.common.data.AbstractC4521a, com.google.android.gms.common.data.AbstractC4522b
    /* renamed from: b */
    public StockProfileImage mo9715a(int i) {
        return new StockProfileImageRef(this.f16904a, i);
    }
}
