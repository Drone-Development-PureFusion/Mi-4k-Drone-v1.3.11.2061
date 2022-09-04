package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.reward.client.AbstractC3746a;
import com.google.android.gms.common.internal.C4585c;
@aaa
/* loaded from: classes.dex */
public class aas extends AbstractC3746a.AbstractBinderC3747a {

    /* renamed from: a */
    private final String f20806a;

    /* renamed from: b */
    private final int f20807b;

    public aas(String str, int i) {
        this.f20806a = str;
        this.f20807b = i;
    }

    @Override // com.google.android.gms.ads.internal.reward.client.AbstractC3746a
    /* renamed from: a */
    public String mo18594a() {
        return this.f20806a;
    }

    @Override // com.google.android.gms.ads.internal.reward.client.AbstractC3746a
    /* renamed from: b */
    public int mo18593b() {
        return this.f20807b;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof aas)) {
            return false;
        }
        aas aasVar = (aas) obj;
        return C4585c.m23634a(mo18594a(), aasVar.mo18594a()) && C4585c.m23634a(Integer.valueOf(mo18593b()), Integer.valueOf(aasVar.mo18593b()));
    }
}
