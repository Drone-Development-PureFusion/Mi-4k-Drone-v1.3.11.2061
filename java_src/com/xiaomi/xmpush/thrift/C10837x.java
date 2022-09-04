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
import org.p286a.p321b.p322a.C11366e;
import org.p286a.p321b.p322a.C11368g;
import org.p286a.p321b.p323b.AbstractC11376e;
import org.p286a.p321b.p323b.C11373b;
import org.p286a.p321b.p323b.C11375d;
import org.p286a.p321b.p323b.C11377f;
import org.p286a.p321b.p323b.C11379h;
import org.p286a.p321b.p323b.C11381j;
/* renamed from: com.xiaomi.xmpush.thrift.x */
/* loaded from: classes2.dex */
public class C10837x implements Serializable, Cloneable, AbstractC11361a<C10837x, EnumC10838a> {

    /* renamed from: l */
    public static final Map<EnumC10838a, C11363b> f34640l;

    /* renamed from: m */
    private static final C11381j f34641m = new C11381j("XmPushActionAckNotification");

    /* renamed from: n */
    private static final C11373b f34642n = new C11373b(C10022a.f30894c, (byte) 11, 1);

    /* renamed from: o */
    private static final C11373b f34643o = new C11373b("target", (byte) 12, 2);

    /* renamed from: p */
    private static final C11373b f34644p = new C11373b("id", (byte) 11, 3);

    /* renamed from: q */
    private static final C11373b f34645q = new C11373b("appId", (byte) 11, 4);

    /* renamed from: r */
    private static final C11373b f34646r = new C11373b("type", (byte) 11, 5);

    /* renamed from: s */
    private static final C11373b f34647s = new C11373b(SocialConstants.TYPE_REQUEST, (byte) 12, 6);

    /* renamed from: t */
    private static final C11373b f34648t = new C11373b("errorCode", (byte) 10, 7);

    /* renamed from: u */
    private static final C11373b f34649u = new C11373b("reason", (byte) 11, 8);

    /* renamed from: v */
    private static final C11373b f34650v = new C11373b("extra", (byte) 13, 9);

    /* renamed from: w */
    private static final C11373b f34651w = new C11373b(C10445j.f32447W, (byte) 11, 10);

    /* renamed from: x */
    private static final C11373b f34652x = new C11373b("category", (byte) 11, 11);

    /* renamed from: a */
    public String f34653a;

    /* renamed from: b */
    public C10831u f34654b;

    /* renamed from: c */
    public String f34655c;

    /* renamed from: d */
    public String f34656d;

    /* renamed from: e */
    public String f34657e;

    /* renamed from: f */
    public C10775ae f34658f;

    /* renamed from: g */
    public long f34659g;

    /* renamed from: h */
    public String f34660h;

    /* renamed from: i */
    public Map<String, String> f34661i;

    /* renamed from: j */
    public String f34662j;

    /* renamed from: k */
    public String f34663k;

    /* renamed from: y */
    private BitSet f34664y = new BitSet(1);

    /* renamed from: com.xiaomi.xmpush.thrift.x$a */
    /* loaded from: classes2.dex */
    public enum EnumC10838a {
        DEBUG(1, C10022a.f30894c),
        TARGET(2, "target"),
        ID(3, "id"),
        APP_ID(4, "appId"),
        TYPE(5, "type"),
        REQUEST(6, SocialConstants.TYPE_REQUEST),
        ERROR_CODE(7, "errorCode"),
        REASON(8, "reason"),
        EXTRA(9, "extra"),
        PACKAGE_NAME(10, C10445j.f32447W),
        CATEGORY(11, "category");
        

        /* renamed from: l */
        private static final Map<String, EnumC10838a> f34676l = new HashMap();

        /* renamed from: m */
        private final short f34678m;

        /* renamed from: n */
        private final String f34679n;

        static {
            Iterator it2 = EnumSet.allOf(EnumC10838a.class).iterator();
            while (it2.hasNext()) {
                EnumC10838a enumC10838a = (EnumC10838a) it2.next();
                f34676l.put(enumC10838a.m3181a(), enumC10838a);
            }
        }

        EnumC10838a(short s, String str) {
            this.f34678m = s;
            this.f34679n = str;
        }

