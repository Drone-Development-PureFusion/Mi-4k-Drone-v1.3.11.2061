package com.tencent.p263mm.sdk.platformtools;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import com.google.firebase.p251a.C9654a;
import com.tencent.p263mm.sdk.platformtools.MTimerHandler;
import com.tencent.p263mm.sdk.platformtools.PhoneUtil;
import com.xiaomi.mipush.sdk.Constants;
import java.util.LinkedList;
import java.util.List;
/* renamed from: com.tencent.mm.sdk.platformtools.LBSManager */
/* loaded from: classes2.dex */
public class LBSManager extends BroadcastReceiver {
    public static final String FILTER_GPS = "filter_gps";
    public static final int INVALID_ACC = -1000;
    public static final float INVALID_LAT = -1000.0f;
    public static final float INVALID_LNG = -1000.0f;
    public static final int MM_SOURCE_HARDWARE = 0;
    public static final int MM_SOURCE_NET = 1;
    public static final int MM_SOURCE_REPORT_HARWARE = 3;
    public static final int MM_SOURCE_REPORT_NETWORK = 4;

    /* renamed from: ab */
    private static LocationCache f31599ab;

    /* renamed from: R */
    private Context f31600R;

    /* renamed from: ac */
    private OnLocationGotListener f31601ac;

    /* renamed from: ad */
    private LocationManager f31602ad;

    /* renamed from: ae */
    private PendingIntent f31603ae;

    /* renamed from: af */
    private boolean f31604af = false;

    /* renamed from: ah */
    boolean f31606ah = false;

    /* renamed from: ai */
    boolean f31607ai = false;

    /* renamed from: ak */
    private MTimerHandler f31609ak = new MTimerHandler(new MTimerHandler.CallBack() { // from class: com.tencent.mm.sdk.platformtools.LBSManager.1
        @Override // com.tencent.p263mm.sdk.platformtools.MTimerHandler.CallBack
        public boolean onTimerExpired() {
            Log.m5869v("MicroMsg.LBSManager", "get location by GPS failed.");
            LBSManager.this.f31605ag = true;
            LBSManager.this.start();
            LBSManager.this.f31604af = false;
            return false;
        }
    }, false);

    /* renamed from: ag */
    boolean f31605ag = false;

    /* renamed from: aj */
    int f31608aj = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tencent.mm.sdk.platformtools.LBSManager$LocationCache */
    /* loaded from: classes2.dex */
    public static class LocationCache {
        long time;

        /* renamed from: am */
        float f31612am = -1000.0f;

        /* renamed from: an */
        float f31613an = -1000.0f;

        /* renamed from: ao */
        int f31614ao = -1000;

        /* renamed from: I */
        int f31611I = 1;

        LocationCache() {
        }
    }

    /* renamed from: com.tencent.mm.sdk.platformtools.LBSManager$OnLocationGotListener */
    /* loaded from: classes2.dex */
    public interface OnLocationGotListener {
        void onLocationGot(float f, float f2, int i, int i2, String str, String str2, boolean z);
    }

    public LBSManager(Context context, OnLocationGotListener onLocationGotListener) {
        this.f31601ac = onLocationGotListener;
        this.f31600R = context;
        PhoneUtil.getSignalStrength(context);
        this.f31602ad = (LocationManager) context.getSystemService(C9654a.C9656b.f30231p);
        m5881b();
        this.f31603ae = PendingIntent.getBroadcast(context, 0, new Intent(FILTER_GPS), 134217728);
    }

    /* renamed from: b */
    private boolean m5881b() {
        if (this.f31602ad != null) {
            try {
                this.f31602ad.sendExtraCommand("gps", "force_xtra_injection", null);
                this.f31602ad.sendExtraCommand("gps", "force_time_injection", null);
                return true;
            } catch (Exception e) {
                return false;
            }
        }
        return false;
    }

    /* renamed from: c */
    private void m5880c() {
        this.f31609ak.stopTimer();
        this.f31605ag = true;
    }

    public static void setLocationCache(float f, float f2, int i, int i2) {
        if (i == 0) {
            return;
        }
        Log.m5869v("MicroMsg.LBSManager", "setLocationCache [" + f + Constants.ACCEPT_TIME_SEPARATOR_SP + f2 + "] acc:" + i + " source:" + i2);
        if (f31599ab == null) {
            f31599ab = new LocationCache();
        }
        f31599ab.f31612am = f;
        f31599ab.f31613an = f2;
        f31599ab.f31614ao = i;
        f31599ab.time = System.currentTimeMillis();
        f31599ab.f31611I = i2;
    }

    public String getTelLocation() {
        return PhoneUtil.getCellXml(PhoneUtil.getCellInfoList(this.f31600R));
    }

    public String getWIFILocation() {
        WifiManager wifiManager = (WifiManager) this.f31600R.getSystemService("wifi");
        if (wifiManager == null) {
            Log.m5875e("MicroMsg.LBSManager", "no wifi service");
            return "";
        } else if (wifiManager.getConnectionInfo() == null) {
            Log.m5875e("MicroMsg.LBSManager", "WIFILocation wifi info null");
            return "";
        } else {
            LinkedList linkedList = new LinkedList();
            List<ScanResult> scanResults = wifiManager.getScanResults();
            if (scanResults != null) {
                int i = 0;
                while (true) {
                    int i2 = i;
                    if (i2 >= scanResults.size()) {
                        break;
                    }
                    linkedList.add(new PhoneUtil.MacInfo(scanResults.get(i2).BSSID, new StringBuilder().append(scanResults.get(i2).level).toString()));
                    i = i2 + 1;
                }
            }
            return PhoneUtil.getMacXml(linkedList);
        }
    }

