package com.google.android.gms.internal;

import android.os.Bundle;
import com.fimi.kernel.C1576a;
import com.google.android.gms.ads.internal.formats.BinderC3597c;
import com.google.android.gms.ads.internal.formats.BinderC3599e;
import com.google.android.gms.ads.internal.formats.C3595a;
import com.google.android.gms.internal.CallableC8128zu;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
@aaa
/* renamed from: com.google.android.gms.internal.zx */
/* loaded from: classes.dex */
public class C8146zx implements CallableC8128zu.AbstractC8136a<BinderC3599e> {

    /* renamed from: a */
    private final boolean f26592a;

    /* renamed from: b */
    private final boolean f26593b;

    public C8146zx(boolean z, boolean z2) {
        this.f26592a = z;
        this.f26593b = z2;
    }

    @Override // com.google.android.gms.internal.CallableC8128zu.AbstractC8136a
    /* renamed from: b */
    public BinderC3599e mo12708a(CallableC8128zu callableC8128zu, JSONObject jSONObject) {
        List<aco<BinderC3597c>> m12744a = callableC8128zu.m12744a(jSONObject, C1576a.f3872b, true, this.f26592a, this.f26593b);
        aco<BinderC3597c> m12745a = callableC8128zu.m12745a(jSONObject, "secondary_image", false, this.f26592a);
        aco<C3595a> m12738b = callableC8128zu.m12738b(jSONObject);
        ArrayList arrayList = new ArrayList();
        for (aco<BinderC3597c> acoVar : m12744a) {
            arrayList.add(acoVar.get());
        }
        return new BinderC3599e(jSONObject.getString("headline"), arrayList, jSONObject.getString("body"), m12745a.get(), jSONObject.getString("call_to_action"), jSONObject.getString("advertiser"), m12738b.get(), new Bundle());
    }
}
