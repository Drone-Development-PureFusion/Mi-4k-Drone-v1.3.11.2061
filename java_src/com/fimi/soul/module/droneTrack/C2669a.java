package com.fimi.soul.module.droneTrack;

import com.fimi.soul.drone.p205i.C2300af;
import com.fimi.soul.drone.p205i.C2301ag;
import com.fimi.soul.drone.p205i.C2302ah;
import com.fimi.soul.drone.p205i.C2311aq;
import com.fimi.soul.drone.p205i.C2319ay;
import com.fimi.soul.drone.p205i.C2325bd;
import com.fimi.soul.drone.p205i.C2334d;
import com.fimi.soul.drone.p205i.p206a.C2289c;
import com.fimi.soul.drone.p205i.p206a.C2292f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
/* renamed from: com.fimi.soul.module.droneTrack.a */
/* loaded from: classes.dex */
public class C2669a {

    /* renamed from: a */
    public static final int f9076a = 2;

    /* renamed from: b */
    public static final int f9077b = 3;

    /* renamed from: c */
    public static final int f9078c = 4;

    /* renamed from: d */
    public static final int f9079d = 5;

    /* renamed from: e */
    public static final int f9080e = 7;

    /* renamed from: f */
    public static final int f9081f = 9;

    /* renamed from: g */
    public static final int f9082g = 10;

    /* renamed from: h */
    public static final int f9083h = 11;

    /* renamed from: i */
    public static final int f9084i = 64;

    /* renamed from: j */
    public static final int f9085j = 63;

    /* renamed from: w */
    private float f9098w;

    /* renamed from: u */
    private List<String> f9096u = new ArrayList();

    /* renamed from: v */
    private long f9097v = 0;

    /* renamed from: x */
    private List<Integer> f9099x = new ArrayList();

    /* renamed from: k */
    public LinkedHashMap<Long, C2334d> f9086k = new LinkedHashMap<>();

    /* renamed from: l */
    public LinkedHashMap<Long, C2289c> f9087l = new LinkedHashMap<>();

    /* renamed from: m */
    public LinkedHashMap<Long, C2300af> f9088m = new LinkedHashMap<>();

    /* renamed from: n */
    public LinkedHashMap<Long, C2301ag> f9089n = new LinkedHashMap<>();

    /* renamed from: o */
    public LinkedHashMap<Long, C2302ah> f9090o = new LinkedHashMap<>();

    /* renamed from: p */
    public LinkedHashMap<Long, C2311aq> f9091p = new LinkedHashMap<>();

    /* renamed from: q */
    public LinkedHashMap<Long, C2319ay> f9092q = new LinkedHashMap<>();

    /* renamed from: s */
    public LinkedHashMap<Long, C2325bd> f9094s = new LinkedHashMap<>();

    /* renamed from: r */
    public LinkedHashMap<Long, C2681b> f9093r = new LinkedHashMap<>();

    /* renamed from: t */
    public LinkedHashMap<Long, C2292f> f9095t = new LinkedHashMap<>();

    /* renamed from: com.fimi.soul.module.droneTrack.a$a */
    /* loaded from: classes.dex */
    static class C2670a {

        /* renamed from: a */
        public static C2669a f9100a = new C2669a();

        C2670a() {
        }
    }

    /* renamed from: a */
    public static C2669a m30740a() {
        return C2670a.f9100a;
    }

    /* renamed from: a */
    public HashMap m30738a(int i) {
        switch (i) {
            case 2:
                return this.f9089n;
            case 3:
                return this.f9091p;
            case 4:
                return this.f9090o;
            case 5:
                return this.f9086k;
            case 7:
                return this.f9087l;
            case 9:
                return this.f9093r;
            case 10:
                return this.f9088m;
            case 11:
                return this.f9095t;
            case 63:
                return this.f9092q;
            case 64:
                return this.f9094s;
            default:
                return null;
        }
    }

    /* renamed from: a */
    public void m30739a(float f) {
        this.f9098w = f;
    }

    /* renamed from: a */
    public void m30737a(long j) {
        this.f9097v = j;
    }

    /* renamed from: b */
    public List<String> m30736b() {
        return this.f9096u;
    }

    /* renamed from: c */
    public List<Integer> m30735c() {
        return this.f9099x;
    }

    /* renamed from: d */
    public long m30734d() {
        return this.f9097v;
    }

    /* renamed from: e */
    public float m30733e() {
        return this.f9098w;
    }

    /* renamed from: f */
    public void m30732f() {
        this.f9086k.clear();
        this.f9087l.clear();
        this.f9088m.clear();
        this.f9089n.clear();
        this.f9090o.clear();
        this.f9091p.clear();
        this.f9092q.clear();
        this.f9094s.clear();
        this.f9093r.clear();
        this.f9095t.clear();
        this.f9096u.clear();
        this.f9099x.clear();
    }
}
