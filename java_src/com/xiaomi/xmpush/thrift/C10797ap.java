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
/* renamed from: com.xiaomi.xmpush.thrift.ap */
/* loaded from: classes2.dex */
public class C10797ap implements Serializable, Cloneable, AbstractC11361a<C10797ap, EnumC10798a> {

    /* renamed from: k */
    public static final Map<EnumC10798a, C11363b> f34121k;

    /* renamed from: l */
    private static final C11381j f34122l = new C11381j("XmPushActionUnSubscriptionResult");

    /* renamed from: m */
    private static final C11373b f34123m = new C11373b(C10022a.f30894c, (byte) 11, 1);

    /* renamed from: n */
    private static final C11373b f34124n = new C11373b("target", (byte) 12, 2);

    /* renamed from: o */
    private static final C11373b f34125o = new C11373b("id", (byte) 11, 3);

    /* renamed from: p */
    private static final C11373b f34126p = new C11373b("appId", (byte) 11, 4);

    /* renamed from: q */
    private static final C11373b f34127q = new C11373b(SocialConstants.TYPE_REQUEST, (byte) 12, 5);

    /* renamed from: r */
    private static final C11373b f34128r = new C11373b("errorCode", (byte) 10, 6);

    /* renamed from: s */
    private static final C11373b f34129s = new C11373b("reason", (byte) 11, 7);

    /* renamed from: t */
    private static final C11373b f34130t = new C11373b("topic", (byte) 11, 8);

    /* renamed from: u */
    private static final C11373b f34131u = new C11373b(C10445j.f32447W, (byte) 11, 9);

    /* renamed from: v */
    private static final C11373b f34132v = new C11373b("category", (byte) 11, 10);

    /* renamed from: a */
    public String f34133a;

    /* renamed from: b */
    public C10831u f34134b;

    /* renamed from: c */
    public String f34135c;

    /* renamed from: d */
    public String f34136d;

    /* renamed from: e */
    public C10795ao f34137e;

    /* renamed from: f */
    public long f34138f;

    /* renamed from: g */
    public String f34139g;

    /* renamed from: h */
    public String f34140h;

    /* renamed from: i */
    public String f34141i;

    /* renamed from: j */
    public String f34142j;

    /* renamed from: w */
    private BitSet f34143w = new BitSet(1);

    /* renamed from: com.xiaomi.xmpush.thrift.ap$a */
    /* loaded from: classes2.dex */
    public enum EnumC10798a {
        DEBUG(1, C10022a.f30894c),
        TARGET(2, "target"),
        ID(3, "id"),
        APP_ID(4, "appId"),
        REQUEST(5, SocialConstants.TYPE_REQUEST),
        ERROR_CODE(6, "errorCode"),
        REASON(7, "reason"),
        TOPIC(8, "topic"),
        PACKAGE_NAME(9, C10445j.f32447W),
        CATEGORY(10, "category");
        

        /* renamed from: k */
        private static final Map<String, EnumC10798a> f34154k = new HashMap();

        /* renamed from: l */
        private final short f34156l;

        /* renamed from: m */
        private final String f34157m;

        static {
            Iterator it2 = EnumSet.allOf(EnumC10798a.class).iterator();
            while (it2.hasNext()) {
                EnumC10798a enumC10798a = (EnumC10798a) it2.next();
                f34154k.put(enumC10798a.m3473a(), enumC10798a);
            }
        }

        EnumC10798a(short s, String str) {
            this.f34156l = s;
            this.f34157m = str;
        }

        /* renamed from: a */
        public String m3473a() {
            return this.f34157m;
        }
    }

