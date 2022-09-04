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
/* renamed from: com.xiaomi.xmpush.thrift.al */
/* loaded from: classes2.dex */
public class C10789al implements Serializable, Cloneable, AbstractC11361a<C10789al, EnumC10790a> {

    /* renamed from: k */
    public static final Map<EnumC10790a, C11363b> f33990k;

    /* renamed from: l */
    private static final C11381j f33991l = new C11381j("XmPushActionSubscriptionResult");

    /* renamed from: m */
    private static final C11373b f33992m = new C11373b(C10022a.f30894c, (byte) 11, 1);

    /* renamed from: n */
    private static final C11373b f33993n = new C11373b("target", (byte) 12, 2);

    /* renamed from: o */
    private static final C11373b f33994o = new C11373b("id", (byte) 11, 3);

    /* renamed from: p */
    private static final C11373b f33995p = new C11373b("appId", (byte) 11, 4);

    /* renamed from: q */
    private static final C11373b f33996q = new C11373b(SocialConstants.TYPE_REQUEST, (byte) 12, 5);

    /* renamed from: r */
    private static final C11373b f33997r = new C11373b("errorCode", (byte) 10, 6);

    /* renamed from: s */
    private static final C11373b f33998s = new C11373b("reason", (byte) 11, 7);

    /* renamed from: t */
    private static final C11373b f33999t = new C11373b("topic", (byte) 11, 8);

    /* renamed from: u */
    private static final C11373b f34000u = new C11373b(C10445j.f32447W, (byte) 11, 9);

    /* renamed from: v */
    private static final C11373b f34001v = new C11373b("category", (byte) 11, 10);

    /* renamed from: a */
    public String f34002a;

    /* renamed from: b */
    public C10831u f34003b;

    /* renamed from: c */
    public String f34004c;

    /* renamed from: d */
    public String f34005d;

    /* renamed from: e */
    public C10787ak f34006e;

    /* renamed from: f */
    public long f34007f;

    /* renamed from: g */
    public String f34008g;

    /* renamed from: h */
    public String f34009h;

    /* renamed from: i */
    public String f34010i;

    /* renamed from: j */
    public String f34011j;

    /* renamed from: w */
    private BitSet f34012w = new BitSet(1);

    /* renamed from: com.xiaomi.xmpush.thrift.al$a */
    /* loaded from: classes2.dex */
    public enum EnumC10790a {
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
        private static final Map<String, EnumC10790a> f34023k = new HashMap();

        /* renamed from: l */
        private final short f34025l;

        /* renamed from: m */
        private final String f34026m;

        static {
            Iterator it2 = EnumSet.allOf(EnumC10790a.class).iterator();
            while (it2.hasNext()) {
                EnumC10790a enumC10790a = (EnumC10790a) it2.next();
                f34023k.put(enumC10790a.m3538a(), enumC10790a);
            }
        }

        EnumC10790a(short s, String str) {
            this.f34025l = s;
            this.f34026m = str;
        }

        /* renamed from: a */
        public String m3538a() {
            return this.f34026m;
        }
    }

