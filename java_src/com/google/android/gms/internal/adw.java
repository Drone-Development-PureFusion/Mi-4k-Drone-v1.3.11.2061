package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.analytics.AbstractC3938n;
import java.util.HashMap;
/* loaded from: classes2.dex */
public final class adw extends AbstractC3938n<adw> {

    /* renamed from: a */
    public String f21313a;

    /* renamed from: b */
    public boolean f21314b;

    /* renamed from: a */
    public String m17966a() {
        return this.f21313a;
    }

    @Override // com.google.android.gms.analytics.AbstractC3938n
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void mo17922a(adw adwVar) {
        if (!TextUtils.isEmpty(this.f21313a)) {
            adwVar.m17964a(this.f21313a);
        }
        if (this.f21314b) {
            adwVar.m17963a(this.f21314b);
        }
    }

    /* renamed from: a */
    public void m17964a(String str) {
        this.f21313a = str;
    }

    /* renamed from: a */
    public void m17963a(boolean z) {
        this.f21314b = z;
    }

    /* renamed from: b */
    public boolean m17962b() {
        return this.f21314b;
    }

    public String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("description", this.f21313a);
        hashMap.put("fatal", Boolean.valueOf(this.f21314b));
        return a((Object) hashMap);
    }
}
