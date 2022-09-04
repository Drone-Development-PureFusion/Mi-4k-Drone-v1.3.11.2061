package com.google.android.gms.games.request;

import com.google.android.gms.common.data.AbstractC4534m;
import com.google.android.gms.common.data.DataHolder;
/* renamed from: com.google.android.gms.games.request.a */
/* loaded from: classes2.dex */
public final class C5995a extends AbstractC4534m<GameRequest> {
    public C5995a(DataHolder dataHolder) {
        super(dataHolder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.data.AbstractC4534m
    /* renamed from: b */
    public GameRequest mo7644a(int i, int i2) {
        return new GameRequestRef(this.f16904a, i, i2);
    }

    @Override // com.google.android.gms.common.data.AbstractC4534m
    /* renamed from: h */
    protected String mo7642h() {
        return "external_request_id";
    }
}
