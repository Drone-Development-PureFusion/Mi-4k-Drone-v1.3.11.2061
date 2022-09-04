package com.tencent.map.p262b;

import android.content.Context;
import android.telephony.CellLocation;
import android.telephony.NeighboringCellInfo;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.telephony.gsm.GsmCellLocation;
import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.List;
/* renamed from: com.tencent.map.b.d */
/* loaded from: classes2.dex */
public final class C10163d {

    /* renamed from: a */
    private Context f31379a = null;

    /* renamed from: b */
    private TelephonyManager f31380b = null;

    /* renamed from: c */
    private C10165a f31381c = null;

    /* renamed from: d */
    private AbstractC10167c f31382d = null;

    /* renamed from: e */
    private C10166b f31383e = null;

    /* renamed from: f */
    private boolean f31384f = false;

    /* renamed from: g */
    private List<NeighboringCellInfo> f31385g = new LinkedList();

    /* renamed from: h */
    private byte[] f31386h = new byte[0];

    /* renamed from: i */
    private byte[] f31387i = new byte[0];

    /* renamed from: j */
    private boolean f31388j = false;

    /* renamed from: com.tencent.map.b.d$a */
    /* loaded from: classes2.dex */
    public class C10165a extends PhoneStateListener {

        /* renamed from: a */
        private int f31390a;

        /* renamed from: b */
        private int f31391b;

        /* renamed from: c */
        private int f31392c = 0;

        /* renamed from: d */
        private int f31393d = 0;

        /* renamed from: e */
        private int f31394e = 0;

        /* renamed from: f */
        private int f31395f = -1;

        /* renamed from: g */
        private int f31396g = Integer.MAX_VALUE;

        /* renamed from: h */
        private int f31397h = Integer.MAX_VALUE;

        /* renamed from: i */
        private Method f31398i = null;

        /* renamed from: j */
        private Method f31399j = null;

        /* renamed from: k */
        private Method f31400k = null;

        /* renamed from: l */
        private Method f31401l = null;

        /* renamed from: m */
        private Method f31402m = null;

