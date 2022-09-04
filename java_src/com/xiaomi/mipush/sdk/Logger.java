package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
import com.xiaomi.channel.commonutils.logger.LoggerInterface;
import com.xiaomi.push.log.C10565e;
import com.xiaomi.push.log.C10566f;
/* loaded from: classes.dex */
public class Logger {
    private static boolean sDisablePushLog = false;
    private static LoggerInterface sUserLogger = null;

    public static void disablePushFileLog(Context context) {
        sDisablePushLog = true;
        setPushLog(context);
    }

    public static void enablePushFileLog(Context context) {
        sDisablePushLog = false;
        setPushLog(context);
    }

    private static boolean hasWritePermission(Context context) {
        try {
            String[] strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
            if (strArr == null) {
                return false;
            }
            for (String str : strArr) {
                if ("android.permission.WRITE_EXTERNAL_STORAGE".equals(str)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static void setLogger(Context context, LoggerInterface loggerInterface) {
        sUserLogger = loggerInterface;
        setPushLog(context);
    }

    private static void setPushLog(Context context) {
        boolean z = sUserLogger != null;
        C10566f c10566f = new C10566f(context);
        if (!sDisablePushLog && hasWritePermission(context) && z) {
            AbstractC10404b.m5271a(new C10565e(sUserLogger, c10566f));
        } else if (!sDisablePushLog && hasWritePermission(context)) {
            AbstractC10404b.m5271a(c10566f);
        } else if (z) {
            AbstractC10404b.m5271a(sUserLogger);
        } else {
            AbstractC10404b.m5271a(new C10565e(null, null));
        }
    }
}
