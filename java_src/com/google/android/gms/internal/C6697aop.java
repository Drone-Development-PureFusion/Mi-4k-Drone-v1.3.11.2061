package com.google.android.gms.internal;

import java.util.Locale;
import org.codehaus.jackson.smile.SmileConstants;
/* renamed from: com.google.android.gms.internal.aop */
/* loaded from: classes2.dex */
public class C6697aop {
    /* renamed from: a */
    public static String m16467a(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            if ((b & 240) == 0) {
                sb.append("0");
            }
            sb.append(Integer.toHexString(b & SmileConstants.BYTE_MARKER_END_OF_CONTENT));
        }
        return sb.toString().toUpperCase(Locale.ENGLISH);
    }

    /* renamed from: a */
    public static byte[] m16468a(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("purported base16 string has odd number of characters");
        }
        byte[] bArr = new byte[length / 2];
        for (int i = 0; i < length; i += 2) {
            int digit = Character.digit(str.charAt(i), 16);
            int digit2 = Character.digit(str.charAt(i + 1), 16);
            if (digit == -1 || digit2 == -1) {
                throw new IllegalArgumentException("purported base16 string has illegal char");
            }
            bArr[i / 2] = (byte) ((digit << 4) + digit2);
        }
        return bArr;
    }
}
