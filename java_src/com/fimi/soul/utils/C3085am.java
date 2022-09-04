package com.fimi.soul.utils;

import java.util.Locale;
/* renamed from: com.fimi.soul.utils.am */
/* loaded from: classes.dex */
public class C3085am {

    /* renamed from: a */
    private double f11535a;

    public C3085am(double d) {
        m29317a(d);
    }

    /* renamed from: a */
    public double m29318a() {
        return this.f11535a;
    }

    /* renamed from: a */
    public void m29317a(double d) {
        this.f11535a = d;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C3085am) && this.f11535a == ((C3085am) obj).f11535a;
    }

    public String toString() {
        return this.f11535a >= 1000.0d ? String.format(Locale.US, "%2.1f km", Double.valueOf(this.f11535a / 1000.0d)) : this.f11535a >= 1.0d ? String.format(Locale.US, "%2.1f m", Double.valueOf(this.f11535a)) : this.f11535a >= 0.001d ? String.format(Locale.US, "%2.1f mm", Double.valueOf(this.f11535a * 1000.0d)) : this.f11535a + " m";
    }
}
