package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.analytics.AbstractC3938n;
import java.util.HashMap;
/* loaded from: classes2.dex */
public final class ado extends AbstractC3938n<ado> {

    /* renamed from: a */
    private String f21282a;

    /* renamed from: b */
    private String f21283b;

    /* renamed from: c */
    private String f21284c;

    /* renamed from: d */
    private String f21285d;

    /* renamed from: a */
    public String m18032a() {
        return this.f21282a;
    }

    @Override // com.google.android.gms.analytics.AbstractC3938n
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void mo17922a(ado adoVar) {
        if (!TextUtils.isEmpty(this.f21282a)) {
            adoVar.m18030a(this.f21282a);
        }
        if (!TextUtils.isEmpty(this.f21283b)) {
            adoVar.m18028b(this.f21283b);
        }
        if (!TextUtils.isEmpty(this.f21284c)) {
            adoVar.m18026c(this.f21284c);
        }
        if (!TextUtils.isEmpty(this.f21285d)) {
            adoVar.m18024d(this.f21285d);
        }
    }

    /* renamed from: a */
    public void m18030a(String str) {
        this.f21282a = str;
    }

    /* renamed from: b */
    public String m18029b() {
        return this.f21283b;
    }

    /* renamed from: b */
    public void m18028b(String str) {
        this.f21283b = str;
    }

    /* renamed from: c */
    public String m18027c() {
        return this.f21284c;
    }

    /* renamed from: c */
    public void m18026c(String str) {
        this.f21284c = str;
    }

    /* renamed from: d */
    public String m18025d() {
        return this.f21285d;
    }

    /* renamed from: d */
    public void m18024d(String str) {
        this.f21285d = str;
    }

    public String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("appName", this.f21282a);
        hashMap.put("appVersion", this.f21283b);
        hashMap.put("appId", this.f21284c);
        hashMap.put("appInstallerId", this.f21285d);
        return a((Object) hashMap);
    }
}
