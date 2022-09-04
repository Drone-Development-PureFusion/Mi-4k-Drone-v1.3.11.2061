package com.fimi.soul.drone.p205i;

import com.fimi.soul.biz.p187o.C2022a;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.C2247e;
import com.fimi.soul.utils.C3078af;
import com.fimi.soul.utils.C3084al;
/* renamed from: com.fimi.soul.drone.i.aw */
/* loaded from: classes.dex */
public class C2317aw extends C2247e {

    /* renamed from: b */
    public int f7501b;

    /* renamed from: c */
    public double f7502c;

    /* renamed from: d */
    public double f7503d;

    /* renamed from: e */
    public double f7504e;

    /* renamed from: f */
    public double f7505f;

    /* renamed from: g */
    public double f7506g;

    /* renamed from: h */
    public double f7507h;

    /* renamed from: i */
    public int f7508i = 0;

    public C2317aw(C2083a c2083a) {
        super(c2083a);
    }

    /* renamed from: a */
    public int m32148a() {
        return this.f7501b;
    }

    /* renamed from: a */
    public void m32147a(int i, float f, float f2, double d, double d2, double d3, double d4, int i2) {
        if (!C2022a.m33223a().m33221b()) {
            C3084al m29346a = C3078af.m29346a(f2, f);
            this.f7502c = m29346a.m29320b();
            this.f7503d = m29346a.m29322a();
        } else {
            this.f7502c = f;
            this.f7503d = f2;
        }
        this.f7501b = i;
        this.f7504e = d;
        this.f7505f = d2;
        this.f7506g = d3;
        this.f7507h = d4;
        this.f7508i = i2;
        this.f7081a.mo32909a(C2104d.EnumC2105a.RECEIVERPOINTS);
    }

    /* renamed from: b */
    public double m32146b() {
        return this.f7502c;
    }

    /* renamed from: c */
    public double m32145c() {
        return this.f7503d;
    }

    /* renamed from: d */
    public double m32144d() {
        return this.f7504e;
    }

    /* renamed from: e */
    public double m32143e() {
        return this.f7505f;
    }

    /* renamed from: f */
    public double m32142f() {
        return this.f7506g;
    }

    /* renamed from: g */
    public double m32141g() {
        return this.f7507h;
    }

    /* renamed from: h */
    public int m32140h() {
        return this.f7508i;
    }

    public String toString() {
        return "Receivepoints [number=" + this.f7501b + ", Longitude=" + this.f7502c + ", Latitude=" + this.f7503d + ", Altitude=" + this.f7504e + ", yaw_angle=" + this.f7505f + ", hover_time=" + this.f7506g + ", speed=" + this.f7507h + ", Number_to_be_transmited=" + this.f7508i + "]";
    }
}