    static {
        EnumMap enumMap = new EnumMap(EnumC10798a.class);
        enumMap.put((EnumMap) EnumC10798a.DEBUG, (EnumC10798a) new C11363b(C10022a.f30894c, (byte) 2, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10798a.TARGET, (EnumC10798a) new C11363b("target", (byte) 2, new C11368g((byte) 12, C10831u.class)));
        enumMap.put((EnumMap) EnumC10798a.ID, (EnumC10798a) new C11363b("id", (byte) 1, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10798a.APP_ID, (EnumC10798a) new C11363b("appId", (byte) 2, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10798a.REQUEST, (EnumC10798a) new C11363b(SocialConstants.TYPE_REQUEST, (byte) 2, new C11368g((byte) 12, C10795ao.class)));
        enumMap.put((EnumMap) EnumC10798a.ERROR_CODE, (EnumC10798a) new C11363b("errorCode", (byte) 2, new C11364c((byte) 10)));
        enumMap.put((EnumMap) EnumC10798a.REASON, (EnumC10798a) new C11363b("reason", (byte) 2, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10798a.TOPIC, (EnumC10798a) new C11363b("topic", (byte) 2, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10798a.PACKAGE_NAME, (EnumC10798a) new C11363b(C10445j.f32447W, (byte) 2, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10798a.CATEGORY, (EnumC10798a) new C11363b("category", (byte) 2, new C11364c((byte) 11)));
        f34121k = Collections.unmodifiableMap(enumMap);
        C11363b.m1284a(C10797ap.class, f34121k);
    }

    @Override // org.p286a.p321b.AbstractC11361a
    /* renamed from: a */
    public void mo1286a(AbstractC11376e abstractC11376e) {
        abstractC11376e.mo1242g();
        while (true) {
            C11373b mo1240i = abstractC11376e.mo1240i();
            if (mo1240i.f36479b == 0) {
                abstractC11376e.mo1241h();
                m3474m();
                return;
            }
            switch (mo1240i.f36480c) {
                case 1:
                    if (mo1240i.f36479b != 11) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f34133a = abstractC11376e.mo1223w();
                        break;
                    }
                case 2:
                    if (mo1240i.f36479b != 12) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f34134b = new C10831u();
                        this.f34134b.mo1286a(abstractC11376e);
                        break;
                    }
                case 3:
                    if (mo1240i.f36479b != 11) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f34135c = abstractC11376e.mo1223w();
                        break;
                    }
                case 4:
                    if (mo1240i.f36479b != 11) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f34136d = abstractC11376e.mo1223w();
                        break;
                    }
                case 5:
                    if (mo1240i.f36479b != 12) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f34137e = new C10795ao();
                        this.f34137e.mo1286a(abstractC11376e);
                        break;
                    }
                case 6:
                    if (mo1240i.f36479b != 10) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f34138f = abstractC11376e.mo1231u();
                        m3487a(true);
                        break;
                    }
                case 7:
                    if (mo1240i.f36479b != 11) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f34139g = abstractC11376e.mo1223w();
                        break;
                    }
                case 8:
                    if (mo1240i.f36479b != 11) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f34140h = abstractC11376e.mo1223w();
                        break;
                    }
                case 9:
                    if (mo1240i.f36479b != 11) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f34141i = abstractC11376e.mo1223w();
                        break;
                    }
                case 10:
                    if (mo1240i.f36479b != 11) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f34142j = abstractC11376e.mo1223w();
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
    public void m3487a(boolean z) {
        this.f34143w.set(0, z);
    }

    /* renamed from: a */
    public boolean m3489a() {
        return this.f34133a != null;
    }

