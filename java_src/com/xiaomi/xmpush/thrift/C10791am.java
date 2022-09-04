package com.xiaomi.xmpush.thrift;

import com.p255mi.live.openlivesdk.C10022a;
import com.xiaomi.market.sdk.C10445j;
import com.xiaomi.mipush.sdk.Constants;
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
/* renamed from: com.xiaomi.xmpush.thrift.am */
/* loaded from: classes2.dex */
public class C10791am implements Serializable, Cloneable, AbstractC11361a<C10791am, EnumC10792a> {

    /* renamed from: k */
    public static final Map<EnumC10792a, C11363b> f34027k;

    /* renamed from: l */
    private static final C11381j f34028l = new C11381j("XmPushActionUnRegistration");

    /* renamed from: m */
    private static final C11373b f34029m = new C11373b(C10022a.f30894c, (byte) 11, 1);

    /* renamed from: n */
    private static final C11373b f34030n = new C11373b("target", (byte) 12, 2);

    /* renamed from: o */
    private static final C11373b f34031o = new C11373b("id", (byte) 11, 3);

    /* renamed from: p */
    private static final C11373b f34032p = new C11373b("appId", (byte) 11, 4);

    /* renamed from: q */
    private static final C11373b f34033q = new C11373b("regId", (byte) 11, 5);

    /* renamed from: r */
    private static final C11373b f34034r = new C11373b("appVersion", (byte) 11, 6);

    /* renamed from: s */
    private static final C11373b f34035s = new C11373b(C10445j.f32447W, (byte) 11, 7);

    /* renamed from: t */
    private static final C11373b f34036t = new C11373b(Constants.EXTRA_KEY_TOKEN, (byte) 11, 8);

    /* renamed from: u */
    private static final C11373b f34037u = new C11373b(C10445j.f32473as, (byte) 11, 9);

    /* renamed from: v */
    private static final C11373b f34038v = new C11373b("aliasName", (byte) 11, 10);

    /* renamed from: a */
    public String f34039a;

    /* renamed from: b */
    public C10831u f34040b;

    /* renamed from: c */
    public String f34041c;

    /* renamed from: d */
    public String f34042d;

    /* renamed from: e */
    public String f34043e;

    /* renamed from: f */
    public String f34044f;

    /* renamed from: g */
    public String f34045g;

    /* renamed from: h */
    public String f34046h;

    /* renamed from: i */
    public String f34047i;

    /* renamed from: j */
    public String f34048j;

    /* renamed from: com.xiaomi.xmpush.thrift.am$a */
    /* loaded from: classes2.dex */
    public enum EnumC10792a {
        DEBUG(1, C10022a.f30894c),
        TARGET(2, "target"),
        ID(3, "id"),
        APP_ID(4, "appId"),
        REG_ID(5, "regId"),
        APP_VERSION(6, "appVersion"),
        PACKAGE_NAME(7, C10445j.f32447W),
        TOKEN(8, Constants.EXTRA_KEY_TOKEN),
        DEVICE_ID(9, C10445j.f32473as),
        ALIAS_NAME(10, "aliasName");
        

        /* renamed from: k */
        private static final Map<String, EnumC10792a> f34059k = new HashMap();

        /* renamed from: l */
        private final short f34061l;

        /* renamed from: m */
        private final String f34062m;

        static {
            Iterator it2 = EnumSet.allOf(EnumC10792a.class).iterator();
            while (it2.hasNext()) {
                EnumC10792a enumC10792a = (EnumC10792a) it2.next();
                f34059k.put(enumC10792a.m3519a(), enumC10792a);
            }
        }

        EnumC10792a(short s, String str) {
            this.f34061l = s;
            this.f34062m = str;
        }

        /* renamed from: a */
        public String m3519a() {
            return this.f34062m;
        }
    }

