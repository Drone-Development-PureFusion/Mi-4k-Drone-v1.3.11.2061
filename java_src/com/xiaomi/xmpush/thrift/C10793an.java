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
/* renamed from: com.xiaomi.xmpush.thrift.an */
/* loaded from: classes2.dex */
public class C10793an implements Serializable, Cloneable, AbstractC11361a<C10793an, EnumC10794a> {

    /* renamed from: i */
    public static final Map<EnumC10794a, C11363b> f34063i;

    /* renamed from: j */
    private static final C11381j f34064j = new C11381j("XmPushActionUnRegistrationResult");

    /* renamed from: k */
    private static final C11373b f34065k = new C11373b(C10022a.f30894c, (byte) 11, 1);

    /* renamed from: l */
    private static final C11373b f34066l = new C11373b("target", (byte) 12, 2);

    /* renamed from: m */
    private static final C11373b f34067m = new C11373b("id", (byte) 11, 3);

    /* renamed from: n */
    private static final C11373b f34068n = new C11373b("appId", (byte) 11, 4);

    /* renamed from: o */
    private static final C11373b f34069o = new C11373b(SocialConstants.TYPE_REQUEST, (byte) 12, 5);

    /* renamed from: p */
    private static final C11373b f34070p = new C11373b("errorCode", (byte) 10, 6);

    /* renamed from: q */
    private static final C11373b f34071q = new C11373b("reason", (byte) 11, 7);

    /* renamed from: r */
    private static final C11373b f34072r = new C11373b(C10445j.f32447W, (byte) 11, 8);

    /* renamed from: a */
    public String f34073a;

    /* renamed from: b */
    public C10831u f34074b;

    /* renamed from: c */
    public String f34075c;

    /* renamed from: d */
    public String f34076d;

    /* renamed from: e */
    public C10791am f34077e;

    /* renamed from: f */
    public long f34078f;

    /* renamed from: g */
    public String f34079g;

    /* renamed from: h */
    public String f34080h;

    /* renamed from: s */
    private BitSet f34081s = new BitSet(1);

    /* renamed from: com.xiaomi.xmpush.thrift.an$a */
    /* loaded from: classes2.dex */
    public enum EnumC10794a {
        DEBUG(1, C10022a.f30894c),
        TARGET(2, "target"),
        ID(3, "id"),
        APP_ID(4, "appId"),
        REQUEST(5, SocialConstants.TYPE_REQUEST),
        ERROR_CODE(6, "errorCode"),
        REASON(7, "reason"),
        PACKAGE_NAME(8, C10445j.f32447W);
        

        /* renamed from: i */
        private static final Map<String, EnumC10794a> f34090i = new HashMap();

        /* renamed from: j */
        private final short f34092j;

        /* renamed from: k */
        private final String f34093k;

        static {
            Iterator it2 = EnumSet.allOf(EnumC10794a.class).iterator();
            while (it2.hasNext()) {
                EnumC10794a enumC10794a = (EnumC10794a) it2.next();
                f34090i.put(enumC10794a.m3506a(), enumC10794a);
            }
        }

        EnumC10794a(short s, String str) {
            this.f34092j = s;
            this.f34093k = str;
        }

        /* renamed from: a */
        public String m3506a() {
            return this.f34093k;
        }
    }

