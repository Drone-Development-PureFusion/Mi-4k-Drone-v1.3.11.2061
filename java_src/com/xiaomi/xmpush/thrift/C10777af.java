package com.xiaomi.xmpush.thrift;

import com.p255mi.live.openlivesdk.C10022a;
import com.xiaomi.market.sdk.C10445j;
import com.xiaomi.mipush.sdk.Constants;
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
import org.p286a.p321b.p322a.C11362a;
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
/* renamed from: com.xiaomi.xmpush.thrift.af */
/* loaded from: classes.dex */
public class C10777af implements Serializable, Cloneable, AbstractC11361a<C10777af, EnumC10778a> {

    /* renamed from: x */
    public static final Map<EnumC10778a, C11363b> f33774x;

    /* renamed from: a */
    public String f33778a;

    /* renamed from: b */
    public C10831u f33779b;

    /* renamed from: c */
    public String f33780c;

    /* renamed from: d */
    public String f33781d;

    /* renamed from: e */
    public String f33782e;

    /* renamed from: f */
    public String f33783f;

    /* renamed from: g */
    public String f33784g;

    /* renamed from: h */
    public String f33785h;

    /* renamed from: i */
    public String f33786i;

    /* renamed from: j */
    public String f33787j;

    /* renamed from: k */
    public String f33788k;

    /* renamed from: l */
    public String f33789l;

    /* renamed from: m */
    public int f33790m;

    /* renamed from: n */
    public int f33791n;

    /* renamed from: o */
    public String f33792o;

    /* renamed from: p */
    public String f33793p;

    /* renamed from: q */
    public String f33794q;

    /* renamed from: r */
    public String f33795r;

    /* renamed from: s */
    public int f33796s;

    /* renamed from: t */
    public EnumC10830t f33797t;

    /* renamed from: u */
    public Map<String, String> f33798u;

    /* renamed from: w */
    public String f33800w;

    /* renamed from: y */
    private static final C11381j f33775y = new C11381j("XmPushActionRegistration");

    /* renamed from: z */
    private static final C11373b f33776z = new C11373b(C10022a.f30894c, (byte) 11, 1);

    /* renamed from: A */
    private static final C11373b f33752A = new C11373b("target", (byte) 12, 2);

    /* renamed from: B */
    private static final C11373b f33753B = new C11373b("id", (byte) 11, 3);

    /* renamed from: C */
    private static final C11373b f33754C = new C11373b("appId", (byte) 11, 4);

    /* renamed from: D */
    private static final C11373b f33755D = new C11373b("appVersion", (byte) 11, 5);

    /* renamed from: E */
    private static final C11373b f33756E = new C11373b(C10445j.f32447W, (byte) 11, 6);

    /* renamed from: F */
    private static final C11373b f33757F = new C11373b(Constants.EXTRA_KEY_TOKEN, (byte) 11, 7);

    /* renamed from: G */
    private static final C11373b f33758G = new C11373b(C10445j.f32473as, (byte) 11, 8);

    /* renamed from: H */
    private static final C11373b f33759H = new C11373b("aliasName", (byte) 11, 9);

    /* renamed from: I */
    private static final C11373b f33760I = new C11373b("sdkVersion", (byte) 11, 10);

    /* renamed from: J */
    private static final C11373b f33761J = new C11373b("regId", (byte) 11, 11);

    /* renamed from: K */
    private static final C11373b f33762K = new C11373b("pushSdkVersionName", (byte) 11, 12);

    /* renamed from: L */
    private static final C11373b f33763L = new C11373b("pushSdkVersionCode", (byte) 8, 13);

    /* renamed from: M */
    private static final C11373b f33764M = new C11373b("appVersionCode", (byte) 8, 14);

    /* renamed from: N */
    private static final C11373b f33765N = new C11373b("androidId", (byte) 11, 15);

    /* renamed from: O */
    private static final C11373b f33766O = new C11373b("imei", (byte) 11, 16);

    /* renamed from: P */
    private static final C11373b f33767P = new C11373b("serial", (byte) 11, 17);

    /* renamed from: Q */
    private static final C11373b f33768Q = new C11373b("imeiMd5", (byte) 11, 18);

    /* renamed from: R */
    private static final C11373b f33769R = new C11373b("spaceId", (byte) 8, 19);

    /* renamed from: S */
    private static final C11373b f33770S = new C11373b("reason", (byte) 8, 20);

    /* renamed from: T */
    private static final C11373b f33771T = new C11373b("connectionAttrs", (byte) 13, 100);

    /* renamed from: U */
    private static final C11373b f33772U = new C11373b("cleanOldRegInfo", (byte) 2, 101);

    /* renamed from: V */
    private static final C11373b f33773V = new C11373b("oldRegId", (byte) 11, 102);

    /* renamed from: W */
    private BitSet f33777W = new BitSet(4);

    /* renamed from: v */
    public boolean f33799v = false;

