package com.fimi.soul.drone.p205i;

import com.fimi.kernel.utils.C1679t;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.C2247e;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: com.fimi.soul.drone.i.ai */
/* loaded from: classes.dex */
public class C2303ai extends C2247e {

    /* renamed from: b */
    public short f7403b;

    /* renamed from: c */
    public short f7404c;

    /* renamed from: d */
    public short f7405d;

    /* renamed from: e */
    public short f7406e;

    /* renamed from: f */
    public short f7407f;

    /* renamed from: g */
    public short f7408g;

    public C2303ai(C2083a c2083a) {
        super(c2083a);
    }

    /* renamed from: a */
    public double m32295a(float f, float f2, float f3) {
        return Math.sqrt(StrictMath.pow(f, 2.0d) + StrictMath.pow(f2, 2.0d) + StrictMath.pow(f3, 2.0d));
    }

    /* renamed from: a */
    public float m32296a() {
        return (Math.round(this.f7403b * 100) / 100) / 100.0f;
    }

    /* renamed from: a */
    public void m32294a(short s, short s2, short s3, short s4, short s5, short s6) {
        this.f7403b = s;
        this.f7404c = s2;
        this.f7405d = s3;
        this.f7406e = s4;
        this.f7407f = s5;
        this.f7408g = s6;
        if (this.f7081a != null) {
            this.f7081a.mo32909a(C2104d.EnumC2105a.IMU_INFO);
        }
    }

    /* renamed from: b */
    public float m32293b() {
        return (Math.round(this.f7404c * 100) / 100) / 100.0f;
    }

    /* renamed from: c */
    public float m32292c() {
        return (Math.round(this.f7405d * 100) / 100) / 100.0f;
    }

    /* renamed from: d */
    public String m32291d() {
        return C1679t.m34552b(m32295a(m32296a(), m32293b(), m32292c()), 2);
    }

    /* renamed from: e */
    public float m32290e() {
        return (Math.round(this.f7406e * 100) / 100) / 100.0f;
    }

    /* renamed from: f */
    public float m32289f() {
        return (Math.round(this.f7407f * 100) / 100) / 100.0f;
    }

    /* renamed from: g */
    public float m32288g() {
        return (Math.round(this.f7408g * 100) / 100) / 100.0f;
    }

    /* renamed from: h */
    public String m32287h() {
        return C1679t.m34552b(m32295a(m32290e(), m32289f(), m32288g()), 2);
    }

    public String toString() {
        return "IMUInfo{gyroX=" + ((int) this.f7403b) + ", gyroY=" + ((int) this.f7404c) + ", gyroZ=" + ((int) this.f7405d) + ", accelX=" + ((int) this.f7406e) + ", accelY=" + ((int) this.f7407f) + ", accelZ=" + ((int) this.f7408g) + C0494h.f735w;
    }
}
