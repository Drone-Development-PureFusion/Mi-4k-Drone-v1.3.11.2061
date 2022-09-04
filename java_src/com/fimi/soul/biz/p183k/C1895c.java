package com.fimi.soul.biz.p183k;

import android.graphics.Color;
import android.location.Location;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.fimi.kernel.utils.C1681v;
import com.fimi.kernel.utils.C1685x;
import com.fimi.soul.biz.p187o.C2022a;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.p205i.C2311aq;
import com.fimi.soul.entity.DynamicDYZ_Entity;
import com.fimi.soul.utils.C3077ae;
import com.fimi.soul.utils.C3078af;
import com.fimi.soul.utils.C3084al;
import com.fimi.soul.utils.C3132p;
import com.google.android.gms.maps.C8500c;
import com.google.android.gms.maps.model.C8611c;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import it.p273a.p274a.AbstractC10866e;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.codehaus.jackson.org.objectweb.asm.Opcodes;
/* renamed from: com.fimi.soul.biz.k.c */
/* loaded from: classes.dex */
public class C1895c implements C2104d.AbstractC2106b {

    /* renamed from: a */
    private static final int f5200a = 4000000;

    /* renamed from: q */
    private static final int f5201q = 1000000;

    /* renamed from: t */
    private static final int f5202t = 10;

    /* renamed from: u */
    private static final int f5203u = 20;

    /* renamed from: v */
    private static final int f5204v = 30;

    /* renamed from: b */
    private LatLng f5205b;

    /* renamed from: c */
    private CircleOptions f5206c;

    /* renamed from: d */
    private CircleOptions f5207d;

    /* renamed from: e */
    private CircleOptions f5208e;

    /* renamed from: f */
    private CircleOptions f5209f;

    /* renamed from: g */
    private C8500c f5210g;

    /* renamed from: h */
    private C2083a f5211h;

    /* renamed from: p */
    private int f5219p;

    /* renamed from: i */
    private final List<LatLng> f5212i = new CopyOnWriteArrayList();

    /* renamed from: j */
    private final List<LatLng> f5213j = new CopyOnWriteArrayList();

    /* renamed from: k */
    private final List<LatLng> f5214k = new CopyOnWriteArrayList();

    /* renamed from: l */
    private final List<C8611c> f5215l = new CopyOnWriteArrayList();

    /* renamed from: m */
    private List<C8611c> f5216m = new CopyOnWriteArrayList();

    /* renamed from: n */
    private List<C8611c> f5217n = new CopyOnWriteArrayList();

    /* renamed from: r */
    private int f5220r = 3;

    /* renamed from: s */
    private List<C8611c> f5221s = C1906g.m33620c().m33619d();

