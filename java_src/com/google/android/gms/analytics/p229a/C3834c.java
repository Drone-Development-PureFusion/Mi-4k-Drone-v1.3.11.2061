package com.google.android.gms.analytics.p229a;

import com.google.android.gms.analytics.AbstractC3938n;
import com.google.android.gms.common.internal.C4588d;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.google.android.gms.analytics.a.c */
/* loaded from: classes2.dex */
public class C3834c {

    /* renamed from: a */
    public static final String f14907a = "click";

    /* renamed from: b */
    public static final String f14908b = "view";

    /* renamed from: c */
    Map<String, String> f14909c = new HashMap();

    /* renamed from: a */
    public C3834c m26604a(String str) {
        m26603a("id", str);
        return this;
    }

    /* renamed from: a */
    void m26603a(String str, String str2) {
        C4588d.m23626a(str, (Object) "Name should be non-null");
        this.f14909c.put(str, str2);
    }

    /* renamed from: b */
    public C3834c m26602b(String str) {
        m26603a("nm", str);
        return this;
    }

    /* renamed from: c */
    public C3834c m26601c(String str) {
        m26603a("cr", str);
        return this;
    }

    /* renamed from: d */
    public C3834c m26600d(String str) {
        m26603a("ps", str);
        return this;
    }

    /* renamed from: e */
    public Map<String, String> m26599e(String str) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, String> entry : this.f14909c.entrySet()) {
            String valueOf = String.valueOf(str);
            String valueOf2 = String.valueOf(entry.getKey());
            hashMap.put(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), entry.getValue());
        }
        return hashMap;
    }

    public String toString() {
        return AbstractC3938n.m25981a((Map) this.f14909c);
    }
}
