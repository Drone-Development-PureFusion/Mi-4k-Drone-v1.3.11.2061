package com.fimi.soul.drone.p205i;

import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.C2247e;
/* renamed from: com.fimi.soul.drone.i.be */
/* loaded from: classes.dex */
public class C2326be extends C2247e {

    /* renamed from: b */
    private double f7544b;

    /* renamed from: c */
    private double f7545c;

    /* renamed from: d */
    private double f7546d;

    /* renamed from: e */
    private double f7547e;

    /* renamed from: f */
    private double f7548f;

    /* renamed from: g */
    private byte f7549g;

    /* renamed from: h */
    private double f7550h;

    public C2326be(C2083a c2083a) {
        super(c2083a);
    }

    /* renamed from: a */
    public byte m32071a() {
        return this.f7549g;
    }

    /* renamed from: a */
    public void m32070a(double d, double d2, double d3, double d4, double d5, byte b, double d6) {
        this.f7544b = d;
        this.f7545c = d2;
        this.f7546d = d3;
        this.f7547e = d4;
        this.f7548f = d5;
        this.f7549g = b;
        this.f7550h = d6;
        this.f7081a.mo32909a(C2104d.EnumC2105a.GPS_FIX);
    }

    /* renamed from: b */
    public double m32069b() {
        return this.f7550h;
    }

    /* renamed from: c */
    public double m32068c() {
        return this.f7544b;
    }

    /* renamed from: d */
    public double m32067d() {
        return this.f7545c;
    }

    /* renamed from: e */
    public double m32066e() {
        return this.f7546d;
    }

    /* renamed from: f */
    public double m32065f() {
        return this.f7547e;
    }

    /* renamed from: g */
    public double m32064g() {
        return this.f7548f;
    }

    public String toString() {
        return "TelWaypoint [GPSLatitude=" + this.f7544b + ", GPSLongitude=" + this.f7545c + ", GPSAltitude=" + this.f7546d + ", GPSSpeed=" + this.f7547e + ", GPSBearing=" + this.f7548f + ", number=" + ((int) this.f7549g) + ", accuracy=" + this.f7550h + "]";
    }
}
