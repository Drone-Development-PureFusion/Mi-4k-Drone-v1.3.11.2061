package com.xiaomi.push.service;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
import com.xiaomi.metok.geofencing.C10462a;
import com.xiaomi.xmpush.thrift.C10812j;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.xiaomi.push.service.h */
/* loaded from: classes2.dex */
public class C10665h {
    /* renamed from: a */
    public static void m4250a(Context context, String str) {
        ArrayList<C10812j> m4266b = C10662e.m4274a(context).m4266b(str);
        if (m4266b == null || m4266b.size() < 1) {
            return;
        }
        if (C10662e.m4274a(context).m4261e(str) == 0) {
            AbstractC10404b.m5269a("appIsUninstalled. failed to delete geofencing with package name. name:" + str);
        }
        Iterator<C10812j> it2 = m4266b.iterator();
        while (it2.hasNext()) {
            C10812j next = it2.next();
            if (next == null) {
                AbstractC10404b.m5269a("appIsUninstalled. failed to find geofence with package name. name:" + str);
                return;
            }
            m4249a(next.m3417a(), context);
            if (C10664g.m4257a(context).m4253b(next.m3417a()) == 0) {
                AbstractC10404b.m5269a("appIsUninstalled. failed to delete geoMessage with package name. name:" + str + ", geoId:" + next.m3417a());
            }
        }
    }

    /* renamed from: a */
    public static void m4249a(String str, Context context) {
        new C10462a(context).m5061a(context, "com.xiaomi.xmsf", str);
    }

    /* renamed from: a */
    public static boolean m4251a(Context context) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo("com.xiaomi.metok", 8192);
        } catch (PackageManager.NameNotFoundException e) {
            packageInfo = null;
        }
        return packageInfo != null && packageInfo.versionCode >= 20;
    }

    /* renamed from: b */
    public static boolean m4248b(Context context) {
        return TextUtils.equals(context.getPackageName(), "com.xiaomi.xmsf");
    }
}
