package com.google.android.gms.internal;

import com.google.android.gms.analytics.AbstractC3938n;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public final class adq extends AbstractC3938n<adq> {

    /* renamed from: a */
    private Map<Integer, String> f21296a = new HashMap(4);

    /* renamed from: a */
    public Map<Integer, String> m18002a() {
        return Collections.unmodifiableMap(this.f21296a);
    }

    @Override // com.google.android.gms.analytics.AbstractC3938n
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void mo17922a(adq adqVar) {
        adqVar.f21296a.putAll(this.f21296a);
    }

    public String toString() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<Integer, String> entry : this.f21296a.entrySet()) {
            String valueOf = String.valueOf(entry.getKey());
            hashMap.put(new StringBuilder(String.valueOf(valueOf).length() + 9).append("dimension").append(valueOf).toString(), entry.getValue());
        }
        return a((Object) hashMap);
    }
}
