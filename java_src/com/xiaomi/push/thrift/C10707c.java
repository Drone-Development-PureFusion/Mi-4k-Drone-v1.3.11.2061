package com.xiaomi.push.thrift;

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
import org.p286a.p321b.p322a.C11364c;
import org.p286a.p321b.p322a.C11365d;
import org.p286a.p321b.p322a.C11368g;
import org.p286a.p321b.p323b.AbstractC11376e;
import org.p286a.p321b.p323b.C11373b;
import org.p286a.p321b.p323b.C11374c;
import org.p286a.p321b.p323b.C11377f;
import org.p286a.p321b.p323b.C11379h;
import org.p286a.p321b.p323b.C11381j;
/* renamed from: com.xiaomi.push.thrift.c */
/* loaded from: classes2.dex */
public class C10707c implements Serializable, Cloneable, AbstractC11361a<C10707c, EnumC10708a> {

    /* renamed from: d */
    public static final Map<EnumC10708a, C11363b> f33357d;

    /* renamed from: e */
    private static final C11381j f33358e = new C11381j("StatsEvents");

    /* renamed from: f */
    private static final C11373b f33359f = new C11373b("uuid", (byte) 11, 1);

    /* renamed from: g */
    private static final C11373b f33360g = new C11373b("operator", (byte) 11, 2);

    /* renamed from: h */
    private static final C11373b f33361h = new C11373b("events", (byte) 15, 3);

    /* renamed from: a */
    public String f33362a;

    /* renamed from: b */
    public String f33363b;

    /* renamed from: c */
    public List<C10705b> f33364c;

    /* renamed from: com.xiaomi.push.thrift.c$a */
    /* loaded from: classes2.dex */
    public enum EnumC10708a {
        UUID(1, "uuid"),
        OPERATOR(2, "operator"),
        EVENTS(3, "events");
        

        /* renamed from: d */
        private static final Map<String, EnumC10708a> f33368d = new HashMap();

        /* renamed from: e */
        private final short f33370e;

        /* renamed from: f */
        private final String f33371f;

        static {
            Iterator it2 = EnumSet.allOf(EnumC10708a.class).iterator();
            while (it2.hasNext()) {
                EnumC10708a enumC10708a = (EnumC10708a) it2.next();
                f33368d.put(enumC10708a.m4038a(), enumC10708a);
            }
        }

        EnumC10708a(short s, String str) {
            this.f33370e = s;
            this.f33371f = str;
        }

        /* renamed from: a */
        public String m4038a() {
            return this.f33371f;
        }
    }

