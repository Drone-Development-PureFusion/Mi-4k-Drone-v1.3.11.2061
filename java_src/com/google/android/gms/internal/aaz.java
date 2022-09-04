package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.reward.mediation.client.AbstractC3763a;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.p232c.AbstractC4170e;
import com.google.android.gms.p232c.BinderC4173f;
@aaa
/* loaded from: classes.dex */
public class aaz extends AbstractC3763a.AbstractBinderC3764a {

    /* renamed from: a */
    private volatile aax f20845a;

    /* renamed from: b */
    private volatile aba f20846b;

    /* renamed from: c */
    private volatile aay f20847c;

    public aaz(aay aayVar) {
        this.f20847c = aayVar;
    }

    @Override // com.google.android.gms.ads.internal.reward.mediation.client.AbstractC3763a
    /* renamed from: a */
    public void mo18544a(AbstractC4170e abstractC4170e) {
        if (this.f20845a != null) {
            this.f20845a.mo18551g();
        }
    }

    @Override // com.google.android.gms.ads.internal.reward.mediation.client.AbstractC3763a
    /* renamed from: a */
    public void mo18543a(AbstractC4170e abstractC4170e, int i) {
        if (this.f20845a != null) {
            this.f20845a.mo18552a(i);
        }
    }

    @Override // com.google.android.gms.ads.internal.reward.mediation.client.AbstractC3763a
    /* renamed from: a */
    public void mo18542a(AbstractC4170e abstractC4170e, RewardItemParcel rewardItemParcel) {
        if (this.f20847c != null) {
            this.f20847c.mo18545b(rewardItemParcel);
        }
    }

    /* renamed from: a */
    public void m18541a(aax aaxVar) {
        this.f20845a = aaxVar;
    }

    /* renamed from: a */
    public void m18540a(aba abaVar) {
        this.f20846b = abaVar;
    }

    @Override // com.google.android.gms.ads.internal.reward.mediation.client.AbstractC3763a
    /* renamed from: b */
    public void mo18539b(AbstractC4170e abstractC4170e) {
        if (this.f20846b != null) {
            this.f20846b.mo18528a(BinderC4173f.m25294a(abstractC4170e).getClass().getName());
        }
    }

    @Override // com.google.android.gms.ads.internal.reward.mediation.client.AbstractC3763a
    /* renamed from: b */
    public void mo18538b(AbstractC4170e abstractC4170e, int i) {
        if (this.f20846b != null) {
            this.f20846b.mo18527a(BinderC4173f.m25294a(abstractC4170e).getClass().getName(), i);
        }
    }

    @Override // com.google.android.gms.ads.internal.reward.mediation.client.AbstractC3763a
    /* renamed from: c */
    public void mo18537c(AbstractC4170e abstractC4170e) {
        if (this.f20847c != null) {
            this.f20847c.mo18550G();
        }
    }

    @Override // com.google.android.gms.ads.internal.reward.mediation.client.AbstractC3763a
    /* renamed from: d */
    public void mo18536d(AbstractC4170e abstractC4170e) {
        if (this.f20847c != null) {
            this.f20847c.mo18549H();
        }
    }

    @Override // com.google.android.gms.ads.internal.reward.mediation.client.AbstractC3763a
    /* renamed from: e */
    public void mo18535e(AbstractC4170e abstractC4170e) {
        if (this.f20847c != null) {
            this.f20847c.mo18548I();
        }
    }

    @Override // com.google.android.gms.ads.internal.reward.mediation.client.AbstractC3763a
    /* renamed from: f */
    public void mo18534f(AbstractC4170e abstractC4170e) {
        if (this.f20847c != null) {
            this.f20847c.mo18547J();
        }
    }

    @Override // com.google.android.gms.ads.internal.reward.mediation.client.AbstractC3763a
    /* renamed from: g */
    public void mo18533g(AbstractC4170e abstractC4170e) {
        if (this.f20847c != null) {
            this.f20847c.mo18546K();
        }
    }
}
