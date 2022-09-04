package com.mob.commons.clt;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.Location;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import com.facebook.common.util.UriUtil;
import com.mob.commons.C10054a;
import com.mob.commons.C10060b;
import com.mob.commons.C10074d;
import com.mob.commons.C10080f;
import com.mob.commons.LockAction;
import com.mob.tools.MobHandlerThread;
import com.mob.tools.MobLog;
import com.mob.tools.utils.Data;
import com.mob.tools.utils.FileLocker;
import com.mob.tools.utils.Hashon;
import com.mob.tools.utils.ReflectHelper;
import com.mob.tools.utils.ResHelper;
import com.tencent.p263mm.sdk.platformtools.Util;
import java.io.File;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Random;
import org.codehaus.jackson.org.objectweb.asm.Opcodes;
/* loaded from: classes2.dex */
public class DvcClt implements Handler.Callback {

    /* renamed from: a */
    private static DvcClt f31081a;

    /* renamed from: b */
    private Context f31082b;

    /* renamed from: d */
    private Handler f31084d;

    /* renamed from: f */
    private BroadcastReceiver f31086f;

    /* renamed from: c */
    private Hashon f31083c = new Hashon();

    /* renamed from: e */
    private Random f31085e = new Random();

    private DvcClt(Context context) {
        this.f31082b = context.getApplicationContext();
    }

    /* renamed from: a */
    private void m6315a() {
        MobHandlerThread mobHandlerThread = new MobHandlerThread() { // from class: com.mob.commons.clt.DvcClt.1
            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: a */
            public void m6303a() {
                super.run();
            }

            @Override // com.mob.tools.MobHandlerThread, java.lang.Thread, java.lang.Runnable
            public void run() {
                C10074d.m6265a(new File(ResHelper.getCacheRoot(DvcClt.this.f31082b), "comm/locks/.dic_lock"), new LockAction() { // from class: com.mob.commons.clt.DvcClt.1.1
                    @Override // com.mob.commons.LockAction
                    public boolean run(FileLocker fileLocker) {
                        m6303a();
                        return false;
                    }
                });
            }
        };
        mobHandlerThread.start();
        this.f31084d = new Handler(mobHandlerThread.getLooper(), this);
        this.f31084d.sendEmptyMessage(1);
        this.f31084d.sendEmptyMessage(2);
        this.f31084d.sendEmptyMessage(3);
        this.f31084d.sendEmptyMessage(5);
    }

    /* renamed from: a */
    private void m6314a(Location location, int i) {
        if (location != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("accuracy", Float.valueOf(location.getAccuracy()));
            hashMap.put("latitude", Double.valueOf(location.getLatitude()));
            hashMap.put("longitude", Double.valueOf(location.getLongitude()));
            hashMap.put("location_type", Integer.valueOf(i));
            HashMap<String, Object> hashMap2 = new HashMap<>();
            hashMap2.put("type", "LOCATION");
            hashMap2.put(UriUtil.DATA_SCHEME, hashMap);
            hashMap2.put("datetime", Long.valueOf(C10054a.m6371a(this.f31082b)));
            C10060b.m6331a(this.f31082b).m6332a(C10054a.m6371a(this.f31082b), hashMap2);
        }
    }

    /* renamed from: b */
    private void m6312b() {
        try {
            HashMap hashMap = new HashMap();
            Object invokeStaticMethod = ReflectHelper.invokeStaticMethod("DeviceHelper", "getInstance", this.f31082b);
            hashMap.put("phonename", ReflectHelper.invokeInstanceMethod(invokeStaticMethod, "getBluetoothName", new Object[0]));
            hashMap.put("signmd5", ReflectHelper.invokeInstanceMethod(invokeStaticMethod, "getSignMD5", new Object[0]));
            String MD5 = Data.MD5(this.f31083c.fromHashMap(hashMap));
            String m6254a = C10080f.m6254a(this.f31082b);
            if (m6254a != null && m6254a.equals(MD5)) {
                return;
            }
            HashMap<String, Object> hashMap2 = new HashMap<>();
            hashMap2.put("type", "DEVEXT");
            hashMap2.put(UriUtil.DATA_SCHEME, hashMap);
            hashMap2.put("datetime", Long.valueOf(C10054a.m6371a(this.f31082b)));
            C10060b.m6331a(this.f31082b).m6332a(C10054a.m6371a(this.f31082b), hashMap2);
            C10080f.m6252a(this.f31082b, MD5);
        } catch (Throwable th) {
            MobLog.getInstance().m6187w(th);
        }
    }

