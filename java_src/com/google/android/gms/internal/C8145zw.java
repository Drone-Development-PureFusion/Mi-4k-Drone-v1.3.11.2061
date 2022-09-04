package com.google.android.gms.internal;

import android.os.Bundle;
import com.fimi.kernel.C1576a;
import com.google.android.gms.ads.internal.formats.BinderC3597c;
import com.google.android.gms.ads.internal.formats.BinderC3598d;
import com.google.android.gms.ads.internal.formats.C3595a;
import com.google.android.gms.internal.CallableC8128zu;
import com.google.firebase.p251a.C9654a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONObject;
@aaa
/* renamed from: com.google.android.gms.internal.zw */
/* loaded from: classes.dex */
public class C8145zw implements CallableC8128zu.AbstractC8136a<BinderC3598d> {

    /* renamed from: a */
    private final boolean f26590a;

    /* renamed from: b */
    private final boolean f26591b;

    public C8145zw(boolean z, boolean z2) {
        this.f26590a = z;
        this.f26591b = z2;
    }

    /* renamed from: a */
    private acy m12712a(aco<acy> acoVar) {
        try {
            return acoVar.get(C7788uf.f25810bO.m13486c().intValue(), TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            abr.d("InterruptedException occurred while waiting for video to load", e);
            Thread.currentThread().interrupt();
            return null;
        } catch (CancellationException e2) {
            e = e2;
            abr.d("Exception occurred while waiting for video to load", e);
            return null;
        } catch (ExecutionException e3) {
            e = e3;
            abr.d("Exception occurred while waiting for video to load", e);
            return null;
        } catch (TimeoutException e4) {
            e = e4;
            abr.d("Exception occurred while waiting for video to load", e);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.CallableC8128zu.AbstractC8136a
    /* renamed from: b */
    public BinderC3598d mo12708a(CallableC8128zu callableC8128zu, JSONObject jSONObject) {
        List<aco<BinderC3597c>> m12744a = callableC8128zu.m12744a(jSONObject, C1576a.f3872b, true, this.f26590a, this.f26591b);
        aco<BinderC3597c> m12745a = callableC8128zu.m12745a(jSONObject, "app_icon", true, this.f26590a);
        aco<acy> m12747a = callableC8128zu.m12747a(jSONObject, "video");
        aco<C3595a> m12738b = callableC8128zu.m12738b(jSONObject);
        ArrayList arrayList = new ArrayList();
        for (aco<BinderC3597c> acoVar : m12744a) {
            arrayList.add(acoVar.get());
        }
        acy m12712a = m12712a(m12747a);
        return new BinderC3598d(jSONObject.getString("headline"), arrayList, jSONObject.getString("body"), m12745a.get(), jSONObject.getString("call_to_action"), jSONObject.optDouble("rating", -1.0d), jSONObject.optString("store"), jSONObject.optString(C9654a.C9656b.f30239x), m12738b.get(), new Bundle(), m12712a != null ? m12712a.mo18070z() : null, m12712a != null ? m12712a.mo18105b() : null);
    }
}
