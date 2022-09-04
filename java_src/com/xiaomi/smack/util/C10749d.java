package com.xiaomi.smack.util;

import android.text.TextUtils;
import com.xiaomi.channel.commonutils.string.C10430a;
import java.util.Random;
/* renamed from: com.xiaomi.smack.util.d */
/* loaded from: classes.dex */
public class C10749d {

    /* renamed from: a */
    private static final char[] f33549a = "&quot;".toCharArray();

    /* renamed from: b */
    private static final char[] f33550b = "&apos;".toCharArray();

    /* renamed from: c */
    private static final char[] f33551c = "&amp;".toCharArray();

    /* renamed from: d */
    private static final char[] f33552d = "&lt;".toCharArray();

    /* renamed from: e */
    private static final char[] f33553e = "&gt;".toCharArray();

    /* renamed from: f */
    private static Random f33554f = new Random();

    /* renamed from: g */
    private static char[] f33555g = "0123456789abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    /* renamed from: a */
    public static String m3839a(int i) {
        if (i < 1) {
            return null;
        }
        char[] cArr = new char[i];
        for (int i2 = 0; i2 < cArr.length; i2++) {
            cArr[i2] = f33555g[f33554f.nextInt(71)];
        }
        return new String(cArr);
    }

    /* renamed from: a */
    public static String m3838a(String str) {
        int i = 0;
        if (str == null) {
            return null;
        }
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        StringBuilder sb = new StringBuilder((int) (length * 1.3d));
        int i2 = 0;
        while (i2 < length) {
            char c = charArray[i2];
            if (c <= '>') {
                if (c == '<') {
                    if (i2 > i) {
                        sb.append(charArray, i, i2 - i);
                    }
                    i = i2 + 1;
                    sb.append(f33552d);
                } else if (c == '>') {
                    if (i2 > i) {
                        sb.append(charArray, i, i2 - i);
                    }
                    i = i2 + 1;
                    sb.append(f33553e);
                } else if (c == '&') {
                    if (i2 > i) {
                        sb.append(charArray, i, i2 - i);
                    }
                    if (length <= i2 + 5 || charArray[i2 + 1] != '#' || !Character.isDigit(charArray[i2 + 2]) || !Character.isDigit(charArray[i2 + 3]) || !Character.isDigit(charArray[i2 + 4]) || charArray[i2 + 5] != ';') {
                        i = i2 + 1;
                        sb.append(f33551c);
                    }
                } else if (c == '\"') {
                    if (i2 > i) {
                        sb.append(charArray, i, i2 - i);
                    }
                    i = i2 + 1;
                    sb.append(f33549a);
                } else if (c == '\'') {
                    if (i2 > i) {
                        sb.append(charArray, i, i2 - i);
                    }
                    i = i2 + 1;
                    sb.append(f33550b);
                }
            }
            i2++;
        }
        if (i == 0) {
            return str;
        }
        if (i2 > i) {
            sb.append(charArray, i, i2 - i);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static final String m3837a(String str, String str2, String str3) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(str2, 0);
        if (indexOf < 0) {
            return str;
        }
        char[] charArray = str.toCharArray();
        char[] charArray2 = str3.toCharArray();
        int length = str2.length();
        StringBuilder sb = new StringBuilder(charArray.length);
        sb.append(charArray, 0, indexOf).append(charArray2);
        int i = indexOf + length;
        while (true) {
            int indexOf2 = str.indexOf(str2, i);
            if (indexOf2 <= 0) {
                sb.append(charArray, i, charArray.length - i);
                return sb.toString();
            }
            sb.append(charArray, i, indexOf2 - i).append(charArray2);
            i = indexOf2 + length;
        }
    }

    /* renamed from: a */
    public static String m3836a(byte[] bArr) {
        return String.valueOf(C10430a.m5186a(bArr));
    }

    /* renamed from: a */
    public static boolean m3840a(char c) {
        return (c >= ' ' && c <= 55295) || (c >= 57344 && c <= 65533) || ((c >= 0 && c <= 65535) || c == '\t' || c == '\n' || c == '\r');
    }

    /* renamed from: b */
    public static final String m3835b(String str) {
        return m3837a(m3837a(m3837a(m3837a(m3837a(str, "&lt;", "<"), "&gt;", ">"), "&quot;", "\""), "&apos;", "'"), "&amp;", "&");
    }

    /* renamed from: c */
    public static String m3834c(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (m3840a(charAt)) {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }
}
