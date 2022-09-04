package com.xiaomi.xmpush.thrift;

import com.p255mi.live.openlivesdk.C10022a;
import com.xiaomi.market.sdk.C10445j;
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
/* renamed from: com.xiaomi.xmpush.thrift.z */
/* loaded from: classes2.dex */
public class C10841z implements Serializable, Cloneable, AbstractC11361a<C10841z, EnumC10842a> {

    /* renamed from: i */
    public static final Map<EnumC10842a, C11363b> f34693i;

    /* renamed from: j */
    private static final C11381j f34694j = new C11381j("XmPushActionCommand");

    /* renamed from: k */
    private static final C11373b f34695k = new C11373b(C10022a.f30894c, (byte) 11, 1);

    /* renamed from: l */
    private static final C11373b f34696l = new C11373b("target", (byte) 12, 2);

    /* renamed from: m */
    private static final C11373b f34697m = new C11373b("id", (byte) 11, 3);

    /* renamed from: n */
    private static final C11373b f34698n = new C11373b("appId", (byte) 11, 4);

    /* renamed from: o */
    private static final C11373b f34699o = new C11373b("cmdName", (byte) 11, 5);

    /* renamed from: p */
    private static final C11373b f34700p = new C11373b("cmdArgs", (byte) 15, 6);

    /* renamed from: q */
    private static final C11373b f34701q = new C11373b(C10445j.f32447W, (byte) 11, 7);

    /* renamed from: r */
    private static final C11373b f34702r = new C11373b("category", (byte) 11, 9);

    /* renamed from: a */
    public String f34703a;

    /* renamed from: b */
    public C10831u f34704b;

    /* renamed from: c */
    public String f34705c;

    /* renamed from: d */
    public String f34706d;

    /* renamed from: e */
    public String f34707e;

    /* renamed from: f */
    public List<String> f34708f;

    /* renamed from: g */
    public String f34709g;

    /* renamed from: h */
    public String f34710h;

    /* renamed from: com.xiaomi.xmpush.thrift.z$a */
    /* loaded from: classes2.dex */
    public enum EnumC10842a {
        DEBUG(1, C10022a.f30894c),
        TARGET(2, "target"),
        ID(3, "id"),
        APP_ID(4, "appId"),
        CMD_NAME(5, "cmdName"),
        CMD_ARGS(6, "cmdArgs"),
        PACKAGE_NAME(7, C10445j.f32447W),
        CATEGORY(9, "category");
        

        /* renamed from: i */
        private static final Map<String, EnumC10842a> f34719i = new HashMap();

        /* renamed from: j */
        private final short f34721j;

        /* renamed from: k */
        private final String f34722k;

        static {
            Iterator it2 = EnumSet.allOf(EnumC10842a.class).iterator();
            while (it2.hasNext()) {
                EnumC10842a enumC10842a = (EnumC10842a) it2.next();
                f34719i.put(enumC10842a.m3153a(), enumC10842a);
            }
        }

        EnumC10842a(short s, String str) {
            this.f34721j = s;
            this.f34722k = str;
        }

        /* renamed from: a */
        public String m3153a() {
            return this.f34722k;
        }
    }

