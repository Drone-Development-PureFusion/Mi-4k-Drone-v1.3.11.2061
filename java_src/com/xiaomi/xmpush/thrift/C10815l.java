package com.xiaomi.xmpush.thrift;

import java.io.Serializable;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.p286a.p287a.C11086e;
import org.p286a.p321b.AbstractC11361a;
import org.p286a.p321b.C11369b;
import org.p286a.p321b.p322a.C11363b;
import org.p286a.p321b.p322a.C11364c;
import org.p286a.p321b.p323b.AbstractC11376e;
import org.p286a.p321b.p323b.C11373b;
import org.p286a.p321b.p323b.C11377f;
import org.p286a.p321b.p323b.C11379h;
import org.p286a.p321b.p323b.C11381j;
/* renamed from: com.xiaomi.xmpush.thrift.l */
/* loaded from: classes2.dex */
public class C10815l implements Serializable, Cloneable, AbstractC11361a<C10815l, EnumC10816a> {

    /* renamed from: c */
    public static final Map<EnumC10816a, C11363b> f34333c;

    /* renamed from: d */
    private static final C11381j f34334d = new C11381j(C11086e.f35686H);

    /* renamed from: e */
    private static final C11373b f34335e = new C11373b("longitude", (byte) 4, 1);

    /* renamed from: f */
    private static final C11373b f34336f = new C11373b("latitude", (byte) 4, 2);

    /* renamed from: a */
    public double f34337a;

    /* renamed from: b */
    public double f34338b;

    /* renamed from: g */
    private BitSet f34339g = new BitSet(2);

    /* renamed from: com.xiaomi.xmpush.thrift.l$a */
    /* loaded from: classes2.dex */
    public enum EnumC10816a {
        LONGITUDE(1, "longitude"),
        LATITUDE(2, "latitude");
        

        /* renamed from: c */
        private static final Map<String, EnumC10816a> f34342c = new HashMap();

        /* renamed from: d */
        private final short f34344d;

        /* renamed from: e */
        private final String f34345e;

        static {
            Iterator it2 = EnumSet.allOf(EnumC10816a.class).iterator();
            while (it2.hasNext()) {
                EnumC10816a enumC10816a = (EnumC10816a) it2.next();
                f34342c.put(enumC10816a.m3367a(), enumC10816a);
            }
        }

        EnumC10816a(short s, String str) {
            this.f34344d = s;
            this.f34345e = str;
        }

        /* renamed from: a */
        public String m3367a() {
            return this.f34345e;
        }
    }

    static {
        EnumMap enumMap = new EnumMap(EnumC10816a.class);
        enumMap.put((EnumMap) EnumC10816a.LONGITUDE, (EnumC10816a) new C11363b("longitude", (byte) 1, new C11364c((byte) 4)));
        enumMap.put((EnumMap) EnumC10816a.LATITUDE, (EnumC10816a) new C11363b("latitude", (byte) 1, new C11364c((byte) 4)));
        f34333c = Collections.unmodifiableMap(enumMap);
        C11363b.m1284a(C10815l.class, f34333c);
    }

    /* renamed from: a */
    public double m3378a() {
        return this.f34337a;
    }

    /* renamed from: a */
    public C10815l m3377a(double d) {
        this.f34337a = d;
        m3375a(true);
        return this;
    }

    @Override // org.p286a.p321b.AbstractC11361a
    /* renamed from: a */
    public void mo1286a(AbstractC11376e abstractC11376e) {
        abstractC11376e.mo1242g();
        while (true) {
            C11373b mo1240i = abstractC11376e.mo1240i();
            if (mo1240i.f36479b == 0) {
                abstractC11376e.mo1241h();
                if (!m3374b()) {
                    throw new C11377f("Required field 'longitude' was not found in serialized data! Struct: " + toString());
                }
                if (!m3369d()) {
                    throw new C11377f("Required field 'latitude' was not found in serialized data! Struct: " + toString());
                }
                m3368e();
                return;
            }
            switch (mo1240i.f36480c) {
                case 1:
                    if (mo1240i.f36479b != 4) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f34337a = abstractC11376e.mo1230v();
                        m3375a(true);
                        break;
                    }
                case 2:
                    if (mo1240i.f36479b != 4) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f34338b = abstractC11376e.mo1230v();
                        m3371b(true);
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
    public void m3375a(boolean z) {
        this.f34339g.set(0, z);
    }

    /* renamed from: a */
    public boolean m3376a(C10815l c10815l) {
        return c10815l != null && this.f34337a == c10815l.f34337a && this.f34338b == c10815l.f34338b;
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(C10815l c10815l) {
        int m1281a;
        int m1281a2;
        if (!getClass().equals(c10815l.getClass())) {
            return getClass().getName().compareTo(c10815l.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m3374b()).compareTo(Boolean.valueOf(c10815l.m3374b()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m3374b() && (m1281a2 = C11369b.m1281a(this.f34337a, c10815l.f34337a)) != 0) {
            return m1281a2;
        }
        int compareTo2 = Boolean.valueOf(m3369d()).compareTo(Boolean.valueOf(c10815l.m3369d()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m3369d() && (m1281a = C11369b.m1281a(this.f34338b, c10815l.f34338b)) != 0) {
            return m1281a;
        }
        return 0;
    }

    /* renamed from: b */
    public C10815l m3373b(double d) {
        this.f34338b = d;
        m3371b(true);
        return this;
    }

    @Override // org.p286a.p321b.AbstractC11361a
    /* renamed from: b */
    public void mo1285b(AbstractC11376e abstractC11376e) {
        m3368e();
        abstractC11376e.mo1250a(f34334d);
        abstractC11376e.mo1254a(f34335e);
        abstractC11376e.mo1259a(this.f34337a);
        abstractC11376e.mo1247b();
        abstractC11376e.mo1254a(f34336f);
        abstractC11376e.mo1259a(this.f34338b);
        abstractC11376e.mo1247b();
        abstractC11376e.mo1246c();
        abstractC11376e.mo1261a();
    }

    /* renamed from: b */
    public void m3371b(boolean z) {
        this.f34339g.set(1, z);
    }

    /* renamed from: b */
    public boolean m3374b() {
        return this.f34339g.get(0);
    }

    /* renamed from: c */
    public double m3370c() {
        return this.f34338b;
    }

    /* renamed from: d */
    public boolean m3369d() {
        return this.f34339g.get(1);
    }

    /* renamed from: e */
    public void m3368e() {
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C10815l)) {
            return m3376a((C10815l) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        return "Location(longitude:" + this.f34337a + ", latitude:" + this.f34338b + ")";
    }
}
