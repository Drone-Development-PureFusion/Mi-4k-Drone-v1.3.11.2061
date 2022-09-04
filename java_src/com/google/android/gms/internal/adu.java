package com.google.android.gms.internal;

import com.google.android.gms.analytics.AbstractC3938n;
import com.google.android.gms.analytics.p229a.C3832a;
import com.google.android.gms.analytics.p229a.C3833b;
import com.google.android.gms.analytics.p229a.C3834c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public final class adu extends AbstractC3938n<adu> {

    /* renamed from: a */
    private final List<C3832a> f21305a = new ArrayList();

    /* renamed from: b */
    private final List<C3834c> f21306b = new ArrayList();

    /* renamed from: c */
    private final Map<String, List<C3832a>> f21307c = new HashMap();

    /* renamed from: d */
    private C3833b f21308d;

    /* renamed from: a */
    public C3833b m17981a() {
        return this.f21308d;
    }

    /* renamed from: a */
    public void m17980a(C3832a c3832a, String str) {
        if (c3832a == null) {
            return;
        }
        if (str == null) {
            str = "";
        }
        if (!this.f21307c.containsKey(str)) {
            this.f21307c.put(str, new ArrayList());
        }
        this.f21307c.get(str).add(c3832a);
    }

    @Override // com.google.android.gms.analytics.AbstractC3938n
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void mo17922a(adu aduVar) {
        aduVar.f21305a.addAll(this.f21305a);
        aduVar.f21306b.addAll(this.f21306b);
        for (Map.Entry<String, List<C3832a>> entry : this.f21307c.entrySet()) {
            String key = entry.getKey();
            for (C3832a c3832a : entry.getValue()) {
                aduVar.m17980a(c3832a, key);
            }
        }
        if (this.f21308d != null) {
            aduVar.f21308d = this.f21308d;
        }
    }

    /* renamed from: b */
    public List<C3832a> m17978b() {
        return Collections.unmodifiableList(this.f21305a);
    }

    /* renamed from: c */
    public Map<String, List<C3832a>> m17977c() {
        return this.f21307c;
    }

    /* renamed from: d */
    public List<C3834c> m17976d() {
        return Collections.unmodifiableList(this.f21306b);
    }

    public String toString() {
        HashMap hashMap = new HashMap();
        if (!this.f21305a.isEmpty()) {
            hashMap.put("products", this.f21305a);
        }
        if (!this.f21306b.isEmpty()) {
            hashMap.put("promotions", this.f21306b);
        }
        if (!this.f21307c.isEmpty()) {
            hashMap.put("impressions", this.f21307c);
        }
        hashMap.put("productAction", this.f21308d);
        return a((Object) hashMap);
    }
}
