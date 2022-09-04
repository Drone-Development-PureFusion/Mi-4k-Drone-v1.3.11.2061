package com.fimi.kernel.utils;

import com.fimi.kernel.p157a.C1577a;
import com.fimi.kernel.p157a.C1581e;
import com.google.firebase.p253b.C9755a;
import com.xiaomi.mipush.sdk.Constants;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.codehaus.jackson.smile.SmileConstants;
import org.p286a.p287a.p299f.p302c.C11125l;
/* renamed from: com.fimi.kernel.utils.l */
/* loaded from: classes.dex */
public class C1671l {
    /* renamed from: a */
    public static char m34688a(int i) {
        switch (i) {
            case 0:
                return '0';
            case 1:
                return '1';
            case 2:
                return '2';
            case 3:
                return '3';
            case 4:
                return '4';
            case 5:
                return '5';
            case 6:
                return '6';
            case 7:
                return '7';
            case 8:
                return '8';
            case 9:
                return '9';
            case 10:
                return 'a';
            case 11:
                return 'b';
            case 12:
                return 'c';
            case 13:
                return 'd';
            case 14:
                return 'e';
            case 15:
                return 'f';
            default:
                return C11125l.f35805c;
        }
    }

    /* renamed from: a */
    public static double m34695a(double d, double d2) {
        return Math.log(d) / Math.log(d2);
    }

    /* renamed from: a */
    public static double m34694a(double d, double d2, double d3, double d4) {
        double d5 = d - d3;
        double d6 = d2 - d4;
        return Math.sqrt((d5 * d5) + (d6 * d6));
    }

    /* renamed from: a */
    public static double m34683a(C1581e c1581e, C1581e c1581e2) {
        return m34694a(c1581e.f3897a, c1581e.f3898b, c1581e2.f3897a, c1581e2.f3898b);
    }

    /* renamed from: a */
    public static int m34681a(double[] dArr) {
        float f = 0.0f;
        for (double d : dArr) {
            f = (float) (f + d);
        }
        return (int) (f / dArr.length);
    }

    /* renamed from: a */
    public static String m34682a(byte[] bArr, int i) {
        String str = "";
        int i2 = 0;
        while (i2 < i) {
            String hexString = Integer.toHexString(bArr[i2] & SmileConstants.BYTE_MARKER_END_OF_CONTENT);
            i2++;
            str = (hexString.length() == 1 ? str + "0" + hexString : str + hexString) + Constants.ACCEPT_TIME_SEPARATOR_SP;
        }
        return str.toUpperCase();
    }

    /* renamed from: a */
    public static BigDecimal m34690a(double d, int i) {
        return new BigDecimal(d).setScale(i, 4);
    }

    /* renamed from: a */
    public static List<C1581e> m34687a(C1577a c1577a, C1577a c1577a2) {
        ArrayList arrayList = new ArrayList();
        double d = c1577a.f3879b * 2.0d * (c1577a.f3878a.f3897a - c1577a2.f3878a.f3897a);
        double d2 = c1577a.f3879b * 2.0d * (c1577a.f3878a.f3898b - c1577a2.f3878a.f3898b);
        double pow = ((Math.pow(c1577a2.f3879b, 2.0d) - Math.pow(c1577a.f3879b, 2.0d)) - Math.pow(c1577a.f3878a.f3897a - c1577a2.f3878a.f3897a, 2.0d)) - Math.pow(c1577a.f3878a.f3898b - c1577a2.f3878a.f3898b, 2.0d);
        double pow2 = Math.pow(d, 2.0d) + Math.pow(d2, 2.0d);
        double d3 = d * (-2.0d) * pow;
        double pow3 = Math.pow(d3, 2.0d) - ((Math.pow(pow, 2.0d) - Math.pow(d2, 2.0d)) * (4.0d * pow2));
        double d4 = ((-Math.sqrt(pow3)) - d3) / (2.0d * pow2);
        double sqrt = (c1577a.f3879b * ((Math.sqrt(pow3) - d3) / (2.0d * pow2))) + c1577a.f3878a.f3897a;
        double sqrt2 = Math.sqrt(Math.pow(c1577a.f3879b, 2.0d) - Math.pow(sqrt - c1577a.f3878a.f3897a, 2.0d)) + c1577a.f3878a.f3898b;
        double d5 = (-Math.sqrt(Math.pow(c1577a.f3879b, 2.0d) - Math.pow(sqrt - c1577a.f3878a.f3897a, 2.0d))) + c1577a.f3878a.f3898b;
        HashSet<C1581e> hashSet = new HashSet();
        C1581e c1581e = new C1581e(sqrt, sqrt2);
        if (m34685a(c1581e, c1577a, c1577a2)) {
            hashSet.add(c1581e);
        }
        C1581e c1581e2 = new C1581e(sqrt, d5);
        if (m34685a(c1581e2, c1577a, c1577a2)) {
            hashSet.add(c1581e2);
        }
        double d6 = (d4 * c1577a.f3879b) + c1577a.f3878a.f3897a;
        double sqrt3 = Math.sqrt(Math.pow(c1577a.f3879b, 2.0d) - Math.pow(d6 - c1577a.f3878a.f3897a, 2.0d)) + c1577a.f3878a.f3898b;
        double d7 = (-Math.sqrt(Math.pow(c1577a.f3879b, 2.0d) - Math.pow(d6 - c1577a.f3878a.f3897a, 2.0d))) + c1577a.f3878a.f3898b;
        C1581e c1581e3 = new C1581e(d6, sqrt3);
        if (m34685a(c1581e3, c1577a, c1577a2)) {
            hashSet.add(c1581e3);
        }
        C1581e c1581e4 = new C1581e(d6, d7);
        if (m34685a(c1581e4, c1577a, c1577a2)) {
            hashSet.add(c1581e4);
        }
        for (C1581e c1581e5 : hashSet) {
            arrayList.add(c1581e5);
        }
        return arrayList;
    }

