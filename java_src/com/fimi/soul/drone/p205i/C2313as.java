package com.fimi.soul.drone.p205i;

import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.C2247e;
/* renamed from: com.fimi.soul.drone.i.as */
/* loaded from: classes.dex */
public class C2313as extends C2247e {

    /* renamed from: b */
    private double f7473b;

    /* renamed from: c */
    private double f7474c;

    /* renamed from: d */
    private double f7475d;

    /* renamed from: e */
    private double f7476e;

    /* renamed from: f */
    private double f7477f;

    public C2313as(C2083a c2083a) {
        super(c2083a);
    }

    /* renamed from: a */
    public double m32180a() {
        return this.f7473b;
    }

    /* renamed from: a */
    public void m32179a(double d, double d2, double d3, double d4, double d5) {
        this.f7473b = d;
        this.f7474c = d2;
        this.f7475d = d3;
        this.f7476e = d4;
        this.f7477f = d5;
        this.f7081a.mo32909a(C2104d.EnumC2105a.RC_IN);
    }

    /* renamed from: b */
    public double m32178b() {
        return this.f7474c;
    }

    /* renamed from: c */
    public double m32177c() {
        return this.f7475d;
    }

    /* renamed from: d */
    public double m32176d() {
        return this.f7476e;
    }

    /* renamed from: e */
    public double m32175e() {
        return this.f7477f;
    }

    public String toString() {
        return "RC [rc1=" + this.f7473b + ", rc2=" + this.f7474c + ", rc3=" + this.f7475d + ", rc4=" + this.f7476e + ", rc5=" + this.f7477f + "]";
    }
}
