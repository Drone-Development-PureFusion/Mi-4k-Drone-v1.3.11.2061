package com.fimi.soul.utils;
/* renamed from: com.fimi.soul.utils.af */
/* loaded from: classes.dex */
public class C3078af {

    /* renamed from: a */
    static final double f11523a = 3.141592653589793d;

    /* renamed from: b */
    static final double f11524b = 6378245.0d;

    /* renamed from: c */
    static final double f11525c = 0.006693421622965943d;

    /* renamed from: a */
    static double m29344a(double d, double d2, double d3, double d4) {
        double cos = ((float) (d - d3)) * ((float) Math.cos((float) (Math.abs(d2) * 0.0174532925d)));
        double d5 = (float) (d2 - d4);
        return Math.sqrt(((d5 * 1.0E7d * 1.0E7d * d5) + (cos * 1.0E7d * 1.0E7d * cos)) * 1.2392029762268066d);
    }

    /* renamed from: a */
    public static C3084al m29346a(double d, double d2) {
        C3084al c3084al = new C3084al();
        double m29340d = m29340d(d2 - 105.0d, d - 35.0d);
        double m29339e = m29339e(d2 - 105.0d, d - 35.0d);
        double d3 = (d / 180.0d) * f11523a;
        double sin = Math.sin(d3);
        double d4 = 1.0d - (sin * (f11525c * sin));
        double sqrt = Math.sqrt(d4);
        double d5 = (m29340d * 180.0d) / ((6335552.717000426d / (d4 * sqrt)) * f11523a);
        double d6 = f11524b / sqrt;
        c3084al.m29321a(d5 + d);
        c3084al.m29319b(((m29339e * 180.0d) / ((Math.cos(d3) * d6) * f11523a)) + d2);
        return c3084al;
    }

    /* renamed from: a */
    public static C3084al m29345a(double d, double d2, double d3) {
        new C3084al();
        C3084al c3084al = new C3084al();
        C3084al c3084al2 = new C3084al();
        c3084al.m29321a(d2);
        c3084al.m29319b(d3);
        C3084al m29342b = m29342b(c3084al.m29322a(), c3084al.m29320b());
        C3084al m29346a = m29346a(m29342b.m29322a(), m29342b.m29320b());
        while (true) {
            c3084al2.m29319b((d3 - m29346a.m29320b()) + m29342b.m29320b());
            c3084al2.m29321a((d2 - m29346a.m29322a()) + m29342b.m29322a());
            m29342b.m29319b(c3084al2.m29320b());
            m29342b.m29321a(c3084al2.m29322a());
            C3084al m29346a2 = m29346a(m29342b.m29322a(), m29342b.m29320b());
            if (d >= m29344a(d3, d2, m29346a2.m29320b(), m29346a2.m29322a())) {
                return c3084al2;
            }
            m29346a = m29346a2;
        }
    }

    /* renamed from: a */
    public static void m29343a(double d, double d2, double[] dArr) {
        if (m29341c(d, d2)) {
            dArr[0] = d;
            dArr[1] = d2;
            return;
        }
        double m29340d = m29340d(d2 - 105.0d, d - 35.0d);
        double m29339e = m29339e(d2 - 105.0d, d - 35.0d);
        double d3 = (d / 180.0d) * f11523a;
        double sin = Math.sin(d3);
        double d4 = 1.0d - (sin * (f11525c * sin));
        double sqrt = Math.sqrt(d4);
        double d5 = (m29340d * 180.0d) / ((6335552.717000426d / (d4 * sqrt)) * f11523a);
        double d6 = f11524b / sqrt;
        dArr[0] = d5 + d;
        dArr[1] = ((m29339e * 180.0d) / ((Math.cos(d3) * d6) * f11523a)) + d2;
    }

    /* renamed from: b */
    public static C3084al m29342b(double d, double d2) {
        C3084al c3084al = new C3084al();
        double m29340d = m29340d(d2 - 105.0d, d - 35.0d);
        double m29339e = m29339e(d2 - 105.0d, d - 35.0d);
        double d3 = (d / 180.0d) * f11523a;
        double sin = Math.sin(d3);
        double d4 = 1.0d - (sin * (f11525c * sin));
        double sqrt = Math.sqrt(d4);
        double d5 = (m29340d * 180.0d) / ((6335552.717000426d / (d4 * sqrt)) * f11523a);
        double d6 = f11524b / sqrt;
        c3084al.m29321a(d - d5);
        c3084al.m29319b(d2 - ((m29339e * 180.0d) / ((Math.cos(d3) * d6) * f11523a)));
        return c3084al;
    }

    /* renamed from: c */
    private static boolean m29341c(double d, double d2) {
        return d2 < 72.004d || d2 > 137.8347d || d < 0.8293d || d > 55.8271d;
    }

    /* renamed from: d */
    private static double m29340d(double d, double d2) {
        return (-100.0d) + (2.0d * d) + (3.0d * d2) + (0.2d * d2 * d2) + (0.1d * d * d2) + (0.2d * Math.sqrt(Math.abs(d))) + ((((20.0d * Math.sin((6.0d * d) * f11523a)) + (20.0d * Math.sin((2.0d * d) * f11523a))) * 2.0d) / 3.0d) + ((((20.0d * Math.sin(f11523a * d2)) + (40.0d * Math.sin((d2 / 3.0d) * f11523a))) * 2.0d) / 3.0d) + ((((160.0d * Math.sin((d2 / 12.0d) * f11523a)) + (320.0d * Math.sin((f11523a * d2) / 30.0d))) * 2.0d) / 3.0d);
    }

    /* renamed from: e */
    private static double m29339e(double d, double d2) {
        return 300.0d + d + (2.0d * d2) + (0.1d * d * d) + (0.1d * d * d2) + (0.1d * Math.sqrt(Math.abs(d))) + ((((20.0d * Math.sin((6.0d * d) * f11523a)) + (20.0d * Math.sin((2.0d * d) * f11523a))) * 2.0d) / 3.0d) + ((((20.0d * Math.sin(f11523a * d)) + (40.0d * Math.sin((d / 3.0d) * f11523a))) * 2.0d) / 3.0d) + ((((150.0d * Math.sin((d / 12.0d) * f11523a)) + (300.0d * Math.sin((d / 30.0d) * f11523a))) * 2.0d) / 3.0d);
    }
}
