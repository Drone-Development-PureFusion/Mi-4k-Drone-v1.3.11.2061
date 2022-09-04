package com.fimi.soul.drone.p205i;

import com.fimi.soul.biz.p187o.C2022a;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.C2247e;
import com.fimi.soul.utils.C3078af;
import com.fimi.soul.utils.C3084al;
/* renamed from: com.fimi.soul.drone.i.av */
/* loaded from: classes.dex */
public class C2316av extends C2247e {

    /* renamed from: b */
    public volatile int f7492b;

    /* renamed from: c */
    public double f7493c;

    /* renamed from: d */
    public double f7494d;

    /* renamed from: e */
    public double f7495e;

    /* renamed from: f */
    public double f7496f;

    /* renamed from: g */
    public double f7497g;

    /* renamed from: h */
    public double f7498h;

    /* renamed from: i */
    public double f7499i;

    /* renamed from: j */
    private byte f7500j;

    public C2316av(C2083a c2083a) {
        super(c2083a);
    }

    /* renamed from: a */
    public int m32158a() {
        return this.f7492b;
    }

    /* renamed from: a */
    public void m32157a(int i, float f, float f2, double d, double d2, double d3, double d4, double d5, byte b) {
        if (!C2022a.m33223a().m33221b()) {
            C3084al m29346a = C3078af.m29346a(f2, f);
            this.f7493c = m29346a.m29320b();
            this.f7494d = m29346a.m29322a();
        } else {
            this.f7493c = f;
            this.f7494d = f2;
        }
        this.f7492b = i;
        this.f7495e = d;
        this.f7496f = d2;
        this.f7497g = d3;
        this.f7498h = d4;
        this.f7499i = d5;
        this.f7500j = b;
        this.f7081a.mo32909a(C2104d.EnumC2105a.RECEIVERWAYPOINTS);
    }

    /* renamed from: b */
    public double m32156b() {
        return this.f7493c;
    }

    /* renamed from: c */
    public double m32155c() {
        return this.f7494d;
    }

    /* renamed from: d */
    public double m32154d() {
        return this.f7495e;
    }

    /* renamed from: e */
    public double m32153e() {
        return this.f7496f;
    }

    /* renamed from: f */
    public double m32152f() {
        return this.f7497g;
    }

    /* renamed from: g */
    public double m32151g() {
        return this.f7498h;
    }

    /* renamed from: h */
    public double m32150h() {
        return this.f7499i;
    }

    /* renamed from: i */
    public byte m32149i() {
        return this.f7500j;
    }

    public String toString() {
        return "Receivepoint [number=" + this.f7492b + ", Longitude=" + this.f7493c + ", Latitude=" + this.f7494d + ", Altitude=" + this.f7495e + ", yaw_angle=" + this.f7496f + ", hover_time=" + this.f7497g + ", report=" + this.f7498h + ", Number_to_be_transmited=" + this.f7499i + "]";
    }
}
