package com.xiaomi.xmpush.thrift;

import com.fimi.soul.utils.p219a.C3070c;
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
/* renamed from: com.xiaomi.xmpush.thrift.w */
/* loaded from: classes2.dex */
public class C10835w implements Serializable, Cloneable, AbstractC11361a<C10835w, EnumC10836a> {

    /* renamed from: u */
    public static final Map<EnumC10836a, C11363b> f34589u;

    /* renamed from: a */
    public String f34596a;

    /* renamed from: b */
    public C10831u f34597b;

    /* renamed from: c */
    public String f34598c;

    /* renamed from: d */
    public String f34599d;

    /* renamed from: e */
    public long f34600e;

    /* renamed from: f */
    public String f34601f;

    /* renamed from: g */
    public String f34602g;

    /* renamed from: h */
    public C10785aj f34603h;

    /* renamed from: i */
    public String f34604i;

    /* renamed from: j */
    public String f34605j;

    /* renamed from: l */
    public String f34607l;

    /* renamed from: m */
    public String f34608m;

    /* renamed from: n */
    public String f34609n;

    /* renamed from: o */
    public short f34610o;

    /* renamed from: p */
    public short f34611p;

    /* renamed from: q */
    public String f34612q;

    /* renamed from: r */
    public String f34613r;

    /* renamed from: s */
    public int f34614s;

    /* renamed from: t */
    public Map<String, String> f34615t;

    /* renamed from: v */
    private static final C11381j f34590v = new C11381j("XmPushActionAckMessage");

    /* renamed from: w */
    private static final C11373b f34591w = new C11373b(C10022a.f30894c, (byte) 11, 1);

    /* renamed from: x */
    private static final C11373b f34592x = new C11373b("target", (byte) 12, 2);

    /* renamed from: y */
    private static final C11373b f34593y = new C11373b("id", (byte) 11, 3);

    /* renamed from: z */
    private static final C11373b f34594z = new C11373b("appId", (byte) 11, 4);

    /* renamed from: A */
    private static final C11373b f34573A = new C11373b("messageTs", (byte) 10, 5);

    /* renamed from: B */
    private static final C11373b f34574B = new C11373b("topic", (byte) 11, 6);

    /* renamed from: C */
    private static final C11373b f34575C = new C11373b("aliasName", (byte) 11, 7);

    /* renamed from: D */
    private static final C11373b f34576D = new C11373b(SocialConstants.TYPE_REQUEST, (byte) 12, 8);

    /* renamed from: E */
    private static final C11373b f34577E = new C11373b(C10445j.f32447W, (byte) 11, 9);

    /* renamed from: F */
    private static final C11373b f34578F = new C11373b("category", (byte) 11, 10);

    /* renamed from: G */
    private static final C11373b f34579G = new C11373b("isOnline", (byte) 2, 11);

    /* renamed from: H */
    private static final C11373b f34580H = new C11373b("regId", (byte) 11, 12);

    /* renamed from: I */
    private static final C11373b f34581I = new C11373b("callbackUrl", (byte) 11, 13);

    /* renamed from: J */
    private static final C11373b f34582J = new C11373b("userAccount", (byte) 11, 14);

    /* renamed from: K */
    private static final C11373b f34583K = new C11373b("deviceStatus", (byte) 6, 15);

    /* renamed from: L */
    private static final C11373b f34584L = new C11373b("geoMsgStatus", (byte) 6, 16);

    /* renamed from: M */
    private static final C11373b f34585M = new C11373b("imeiMd5", (byte) 11, 20);

    /* renamed from: N */
    private static final C11373b f34586N = new C11373b(C10445j.f32473as, (byte) 11, 21);

    /* renamed from: O */
    private static final C11373b f34587O = new C11373b(C3070c.C3071a.f11502f, (byte) 8, 22);

    /* renamed from: P */
    private static final C11373b f34588P = new C11373b("extra", (byte) 13, 23);

    /* renamed from: Q */
    private BitSet f34595Q = new BitSet(5);

    /* renamed from: k */
    public boolean f34606k = false;

