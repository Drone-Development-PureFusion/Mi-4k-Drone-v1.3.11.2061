package com.xiaomi.xmpush.thrift;

import com.fimi.soul.utils.p219a.C3070c;
import com.xiaomi.market.sdk.C10445j;
import java.io.Serializable;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.p286a.p321b.AbstractC11361a;
import org.p286a.p321b.C11369b;
import org.p286a.p321b.p322a.C11363b;
import org.p286a.p321b.p322a.C11364c;
import org.p286a.p321b.p322a.C11368g;
import org.p286a.p321b.p323b.AbstractC11376e;
import org.p286a.p321b.p323b.C11373b;
import org.p286a.p321b.p323b.C11377f;
import org.p286a.p321b.p323b.C11379h;
import org.p286a.p321b.p323b.C11381j;
/* renamed from: com.xiaomi.xmpush.thrift.q */
/* loaded from: classes2.dex */
public class C10824q implements Serializable, Cloneable, AbstractC11361a<C10824q, EnumC10825a> {

    /* renamed from: i */
    public static final Map<EnumC10825a, C11363b> f34447i;

    /* renamed from: j */
    private static final C11381j f34448j = new C11381j("PushMessage");

    /* renamed from: k */
    private static final C11373b f34449k = new C11373b("to", (byte) 12, 1);

    /* renamed from: l */
    private static final C11373b f34450l = new C11373b("id", (byte) 11, 2);

    /* renamed from: m */
    private static final C11373b f34451m = new C11373b("appId", (byte) 11, 3);

    /* renamed from: n */
    private static final C11373b f34452n = new C11373b(C3070c.C3071a.f11500d, (byte) 11, 4);

    /* renamed from: o */
    private static final C11373b f34453o = new C11373b("createAt", (byte) 10, 5);

    /* renamed from: p */
    private static final C11373b f34454p = new C11373b("ttl", (byte) 10, 6);

    /* renamed from: q */
    private static final C11373b f34455q = new C11373b("collapseKey", (byte) 11, 7);

    /* renamed from: r */
    private static final C11373b f34456r = new C11373b(C10445j.f32447W, (byte) 11, 8);

    /* renamed from: a */
    public C10831u f34457a;

    /* renamed from: b */
    public String f34458b;

    /* renamed from: c */
    public String f34459c;

    /* renamed from: d */
    public String f34460d;

    /* renamed from: e */
    public long f34461e;

    /* renamed from: f */
    public long f34462f;

    /* renamed from: g */
    public String f34463g;

    /* renamed from: h */
    public String f34464h;

    /* renamed from: s */
    private BitSet f34465s = new BitSet(2);

    /* renamed from: com.xiaomi.xmpush.thrift.q$a */
    /* loaded from: classes2.dex */
    public enum EnumC10825a {
        TO(1, "to"),
        ID(2, "id"),
        APP_ID(3, "appId"),
        PAYLOAD(4, C3070c.C3071a.f11500d),
        CREATE_AT(5, "createAt"),
        TTL(6, "ttl"),
        COLLAPSE_KEY(7, "collapseKey"),
        PACKAGE_NAME(8, C10445j.f32447W);
        

        /* renamed from: i */
        private static final Map<String, EnumC10825a> f34474i = new HashMap();

        /* renamed from: j */
        private final short f34476j;

        /* renamed from: k */
        private final String f34477k;

        static {
            Iterator it2 = EnumSet.allOf(EnumC10825a.class).iterator();
            while (it2.hasNext()) {
                EnumC10825a enumC10825a = (EnumC10825a) it2.next();
                f34474i.put(enumC10825a.m3306a(), enumC10825a);
            }
        }

        EnumC10825a(short s, String str) {
            this.f34476j = s;
            this.f34477k = str;
        }

        /* renamed from: a */
        public String m3306a() {
            return this.f34477k;
        }
    }

