package com.fimi.soul.biz.p183k;

import android.location.Location;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.fimi.kernel.utils.C1681v;
import com.fimi.soul.base.C1756a;
import com.fimi.soul.biz.p180h.C1849a;
import com.fimi.soul.biz.p183k.C1903e;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.p205i.C2296ab;
import com.fimi.soul.drone.p205i.C2311aq;
import com.fimi.soul.drone.p205i.C2360s;
import com.fimi.soul.drone.p205i.C2361t;
import com.fimi.soul.entity.DynamicDYZ_Entity;
import com.fimi.soul.module.p214c.C2523d;
import com.fimi.soul.service.QueryDynamicFlyZoneSetvice;
import com.fimi.soul.utils.C3077ae;
import com.fimi.soul.utils.C3132p;
import com.google.android.gms.maps.model.LatLng;
import com.google.firebase.p253b.C9755a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
/* renamed from: com.fimi.soul.biz.k.i */
/* loaded from: classes.dex */
public class C1909i implements C2104d.AbstractC2106b {

    /* renamed from: a */
    public static final String f5271a = "FCDEVICEID";

    /* renamed from: j */
    private static final int f5272j = 1;

    /* renamed from: k */
    private static final int f5273k = 15000;

    /* renamed from: o */
    private static final int f5274o = 20;

    /* renamed from: p */
    private static final int f5275p = 30;

    /* renamed from: b */
    private int f5276b;

    /* renamed from: c */
    private C2083a f5277c;

    /* renamed from: d */
    private C2523d f5278d;

    /* renamed from: h */
    private double f5282h;

    /* renamed from: l */
    private HandlerC1913b f5284l;

    /* renamed from: e */
    private double f5279e = 1000000.0d;

    /* renamed from: f */
    private int f5280f = 0;

    /* renamed from: i */
    private int f5283i = 20;

    /* renamed from: m */
    private boolean f5285m = true;

    /* renamed from: n */
    private Object f5286n = new Object();

    /* renamed from: q */
    private C1903e f5287q = C1903e.m33631a();

    /* renamed from: r */
    private double f5288r = C9755a.f30449c;

    /* renamed from: g */
    private C1908h f5281g = C1908h.m33616a();

