package com.fimi.soul.module.droneui;

import com.google.firebase.p253b.C9755a;
/* renamed from: com.fimi.soul.module.droneui.b */
/* loaded from: classes.dex */
public class C2756b {

    /* renamed from: a */
    static double f9583a = 6378137.0d;

    /* renamed from: b */
    static double f9584b = 6356725.0d;

    /* renamed from: c */
    double f9585c;

    /* renamed from: d */
    double f9586d;

    /* renamed from: e */
    double f9587e;

    /* renamed from: f */
    double f9588f;

    /* renamed from: g */
    double f9589g;

    /* renamed from: h */
    double f9590h;

    /* renamed from: i */
    double f9591i;

    /* renamed from: j */
    double f9592j;

    /* renamed from: k */
    double f9593k;

    /* renamed from: l */
    double f9594l;

    /* renamed from: m */
    double f9595m;

    /* renamed from: n */
    double f9596n;

    public C2756b(double d, double d2) {
        this.f9585c = (int) d;
        this.f9586d = (int) ((d - this.f9585c) * 60.0d);
        this.f9587e = ((d - this.f9585c) - (this.f9586d / 60.0d)) * 3600.0d;
        this.f9588f = (int) d2;
        this.f9589g = (int) ((d2 - this.f9588f) * 60.0d);
        this.f9590h = ((d2 - this.f9588f) - (this.f9589g / 60.0d)) * 3600.0d;
        this.f9591i = d;
        this.f9592j = d2;
        this.f9593k = (3.141592653589793d * d) / 180.0d;
        this.f9594l = (3.141592653589793d * d2) / 180.0d;
        this.f9595m = f9584b + (((f9583a - f9584b) * (90.0d - this.f9592j)) / 90.0d);
        this.f9596n = this.f9595m * Math.cos(this.f9594l);
    }

    /* renamed from: a */
    public static double m30401a(C2756b c2756b, C2756b c2756b2) {
        double atan = (Math.atan(Math.abs(((c2756b2.f9593k - c2756b.f9593k) * c2756b.f9596n) / ((c2756b2.f9594l - c2756b.f9594l) * c2756b.f9595m))) * 180.0d) / 3.141592653589793d;
        double d = c2756b2.f9591i - c2756b.f9591i;
        double d2 = c2756b2.f9592j - c2756b.f9592j;
        return (d <= C9755a.f30449c || d2 > C9755a.f30449c) ? (d > C9755a.f30449c || d2 >= C9755a.f30449c) ? (d >= C9755a.f30449c || d2 < C9755a.f30449c) ? atan : (90.0d - atan) + 270.0d : atan + 180.0d : (90.0d - atan) + 90.0d;
    }

    /* renamed from: a */
    public static C2756b m30403a(double d, double d2, double d3, double d4) {
        return m30402a(new C2756b(d, d2), d3, d4);
    }

    /* renamed from: a */
    public static C2756b m30402a(C2756b c2756b, double d, double d2) {
        return new C2756b((((((d * 1000.0d) * Math.sin((d2 * 3.141592653589793d) / 180.0d)) / c2756b.f9596n) + c2756b.f9593k) * 180.0d) / 3.141592653589793d, (((((d * 1000.0d) * Math.cos((d2 * 3.141592653589793d) / 180.0d)) / c2756b.f9595m) + c2756b.f9594l) * 180.0d) / 3.141592653589793d);
    }
}