        /* renamed from: a */
        public String m3181a() {
            return this.f34679n;
        }
    }

    static {
        EnumMap enumMap = new EnumMap(EnumC10838a.class);
        enumMap.put((EnumMap) EnumC10838a.DEBUG, (EnumC10838a) new C11363b(C10022a.f30894c, (byte) 2, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10838a.TARGET, (EnumC10838a) new C11363b("target", (byte) 2, new C11368g((byte) 12, C10831u.class)));
        enumMap.put((EnumMap) EnumC10838a.ID, (EnumC10838a) new C11363b("id", (byte) 1, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10838a.APP_ID, (EnumC10838a) new C11363b("appId", (byte) 2, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10838a.TYPE, (EnumC10838a) new C11363b("type", (byte) 2, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10838a.REQUEST, (EnumC10838a) new C11363b(SocialConstants.TYPE_REQUEST, (byte) 2, new C11368g((byte) 12, C10775ae.class)));
        enumMap.put((EnumMap) EnumC10838a.ERROR_CODE, (EnumC10838a) new C11363b("errorCode", (byte) 1, new C11364c((byte) 10)));
        enumMap.put((EnumMap) EnumC10838a.REASON, (EnumC10838a) new C11363b("reason", (byte) 2, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10838a.EXTRA, (EnumC10838a) new C11363b("extra", (byte) 2, new C11366e((byte) 13, new C11364c((byte) 11), new C11364c((byte) 11))));
        enumMap.put((EnumMap) EnumC10838a.PACKAGE_NAME, (EnumC10838a) new C11363b(C10445j.f32447W, (byte) 2, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10838a.CATEGORY, (EnumC10838a) new C11363b("category", (byte) 2, new C11364c((byte) 11)));
        f34640l = Collections.unmodifiableMap(enumMap);
        C11363b.m1284a(C10837x.class, f34640l);
    }

    @Override // org.p286a.p321b.AbstractC11361a
    /* renamed from: a */
    public void mo1286a(AbstractC11376e abstractC11376e) {
        abstractC11376e.mo1242g();
        while (true) {
            C11373b mo1240i = abstractC11376e.mo1240i();
            if (mo1240i.f36479b == 0) {
                abstractC11376e.mo1241h();
                if (!m3187h()) {
                    throw new C11377f("Required field 'errorCode' was not found in serialized data! Struct: " + toString());
                }
                m3182m();
                return;
            }
            switch (mo1240i.f36480c) {
                case 1:
                    if (mo1240i.f36479b == 11) {
                        this.f34653a = abstractC11376e.mo1223w();
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 2:
                    if (mo1240i.f36479b == 12) {
                        this.f34654b = new C10831u();
                        this.f34654b.mo1286a(abstractC11376e);
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 3:
                    if (mo1240i.f36479b == 11) {
                        this.f34655c = abstractC11376e.mo1223w();
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 4:
                    if (mo1240i.f36479b == 11) {
                        this.f34656d = abstractC11376e.mo1223w();
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 5:
                    if (mo1240i.f36479b == 11) {
                        this.f34657e = abstractC11376e.mo1223w();
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 6:
                    if (mo1240i.f36479b == 12) {
                        this.f34658f = new C10775ae();
                        this.f34658f.mo1286a(abstractC11376e);
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 7:
                    if (mo1240i.f36479b == 10) {
                        this.f34659g = abstractC11376e.mo1231u();
                        m3195a(true);
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 8:
                    if (mo1240i.f36479b == 11) {
                        this.f34660h = abstractC11376e.mo1223w();
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 9:
                    if (mo1240i.f36479b == 13) {
                        C11375d mo1226k = abstractC11376e.mo1226k();
                        this.f34661i = new HashMap(mo1226k.f36485c * 2);
                        for (int i = 0; i < mo1226k.f36485c; i++) {
                            this.f34661i.put(abstractC11376e.mo1223w(), abstractC11376e.mo1223w());
                        }
                        abstractC11376e.mo1238l();
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 10:
                    if (mo1240i.f36479b == 11) {
                        this.f34662j = abstractC11376e.mo1223w();
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 11:
                    if (mo1240i.f36479b == 11) {
                        this.f34663k = abstractC11376e.mo1223w();
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
    public void m3195a(boolean z) {
        this.f34664y.set(0, z);
    }

    /* renamed from: a */
    public boolean m3197a() {
        return this.f34653a != null;
    }

    /* renamed from: a */
    public boolean m3196a(C10837x c10837x) {
        if (c10837x == null) {
            return false;
        }
        boolean m3197a = m3197a();
        boolean m3197a2 = c10837x.m3197a();
        if ((m3197a || m3197a2) && (!m3197a || !m3197a2 || !this.f34653a.equals(c10837x.f34653a))) {
            return false;
        }
        boolean m3194b = m3194b();
        boolean m3194b2 = c10837x.m3194b();
        if ((m3194b || m3194b2) && (!m3194b || !m3194b2 || !this.f34654b.m3254a(c10837x.f34654b))) {
            return false;
        }
        boolean m3191d = m3191d();
        boolean m3191d2 = c10837x.m3191d();
        if ((m3191d || m3191d2) && (!m3191d || !m3191d2 || !this.f34655c.equals(c10837x.f34655c))) {
            return false;
        }
        boolean m3190e = m3190e();
        boolean m3190e2 = c10837x.m3190e();
        if ((m3190e || m3190e2) && (!m3190e || !m3190e2 || !this.f34656d.equals(c10837x.f34656d))) {
            return false;
        }
        boolean m3189f = m3189f();
        boolean m3189f2 = c10837x.m3189f();
        if ((m3189f || m3189f2) && (!m3189f || !m3189f2 || !this.f34657e.equals(c10837x.f34657e))) {
            return false;
        }
        boolean m3188g = m3188g();
        boolean m3188g2 = c10837x.m3188g();
        if (((m3188g || m3188g2) && (!m3188g || !m3188g2 || !this.f34658f.m3707a(c10837x.f34658f))) || this.f34659g != c10837x.f34659g) {
            return false;
        }
        boolean m3186i = m3186i();
        boolean m3186i2 = c10837x.m3186i();
        if ((m3186i || m3186i2) && (!m3186i || !m3186i2 || !this.f34660h.equals(c10837x.f34660h))) {
            return false;
        }
        boolean m3185j = m3185j();
        boolean m3185j2 = c10837x.m3185j();
        if ((m3185j || m3185j2) && (!m3185j || !m3185j2 || !this.f34661i.equals(c10837x.f34661i))) {
            return false;
        }
        boolean m3184k = m3184k();
        boolean m3184k2 = c10837x.m3184k();
        if ((m3184k || m3184k2) && (!m3184k || !m3184k2 || !this.f34662j.equals(c10837x.f34662j))) {
            return false;
        }
        boolean m3183l = m3183l();
        boolean m3183l2 = c10837x.m3183l();
        return (!m3183l && !m3183l2) || (m3183l && m3183l2 && this.f34663k.equals(c10837x.f34663k));
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(C10837x c10837x) {
        int m1277a;
        int m1277a2;
        int m1272a;
        int m1277a3;
        int m1279a;
        int m1278a;
        int m1277a4;
        int m1277a5;
        int m1277a6;
        int m1278a2;
        int m1277a7;
        if (!getClass().equals(c10837x.getClass())) {
            return getClass().getName().compareTo(c10837x.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m3197a()).compareTo(Boolean.valueOf(c10837x.m3197a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m3197a() && (m1277a7 = C11369b.m1277a(this.f34653a, c10837x.f34653a)) != 0) {
            return m1277a7;
        }
        int compareTo2 = Boolean.valueOf(m3194b()).compareTo(Boolean.valueOf(c10837x.m3194b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m3194b() && (m1278a2 = C11369b.m1278a(this.f34654b, c10837x.f34654b)) != 0) {
            return m1278a2;
        }
        int compareTo3 = Boolean.valueOf(m3191d()).compareTo(Boolean.valueOf(c10837x.m3191d()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (m3191d() && (m1277a6 = C11369b.m1277a(this.f34655c, c10837x.f34655c)) != 0) {
            return m1277a6;
        }
        int compareTo4 = Boolean.valueOf(m3190e()).compareTo(Boolean.valueOf(c10837x.m3190e()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (m3190e() && (m1277a5 = C11369b.m1277a(this.f34656d, c10837x.f34656d)) != 0) {
            return m1277a5;
        }
        int compareTo5 = Boolean.valueOf(m3189f()).compareTo(Boolean.valueOf(c10837x.m3189f()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (m3189f() && (m1277a4 = C11369b.m1277a(this.f34657e, c10837x.f34657e)) != 0) {
            return m1277a4;
        }
        int compareTo6 = Boolean.valueOf(m3188g()).compareTo(Boolean.valueOf(c10837x.m3188g()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (m3188g() && (m1278a = C11369b.m1278a(this.f34658f, c10837x.f34658f)) != 0) {
            return m1278a;
        }
        int compareTo7 = Boolean.valueOf(m3187h()).compareTo(Boolean.valueOf(c10837x.m3187h()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (m3187h() && (m1279a = C11369b.m1279a(this.f34659g, c10837x.f34659g)) != 0) {
            return m1279a;
        }
        int compareTo8 = Boolean.valueOf(m3186i()).compareTo(Boolean.valueOf(c10837x.m3186i()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (m3186i() && (m1277a3 = C11369b.m1277a(this.f34660h, c10837x.f34660h)) != 0) {
            return m1277a3;
        }
        int compareTo9 = Boolean.valueOf(m3185j()).compareTo(Boolean.valueOf(c10837x.m3185j()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (m3185j() && (m1272a = C11369b.m1272a(this.f34661i, c10837x.f34661i)) != 0) {
            return m1272a;
        }
        int compareTo10 = Boolean.valueOf(m3184k()).compareTo(Boolean.valueOf(c10837x.m3184k()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (m3184k() && (m1277a2 = C11369b.m1277a(this.f34662j, c10837x.f34662j)) != 0) {
            return m1277a2;
        }
        int compareTo11 = Boolean.valueOf(m3183l()).compareTo(Boolean.valueOf(c10837x.m3183l()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (m3183l() && (m1277a = C11369b.m1277a(this.f34663k, c10837x.f34663k)) != 0) {
            return m1277a;
        }
        return 0;
    }

    @Override // org.p286a.p321b.AbstractC11361a
    /* renamed from: b */
    public void mo1285b(AbstractC11376e abstractC11376e) {
        m3182m();
        abstractC11376e.mo1250a(f34641m);
        if (this.f34653a != null && m3197a()) {
            abstractC11376e.mo1254a(f34642n);
            abstractC11376e.mo1256a(this.f34653a);
            abstractC11376e.mo1247b();
        }
        if (this.f34654b != null && m3194b()) {
            abstractC11376e.mo1254a(f34643o);
            this.f34654b.mo1285b(abstractC11376e);
            abstractC11376e.mo1247b();
        }
        if (this.f34655c != null) {
            abstractC11376e.mo1254a(f34644p);
            abstractC11376e.mo1256a(this.f34655c);
            abstractC11376e.mo1247b();
        }
        if (this.f34656d != null && m3190e()) {
            abstractC11376e.mo1254a(f34645q);
            abstractC11376e.mo1256a(this.f34656d);
            abstractC11376e.mo1247b();
        }
        if (this.f34657e != null && m3189f()) {
            abstractC11376e.mo1254a(f34646r);
            abstractC11376e.mo1256a(this.f34657e);
            abstractC11376e.mo1247b();
        }
        if (this.f34658f != null && m3188g()) {
            abstractC11376e.mo1254a(f34647s);
            this.f34658f.mo1285b(abstractC11376e);
            abstractC11376e.mo1247b();
        }
        abstractC11376e.mo1254a(f34648t);
        abstractC11376e.mo1257a(this.f34659g);
        abstractC11376e.mo1247b();
        if (this.f34660h != null && m3186i()) {
            abstractC11376e.mo1254a(f34649u);
            abstractC11376e.mo1256a(this.f34660h);
            abstractC11376e.mo1247b();
        }
        if (this.f34661i != null && m3185j()) {
            abstractC11376e.mo1254a(f34650v);
            abstractC11376e.mo1252a(new C11375d((byte) 11, (byte) 11, this.f34661i.size()));
            for (Map.Entry<String, String> entry : this.f34661i.entrySet()) {
                abstractC11376e.mo1256a(entry.getKey());
                abstractC11376e.mo1256a(entry.getValue());
            }
            abstractC11376e.mo1245d();
            abstractC11376e.mo1247b();
        }
        if (this.f34662j != null && m3184k()) {
            abstractC11376e.mo1254a(f34651w);
            abstractC11376e.mo1256a(this.f34662j);
            abstractC11376e.mo1247b();
        }
        if (this.f34663k != null && m3183l()) {
            abstractC11376e.mo1254a(f34652x);
            abstractC11376e.mo1256a(this.f34663k);
            abstractC11376e.mo1247b();
        }
        abstractC11376e.mo1246c();
        abstractC11376e.mo1261a();
    }

    /* renamed from: b */
    public boolean m3194b() {
        return this.f34654b != null;
    }

    /* renamed from: c */
    public String m3192c() {
        return this.f34655c;
    }

    /* renamed from: d */
    public boolean m3191d() {
        return this.f34655c != null;
    }

    /* renamed from: e */
    public boolean m3190e() {
        return this.f34656d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C10837x)) {
            return m3196a((C10837x) obj);
        }
        return false;
    }

    /* renamed from: f */
    public boolean m3189f() {
        return this.f34657e != null;
    }

    /* renamed from: g */
    public boolean m3188g() {
        return this.f34658f != null;
    }

    /* renamed from: h */
    public boolean m3187h() {
        return this.f34664y.get(0);
    }

    public int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public boolean m3186i() {
        return this.f34660h != null;
    }

    /* renamed from: j */
    public boolean m3185j() {
        return this.f34661i != null;
    }

    /* renamed from: k */
    public boolean m3184k() {
        return this.f34662j != null;
    }

    /* renamed from: l */
    public boolean m3183l() {
        return this.f34663k != null;
    }

    /* renamed from: m */
    public void m3182m() {
        if (this.f34655c == null) {
            throw new C11377f("Required field 'id' was not present! Struct: " + toString());
        }
    }

    public String toString() {
        boolean z = false;
        StringBuilder sb = new StringBuilder("XmPushActionAckNotification(");
        boolean z2 = true;
        if (m3197a()) {
            sb.append("debug:");
            if (this.f34653a == null) {
                sb.append("null");
            } else {
                sb.append(this.f34653a);
            }
            z2 = false;
        }
        if (m3194b()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("target:");
            if (this.f34654b == null) {
                sb.append("null");
            } else {
                sb.append(this.f34654b);
            }
        } else {
            z = z2;
        }
        if (!z) {
            sb.append(", ");
        }
        sb.append("id:");
        if (this.f34655c == null) {
            sb.append("null");
        } else {
            sb.append(this.f34655c);
        }
        if (m3190e()) {
            sb.append(", ");
            sb.append("appId:");
            if (this.f34656d == null) {
                sb.append("null");
            } else {
                sb.append(this.f34656d);
            }
        }
        if (m3189f()) {
            sb.append(", ");
            sb.append("type:");
            if (this.f34657e == null) {
                sb.append("null");
            } else {
                sb.append(this.f34657e);
            }
        }
        if (m3188g()) {
            sb.append(", ");
            sb.append("request:");
            if (this.f34658f == null) {
                sb.append("null");
            } else {
                sb.append(this.f34658f);
            }
        }
        sb.append(", ");
        sb.append("errorCode:");
        sb.append(this.f34659g);
        if (m3186i()) {
            sb.append(", ");
            sb.append("reason:");
            if (this.f34660h == null) {
                sb.append("null");
            } else {
                sb.append(this.f34660h);
            }
        }
        if (m3185j()) {
            sb.append(", ");
            sb.append("extra:");
            if (this.f34661i == null) {
                sb.append("null");
            } else {
                sb.append(this.f34661i);
            }
        }
        if (m3184k()) {
            sb.append(", ");
            sb.append("packageName:");
            if (this.f34662j == null) {
                sb.append("null");
            } else {
                sb.append(this.f34662j);
            }
        }
        if (m3183l()) {
            sb.append(", ");
            sb.append("category:");
            if (this.f34663k == null) {
                sb.append("null");
            } else {
                sb.append(this.f34663k);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
