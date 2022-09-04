package com.xiaomi.xmpush.thrift;

import com.google.firebase.p251a.C9654a;
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
/* renamed from: com.xiaomi.xmpush.thrift.i */
/* loaded from: classes2.dex */
public class C10810i implements Serializable, Cloneable, AbstractC11361a<C10810i, EnumC10811a> {

    /* renamed from: e */
    public static final Map<EnumC10811a, C11363b> f34273e;

    /* renamed from: f */
    private static final C11381j f34274f = new C11381j("GPS");

    /* renamed from: g */
    private static final C11373b f34275g = new C11373b(C9654a.C9656b.f30231p, (byte) 12, 1);

    /* renamed from: h */
    private static final C11373b f34276h = new C11373b("provider", (byte) 11, 2);

    /* renamed from: i */
    private static final C11373b f34277i = new C11373b("period", (byte) 10, 3);

    /* renamed from: j */
    private static final C11373b f34278j = new C11373b("accuracy", (byte) 4, 4);

    /* renamed from: a */
    public C10815l f34279a;

    /* renamed from: b */
    public String f34280b;

    /* renamed from: c */
    public long f34281c;

    /* renamed from: d */
    public double f34282d;

    /* renamed from: k */
    private BitSet f34283k = new BitSet(2);

    /* renamed from: com.xiaomi.xmpush.thrift.i$a */
    /* loaded from: classes2.dex */
    public enum EnumC10811a {
        LOCATION(1, C9654a.C9656b.f30231p),
        PROVIDER(2, "provider"),
        PERIOD(3, "period"),
        ACCURACY(4, "accuracy");
        

        /* renamed from: e */
        private static final Map<String, EnumC10811a> f34288e = new HashMap();

        /* renamed from: f */
        private final short f34290f;

        /* renamed from: g */
        private final String f34291g;

        static {
            Iterator it2 = EnumSet.allOf(EnumC10811a.class).iterator();
            while (it2.hasNext()) {
                EnumC10811a enumC10811a = (EnumC10811a) it2.next();
                f34288e.put(enumC10811a.m3418a(), enumC10811a);
            }
        }

        EnumC10811a(short s, String str) {
            this.f34290f = s;
            this.f34291g = str;
        }

        /* renamed from: a */
        public String m3418a() {
            return this.f34291g;
        }
    }

