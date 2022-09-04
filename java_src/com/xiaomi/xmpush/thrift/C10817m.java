package com.xiaomi.xmpush.thrift;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.p286a.p321b.AbstractC11361a;
import org.p286a.p321b.C11369b;
import org.p286a.p321b.p322a.C11363b;
import org.p286a.p321b.p322a.C11365d;
import org.p286a.p321b.p322a.C11368g;
import org.p286a.p321b.p323b.AbstractC11376e;
import org.p286a.p321b.p323b.C11373b;
import org.p286a.p321b.p323b.C11374c;
import org.p286a.p321b.p323b.C11379h;
import org.p286a.p321b.p323b.C11381j;
/* renamed from: com.xiaomi.xmpush.thrift.m */
/* loaded from: classes2.dex */
public class C10817m implements Serializable, Cloneable, AbstractC11361a<C10817m, EnumC10818a> {

    /* renamed from: d */
    public static final Map<EnumC10818a, C11363b> f34346d;

    /* renamed from: e */
    private static final C11381j f34347e = new C11381j("LocationInfo");

    /* renamed from: f */
    private static final C11373b f34348f = new C11373b("wifiList", (byte) 15, 1);

    /* renamed from: g */
    private static final C11373b f34349g = new C11373b("cellList", (byte) 15, 2);

    /* renamed from: h */
    private static final C11373b f34350h = new C11373b("gps", (byte) 12, 3);

    /* renamed from: a */
    public List<C10833v> f34351a;

    /* renamed from: b */
    public List<C10800b> f34352b;

    /* renamed from: c */
    public C10810i f34353c;

    /* renamed from: com.xiaomi.xmpush.thrift.m$a */
    /* loaded from: classes2.dex */
    public enum EnumC10818a {
        WIFI_LIST(1, "wifiList"),
        CELL_LIST(2, "cellList"),
        GPS(3, "gps");
        

        /* renamed from: d */
        private static final Map<String, EnumC10818a> f34357d = new HashMap();

        /* renamed from: e */
        private final short f34359e;

        /* renamed from: f */
        private final String f34360f;

        static {
            Iterator it2 = EnumSet.allOf(EnumC10818a.class).iterator();
            while (it2.hasNext()) {
                EnumC10818a enumC10818a = (EnumC10818a) it2.next();
                f34357d.put(enumC10818a.m3357a(), enumC10818a);
            }
        }

        EnumC10818a(short s, String str) {
            this.f34359e = s;
            this.f34360f = str;
        }

        /* renamed from: a */
        public String m3357a() {
            return this.f34360f;
        }
    }

    static {
        EnumMap enumMap = new EnumMap(EnumC10818a.class);
        enumMap.put((EnumMap) EnumC10818a.WIFI_LIST, (EnumC10818a) new C11363b("wifiList", (byte) 2, new C11365d((byte) 15, new C11368g((byte) 12, C10833v.class))));
        enumMap.put((EnumMap) EnumC10818a.CELL_LIST, (EnumC10818a) new C11363b("cellList", (byte) 2, new C11365d((byte) 15, new C11368g((byte) 12, C10800b.class))));
        enumMap.put((EnumMap) EnumC10818a.GPS, (EnumC10818a) new C11363b("gps", (byte) 2, new C11368g((byte) 12, C10810i.class)));
        f34346d = Collections.unmodifiableMap(enumMap);
        C11363b.m1284a(C10817m.class, f34346d);
    }

    /* renamed from: a */
    public C10817m m3365a(C10810i c10810i) {
        this.f34353c = c10810i;
        return this;
    }

