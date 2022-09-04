package com.google.android.gms.games.video;

import com.google.android.gms.common.data.AbstractC4521a;
import com.google.android.gms.common.data.DataHolder;
/* renamed from: com.google.android.gms.games.video.b */
/* loaded from: classes2.dex */
public final class C6033b extends AbstractC4521a<Video> {
    public C6033b(DataHolder dataHolder) {
        super(dataHolder);
    }

    @Override // com.google.android.gms.common.data.AbstractC4521a, com.google.android.gms.common.data.AbstractC4522b
    /* renamed from: b */
    public VideoRef mo9715a(int i) {
        return new VideoRef(this.f16904a, i);
    }
}
