package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.analytics.AbstractC3938n;
import com.google.android.gms.plus.C8954e;
import java.util.HashMap;
/* loaded from: classes2.dex */
public final class aea extends AbstractC3938n<aea> {

    /* renamed from: a */
    public String f21333a;

    /* renamed from: b */
    public long f21334b;

    /* renamed from: c */
    public String f21335c;

    /* renamed from: d */
    public String f21336d;

    /* renamed from: a */
    public String m17924a() {
        return this.f21333a;
    }

    /* renamed from: a */
    public void m17923a(long j) {
        this.f21334b = j;
    }

    @Override // com.google.android.gms.analytics.AbstractC3938n
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void mo17922a(aea aeaVar) {
        if (!TextUtils.isEmpty(this.f21333a)) {
            aeaVar.m17920a(this.f21333a);
        }
        if (this.f21334b != 0) {
            aeaVar.m17923a(this.f21334b);
        }
        if (!TextUtils.isEmpty(this.f21335c)) {
            aeaVar.m17918b(this.f21335c);
        }
        if (!TextUtils.isEmpty(this.f21336d)) {
            aeaVar.m17916c(this.f21336d);
        }
    }

    /* renamed from: a */
    public void m17920a(String str) {
        this.f21333a = str;
    }

    /* renamed from: b */
    public long m17919b() {
        return this.f21334b;
    }

    /* renamed from: b */
    public void m17918b(String str) {
        this.f21335c = str;
    }

    /* renamed from: c */
    public String m17917c() {
        return this.f21335c;
    }

    /* renamed from: c */
    public void m17916c(String str) {
        this.f21336d = str;
    }

    /* renamed from: d */
    public String m17915d() {
        return this.f21336d;
    }

    public String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("variableName", this.f21333a);
        hashMap.put("timeInMillis", Long.valueOf(this.f21334b));
        hashMap.put("category", this.f21335c);
        hashMap.put(C8954e.f28488i, this.f21336d);
        return a((Object) hashMap);
    }
}
