package com.google.android.gms.games.snapshot;

import com.google.android.gms.common.data.AbstractC4521a;
import com.google.android.gms.common.data.DataHolder;
/* renamed from: com.google.android.gms.games.snapshot.c */
/* loaded from: classes2.dex */
public final class C6008c extends AbstractC4521a<SnapshotMetadata> {
    public C6008c(DataHolder dataHolder) {
        super(dataHolder);
    }

    @Override // com.google.android.gms.common.data.AbstractC4521a, com.google.android.gms.common.data.AbstractC4522b
    /* renamed from: b */
    public SnapshotMetadata mo9715a(int i) {
        return new SnapshotMetadataRef(this.f16904a, i);
    }
}
