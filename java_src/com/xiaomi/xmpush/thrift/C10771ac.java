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
import org.p286a.p321b.p323b.C11377f;
import org.p286a.p321b.p323b.C11379h;
import org.p286a.p321b.p323b.C11381j;
/* renamed from: com.xiaomi.xmpush.thrift.ac */
/* loaded from: classes2.dex */
public class C10771ac implements Serializable, Cloneable, AbstractC11361a<C10771ac, EnumC10772a> {

    /* renamed from: b */
    public static final Map<EnumC10772a, C11363b> f33687b;

    /* renamed from: c */
    private static final C11381j f33688c = new C11381j("XmPushActionCustomConfig");

    /* renamed from: d */
    private static final C11373b f33689d = new C11373b("customConfigs", (byte) 15, 1);

    /* renamed from: a */
    public List<C10822p> f33690a;

    /* renamed from: com.xiaomi.xmpush.thrift.ac$a */
    /* loaded from: classes2.dex */
    public enum EnumC10772a {
        CUSTOM_CONFIGS(1, "customConfigs");
        

        /* renamed from: b */
        private static final Map<String, EnumC10772a> f33692b = new HashMap();

        /* renamed from: c */
        private final short f33694c;

        /* renamed from: d */
        private final String f33695d;

        static {
            Iterator it2 = EnumSet.allOf(EnumC10772a.class).iterator();
            while (it2.hasNext()) {
                EnumC10772a enumC10772a = (EnumC10772a) it2.next();
                f33692b.put(enumC10772a.m3718a(), enumC10772a);
            }
        }

        EnumC10772a(short s, String str) {
            this.f33694c = s;
            this.f33695d = str;
        }

        /* renamed from: a */
        public String m3718a() {
            return this.f33695d;
        }
    }

    static {
        EnumMap enumMap = new EnumMap(EnumC10772a.class);
        enumMap.put((EnumMap) EnumC10772a.CUSTOM_CONFIGS, (EnumC10772a) new C11363b("customConfigs", (byte) 1, new C11365d((byte) 15, new C11368g((byte) 12, C10822p.class))));
        f33687b = Collections.unmodifiableMap(enumMap);
        C11363b.m1284a(C10771ac.class, f33687b);
    }

    /* renamed from: a */
    public List<C10822p> m3723a() {
        return this.f33690a;
    }

    @Override // org.p286a.p321b.AbstractC11361a
    /* renamed from: a */
    public void mo1286a(AbstractC11376e abstractC11376e) {
        abstractC11376e.mo1242g();
        while (true) {
            C11373b mo1240i = abstractC11376e.mo1240i();
            if (mo1240i.f36479b == 0) {
                abstractC11376e.mo1241h();
                m3719c();
                return;
            }
            switch (mo1240i.f36480c) {
                case 1:
                    if (mo1240i.f36479b == 15) {
                        C11374c mo1225m = abstractC11376e.mo1225m();
                        this.f33690a = new ArrayList(mo1225m.f36482b);
                        for (int i = 0; i < mo1225m.f36482b; i++) {
                            C10822p c10822p = new C10822p();
                            c10822p.mo1286a(abstractC11376e);
                            this.f33690a.add(c10822p);
                        }
                        abstractC11376e.mo1237n();
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
    public boolean m3722a(C10771ac c10771ac) {
        if (c10771ac == null) {
            return false;
        }
        boolean m3721b = m3721b();
        boolean m3721b2 = c10771ac.m3721b();
        return (!m3721b && !m3721b2) || (m3721b && m3721b2 && this.f33690a.equals(c10771ac.f33690a));
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(C10771ac c10771ac) {
        int m1273a;
        if (!getClass().equals(c10771ac.getClass())) {
            return getClass().getName().compareTo(c10771ac.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m3721b()).compareTo(Boolean.valueOf(c10771ac.m3721b()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m3721b() && (m1273a = C11369b.m1273a(this.f33690a, c10771ac.f33690a)) != 0) {
            return m1273a;
        }
        return 0;
    }

    @Override // org.p286a.p321b.AbstractC11361a
    /* renamed from: b */
    public void mo1285b(AbstractC11376e abstractC11376e) {
        m3719c();
        abstractC11376e.mo1250a(f33688c);
        if (this.f33690a != null) {
            abstractC11376e.mo1254a(f33689d);
            abstractC11376e.mo1253a(new C11374c((byte) 12, this.f33690a.size()));
            for (C10822p c10822p : this.f33690a) {
                c10822p.mo1285b(abstractC11376e);
            }
            abstractC11376e.mo1244e();
            abstractC11376e.mo1247b();
        }
        abstractC11376e.mo1246c();
        abstractC11376e.mo1261a();
    }

    /* renamed from: b */
    public boolean m3721b() {
        return this.f33690a != null;
    }

    /* renamed from: c */
    public void m3719c() {
        if (this.f33690a == null) {
            throw new C11377f("Required field 'customConfigs' was not present! Struct: " + toString());
        }
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C10771ac)) {
            return m3722a((C10771ac) obj);
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("XmPushActionCustomConfig(");
        sb.append("customConfigs:");
        if (this.f33690a == null) {
            sb.append("null");
        } else {
            sb.append(this.f33690a);
        }
        sb.append(")");
        return sb.toString();
    }
}
