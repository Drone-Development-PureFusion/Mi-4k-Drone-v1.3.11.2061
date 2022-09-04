package com.fimi.soul.service;

import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbManager;
import android.os.AsyncTask;
import android.os.IBinder;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.biz.camera.C1783b;
import com.fimi.soul.biz.camera.C1827d;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.droneconnection.connection.p198a.C2203a;
import com.fimi.soul.drone.p204h.C2279c;
import com.fimi.soul.utils.C3103au;
import com.hoho.android.usbserial.driver.UsbSerialProber;
/* loaded from: classes.dex */
public class DroneConnectService extends Service {

    /* renamed from: c */
    public static final String f11396c = "android.hardware.usb.action.USB_DEVICE_DETACHED";

    /* renamed from: d */
    public static final String f11397d = "android.hardware.usb.action.USB_DEVICE_ATTACHED";

    /* renamed from: e */
    public static final String f11398e = "USBHAVECONNECT";

    /* renamed from: f */
    public static final String f11399f = "TCPSONNECTSUCESS";

    /* renamed from: g */
    public static final String f11400g = "android.hardware.usb.action.USB_STATE";

    /* renamed from: h */
    public static final String f11401h = "android.net.conn.TETHER_STATE_CHANGED";

    /* renamed from: l */
    private static final String f11402l = "com.android.example.USB_PERMISSION";

    /* renamed from: a */
    public C2083a f11403a;

    /* renamed from: b */
    public DroidPlannerApp f11404b;

    /* renamed from: i */
    BroadcastReceiver f11405i = new BroadcastReceiver() { // from class: com.fimi.soul.service.DroneConnectService.2
        /* JADX WARN: Type inference failed for: r0v8, types: [com.fimi.soul.service.DroneConnectService$2$1] */
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (DroneConnectService.f11402l.equals(intent.getAction())) {
                synchronized (this) {
                    UsbDevice usbDevice = (UsbDevice) intent.getParcelableExtra("device");
                    if (intent.getBooleanExtra("permission", false) && usbDevice != null) {
                        DroneConnectService.this.m29482a(usbDevice);
                    }
                }
            }
            if (DroneConnectService.f11397d.equals(intent.getAction()) && !DroneConnectService.this.f11403a.mo32906ab().mo32588a()) {
                C2203a.m32716a(C2279c.f7266c);
                DroneConnectService.this.f11403a.mo32906ab().mo32581b();
            } else if (DroneConnectService.f11396c.equals(intent.getAction()) && DroneConnectService.this.f11403a.mo32906ab().mo32588a()) {
                DroneConnectService.this.f11403a.mo32906ab().mo32576d();
            } else if (DroneConnectService.f11401h.equals(intent.getAction()) && C2279c.f7266c.equals(DroneConnectService.this.f11403a.mo32906ab().mo32574e())) {
            } else {
                new AsyncTask<Void, Void, Boolean>() { // from class: com.fimi.soul.service.DroneConnectService.2.1
                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // android.os.AsyncTask
                    /* renamed from: a */
                    public Boolean doInBackground(Void... voidArr) {
                        return Boolean.valueOf(C3103au.m29207d(C2279c.m32453b()));
                    }

                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // android.os.AsyncTask
                    /* renamed from: a */
                    public void onPostExecute(Boolean bool) {
                        super.onPostExecute(bool);
                        C1827d c1827d = (C1827d) C1783b.m34166a().m34150d();
                        if (!DroneConnectService.this.f11403a.mo32906ab().mo32588a() && bool.booleanValue()) {
                            C2203a.m32716a(C2279c.f7267d);
                            DroneConnectService.this.f11403a.mo32906ab().mo32581b();
                            c1827d.m33987w().m33996b();
                        } else if (!DroneConnectService.this.f11403a.mo32906ab().mo32588a() || bool.booleanValue() || !DroneConnectService.this.f11403a.mo32906ab().mo32574e().equals(C2279c.f7267d)) {
                        } else {
                            DroneConnectService.this.f11403a.mo32906ab().mo32576d();
                            c1827d.a(-1);
                            c1827d.n();
                        }
                    }
                }.execute(new Void[0]);
            }
        }
    };

    /* renamed from: j */
    private UsbManager f11406j;

    /* renamed from: k */
    private PendingIntent f11407k;

    /* JADX WARN: Type inference failed for: r0v16, types: [com.fimi.soul.service.DroneConnectService$1] */
    /* renamed from: a */
    public void m29483a() {
        if (UsbSerialProber.findFirstDevice(this.f11406j) != null) {
            C2203a.m32716a(C2279c.f7266c);
            if (this.f11403a.mo32906ab().mo32588a()) {
                return;
            }
            this.f11403a.mo32906ab().mo32581b();
        } else if (this.f11406j != null) {
            for (UsbDevice usbDevice : this.f11406j.getDeviceList().values()) {
                m29482a(usbDevice);
            }
            if (this.f11403a.mo32906ab().mo32588a()) {
                return;
            }
            new AsyncTask<Void, Void, Boolean>() { // from class: com.fimi.soul.service.DroneConnectService.1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // android.os.AsyncTask
                /* renamed from: a */
                public Boolean doInBackground(Void... voidArr) {
                    return Boolean.valueOf(C3103au.m29207d(C2279c.m32453b()));
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // android.os.AsyncTask
                /* renamed from: a */
                public void onPostExecute(Boolean bool) {
                    super.onPostExecute(bool);
                    if (bool.booleanValue()) {
                        C2203a.m32716a(C2279c.f7267d);
                        DroneConnectService.this.f11403a.mo32906ab().mo32581b();
                    }
                }
            }.execute(new Void[0]);
        }
    }

    /* renamed from: a */
    public void m29482a(UsbDevice usbDevice) {
        if (usbDevice.getVendorId() == 1155 && usbDevice.getProductId() == 22336) {
            if (!this.f11406j.hasPermission(usbDevice)) {
                this.f11407k = PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent(f11402l), 0);
                this.f11406j.requestPermission(usbDevice, this.f11407k);
            }
            C2203a.m32716a(C2279c.f7266c);
            if (this.f11403a.mo32906ab().mo32588a()) {
                return;
            }
            this.f11403a.mo32906ab().mo32581b();
        }
    }

    /* renamed from: b */
    public void m29481b() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(f11397d);
        intentFilter.addAction(f11396c);
        intentFilter.addAction(f11398e);
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
        intentFilter.addAction("android.net.wifi.STATE_CHANGE");
        intentFilter.addAction("android.hardware.usb.action.USB_STATE");
        intentFilter.addAction(f11399f);
        intentFilter.addAction(f11401h);
        intentFilter.addAction(f11402l);
        registerReceiver(this.f11405i, intentFilter);
    }

    /* renamed from: c */
    public void m29480c() {
        unregisterReceiver(this.f11405i);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f11404b = (DroidPlannerApp) getApplication();
        this.f11403a = this.f11404b.f4493a;
        this.f11406j = (UsbManager) getSystemService("usb");
        m29481b();
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        m29480c();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        m29483a();
        return super.onStartCommand(intent, i, i2);
    }
}