    /* renamed from: com.xiaomi.xmpush.thrift.af$a */
    /* loaded from: classes2.dex */
    public enum EnumC10778a {
        DEBUG(1, C10022a.f30894c),
        TARGET(2, "target"),
        ID(3, "id"),
        APP_ID(4, "appId"),
        APP_VERSION(5, "appVersion"),
        PACKAGE_NAME(6, C10445j.f32447W),
        TOKEN(7, Constants.EXTRA_KEY_TOKEN),
        DEVICE_ID(8, C10445j.f32473as),
        ALIAS_NAME(9, "aliasName"),
        SDK_VERSION(10, "sdkVersion"),
        REG_ID(11, "regId"),
        PUSH_SDK_VERSION_NAME(12, "pushSdkVersionName"),
        PUSH_SDK_VERSION_CODE(13, "pushSdkVersionCode"),
        APP_VERSION_CODE(14, "appVersionCode"),
        ANDROID_ID(15, "androidId"),
        IMEI(16, "imei"),
        SERIAL(17, "serial"),
        IMEI_MD5(18, "imeiMd5"),
        SPACE_ID(19, "spaceId"),
        REASON(20, "reason"),
        CONNECTION_ATTRS(100, "connectionAttrs"),
        CLEAN_OLD_REG_INFO(101, "cleanOldRegInfo"),
        OLD_REG_ID(102, "oldRegId");
        

        /* renamed from: x */
        private static final Map<String, EnumC10778a> f33825x = new HashMap();

        /* renamed from: y */
        private final short f33826y;

        /* renamed from: z */
        private final String f33827z;

        static {
            Iterator it2 = EnumSet.allOf(EnumC10778a.class).iterator();
            while (it2.hasNext()) {
                EnumC10778a enumC10778a = (EnumC10778a) it2.next();
                f33825x.put(enumC10778a.m3633a(), enumC10778a);
            }
        }

        EnumC10778a(short s, String str) {
            this.f33826y = s;
            this.f33827z = str;
        }

        /* renamed from: a */
        public String m3633a() {
            return this.f33827z;
        }
    }