    /* renamed from: com.xiaomi.xmpush.thrift.w$a */
    /* loaded from: classes2.dex */
    public enum EnumC10836a {
        DEBUG(1, C10022a.f30894c),
        TARGET(2, "target"),
        ID(3, "id"),
        APP_ID(4, "appId"),
        MESSAGE_TS(5, "messageTs"),
        TOPIC(6, "topic"),
        ALIAS_NAME(7, "aliasName"),
        REQUEST(8, SocialConstants.TYPE_REQUEST),
        PACKAGE_NAME(9, C10445j.f32447W),
        CATEGORY(10, "category"),
        IS_ONLINE(11, "isOnline"),
        REG_ID(12, "regId"),
        CALLBACK_URL(13, "callbackUrl"),
        USER_ACCOUNT(14, "userAccount"),
        DEVICE_STATUS(15, "deviceStatus"),
        GEO_MSG_STATUS(16, "geoMsgStatus"),
        IMEI_MD5(20, "imeiMd5"),
        DEVICE_ID(21, C10445j.f32473as),
        PASS_THROUGH(22, C3070c.C3071a.f11502f),
        EXTRA(23, "extra");
        

        /* renamed from: u */
        private static final Map<String, EnumC10836a> f34636u = new HashMap();

        /* renamed from: v */
        private final short f34638v;

        /* renamed from: w */
        private final String f34639w;

        static {
            Iterator it2 = EnumSet.allOf(EnumC10836a.class).iterator();
            while (it2.hasNext()) {
                EnumC10836a enumC10836a = (EnumC10836a) it2.next();
                f34636u.put(enumC10836a.m3198a(), enumC10836a);
            }
        }

        EnumC10836a(short s, String str) {
            this.f34638v = s;
            this.f34639w = str;
        }

        /* renamed from: a */
        public String m3198a() {
            return this.f34639w;
        }
    }

