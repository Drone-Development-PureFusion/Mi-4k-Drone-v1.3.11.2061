package com.tencent.map.p262b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.tencent.map.b.g */
/* loaded from: classes2.dex */
public final class C10178g {

    /* renamed from: a */
    private Context f31482a = null;

    /* renamed from: b */
    private WifiManager f31483b = null;

    /* renamed from: c */
    private C10180a f31484c = null;

    /* renamed from: d */
    private Handler f31485d = null;

    /* renamed from: e */
    private Runnable f31486e = new Runnable() { // from class: com.tencent.map.b.g.1
        @Override // java.lang.Runnable
        public final void run() {
            C10178g.m5940a(C10178g.this);
        }
    };

    /* renamed from: f */
    private int f31487f = 1;

    /* renamed from: g */
    private AbstractC10182c f31488g = null;

    /* renamed from: h */
    private C10181b f31489h = null;

    /* renamed from: i */
    private boolean f31490i = false;

    /* renamed from: j */
    private byte[] f31491j = new byte[0];

    /* renamed from: com.tencent.map.b.g$a */
    /* loaded from: classes2.dex */
    public class C10180a extends BroadcastReceiver {

        /* renamed from: a */
        private int f31493a = 4;

        /* renamed from: b */
        private List<ScanResult> f31494b = null;

        /* renamed from: c */
        private boolean f31495c = false;

        public C10180a() {
        }

        /* renamed from: a */
        private void m5932a(List<ScanResult> list) {
            if (list == null) {
                return;
            }
            if (!this.f31495c) {
                if (this.f31494b == null) {
                    this.f31494b = new ArrayList();
                } else {
                    this.f31494b.clear();
                }
                for (ScanResult scanResult : list) {
                    this.f31494b.add(scanResult);
                }
                return;
            }
            if (this.f31494b == null) {
                this.f31494b = new ArrayList();
            }
            int size = this.f31494b.size();
            for (ScanResult scanResult2 : list) {
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    } else if (this.f31494b.get(i).BSSID.equals(scanResult2.BSSID)) {
                        this.f31494b.remove(i);
                        break;
                    } else {
                        i++;
                    }
                }
                this.f31494b.add(scanResult2);
            }
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("android.net.wifi.WIFI_STATE_CHANGED")) {
                this.f31493a = intent.getIntExtra("wifi_state", 4);
                if (C10178g.this.f31488g != null) {
                    C10178g.this.f31488g.mo5929b(this.f31493a);
                }
            }
            if (intent.getAction().equals("android.net.wifi.SCAN_RESULTS") || intent.getAction().equals("android.net.wifi.WIFI_STATE_CHANGED")) {
                List<ScanResult> list = null;
                if (C10178g.this.f31483b != null) {
                    list = C10178g.this.f31483b.getScanResults();
                }
                if (intent.getAction().equals("android.net.wifi.WIFI_STATE_CHANGED")) {
                    if (list == null) {
                        return;
                    }
                    if (list != null && list.size() == 0) {
                        return;
                    }
                }
                if (!this.f31495c && this.f31494b != null && this.f31494b.size() >= 4 && list != null && list.size() <= 2) {
                    m5932a(list);
                    this.f31495c = true;
                    C10178g.this.m5942a(0L);
                    return;
                }
                m5932a(list);
                this.f31495c = false;
                C10178g.this.f31489h = new C10181b(C10178g.this, this.f31494b, System.currentTimeMillis(), this.f31493a);
                if (C10178g.this.f31488g != null) {
                    C10178g.this.f31488g.mo5930a(C10178g.this.f31489h);
                }
                C10178g.this.m5942a(C10178g.this.f31487f * 20000);
            }
        }
    }

    /* renamed from: com.tencent.map.b.g$b */
    /* loaded from: classes2.dex */
    public class C10181b implements Cloneable {

        /* renamed from: a */
        private List<ScanResult> f31497a;

        public C10181b(C10178g c10178g, List<ScanResult> list, long j, int i) {
            this.f31497a = null;
            if (list != null) {
                this.f31497a = new ArrayList();
                for (ScanResult scanResult : list) {
                    this.f31497a.add(scanResult);
                }
            }
        }

        /* renamed from: a */
        public final List<ScanResult> m5931a() {
            return this.f31497a;
        }

        public final Object clone() {
            C10181b c10181b;
            try {
                c10181b = (C10181b) super.clone();
            } catch (Exception e) {
                c10181b = null;
            }
            if (this.f31497a != null) {
                c10181b.f31497a = new ArrayList();
                c10181b.f31497a.addAll(this.f31497a);
            }
            return c10181b;
        }
    }

    /* renamed from: com.tencent.map.b.g$c */
    /* loaded from: classes2.dex */
    public interface AbstractC10182c {
        /* renamed from: a */
        void mo5930a(C10181b c10181b);

        /* renamed from: b */
        void mo5929b(int i);
    }

    /* renamed from: a */
    static /* synthetic */ void m5940a(C10178g c10178g) {
        if (c10178g.f31483b == null || !c10178g.f31483b.isWifiEnabled()) {
            return;
        }
        c10178g.f31483b.startScan();
    }

    /* renamed from: a */
    public final void m5943a() {
        synchronized (this.f31491j) {
            if (!this.f31490i) {
                return;
            }
            if (this.f31482a == null || this.f31484c == null) {
                return;
            }
            try {
                this.f31482a.unregisterReceiver(this.f31484c);
            } catch (Exception e) {
            }
            this.f31485d.removeCallbacks(this.f31486e);
            this.f31490i = false;
        }
    }

    /* renamed from: a */
    public final void m5942a(long j) {
        if (this.f31485d == null || !this.f31490i) {
            return;
        }
        this.f31485d.removeCallbacks(this.f31486e);
        this.f31485d.postDelayed(this.f31486e, j);
    }

    /* renamed from: a */
    public final boolean m5941a(Context context, AbstractC10182c abstractC10182c, int i) {
        synchronized (this.f31491j) {
            if (this.f31490i) {
                return true;
            }
            if (context == null || abstractC10182c == null) {
                return false;
            }
            this.f31485d = new Handler(Looper.getMainLooper());
            this.f31482a = context;
            this.f31488g = abstractC10182c;
            this.f31487f = 1;
            try {
                this.f31483b = (WifiManager) this.f31482a.getSystemService("wifi");
                IntentFilter intentFilter = new IntentFilter();
                this.f31484c = new C10180a();
                if (this.f31483b == null || this.f31484c == null) {
                    return false;
                }
                intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
                intentFilter.addAction("android.net.wifi.SCAN_RESULTS");
                this.f31482a.registerReceiver(this.f31484c, intentFilter);
                m5942a(0L);
                this.f31490i = true;
                return this.f31490i;
            } catch (Exception e) {
                return false;
            }
        }
    }

    /* renamed from: b */
    public final boolean m5938b() {
        return this.f31490i;
    }

    /* renamed from: c */
    public final boolean m5936c() {
        if (this.f31482a == null || this.f31483b == null) {
            return false;
        }
        return this.f31483b.isWifiEnabled();
    }
}