    static {
        EnumMap enumMap = new EnumMap(EnumC10794a.class);
        enumMap.put((EnumMap) EnumC10794a.DEBUG, (EnumC10794a) new C11363b(C10022a.f30894c, (byte) 2, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10794a.TARGET, (EnumC10794a) new C11363b("target", (byte) 2, new C11368g((byte) 12, C10831u.class)));
        enumMap.put((EnumMap) EnumC10794a.ID, (EnumC10794a) new C11363b("id", (byte) 1, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10794a.APP_ID, (EnumC10794a) new C11363b("appId", (byte) 1, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10794a.REQUEST, (EnumC10794a) new C11363b(SocialConstants.TYPE_REQUEST, (byte) 2, new C11368g((byte) 12, C10791am.class)));
        enumMap.put((EnumMap) EnumC10794a.ERROR_CODE, (EnumC10794a) new C11363b("errorCode", (byte) 1, new C11364c((byte) 10)));
        enumMap.put((EnumMap) EnumC10794a.REASON, (EnumC10794a) new C11363b("reason", (byte) 2, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10794a.PACKAGE_NAME, (EnumC10794a) new C11363b(C10445j.f32447W, (byte) 2, new C11364c((byte) 11)));
        f34063i = Collections.unmodifiableMap(enumMap);
        C11363b.m1284a(C10793an.class, f34063i);
    }

    @Override // org.p286a.p321b.AbstractC11361a
    /* renamed from: a */
    public void mo1286a(AbstractC11376e abstractC11376e) {
        abstractC11376e.mo1242g();
        while (true) {
            C11373b mo1240i = abstractC11376e.mo1240i();
            if (mo1240i.f36479b == 0) {
                abstractC11376e.mo1241h();
                if (!m3510f()) {
                    throw new C11377f("Required field 'errorCode' was not found in serialized data! Struct: " + toString());
                }
                m3507i();
                return;
            }
            switch (mo1240i.f36480c) {
                case 1:
                    if (mo1240i.f36479b != 11) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f34073a = abstractC11376e.mo1223w();
                        break;
                    }
                case 2:
                    if (mo1240i.f36479b != 12) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f34074b = new C10831u();
                        this.f34074b.mo1286a(abstractC11376e);
                        break;
                    }
                case 3:
                    if (mo1240i.f36479b != 11) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f34075c = abstractC11376e.mo1223w();
                        break;
                    }
                case 4:
                    if (mo1240i.f36479b != 11) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f34076d = abstractC11376e.mo1223w();
                        break;
                    }
                case 5:
                    if (mo1240i.f36479b != 12) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f34077e = new C10791am();
                        this.f34077e.mo1286a(abstractC11376e);
                        break;
                    }
                case 6:
                    if (mo1240i.f36479b != 10) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f34078f = abstractC11376e.mo1231u();
                        m3516a(true);
                        break;
                    }
                case 7:
                    if (mo1240i.f36479b != 11) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f34079g = abstractC11376e.mo1223w();
                        break;
                    }
                case 8:
                    if (mo1240i.f36479b != 11) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f34080h = abstractC11376e.mo1223w();
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
    public void m3516a(boolean z) {
        this.f34081s.set(0, z);
    }

    /* renamed from: a */
    public boolean m3518a() {
        return this.f34073a != null;
    }

