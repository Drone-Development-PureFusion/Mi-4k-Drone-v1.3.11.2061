package com.google.android.gms.internal;

import com.google.android.gms.analytics.AbstractC3938n;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public final class adr extends AbstractC3938n<adr> {

    /* renamed from: a */
    private Map<Integer, Double> f21297a = new HashMap(4);

    /* renamed from: a */
    public Map<Integer, Double> m18000a() {
        return Collections.unmodifiableMap(this.f21297a);
    }

    @Override // com.google.android.gms.analytics.AbstractC3938n
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void mo17922a(adr adrVar) {
        adrVar.f21297a.putAll(this.f21297a);
    }

    public String toString() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<Integer, Double> entry : this.f21297a.entrySet()) {
            String valueOf = String.valueOf(entry.getKey());
            hashMap.put(new StringBuilder(String.valueOf(valueOf).length() + 6).append("metric").append(valueOf).toString(), entry.getValue());
        }
        return a((Object) hashMap);
    }
}
