package com.xiaomi.xmpush.thrift;

import com.tencent.p263mm.sdk.message.RMsgInfo;
import com.xiaomi.market.sdk.C10445j;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.p286a.p321b.AbstractC11361a;
import org.p286a.p321b.C11369b;
import org.p286a.p321b.p322a.C11362a;
import org.p286a.p321b.p322a.C11363b;
import org.p286a.p321b.p322a.C11364c;
import org.p286a.p321b.p322a.C11365d;
import org.p286a.p321b.p322a.C11368g;
import org.p286a.p321b.p323b.AbstractC11376e;
import org.p286a.p321b.p323b.C11373b;
import org.p286a.p321b.p323b.C11374c;
import org.p286a.p321b.p323b.C11377f;
import org.p286a.p321b.p323b.C11379h;
import org.p286a.p321b.p323b.C11381j;
/* renamed from: com.xiaomi.xmpush.thrift.j */
/* loaded from: classes2.dex */
public class C10812j implements Serializable, Cloneable, AbstractC11361a<C10812j, EnumC10813a> {

    /* renamed from: k */
    public static final Map<EnumC10813a, C11363b> f34292k;

    /* renamed from: l */
    private static final C11381j f34293l = new C11381j("GeoFencing");

    /* renamed from: m */
    private static final C11373b f34294m = new C11373b("id", (byte) 11, 1);

    /* renamed from: n */
    private static final C11373b f34295n = new C11373b("name", (byte) 11, 2);

    /* renamed from: o */
    private static final C11373b f34296o = new C11373b("appId", (byte) 10, 3);

    /* renamed from: p */
    private static final C11373b f34297p = new C11373b(C10445j.f32447W, (byte) 11, 4);

    /* renamed from: q */
    private static final C11373b f34298q = new C11373b(RMsgInfo.COL_CREATE_TIME, (byte) 10, 5);

    /* renamed from: r */
    private static final C11373b f34299r = new C11373b("type", (byte) 8, 6);

    /* renamed from: s */
    private static final C11373b f34300s = new C11373b("circleCenter", (byte) 12, 7);

    /* renamed from: t */
    private static final C11373b f34301t = new C11373b("circleRadius", (byte) 4, 9);

    /* renamed from: u */
    private static final C11373b f34302u = new C11373b("polygonPoints", (byte) 15, 10);

    /* renamed from: v */
    private static final C11373b f34303v = new C11373b("coordinateProvider", (byte) 8, 11);

    /* renamed from: a */
    public String f34304a;

    /* renamed from: b */
    public String f34305b;

    /* renamed from: c */
    public long f34306c;

    /* renamed from: d */
    public String f34307d;

    /* renamed from: e */
    public long f34308e;

    /* renamed from: f */
    public EnumC10814k f34309f;

    /* renamed from: g */
    public C10815l f34310g;

    /* renamed from: h */
    public double f34311h;

    /* renamed from: i */
    public List<C10815l> f34312i;

    /* renamed from: j */
    public EnumC10809h f34313j;

    /* renamed from: w */
    private BitSet f34314w = new BitSet(3);

    /* renamed from: com.xiaomi.xmpush.thrift.j$a */
    /* loaded from: classes2.dex */
    public enum EnumC10813a {
        ID(1, "id"),
        NAME(2, "name"),
        APP_ID(3, "appId"),
        PACKAGE_NAME(4, C10445j.f32447W),
        CREATE_TIME(5, RMsgInfo.COL_CREATE_TIME),
        TYPE(6, "type"),
        CIRCLE_CENTER(7, "circleCenter"),
        CIRCLE_RADIUS(9, "circleRadius"),
        POLYGON_POINTS(10, "polygonPoints"),
        COORDINATE_PROVIDER(11, "coordinateProvider");
        

        /* renamed from: k */
        private static final Map<String, EnumC10813a> f34325k = new HashMap();

        /* renamed from: l */
        private final short f34327l;

        /* renamed from: m */
        private final String f34328m;

        static {
            Iterator it2 = EnumSet.allOf(EnumC10813a.class).iterator();
            while (it2.hasNext()) {
                EnumC10813a enumC10813a = (EnumC10813a) it2.next();
                f34325k.put(enumC10813a.m3381a(), enumC10813a);
            }
        }

        EnumC10813a(short s, String str) {
            this.f34327l = s;
            this.f34328m = str;
        }

        /* renamed from: a */
        public String m3381a() {
            return this.f34328m;
        }
    }

