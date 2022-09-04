package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.analytics.AbstractC3938n;
import com.google.android.gms.plus.C8954e;
import com.tencent.tauth.AuthActivity;
import java.util.HashMap;
/* loaded from: classes2.dex */
public final class adv extends AbstractC3938n<adv> {

    /* renamed from: a */
    private String f21309a;

    /* renamed from: b */
    private String f21310b;

    /* renamed from: c */
    private String f21311c;

    /* renamed from: d */
    private long f21312d;

    /* renamed from: a */
    public String m17975a() {
        return this.f21309a;
    }

    /* renamed from: a */
    public void m17974a(long j) {
        this.f21312d = j;
    }

    @Override // com.google.android.gms.analytics.AbstractC3938n
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void mo17922a(adv advVar) {
        if (!TextUtils.isEmpty(this.f21309a)) {
            advVar.m17972a(this.f21309a);
        }
        if (!TextUtils.isEmpty(this.f21310b)) {
            advVar.m17970b(this.f21310b);
        }
        if (!TextUtils.isEmpty(this.f21311c)) {
            advVar.m17968c(this.f21311c);
        }
        if (this.f21312d != 0) {
            advVar.m17974a(this.f21312d);
        }
    }

    /* renamed from: a */
    public void m17972a(String str) {
        this.f21309a = str;
    }

    /* renamed from: b */
    public String m17971b() {
        return this.f21310b;
    }

    /* renamed from: b */
    public void m17970b(String str) {
        this.f21310b = str;
    }

    /* renamed from: c */
    public String m17969c() {
        return this.f21311c;
    }

    /* renamed from: c */
    public void m17968c(String str) {
        this.f21311c = str;
    }

    /* renamed from: d */
    public long m17967d() {
        return this.f21312d;
    }

    public String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("category", this.f21309a);
        hashMap.put(AuthActivity.ACTION_KEY, this.f21310b);
        hashMap.put(C8954e.f28488i, this.f21311c);
        hashMap.put("value", Long.valueOf(this.f21312d));
        return a((Object) hashMap);
    }
}
