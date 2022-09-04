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
import org.p286a.p321b.p323b.C11377f;
import org.p286a.p321b.p323b.C11379h;
import org.p286a.p321b.p323b.C11381j;
/* renamed from: com.xiaomi.xmpush.thrift.v */
/* loaded from: classes2.dex */
public class C10833v implements Serializable, Cloneable, AbstractC11361a<C10833v, EnumC10834a> {

    /* renamed from: d */
    public static final Map<EnumC10834a, C11363b> f34557d;

    /* renamed from: e */
    private static final C11381j f34558e = new C11381j("Wifi");

    /* renamed from: f */
    private static final C11373b f34559f = new C11373b("macAddress", (byte) 11, 1);

    /* renamed from: g */
    private static final C11373b f34560g = new C11373b("signalStrength", (byte) 8, 2);

    /* renamed from: h */
    private static final C11373b f34561h = new C11373b("ssid", (byte) 11, 3);

    /* renamed from: a */
    public String f34562a;

    /* renamed from: b */
    public int f34563b;

    /* renamed from: c */
    public String f34564c;

    /* renamed from: i */
    private BitSet f34565i = new BitSet(1);

    /* renamed from: com.xiaomi.xmpush.thrift.v$a */
    /* loaded from: classes2.dex */
    public enum EnumC10834a {
        MAC_ADDRESS(1, "macAddress"),
        SIGNAL_STRENGTH(2, "signalStrength"),
        SSID(3, "ssid");
        

        /* renamed from: d */
        private static final Map<String, EnumC10834a> f34569d = new HashMap();

        /* renamed from: e */
        private final short f34571e;

        /* renamed from: f */
        private final String f34572f;

        static {
            Iterator it2 = EnumSet.allOf(EnumC10834a.class).iterator();
            while (it2.hasNext()) {
                EnumC10834a enumC10834a = (EnumC10834a) it2.next();
                f34569d.put(enumC10834a.m3234a(), enumC10834a);
            }
        }

        EnumC10834a(short s, String str) {
            this.f34571e = s;
            this.f34572f = str;
        }

        /* renamed from: a */
        public String m3234a() {
            return this.f34572f;
        }
    }

    static {
        EnumMap enumMap = new EnumMap(EnumC10834a.class);
        enumMap.put((EnumMap) EnumC10834a.MAC_ADDRESS, (EnumC10834a) new C11363b("macAddress", (byte) 1, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10834a.SIGNAL_STRENGTH, (EnumC10834a) new C11363b("signalStrength", (byte) 1, new C11364c((byte) 8)));
        enumMap.put((EnumMap) EnumC10834a.SSID, (EnumC10834a) new C11363b("ssid", (byte) 2, new C11364c((byte) 11)));
        f34557d = Collections.unmodifiableMap(enumMap);
        C11363b.m1284a(C10833v.class, f34557d);
    }

    /* renamed from: a */
    public C10833v m3243a(int i) {
        this.f34563b = i;
        m3240a(true);
        return this;
    }

    /* renamed from: a */
    public C10833v m3241a(String str) {
        this.f34562a = str;
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
                if (!m3239b()) {
                    throw new C11377f("Required field 'signalStrength' was not found in serialized data! Struct: " + toString());
                }
                m3235d();
                return;
            }
            switch (mo1240i.f36480c) {
                case 1:
                    if (mo1240i.f36479b != 11) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f34562a = abstractC11376e.mo1223w();
                        break;
                    }
                case 2:
                    if (mo1240i.f36479b != 8) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f34563b = abstractC11376e.mo1232t();
                        m3240a(true);
                        break;
                    }
                case 3:
                    if (mo1240i.f36479b != 11) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f34564c = abstractC11376e.mo1223w();
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
    public void m3240a(boolean z) {
        this.f34565i.set(0, z);
    }

    /* renamed from: a */
    public boolean m3244a() {
        return this.f34562a != null;
    }

    /* renamed from: a */
    public boolean m3242a(C10833v c10833v) {
        if (c10833v == null) {
            return false;
        }
        boolean m3244a = m3244a();
        boolean m3244a2 = c10833v.m3244a();
        if (((m3244a || m3244a2) && (!m3244a || !m3244a2 || !this.f34562a.equals(c10833v.f34562a))) || this.f34563b != c10833v.f34563b) {
            return false;
        }
        boolean m3236c = m3236c();
        boolean m3236c2 = c10833v.m3236c();
        return (!m3236c && !m3236c2) || (m3236c && m3236c2 && this.f34564c.equals(c10833v.f34564c));
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(C10833v c10833v) {
        int m1277a;
        int m1280a;
        int m1277a2;
        if (!getClass().equals(c10833v.getClass())) {
            return getClass().getName().compareTo(c10833v.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m3244a()).compareTo(Boolean.valueOf(c10833v.m3244a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m3244a() && (m1277a2 = C11369b.m1277a(this.f34562a, c10833v.f34562a)) != 0) {
            return m1277a2;
        }
        int compareTo2 = Boolean.valueOf(m3239b()).compareTo(Boolean.valueOf(c10833v.m3239b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m3239b() && (m1280a = C11369b.m1280a(this.f34563b, c10833v.f34563b)) != 0) {
            return m1280a;
        }
        int compareTo3 = Boolean.valueOf(m3236c()).compareTo(Boolean.valueOf(c10833v.m3236c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (m3236c() && (m1277a = C11369b.m1277a(this.f34564c, c10833v.f34564c)) != 0) {
            return m1277a;
        }
        return 0;
    }

    /* renamed from: b */
    public C10833v m3237b(String str) {
        this.f34564c = str;
        return this;
    }

    @Override // org.p286a.p321b.AbstractC11361a
    /* renamed from: b */
    public void mo1285b(AbstractC11376e abstractC11376e) {
        m3235d();
        abstractC11376e.mo1250a(f34558e);
        if (this.f34562a != null) {
            abstractC11376e.mo1254a(f34559f);
            abstractC11376e.mo1256a(this.f34562a);
            abstractC11376e.mo1247b();
        }
        abstractC11376e.mo1254a(f34560g);
        abstractC11376e.mo1258a(this.f34563b);
        abstractC11376e.mo1247b();
        if (this.f34564c != null && m3236c()) {
            abstractC11376e.mo1254a(f34561h);
            abstractC11376e.mo1256a(this.f34564c);
            abstractC11376e.mo1247b();
        }
        abstractC11376e.mo1246c();
        abstractC11376e.mo1261a();
    }

    /* renamed from: b */
    public boolean m3239b() {
        return this.f34565i.get(0);
    }

    /* renamed from: c */
    public boolean m3236c() {
        return this.f34564c != null;
    }

    /* renamed from: d */
    public void m3235d() {
        if (this.f34562a == null) {
            throw new C11377f("Required field 'macAddress' was not present! Struct: " + toString());
        }
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C10833v)) {
            return m3242a((C10833v) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Wifi(");
        sb.append("macAddress:");
        if (this.f34562a == null) {
            sb.append("null");
        } else {
            sb.append(this.f34562a);
        }
        sb.append(", ");
        sb.append("signalStrength:");
        sb.append(this.f34563b);
        if (m3236c()) {
            sb.append(", ");
            sb.append("ssid:");
            if (this.f34564c == null) {
                sb.append("null");
            } else {
                sb.append(this.f34564c);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
