package com.xiaomi.xmpush.thrift;

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
/* renamed from: com.xiaomi.xmpush.thrift.n */
/* loaded from: classes2.dex */
public class C10819n implements Serializable, Cloneable, AbstractC11361a<C10819n, EnumC10820a> {

    /* renamed from: d */
    public static final Map<EnumC10820a, C11363b> f34361d;

    /* renamed from: e */
    private static final C11381j f34362e = new C11381j("NormalConfig");

    /* renamed from: f */
    private static final C11373b f34363f = new C11373b("version", (byte) 8, 1);

    /* renamed from: g */
    private static final C11373b f34364g = new C11373b("configItems", (byte) 15, 2);

    /* renamed from: h */
    private static final C11373b f34365h = new C11373b("type", (byte) 8, 3);

    /* renamed from: a */
    public int f34366a;

    /* renamed from: b */
    public List<C10822p> f34367b;

    /* renamed from: c */
    public EnumC10807f f34368c;

    /* renamed from: i */
    private BitSet f34369i = new BitSet(1);

    /* renamed from: com.xiaomi.xmpush.thrift.n$a */
    /* loaded from: classes2.dex */
    public enum EnumC10820a {
        VERSION(1, "version"),
        CONFIG_ITEMS(2, "configItems"),
        TYPE(3, "type");
        

        /* renamed from: d */
        private static final Map<String, EnumC10820a> f34373d = new HashMap();

        /* renamed from: e */
        private final short f34375e;

        /* renamed from: f */
        private final String f34376f;

        static {
            Iterator it2 = EnumSet.allOf(EnumC10820a.class).iterator();
            while (it2.hasNext()) {
                EnumC10820a enumC10820a = (EnumC10820a) it2.next();
                f34373d.put(enumC10820a.m3347a(), enumC10820a);
            }
        }

        EnumC10820a(short s, String str) {
            this.f34375e = s;
            this.f34376f = str;
        }

        /* renamed from: a */
        public String m3347a() {
            return this.f34376f;
        }
    }

    static {
        EnumMap enumMap = new EnumMap(EnumC10820a.class);
        enumMap.put((EnumMap) EnumC10820a.VERSION, (EnumC10820a) new C11363b("version", (byte) 1, new C11364c((byte) 8)));
        enumMap.put((EnumMap) EnumC10820a.CONFIG_ITEMS, (EnumC10820a) new C11363b("configItems", (byte) 1, new C11365d((byte) 15, new C11368g((byte) 12, C10822p.class))));
        enumMap.put((EnumMap) EnumC10820a.TYPE, (EnumC10820a) new C11363b("type", (byte) 1, new C11362a((byte) 16, EnumC10807f.class)));
        f34361d = Collections.unmodifiableMap(enumMap);
        C11363b.m1284a(C10819n.class, f34361d);
    }

    /* renamed from: a */
    public int m3356a() {
        return this.f34366a;
    }