    static {
        EnumMap enumMap = new EnumMap(EnumC10792a.class);
        enumMap.put((EnumMap) EnumC10792a.DEBUG, (EnumC10792a) new C11363b(C10022a.f30894c, (byte) 2, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10792a.TARGET, (EnumC10792a) new C11363b("target", (byte) 2, new C11368g((byte) 12, C10831u.class)));
        enumMap.put((EnumMap) EnumC10792a.ID, (EnumC10792a) new C11363b("id", (byte) 1, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10792a.APP_ID, (EnumC10792a) new C11363b("appId", (byte) 1, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10792a.REG_ID, (EnumC10792a) new C11363b("regId", (byte) 2, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10792a.APP_VERSION, (EnumC10792a) new C11363b("appVersion", (byte) 2, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10792a.PACKAGE_NAME, (EnumC10792a) new C11363b(C10445j.f32447W, (byte) 2, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10792a.TOKEN, (EnumC10792a) new C11363b(Constants.EXTRA_KEY_TOKEN, (byte) 2, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10792a.DEVICE_ID, (EnumC10792a) new C11363b(C10445j.f32473as, (byte) 2, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10792a.ALIAS_NAME, (EnumC10792a) new C11363b("aliasName", (byte) 2, new C11364c((byte) 11)));
        f34027k = Collections.unmodifiableMap(enumMap);
        C11363b.m1284a(C10791am.class, f34027k);
    }

    /* renamed from: a */
    public C10791am m3535a(String str) {
        this.f34041c = str;
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
                m3520k();
                return;
            }
            switch (mo1240i.f36480c) {
                case 1:
                    if (mo1240i.f36479b != 11) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f34039a = abstractC11376e.mo1223w();
                        break;
                    }
                case 2:
                    if (mo1240i.f36479b != 12) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f34040b = new C10831u();
                        this.f34040b.mo1286a(abstractC11376e);
                        break;
                    }
                case 3:
                    if (mo1240i.f36479b != 11) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f34041c = abstractC11376e.mo1223w();
                        break;
                    }
                case 4:
                    if (mo1240i.f36479b != 11) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f34042d = abstractC11376e.mo1223w();
                        break;
                    }
                case 5:
                    if (mo1240i.f36479b != 11) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f34043e = abstractC11376e.mo1223w();
                        break;
                    }
                case 6:
                    if (mo1240i.f36479b != 11) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f34044f = abstractC11376e.mo1223w();
                        break;
                    }
                case 7:
                    if (mo1240i.f36479b != 11) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f34045g = abstractC11376e.mo1223w();
                        break;
                    }
                case 8:
                    if (mo1240i.f36479b != 11) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f34046h = abstractC11376e.mo1223w();
                        break;
                    }
                case 9:
                    if (mo1240i.f36479b != 11) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f34047i = abstractC11376e.mo1223w();
                        break;
                    }
                case 10:
                    if (mo1240i.f36479b != 11) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f34048j = abstractC11376e.mo1223w();
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
    public boolean m3537a() {
        return this.f34039a != null;
    }

