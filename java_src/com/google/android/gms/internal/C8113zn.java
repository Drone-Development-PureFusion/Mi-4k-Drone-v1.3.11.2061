package com.google.android.gms.internal;

import android.content.Context;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.AbstractBinderC3476a;
import com.google.android.gms.ads.internal.BinderC3698q;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.common.util.C4696s;
import com.google.android.gms.internal.abi;
@aaa
/* renamed from: com.google.android.gms.internal.zn */
/* loaded from: classes.dex */
public class C8113zn {

    /* renamed from: com.google.android.gms.internal.zn$a */
    /* loaded from: classes2.dex */
    public interface AbstractC8114a {
        /* renamed from: b */
        void mo12799b(abi abiVar);
    }

    /* renamed from: a */
    public abx m12801a(Context context, AbstractBinderC3476a abstractBinderC3476a, abi.C6129a c6129a, C7667ro c7667ro, @Nullable acy acyVar, AbstractC8005xq abstractC8005xq, AbstractC8114a abstractC8114a, C7801un c7801un) {
        AdResponseParcel adResponseParcel = c6129a.f20921b;
        abx c8119zr = adResponseParcel.f14572h ? new C8119zr(context, c6129a, abstractC8005xq, abstractC8114a, c7801un, acyVar) : (adResponseParcel.f14584t || (abstractBinderC3476a instanceof BinderC3698q)) ? (!adResponseParcel.f14584t || !(abstractBinderC3476a instanceof BinderC3698q)) ? new C8116zp(c6129a, abstractC8114a) : new C8121zs(context, (BinderC3698q) abstractBinderC3476a, c6129a, c7667ro, abstractC8114a, c7801un) : adResponseParcel.f14580p ? new C8108zl(context, c6129a, acyVar, abstractC8114a) : (!C7788uf.f25770ab.m13486c().booleanValue() || !C4696s.m23106h() || C4696s.m23104j() || acyVar == null || !acyVar.mo18085k().f13867e) ? new C8115zo(context, c6129a, acyVar, abstractC8114a) : new C8118zq(context, c6129a, acyVar, abstractC8114a);
        String valueOf = String.valueOf(c8119zr.getClass().getName());
        abr.a(valueOf.length() != 0 ? "AdRenderer: ".concat(valueOf) : new String("AdRenderer: "));
        c8119zr.mo12820e();
        return c8119zr;
    }

    /* renamed from: a */
    public abx m12800a(Context context, abi.C6129a c6129a, aau aauVar) {
        abb abbVar = new abb(context, c6129a, aauVar);
        String valueOf = String.valueOf(abbVar.getClass().getName());
        abr.a(valueOf.length() != 0 ? "AdRenderer: ".concat(valueOf) : new String("AdRenderer: "));
        abbVar.mo12820e();
        return abbVar;
    }
}
