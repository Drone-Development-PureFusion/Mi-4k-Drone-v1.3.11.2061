package com.tencent.stat.common;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.stat.common.l */
/* loaded from: classes2.dex */
public class C10347l {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m5388a() {
        try {
            return new File("/sys/devices/system/cpu/").listFiles(new C10348m()).length;
        } catch (Exception e) {
            e.printStackTrace();
            return 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static int m5387b() {
        StatLogger statLogger;
        byte[] bArr;
        int i = 0;
        try {
            String str = "";
            InputStream inputStream = new ProcessBuilder("/system/bin/cat", "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq").start().getInputStream();
            while (inputStream.read(new byte[24]) != -1) {
                str = str + new String(bArr);
            }
            inputStream.close();
            String trim = str.trim();
            if (trim.length() > 0) {
                i = Integer.valueOf(trim).intValue();
            }
        } catch (Exception e) {
            statLogger = C10346k.f32259f;
            statLogger.m5465e(e);
        }
        return i * 1000;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static int m5386c() {
        StatLogger statLogger;
        byte[] bArr;
        int i = 0;
        try {
            String str = "";
            InputStream inputStream = new ProcessBuilder("/system/bin/cat", "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_min_freq").start().getInputStream();
            while (inputStream.read(new byte[24]) != -1) {
                str = str + new String(bArr);
            }
            inputStream.close();
            String trim = str.trim();
            if (trim.length() > 0) {
                i = Integer.valueOf(trim).intValue();
            }
        } catch (IOException e) {
            statLogger = C10346k.f32259f;
            statLogger.m5465e((Exception) e);
        }
        return i * 1000;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static String m5385d() {
        StatLogger statLogger;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/cpuinfo"));
            String[] split = bufferedReader.readLine().split(":\\s+", 2);
            for (int i = 0; i < split.length; i++) {
            }
            bufferedReader.close();
            return split[1];
        } catch (Throwable th) {
            statLogger = C10346k.f32259f;
            statLogger.m5464e(th);
            return "";
        }
    }
}
