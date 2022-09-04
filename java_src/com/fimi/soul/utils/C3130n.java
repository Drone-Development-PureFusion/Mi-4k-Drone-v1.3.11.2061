package com.fimi.soul.utils;

import com.google.firebase.p253b.C9755a;
/* renamed from: com.fimi.soul.utils.n */
/* loaded from: classes.dex */
public class C3130n {
    /* renamed from: a */
    private static double m29043a(double d) {
        return (3.141592653589793d * d) / 180.0d;
    }

    /* renamed from: a */
    public static double m29042a(double d, double d2, double d3, double d4) {
        return (d == d3 && d2 == d4) ? C9755a.f30449c : m29041a(d, d2, d3, d4, 'K');
    }

    /* renamed from: a */
    public static double m29041a(double d, double d2, double d3, double d4, char c) {
        double m29040b = m29040b(Math.acos((Math.cos(m29043a(d2 - d4)) * Math.cos(m29043a(d)) * Math.cos(m29043a(d3))) + (Math.sin(m29043a(d)) * Math.sin(m29043a(d3))))) * 60.0d * 1.1515d;
        return c == 'K' ? m29040b * 1.609344d : c == 'N' ? m29040b * 0.8684d : m29040b;
    }

    /* renamed from: b */
    private static double m29040b(double d) {
        return (180.0d * d) / 3.141592653589793d;
    }
}
