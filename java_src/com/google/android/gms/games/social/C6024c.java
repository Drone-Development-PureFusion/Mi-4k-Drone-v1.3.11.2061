package com.google.android.gms.games.social;

import com.google.android.gms.common.data.AbstractC4521a;
import com.google.android.gms.common.data.DataHolder;
/* renamed from: com.google.android.gms.games.social.c */
/* loaded from: classes2.dex */
public class C6024c extends AbstractC4521a<SocialInvite> {
    public C6024c(DataHolder dataHolder) {
        super(dataHolder);
    }

    @Override // com.google.android.gms.common.data.AbstractC4521a, com.google.android.gms.common.data.AbstractC4522b
    /* renamed from: b */
    public SocialInvite mo9715a(int i) {
        return new SocialInviteRef(this.f16904a, i);
    }
}
