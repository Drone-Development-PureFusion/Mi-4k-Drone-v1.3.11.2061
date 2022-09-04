package com.google.android.gms.ads.internal.purchase;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.C3779u;
import com.google.android.gms.internal.AbstractC8079yx;
import com.google.android.gms.internal.AbstractC8085yz;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abr;
@aaa
/* renamed from: com.google.android.gms.ads.internal.purchase.e */
/* loaded from: classes.dex */
public class ServiceConnectionC3688e extends AbstractC8085yz.AbstractBinderC8086a implements ServiceConnection {

    /* renamed from: a */
    C3691h f14423a;

    /* renamed from: b */
    private final Activity f14424b;

    /* renamed from: c */
    private Context f14425c;

    /* renamed from: d */
    private AbstractC8079yx f14426d;

    /* renamed from: e */
    private C3684b f14427e;

    /* renamed from: f */
    private C3689f f14428f;

    /* renamed from: g */
    private AbstractC3695j f14429g;

    /* renamed from: h */
    private C3696k f14430h;

    /* renamed from: i */
    private String f14431i = null;

    public ServiceConnectionC3688e(Activity activity) {
        this.f14424b = activity;
        this.f14423a = C3691h.m27090a(this.f14424b.getApplicationContext());
    }

    @Override // com.google.android.gms.internal.AbstractC8085yz
    /* renamed from: a */
    public void mo12849a() {
        GInAppPurchaseManagerInfoParcel m27117a = GInAppPurchaseManagerInfoParcel.m27117a(this.f14424b.getIntent());
        this.f14429g = m27117a.f14404e;
        this.f14430h = m27117a.f14401b;
        this.f14426d = m27117a.f14402c;
        this.f14427e = new C3684b(this.f14424b.getApplicationContext());
        this.f14425c = m27117a.f14403d;
        if (this.f14424b.getResources().getConfiguration().orientation == 2) {
            this.f14424b.setRequestedOrientation(C3779u.m26888g().mo18302a());
        } else {
            this.f14424b.setRequestedOrientation(C3779u.m26888g().mo18301b());
        }
        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
        intent.setPackage("com.android.vending");
        this.f14424b.bindService(intent, this, 1);
    }

    @Override // com.google.android.gms.internal.AbstractC8085yz
    /* renamed from: a */
    public void mo12848a(int i, int i2, Intent intent) {
        if (i == 1001) {
            boolean z = false;
            try {
                int m27081a = C3779u.m26876s().m27081a(intent);
                if (i2 == -1) {
                    C3779u.m26876s();
                    if (m27081a == 0) {
                        if (this.f14430h.m27073a(this.f14431i, i2, intent)) {
                            z = true;
                        }
                        this.f14426d.mo12852c(m27081a);
                        this.f14424b.finish();
                        m27093a(this.f14426d.mo12854a(), z, i2, intent);
                    }
                }
                this.f14423a.m27088a(this.f14428f);
                this.f14426d.mo12852c(m27081a);
                this.f14424b.finish();
                m27093a(this.f14426d.mo12854a(), z, i2, intent);
            } catch (RemoteException e) {
                abr.d("Fail to process purchase result.");
                this.f14424b.finish();
            } finally {
                this.f14431i = null;
            }
        }
    }

    /* renamed from: a */
    protected void m27093a(String str, boolean z, int i, Intent intent) {
        if (this.f14429g != null) {
            this.f14429g.mo27075a(str, z, i, intent, this.f14428f);
        }
    }

    @Override // com.google.android.gms.internal.AbstractC8085yz
    /* renamed from: b */
    public void mo12847b() {
        this.f14424b.unbindService(this);
        this.f14427e.m27109a();
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f14427e.m27107a(iBinder);
        try {
            this.f14431i = this.f14430h.m27074a();
            Bundle m27105a = this.f14427e.m27105a(this.f14424b.getPackageName(), this.f14426d.mo12854a(), this.f14431i);
            PendingIntent pendingIntent = (PendingIntent) m27105a.getParcelable("BUY_INTENT");
            if (pendingIntent == null) {
                int m27080a = C3779u.m26876s().m27080a(m27105a);
                this.f14426d.mo12852c(m27080a);
                m27093a(this.f14426d.mo12854a(), false, m27080a, null);
                this.f14424b.finish();
            } else {
                this.f14428f = new C3689f(this.f14426d.mo12854a(), this.f14431i);
                this.f14423a.m27086b(this.f14428f);
                Integer num = 0;
                Integer num2 = 0;
                Integer num3 = 0;
                this.f14424b.startIntentSenderForResult(pendingIntent.getIntentSender(), 1001, new Intent(), num.intValue(), num2.intValue(), num3.intValue());
            }
        } catch (IntentSender.SendIntentException | RemoteException e) {
            abr.d("Error when connecting in-app billing service", e);
            this.f14424b.finish();
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        abr.c("In-app billing service disconnected.");
        this.f14427e.m27109a();
    }
}
