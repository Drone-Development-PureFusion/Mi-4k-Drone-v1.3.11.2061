package com.xiaomi.xmpush.thrift;

import java.io.Serializable;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.p286a.p321b.AbstractC11361a;
import org.p286a.p321b.C11369b;
import org.p286a.p321b.p322a.C11363b;
import org.p286a.p321b.p322a.C11367f;
import org.p286a.p321b.p322a.C11368g;
import org.p286a.p321b.p323b.AbstractC11376e;
import org.p286a.p321b.p323b.C11373b;
import org.p286a.p321b.p323b.C11377f;
import org.p286a.p321b.p323b.C11379h;
import org.p286a.p321b.p323b.C11380i;
import org.p286a.p321b.p323b.C11381j;
/* renamed from: com.xiaomi.xmpush.thrift.s */
/* loaded from: classes2.dex */
public class C10828s implements Serializable, Cloneable, AbstractC11361a<C10828s, EnumC10829a> {

    /* renamed from: b */
    public static final Map<EnumC10829a, C11363b> f34521b;

    /* renamed from: c */
    private static final C11381j f34522c = new C11381j("RegisteredGeoFencing");

    /* renamed from: d */
    private static final C11373b f34523d = new C11373b("geoFencings", (byte) 14, 1);

    /* renamed from: a */
    public Set<C10812j> f34524a;

    /* renamed from: com.xiaomi.xmpush.thrift.s$a */
    /* loaded from: classes2.dex */
    public enum EnumC10829a {
        GEO_FENCINGS(1, "geoFencings");
        

        /* renamed from: b */
        private static final Map<String, EnumC10829a> f34526b = new HashMap();

        /* renamed from: c */
        private final short f34528c;

        /* renamed from: d */
        private final String f34529d;

        static {
            Iterator it2 = EnumSet.allOf(EnumC10829a.class).iterator();
            while (it2.hasNext()) {
                EnumC10829a enumC10829a = (EnumC10829a) it2.next();
                f34526b.put(enumC10829a.m3258a(), enumC10829a);
            }
        }

        EnumC10829a(short s, String str) {
            this.f34528c = s;
            this.f34529d = str;
        }

        /* renamed from: a */
        public String m3258a() {
            return this.f34529d;
        }
    }

    static {
        EnumMap enumMap = new EnumMap(EnumC10829a.class);
        enumMap.put((EnumMap) EnumC10829a.GEO_FENCINGS, (EnumC10829a) new C11363b("geoFencings", (byte) 1, new C11367f((byte) 14, new C11368g((byte) 12, C10812j.class))));
        f34521b = Collections.unmodifiableMap(enumMap);
        C11363b.m1284a(C10828s.class, f34521b);
    }

    /* renamed from: a */
    public C10828s m3262a(Set<C10812j> set) {
        this.f34524a = set;
        return this;
    }

    /* renamed from: a */
    public Set<C10812j> m3264a() {
        return this.f34524a;
    }

    @Override // org.p286a.p321b.AbstractC11361a
    /* renamed from: a */
    public void mo1286a(AbstractC11376e abstractC11376e) {
        abstractC11376e.mo1242g();
        while (true) {
            C11373b mo1240i = abstractC11376e.mo1240i();
            if (mo1240i.f36479b == 0) {
                abstractC11376e.mo1241h();
                m3259c();
                return;
            }
            switch (mo1240i.f36480c) {
                case 1:
                    if (mo1240i.f36479b == 14) {
                        C11380i mo1224o = abstractC11376e.mo1224o();
                        this.f34524a = new HashSet(mo1224o.f36490b * 2);
                        for (int i = 0; i < mo1224o.f36490b; i++) {
                            C10812j c10812j = new C10812j();
                            c10812j.mo1286a(abstractC11376e);
                            this.f34524a.add(c10812j);
                        }
                        abstractC11376e.mo1236p();
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
    public boolean m3263a(C10828s c10828s) {
        if (c10828s == null) {
            return false;
        }
        boolean m3261b = m3261b();
        boolean m3261b2 = c10828s.m3261b();
        return (!m3261b && !m3261b2) || (m3261b && m3261b2 && this.f34524a.equals(c10828s.f34524a));
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(C10828s c10828s) {
        int m1271a;
        if (!getClass().equals(c10828s.getClass())) {
            return getClass().getName().compareTo(c10828s.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m3261b()).compareTo(Boolean.valueOf(c10828s.m3261b()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m3261b() && (m1271a = C11369b.m1271a(this.f34524a, c10828s.f34524a)) != 0) {
            return m1271a;
        }
        return 0;
    }

    @Override // org.p286a.p321b.AbstractC11361a
    /* renamed from: b */
    public void mo1285b(AbstractC11376e abstractC11376e) {
        m3259c();
        abstractC11376e.mo1250a(f34522c);
        if (this.f34524a != null) {
            abstractC11376e.mo1254a(f34523d);
            abstractC11376e.mo1251a(new C11380i((byte) 12, this.f34524a.size()));
            for (C10812j c10812j : this.f34524a) {
                c10812j.mo1285b(abstractC11376e);
            }
            abstractC11376e.mo1243f();
            abstractC11376e.mo1247b();
        }
        abstractC11376e.mo1246c();
        abstractC11376e.mo1261a();
    }

    /* renamed from: b */
    public boolean m3261b() {
        return this.f34524a != null;
    }

    /* renamed from: c */
    public void m3259c() {
        if (this.f34524a == null) {
            throw new C11377f("Required field 'geoFencings' was not present! Struct: " + toString());
        }
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C10828s)) {
            return m3263a((C10828s) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RegisteredGeoFencing(");
        sb.append("geoFencings:");
        if (this.f34524a == null) {
            sb.append("null");
        } else {
            sb.append(this.f34524a);
        }
        sb.append(")");
        return sb.toString();
    }
}
