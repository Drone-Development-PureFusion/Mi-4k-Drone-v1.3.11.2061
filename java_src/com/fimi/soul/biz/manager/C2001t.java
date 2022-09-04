package com.fimi.soul.biz.manager;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.TrafficStats;
import android.os.Handler;
import android.os.Message;
import com.fimi.soul.media.player.FimiMediaMeta;
import java.util.Timer;
import java.util.TimerTask;
/* renamed from: com.fimi.soul.biz.manager.t */
/* loaded from: classes.dex */
public class C2001t implements Handler.Callback {

    /* renamed from: b */
    private static C2001t f5583b = null;

    /* renamed from: h */
    private static final int f5584h = 1;

    /* renamed from: a */
    private AbstractC2003a f5585a;

    /* renamed from: c */
    private long f5586c = 0;

    /* renamed from: d */
    private long f5587d = 0;

    /* renamed from: e */
    private Handler f5588e = new Handler(this);

    /* renamed from: f */
    private Context f5589f;

    /* renamed from: g */
    private Timer f5590g;

    /* renamed from: com.fimi.soul.biz.manager.t$a */
    /* loaded from: classes.dex */
    public interface AbstractC2003a {
        /* renamed from: a */
        void mo31161a(String str, String str2);
    }

    public C2001t(Context context) {
        this.f5589f = null;
        this.f5589f = context;
    }

    /* renamed from: a */
    public static C2001t m33304a(Context context) {
        if (f5583b == null) {
            f5583b = new C2001t(context);
        }
        return f5583b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public String m33299c() {
        long j = 0;
        long totalRxBytes = TrafficStats.getUidRxBytes(this.f5589f.getApplicationInfo().uid) == -1 ? 0L : TrafficStats.getTotalRxBytes() / FimiMediaMeta.AV_CH_SIDE_RIGHT;
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = currentTimeMillis - this.f5587d;
        if (j2 != 0) {
            j = (((totalRxBytes - this.f5586c) * 1000) / 8) / j2;
        }
        this.f5587d = currentTimeMillis;
        this.f5586c = totalRxBytes;
        return String.valueOf(j) + " KB/s";
    }

    /* renamed from: a */
    public void m33305a() {
        if (this.f5590g != null) {
            this.f5590g.cancel();
        }
    }

    /* renamed from: a */
    public void m33303a(AbstractC2003a abstractC2003a) {
        this.f5585a = abstractC2003a;
        this.f5586c = TrafficStats.getUidRxBytes(this.f5589f.getApplicationInfo().uid) == -1 ? 0L : TrafficStats.getTotalRxBytes() / FimiMediaMeta.AV_CH_SIDE_RIGHT;
        this.f5587d = System.currentTimeMillis();
        this.f5590g = new Timer();
        this.f5590g.schedule(new TimerTask() { // from class: com.fimi.soul.biz.manager.t.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                String m33299c = C2001t.this.m33299c();
                Message obtain = Message.obtain();
                obtain.what = 1;
                obtain.obj = m33299c;
                C2001t.this.f5588e.sendMessage(obtain);
            }
        }, 1000L, 2000L);
    }

    /* renamed from: b */
    public String m33301b() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f5589f.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            if (activeNetworkInfo.getType() == 1) {
                return "WiFi";
            }
            if (activeNetworkInfo.getType() == 0) {
                String subtypeName = activeNetworkInfo.getSubtypeName();
                switch (activeNetworkInfo.getSubtype()) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                        return "2G";
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                        return "3G";
                    case 13:
                        return "4G";
                    default:
                        return (subtypeName.equalsIgnoreCase("TD-SCDMA") || subtypeName.equalsIgnoreCase("WCDMA") || subtypeName.equalsIgnoreCase("CDMA2000")) ? "3G" : subtypeName;
                }
            }
        }
        return "";
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what == 1) {
            this.f5585a.mo31161a((String) message.obj, m33301b());
            return false;
        }
        return false;
    }
}
