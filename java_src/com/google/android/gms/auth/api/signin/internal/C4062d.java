package com.google.android.gms.auth.api.signin.internal;
/* renamed from: com.google.android.gms.auth.api.signin.internal.d */
/* loaded from: classes2.dex */
public class C4062d {

    /* renamed from: a */
    static int f15570a = 31;

    /* renamed from: b */
    private int f15571b = 1;

    /* renamed from: a */
    public int m25600a() {
        return this.f15571b;
    }

    /* renamed from: a */
    public C4062d m25599a(Object obj) {
        this.f15571b = (obj == null ? 0 : obj.hashCode()) + (this.f15571b * f15570a);
        return this;
    }

    /* renamed from: a */
    public C4062d m25598a(boolean z) {
        this.f15571b = (z ? 1 : 0) + (this.f15571b * f15570a);
        return this;
    }
}
