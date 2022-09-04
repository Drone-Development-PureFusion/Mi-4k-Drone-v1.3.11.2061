package com.fimi.soul.drone.p205i;

import com.fimi.kernel.utils.C1679t;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.C2247e;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: com.fimi.soul.drone.i.aj */
/* loaded from: classes.dex */
public class C2304aj extends C2247e {

    /* renamed from: b */
    public double f7409b;

    /* renamed from: c */
    public double f7410c;

    /* renamed from: d */
    public double f7411d;

    /* renamed from: e */
    public double f7412e;

    /* renamed from: f */
    public double f7413f;

    /* renamed from: g */
    public double f7414g;

    /* renamed from: h */
    public byte f7415h;

    public C2304aj(C2083a c2083a) {
        super(c2083a);
    }

    /* renamed from: a */
    public byte m32286a() {
        return this.f7415h;
    }

    /* renamed from: a */
    public double m32285a(String str, String str2, String str3) {
        return Math.sqrt(StrictMath.pow(Float.valueOf(str).floatValue(), 2.0d) + StrictMath.pow(Float.valueOf(str2).floatValue(), 2.0d) + StrictMath.pow(Float.valueOf(str3).floatValue(), 2.0d));
    }

    /* renamed from: a */
    public void m32284a(short s, short s2, short s3, short s4, short s5, short s6, byte b) {
        this.f7409b = s;
        this.f7410c = s2;
        this.f7411d = s3;
        this.f7412e = s4;
        this.f7413f = s5;
        this.f7414g = s6;
        this.f7415h = b;
        if (this.f7081a != null) {
            this.f7081a.mo32909a(C2104d.EnumC2105a.IMU_INFO);
        }
    }

    /* renamed from: b */
    public String m32283b() {
        return C1679t.m34552b(this.f7409b / 100.0d, 2);
    }

    /* renamed from: c */
    public String m32282c() {
        return C1679t.m34552b(this.f7410c / 100.0d, 2);
    }

    /* renamed from: d */
    public String m32281d() {
        return C1679t.m34552b(this.f7411d / 100.0d, 2);
    }

    /* renamed from: e */
    public String m32280e() {
        return C1679t.m34552b(m32285a(m32283b(), m32282c(), m32281d()), 2);
    }

    /* renamed from: f */
    public String m32279f() {
        return C1679t.m34552b(this.f7412e / 100.0d, 2);
    }

    /* renamed from: g */
    public String m32278g() {
        return C1679t.m34552b(this.f7413f / 100.0d, 2);
    }

    /* renamed from: h */
    public String m32277h() {
        return C1679t.m34552b(this.f7414g / 100.0d, 2);
    }

    /* renamed from: i */
    public String m32276i() {
        return C1679t.m34552b(m32285a(m32279f(), m32278g(), m32277h()), 2);
    }

    public String toString() {
        return "IMUInfo{gyroX=" + this.f7409b + ", gyroY=" + this.f7410c + ", gyroZ=" + this.f7411d + ", accelX=" + this.f7412e + ", accelY=" + this.f7413f + ", accelZ=" + this.f7414g + ", cmdACK=" + ((int) this.f7415h) + C0494h.f735w;
    }
}
