package com.fimi.kernel.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p005b.p006a.p007a.p029b.p042h.p044b.AbstractC0518e;
/* renamed from: com.fimi.kernel.utils.a */
/* loaded from: classes.dex */
public class C1651a {

    /* renamed from: a */
    private static int f4089a = 128;

    /* renamed from: b */
    private static String f4090b = "AES";

    /* renamed from: a */
    public static boolean m34850a(String str, String str2, String str3) {
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream;
        byte[] m34849a;
        FileOutputStream fileOutputStream2 = null;
        fileOutputStream2 = null;
        fileOutputStream2 = null;
        fileOutputStream2 = null;
        fileOutputStream2 = null;
        fileOutputStream2 = null;
        fileOutputStream2 = null;
        FileInputStream fileInputStream2 = null;
        fileOutputStream2 = null;
        fileOutputStream2 = null;
        fileOutputStream2 = null;
        boolean z = true;
        try {
            try {
                File file = new File(str2);
                fileInputStream = new FileInputStream(file);
                try {
                    byte[] bArr = new byte[(int) file.length()];
                    fileInputStream.read(bArr);
                    m34849a = m34849a(str, bArr);
                    fileOutputStream = new FileOutputStream(str3);
                } catch (FileNotFoundException e) {
                    e = e;
                    fileOutputStream = null;
                    fileInputStream2 = fileInputStream;
                } catch (IOException e2) {
                    e = e2;
                } catch (Exception e3) {
                    e = e3;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                fileOutputStream.write(m34849a);
                if (fileInputStream != null && fileOutputStream != null) {
                    try {
                        fileInputStream.close();
                        fileOutputStream.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                }
            } catch (FileNotFoundException e5) {
                e = e5;
                fileInputStream2 = fileInputStream;
                try {
                    e.printStackTrace();
                    if (fileInputStream2 != null && fileOutputStream != null) {
                        try {
                            fileInputStream2.close();
                            fileOutputStream.close();
                        } catch (IOException e6) {
                            e6.printStackTrace();
                            return false;
                        }
                    }
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    fileOutputStream2 = fileOutputStream;
                    if (fileInputStream != null && fileOutputStream2 != null) {
                        try {
                            fileInputStream.close();
                            fileOutputStream2.close();
                        } catch (IOException e7) {
                            e7.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (IOException e8) {
                e = e8;
                fileOutputStream2 = fileOutputStream;
                e.printStackTrace();
                if (fileInputStream != null && fileOutputStream2 != null) {
                    try {
                        fileInputStream.close();
                        fileOutputStream2.close();
                    } catch (IOException e9) {
                        e9.printStackTrace();
                        z = false;
                    }
                }
                z = false;
                return z;
            } catch (Exception e10) {
                e = e10;
                fileOutputStream2 = fileOutputStream;
                e.printStackTrace();
                if (fileInputStream != null && fileOutputStream2 != null) {
                    try {
                        fileInputStream.close();
                        fileOutputStream2.close();
                    } catch (IOException e11) {
                        e11.printStackTrace();
                        z = false;
                    }
                }
                z = false;
                return z;
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream2 = fileOutputStream;
                if (fileInputStream != null) {
                    fileInputStream.close();
                    fileOutputStream2.close();
                }
                throw th;
            }
        } catch (FileNotFoundException e12) {
            e = e12;
            fileOutputStream = null;
        } catch (IOException e13) {
            e = e13;
            fileInputStream = null;
        } catch (Exception e14) {
            e = e14;
            fileInputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileInputStream = null;
        }
        return z;
    }

    /* renamed from: a */
    public static byte[] m34849a(String str, byte[] bArr) {
        return m34847a(m34848a(str.getBytes()), bArr);
    }

    /* renamed from: a */
    private static byte[] m34848a(byte[] bArr) {
        KeyGenerator keyGenerator = KeyGenerator.getInstance(f4090b);
        SecureRandom secureRandom = SecureRandom.getInstance(AbstractC0518e.f805d, "Crypto");
        secureRandom.setSeed(bArr);
        keyGenerator.init(f4089a, secureRandom);
        return keyGenerator.generateKey().getEncoded();
    }

    /* renamed from: a */
    private static byte[] m34847a(byte[] bArr, byte[] bArr2) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, f4090b);
        Cipher cipher = Cipher.getInstance(f4090b);
        cipher.init(1, secretKeySpec, new IvParameterSpec(new byte[cipher.getBlockSize()]));
        return cipher.doFinal(bArr2);
    }

    /* renamed from: b */
    public static boolean m34846b(String str, String str2, String str3) {
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream;
        byte[] m34845b;
        FileOutputStream fileOutputStream2 = null;
        fileOutputStream2 = null;
        fileOutputStream2 = null;
        fileOutputStream2 = null;
        fileOutputStream2 = null;
        fileOutputStream2 = null;
        fileOutputStream2 = null;
        FileInputStream fileInputStream2 = null;
        fileOutputStream2 = null;
        fileOutputStream2 = null;
        fileOutputStream2 = null;
        boolean z = true;
        try {
            try {
                File file = new File(str2);
                fileInputStream = new FileInputStream(file);
                try {
                    byte[] bArr = new byte[(int) file.length()];
                    fileInputStream.read(bArr);
                    m34845b = m34845b(str, bArr);
                    fileOutputStream = new FileOutputStream(str3);
                } catch (FileNotFoundException e) {
                    e = e;
                    fileOutputStream = null;
                    fileInputStream2 = fileInputStream;
                } catch (IOException e2) {
                    e = e2;
                } catch (Exception e3) {
                    e = e3;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                fileOutputStream.write(m34845b);
                if (fileInputStream != null && fileOutputStream != null) {
                    try {
                        fileInputStream.close();
                        fileOutputStream.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                }
            } catch (FileNotFoundException e5) {
                e = e5;
                fileInputStream2 = fileInputStream;
                try {
                    e.printStackTrace();
                    if (fileInputStream2 != null && fileOutputStream != null) {
                        try {
                            fileInputStream2.close();
                            fileOutputStream.close();
                        } catch (IOException e6) {
                            e6.printStackTrace();
                            return false;
                        }
                    }
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    fileOutputStream2 = fileOutputStream;
                    if (fileInputStream != null && fileOutputStream2 != null) {
                        try {
                            fileInputStream.close();
                            fileOutputStream2.close();
                        } catch (IOException e7) {
                            e7.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (IOException e8) {
                e = e8;
                fileOutputStream2 = fileOutputStream;
                e.printStackTrace();
                if (fileInputStream != null && fileOutputStream2 != null) {
                    try {
                        fileInputStream.close();
                        fileOutputStream2.close();
                    } catch (IOException e9) {
                        e9.printStackTrace();
                        z = false;
                    }
                }
                z = false;
                return z;
            } catch (Exception e10) {
                e = e10;
                fileOutputStream2 = fileOutputStream;
                e.printStackTrace();
                if (fileInputStream != null && fileOutputStream2 != null) {
                    try {
                        fileInputStream.close();
                        fileOutputStream2.close();
                    } catch (IOException e11) {
                        e11.printStackTrace();
                        z = false;
                    }
                }
                z = false;
                return z;
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream2 = fileOutputStream;
                if (fileInputStream != null) {
                    fileInputStream.close();
                    fileOutputStream2.close();
                }
                throw th;
            }
        } catch (FileNotFoundException e12) {
            e = e12;
            fileOutputStream = null;
        } catch (IOException e13) {
            e = e13;
            fileInputStream = null;
        } catch (Exception e14) {
            e = e14;
            fileInputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileInputStream = null;
        }
        return z;
    }

    /* renamed from: b */
    public static byte[] m34845b(String str, byte[] bArr) {
        return m34844b(m34848a(str.getBytes()), bArr);
    }

    /* renamed from: b */
    private static byte[] m34844b(byte[] bArr, byte[] bArr2) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, f4090b);
        Cipher cipher = Cipher.getInstance(f4090b);
        cipher.init(2, secretKeySpec, new IvParameterSpec(new byte[cipher.getBlockSize()]));
        return cipher.doFinal(bArr2);
    }
}
