package com.xiaomi.xmpush.thrift;

import com.fimi.soul.utils.p219a.C3070c;
import com.p255mi.live.openlivesdk.C10022a;
import com.xiaomi.market.sdk.C10445j;
import java.io.Serializable;
import java.nio.ByteBuffer;
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
/* renamed from: com.xiaomi.xmpush.thrift.ae */
/* loaded from: classes2.dex */
public class C10775ae implements Serializable, Cloneable, AbstractC11361a<C10775ae, EnumC10776a> {

    /* renamed from: l */
    public static final Map<EnumC10776a, C11363b> f33712l;

    /* renamed from: m */
    private static final C11381j f33713m = new C11381j("XmPushActionNotification");

    /* renamed from: n */
    private static final C11373b f33714n = new C11373b(C10022a.f30894c, (byte) 11, 1);

    /* renamed from: o */
    private static final C11373b f33715o = new C11373b("target", (byte) 12, 2);

    /* renamed from: p */
    private static final C11373b f33716p = new C11373b("id", (byte) 11, 3);

    /* renamed from: q */
    private static final C11373b f33717q = new C11373b("appId", (byte) 11, 4);

    /* renamed from: r */
    private static final C11373b f33718r = new C11373b("type", (byte) 11, 5);

    /* renamed from: s */
    private static final C11373b f33719s = new C11373b("requireAck", (byte) 2, 6);

    /* renamed from: t */
    private static final C11373b f33720t = new C11373b(C3070c.C3071a.f11500d, (byte) 11, 7);

    /* renamed from: u */
    private static final C11373b f33721u = new C11373b("extra", (byte) 13, 8);

    /* renamed from: v */
    private static final C11373b f33722v = new C11373b(C10445j.f32447W, (byte) 11, 9);

    /* renamed from: w */
    private static final C11373b f33723w = new C11373b("category", (byte) 11, 10);

    /* renamed from: x */
    private static final C11373b f33724x = new C11373b("binaryExtra", (byte) 11, 14);

    /* renamed from: a */
    public String f33725a;

    /* renamed from: b */
    public C10831u f33726b;

    /* renamed from: c */
    public String f33727c;

    /* renamed from: d */
    public String f33728d;

    /* renamed from: e */
    public String f33729e;

    /* renamed from: f */
    public boolean f33730f;

    /* renamed from: g */
    public String f33731g;

    /* renamed from: h */
    public Map<String, String> f33732h;

    /* renamed from: i */
    public String f33733i;

    /* renamed from: j */
    public String f33734j;

    /* renamed from: k */
    public ByteBuffer f33735k;

    /* renamed from: y */
    private BitSet f33736y;

    /* renamed from: com.xiaomi.xmpush.thrift.ae$a */
    /* loaded from: classes2.dex */
    public enum EnumC10776a {
        DEBUG(1, C10022a.f30894c),
        TARGET(2, "target"),
        ID(3, "id"),
        APP_ID(4, "appId"),
        TYPE(5, "type"),
        REQUIRE_ACK(6, "requireAck"),
        PAYLOAD(7, C3070c.C3071a.f11500d),
        EXTRA(8, "extra"),
        PACKAGE_NAME(9, C10445j.f32447W),
        CATEGORY(10, "category"),
        BINARY_EXTRA(14, "binaryExtra");
        

        /* renamed from: l */
        private static final Map<String, EnumC10776a> f33748l = new HashMap();

        /* renamed from: m */
        private final short f33750m;

        /* renamed from: n */
        private final String f33751n;

        static {
            Iterator it2 = EnumSet.allOf(EnumC10776a.class).iterator();
            while (it2.hasNext()) {
                EnumC10776a enumC10776a = (EnumC10776a) it2.next();
                f33748l.put(enumC10776a.m3681a(), enumC10776a);
            }
        }

        EnumC10776a(short s, String str) {
            this.f33750m = s;
            this.f33751n = str;
        }

        /* renamed from: a */
        public String m3681a() {
            return this.f33751n;
        }
    }