    static {
        EnumMap enumMap = new EnumMap(EnumC10825a.class);
        enumMap.put((EnumMap) EnumC10825a.TO, (EnumC10825a) new C11363b("to", (byte) 2, new C11368g((byte) 12, C10831u.class)));
        enumMap.put((EnumMap) EnumC10825a.ID, (EnumC10825a) new C11363b("id", (byte) 1, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10825a.APP_ID, (EnumC10825a) new C11363b("appId", (byte) 1, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10825a.PAYLOAD, (EnumC10825a) new C11363b(C3070c.C3071a.f11500d, (byte) 1, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10825a.CREATE_AT, (EnumC10825a) new C11363b("createAt", (byte) 2, new C11364c((byte) 10)));
        enumMap.put((EnumMap) EnumC10825a.TTL, (EnumC10825a) new C11363b("ttl", (byte) 2, new C11364c((byte) 10)));
        enumMap.put((EnumMap) EnumC10825a.COLLAPSE_KEY, (EnumC10825a) new C11363b("collapseKey", (byte) 2, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10825a.PACKAGE_NAME, (EnumC10825a) new C11363b(C10445j.f32447W, (byte) 2, new C11364c((byte) 11)));
        f34447i = Collections.unmodifiableMap(enumMap);
        C11363b.m1284a(C10824q.class, f34447i);
    }

    @Override // org.p286a.p321b.AbstractC11361a
    /* renamed from: a */
    public void mo1286a(AbstractC11376e abstractC11376e) {
        abstractC11376e.mo1242g();
        while (true) {
            C11373b mo1240i = abstractC11376e.mo1240i();
            if (mo1240i.f36479b == 0) {
                abstractC11376e.mo1241h();
                m3307m();
                return;
            }
            switch (mo1240i.f36480c) {
                case 1:
                    if (mo1240i.f36479b != 12) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f34457a = new C10831u();
                        this.f34457a.mo1286a(abstractC11376e);
                        break;
                    }
                case 2:
                    if (mo1240i.f36479b != 11) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f34458b = abstractC11376e.mo1223w();
                        break;
                    }
                case 3:
                    if (mo1240i.f36479b != 11) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f34459c = abstractC11376e.mo1223w();
                        break;
                    }
                case 4:
                    if (mo1240i.f36479b != 11) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f34460d = abstractC11376e.mo1223w();
                        break;
                    }
                case 5:
                    if (mo1240i.f36479b != 10) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f34461e = abstractC11376e.mo1231u();
                        m3321a(true);
                        break;
                    }
                case 6:
                    if (mo1240i.f36479b != 10) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f34462f = abstractC11376e.mo1231u();
                        m3318b(true);
                        break;
                    }
                case 7:
                    if (mo1240i.f36479b != 11) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f34463g = abstractC11376e.mo1223w();
                        break;
                    }
                case 8:
                    if (mo1240i.f36479b != 11) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f34464h = abstractC11376e.mo1223w();
                        break;
                    }
                default:
                    C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                    break;
            }
            abstractC11376e.mo1239j();
        }
    }

    /* renamed from: a */
    public void m3321a(boolean z) {
        this.f34465s.set(0, z);
    }

    /* renamed from: a */
    public boolean m3323a() {
        return this.f34457a != null;
    }

    /* renamed from: a */
    public boolean m3322a(C10824q c10824q) {
        if (c10824q == null) {
            return false;
        }
        boolean m3323a = m3323a();
        boolean m3323a2 = c10824q.m3323a();
        if ((m3323a || m3323a2) && (!m3323a || !m3323a2 || !this.f34457a.m3254a(c10824q.f34457a))) {
            return false;
        }
        boolean m3317c = m3317c();
        boolean m3317c2 = c10824q.m3317c();
        if ((m3317c || m3317c2) && (!m3317c || !m3317c2 || !this.f34458b.equals(c10824q.f34458b))) {
            return false;
        }
        boolean m3315e = m3315e();
        boolean m3315e2 = c10824q.m3315e();
        if ((m3315e || m3315e2) && (!m3315e || !m3315e2 || !this.f34459c.equals(c10824q.f34459c))) {
            return false;
        }
        boolean m3313g = m3313g();
        boolean m3313g2 = c10824q.m3313g();
        if ((m3313g || m3313g2) && (!m3313g || !m3313g2 || !this.f34460d.equals(c10824q.f34460d))) {
            return false;
        }
        boolean m3311i = m3311i();
        boolean m3311i2 = c10824q.m3311i();
        if ((m3311i || m3311i2) && (!m3311i || !m3311i2 || this.f34461e != c10824q.f34461e)) {
            return false;
        }
        boolean m3310j = m3310j();
        boolean m3310j2 = c10824q.m3310j();
        if ((m3310j || m3310j2) && (!m3310j || !m3310j2 || this.f34462f != c10824q.f34462f)) {
            return false;
        }
        boolean m3309k = m3309k();
        boolean m3309k2 = c10824q.m3309k();
        if ((m3309k || m3309k2) && (!m3309k || !m3309k2 || !this.f34463g.equals(c10824q.f34463g))) {
            return false;
        }
        boolean m3308l = m3308l();
        boolean m3308l2 = c10824q.m3308l();
        return (!m3308l && !m3308l2) || (m3308l && m3308l2 && this.f34464h.equals(c10824q.f34464h));
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(C10824q c10824q) {
        int m1277a;
        int m1277a2;
        int m1279a;
        int m1279a2;
        int m1277a3;
        int m1277a4;
        int m1277a5;
        int m1278a;
        if (!getClass().equals(c10824q.getClass())) {
            return getClass().getName().compareTo(c10824q.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m3323a()).compareTo(Boolean.valueOf(c10824q.m3323a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m3323a() && (m1278a = C11369b.m1278a(this.f34457a, c10824q.f34457a)) != 0) {
            return m1278a;
        }
        int compareTo2 = Boolean.valueOf(m3317c()).compareTo(Boolean.valueOf(c10824q.m3317c()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m3317c() && (m1277a5 = C11369b.m1277a(this.f34458b, c10824q.f34458b)) != 0) {
            return m1277a5;
        }
        int compareTo3 = Boolean.valueOf(m3315e()).compareTo(Boolean.valueOf(c10824q.m3315e()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (m3315e() && (m1277a4 = C11369b.m1277a(this.f34459c, c10824q.f34459c)) != 0) {
            return m1277a4;
        }
        int compareTo4 = Boolean.valueOf(m3313g()).compareTo(Boolean.valueOf(c10824q.m3313g()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (m3313g() && (m1277a3 = C11369b.m1277a(this.f34460d, c10824q.f34460d)) != 0) {
            return m1277a3;
        }
        int compareTo5 = Boolean.valueOf(m3311i()).compareTo(Boolean.valueOf(c10824q.m3311i()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (m3311i() && (m1279a2 = C11369b.m1279a(this.f34461e, c10824q.f34461e)) != 0) {
            return m1279a2;
        }
        int compareTo6 = Boolean.valueOf(m3310j()).compareTo(Boolean.valueOf(c10824q.m3310j()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (m3310j() && (m1279a = C11369b.m1279a(this.f34462f, c10824q.f34462f)) != 0) {
            return m1279a;
        }
        int compareTo7 = Boolean.valueOf(m3309k()).compareTo(Boolean.valueOf(c10824q.m3309k()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (m3309k() && (m1277a2 = C11369b.m1277a(this.f34463g, c10824q.f34463g)) != 0) {
            return m1277a2;
        }
        int compareTo8 = Boolean.valueOf(m3308l()).compareTo(Boolean.valueOf(c10824q.m3308l()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (m3308l() && (m1277a = C11369b.m1277a(this.f34464h, c10824q.f34464h)) != 0) {
            return m1277a;
        }
        return 0;
    }

    /* renamed from: b */
    public String m3320b() {
        return this.f34458b;
    }

    @Override // org.p286a.p321b.AbstractC11361a
    /* renamed from: b */
    public void mo1285b(AbstractC11376e abstractC11376e) {
        m3307m();
        abstractC11376e.mo1250a(f34448j);
        if (this.f34457a != null && m3323a()) {
            abstractC11376e.mo1254a(f34449k);
            this.f34457a.mo1285b(abstractC11376e);
            abstractC11376e.mo1247b();
        }
        if (this.f34458b != null) {
            abstractC11376e.mo1254a(f34450l);
            abstractC11376e.mo1256a(this.f34458b);
            abstractC11376e.mo1247b();
        }
        if (this.f34459c != null) {
            abstractC11376e.mo1254a(f34451m);
            abstractC11376e.mo1256a(this.f34459c);
            abstractC11376e.mo1247b();
        }
        if (this.f34460d != null) {
            abstractC11376e.mo1254a(f34452n);
            abstractC11376e.mo1256a(this.f34460d);
            abstractC11376e.mo1247b();
        }
        if (m3311i()) {
            abstractC11376e.mo1254a(f34453o);
            abstractC11376e.mo1257a(this.f34461e);
            abstractC11376e.mo1247b();
        }
        if (m3310j()) {
            abstractC11376e.mo1254a(f34454p);
            abstractC11376e.mo1257a(this.f34462f);
            abstractC11376e.mo1247b();
        }
        if (this.f34463g != null && m3309k()) {
            abstractC11376e.mo1254a(f34455q);
            abstractC11376e.mo1256a(this.f34463g);
            abstractC11376e.mo1247b();
        }
        if (this.f34464h != null && m3308l()) {
            abstractC11376e.mo1254a(f34456r);
            abstractC11376e.mo1256a(this.f34464h);
            abstractC11376e.mo1247b();
        }
        abstractC11376e.mo1246c();
        abstractC11376e.mo1261a();
    }

    /* renamed from: b */
    public void m3318b(boolean z) {
        this.f34465s.set(1, z);
    }

    /* renamed from: c */
    public boolean m3317c() {
        return this.f34458b != null;
    }

    /* renamed from: d */
    public String m3316d() {
        return this.f34459c;
    }

    /* renamed from: e */
    public boolean m3315e() {
        return this.f34459c != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C10824q)) {
            return m3322a((C10824q) obj);
        }
        return false;
    }

    /* renamed from: f */
    public String m3314f() {
        return this.f34460d;
    }

    /* renamed from: g */
    public boolean m3313g() {
        return this.f34460d != null;
    }

    /* renamed from: h */
    public long m3312h() {
        return this.f34461e;
    }

    public int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public boolean m3311i() {
        return this.f34465s.get(0);
    }

    /* renamed from: j */
    public boolean m3310j() {
        return this.f34465s.get(1);
    }

    /* renamed from: k */
    public boolean m3309k() {
        return this.f34463g != null;
    }

    /* renamed from: l */
    public boolean m3308l() {
        return this.f34464h != null;
    }

    /* renamed from: m */
    public void m3307m() {
        if (this.f34458b == null) {
            throw new C11377f("Required field 'id' was not present! Struct: " + toString());
        }
        if (this.f34459c == null) {
            throw new C11377f("Required field 'appId' was not present! Struct: " + toString());
        }
        if (this.f34460d != null) {
            return;
        }
        throw new C11377f("Required field 'payload' was not present! Struct: " + toString());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PushMessage(");
        boolean z = true;
        if (m3323a()) {
            sb.append("to:");
            if (this.f34457a == null) {
                sb.append("null");
            } else {
                sb.append(this.f34457a);
            }
            z = false;
        }
        if (!z) {
            sb.append(", ");
        }
        sb.append("id:");
        if (this.f34458b == null) {
            sb.append("null");
        } else {
            sb.append(this.f34458b);
        }
        sb.append(", ");
        sb.append("appId:");
        if (this.f34459c == null) {
            sb.append("null");
        } else {
            sb.append(this.f34459c);
        }
        sb.append(", ");
        sb.append("payload:");
        if (this.f34460d == null) {
            sb.append("null");
        } else {
            sb.append(this.f34460d);
        }
        if (m3311i()) {
            sb.append(", ");
            sb.append("createAt:");
            sb.append(this.f34461e);
        }
        if (m3310j()) {
            sb.append(", ");
            sb.append("ttl:");
            sb.append(this.f34462f);
        }
        if (m3309k()) {
            sb.append(", ");
            sb.append("collapseKey:");
            if (this.f34463g == null) {
                sb.append("null");
            } else {
                sb.append(this.f34463g);
            }
        }
        if (m3308l()) {
            sb.append(", ");
            sb.append("packageName:");
            if (this.f34464h == null) {
                sb.append("null");
            } else {
                sb.append(this.f34464h);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
