package com.xiaomi.xmpush.thrift;

import com.p255mi.live.openlivesdk.C10022a;
import com.tencent.open.SocialConstants;
import com.xiaomi.market.sdk.C10445j;
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
import org.p286a.p321b.p322a.C11368g;
import org.p286a.p321b.p323b.AbstractC11376e;
import org.p286a.p321b.p323b.C11373b;
import org.p286a.p321b.p323b.C11377f;
import org.p286a.p321b.p323b.C11379h;
import org.p286a.p321b.p323b.C11381j;
/* renamed from: com.xiaomi.xmpush.thrift.ag */
/* loaded from: classes2.dex */
public class C10779ag implements Serializable, Cloneable, AbstractC11361a<C10779ag, EnumC10780a> {

    /* renamed from: k */
    public static final Map<EnumC10780a, C11363b> f33828k;

    /* renamed from: l */
    private static final C11381j f33829l = new C11381j("XmPushActionRegistrationResult");

    /* renamed from: m */
    private static final C11373b f33830m = new C11373b(C10022a.f30894c, (byte) 11, 1);

    /* renamed from: n */
    private static final C11373b f33831n = new C11373b("target", (byte) 12, 2);

    /* renamed from: o */
    private static final C11373b f33832o = new C11373b("id", (byte) 11, 3);

    /* renamed from: p */
    private static final C11373b f33833p = new C11373b("appId", (byte) 11, 4);

    /* renamed from: q */
    private static final C11373b f33834q = new C11373b(SocialConstants.TYPE_REQUEST, (byte) 12, 5);

    /* renamed from: r */
    private static final C11373b f33835r = new C11373b("errorCode", (byte) 10, 6);

    /* renamed from: s */
    private static final C11373b f33836s = new C11373b("reason", (byte) 11, 7);

    /* renamed from: t */
    private static final C11373b f33837t = new C11373b("regId", (byte) 11, 8);

    /* renamed from: u */
    private static final C11373b f33838u = new C11373b("regSecret", (byte) 11, 9);

    /* renamed from: v */
    private static final C11373b f33839v = new C11373b(C10445j.f32447W, (byte) 11, 10);

    /* renamed from: a */
    public String f33840a;

    /* renamed from: b */
    public C10831u f33841b;

    /* renamed from: c */
    public String f33842c;

    /* renamed from: d */
    public String f33843d;

    /* renamed from: e */
    public C10777af f33844e;

    /* renamed from: f */
    public long f33845f;

    /* renamed from: g */
    public String f33846g;

    /* renamed from: h */
    public String f33847h;

    /* renamed from: i */
    public String f33848i;

    /* renamed from: j */
    public String f33849j;

    /* renamed from: w */
    private BitSet f33850w = new BitSet(1);

    /* renamed from: com.xiaomi.xmpush.thrift.ag$a */
    /* loaded from: classes2.dex */
    public enum EnumC10780a {
        DEBUG(1, C10022a.f30894c),
        TARGET(2, "target"),
        ID(3, "id"),
        APP_ID(4, "appId"),
        REQUEST(5, SocialConstants.TYPE_REQUEST),
        ERROR_CODE(6, "errorCode"),
        REASON(7, "reason"),
        REG_ID(8, "regId"),
        REG_SECRET(9, "regSecret"),
        PACKAGE_NAME(10, C10445j.f32447W);
        

        /* renamed from: k */
        private static final Map<String, EnumC10780a> f33861k = new HashMap();

        /* renamed from: l */
        private final short f33863l;

        /* renamed from: m */
        private final String f33864m;

        static {
            Iterator it2 = EnumSet.allOf(EnumC10780a.class).iterator();
            while (it2.hasNext()) {
                EnumC10780a enumC10780a = (EnumC10780a) it2.next();
                f33861k.put(enumC10780a.m3618a(), enumC10780a);
            }
        }

        EnumC10780a(short s, String str) {
            this.f33863l = s;
            this.f33864m = str;
        }

        /* renamed from: a */
        public String m3618a() {
            return this.f33864m;
        }
    }