    static {
        EnumMap enumMap = new EnumMap(EnumC10790a.class);
        enumMap.put((EnumMap) EnumC10790a.DEBUG, (EnumC10790a) new C11363b(C10022a.f30894c, (byte) 2, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10790a.TARGET, (EnumC10790a) new C11363b("target", (byte) 2, new C11368g((byte) 12, C10831u.class)));
        enumMap.put((EnumMap) EnumC10790a.ID, (EnumC10790a) new C11363b("id", (byte) 1, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10790a.APP_ID, (EnumC10790a) new C11363b("appId", (byte) 2, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10790a.REQUEST, (EnumC10790a) new C11363b(SocialConstants.TYPE_REQUEST, (byte) 2, new C11368g((byte) 12, C10787ak.class)));
        enumMap.put((EnumMap) EnumC10790a.ERROR_CODE, (EnumC10790a) new C11363b("errorCode", (byte) 2, new C11364c((byte) 10)));
        enumMap.put((EnumMap) EnumC10790a.REASON, (EnumC10790a) new C11363b("reason", (byte) 2, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10790a.TOPIC, (EnumC10790a) new C11363b("topic", (byte) 2, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10790a.PACKAGE_NAME, (EnumC10790a) new C11363b(C10445j.f32447W, (byte) 2, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10790a.CATEGORY, (EnumC10790a) new C11363b("category", (byte) 2, new C11364c((byte) 11)));
        f33990k = Collections.unmodifiableMap(enumMap);
        C11363b.m1284a(C10789al.class, f33990k);
    }

    @Override // org.p286a.p321b.AbstractC11361a
    /* renamed from: a */
    public void mo1286a(AbstractC11376e abstractC11376e) {
        abstractC11376e.mo1242g();
        while (true) {
            C11373b mo1240i = abstractC11376e.mo1240i();
            if (mo1240i.f36479b == 0) {
                abstractC11376e.mo1241h();
                m3539m();
                return;
            }
            switch (mo1240i.f36480c) {
                case 1:
                    if (mo1240i.f36479b != 11) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f34002a = abstractC11376e.mo1223w();
                        break;
                    }
                case 2:
                    if (mo1240i.f36479b != 12) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f34003b = new C10831u();
                        this.f34003b.mo1286a(abstractC11376e);
                        break;
                    }
                case 3:
                    if (mo1240i.f36479b != 11) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f34004c = abstractC11376e.mo1223w();
                        break;
                    }
                case 4:
                    if (mo1240i.f36479b != 11) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f34005d = abstractC11376e.mo1223w();
                        break;
                    }
                case 5:
                    if (mo1240i.f36479b != 12) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f34006e = new C10787ak();
                        this.f34006e.mo1286a(abstractC11376e);
                        break;
                    }
                case 6:
                    if (mo1240i.f36479b != 10) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f34007f = abstractC11376e.mo1231u();
                        m3552a(true);
                        break;
                    }
                case 7:
                    if (mo1240i.f36479b != 11) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f34008g = abstractC11376e.mo1223w();
                        break;
                    }
                case 8:
                    if (mo1240i.f36479b != 11) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f34009h = abstractC11376e.mo1223w();
                        break;
                    }
                case 9:
                    if (mo1240i.f36479b != 11) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f34010i = abstractC11376e.mo1223w();
                        break;
                    }
                case 10:
                    if (mo1240i.f36479b != 11) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f34011j = abstractC11376e.mo1223w();
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
    public void m3552a(boolean z) {
        this.f34012w.set(0, z);
    }

    /* renamed from: a */
    public boolean m3554a() {
        return this.f34002a != null;
    }

