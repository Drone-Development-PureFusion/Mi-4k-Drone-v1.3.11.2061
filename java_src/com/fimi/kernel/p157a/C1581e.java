package com.fimi.kernel.p157a;

import com.xiaomi.mipush.sdk.Constants;
/* renamed from: com.fimi.kernel.a.e */
/* loaded from: classes.dex */
public class C1581e {

    /* renamed from: a */
    public double f3897a;

    /* renamed from: b */
    public double f3898b;

    public C1581e() {
    }

    public C1581e(double d, double d2) {
        this.f3897a = d;
        this.f3898b = d2;
    }

    public boolean equals(Object obj) {
        C1581e c1581e = (C1581e) obj;
        return this.f3897a == c1581e.f3897a && this.f3898b == c1581e.f3898b;
    }

    public int hashCode() {
        return ((int) (this.f3897a * this.f3898b)) ^ 8;
    }

    public String toString() {
        return "(" + this.f3897a + Constants.ACCEPT_TIME_SEPARATOR_SP + this.f3898b + ")";
    }
}