    static {
        EnumMap enumMap = new EnumMap(EnumC10780a.class);
        enumMap.put((EnumMap) EnumC10780a.DEBUG, (EnumC10780a) new C11363b(C10022a.f30894c, (byte) 2, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10780a.TARGET, (EnumC10780a) new C11363b("target", (byte) 2, new C11368g((byte) 12, C10831u.class)));
        enumMap.put((EnumMap) EnumC10780a.ID, (EnumC10780a) new C11363b("id", (byte) 1, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10780a.APP_ID, (EnumC10780a) new C11363b("appId", (byte) 1, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10780a.REQUEST, (EnumC10780a) new C11363b(SocialConstants.TYPE_REQUEST, (byte) 2, new C11368g((byte) 12, C10777af.class)));
        enumMap.put((EnumMap) EnumC10780a.ERROR_CODE, (EnumC10780a) new C11363b("errorCode", (byte) 1, new C11364c((byte) 10)));
        enumMap.put((EnumMap) EnumC10780a.REASON, (EnumC10780a) new C11363b("reason", (byte) 2, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10780a.REG_ID, (EnumC10780a) new C11363b("regId", (byte) 2, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10780a.REG_SECRET, (EnumC10780a) new C11363b("regSecret", (byte) 2, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10780a.PACKAGE_NAME, (EnumC10780a) new C11363b(C10445j.f32447W, (byte) 2, new C11364c((byte) 11)));
        f33828k = Collections.unmodifiableMap(enumMap);
        C11363b.m1284a(C10779ag.class, f33828k);
    }

    @Override // org.p286a.p321b.AbstractC11361a
    /* renamed from: a */
    public void mo1286a(AbstractC11376e abstractC11376e) {
        abstractC11376e.mo1242g();
        while (true) {
            C11373b mo1240i = abstractC11376e.mo1240i();
            if (mo1240i.f36479b == 0) {
                abstractC11376e.mo1241h();
                if (!m3624f()) {
                    throw new C11377f("Required field 'errorCode' was not found in serialized data! Struct: " + toString());
                }
                m3619k();
                return;
            }
            switch (mo1240i.f36480c) {
                case 1:
                    if (mo1240i.f36479b != 11) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f33840a = abstractC11376e.mo1223w();
                        break;
                    }
                case 2:
                    if (mo1240i.f36479b != 12) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f33841b = new C10831u();
                        this.f33841b.mo1286a(abstractC11376e);
                        break;
                    }
                case 3:
                    if (mo1240i.f36479b != 11) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f33842c = abstractC11376e.mo1223w();
                        break;
                    }
                case 4:
                    if (mo1240i.f36479b != 11) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f33843d = abstractC11376e.mo1223w();
                        break;
                    }
                case 5:
                    if (mo1240i.f36479b != 12) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f33844e = new C10777af();
                        this.f33844e.mo1286a(abstractC11376e);
                        break;
                    }
                case 6:
                    if (mo1240i.f36479b != 10) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f33845f = abstractC11376e.mo1231u();
                        m3630a(true);
                        break;
                    }
                case 7:
                    if (mo1240i.f36479b != 11) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f33846g = abstractC11376e.mo1223w();
                        break;
                    }
                case 8:
                    if (mo1240i.f36479b != 11) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f33847h = abstractC11376e.mo1223w();
                        break;
                    }
                case 9:
                    if (mo1240i.f36479b != 11) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f33848i = abstractC11376e.mo1223w();
                        break;
                    }
                case 10:
                    if (mo1240i.f36479b != 11) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f33849j = abstractC11376e.mo1223w();
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
    public void m3630a(boolean z) {
        this.f33850w.set(0, z);
    }

    /* renamed from: a */
    public boolean m3632a() {
        return this.f33840a != null;
    }

