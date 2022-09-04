package com.fimi.soul.module.droneTrack.p216a;

import com.fimi.soul.drone.p205i.C2333c;
import com.fimi.soul.drone.p205i.C2335e;
import com.google.android.gms.maps.model.LatLng;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
/* renamed from: com.fimi.soul.module.droneTrack.a.b */
/* loaded from: classes.dex */
public class C2672b {

    /* renamed from: a */
    public static C2672b f9114a;

    /* renamed from: d */
    private volatile LinkedHashMap<Integer, List<Object>> f9117d;

    /* renamed from: e */
    private volatile List<LatLng> f9118e;

    /* renamed from: f */
    private boolean f9119f;

    /* renamed from: g */
    private boolean f9120g;

    /* renamed from: h */
    private boolean f9121h;

    /* renamed from: i */
    private boolean f9122i;

    /* renamed from: j */
    private double[] f9123j = {3.15d, 3.47d, 3.64d, 3.79d, 4.1d};

    /* renamed from: k */
    private double[] f9124k = {3.43d, 3.73d, 3.88d, 4.02d, 4.16d};

    /* renamed from: b */
    C2335e f9115b = new C2335e();

    /* renamed from: c */
    C2333c f9116c = new C2333c();

    /* renamed from: a */
    public static C2672b m30703a() {
        if (f9114a == null) {
            synchronized (C2672b.class) {
                if (f9114a == null) {
                    f9114a = new C2672b();
                }
            }
        }
        return f9114a;
    }

    /* renamed from: a */
    private void m30697a(boolean... zArr) {
        for (boolean z : zArr) {
        }
    }

    /* renamed from: a */
    public void m30702a(C2333c c2333c) {
        this.f9116c = c2333c;
    }

    /* renamed from: a */
    public void m30701a(C2335e c2335e) {
        this.f9115b = c2335e;
    }

    /* renamed from: a */
    public void m30700a(List<LatLng> list) {
        this.f9118e = list;
    }

    /* renamed from: a */
    public void m30699a(boolean z) {
        this.f9122i = z;
    }

    /* renamed from: a */
    public void m30698a(double[] dArr) {
        this.f9124k = dArr;
    }

    /* renamed from: b */
    public LinkedHashMap<Integer, List<Object>> m30696b() {
        if (this.f9117d == null) {
            this.f9117d = new LinkedHashMap<>();
        }
        return this.f9117d;
    }

    /* renamed from: b */
    public void m30695b(boolean z) {
        this.f9121h = z;
    }

    /* renamed from: b */
    public void m30694b(double[] dArr) {
        this.f9123j = dArr;
    }

    /* renamed from: c */
    public List<LatLng> m30693c() {
        if (this.f9118e == null) {
            this.f9118e = new LinkedList();
        }
        return this.f9118e;
    }

    /* renamed from: c */
    public void m30692c(boolean z) {
        this.f9120g = z;
    }

    /* renamed from: d */
    public void m30691d() {
        if (this.f9117d != null) {
            this.f9117d.clear();
        }
        if (this.f9118e != null) {
            this.f9118e.clear();
        }
        m30697a(this.f9119f, this.f9120g, this.f9121h, this.f9122i);
    }

    /* renamed from: d */
    public void m30690d(boolean z) {
        this.f9119f = z;
    }

    /* renamed from: e */
    public boolean m30689e() {
        return this.f9122i;
    }

    /* renamed from: f */
    public boolean m30688f() {
        return this.f9121h;
    }

    /* renamed from: g */
    public boolean m30687g() {
        return this.f9120g;
    }

    /* renamed from: h */
    public boolean m30686h() {
        return this.f9119f;
    }

    /* renamed from: i */
    public double[] m30685i() {
        return this.f9124k;
    }

    /* renamed from: j */
    public double[] m30684j() {
        return this.f9123j;
    }

    /* renamed from: k */
    public C2333c m30683k() {
        return this.f9116c;
    }

    /* renamed from: l */
    public C2335e m30682l() {
        return this.f9115b;
    }
}
