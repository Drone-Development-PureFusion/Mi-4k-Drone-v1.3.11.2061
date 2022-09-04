package com.fimi.soul.drone.p205i;

import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.C2247e;
/* renamed from: com.fimi.soul.drone.i.at */
/* loaded from: classes.dex */
public class C2314at extends C2247e {

    /* renamed from: b */
    public double f7478b;

    /* renamed from: c */
    public byte f7479c;

    /* renamed from: d */
    public byte f7480d;

    public C2314at(C2083a c2083a) {
        super(c2083a);
    }

    /* renamed from: a */
    public double m32174a() {
        return this.f7478b;
    }

    /* renamed from: a */
    public void m32173a(double d, byte b, byte b2) {
        this.f7478b = d;
        this.f7479c = b;
        this.f7480d = b2;
        this.f7081a.mo32909a(C2104d.EnumC2105a.FOLLOWME);
    }

    /* renamed from: b */
    public byte m32172b() {
        return this.f7479c;
    }

    /* renamed from: c */
    public byte m32171c() {
        return this.f7480d;
    }
}