    static {
        EnumMap enumMap = new EnumMap(EnumC10836a.class);
        enumMap.put((EnumMap) EnumC10836a.DEBUG, (EnumC10836a) new C11363b(C10022a.f30894c, (byte) 2, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10836a.TARGET, (EnumC10836a) new C11363b("target", (byte) 2, new C11368g((byte) 12, C10831u.class)));
        enumMap.put((EnumMap) EnumC10836a.ID, (EnumC10836a) new C11363b("id", (byte) 1, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10836a.APP_ID, (EnumC10836a) new C11363b("appId", (byte) 1, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10836a.MESSAGE_TS, (EnumC10836a) new C11363b("messageTs", (byte) 1, new C11364c((byte) 10)));
        enumMap.put((EnumMap) EnumC10836a.TOPIC, (EnumC10836a) new C11363b("topic", (byte) 2, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10836a.ALIAS_NAME, (EnumC10836a) new C11363b("aliasName", (byte) 2, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10836a.REQUEST, (EnumC10836a) new C11363b(SocialConstants.TYPE_REQUEST, (byte) 2, new C11368g((byte) 12, C10785aj.class)));
        enumMap.put((EnumMap) EnumC10836a.PACKAGE_NAME, (EnumC10836a) new C11363b(C10445j.f32447W, (byte) 2, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10836a.CATEGORY, (EnumC10836a) new C11363b("category", (byte) 2, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10836a.IS_ONLINE, (EnumC10836a) new C11363b("isOnline", (byte) 2, new C11364c((byte) 2)));
        enumMap.put((EnumMap) EnumC10836a.REG_ID, (EnumC10836a) new C11363b("regId", (byte) 2, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10836a.CALLBACK_URL, (EnumC10836a) new C11363b("callbackUrl", (byte) 2, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10836a.USER_ACCOUNT, (EnumC10836a) new C11363b("userAccount", (byte) 2, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10836a.DEVICE_STATUS, (EnumC10836a) new C11363b("deviceStatus", (byte) 2, new C11364c((byte) 6)));
        enumMap.put((EnumMap) EnumC10836a.GEO_MSG_STATUS, (EnumC10836a) new C11363b("geoMsgStatus", (byte) 2, new C11364c((byte) 6)));
        enumMap.put((EnumMap) EnumC10836a.IMEI_MD5, (EnumC10836a) new C11363b("imeiMd5", (byte) 2, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10836a.DEVICE_ID, (EnumC10836a) new C11363b(C10445j.f32473as, (byte) 2, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10836a.PASS_THROUGH, (EnumC10836a) new C11363b(C3070c.C3071a.f11502f, (byte) 2, new C11364c((byte) 8)));
        enumMap.put((EnumMap) EnumC10836a.EXTRA, (EnumC10836a) new C11363b("extra", (byte) 2, new C11366e((byte) 13, new C11364c((byte) 11), new C11364c((byte) 11))));
        f34589u = Collections.unmodifiableMap(enumMap);
        C11363b.m1284a(C10835w.class, f34589u);
    }

    /* renamed from: a */
    public C10835w m3232a(long j) {
        this.f34600e = j;
        m3228a(true);
        return this;
    }

    /* renamed from: a */
    public C10835w m3230a(String str) {
        this.f34598c = str;
        return this;
    }

    /* renamed from: a */
    public C10835w m3229a(short s) {
        this.f34610o = s;
        m3220c(true);
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
                if (!m3216e()) {
                    throw new C11377f("Required field 'messageTs' was not found in serialized data! Struct: " + toString());
                }
                m3199u();
                return;
            }
            switch (mo1240i.f36480c) {
                case 1:
                    if (mo1240i.f36479b == 11) {
                        this.f34596a = abstractC11376e.mo1223w();
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 2:
                    if (mo1240i.f36479b == 12) {
                        this.f34597b = new C10831u();
                        this.f34597b.mo1286a(abstractC11376e);
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 3:
                    if (mo1240i.f36479b == 11) {
                        this.f34598c = abstractC11376e.mo1223w();
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 4:
                    if (mo1240i.f36479b == 11) {
                        this.f34599d = abstractC11376e.mo1223w();
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 5:
                    if (mo1240i.f36479b == 10) {
                        this.f34600e = abstractC11376e.mo1231u();
                        m3228a(true);
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 6:
                    if (mo1240i.f36479b == 11) {
                        this.f34601f = abstractC11376e.mo1223w();
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 7:
                    if (mo1240i.f36479b == 11) {
                        this.f34602g = abstractC11376e.mo1223w();
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 8:
                    if (mo1240i.f36479b == 12) {
                        this.f34603h = new C10785aj();
                        this.f34603h.mo1286a(abstractC11376e);
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 9:
                    if (mo1240i.f36479b == 11) {
                        this.f34604i = abstractC11376e.mo1223w();
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 10:
                    if (mo1240i.f36479b == 11) {
                        this.f34605j = abstractC11376e.mo1223w();
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 11:
                    if (mo1240i.f36479b == 2) {
                        this.f34606k = abstractC11376e.mo1235q();
                        m3223b(true);
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 12:
                    if (mo1240i.f36479b == 11) {
                        this.f34607l = abstractC11376e.mo1223w();
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 13:
                    if (mo1240i.f36479b == 11) {
                        this.f34608m = abstractC11376e.mo1223w();
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 14:
                    if (mo1240i.f36479b == 11) {
                        this.f34609n = abstractC11376e.mo1223w();
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 15:
                    if (mo1240i.f36479b == 6) {
                        this.f34610o = abstractC11376e.mo1233s();
                        m3220c(true);
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 16:
                    if (mo1240i.f36479b == 6) {
                        this.f34611p = abstractC11376e.mo1233s();
                        m3217d(true);
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 17:
                case 18:
                case 19:
                default:
                    C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                    break;
                case 20:
                    if (mo1240i.f36479b == 11) {
                        this.f34612q = abstractC11376e.mo1223w();
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 21:
                    if (mo1240i.f36479b == 11) {
                        this.f34613r = abstractC11376e.mo1223w();
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 22:
                    if (mo1240i.f36479b == 8) {
                        this.f34614s = abstractC11376e.mo1232t();
                        m3215e(true);
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 23:
                    if (mo1240i.f36479b == 13) {
                        C11375d mo1226k = abstractC11376e.mo1226k();
                        this.f34615t = new HashMap(mo1226k.f36485c * 2);
                        for (int i = 0; i < mo1226k.f36485c; i++) {
                            this.f34615t.put(abstractC11376e.mo1223w(), abstractC11376e.mo1223w());
                        }
                        abstractC11376e.mo1238l();
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
    public void m3228a(boolean z) {
        this.f34595Q.set(0, z);
    }

    /* renamed from: a */
    public boolean m3233a() {
        return this.f34596a != null;
    }

    /* renamed from: a */
    public boolean m3231a(C10835w c10835w) {
        if (c10835w == null) {
            return false;
        }
        boolean m3233a = m3233a();
        boolean m3233a2 = c10835w.m3233a();
        if ((m3233a || m3233a2) && (!m3233a || !m3233a2 || !this.f34596a.equals(c10835w.f34596a))) {
            return false;
        }
        boolean m3227b = m3227b();
        boolean m3227b2 = c10835w.m3227b();
        if ((m3227b || m3227b2) && (!m3227b || !m3227b2 || !this.f34597b.m3254a(c10835w.f34597b))) {
            return false;
        }
        boolean m3222c = m3222c();
        boolean m3222c2 = c10835w.m3222c();
        if ((m3222c || m3222c2) && (!m3222c || !m3222c2 || !this.f34598c.equals(c10835w.f34598c))) {
            return false;
        }
        boolean m3219d = m3219d();
        boolean m3219d2 = c10835w.m3219d();
        if (((m3219d || m3219d2) && (!m3219d || !m3219d2 || !this.f34599d.equals(c10835w.f34599d))) || this.f34600e != c10835w.f34600e) {
            return false;
        }
        boolean m3214f = m3214f();
        boolean m3214f2 = c10835w.m3214f();
        if ((m3214f || m3214f2) && (!m3214f || !m3214f2 || !this.f34601f.equals(c10835w.f34601f))) {
            return false;
        }
        boolean m3213g = m3213g();
        boolean m3213g2 = c10835w.m3213g();
        if ((m3213g || m3213g2) && (!m3213g || !m3213g2 || !this.f34602g.equals(c10835w.f34602g))) {
            return false;
        }
        boolean m3212h = m3212h();
        boolean m3212h2 = c10835w.m3212h();
        if ((m3212h || m3212h2) && (!m3212h || !m3212h2 || !this.f34603h.m3593a(c10835w.f34603h))) {
            return false;
        }
        boolean m3211i = m3211i();
        boolean m3211i2 = c10835w.m3211i();
        if ((m3211i || m3211i2) && (!m3211i || !m3211i2 || !this.f34604i.equals(c10835w.f34604i))) {
            return false;
        }
        boolean m3210j = m3210j();
        boolean m3210j2 = c10835w.m3210j();
        if ((m3210j || m3210j2) && (!m3210j || !m3210j2 || !this.f34605j.equals(c10835w.f34605j))) {
            return false;
        }
        boolean m3209k = m3209k();
        boolean m3209k2 = c10835w.m3209k();
        if ((m3209k || m3209k2) && (!m3209k || !m3209k2 || this.f34606k != c10835w.f34606k)) {
            return false;
        }
        boolean m3208l = m3208l();
        boolean m3208l2 = c10835w.m3208l();
        if ((m3208l || m3208l2) && (!m3208l || !m3208l2 || !this.f34607l.equals(c10835w.f34607l))) {
            return false;
        }
        boolean m3207m = m3207m();
        boolean m3207m2 = c10835w.m3207m();
        if ((m3207m || m3207m2) && (!m3207m || !m3207m2 || !this.f34608m.equals(c10835w.f34608m))) {
            return false;
        }
        boolean m3206n = m3206n();
        boolean m3206n2 = c10835w.m3206n();
        if ((m3206n || m3206n2) && (!m3206n || !m3206n2 || !this.f34609n.equals(c10835w.f34609n))) {
            return false;
        }
        boolean m3205o = m3205o();
        boolean m3205o2 = c10835w.m3205o();
        if ((m3205o || m3205o2) && (!m3205o || !m3205o2 || this.f34610o != c10835w.f34610o)) {
            return false;
        }
        boolean m3204p = m3204p();
        boolean m3204p2 = c10835w.m3204p();
        if ((m3204p || m3204p2) && (!m3204p || !m3204p2 || this.f34611p != c10835w.f34611p)) {
            return false;
        }
        boolean m3203q = m3203q();
        boolean m3203q2 = c10835w.m3203q();
        if ((m3203q || m3203q2) && (!m3203q || !m3203q2 || !this.f34612q.equals(c10835w.f34612q))) {
            return false;
        }
        boolean m3202r = m3202r();
        boolean m3202r2 = c10835w.m3202r();
        if ((m3202r || m3202r2) && (!m3202r || !m3202r2 || !this.f34613r.equals(c10835w.f34613r))) {
            return false;
        }
        boolean m3201s = m3201s();
        boolean m3201s2 = c10835w.m3201s();
        if ((m3201s || m3201s2) && (!m3201s || !m3201s2 || this.f34614s != c10835w.f34614s)) {
            return false;
        }
        boolean m3200t = m3200t();
        boolean m3200t2 = c10835w.m3200t();
        return (!m3200t && !m3200t2) || (m3200t && m3200t2 && this.f34615t.equals(c10835w.f34615t));
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(C10835w c10835w) {
        int m1272a;
        int m1280a;
        int m1277a;
        int m1277a2;
        int m1270a;
        int m1270a2;
        int m1277a3;
        int m1277a4;
        int m1277a5;
        int m1269a;
        int m1277a6;
        int m1277a7;
        int m1278a;
        int m1277a8;
        int m1277a9;
        int m1279a;
        int m1277a10;
        int m1277a11;
        int m1278a2;
        int m1277a12;
        if (!getClass().equals(c10835w.getClass())) {
            return getClass().getName().compareTo(c10835w.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m3233a()).compareTo(Boolean.valueOf(c10835w.m3233a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m3233a() && (m1277a12 = C11369b.m1277a(this.f34596a, c10835w.f34596a)) != 0) {
            return m1277a12;
        }
        int compareTo2 = Boolean.valueOf(m3227b()).compareTo(Boolean.valueOf(c10835w.m3227b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m3227b() && (m1278a2 = C11369b.m1278a(this.f34597b, c10835w.f34597b)) != 0) {
            return m1278a2;
        }
        int compareTo3 = Boolean.valueOf(m3222c()).compareTo(Boolean.valueOf(c10835w.m3222c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (m3222c() && (m1277a11 = C11369b.m1277a(this.f34598c, c10835w.f34598c)) != 0) {
            return m1277a11;
        }
        int compareTo4 = Boolean.valueOf(m3219d()).compareTo(Boolean.valueOf(c10835w.m3219d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (m3219d() && (m1277a10 = C11369b.m1277a(this.f34599d, c10835w.f34599d)) != 0) {
            return m1277a10;
        }
        int compareTo5 = Boolean.valueOf(m3216e()).compareTo(Boolean.valueOf(c10835w.m3216e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (m3216e() && (m1279a = C11369b.m1279a(this.f34600e, c10835w.f34600e)) != 0) {
            return m1279a;
        }
        int compareTo6 = Boolean.valueOf(m3214f()).compareTo(Boolean.valueOf(c10835w.m3214f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (m3214f() && (m1277a9 = C11369b.m1277a(this.f34601f, c10835w.f34601f)) != 0) {
            return m1277a9;
        }
        int compareTo7 = Boolean.valueOf(m3213g()).compareTo(Boolean.valueOf(c10835w.m3213g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (m3213g() && (m1277a8 = C11369b.m1277a(this.f34602g, c10835w.f34602g)) != 0) {
            return m1277a8;
        }
        int compareTo8 = Boolean.valueOf(m3212h()).compareTo(Boolean.valueOf(c10835w.m3212h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (m3212h() && (m1278a = C11369b.m1278a(this.f34603h, c10835w.f34603h)) != 0) {
            return m1278a;
        }
        int compareTo9 = Boolean.valueOf(m3211i()).compareTo(Boolean.valueOf(c10835w.m3211i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (m3211i() && (m1277a7 = C11369b.m1277a(this.f34604i, c10835w.f34604i)) != 0) {
            return m1277a7;
        }
        int compareTo10 = Boolean.valueOf(m3210j()).compareTo(Boolean.valueOf(c10835w.m3210j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (m3210j() && (m1277a6 = C11369b.m1277a(this.f34605j, c10835w.f34605j)) != 0) {
            return m1277a6;
        }
        int compareTo11 = Boolean.valueOf(m3209k()).compareTo(Boolean.valueOf(c10835w.m3209k()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (m3209k() && (m1269a = C11369b.m1269a(this.f34606k, c10835w.f34606k)) != 0) {
            return m1269a;
        }
        int compareTo12 = Boolean.valueOf(m3208l()).compareTo(Boolean.valueOf(c10835w.m3208l()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (m3208l() && (m1277a5 = C11369b.m1277a(this.f34607l, c10835w.f34607l)) != 0) {
            return m1277a5;
        }
        int compareTo13 = Boolean.valueOf(m3207m()).compareTo(Boolean.valueOf(c10835w.m3207m()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (m3207m() && (m1277a4 = C11369b.m1277a(this.f34608m, c10835w.f34608m)) != 0) {
            return m1277a4;
        }
        int compareTo14 = Boolean.valueOf(m3206n()).compareTo(Boolean.valueOf(c10835w.m3206n()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (m3206n() && (m1277a3 = C11369b.m1277a(this.f34609n, c10835w.f34609n)) != 0) {
            return m1277a3;
        }
        int compareTo15 = Boolean.valueOf(m3205o()).compareTo(Boolean.valueOf(c10835w.m3205o()));
        if (compareTo15 != 0) {
            return compareTo15;
        }
        if (m3205o() && (m1270a2 = C11369b.m1270a(this.f34610o, c10835w.f34610o)) != 0) {
            return m1270a2;
        }
        int compareTo16 = Boolean.valueOf(m3204p()).compareTo(Boolean.valueOf(c10835w.m3204p()));
        if (compareTo16 != 0) {
            return compareTo16;
        }
        if (m3204p() && (m1270a = C11369b.m1270a(this.f34611p, c10835w.f34611p)) != 0) {
            return m1270a;
        }
        int compareTo17 = Boolean.valueOf(m3203q()).compareTo(Boolean.valueOf(c10835w.m3203q()));
        if (compareTo17 != 0) {
            return compareTo17;
        }
        if (m3203q() && (m1277a2 = C11369b.m1277a(this.f34612q, c10835w.f34612q)) != 0) {
            return m1277a2;
        }
        int compareTo18 = Boolean.valueOf(m3202r()).compareTo(Boolean.valueOf(c10835w.m3202r()));
        if (compareTo18 != 0) {
            return compareTo18;
        }
        if (m3202r() && (m1277a = C11369b.m1277a(this.f34613r, c10835w.f34613r)) != 0) {
            return m1277a;
        }
        int compareTo19 = Boolean.valueOf(m3201s()).compareTo(Boolean.valueOf(c10835w.m3201s()));
        if (compareTo19 != 0) {
            return compareTo19;
        }
        if (m3201s() && (m1280a = C11369b.m1280a(this.f34614s, c10835w.f34614s)) != 0) {
            return m1280a;
        }
        int compareTo20 = Boolean.valueOf(m3200t()).compareTo(Boolean.valueOf(c10835w.m3200t()));
        if (compareTo20 != 0) {
            return compareTo20;
        }
        if (m3200t() && (m1272a = C11369b.m1272a(this.f34615t, c10835w.f34615t)) != 0) {
            return m1272a;
        }
        return 0;
    }

    /* renamed from: b */
    public C10835w m3225b(String str) {
        this.f34599d = str;
        return this;
    }

    /* renamed from: b */
    public C10835w m3224b(short s) {
        this.f34611p = s;
        m3217d(true);
        return this;
    }

    @Override // org.p286a.p321b.AbstractC11361a
    /* renamed from: b */
    public void mo1285b(AbstractC11376e abstractC11376e) {
        m3199u();
        abstractC11376e.mo1250a(f34590v);
        if (this.f34596a != null && m3233a()) {
            abstractC11376e.mo1254a(f34591w);
            abstractC11376e.mo1256a(this.f34596a);
            abstractC11376e.mo1247b();
        }
        if (this.f34597b != null && m3227b()) {
            abstractC11376e.mo1254a(f34592x);
            this.f34597b.mo1285b(abstractC11376e);
            abstractC11376e.mo1247b();
        }
        if (this.f34598c != null) {
            abstractC11376e.mo1254a(f34593y);
            abstractC11376e.mo1256a(this.f34598c);
            abstractC11376e.mo1247b();
        }
        if (this.f34599d != null) {
            abstractC11376e.mo1254a(f34594z);
            abstractC11376e.mo1256a(this.f34599d);
            abstractC11376e.mo1247b();
        }
        abstractC11376e.mo1254a(f34573A);
        abstractC11376e.mo1257a(this.f34600e);
        abstractC11376e.mo1247b();
        if (this.f34601f != null && m3214f()) {
            abstractC11376e.mo1254a(f34574B);
            abstractC11376e.mo1256a(this.f34601f);
            abstractC11376e.mo1247b();
        }
        if (this.f34602g != null && m3213g()) {
            abstractC11376e.mo1254a(f34575C);
            abstractC11376e.mo1256a(this.f34602g);
            abstractC11376e.mo1247b();
        }
        if (this.f34603h != null && m3212h()) {
            abstractC11376e.mo1254a(f34576D);
            this.f34603h.mo1285b(abstractC11376e);
            abstractC11376e.mo1247b();
        }
        if (this.f34604i != null && m3211i()) {
            abstractC11376e.mo1254a(f34577E);
            abstractC11376e.mo1256a(this.f34604i);
            abstractC11376e.mo1247b();
        }
        if (this.f34605j != null && m3210j()) {
            abstractC11376e.mo1254a(f34578F);
            abstractC11376e.mo1256a(this.f34605j);
            abstractC11376e.mo1247b();
        }
        if (m3209k()) {
            abstractC11376e.mo1254a(f34579G);
            abstractC11376e.mo1248a(this.f34606k);
            abstractC11376e.mo1247b();
        }
        if (this.f34607l != null && m3208l()) {
            abstractC11376e.mo1254a(f34580H);
            abstractC11376e.mo1256a(this.f34607l);
            abstractC11376e.mo1247b();
        }
        if (this.f34608m != null && m3207m()) {
            abstractC11376e.mo1254a(f34581I);
            abstractC11376e.mo1256a(this.f34608m);
            abstractC11376e.mo1247b();
        }
        if (this.f34609n != null && m3206n()) {
            abstractC11376e.mo1254a(f34582J);
            abstractC11376e.mo1256a(this.f34609n);
            abstractC11376e.mo1247b();
        }
        if (m3205o()) {
            abstractC11376e.mo1254a(f34583K);
            abstractC11376e.mo1249a(this.f34610o);
            abstractC11376e.mo1247b();
        }
        if (m3204p()) {
            abstractC11376e.mo1254a(f34584L);
            abstractC11376e.mo1249a(this.f34611p);
            abstractC11376e.mo1247b();
        }
        if (this.f34612q != null && m3203q()) {
            abstractC11376e.mo1254a(f34585M);
            abstractC11376e.mo1256a(this.f34612q);
            abstractC11376e.mo1247b();
        }
        if (this.f34613r != null && m3202r()) {
            abstractC11376e.mo1254a(f34586N);
            abstractC11376e.mo1256a(this.f34613r);
            abstractC11376e.mo1247b();
        }
        if (m3201s()) {
            abstractC11376e.mo1254a(f34587O);
            abstractC11376e.mo1258a(this.f34614s);
            abstractC11376e.mo1247b();
        }
        if (this.f34615t != null && m3200t()) {
            abstractC11376e.mo1254a(f34588P);
            abstractC11376e.mo1252a(new C11375d((byte) 11, (byte) 11, this.f34615t.size()));
            for (Map.Entry<String, String> entry : this.f34615t.entrySet()) {
                abstractC11376e.mo1256a(entry.getKey());
                abstractC11376e.mo1256a(entry.getValue());
            }
            abstractC11376e.mo1245d();
            abstractC11376e.mo1247b();
        }
        abstractC11376e.mo1246c();
        abstractC11376e.mo1261a();
    }

    /* renamed from: b */
    public void m3223b(boolean z) {
        this.f34595Q.set(1, z);
    }

    /* renamed from: b */
    public boolean m3227b() {
        return this.f34597b != null;
    }

    /* renamed from: c */
    public C10835w m3221c(String str) {
        this.f34601f = str;
        return this;
    }

    /* renamed from: c */
    public void m3220c(boolean z) {
        this.f34595Q.set(2, z);
    }

    /* renamed from: c */
    public boolean m3222c() {
        return this.f34598c != null;
    }

    /* renamed from: d */
    public C10835w m3218d(String str) {
        this.f34602g = str;
        return this;
    }

    /* renamed from: d */
    public void m3217d(boolean z) {
        this.f34595Q.set(3, z);
    }

    /* renamed from: d */
    public boolean m3219d() {
        return this.f34599d != null;
    }

    /* renamed from: e */
    public void m3215e(boolean z) {
        this.f34595Q.set(4, z);
    }

    /* renamed from: e */
    public boolean m3216e() {
        return this.f34595Q.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C10835w)) {
            return m3231a((C10835w) obj);
        }
        return false;
    }

    /* renamed from: f */
    public boolean m3214f() {
        return this.f34601f != null;
    }

    /* renamed from: g */
    public boolean m3213g() {
        return this.f34602g != null;
    }

    /* renamed from: h */
    public boolean m3212h() {
        return this.f34603h != null;
    }

    public int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public boolean m3211i() {
        return this.f34604i != null;
    }

    /* renamed from: j */
    public boolean m3210j() {
        return this.f34605j != null;
    }

    /* renamed from: k */
    public boolean m3209k() {
        return this.f34595Q.get(1);
    }

    /* renamed from: l */
    public boolean m3208l() {
        return this.f34607l != null;
    }

    /* renamed from: m */
    public boolean m3207m() {
        return this.f34608m != null;
    }

    /* renamed from: n */
    public boolean m3206n() {
        return this.f34609n != null;
    }

    /* renamed from: o */
    public boolean m3205o() {
        return this.f34595Q.get(2);
    }

    /* renamed from: p */
    public boolean m3204p() {
        return this.f34595Q.get(3);
    }

    /* renamed from: q */
    public boolean m3203q() {
        return this.f34612q != null;
    }

    /* renamed from: r */
    public boolean m3202r() {
        return this.f34613r != null;
    }

    /* renamed from: s */
    public boolean m3201s() {
        return this.f34595Q.get(4);
    }

    /* renamed from: t */
    public boolean m3200t() {
        return this.f34615t != null;
    }

    public String toString() {
        boolean z = false;
        StringBuilder sb = new StringBuilder("XmPushActionAckMessage(");
        boolean z2 = true;
        if (m3233a()) {
            sb.append("debug:");
            if (this.f34596a == null) {
                sb.append("null");
            } else {
                sb.append(this.f34596a);
            }
            z2 = false;
        }
        if (m3227b()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("target:");
            if (this.f34597b == null) {
                sb.append("null");
            } else {
                sb.append(this.f34597b);
            }
        } else {
            z = z2;
        }
        if (!z) {
            sb.append(", ");
        }
        sb.append("id:");
        if (this.f34598c == null) {
            sb.append("null");
        } else {
            sb.append(this.f34598c);
        }
        sb.append(", ");
        sb.append("appId:");
        if (this.f34599d == null) {
            sb.append("null");
        } else {
            sb.append(this.f34599d);
        }
        sb.append(", ");
        sb.append("messageTs:");
        sb.append(this.f34600e);
        if (m3214f()) {
            sb.append(", ");
            sb.append("topic:");
            if (this.f34601f == null) {
                sb.append("null");
            } else {
                sb.append(this.f34601f);
            }
        }
        if (m3213g()) {
            sb.append(", ");
            sb.append("aliasName:");
            if (this.f34602g == null) {
                sb.append("null");
            } else {
                sb.append(this.f34602g);
            }
        }
        if (m3212h()) {
            sb.append(", ");
            sb.append("request:");
            if (this.f34603h == null) {
                sb.append("null");
            } else {
                sb.append(this.f34603h);
            }
        }
        if (m3211i()) {
            sb.append(", ");
            sb.append("packageName:");
            if (this.f34604i == null) {
                sb.append("null");
            } else {
                sb.append(this.f34604i);
            }
        }
        if (m3210j()) {
            sb.append(", ");
            sb.append("category:");
            if (this.f34605j == null) {
                sb.append("null");
            } else {
                sb.append(this.f34605j);
            }
        }
        if (m3209k()) {
            sb.append(", ");
            sb.append("isOnline:");
            sb.append(this.f34606k);
        }
        if (m3208l()) {
            sb.append(", ");
            sb.append("regId:");
            if (this.f34607l == null) {
                sb.append("null");
            } else {
                sb.append(this.f34607l);
            }
        }
        if (m3207m()) {
            sb.append(", ");
            sb.append("callbackUrl:");
            if (this.f34608m == null) {
                sb.append("null");
            } else {
                sb.append(this.f34608m);
            }
        }
        if (m3206n()) {
            sb.append(", ");
            sb.append("userAccount:");
            if (this.f34609n == null) {
                sb.append("null");
            } else {
                sb.append(this.f34609n);
            }
        }
        if (m3205o()) {
            sb.append(", ");
            sb.append("deviceStatus:");
            sb.append((int) this.f34610o);
        }
        if (m3204p()) {
            sb.append(", ");
            sb.append("geoMsgStatus:");
            sb.append((int) this.f34611p);
        }
        if (m3203q()) {
            sb.append(", ");
            sb.append("imeiMd5:");
            if (this.f34612q == null) {
                sb.append("null");
            } else {
                sb.append(this.f34612q);
            }
        }
        if (m3202r()) {
            sb.append(", ");
            sb.append("deviceId:");
            if (this.f34613r == null) {
                sb.append("null");
            } else {
                sb.append(this.f34613r);
            }
        }
        if (m3201s()) {
            sb.append(", ");
            sb.append("passThrough:");
            sb.append(this.f34614s);
        }
        if (m3200t()) {
            sb.append(", ");
            sb.append("extra:");
            if (this.f34615t == null) {
                sb.append("null");
            } else {
                sb.append(this.f34615t);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: u */
    public void m3199u() {
        if (this.f34598c == null) {
            throw new C11377f("Required field 'id' was not present! Struct: " + toString());
        }
        if (this.f34599d != null) {
            return;
        }
        throw new C11377f("Required field 'appId' was not present! Struct: " + toString());
    }
}
