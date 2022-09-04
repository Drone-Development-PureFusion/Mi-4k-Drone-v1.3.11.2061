package com.tencent.map.p262b;

import android.content.Context;
import android.location.GpsSatellite;
import android.location.GpsStatus;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.firebase.p251a.C9654a;
import java.util.Iterator;
/* renamed from: com.tencent.map.b.e */
/* loaded from: classes2.dex */
public final class C10168e {

    /* renamed from: b */
    private static LocationManager f31412b = null;

    /* renamed from: d */
    private static float f31413d = 0.0f;

    /* renamed from: a */
    private Context f31414a = null;

    /* renamed from: c */
    private C10169a f31415c = null;

    /* renamed from: e */
    private AbstractC10171c f31416e = null;

    /* renamed from: f */
    private C10170b f31417f = null;

    /* renamed from: g */
    private boolean f31418g = false;

    /* renamed from: h */
    private byte[] f31419h = new byte[0];

    /* renamed from: i */
    private int f31420i = 1024;

    /* renamed from: j */
    private long f31421j = 0;

    /* renamed from: k */
    private boolean f31422k = false;

    /* renamed from: l */
    private int f31423l = 0;

    /* renamed from: m */
    private int f31424m = 0;

    /* renamed from: com.tencent.map.b.e$a */
    /* loaded from: classes2.dex */
    class C10169a implements GpsStatus.Listener, LocationListener {
        private C10169a() {
        }

        /* synthetic */ C10169a(C10168e c10168e, byte b) {
            this();
        }

        @Override // android.location.GpsStatus.Listener
        public final void onGpsStatusChanged(int i) {
            switch (i) {
                case 1:
                    C10168e.m6010a(C10168e.this, 1);
                    break;
                case 2:
                    C10168e.m6010a(C10168e.this, 0);
                    break;
                case 3:
                    C10168e.m6010a(C10168e.this, 2);
                    break;
            }
            C10168e.this.m6007b();
        }

        @Override // android.location.LocationListener
        public final void onLocationChanged(Location location) {
            boolean z = false;
            if (location != null) {
                double latitude = location.getLatitude();
                double longitude = location.getLongitude();
                if (latitude != 29.999998211860657d && longitude != 103.99999916553497d && Math.abs(latitude) >= 1.0E-8d && Math.abs(longitude) >= 1.0E-8d && latitude >= -90.0d && latitude <= 90.0d && longitude >= -180.0d && longitude <= 180.0d) {
                    z = true;
                }
                if (!z) {
                    return;
                }
                C10168e.this.f31421j = System.currentTimeMillis();
                C10168e.this.m6007b();
                C10168e.m6010a(C10168e.this, 2);
                C10168e.this.f31417f = new C10170b(C10168e.this, location, C10168e.this.f31423l, C10168e.this.f31424m, C10168e.this.f31420i, C10168e.this.f31421j);
                if (C10168e.this.f31416e == null) {
                    return;
                }
                C10168e.this.f31416e.mo5990a(C10168e.this.f31417f);
            }
        }

        @Override // android.location.LocationListener
        public final void onProviderDisabled(String str) {
            if (str != null) {
                try {
                    if (!str.equals("gps")) {
                        return;
                    }
                    C10168e.this.f31423l = C10168e.this.f31424m = 0;
                    C10168e.this.f31420i = 0;
                    if (C10168e.this.f31416e == null) {
                        return;
                    }
                    C10168e.this.f31416e.mo5993a(C10168e.this.f31420i);
                } catch (Exception e) {
                }
            }
        }

        @Override // android.location.LocationListener
        public final void onProviderEnabled(String str) {
            if (str != null) {
                try {
                    if (!str.equals("gps")) {
                        return;
                    }
                    C10168e.this.f31420i = 4;
                    if (C10168e.this.f31416e == null) {
                        return;
                    }
                    C10168e.this.f31416e.mo5993a(C10168e.this.f31420i);
                } catch (Exception e) {
                }
            }
        }

