package com.google.android.gms.ads.internal.purchase;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.ads.internal.C3779u;
import com.google.android.gms.common.stats.C4669b;
import com.google.android.gms.internal.AbstractC8093zc;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abr;
@aaa
/* renamed from: com.google.android.gms.ads.internal.purchase.g */
/* loaded from: classes.dex */
public final class ServiceConnectionC3690g extends AbstractC8093zc.AbstractBinderC8094a implements ServiceConnection {

    /* renamed from: a */
    C3684b f14435a;

    /* renamed from: b */
    private boolean f14436b;

    /* renamed from: c */
    private Context f14437c;

    /* renamed from: d */
    private int f14438d;

    /* renamed from: e */
    private Intent f14439e;

    /* renamed from: f */
    private C3689f f14440f;

    /* renamed from: g */
    private String f14441g;

    public ServiceConnectionC3690g(Context context, String str, boolean z, int i, Intent intent, C3689f c3689f) {
        this.f14436b = false;
        this.f14441g = str;
        this.f14438d = i;
        this.f14439e = intent;
        this.f14436b = z;
        this.f14437c = context;
        this.f14440f = c3689f;
    }

    @Override // com.google.android.gms.internal.AbstractC8093zc
    /* renamed from: a */
    public boolean mo12842a() {
        return this.f14436b;
    }

    @Override // com.google.android.gms.internal.AbstractC8093zc
    /* renamed from: b */
    public String mo12841b() {
        return this.f14441g;
    }

    @Override // com.google.android.gms.internal.AbstractC8093zc
    /* renamed from: c */
    public Intent mo12840c() {
        return this.f14439e;
    }

    @Override // com.google.android.gms.internal.AbstractC8093zc
    /* renamed from: d */
    public int mo12839d() {
        return this.f14438d;
    }

    @Override // com.google.android.gms.internal.AbstractC8093zc
    /* renamed from: e */
    public void mo12838e() {
        int m27081a = C3779u.m26876s().m27081a(this.f14439e);
        if (this.f14438d == -1 && m27081a == 0) {
            this.f14435a = new C3684b(this.f14437c);
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            C4669b.m23204a().m23201a(this.f14437c, intent, this, 1);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        abr.c("In-app billing service connected.");
        this.f14435a.m27107a(iBinder);
        String m27077b = C3779u.m26876s().m27077b(C3779u.m26876s().m27078b(this.f14439e));
        if (m27077b == null) {
            return;
        }
        if (this.f14435a.m27106a(this.f14437c.getPackageName(), m27077b) == 0) {
            C3691h.m27090a(this.f14437c).m27088a(this.f14440f);
        }
        C4669b.m23204a().m23200a(this.f14437c, this);
        this.f14435a.m27109a();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        abr.c("In-app billing service disconnected.");
        this.f14435a.m27109a();
    }
}
