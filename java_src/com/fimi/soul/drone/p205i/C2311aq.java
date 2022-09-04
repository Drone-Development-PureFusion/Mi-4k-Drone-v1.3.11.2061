package com.fimi.soul.drone.p205i;

import com.fimi.soul.biz.p187o.C2022a;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.C2247e;
import com.fimi.soul.utils.C3078af;
import com.fimi.soul.utils.C3084al;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: com.fimi.soul.drone.i.aq */
/* loaded from: classes.dex */
public class C2311aq extends C2247e {

    /* renamed from: b */
    private double f7460b;

    /* renamed from: c */
    private byte f7461c;

    /* renamed from: d */
    private double f7462d;

    /* renamed from: e */
    private double f7463e;

    /* renamed from: f */
    private double f7464f;

    /* renamed from: g */
    private double f7465g;

    /* renamed from: h */
    private byte f7466h;

    /* renamed from: i */
    private double f7467i;

    /* renamed from: j */
    private double f7468j;

    /* renamed from: k */
    private short f7469k;

    public C2311aq() {
    }

    public C2311aq(C2083a c2083a) {
        super(c2083a);
    }

    /* renamed from: a */
    public short m32196a() {
        return this.f7469k;
    }

    /* renamed from: a */
    public void m32195a(double d, byte b, float f, float f2, double d2, double d3, byte b2) {
        this.f7460b = d;
        this.f7461c = b;
        this.f7467i = f2;
        this.f7468j = f;
        if (!C2022a.m33223a().m33221b()) {
            C3084al m29346a = C3078af.m29346a(f2, f);
            this.f7462d = m29346a.m29320b();
            this.f7463e = m29346a.m29322a();
        } else {
            this.f7462d = f;
            this.f7463e = f2;
        }
        this.f7465g = d3;
        this.f7466h = b2;
        this.f7464f = d2;
        if (this.f7081a != null) {
            this.f7081a.mo32909a(C2104d.EnumC2105a.HEARDDAY);
        }
    }

    /* renamed from: a */
    public void m32194a(short s) {
        this.f7469k = s;
    }

    /* renamed from: b */
    public byte m32193b() {
        return this.f7466h;
    }

    /* renamed from: c */
    public double m32192c() {
        return this.f7460b;
    }

    /* renamed from: d */
    public byte m32191d() {
        return this.f7461c;
    }

    /* renamed from: e */
    public double m32190e() {
        return this.f7462d;
    }

    /* renamed from: f */
    public double m32189f() {
        return this.f7463e;
    }

    /* renamed from: g */
    public double m32188g() {
        return this.f7464f;
    }

    /* renamed from: h */
    public double m32187h() {
        return this.f7465g;
    }

    /* renamed from: i */
    public double m32186i() {
        return this.f7467i;
    }

    /* renamed from: j */
    public double m32185j() {
        return this.f7468j;
    }

    public String toString() {
        return "Pert{flighttime=" + this.f7460b + ", SatelliteNumber=" + ((int) this.f7461c) + ", CurrentLongitude=" + this.f7462d + ", CurrentLatitude=" + this.f7463e + ", Height=" + this.f7464f + ", Distance=" + this.f7465g + ", RFsignalstrength=" + ((int) this.f7466h) + C0494h.f735w;
    }
}
