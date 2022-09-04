package com.xiaomi.channel.commonutils.android;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
import com.xiaomi.channel.commonutils.misc.C10406b;
import com.xiaomi.channel.commonutils.reflect.C10426a;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.xiaomi.channel.commonutils.android.b */
/* loaded from: classes.dex */
public class C10390b {

    /* renamed from: com.xiaomi.channel.commonutils.android.b$a */
    /* loaded from: classes2.dex */
    public enum EnumC10391a {
        UNKNOWN(0),
        ALLOWED(1),
        NOT_ALLOWED(2);
        

        /* renamed from: d */
        private final int f32321d;

        EnumC10391a(int i) {
            this.f32321d = i;
        }

        /* renamed from: a */
        public int m5318a() {
            return this.f32321d;
        }
    }

    /* renamed from: a */
    public static String m5328a(Context context) {
        try {
            List<ActivityManager.RunningTaskInfo> runningTasks = ((ActivityManager) context.getSystemService("activity")).getRunningTasks(1);
            if (!C10406b.m5258a(runningTasks) && runningTasks.get(0) != null && runningTasks.get(0).topActivity != null) {
                return runningTasks.get(0).topActivity.getPackageName();
            }
            return null;
        } catch (Throwable th) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m5327a(Context context, String str) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 16384);
        } catch (Exception e) {
            AbstractC10404b.m5267a(e);
            packageInfo = null;
        }
        return packageInfo != null ? packageInfo.versionName : "1.0";
    }

    /* renamed from: b */
    public static int m5325b(Context context, String str) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 16384);
        } catch (Exception e) {
            AbstractC10404b.m5267a(e);
            packageInfo = null;
        }
        if (packageInfo != null) {
            return packageInfo.versionCode;
        }
        return 0;
    }

    /* renamed from: b */
    public static boolean m5326b(Context context) {
        return TextUtils.equals(context.getPackageName(), m5328a(context));
    }

    /* renamed from: c */
    public static int m5323c(Context context, String str) {
        try {
            return context.getPackageManager().getPackageArchiveInfo(str, 1).versionCode;
        } catch (Exception e) {
            return 0;
        }
    }

    /* renamed from: c */
    public static String m5324c(Context context) {
        if (context == null) {
            return null;
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        int myPid = Process.myPid();
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == myPid) {
                return runningAppProcessInfo.processName;
            }
        }
        return null;
    }

    @TargetApi(19)
    /* renamed from: d */
    public static EnumC10391a m5321d(Context context, String str) {
        EnumC10391a enumC10391a;
        if (context == null || TextUtils.isEmpty(str) || Build.VERSION.SDK_INT < 19) {
            return EnumC10391a.UNKNOWN;
        }
        try {
            Integer num = (Integer) C10426a.m5204a((Class<? extends Object>) AppOpsManager.class, "OP_POST_NOTIFICATION");
            if (num == null) {
                enumC10391a = EnumC10391a.UNKNOWN;
            } else {
                Integer num2 = (Integer) C10426a.m5200a((AppOpsManager) context.getSystemService("appops"), "checkOpNoThrow", num, Integer.valueOf(context.getPackageManager().getApplicationInfo(str, 0).uid), str);
                enumC10391a = (num2 == null || num2.intValue() != 0) ? EnumC10391a.NOT_ALLOWED : EnumC10391a.ALLOWED;
            }
            return enumC10391a;
        } catch (Throwable th) {
            return EnumC10391a.UNKNOWN;
        }
    }

    /* renamed from: d */
    public static String m5322d(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        if (runningAppProcesses != null && runningAppProcesses.size() > 0) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                String[] strArr = runningAppProcessInfo.pkgList;
                for (int i = 0; strArr != null && i < strArr.length; i++) {
                    if (!arrayList.contains(strArr[i])) {
                        arrayList.add(strArr[i]);
                        if (arrayList.size() == 1) {
                            sb.append(((String) arrayList.get(0)).hashCode() % 100000);
                        } else {
                            sb.append("#").append(strArr[i].hashCode() % 100000);
                        }
                    }
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: e */
    public static Signature[] m5320e(Context context, String str) {
        try {
            return context.getPackageManager().getPackageArchiveInfo(str, 64).signatures;
        } catch (Exception e) {
            return null;
        }
    }

    /* renamed from: f */
    public static boolean m5319f(Context context, String str) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 8192);
        } catch (PackageManager.NameNotFoundException e) {
            packageInfo = null;
        }
        return packageInfo != null;
    }
}
