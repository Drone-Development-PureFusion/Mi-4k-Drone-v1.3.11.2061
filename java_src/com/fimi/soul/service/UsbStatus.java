package com.fimi.soul.service;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.wifi.WifiManager;
import android.os.IBinder;
import android.support.annotation.Nullable;
import com.fimi.kernel.utils.C1685x;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.biz.p170b.C1772d;
import com.fimi.soul.biz.p179g.C1846a;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.utils.C3103au;
/* loaded from: classes.dex */
public class UsbStatus extends Service {

    /* renamed from: a */
    public static final String f11444a = "android.hardware.usb.action.USB_STATE";

    /* renamed from: b */
    public static final String f11445b = "android.net.conn.CONNECTIVITY_CHANGE";

    /* renamed from: d */
    private DroidPlannerApp f11447d;

    /* renamed from: e */
    private C2083a f11448e;

    /* renamed from: f */
    private int f11449f = 0;

    /* renamed from: c */
    BroadcastReceiver f11446c = new BroadcastReceiver() { // from class: com.fimi.soul.service.UsbStatus.1
        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public void m29445a() {
            UsbStatus.this.f11448e.mo32906ab().mo32576d();
            C1772d.m34208a().m34204a(false);
            UsbStatus.this.f11448e.m33017ad();
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.hardware.usb.action.USB_STATE".equals(intent.getAction())) {
                if (intent.getExtras().getBoolean("connected")) {
                    return;
                }
                if ((!UsbStatus.this.f11448e.mo32905ac() && !UsbStatus.this.f11448e.mo32906ab().mo32588a()) || C1846a.m33917a().m33915b() != 1) {
                    return;
                }
                m29445a();
            } else if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            } else {
                UsbStatus.this.f11449f = 0;
                if (C1846a.m33917a().m33915b() != 2) {
                    return;
                }
                WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
                if (wifiManager.getWifiState() == 3) {
                    C1685x.m34455b(new Runnable() { // from class: com.fimi.soul.service.UsbStatus.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            boolean z = false;
                            while (UsbStatus.this.f11449f < 2) {
                                z = C3103au.m29207d("192.168.100.1");
                                UsbStatus.m29446c(UsbStatus.this);
                            }
                            if (!z) {
                                m29445a();
                            }
                        }
                    });
                } else if (wifiManager.getWifiState() != 1 && wifiManager.getWifiState() != 0) {
                } else {
                    m29445a();
                }
            }
        }
    };

    /* renamed from: c */
    static /* synthetic */ int m29446c(UsbStatus usbStatus) {
        int i = usbStatus.f11449f;
        usbStatus.f11449f = i + 1;
        return i;
    }

    /* renamed from: a */
    public void m29450a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.hardware.usb.action.USB_STATE");
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        registerReceiver(this.f11446c, intentFilter);
    }

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f11447d = (DroidPlannerApp) getApplication();
        this.f11448e = this.f11447d.f4493a;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        m29450a();
        return super.onStartCommand(intent, i, i2);
    }
}
