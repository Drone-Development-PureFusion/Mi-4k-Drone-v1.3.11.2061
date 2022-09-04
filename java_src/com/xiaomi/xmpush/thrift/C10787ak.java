package com.xiaomi.xmpush.thrift;

import com.p255mi.live.openlivesdk.C10022a;
import com.xiaomi.market.sdk.C10445j;
import java.io.Serializable;
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
/* renamed from: com.xiaomi.xmpush.thrift.ak */
/* loaded from: classes2.dex */
public class C10787ak implements Serializable, Cloneable, AbstractC11361a<C10787ak, EnumC10788a> {

    /* renamed from: h */
    public static final Map<EnumC10788a, C11363b> f33963h;

    /* renamed from: i */
    private static final C11381j f33964i = new C11381j("XmPushActionSubscription");

    /* renamed from: j */
    private static final C11373b f33965j = new C11373b(C10022a.f30894c, (byte) 11, 1);

    /* renamed from: k */
    private static final C11373b f33966k = new C11373b("target", (byte) 12, 2);

    /* renamed from: l */
    private static final C11373b f33967l = new C11373b("id", (byte) 11, 3);

    /* renamed from: m */
    private static final C11373b f33968m = new C11373b("appId", (byte) 11, 4);

    /* renamed from: n */
    private static final C11373b f33969n = new C11373b("topic", (byte) 11, 5);

    /* renamed from: o */
    private static final C11373b f33970o = new C11373b(C10445j.f32447W, (byte) 11, 6);

    /* renamed from: p */
    private static final C11373b f33971p = new C11373b("category", (byte) 11, 7);

    /* renamed from: a */
    public String f33972a;

    /* renamed from: b */
    public C10831u f33973b;

    /* renamed from: c */
    public String f33974c;

    /* renamed from: d */
    public String f33975d;

    /* renamed from: e */
    public String f33976e;

    /* renamed from: f */
    public String f33977f;

    /* renamed from: g */
    public String f33978g;

    /* renamed from: com.xiaomi.xmpush.thrift.ak$a */
    /* loaded from: classes2.dex */
    public enum EnumC10788a {
        DEBUG(1, C10022a.f30894c),
        TARGET(2, "target"),
        ID(3, "id"),
        APP_ID(4, "appId"),
        TOPIC(5, "topic"),
        PACKAGE_NAME(6, C10445j.f32447W),
        CATEGORY(7, "category");
        

        /* renamed from: h */
        private static final Map<String, EnumC10788a> f33986h = new HashMap();

        /* renamed from: i */
        private final short f33988i;

        /* renamed from: j */
        private final String f33989j;

        static {
            Iterator it2 = EnumSet.allOf(EnumC10788a.class).iterator();
            while (it2.hasNext()) {
                EnumC10788a enumC10788a = (EnumC10788a) it2.next();
                f33986h.put(enumC10788a.m3555a(), enumC10788a);
            }
        }

        EnumC10788a(short s, String str) {
            this.f33988i = s;
            this.f33989j = str;
        }

        /* renamed from: a */
        public String m3555a() {
            return this.f33989j;
        }
    }

    static {
        EnumMap enumMap = new EnumMap(EnumC10788a.class);
        enumMap.put((EnumMap) EnumC10788a.DEBUG, (EnumC10788a) new C11363b(C10022a.f30894c, (byte) 2, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10788a.TARGET, (EnumC10788a) new C11363b("target", (byte) 2, new C11368g((byte) 12, C10831u.class)));
        enumMap.put((EnumMap) EnumC10788a.ID, (EnumC10788a) new C11363b("id", (byte) 1, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10788a.APP_ID, (EnumC10788a) new C11363b("appId", (byte) 1, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10788a.TOPIC, (EnumC10788a) new C11363b("topic", (byte) 1, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10788a.PACKAGE_NAME, (EnumC10788a) new C11363b(C10445j.f32447W, (byte) 2, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10788a.CATEGORY, (EnumC10788a) new C11363b("category", (byte) 2, new C11364c((byte) 11)));
        f33963h = Collections.unmodifiableMap(enumMap);
        C11363b.m1284a(C10787ak.class, f33963h);
    }

    /* renamed from: a */
    public C10787ak m3568a(String str) {
        this.f33974c = str;
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
                m3556h();
                return;
            }
            switch (mo1240i.f36480c) {
                case 1:
                    if (mo1240i.f36479b != 11) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f33972a = abstractC11376e.mo1223w();
                        break;
                    }
                case 2:
                    if (mo1240i.f36479b != 12) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f33973b = new C10831u();
                        this.f33973b.mo1286a(abstractC11376e);
                        break;
                    }
                case 3:
                    if (mo1240i.f36479b != 11) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f33974c = abstractC11376e.mo1223w();
                        break;
                    }
                case 4:
                    if (mo1240i.f36479b != 11) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f33975d = abstractC11376e.mo1223w();
                        break;
                    }
                case 5:
                    if (mo1240i.f36479b != 11) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f33976e = abstractC11376e.mo1223w();
                        break;
                    }
                case 6:
                    if (mo1240i.f36479b != 11) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f33977f = abstractC11376e.mo1223w();
                        break;
                    }
                case 7:
                    if (mo1240i.f36479b != 11) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f33978g = abstractC11376e.mo1223w();
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
    public boolean m3570a() {
        return this.f33972a != null;
    }

