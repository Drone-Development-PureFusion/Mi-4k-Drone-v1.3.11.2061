package com.fimi.soul.utils;

import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
/* renamed from: com.fimi.soul.utils.j */
/* loaded from: classes.dex */
public class C3126j {

    /* renamed from: a */
    private static final String f11667a = "0123456789ABCDEF";

    /* renamed from: a */
    public static String m29079a(String str, String str2) {
        try {
            return new String(m29074b(m29080a(str), str2));
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }

    /* renamed from: a */
    private static String m29077a(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(bArr.length * 2);
        for (byte b : bArr) {
            m29078a(stringBuffer, b);
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    private static void m29078a(StringBuffer stringBuffer, byte b) {
        stringBuffer.append(f11667a.charAt((b >> 4) & 15)).append(f11667a.charAt(b & 15));
    }

    /* renamed from: a */
    private static byte[] m29080a(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr[i] = Integer.valueOf(str.substring(i * 2, (i * 2) + 2), 16).byteValue();
        }
        return bArr;
    }

    /* renamed from: a */
    private static byte[] m29076a(byte[] bArr, String str) {
        try {
            SecureRandom secureRandom = new SecureRandom();
            SecretKey generateSecret = SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(str.getBytes("utf-8")));
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(1, generateSecret, secureRandom);
            return cipher.doFinal(bArr);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public static String m29075b(String str, String str2) {
        try {
            return m29077a(m29076a(str.getBytes("utf-8"), str2));
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }

    /* renamed from: b */
    private static byte[] m29074b(byte[] bArr, String str) {
        SecureRandom secureRandom = new SecureRandom();
        SecretKey generateSecret = SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(str.getBytes("utf-8")));
        Cipher cipher = Cipher.getInstance("DES");
        cipher.init(2, generateSecret, secureRandom);
        return cipher.doFinal(bArr);
    }
}