    static {
        EnumMap enumMap = new EnumMap(EnumC10708a.class);
        enumMap.put((EnumMap) EnumC10708a.UUID, (EnumC10708a) new C11363b("uuid", (byte) 1, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10708a.OPERATOR, (EnumC10708a) new C11363b("operator", (byte) 2, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10708a.EVENTS, (EnumC10708a) new C11363b("events", (byte) 1, new C11365d((byte) 15, new C11368g((byte) 12, C10705b.class))));
        f33357d = Collections.unmodifiableMap(enumMap);
        C11363b.m1284a(C10707c.class, f33357d);
    }

    public C10707c() {
    }

    public C10707c(String str, List<C10705b> list) {
        this();
        this.f33362a = str;
        this.f33364c = list;
    }

    /* renamed from: a */
    public C10707c m4043a(String str) {
        this.f33363b = str;
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
                m4039d();
                return;
            }
            switch (mo1240i.f36480c) {
                case 1:
                    if (mo1240i.f36479b == 11) {
                        this.f33362a = abstractC11376e.mo1223w();
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 2:
                    if (mo1240i.f36479b == 11) {
                        this.f33363b = abstractC11376e.mo1223w();
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 3:
                    if (mo1240i.f36479b == 15) {
                        C11374c mo1225m = abstractC11376e.mo1225m();
                        this.f33364c = new ArrayList(mo1225m.f36482b);
                        for (int i = 0; i < mo1225m.f36482b; i++) {
                            C10705b c10705b = new C10705b();
                            c10705b.mo1286a(abstractC11376e);
                            this.f33364c.add(c10705b);
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
    public boolean m4045a() {
        return this.f33362a != null;
    }

    /* renamed from: a */
    public boolean m4044a(C10707c c10707c) {
        if (c10707c == null) {
            return false;
        }
        boolean m4045a = m4045a();
        boolean m4045a2 = c10707c.m4045a();
        if ((m4045a || m4045a2) && (!m4045a || !m4045a2 || !this.f33362a.equals(c10707c.f33362a))) {
            return false;
        }
        boolean m4042b = m4042b();
        boolean m4042b2 = c10707c.m4042b();
        if ((m4042b || m4042b2) && (!m4042b || !m4042b2 || !this.f33363b.equals(c10707c.f33363b))) {
            return false;
        }
        boolean m4040c = m4040c();
        boolean m4040c2 = c10707c.m4040c();
        return (!m4040c && !m4040c2) || (m4040c && m4040c2 && this.f33364c.equals(c10707c.f33364c));
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(C10707c c10707c) {
        int m1273a;
        int m1277a;
        int m1277a2;
        if (!getClass().equals(c10707c.getClass())) {
            return getClass().getName().compareTo(c10707c.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m4045a()).compareTo(Boolean.valueOf(c10707c.m4045a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m4045a() && (m1277a2 = C11369b.m1277a(this.f33362a, c10707c.f33362a)) != 0) {
            return m1277a2;
        }
        int compareTo2 = Boolean.valueOf(m4042b()).compareTo(Boolean.valueOf(c10707c.m4042b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m4042b() && (m1277a = C11369b.m1277a(this.f33363b, c10707c.f33363b)) != 0) {
            return m1277a;
        }
        int compareTo3 = Boolean.valueOf(m4040c()).compareTo(Boolean.valueOf(c10707c.m4040c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (m4040c() && (m1273a = C11369b.m1273a(this.f33364c, c10707c.f33364c)) != 0) {
            return m1273a;
        }
        return 0;
    }

    @Override // org.p286a.p321b.AbstractC11361a
    /* renamed from: b */
    public void mo1285b(AbstractC11376e abstractC11376e) {
        m4039d();
        abstractC11376e.mo1250a(f33358e);
        if (this.f33362a != null) {
            abstractC11376e.mo1254a(f33359f);
            abstractC11376e.mo1256a(this.f33362a);
            abstractC11376e.mo1247b();
        }
        if (this.f33363b != null && m4042b()) {
            abstractC11376e.mo1254a(f33360g);
            abstractC11376e.mo1256a(this.f33363b);
            abstractC11376e.mo1247b();
        }
        if (this.f33364c != null) {
            abstractC11376e.mo1254a(f33361h);
            abstractC11376e.mo1253a(new C11374c((byte) 12, this.f33364c.size()));
            for (C10705b c10705b : this.f33364c) {
                c10705b.mo1285b(abstractC11376e);
            }
            abstractC11376e.mo1244e();
            abstractC11376e.mo1247b();
        }
        abstractC11376e.mo1246c();
        abstractC11376e.mo1261a();
    }

    /* renamed from: b */
    public boolean m4042b() {
        return this.f33363b != null;
    }

    /* renamed from: c */
    public boolean m4040c() {
        return this.f33364c != null;
    }

    /* renamed from: d */
    public void m4039d() {
        if (this.f33362a == null) {
            throw new C11377f("Required field 'uuid' was not present! Struct: " + toString());
        }
        if (this.f33364c != null) {
            return;
        }
        throw new C11377f("Required field 'events' was not present! Struct: " + toString());
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C10707c)) {
            return m4044a((C10707c) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StatsEvents(");
        sb.append("uuid:");
        if (this.f33362a == null) {
            sb.append("null");
        } else {
            sb.append(this.f33362a);
        }
        if (m4042b()) {
            sb.append(", ");
            sb.append("operator:");
            if (this.f33363b == null) {
                sb.append("null");
            } else {
                sb.append(this.f33363b);
            }
        }
        sb.append(", ");
        sb.append("events:");
        if (this.f33364c == null) {
            sb.append("null");
        } else {
            sb.append(this.f33364c);
        }
        sb.append(")");
        return sb.toString();
    }
}
