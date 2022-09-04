package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationManager;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.telephony.NeighboringCellInfo;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.google.firebase.p251a.C9654a;
import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
import com.xiaomi.channel.commonutils.misc.C10406b;
import com.xiaomi.channel.commonutils.misc.C10410f;
import com.xiaomi.channel.commonutils.network.C10423d;
import com.xiaomi.push.service.C10612ah;
import com.xiaomi.xmpush.thrift.C10775ae;
import com.xiaomi.xmpush.thrift.C10799aq;
import com.xiaomi.xmpush.thrift.C10800b;
import com.xiaomi.xmpush.thrift.C10810i;
import com.xiaomi.xmpush.thrift.C10815l;
import com.xiaomi.xmpush.thrift.C10817m;
import com.xiaomi.xmpush.thrift.C10833v;
import com.xiaomi.xmpush.thrift.EnumC10766a;
import com.xiaomi.xmpush.thrift.EnumC10806e;
import com.xiaomi.xmpush.thrift.EnumC10821o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
/* renamed from: com.xiaomi.mipush.sdk.d */
/* loaded from: classes2.dex */
public class C10475d extends C10410f.AbstractRunnableC10411a {

    /* renamed from: g */
    private Context f32563g;

    /* renamed from: a */
    private final int f32557a = 30;

    /* renamed from: b */
    private final int f32558b = -1;

    /* renamed from: c */
    private final int f32559c = 3600;

    /* renamed from: d */
    private final String f32560d = MiPushClient.PREF_EXTRA;

    /* renamed from: e */
    private final String f32561e = "GeoFenceNetInfoUpdateJob";

    /* renamed from: f */
    private final String f32562f = "last_upload_lbs_data_timestamp";

    /* renamed from: h */
    private Comparator<ScanResult> f32564h = new C10476e(this);

    public C10475d(Context context) {
        this.f32563g = context;
    }

    /* renamed from: a */
    private Location m5003a(Location location, Location location2) {
        return location == null ? location2 : (location2 == null || location.getTime() > location2.getTime()) ? location : location2;
    }

    /* renamed from: a */
    private boolean m5004a(long j) {
        return Math.abs((System.currentTimeMillis() / 1000) - this.f32563g.getSharedPreferences(MiPushClient.PREF_EXTRA, 0).getLong("last_upload_lbs_data_timestamp", -1L)) / 1000 > j;
    }

    /* renamed from: c */
    private boolean m5001c() {
        if (C10423d.m5211f(this.f32563g)) {
            return true;
        }
        int m4397a = C10612ah.m4394a(this.f32563g).m4397a(EnumC10806e.UploadNOWIFIGeoLocFrequency.m3437a(), 3600);
        if (C10423d.m5210g(this.f32563g) && m5004a(m4397a)) {
            return true;
        }
        if (C10423d.m5209h(this.f32563g) && m5004a(m4397a)) {
            return true;
        }
        return C10423d.m5208i(this.f32563g) && m5004a((long) m4397a);
    }

    /* renamed from: d */
    private C10817m m5000d() {
        C10817m c10817m = new C10817m();
        c10817m.m3363a(m4999e());
        c10817m.m3360b(m4998f());
        c10817m.m3365a(m4997g());
        return c10817m;
    }

