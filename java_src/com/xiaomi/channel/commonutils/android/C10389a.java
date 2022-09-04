package com.xiaomi.channel.commonutils.android;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.file.C10400a;
import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
/* renamed from: com.xiaomi.channel.commonutils.android.a */
/* loaded from: classes2.dex */
public class C10389a {
    /* renamed from: a */
    private static int m5331a(List<String> list, String str) {
        for (int i = 0; list != null && i < list.size(); i++) {
            if (!TextUtils.isEmpty(str) && str.equalsIgnoreCase(list.get(i))) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    private static String m5332a(String str) {
        String[] split;
        return (str == null || (split = str.split("/")) == null || split.length <= 0) ? str : split[split.length - 1];
    }

    /* renamed from: a */
    public static List<String> m5334a(Context context) {
        ArrayList arrayList = new ArrayList();
        String m5330b = m5330b(context);
        if (!TextUtils.isEmpty(m5330b)) {
            arrayList.add(m5330b);
        }
        String m5296a = C10398i.m5296a("ro.product.cpu.abi", "");
        if (!TextUtils.isEmpty(m5296a)) {
            arrayList.add(m5296a);
        }
        String m5296a2 = C10398i.m5296a("ro.product.cpu.abi2", "");
        if (!TextUtils.isEmpty(m5296a2)) {
            arrayList.add(m5296a2);
        }
        String m5296a3 = C10398i.m5296a("ro.product.cpu.abilist", "");
        if (!TextUtils.isEmpty(m5296a3)) {
            String[] split = m5296a3.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
            for (int i = 0; split != null && i < split.length; i++) {
                if (!TextUtils.isEmpty(split[i])) {
                    arrayList.add(split[i]);
                }
            }
        }
        arrayList.add("armeabi");
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x010d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x011c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m5333a(Context context, String str, String str2) {
        ZipFile zipFile;
        Exception e;
        int m5331a;
        ZipFile zipFile2 = null;
        if (str != null) {
            try {
                if (!str.endsWith(File.separator)) {
                    str = str + File.separator;
                }
            } catch (Exception e2) {
                e = e2;
                try {
                    e.printStackTrace();
                    if (zipFile2 != null) {
                        return;
                    }
                    try {
                        zipFile2.close();
                        return;
                    } catch (Exception e3) {
                        e3.printStackTrace();
                        return;
                    }
                } catch (Throwable th) {
                    th = th;
                    zipFile = zipFile2;
                    if (zipFile != null) {
                        try {
                            zipFile.close();
                        } catch (Exception e4) {
                            e4.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                zipFile = null;
                if (zipFile != null) {
                }
                throw th;
            }
        }
        if (str2 != null && !str2.endsWith(File.separator)) {
            str2 = str2 + File.separator;
        }
        HashMap hashMap = new HashMap();
        List<String> m5334a = m5334a(context);
        zipFile = new ZipFile(str);
        try {
            Enumeration<? extends ZipEntry> entries = zipFile.entries();
            byte[] bArr = new byte[1024];
            while (entries.hasMoreElements()) {
                ZipEntry nextElement = entries.nextElement();
                AbstractC10404b.m5266b("ze.getName() = " + nextElement.getName());
                if (nextElement.getName().startsWith("lib/") && !nextElement.isDirectory()) {
                    String m5332a = m5332a(nextElement.getName());
                    String m5329b = m5329b(nextElement.getName());
                    String str3 = (String) hashMap.get(m5332a);
                    if (TextUtils.isEmpty(str3) || ((m5331a = m5331a(m5334a, m5329b)) >= 0 && m5331a < m5331a(m5334a, str3))) {
                        AbstractC10404b.m5266b("use abi " + m5329b);
                        hashMap.put(m5332a, m5329b);
                        File file = new File(str2 + m5332a);
                        if (file.exists()) {
                            file.delete();
                        }
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        BufferedInputStream bufferedInputStream = new BufferedInputStream(zipFile.getInputStream(nextElement));
                        while (true) {
                            int read = bufferedInputStream.read(bArr, 0, 1024);
                            if (read == -1) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, read);
                        }
                        C10400a.m5287a(bufferedInputStream);
                        C10400a.m5286a(fileOutputStream);
                    }
                }
            }
            if (zipFile == null) {
                return;
            }
            try {
                zipFile.close();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        } catch (Exception e6) {
            e = e6;
            zipFile2 = zipFile;
            e.printStackTrace();
            if (zipFile2 != null) {
            }
        } catch (Throwable th3) {
            th = th3;
            if (zipFile != null) {
            }
            throw th;
        }
    }

    /* renamed from: b */
    public static String m5330b(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            Field declaredField = Class.forName("android.content.pm.ApplicationInfo").getDeclaredField("primaryCpuAbi");
            declaredField.setAccessible(true);
            return (String) declaredField.get(applicationInfo);
        } catch (Throwable th) {
            return null;
        }
    }

    /* renamed from: b */
    private static String m5329b(String str) {
        String[] split;
        return (str == null || (split = str.split("/")) == null || split.length <= 1) ? "armeabi" : split[split.length - 2];
    }
}
