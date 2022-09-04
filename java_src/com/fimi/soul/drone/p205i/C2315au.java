package com.fimi.soul.drone.p205i;

import com.fimi.soul.biz.p187o.C2022a;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.C2247e;
import com.fimi.soul.utils.C3078af;
import com.fimi.soul.utils.C3084al;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: com.fimi.soul.drone.i.au */
/* loaded from: classes.dex */
public class C2315au extends C2247e {

    /* renamed from: b */
    public double f7481b;

    /* renamed from: c */
    public int f7482c;

    /* renamed from: d */
    public double f7483d;

    /* renamed from: e */
    public double f7484e;

    /* renamed from: f */
    public double f7485f;

    /* renamed from: g */
    public short f7486g;

    /* renamed from: h */
    public int f7487h;

    /* renamed from: i */
    public int f7488i;

    /* renamed from: j */
    public byte f7489j;

    /* renamed from: k */
    public byte f7490k;

    /* renamed from: l */
    public byte f7491l;

    public C2315au(C2083a c2083a) {
        super(c2083a);
    }

    /* renamed from: a */
    public byte m32170a() {
        return this.f7491l;
    }

    /* renamed from: a */
    public void m32169a(double d, int i, float f, float f2, double d2, short s, int i2, int i3, byte b, byte b2, byte b3) {
        if (!C2022a.m33223a().m33221b()) {
            C3084al m29346a = C3078af.m29346a(f2, f);
            this.f7483d = m29346a.m29320b();
            this.f7484e = m29346a.m29322a();
        } else {
            this.f7483d = f;
            this.f7484e = f2;
        }
        this.f7481b = d;
        this.f7482c = i;
        this.f7485f = d2;
        this.f7486g = s;
        this.f7487h = i2 & 255;
        this.f7488i = i3 & 255;
        this.f7489j = b;
        this.f7490k = b2;
        this.f7491l = b3;
        this.f7081a.mo32909a(C2104d.EnumC2105a.RETURNINTERESTWAYPOIT);
    }

    /* renamed from: b */
    public byte m32168b() {
        return this.f7490k;
    }

    /* renamed from: c */
    public byte m32167c() {
        return this.f7489j;
    }

    /* renamed from: d */
    public int m32166d() {
        return this.f7488i;
    }

    /* renamed from: e */
    public int m32165e() {
        return this.f7487h;
    }

    /* renamed from: f */
    public short m32164f() {
        return this.f7486g;
    }

    /* renamed from: g */
    public double m32163g() {
        return this.f7485f;
    }

    /* renamed from: h */
    public double m32162h() {
        return this.f7484e;
    }

    /* renamed from: i */
    public double m32161i() {
        return this.f7483d;
    }

    /* renamed from: j */
    public int m32160j() {
        return this.f7482c;
    }

    /* renamed from: k */
    public double m32159k() {
        return this.f7481b;
    }

    public String toString() {
        return "ReceiveSettingPoint{PacketSequence=" + this.f7481b + ", Opration_Code=" + this.f7482c + ", POI_Longitude=" + this.f7483d + ", POI_Latitude=" + this.f7484e + ", POI_Altitude=" + this.f7485f + ", Radius=" + ((int) this.f7486g) + ", speek=" + this.f7487h + ", Start_Point_Pole_Angle=" + this.f7488i + ", Paral=" + ((int) this.f7489j) + ", yaw_mode=" + ((int) this.f7490k) + ", report=" + ((int) this.f7491l) + C0494h.f735w;
    }
}
