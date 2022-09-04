package com.google.android.gms.analytics.p229a;

import com.google.android.gms.analytics.AbstractC3938n;
import com.google.android.gms.analytics.C3933j;
import com.google.android.gms.common.internal.C4588d;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.google.android.gms.analytics.a.a */
/* loaded from: classes2.dex */
public class C3832a {

    /* renamed from: a */
    Map<String, String> f14896a = new HashMap();

    /* renamed from: a */
    public C3832a m26629a(double d) {
        m26624a("pr", Double.toString(d));
        return this;
    }

    /* renamed from: a */
    public C3832a m26628a(int i) {
        m26624a("ps", Integer.toString(i));
        return this;
    }

    /* renamed from: a */
    public C3832a m26627a(int i, int i2) {
        m26624a(C3933j.m26002m(i), Integer.toString(i2));
        return this;
    }

    /* renamed from: a */
    public C3832a m26626a(int i, String str) {
        m26624a(C3933j.m26003l(i), str);
        return this;
    }

    /* renamed from: a */
    public C3832a m26625a(String str) {
        m26624a("id", str);
        return this;
    }

    /* renamed from: a */
    void m26624a(String str, String str2) {
        C4588d.m23626a(str, (Object) "Name should be non-null");
        this.f14896a.put(str, str2);
    }

    /* renamed from: b */
    public C3832a m26623b(int i) {
        m26624a("qt", Integer.toString(i));
        return this;
    }

    /* renamed from: b */
    public C3832a m26622b(String str) {
        m26624a("nm", str);
        return this;
    }

    /* renamed from: c */
    public C3832a m26621c(String str) {
        m26624a("br", str);
        return this;
    }

    /* renamed from: d */
    public C3832a m26620d(String str) {
        m26624a("ca", str);
        return this;
    }

    /* renamed from: e */
    public C3832a m26619e(String str) {
        m26624a("va", str);
        return this;
    }

    /* renamed from: f */
    public C3832a m26618f(String str) {
        m26624a("cc", str);
        return this;
    }

    /* renamed from: g */
    public Map<String, String> m26617g(String str) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, String> entry : this.f14896a.entrySet()) {
            String valueOf = String.valueOf(str);
            String valueOf2 = String.valueOf(entry.getKey());
            hashMap.put(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), entry.getValue());
        }
        return hashMap;
    }

    public String toString() {
        return AbstractC3938n.m25981a((Map) this.f14896a);
    }
}