    /* renamed from: a */
    public boolean m3553a(C10789al c10789al) {
        if (c10789al == null) {
            return false;
        }
        boolean m3554a = m3554a();
        boolean m3554a2 = c10789al.m3554a();
        if ((m3554a || m3554a2) && (!m3554a || !m3554a2 || !this.f34002a.equals(c10789al.f34002a))) {
            return false;
        }
        boolean m3551b = m3551b();
        boolean m3551b2 = c10789al.m3551b();
        if ((m3551b || m3551b2) && (!m3551b || !m3551b2 || !this.f34003b.m3254a(c10789al.f34003b))) {
            return false;
        }
        boolean m3549c = m3549c();
        boolean m3549c2 = c10789al.m3549c();
        if ((m3549c || m3549c2) && (!m3549c || !m3549c2 || !this.f34004c.equals(c10789al.f34004c))) {
            return false;
        }
        boolean m3548d = m3548d();
        boolean m3548d2 = c10789al.m3548d();
        if ((m3548d || m3548d2) && (!m3548d || !m3548d2 || !this.f34005d.equals(c10789al.f34005d))) {
            return false;
        }
        boolean m3547e = m3547e();
        boolean m3547e2 = c10789al.m3547e();
        if ((m3547e || m3547e2) && (!m3547e || !m3547e2 || !this.f34006e.m3569a(c10789al.f34006e))) {
            return false;
        }
        boolean m3546f = m3546f();
        boolean m3546f2 = c10789al.m3546f();
        if ((m3546f || m3546f2) && (!m3546f || !m3546f2 || this.f34007f != c10789al.f34007f)) {
            return false;
        }
        boolean m3545g = m3545g();
        boolean m3545g2 = c10789al.m3545g();
        if ((m3545g || m3545g2) && (!m3545g || !m3545g2 || !this.f34008g.equals(c10789al.f34008g))) {
            return false;
        }
        boolean m3543i = m3543i();
        boolean m3543i2 = c10789al.m3543i();
        if ((m3543i || m3543i2) && (!m3543i || !m3543i2 || !this.f34009h.equals(c10789al.f34009h))) {
            return false;
        }
        boolean m3542j = m3542j();
        boolean m3542j2 = c10789al.m3542j();
        if ((m3542j || m3542j2) && (!m3542j || !m3542j2 || !this.f34010i.equals(c10789al.f34010i))) {
            return false;
        }
        boolean m3540l = m3540l();
        boolean m3540l2 = c10789al.m3540l();
        return (!m3540l && !m3540l2) || (m3540l && m3540l2 && this.f34011j.equals(c10789al.f34011j));
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(C10789al c10789al) {
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
        if (!getClass().equals(c10789al.getClass())) {
            return getClass().getName().compareTo(c10789al.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m3554a()).compareTo(Boolean.valueOf(c10789al.m3554a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m3554a() && (m1277a7 = C11369b.m1277a(this.f34002a, c10789al.f34002a)) != 0) {
            return m1277a7;
        }
        int compareTo2 = Boolean.valueOf(m3551b()).compareTo(Boolean.valueOf(c10789al.m3551b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m3551b() && (m1278a2 = C11369b.m1278a(this.f34003b, c10789al.f34003b)) != 0) {
            return m1278a2;
        }
        int compareTo3 = Boolean.valueOf(m3549c()).compareTo(Boolean.valueOf(c10789al.m3549c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (m3549c() && (m1277a6 = C11369b.m1277a(this.f34004c, c10789al.f34004c)) != 0) {
            return m1277a6;
        }
        int compareTo4 = Boolean.valueOf(m3548d()).compareTo(Boolean.valueOf(c10789al.m3548d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (m3548d() && (m1277a5 = C11369b.m1277a(this.f34005d, c10789al.f34005d)) != 0) {
            return m1277a5;
        }
        int compareTo5 = Boolean.valueOf(m3547e()).compareTo(Boolean.valueOf(c10789al.m3547e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (m3547e() && (m1278a = C11369b.m1278a(this.f34006e, c10789al.f34006e)) != 0) {
            return m1278a;
        }
        int compareTo6 = Boolean.valueOf(m3546f()).compareTo(Boolean.valueOf(c10789al.m3546f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (m3546f() && (m1279a = C11369b.m1279a(this.f34007f, c10789al.f34007f)) != 0) {
            return m1279a;
        }
        int compareTo7 = Boolean.valueOf(m3545g()).compareTo(Boolean.valueOf(c10789al.m3545g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (m3545g() && (m1277a4 = C11369b.m1277a(this.f34008g, c10789al.f34008g)) != 0) {
            return m1277a4;
        }
        int compareTo8 = Boolean.valueOf(m3543i()).compareTo(Boolean.valueOf(c10789al.m3543i()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (m3543i() && (m1277a3 = C11369b.m1277a(this.f34009h, c10789al.f34009h)) != 0) {
            return m1277a3;
        }
        int compareTo9 = Boolean.valueOf(m3542j()).compareTo(Boolean.valueOf(c10789al.m3542j()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (m3542j() && (m1277a2 = C11369b.m1277a(this.f34010i, c10789al.f34010i)) != 0) {
            return m1277a2;
        }
        int compareTo10 = Boolean.valueOf(m3540l()).compareTo(Boolean.valueOf(c10789al.m3540l()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (m3540l() && (m1277a = C11369b.m1277a(this.f34011j, c10789al.f34011j)) != 0) {
            return m1277a;
        }
        return 0;
    }

    @Override // org.p286a.p321b.AbstractC11361a
    /* renamed from: b */
    public void mo1285b(AbstractC11376e abstractC11376e) {
        m3539m();
        abstractC11376e.mo1250a(f33991l);
        if (this.f34002a != null && m3554a()) {
            abstractC11376e.mo1254a(f33992m);
            abstractC11376e.mo1256a(this.f34002a);
            abstractC11376e.mo1247b();
        }
        if (this.f34003b != null && m3551b()) {
            abstractC11376e.mo1254a(f33993n);
            this.f34003b.mo1285b(abstractC11376e);
            abstractC11376e.mo1247b();
        }
        if (this.f34004c != null) {
            abstractC11376e.mo1254a(f33994o);
            abstractC11376e.mo1256a(this.f34004c);
            abstractC11376e.mo1247b();
        }
        if (this.f34005d != null && m3548d()) {
            abstractC11376e.mo1254a(f33995p);
            abstractC11376e.mo1256a(this.f34005d);
            abstractC11376e.mo1247b();
        }
        if (this.f34006e != null && m3547e()) {
            abstractC11376e.mo1254a(f33996q);
            this.f34006e.mo1285b(abstractC11376e);
            abstractC11376e.mo1247b();
        }
        if (m3546f()) {
            abstractC11376e.mo1254a(f33997r);
            abstractC11376e.mo1257a(this.f34007f);
            abstractC11376e.mo1247b();
        }
        if (this.f34008g != null && m3545g()) {
            abstractC11376e.mo1254a(f33998s);
            abstractC11376e.mo1256a(this.f34008g);
            abstractC11376e.mo1247b();
        }
        if (this.f34009h != null && m3543i()) {
            abstractC11376e.mo1254a(f33999t);
            abstractC11376e.mo1256a(this.f34009h);
            abstractC11376e.mo1247b();
        }
        if (this.f34010i != null && m3542j()) {
            abstractC11376e.mo1254a(f34000u);
            abstractC11376e.mo1256a(this.f34010i);
            abstractC11376e.mo1247b();
        }
        if (this.f34011j != null && m3540l()) {
            abstractC11376e.mo1254a(f34001v);
            abstractC11376e.mo1256a(this.f34011j);
            abstractC11376e.mo1247b();
        }
        abstractC11376e.mo1246c();
        abstractC11376e.mo1261a();
    }

    /* renamed from: b */
    public boolean m3551b() {
        return this.f34003b != null;
    }

    /* renamed from: c */
    public boolean m3549c() {
        return this.f34004c != null;
    }

    /* renamed from: d */
    public boolean m3548d() {
        return this.f34005d != null;
    }

    /* renamed from: e */
    public boolean m3547e() {
        return this.f34006e != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C10789al)) {
            return m3553a((C10789al) obj);
        }
        return false;
    }

    /* renamed from: f */
    public boolean m3546f() {
        return this.f34012w.get(0);
    }

    /* renamed from: g */
    public boolean m3545g() {
        return this.f34008g != null;
    }

    /* renamed from: h */
    public String m3544h() {
        return this.f34009h;
    }

    public int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public boolean m3543i() {
        return this.f34009h != null;
    }

    /* renamed from: j */
    public boolean m3542j() {
        return this.f34010i != null;
    }

    /* renamed from: k */
    public String m3541k() {
        return this.f34011j;
    }

    /* renamed from: l */
    public boolean m3540l() {
        return this.f34011j != null;
    }

    /* renamed from: m */
    public void m3539m() {
        if (this.f34004c == null) {
            throw new C11377f("Required field 'id' was not present! Struct: " + toString());
        }
    }

    public String toString() {
        boolean z = false;
        StringBuilder sb = new StringBuilder("XmPushActionSubscriptionResult(");
        boolean z2 = true;
        if (m3554a()) {
            sb.append("debug:");
            if (this.f34002a == null) {
                sb.append("null");
            } else {
                sb.append(this.f34002a);
            }
            z2 = false;
        }
        if (m3551b()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("target:");
            if (this.f34003b == null) {
                sb.append("null");
            } else {
                sb.append(this.f34003b);
            }
        } else {
            z = z2;
        }
        if (!z) {
            sb.append(", ");
        }
        sb.append("id:");
        if (this.f34004c == null) {
            sb.append("null");
        } else {
            sb.append(this.f34004c);
        }
        if (m3548d()) {
            sb.append(", ");
            sb.append("appId:");
            if (this.f34005d == null) {
                sb.append("null");
            } else {
                sb.append(this.f34005d);
            }
        }
        if (m3547e()) {
            sb.append(", ");
            sb.append("request:");
            if (this.f34006e == null) {
                sb.append("null");
            } else {
                sb.append(this.f34006e);
            }
        }
        if (m3546f()) {
            sb.append(", ");
            sb.append("errorCode:");
            sb.append(this.f34007f);
        }
        if (m3545g()) {
            sb.append(", ");
            sb.append("reason:");
            if (this.f34008g == null) {
                sb.append("null");
            } else {
                sb.append(this.f34008g);
            }
        }
        if (m3543i()) {
            sb.append(", ");
            sb.append("topic:");
            if (this.f34009h == null) {
                sb.append("null");
            } else {
                sb.append(this.f34009h);
            }
        }
        if (m3542j()) {
            sb.append(", ");
            sb.append("packageName:");
            if (this.f34010i == null) {
                sb.append("null");
            } else {
                sb.append(this.f34010i);
            }
        }
        if (m3540l()) {
            sb.append(", ");
            sb.append("category:");
            if (this.f34011j == null) {
                sb.append("null");
            } else {
                sb.append(this.f34011j);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