    static {
        EnumMap enumMap = new EnumMap(EnumC10811a.class);
        enumMap.put((EnumMap) EnumC10811a.LOCATION, (EnumC10811a) new C11363b(C9654a.C9656b.f30231p, (byte) 1, new C11368g((byte) 12, C10815l.class)));
        enumMap.put((EnumMap) EnumC10811a.PROVIDER, (EnumC10811a) new C11363b("provider", (byte) 2, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10811a.PERIOD, (EnumC10811a) new C11363b("period", (byte) 2, new C11364c((byte) 10)));
        enumMap.put((EnumMap) EnumC10811a.ACCURACY, (EnumC10811a) new C11363b("accuracy", (byte) 2, new C11364c((byte) 4)));
        f34273e = Collections.unmodifiableMap(enumMap);
        C11363b.m1284a(C10810i.class, f34273e);
    }

    /* renamed from: a */
    public C10810i m3430a(double d) {
        this.f34282d = d;
        m3422b(true);
        return this;
    }

    /* renamed from: a */
    public C10810i m3429a(long j) {
        this.f34281c = j;
        m3425a(true);
        return this;
    }

    /* renamed from: a */
    public C10810i m3427a(C10815l c10815l) {
        this.f34279a = c10815l;
        return this;
    }

    /* renamed from: a */
    public C10810i m3426a(String str) {
        this.f34280b = str;
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
                m3419e();
                return;
            }
            switch (mo1240i.f36480c) {
                case 1:
                    if (mo1240i.f36479b != 12) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f34279a = new C10815l();
                        this.f34279a.mo1286a(abstractC11376e);
                        break;
                    }
                case 2:
                    if (mo1240i.f36479b != 11) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f34280b = abstractC11376e.mo1223w();
                        break;
                    }
                case 3:
                    if (mo1240i.f36479b != 10) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f34281c = abstractC11376e.mo1231u();
                        m3425a(true);
                        break;
                    }
                case 4:
                    if (mo1240i.f36479b != 4) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f34282d = abstractC11376e.mo1230v();
                        m3422b(true);
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
    public void m3425a(boolean z) {
        this.f34283k.set(0, z);
    }

    /* renamed from: a */
    public boolean m3431a() {
        return this.f34279a != null;
    }

    /* renamed from: a */
    public boolean m3428a(C10810i c10810i) {
        if (c10810i == null) {
            return false;
        }
        boolean m3431a = m3431a();
        boolean m3431a2 = c10810i.m3431a();
        if ((m3431a || m3431a2) && (!m3431a || !m3431a2 || !this.f34279a.m3376a(c10810i.f34279a))) {
            return false;
        }
        boolean m3424b = m3424b();
        boolean m3424b2 = c10810i.m3424b();
        if ((m3424b || m3424b2) && (!m3424b || !m3424b2 || !this.f34280b.equals(c10810i.f34280b))) {
            return false;
        }
        boolean m3421c = m3421c();
        boolean m3421c2 = c10810i.m3421c();
        if ((m3421c || m3421c2) && (!m3421c || !m3421c2 || this.f34281c != c10810i.f34281c)) {
            return false;
        }
        boolean m3420d = m3420d();
        boolean m3420d2 = c10810i.m3420d();
        return (!m3420d && !m3420d2) || (m3420d && m3420d2 && this.f34282d == c10810i.f34282d);
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(C10810i c10810i) {
        int m1281a;
        int m1279a;
        int m1277a;
        int m1278a;
        if (!getClass().equals(c10810i.getClass())) {
            return getClass().getName().compareTo(c10810i.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m3431a()).compareTo(Boolean.valueOf(c10810i.m3431a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m3431a() && (m1278a = C11369b.m1278a(this.f34279a, c10810i.f34279a)) != 0) {
            return m1278a;
        }
        int compareTo2 = Boolean.valueOf(m3424b()).compareTo(Boolean.valueOf(c10810i.m3424b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m3424b() && (m1277a = C11369b.m1277a(this.f34280b, c10810i.f34280b)) != 0) {
            return m1277a;
        }
        int compareTo3 = Boolean.valueOf(m3421c()).compareTo(Boolean.valueOf(c10810i.m3421c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (m3421c() && (m1279a = C11369b.m1279a(this.f34281c, c10810i.f34281c)) != 0) {
            return m1279a;
        }
        int compareTo4 = Boolean.valueOf(m3420d()).compareTo(Boolean.valueOf(c10810i.m3420d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (m3420d() && (m1281a = C11369b.m1281a(this.f34282d, c10810i.f34282d)) != 0) {
            return m1281a;
        }
        return 0;
    }

    @Override // org.p286a.p321b.AbstractC11361a
    /* renamed from: b */
    public void mo1285b(AbstractC11376e abstractC11376e) {
        m3419e();
        abstractC11376e.mo1250a(f34274f);
        if (this.f34279a != null) {
            abstractC11376e.mo1254a(f34275g);
            this.f34279a.mo1285b(abstractC11376e);
            abstractC11376e.mo1247b();
        }
        if (this.f34280b != null && m3424b()) {
            abstractC11376e.mo1254a(f34276h);
            abstractC11376e.mo1256a(this.f34280b);
            abstractC11376e.mo1247b();
        }
        if (m3421c()) {
            abstractC11376e.mo1254a(f34277i);
            abstractC11376e.mo1257a(this.f34281c);
            abstractC11376e.mo1247b();
        }
        if (m3420d()) {
            abstractC11376e.mo1254a(f34278j);
            abstractC11376e.mo1259a(this.f34282d);
            abstractC11376e.mo1247b();
        }
        abstractC11376e.mo1246c();
        abstractC11376e.mo1261a();
    }

    /* renamed from: b */
    public void m3422b(boolean z) {
        this.f34283k.set(1, z);
    }

    /* renamed from: b */
    public boolean m3424b() {
        return this.f34280b != null;
    }

    /* renamed from: c */
    public boolean m3421c() {
        return this.f34283k.get(0);
    }

    /* renamed from: d */
    public boolean m3420d() {
        return this.f34283k.get(1);
    }

    /* renamed from: e */
    public void m3419e() {
        if (this.f34279a == null) {
            throw new C11377f("Required field 'location' was not present! Struct: " + toString());
        }
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C10810i)) {
            return m3428a((C10810i) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GPS(");
        sb.append("location:");
        if (this.f34279a == null) {
            sb.append("null");
        } else {
            sb.append(this.f34279a);
        }
        if (m3424b()) {
            sb.append(", ");
            sb.append("provider:");
            if (this.f34280b == null) {
                sb.append("null");
            } else {
                sb.append(this.f34280b);
            }
        }
        if (m3421c()) {
            sb.append(", ");
            sb.append("period:");
            sb.append(this.f34281c);
        }
        if (m3420d()) {
            sb.append(", ");
            sb.append("accuracy:");
            sb.append(this.f34282d);
        }
        sb.append(")");
        return sb.toString();
    }
}