    /* renamed from: com.fimi.soul.biz.k.i$a */
    /* loaded from: classes.dex */
    class C1912a implements Comparator<DynamicDYZ_Entity> {
        C1912a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(DynamicDYZ_Entity dynamicDYZ_Entity, DynamicDYZ_Entity dynamicDYZ_Entity2) {
            return (int) (dynamicDYZ_Entity.getDistance() - dynamicDYZ_Entity2.getDistance());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.fimi.soul.biz.k.i$b */
    /* loaded from: classes.dex */
    public static class HandlerC1913b extends Handler {

        /* renamed from: a */
        private C2083a f5292a;

        /* renamed from: b */
        private C1909i f5293b;

        public HandlerC1913b(C2083a c2083a, C1909i c1909i, Looper looper) {
            this.f5292a = c2083a;
            this.f5293b = c1909i;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (this.f5293b != null) {
                if (message.what != 1) {
                    if (20 == message.what) {
                        this.f5293b.m33600a((String) message.obj);
                        return;
                    } else if (30 != message.what) {
                        return;
                    } else {
                        this.f5293b.m33598b();
                        return;
                    }
                }
                if (!this.f5292a.m33009am() && this.f5292a.mo32905ac() && !this.f5292a.m33007ao().m31786an()) {
                    this.f5293b.m33595b(false);
                }
                if (C1903e.m33631a().m33628b() != C1903e.EnumC1904a.WAIT) {
                    return;
                }
                sendEmptyMessageDelayed(1, 15000L);
            }
        }
    }

    public C1909i(C2083a c2083a) {
        this.f5277c = c2083a;
        this.f5278d = C2523d.m31374a(c2083a);
        c2083a.mo32908a(this);
        if (this.f5284l != null) {
            this.f5284l.getLooper().quit();
        }
        HandlerThread handlerThread = new HandlerThread("Update");
        handlerThread.start();
        this.f5284l = new HandlerC1913b(c2083a, this, handlerThread.getLooper());
        C1681v.m34543a(c2083a.f5919d).m34517g(f5271a);
    }

    /* renamed from: a */
    private static byte m33604a(char c) {
        return (byte) "0123456789ABCDEF".indexOf(c);
    }

    /* renamed from: a */
    private void m33605a() {
        byte m32416f = this.f5277c.m33018aI().m32416f();
        C2523d.m31374a(this.f5277c).m31366d(m32416f);
        if (m32416f == 1) {
            this.f5277c.mo32909a(C2104d.EnumC2105a.DRAWSYNCFLYZONE);
        }
    }

    /* renamed from: a */
    private void m33603a(int i) {
        byte[] m33596b;
        List<DynamicDYZ_Entity> m33608d = this.f5281g.m33608d();
        if (i < m33608d.size() && (m33596b = m33596b(m33608d.get(i).getEncryptValue())) != null) {
            this.f5278d.m31375a(i + 1, m33596b);
            this.f5280f++;
            this.f5287q.m33629a(C1903e.EnumC1904a.SENDPAGE);
        }
        if (i + 1 >= m33608d.size()) {
            this.f5287q.m33629a(C1903e.EnumC1904a.COMPLETE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m33598b() {
        LatLng latLng;
        if (this.f5287q.m33628b() == C1903e.EnumC1904a.SENDDATA) {
            List<DynamicDYZ_Entity> m33610c = this.f5281g.m33610c();
            if (m33610c == null || m33610c.size() <= 0) {
                this.f5277c.mo32909a(C2104d.EnumC2105a.CLEARSYNEFLYZONE);
                return;
            }
            if (m33610c.size() > this.f5283i) {
                if (this.f5276b == 1) {
                    C2311aq mo32891w = this.f5277c.mo32891w();
                    latLng = new LatLng(mo32891w.m32189f(), mo32891w.m32190e());
                } else {
                    Location m32995b = this.f5277c.m32995b();
                    latLng = m32995b != null ? new LatLng(m32995b.getLatitude(), m32995b.getLongitude()) : null;
                }
                if (latLng != null) {
                    for (DynamicDYZ_Entity dynamicDYZ_Entity : m33610c) {
                        double m29318a = C3077ae.m29349c(latLng, new LatLng(dynamicDYZ_Entity.getLatitude(), dynamicDYZ_Entity.getLogitude())).m29318a();
                        dynamicDYZ_Entity.setDistance(m29318a);
                        if (m29318a <= this.f5279e) {
                            this.f5281g.m33609c(dynamicDYZ_Entity);
                        }
                    }
                }
            } else {
                this.f5281g.m33614a(m33610c);
            }
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.fimi.soul.biz.k.i.1
                @Override // java.lang.Runnable
                public void run() {
                    List<DynamicDYZ_Entity> m33608d = C1909i.this.f5281g.m33608d();
                    if (m33608d.size() > 0) {
                        C1909i.this.f5278d.m31376a((int) C1909i.this.f5282h, m33608d.size(), C1909i.m33596b(m33608d.get(0).getEncryptKey()));
                        C1909i.this.f5287q.m33629a(C1903e.EnumC1904a.HANDSHAKE);
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public static byte[] m33596b(String str) {
        if (str == null || str.equals("")) {
            return null;
        }
        String upperCase = str.toUpperCase();
        int length = upperCase.length() / 2;
        char[] charArray = upperCase.toCharArray();
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (m33604a(charArray[i2 + 1]) | (m33604a(charArray[i2]) << 4));
        }
        return bArr;
    }

    /* renamed from: a */
    public void m33602a(int i, int i2, int i3, int i4) {
        this.f5282h = i;
        try {
            this.f5278d.m31377a(i, i2, i3, i4, Long.parseLong(C1756a.m34259c(this.f5277c.f5919d).getUserID()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public void m33600a(String str) {
        synchronized (this.f5286n) {
            List<DynamicDYZ_Entity> m29038a = C3132p.m29037a(this.f5277c.f5919d).m29038a(1, new Date().getTime());
            if (m29038a == null || m29038a.size() == 0) {
                return;
            }
            if (this.f5277c.mo32905ac() && !this.f5277c.m33007ao().m31786an() && (this.f5287q.m33628b() == C1903e.EnumC1904a.ERROR || this.f5287q.m33628b() == C1903e.EnumC1904a.QUERY || this.f5287q.m33628b() == C1903e.EnumC1904a.WAIT || this.f5287q.m33628b() == C1903e.EnumC1904a.IDEL)) {
                this.f5288r = C9755a.f30449c;
                double currentVersion = this.f5287q.m33626c() == C9755a.f30449c ? m29038a.get(0).getCurrentVersion() : this.f5287q.m33626c();
                ArrayList arrayList = new ArrayList();
                Iterator<DynamicDYZ_Entity> it2 = m29038a.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    DynamicDYZ_Entity next = it2.next();
                    String fcIds = next.getFcIds();
                    String whileRange = next.getWhileRange();
                    if (!TextUtils.isEmpty(fcIds)) {
                        String[] split = fcIds.split(";");
                        if (next.getPushType() == 1.0d) {
                            int i = 1;
                            if (!TextUtils.isEmpty(whileRange)) {
                                try {
                                    i = Integer.parseInt(whileRange);
                                } catch (Exception e) {
                                }
                                if (i == 1) {
                                    int length = split.length;
                                    int i2 = 0;
                                    while (true) {
                                        if (i2 >= length) {
                                            break;
                                        } else if (split[i2].equals(str)) {
                                            this.f5288r = 1.0d;
                                            break;
                                        } else {
                                            arrayList.add(next);
                                            i2++;
                                        }
                                    }
                                } else if (i == 0) {
                                    this.f5288r = 1.0d;
                                    break;
                                }
                            } else {
                                int length2 = split.length;
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= length2) {
                                        break;
                                    } else if (split[i3].equals(str)) {
                                        this.f5288r = 1.0d;
                                        break;
                                    } else {
                                        arrayList.add(next);
                                        i3++;
                                    }
                                }
                            }
                        } else {
                            continue;
                        }
                    } else if (next.getPushType() == 1.0d) {
                        int i4 = 1;
                        if (!TextUtils.isEmpty(whileRange)) {
                            try {
                                i4 = Integer.parseInt(whileRange);
                            } catch (Exception e2) {
                            }
                            if (i4 == 0) {
                                this.f5288r = 1.0d;
                            }
                        }
                    }
                }
                if (this.f5288r == C9755a.f30449c) {
                    m29038a.removeAll(arrayList);
                }
                C1908h.m33616a().m33611b(m29038a);
                int size = C1908h.m33616a().m33610c().size();
                if (this.f5277c.mo32891w().m32189f() > 0.5d && this.f5277c.mo32891w().m32190e() > 0.5d) {
                    this.f5287q.m33629a(C1903e.EnumC1904a.SENDDATA);
                    m33602a((int) currentVersion, size, 1, (int) this.f5288r);
                    this.f5276b = 1;
                } else if (this.f5277c.m32995b() != null) {
                    this.f5287q.m33629a(C1903e.EnumC1904a.SENDDATA);
                    m33602a((int) currentVersion, size, 2, (int) this.f5288r);
                    this.f5276b = 2;
                }
            }
        }
    }

    /* renamed from: a */
    public void m33599a(boolean z) {
        this.f5285m = z;
    }

    /* renamed from: b */
    public void m33595b(boolean z) {
        if (!this.f5285m) {
            return;
        }
        List<DynamicDYZ_Entity> m29038a = C3132p.m29037a(this.f5277c.f5919d).m29038a(1, new Date().getTime());
        C1903e m33631a = C1903e.m33631a();
        if (m29038a == null && z) {
            m33631a.m33629a(C1903e.EnumC1904a.IDEL);
            QueryDynamicFlyZoneSetvice.m29455a(this.f5277c.f5919d);
        } else if (m29038a != null) {
            if (!this.f5277c.mo32905ac() || this.f5277c.m33007ao().m31786an()) {
                return;
            }
            String m33910b = C1849a.m33913a().m33910b();
            if (TextUtils.isEmpty(m33910b)) {
                C2523d.m31374a(this.f5277c).m31364e(0);
                return;
            }
            C1681v.m34543a(this.f5277c.f5919d).m34540a(f5271a, m33910b);
            if (this.f5284l.hasMessages(20)) {
                this.f5284l.removeMessages(20);
            }
            Message obtain = Message.obtain();
            obtain.obj = m33910b;
            obtain.what = 20;
            this.f5284l.sendMessage(obtain);
        } else {
            C1908h.m33616a().m33606f();
            if (!this.f5277c.mo32905ac() || this.f5277c.m33007ao().m31786an()) {
                return;
            }
            if (this.f5277c.mo32891w().m32189f() > 0.5d && this.f5277c.mo32891w().m32190e() > 0.5d) {
                m33602a((int) m33631a.m33626c(), 0, 1, 0);
                this.f5276b = 1;
                m33631a.m33629a(C1903e.EnumC1904a.SENDDATA);
                this.f5277c.mo32909a(C2104d.EnumC2105a.CLEARSYNEFLYZONE);
            } else if (this.f5277c.m32995b() == null) {
            } else {
                m33602a((int) m33631a.m33626c(), 0, 2, 0);
                this.f5276b = 2;
                m33631a.m33629a(C1903e.EnumC1904a.SENDDATA);
                this.f5277c.mo32909a(C2104d.EnumC2105a.CLEARSYNEFLYZONE);
            }
        }
    }

    @Override // com.fimi.soul.drone.C2104d.AbstractC2106b
    public void onDroneEvent(C2104d.EnumC2105a enumC2105a, C2083a c2083a) {
        switch (enumC2105a) {
            case FCVERSION2:
                C2296ab mo32902l = c2083a.mo32902l();
                if (mo32902l == null) {
                    return;
                }
                C1849a.m33913a().m33912a(mo32902l);
                m33595b(false);
                return;
            case UPDTECOMPLETECHECK:
                m33605a();
                return;
            case QUERYDYNAMICDATAGPS:
                m33595b(true);
                return;
            case QUERYDYNAMICDATA:
                m33595b(false);
                return;
            case DYNC4KCHECKHANDLE:
                C2361t m33021aF = c2083a.m33021aF();
                if (m33021aF.m31852f() == 1 && m33021aF.m31851g() == 1) {
                    if (this.f5284l.hasMessages(30)) {
                        this.f5284l.removeMessages(30);
                    }
                    this.f5284l.sendEmptyMessage(30);
                    return;
                } else if (m33021aF.m31853e() == this.f5282h) {
                    this.f5287q.m33629a(C1903e.EnumC1904a.SAMEVERSION);
                    c2083a.mo32909a(C2104d.EnumC2105a.DRAWSYNCFLYZONEBYDB);
                    return;
                } else {
                    this.f5287q.m33629a(C1903e.EnumC1904a.ERROR);
                    c2083a.mo32909a(C2104d.EnumC2105a.CLEARSYNEFLYZONE);
                    return;
                }
            case DYNC4KCHECKSENDHANDLE:
                if (this.f5287q.m33628b() != C1903e.EnumC1904a.HANDSHAKE) {
                    return;
                }
                this.f5280f = 0;
                if (c2083a.m33020aG().m31845e() == 0) {
                    m33603a(this.f5280f);
                    return;
                } else {
                    this.f5287q.m33629a(C1903e.EnumC1904a.ERROR);
                    return;
                }
            case DYNC4KBACKDATA:
                C2360s m33019aH = c2083a.m33019aH();
                if (m33019aH.m31859d() != 0) {
                    this.f5287q.m33629a(C1903e.EnumC1904a.ERROR);
                    return;
                } else if (this.f5280f != m33019aH.m31860c()) {
                    return;
                } else {
                    m33603a(this.f5280f);
                    return;
                }
            default:
                return;
        }
    }
}
