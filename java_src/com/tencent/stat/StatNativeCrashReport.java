package com.tencent.stat;

import android.content.Context;
import com.tencent.stat.common.C10346k;
import com.tencent.stat.common.C10351p;
import com.tencent.stat.common.StatLogger;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashSet;
/* loaded from: classes2.dex */
public class StatNativeCrashReport {
    public static final String PRE_TAG_TOMBSTONE_FNAME = "tombstone_";

    /* renamed from: d */
    private static boolean f32138d;

    /* renamed from: c */
    private volatile boolean f32141c = false;

    /* renamed from: b */
    private static StatLogger f32137b = C10346k.m5425b();

    /* renamed from: a */
    static StatNativeCrashReport f32136a = new StatNativeCrashReport();

    /* renamed from: e */
    private static boolean f32139e = false;

    /* renamed from: f */
    private static String f32140f = null;

    static {
        f32138d = false;
        try {
            System.loadLibrary("MtaNativeCrash");
        } catch (Throwable th) {
            f32138d = false;
            f32137b.m5461w(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m5505a(File file) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
                sb.append('\n');
            }
            bufferedReader.close();
        } catch (IOException e) {
            f32137b.m5465e((Exception) e);
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static LinkedHashSet<File> m5506a(Context context) {
        File file;
        File[] listFiles;
        LinkedHashSet<File> linkedHashSet = new LinkedHashSet<>();
        String tombstonesDir = getTombstonesDir(context);
        if (tombstonesDir != null && (file = new File(tombstonesDir)) != null && file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                if (file2.getName().startsWith(PRE_TAG_TOMBSTONE_FNAME) && file2.isFile()) {
                    f32137b.m5466d("get tombstone file:" + file2.getAbsolutePath().toString());
                    linkedHashSet.add(file2.getAbsoluteFile());
                }
            }
        }
        return linkedHashSet;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static long m5504b(File file) {
        try {
            return Long.valueOf(file.getName().replace(PRE_TAG_TOMBSTONE_FNAME, "")).longValue();
        } catch (NumberFormatException e) {
            f32137b.m5465e((Exception) e);
            return 0L;
        }
    }

    public static void doNativeCrashTest() {
        f32136a.makeJniCrash();
    }

    public static String getTombstonesDir(Context context) {
        if (f32140f == null) {
            f32140f = C10351p.m5380a(context, "__mta_tombstone__", "");
        }
        return f32140f;
    }

    public static void initNativeCrash(Context context, String str) {
        if (f32136a.f32141c) {
            return;
        }
        if (str == null) {
            try {
                str = context.getDir("tombstones", 0).getAbsolutePath();
            } catch (Throwable th) {
                f32137b.m5461w(th);
                return;
            }
        }
        if (str.length() > 128) {
            f32137b.m5464e("The length of tombstones dir: " + str + " can't exceeds 200 bytes.");
            return;
        }
        f32140f = str;
        C10351p.m5377b(context, "__mta_tombstone__", str);
        setNativeCrashEnable(true);
        f32136a.initJNICrash(str);
        f32136a.f32141c = true;
        f32137b.m5466d("initNativeCrash success.");
    }

    public static boolean isNativeCrashDebugEnable() {
        return f32139e;
    }

    public static boolean isNativeCrashEnable() {
        return f32138d;
    }

    public static String onNativeCrashHappened() {
        try {
            new RuntimeException("MTA has caught a native crash, java stack:\n").printStackTrace();
            return "";
        } catch (RuntimeException e) {
            return e.toString();
        }
    }

    public static void setNativeCrashDebugEnable(boolean z) {
        try {
            f32136a.enableNativeCrashDebug(z);
            f32139e = z;
        } catch (Throwable th) {
            f32137b.m5461w(th);
        }
    }

    public static void setNativeCrashEnable(boolean z) {
        try {
            f32136a.enableNativeCrash(z);
            f32138d = z;
        } catch (Throwable th) {
            f32137b.m5461w(th);
        }
    }

    public native void enableNativeCrash(boolean z);

    public native void enableNativeCrashDebug(boolean z);

    public native boolean initJNICrash(String str);

    public native String makeJniCrash();

    public native String stringFromJNI();
}
