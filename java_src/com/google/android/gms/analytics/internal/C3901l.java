package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.support.annotation.RequiresPermission;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.internal.aon;
/* renamed from: com.google.android.gms.analytics.internal.l */
/* loaded from: classes2.dex */
public final class C3901l {

    /* renamed from: d */
    private static Boolean f15110d;

    /* renamed from: a */
    private final Handler f15111a = new Handler();

    /* renamed from: b */
    private final AbstractC3904a f15112b;

    /* renamed from: c */
    private final Context f15113c;

    /* renamed from: com.google.android.gms.analytics.internal.l$a */
    /* loaded from: classes2.dex */
    public interface AbstractC3904a {
        /* renamed from: a */
        Context mo26224a();

        /* renamed from: a */
        boolean mo26223a(int i);
    }

    public C3901l(AbstractC3904a abstractC3904a) {
        this.f15113c = abstractC3904a.mo26224a();
        C4588d.m23627a(this.f15113c);
        this.f15112b = abstractC3904a;
    }

    /* renamed from: a */
    public static boolean m26232a(Context context) {
        C4588d.m23627a(context);
        if (f15110d != null) {
            return f15110d.booleanValue();
        }
        boolean m26199a = C3909p.m26199a(context, "com.google.android.gms.analytics.AnalyticsService");
        f15110d = Boolean.valueOf(m26199a);
        return m26199a;
    }

    /* renamed from: c */
    private void m26226c() {
        try {
            synchronized (C3900k.f15107a) {
                aon aonVar = C3900k.f15108b;
                if (aonVar != null && aonVar.m16483b()) {
                    aonVar.m16490a();
                }
            }
        } catch (SecurityException e) {
        }
    }

    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"})
    /* renamed from: a */
    public int m26230a(Intent intent, int i, final int i2) {
        m26226c();
        final C3922v m26114a = C3922v.m26114a(this.f15113c);
        final C3893g m26108f = m26114a.m26108f();
        if (intent == null) {
            m26108f.t("AnalyticsService started with null intent");
        } else {
            String action = intent.getAction();
            if (m26114a.m26109e().m26383a()) {
                m26108f.a("Device AnalyticsService called. startId, action", Integer.valueOf(i2), action);
            } else {
                m26108f.a("Local AnalyticsService called. startId, action", Integer.valueOf(i2), action);
            }
            if ("com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(action)) {
                m26114a.m26105i().m26170a(new AbstractC3880am() { // from class: com.google.android.gms.analytics.internal.l.1
                    @Override // com.google.android.gms.analytics.internal.AbstractC3880am
                    /* renamed from: a */
                    public void mo26225a(Throwable th) {
                        C3901l.this.f15111a.post(new Runnable() { // from class: com.google.android.gms.analytics.internal.l.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                if (C3901l.this.f15112b.mo26223a(i2)) {
                                    if (m26114a.m26109e().m26383a()) {
                                        m26108f.q("Device AnalyticsService processed last dispatch request");
                                    } else {
                                        m26108f.q("Local AnalyticsService processed last dispatch request");
                                    }
                                }
                            }
                        });
                    }
                });
            }
        }
        return 2;
    }

    /* renamed from: a */
    public IBinder m26231a(Intent intent) {
        return null;
    }

    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"})
    /* renamed from: a */
    public void m26233a() {
        C3922v m26114a = C3922v.m26114a(this.f15113c);
        C3893g m26108f = m26114a.m26108f();
        if (m26114a.m26109e().m26383a()) {
            m26108f.q("Device AnalyticsService is starting up");
        } else {
            m26108f.q("Local AnalyticsService is starting up");
        }
    }

    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"})
    /* renamed from: b */
    public void m26228b() {
        C3922v m26114a = C3922v.m26114a(this.f15113c);
        C3893g m26108f = m26114a.m26108f();
        if (m26114a.m26109e().m26383a()) {
            m26108f.q("Device AnalyticsService is shutting down");
        } else {
            m26108f.q("Local AnalyticsService is shutting down");
        }
    }
}
