package com.google.android.gms.analytics.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.RequiresPermission;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.internal.aon;
/* renamed from: com.google.android.gms.analytics.internal.k */
/* loaded from: classes2.dex */
public final class C3900k {

    /* renamed from: a */
    static Object f15107a = new Object();

    /* renamed from: b */
    static aon f15108b;

    /* renamed from: c */
    static Boolean f15109c;

    /* renamed from: a */
    public static boolean m26235a(Context context) {
        C4588d.m23627a(context);
        if (f15109c != null) {
            return f15109c.booleanValue();
        }
        boolean m26198a = C3909p.m26198a(context, "com.google.android.gms.analytics.AnalyticsReceiver", false);
        f15109c = Boolean.valueOf(m26198a);
        return m26198a;
    }

    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"})
    /* renamed from: a */
    public void m26234a(Context context, Intent intent) {
        C3922v m26114a = C3922v.m26114a(context);
        C3893g m26108f = m26114a.m26108f();
        if (intent == null) {
            m26108f.t("AnalyticsReceiver called with null intent");
            return;
        }
        String action = intent.getAction();
        if (m26114a.m26109e().m26383a()) {
            m26108f.a("Device AnalyticsReceiver got", action);
        } else {
            m26108f.a("Local AnalyticsReceiver got", action);
        }
        if (!"com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(action)) {
            return;
        }
        boolean m26232a = C3901l.m26232a(context);
        Intent intent2 = new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
        intent2.setComponent(new ComponentName(context, "com.google.android.gms.analytics.AnalyticsService"));
        intent2.setAction("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
        synchronized (f15107a) {
            context.startService(intent2);
            if (!m26232a) {
                return;
            }
            try {
                if (f15108b == null) {
                    f15108b = new aon(context, 1, "Analytics WakeLock");
                    f15108b.m16484a(false);
                }
                f15108b.m16489a(1000L);
            } catch (SecurityException e) {
                m26108f.t("Analytics service at risk of not starting. For more reliable analytics, add the WAKE_LOCK permission to your manifest. See http://goo.gl/8Rd3yj for instructions.");
            }
        }
    }
}
