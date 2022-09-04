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
/* renamed from: com.xiaomi.xmpush.thrift.y */
/* loaded from: classes2.dex */
public class C10839y implements Serializable, Cloneable, AbstractC11361a<C10839y, EnumC10840a> {

    /* renamed from: c */
    public static final Map<EnumC10840a, C11363b> f34680c;

    /* renamed from: d */
    private static final C11381j f34681d = new C11381j("XmPushActionCheckClientInfo");

    /* renamed from: e */
    private static final C11373b f34682e = new C11373b("miscConfigVersion", (byte) 8, 1);

    /* renamed from: f */
    private static final C11373b f34683f = new C11373b("pluginConfigVersion", (byte) 8, 2);

    /* renamed from: a */
    public int f34684a;

    /* renamed from: b */
    public int f34685b;

    /* renamed from: g */
    private BitSet f34686g = new BitSet(2);

    /* renamed from: com.xiaomi.xmpush.thrift.y$a */
    /* loaded from: classes2.dex */
    public enum EnumC10840a {
        MISC_CONFIG_VERSION(1, "miscConfigVersion"),
        PLUGIN_CONFIG_VERSION(2, "pluginConfigVersion");
        

        /* renamed from: c */
        private static final Map<String, EnumC10840a> f34689c = new HashMap();

        /* renamed from: d */
        private final short f34691d;

        /* renamed from: e */
        private final String f34692e;

        static {
            Iterator it2 = EnumSet.allOf(EnumC10840a.class).iterator();
            while (it2.hasNext()) {
                EnumC10840a enumC10840a = (EnumC10840a) it2.next();
                f34689c.put(enumC10840a.m3171a(), enumC10840a);
            }
        }

        EnumC10840a(short s, String str) {
            this.f34691d = s;
            this.f34692e = str;
        }

        /* renamed from: a */
        public String m3171a() {
            return this.f34692e;
        }
    }

    static {
        EnumMap enumMap = new EnumMap(EnumC10840a.class);
        enumMap.put((EnumMap) EnumC10840a.MISC_CONFIG_VERSION, (EnumC10840a) new C11363b("miscConfigVersion", (byte) 1, new C11364c((byte) 8)));
        enumMap.put((EnumMap) EnumC10840a.PLUGIN_CONFIG_VERSION, (EnumC10840a) new C11363b("pluginConfigVersion", (byte) 1, new C11364c((byte) 8)));
        f34680c = Collections.unmodifiableMap(enumMap);
        C11363b.m1284a(C10839y.class, f34680c);
    }

    /* renamed from: a */
    public C10839y m3179a(int i) {
        this.f34684a = i;
        m3177a(true);
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
                if (!m3180a()) {
                    throw new C11377f("Required field 'miscConfigVersion' was not found in serialized data! Struct: " + toString());
                }
                if (!m3176b()) {
                    throw new C11377f("Required field 'pluginConfigVersion' was not found in serialized data! Struct: " + toString());
                }
                m3172c();
                return;
            }
            switch (mo1240i.f36480c) {
                case 1:
                    if (mo1240i.f36479b != 8) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f34684a = abstractC11376e.mo1232t();
                        m3177a(true);
                        break;
                    }
                case 2:
                    if (mo1240i.f36479b != 8) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f34685b = abstractC11376e.mo1232t();
                        m3173b(true);
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
    public void m3177a(boolean z) {
        this.f34686g.set(0, z);
    }

    /* renamed from: a */
    public boolean m3180a() {
        return this.f34686g.get(0);
    }

    /* renamed from: a */
    public boolean m3178a(C10839y c10839y) {
        return c10839y != null && this.f34684a == c10839y.f34684a && this.f34685b == c10839y.f34685b;
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(C10839y c10839y) {
        int m1280a;
        int m1280a2;
        if (!getClass().equals(c10839y.getClass())) {
            return getClass().getName().compareTo(c10839y.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m3180a()).compareTo(Boolean.valueOf(c10839y.m3180a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m3180a() && (m1280a2 = C11369b.m1280a(this.f34684a, c10839y.f34684a)) != 0) {
            return m1280a2;
        }
        int compareTo2 = Boolean.valueOf(m3176b()).compareTo(Boolean.valueOf(c10839y.m3176b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m3176b() && (m1280a = C11369b.m1280a(this.f34685b, c10839y.f34685b)) != 0) {
            return m1280a;
        }
        return 0;
    }

    /* renamed from: b */
    public C10839y m3175b(int i) {
        this.f34685b = i;
        m3173b(true);
        return this;
    }

    @Override // org.p286a.p321b.AbstractC11361a
    /* renamed from: b */
    public void mo1285b(AbstractC11376e abstractC11376e) {
        m3172c();
        abstractC11376e.mo1250a(f34681d);
        abstractC11376e.mo1254a(f34682e);
        abstractC11376e.mo1258a(this.f34684a);
        abstractC11376e.mo1247b();
        abstractC11376e.mo1254a(f34683f);
        abstractC11376e.mo1258a(this.f34685b);
        abstractC11376e.mo1247b();
        abstractC11376e.mo1246c();
        abstractC11376e.mo1261a();
    }

    /* renamed from: b */
    public void m3173b(boolean z) {
        this.f34686g.set(1, z);
    }

    /* renamed from: b */
    public boolean m3176b() {
        return this.f34686g.get(1);
    }

    /* renamed from: c */
    public void m3172c() {
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C10839y)) {
            return m3178a((C10839y) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        return "XmPushActionCheckClientInfo(miscConfigVersion:" + this.f34684a + ", pluginConfigVersion:" + this.f34685b + ")";
    }
}
