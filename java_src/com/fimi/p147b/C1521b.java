package com.fimi.p147b;

import com.p079a.p080a.C0860aa;
import com.p079a.p080a.C0890w;
import com.p079a.p080a.C0892y;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
/* renamed from: com.fimi.b.b */
/* loaded from: classes.dex */
public class C1521b {

    /* renamed from: a */
    public static final int f3658a = 0;

    /* renamed from: b */
    public static final int f3659b = 1;

    /* renamed from: c */
    public static final int f3660c = 2;

    /* renamed from: d */
    public static final int f3661d = 3;

    /* renamed from: e */
    public static final int f3662e = 4;

    /* renamed from: f */
    public static final int f3663f = 5;

    /* renamed from: a */
    public static int m35377a(String str, String str2) {
        if (str == null || "".equals(str.trim())) {
            return 0;
        }
        File file = new File(str2);
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(str);
        if (!file2.exists()) {
            return 1;
        }
        try {
            C0892y c0892y = new C0892y(file2, "GBK");
            Enumeration<C0890w> m37466c = c0892y.m37466c();
            String absolutePath = file.getAbsolutePath();
            while (m37466c.hasMoreElements()) {
                m35378a(c0892y, m37466c.nextElement(), absolutePath);
            }
            return 3;
        } catch (IOException e) {
            e.printStackTrace();
            return 5;
        }
    }

    /* renamed from: a */
    public static int m35376a(String str, File[] fileArr) {
        C0860aa c0860aa;
        Throwable th;
        File file = new File(str);
        if (file.exists()) {
            return 4;
        }
        String absolutePath = file.getAbsolutePath();
        File file2 = new File(absolutePath.substring(0, absolutePath.lastIndexOf(File.separator)));
        if (!file2.exists()) {
            file2.mkdirs();
        }
        C0860aa c0860aa2 = null;
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            c0860aa = new C0860aa(new FileOutputStream(file));
        } catch (IOException e) {
        } catch (Throwable th2) {
            c0860aa = null;
            th = th2;
        }
        try {
            for (File file3 : fileArr) {
                if (file3.exists()) {
                    m35379a(c0860aa, file3, "");
                }
            }
            try {
                c0860aa.close();
                return 3;
            } catch (IOException e2) {
                file.delete();
                e2.printStackTrace();
                return 5;
            }
        } catch (IOException e3) {
            c0860aa2 = c0860aa;
            try {
                file.delete();
                try {
                    c0860aa2.close();
                    return 5;
                } catch (IOException e4) {
                    file.delete();
                    e4.printStackTrace();
                    return 5;
                }
            } catch (Throwable th3) {
                c0860aa = c0860aa2;
                th = th3;
                try {
                    c0860aa.close();
                    throw th;
                } catch (IOException e5) {
                    file.delete();
                    e5.printStackTrace();
                    return 5;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            c0860aa.close();
            throw th;
        }
    }

    /* renamed from: a */
    private static void m35379a(C0860aa c0860aa, File file, String str) {
        FileInputStream fileInputStream;
        if (file.isDirectory()) {
            String str2 = str + file.getName() + File.separator;
            for (File file2 : file.listFiles()) {
                m35379a(c0860aa, file2, str2);
            }
            return;
        }
        FileInputStream fileInputStream2 = null;
        try {
            c0860aa.m37647a(new C0890w(str + file.getName()));
            fileInputStream = new FileInputStream(file);
            try {
                try {
                    byte[] bArr = new byte[5120];
                    while (true) {
                        int read = fileInputStream.read(bArr);
                        if (read <= 0) {
                            try {
                                fileInputStream.close();
                                c0860aa.m37623d();
                                return;
                            } catch (IOException e) {
                                e.printStackTrace();
                                return;
                            }
                        }
                        c0860aa.write(bArr, 0, read);
                    }
                } catch (IOException e2) {
                    e = e2;
                    e.printStackTrace();
                    try {
                        fileInputStream.close();
                        c0860aa.m37623d();
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                }
            } catch (Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
                try {
                    fileInputStream2.close();
                    c0860aa.m37623d();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
                throw th;
            }
        } catch (IOException e5) {
            e = e5;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2.close();
            c0860aa.m37623d();
            throw th;
        }
    }

    /* renamed from: a */
    private static void m35378a(C0892y c0892y, C0890w c0890w, String str) {
        String str2;
        FileOutputStream fileOutputStream;
        InputStream inputStream;
        InputStream inputStream2 = null;
        byte[] bArr = new byte[5120];
        String name = c0890w.getName();
        String str3 = "";
        if (c0890w.isDirectory()) {
            File file = new File(str + File.separator + name);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        int lastIndexOf = name.lastIndexOf(File.separator);
        if (lastIndexOf != -1) {
            str2 = name.substring(lastIndexOf, name.length());
            str3 = name.substring(0, lastIndexOf);
            File file2 = new File(str + File.separator + str3);
            if (!file2.exists()) {
                file2.mkdirs();
            }
        } else {
            str2 = name;
        }
        File file3 = new File(str + File.separator + str3 + str2);
        try {
            inputStream = c0892y.m37469b(c0890w);
            try {
                if (!file3.exists()) {
                    file3.createNewFile();
                }
                fileOutputStream = new FileOutputStream(file3);
                while (true) {
                    try {
                        int read = inputStream.read(bArr);
                        if (read <= 0) {
                            try {
                                inputStream.close();
                                fileOutputStream.close();
                                return;
                            } catch (IOException e) {
                                new File(str).delete();
                                e.printStackTrace();
                                return;
                            }
                        }
                        fileOutputStream.write(bArr, 0, read);
                    } catch (Exception e2) {
                        e = e2;
                        inputStream2 = inputStream;
                        try {
                            new File(str).delete();
                            e.printStackTrace();
                            try {
                                inputStream2.close();
                                fileOutputStream.close();
                                return;
                            } catch (IOException e3) {
                                new File(str).delete();
                                e3.printStackTrace();
                                return;
                            }
                        } catch (Throwable th) {
                            th = th;
                            inputStream = inputStream2;
                            try {
                                inputStream.close();
                                fileOutputStream.close();
                            } catch (IOException e4) {
                                new File(str).delete();
                                e4.printStackTrace();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream.close();
                        fileOutputStream.close();
                        throw th;
                    }
                }
            } catch (Exception e5) {
                e = e5;
                fileOutputStream = null;
                inputStream2 = inputStream;
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
            }
        } catch (Exception e6) {
            e = e6;
            fileOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
            inputStream = null;
        }
    }
}
