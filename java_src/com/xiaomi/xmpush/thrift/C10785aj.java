package com.xiaomi.xmpush.thrift;

import com.p255mi.live.openlivesdk.C10022a;
import com.tencent.p263mm.sdk.message.RMsgInfoDB;
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
/* renamed from: com.xiaomi.xmpush.thrift.aj */
/* loaded from: classes2.dex */
public class C10785aj implements Serializable, Cloneable, AbstractC11361a<C10785aj, EnumC10786a> {

    /* renamed from: m */
    public static final Map<EnumC10786a, C11363b> f33920m;

    /* renamed from: n */
    private static final C11381j f33921n = new C11381j("XmPushActionSendMessage");

    /* renamed from: o */
    private static final C11373b f33922o = new C11373b(C10022a.f30894c, (byte) 11, 1);

    /* renamed from: p */
    private static final C11373b f33923p = new C11373b("target", (byte) 12, 2);

    /* renamed from: q */
    private static final C11373b f33924q = new C11373b("id", (byte) 11, 3);

    /* renamed from: r */
    private static final C11373b f33925r = new C11373b("appId", (byte) 11, 4);

    /* renamed from: s */
    private static final C11373b f33926s = new C11373b(C10445j.f32447W, (byte) 11, 5);

    /* renamed from: t */
    private static final C11373b f33927t = new C11373b("topic", (byte) 11, 6);

    /* renamed from: u */
    private static final C11373b f33928u = new C11373b("aliasName", (byte) 11, 7);

    /* renamed from: v */
    private static final C11373b f33929v = new C11373b(RMsgInfoDB.TABLE, (byte) 12, 8);

    /* renamed from: w */
    private static final C11373b f33930w = new C11373b("needAck", (byte) 2, 9);

    /* renamed from: x */
    private static final C11373b f33931x = new C11373b("params", (byte) 13, 10);

    /* renamed from: y */
    private static final C11373b f33932y = new C11373b("category", (byte) 11, 11);

    /* renamed from: z */
    private static final C11373b f33933z = new C11373b("userAccount", (byte) 11, 12);

    /* renamed from: a */
    public String f33935a;

    /* renamed from: b */
    public C10831u f33936b;

    /* renamed from: c */
    public String f33937c;

    /* renamed from: d */
    public String f33938d;

    /* renamed from: e */
    public String f33939e;

    /* renamed from: f */
    public String f33940f;

    /* renamed from: g */
    public String f33941g;

    /* renamed from: h */
    public C10824q f33942h;

    /* renamed from: j */
    public Map<String, String> f33944j;

    /* renamed from: k */
    public String f33945k;

    /* renamed from: l */
    public String f33946l;

    /* renamed from: A */
    private BitSet f33934A = new BitSet(1);

    /* renamed from: i */
    public boolean f33943i = true;

    /* renamed from: com.xiaomi.xmpush.thrift.aj$a */
    /* loaded from: classes2.dex */
    public enum EnumC10786a {
        DEBUG(1, C10022a.f30894c),
        TARGET(2, "target"),
        ID(3, "id"),
        APP_ID(4, "appId"),
        PACKAGE_NAME(5, C10445j.f32447W),
        TOPIC(6, "topic"),
        ALIAS_NAME(7, "aliasName"),
        MESSAGE(8, RMsgInfoDB.TABLE),
        NEED_ACK(9, "needAck"),
        PARAMS(10, "params"),
        CATEGORY(11, "category"),
        USER_ACCOUNT(12, "userAccount");
        

        /* renamed from: m */
        private static final Map<String, EnumC10786a> f33959m = new HashMap();

        /* renamed from: n */
        private final short f33961n;

        /* renamed from: o */
        private final String f33962o;

        static {
            Iterator it2 = EnumSet.allOf(EnumC10786a.class).iterator();
            while (it2.hasNext()) {
                EnumC10786a enumC10786a = (EnumC10786a) it2.next();
                f33959m.put(enumC10786a.m3571a(), enumC10786a);
            }
        }

        EnumC10786a(short s, String str) {
            this.f33961n = s;
            this.f33962o = str;
        }

        /* renamed from: a */
        public String m3571a() {
            return this.f33962o;
        }
    }

