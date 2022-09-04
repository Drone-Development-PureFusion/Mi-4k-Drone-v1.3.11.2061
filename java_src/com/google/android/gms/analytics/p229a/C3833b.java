package com.google.android.gms.analytics.p229a;

import com.google.android.gms.analytics.AbstractC3938n;
import com.google.android.gms.common.internal.C4588d;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.google.android.gms.analytics.a.b */
/* loaded from: classes.dex */
public class C3833b {

    /* renamed from: a */
    public static final String f14897a = "detail";

    /* renamed from: b */
    public static final String f14898b = "click";

    /* renamed from: c */
    public static final String f14899c = "add";

    /* renamed from: d */
    public static final String f14900d = "remove";

    /* renamed from: e */
    public static final String f14901e = "checkout";

    /* renamed from: f */
    public static final String f14902f = "checkout_option";
    @Deprecated

    /* renamed from: g */
    public static final String f14903g = "checkout_options";

    /* renamed from: h */
    public static final String f14904h = "purchase";

    /* renamed from: i */
    public static final String f14905i = "refund";

    /* renamed from: j */
    Map<String, String> f14906j = new HashMap();

    public C3833b(String str) {
        m26612a("&pa", str);
    }

    /* renamed from: a */
    public C3833b m26615a(double d) {
        m26612a("&tr", Double.toString(d));
        return this;
    }

    /* renamed from: a */
    public C3833b m26614a(int i) {
        m26612a("&cos", Integer.toString(i));
        return this;
    }

    /* renamed from: a */
    public C3833b m26613a(String str) {
        m26612a("&ti", str);
        return this;
    }

    /* renamed from: a */
    public Map<String, String> m26616a() {
        return new HashMap(this.f14906j);
    }

    /* renamed from: a */
    void m26612a(String str, String str2) {
        C4588d.m23626a(str, (Object) "Name should be non-null");
        this.f14906j.put(str, str2);
    }

    /* renamed from: b */
    public C3833b m26611b(double d) {
        m26612a("&tt", Double.toString(d));
        return this;
    }

    /* renamed from: b */
    public C3833b m26610b(String str) {
        m26612a("&ta", str);
        return this;
    }

    /* renamed from: c */
    public C3833b m26609c(double d) {
        m26612a("&ts", Double.toString(d));
        return this;
    }

    /* renamed from: c */
    public C3833b m26608c(String str) {
        m26612a("&tcc", str);
        return this;
    }

    /* renamed from: d */
    public C3833b m26607d(String str) {
        m26612a("&col", str);
        return this;
    }

    /* renamed from: e */
    public C3833b m26606e(String str) {
        m26612a("&pal", str);
        return this;
    }

    /* renamed from: f */
    public C3833b m26605f(String str) {
        m26612a("&pls", str);
        return this;
    }

    public String toString() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, String> entry : this.f14906j.entrySet()) {
            if (entry.getKey().startsWith("&")) {
                hashMap.put(entry.getKey().substring(1), entry.getValue());
            } else {
                hashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return AbstractC3938n.m25981a((Map) hashMap);
    }
}
