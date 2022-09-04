package com.google.android.gms.analytics.internal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.common.internal.C4588d;
/* renamed from: com.google.android.gms.analytics.internal.al */
/* loaded from: classes2.dex */
public class C3879al extends AbstractC3920t {

    /* renamed from: a */
    private boolean f15016a;

    /* renamed from: b */
    private boolean f15017b;

    /* renamed from: c */
    private AlarmManager f15018c = (AlarmManager) o().getSystemService("alarm");

    /* JADX INFO: Access modifiers changed from: protected */
    public C3879al(C3922v c3922v) {
        super(c3922v);
    }

    /* renamed from: f */
    private PendingIntent m26342f() {
        Intent intent = new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
        intent.setComponent(new ComponentName(o(), "com.google.android.gms.analytics.AnalyticsReceiver"));
        return PendingIntent.getBroadcast(o(), 0, intent, 0);
    }

    @Override // com.google.android.gms.analytics.internal.AbstractC3920t
    /* renamed from: a */
    protected void mo26047a() {
        ActivityInfo receiverInfo;
        try {
            this.f15018c.cancel(m26342f());
            if (q().m26374j() <= 0 || (receiverInfo = o().getPackageManager().getReceiverInfo(new ComponentName(o(), "com.google.android.gms.analytics.AnalyticsReceiver"), 2)) == null || !receiverInfo.enabled) {
                return;
            }
            q("Receiver registered. Using alarm for local dispatch.");
            this.f15016a = true;
        } catch (PackageManager.NameNotFoundException e) {
        }
    }

    /* renamed from: b */
    public boolean m26346b() {
        return this.f15016a;
    }

    /* renamed from: c */
    public boolean m26345c() {
        return this.f15017b;
    }

    /* renamed from: d */
    public void m26344d() {
        D();
        C4588d.m23622a(m26346b(), "Receiver not registered");
        long m26374j = q().m26374j();
        if (m26374j > 0) {
            m26343e();
            long mo16432b = n().mo16432b() + m26374j;
            this.f15017b = true;
            this.f15018c.setInexactRepeating(2, mo16432b, 0L, m26342f());
        }
    }

    /* renamed from: e */
    public void m26343e() {
        D();
        this.f15017b = false;
        this.f15018c.cancel(m26342f());
    }
}
