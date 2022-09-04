package p005b.p006a.p007a.p029b.p058r;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import p005b.p006a.p007a.p029b.AbstractC0427f;
import p005b.p006a.p007a.p029b.p052m.C0634f;
import p005b.p006a.p007a.p029b.p055o.C0662f;
/* renamed from: b.a.a.b.r.o */
/* loaded from: classes.dex */
public class C0716o extends C0662f {

    /* renamed from: a */
    static final int f1304a = 32768;

    public C0716o(AbstractC0427f abstractC0427f) {
        a(abstractC0427f);
    }

    /* renamed from: a */
    public static String m38407a(String str, String str2) {
        return (str == null || C0724u.m38372e(str.trim()) || new File(str2).isAbsolute()) ? str2 : str + "/" + str2;
    }

    /* renamed from: a */
    public static URL m38408a(File file) {
        try {
            return file.toURI().toURL();
        } catch (MalformedURLException e) {
            throw new RuntimeException("Unexpected exception on file [" + file + "]", e);
        }
    }

    /* renamed from: b */
    public static boolean m38406b(File file) {
        File parentFile = file.getParentFile();
        return parentFile != null && !parentFile.exists();
    }

    /* renamed from: c */
    public static boolean m38404c(File file) {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            throw new IllegalStateException(file + " should not have a null parent");
        }
        if (!parentFile.exists()) {
            return parentFile.mkdirs();
        }
        throw new IllegalStateException(file + " should not have existing parent directory");
    }

    /* renamed from: b */
    public void m38405b(String str, String str2) {
        BufferedOutputStream bufferedOutputStream;
        BufferedInputStream bufferedInputStream = null;
        try {
            try {
                BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(str));
                try {
                    bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(str2));
                    try {
                        byte[] bArr = new byte[32768];
                        while (true) {
                            int read = bufferedInputStream2.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            bufferedOutputStream.write(bArr, 0, read);
                        }
                        bufferedInputStream2.close();
                        BufferedInputStream bufferedInputStream3 = null;
                        try {
                            bufferedOutputStream.close();
                            BufferedOutputStream bufferedOutputStream2 = null;
                            if (0 != 0) {
                                try {
                                    bufferedInputStream3.close();
                                } catch (IOException e) {
                                }
                            }
                            if (0 == 0) {
                                return;
                            }
                            try {
                                bufferedOutputStream2.close();
                            } catch (IOException e2) {
                            }
                        } catch (IOException e3) {
                            e = e3;
                            String str3 = "Failed to copy [" + str + "] to [" + str2 + "]";
                            a(str3, e);
                            throw new C0634f(str3);
                        }
                    } catch (IOException e4) {
                        e = e4;
                    } catch (Throwable th) {
                        th = th;
                        bufferedInputStream = bufferedInputStream2;
                        if (bufferedInputStream != null) {
                            try {
                                bufferedInputStream.close();
                            } catch (IOException e5) {
                            }
                        }
                        if (bufferedOutputStream != null) {
                            try {
                                bufferedOutputStream.close();
                            } catch (IOException e6) {
                            }
                        }
                        throw th;
                    }
                } catch (IOException e7) {
                    e = e7;
                } catch (Throwable th2) {
                    th = th2;
                    bufferedOutputStream = null;
                    bufferedInputStream = bufferedInputStream2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e8) {
            e = e8;
        } catch (Throwable th4) {
            th = th4;
            bufferedOutputStream = null;
        }
    }
}
