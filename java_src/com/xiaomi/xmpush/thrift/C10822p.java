package com.xiaomi.xmpush.thrift;

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
import org.p286a.p321b.p323b.AbstractC11376e;
import org.p286a.p321b.p323b.C11373b;
import org.p286a.p321b.p323b.C11379h;
import org.p286a.p321b.p323b.C11381j;
/* renamed from: com.xiaomi.xmpush.thrift.p */
/* loaded from: classes2.dex */
public class C10822p implements Serializable, Cloneable, AbstractC11361a<C10822p, EnumC10823a> {

    /* renamed from: h */
    public static final Map<EnumC10823a, C11363b> f34419h;

    /* renamed from: i */
    private static final C11381j f34420i = new C11381j("OnlineConfigItem");

    /* renamed from: j */
    private static final C11373b f34421j = new C11373b("key", (byte) 8, 1);

    /* renamed from: k */
    private static final C11373b f34422k = new C11373b("type", (byte) 8, 2);

    /* renamed from: l */
    private static final C11373b f34423l = new C11373b("clear", (byte) 2, 3);

    /* renamed from: m */
    private static final C11373b f34424m = new C11373b("intValue", (byte) 8, 4);

    /* renamed from: n */
    private static final C11373b f34425n = new C11373b("longValue", (byte) 10, 5);

    /* renamed from: o */
    private static final C11373b f34426o = new C11373b("stringValue", (byte) 11, 6);

    /* renamed from: p */
    private static final C11373b f34427p = new C11373b("boolValue", (byte) 2, 7);

    /* renamed from: a */
    public int f34428a;

    /* renamed from: b */
    public int f34429b;

    /* renamed from: c */
    public boolean f34430c;

    /* renamed from: d */
    public int f34431d;

    /* renamed from: e */
    public long f34432e;

    /* renamed from: f */
    public String f34433f;

    /* renamed from: g */
    public boolean f34434g;

    /* renamed from: q */
    private BitSet f34435q = new BitSet(6);

    /* renamed from: com.xiaomi.xmpush.thrift.p$a */
    /* loaded from: classes2.dex */
    public enum EnumC10823a {
        KEY(1, "key"),
        TYPE(2, "type"),
        CLEAR(3, "clear"),
        INT_VALUE(4, "intValue"),
        LONG_VALUE(5, "longValue"),
        STRING_VALUE(6, "stringValue"),
        BOOL_VALUE(7, "boolValue");
        

        /* renamed from: h */
        private static final Map<String, EnumC10823a> f34443h = new HashMap();

        /* renamed from: i */
        private final short f34445i;

        /* renamed from: j */
        private final String f34446j;

        static {
            Iterator it2 = EnumSet.allOf(EnumC10823a.class).iterator();
            while (it2.hasNext()) {
                EnumC10823a enumC10823a = (EnumC10823a) it2.next();
                f34443h.put(enumC10823a.m3324a(), enumC10823a);
            }
        }

        EnumC10823a(short s, String str) {
            this.f34445i = s;
            this.f34446j = str;
        }

        /* renamed from: a */
        public String m3324a() {
            return this.f34446j;
        }
    }