        public C10165a(int i, int i2) {
            this.f31390a = 0;
            this.f31391b = 0;
            this.f31391b = i;
            this.f31390a = i2;
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0076 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0039  */
        /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
        @Override // android.telephony.PhoneStateListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onCellLocationChanged(CellLocation cellLocation) {
            GsmCellLocation gsmCellLocation;
            boolean z;
            String networkOperator;
            this.f31395f = -1;
            this.f31394e = -1;
            this.f31393d = -1;
            this.f31392c = -1;
            if (cellLocation != null) {
                switch (this.f31390a) {
                    case 1:
                        try {
                            gsmCellLocation = (GsmCellLocation) cellLocation;
                        } catch (Exception e) {
                            gsmCellLocation = null;
                        }
                        try {
                            if (gsmCellLocation.getLac() <= 0 && gsmCellLocation.getCid() <= 0) {
                                gsmCellLocation = (GsmCellLocation) C10163d.this.f31380b.getCellLocation();
                            }
                            z = true;
                        } catch (Exception e2) {
                            z = false;
                            if (z) {
                                networkOperator = C10163d.this.f31380b.getNetworkOperator();
                                if (networkOperator != null) {
                                }
                                this.f31393d = gsmCellLocation.getLac();
                                this.f31394e = gsmCellLocation.getCid();
                                C10163d.m6017c(C10163d.this);
                            }
                            C10163d.this.f31383e = new C10166b(C10163d.this, this.f31390a, this.f31391b, this.f31392c, this.f31393d, this.f31394e, this.f31395f, this.f31396g, this.f31397h);
                            if (C10163d.this.f31382d == null) {
                            }
                        }
                        if (z && gsmCellLocation != null) {
                            networkOperator = C10163d.this.f31380b.getNetworkOperator();
                            if (networkOperator != null) {
                                try {
                                    if (networkOperator.length() > 3) {
                                        this.f31392c = Integer.valueOf(networkOperator.substring(3)).intValue();
                                    }
                                } catch (Exception e3) {
                                    this.f31394e = -1;
                                    this.f31393d = -1;
                                    this.f31392c = -1;
                                }
                            }
                            this.f31393d = gsmCellLocation.getLac();
                            this.f31394e = gsmCellLocation.getCid();
                            C10163d.m6017c(C10163d.this);
                        }
                        break;
                    case 2:
                        if (cellLocation != null) {
                            try {
                                if (this.f31398i == null) {
                                    this.f31398i = Class.forName("android.telephony.cdma.CdmaCellLocation").getMethod("getBaseStationId", new Class[0]);
                                    this.f31399j = Class.forName("android.telephony.cdma.CdmaCellLocation").getMethod("getSystemId", new Class[0]);
                                    this.f31400k = Class.forName("android.telephony.cdma.CdmaCellLocation").getMethod("getNetworkId", new Class[0]);
                                    this.f31401l = Class.forName("android.telephony.cdma.CdmaCellLocation").getMethod("getBaseStationLatitude", new Class[0]);
                                    this.f31402m = Class.forName("android.telephony.cdma.CdmaCellLocation").getMethod("getBaseStationLongitude", new Class[0]);
                                }
                                this.f31392c = ((Integer) this.f31399j.invoke(cellLocation, new Object[0])).intValue();
                                this.f31393d = ((Integer) this.f31400k.invoke(cellLocation, new Object[0])).intValue();
                                this.f31394e = ((Integer) this.f31398i.invoke(cellLocation, new Object[0])).intValue();
                                this.f31396g = ((Integer) this.f31401l.invoke(cellLocation, new Object[0])).intValue();
                                this.f31397h = ((Integer) this.f31402m.invoke(cellLocation, new Object[0])).intValue();
                                break;
                            } catch (Exception e4) {
                                this.f31394e = -1;
                                this.f31393d = -1;
                                this.f31392c = -1;
                                this.f31396g = Integer.MAX_VALUE;
                                this.f31397h = Integer.MAX_VALUE;
                                break;
                            }
                        }
                        break;
                }
            }
            C10163d.this.f31383e = new C10166b(C10163d.this, this.f31390a, this.f31391b, this.f31392c, this.f31393d, this.f31394e, this.f31395f, this.f31396g, this.f31397h);
            if (C10163d.this.f31382d == null) {
                C10163d.this.f31382d.mo5991a(C10163d.this.f31383e);
            }
        }

        @Override // android.telephony.PhoneStateListener
        public final void onSignalStrengthChanged(int i) {
            if (this.f31390a == 1) {
                C10163d.m6017c(C10163d.this);
            }
            if (Math.abs(i - ((this.f31395f + 113) / 2)) > 3) {
                if (this.f31395f == -1) {
                    this.f31395f = (i << 1) - 113;
                    return;
                }
                this.f31395f = (i << 1) - 113;
                C10163d.this.f31383e = new C10166b(C10163d.this, this.f31390a, this.f31391b, this.f31392c, this.f31393d, this.f31394e, this.f31395f, this.f31396g, this.f31397h);
                if (C10163d.this.f31382d == null) {
                    return;
                }
                C10163d.this.f31382d.mo5991a(C10163d.this.f31383e);
            }
        }
    }

    /* renamed from: com.tencent.map.b.d$b */
    /* loaded from: classes2.dex */
    public class C10166b implements Cloneable {

        /* renamed from: a */
        public int f31404a;

        /* renamed from: b */
        public int f31405b;

        /* renamed from: c */
        public int f31406c;

        /* renamed from: d */
        public int f31407d;

        /* renamed from: e */
        public int f31408e;

        /* renamed from: f */
        public int f31409f;

        /* renamed from: g */
        public int f31410g;

