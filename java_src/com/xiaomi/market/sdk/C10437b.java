package com.xiaomi.market.sdk;

import android.text.TextUtils;
import android.util.Base64;
import com.fimi.soul.utils.C3134q;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p005b.p006a.p007a.p029b.p052m.p053a.C0612f;
/* renamed from: com.xiaomi.market.sdk.b */
/* loaded from: classes2.dex */
public class C10437b {

    /* renamed from: p */
    static final String f32410p = "AES/CBC/PKCS5Padding";

    /* renamed from: q */
    private static final String[] f32411q = {"0", "1", "2", "3", "4", "5", "6", C3134q.f11824l, C3134q.f11825m, C3134q.f11826n, "a", "b", "c", C0612f.f1063a, "e", "f"};

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r4 = r4;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String m5144a(byte b) {
        int i;
        if (b < 0) {
            i = b + 256;
        }
        return String.valueOf(f32411q[i / 16]) + f32411q[i % 16];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static final String m5143a(File file) {
        FileInputStream fileInputStream;
        byte[] bArr = new byte[1024];
        try {
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                    while (true) {
                        int read = fileInputStream.read(bArr);
                        if (read <= 0) {
                            try {
                                break;
                            } catch (IOException e) {
                            }
                        } else {
                            messageDigest.update(bArr, 0, read);
                        }
                    }
                    return m5140a(messageDigest.digest());
                } catch (IOException e2) {
                    e2.printStackTrace();
                    try {
                        fileInputStream.close();
                        return null;
                    } catch (IOException e3) {
                        e3.printStackTrace();
                        return null;
                    }
                } catch (NoSuchAlgorithmException e4) {
                    e4.printStackTrace();
                    try {
                        fileInputStream.close();
                        return null;
                    } catch (IOException e5) {
                        e5.printStackTrace();
                        return null;
                    }
                }
            } finally {
                try {
                    fileInputStream.close();
                } catch (IOException e6) {
                    e6.printStackTrace();
                }
            }
        } catch (FileNotFoundException e7) {
            e7.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static final String m5142a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            return m5140a(messageDigest.digest());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    static final String m5141a(String str, String str2) {
        byte[] m5132g;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (m5132g = m5132g(str2)) == null || m5132g.length != 16) {
            return null;
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(m5132g, "AES");
        try {
            Cipher cipher = Cipher.getInstance(f32410p);
            cipher.init(1, secretKeySpec, new IvParameterSpec("0102030405060708".getBytes()));
            return m5137b(cipher.doFinal(str.getBytes()));
        } catch (InvalidAlgorithmParameterException e) {
            return null;
        } catch (InvalidKeyException e2) {
            return null;
        } catch (NoSuchAlgorithmException e3) {
            return null;
        } catch (BadPaddingException e4) {
            return null;
        } catch (IllegalBlockSizeException e5) {
            return null;
        } catch (NoSuchPaddingException e6) {
            return null;
        }
    }

    /* renamed from: a */
    private static String m5140a(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b : bArr) {
            stringBuffer.append(m5144a(b));
        }
        return stringBuffer.toString();
    }

    /* renamed from: b */
    static final String m5139b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA");
            messageDigest.update(str.getBytes());
            return m5140a(messageDigest.digest());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    static final String m5138b(String str, String str2) {
        byte[] m5132g;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (m5132g = m5132g(str2)) == null || m5132g.length != 16) {
            return null;
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(m5132g, "AES");
        try {
            Cipher cipher = Cipher.getInstance(f32410p);
            cipher.init(2, secretKeySpec, new IvParameterSpec("0102030405060708".getBytes()));
            byte[] m5132g2 = m5132g(str);
            if (m5132g2 == null) {
                return null;
            }
            return new String(cipher.doFinal(m5132g2));
        } catch (InvalidAlgorithmParameterException e) {
            return null;
        } catch (InvalidKeyException e2) {
            return null;
        } catch (NoSuchAlgorithmException e3) {
            return null;
        } catch (BadPaddingException e4) {
            return null;
        } catch (IllegalBlockSizeException e5) {
            return null;
        } catch (NoSuchPaddingException e6) {
            return null;
        }
    }

    /* renamed from: b */
    static final String m5137b(byte[] bArr) {
        return Base64.encodeToString(bArr, 2);
    }

    /* renamed from: c */
    static final byte[] m5136c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA");
            messageDigest.update(str.getBytes());
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: d */
    static final String m5135d(String str) {
        return Base64.encodeToString(str.getBytes(), 2);
    }

    /* renamed from: e */
    static final byte[] m5134e(String str) {
        return Base64.encode(str.getBytes(), 2);
    }

    /* renamed from: f */
    static final String m5133f(String str) {
        return new String(Base64.decode(str, 0));
    }

    /* renamed from: g */
    static final byte[] m5132g(String str) {
        return Base64.decode(str, 0);
    }
}