        @Override // android.location.LocationListener
        public final void onStatusChanged(String str, int i, Bundle bundle) {
        }
    }

    /* renamed from: com.tencent.map.b.e$b */
    /* loaded from: classes2.dex */
    public class C10170b implements Cloneable {

        /* renamed from: a */
        private Location f31426a;

        /* renamed from: b */
        private long f31427b;

        /* renamed from: c */
        private int f31428c;

        public C10170b(C10168e c10168e, Location location, int i, int i2, int i3, long j) {
            this.f31426a = null;
            this.f31427b = 0L;
            this.f31428c = 0;
            if (location != null) {
                this.f31426a = new Location(location);
                this.f31428c = i2;
                this.f31427b = j;
            }
        }

        /* renamed from: a */
        public final boolean m5997a() {
            if (this.f31426a == null) {
                return false;
            }
            return (this.f31428c <= 0 || this.f31428c >= 3) && System.currentTimeMillis() - this.f31427b <= NotificationOptions.f16268b;
        }

        /* renamed from: b */
        public final Location m5996b() {
            return this.f31426a;
        }

        public final Object clone() {
            C10170b c10170b;
            try {
                c10170b = (C10170b) super.clone();
            } catch (Exception e) {
                c10170b = null;
            }
            if (this.f31426a != null) {
                c10170b.f31426a = new Location(this.f31426a);
            }
            return c10170b;
        }
    }

    /* renamed from: com.tencent.map.b.e$c */
    /* loaded from: classes2.dex */
    public interface AbstractC10171c {
        /* renamed from: a */
        void mo5993a(int i);

        /* renamed from: a */
        void mo5990a(C10170b c10170b);
    }

    /* renamed from: a */
    static /* synthetic */ int m6010a(C10168e c10168e, int i) {
        int i2 = c10168e.f31420i | i;
        c10168e.f31420i = i2;
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m6007b() {
        this.f31424m = 0;
        this.f31423l = 0;
        GpsStatus gpsStatus = f31412b.getGpsStatus(null);
        if (gpsStatus == null) {
            return;
        }
        int maxSatellites = gpsStatus.getMaxSatellites();
        Iterator<GpsSatellite> it2 = gpsStatus.getSatellites().iterator();
        if (it2 == null) {
            return;
        }
        while (it2.hasNext() && this.f31423l <= maxSatellites) {
            this.f31423l++;
            if (it2.next().usedInFix()) {
                this.f31424m++;
            }
        }
    }

    /* renamed from: a */
    public final void m6013a() {
        synchronized (this.f31419h) {
            if (!this.f31418g) {
                return;
            }
            if (f31412b != null && this.f31415c != null) {
                f31412b.removeGpsStatusListener(this.f31415c);
                f31412b.removeUpdates(this.f31415c);
            }
            this.f31418g = false;
        }
    }

    /* renamed from: a */
    public final boolean m6012a(AbstractC10171c abstractC10171c, Context context) {
        synchronized (this.f31419h) {
            if (this.f31418g) {
                return true;
            }
            if (context == null || abstractC10171c == null) {
                return false;
            }
            this.f31414a = context;
            this.f31416e = abstractC10171c;
            try {
                f31412b = (LocationManager) this.f31414a.getSystemService(C9654a.C9656b.f30231p);
                this.f31415c = new C10169a(this, (byte) 0);
                if (f31412b != null) {
                    if (this.f31415c != null) {
                        try {
                            f31412b.requestLocationUpdates("gps", 1000L, 0.0f, this.f31415c);
                            f31412b.addGpsStatusListener(this.f31415c);
                            if (f31412b.isProviderEnabled("gps")) {
                                this.f31420i = 4;
                            } else {
                                this.f31420i = 0;
                            }
                            this.f31418g = true;
                            return this.f31418g;
                        } catch (Exception e) {
                            return false;
                        }
                    }
                }
                return false;
            } catch (Exception e2) {
                return false;
            }
        }
    }
}
