package com.fimi.soul.drone.p205i;

import com.fimi.kernel.utils.C1679t;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.C2247e;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: com.fimi.soul.drone.i.l */
/* loaded from: classes.dex */
public class C2353l extends C2247e {

    /* renamed from: b */
    public double f7712b;

    /* renamed from: c */
    public double f7713c;

    /* renamed from: d */
    public double f7714d;

    public C2353l(C2083a c2083a) {
        super(c2083a);
    }

    /* renamed from: a */
    public double m31911a(String str, String str2, String str3) {
        return Math.sqrt(StrictMath.pow(Float.valueOf(str).floatValue(), 2.0d) + StrictMath.pow(Float.valueOf(str2).floatValue(), 2.0d) + StrictMath.pow(Float.valueOf(str3).floatValue(), 2.0d));
    }

    /* renamed from: a */
    public String m31912a() {
        return C1679t.m34552b(this.f7712b / 100.0d, 2);
    }

    /* renamed from: a */
    public void m31910a(short s, short s2, short s3) {
        this.f7712b = s;
        this.f7713c = s2;
        this.f7714d = s3;
        if (this.f7081a != null) {
            this.f7081a.mo32909a(C2104d.EnumC2105a.IMU_COMPASS);
        }
    }

    /* renamed from: b */
    public String m31909b() {
        return C1679t.m34552b(this.f7713c / 100.0d, 2);
    }

    /* renamed from: c */
    public String m31908c() {
        return C1679t.m34552b(this.f7714d / 100.0d, 2);
    }

    /* renamed from: d */
    public String m31907d() {
        return C1679t.m34552b(m31911a(m31912a(), m31909b(), m31908c()), 2);
    }

    public String toString() {
        return "CompassInfo{compassOneX=" + this.f7712b + ", compassOneY=" + this.f7713c + ", compassOneZ=" + this.f7714d + C0494h.f735w;
    }
}
