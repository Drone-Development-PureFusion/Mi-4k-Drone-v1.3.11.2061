package com.google.android.gms.internal;

import android.content.Context;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.internal.C8113zn;
import com.google.android.gms.internal.abi;
@aaa
/* renamed from: com.google.android.gms.internal.zl */
/* loaded from: classes.dex */
public class C8108zl extends AbstractC8104zj {

    /* renamed from: g */
    private RunnableC8106zk f26474g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8108zl(Context context, abi.C6129a c6129a, acy acyVar, C8113zn.AbstractC8114a abstractC8114a) {
        super(context, c6129a, acyVar, abstractC8114a);
    }

    @Override // com.google.android.gms.internal.AbstractC8104zj
    /* renamed from: b */
    protected void mo12798b() {
        int i;
        int i2;
        AdSizeParcel mo18085k = this.f26455c.mo18085k();
        if (mo18085k.f13867e) {
            DisplayMetrics displayMetrics = this.f26454b.getResources().getDisplayMetrics();
            i = displayMetrics.widthPixels;
            i2 = displayMetrics.heightPixels;
        } else {
            i = mo18085k.f13869g;
            i2 = mo18085k.f13866d;
        }
        this.f26474g = new RunnableC8106zk(this, this.f26455c, i, i2);
        this.f26455c.mo18084l().m18174a(this);
        this.f26474g.m12818a(this.f26457e);
    }

    @Override // com.google.android.gms.internal.AbstractC8104zj
    /* renamed from: c */
    protected int mo12804c() {
        if (!this.f26474g.m12813c()) {
            return !this.f26474g.m12811d() ? 2 : -2;
        }
        abr.a("Ad-Network indicated no fill with passback URL.");
        return 3;
    }
}
