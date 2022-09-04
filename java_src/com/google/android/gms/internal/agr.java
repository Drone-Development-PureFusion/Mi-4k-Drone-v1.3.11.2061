package com.google.android.gms.internal;

import com.google.android.gms.cast.internal.C4430f;
import com.google.android.gms.cast.p233a.AbstractC4224c;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.util.C4693p;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class agr implements AbstractC4224c {

    /* renamed from: a */
    private final String f21650a;

    /* renamed from: b */
    private final int f21651b;

    /* renamed from: c */
    private final JSONObject f21652c;

    /* renamed from: d */
    private final boolean f21653d;

    public agr(String str, int i, JSONObject jSONObject, boolean z) {
        this.f21650a = str;
        this.f21651b = i;
        this.f21652c = jSONObject;
        this.f21653d = z;
    }

    @Override // com.google.android.gms.cast.p233a.AbstractC4224c
    /* renamed from: a */
    public int mo17584a() {
        return this.f21651b;
    }

    @Override // com.google.android.gms.cast.p233a.AbstractC4224c
    /* renamed from: b */
    public JSONObject mo17583b() {
        return this.f21652c;
    }

    @Override // com.google.android.gms.cast.p233a.AbstractC4224c
    /* renamed from: c */
    public String mo17582c() {
        return this.f21650a;
    }

    @Override // com.google.android.gms.cast.p233a.AbstractC4224c
    /* renamed from: d */
    public boolean mo17581d() {
        switch (this.f21651b) {
            case 3:
            case 4:
            case 5:
            case 6:
                return true;
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.cast.p233a.AbstractC4224c
    /* renamed from: e */
    public boolean mo17580e() {
        return this.f21653d;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof AbstractC4224c)) {
            return false;
        }
        AbstractC4224c abstractC4224c = (AbstractC4224c) obj;
        return this.f21653d == abstractC4224c.mo17580e() && this.f21651b == abstractC4224c.mo17584a() && C4430f.m24206a(this.f21650a, abstractC4224c.mo17582c()) && C4693p.m23118a(this.f21652c, abstractC4224c.mo17583b());
    }

    public int hashCode() {
        return C4585c.m23633a(this.f21650a, Integer.valueOf(this.f21651b), this.f21652c, Boolean.valueOf(this.f21653d));
    }
}