    static {
        EnumMap enumMap = new EnumMap(EnumC10823a.class);
        enumMap.put((EnumMap) EnumC10823a.KEY, (EnumC10823a) new C11363b("key", (byte) 2, new C11364c((byte) 8)));
        enumMap.put((EnumMap) EnumC10823a.TYPE, (EnumC10823a) new C11363b("type", (byte) 2, new C11364c((byte) 8)));
        enumMap.put((EnumMap) EnumC10823a.CLEAR, (EnumC10823a) new C11363b("clear", (byte) 2, new C11364c((byte) 2)));
        enumMap.put((EnumMap) EnumC10823a.INT_VALUE, (EnumC10823a) new C11363b("intValue", (byte) 2, new C11364c((byte) 8)));
        enumMap.put((EnumMap) EnumC10823a.LONG_VALUE, (EnumC10823a) new C11363b("longValue", (byte) 2, new C11364c((byte) 10)));
        enumMap.put((EnumMap) EnumC10823a.STRING_VALUE, (EnumC10823a) new C11363b("stringValue", (byte) 2, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10823a.BOOL_VALUE, (EnumC10823a) new C11363b("boolValue", (byte) 2, new C11364c((byte) 2)));
        f34419h = Collections.unmodifiableMap(enumMap);
        C11363b.m1284a(C10822p.class, f34419h);
    }

    /* renamed from: a */
    public int m3346a() {
        return this.f34428a;
    }

    @Override // org.p286a.p321b.AbstractC11361a
    /* renamed from: a */
    public void mo1286a(AbstractC11376e abstractC11376e) {
        abstractC11376e.mo1242g();
        while (true) {
            C11373b mo1240i = abstractC11376e.mo1240i();
            if (mo1240i.f36479b == 0) {
                abstractC11376e.mo1241h();
                m3325n();
                return;
            }
            switch (mo1240i.f36480c) {
                case 1:
                    if (mo1240i.f36479b != 8) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f34428a = abstractC11376e.mo1232t();
                        m3344a(true);
                        break;
                    }
                case 2:
                    if (mo1240i.f36479b != 8) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f34429b = abstractC11376e.mo1232t();
                        m3341b(true);
                        break;
                    }
                case 3:
                    if (mo1240i.f36479b != 2) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f34430c = abstractC11376e.mo1235q();
                        m3339c(true);
                        break;
                    }
                case 4:
                    if (mo1240i.f36479b != 8) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f34431d = abstractC11376e.mo1232t();
                        m3337d(true);
                        break;
                    }
                case 5:
                    if (mo1240i.f36479b != 10) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f34432e = abstractC11376e.mo1231u();
                        m3335e(true);
                        break;
                    }
                case 6:
                    if (mo1240i.f36479b != 11) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f34433f = abstractC11376e.mo1223w();
                        break;
                    }
                case 7:
                    if (mo1240i.f36479b != 2) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f34434g = abstractC11376e.mo1235q();
                        m3333f(true);
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
    public void m3344a(boolean z) {
        this.f34435q.set(0, z);
    }

    /* renamed from: a */
    public boolean m3345a(C10822p c10822p) {
        if (c10822p == null) {
            return false;
        }
        boolean m3343b = m3343b();
        boolean m3343b2 = c10822p.m3343b();
        if ((m3343b || m3343b2) && (!m3343b || !m3343b2 || this.f34428a != c10822p.f34428a)) {
            return false;
        }
        boolean m3338d = m3338d();
        boolean m3338d2 = c10822p.m3338d();
        if ((m3338d || m3338d2) && (!m3338d || !m3338d2 || this.f34429b != c10822p.f34429b)) {
            return false;
        }
        boolean m3336e = m3336e();
        boolean m3336e2 = c10822p.m3336e();
        if ((m3336e || m3336e2) && (!m3336e || !m3336e2 || this.f34430c != c10822p.f34430c)) {
            return false;
        }
        boolean m3332g = m3332g();
        boolean m3332g2 = c10822p.m3332g();
        if ((m3332g || m3332g2) && (!m3332g || !m3332g2 || this.f34431d != c10822p.f34431d)) {
            return false;
        }
        boolean m3330i = m3330i();
        boolean m3330i2 = c10822p.m3330i();
        if ((m3330i || m3330i2) && (!m3330i || !m3330i2 || this.f34432e != c10822p.f34432e)) {
            return false;
        }
        boolean m3328k = m3328k();
        boolean m3328k2 = c10822p.m3328k();
        if ((m3328k || m3328k2) && (!m3328k || !m3328k2 || !this.f34433f.equals(c10822p.f34433f))) {
            return false;
        }
        boolean m3326m = m3326m();
        boolean m3326m2 = c10822p.m3326m();
        return (!m3326m && !m3326m2) || (m3326m && m3326m2 && this.f34434g == c10822p.f34434g);
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(C10822p c10822p) {
        int m1269a;
        int m1277a;
        int m1279a;
        int m1280a;
        int m1269a2;
        int m1280a2;
        int m1280a3;
        if (!getClass().equals(c10822p.getClass())) {
            return getClass().getName().compareTo(c10822p.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m3343b()).compareTo(Boolean.valueOf(c10822p.m3343b()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m3343b() && (m1280a3 = C11369b.m1280a(this.f34428a, c10822p.f34428a)) != 0) {
            return m1280a3;
        }
        int compareTo2 = Boolean.valueOf(m3338d()).compareTo(Boolean.valueOf(c10822p.m3338d()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m3338d() && (m1280a2 = C11369b.m1280a(this.f34429b, c10822p.f34429b)) != 0) {
            return m1280a2;
        }
        int compareTo3 = Boolean.valueOf(m3336e()).compareTo(Boolean.valueOf(c10822p.m3336e()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (m3336e() && (m1269a2 = C11369b.m1269a(this.f34430c, c10822p.f34430c)) != 0) {
            return m1269a2;
        }
        int compareTo4 = Boolean.valueOf(m3332g()).compareTo(Boolean.valueOf(c10822p.m3332g()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (m3332g() && (m1280a = C11369b.m1280a(this.f34431d, c10822p.f34431d)) != 0) {
            return m1280a;
        }
        int compareTo5 = Boolean.valueOf(m3330i()).compareTo(Boolean.valueOf(c10822p.m3330i()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (m3330i() && (m1279a = C11369b.m1279a(this.f34432e, c10822p.f34432e)) != 0) {
            return m1279a;
        }
        int compareTo6 = Boolean.valueOf(m3328k()).compareTo(Boolean.valueOf(c10822p.m3328k()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (m3328k() && (m1277a = C11369b.m1277a(this.f34433f, c10822p.f34433f)) != 0) {
            return m1277a;
        }
        int compareTo7 = Boolean.valueOf(m3326m()).compareTo(Boolean.valueOf(c10822p.m3326m()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (m3326m() && (m1269a = C11369b.m1269a(this.f34434g, c10822p.f34434g)) != 0) {
            return m1269a;
        }
        return 0;
    }

    @Override // org.p286a.p321b.AbstractC11361a
    /* renamed from: b */
    public void mo1285b(AbstractC11376e abstractC11376e) {
        m3325n();
        abstractC11376e.mo1250a(f34420i);
        if (m3343b()) {
            abstractC11376e.mo1254a(f34421j);
            abstractC11376e.mo1258a(this.f34428a);
            abstractC11376e.mo1247b();
        }
        if (m3338d()) {
            abstractC11376e.mo1254a(f34422k);
            abstractC11376e.mo1258a(this.f34429b);
            abstractC11376e.mo1247b();
        }
        if (m3336e()) {
            abstractC11376e.mo1254a(f34423l);
            abstractC11376e.mo1248a(this.f34430c);
            abstractC11376e.mo1247b();
        }
        if (m3332g()) {
            abstractC11376e.mo1254a(f34424m);
            abstractC11376e.mo1258a(this.f34431d);
            abstractC11376e.mo1247b();
        }
        if (m3330i()) {
            abstractC11376e.mo1254a(f34425n);
            abstractC11376e.mo1257a(this.f34432e);
            abstractC11376e.mo1247b();
        }
        if (this.f34433f != null && m3328k()) {
            abstractC11376e.mo1254a(f34426o);
            abstractC11376e.mo1256a(this.f34433f);
            abstractC11376e.mo1247b();
        }
        if (m3326m()) {
            abstractC11376e.mo1254a(f34427p);
            abstractC11376e.mo1248a(this.f34434g);
            abstractC11376e.mo1247b();
        }
        abstractC11376e.mo1246c();
        abstractC11376e.mo1261a();
    }

    /* renamed from: b */
    public void m3341b(boolean z) {
        this.f34435q.set(1, z);
    }

    /* renamed from: b */
    public boolean m3343b() {
        return this.f34435q.get(0);
    }

    /* renamed from: c */
    public int m3340c() {
        return this.f34429b;
    }

    /* renamed from: c */
    public void m3339c(boolean z) {
        this.f34435q.set(2, z);
    }

    /* renamed from: d */
    public void m3337d(boolean z) {
        this.f34435q.set(3, z);
    }

    /* renamed from: d */
    public boolean m3338d() {
        return this.f34435q.get(1);
    }

    /* renamed from: e */
    public void m3335e(boolean z) {
        this.f34435q.set(4, z);
    }

    /* renamed from: e */
    public boolean m3336e() {
        return this.f34435q.get(2);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C10822p)) {
            return m3345a((C10822p) obj);
        }
        return false;
    }

    /* renamed from: f */
    public int m3334f() {
        return this.f34431d;
    }

    /* renamed from: f */
    public void m3333f(boolean z) {
        this.f34435q.set(5, z);
    }

    /* renamed from: g */
    public boolean m3332g() {
        return this.f34435q.get(3);
    }

    /* renamed from: h */
    public long m3331h() {
        return this.f34432e;
    }

    public int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public boolean m3330i() {
        return this.f34435q.get(4);
    }

    /* renamed from: j */
    public String m3329j() {
        return this.f34433f;
    }

    /* renamed from: k */
    public boolean m3328k() {
        return this.f34433f != null;
    }

    /* renamed from: l */
    public boolean m3327l() {
        return this.f34434g;
    }

    /* renamed from: m */
    public boolean m3326m() {
        return this.f34435q.get(5);
    }

    /* renamed from: n */
    public void m3325n() {
    }

    public String toString() {
        boolean z = false;
        StringBuilder sb = new StringBuilder("OnlineConfigItem(");
        boolean z2 = true;
        if (m3343b()) {
            sb.append("key:");
            sb.append(this.f34428a);
            z2 = false;
        }
        if (m3338d()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("type:");
            sb.append(this.f34429b);
            z2 = false;
        }
        if (m3336e()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("clear:");
            sb.append(this.f34430c);
            z2 = false;
        }
        if (m3332g()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("intValue:");
            sb.append(this.f34431d);
            z2 = false;
        }
        if (m3330i()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("longValue:");
            sb.append(this.f34432e);
            z2 = false;
        }
        if (m3328k()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("stringValue:");
            if (this.f34433f == null) {
                sb.append("null");
            } else {
                sb.append(this.f34433f);
            }
        } else {
            z = z2;
        }
        if (m3326m()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("boolValue:");
            sb.append(this.f34434g);
        }
        sb.append(")");
        return sb.toString();
    }
}
