package com.xiaomi.channel.commonutils.string;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;
/* renamed from: com.xiaomi.channel.commonutils.string.d */
/* loaded from: classes2.dex */
public class C10433d {
    /* renamed from: a */
    public static String m5177a(int i) {
        Random random = new Random();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < i; i2++) {
            stringBuffer.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".charAt(random.nextInt("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".length())));
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public static String m5176a(String str) {
        if (str != null) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(m5171c(str));
                return String.format("%1$032X", new BigInteger(1, messageDigest.digest()));
            } catch (NoSuchAlgorithmException e) {
                return str;
            }
        }
        return "";
    }

    /* renamed from: a */
    public static String m5175a(Collection<?> collection, String str) {
        if (collection == null) {
            return null;
        }
        return m5174a(collection.iterator(), str);
    }

    /* renamed from: a */
    public static String m5174a(Iterator<?> it2, String str) {
        if (it2 == null) {
            return null;
        }
        if (!it2.hasNext()) {
            return "";
        }
        Object next = it2.next();
        if (!it2.hasNext()) {
            return next.toString();
        }
        StringBuffer stringBuffer = new StringBuffer(256);
        if (next != null) {
            stringBuffer.append(next);
        }
        while (it2.hasNext()) {
            if (str != null) {
                stringBuffer.append(str);
            }
            Object next2 = it2.next();
            if (next2 != null) {
                stringBuffer.append(next2);
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public static String m5173a(byte[] bArr) {
        String str = "";
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            str = String.format("%1$032X", new BigInteger(1, messageDigest.digest()));
        } catch (Exception e) {
        }
        return str.toLowerCase();
    }

    /* renamed from: b */
    public static String m5172b(String str) {
        if (str != null) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
                messageDigest.update(m5171c(str));
                return String.format("%1$032X", new BigInteger(1, messageDigest.digest()));
            } catch (NoSuchAlgorithmException e) {
                return str;
            }
        }
        return null;
    }

    /* renamed from: c */
    public static byte[] m5171c(String str) {
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            return str.getBytes();
        }
    }

    /* renamed from: d */
    public static boolean m5170d(String str) {
        if (str != null) {
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (charAt < 0 || charAt > 127) {
                    return false;
                }
            }
        }
        return true;
    }
}