    @Override // org.p286a.p321b.AbstractC11361a
    /* renamed from: a */
    public void mo1286a(AbstractC11376e abstractC11376e) {
        abstractC11376e.mo1242g();
        while (true) {
            C11373b mo1240i = abstractC11376e.mo1240i();
            if (mo1240i.f36479b == 0) {
                abstractC11376e.mo1241h();
                if (!m3353b()) {
                    throw new C11377f("Required field 'version' was not found in serialized data! Struct: " + toString());
                }
                m3348f();
                return;
            }
            switch (mo1240i.f36480c) {
                case 1:
                    if (mo1240i.f36479b == 8) {
                        this.f34366a = abstractC11376e.mo1232t();
                        m3354a(true);
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 2:
                    if (mo1240i.f36479b == 15) {
                        C11374c mo1225m = abstractC11376e.mo1225m();
                        this.f34367b = new ArrayList(mo1225m.f36482b);
                        for (int i = 0; i < mo1225m.f36482b; i++) {
                            C10822p c10822p = new C10822p();
                            c10822p.mo1286a(abstractC11376e);
                            this.f34367b.add(c10822p);
                        }
                        abstractC11376e.mo1237n();
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 3:
                    if (mo1240i.f36479b == 8) {
                        this.f34368c = EnumC10807f.m3435a(abstractC11376e.mo1232t());
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
    public void m3354a(boolean z) {
        this.f34369i.set(0, z);
    }

    /* renamed from: a */
    public boolean m3355a(C10819n c10819n) {
        if (c10819n != null && this.f34366a == c10819n.f34366a) {
            boolean m3351c = m3351c();
            boolean m3351c2 = c10819n.m3351c();
            if ((m3351c || m3351c2) && (!m3351c || !m3351c2 || !this.f34367b.equals(c10819n.f34367b))) {
                return false;
            }
            boolean m3349e = m3349e();
            boolean m3349e2 = c10819n.m3349e();
            return (!m3349e && !m3349e2) || (m3349e && m3349e2 && this.f34368c.equals(c10819n.f34368c));
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(C10819n c10819n) {
        int m1278a;
        int m1273a;
        int m1280a;
        if (!getClass().equals(c10819n.getClass())) {
            return getClass().getName().compareTo(c10819n.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m3353b()).compareTo(Boolean.valueOf(c10819n.m3353b()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m3353b() && (m1280a = C11369b.m1280a(this.f34366a, c10819n.f34366a)) != 0) {
            return m1280a;
        }
        int compareTo2 = Boolean.valueOf(m3351c()).compareTo(Boolean.valueOf(c10819n.m3351c()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m3351c() && (m1273a = C11369b.m1273a(this.f34367b, c10819n.f34367b)) != 0) {
            return m1273a;
        }
        int compareTo3 = Boolean.valueOf(m3349e()).compareTo(Boolean.valueOf(c10819n.m3349e()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (m3349e() && (m1278a = C11369b.m1278a(this.f34368c, c10819n.f34368c)) != 0) {
            return m1278a;
        }
        return 0;
    }

    @Override // org.p286a.p321b.AbstractC11361a
    /* renamed from: b */
    public void mo1285b(AbstractC11376e abstractC11376e) {
        m3348f();
        abstractC11376e.mo1250a(f34362e);
        abstractC11376e.mo1254a(f34363f);
        abstractC11376e.mo1258a(this.f34366a);
        abstractC11376e.mo1247b();
        if (this.f34367b != null) {
            abstractC11376e.mo1254a(f34364g);
            abstractC11376e.mo1253a(new C11374c((byte) 12, this.f34367b.size()));
            for (C10822p c10822p : this.f34367b) {
                c10822p.mo1285b(abstractC11376e);
            }
            abstractC11376e.mo1244e();
            abstractC11376e.mo1247b();
        }
        if (this.f34368c != null) {
            abstractC11376e.mo1254a(f34365h);
            abstractC11376e.mo1258a(this.f34368c.m3436a());
            abstractC11376e.mo1247b();
        }
        abstractC11376e.mo1246c();
        abstractC11376e.mo1261a();
    }

    /* renamed from: b */
    public boolean m3353b() {
        return this.f34369i.get(0);
    }

    /* renamed from: c */
    public boolean m3351c() {
        return this.f34367b != null;
    }

    /* renamed from: d */
    public EnumC10807f m3350d() {
        return this.f34368c;
    }

    /* renamed from: e */
    public boolean m3349e() {
        return this.f34368c != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C10819n)) {
            return m3355a((C10819n) obj);
        }
        return false;
    }

    /* renamed from: f */
    public void m3348f() {
        if (this.f34367b == null) {
            throw new C11377f("Required field 'configItems' was not present! Struct: " + toString());
        }
        if (this.f34368c != null) {
            return;
        }
        throw new C11377f("Required field 'type' was not present! Struct: " + toString());
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NormalConfig(");
        sb.append("version:");
        sb.append(this.f34366a);
        sb.append(", ");
        sb.append("configItems:");
        if (this.f34367b == null) {
            sb.append("null");
        } else {
            sb.append(this.f34367b);
        }
        sb.append(", ");
        sb.append("type:");
        if (this.f34368c == null) {
            sb.append("null");
        } else {
            sb.append(this.f34368c);
        }
        sb.append(")");
        return sb.toString();
    }
}