    public boolean isGpsEnable() {
        try {
            return this.f31602ad.isProviderEnabled("gps");
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isNetworkPrividerEnable() {
        try {
            return this.f31602ad.isProviderEnabled("network");
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Location location = (Location) intent.getExtras().get(C9654a.C9656b.f30231p);
        this.f31608aj++;
        if (location != null) {
            boolean equals = "gps".equals(location.getProvider());
            if (((!equals || location.getAccuracy() > 200.0f) && (equals || location.getAccuracy() > 1000.0f)) || location.getAccuracy() <= 0.0f) {
                return;
            }
            int i = equals ? 0 : 1;
            setLocationCache((float) location.getLatitude(), (float) location.getLongitude(), (int) location.getAccuracy(), i);
            if (this.f31601ac == null) {
                return;
            }
            if (this.f31605ag && this.f31606ah && this.f31607ai) {
                return;
            }
            String nullAsNil = Util.nullAsNil(getWIFILocation());
            String nullAsNil2 = Util.nullAsNil(getTelLocation());
            if (!this.f31605ag) {
                m5880c();
                this.f31605ag = true;
                Log.m5869v("MicroMsg.LBSManager", "location by provider ok:[" + location.getLatitude() + " , " + location.getLongitude() + "]  accuracy:" + location.getAccuracy() + "  retry count:" + this.f31608aj + " isGpsProvider:" + equals);
                this.f31601ac.onLocationGot((float) location.getLatitude(), (float) location.getLongitude(), (int) location.getAccuracy(), i, nullAsNil, nullAsNil2, true);
            } else if (!this.f31606ah && i == 0) {
                this.f31606ah = true;
                Log.m5869v("MicroMsg.LBSManager", "report location by GPS ok:[" + location.getLatitude() + " , " + location.getLongitude() + "]  accuracy:" + location.getAccuracy() + "  retry count:" + this.f31608aj + " isGpsProvider:" + equals);
                this.f31601ac.onLocationGot((float) location.getLatitude(), (float) location.getLongitude(), (int) location.getAccuracy(), 3, nullAsNil, nullAsNil2, true);
            } else if (this.f31607ai || i != 1) {
            } else {
                this.f31607ai = true;
                Log.m5869v("MicroMsg.LBSManager", "report location by Network ok:[" + location.getLatitude() + " , " + location.getLongitude() + "]  accuracy:" + location.getAccuracy() + "  retry count:" + this.f31608aj + " isGpsProvider:" + equals);
                this.f31601ac.onLocationGot((float) location.getLatitude(), (float) location.getLongitude(), (int) location.getAccuracy(), 4, nullAsNil, nullAsNil2, true);
            }
        }
    }

    public void removeGpsUpdate() {
        Log.m5869v("MicroMsg.LBSManager", "removed gps update");
        if (this.f31602ad != null) {
            this.f31602ad.removeUpdates(this.f31603ae);
        }
        try {
            this.f31600R.unregisterReceiver(this);
        } catch (Exception e) {
            Log.m5869v("MicroMsg.LBSManager", "location receiver has already unregistered");
        }
    }

    public void removeListener() {
        Log.m5869v("MicroMsg.LBSManager", "removed gps update on destroy");
        removeGpsUpdate();
        if (this.f31609ak != null) {
            m5880c();
        }
        this.f31601ac = null;
        this.f31600R = null;
        this.f31609ak = null;
        this.f31602ad = null;
    }

    public void requestGpsUpdate() {
        if (isGpsEnable() || isNetworkPrividerEnable()) {
            Log.m5869v("MicroMsg.LBSManager", "requested gps update");
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(FILTER_GPS);
            this.f31600R.registerReceiver(this, intentFilter);
            if (isGpsEnable()) {
                this.f31602ad.requestLocationUpdates("gps", 500L, 0.0f, this.f31603ae);
            }
            if (!isNetworkPrividerEnable()) {
                return;
            }
            this.f31602ad.requestLocationUpdates("network", 500L, 0.0f, this.f31603ae);
        }
    }

    public void start() {
        String nullAsNil = Util.nullAsNil(getWIFILocation());
        String nullAsNil2 = Util.nullAsNil(getTelLocation());
        if ((isGpsEnable() || isNetworkPrividerEnable()) && !this.f31604af) {
            this.f31604af = true;
            this.f31608aj = 0;
            requestGpsUpdate();
            this.f31609ak.startTimer(3000L);
            return;
        }
        if (f31599ab == null ? false : System.currentTimeMillis() - f31599ab.time <= 180000 && f31599ab.f31614ao > 0) {
            if (this.f31601ac == null) {
                return;
            }
            this.f31605ag = true;
            Log.m5869v("MicroMsg.LBSManager", "location by GPS cache ok:[" + f31599ab.f31612am + " , " + f31599ab.f31613an + "]  accuracy:" + f31599ab.f31614ao + " source:" + f31599ab.f31611I);
            this.f31601ac.onLocationGot(f31599ab.f31612am, f31599ab.f31613an, f31599ab.f31614ao, f31599ab.f31611I, nullAsNil, nullAsNil2, true);
            return;
        }
        this.f31605ag = true;
        if (!nullAsNil.equals("") || !nullAsNil2.equals("")) {
            Log.m5869v("MicroMsg.LBSManager", "get location by network ok, macs : " + nullAsNil + " cell ids :" + nullAsNil2);
            if (this.f31601ac == null) {
                return;
            }
            this.f31601ac.onLocationGot(-1000.0f, -1000.0f, -1000, 0, nullAsNil, nullAsNil2, true);
            return;
        }
        Log.m5869v("MicroMsg.LBSManager", "get location by network failed");
        if (this.f31601ac == null) {
            return;
        }
        this.f31601ac.onLocationGot(-1000.0f, -1000.0f, -1000, 0, "", "", false);
    }
}
