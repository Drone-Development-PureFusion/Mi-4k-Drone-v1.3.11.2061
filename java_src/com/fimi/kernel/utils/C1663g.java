package com.fimi.kernel.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Environment;
import android.os.StatFs;
import com.fimi.kernel.C1576a;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.p286a.p287a.C11086e;
import p005b.p006a.p007a.p008a.p026n.C0363a;
/* renamed from: com.fimi.kernel.utils.g */
/* loaded from: classes.dex */
public class C1663g {

    /* renamed from: a */
    private static String f4121a = null;

    /* renamed from: b */
    private static String f4122b = null;

    /* renamed from: c */
    private static String f4123c = null;

    /* renamed from: d */
    private static String f4124d = null;

    /* renamed from: e */
    private static String f4125e = null;

    /* renamed from: f */
    private static int f4126f = 209715200;

    /* renamed from: com.fimi.kernel.utils.g$a */
    /* loaded from: classes.dex */
    public static class C1664a implements Comparator<File> {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(File file, File file2) {
            if (file.lastModified() > file2.lastModified()) {
                return 1;
            }
            return file.lastModified() == file2.lastModified() ? 0 : -1;
        }
    }

    /* renamed from: a */
    public static Bitmap m34767a(Context context, String str) {
        try {
            return BitmapFactory.decodeStream(context.getAssets().open(str));
        } catch (Exception e) {
            C1670k.m34711a(C1663g.class, "获取图片异常：" + e.getMessage());
            return null;
        }
    }