    static {
        EnumMap enumMap = new EnumMap(EnumC10842a.class);
        enumMap.put((EnumMap) EnumC10842a.DEBUG, (EnumC10842a) new C11363b(C10022a.f30894c, (byte) 2, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10842a.TARGET, (EnumC10842a) new C11363b("target", (byte) 2, new C11368g((byte) 12, C10831u.class)));
        enumMap.put((EnumMap) EnumC10842a.ID, (EnumC10842a) new C11363b("id", (byte) 1, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10842a.APP_ID, (EnumC10842a) new C11363b("appId", (byte) 1, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10842a.CMD_NAME, (EnumC10842a) new C11363b("cmdName", (byte) 1, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10842a.CMD_ARGS, (EnumC10842a) new C11363b("cmdArgs", (byte) 2, new C11365d((byte) 15, new C11364c((byte) 11))));
        enumMap.put((EnumMap) EnumC10842a.PACKAGE_NAME, (EnumC10842a) new C11363b(C10445j.f32447W, (byte) 2, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10842a.CATEGORY, (EnumC10842a) new C11363b("category", (byte) 2, new C11364c((byte) 11)));
        f34693i = Collections.unmodifiableMap(enumMap);
        C11363b.m1284a(C10841z.class, f34693i);
    }

    /* renamed from: a */
    public C10841z m3168a(String str) {
        this.f34705c = str;
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
                m3154i();
                return;
            }
            switch (mo1240i.f36480c) {
                case 1:
                    if (mo1240i.f36479b == 11) {
                        this.f34703a = abstractC11376e.mo1223w();
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 2:
                    if (mo1240i.f36479b == 12) {
                        this.f34704b = new C10831u();
                        this.f34704b.mo1286a(abstractC11376e);
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 3:
                    if (mo1240i.f36479b == 11) {
                        this.f34705c = abstractC11376e.mo1223w();
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 4:
                    if (mo1240i.f36479b == 11) {
                        this.f34706d = abstractC11376e.mo1223w();
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 5:
                    if (mo1240i.f36479b == 11) {
                        this.f34707e = abstractC11376e.mo1223w();
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 6:
                    if (mo1240i.f36479b == 15) {
                        C11374c mo1225m = abstractC11376e.mo1225m();
                        this.f34708f = new ArrayList(mo1225m.f36482b);
                        for (int i = 0; i < mo1225m.f36482b; i++) {
                            this.f34708f.add(abstractC11376e.mo1223w());
                        }
                        abstractC11376e.mo1237n();
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 7:
                    if (mo1240i.f36479b == 11) {
                        this.f34709g = abstractC11376e.mo1223w();
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 8:
                default:
                    C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                    break;
                case 9:
                    if (mo1240i.f36479b == 11) {
                        this.f34710h = abstractC11376e.mo1223w();
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
            }
            abstractC11376e.mo1239j();
        }
    }

    /* renamed from: a */
    public boolean m3170a() {
        return this.f34703a != null;
    }

    /* renamed from: a */
    public boolean m3169a(C10841z c10841z) {
        if (c10841z == null) {
            return false;
        }
        boolean m3170a = m3170a();
        boolean m3170a2 = c10841z.m3170a();
        if ((m3170a || m3170a2) && (!m3170a || !m3170a2 || !this.f34703a.equals(c10841z.f34703a))) {
            return false;
        }
        boolean m3167b = m3167b();
        boolean m3167b2 = c10841z.m3167b();
        if ((m3167b || m3167b2) && (!m3167b || !m3167b2 || !this.f34704b.m3254a(c10841z.f34704b))) {
            return false;
        }
        boolean m3164c = m3164c();
        boolean m3164c2 = c10841z.m3164c();
        if ((m3164c || m3164c2) && (!m3164c || !m3164c2 || !this.f34705c.equals(c10841z.f34705c))) {
            return false;
        }
        boolean m3162d = m3162d();
        boolean m3162d2 = c10841z.m3162d();
        if ((m3162d || m3162d2) && (!m3162d || !m3162d2 || !this.f34706d.equals(c10841z.f34706d))) {
            return false;
        }
        boolean m3160e = m3160e();
        boolean m3160e2 = c10841z.m3160e();
        if ((m3160e || m3160e2) && (!m3160e || !m3160e2 || !this.f34707e.equals(c10841z.f34707e))) {
            return false;
        }
        boolean m3158f = m3158f();
        boolean m3158f2 = c10841z.m3158f();
        if ((m3158f || m3158f2) && (!m3158f || !m3158f2 || !this.f34708f.equals(c10841z.f34708f))) {
            return false;
        }
        boolean m3156g = m3156g();
        boolean m3156g2 = c10841z.m3156g();
        if ((m3156g || m3156g2) && (!m3156g || !m3156g2 || !this.f34709g.equals(c10841z.f34709g))) {
            return false;
        }
        boolean m3155h = m3155h();
        boolean m3155h2 = c10841z.m3155h();
        return (!m3155h && !m3155h2) || (m3155h && m3155h2 && this.f34710h.equals(c10841z.f34710h));
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(C10841z c10841z) {
        int m1277a;
        int m1277a2;
        int m1273a;
        int m1277a3;
        int m1277a4;
        int m1277a5;
        int m1278a;
        int m1277a6;
        if (!getClass().equals(c10841z.getClass())) {
            return getClass().getName().compareTo(c10841z.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m3170a()).compareTo(Boolean.valueOf(c10841z.m3170a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m3170a() && (m1277a6 = C11369b.m1277a(this.f34703a, c10841z.f34703a)) != 0) {
            return m1277a6;
        }
        int compareTo2 = Boolean.valueOf(m3167b()).compareTo(Boolean.valueOf(c10841z.m3167b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m3167b() && (m1278a = C11369b.m1278a(this.f34704b, c10841z.f34704b)) != 0) {
            return m1278a;
        }
        int compareTo3 = Boolean.valueOf(m3164c()).compareTo(Boolean.valueOf(c10841z.m3164c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (m3164c() && (m1277a5 = C11369b.m1277a(this.f34705c, c10841z.f34705c)) != 0) {
            return m1277a5;
        }
        int compareTo4 = Boolean.valueOf(m3162d()).compareTo(Boolean.valueOf(c10841z.m3162d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (m3162d() && (m1277a4 = C11369b.m1277a(this.f34706d, c10841z.f34706d)) != 0) {
            return m1277a4;
        }
        int compareTo5 = Boolean.valueOf(m3160e()).compareTo(Boolean.valueOf(c10841z.m3160e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (m3160e() && (m1277a3 = C11369b.m1277a(this.f34707e, c10841z.f34707e)) != 0) {
            return m1277a3;
        }
        int compareTo6 = Boolean.valueOf(m3158f()).compareTo(Boolean.valueOf(c10841z.m3158f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (m3158f() && (m1273a = C11369b.m1273a(this.f34708f, c10841z.f34708f)) != 0) {
            return m1273a;
        }
        int compareTo7 = Boolean.valueOf(m3156g()).compareTo(Boolean.valueOf(c10841z.m3156g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (m3156g() && (m1277a2 = C11369b.m1277a(this.f34709g, c10841z.f34709g)) != 0) {
            return m1277a2;
        }
        int compareTo8 = Boolean.valueOf(m3155h()).compareTo(Boolean.valueOf(c10841z.m3155h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (m3155h() && (m1277a = C11369b.m1277a(this.f34710h, c10841z.f34710h)) != 0) {
            return m1277a;
        }
        return 0;
    }

    /* renamed from: b */
    public C10841z m3165b(String str) {
        this.f34706d = str;
        return this;
    }

    @Override // org.p286a.p321b.AbstractC11361a
    /* renamed from: b */
    public void mo1285b(AbstractC11376e abstractC11376e) {
        m3154i();
        abstractC11376e.mo1250a(f34694j);
        if (this.f34703a != null && m3170a()) {
            abstractC11376e.mo1254a(f34695k);
            abstractC11376e.mo1256a(this.f34703a);
            abstractC11376e.mo1247b();
        }
        if (this.f34704b != null && m3167b()) {
            abstractC11376e.mo1254a(f34696l);
            this.f34704b.mo1285b(abstractC11376e);
            abstractC11376e.mo1247b();
        }
        if (this.f34705c != null) {
            abstractC11376e.mo1254a(f34697m);
            abstractC11376e.mo1256a(this.f34705c);
            abstractC11376e.mo1247b();
        }
        if (this.f34706d != null) {
            abstractC11376e.mo1254a(f34698n);
            abstractC11376e.mo1256a(this.f34706d);
            abstractC11376e.mo1247b();
        }
        if (this.f34707e != null) {
            abstractC11376e.mo1254a(f34699o);
            abstractC11376e.mo1256a(this.f34707e);
            abstractC11376e.mo1247b();
        }
        if (this.f34708f != null && m3158f()) {
            abstractC11376e.mo1254a(f34700p);
            abstractC11376e.mo1253a(new C11374c((byte) 11, this.f34708f.size()));
            for (String str : this.f34708f) {
                abstractC11376e.mo1256a(str);
            }
            abstractC11376e.mo1244e();
            abstractC11376e.mo1247b();
        }
        if (this.f34709g != null && m3156g()) {
            abstractC11376e.mo1254a(f34701q);
            abstractC11376e.mo1256a(this.f34709g);
            abstractC11376e.mo1247b();
        }
        if (this.f34710h != null && m3155h()) {
            abstractC11376e.mo1254a(f34702r);
            abstractC11376e.mo1256a(this.f34710h);
            abstractC11376e.mo1247b();
        }
        abstractC11376e.mo1246c();
        abstractC11376e.mo1261a();
    }

    /* renamed from: b */
    public boolean m3167b() {
        return this.f34704b != null;
    }

    /* renamed from: c */
    public C10841z m3163c(String str) {
        this.f34707e = str;
        return this;
    }

    /* renamed from: c */
    public boolean m3164c() {
        return this.f34705c != null;
    }

    /* renamed from: d */
    public void m3161d(String str) {
        if (this.f34708f == null) {
            this.f34708f = new ArrayList();
        }
        this.f34708f.add(str);
    }

    /* renamed from: d */
    public boolean m3162d() {
        return this.f34706d != null;
    }

    /* renamed from: e */
    public C10841z m3159e(String str) {
        this.f34709g = str;
        return this;
    }

    /* renamed from: e */
    public boolean m3160e() {
        return this.f34707e != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C10841z)) {
            return m3169a((C10841z) obj);
        }
        return false;
    }

    /* renamed from: f */
    public C10841z m3157f(String str) {
        this.f34710h = str;
        return this;
    }

    /* renamed from: f */
    public boolean m3158f() {
        return this.f34708f != null;
    }

    /* renamed from: g */
    public boolean m3156g() {
        return this.f34709g != null;
    }

    /* renamed from: h */
    public boolean m3155h() {
        return this.f34710h != null;
    }

    public int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public void m3154i() {
        if (this.f34705c == null) {
            throw new C11377f("Required field 'id' was not present! Struct: " + toString());
        }
        if (this.f34706d == null) {
            throw new C11377f("Required field 'appId' was not present! Struct: " + toString());
        }
        if (this.f34707e != null) {
            return;
        }
        throw new C11377f("Required field 'cmdName' was not present! Struct: " + toString());
    }

    public String toString() {
        boolean z = false;
        StringBuilder sb = new StringBuilder("XmPushActionCommand(");
        boolean z2 = true;
        if (m3170a()) {
            sb.append("debug:");
            if (this.f34703a == null) {
                sb.append("null");
            } else {
                sb.append(this.f34703a);
            }
            z2 = false;
        }
        if (m3167b()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("target:");
            if (this.f34704b == null) {
                sb.append("null");
            } else {
                sb.append(this.f34704b);
            }
        } else {
            z = z2;
        }
        if (!z) {
            sb.append(", ");
        }
        sb.append("id:");
        if (this.f34705c == null) {
            sb.append("null");
        } else {
            sb.append(this.f34705c);
        }
        sb.append(", ");
        sb.append("appId:");
        if (this.f34706d == null) {
            sb.append("null");
        } else {
            sb.append(this.f34706d);
        }
        sb.append(", ");
        sb.append("cmdName:");
        if (this.f34707e == null) {
            sb.append("null");
        } else {
            sb.append(this.f34707e);
        }
        if (m3158f()) {
            sb.append(", ");
            sb.append("cmdArgs:");
            if (this.f34708f == null) {
                sb.append("null");
            } else {
                sb.append(this.f34708f);
            }
        }
        if (m3156g()) {
            sb.append(", ");
            sb.append("packageName:");
            if (this.f34709g == null) {
                sb.append("null");
            } else {
                sb.append(this.f34709g);
            }
        }
        if (m3155h()) {
            sb.append(", ");
            sb.append("category:");
            if (this.f34710h == null) {
                sb.append("null");
            } else {
                sb.append(this.f34710h);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
