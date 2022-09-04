package com.google.android.gms.internal;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.analytics.AbstractC3938n;
import com.google.android.gms.common.internal.C4588d;
import java.util.HashMap;
import java.util.UUID;
/* loaded from: classes2.dex */
public final class ady extends AbstractC3938n<ady> {

    /* renamed from: a */
    private String f21323a;

    /* renamed from: b */
    private int f21324b;

    /* renamed from: c */
    private int f21325c;

    /* renamed from: d */
    private String f21326d;

    /* renamed from: e */
    private String f21327e;

    /* renamed from: f */
    private boolean f21328f;

    /* renamed from: g */
    private boolean f21329g;

    public ady() {
        this(false);
    }

    public ady(boolean z) {
        this(z, m17944a());
    }

    public ady(boolean z, int i) {
        C4588d.m23630a(i);
        this.f21324b = i;
        this.f21329g = z;
    }

    /* renamed from: a */
    static int m17944a() {
        UUID randomUUID = UUID.randomUUID();
        int leastSignificantBits = (int) (randomUUID.getLeastSignificantBits() & 2147483647L);
        if (leastSignificantBits != 0) {
            return leastSignificantBits;
        }
        int mostSignificantBits = (int) (randomUUID.getMostSignificantBits() & 2147483647L);
        if (mostSignificantBits != 0) {
            return mostSignificantBits;
        }
        Log.e("GAv4", "UUID.randomUUID() returned 0.");
        return Integer.MAX_VALUE;
    }

    /* renamed from: e */
    private void m17932e() {
    }

    /* renamed from: a */
    public void m17943a(int i) {
        m17932e();
        this.f21324b = i;
    }

    @Override // com.google.android.gms.analytics.AbstractC3938n
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void mo17922a(ady adyVar) {
        if (!TextUtils.isEmpty(this.f21323a)) {
            adyVar.m17941a(this.f21323a);
        }
        if (this.f21324b != 0) {
            adyVar.m17943a(this.f21324b);
        }
        if (this.f21325c != 0) {
            adyVar.m17938b(this.f21325c);
        }
        if (!TextUtils.isEmpty(this.f21326d)) {
            adyVar.m17937b(this.f21326d);
        }
        if (!TextUtils.isEmpty(this.f21327e)) {
            adyVar.m17934c(this.f21327e);
        }
        if (this.f21328f) {
            adyVar.m17936b(this.f21328f);
        }
        if (this.f21329g) {
            adyVar.m17940a(this.f21329g);
        }
    }

    /* renamed from: a */
    public void m17941a(String str) {
        m17932e();
        this.f21323a = str;
    }

    /* renamed from: a */
    public void m17940a(boolean z) {
        m17932e();
        this.f21329g = z;
    }

    /* renamed from: b */
    public String m17939b() {
        return this.f21323a;
    }

    /* renamed from: b */
    public void m17938b(int i) {
        m17932e();
        this.f21325c = i;
    }

    /* renamed from: b */
    public void m17937b(String str) {
        m17932e();
        this.f21326d = str;
    }

    /* renamed from: b */
    public void m17936b(boolean z) {
        m17932e();
        this.f21328f = z;
    }

    /* renamed from: c */
    public int m17935c() {
        return this.f21324b;
    }

    /* renamed from: c */
    public void m17934c(String str) {
        m17932e();
        if (TextUtils.isEmpty(str)) {
            this.f21327e = null;
        } else {
            this.f21327e = str;
        }
    }

    /* renamed from: d */
    public String m17933d() {
        return this.f21327e;
    }

    public String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("screenName", this.f21323a);
        hashMap.put("interstitial", Boolean.valueOf(this.f21328f));
        hashMap.put("automatic", Boolean.valueOf(this.f21329g));
        hashMap.put("screenId", Integer.valueOf(this.f21324b));
        hashMap.put("referrerScreenId", Integer.valueOf(this.f21325c));
        hashMap.put("referrerScreenName", this.f21326d);
        hashMap.put("referrerUri", this.f21327e);
        return a((Object) hashMap);
    }
}