    /* renamed from: w */
    private Handler f5222w = new Handler() { // from class: com.fimi.soul.biz.k.c.2
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 10) {
                DynamicDYZ_Entity dynamicDYZ_Entity = (DynamicDYZ_Entity) message.obj;
                int limitRadius = (int) (dynamicDYZ_Entity.getLimitRadius() * 10.0d);
                int radius = dynamicDYZ_Entity.getRadius() * 10;
                int warinRadius = ((int) (dynamicDYZ_Entity.getWarinRadius() * 10.0d)) + radius;
                LatLng m33696a = C1895c.this.m33696a(dynamicDYZ_Entity.getLatitude(), dynamicDYZ_Entity.getLogitude());
                if (radius < limitRadius) {
                    C1895c.this.m33686a(m33696a, limitRadius, C1895c.this.f5208e);
                }
                C1895c.this.m33679b(m33696a, warinRadius, C1895c.this.f5207d);
                if (dynamicDYZ_Entity.getPushType() == 1.0d && dynamicDYZ_Entity.getNoFlyType() == 1.0d) {
                    C1895c.this.m33685a(m33696a, radius, C1895c.this.f5209f, true);
                } else {
                    C1895c.this.m33685a(m33696a, radius, C1895c.this.f5206c, false);
                }
            } else if (message.what != 20) {
                if (message.what != 30) {
                    return;
                }
                C1895c.this.f5205b = C1895c.this.f5210g.m11613a().f27430a;
            } else {
                C1895c.this.m33675c(C1895c.this.f5217n);
                C1895c.this.m33675c(C1895c.this.f5215l);
                C1895c.this.m33675c(C1895c.this.f5216m);
                C1895c.this.f5217n.clear();
                C1895c.this.f5212i.clear();
                C1895c.this.f5215l.clear();
                C1895c.this.f5213j.clear();
                C1895c.this.f5216m.clear();
                C1895c.this.f5214k.clear();
                C1893a.m33706a().m33703b();
            }
        }
    };

    /* renamed from: o */
    private C1908h f5218o = C1908h.m33616a();

    public C1895c(C8500c c8500c, C2083a c2083a) {
        this.f5210g = c8500c;
        this.f5211h = c2083a;
        c2083a.mo32908a(this);
        m33672e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public LatLng m33696a(double d, double d2) {
        if (!C2022a.m33223a().m33221b()) {
            C3084al m29346a = C3078af.m29346a(d, d2);
            return new LatLng(m29346a.m29322a(), m29346a.m29320b());
        }
        return new LatLng(d, d2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m33687a(DynamicDYZ_Entity dynamicDYZ_Entity) {
        Message obtain = Message.obtain();
        obtain.what = 10;
        obtain.obj = dynamicDYZ_Entity;
        this.f5222w.sendMessage(obtain);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m33686a(LatLng latLng, int i, CircleOptions circleOptions) {
        if (!this.f5214k.contains(latLng)) {
            this.f5214k.add(latLng);
            C8611c m11581a = this.f5210g.m11581a(circleOptions.m11413a(latLng).m11416a(i));
            if (this.f5216m.contains(m11581a)) {
                return;
            }
            this.f5216m.add(m11581a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m33685a(LatLng latLng, int i, CircleOptions circleOptions, boolean z) {
        if (!this.f5212i.contains(latLng)) {
            this.f5212i.add(latLng);
            C8611c m11581a = this.f5210g.m11581a(circleOptions.m11413a(latLng).m11416a(i));
            if (!this.f5217n.contains(m11581a)) {
                this.f5217n.add(m11581a);
            }
            if (!this.f5221s.contains(m11581a)) {
                this.f5221s.add(m11581a);
                C1894b.m33702a().m33701a(m11581a.m11069c());
            }
            if (!z) {
                return;
            }
            C1893a.m33706a().m33704a(m11581a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m33684a(List<DynamicDYZ_Entity> list) {
        if (this.f5205b != null) {
            m33683b();
            for (DynamicDYZ_Entity dynamicDYZ_Entity : list) {
                if (C3077ae.m29349c(this.f5205b, m33696a(dynamicDYZ_Entity.getLatitude(), dynamicDYZ_Entity.getLogitude())).m29318a() <= 4000000.0d) {
                    m33687a(dynamicDYZ_Entity);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m33679b(LatLng latLng, int i, CircleOptions circleOptions) {
        if (!this.f5213j.contains(latLng)) {
            this.f5213j.add(latLng);
            C8611c m11581a = this.f5210g.m11581a(circleOptions.m11413a(latLng).m11416a(i));
            if (!this.f5215l.contains(m11581a)) {
                this.f5215l.add(m11581a);
            }
            if (this.f5221s.contains(m11581a)) {
                return;
            }
            this.f5221s.add(m11581a);
            C1894b.m33702a().m33701a(m11581a.m11069c());
        }
    }

    /* renamed from: b */
    private void m33678b(List<DynamicDYZ_Entity> list) {
        m33683b();
        for (DynamicDYZ_Entity dynamicDYZ_Entity : list) {
            if (((int) dynamicDYZ_Entity.getDistance()) <= f5200a) {
                m33687a(dynamicDYZ_Entity);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m33675c(List<C8611c> list) {
        for (C8611c c8611c : list) {
            if (this.f5221s.contains(c8611c)) {
                this.f5221s.remove(c8611c);
                C1894b.m33702a().m33698c(c8611c.m11069c());
            }
            c8611c.m11079a();
        }
    }

    /* renamed from: e */
    private void m33672e() {
        this.f5206c = C1905f.m33624a(8000, Color.argb(99, 255, 79, 0), Color.argb(26, 255, 36, 0), 0.0f, 100);
        this.f5207d = C1905f.m33624a(8000, Color.argb(99, 255, 79, 0), Color.argb(26, 255, 36, 0), 0.0f, 100);
        this.f5208e = C1905f.m33624a(8000, Color.argb(99, (int) AbstractC10866e.f34825D, (int) Opcodes.FNEG, 0), Color.argb(26, 255, 138, 0), 0.0f, 100);
        this.f5209f = C1905f.m33624a(8000, Color.argb(99, 27, 242, 124), Color.argb(99, 27, 242, 124), 0.0f, 1000);
    }

    /* renamed from: f */
    private void m33670f() {
        C1685x.m34455b(new Runnable() { // from class: com.fimi.soul.biz.k.c.4
            @Override // java.lang.Runnable
            public void run() {
                boolean z;
                LatLng latLng;
                List<DynamicDYZ_Entity> m29038a = C3132p.m29037a(C1895c.this.f5211h.f5919d).m29038a(1, new Date().getTime());
                if (m29038a == null || m29038a.size() <= 0) {
                    return;
                }
                ArrayList<DynamicDYZ_Entity> arrayList = new ArrayList();
                long time = new Date().getTime();
                for (DynamicDYZ_Entity dynamicDYZ_Entity : m29038a) {
                    if (dynamicDYZ_Entity.getStartDate() <= time && time <= dynamicDYZ_Entity.getEndDate()) {
                        arrayList.add(dynamicDYZ_Entity);
                    }
                }
                boolean z2 = false;
                String m34514h = C1681v.m34543a(C1895c.this.f5211h.f5919d).m34514h(C1909i.f5271a);
                ArrayList arrayList2 = new ArrayList();
                if (!TextUtils.isEmpty(m34514h)) {
                    Iterator it2 = arrayList.iterator();
                    while (true) {
                        z = z2;
                        if (!it2.hasNext()) {
                            break;
                        }
                        DynamicDYZ_Entity dynamicDYZ_Entity2 = (DynamicDYZ_Entity) it2.next();
                        String fcIds = dynamicDYZ_Entity2.getFcIds();
                        String whileRange = dynamicDYZ_Entity2.getWhileRange();
                        if (!TextUtils.isEmpty(fcIds)) {
                            String[] split = fcIds.split(";");
                            if (dynamicDYZ_Entity2.getPushType() == 1.0d) {
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
                                            } else if (split[i2].equals(m34514h)) {
                                                z = true;
                                                break;
                                            } else {
                                                arrayList2.add(dynamicDYZ_Entity2);
                                                i2++;
                                            }
                                        }
                                    } else if (i == 0) {
                                        z = true;
                                        break;
                                    }
                                } else {
                                    int length2 = split.length;
                                    int i3 = 0;
                                    while (true) {
                                        if (i3 >= length2) {
                                            break;
                                        } else if (split[i3].equals(m34514h)) {
                                            z = true;
                                            break;
                                        } else {
                                            arrayList2.add(dynamicDYZ_Entity2);
                                            i3++;
                                        }
                                    }
                                }
                            } else {
                                continue;
                            }
                        } else if (dynamicDYZ_Entity2.getPushType() == 1.0d) {
                            int i4 = 1;
                            if (!TextUtils.isEmpty(whileRange)) {
                                try {
                                    i4 = Integer.parseInt(whileRange);
                                } catch (Exception e2) {
                                }
                                if (i4 == 0) {
                                    z = true;
                                }
                            }
                        }
                        z2 = z;
                    }
                } else {
                    z = false;
                }
                if (!z) {
                    arrayList.removeAll(arrayList2);
                }
                if (arrayList.size() <= 0) {
                    C1895c.this.m33683b();
                    return;
                }
                C1895c.this.f5218o.m33607e();
                if (C1895c.this.f5211h.mo32891w().m32190e() <= 0.5d || C1895c.this.f5211h.mo32891w().m32189f() <= 0.5d) {
                    Location m32995b = C1895c.this.f5211h.m32995b();
                    latLng = m32995b != null ? new LatLng(m32995b.getLatitude(), m32995b.getLongitude()) : null;
                } else {
                    C2311aq mo32891w = C1895c.this.f5211h.mo32891w();
                    latLng = new LatLng(mo32891w.m32189f(), mo32891w.m32190e());
                }
                if (latLng == null) {
                    return;
                }
                for (DynamicDYZ_Entity dynamicDYZ_Entity3 : arrayList) {
                    double m29318a = C3077ae.m29349c(latLng, new LatLng(dynamicDYZ_Entity3.getLatitude(), dynamicDYZ_Entity3.getLogitude())).m29318a();
                    dynamicDYZ_Entity3.setDistance(m29318a);
                    if (m29318a <= 1000000.0d) {
                        C1895c.this.f5218o.m33609c(dynamicDYZ_Entity3);
                    }
                }
                C1895c.this.m33697a();
            }
        });
    }

    /* renamed from: a */
    public void m33697a() {
        C1685x.m34455b(new Runnable() { // from class: com.fimi.soul.biz.k.c.1
            @Override // java.lang.Runnable
            public void run() {
                List<DynamicDYZ_Entity> m33608d = C1908h.m33616a().m33608d();
                if (m33608d != null) {
                    C1895c.this.f5219p = m33608d.size();
                    if (C1895c.this.f5219p > C1895c.this.f5220r) {
                        C1895c.this.f5222w.sendEmptyMessage(30);
                        C1895c.this.m33684a(m33608d);
                        return;
                    }
                    C1895c.this.m33683b();
                    for (DynamicDYZ_Entity dynamicDYZ_Entity : m33608d) {
                        C1895c.this.m33687a(dynamicDYZ_Entity);
                    }
                }
            }
        });
    }

    /* renamed from: b */
    public void m33683b() {
        this.f5222w.sendEmptyMessage(20);
    }

    /* renamed from: c */
    public int m33677c() {
        return this.f5219p;
    }

    /* renamed from: d */
    public boolean m33674d() {
        return this.f5217n.size() > 0;
    }

    @Override // com.fimi.soul.drone.C2104d.AbstractC2106b
    public void onDroneEvent(C2104d.EnumC2105a enumC2105a, C2083a c2083a) {
        switch (enumC2105a) {
            case DRAWSYNCFLYZONE:
                C1685x.m34455b(new Runnable() { // from class: com.fimi.soul.biz.k.c.3
                    @Override // java.lang.Runnable
                    public void run() {
                        List<DynamicDYZ_Entity> m33608d = C1895c.this.f5218o.m33608d();
                        if (m33608d == null || m33608d.size() <= 0) {
                            return;
                        }
                        ArrayList arrayList = new ArrayList();
                        long time = new Date().getTime();
                        for (DynamicDYZ_Entity dynamicDYZ_Entity : m33608d) {
                            if (dynamicDYZ_Entity.getStartDate() <= time && time <= dynamicDYZ_Entity.getEndDate()) {
                                arrayList.add(dynamicDYZ_Entity);
                            }
                        }
                        C1895c.this.f5218o.m33614a(arrayList);
                        if (arrayList.size() <= 0) {
                            return;
                        }
                        C1895c.this.m33697a();
                    }
                });
                return;
            case DRAWSYNCFLYZONEBYDB:
                m33670f();
                return;
            case CLEARSYNEFLYZONE:
                m33683b();
                return;
            default:
                return;
        }
    }
}
