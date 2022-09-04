package com.google.android.gms.games.multiplayer;

import com.google.android.gms.common.data.AbstractC4534m;
import com.google.android.gms.common.data.DataHolder;
/* renamed from: com.google.android.gms.games.multiplayer.a */
/* loaded from: classes2.dex */
public final class C5938a extends AbstractC4534m<Invitation> {
    public C5938a(DataHolder dataHolder) {
        super(dataHolder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.data.AbstractC4534m
    /* renamed from: b */
    public Invitation mo7644a(int i, int i2) {
        return new InvitationRef(this.f16904a, i, i2);
    }

    @Override // com.google.android.gms.common.data.AbstractC4534m
    /* renamed from: h */
    protected String mo7642h() {
        return "external_invitation_id";
    }
}
