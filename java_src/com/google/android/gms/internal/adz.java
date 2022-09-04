package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.analytics.AbstractC3938n;
import com.tencent.tauth.AuthActivity;
import java.util.HashMap;
/* loaded from: classes2.dex */
public final class adz extends AbstractC3938n<adz> {

    /* renamed from: a */
    public String f21330a;

    /* renamed from: b */
    public String f21331b;

    /* renamed from: c */
    public String f21332c;

    /* renamed from: a */
    public String m17931a() {
        return this.f21330a;
    }

    @Override // com.google.android.gms.analytics.AbstractC3938n
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void mo17922a(adz adzVar) {
        if (!TextUtils.isEmpty(this.f21330a)) {
            adzVar.m17929a(this.f21330a);
        }
        if (!TextUtils.isEmpty(this.f21331b)) {
            adzVar.m17927b(this.f21331b);
        }
        if (!TextUtils.isEmpty(this.f21332c)) {
            adzVar.m17925c(this.f21332c);
        }
    }

    /* renamed from: a */
    public void m17929a(String str) {
        this.f21330a = str;
    }

    /* renamed from: b */
    public String m17928b() {
        return this.f21331b;
    }

    /* renamed from: b */
    public void m17927b(String str) {
        this.f21331b = str;
    }

    /* renamed from: c */
    public String m17926c() {
        return this.f21332c;
    }

    /* renamed from: c */
    public void m17925c(String str) {
        this.f21332c = str;
    }

    public String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("network", this.f21330a);
        hashMap.put(AuthActivity.ACTION_KEY, this.f21331b);
        hashMap.put("target", this.f21332c);
        return a((Object) hashMap);
    }
}