    static {
        EnumMap enumMap = new EnumMap(EnumC10778a.class);
        enumMap.put((EnumMap) EnumC10778a.DEBUG, (EnumC10778a) new C11363b(C10022a.f30894c, (byte) 2, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10778a.TARGET, (EnumC10778a) new C11363b("target", (byte) 2, new C11368g((byte) 12, C10831u.class)));
        enumMap.put((EnumMap) EnumC10778a.ID, (EnumC10778a) new C11363b("id", (byte) 1, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10778a.APP_ID, (EnumC10778a) new C11363b("appId", (byte) 1, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10778a.APP_VERSION, (EnumC10778a) new C11363b("appVersion", (byte) 2, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10778a.PACKAGE_NAME, (EnumC10778a) new C11363b(C10445j.f32447W, (byte) 2, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10778a.TOKEN, (EnumC10778a) new C11363b(Constants.EXTRA_KEY_TOKEN, (byte) 1, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10778a.DEVICE_ID, (EnumC10778a) new C11363b(C10445j.f32473as, (byte) 2, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10778a.ALIAS_NAME, (EnumC10778a) new C11363b("aliasName", (byte) 2, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10778a.SDK_VERSION, (EnumC10778a) new C11363b("sdkVersion", (byte) 2, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10778a.REG_ID, (EnumC10778a) new C11363b("regId", (byte) 2, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10778a.PUSH_SDK_VERSION_NAME, (EnumC10778a) new C11363b("pushSdkVersionName", (byte) 2, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10778a.PUSH_SDK_VERSION_CODE, (EnumC10778a) new C11363b("pushSdkVersionCode", (byte) 2, new C11364c((byte) 8)));
        enumMap.put((EnumMap) EnumC10778a.APP_VERSION_CODE, (EnumC10778a) new C11363b("appVersionCode", (byte) 2, new C11364c((byte) 8)));
        enumMap.put((EnumMap) EnumC10778a.ANDROID_ID, (EnumC10778a) new C11363b("androidId", (byte) 2, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10778a.IMEI, (EnumC10778a) new C11363b("imei", (byte) 2, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10778a.SERIAL, (EnumC10778a) new C11363b("serial", (byte) 2, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10778a.IMEI_MD5, (EnumC10778a) new C11363b("imeiMd5", (byte) 2, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10778a.SPACE_ID, (EnumC10778a) new C11363b("spaceId", (byte) 2, new C11364c((byte) 8)));
        enumMap.put((EnumMap) EnumC10778a.REASON, (EnumC10778a) new C11363b("reason", (byte) 2, new C11362a((byte) 16, EnumC10830t.class)));
        enumMap.put((EnumMap) EnumC10778a.CONNECTION_ATTRS, (EnumC10778a) new C11363b("connectionAttrs", (byte) 2, new C11366e((byte) 13, new C11364c((byte) 11), new C11364c((byte) 11))));
        enumMap.put((EnumMap) EnumC10778a.CLEAN_OLD_REG_INFO, (EnumC10778a) new C11363b("cleanOldRegInfo", (byte) 2, new C11364c((byte) 2)));
        enumMap.put((EnumMap) EnumC10778a.OLD_REG_ID, (EnumC10778a) new C11363b("oldRegId", (byte) 2, new C11364c((byte) 11)));
        f33774x = Collections.unmodifiableMap(enumMap);
        C11363b.m1284a(C10777af.class, f33774x);
    }

    /* renamed from: a */
    public C10777af m3679a(int i) {
        this.f33790m = i;
        m3675a(true);
        return this;
    }

    /* renamed from: a */
    public C10777af m3677a(EnumC10830t enumC10830t) {
        this.f33797t = enumC10830t;
        return this;
    }

    /* renamed from: a */
    public C10777af m3676a(String str) {
        this.f33780c = str;
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
                m3634z();
                return;
            }
            switch (mo1240i.f36480c) {
                case 1:
                    if (mo1240i.f36479b == 11) {
                        this.f33778a = abstractC11376e.mo1223w();
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 2:
                    if (mo1240i.f36479b == 12) {
                        this.f33779b = new C10831u();
                        this.f33779b.mo1286a(abstractC11376e);
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 3:
                    if (mo1240i.f36479b == 11) {
                        this.f33780c = abstractC11376e.mo1223w();
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 4:
                    if (mo1240i.f36479b == 11) {
                        this.f33781d = abstractC11376e.mo1223w();
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 5:
                    if (mo1240i.f36479b == 11) {
                        this.f33782e = abstractC11376e.mo1223w();
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 6:
                    if (mo1240i.f36479b == 11) {
                        this.f33783f = abstractC11376e.mo1223w();
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 7:
                    if (mo1240i.f36479b == 11) {
                        this.f33784g = abstractC11376e.mo1223w();
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 8:
                    if (mo1240i.f36479b == 11) {
                        this.f33785h = abstractC11376e.mo1223w();
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 9:
                    if (mo1240i.f36479b == 11) {
                        this.f33786i = abstractC11376e.mo1223w();
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 10:
                    if (mo1240i.f36479b == 11) {
                        this.f33787j = abstractC11376e.mo1223w();
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 11:
                    if (mo1240i.f36479b == 11) {
                        this.f33788k = abstractC11376e.mo1223w();
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 12:
                    if (mo1240i.f36479b == 11) {
                        this.f33789l = abstractC11376e.mo1223w();
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 13:
                    if (mo1240i.f36479b == 8) {
                        this.f33790m = abstractC11376e.mo1232t();
                        m3675a(true);
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 14:
                    if (mo1240i.f36479b == 8) {
                        this.f33791n = abstractC11376e.mo1232t();
                        m3670b(true);
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 15:
                    if (mo1240i.f36479b == 11) {
                        this.f33792o = abstractC11376e.mo1223w();
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 16:
                    if (mo1240i.f36479b == 11) {
                        this.f33793p = abstractC11376e.mo1223w();
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 17:
                    if (mo1240i.f36479b == 11) {
                        this.f33794q = abstractC11376e.mo1223w();
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 18:
                    if (mo1240i.f36479b == 11) {
                        this.f33795r = abstractC11376e.mo1223w();
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 19:
                    if (mo1240i.f36479b == 8) {
                        this.f33796s = abstractC11376e.mo1232t();
                        m3666c(true);
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 20:
                    if (mo1240i.f36479b == 8) {
                        this.f33797t = EnumC10830t.m3256a(abstractC11376e.mo1232t());
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 100:
                    if (mo1240i.f36479b == 13) {
                        C11375d mo1226k = abstractC11376e.mo1226k();
                        this.f33798u = new HashMap(mo1226k.f36485c * 2);
                        for (int i = 0; i < mo1226k.f36485c; i++) {
                            this.f33798u.put(abstractC11376e.mo1223w(), abstractC11376e.mo1223w());
                        }
                        abstractC11376e.mo1238l();
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 101:
                    if (mo1240i.f36479b == 2) {
                        this.f33799v = abstractC11376e.mo1235q();
                        m3663d(true);
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 102:
                    if (mo1240i.f36479b == 11) {
                        this.f33800w = abstractC11376e.mo1223w();
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
    public void m3675a(boolean z) {
        this.f33777W.set(0, z);
    }

    /* renamed from: a */
    public boolean m3680a() {
        return this.f33778a != null;
    }

    /* renamed from: a */
    public boolean m3678a(C10777af c10777af) {
        if (c10777af == null) {
            return false;
        }
        boolean m3680a = m3680a();
        boolean m3680a2 = c10777af.m3680a();
        if ((m3680a || m3680a2) && (!m3680a || !m3680a2 || !this.f33778a.equals(c10777af.f33778a))) {
            return false;
        }
        boolean m3674b = m3674b();
        boolean m3674b2 = c10777af.m3674b();
        if ((m3674b || m3674b2) && (!m3674b || !m3674b2 || !this.f33779b.m3254a(c10777af.f33779b))) {
            return false;
        }
        boolean m3669c = m3669c();
        boolean m3669c2 = c10777af.m3669c();
        if ((m3669c || m3669c2) && (!m3669c || !m3669c2 || !this.f33780c.equals(c10777af.f33780c))) {
            return false;
        }
        boolean m3662e = m3662e();
        boolean m3662e2 = c10777af.m3662e();
        if ((m3662e || m3662e2) && (!m3662e || !m3662e2 || !this.f33781d.equals(c10777af.f33781d))) {
            return false;
        }
        boolean m3660f = m3660f();
        boolean m3660f2 = c10777af.m3660f();
        if ((m3660f || m3660f2) && (!m3660f || !m3660f2 || !this.f33782e.equals(c10777af.f33782e))) {
            return false;
        }
        boolean m3658g = m3658g();
        boolean m3658g2 = c10777af.m3658g();
        if ((m3658g || m3658g2) && (!m3658g || !m3658g2 || !this.f33783f.equals(c10777af.f33783f))) {
            return false;
        }
        boolean m3654i = m3654i();
        boolean m3654i2 = c10777af.m3654i();
        if ((m3654i || m3654i2) && (!m3654i || !m3654i2 || !this.f33784g.equals(c10777af.f33784g))) {
            return false;
        }
        boolean m3652j = m3652j();
        boolean m3652j2 = c10777af.m3652j();
        if ((m3652j || m3652j2) && (!m3652j || !m3652j2 || !this.f33785h.equals(c10777af.f33785h))) {
            return false;
        }
        boolean m3650k = m3650k();
        boolean m3650k2 = c10777af.m3650k();
        if ((m3650k || m3650k2) && (!m3650k || !m3650k2 || !this.f33786i.equals(c10777af.f33786i))) {
            return false;
        }
        boolean m3648l = m3648l();
        boolean m3648l2 = c10777af.m3648l();
        if ((m3648l || m3648l2) && (!m3648l || !m3648l2 || !this.f33787j.equals(c10777af.f33787j))) {
            return false;
        }
        boolean m3647m = m3647m();
        boolean m3647m2 = c10777af.m3647m();
        if ((m3647m || m3647m2) && (!m3647m || !m3647m2 || !this.f33788k.equals(c10777af.f33788k))) {
            return false;
        }
        boolean m3646n = m3646n();
        boolean m3646n2 = c10777af.m3646n();
        if ((m3646n || m3646n2) && (!m3646n || !m3646n2 || !this.f33789l.equals(c10777af.f33789l))) {
            return false;
        }
        boolean m3645o = m3645o();
        boolean m3645o2 = c10777af.m3645o();
        if ((m3645o || m3645o2) && (!m3645o || !m3645o2 || this.f33790m != c10777af.f33790m)) {
            return false;
        }
        boolean m3644p = m3644p();
        boolean m3644p2 = c10777af.m3644p();
        if ((m3644p || m3644p2) && (!m3644p || !m3644p2 || this.f33791n != c10777af.f33791n)) {
            return false;
        }
        boolean m3643q = m3643q();
        boolean m3643q2 = c10777af.m3643q();
        if ((m3643q || m3643q2) && (!m3643q || !m3643q2 || !this.f33792o.equals(c10777af.f33792o))) {
            return false;
        }
        boolean m3642r = m3642r();
        boolean m3642r2 = c10777af.m3642r();
        if ((m3642r || m3642r2) && (!m3642r || !m3642r2 || !this.f33793p.equals(c10777af.f33793p))) {
            return false;
        }
        boolean m3641s = m3641s();
        boolean m3641s2 = c10777af.m3641s();
        if ((m3641s || m3641s2) && (!m3641s || !m3641s2 || !this.f33794q.equals(c10777af.f33794q))) {
            return false;
        }
        boolean m3640t = m3640t();
        boolean m3640t2 = c10777af.m3640t();
        if ((m3640t || m3640t2) && (!m3640t || !m3640t2 || !this.f33795r.equals(c10777af.f33795r))) {
            return false;
        }
        boolean m3639u = m3639u();
        boolean m3639u2 = c10777af.m3639u();
        if ((m3639u || m3639u2) && (!m3639u || !m3639u2 || this.f33796s != c10777af.f33796s)) {
            return false;
        }
        boolean m3638v = m3638v();
        boolean m3638v2 = c10777af.m3638v();
        if ((m3638v || m3638v2) && (!m3638v || !m3638v2 || !this.f33797t.equals(c10777af.f33797t))) {
            return false;
        }
        boolean m3637w = m3637w();
        boolean m3637w2 = c10777af.m3637w();
        if ((m3637w || m3637w2) && (!m3637w || !m3637w2 || !this.f33798u.equals(c10777af.f33798u))) {
            return false;
        }
        boolean m3636x = m3636x();
        boolean m3636x2 = c10777af.m3636x();
        if ((m3636x || m3636x2) && (!m3636x || !m3636x2 || this.f33799v != c10777af.f33799v)) {
            return false;
        }
        boolean m3635y = m3635y();
        boolean m3635y2 = c10777af.m3635y();
        return (!m3635y && !m3635y2) || (m3635y && m3635y2 && this.f33800w.equals(c10777af.f33800w));
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(C10777af c10777af) {
        int m1277a;
        int m1269a;
        int m1272a;
        int m1278a;
        int m1280a;
        int m1277a2;
        int m1277a3;
        int m1277a4;
        int m1277a5;
        int m1280a2;
        int m1280a3;
        int m1277a6;
        int m1277a7;
        int m1277a8;
        int m1277a9;
        int m1277a10;
        int m1277a11;
        int m1277a12;
        int m1277a13;
        int m1277a14;
        int m1277a15;
        int m1278a2;
        int m1277a16;
        if (!getClass().equals(c10777af.getClass())) {
            return getClass().getName().compareTo(c10777af.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m3680a()).compareTo(Boolean.valueOf(c10777af.m3680a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m3680a() && (m1277a16 = C11369b.m1277a(this.f33778a, c10777af.f33778a)) != 0) {
            return m1277a16;
        }
        int compareTo2 = Boolean.valueOf(m3674b()).compareTo(Boolean.valueOf(c10777af.m3674b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m3674b() && (m1278a2 = C11369b.m1278a(this.f33779b, c10777af.f33779b)) != 0) {
            return m1278a2;
        }
        int compareTo3 = Boolean.valueOf(m3669c()).compareTo(Boolean.valueOf(c10777af.m3669c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (m3669c() && (m1277a15 = C11369b.m1277a(this.f33780c, c10777af.f33780c)) != 0) {
            return m1277a15;
        }
        int compareTo4 = Boolean.valueOf(m3662e()).compareTo(Boolean.valueOf(c10777af.m3662e()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (m3662e() && (m1277a14 = C11369b.m1277a(this.f33781d, c10777af.f33781d)) != 0) {
            return m1277a14;
        }
        int compareTo5 = Boolean.valueOf(m3660f()).compareTo(Boolean.valueOf(c10777af.m3660f()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (m3660f() && (m1277a13 = C11369b.m1277a(this.f33782e, c10777af.f33782e)) != 0) {
            return m1277a13;
        }
        int compareTo6 = Boolean.valueOf(m3658g()).compareTo(Boolean.valueOf(c10777af.m3658g()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (m3658g() && (m1277a12 = C11369b.m1277a(this.f33783f, c10777af.f33783f)) != 0) {
            return m1277a12;
        }
        int compareTo7 = Boolean.valueOf(m3654i()).compareTo(Boolean.valueOf(c10777af.m3654i()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (m3654i() && (m1277a11 = C11369b.m1277a(this.f33784g, c10777af.f33784g)) != 0) {
            return m1277a11;
        }
        int compareTo8 = Boolean.valueOf(m3652j()).compareTo(Boolean.valueOf(c10777af.m3652j()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (m3652j() && (m1277a10 = C11369b.m1277a(this.f33785h, c10777af.f33785h)) != 0) {
            return m1277a10;
        }
        int compareTo9 = Boolean.valueOf(m3650k()).compareTo(Boolean.valueOf(c10777af.m3650k()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (m3650k() && (m1277a9 = C11369b.m1277a(this.f33786i, c10777af.f33786i)) != 0) {
            return m1277a9;
        }
        int compareTo10 = Boolean.valueOf(m3648l()).compareTo(Boolean.valueOf(c10777af.m3648l()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (m3648l() && (m1277a8 = C11369b.m1277a(this.f33787j, c10777af.f33787j)) != 0) {
            return m1277a8;
        }
        int compareTo11 = Boolean.valueOf(m3647m()).compareTo(Boolean.valueOf(c10777af.m3647m()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (m3647m() && (m1277a7 = C11369b.m1277a(this.f33788k, c10777af.f33788k)) != 0) {
            return m1277a7;
        }
        int compareTo12 = Boolean.valueOf(m3646n()).compareTo(Boolean.valueOf(c10777af.m3646n()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (m3646n() && (m1277a6 = C11369b.m1277a(this.f33789l, c10777af.f33789l)) != 0) {
            return m1277a6;
        }
        int compareTo13 = Boolean.valueOf(m3645o()).compareTo(Boolean.valueOf(c10777af.m3645o()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (m3645o() && (m1280a3 = C11369b.m1280a(this.f33790m, c10777af.f33790m)) != 0) {
            return m1280a3;
        }
        int compareTo14 = Boolean.valueOf(m3644p()).compareTo(Boolean.valueOf(c10777af.m3644p()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (m3644p() && (m1280a2 = C11369b.m1280a(this.f33791n, c10777af.f33791n)) != 0) {
            return m1280a2;
        }
        int compareTo15 = Boolean.valueOf(m3643q()).compareTo(Boolean.valueOf(c10777af.m3643q()));
        if (compareTo15 != 0) {
            return compareTo15;
        }
        if (m3643q() && (m1277a5 = C11369b.m1277a(this.f33792o, c10777af.f33792o)) != 0) {
            return m1277a5;
        }
        int compareTo16 = Boolean.valueOf(m3642r()).compareTo(Boolean.valueOf(c10777af.m3642r()));
        if (compareTo16 != 0) {
            return compareTo16;
        }
        if (m3642r() && (m1277a4 = C11369b.m1277a(this.f33793p, c10777af.f33793p)) != 0) {
            return m1277a4;
        }
        int compareTo17 = Boolean.valueOf(m3641s()).compareTo(Boolean.valueOf(c10777af.m3641s()));
        if (compareTo17 != 0) {
            return compareTo17;
        }
        if (m3641s() && (m1277a3 = C11369b.m1277a(this.f33794q, c10777af.f33794q)) != 0) {
            return m1277a3;
        }
        int compareTo18 = Boolean.valueOf(m3640t()).compareTo(Boolean.valueOf(c10777af.m3640t()));
        if (compareTo18 != 0) {
            return compareTo18;
        }
        if (m3640t() && (m1277a2 = C11369b.m1277a(this.f33795r, c10777af.f33795r)) != 0) {
            return m1277a2;
        }
        int compareTo19 = Boolean.valueOf(m3639u()).compareTo(Boolean.valueOf(c10777af.m3639u()));
        if (compareTo19 != 0) {
            return compareTo19;
        }
        if (m3639u() && (m1280a = C11369b.m1280a(this.f33796s, c10777af.f33796s)) != 0) {
            return m1280a;
        }
        int compareTo20 = Boolean.valueOf(m3638v()).compareTo(Boolean.valueOf(c10777af.m3638v()));
        if (compareTo20 != 0) {
            return compareTo20;
        }
        if (m3638v() && (m1278a = C11369b.m1278a(this.f33797t, c10777af.f33797t)) != 0) {
            return m1278a;
        }
        int compareTo21 = Boolean.valueOf(m3637w()).compareTo(Boolean.valueOf(c10777af.m3637w()));
        if (compareTo21 != 0) {
            return compareTo21;
        }
        if (m3637w() && (m1272a = C11369b.m1272a(this.f33798u, c10777af.f33798u)) != 0) {
            return m1272a;
        }
        int compareTo22 = Boolean.valueOf(m3636x()).compareTo(Boolean.valueOf(c10777af.m3636x()));
        if (compareTo22 != 0) {
            return compareTo22;
        }
        if (m3636x() && (m1269a = C11369b.m1269a(this.f33799v, c10777af.f33799v)) != 0) {
            return m1269a;
        }
        int compareTo23 = Boolean.valueOf(m3635y()).compareTo(Boolean.valueOf(c10777af.m3635y()));
        if (compareTo23 != 0) {
            return compareTo23;
        }
        if (m3635y() && (m1277a = C11369b.m1277a(this.f33800w, c10777af.f33800w)) != 0) {
            return m1277a;
        }
        return 0;
    }

    /* renamed from: b */
    public C10777af m3673b(int i) {
        this.f33791n = i;
        m3670b(true);
        return this;
    }

    /* renamed from: b */
    public C10777af m3671b(String str) {
        this.f33781d = str;
        return this;
    }

    @Override // org.p286a.p321b.AbstractC11361a
    /* renamed from: b */
    public void mo1285b(AbstractC11376e abstractC11376e) {
        m3634z();
        abstractC11376e.mo1250a(f33775y);
        if (this.f33778a != null && m3680a()) {
            abstractC11376e.mo1254a(f33776z);
            abstractC11376e.mo1256a(this.f33778a);
            abstractC11376e.mo1247b();
        }
        if (this.f33779b != null && m3674b()) {
            abstractC11376e.mo1254a(f33752A);
            this.f33779b.mo1285b(abstractC11376e);
            abstractC11376e.mo1247b();
        }
        if (this.f33780c != null) {
            abstractC11376e.mo1254a(f33753B);
            abstractC11376e.mo1256a(this.f33780c);
            abstractC11376e.mo1247b();
        }
        if (this.f33781d != null) {
            abstractC11376e.mo1254a(f33754C);
            abstractC11376e.mo1256a(this.f33781d);
            abstractC11376e.mo1247b();
        }
        if (this.f33782e != null && m3660f()) {
            abstractC11376e.mo1254a(f33755D);
            abstractC11376e.mo1256a(this.f33782e);
            abstractC11376e.mo1247b();
        }
        if (this.f33783f != null && m3658g()) {
            abstractC11376e.mo1254a(f33756E);
            abstractC11376e.mo1256a(this.f33783f);
            abstractC11376e.mo1247b();
        }
        if (this.f33784g != null) {
            abstractC11376e.mo1254a(f33757F);
            abstractC11376e.mo1256a(this.f33784g);
            abstractC11376e.mo1247b();
        }
        if (this.f33785h != null && m3652j()) {
            abstractC11376e.mo1254a(f33758G);
            abstractC11376e.mo1256a(this.f33785h);
            abstractC11376e.mo1247b();
        }
        if (this.f33786i != null && m3650k()) {
            abstractC11376e.mo1254a(f33759H);
            abstractC11376e.mo1256a(this.f33786i);
            abstractC11376e.mo1247b();
        }
        if (this.f33787j != null && m3648l()) {
            abstractC11376e.mo1254a(f33760I);
            abstractC11376e.mo1256a(this.f33787j);
            abstractC11376e.mo1247b();
        }
        if (this.f33788k != null && m3647m()) {
            abstractC11376e.mo1254a(f33761J);
            abstractC11376e.mo1256a(this.f33788k);
            abstractC11376e.mo1247b();
        }
        if (this.f33789l != null && m3646n()) {
            abstractC11376e.mo1254a(f33762K);
            abstractC11376e.mo1256a(this.f33789l);
            abstractC11376e.mo1247b();
        }
        if (m3645o()) {
            abstractC11376e.mo1254a(f33763L);
            abstractC11376e.mo1258a(this.f33790m);
            abstractC11376e.mo1247b();
        }
        if (m3644p()) {
            abstractC11376e.mo1254a(f33764M);
            abstractC11376e.mo1258a(this.f33791n);
            abstractC11376e.mo1247b();
        }
        if (this.f33792o != null && m3643q()) {
            abstractC11376e.mo1254a(f33765N);
            abstractC11376e.mo1256a(this.f33792o);
            abstractC11376e.mo1247b();
        }
        if (this.f33793p != null && m3642r()) {
            abstractC11376e.mo1254a(f33766O);
            abstractC11376e.mo1256a(this.f33793p);
            abstractC11376e.mo1247b();
        }
        if (this.f33794q != null && m3641s()) {
            abstractC11376e.mo1254a(f33767P);
            abstractC11376e.mo1256a(this.f33794q);
            abstractC11376e.mo1247b();
        }
        if (this.f33795r != null && m3640t()) {
            abstractC11376e.mo1254a(f33768Q);
            abstractC11376e.mo1256a(this.f33795r);
            abstractC11376e.mo1247b();
        }
        if (m3639u()) {
            abstractC11376e.mo1254a(f33769R);
            abstractC11376e.mo1258a(this.f33796s);
            abstractC11376e.mo1247b();
        }
        if (this.f33797t != null && m3638v()) {
            abstractC11376e.mo1254a(f33770S);
            abstractC11376e.mo1258a(this.f33797t.m3257a());
            abstractC11376e.mo1247b();
        }
        if (this.f33798u != null && m3637w()) {
            abstractC11376e.mo1254a(f33771T);
            abstractC11376e.mo1252a(new C11375d((byte) 11, (byte) 11, this.f33798u.size()));
            for (Map.Entry<String, String> entry : this.f33798u.entrySet()) {
                abstractC11376e.mo1256a(entry.getKey());
                abstractC11376e.mo1256a(entry.getValue());
            }
            abstractC11376e.mo1245d();
            abstractC11376e.mo1247b();
        }
        if (m3636x()) {
            abstractC11376e.mo1254a(f33772U);
            abstractC11376e.mo1248a(this.f33799v);
            abstractC11376e.mo1247b();
        }
        if (this.f33800w != null && m3635y()) {
            abstractC11376e.mo1254a(f33773V);
            abstractC11376e.mo1256a(this.f33800w);
            abstractC11376e.mo1247b();
        }
        abstractC11376e.mo1246c();
        abstractC11376e.mo1261a();
    }

    /* renamed from: b */
    public void m3670b(boolean z) {
        this.f33777W.set(1, z);
    }

    /* renamed from: b */
    public boolean m3674b() {
        return this.f33779b != null;
    }

    /* renamed from: c */
    public C10777af m3668c(int i) {
        this.f33796s = i;
        m3666c(true);
        return this;
    }

    /* renamed from: c */
    public C10777af m3667c(String str) {
        this.f33782e = str;
        return this;
    }

    /* renamed from: c */
    public void m3666c(boolean z) {
        this.f33777W.set(2, z);
    }

    /* renamed from: c */
    public boolean m3669c() {
        return this.f33780c != null;
    }

    /* renamed from: d */
    public C10777af m3664d(String str) {
        this.f33783f = str;
        return this;
    }

    /* renamed from: d */
    public String m3665d() {
        return this.f33781d;
    }

    /* renamed from: d */
    public void m3663d(boolean z) {
        this.f33777W.set(3, z);
    }

    /* renamed from: e */
    public C10777af m3661e(String str) {
        this.f33784g = str;
        return this;
    }

    /* renamed from: e */
    public boolean m3662e() {
        return this.f33781d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C10777af)) {
            return m3678a((C10777af) obj);
        }
        return false;
    }

    /* renamed from: f */
    public C10777af m3659f(String str) {
        this.f33785h = str;
        return this;
    }

    /* renamed from: f */
    public boolean m3660f() {
        return this.f33782e != null;
    }

    /* renamed from: g */
    public C10777af m3657g(String str) {
        this.f33789l = str;
        return this;
    }

    /* renamed from: g */
    public boolean m3658g() {
        return this.f33783f != null;
    }

    /* renamed from: h */
    public C10777af m3655h(String str) {
        this.f33792o = str;
        return this;
    }

    /* renamed from: h */
    public String m3656h() {
        return this.f33784g;
    }

    public int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public C10777af m3653i(String str) {
        this.f33793p = str;
        return this;
    }

    /* renamed from: i */
    public boolean m3654i() {
        return this.f33784g != null;
    }

    /* renamed from: j */
    public C10777af m3651j(String str) {
        this.f33794q = str;
        return this;
    }

    /* renamed from: j */
    public boolean m3652j() {
        return this.f33785h != null;
    }

    /* renamed from: k */
    public C10777af m3649k(String str) {
        this.f33795r = str;
        return this;
    }

    /* renamed from: k */
    public boolean m3650k() {
        return this.f33786i != null;
    }

    /* renamed from: l */
    public boolean m3648l() {
        return this.f33787j != null;
    }

    /* renamed from: m */
    public boolean m3647m() {
        return this.f33788k != null;
    }

    /* renamed from: n */
    public boolean m3646n() {
        return this.f33789l != null;
    }

    /* renamed from: o */
    public boolean m3645o() {
        return this.f33777W.get(0);
    }

    /* renamed from: p */
    public boolean m3644p() {
        return this.f33777W.get(1);
    }

    /* renamed from: q */
    public boolean m3643q() {
        return this.f33792o != null;
    }

    /* renamed from: r */
    public boolean m3642r() {
        return this.f33793p != null;
    }

    /* renamed from: s */
    public boolean m3641s() {
        return this.f33794q != null;
    }

    /* renamed from: t */
    public boolean m3640t() {
        return this.f33795r != null;
    }

    public String toString() {
        boolean z = false;
        StringBuilder sb = new StringBuilder("XmPushActionRegistration(");
        boolean z2 = true;
        if (m3680a()) {
            sb.append("debug:");
            if (this.f33778a == null) {
                sb.append("null");
            } else {
                sb.append(this.f33778a);
            }
            z2 = false;
        }
        if (m3674b()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("target:");
            if (this.f33779b == null) {
                sb.append("null");
            } else {
                sb.append(this.f33779b);
            }
        } else {
            z = z2;
        }
        if (!z) {
            sb.append(", ");
        }
        sb.append("id:");
        if (this.f33780c == null) {
            sb.append("null");
        } else {
            sb.append(this.f33780c);
        }
        sb.append(", ");
        sb.append("appId:");
        if (this.f33781d == null) {
            sb.append("null");
        } else {
            sb.append(this.f33781d);
        }
        if (m3660f()) {
            sb.append(", ");
            sb.append("appVersion:");
            if (this.f33782e == null) {
                sb.append("null");
            } else {
                sb.append(this.f33782e);
            }
        }
        if (m3658g()) {
            sb.append(", ");
            sb.append("packageName:");
            if (this.f33783f == null) {
                sb.append("null");
            } else {
                sb.append(this.f33783f);
            }
        }
        sb.append(", ");
        sb.append("token:");
        if (this.f33784g == null) {
            sb.append("null");
        } else {
            sb.append(this.f33784g);
        }
        if (m3652j()) {
            sb.append(", ");
            sb.append("deviceId:");
            if (this.f33785h == null) {
                sb.append("null");
            } else {
                sb.append(this.f33785h);
            }
        }
        if (m3650k()) {
            sb.append(", ");
            sb.append("aliasName:");
            if (this.f33786i == null) {
                sb.append("null");
            } else {
                sb.append(this.f33786i);
            }
        }
        if (m3648l()) {
            sb.append(", ");
            sb.append("sdkVersion:");
            if (this.f33787j == null) {
                sb.append("null");
            } else {
                sb.append(this.f33787j);
            }
        }
        if (m3647m()) {
            sb.append(", ");
            sb.append("regId:");
            if (this.f33788k == null) {
                sb.append("null");
            } else {
                sb.append(this.f33788k);
            }
        }
        if (m3646n()) {
            sb.append(", ");
            sb.append("pushSdkVersionName:");
            if (this.f33789l == null) {
                sb.append("null");
            } else {
                sb.append(this.f33789l);
            }
        }
        if (m3645o()) {
            sb.append(", ");
            sb.append("pushSdkVersionCode:");
            sb.append(this.f33790m);
        }
        if (m3644p()) {
            sb.append(", ");
            sb.append("appVersionCode:");
            sb.append(this.f33791n);
        }
        if (m3643q()) {
            sb.append(", ");
            sb.append("androidId:");
            if (this.f33792o == null) {
                sb.append("null");
            } else {
                sb.append(this.f33792o);
            }
        }
        if (m3642r()) {
            sb.append(", ");
            sb.append("imei:");
            if (this.f33793p == null) {
                sb.append("null");
            } else {
                sb.append(this.f33793p);
            }
        }
        if (m3641s()) {
            sb.append(", ");
            sb.append("serial:");
            if (this.f33794q == null) {
                sb.append("null");
            } else {
                sb.append(this.f33794q);
            }
        }
        if (m3640t()) {
            sb.append(", ");
            sb.append("imeiMd5:");
            if (this.f33795r == null) {
                sb.append("null");
            } else {
                sb.append(this.f33795r);
            }
        }
        if (m3639u()) {
            sb.append(", ");
            sb.append("spaceId:");
            sb.append(this.f33796s);
        }
        if (m3638v()) {
            sb.append(", ");
            sb.append("reason:");
            if (this.f33797t == null) {
                sb.append("null");
            } else {
                sb.append(this.f33797t);
            }
        }
        if (m3637w()) {
            sb.append(", ");
            sb.append("connectionAttrs:");
            if (this.f33798u == null) {
                sb.append("null");
            } else {
                sb.append(this.f33798u);
            }
        }
        if (m3636x()) {
            sb.append(", ");
            sb.append("cleanOldRegInfo:");
            sb.append(this.f33799v);
        }
        if (m3635y()) {
            sb.append(", ");
            sb.append("oldRegId:");
            if (this.f33800w == null) {
                sb.append("null");
            } else {
                sb.append(this.f33800w);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: u */
    public boolean m3639u() {
        return this.f33777W.get(2);
    }

    /* renamed from: v */
    public boolean m3638v() {
        return this.f33797t != null;
    }

    /* renamed from: w */
    public boolean m3637w() {
        return this.f33798u != null;
    }

    /* renamed from: x */
    public boolean m3636x() {
        return this.f33777W.get(3);
    }

    /* renamed from: y */
    public boolean m3635y() {
        return this.f33800w != null;
    }

    /* renamed from: z */
    public void m3634z() {
        if (this.f33780c == null) {
            throw new C11377f("Required field 'id' was not present! Struct: " + toString());
        }
        if (this.f33781d == null) {
            throw new C11377f("Required field 'appId' was not present! Struct: " + toString());
        }
        if (this.f33784g != null) {
            return;
        }
        throw new C11377f("Required field 'token' was not present! Struct: " + toString());
    }
}
