package com.google.android.gms.games.event;

import com.google.android.gms.common.data.AbstractC4521a;
import com.google.android.gms.common.data.DataHolder;
/* renamed from: com.google.android.gms.games.event.a */
/* loaded from: classes2.dex */
public final class C5380a extends AbstractC4521a<Event> {
    public C5380a(DataHolder dataHolder) {
        super(dataHolder);
    }

    @Override // com.google.android.gms.common.data.AbstractC4521a, com.google.android.gms.common.data.AbstractC4522b
    /* renamed from: b */
    public Event mo9715a(int i) {
        return new EventRef(this.f16904a, i);
    }
}