    /* renamed from: a */
    public boolean m3536a(C10791am c10791am) {
        if (c10791am == null) {
            return false;
        }
        boolean m3537a = m3537a();
        boolean m3537a2 = c10791am.m3537a();
        if ((m3537a || m3537a2) && (!m3537a || !m3537a2 || !this.f34039a.equals(c10791am.f34039a))) {
            return false;
        }
        boolean m3534b = m3534b();
        boolean m3534b2 = c10791am.m3534b();
        if ((m3534b || m3534b2) && (!m3534b || !m3534b2 || !this.f34040b.m3254a(c10791am.f34040b))) {
            return false;
        }
        boolean m3531c = m3531c();
        boolean m3531c2 = c10791am.m3531c();
        if ((m3531c || m3531c2) && (!m3531c || !m3531c2 || !this.f34041c.equals(c10791am.f34041c))) {
            return false;
        }
        boolean m3529d = m3529d();
        boolean m3529d2 = c10791am.m3529d();
        if ((m3529d || m3529d2) && (!m3529d || !m3529d2 || !this.f34042d.equals(c10791am.f34042d))) {
            return false;
        }
        boolean m3527e = m3527e();
        boolean m3527e2 = c10791am.m3527e();
        if ((m3527e || m3527e2) && (!m3527e || !m3527e2 || !this.f34043e.equals(c10791am.f34043e))) {
            return false;
        }
        boolean m3525f = m3525f();
        boolean m3525f2 = c10791am.m3525f();
        if ((m3525f || m3525f2) && (!m3525f || !m3525f2 || !this.f34044f.equals(c10791am.f34044f))) {
            return false;
        }
        boolean m3524g = m3524g();
        boolean m3524g2 = c10791am.m3524g();
        if ((m3524g || m3524g2) && (!m3524g || !m3524g2 || !this.f34045g.equals(c10791am.f34045g))) {
            return false;
        }
        boolean m3523h = m3523h();
        boolean m3523h2 = c10791am.m3523h();
        if ((m3523h || m3523h2) && (!m3523h || !m3523h2 || !this.f34046h.equals(c10791am.f34046h))) {
            return false;
        }
        boolean m3522i = m3522i();
        boolean m3522i2 = c10791am.m3522i();
        if ((m3522i || m3522i2) && (!m3522i || !m3522i2 || !this.f34047i.equals(c10791am.f34047i))) {
            return false;
        }
        boolean m3521j = m3521j();
        boolean m3521j2 = c10791am.m3521j();
        return (!m3521j && !m3521j2) || (m3521j && m3521j2 && this.f34048j.equals(c10791am.f34048j));
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(C10791am c10791am) {
        int m1277a;
        int m1277a2;
        int m1277a3;
        int m1277a4;
        int m1277a5;
        int m1277a6;
        int m1277a7;
        int m1277a8;
        int m1278a;
        int m1277a9;
        if (!getClass().equals(c10791am.getClass())) {
            return getClass().getName().compareTo(c10791am.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m3537a()).compareTo(Boolean.valueOf(c10791am.m3537a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m3537a() && (m1277a9 = C11369b.m1277a(this.f34039a, c10791am.f34039a)) != 0) {
            return m1277a9;
        }
        int compareTo2 = Boolean.valueOf(m3534b()).compareTo(Boolean.valueOf(c10791am.m3534b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m3534b() && (m1278a = C11369b.m1278a(this.f34040b, c10791am.f34040b)) != 0) {
            return m1278a;
        }
        int compareTo3 = Boolean.valueOf(m3531c()).compareTo(Boolean.valueOf(c10791am.m3531c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (m3531c() && (m1277a8 = C11369b.m1277a(this.f34041c, c10791am.f34041c)) != 0) {
            return m1277a8;
        }
        int compareTo4 = Boolean.valueOf(m3529d()).compareTo(Boolean.valueOf(c10791am.m3529d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (m3529d() && (m1277a7 = C11369b.m1277a(this.f34042d, c10791am.f34042d)) != 0) {
            return m1277a7;
        }
        int compareTo5 = Boolean.valueOf(m3527e()).compareTo(Boolean.valueOf(c10791am.m3527e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (m3527e() && (m1277a6 = C11369b.m1277a(this.f34043e, c10791am.f34043e)) != 0) {
            return m1277a6;
        }
        int compareTo6 = Boolean.valueOf(m3525f()).compareTo(Boolean.valueOf(c10791am.m3525f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (m3525f() && (m1277a5 = C11369b.m1277a(this.f34044f, c10791am.f34044f)) != 0) {
            return m1277a5;
        }
        int compareTo7 = Boolean.valueOf(m3524g()).compareTo(Boolean.valueOf(c10791am.m3524g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (m3524g() && (m1277a4 = C11369b.m1277a(this.f34045g, c10791am.f34045g)) != 0) {
            return m1277a4;
        }
        int compareTo8 = Boolean.valueOf(m3523h()).compareTo(Boolean.valueOf(c10791am.m3523h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (m3523h() && (m1277a3 = C11369b.m1277a(this.f34046h, c10791am.f34046h)) != 0) {
            return m1277a3;
        }
        int compareTo9 = Boolean.valueOf(m3522i()).compareTo(Boolean.valueOf(c10791am.m3522i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (m3522i() && (m1277a2 = C11369b.m1277a(this.f34047i, c10791am.f34047i)) != 0) {
            return m1277a2;
        }
        int compareTo10 = Boolean.valueOf(m3521j()).compareTo(Boolean.valueOf(c10791am.m3521j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (m3521j() && (m1277a = C11369b.m1277a(this.f34048j, c10791am.f34048j)) != 0) {
            return m1277a;
        }
        return 0;
    }

    /* renamed from: b */
    public C10791am m3532b(String str) {
        this.f34042d = str;
        return this;
    }

    @Override // org.p286a.p321b.AbstractC11361a
    /* renamed from: b */
    public void mo1285b(AbstractC11376e abstractC11376e) {
        m3520k();
        abstractC11376e.mo1250a(f34028l);
        if (this.f34039a != null && m3537a()) {
            abstractC11376e.mo1254a(f34029m);
            abstractC11376e.mo1256a(this.f34039a);
            abstractC11376e.mo1247b();
        }
        if (this.f34040b != null && m3534b()) {
            abstractC11376e.mo1254a(f34030n);
            this.f34040b.mo1285b(abstractC11376e);
            abstractC11376e.mo1247b();
        }
        if (this.f34041c != null) {
            abstractC11376e.mo1254a(f34031o);
            abstractC11376e.mo1256a(this.f34041c);
            abstractC11376e.mo1247b();
        }
        if (this.f34042d != null) {
            abstractC11376e.mo1254a(f34032p);
            abstractC11376e.mo1256a(this.f34042d);
            abstractC11376e.mo1247b();
        }
        if (this.f34043e != null && m3527e()) {
            abstractC11376e.mo1254a(f34033q);
            abstractC11376e.mo1256a(this.f34043e);
            abstractC11376e.mo1247b();
        }
        if (this.f34044f != null && m3525f()) {
            abstractC11376e.mo1254a(f34034r);
            abstractC11376e.mo1256a(this.f34044f);
            abstractC11376e.mo1247b();
        }
        if (this.f34045g != null && m3524g()) {
            abstractC11376e.mo1254a(f34035s);
            abstractC11376e.mo1256a(this.f34045g);
            abstractC11376e.mo1247b();
        }
        if (this.f34046h != null && m3523h()) {
            abstractC11376e.mo1254a(f34036t);
            abstractC11376e.mo1256a(this.f34046h);
            abstractC11376e.mo1247b();
        }
        if (this.f34047i != null && m3522i()) {
            abstractC11376e.mo1254a(f34037u);
            abstractC11376e.mo1256a(this.f34047i);
            abstractC11376e.mo1247b();
        }
        if (this.f34048j != null && m3521j()) {
            abstractC11376e.mo1254a(f34038v);
            abstractC11376e.mo1256a(this.f34048j);
            abstractC11376e.mo1247b();
        }
        abstractC11376e.mo1246c();
        abstractC11376e.mo1261a();
    }

    /* renamed from: b */
    public boolean m3534b() {
        return this.f34040b != null;
    }

    /* renamed from: c */
    public C10791am m3530c(String str) {
        this.f34043e = str;
        return this;
    }

    /* renamed from: c */
    public boolean m3531c() {
        return this.f34041c != null;
    }

    /* renamed from: d */
    public C10791am m3528d(String str) {
        this.f34045g = str;
        return this;
    }

    /* renamed from: d */
    public boolean m3529d() {
        return this.f34042d != null;
    }

    /* renamed from: e */
    public C10791am m3526e(String str) {
        this.f34046h = str;
        return this;
    }

    /* renamed from: e */
    public boolean m3527e() {
        return this.f34043e != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C10791am)) {
            return m3536a((C10791am) obj);
        }
        return false;
    }

    /* renamed from: f */
    public boolean m3525f() {
        return this.f34044f != null;
    }

    /* renamed from: g */
    public boolean m3524g() {
        return this.f34045g != null;
    }

    /* renamed from: h */
    public boolean m3523h() {
        return this.f34046h != null;
    }

    public int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public boolean m3522i() {
        return this.f34047i != null;
    }

    /* renamed from: j */
    public boolean m3521j() {
        return this.f34048j != null;
    }

    /* renamed from: k */
    public void m3520k() {
        if (this.f34041c == null) {
            throw new C11377f("Required field 'id' was not present! Struct: " + toString());
        }
        if (this.f34042d != null) {
            return;
        }
        throw new C11377f("Required field 'appId' was not present! Struct: " + toString());
    }

    public String toString() {
        boolean z = false;
        StringBuilder sb = new StringBuilder("XmPushActionUnRegistration(");
        boolean z2 = true;
        if (m3537a()) {
            sb.append("debug:");
            if (this.f34039a == null) {
                sb.append("null");
            } else {
                sb.append(this.f34039a);
            }
            z2 = false;
        }
        if (m3534b()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("target:");
            if (this.f34040b == null) {
                sb.append("null");
            } else {
                sb.append(this.f34040b);
            }
        } else {
            z = z2;
        }
        if (!z) {
            sb.append(", ");
        }
        sb.append("id:");
        if (this.f34041c == null) {
            sb.append("null");
        } else {
            sb.append(this.f34041c);
        }
        sb.append(", ");
        sb.append("appId:");
        if (this.f34042d == null) {
            sb.append("null");
        } else {
            sb.append(this.f34042d);
        }
        if (m3527e()) {
            sb.append(", ");
            sb.append("regId:");
            if (this.f34043e == null) {
                sb.append("null");
            } else {
                sb.append(this.f34043e);
            }
        }
        if (m3525f()) {
            sb.append(", ");
            sb.append("appVersion:");
            if (this.f34044f == null) {
                sb.append("null");
            } else {
                sb.append(this.f34044f);
            }
        }
        if (m3524g()) {
            sb.append(", ");
            sb.append("packageName:");
            if (this.f34045g == null) {
                sb.append("null");
            } else {
                sb.append(this.f34045g);
            }
        }
        if (m3523h()) {
            sb.append(", ");
            sb.append("token:");
            if (this.f34046h == null) {
                sb.append("null");
            } else {
                sb.append(this.f34046h);
            }
        }
        if (m3522i()) {
            sb.append(", ");
            sb.append("deviceId:");
            if (this.f34047i == null) {
                sb.append("null");
            } else {
                sb.append(this.f34047i);
            }
        }
        if (m3521j()) {
            sb.append(", ");
            sb.append("aliasName:");
            if (this.f34048j == null) {
                sb.append("null");
            } else {
                sb.append(this.f34048j);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
