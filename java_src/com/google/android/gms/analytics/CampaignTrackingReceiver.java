package com.google.android.gms.analytics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.RequiresPermission;
import android.text.TextUtils;
import com.google.android.gms.analytics.internal.C3893g;
import com.google.android.gms.analytics.internal.C3909p;
import com.google.android.gms.analytics.internal.C3922v;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.internal.aon;
/* loaded from: classes2.dex */
public class CampaignTrackingReceiver extends BroadcastReceiver {

    /* renamed from: a */
    static Object f14880a = new Object();

    /* renamed from: b */
    static aon f14881b;

    /* renamed from: c */
    static Boolean f14882c;

    /* renamed from: a */
    public static boolean m26634a(Context context) {
        C4588d.m23627a(context);
        if (f14882c != null) {
            return f14882c.booleanValue();
        }
        boolean m26198a = C3909p.m26198a(context, "com.google.android.gms.analytics.CampaignTrackingReceiver", true);
        f14882c = Boolean.valueOf(m26198a);
        return m26198a;
    }

    /* renamed from: a */
    protected Class<? extends CampaignTrackingService> mo9356a() {
        return CampaignTrackingService.class;
    }

    /* renamed from: a */
    protected void mo9355a(Context context, String str) {
    }

    @Override // android.content.BroadcastReceiver
    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"})
    public void onReceive(Context context, Intent intent) {
        C3922v m26114a = C3922v.m26114a(context);
        C3893g m26108f = m26114a.m26108f();
        if (intent == null) {
            m26108f.t("CampaignTrackingReceiver received null intent");
            return;
        }
        String stringExtra = intent.getStringExtra("referrer");
        String action = intent.getAction();
        m26108f.a("CampaignTrackingReceiver received", action);
        if (!"com.android.vending.INSTALL_REFERRER".equals(action) || TextUtils.isEmpty(stringExtra)) {
            m26108f.t("CampaignTrackingReceiver received unexpected intent without referrer extra");
            return;
        }
        boolean m26632a = CampaignTrackingService.m26632a(context);
        if (!m26632a) {
            m26108f.t("CampaignTrackingService not registered or disabled. Installation tracking not possible. See http://goo.gl/8Rd3yj for instructions.");
        }
        mo9355a(context, stringExtra);
        if (m26114a.m26109e().m26383a()) {
            m26108f.u("Received unexpected installation campaign on package side");
            return;
        }
        Class<? extends CampaignTrackingService> mo9356a = mo9356a();
        C4588d.m23627a(mo9356a);
        Intent intent2 = new Intent(context, mo9356a);
        intent2.putExtra("referrer", stringExtra);
        synchronized (f14880a) {
            context.startService(intent2);
            if (!m26632a) {
                return;
            }
            try {
                if (f14881b == null) {
                    f14881b = new aon(context, 1, "Analytics campaign WakeLock");
                    f14881b.m16484a(false);
                }
                f14881b.m16489a(1000L);
            } catch (SecurityException e) {
                m26108f.t("CampaignTrackingService service at risk of not starting. For more reliable installation campaign reports, add the WAKE_LOCK permission to your manifest. See http://goo.gl/8Rd3yj for instructions.");
            }
        }
    }
}