    /* renamed from: a */
    public boolean m3631a(C10779ag c10779ag) {
        if (c10779ag == null) {
            return false;
        }
        boolean m3632a = m3632a();
        boolean m3632a2 = c10779ag.m3632a();
        if ((m3632a || m3632a2) && (!m3632a || !m3632a2 || !this.f33840a.equals(c10779ag.f33840a))) {
            return false;
        }
        boolean m3629b = m3629b();
        boolean m3629b2 = c10779ag.m3629b();
        if ((m3629b || m3629b2) && (!m3629b || !m3629b2 || !this.f33841b.m3254a(c10779ag.f33841b))) {
            return false;
        }
        boolean m3627c = m3627c();
        boolean m3627c2 = c10779ag.m3627c();
        if ((m3627c || m3627c2) && (!m3627c || !m3627c2 || !this.f33842c.equals(c10779ag.f33842c))) {
            return false;
        }
        boolean m3626d = m3626d();
        boolean m3626d2 = c10779ag.m3626d();
        if ((m3626d || m3626d2) && (!m3626d || !m3626d2 || !this.f33843d.equals(c10779ag.f33843d))) {
            return false;
        }
        boolean m3625e = m3625e();
        boolean m3625e2 = c10779ag.m3625e();
        if (((m3625e || m3625e2) && (!m3625e || !m3625e2 || !this.f33844e.m3678a(c10779ag.f33844e))) || this.f33845f != c10779ag.f33845f) {
            return false;
        }
        boolean m3623g = m3623g();
        boolean m3623g2 = c10779ag.m3623g();
        if ((m3623g || m3623g2) && (!m3623g || !m3623g2 || !this.f33846g.equals(c10779ag.f33846g))) {
            return false;
        }
        boolean m3622h = m3622h();
        boolean m3622h2 = c10779ag.m3622h();
        if ((m3622h || m3622h2) && (!m3622h || !m3622h2 || !this.f33847h.equals(c10779ag.f33847h))) {
            return false;
        }
        boolean m3621i = m3621i();
        boolean m3621i2 = c10779ag.m3621i();
        if ((m3621i || m3621i2) && (!m3621i || !m3621i2 || !this.f33848i.equals(c10779ag.f33848i))) {
            return false;
        }
        boolean m3620j = m3620j();
        boolean m3620j2 = c10779ag.m3620j();
        return (!m3620j && !m3620j2) || (m3620j && m3620j2 && this.f33849j.equals(c10779ag.f33849j));
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(C10779ag c10779ag) {
        int m1277a;
        int m1277a2;
        int m1277a3;
        int m1277a4;
        int m1279a;
        int m1278a;
        int m1277a5;
        int m1277a6;
        int m1278a2;
        int m1277a7;
        if (!getClass().equals(c10779ag.getClass())) {
            return getClass().getName().compareTo(c10779ag.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m3632a()).compareTo(Boolean.valueOf(c10779ag.m3632a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m3632a() && (m1277a7 = C11369b.m1277a(this.f33840a, c10779ag.f33840a)) != 0) {
            return m1277a7;
        }
        int compareTo2 = Boolean.valueOf(m3629b()).compareTo(Boolean.valueOf(c10779ag.m3629b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m3629b() && (m1278a2 = C11369b.m1278a(this.f33841b, c10779ag.f33841b)) != 0) {
            return m1278a2;
        }
        int compareTo3 = Boolean.valueOf(m3627c()).compareTo(Boolean.valueOf(c10779ag.m3627c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (m3627c() && (m1277a6 = C11369b.m1277a(this.f33842c, c10779ag.f33842c)) != 0) {
            return m1277a6;
        }
        int compareTo4 = Boolean.valueOf(m3626d()).compareTo(Boolean.valueOf(c10779ag.m3626d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (m3626d() && (m1277a5 = C11369b.m1277a(this.f33843d, c10779ag.f33843d)) != 0) {
            return m1277a5;
        }
        int compareTo5 = Boolean.valueOf(m3625e()).compareTo(Boolean.valueOf(c10779ag.m3625e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (m3625e() && (m1278a = C11369b.m1278a(this.f33844e, c10779ag.f33844e)) != 0) {
            return m1278a;
        }
        int compareTo6 = Boolean.valueOf(m3624f()).compareTo(Boolean.valueOf(c10779ag.m3624f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (m3624f() && (m1279a = C11369b.m1279a(this.f33845f, c10779ag.f33845f)) != 0) {
            return m1279a;
        }
        int compareTo7 = Boolean.valueOf(m3623g()).compareTo(Boolean.valueOf(c10779ag.m3623g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (m3623g() && (m1277a4 = C11369b.m1277a(this.f33846g, c10779ag.f33846g)) != 0) {
            return m1277a4;
        }
        int compareTo8 = Boolean.valueOf(m3622h()).compareTo(Boolean.valueOf(c10779ag.m3622h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (m3622h() && (m1277a3 = C11369b.m1277a(this.f33847h, c10779ag.f33847h)) != 0) {
            return m1277a3;
        }
        int compareTo9 = Boolean.valueOf(m3621i()).compareTo(Boolean.valueOf(c10779ag.m3621i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (m3621i() && (m1277a2 = C11369b.m1277a(this.f33848i, c10779ag.f33848i)) != 0) {
            return m1277a2;
        }
        int compareTo10 = Boolean.valueOf(m3620j()).compareTo(Boolean.valueOf(c10779ag.m3620j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (m3620j() && (m1277a = C11369b.m1277a(this.f33849j, c10779ag.f33849j)) != 0) {
            return m1277a;
        }
        return 0;
    }

    @Override // org.p286a.p321b.AbstractC11361a
    /* renamed from: b */
    public void mo1285b(AbstractC11376e abstractC11376e) {
        m3619k();
        abstractC11376e.mo1250a(f33829l);
        if (this.f33840a != null && m3632a()) {
            abstractC11376e.mo1254a(f33830m);
            abstractC11376e.mo1256a(this.f33840a);
            abstractC11376e.mo1247b();
        }
        if (this.f33841b != null && m3629b()) {
            abstractC11376e.mo1254a(f33831n);
            this.f33841b.mo1285b(abstractC11376e);
            abstractC11376e.mo1247b();
        }
        if (this.f33842c != null) {
            abstractC11376e.mo1254a(f33832o);
            abstractC11376e.mo1256a(this.f33842c);
            abstractC11376e.mo1247b();
        }
        if (this.f33843d != null) {
            abstractC11376e.mo1254a(f33833p);
            abstractC11376e.mo1256a(this.f33843d);
            abstractC11376e.mo1247b();
        }
        if (this.f33844e != null && m3625e()) {
            abstractC11376e.mo1254a(f33834q);
            this.f33844e.mo1285b(abstractC11376e);
            abstractC11376e.mo1247b();
        }
        abstractC11376e.mo1254a(f33835r);
        abstractC11376e.mo1257a(this.f33845f);
        abstractC11376e.mo1247b();
        if (this.f33846g != null && m3623g()) {
            abstractC11376e.mo1254a(f33836s);
            abstractC11376e.mo1256a(this.f33846g);
            abstractC11376e.mo1247b();
        }
        if (this.f33847h != null && m3622h()) {
            abstractC11376e.mo1254a(f33837t);
            abstractC11376e.mo1256a(this.f33847h);
            abstractC11376e.mo1247b();
        }
        if (this.f33848i != null && m3621i()) {
            abstractC11376e.mo1254a(f33838u);
            abstractC11376e.mo1256a(this.f33848i);
            abstractC11376e.mo1247b();
        }
        if (this.f33849j != null && m3620j()) {
            abstractC11376e.mo1254a(f33839v);
            abstractC11376e.mo1256a(this.f33849j);
            abstractC11376e.mo1247b();
        }
        abstractC11376e.mo1246c();
        abstractC11376e.mo1261a();
    }

    /* renamed from: b */
    public boolean m3629b() {
        return this.f33841b != null;
    }

    /* renamed from: c */
    public boolean m3627c() {
        return this.f33842c != null;
    }

    /* renamed from: d */
    public boolean m3626d() {
        return this.f33843d != null;
    }

    /* renamed from: e */
    public boolean m3625e() {
        return this.f33844e != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C10779ag)) {
            return m3631a((C10779ag) obj);
        }
        return false;
    }

    /* renamed from: f */
    public boolean m3624f() {
        return this.f33850w.get(0);
    }

    /* renamed from: g */
    public boolean m3623g() {
        return this.f33846g != null;
    }

    /* renamed from: h */
    public boolean m3622h() {
        return this.f33847h != null;
    }

    public int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public boolean m3621i() {
        return this.f33848i != null;
    }

    /* renamed from: j */
    public boolean m3620j() {
        return this.f33849j != null;
    }

    /* renamed from: k */
    public void m3619k() {
        if (this.f33842c == null) {
            throw new C11377f("Required field 'id' was not present! Struct: " + toString());
        }
        if (this.f33843d != null) {
            return;
        }
        throw new C11377f("Required field 'appId' was not present! Struct: " + toString());
    }

    public String toString() {
        boolean z = false;
        StringBuilder sb = new StringBuilder("XmPushActionRegistrationResult(");
        boolean z2 = true;
        if (m3632a()) {
            sb.append("debug:");
            if (this.f33840a == null) {
                sb.append("null");
            } else {
                sb.append(this.f33840a);
            }
            z2 = false;
        }
        if (m3629b()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("target:");
            if (this.f33841b == null) {
                sb.append("null");
            } else {
                sb.append(this.f33841b);
            }
        } else {
            z = z2;
        }
        if (!z) {
            sb.append(", ");
        }
        sb.append("id:");
        if (this.f33842c == null) {
            sb.append("null");
        } else {
            sb.append(this.f33842c);
        }
        sb.append(", ");
        sb.append("appId:");
        if (this.f33843d == null) {
            sb.append("null");
        } else {
            sb.append(this.f33843d);
        }
        if (m3625e()) {
            sb.append(", ");
            sb.append("request:");
            if (this.f33844e == null) {
                sb.append("null");
            } else {
                sb.append(this.f33844e);
            }
        }
        sb.append(", ");
        sb.append("errorCode:");
        sb.append(this.f33845f);
        if (m3623g()) {
            sb.append(", ");
            sb.append("reason:");
            if (this.f33846g == null) {
                sb.append("null");
            } else {
                sb.append(this.f33846g);
            }
        }
        if (m3622h()) {
            sb.append(", ");
            sb.append("regId:");
            if (this.f33847h == null) {
                sb.append("null");
            } else {
                sb.append(this.f33847h);
            }
        }
        if (m3621i()) {
            sb.append(", ");
            sb.append("regSecret:");
            if (this.f33848i == null) {
                sb.append("null");
            } else {
                sb.append(this.f33848i);
            }
        }
        if (m3620j()) {
            sb.append(", ");
            sb.append("packageName:");
            if (this.f33849j == null) {
                sb.append("null");
            } else {
                sb.append(this.f33849j);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
