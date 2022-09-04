package com.google.android.gms.ads.internal.purchase;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.C3779u;
import com.google.android.gms.common.stats.C4669b;
import com.google.android.gms.internal.AbstractC8096zd;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abq;
import com.google.android.gms.internal.abr;
import com.google.android.gms.internal.abv;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
@aaa
/* renamed from: com.google.android.gms.ads.internal.purchase.c */
/* loaded from: classes.dex */
public class ServiceConnectionC3685c extends abq implements ServiceConnection {

    /* renamed from: a */
    private final Object f14408a;

    /* renamed from: b */
    private boolean f14409b;

    /* renamed from: c */
    private Context f14410c;

    /* renamed from: d */
    private AbstractC8096zd f14411d;

    /* renamed from: e */
    private C3684b f14412e;

    /* renamed from: f */
    private C3691h f14413f;

    /* renamed from: g */
    private List<C3689f> f14414g;

    /* renamed from: h */
    private C3696k f14415h;

    public ServiceConnectionC3685c(Context context, AbstractC8096zd abstractC8096zd, C3696k c3696k) {
        this(context, abstractC8096zd, c3696k, new C3684b(context), C3691h.m27090a(context.getApplicationContext()));
    }

    ServiceConnectionC3685c(Context context, AbstractC8096zd abstractC8096zd, C3696k c3696k, C3684b c3684b, C3691h c3691h) {
        this.f14408a = new Object();
        this.f14409b = false;
        this.f14414g = null;
        this.f14410c = context;
        this.f14411d = abstractC8096zd;
        this.f14415h = c3696k;
        this.f14412e = c3684b;
        this.f14413f = c3691h;
        this.f14414g = this.f14413f.m27091a(10L);
    }

    /* renamed from: a */
    private void m27103a(long j) {
        do {
            if (!m27100b(j)) {
                abr.m18409e("Timeout waiting for pending transaction to be processed.");
            }
        } while (!this.f14409b);
    }

    /* renamed from: b */
    private boolean m27100b(long j) {
        long elapsedRealtime = 60000 - (SystemClock.elapsedRealtime() - j);
        if (elapsedRealtime <= 0) {
            return false;
        }
        try {
            this.f14408a.wait(elapsedRealtime);
        } catch (InterruptedException e) {
            abr.d("waitWithTimeout_lock interrupted");
        }
        return true;
    }

    @Override // com.google.android.gms.internal.abq
    /* renamed from: a */
    public void mo12782a() {
        synchronized (this.f14408a) {
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            C4669b.m23204a().m23201a(this.f14410c, intent, this, 1);
            m27103a(SystemClock.elapsedRealtime());
            C4669b.m23204a().m23200a(this.f14410c, this);
            this.f14412e.m27109a();
        }
    }

    /* renamed from: a */
    protected void m27101a(final C3689f c3689f, String str, String str2) {
        final Intent intent = new Intent();
        C3779u.m26876s();
        intent.putExtra("RESPONSE_CODE", 0);
        C3779u.m26876s();
        intent.putExtra("INAPP_PURCHASE_DATA", str);
        C3779u.m26876s();
        intent.putExtra("INAPP_DATA_SIGNATURE", str2);
        abv.f21039a.post(new Runnable() { // from class: com.google.android.gms.ads.internal.purchase.c.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (ServiceConnectionC3685c.this.f14415h.m27073a(c3689f.f14433b, -1, intent)) {
                        ServiceConnectionC3685c.this.f14411d.mo12825a(new ServiceConnectionC3690g(ServiceConnectionC3685c.this.f14410c, c3689f.f14434c, true, -1, intent, c3689f));
                    } else {
                        ServiceConnectionC3685c.this.f14411d.mo12825a(new ServiceConnectionC3690g(ServiceConnectionC3685c.this.f14410c, c3689f.f14434c, false, -1, intent, c3689f));
                    }
                } catch (RemoteException e) {
                    abr.d("Fail to verify and dispatch pending transaction");
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.abq
    /* renamed from: b */
    public void mo12779b() {
        synchronized (this.f14408a) {
            C4669b.m23204a().m23200a(this.f14410c, this);
            this.f14412e.m27109a();
        }
    }

    /* renamed from: c */
    protected void m27098c() {
        if (this.f14414g.isEmpty()) {
            return;
        }
        HashMap hashMap = new HashMap();
        for (C3689f c3689f : this.f14414g) {
            hashMap.put(c3689f.f14434c, c3689f);
        }
        String str = null;
        while (true) {
            Bundle m27104b = this.f14412e.m27104b(this.f14410c.getPackageName(), str);
            if (m27104b == null || C3779u.m26876s().m27080a(m27104b) != 0) {
                break;
            }
            ArrayList<String> stringArrayList = m27104b.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
            ArrayList<String> stringArrayList2 = m27104b.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
            ArrayList<String> stringArrayList3 = m27104b.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
            String string = m27104b.getString("INAPP_CONTINUATION_TOKEN");
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= stringArrayList.size()) {
                    break;
                }
                if (hashMap.containsKey(stringArrayList.get(i2))) {
                    String str2 = stringArrayList.get(i2);
                    String str3 = stringArrayList2.get(i2);
                    String str4 = stringArrayList3.get(i2);
                    C3689f c3689f2 = (C3689f) hashMap.get(str2);
                    if (c3689f2.f14433b.equals(C3779u.m26876s().m27079a(str3))) {
                        m27101a(c3689f2, str3, str4);
                        hashMap.remove(str2);
                    }
                }
                i = i2 + 1;
            }
            if (string == null || hashMap.isEmpty()) {
                break;
            }
            str = string;
        }
        for (String str5 : hashMap.keySet()) {
            this.f14413f.m27088a((C3689f) hashMap.get(str5));
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f14408a) {
            this.f14412e.m27107a(iBinder);
            m27098c();
            this.f14409b = true;
            this.f14408a.notify();
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        abr.c("In-app billing service disconnected.");
        this.f14412e.m27109a();
    }
}
