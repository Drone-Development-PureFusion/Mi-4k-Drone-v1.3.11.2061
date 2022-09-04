package com.google.android.gms.games.internal.experience;

import com.google.android.gms.common.data.AbstractC4521a;
import com.google.android.gms.common.data.DataHolder;
/* renamed from: com.google.android.gms.games.internal.experience.a */
/* loaded from: classes2.dex */
public final class C5845a extends AbstractC4521a<ExperienceEvent> {
    public C5845a(DataHolder dataHolder) {
        super(dataHolder);
    }

    @Override // com.google.android.gms.common.data.AbstractC4521a, com.google.android.gms.common.data.AbstractC4522b
    /* renamed from: b */
    public ExperienceEvent mo9715a(int i) {
        return new ExperienceEventRef(this.f16904a, i);
    }
}
