package com.fimi.kernel.utils;

import java.text.DecimalFormat;
import java.text.ParsePosition;
import org.codehaus.jackson.smile.SmileConstants;
/* renamed from: com.fimi.kernel.utils.t */
/* loaded from: classes.dex */
public class C1679t {
    /* renamed from: a */
    private static byte m34558a(char c) {
        return (byte) "0123456789ABCDEF".indexOf(c);
    }

    /* renamed from: a */
    public static double m34557a(double d) {
        return m34556a(0.62137d * d, 1);
    }

    /* renamed from: a */
    public static double m34556a(double d, int i) {
        try {
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (i == 1) {
            DecimalFormat decimalFormat = new DecimalFormat("0.0");
            d = decimalFormat.parse(decimalFormat.format(d), new ParsePosition(0)).doubleValue();
        } else if (i != 2) {
            if (i == 7) {
                DecimalFormat decimalFormat2 = new DecimalFormat("0.0000000");
                d = decimalFormat2.parse(decimalFormat2.format(d), new ParsePosition(0)).doubleValue();
            }
            return d;
        } else {
            DecimalFormat decimalFormat3 = new DecimalFormat("0.00");
            d = decimalFormat3.parse(decimalFormat3.format(d), new ParsePosition(0)).doubleValue();
        }
        return d;
    }

    /* renamed from: a */
    public static String m34554a(byte[] bArr) {
        StringBuilder sb = new StringBuilder("");
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & SmileConstants.BYTE_MARKER_END_OF_CONTENT);
            if (hexString.length() < 2) {
                sb.append(0);
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static byte[] m34555a(String str) {
        if (str == null || str.equals("")) {
            return null;
        }
        String upperCase = str.toUpperCase();
        int length = upperCase.length() / 2;
        char[] charArray = upperCase.toCharArray();
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (m34558a(charArray[i2 + 1]) | (m34558a(charArray[i2]) << 4));
        }
        return bArr;
    }

    /* renamed from: b */
    public static double m34553b(double d) {
        return m34556a(d / 0.3048d, 1);
    }

    /* renamed from: b */
    public static String m34552b(double d, int i) {
        String str;
        try {
            if (i == 1) {
                DecimalFormat decimalFormat = new DecimalFormat("0.0");
                str = decimalFormat.parse(decimalFormat.format(d), new ParsePosition(0)).toString();
            } else if (i == 2) {
                DecimalFormat decimalFormat2 = new DecimalFormat("0.00");
                str = decimalFormat2.parse(decimalFormat2.format(d), new ParsePosition(0)).toString();
            } else if (i == 7) {
                DecimalFormat decimalFormat3 = new DecimalFormat("0.0000000");
                str = decimalFormat3.parse(decimalFormat3.format(d), new ParsePosition(0)).toString();
            } else {
                str = d + "";
            }
            return str;
        } catch (Exception e) {
            e.printStackTrace();
            return "0";
        }
    }

    /* renamed from: c */
    public static double m34551c(double d) {
        return m34556a(2.2369d * d, 1);
    }

    /* renamed from: d */
    public static double m34550d(double d) {
        return m34556a(d / 2.2369d, 1);
    }

    /* renamed from: e */
    public static double m34549e(double d) {
        return m34556a(0.3048d * d, 1);
    }
}