    /* renamed from: a */
    public static boolean m34692a(double d, double d2, double d3, double d4, double d5, double d6, double d7) {
        if (d < Math.min(d4, d6) || d > Math.max(d4, d6) || d2 < Math.min(d5, d7) || d2 > Math.max(d5, d7)) {
            return false;
        }
        return d3 <= Math.abs(d - d4) && d3 <= Math.abs(d2 - d7) && d3 <= Math.abs(d - d6) && d3 <= Math.abs(d2 - d7);
    }

    /* renamed from: a */
    public static boolean m34691a(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8) {
        if ((d4 - d2) / (d3 - d) == (d8 - d6) / (d7 - d5)) {
            return false;
        }
        double d9 = (((d * d4) - (d2 * d3)) - ((((((d * d4) - (d2 * d3)) * (d5 - d7)) - (((d5 * d8) - (d6 * d7)) * (d - d3))) / (((d4 - d2) * (d5 - d7)) - ((d8 - d6) * (d - d3)))) * (d4 - d2))) / (d - d3);
        return true;
    }

    /* renamed from: a */
    public static boolean m34689a(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        if (f5 <= f || f5 <= f + f3) {
            if (f5 < f && f5 < f - f7) {
                return false;
            }
            if (f6 > f2 && f6 > f2 + f4) {
                return false;
            }
            return f6 >= f2 || f6 >= f2 - f8;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m34686a(C1581e c1581e, C1577a c1577a) {
        return Math.pow(c1581e.f3897a - c1577a.f3878a.f3897a, 2.0d) + Math.pow(c1581e.f3898b - c1577a.f3878a.f3898b, 2.0d) <= Math.pow(c1577a.f3879b, 2.0d);
    }

    /* renamed from: a */
    public static boolean m34685a(C1581e c1581e, C1577a c1577a, C1577a c1577a2) {
        return Math.pow(c1581e.f3897a - c1577a2.f3878a.f3897a, 2.0d) + Math.pow(c1581e.f3898b - c1577a2.f3878a.f3898b, 2.0d) == Math.pow(c1577a2.f3879b, 2.0d) && Math.pow(c1581e.f3897a - c1577a.f3878a.f3897a, 2.0d) + Math.pow(c1581e.f3898b - c1577a.f3878a.f3898b, 2.0d) == Math.pow(c1577a.f3879b, 2.0d);
    }

    /* renamed from: a */
    public static boolean m34684a(C1581e c1581e, C1577a c1577a, C1577a c1577a2, float f) {
        return Math.pow(c1581e.f3897a - c1577a2.f3878a.f3897a, 2.0d) + Math.pow(c1581e.f3898b - c1577a2.f3878a.f3898b, 2.0d) <= Math.pow(c1577a2.f3879b, 2.0d) + ((double) f) && Math.pow(c1581e.f3897a - c1577a2.f3878a.f3897a, 2.0d) + Math.pow(c1581e.f3898b - c1577a2.f3878a.f3898b, 2.0d) >= Math.pow(c1577a2.f3879b, 2.0d) - ((double) f) && Math.pow(c1581e.f3897a - c1577a.f3878a.f3897a, 2.0d) + Math.pow(c1581e.f3898b - c1577a.f3878a.f3898b, 2.0d) <= Math.pow(c1577a.f3879b, 2.0d) + ((double) f) && Math.pow(c1581e.f3897a - c1577a.f3878a.f3897a, 2.0d) + Math.pow(c1581e.f3898b - c1577a.f3878a.f3898b, 2.0d) >= Math.pow(c1577a.f3879b, 2.0d) - ((double) f);
    }

    /* renamed from: a */
    public static double[] m34680a(int[] iArr) {
        int length = iArr.length;
        double[] dArr = new double[length];
        for (int i = 0; i < length; i++) {
            dArr[i] = Double.valueOf(String.valueOf(iArr[i])).doubleValue();
        }
        return dArr;
    }

    /* renamed from: a */
    public static double[] m34678a(double[][] dArr) {
        double[] dArr2 = new double[dArr.length * dArr[0].length];
        for (int i = 0; i < dArr.length; i++) {
            for (int i2 = 0; i2 < dArr[i].length; i2++) {
                dArr2[(dArr.length * i2) + i] = dArr[i][i2];
            }
        }
        return dArr2;
    }

    /* renamed from: a */
    public static double[][] m34677a(int[][] iArr) {
        int length = iArr.length;
        int length2 = iArr[0].length;
        double[][] dArr = (double[][]) Array.newInstance(Double.TYPE, length, length2);
        for (int i = 0; i < length; i++) {
            for (int i2 = 0; i2 < length2; i2++) {
                dArr[i][i2] = Double.valueOf(String.valueOf(iArr[i][i2])).doubleValue();
            }
        }
        return dArr;
    }

    /* renamed from: a */
    public static int[][] m34679a(int[] iArr, int i, int i2) {
        int[][] iArr2 = (int[][]) Array.newInstance(Integer.TYPE, i2, i);
        for (int i3 = 0; i3 < i2; i3++) {
            for (int i4 = 0; i4 < i; i4++) {
                iArr2[i3][i4] = iArr[(i4 * i2) + i3];
            }
        }
        return iArr2;
    }

    /* renamed from: b */
    public static int m34674b(int[] iArr) {
        float f = 0.0f;
        for (int i : iArr) {
            f += i;
        }
        return (int) (f / iArr.length);
    }

    /* renamed from: b */
    public static boolean m34676b(double d, double d2, double d3, double d4, double d5, double d6) {
        return ((d - d3) * (d6 - d4)) - ((d2 - d4) * (d5 - d3)) == C9755a.f30449c && d >= Math.min(d3, d5) && d <= Math.max(d3, d5) && d2 >= Math.min(d4, d6) && d2 <= Math.max(d4, d6);
    }

    /* renamed from: b */
    public static boolean m34675b(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8) {
        if ((d4 - d2) / (d3 - d) == (d8 - d6) / (d7 - d5)) {
            return false;
        }
        double d9 = ((((d * d4) - (d2 * d3)) * (d5 - d7)) - (((d5 * d8) - (d6 * d7)) * (d - d3))) / (((d4 - d2) * (d5 - d7)) - ((d8 - d6) * (d - d3)));
        double d10 = (((d * d4) - (d2 * d3)) - ((d4 - d2) * d9)) / (d - d3);
        return d9 >= Math.min(d, d3) && d9 <= Math.max(d, d3) && d10 >= Math.min(d2, d4) && d10 <= Math.max(d2, d4) && d9 >= Math.min(d5, d7) && d9 <= Math.max(d5, d7) && d10 >= Math.min(d6, d8) && d10 <= Math.max(d6, d8);
    }

    /* renamed from: c */
    public static boolean m34673c(double d, double d2, double d3, double d4, double d5, double d6) {
        return d >= Math.min(d3, d5) && d <= Math.max(d3, d5) && d2 >= Math.min(d4, d6) && d2 <= Math.max(d4, d6);
    }

    /* renamed from: c */
    public static boolean m34672c(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8) {
        if ((d4 - d2) / (d3 - d) == (d8 - d6) / (d7 - d5)) {
            return false;
        }
        double d9 = ((((d * d4) - (d2 * d3)) * (d5 - d7)) - (((d5 * d8) - (d6 * d7)) * (d - d3))) / (((d4 - d2) * (d5 - d7)) - ((d8 - d6) * (d - d3)));
        double d10 = (((d * d4) - (d2 * d3)) - ((d4 - d2) * d9)) / (d - d3);
        return d9 >= Math.min(d, d3) && d9 <= Math.max(d, d3) && d10 >= Math.min(d2, d4) && d10 <= Math.max(d2, d4);
    }

    /* renamed from: d */
    public static boolean m34671d(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8) {
        return d >= Math.min(d5, d7) && d <= Math.max(d5, d7) && d2 >= Math.min(d6, d8) && d2 <= Math.max(d6, d8) && d3 >= Math.min(d5, d7) && d3 <= Math.max(d5, d7) && d4 >= Math.min(d6, d8) && d4 <= Math.max(d6, d8);
    }

    /* renamed from: a */
    public boolean m34693a(double d, double d2, double d3, double d4, double d5, double d6) {
        return ((d - d3) * (d6 - d4)) - ((d2 - d4) * (d5 - d3)) == C9755a.f30449c;
    }
}