    static {
        EnumMap enumMap = new EnumMap(EnumC10776a.class);
        enumMap.put((EnumMap) EnumC10776a.DEBUG, (EnumC10776a) new C11363b(C10022a.f30894c, (byte) 2, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10776a.TARGET, (EnumC10776a) new C11363b("target", (byte) 2, new C11368g((byte) 12, C10831u.class)));
        enumMap.put((EnumMap) EnumC10776a.ID, (EnumC10776a) new C11363b("id", (byte) 1, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10776a.APP_ID, (EnumC10776a) new C11363b("appId", (byte) 2, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10776a.TYPE, (EnumC10776a) new C11363b("type", (byte) 2, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10776a.REQUIRE_ACK, (EnumC10776a) new C11363b("requireAck", (byte) 1, new C11364c((byte) 2)));
        enumMap.put((EnumMap) EnumC10776a.PAYLOAD, (EnumC10776a) new C11363b(C3070c.C3071a.f11500d, (byte) 2, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10776a.EXTRA, (EnumC10776a) new C11363b("extra", (byte) 2, new C11366e((byte) 13, new C11364c((byte) 11), new C11364c((byte) 11))));
        enumMap.put((EnumMap) EnumC10776a.PACKAGE_NAME, (EnumC10776a) new C11363b(C10445j.f32447W, (byte) 2, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10776a.CATEGORY, (EnumC10776a) new C11363b("category", (byte) 2, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10776a.BINARY_EXTRA, (EnumC10776a) new C11363b("binaryExtra", (byte) 2, new C11364c((byte) 11)));
        f33712l = Collections.unmodifiableMap(enumMap);
        C11363b.m1284a(C10775ae.class, f33712l);
    }

    public C10775ae() {
        this.f33736y = new BitSet(1);
        this.f33730f = true;
    }

    public C10775ae(String str, boolean z) {
        this();
        this.f33727c = str;
        this.f33730f = z;
        m3697b(true);
    }

    /* renamed from: a */
    public C10775ae m3706a(String str) {
        this.f33727c = str;
        return this;
    }

    /* renamed from: a */
    public C10775ae m3704a(ByteBuffer byteBuffer) {
        this.f33735k = byteBuffer;
        return this;
    }

    /* renamed from: a */
    public C10775ae m3703a(Map<String, String> map) {
        this.f33732h = map;
        return this;
    }

    /* renamed from: a */
    public C10775ae m3702a(boolean z) {
        this.f33730f = z;
        m3697b(true);
        return this;
    }

    /* renamed from: a */
    public C10775ae m3701a(byte[] bArr) {
        m3704a(ByteBuffer.wrap(bArr));
        return this;
    }

    /* renamed from: a */
    public void m3705a(String str, String str2) {
        if (this.f33732h == null) {
            this.f33732h = new HashMap();
        }
        this.f33732h.put(str, str2);
    }

    @Override // org.p286a.p321b.AbstractC11361a
    /* renamed from: a */
    public void mo1286a(AbstractC11376e abstractC11376e) {
        abstractC11376e.mo1242g();
        while (true) {
            C11373b mo1240i = abstractC11376e.mo1240i();
            if (mo1240i.f36479b == 0) {
                abstractC11376e.mo1241h();
                if (!m3690g()) {
                    throw new C11377f("Required field 'requireAck' was not found in serialized data! Struct: " + toString());
                }
                m3682o();
                return;
            }
            switch (mo1240i.f36480c) {
                case 1:
                    if (mo1240i.f36479b == 11) {
                        this.f33725a = abstractC11376e.mo1223w();
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 2:
                    if (mo1240i.f36479b == 12) {
                        this.f33726b = new C10831u();
                        this.f33726b.mo1286a(abstractC11376e);
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 3:
                    if (mo1240i.f36479b == 11) {
                        this.f33727c = abstractC11376e.mo1223w();
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 4:
                    if (mo1240i.f36479b == 11) {
                        this.f33728d = abstractC11376e.mo1223w();
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 5:
                    if (mo1240i.f36479b == 11) {
                        this.f33729e = abstractC11376e.mo1223w();
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 6:
                    if (mo1240i.f36479b == 2) {
                        this.f33730f = abstractC11376e.mo1235q();
                        m3697b(true);
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 7:
                    if (mo1240i.f36479b == 11) {
                        this.f33731g = abstractC11376e.mo1223w();
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 8:
                    if (mo1240i.f36479b == 13) {
                        C11375d mo1226k = abstractC11376e.mo1226k();
                        this.f33732h = new HashMap(mo1226k.f36485c * 2);
                        for (int i = 0; i < mo1226k.f36485c; i++) {
                            this.f33732h.put(abstractC11376e.mo1223w(), abstractC11376e.mo1223w());
                        }
                        abstractC11376e.mo1238l();
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 9:
                    if (mo1240i.f36479b == 11) {
                        this.f33733i = abstractC11376e.mo1223w();
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 10:
                    if (mo1240i.f36479b == 11) {
                        this.f33734j = abstractC11376e.mo1223w();
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 11:
                case 12:
                case 13:
                default:
                    C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                    break;
                case 14:
                    if (mo1240i.f36479b == 11) {
                        this.f33735k = abstractC11376e.mo1222x();
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
    public boolean m3708a() {
        return this.f33725a != null;
    }

    /* renamed from: a */
    public boolean m3707a(C10775ae c10775ae) {
        if (c10775ae == null) {
            return false;
        }
        boolean m3708a = m3708a();
        boolean m3708a2 = c10775ae.m3708a();
        if ((m3708a || m3708a2) && (!m3708a || !m3708a2 || !this.f33725a.equals(c10775ae.f33725a))) {
            return false;
        }
        boolean m3700b = m3700b();
        boolean m3700b2 = c10775ae.m3700b();
        if ((m3700b || m3700b2) && (!m3700b || !m3700b2 || !this.f33726b.m3254a(c10775ae.f33726b))) {
            return false;
        }
        boolean m3694d = m3694d();
        boolean m3694d2 = c10775ae.m3694d();
        if ((m3694d || m3694d2) && (!m3694d || !m3694d2 || !this.f33727c.equals(c10775ae.f33727c))) {
            return false;
        }
        boolean m3692e = m3692e();
        boolean m3692e2 = c10775ae.m3692e();
        if ((m3692e || m3692e2) && (!m3692e || !m3692e2 || !this.f33728d.equals(c10775ae.f33728d))) {
            return false;
        }
        boolean m3691f = m3691f();
        boolean m3691f2 = c10775ae.m3691f();
        if (((m3691f || m3691f2) && (!m3691f || !m3691f2 || !this.f33729e.equals(c10775ae.f33729e))) || this.f33730f != c10775ae.f33730f) {
            return false;
        }
        boolean m3689h = m3689h();
        boolean m3689h2 = c10775ae.m3689h();
        if ((m3689h || m3689h2) && (!m3689h || !m3689h2 || !this.f33731g.equals(c10775ae.f33731g))) {
            return false;
        }
        boolean m3687j = m3687j();
        boolean m3687j2 = c10775ae.m3687j();
        if ((m3687j || m3687j2) && (!m3687j || !m3687j2 || !this.f33732h.equals(c10775ae.f33732h))) {
            return false;
        }
        boolean m3686k = m3686k();
        boolean m3686k2 = c10775ae.m3686k();
        if ((m3686k || m3686k2) && (!m3686k || !m3686k2 || !this.f33733i.equals(c10775ae.f33733i))) {
            return false;
        }
        boolean m3685l = m3685l();
        boolean m3685l2 = c10775ae.m3685l();
        if ((m3685l || m3685l2) && (!m3685l || !m3685l2 || !this.f33734j.equals(c10775ae.f33734j))) {
            return false;
        }
        boolean m3683n = m3683n();
        boolean m3683n2 = c10775ae.m3683n();
        return (!m3683n && !m3683n2) || (m3683n && m3683n2 && this.f33735k.equals(c10775ae.f33735k));
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(C10775ae c10775ae) {
        int m1278a;
        int m1277a;
        int m1277a2;
        int m1272a;
        int m1277a3;
        int m1269a;
        int m1277a4;
        int m1277a5;
        int m1277a6;
        int m1278a2;
        int m1277a7;
        if (!getClass().equals(c10775ae.getClass())) {
            return getClass().getName().compareTo(c10775ae.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m3708a()).compareTo(Boolean.valueOf(c10775ae.m3708a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m3708a() && (m1277a7 = C11369b.m1277a(this.f33725a, c10775ae.f33725a)) != 0) {
            return m1277a7;
        }
        int compareTo2 = Boolean.valueOf(m3700b()).compareTo(Boolean.valueOf(c10775ae.m3700b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m3700b() && (m1278a2 = C11369b.m1278a(this.f33726b, c10775ae.f33726b)) != 0) {
            return m1278a2;
        }
        int compareTo3 = Boolean.valueOf(m3694d()).compareTo(Boolean.valueOf(c10775ae.m3694d()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (m3694d() && (m1277a6 = C11369b.m1277a(this.f33727c, c10775ae.f33727c)) != 0) {
            return m1277a6;
        }
        int compareTo4 = Boolean.valueOf(m3692e()).compareTo(Boolean.valueOf(c10775ae.m3692e()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (m3692e() && (m1277a5 = C11369b.m1277a(this.f33728d, c10775ae.f33728d)) != 0) {
            return m1277a5;
        }
        int compareTo5 = Boolean.valueOf(m3691f()).compareTo(Boolean.valueOf(c10775ae.m3691f()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (m3691f() && (m1277a4 = C11369b.m1277a(this.f33729e, c10775ae.f33729e)) != 0) {
            return m1277a4;
        }
        int compareTo6 = Boolean.valueOf(m3690g()).compareTo(Boolean.valueOf(c10775ae.m3690g()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (m3690g() && (m1269a = C11369b.m1269a(this.f33730f, c10775ae.f33730f)) != 0) {
            return m1269a;
        }
        int compareTo7 = Boolean.valueOf(m3689h()).compareTo(Boolean.valueOf(c10775ae.m3689h()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (m3689h() && (m1277a3 = C11369b.m1277a(this.f33731g, c10775ae.f33731g)) != 0) {
            return m1277a3;
        }
        int compareTo8 = Boolean.valueOf(m3687j()).compareTo(Boolean.valueOf(c10775ae.m3687j()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (m3687j() && (m1272a = C11369b.m1272a(this.f33732h, c10775ae.f33732h)) != 0) {
            return m1272a;
        }
        int compareTo9 = Boolean.valueOf(m3686k()).compareTo(Boolean.valueOf(c10775ae.m3686k()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (m3686k() && (m1277a2 = C11369b.m1277a(this.f33733i, c10775ae.f33733i)) != 0) {
            return m1277a2;
        }
        int compareTo10 = Boolean.valueOf(m3685l()).compareTo(Boolean.valueOf(c10775ae.m3685l()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (m3685l() && (m1277a = C11369b.m1277a(this.f33734j, c10775ae.f33734j)) != 0) {
            return m1277a;
        }
        int compareTo11 = Boolean.valueOf(m3683n()).compareTo(Boolean.valueOf(c10775ae.m3683n()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (m3683n() && (m1278a = C11369b.m1278a(this.f33735k, c10775ae.f33735k)) != 0) {
            return m1278a;
        }
        return 0;
    }

    /* renamed from: b */
    public C10775ae m3698b(String str) {
        this.f33728d = str;
        return this;
    }

    @Override // org.p286a.p321b.AbstractC11361a
    /* renamed from: b */
    public void mo1285b(AbstractC11376e abstractC11376e) {
        m3682o();
        abstractC11376e.mo1250a(f33713m);
        if (this.f33725a != null && m3708a()) {
            abstractC11376e.mo1254a(f33714n);
            abstractC11376e.mo1256a(this.f33725a);
            abstractC11376e.mo1247b();
        }
        if (this.f33726b != null && m3700b()) {
            abstractC11376e.mo1254a(f33715o);
            this.f33726b.mo1285b(abstractC11376e);
            abstractC11376e.mo1247b();
        }
        if (this.f33727c != null) {
            abstractC11376e.mo1254a(f33716p);
            abstractC11376e.mo1256a(this.f33727c);
            abstractC11376e.mo1247b();
        }
        if (this.f33728d != null && m3692e()) {
            abstractC11376e.mo1254a(f33717q);
            abstractC11376e.mo1256a(this.f33728d);
            abstractC11376e.mo1247b();
        }
        if (this.f33729e != null && m3691f()) {
            abstractC11376e.mo1254a(f33718r);
            abstractC11376e.mo1256a(this.f33729e);
            abstractC11376e.mo1247b();
        }
        abstractC11376e.mo1254a(f33719s);
        abstractC11376e.mo1248a(this.f33730f);
        abstractC11376e.mo1247b();
        if (this.f33731g != null && m3689h()) {
            abstractC11376e.mo1254a(f33720t);
            abstractC11376e.mo1256a(this.f33731g);
            abstractC11376e.mo1247b();
        }
        if (this.f33732h != null && m3687j()) {
            abstractC11376e.mo1254a(f33721u);
            abstractC11376e.mo1252a(new C11375d((byte) 11, (byte) 11, this.f33732h.size()));
            for (Map.Entry<String, String> entry : this.f33732h.entrySet()) {
                abstractC11376e.mo1256a(entry.getKey());
                abstractC11376e.mo1256a(entry.getValue());
            }
            abstractC11376e.mo1245d();
            abstractC11376e.mo1247b();
        }
        if (this.f33733i != null && m3686k()) {
            abstractC11376e.mo1254a(f33722v);
            abstractC11376e.mo1256a(this.f33733i);
            abstractC11376e.mo1247b();
        }
        if (this.f33734j != null && m3685l()) {
            abstractC11376e.mo1254a(f33723w);
            abstractC11376e.mo1256a(this.f33734j);
            abstractC11376e.mo1247b();
        }
        if (this.f33735k != null && m3683n()) {
            abstractC11376e.mo1254a(f33724x);
            abstractC11376e.mo1255a(this.f33735k);
            abstractC11376e.mo1247b();
        }
        abstractC11376e.mo1246c();
        abstractC11376e.mo1261a();
    }

    /* renamed from: b */
    public void m3697b(boolean z) {
        this.f33736y.set(0, z);
    }

    /* renamed from: b */
    public boolean m3700b() {
        return this.f33726b != null;
    }

    /* renamed from: c */
    public C10775ae m3695c(String str) {
        this.f33729e = str;
        return this;
    }

    /* renamed from: c */
    public String m3696c() {
        return this.f33727c;
    }

    /* renamed from: d */
    public C10775ae m3693d(String str) {
        this.f33733i = str;
        return this;
    }

    /* renamed from: d */
    public boolean m3694d() {
        return this.f33727c != null;
    }

    /* renamed from: e */
    public boolean m3692e() {
        return this.f33728d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C10775ae)) {
            return m3707a((C10775ae) obj);
        }
        return false;
    }

    /* renamed from: f */
    public boolean m3691f() {
        return this.f33729e != null;
    }

    /* renamed from: g */
    public boolean m3690g() {
        return this.f33736y.get(0);
    }

    /* renamed from: h */
    public boolean m3689h() {
        return this.f33731g != null;
    }

    public int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public Map<String, String> m3688i() {
        return this.f33732h;
    }

    /* renamed from: j */
    public boolean m3687j() {
        return this.f33732h != null;
    }

    /* renamed from: k */
    public boolean m3686k() {
        return this.f33733i != null;
    }

    /* renamed from: l */
    public boolean m3685l() {
        return this.f33734j != null;
    }

    /* renamed from: m */
    public byte[] m3684m() {
        m3704a(C11369b.m1266c(this.f33735k));
        return this.f33735k.array();
    }

    /* renamed from: n */
    public boolean m3683n() {
        return this.f33735k != null;
    }

    /* renamed from: o */
    public void m3682o() {
        if (this.f33727c == null) {
            throw new C11377f("Required field 'id' was not present! Struct: " + toString());
        }
    }

    public String toString() {
        boolean z = false;
        StringBuilder sb = new StringBuilder("XmPushActionNotification(");
        boolean z2 = true;
        if (m3708a()) {
            sb.append("debug:");
            if (this.f33725a == null) {
                sb.append("null");
            } else {
                sb.append(this.f33725a);
            }
            z2 = false;
        }
        if (m3700b()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("target:");
            if (this.f33726b == null) {
                sb.append("null");
            } else {
                sb.append(this.f33726b);
            }
        } else {
            z = z2;
        }
        if (!z) {
            sb.append(", ");
        }
        sb.append("id:");
        if (this.f33727c == null) {
            sb.append("null");
        } else {
            sb.append(this.f33727c);
        }
        if (m3692e()) {
            sb.append(", ");
            sb.append("appId:");
            if (this.f33728d == null) {
                sb.append("null");
            } else {
                sb.append(this.f33728d);
            }
        }
        if (m3691f()) {
            sb.append(", ");
            sb.append("type:");
            if (this.f33729e == null) {
                sb.append("null");
            } else {
                sb.append(this.f33729e);
            }
        }
        sb.append(", ");
        sb.append("requireAck:");
        sb.append(this.f33730f);
        if (m3689h()) {
            sb.append(", ");
            sb.append("payload:");
            if (this.f33731g == null) {
                sb.append("null");
            } else {
                sb.append(this.f33731g);
            }
        }
        if (m3687j()) {
            sb.append(", ");
            sb.append("extra:");
            if (this.f33732h == null) {
                sb.append("null");
            } else {
                sb.append(this.f33732h);
            }
        }
        if (m3686k()) {
            sb.append(", ");
            sb.append("packageName:");
            if (this.f33733i == null) {
                sb.append("null");
            } else {
                sb.append(this.f33733i);
            }
        }
        if (m3685l()) {
            sb.append(", ");
            sb.append("category:");
            if (this.f33734j == null) {
                sb.append("null");
            } else {
                sb.append(this.f33734j);
            }
        }
        if (m3683n()) {
            sb.append(", ");
            sb.append("binaryExtra:");
            if (this.f33735k == null) {
                sb.append("null");
            } else {
                C11369b.m1275a(this.f33735k, sb);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
