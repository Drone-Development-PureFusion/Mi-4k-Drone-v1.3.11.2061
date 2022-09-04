package com.fimi.kernel.utils;

import java.io.File;
import java.io.FileInputStream;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/* renamed from: com.fimi.kernel.utils.m */
/* loaded from: classes.dex */
public class C1672m {

    /* renamed from: a */
    protected static char[] f4133a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b */
    protected static MessageDigest f4134b;

    static {
        f4134b = null;
        try {
            f4134b = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
        }
    }

    /* renamed from: a */
    public static String m34669a(File file) {
        f4134b.update(new FileInputStream(file).getChannel().map(FileChannel.MapMode.READ_ONLY, 0L, file.length()));
        return m34662b(f4134b.digest());
    }

    /* renamed from: a */
    public static String m34668a(String str) {
        return m34666a(str.getBytes());
    }

    /* renamed from: a */
    public static String m34666a(byte[] bArr) {
        f4134b.update(bArr);
        return m34662b(f4134b.digest());
    }

    /* renamed from: a */
    private static String m34665a(byte[] bArr, int i, int i2) {
        StringBuffer stringBuffer = new StringBuffer(i2 * 2);
        int i3 = i + i2;
        while (i < i3) {
            m34670a(bArr[i], stringBuffer);
            i++;
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    private static void m34670a(byte b, StringBuffer stringBuffer) {
        char c = f4133a[(b & 240) >> 4];
        char c2 = f4133a[b & 15];
        stringBuffer.append(c);
        stringBuffer.append(c2);
    }

    /* renamed from: a */
    public static void m34664a(String[] strArr) {
        System.out.println(m34663b("2011123456").toLowerCase());
    }

    /* renamed from: a */
    public static boolean m34667a(String str, String str2) {
        return m34668a(str).equals(str2);
    }

    /* renamed from: b */
    public static final String m34663b(String str) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        try {
            byte[] bytes = str.getBytes();
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bytes);
            byte[] digest = messageDigest.digest();
            char[] cArr2 = new char[32];
            int i = 0;
            for (int i2 = 0; i2 < 16; i2++) {
                byte b = digest[i2];
                int i3 = i + 1;
                cArr2[i] = cArr[(b >>> 4) & 15];
                i = i3 + 1;
                cArr2[i3] = cArr[b & 15];
            }
            return new String(cArr2).toUpperCase();
        } catch (Exception e) {
            return null;
        }
    }

    /* renamed from: b */
    private static String m34662b(byte[] bArr) {
        return m34665a(bArr, 0, bArr.length);
    }
}
