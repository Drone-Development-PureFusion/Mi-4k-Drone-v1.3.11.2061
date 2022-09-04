package com.google.android.gms.games.achievement;

import com.google.android.gms.common.data.AbstractC4521a;
import com.google.android.gms.common.data.DataHolder;
/* renamed from: com.google.android.gms.games.achievement.a */
/* loaded from: classes2.dex */
public final class C5333a extends AbstractC4521a<Achievement> {
    public C5333a(DataHolder dataHolder) {
        super(dataHolder);
    }

    @Override // com.google.android.gms.common.data.AbstractC4521a, com.google.android.gms.common.data.AbstractC4522b
    /* renamed from: b */
    public Achievement mo9715a(int i) {
        return new AchievementRef(this.f16904a, i);
    }
}
