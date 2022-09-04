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
/* renamed from: com.xiaomi.xmpush.thrift.b */
/* loaded from: classes2.dex */
public class C10800b implements Serializable, Cloneable, AbstractC11361a<C10800b, EnumC10801a> {

    /* renamed from: c */
    public static final Map<EnumC10801a, C11363b> f34158c;

    /* renamed from: d */
    private static final C11381j f34159d = new C11381j("Cellular");

    /* renamed from: e */
    private static final C11373b f34160e = new C11373b("id", (byte) 8, 1);

    /* renamed from: f */
    private static final C11373b f34161f = new C11373b("signalStrength", (byte) 8, 2);

    /* renamed from: a */
    public int f34162a;

    /* renamed from: b */
    public int f34163b;

    /* renamed from: g */
    private BitSet f34164g = new BitSet(2);

    /* renamed from: com.xiaomi.xmpush.thrift.b$a */
    /* loaded from: classes2.dex */
    public enum EnumC10801a {
        ID(1, "id"),
        SIGNAL_STRENGTH(2, "signalStrength");
        

        /* renamed from: c */
        private static final Map<String, EnumC10801a> f34167c = new HashMap();

        /* renamed from: d */
        private final short f34169d;

        /* renamed from: e */
        private final String f34170e;

        static {
            Iterator it2 = EnumSet.allOf(EnumC10801a.class).iterator();
            while (it2.hasNext()) {
                EnumC10801a enumC10801a = (EnumC10801a) it2.next();
                f34167c.put(enumC10801a.m3459a(), enumC10801a);
            }
        }

        EnumC10801a(short s, String str) {
            this.f34169d = s;
            this.f34170e = str;
        }

        /* renamed from: a */
        public String m3459a() {
            return this.f34170e;
        }
    }

    static {
        EnumMap enumMap = new EnumMap(EnumC10801a.class);
        enumMap.put((EnumMap) EnumC10801a.ID, (EnumC10801a) new C11363b("id", (byte) 1, new C11364c((byte) 8)));
        enumMap.put((EnumMap) EnumC10801a.SIGNAL_STRENGTH, (EnumC10801a) new C11363b("signalStrength", (byte) 1, new C11364c((byte) 8)));
        f34158c = Collections.unmodifiableMap(enumMap);
        C11363b.m1284a(C10800b.class, f34158c);
    }

    /* renamed from: a */
    public C10800b m3467a(int i) {
        this.f34162a = i;
        m3465a(true);
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
                if (!m3468a()) {
                    throw new C11377f("Required field 'id' was not found in serialized data! Struct: " + toString());
                }
                if (!m3464b()) {
                    throw new C11377f("Required field 'signalStrength' was not found in serialized data! Struct: " + toString());
                }
                m3460c();
                return;
            }
            switch (mo1240i.f36480c) {
                case 1:
                    if (mo1240i.f36479b != 8) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f34162a = abstractC11376e.mo1232t();
                        m3465a(true);
                        break;
                    }
                case 2:
                    if (mo1240i.f36479b != 8) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f34163b = abstractC11376e.mo1232t();
                        m3461b(true);
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
    public void m3465a(boolean z) {
        this.f34164g.set(0, z);
    }

    /* renamed from: a */
    public boolean m3468a() {
        return this.f34164g.get(0);
    }

    /* renamed from: a */
    public boolean m3466a(C10800b c10800b) {
        return c10800b != null && this.f34162a == c10800b.f34162a && this.f34163b == c10800b.f34163b;
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(C10800b c10800b) {
        int m1280a;
        int m1280a2;
        if (!getClass().equals(c10800b.getClass())) {
            return getClass().getName().compareTo(c10800b.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m3468a()).compareTo(Boolean.valueOf(c10800b.m3468a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m3468a() && (m1280a2 = C11369b.m1280a(this.f34162a, c10800b.f34162a)) != 0) {
            return m1280a2;
        }
        int compareTo2 = Boolean.valueOf(m3464b()).compareTo(Boolean.valueOf(c10800b.m3464b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m3464b() && (m1280a = C11369b.m1280a(this.f34163b, c10800b.f34163b)) != 0) {
            return m1280a;
        }
        return 0;
    }

    /* renamed from: b */
    public C10800b m3463b(int i) {
        this.f34163b = i;
        m3461b(true);
        return this;
    }

    @Override // org.p286a.p321b.AbstractC11361a
    /* renamed from: b */
    public void mo1285b(AbstractC11376e abstractC11376e) {
        m3460c();
        abstractC11376e.mo1250a(f34159d);
        abstractC11376e.mo1254a(f34160e);
        abstractC11376e.mo1258a(this.f34162a);
        abstractC11376e.mo1247b();
        abstractC11376e.mo1254a(f34161f);
        abstractC11376e.mo1258a(this.f34163b);
        abstractC11376e.mo1247b();
        abstractC11376e.mo1246c();
        abstractC11376e.mo1261a();
    }

    /* renamed from: b */
    public void m3461b(boolean z) {
        this.f34164g.set(1, z);
    }

    /* renamed from: b */
    public boolean m3464b() {
        return this.f34164g.get(1);
    }

    /* renamed from: c */
    public void m3460c() {
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C10800b)) {
            return m3466a((C10800b) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        return "Cellular(id:" + this.f34162a + ", signalStrength:" + this.f34163b + ")";
    }
}
