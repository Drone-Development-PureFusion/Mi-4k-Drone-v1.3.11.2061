package com.xiaomi.channel.commonutils.file;

import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.Date;
import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
/* renamed from: com.xiaomi.channel.commonutils.file.a */
/* loaded from: classes.dex */
public class C10400a {

    /* renamed from: a */
    public static final String[] f32327a = {"jpg", "png", "bmp", "gif", "webp"};

    /* renamed from: a */
    public static void m5289a(ParcelFileDescriptor parcelFileDescriptor) {
        if (parcelFileDescriptor != null) {
            try {
                parcelFileDescriptor.close();
            } catch (IOException e) {
            }
        }
    }

    /* renamed from: a */
    public static void m5288a(File file, File file2) {
        ZipOutputStream zipOutputStream;
        ZipOutputStream zipOutputStream2 = null;
        try {
            try {
                zipOutputStream = new ZipOutputStream(new FileOutputStream(file, false));
                zipOutputStream2 = null;
            } catch (Throwable th) {
                th = th;
            }
        } catch (FileNotFoundException e) {
            zipOutputStream = null;
        } catch (IOException e2) {
            e = e2;
        }
        try {
            m5283a(zipOutputStream, file2, null, null);
            m5286a(zipOutputStream);
        } catch (FileNotFoundException e3) {
            m5286a(zipOutputStream);
        } catch (IOException e4) {
            zipOutputStream2 = zipOutputStream;
            e = e4;
            AbstractC10404b.m5269a("zip file failure + " + e.getMessage());
            m5286a(zipOutputStream2);
        } catch (Throwable th2) {
            zipOutputStream2 = zipOutputStream;
            th = th2;
            m5286a(zipOutputStream2);
            throw th;
        }
    }

    /* renamed from: a */
    public static void m5287a(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
            }
        }
    }

    /* renamed from: a */
    public static void m5286a(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.flush();
            } catch (IOException e) {
            }
            try {
                outputStream.close();
            } catch (IOException e2) {
            }
        }
    }

    /* renamed from: a */
    public static void m5285a(Reader reader) {
        if (reader != null) {
            try {
                reader.close();
            } catch (IOException e) {
            }
        }
    }

    /* renamed from: a */
    public static void m5284a(Writer writer) {
        if (writer != null) {
            try {
                writer.close();
            } catch (IOException e) {
            }
        }
    }

    /* renamed from: a */
    public static void m5283a(ZipOutputStream zipOutputStream, File file, String str, FileFilter fileFilter) {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        if (str == null) {
            str = "";
        }
        try {
            try {
                if (file.isDirectory()) {
                    File[] listFiles = fileFilter != null ? file.listFiles(fileFilter) : file.listFiles();
                    zipOutputStream.putNextEntry(new ZipEntry(str + File.separator));
                    String str2 = TextUtils.isEmpty(str) ? "" : str + File.separator;
                    for (int i = 0; i < listFiles.length; i++) {
                        m5283a(zipOutputStream, listFiles[i], str2 + listFiles[i].getName(), null);
                    }
                    File[] listFiles2 = file.listFiles(new C10401b());
                    if (listFiles2 != null) {
                        for (File file2 : listFiles2) {
                            m5283a(zipOutputStream, file2, str2 + File.separator + file2.getName(), fileFilter);
                        }
                    }
                    fileInputStream = null;
                } else {
                    if (!TextUtils.isEmpty(str)) {
                        zipOutputStream.putNextEntry(new ZipEntry(str));
                    } else {
                        zipOutputStream.putNextEntry(new ZipEntry(String.valueOf(new Date().getTime()) + ".txt"));
                    }
                    fileInputStream = new FileInputStream(file);
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int read = fileInputStream.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            zipOutputStream.write(bArr, 0, read);
                        }
                    } catch (IOException e) {
                        fileInputStream2 = fileInputStream;
                        e = e;
                        AbstractC10404b.m5264d("zipFiction failed with exception:" + e.toString());
                        m5287a(fileInputStream2);
                        return;
                    } catch (Throwable th) {
                        fileInputStream2 = fileInputStream;
                        th = th;
                        m5287a(fileInputStream2);
                        throw th;
                    }
                }
                m5287a(fileInputStream);
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: a */
    public static byte[] m5282a(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.finish();
            gZIPOutputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Exception e) {
            return bArr;
        }
    }

    /* renamed from: b */
    public static byte[] m5281b(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, 8192);
                if (read <= 0) {
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, read);
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            } finally {
                m5287a(inputStream);
                m5286a(byteArrayOutputStream);
            }
        }
    }
}
