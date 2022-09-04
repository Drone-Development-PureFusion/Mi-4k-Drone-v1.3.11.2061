package com.google.android.gms.common.util;

import com.google.android.gms.common.internal.C4585c;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Arrays;
/* renamed from: com.google.android.gms.common.util.b */
/* loaded from: classes2.dex */
public final class C4679b {
    /* renamed from: a */
    public static <T> int m23163a(T[] tArr, T t) {
        int length = tArr != null ? tArr.length : 0;
        for (int i = 0; i < length; i++) {
            if (C4585c.m23634a(tArr[i], t)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static <T> ArrayList<T> m23173a() {
        return new ArrayList<>();
    }

    /* renamed from: a */
    public static <T> ArrayList<T> m23164a(T[] tArr) {
        ArrayList<T> arrayList = new ArrayList<>(tArr.length);
        for (T t : tArr) {
            arrayList.add(t);
        }
        return arrayList;
    }

    /* renamed from: a */
    public static void m23172a(StringBuilder sb, double[] dArr) {
        int length = dArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
            sb.append(Double.toString(dArr[i]));
        }
    }

    /* renamed from: a */
    public static void m23171a(StringBuilder sb, float[] fArr) {
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
            sb.append(Float.toString(fArr[i]));
        }
    }

    /* renamed from: a */
    public static void m23170a(StringBuilder sb, int[] iArr) {
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
            sb.append(Integer.toString(iArr[i]));
        }
    }

    /* renamed from: a */
    public static void m23169a(StringBuilder sb, long[] jArr) {
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
            sb.append(Long.toString(jArr[i]));
        }
    }

    /* renamed from: a */
    public static <T> void m23168a(StringBuilder sb, T[] tArr) {
        int length = tArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
            sb.append(tArr[i].toString());
        }
    }

    /* renamed from: a */
    public static void m23167a(StringBuilder sb, String[] strArr) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
            sb.append("\"").append(strArr[i]).append("\"");
        }
    }

    /* renamed from: a */
    public static void m23166a(StringBuilder sb, boolean[] zArr) {
        int length = zArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
            sb.append(Boolean.toString(zArr[i]));
        }
    }

    /* renamed from: a */
    public static byte[] m23162a(byte[]... bArr) {
        if (bArr.length == 0) {
            return new byte[0];
        }
        int i = 0;
        for (byte[] bArr2 : bArr) {
            i += bArr2.length;
        }
        byte[] copyOf = Arrays.copyOf(bArr[0], i);
        int length = bArr[0].length;
        for (int i2 = 1; i2 < bArr.length; i2++) {
            byte[] bArr3 = bArr[i2];
            System.arraycopy(bArr3, 0, copyOf, length, bArr3.length);
            length += bArr3.length;
        }
        return copyOf;
    }

    /* renamed from: a */
    public static Integer[] m23165a(int[] iArr) {
        if (iArr == null) {
            return null;
        }
        int length = iArr.length;
        Integer[] numArr = new Integer[length];
        for (int i = 0; i < length; i++) {
            numArr[i] = Integer.valueOf(iArr[i]);
        }
        return numArr;
    }

    /* renamed from: b */
    public static <T> boolean m23161b(T[] tArr, T t) {
        return m23163a(tArr, t) >= 0;
    }
}
