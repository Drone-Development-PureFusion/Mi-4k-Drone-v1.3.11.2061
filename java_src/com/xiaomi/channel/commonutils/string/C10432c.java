package com.xiaomi.channel.commonutils.string;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/* renamed from: com.xiaomi.channel.commonutils.string.c */
/* loaded from: classes.dex */
public class C10432c {
    /* renamed from: a */
    private static String m5180a(byte b) {
        int i = (b & Byte.MAX_VALUE) + (b < 0 ? 128 : 0);
        return (i < 16 ? "0" : "") + Integer.toHexString(i).toLowerCase();
    }

    /* renamed from: a */
    public static String m5179a(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            StringBuffer stringBuffer = new StringBuffer();
            messageDigest.update(str.getBytes(), 0, str.length());
            for (byte b : messageDigest.digest()) {
                stringBuffer.append(m5180a(b));
            }
            return stringBuffer.toString();
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
    }

    /* renamed from: b */
    public static String m5178b(String str) {
        return m5179a(str).subSequence(8, 24).toString();
    }
}