        /* renamed from: h */
        public int f31411h;

        public C10166b(C10163d c10163d, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.f31404a = 0;
            this.f31405b = 0;
            this.f31406c = 0;
            this.f31407d = 0;
            this.f31408e = 0;
            this.f31409f = 0;
            this.f31410g = Integer.MAX_VALUE;
            this.f31411h = Integer.MAX_VALUE;
            this.f31404a = i;
            this.f31405b = i2;
            this.f31406c = i3;
            this.f31407d = i4;
            this.f31408e = i5;
            this.f31409f = i6;
            this.f31410g = i7;
            this.f31411h = i8;
        }

        public final Object clone() {
            try {
                return (C10166b) super.clone();
            } catch (Exception e) {
                return null;
            }
        }
    }

    /* renamed from: com.tencent.map.b.d$c */
    /* loaded from: classes2.dex */
    public interface AbstractC10167c {
        /* renamed from: a */
        void mo5991a(C10166b c10166b);
    }

    /* renamed from: a */
    private int m6024a(int i) {
        int i2;
        String networkOperator = this.f31380b.getNetworkOperator();
        if (networkOperator != null && networkOperator.length() >= 3) {
            try {
                i2 = Integer.valueOf(networkOperator.substring(0, 3)).intValue();
            } catch (Exception e) {
            }
            if (i != 2 && i2 == -1) {
                return 0;
            }
            return i2;
        }
        i2 = -1;
        if (i != 2) {
        }
        return i2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.tencent.map.b.d$1] */
    /* renamed from: c */
    static /* synthetic */ void m6017c(C10163d c10163d) {
        if (!c10163d.f31388j) {
            c10163d.f31388j = true;
            new Thread() { // from class: com.tencent.map.b.d.1
                @Override // java.lang.Thread, java.lang.Runnable
                public final void run() {
                    if (C10163d.this.f31380b != null) {
                        List neighboringCellInfo = C10163d.this.f31380b.getNeighboringCellInfo();
                        synchronized (C10163d.this.f31387i) {
                            if (neighboringCellInfo != null) {
                                C10163d.this.f31385g.clear();
                                C10163d.this.f31385g.addAll(neighboringCellInfo);
                            }
                        }
                    }
                    C10163d.this.f31388j = false;
                }
            }.start();
        }
    }

    /* renamed from: a */
    public final void m6025a() {
        synchronized (this.f31386h) {
            if (!this.f31384f) {
                return;
            }
            if (this.f31380b != null && this.f31381c != null) {
                try {
                    this.f31380b.listen(this.f31381c, 0);
                } catch (Exception e) {
                    this.f31384f = false;
                }
            }
            this.f31384f = false;
        }
    }

    /* renamed from: a */
    public final boolean m6023a(Context context, AbstractC10167c abstractC10167c) {
        synchronized (this.f31386h) {
            if (this.f31384f) {
                return true;
            }
            if (context == null || abstractC10167c == null) {
                return false;
            }
            this.f31379a = context;
            this.f31382d = abstractC10167c;
            try {
                this.f31380b = (TelephonyManager) this.f31379a.getSystemService("phone");
                if (this.f31380b == null) {
                    return false;
                }
                int phoneType = this.f31380b.getPhoneType();
                this.f31381c = new C10165a(m6024a(phoneType), phoneType);
                if (this.f31381c == null) {
                    return false;
                }
                this.f31380b.listen(this.f31381c, 18);
                this.f31384f = true;
                return this.f31384f;
            } catch (Exception e) {
                return false;
            }
        }
    }

    /* renamed from: b */
    public final List<NeighboringCellInfo> m6019b() {
        LinkedList linkedList = null;
        synchronized (this.f31387i) {
            if (this.f31385g != null) {
                linkedList = new LinkedList();
                linkedList.addAll(this.f31385g);
            }
        }
        return linkedList;
    }
}
