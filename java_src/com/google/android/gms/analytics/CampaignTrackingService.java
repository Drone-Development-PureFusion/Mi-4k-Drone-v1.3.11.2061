package com.google.android.gms.analytics;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.support.annotation.RequiresPermission;
import android.text.TextUtils;
import com.google.android.gms.analytics.internal.C3893g;
import com.google.android.gms.analytics.internal.C3909p;
import com.google.android.gms.analytics.internal.C3922v;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.internal.aon;
/* loaded from: classes2.dex */
public class CampaignTrackingService extends Service {

    /* renamed from: b */
    private static Boolean f14883b;

    /* renamed from: a */
    private Handler f14884a;

    /* renamed from: a */
    private void m26633a() {
        try {
            synchronized (CampaignTrackingReceiver.f14880a) {
                aon aonVar = CampaignTrackingReceiver.f14881b;
                if (aonVar != null && aonVar.m16483b()) {
                    aonVar.m16490a();
                }
            }
        } catch (SecurityException e) {
        }
    }

    /* renamed from: a */
    public static boolean m26632a(Context context) {
        C4588d.m23627a(context);
        if (f14883b != null) {
            return f14883b.booleanValue();
        }
        boolean m26199a = C3909p.m26199a(context, "com.google.android.gms.analytics.CampaignTrackingService");
        f14883b = Boolean.valueOf(m26199a);
        return m26199a;
    }

    /* renamed from: b */
    private Handler m26630b() {
        Handler handler = this.f14884a;
        if (handler == null) {
            Handler handler2 = new Handler(getMainLooper());
            this.f14884a = handler2;
            return handler2;
        }
        return handler;
    }

    /* renamed from: a */
    protected void m26631a(final C3893g c3893g, Handler handler, final int i) {
        handler.post(new Runnable() { // from class: com.google.android.gms.analytics.CampaignTrackingService.3
            @Override // java.lang.Runnable
            public void run() {
                boolean stopSelfResult = CampaignTrackingService.this.stopSelfResult(i);
                if (stopSelfResult) {
                    c3893g.a("Install campaign broadcast processed", Boolean.valueOf(stopSelfResult));
                }
            }
        });
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"})
    public void onCreate() {
        super.onCreate();
        C3922v.m26114a(this).m26108f().q("CampaignTrackingService is starting up");
    }

    @Override // android.app.Service
    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"})
    public void onDestroy() {
        C3922v.m26114a(this).m26108f().q("CampaignTrackingService is shutting down");
        super.onDestroy();
    }

    @Override // android.app.Service
    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"})
    public int onStartCommand(Intent intent, int i, final int i2) {
        m26633a();
        C3922v m26114a = C3922v.m26114a(this);
        final C3893g m26108f = m26114a.m26108f();
        String str = null;
        if (m26114a.m26109e().m26383a()) {
            m26108f.u("Unexpected installation campaign (package side)");
        } else {
            str = intent.getStringExtra("referrer");
        }
        final Handler m26630b = m26630b();
        if (TextUtils.isEmpty(str)) {
            if (!m26114a.m26109e().m26383a()) {
                m26108f.t("No campaign found on com.android.vending.INSTALL_REFERRER \"referrer\" extra");
            }
            m26114a.m26106h().m25969a(new Runnable() { // from class: com.google.android.gms.analytics.CampaignTrackingService.1
                @Override // java.lang.Runnable
                public void run() {
                    CampaignTrackingService.this.m26631a(m26108f, m26630b, i2);
                }
            });
        } else {
            int m26379e = m26114a.m26109e().m26379e();
            if (str.length() > m26379e) {
                m26108f.c("Campaign data exceed the maximum supported size and will be clipped. size, limit", Integer.valueOf(str.length()), Integer.valueOf(m26379e));
                str = str.substring(0, m26379e);
            }
            m26108f.a("CampaignTrackingService called. startId, campaign", Integer.valueOf(i2), str);
            m26114a.m26105i().m26166a(str, new Runnable() { // from class: com.google.android.gms.analytics.CampaignTrackingService.2
                @Override // java.lang.Runnable
                public void run() {
                    CampaignTrackingService.this.m26631a(m26108f, m26630b, i2);
                }
            });
        }
        return 2;
    }
}
