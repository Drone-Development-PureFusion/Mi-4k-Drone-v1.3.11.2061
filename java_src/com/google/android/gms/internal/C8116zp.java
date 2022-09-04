package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.internal.C8113zn;
import com.google.android.gms.internal.abi;
@aaa
/* renamed from: com.google.android.gms.internal.zp */
/* loaded from: classes.dex */
public class C8116zp extends abq {

    /* renamed from: a */
    private final C8113zn.AbstractC8114a f26485a;

    /* renamed from: b */
    private final AdResponseParcel f26486b;

    /* renamed from: c */
    private final abi.C6129a f26487c;

    public C8116zp(abi.C6129a c6129a, C8113zn.AbstractC8114a abstractC8114a) {
        this.f26487c = c6129a;
        this.f26486b = this.f26487c.f20921b;
        this.f26485a = abstractC8114a;
    }

    /* renamed from: a */
    private abi m12797a(int i) {
        return new abi(this.f26487c.f20920a.f14487c, null, null, i, null, null, this.f26486b.f14576l, this.f26486b.f14575k, this.f26487c.f20920a.f14493i, false, null, null, null, null, null, this.f26486b.f14573i, this.f26487c.f20923d, this.f26486b.f14571g, this.f26487c.f20925f, this.f26486b.f14578n, this.f26486b.f14579o, this.f26487c.f20927h, null, null, null, null, this.f26487c.f20921b.f14555F, this.f26487c.f20921b.f14556G, null, null, null);
    }

    @Override // com.google.android.gms.internal.abq
    /* renamed from: a */
    public void mo12782a() {
        final abi m12797a = m12797a(0);
        abv.f21039a.post(new Runnable() { // from class: com.google.android.gms.internal.zp.1
            @Override // java.lang.Runnable
            public void run() {
                C8116zp.this.f26485a.mo12799b(m12797a);
            }
        });
    }

    @Override // com.google.android.gms.internal.abq
    /* renamed from: b */
    public void mo12779b() {
    }
}
