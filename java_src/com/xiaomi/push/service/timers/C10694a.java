package com.xiaomi.push.service.timers;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import com.xiaomi.channel.commonutils.android.C10399j;
import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
/* renamed from: com.xiaomi.push.service.timers.a */
/* loaded from: classes.dex */
public final class C10694a {

    /* renamed from: a */
    private static AbstractC10695a f33238a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.xiaomi.push.service.timers.a$a */
    /* loaded from: classes2.dex */
    public interface AbstractC10695a {
        /* renamed from: a */
        void mo4081a();

        /* renamed from: a */
        void mo4079a(boolean z);

        /* renamed from: b */
        boolean mo4078b();
    }

    /* renamed from: a */
    public static synchronized void m4087a() {
        synchronized (C10694a.class) {
            if (f33238a != null) {
                f33238a.mo4081a();
            }
        }
    }

    /* renamed from: a */
    public static void m4086a(Context context) {
        boolean z = false;
        Context applicationContext = context.getApplicationContext();
        if ("com.xiaomi.xmsf".equals(applicationContext.getPackageName())) {
            f33238a = new C10696b(applicationContext);
            return;
        }
        try {
            PackageInfo packageInfo = applicationContext.getPackageManager().getPackageInfo(applicationContext.getPackageName(), 4);
            if (packageInfo.services != null) {
                ServiceInfo[] serviceInfoArr = packageInfo.services;
                int length = serviceInfoArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    ServiceInfo serviceInfo = serviceInfoArr[i];
                    if ("com.xiaomi.push.service.XMJobService".equals(serviceInfo.name) && "android.permission.BIND_JOB_SERVICE".equals(serviceInfo.permission)) {
                        z = true;
                        break;
                    }
                    i++;
                }
            }
        } catch (Exception e) {
            AbstractC10404b.m5269a("check service err : " + e.getMessage());
        }
        if (!z && C10399j.m5292b(applicationContext)) {
            throw new RuntimeException("Should export service: com.xiaomi.push.service.XMJobService with permission android.permission.BIND_JOB_SERVICE in AndroidManifest.xml file");
        }
        if (Build.VERSION.SDK_INT < 21 || !z) {
            f33238a = new C10696b(applicationContext);
            return;
        }
        try {
            if (Class.forName("android.app.job.JobService").getDeclaredField("mBinder") == null) {
                return;
            }
            f33238a = new C10697c(applicationContext);
        } catch (Exception e2) {
            f33238a = new C10696b(applicationContext);
        }
    }

    /* renamed from: a */
    public static synchronized void m4085a(boolean z) {
        synchronized (C10694a.class) {
            if (f33238a == null) {
                AbstractC10404b.m5269a("timer is not initialized");
            } else {
                f33238a.mo4079a(z);
            }
        }
    }

    /* renamed from: b */
    public static synchronized boolean m4084b() {
        boolean mo4078b;
        synchronized (C10694a.class) {
            mo4078b = f33238a == null ? false : f33238a.mo4078b();
        }
        return mo4078b;
    }
}