    /* renamed from: a */
    public static Bitmap m34765a(File file) {
        try {
            if (!m34770a() || !file.exists()) {
                return null;
            }
            return C1678s.m34581a(file);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static Bitmap m34764a(File file, int i, int i2, int i3) {
        Bitmap bitmap = null;
        try {
            if (m34770a() && file.exists()) {
                bitmap = i == 0 ? C1678s.m34567b(file, i2, i3) : i == 1 ? C1678s.m34580a(file, i2, i3) : C1678s.m34581a(file);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bitmap;
    }

    /* renamed from: a */
    public static Bitmap m34763a(String str) {
        try {
            return BitmapFactory.decodeStream(C1663g.class.getResourceAsStream(str));
        } catch (Exception e) {
            C1670k.m34711a(C1663g.class, "获取图片异常：" + e.getMessage());
            return null;
        }
    }

    /* renamed from: a */
    public static Bitmap m34762a(String str, int i, int i2, int i3) {
        Bitmap bitmap = null;
        try {
            if (!C1673n.m34653b(str)) {
                if (!m34770a() || f4126f < m34754b()) {
                    bitmap = m34749b(str, i, i2, i3);
                } else {
                    String m34761a = m34761a(str, f4122b);
                    if (m34761a != null) {
                        bitmap = m34764a(new File(m34761a), i, i2, i3);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bitmap;
    }

    /* renamed from: a */
    public static Bitmap m34755a(byte[] bArr, String str, int i, int i2, int i3) {
        FileOutputStream fileOutputStream;
        DataInputStream dataInputStream;
        ByteArrayInputStream byteArrayInputStream;
        DataInputStream dataInputStream2;
        Bitmap bitmap = null;
        try {
            if (bArr != null) {
                try {
                    File file = new File(f4122b + str);
                    if (!file.exists()) {
                        file.createNewFile();
                    }
                    fileOutputStream = new FileOutputStream(file);
                    try {
                        byteArrayInputStream = new ByteArrayInputStream(bArr);
                        try {
                            dataInputStream2 = new DataInputStream(byteArrayInputStream);
                            try {
                                byte[] bArr2 = new byte[1024];
                                while (true) {
                                    int read = dataInputStream2.read(bArr2);
                                    if (read == -1) {
                                        break;
                                    }
                                    fileOutputStream.write(bArr2, 0, read);
                                    try {
                                        Thread.sleep(500L);
                                    } catch (Exception e) {
                                    }
                                }
                                fileOutputStream.flush();
                                bitmap = m34764a(file, i, i2, i3);
                            } catch (Exception e2) {
                                e = e2;
                                e.printStackTrace();
                                if (dataInputStream2 != null) {
                                    try {
                                        dataInputStream2.close();
                                    } catch (Exception e3) {
                                    }
                                }
                                if (byteArrayInputStream != null) {
                                    try {
                                        byteArrayInputStream.close();
                                    } catch (Exception e4) {
                                    }
                                }
                                if (fileOutputStream != null) {
                                    try {
                                        fileOutputStream.close();
                                    } catch (Exception e5) {
                                    }
                                }
                                return bitmap;
                            }
                        } catch (Exception e6) {
                            e = e6;
                            dataInputStream2 = null;
                        } catch (Throwable th) {
                            dataInputStream = null;
                            th = th;
                            if (dataInputStream != null) {
                                try {
                                    dataInputStream.close();
                                } catch (Exception e7) {
                                }
                            }
                            if (byteArrayInputStream != null) {
                                try {
                                    byteArrayInputStream.close();
                                } catch (Exception e8) {
                                }
                            }
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (Exception e9) {
                                }
                            }
                            throw th;
                        }
                    } catch (Exception e10) {
                        e = e10;
                        byteArrayInputStream = null;
                        dataInputStream2 = null;
                    } catch (Throwable th2) {
                        byteArrayInputStream = null;
                        dataInputStream = null;
                        th = th2;
                    }
                } catch (Exception e11) {
                    e = e11;
                    byteArrayInputStream = null;
                    dataInputStream2 = null;
                    fileOutputStream = null;
                } catch (Throwable th3) {
                    byteArrayInputStream = null;
                    dataInputStream = null;
                    fileOutputStream = null;
                    th = th3;
                }
            } else {
                byteArrayInputStream = null;
                dataInputStream2 = null;
                fileOutputStream = null;
            }
            if (dataInputStream2 != null) {
                try {
                    dataInputStream2.close();
                } catch (Exception e12) {
                }
            }
            if (byteArrayInputStream != null) {
                try {
                    byteArrayInputStream.close();
                } catch (Exception e13) {
                }
            }
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (Exception e14) {
                }
            }
            return bitmap;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* renamed from: a */
    public static String m34768a(Context context, int i, String str) {
        BufferedReader bufferedReader;
        InputStreamReader inputStreamReader;
        BufferedReader bufferedReader2;
        try {
            try {
                inputStreamReader = new InputStreamReader(context.getResources().openRawResource(i));
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
            bufferedReader2 = null;
            inputStreamReader = null;
        } catch (Throwable th2) {
            th = th2;
            bufferedReader = null;
            inputStreamReader = null;
        }
        try {
            bufferedReader2 = new BufferedReader(inputStreamReader);
            try {
                StringBuffer stringBuffer = new StringBuffer();
                while (true) {
                    String readLine = bufferedReader2.readLine();
                    if (readLine == null) {
                        break;
                    }
                    stringBuffer.append(readLine);
                }
                String str2 = new String(stringBuffer.toString().getBytes(), str);
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        return str2;
                    }
                }
                if (inputStreamReader == null) {
                    return str2;
                }
                inputStreamReader.close();
                return str2;
            } catch (Exception e3) {
                e = e3;
                e.printStackTrace();
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (Exception e4) {
                        e4.printStackTrace();
                        return null;
                    }
                }
                if (inputStreamReader != null) {
                    inputStreamReader.close();
                }
                return null;
            }
        } catch (Exception e5) {
            e = e5;
            bufferedReader2 = null;
        } catch (Throwable th3) {
            th = th3;
            bufferedReader = null;
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (Exception e6) {
                    e6.printStackTrace();
                    throw th;
                }
            }
            if (inputStreamReader != null) {
                inputStreamReader.close();
            }
            throw th;
        }
    }

    /* renamed from: a */
    public static String m34766a(Context context, String str, String str2) {
        BufferedReader bufferedReader;
        InputStreamReader inputStreamReader;
        BufferedReader bufferedReader2;
        try {
            try {
                inputStreamReader = new InputStreamReader(context.getAssets().open(str));
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
            bufferedReader2 = null;
            inputStreamReader = null;
        } catch (Throwable th2) {
            th = th2;
            bufferedReader = null;
            inputStreamReader = null;
        }
        try {
            bufferedReader2 = new BufferedReader(inputStreamReader);
            try {
                StringBuffer stringBuffer = new StringBuffer();
                while (true) {
                    String readLine = bufferedReader2.readLine();
                    if (readLine == null) {
                        break;
                    }
                    stringBuffer.append(readLine);
                }
                String str3 = new String(stringBuffer.toString().getBytes(), str2);
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        return str3;
                    }
                }
                if (inputStreamReader == null) {
                    return str3;
                }
                inputStreamReader.close();
                return str3;
            } catch (Exception e3) {
                e = e3;
                e.printStackTrace();
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (Exception e4) {
                        e4.printStackTrace();
                        return null;
                    }
                }
                if (inputStreamReader != null) {
                    inputStreamReader.close();
                }
                return null;
            }
        } catch (Exception e5) {
            e = e5;
            bufferedReader2 = null;
        } catch (Throwable th3) {
            th = th3;
            bufferedReader = null;
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (Exception e6) {
                    e6.printStackTrace();
                    throw th;
                }
            }
            if (inputStreamReader != null) {
                inputStreamReader.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x0147 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0142 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x013d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x00df -> B:8:0x001a). Please submit an issue!!! */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m34761a(String str, String str2) {
        FileOutputStream fileOutputStream;
        InputStream inputStream;
        File file;
        HttpURLConnection httpURLConnection;
        String str3;
        File file2;
        String path;
        HttpURLConnection httpURLConnection2 = null;
        InputStream inputStream2 = null;
        FileOutputStream fileOutputStream2 = null;
        HttpURLConnection httpURLConnection3 = null;
        try {
        } catch (Exception e) {
            e = e;
            file = null;
            httpURLConnection = null;
            fileOutputStream = null;
            inputStream = null;
        } catch (Throwable th) {
            th = th;
            fileOutputStream = null;
            inputStream = null;
        }
        if (!m34770a()) {
            if (0 != 0) {
                try {
                    inputStream2.close();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            if (0 != 0) {
                try {
                    fileOutputStream2.close();
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
            }
            if (0 == 0) {
                return null;
            }
            try {
                httpURLConnection3.disconnect();
                return null;
            } catch (Exception e4) {
                e4.printStackTrace();
                return null;
            }
        }
        String m34741d = m34741d(str);
        File[] listFiles = new File(f4122b).listFiles();
        for (int i = 0; i < listFiles.length; i++) {
            String name = listFiles[i].getName();
            if (name.substring(0, name.lastIndexOf(".")).equals(m34741d)) {
                String path2 = listFiles[i].getPath();
                if (0 != 0) {
                    try {
                        inputStream2.close();
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                }
                if (0 != 0) {
                    try {
                        fileOutputStream2.close();
                    } catch (Exception e6) {
                        e6.printStackTrace();
                    }
                }
                if (0 != 0) {
                    try {
                        httpURLConnection3.disconnect();
                    } catch (Exception e7) {
                        e7.printStackTrace();
                    }
                }
                return path2;
            }
        }
        HttpURLConnection httpURLConnection4 = (HttpURLConnection) new URL(str).openConnection();
        try {
            try {
                httpURLConnection4.connect();
                file2 = new File(f4122b, m34760a(str, httpURLConnection4));
                try {
                    path = file2.getPath();
                } catch (Exception e8) {
                    fileOutputStream = null;
                    inputStream = null;
                    e = e8;
                    file = file2;
                    httpURLConnection = httpURLConnection4;
                }
            } catch (Exception e9) {
                httpURLConnection = httpURLConnection4;
                fileOutputStream = null;
                inputStream = null;
                e = e9;
                file = null;
            }
            if (file2.exists()) {
                String path3 = file2.getPath();
                if (0 != 0) {
                    try {
                        inputStream2.close();
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                }
                if (0 != 0) {
                    try {
                        fileOutputStream2.close();
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                }
                if (httpURLConnection4 != null) {
                    try {
                        httpURLConnection4.disconnect();
                    } catch (Exception e12) {
                        e12.printStackTrace();
                    }
                }
                return path3;
            }
            file2.createNewFile();
            inputStream = httpURLConnection4.getInputStream();
            try {
                fileOutputStream = new FileOutputStream(file2);
            } catch (Exception e13) {
                fileOutputStream = null;
                httpURLConnection = httpURLConnection4;
                e = e13;
                file = file2;
            } catch (Throwable th2) {
                fileOutputStream = null;
                httpURLConnection2 = httpURLConnection4;
                th = th2;
            }
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, read);
                }
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Exception e14) {
                        e14.printStackTrace();
                    }
                }
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (Exception e15) {
                        e15.printStackTrace();
                    }
                }
                if (httpURLConnection4 != null) {
                    try {
                        httpURLConnection4.disconnect();
                    } catch (Exception e16) {
                        e16.printStackTrace();
                        str3 = path;
                    }
                }
                str3 = path;
            } catch (Exception e17) {
                file = file2;
                httpURLConnection = httpURLConnection4;
                e = e17;
                try {
                    e.printStackTrace();
                    C1670k.m34698c(C1663g.class, "有文件下载出错了,已删除");
                    if (file != null) {
                        file.delete();
                    }
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Exception e18) {
                            e18.printStackTrace();
                        }
                    }
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Exception e19) {
                            e19.printStackTrace();
                        }
                    }
                    if (httpURLConnection != null) {
                        try {
                            httpURLConnection.disconnect();
                        } catch (Exception e20) {
                            e20.printStackTrace();
                            str3 = null;
                        }
                    }
                    str3 = null;
                    return str3;
                } catch (Throwable th3) {
                    th = th3;
                    httpURLConnection2 = httpURLConnection;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Exception e21) {
                            e21.printStackTrace();
                        }
                    }
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Exception e22) {
                            e22.printStackTrace();
                        }
                    }
                    if (httpURLConnection2 != null) {
                        try {
                            httpURLConnection2.disconnect();
                        } catch (Exception e23) {
                            e23.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                httpURLConnection2 = httpURLConnection4;
                th = th4;
                if (inputStream != null) {
                }
                if (fileOutputStream != null) {
                }
                if (httpURLConnection2 != null) {
                }
                throw th;
            }
            return str3;
        } catch (Throwable th5) {
            fileOutputStream = null;
            inputStream = null;
            httpURLConnection2 = httpURLConnection4;
            th = th5;
        }
    }

    /* renamed from: a */
    public static String m34760a(String str, HttpURLConnection httpURLConnection) {
        if (C1673n.m34653b(str)) {
            return null;
        }
        try {
            String m34748b = m34748b(str, httpURLConnection);
            if (C1673n.m34653b(m34748b)) {
                m34748b = ".ab";
            }
            return C1672m.m34663b(str) + m34748b;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static String m34759a(String str, HttpResponse httpResponse) {
        if (C1673n.m34653b(str)) {
            return null;
        }
        try {
            String m34747b = m34747b(str, httpResponse);
            if (C1673n.m34653b(m34747b)) {
                m34747b = ".ab";
            }
            return C1672m.m34663b(str) + m34747b;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static String m34757a(HttpURLConnection httpURLConnection) {
        if (httpURLConnection == null) {
            return null;
        }
        try {
            if (httpURLConnection.getResponseCode() != 200) {
                return null;
            }
            int i = 0;
            while (true) {
                String headerField = httpURLConnection.getHeaderField(i);
                if (headerField == null) {
                    return null;
                }
                if ("content-disposition".equals(httpURLConnection.getHeaderFieldKey(i).toLowerCase())) {
                    Matcher matcher = Pattern.compile(".*filename=(.*)").matcher(headerField.toLowerCase());
                    if (matcher.find()) {
                        return matcher.group(1).replace("\"", "");
                    }
                }
                i++;
            }
        } catch (Exception e) {
            e.printStackTrace();
            C1670k.m34698c(C1663g.class, "网络上获取文件名失败");
            return null;
        }
    }

    /* renamed from: a */
    public static String m34756a(HttpResponse httpResponse) {
        String str = null;
        if (httpResponse != null) {
            try {
                for (Header header : httpResponse.getHeaders("content-disposition")) {
                    Matcher matcher = Pattern.compile(".*filename=(.*)").matcher(header.getValue());
                    if (matcher.find()) {
                        str = matcher.group(1).replace("\"", "");
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                C1670k.m34698c(C1663g.class, "网络上获取文件名失败");
            }
        }
        return str;
    }

    /* renamed from: a */
    public static void m34769a(Context context) {
        String str = File.separator + C1576a.f3871a + File.separator + C1656c.m34810g(context).packageName + File.separator;
        String str2 = str + C1576a.f3872b + File.separator;
        String str3 = str + C1576a.f3873c + File.separator;
        String str4 = str + C1576a.f3874d + File.separator;
        try {
            if (!m34770a()) {
                return;
            }
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            File file = new File(externalStorageDirectory.getAbsolutePath() + str);
            if (!file.exists()) {
                file.mkdirs();
            }
            f4121a = file.getPath();
            File file2 = new File(externalStorageDirectory.getAbsolutePath() + str4);
            if (!file2.exists()) {
                file2.mkdirs();
            }
            f4124d = file2.getPath();
            File file3 = new File(externalStorageDirectory.getAbsolutePath() + str2);
            if (!file3.exists()) {
                file3.mkdirs();
            }
            f4122b = file3.getPath();
            File file4 = new File(externalStorageDirectory.getAbsolutePath() + str3);
            if (!file4.exists()) {
                file4.mkdirs();
            }
            f4123c = file4.getPath();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m34758a(String str, byte[] bArr, boolean z) {
        FileOutputStream fileOutputStream = null;
        try {
            try {
                File file = new File(str);
                if (!m34770a()) {
                    if (0 == 0) {
                        return;
                    }
                    try {
                        fileOutputStream.close();
                        return;
                    } catch (Exception e) {
                        return;
                    }
                }
                if (!file.exists()) {
                    if (!z) {
                        if (0 == 0) {
                            return;
                        }
                        try {
                            fileOutputStream.close();
                            return;
                        } catch (Exception e2) {
                            return;
                        }
                    }
                    File parentFile = file.getParentFile();
                    if (!parentFile.exists()) {
                        parentFile.mkdirs();
                        file.createNewFile();
                    }
                }
                FileOutputStream fileOutputStream2 = new FileOutputStream(str);
                try {
                    fileOutputStream2.write(bArr);
                    if (fileOutputStream2 == null) {
                        return;
                    }
                    try {
                        fileOutputStream2.close();
                    } catch (Exception e3) {
                    }
                } catch (Exception e4) {
                    e = e4;
                    fileOutputStream = fileOutputStream2;
                    e.printStackTrace();
                    if (fileOutputStream == null) {
                        return;
                    }
                    try {
                        fileOutputStream.close();
                    } catch (Exception e5) {
                    }
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Exception e6) {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e7) {
            e = e7;
        }
    }

    /* renamed from: a */
    public static boolean m34770a() {
        try {
            return Environment.getExternalStorageState().equals("mounted");
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: b */
    public static int m34754b() {
        StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
        return (int) (((statFs.getBlockSize() * statFs.getAvailableBlocks()) / 1024.0d) * 1024.0d);
    }

    /* renamed from: b */
    public static int m34750b(String str) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setConnectTimeout(5000);
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setRequestProperty(C11086e.f35705a, "image/gif, image/jpeg, image/pjpeg, image/pjpeg, application/x-shockwave-flash, application/xaml+xml, application/vnd.ms-xpsdocument, application/x-ms-xbap, application/x-ms-application, application/vnd.ms-excel, application/vnd.ms-powerpoint, application/msword, */*");
            httpURLConnection.setRequestProperty(C11086e.f35711d, "zh-CN");
            httpURLConnection.setRequestProperty(C11086e.f35694P, str);
            httpURLConnection.setRequestProperty("Charset", "UTF-8");
            httpURLConnection.setRequestProperty(C11086e.f35703Y, "Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 5.2; Trident/4.0; .NET CLR 1.1.4322; .NET CLR 2.0.50727; .NET CLR 3.0.04506.30; .NET CLR 3.0.4506.2152; .NET CLR 3.5.30729)");
            httpURLConnection.setRequestProperty(C11086e.f35717j, "Keep-Alive");
            httpURLConnection.connect();
            if (httpURLConnection.getResponseCode() == 200) {
                return httpURLConnection.getContentLength();
            }
        } catch (Exception e) {
            e.printStackTrace();
            C1670k.m34711a(C1663g.class, "获取长度异常：" + e.getMessage());
        }
        return 0;
    }

    /* renamed from: b */
    public static Bitmap m34749b(String str, int i, int i2, int i3) {
        try {
            return C1678s.m34579a(str, i, i2, i3);
        } catch (Exception e) {
            C1670k.m34711a(C1663g.class, "下载图片异常：" + e.getMessage());
            return null;
        }
    }

    /* renamed from: b */
    public static Drawable m34752b(Context context, String str) {
        try {
            return Drawable.createFromStream(context.getAssets().open(str), null);
        } catch (Exception e) {
            C1670k.m34711a(C1663g.class, "获取图片异常：" + e.getMessage());
            return null;
        }
    }

    /* renamed from: b */
    public static String m34753b(Context context) {
        if (f4121a == null) {
            m34769a(context);
        }
        return f4121a;
    }

    /* renamed from: b */
    public static String m34748b(String str, HttpURLConnection httpURLConnection) {
        String m34757a;
        String str2 = null;
        if (C1673n.m34653b(str)) {
            return null;
        }
        try {
            if (str.lastIndexOf(".") != -1) {
                String substring = str.substring(str.lastIndexOf("."));
                try {
                    if (substring.indexOf("/") == -1 && substring.indexOf(C0363a.f360a) == -1) {
                        if (substring.indexOf("&") == -1) {
                            str2 = substring;
                        }
                    }
                } catch (Exception e) {
                    str2 = substring;
                    e = e;
                    e.printStackTrace();
                    return str2;
                }
            }
            return (!C1673n.m34653b(str2) || (m34757a = m34757a(httpURLConnection)) == null || m34757a.lastIndexOf(".") == -1) ? str2 : m34757a.substring(m34757a.lastIndexOf("."));
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* renamed from: b */
    public static String m34747b(String str, HttpResponse httpResponse) {
        String m34756a;
        String str2 = null;
        if (C1673n.m34653b(str)) {
            return null;
        }
        try {
            if (str.lastIndexOf(".") != -1) {
                String substring = str.substring(str.lastIndexOf("."));
                try {
                    if (substring.indexOf("/") == -1 && substring.indexOf(C0363a.f360a) == -1) {
                        if (substring.indexOf("&") == -1) {
                            str2 = substring;
                        }
                    }
                } catch (Exception e) {
                    str2 = substring;
                    e = e;
                    e.printStackTrace();
                    return str2;
                }
            }
            return (!C1673n.m34653b(str2) || (m34756a = m34756a(httpResponse)) == null || m34756a.lastIndexOf(".") == -1) ? str2 : m34756a.substring(m34756a.lastIndexOf("."));
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* renamed from: b */
    public static boolean m34751b(File file) {
        try {
            if (!m34770a()) {
                return false;
            }
            if (file == null) {
                return true;
            }
            if (file.isDirectory()) {
                for (File file2 : file.listFiles()) {
                    m34751b(file2);
                }
            } else {
                file.delete();
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: c */
    public static String m34745c(Context context) {
        if (f4121a == null) {
            m34769a(context);
        }
        return f4122b;
    }

    /* renamed from: c */
    public static String m34744c(String str) {
        try {
        } catch (Exception e) {
            e.printStackTrace();
            C1670k.m34698c(C1663g.class, "网络上获取文件名失败");
        }
        if (C1673n.m34653b(str)) {
            return null;
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setConnectTimeout(5000);
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.setRequestProperty(C11086e.f35705a, "image/gif, image/jpeg, image/pjpeg, image/pjpeg, application/x-shockwave-flash, application/xaml+xml, application/vnd.ms-xpsdocument, application/x-ms-xbap, application/x-ms-application, application/vnd.ms-excel, application/vnd.ms-powerpoint, application/msword, */*");
        httpURLConnection.setRequestProperty(C11086e.f35711d, "zh-CN");
        httpURLConnection.setRequestProperty(C11086e.f35694P, str);
        httpURLConnection.setRequestProperty("Charset", "UTF-8");
        httpURLConnection.setRequestProperty(C11086e.f35703Y, "");
        httpURLConnection.setRequestProperty(C11086e.f35717j, "Keep-Alive");
        httpURLConnection.connect();
        if (httpURLConnection.getResponseCode() == 200) {
            int i = 0;
            while (true) {
                String headerField = httpURLConnection.getHeaderField(i);
                if (headerField == null) {
                    break;
                }
                if ("content-disposition".equals(httpURLConnection.getHeaderFieldKey(i).toLowerCase())) {
                    Matcher matcher = Pattern.compile(".*filename=(.*)").matcher(headerField.toLowerCase());
                    if (matcher.find()) {
                        return matcher.group(1).replace("\"", "");
                    }
                }
                i++;
            }
        }
        return null;
    }

    /* renamed from: c */
    public static boolean m34746c() {
        try {
            m34751b(new File(f4121a));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: d */
    public static int m34743d() {
        return f4126f;
    }

    /* renamed from: d */
    public static String m34742d(Context context) {
        if (f4121a == null) {
            m34769a(context);
        }
        return f4123c;
    }

    /* renamed from: d */
    public static String m34741d(String str) {
        if (C1673n.m34653b(str)) {
            return null;
        }
        try {
            return C1672m.m34663b(str);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: e */
    public static String m34740e(Context context) {
        if (f4121a == null) {
            m34769a(context);
        }
        return f4124d;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] m34739e(String str) {
        ByteArrayOutputStream byteArrayOutputStream;
        Throwable th;
        byte[] bArr = null;
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            File file = new File(str);
            if (!m34770a()) {
                if (0 != 0) {
                    try {
                        byteArrayOutputStream2.close();
                    } catch (Exception e) {
                    }
                }
            } else if (!file.exists()) {
                if (0 != 0) {
                    try {
                        byteArrayOutputStream2.close();
                    } catch (Exception e2) {
                    }
                }
            } else if (file.length() <= 2147483647L) {
                FileInputStream fileInputStream = new FileInputStream(str);
                byteArrayOutputStream = new ByteArrayOutputStream(1024);
                try {
                    try {
                        byte[] bArr2 = new byte[1024];
                        while (true) {
                            int read = fileInputStream.read(bArr2);
                            if (read == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr2, 0, read);
                        }
                        fileInputStream.close();
                        bArr = byteArrayOutputStream.toByteArray();
                        if (byteArrayOutputStream != null) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (Exception e3) {
                            }
                        }
                    } catch (Exception e4) {
                        e = e4;
                        e.printStackTrace();
                        if (byteArrayOutputStream != null) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (Exception e5) {
                            }
                        }
                        return bArr;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (byteArrayOutputStream != null) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (Exception e6) {
                        }
                    }
                    throw th;
                }
            } else if (0 != 0) {
                try {
                    byteArrayOutputStream2.close();
                } catch (Exception e7) {
                }
            }
        } catch (Exception e8) {
            e = e8;
            byteArrayOutputStream = null;
        } catch (Throwable th3) {
            byteArrayOutputStream = null;
            th = th3;
            if (byteArrayOutputStream != null) {
            }
            throw th;
        }
        return bArr;
    }

    /* renamed from: f */
    public static File m34737f(String str) {
        File file = new File(str);
        if (!file.exists()) {
            try {
                String substring = str.substring(0, str.lastIndexOf("/"));
                System.out.println(substring);
                File file2 = new File(substring);
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return file;
    }

    /* renamed from: f */
    public static String m34738f(Context context) {
        if (f4121a == null) {
            m34769a(context);
        }
        return f4125e;
    }

    /* renamed from: g */
    public static boolean m34736g(String str) {
        int lastIndexOf;
        return str != null && (lastIndexOf = str.lastIndexOf(".")) >= 0 && "mp4".equals(str.substring(lastIndexOf + 1).toLowerCase());
    }
}