    /* renamed from: e */
    private List<C10833v> m4999e() {
        try {
            List<ScanResult> scanResults = ((WifiManager) this.f32563g.getSystemService("wifi")).getScanResults();
            if (C10406b.m5258a(scanResults)) {
                return null;
            }
            Collections.sort(scanResults, this.f32564h);
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < Math.min(30, scanResults.size()); i++) {
                ScanResult scanResult = scanResults.get(i);
                if (scanResult != null) {
                    C10833v c10833v = new C10833v();
                    c10833v.m3241a(TextUtils.isEmpty(scanResult.BSSID) ? "" : scanResult.BSSID);
                    c10833v.m3243a(scanResult.level);
                    c10833v.m3237b(scanResult.SSID);
                    arrayList.add(c10833v);
                }
            }
            return arrayList;
        } catch (Throwable th) {
            return null;
        }
    }

    /* renamed from: f */
    private List<C10800b> m4998f() {
        try {
            List neighboringCellInfo = ((TelephonyManager) this.f32563g.getSystemService("phone")).getNeighboringCellInfo();
            int i = 0;
            ArrayList arrayList = null;
            while (i < neighboringCellInfo.size()) {
                NeighboringCellInfo neighboringCellInfo2 = (NeighboringCellInfo) neighboringCellInfo.get(i);
                ArrayList arrayList2 = new ArrayList();
                if (neighboringCellInfo2.getLac() > 0 || neighboringCellInfo2.getCid() > 0) {
                    C10800b c10800b = new C10800b();
                    c10800b.m3467a(neighboringCellInfo2.getCid());
                    c10800b.m3463b((neighboringCellInfo2.getRssi() * 2) - 113);
                    arrayList2.add(c10800b);
                }
                i++;
                arrayList = arrayList2;
            }
            return arrayList;
        } catch (Throwable th) {
            return null;
        }
    }

    /* renamed from: g */
    private C10810i m4997g() {
        Location m4996h;
        if (m5002b() && (m4996h = m4996h()) != null) {
            C10815l c10815l = new C10815l();
            c10815l.m3373b(m4996h.getLatitude());
            c10815l.m3377a(m4996h.getLongitude());
            C10810i c10810i = new C10810i();
            c10810i.m3430a(m4996h.getAccuracy());
            c10810i.m3427a(c10815l);
            c10810i.m3426a(m4996h.getProvider());
            c10810i.m3429a(new Date().getTime() - m4996h.getTime());
            return c10810i;
        }
        return null;
    }

    /* renamed from: h */
    private Location m4996h() {
        Location location;
        Location location2;
        Location location3;
        LocationManager locationManager = (LocationManager) this.f32563g.getSystemService(C9654a.C9656b.f30231p);
        try {
            location = locationManager.getLastKnownLocation("network");
        } catch (Exception e) {
            location = null;
        }
        try {
            location2 = locationManager.getLastKnownLocation("gps");
        } catch (Exception e2) {
            location2 = null;
        }
        try {
            location3 = locationManager.getLastKnownLocation("passive");
        } catch (Exception e3) {
            location3 = null;
        }
        return m5003a(location3, m5003a(location, location2));
    }

    /* renamed from: i */
    private void m4995i() {
        SharedPreferences.Editor edit = this.f32563g.getSharedPreferences(MiPushClient.PREF_EXTRA, 0).edit();
        edit.putLong("last_upload_lbs_data_timestamp", System.currentTimeMillis() / 1000);
        edit.commit();
    }

    @Override // com.xiaomi.channel.commonutils.misc.C10410f.AbstractRunnableC10411a
    /* renamed from: a */
    public int mo4276a() {
        return 14;
    }

    /* renamed from: b */
    protected boolean m5002b() {
        PackageManager packageManager = this.f32563g.getPackageManager();
        String packageName = this.f32563g.getPackageName();
        return (packageManager.checkPermission("android.permission.ACCESS_COARSE_LOCATION", packageName) == 0) || (packageManager.checkPermission("android.permission.ACCESS_FINE_LOCATION", packageName) == 0);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!C10423d.m5212e(this.f32563g)) {
            AbstractC10404b.m5264d("GeoFenceNetInfoUpdateJobNetwork.is not Connected");
        } else if (!m5001c()) {
            AbstractC10404b.m5264d("GeoFenceNetInfoUpdateJobverifyUploadData");
        } else {
            byte[] m3471a = C10799aq.m3471a(m5000d());
            C10775ae c10775ae = new C10775ae("-1", false);
            c10775ae.m3695c(EnumC10821o.GeoUpdateLoc.f34418N);
            c10775ae.m3701a(m3471a);
            C10494u.m4943a(this.f32563g).m4932a(c10775ae, EnumC10766a.Notification, true, null);
            m4995i();
            AbstractC10404b.m5269a("GeoFenceNetInfoUpdateJob: update_loc_data");
        }
    }
}
