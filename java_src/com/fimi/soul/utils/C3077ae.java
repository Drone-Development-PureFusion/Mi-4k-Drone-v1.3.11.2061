package com.fimi.soul.utils;

import com.google.android.gms.maps.C8500c;
import com.google.android.gms.maps.model.C8617i;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.firebase.p253b.C9755a;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.fimi.soul.utils.ae */
/* loaded from: classes.dex */
public class C3077ae {

    /* renamed from: b */
    private static final double f11521b = 6372797.560856d;

    /* renamed from: a */
    public List<LatLng> f11522a;

    /* renamed from: a */
    public static LatLng m29353a(LatLng latLng, double d, double d2) {
        double d3 = latLng.f27462a;
        double d4 = latLng.f27463b;
        double radians = Math.toRadians(d3);
        double radians2 = Math.toRadians(d4);
        double radians3 = Math.toRadians(d);
        double d5 = d2 / f11521b;
        double asin = Math.asin((Math.sin(radians) * Math.cos(d5)) + (Math.cos(radians) * Math.sin(d5) * Math.cos(radians3)));
        return new LatLng(Math.toDegrees(asin), Math.toDegrees(Math.atan2(Math.sin(radians3) * Math.sin(d5) * Math.cos(radians), Math.cos(d5) - (Math.sin(radians) * Math.sin(asin))) + radians2));
    }

    /* renamed from: a */
    public static Double m29355a(double d) {
        return Double.valueOf(Math.toDegrees(d / 6378100.0d));
    }

    /* renamed from: a */
    public static Double m29352a(LatLng latLng, LatLng latLng2) {
        return Double.valueOf(Math.hypot(latLng.f27462a - latLng2.f27462a, latLng.f27463b - latLng2.f27463b));
    }

    /* renamed from: a */
    public static List<C8617i> m29354a(C8500c c8500c, ArrayList<LatLng> arrayList, int i) {
        boolean z;
        ArrayList arrayList2 = new ArrayList();
        int i2 = 0;
        boolean z2 = false;
        while (i2 < arrayList.size() - 1) {
            double m29347e = m29347e(arrayList.get(i2), arrayList.get(i2 + 1));
            if (m29347e >= 0.02d) {
                int i3 = (int) (m29347e / 0.02d);
                double d = (arrayList.get(i2 + 1).f27462a - arrayList.get(i2).f27462a) / i3;
                double d2 = (arrayList.get(i2 + 1).f27463b - arrayList.get(i2).f27463b) / i3;
                z = z2;
                LatLng latLng = new LatLng(arrayList.get(i2).f27462a, arrayList.get(i2).f27463b);
                int i4 = 0;
                while (i4 < i3) {
                    LatLng latLng2 = new LatLng(latLng.f27462a + d, latLng.f27463b + d2);
                    if (!z) {
                        arrayList2.add(c8500c.m11575a(new PolylineOptions().m11302a(latLng).m11302a(latLng2).m11303a(i)));
                        z = true;
                    } else {
                        z = false;
                    }
                    i4++;
                    latLng = latLng2;
                }
            } else if (!z2) {
                arrayList2.add(c8500c.m11575a(new PolylineOptions().m11302a(arrayList.get(i2)).m11302a(arrayList.get(i2 + 1)).m11303a(i)));
                z = true;
            } else {
                z = false;
            }
            i2++;
            z2 = z;
        }
        return arrayList2;
    }

    /* renamed from: b */
    public static double m29350b(LatLng latLng, LatLng latLng2) {
        double radians = Math.toRadians(latLng.f27462a - latLng2.f27462a);
        double radians2 = Math.toRadians(latLng.f27463b - latLng2.f27463b);
        double sin = Math.sin(radians * 0.5d);
        double sin2 = Math.sin(radians2 * 0.5d);
        return Math.toDegrees(Math.asin(Math.sqrt((sin * sin) + (sin2 * sin2 * Math.cos(Math.toRadians(latLng.f27462a)) * Math.cos(Math.toRadians(latLng2.f27462a))))) * 2.0d);
    }

    /* renamed from: b */
    public static Double m29351b(double d) {
        return Double.valueOf(6378100.0d * Math.toRadians(d));
    }

    /* renamed from: c */
    public static C3085am m29349c(LatLng latLng, LatLng latLng2) {
        return new C3085am(f11521b * Math.toRadians(m29350b(latLng, latLng2)));
    }

    /* renamed from: d */
    public static double m29348d(LatLng latLng, LatLng latLng2) {
        double radians = Math.toRadians(latLng.f27462a);
        double radians2 = Math.toRadians(latLng.f27463b);
        double radians3 = Math.toRadians(latLng2.f27462a);
        double radians4 = Math.toRadians(latLng2.f27463b);
        double degrees = Math.toDegrees(Math.atan2(Math.sin(radians4 - radians2) * Math.cos(radians3), (Math.cos(radians) * Math.sin(radians3)) - ((Math.sin(radians) * Math.cos(radians3)) * Math.cos(radians4 - radians2))));
        return degrees >= C9755a.f30449c ? degrees : degrees + 360.0d;
    }

    /* renamed from: e */
    private static double m29347e(LatLng latLng, LatLng latLng2) {
        return new BigDecimal(m29349c(latLng, latLng2).m29318a()).setScale(3, RoundingMode.DOWN).doubleValue();
    }
}