    /* renamed from: a */
    public C10817m m3363a(List<C10833v> list) {
        this.f34351a = list;
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
                m3358d();
                return;
            }
            switch (mo1240i.f36480c) {
                case 1:
                    if (mo1240i.f36479b == 15) {
                        C11374c mo1225m = abstractC11376e.mo1225m();
                        this.f34351a = new ArrayList(mo1225m.f36482b);
                        for (int i = 0; i < mo1225m.f36482b; i++) {
                            C10833v c10833v = new C10833v();
                            c10833v.mo1286a(abstractC11376e);
                            this.f34351a.add(c10833v);
                        }
                        abstractC11376e.mo1237n();
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 2:
                    if (mo1240i.f36479b == 15) {
                        C11374c mo1225m2 = abstractC11376e.mo1225m();
                        this.f34352b = new ArrayList(mo1225m2.f36482b);
                        for (int i2 = 0; i2 < mo1225m2.f36482b; i2++) {
                            C10800b c10800b = new C10800b();
                            c10800b.mo1286a(abstractC11376e);
                            this.f34352b.add(c10800b);
                        }
                        abstractC11376e.mo1237n();
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 3:
                    if (mo1240i.f36479b == 12) {
                        this.f34353c = new C10810i();
                        this.f34353c.mo1286a(abstractC11376e);
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
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
    public boolean m3366a() {
        return this.f34351a != null;
    }

    /* renamed from: a */
    public boolean m3364a(C10817m c10817m) {
        if (c10817m == null) {
            return false;
        }
        boolean m3366a = m3366a();
        boolean m3366a2 = c10817m.m3366a();
        if ((m3366a || m3366a2) && (!m3366a || !m3366a2 || !this.f34351a.equals(c10817m.f34351a))) {
            return false;
        }
        boolean m3362b = m3362b();
        boolean m3362b2 = c10817m.m3362b();
        if ((m3362b || m3362b2) && (!m3362b || !m3362b2 || !this.f34352b.equals(c10817m.f34352b))) {
            return false;
        }
        boolean m3359c = m3359c();
        boolean m3359c2 = c10817m.m3359c();
        return (!m3359c && !m3359c2) || (m3359c && m3359c2 && this.f34353c.m3428a(c10817m.f34353c));
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(C10817m c10817m) {
        int m1278a;
        int m1273a;
        int m1273a2;
        if (!getClass().equals(c10817m.getClass())) {
            return getClass().getName().compareTo(c10817m.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m3366a()).compareTo(Boolean.valueOf(c10817m.m3366a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m3366a() && (m1273a2 = C11369b.m1273a(this.f34351a, c10817m.f34351a)) != 0) {
            return m1273a2;
        }
        int compareTo2 = Boolean.valueOf(m3362b()).compareTo(Boolean.valueOf(c10817m.m3362b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m3362b() && (m1273a = C11369b.m1273a(this.f34352b, c10817m.f34352b)) != 0) {
            return m1273a;
        }
        int compareTo3 = Boolean.valueOf(m3359c()).compareTo(Boolean.valueOf(c10817m.m3359c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (m3359c() && (m1278a = C11369b.m1278a(this.f34353c, c10817m.f34353c)) != 0) {
            return m1278a;
        }
        return 0;
    }

    /* renamed from: b */
    public C10817m m3360b(List<C10800b> list) {
        this.f34352b = list;
        return this;
    }

    @Override // org.p286a.p321b.AbstractC11361a
    /* renamed from: b */
    public void mo1285b(AbstractC11376e abstractC11376e) {
        m3358d();
        abstractC11376e.mo1250a(f34347e);
        if (this.f34351a != null && m3366a()) {
            abstractC11376e.mo1254a(f34348f);
            abstractC11376e.mo1253a(new C11374c((byte) 12, this.f34351a.size()));
            for (C10833v c10833v : this.f34351a) {
                c10833v.mo1285b(abstractC11376e);
            }
            abstractC11376e.mo1244e();
            abstractC11376e.mo1247b();
        }
        if (this.f34352b != null && m3362b()) {
            abstractC11376e.mo1254a(f34349g);
            abstractC11376e.mo1253a(new C11374c((byte) 12, this.f34352b.size()));
            for (C10800b c10800b : this.f34352b) {
                c10800b.mo1285b(abstractC11376e);
            }
            abstractC11376e.mo1244e();
            abstractC11376e.mo1247b();
        }
        if (this.f34353c != null && m3359c()) {
            abstractC11376e.mo1254a(f34350h);
            this.f34353c.mo1285b(abstractC11376e);
            abstractC11376e.mo1247b();
        }
        abstractC11376e.mo1246c();
        abstractC11376e.mo1261a();
    }

    /* renamed from: b */
    public boolean m3362b() {
        return this.f34352b != null;
    }

    /* renamed from: c */
    public boolean m3359c() {
        return this.f34353c != null;
    }

    /* renamed from: d */
    public void m3358d() {
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C10817m)) {
            return m3364a((C10817m) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        boolean z = false;
        StringBuilder sb = new StringBuilder("LocationInfo(");
        boolean z2 = true;
        if (m3366a()) {
            sb.append("wifiList:");
            if (this.f34351a == null) {
                sb.append("null");
            } else {
                sb.append(this.f34351a);
            }
            z2 = false;
        }
        if (m3362b()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("cellList:");
            if (this.f34352b == null) {
                sb.append("null");
            } else {
                sb.append(this.f34352b);
            }
        } else {
            z = z2;
        }
        if (m3359c()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("gps:");
            if (this.f34353c == null) {
                sb.append("null");
            } else {
                sb.append(this.f34353c);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