    /* renamed from: a */
    public boolean m3488a(C10797ap c10797ap) {
        if (c10797ap == null) {
            return false;
        }
        boolean m3489a = m3489a();
        boolean m3489a2 = c10797ap.m3489a();
        if ((m3489a || m3489a2) && (!m3489a || !m3489a2 || !this.f34133a.equals(c10797ap.f34133a))) {
            return false;
        }
        boolean m3486b = m3486b();
        boolean m3486b2 = c10797ap.m3486b();
        if ((m3486b || m3486b2) && (!m3486b || !m3486b2 || !this.f34134b.m3254a(c10797ap.f34134b))) {
            return false;
        }
        boolean m3484c = m3484c();
        boolean m3484c2 = c10797ap.m3484c();
        if ((m3484c || m3484c2) && (!m3484c || !m3484c2 || !this.f34135c.equals(c10797ap.f34135c))) {
            return false;
        }
        boolean m3483d = m3483d();
        boolean m3483d2 = c10797ap.m3483d();
        if ((m3483d || m3483d2) && (!m3483d || !m3483d2 || !this.f34136d.equals(c10797ap.f34136d))) {
            return false;
        }
        boolean m3482e = m3482e();
        boolean m3482e2 = c10797ap.m3482e();
        if ((m3482e || m3482e2) && (!m3482e || !m3482e2 || !this.f34137e.m3504a(c10797ap.f34137e))) {
            return false;
        }
        boolean m3481f = m3481f();
        boolean m3481f2 = c10797ap.m3481f();
        if ((m3481f || m3481f2) && (!m3481f || !m3481f2 || this.f34138f != c10797ap.f34138f)) {
            return false;
        }
        boolean m3480g = m3480g();
        boolean m3480g2 = c10797ap.m3480g();
        if ((m3480g || m3480g2) && (!m3480g || !m3480g2 || !this.f34139g.equals(c10797ap.f34139g))) {
            return false;
        }
        boolean m3478i = m3478i();
        boolean m3478i2 = c10797ap.m3478i();
        if ((m3478i || m3478i2) && (!m3478i || !m3478i2 || !this.f34140h.equals(c10797ap.f34140h))) {
            return false;
        }
        boolean m3477j = m3477j();
        boolean m3477j2 = c10797ap.m3477j();
        if ((m3477j || m3477j2) && (!m3477j || !m3477j2 || !this.f34141i.equals(c10797ap.f34141i))) {
            return false;
        }
        boolean m3475l = m3475l();
        boolean m3475l2 = c10797ap.m3475l();
        return (!m3475l && !m3475l2) || (m3475l && m3475l2 && this.f34142j.equals(c10797ap.f34142j));
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(C10797ap c10797ap) {
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
        if (!getClass().equals(c10797ap.getClass())) {
            return getClass().getName().compareTo(c10797ap.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m3489a()).compareTo(Boolean.valueOf(c10797ap.m3489a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m3489a() && (m1277a7 = C11369b.m1277a(this.f34133a, c10797ap.f34133a)) != 0) {
            return m1277a7;
        }
        int compareTo2 = Boolean.valueOf(m3486b()).compareTo(Boolean.valueOf(c10797ap.m3486b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m3486b() && (m1278a2 = C11369b.m1278a(this.f34134b, c10797ap.f34134b)) != 0) {
            return m1278a2;
        }
        int compareTo3 = Boolean.valueOf(m3484c()).compareTo(Boolean.valueOf(c10797ap.m3484c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (m3484c() && (m1277a6 = C11369b.m1277a(this.f34135c, c10797ap.f34135c)) != 0) {
            return m1277a6;
        }
        int compareTo4 = Boolean.valueOf(m3483d()).compareTo(Boolean.valueOf(c10797ap.m3483d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (m3483d() && (m1277a5 = C11369b.m1277a(this.f34136d, c10797ap.f34136d)) != 0) {
            return m1277a5;
        }
        int compareTo5 = Boolean.valueOf(m3482e()).compareTo(Boolean.valueOf(c10797ap.m3482e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (m3482e() && (m1278a = C11369b.m1278a(this.f34137e, c10797ap.f34137e)) != 0) {
            return m1278a;
        }
        int compareTo6 = Boolean.valueOf(m3481f()).compareTo(Boolean.valueOf(c10797ap.m3481f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (m3481f() && (m1279a = C11369b.m1279a(this.f34138f, c10797ap.f34138f)) != 0) {
            return m1279a;
        }
        int compareTo7 = Boolean.valueOf(m3480g()).compareTo(Boolean.valueOf(c10797ap.m3480g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (m3480g() && (m1277a4 = C11369b.m1277a(this.f34139g, c10797ap.f34139g)) != 0) {
            return m1277a4;
        }
        int compareTo8 = Boolean.valueOf(m3478i()).compareTo(Boolean.valueOf(c10797ap.m3478i()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (m3478i() && (m1277a3 = C11369b.m1277a(this.f34140h, c10797ap.f34140h)) != 0) {
            return m1277a3;
        }
        int compareTo9 = Boolean.valueOf(m3477j()).compareTo(Boolean.valueOf(c10797ap.m3477j()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (m3477j() && (m1277a2 = C11369b.m1277a(this.f34141i, c10797ap.f34141i)) != 0) {
            return m1277a2;
        }
        int compareTo10 = Boolean.valueOf(m3475l()).compareTo(Boolean.valueOf(c10797ap.m3475l()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (m3475l() && (m1277a = C11369b.m1277a(this.f34142j, c10797ap.f34142j)) != 0) {
            return m1277a;
        }
        return 0;
    }

    @Override // org.p286a.p321b.AbstractC11361a
    /* renamed from: b */
    public void mo1285b(AbstractC11376e abstractC11376e) {
        m3474m();
        abstractC11376e.mo1250a(f34122l);
        if (this.f34133a != null && m3489a()) {
            abstractC11376e.mo1254a(f34123m);
            abstractC11376e.mo1256a(this.f34133a);
            abstractC11376e.mo1247b();
        }
        if (this.f34134b != null && m3486b()) {
            abstractC11376e.mo1254a(f34124n);
            this.f34134b.mo1285b(abstractC11376e);
            abstractC11376e.mo1247b();
        }
        if (this.f34135c != null) {
            abstractC11376e.mo1254a(f34125o);
            abstractC11376e.mo1256a(this.f34135c);
            abstractC11376e.mo1247b();
        }
        if (this.f34136d != null && m3483d()) {
            abstractC11376e.mo1254a(f34126p);
            abstractC11376e.mo1256a(this.f34136d);
            abstractC11376e.mo1247b();
        }
        if (this.f34137e != null && m3482e()) {
            abstractC11376e.mo1254a(f34127q);
            this.f34137e.mo1285b(abstractC11376e);
            abstractC11376e.mo1247b();
        }
        if (m3481f()) {
            abstractC11376e.mo1254a(f34128r);
            abstractC11376e.mo1257a(this.f34138f);
            abstractC11376e.mo1247b();
        }
        if (this.f34139g != null && m3480g()) {
            abstractC11376e.mo1254a(f34129s);
            abstractC11376e.mo1256a(this.f34139g);
            abstractC11376e.mo1247b();
        }
        if (this.f34140h != null && m3478i()) {
            abstractC11376e.mo1254a(f34130t);
            abstractC11376e.mo1256a(this.f34140h);
            abstractC11376e.mo1247b();
        }
        if (this.f34141i != null && m3477j()) {
            abstractC11376e.mo1254a(f34131u);
            abstractC11376e.mo1256a(this.f34141i);
            abstractC11376e.mo1247b();
        }
        if (this.f34142j != null && m3475l()) {
            abstractC11376e.mo1254a(f34132v);
            abstractC11376e.mo1256a(this.f34142j);
            abstractC11376e.mo1247b();
        }
        abstractC11376e.mo1246c();
        abstractC11376e.mo1261a();
    }

    /* renamed from: b */
    public boolean m3486b() {
        return this.f34134b != null;
    }

    /* renamed from: c */
    public boolean m3484c() {
        return this.f34135c != null;
    }

    /* renamed from: d */
    public boolean m3483d() {
        return this.f34136d != null;
    }

    /* renamed from: e */
    public boolean m3482e() {
        return this.f34137e != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C10797ap)) {
            return m3488a((C10797ap) obj);
        }
        return false;
    }

    /* renamed from: f */
    public boolean m3481f() {
        return this.f34143w.get(0);
    }

    /* renamed from: g */
    public boolean m3480g() {
        return this.f34139g != null;
    }

    /* renamed from: h */
    public String m3479h() {
        return this.f34140h;
    }

    public int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public boolean m3478i() {
        return this.f34140h != null;
    }

    /* renamed from: j */
    public boolean m3477j() {
        return this.f34141i != null;
    }

    /* renamed from: k */
    public String m3476k() {
        return this.f34142j;
    }

    /* renamed from: l */
    public boolean m3475l() {
        return this.f34142j != null;
    }

    /* renamed from: m */
    public void m3474m() {
        if (this.f34135c == null) {
            throw new C11377f("Required field 'id' was not present! Struct: " + toString());
        }
    }

    public String toString() {
        boolean z = false;
        StringBuilder sb = new StringBuilder("XmPushActionUnSubscriptionResult(");
        boolean z2 = true;
        if (m3489a()) {
            sb.append("debug:");
            if (this.f34133a == null) {
                sb.append("null");
            } else {
                sb.append(this.f34133a);
            }
            z2 = false;
        }
        if (m3486b()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("target:");
            if (this.f34134b == null) {
                sb.append("null");
            } else {
                sb.append(this.f34134b);
            }
        } else {
            z = z2;
        }
        if (!z) {
            sb.append(", ");
        }
        sb.append("id:");
        if (this.f34135c == null) {
            sb.append("null");
        } else {
            sb.append(this.f34135c);
        }
        if (m3483d()) {
            sb.append(", ");
            sb.append("appId:");
            if (this.f34136d == null) {
                sb.append("null");
            } else {
                sb.append(this.f34136d);
            }
        }
        if (m3482e()) {
            sb.append(", ");
            sb.append("request:");
            if (this.f34137e == null) {
                sb.append("null");
            } else {
                sb.append(this.f34137e);
            }
        }
        if (m3481f()) {
            sb.append(", ");
            sb.append("errorCode:");
            sb.append(this.f34138f);
        }
        if (m3480g()) {
            sb.append(", ");
            sb.append("reason:");
            if (this.f34139g == null) {
                sb.append("null");
            } else {
                sb.append(this.f34139g);
            }
        }
        if (m3478i()) {
            sb.append(", ");
            sb.append("topic:");
            if (this.f34140h == null) {
                sb.append("null");
            } else {
                sb.append(this.f34140h);
            }
        }
        if (m3477j()) {
            sb.append(", ");
            sb.append("packageName:");
            if (this.f34141i == null) {
                sb.append("null");
            } else {
                sb.append(this.f34141i);
            }
        }
        if (m3475l()) {
            sb.append(", ");
            sb.append("category:");
            if (this.f34142j == null) {
                sb.append("null");
            } else {
                sb.append(this.f34142j);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