    /* renamed from: a */
    public boolean m3517a(C10793an c10793an) {
        if (c10793an == null) {
            return false;
        }
        boolean m3518a = m3518a();
        boolean m3518a2 = c10793an.m3518a();
        if ((m3518a || m3518a2) && (!m3518a || !m3518a2 || !this.f34073a.equals(c10793an.f34073a))) {
            return false;
        }
        boolean m3515b = m3515b();
        boolean m3515b2 = c10793an.m3515b();
        if ((m3515b || m3515b2) && (!m3515b || !m3515b2 || !this.f34074b.m3254a(c10793an.f34074b))) {
            return false;
        }
        boolean m3513c = m3513c();
        boolean m3513c2 = c10793an.m3513c();
        if ((m3513c || m3513c2) && (!m3513c || !m3513c2 || !this.f34075c.equals(c10793an.f34075c))) {
            return false;
        }
        boolean m3512d = m3512d();
        boolean m3512d2 = c10793an.m3512d();
        if ((m3512d || m3512d2) && (!m3512d || !m3512d2 || !this.f34076d.equals(c10793an.f34076d))) {
            return false;
        }
        boolean m3511e = m3511e();
        boolean m3511e2 = c10793an.m3511e();
        if (((m3511e || m3511e2) && (!m3511e || !m3511e2 || !this.f34077e.m3536a(c10793an.f34077e))) || this.f34078f != c10793an.f34078f) {
            return false;
        }
        boolean m3509g = m3509g();
        boolean m3509g2 = c10793an.m3509g();
        if ((m3509g || m3509g2) && (!m3509g || !m3509g2 || !this.f34079g.equals(c10793an.f34079g))) {
            return false;
        }
        boolean m3508h = m3508h();
        boolean m3508h2 = c10793an.m3508h();
        return (!m3508h && !m3508h2) || (m3508h && m3508h2 && this.f34080h.equals(c10793an.f34080h));
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(C10793an c10793an) {
        int m1277a;
        int m1277a2;
        int m1279a;
        int m1278a;
        int m1277a3;
        int m1277a4;
        int m1278a2;
        int m1277a5;
        if (!getClass().equals(c10793an.getClass())) {
            return getClass().getName().compareTo(c10793an.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m3518a()).compareTo(Boolean.valueOf(c10793an.m3518a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m3518a() && (m1277a5 = C11369b.m1277a(this.f34073a, c10793an.f34073a)) != 0) {
            return m1277a5;
        }
        int compareTo2 = Boolean.valueOf(m3515b()).compareTo(Boolean.valueOf(c10793an.m3515b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m3515b() && (m1278a2 = C11369b.m1278a(this.f34074b, c10793an.f34074b)) != 0) {
            return m1278a2;
        }
        int compareTo3 = Boolean.valueOf(m3513c()).compareTo(Boolean.valueOf(c10793an.m3513c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (m3513c() && (m1277a4 = C11369b.m1277a(this.f34075c, c10793an.f34075c)) != 0) {
            return m1277a4;
        }
        int compareTo4 = Boolean.valueOf(m3512d()).compareTo(Boolean.valueOf(c10793an.m3512d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (m3512d() && (m1277a3 = C11369b.m1277a(this.f34076d, c10793an.f34076d)) != 0) {
            return m1277a3;
        }
        int compareTo5 = Boolean.valueOf(m3511e()).compareTo(Boolean.valueOf(c10793an.m3511e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (m3511e() && (m1278a = C11369b.m1278a(this.f34077e, c10793an.f34077e)) != 0) {
            return m1278a;
        }
        int compareTo6 = Boolean.valueOf(m3510f()).compareTo(Boolean.valueOf(c10793an.m3510f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (m3510f() && (m1279a = C11369b.m1279a(this.f34078f, c10793an.f34078f)) != 0) {
            return m1279a;
        }
        int compareTo7 = Boolean.valueOf(m3509g()).compareTo(Boolean.valueOf(c10793an.m3509g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (m3509g() && (m1277a2 = C11369b.m1277a(this.f34079g, c10793an.f34079g)) != 0) {
            return m1277a2;
        }
        int compareTo8 = Boolean.valueOf(m3508h()).compareTo(Boolean.valueOf(c10793an.m3508h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (m3508h() && (m1277a = C11369b.m1277a(this.f34080h, c10793an.f34080h)) != 0) {
            return m1277a;
        }
        return 0;
    }

    @Override // org.p286a.p321b.AbstractC11361a
    /* renamed from: b */
    public void mo1285b(AbstractC11376e abstractC11376e) {
        m3507i();
        abstractC11376e.mo1250a(f34064j);
        if (this.f34073a != null && m3518a()) {
            abstractC11376e.mo1254a(f34065k);
            abstractC11376e.mo1256a(this.f34073a);
            abstractC11376e.mo1247b();
        }
        if (this.f34074b != null && m3515b()) {
            abstractC11376e.mo1254a(f34066l);
            this.f34074b.mo1285b(abstractC11376e);
            abstractC11376e.mo1247b();
        }
        if (this.f34075c != null) {
            abstractC11376e.mo1254a(f34067m);
            abstractC11376e.mo1256a(this.f34075c);
            abstractC11376e.mo1247b();
        }
        if (this.f34076d != null) {
            abstractC11376e.mo1254a(f34068n);
            abstractC11376e.mo1256a(this.f34076d);
            abstractC11376e.mo1247b();
        }
        if (this.f34077e != null && m3511e()) {
            abstractC11376e.mo1254a(f34069o);
            this.f34077e.mo1285b(abstractC11376e);
            abstractC11376e.mo1247b();
        }
        abstractC11376e.mo1254a(f34070p);
        abstractC11376e.mo1257a(this.f34078f);
        abstractC11376e.mo1247b();
        if (this.f34079g != null && m3509g()) {
            abstractC11376e.mo1254a(f34071q);
            abstractC11376e.mo1256a(this.f34079g);
            abstractC11376e.mo1247b();
        }
        if (this.f34080h != null && m3508h()) {
            abstractC11376e.mo1254a(f34072r);
            abstractC11376e.mo1256a(this.f34080h);
            abstractC11376e.mo1247b();
        }
        abstractC11376e.mo1246c();
        abstractC11376e.mo1261a();
    }

    /* renamed from: b */
    public boolean m3515b() {
        return this.f34074b != null;
    }

    /* renamed from: c */
    public boolean m3513c() {
        return this.f34075c != null;
    }

    /* renamed from: d */
    public boolean m3512d() {
        return this.f34076d != null;
    }

    /* renamed from: e */
    public boolean m3511e() {
        return this.f34077e != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C10793an)) {
            return m3517a((C10793an) obj);
        }
        return false;
    }

    /* renamed from: f */
    public boolean m3510f() {
        return this.f34081s.get(0);
    }

    /* renamed from: g */
    public boolean m3509g() {
        return this.f34079g != null;
    }

    /* renamed from: h */
    public boolean m3508h() {
        return this.f34080h != null;
    }

    public int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public void m3507i() {
        if (this.f34075c == null) {
            throw new C11377f("Required field 'id' was not present! Struct: " + toString());
        }
        if (this.f34076d != null) {
            return;
        }
        throw new C11377f("Required field 'appId' was not present! Struct: " + toString());
    }

    public String toString() {
        boolean z = false;
        StringBuilder sb = new StringBuilder("XmPushActionUnRegistrationResult(");
        boolean z2 = true;
        if (m3518a()) {
            sb.append("debug:");
            if (this.f34073a == null) {
                sb.append("null");
            } else {
                sb.append(this.f34073a);
            }
            z2 = false;
        }
        if (m3515b()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("target:");
            if (this.f34074b == null) {
                sb.append("null");
            } else {
                sb.append(this.f34074b);
            }
        } else {
            z = z2;
        }
        if (!z) {
            sb.append(", ");
        }
        sb.append("id:");
        if (this.f34075c == null) {
            sb.append("null");
        } else {
            sb.append(this.f34075c);
        }
        sb.append(", ");
        sb.append("appId:");
        if (this.f34076d == null) {
            sb.append("null");
        } else {
            sb.append(this.f34076d);
        }
        if (m3511e()) {
            sb.append(", ");
            sb.append("request:");
            if (this.f34077e == null) {
                sb.append("null");
            } else {
                sb.append(this.f34077e);
            }
        }
        sb.append(", ");
        sb.append("errorCode:");
        sb.append(this.f34078f);
        if (m3509g()) {
            sb.append(", ");
            sb.append("reason:");
            if (this.f34079g == null) {
                sb.append("null");
            } else {
                sb.append(this.f34079g);
            }
        }
        if (m3508h()) {
            sb.append(", ");
            sb.append("packageName:");
            if (this.f34080h == null) {
                sb.append("null");
            } else {
                sb.append(this.f34080h);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