    static {
        EnumMap enumMap = new EnumMap(EnumC10786a.class);
        enumMap.put((EnumMap) EnumC10786a.DEBUG, (EnumC10786a) new C11363b(C10022a.f30894c, (byte) 2, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10786a.TARGET, (EnumC10786a) new C11363b("target", (byte) 2, new C11368g((byte) 12, C10831u.class)));
        enumMap.put((EnumMap) EnumC10786a.ID, (EnumC10786a) new C11363b("id", (byte) 1, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10786a.APP_ID, (EnumC10786a) new C11363b("appId", (byte) 1, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10786a.PACKAGE_NAME, (EnumC10786a) new C11363b(C10445j.f32447W, (byte) 2, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10786a.TOPIC, (EnumC10786a) new C11363b("topic", (byte) 2, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10786a.ALIAS_NAME, (EnumC10786a) new C11363b("aliasName", (byte) 2, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10786a.MESSAGE, (EnumC10786a) new C11363b(RMsgInfoDB.TABLE, (byte) 2, new C11368g((byte) 12, C10824q.class)));
        enumMap.put((EnumMap) EnumC10786a.NEED_ACK, (EnumC10786a) new C11363b("needAck", (byte) 2, new C11364c((byte) 2)));
        enumMap.put((EnumMap) EnumC10786a.PARAMS, (EnumC10786a) new C11363b("params", (byte) 2, new C11366e((byte) 13, new C11364c((byte) 11), new C11364c((byte) 11))));
        enumMap.put((EnumMap) EnumC10786a.CATEGORY, (EnumC10786a) new C11363b("category", (byte) 2, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10786a.USER_ACCOUNT, (EnumC10786a) new C11363b("userAccount", (byte) 2, new C11364c((byte) 11)));
        f33920m = Collections.unmodifiableMap(enumMap);
        C11363b.m1284a(C10785aj.class, f33920m);
    }

    @Override // org.p286a.p321b.AbstractC11361a
    /* renamed from: a */
    public void mo1286a(AbstractC11376e abstractC11376e) {
        abstractC11376e.mo1242g();
        while (true) {
            C11373b mo1240i = abstractC11376e.mo1240i();
            if (mo1240i.f36479b == 0) {
                abstractC11376e.mo1241h();
                m3572t();
                return;
            }
            switch (mo1240i.f36480c) {
                case 1:
                    if (mo1240i.f36479b == 11) {
                        this.f33935a = abstractC11376e.mo1223w();
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 2:
                    if (mo1240i.f36479b == 12) {
                        this.f33936b = new C10831u();
                        this.f33936b.mo1286a(abstractC11376e);
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 3:
                    if (mo1240i.f36479b == 11) {
                        this.f33937c = abstractC11376e.mo1223w();
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 4:
                    if (mo1240i.f36479b == 11) {
                        this.f33938d = abstractC11376e.mo1223w();
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 5:
                    if (mo1240i.f36479b == 11) {
                        this.f33939e = abstractC11376e.mo1223w();
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 6:
                    if (mo1240i.f36479b == 11) {
                        this.f33940f = abstractC11376e.mo1223w();
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 7:
                    if (mo1240i.f36479b == 11) {
                        this.f33941g = abstractC11376e.mo1223w();
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 8:
                    if (mo1240i.f36479b == 12) {
                        this.f33942h = new C10824q();
                        this.f33942h.mo1286a(abstractC11376e);
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 9:
                    if (mo1240i.f36479b == 2) {
                        this.f33943i = abstractC11376e.mo1235q();
                        m3592a(true);
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 10:
                    if (mo1240i.f36479b == 13) {
                        C11375d mo1226k = abstractC11376e.mo1226k();
                        this.f33944j = new HashMap(mo1226k.f36485c * 2);
                        for (int i = 0; i < mo1226k.f36485c; i++) {
                            this.f33944j.put(abstractC11376e.mo1223w(), abstractC11376e.mo1223w());
                        }
                        abstractC11376e.mo1238l();
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 11:
                    if (mo1240i.f36479b == 11) {
                        this.f33945k = abstractC11376e.mo1223w();
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 12:
                    if (mo1240i.f36479b == 11) {
                        this.f33946l = abstractC11376e.mo1223w();
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
    public void m3592a(boolean z) {
        this.f33934A.set(0, z);
    }

    /* renamed from: a */
    public boolean m3594a() {
        return this.f33935a != null;
    }

    /* renamed from: a */
    public boolean m3593a(C10785aj c10785aj) {
        if (c10785aj == null) {
            return false;
        }
        boolean m3594a = m3594a();
        boolean m3594a2 = c10785aj.m3594a();
        if ((m3594a || m3594a2) && (!m3594a || !m3594a2 || !this.f33935a.equals(c10785aj.f33935a))) {
            return false;
        }
        boolean m3591b = m3591b();
        boolean m3591b2 = c10785aj.m3591b();
        if ((m3591b || m3591b2) && (!m3591b || !m3591b2 || !this.f33936b.m3254a(c10785aj.f33936b))) {
            return false;
        }
        boolean m3588d = m3588d();
        boolean m3588d2 = c10785aj.m3588d();
        if ((m3588d || m3588d2) && (!m3588d || !m3588d2 || !this.f33937c.equals(c10785aj.f33937c))) {
            return false;
        }
        boolean m3586f = m3586f();
        boolean m3586f2 = c10785aj.m3586f();
        if ((m3586f || m3586f2) && (!m3586f || !m3586f2 || !this.f33938d.equals(c10785aj.f33938d))) {
            return false;
        }
        boolean m3585g = m3585g();
        boolean m3585g2 = c10785aj.m3585g();
        if ((m3585g || m3585g2) && (!m3585g || !m3585g2 || !this.f33939e.equals(c10785aj.f33939e))) {
            return false;
        }
        boolean m3583i = m3583i();
        boolean m3583i2 = c10785aj.m3583i();
        if ((m3583i || m3583i2) && (!m3583i || !m3583i2 || !this.f33940f.equals(c10785aj.f33940f))) {
            return false;
        }
        boolean m3581k = m3581k();
        boolean m3581k2 = c10785aj.m3581k();
        if ((m3581k || m3581k2) && (!m3581k || !m3581k2 || !this.f33941g.equals(c10785aj.f33941g))) {
            return false;
        }
        boolean m3579m = m3579m();
        boolean m3579m2 = c10785aj.m3579m();
        if ((m3579m || m3579m2) && (!m3579m || !m3579m2 || !this.f33942h.m3322a(c10785aj.f33942h))) {
            return false;
        }
        boolean m3578n = m3578n();
        boolean m3578n2 = c10785aj.m3578n();
        if ((m3578n || m3578n2) && (!m3578n || !m3578n2 || this.f33943i != c10785aj.f33943i)) {
            return false;
        }
        boolean m3577o = m3577o();
        boolean m3577o2 = c10785aj.m3577o();
        if ((m3577o || m3577o2) && (!m3577o || !m3577o2 || !this.f33944j.equals(c10785aj.f33944j))) {
            return false;
        }
        boolean m3575q = m3575q();
        boolean m3575q2 = c10785aj.m3575q();
        if ((m3575q || m3575q2) && (!m3575q || !m3575q2 || !this.f33945k.equals(c10785aj.f33945k))) {
            return false;
        }
        boolean m3573s = m3573s();
        boolean m3573s2 = c10785aj.m3573s();
        return (!m3573s && !m3573s2) || (m3573s && m3573s2 && this.f33946l.equals(c10785aj.f33946l));
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(C10785aj c10785aj) {
        int m1277a;
        int m1277a2;
        int m1272a;
        int m1269a;
        int m1278a;
        int m1277a3;
        int m1277a4;
        int m1277a5;
        int m1277a6;
        int m1277a7;
        int m1278a2;
        int m1277a8;
        if (!getClass().equals(c10785aj.getClass())) {
            return getClass().getName().compareTo(c10785aj.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m3594a()).compareTo(Boolean.valueOf(c10785aj.m3594a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m3594a() && (m1277a8 = C11369b.m1277a(this.f33935a, c10785aj.f33935a)) != 0) {
            return m1277a8;
        }
        int compareTo2 = Boolean.valueOf(m3591b()).compareTo(Boolean.valueOf(c10785aj.m3591b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m3591b() && (m1278a2 = C11369b.m1278a(this.f33936b, c10785aj.f33936b)) != 0) {
            return m1278a2;
        }
        int compareTo3 = Boolean.valueOf(m3588d()).compareTo(Boolean.valueOf(c10785aj.m3588d()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (m3588d() && (m1277a7 = C11369b.m1277a(this.f33937c, c10785aj.f33937c)) != 0) {
            return m1277a7;
        }
        int compareTo4 = Boolean.valueOf(m3586f()).compareTo(Boolean.valueOf(c10785aj.m3586f()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (m3586f() && (m1277a6 = C11369b.m1277a(this.f33938d, c10785aj.f33938d)) != 0) {
            return m1277a6;
        }
        int compareTo5 = Boolean.valueOf(m3585g()).compareTo(Boolean.valueOf(c10785aj.m3585g()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (m3585g() && (m1277a5 = C11369b.m1277a(this.f33939e, c10785aj.f33939e)) != 0) {
            return m1277a5;
        }
        int compareTo6 = Boolean.valueOf(m3583i()).compareTo(Boolean.valueOf(c10785aj.m3583i()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (m3583i() && (m1277a4 = C11369b.m1277a(this.f33940f, c10785aj.f33940f)) != 0) {
            return m1277a4;
        }
        int compareTo7 = Boolean.valueOf(m3581k()).compareTo(Boolean.valueOf(c10785aj.m3581k()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (m3581k() && (m1277a3 = C11369b.m1277a(this.f33941g, c10785aj.f33941g)) != 0) {
            return m1277a3;
        }
        int compareTo8 = Boolean.valueOf(m3579m()).compareTo(Boolean.valueOf(c10785aj.m3579m()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (m3579m() && (m1278a = C11369b.m1278a(this.f33942h, c10785aj.f33942h)) != 0) {
            return m1278a;
        }
        int compareTo9 = Boolean.valueOf(m3578n()).compareTo(Boolean.valueOf(c10785aj.m3578n()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (m3578n() && (m1269a = C11369b.m1269a(this.f33943i, c10785aj.f33943i)) != 0) {
            return m1269a;
        }
        int compareTo10 = Boolean.valueOf(m3577o()).compareTo(Boolean.valueOf(c10785aj.m3577o()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (m3577o() && (m1272a = C11369b.m1272a(this.f33944j, c10785aj.f33944j)) != 0) {
            return m1272a;
        }
        int compareTo11 = Boolean.valueOf(m3575q()).compareTo(Boolean.valueOf(c10785aj.m3575q()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (m3575q() && (m1277a2 = C11369b.m1277a(this.f33945k, c10785aj.f33945k)) != 0) {
            return m1277a2;
        }
        int compareTo12 = Boolean.valueOf(m3573s()).compareTo(Boolean.valueOf(c10785aj.m3573s()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (m3573s() && (m1277a = C11369b.m1277a(this.f33946l, c10785aj.f33946l)) != 0) {
            return m1277a;
        }
        return 0;
    }

    @Override // org.p286a.p321b.AbstractC11361a
    /* renamed from: b */
    public void mo1285b(AbstractC11376e abstractC11376e) {
        m3572t();
        abstractC11376e.mo1250a(f33921n);
        if (this.f33935a != null && m3594a()) {
            abstractC11376e.mo1254a(f33922o);
            abstractC11376e.mo1256a(this.f33935a);
            abstractC11376e.mo1247b();
        }
        if (this.f33936b != null && m3591b()) {
            abstractC11376e.mo1254a(f33923p);
            this.f33936b.mo1285b(abstractC11376e);
            abstractC11376e.mo1247b();
        }
        if (this.f33937c != null) {
            abstractC11376e.mo1254a(f33924q);
            abstractC11376e.mo1256a(this.f33937c);
            abstractC11376e.mo1247b();
        }
        if (this.f33938d != null) {
            abstractC11376e.mo1254a(f33925r);
            abstractC11376e.mo1256a(this.f33938d);
            abstractC11376e.mo1247b();
        }
        if (this.f33939e != null && m3585g()) {
            abstractC11376e.mo1254a(f33926s);
            abstractC11376e.mo1256a(this.f33939e);
            abstractC11376e.mo1247b();
        }
        if (this.f33940f != null && m3583i()) {
            abstractC11376e.mo1254a(f33927t);
            abstractC11376e.mo1256a(this.f33940f);
            abstractC11376e.mo1247b();
        }
        if (this.f33941g != null && m3581k()) {
            abstractC11376e.mo1254a(f33928u);
            abstractC11376e.mo1256a(this.f33941g);
            abstractC11376e.mo1247b();
        }
        if (this.f33942h != null && m3579m()) {
            abstractC11376e.mo1254a(f33929v);
            this.f33942h.mo1285b(abstractC11376e);
            abstractC11376e.mo1247b();
        }
        if (m3578n()) {
            abstractC11376e.mo1254a(f33930w);
            abstractC11376e.mo1248a(this.f33943i);
            abstractC11376e.mo1247b();
        }
        if (this.f33944j != null && m3577o()) {
            abstractC11376e.mo1254a(f33931x);
            abstractC11376e.mo1252a(new C11375d((byte) 11, (byte) 11, this.f33944j.size()));
            for (Map.Entry<String, String> entry : this.f33944j.entrySet()) {
                abstractC11376e.mo1256a(entry.getKey());
                abstractC11376e.mo1256a(entry.getValue());
            }
            abstractC11376e.mo1245d();
            abstractC11376e.mo1247b();
        }
        if (this.f33945k != null && m3575q()) {
            abstractC11376e.mo1254a(f33932y);
            abstractC11376e.mo1256a(this.f33945k);
            abstractC11376e.mo1247b();
        }
        if (this.f33946l != null && m3573s()) {
            abstractC11376e.mo1254a(f33933z);
            abstractC11376e.mo1256a(this.f33946l);
            abstractC11376e.mo1247b();
        }
        abstractC11376e.mo1246c();
        abstractC11376e.mo1261a();
    }

    /* renamed from: b */
    public boolean m3591b() {
        return this.f33936b != null;
    }

    /* renamed from: c */
    public String m3589c() {
        return this.f33937c;
    }

    /* renamed from: d */
    public boolean m3588d() {
        return this.f33937c != null;
    }

    /* renamed from: e */
    public String m3587e() {
        return this.f33938d;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C10785aj)) {
            return m3593a((C10785aj) obj);
        }
        return false;
    }

    /* renamed from: f */
    public boolean m3586f() {
        return this.f33938d != null;
    }

    /* renamed from: g */
    public boolean m3585g() {
        return this.f33939e != null;
    }

    /* renamed from: h */
    public String m3584h() {
        return this.f33940f;
    }

    public int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public boolean m3583i() {
        return this.f33940f != null;
    }

    /* renamed from: j */
    public String m3582j() {
        return this.f33941g;
    }

    /* renamed from: k */
    public boolean m3581k() {
        return this.f33941g != null;
    }

    /* renamed from: l */
    public C10824q m3580l() {
        return this.f33942h;
    }

    /* renamed from: m */
    public boolean m3579m() {
        return this.f33942h != null;
    }

    /* renamed from: n */
    public boolean m3578n() {
        return this.f33934A.get(0);
    }

    /* renamed from: o */
    public boolean m3577o() {
        return this.f33944j != null;
    }

    /* renamed from: p */
    public String m3576p() {
        return this.f33945k;
    }

    /* renamed from: q */
    public boolean m3575q() {
        return this.f33945k != null;
    }

    /* renamed from: r */
    public String m3574r() {
        return this.f33946l;
    }

    /* renamed from: s */
    public boolean m3573s() {
        return this.f33946l != null;
    }

    /* renamed from: t */
    public void m3572t() {
        if (this.f33937c == null) {
            throw new C11377f("Required field 'id' was not present! Struct: " + toString());
        }
        if (this.f33938d != null) {
            return;
        }
        throw new C11377f("Required field 'appId' was not present! Struct: " + toString());
    }

    public String toString() {
        boolean z = false;
        StringBuilder sb = new StringBuilder("XmPushActionSendMessage(");
        boolean z2 = true;
        if (m3594a()) {
            sb.append("debug:");
            if (this.f33935a == null) {
                sb.append("null");
            } else {
                sb.append(this.f33935a);
            }
            z2 = false;
        }
        if (m3591b()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("target:");
            if (this.f33936b == null) {
                sb.append("null");
            } else {
                sb.append(this.f33936b);
            }
        } else {
            z = z2;
        }
        if (!z) {
            sb.append(", ");
        }
        sb.append("id:");
        if (this.f33937c == null) {
            sb.append("null");
        } else {
            sb.append(this.f33937c);
        }
        sb.append(", ");
        sb.append("appId:");
        if (this.f33938d == null) {
            sb.append("null");
        } else {
            sb.append(this.f33938d);
        }
        if (m3585g()) {
            sb.append(", ");
            sb.append("packageName:");
            if (this.f33939e == null) {
                sb.append("null");
            } else {
                sb.append(this.f33939e);
            }
        }
        if (m3583i()) {
            sb.append(", ");
            sb.append("topic:");
            if (this.f33940f == null) {
                sb.append("null");
            } else {
                sb.append(this.f33940f);
            }
        }
        if (m3581k()) {
            sb.append(", ");
            sb.append("aliasName:");
            if (this.f33941g == null) {
                sb.append("null");
            } else {
                sb.append(this.f33941g);
            }
        }
        if (m3579m()) {
            sb.append(", ");
            sb.append("message:");
            if (this.f33942h == null) {
                sb.append("null");
            } else {
                sb.append(this.f33942h);
            }
        }
        if (m3578n()) {
            sb.append(", ");
            sb.append("needAck:");
            sb.append(this.f33943i);
        }
        if (m3577o()) {
            sb.append(", ");
            sb.append("params:");
            if (this.f33944j == null) {
                sb.append("null");
            } else {
                sb.append(this.f33944j);
            }
        }
        if (m3575q()) {
            sb.append(", ");
            sb.append("category:");
            if (this.f33945k == null) {
                sb.append("null");
            } else {
                sb.append(this.f33945k);
            }
        }
        if (m3573s()) {
            sb.append(", ");
            sb.append("userAccount:");
            if (this.f33946l == null) {
                sb.append("null");
            } else {
                sb.append(this.f33946l);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