    /* renamed from: a */
    public boolean m3569a(C10787ak c10787ak) {
        if (c10787ak == null) {
            return false;
        }
        boolean m3570a = m3570a();
        boolean m3570a2 = c10787ak.m3570a();
        if ((m3570a || m3570a2) && (!m3570a || !m3570a2 || !this.f33972a.equals(c10787ak.f33972a))) {
            return false;
        }
        boolean m3567b = m3567b();
        boolean m3567b2 = c10787ak.m3567b();
        if ((m3567b || m3567b2) && (!m3567b || !m3567b2 || !this.f33973b.m3254a(c10787ak.f33973b))) {
            return false;
        }
        boolean m3564c = m3564c();
        boolean m3564c2 = c10787ak.m3564c();
        if ((m3564c || m3564c2) && (!m3564c || !m3564c2 || !this.f33974c.equals(c10787ak.f33974c))) {
            return false;
        }
        boolean m3562d = m3562d();
        boolean m3562d2 = c10787ak.m3562d();
        if ((m3562d || m3562d2) && (!m3562d || !m3562d2 || !this.f33975d.equals(c10787ak.f33975d))) {
            return false;
        }
        boolean m3560e = m3560e();
        boolean m3560e2 = c10787ak.m3560e();
        if ((m3560e || m3560e2) && (!m3560e || !m3560e2 || !this.f33976e.equals(c10787ak.f33976e))) {
            return false;
        }
        boolean m3558f = m3558f();
        boolean m3558f2 = c10787ak.m3558f();
        if ((m3558f || m3558f2) && (!m3558f || !m3558f2 || !this.f33977f.equals(c10787ak.f33977f))) {
            return false;
        }
        boolean m3557g = m3557g();
        boolean m3557g2 = c10787ak.m3557g();
        return (!m3557g && !m3557g2) || (m3557g && m3557g2 && this.f33978g.equals(c10787ak.f33978g));
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(C10787ak c10787ak) {
        int m1277a;
        int m1277a2;
        int m1277a3;
        int m1277a4;
        int m1277a5;
        int m1278a;
        int m1277a6;
        if (!getClass().equals(c10787ak.getClass())) {
            return getClass().getName().compareTo(c10787ak.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m3570a()).compareTo(Boolean.valueOf(c10787ak.m3570a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m3570a() && (m1277a6 = C11369b.m1277a(this.f33972a, c10787ak.f33972a)) != 0) {
            return m1277a6;
        }
        int compareTo2 = Boolean.valueOf(m3567b()).compareTo(Boolean.valueOf(c10787ak.m3567b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m3567b() && (m1278a = C11369b.m1278a(this.f33973b, c10787ak.f33973b)) != 0) {
            return m1278a;
        }
        int compareTo3 = Boolean.valueOf(m3564c()).compareTo(Boolean.valueOf(c10787ak.m3564c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (m3564c() && (m1277a5 = C11369b.m1277a(this.f33974c, c10787ak.f33974c)) != 0) {
            return m1277a5;
        }
        int compareTo4 = Boolean.valueOf(m3562d()).compareTo(Boolean.valueOf(c10787ak.m3562d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (m3562d() && (m1277a4 = C11369b.m1277a(this.f33975d, c10787ak.f33975d)) != 0) {
            return m1277a4;
        }
        int compareTo5 = Boolean.valueOf(m3560e()).compareTo(Boolean.valueOf(c10787ak.m3560e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (m3560e() && (m1277a3 = C11369b.m1277a(this.f33976e, c10787ak.f33976e)) != 0) {
            return m1277a3;
        }
        int compareTo6 = Boolean.valueOf(m3558f()).compareTo(Boolean.valueOf(c10787ak.m3558f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (m3558f() && (m1277a2 = C11369b.m1277a(this.f33977f, c10787ak.f33977f)) != 0) {
            return m1277a2;
        }
        int compareTo7 = Boolean.valueOf(m3557g()).compareTo(Boolean.valueOf(c10787ak.m3557g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (m3557g() && (m1277a = C11369b.m1277a(this.f33978g, c10787ak.f33978g)) != 0) {
            return m1277a;
        }
        return 0;
    }

    /* renamed from: b */
    public C10787ak m3565b(String str) {
        this.f33975d = str;
        return this;
    }

    @Override // org.p286a.p321b.AbstractC11361a
    /* renamed from: b */
    public void mo1285b(AbstractC11376e abstractC11376e) {
        m3556h();
        abstractC11376e.mo1250a(f33964i);
        if (this.f33972a != null && m3570a()) {
            abstractC11376e.mo1254a(f33965j);
            abstractC11376e.mo1256a(this.f33972a);
            abstractC11376e.mo1247b();
        }
        if (this.f33973b != null && m3567b()) {
            abstractC11376e.mo1254a(f33966k);
            this.f33973b.mo1285b(abstractC11376e);
            abstractC11376e.mo1247b();
        }
        if (this.f33974c != null) {
            abstractC11376e.mo1254a(f33967l);
            abstractC11376e.mo1256a(this.f33974c);
            abstractC11376e.mo1247b();
        }
        if (this.f33975d != null) {
            abstractC11376e.mo1254a(f33968m);
            abstractC11376e.mo1256a(this.f33975d);
            abstractC11376e.mo1247b();
        }
        if (this.f33976e != null) {
            abstractC11376e.mo1254a(f33969n);
            abstractC11376e.mo1256a(this.f33976e);
            abstractC11376e.mo1247b();
        }
        if (this.f33977f != null && m3558f()) {
            abstractC11376e.mo1254a(f33970o);
            abstractC11376e.mo1256a(this.f33977f);
            abstractC11376e.mo1247b();
        }
        if (this.f33978g != null && m3557g()) {
            abstractC11376e.mo1254a(f33971p);
            abstractC11376e.mo1256a(this.f33978g);
            abstractC11376e.mo1247b();
        }
        abstractC11376e.mo1246c();
        abstractC11376e.mo1261a();
    }

    /* renamed from: b */
    public boolean m3567b() {
        return this.f33973b != null;
    }

    /* renamed from: c */
    public C10787ak m3563c(String str) {
        this.f33976e = str;
        return this;
    }

    /* renamed from: c */
    public boolean m3564c() {
        return this.f33974c != null;
    }

    /* renamed from: d */
    public C10787ak m3561d(String str) {
        this.f33977f = str;
        return this;
    }

    /* renamed from: d */
    public boolean m3562d() {
        return this.f33975d != null;
    }

    /* renamed from: e */
    public C10787ak m3559e(String str) {
        this.f33978g = str;
        return this;
    }

    /* renamed from: e */
    public boolean m3560e() {
        return this.f33976e != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C10787ak)) {
            return m3569a((C10787ak) obj);
        }
        return false;
    }

    /* renamed from: f */
    public boolean m3558f() {
        return this.f33977f != null;
    }

    /* renamed from: g */
    public boolean m3557g() {
        return this.f33978g != null;
    }

    /* renamed from: h */
    public void m3556h() {
        if (this.f33974c == null) {
            throw new C11377f("Required field 'id' was not present! Struct: " + toString());
        }
        if (this.f33975d == null) {
            throw new C11377f("Required field 'appId' was not present! Struct: " + toString());
        }
        if (this.f33976e != null) {
            return;
        }
        throw new C11377f("Required field 'topic' was not present! Struct: " + toString());
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        boolean z = false;
        StringBuilder sb = new StringBuilder("XmPushActionSubscription(");
        boolean z2 = true;
        if (m3570a()) {
            sb.append("debug:");
            if (this.f33972a == null) {
                sb.append("null");
            } else {
                sb.append(this.f33972a);
            }
            z2 = false;
        }
        if (m3567b()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("target:");
            if (this.f33973b == null) {
                sb.append("null");
            } else {
                sb.append(this.f33973b);
            }
        } else {
            z = z2;
        }
        if (!z) {
            sb.append(", ");
        }
        sb.append("id:");
        if (this.f33974c == null) {
            sb.append("null");
        } else {
            sb.append(this.f33974c);
        }
        sb.append(", ");
        sb.append("appId:");
        if (this.f33975d == null) {
            sb.append("null");
        } else {
            sb.append(this.f33975d);
        }
        sb.append(", ");
        sb.append("topic:");
        if (this.f33976e == null) {
            sb.append("null");
        } else {
            sb.append(this.f33976e);
        }
        if (m3558f()) {
            sb.append(", ");
            sb.append("packageName:");
            if (this.f33977f == null) {
                sb.append("null");
            } else {
                sb.append(this.f33977f);
            }
        }
        if (m3557g()) {
            sb.append(", ");
            sb.append("category:");
            if (this.f33978g == null) {
                sb.append("null");
            } else {
                sb.append(this.f33978g);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