    static {
        EnumMap enumMap = new EnumMap(EnumC10813a.class);
        enumMap.put((EnumMap) EnumC10813a.ID, (EnumC10813a) new C11363b("id", (byte) 1, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10813a.NAME, (EnumC10813a) new C11363b("name", (byte) 1, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10813a.APP_ID, (EnumC10813a) new C11363b("appId", (byte) 1, new C11364c((byte) 10)));
        enumMap.put((EnumMap) EnumC10813a.PACKAGE_NAME, (EnumC10813a) new C11363b(C10445j.f32447W, (byte) 1, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10813a.CREATE_TIME, (EnumC10813a) new C11363b(RMsgInfo.COL_CREATE_TIME, (byte) 1, new C11364c((byte) 10)));
        enumMap.put((EnumMap) EnumC10813a.TYPE, (EnumC10813a) new C11363b("type", (byte) 1, new C11362a((byte) 16, EnumC10814k.class)));
        enumMap.put((EnumMap) EnumC10813a.CIRCLE_CENTER, (EnumC10813a) new C11363b("circleCenter", (byte) 2, new C11368g((byte) 12, C10815l.class)));
        enumMap.put((EnumMap) EnumC10813a.CIRCLE_RADIUS, (EnumC10813a) new C11363b("circleRadius", (byte) 2, new C11364c((byte) 4)));
        enumMap.put((EnumMap) EnumC10813a.POLYGON_POINTS, (EnumC10813a) new C11363b("polygonPoints", (byte) 2, new C11365d((byte) 15, new C11368g((byte) 12, C10815l.class))));
        enumMap.put((EnumMap) EnumC10813a.COORDINATE_PROVIDER, (EnumC10813a) new C11363b("coordinateProvider", (byte) 1, new C11362a((byte) 16, EnumC10809h.class)));
        f34292k = Collections.unmodifiableMap(enumMap);
        C11363b.m1284a(C10812j.class, f34292k);
    }

    /* renamed from: a */
    public C10812j m3416a(double d) {
        this.f34311h = d;
        m3400c(true);
        return this;
    }

    /* renamed from: a */
    public C10812j m3415a(long j) {
        this.f34306c = j;
        m3408a(true);
        return this;
    }

    /* renamed from: a */
    public C10812j m3414a(EnumC10809h enumC10809h) {
        this.f34313j = enumC10809h;
        return this;
    }

    /* renamed from: a */
    public C10812j m3412a(EnumC10814k enumC10814k) {
        this.f34309f = enumC10814k;
        return this;
    }

    /* renamed from: a */
    public C10812j m3411a(C10815l c10815l) {
        this.f34310g = c10815l;
        return this;
    }

    /* renamed from: a */
    public C10812j m3410a(String str) {
        this.f34304a = str;
        return this;
    }

    /* renamed from: a */
    public C10812j m3409a(List<C10815l> list) {
        this.f34312i = list;
        return this;
    }

    /* renamed from: a */
    public String m3417a() {
        return this.f34304a;
    }

    @Override // org.p286a.p321b.AbstractC11361a
    /* renamed from: a */
    public void mo1286a(AbstractC11376e abstractC11376e) {
        abstractC11376e.mo1242g();
        while (true) {
            C11373b mo1240i = abstractC11376e.mo1240i();
            if (mo1240i.f36479b == 0) {
                abstractC11376e.mo1241h();
                if (!m3397f()) {
                    throw new C11377f("Required field 'appId' was not found in serialized data! Struct: " + toString());
                }
                if (!m3393j()) {
                    throw new C11377f("Required field 'createTime' was not found in serialized data! Struct: " + toString());
                }
                m3382u();
                return;
            }
            switch (mo1240i.f36480c) {
                case 1:
                    if (mo1240i.f36479b == 11) {
                        this.f34304a = abstractC11376e.mo1223w();
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 2:
                    if (mo1240i.f36479b == 11) {
                        this.f34305b = abstractC11376e.mo1223w();
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 3:
                    if (mo1240i.f36479b == 10) {
                        this.f34306c = abstractC11376e.mo1231u();
                        m3408a(true);
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 4:
                    if (mo1240i.f36479b == 11) {
                        this.f34307d = abstractC11376e.mo1223w();
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 5:
                    if (mo1240i.f36479b == 10) {
                        this.f34308e = abstractC11376e.mo1231u();
                        m3403b(true);
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 6:
                    if (mo1240i.f36479b == 8) {
                        this.f34309f = EnumC10814k.m3379a(abstractC11376e.mo1232t());
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 7:
                    if (mo1240i.f36479b == 12) {
                        this.f34310g = new C10815l();
                        this.f34310g.mo1286a(abstractC11376e);
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 8:
                default:
                    C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                    break;
                case 9:
                    if (mo1240i.f36479b == 4) {
                        this.f34311h = abstractC11376e.mo1230v();
                        m3400c(true);
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 10:
                    if (mo1240i.f36479b == 15) {
                        C11374c mo1225m = abstractC11376e.mo1225m();
                        this.f34312i = new ArrayList(mo1225m.f36482b);
                        for (int i = 0; i < mo1225m.f36482b; i++) {
                            C10815l c10815l = new C10815l();
                            c10815l.mo1286a(abstractC11376e);
                            this.f34312i.add(c10815l);
                        }
                        abstractC11376e.mo1237n();
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 11:
                    if (mo1240i.f36479b == 8) {
                        this.f34313j = EnumC10809h.m3432a(abstractC11376e.mo1232t());
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
            }
            abstractC11376e.mo1239j();
        }
    }

    /* renamed from: a */
    public void m3408a(boolean z) {
        this.f34314w.set(0, z);
    }

    /* renamed from: a */
    public boolean m3413a(C10812j c10812j) {
        if (c10812j == null) {
            return false;
        }
        boolean m3407b = m3407b();
        boolean m3407b2 = c10812j.m3407b();
        if ((m3407b || m3407b2) && (!m3407b || !m3407b2 || !this.f34304a.equals(c10812j.f34304a))) {
            return false;
        }
        boolean m3399d = m3399d();
        boolean m3399d2 = c10812j.m3399d();
        if (((m3399d || m3399d2) && (!m3399d || !m3399d2 || !this.f34305b.equals(c10812j.f34305b))) || this.f34306c != c10812j.f34306c) {
            return false;
        }
        boolean m3395h = m3395h();
        boolean m3395h2 = c10812j.m3395h();
        if (((m3395h || m3395h2) && (!m3395h || !m3395h2 || !this.f34307d.equals(c10812j.f34307d))) || this.f34308e != c10812j.f34308e) {
            return false;
        }
        boolean m3391l = m3391l();
        boolean m3391l2 = c10812j.m3391l();
        if ((m3391l || m3391l2) && (!m3391l || !m3391l2 || !this.f34309f.equals(c10812j.f34309f))) {
            return false;
        }
        boolean m3389n = m3389n();
        boolean m3389n2 = c10812j.m3389n();
        if ((m3389n || m3389n2) && (!m3389n || !m3389n2 || !this.f34310g.m3376a(c10812j.f34310g))) {
            return false;
        }
        boolean m3387p = m3387p();
        boolean m3387p2 = c10812j.m3387p();
        if ((m3387p || m3387p2) && (!m3387p || !m3387p2 || this.f34311h != c10812j.f34311h)) {
            return false;
        }
        boolean m3385r = m3385r();
        boolean m3385r2 = c10812j.m3385r();
        if ((m3385r || m3385r2) && (!m3385r || !m3385r2 || !this.f34312i.equals(c10812j.f34312i))) {
            return false;
        }
        boolean m3383t = m3383t();
        boolean m3383t2 = c10812j.m3383t();
        return (!m3383t && !m3383t2) || (m3383t && m3383t2 && this.f34313j.equals(c10812j.f34313j));
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(C10812j c10812j) {
        int m1278a;
        int m1273a;
        int m1281a;
        int m1278a2;
        int m1278a3;
        int m1279a;
        int m1277a;
        int m1279a2;
        int m1277a2;
        int m1277a3;
        if (!getClass().equals(c10812j.getClass())) {
            return getClass().getName().compareTo(c10812j.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m3407b()).compareTo(Boolean.valueOf(c10812j.m3407b()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m3407b() && (m1277a3 = C11369b.m1277a(this.f34304a, c10812j.f34304a)) != 0) {
            return m1277a3;
        }
        int compareTo2 = Boolean.valueOf(m3399d()).compareTo(Boolean.valueOf(c10812j.m3399d()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m3399d() && (m1277a2 = C11369b.m1277a(this.f34305b, c10812j.f34305b)) != 0) {
            return m1277a2;
        }
        int compareTo3 = Boolean.valueOf(m3397f()).compareTo(Boolean.valueOf(c10812j.m3397f()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (m3397f() && (m1279a2 = C11369b.m1279a(this.f34306c, c10812j.f34306c)) != 0) {
            return m1279a2;
        }
        int compareTo4 = Boolean.valueOf(m3395h()).compareTo(Boolean.valueOf(c10812j.m3395h()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (m3395h() && (m1277a = C11369b.m1277a(this.f34307d, c10812j.f34307d)) != 0) {
            return m1277a;
        }
        int compareTo5 = Boolean.valueOf(m3393j()).compareTo(Boolean.valueOf(c10812j.m3393j()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (m3393j() && (m1279a = C11369b.m1279a(this.f34308e, c10812j.f34308e)) != 0) {
            return m1279a;
        }
        int compareTo6 = Boolean.valueOf(m3391l()).compareTo(Boolean.valueOf(c10812j.m3391l()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (m3391l() && (m1278a3 = C11369b.m1278a(this.f34309f, c10812j.f34309f)) != 0) {
            return m1278a3;
        }
        int compareTo7 = Boolean.valueOf(m3389n()).compareTo(Boolean.valueOf(c10812j.m3389n()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (m3389n() && (m1278a2 = C11369b.m1278a(this.f34310g, c10812j.f34310g)) != 0) {
            return m1278a2;
        }
        int compareTo8 = Boolean.valueOf(m3387p()).compareTo(Boolean.valueOf(c10812j.m3387p()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (m3387p() && (m1281a = C11369b.m1281a(this.f34311h, c10812j.f34311h)) != 0) {
            return m1281a;
        }
        int compareTo9 = Boolean.valueOf(m3385r()).compareTo(Boolean.valueOf(c10812j.m3385r()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (m3385r() && (m1273a = C11369b.m1273a(this.f34312i, c10812j.f34312i)) != 0) {
            return m1273a;
        }
        int compareTo10 = Boolean.valueOf(m3383t()).compareTo(Boolean.valueOf(c10812j.m3383t()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (m3383t() && (m1278a = C11369b.m1278a(this.f34313j, c10812j.f34313j)) != 0) {
            return m1278a;
        }
        return 0;
    }

    /* renamed from: b */
    public C10812j m3406b(long j) {
        this.f34308e = j;
        m3403b(true);
        return this;
    }

    /* renamed from: b */
    public C10812j m3404b(String str) {
        this.f34305b = str;
        return this;
    }

    @Override // org.p286a.p321b.AbstractC11361a
    /* renamed from: b */
    public void mo1285b(AbstractC11376e abstractC11376e) {
        m3382u();
        abstractC11376e.mo1250a(f34293l);
        if (this.f34304a != null) {
            abstractC11376e.mo1254a(f34294m);
            abstractC11376e.mo1256a(this.f34304a);
            abstractC11376e.mo1247b();
        }
        if (this.f34305b != null) {
            abstractC11376e.mo1254a(f34295n);
            abstractC11376e.mo1256a(this.f34305b);
            abstractC11376e.mo1247b();
        }
        abstractC11376e.mo1254a(f34296o);
        abstractC11376e.mo1257a(this.f34306c);
        abstractC11376e.mo1247b();
        if (this.f34307d != null) {
            abstractC11376e.mo1254a(f34297p);
            abstractC11376e.mo1256a(this.f34307d);
            abstractC11376e.mo1247b();
        }
        abstractC11376e.mo1254a(f34298q);
        abstractC11376e.mo1257a(this.f34308e);
        abstractC11376e.mo1247b();
        if (this.f34309f != null) {
            abstractC11376e.mo1254a(f34299r);
            abstractC11376e.mo1258a(this.f34309f.m3380a());
            abstractC11376e.mo1247b();
        }
        if (this.f34310g != null && m3389n()) {
            abstractC11376e.mo1254a(f34300s);
            this.f34310g.mo1285b(abstractC11376e);
            abstractC11376e.mo1247b();
        }
        if (m3387p()) {
            abstractC11376e.mo1254a(f34301t);
            abstractC11376e.mo1259a(this.f34311h);
            abstractC11376e.mo1247b();
        }
        if (this.f34312i != null && m3385r()) {
            abstractC11376e.mo1254a(f34302u);
            abstractC11376e.mo1253a(new C11374c((byte) 12, this.f34312i.size()));
            for (C10815l c10815l : this.f34312i) {
                c10815l.mo1285b(abstractC11376e);
            }
            abstractC11376e.mo1244e();
            abstractC11376e.mo1247b();
        }
        if (this.f34313j != null) {
            abstractC11376e.mo1254a(f34303v);
            abstractC11376e.mo1258a(this.f34313j.m3433a());
            abstractC11376e.mo1247b();
        }
        abstractC11376e.mo1246c();
        abstractC11376e.mo1261a();
    }

    /* renamed from: b */
    public void m3403b(boolean z) {
        this.f34314w.set(1, z);
    }

    /* renamed from: b */
    public boolean m3407b() {
        return this.f34304a != null;
    }

    /* renamed from: c */
    public C10812j m3401c(String str) {
        this.f34307d = str;
        return this;
    }

    /* renamed from: c */
    public String m3402c() {
        return this.f34305b;
    }

    /* renamed from: c */
    public void m3400c(boolean z) {
        this.f34314w.set(2, z);
    }

    /* renamed from: d */
    public boolean m3399d() {
        return this.f34305b != null;
    }

    /* renamed from: e */
    public long m3398e() {
        return this.f34306c;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C10812j)) {
            return m3413a((C10812j) obj);
        }
        return false;
    }

    /* renamed from: f */
    public boolean m3397f() {
        return this.f34314w.get(0);
    }

    /* renamed from: g */
    public String m3396g() {
        return this.f34307d;
    }

    /* renamed from: h */
    public boolean m3395h() {
        return this.f34307d != null;
    }

    public int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public long m3394i() {
        return this.f34308e;
    }

    /* renamed from: j */
    public boolean m3393j() {
        return this.f34314w.get(1);
    }

    /* renamed from: k */
    public EnumC10814k m3392k() {
        return this.f34309f;
    }

    /* renamed from: l */
    public boolean m3391l() {
        return this.f34309f != null;
    }

    /* renamed from: m */
    public C10815l m3390m() {
        return this.f34310g;
    }

    /* renamed from: n */
    public boolean m3389n() {
        return this.f34310g != null;
    }

    /* renamed from: o */
    public double m3388o() {
        return this.f34311h;
    }

    /* renamed from: p */
    public boolean m3387p() {
        return this.f34314w.get(2);
    }

    /* renamed from: q */
    public List<C10815l> m3386q() {
        return this.f34312i;
    }

    /* renamed from: r */
    public boolean m3385r() {
        return this.f34312i != null;
    }

    /* renamed from: s */
    public EnumC10809h m3384s() {
        return this.f34313j;
    }

    /* renamed from: t */
    public boolean m3383t() {
        return this.f34313j != null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GeoFencing(");
        sb.append("id:");
        if (this.f34304a == null) {
            sb.append("null");
        } else {
            sb.append(this.f34304a);
        }
        sb.append(", ");
        sb.append("name:");
        if (this.f34305b == null) {
            sb.append("null");
        } else {
            sb.append(this.f34305b);
        }
        sb.append(", ");
        sb.append("appId:");
        sb.append(this.f34306c);
        sb.append(", ");
        sb.append("packageName:");
        if (this.f34307d == null) {
            sb.append("null");
        } else {
            sb.append(this.f34307d);
        }
        sb.append(", ");
        sb.append("createTime:");
        sb.append(this.f34308e);
        sb.append(", ");
        sb.append("type:");
        if (this.f34309f == null) {
            sb.append("null");
        } else {
            sb.append(this.f34309f);
        }
        if (m3389n()) {
            sb.append(", ");
            sb.append("circleCenter:");
            if (this.f34310g == null) {
                sb.append("null");
            } else {
                sb.append(this.f34310g);
            }
        }
        if (m3387p()) {
            sb.append(", ");
            sb.append("circleRadius:");
            sb.append(this.f34311h);
        }
        if (m3385r()) {
            sb.append(", ");
            sb.append("polygonPoints:");
            if (this.f34312i == null) {
                sb.append("null");
            } else {
                sb.append(this.f34312i);
            }
        }
        sb.append(", ");
        sb.append("coordinateProvider:");
        if (this.f34313j == null) {
            sb.append("null");
        } else {
            sb.append(this.f34313j);
        }
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: u */
    public void m3382u() {
        if (this.f34304a == null) {
            throw new C11377f("Required field 'id' was not present! Struct: " + toString());
        }
        if (this.f34305b == null) {
            throw new C11377f("Required field 'name' was not present! Struct: " + toString());
        }
        if (this.f34307d == null) {
            throw new C11377f("Required field 'packageName' was not present! Struct: " + toString());
        }
        if (this.f34309f == null) {
            throw new C11377f("Required field 'type' was not present! Struct: " + toString());
        }
        if (this.f34313j != null) {
            return;
        }
        throw new C11377f("Required field 'coordinateProvider' was not present! Struct: " + toString());
    }
}