    /* renamed from: c */
    private boolean m6310c() {
        long m6251b = C10080f.m6251b(this.f31082b);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(m6251b);
        int i = calendar.get(1);
        int i2 = calendar.get(2);
        int i3 = calendar.get(5);
        long m6371a = C10054a.m6371a(this.f31082b);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(m6371a);
        return (i == calendar2.get(1) && i2 == calendar2.get(2) && i3 == calendar2.get(5)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public void m6308d() {
        synchronized (f31081a) {
            HashMap hashMap = new HashMap();
            Object invokeStaticMethod = ReflectHelper.invokeStaticMethod("DeviceHelper", "getInstance", this.f31082b);
            hashMap.put("ssid", ReflectHelper.invokeInstanceMethod(invokeStaticMethod, "getSSID", new Object[0]));
            hashMap.put("bssid", ReflectHelper.invokeInstanceMethod(invokeStaticMethod, "getBssid", new Object[0]));
            HashMap<String, Object> hashMap2 = new HashMap<>();
            hashMap2.put("type", "WIFI_INFO");
            hashMap2.put(UriUtil.DATA_SCHEME, hashMap);
            long m6371a = C10054a.m6371a(this.f31082b);
            hashMap2.put("datetime", Long.valueOf(m6371a));
            C10060b.m6331a(this.f31082b).m6332a(C10054a.m6371a(this.f31082b), hashMap2);
            C10080f.m6253a(this.f31082b, m6371a);
            C10080f.m6249b(this.f31082b, Data.MD5(this.f31083c.fromHashMap(hashMap)));
        }
    }

    /* renamed from: e */
    private void m6307e() {
        if (this.f31086f == null) {
            this.f31086f = new BroadcastReceiver() { // from class: com.mob.commons.clt.DvcClt.2
                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    Parcelable parcelableExtra;
                    try {
                        if (!"android.net.wifi.STATE_CHANGE".equals(intent.getAction()) || (parcelableExtra = intent.getParcelableExtra("networkInfo")) == null || !((NetworkInfo) parcelableExtra).isAvailable()) {
                            return;
                        }
                        HashMap hashMap = new HashMap();
                        Object invokeStaticMethod = ReflectHelper.invokeStaticMethod("DeviceHelper", "getInstance", context);
                        hashMap.put("ssid", ReflectHelper.invokeInstanceMethod(invokeStaticMethod, "getSSID", new Object[0]));
                        hashMap.put("bssid", ReflectHelper.invokeInstanceMethod(invokeStaticMethod, "getBssid", new Object[0]));
                        String MD5 = Data.MD5(DvcClt.this.f31083c.fromHashMap(hashMap));
                        String m6248c = C10080f.m6248c(context);
                        if ((m6248c != null && m6248c.equals(MD5)) || !C10054a.m6354n(context)) {
                            return;
                        }
                        DvcClt.this.m6308d();
                    } catch (Throwable th) {
                        MobLog.getInstance().m6187w(th);
                    }
                }
            };
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.wifi.STATE_CHANGE");
        try {
            this.f31082b.registerReceiver(this.f31086f, intentFilter);
        } catch (Throwable th) {
        }
    }

    /* renamed from: f */
    private void m6306f() {
        if (this.f31086f != null) {
            try {
                this.f31082b.unregisterReceiver(this.f31086f);
            } catch (Throwable th) {
            }
            this.f31086f = null;
        }
    }

    /* renamed from: g */
    private void m6305g() {
        int i;
        HashMap hashMap = new HashMap();
        Object invokeStaticMethod = ReflectHelper.invokeStaticMethod("DeviceHelper", "getInstance", this.f31082b);
        try {
            i = Integer.parseInt((String) ReflectHelper.invokeInstanceMethod(invokeStaticMethod, "getCarrier", new Object[0]));
        } catch (Throwable th) {
            i = -1;
        }
        hashMap.put("carrier", Integer.valueOf(i));
        hashMap.put("simopname", ReflectHelper.invokeInstanceMethod(invokeStaticMethod, "getCarrierName", new Object[0]));
        hashMap.put("lac", ReflectHelper.invokeInstanceMethod(invokeStaticMethod, "getCellLac", new Object[0]));
        hashMap.put("cell", ReflectHelper.invokeInstanceMethod(invokeStaticMethod, "getCellId", new Object[0]));
        HashMap<String, Object> hashMap2 = new HashMap<>();
        hashMap2.put("type", "BSINFO");
        hashMap2.put(UriUtil.DATA_SCHEME, hashMap);
        hashMap2.put("datetime", Long.valueOf(C10054a.m6371a(this.f31082b)));
        C10060b.m6331a(this.f31082b).m6332a(C10054a.m6371a(this.f31082b), hashMap2);
        C10080f.m6247c(this.f31082b, Data.MD5(this.f31083c.fromHashMap(hashMap)));
        C10080f.m6250b(this.f31082b, C10054a.m6371a(this.f31082b) + (C10054a.m6357k(this.f31082b) * 1000));
    }

    /* renamed from: h */
    private boolean m6304h() {
        int i;
        HashMap hashMap = new HashMap();
        Object invokeStaticMethod = ReflectHelper.invokeStaticMethod("DeviceHelper", "getInstance", this.f31082b);
        try {
            i = Integer.parseInt((String) ReflectHelper.invokeInstanceMethod(invokeStaticMethod, "getCarrier", new Object[0]));
        } catch (Throwable th) {
            i = -1;
        }
        hashMap.put("carrier", Integer.valueOf(i));
        hashMap.put("simopname", ReflectHelper.invokeInstanceMethod(invokeStaticMethod, "getCarrierName", new Object[0]));
        hashMap.put("lac", ReflectHelper.invokeInstanceMethod(invokeStaticMethod, "getCellLac", new Object[0]));
        hashMap.put("cell", ReflectHelper.invokeInstanceMethod(invokeStaticMethod, "getCellId", new Object[0]));
        String MD5 = Data.MD5(this.f31083c.fromHashMap(hashMap));
        String m6246d = C10080f.m6246d(this.f31082b);
        return m6246d == null || !m6246d.equals(MD5);
    }

    public static synchronized void startCollector(Context context) {
        synchronized (DvcClt.class) {
            if (f31081a == null) {
                f31081a = new DvcClt(context);
                f31081a.m6315a();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0084, code lost:
        if (m6304h() != false) goto L28;
     */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean handleMessage(Message message) {
        switch (message.what) {
            case 1:
                if (C10054a.m6359i(this.f31082b)) {
                    m6312b();
                    break;
                }
                break;
            case 2:
                if (C10054a.m6354n(this.f31082b)) {
                    if (m6310c()) {
                        m6308d();
                    }
                    m6307e();
                } else {
                    m6306f();
                }
                this.f31084d.sendEmptyMessageDelayed(2, Util.MILLSECONDS_OF_HOUR);
                break;
            case 3:
                if (C10054a.m6358j(this.f31082b)) {
                    try {
                        m6305g();
                    } catch (Throwable th) {
                        MobLog.getInstance().m6187w(th);
                    }
                    this.f31084d.sendEmptyMessageDelayed(4, (this.f31085e.nextInt(120) + Opcodes.GETFIELD) * 1000);
                    break;
                }
                break;
            case 4:
                if (C10054a.m6358j(this.f31082b)) {
                    if (C10054a.m6371a(this.f31082b) + (C10054a.m6357k(this.f31082b) * 1000) >= C10054a.m6371a(this.f31082b)) {
                        try {
                            break;
                        } catch (Throwable th2) {
                            MobLog.getInstance().m6187w(th2);
                        }
                    }
                    m6305g();
                    this.f31084d.sendEmptyMessageDelayed(4, (this.f31085e.nextInt(120) + Opcodes.GETFIELD) * 1000);
                    break;
                }
                break;
            case 5:
                if (C10054a.m6356l(this.f31082b)) {
                    try {
                        Object invokeStaticMethod = ReflectHelper.invokeStaticMethod("DeviceHelper", "getInstance", this.f31082b);
                        m6314a((Location) ReflectHelper.invokeInstanceMethod(invokeStaticMethod, "getLocation", 30, 0, true), 1);
                        m6314a((Location) ReflectHelper.invokeInstanceMethod(invokeStaticMethod, "getLocation", 15, 0, true), 2);
                    } catch (Throwable th3) {
                        MobLog.getInstance().m6187w(th3);
                    }
                }
                this.f31084d.sendEmptyMessageDelayed(5, C10054a.m6355m(this.f31082b) * 1000);
                break;
        }
        return false;
    }
}
