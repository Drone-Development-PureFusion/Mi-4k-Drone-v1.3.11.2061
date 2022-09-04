package com.xiaomi.xmpush.thrift;

import com.fimi.soul.utils.p219a.C3070c;
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
import org.p286a.p321b.p323b.AbstractC11376e;
import org.p286a.p321b.p323b.C11373b;
import org.p286a.p321b.p323b.C11375d;
import org.p286a.p321b.p323b.C11377f;
import org.p286a.p321b.p323b.C11379h;
import org.p286a.p321b.p323b.C11381j;
/* renamed from: com.xiaomi.xmpush.thrift.r */
/* loaded from: classes2.dex */
public class C10826r implements Serializable, Cloneable, AbstractC11361a<C10826r, EnumC10827a> {

    /* renamed from: m */
    public static final Map<EnumC10827a, C11363b> f34478m;

    /* renamed from: n */
    private static final C11381j f34479n = new C11381j("PushMetaInfo");

    /* renamed from: o */
    private static final C11373b f34480o = new C11373b("id", (byte) 11, 1);

    /* renamed from: p */
    private static final C11373b f34481p = new C11373b("messageTs", (byte) 10, 2);

    /* renamed from: q */
    private static final C11373b f34482q = new C11373b("topic", (byte) 11, 3);

    /* renamed from: r */
    private static final C11373b f34483r = new C11373b("title", (byte) 11, 4);

    /* renamed from: s */
    private static final C11373b f34484s = new C11373b("description", (byte) 11, 5);

    /* renamed from: t */
    private static final C11373b f34485t = new C11373b("notifyType", (byte) 8, 6);

    /* renamed from: u */
    private static final C11373b f34486u = new C11373b("url", (byte) 11, 7);

    /* renamed from: v */
    private static final C11373b f34487v = new C11373b(C3070c.C3071a.f11502f, (byte) 8, 8);

    /* renamed from: w */
    private static final C11373b f34488w = new C11373b("notifyId", (byte) 8, 9);

    /* renamed from: x */
    private static final C11373b f34489x = new C11373b("extra", (byte) 13, 10);

    /* renamed from: y */
    private static final C11373b f34490y = new C11373b("internal", (byte) 13, 11);

    /* renamed from: z */
    private static final C11373b f34491z = new C11373b("ignoreRegInfo", (byte) 2, 12);

    /* renamed from: A */
    private BitSet f34492A;

    /* renamed from: a */
    public String f34493a;

    /* renamed from: b */
    public long f34494b;

    /* renamed from: c */
    public String f34495c;

    /* renamed from: d */
    public String f34496d;

    /* renamed from: e */
    public String f34497e;

    /* renamed from: f */
    public int f34498f;

    /* renamed from: g */
    public String f34499g;

    /* renamed from: h */
    public int f34500h;

    /* renamed from: i */
    public int f34501i;

    /* renamed from: j */
    public Map<String, String> f34502j;

    /* renamed from: k */
    public Map<String, String> f34503k;

    /* renamed from: l */
    public boolean f34504l;

    /* renamed from: com.xiaomi.xmpush.thrift.r$a */
    /* loaded from: classes2.dex */
    public enum EnumC10827a {
        ID(1, "id"),
        MESSAGE_TS(2, "messageTs"),
        TOPIC(3, "topic"),
        TITLE(4, "title"),
        DESCRIPTION(5, "description"),
        NOTIFY_TYPE(6, "notifyType"),
        URL(7, "url"),
        PASS_THROUGH(8, C3070c.C3071a.f11502f),
        NOTIFY_ID(9, "notifyId"),
        EXTRA(10, "extra"),
        INTERNAL(11, "internal"),
        IGNORE_REG_INFO(12, "ignoreRegInfo");
        

        /* renamed from: m */
        private static final Map<String, EnumC10827a> f34517m = new HashMap();

        /* renamed from: n */
        private final short f34519n;

        /* renamed from: o */
        private final String f34520o;

        static {
            Iterator it2 = EnumSet.allOf(EnumC10827a.class).iterator();
            while (it2.hasNext()) {
                EnumC10827a enumC10827a = (EnumC10827a) it2.next();
                f34517m.put(enumC10827a.m3265a(), enumC10827a);
            }
        }

        EnumC10827a(short s, String str) {
            this.f34519n = s;
            this.f34520o = str;
        }

        /* renamed from: a */
        public String m3265a() {
            return this.f34520o;
        }
    }

    static {
        EnumMap enumMap = new EnumMap(EnumC10827a.class);
        enumMap.put((EnumMap) EnumC10827a.ID, (EnumC10827a) new C11363b("id", (byte) 1, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10827a.MESSAGE_TS, (EnumC10827a) new C11363b("messageTs", (byte) 1, new C11364c((byte) 10)));
        enumMap.put((EnumMap) EnumC10827a.TOPIC, (EnumC10827a) new C11363b("topic", (byte) 2, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10827a.TITLE, (EnumC10827a) new C11363b("title", (byte) 2, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10827a.DESCRIPTION, (EnumC10827a) new C11363b("description", (byte) 2, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10827a.NOTIFY_TYPE, (EnumC10827a) new C11363b("notifyType", (byte) 2, new C11364c((byte) 8)));
        enumMap.put((EnumMap) EnumC10827a.URL, (EnumC10827a) new C11363b("url", (byte) 2, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10827a.PASS_THROUGH, (EnumC10827a) new C11363b(C3070c.C3071a.f11502f, (byte) 2, new C11364c((byte) 8)));
        enumMap.put((EnumMap) EnumC10827a.NOTIFY_ID, (EnumC10827a) new C11363b("notifyId", (byte) 2, new C11364c((byte) 8)));
        enumMap.put((EnumMap) EnumC10827a.EXTRA, (EnumC10827a) new C11363b("extra", (byte) 2, new C11366e((byte) 13, new C11364c((byte) 11), new C11364c((byte) 11))));
        enumMap.put((EnumMap) EnumC10827a.INTERNAL, (EnumC10827a) new C11363b("internal", (byte) 2, new C11366e((byte) 13, new C11364c((byte) 11), new C11364c((byte) 11))));
        enumMap.put((EnumMap) EnumC10827a.IGNORE_REG_INFO, (EnumC10827a) new C11363b("ignoreRegInfo", (byte) 2, new C11364c((byte) 2)));
        f34478m = Collections.unmodifiableMap(enumMap);
        C11363b.m1284a(C10826r.class, f34478m);
    }

    public C10826r() {
        this.f34492A = new BitSet(5);
        this.f34504l = false;
    }

    public C10826r(C10826r c10826r) {
        this.f34492A = new BitSet(5);
        this.f34492A.clear();
        this.f34492A.or(c10826r.f34492A);
        if (c10826r.m3293c()) {
            this.f34493a = c10826r.f34493a;
        }
        this.f34494b = c10826r.f34494b;
        if (c10826r.m3283g()) {
            this.f34495c = c10826r.f34495c;
        }
        if (c10826r.m3281i()) {
            this.f34496d = c10826r.f34496d;
        }
        if (c10826r.m3279k()) {
            this.f34497e = c10826r.f34497e;
        }
        this.f34498f = c10826r.f34498f;
        if (c10826r.m3276n()) {
            this.f34499g = c10826r.f34499g;
        }
        this.f34500h = c10826r.f34500h;
        this.f34501i = c10826r.f34501i;
        if (c10826r.m3270t()) {
            HashMap hashMap = new HashMap();
            for (Map.Entry<String, String> entry : c10826r.f34502j.entrySet()) {
                hashMap.put(entry.getKey(), entry.getValue());
            }
            this.f34502j = hashMap;
        }
        if (c10826r.m3269u()) {
            HashMap hashMap2 = new HashMap();
            for (Map.Entry<String, String> entry2 : c10826r.f34503k.entrySet()) {
                hashMap2.put(entry2.getKey(), entry2.getValue());
            }
            this.f34503k = hashMap2;
        }
        this.f34504l = c10826r.f34504l;
    }

    /* renamed from: a */
    public C10826r m3305a() {
        return new C10826r(this);
    }

    /* renamed from: a */
    public C10826r m3304a(int i) {
        this.f34498f = i;
        m3294b(true);
        return this;
    }

    /* renamed from: a */
    public C10826r m3302a(String str) {
        this.f34493a = str;
        return this;
    }

    /* renamed from: a */
    public C10826r m3300a(Map<String, String> map) {
        this.f34502j = map;
        return this;
    }

    /* renamed from: a */
    public void m3301a(String str, String str2) {
        if (this.f34502j == null) {
            this.f34502j = new HashMap();
        }
        this.f34502j.put(str, str2);
    }

    @Override // org.p286a.p321b.AbstractC11361a
    /* renamed from: a */
    public void mo1286a(AbstractC11376e abstractC11376e) {
        abstractC11376e.mo1242g();
        while (true) {
            C11373b mo1240i = abstractC11376e.mo1240i();
            if (mo1240i.f36479b == 0) {
                abstractC11376e.mo1241h();
                if (!m3286e()) {
                    throw new C11377f("Required field 'messageTs' was not found in serialized data! Struct: " + toString());
                }
                m3266x();
                return;
            }
            switch (mo1240i.f36480c) {
                case 1:
                    if (mo1240i.f36479b == 11) {
                        this.f34493a = abstractC11376e.mo1223w();
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 2:
                    if (mo1240i.f36479b == 10) {
                        this.f34494b = abstractC11376e.mo1231u();
                        m3299a(true);
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 3:
                    if (mo1240i.f36479b == 11) {
                        this.f34495c = abstractC11376e.mo1223w();
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 4:
                    if (mo1240i.f36479b == 11) {
                        this.f34496d = abstractC11376e.mo1223w();
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 5:
                    if (mo1240i.f36479b == 11) {
                        this.f34497e = abstractC11376e.mo1223w();
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 6:
                    if (mo1240i.f36479b == 8) {
                        this.f34498f = abstractC11376e.mo1232t();
                        m3294b(true);
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 7:
                    if (mo1240i.f36479b == 11) {
                        this.f34499g = abstractC11376e.mo1223w();
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 8:
                    if (mo1240i.f36479b == 8) {
                        this.f34500h = abstractC11376e.mo1232t();
                        m3290c(true);
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 9:
                    if (mo1240i.f36479b == 8) {
                        this.f34501i = abstractC11376e.mo1232t();
                        m3287d(true);
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 10:
                    if (mo1240i.f36479b == 13) {
                        C11375d mo1226k = abstractC11376e.mo1226k();
                        this.f34502j = new HashMap(mo1226k.f36485c * 2);
                        for (int i = 0; i < mo1226k.f36485c; i++) {
                            this.f34502j.put(abstractC11376e.mo1223w(), abstractC11376e.mo1223w());
                        }
                        abstractC11376e.mo1238l();
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 11:
                    if (mo1240i.f36479b == 13) {
                        C11375d mo1226k2 = abstractC11376e.mo1226k();
                        this.f34503k = new HashMap(mo1226k2.f36485c * 2);
                        for (int i2 = 0; i2 < mo1226k2.f36485c; i2++) {
                            this.f34503k.put(abstractC11376e.mo1223w(), abstractC11376e.mo1223w());
                        }
                        abstractC11376e.mo1238l();
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 12:
                    if (mo1240i.f36479b == 2) {
                        this.f34504l = abstractC11376e.mo1235q();
                        m3285e(true);
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
    public void m3299a(boolean z) {
        this.f34492A.set(0, z);
    }

    /* renamed from: a */
    public boolean m3303a(C10826r c10826r) {
        if (c10826r == null) {
            return false;
        }
        boolean m3293c = m3293c();
        boolean m3293c2 = c10826r.m3293c();
        if (((m3293c || m3293c2) && (!m3293c || !m3293c2 || !this.f34493a.equals(c10826r.f34493a))) || this.f34494b != c10826r.f34494b) {
            return false;
        }
        boolean m3283g = m3283g();
        boolean m3283g2 = c10826r.m3283g();
        if ((m3283g || m3283g2) && (!m3283g || !m3283g2 || !this.f34495c.equals(c10826r.f34495c))) {
            return false;
        }
        boolean m3281i = m3281i();
        boolean m3281i2 = c10826r.m3281i();
        if ((m3281i || m3281i2) && (!m3281i || !m3281i2 || !this.f34496d.equals(c10826r.f34496d))) {
            return false;
        }
        boolean m3279k = m3279k();
        boolean m3279k2 = c10826r.m3279k();
        if ((m3279k || m3279k2) && (!m3279k || !m3279k2 || !this.f34497e.equals(c10826r.f34497e))) {
            return false;
        }
        boolean m3277m = m3277m();
        boolean m3277m2 = c10826r.m3277m();
        if ((m3277m || m3277m2) && (!m3277m || !m3277m2 || this.f34498f != c10826r.f34498f)) {
            return false;
        }
        boolean m3276n = m3276n();
        boolean m3276n2 = c10826r.m3276n();
        if ((m3276n || m3276n2) && (!m3276n || !m3276n2 || !this.f34499g.equals(c10826r.f34499g))) {
            return false;
        }
        boolean m3274p = m3274p();
        boolean m3274p2 = c10826r.m3274p();
        if ((m3274p || m3274p2) && (!m3274p || !m3274p2 || this.f34500h != c10826r.f34500h)) {
            return false;
        }
        boolean m3272r = m3272r();
        boolean m3272r2 = c10826r.m3272r();
        if ((m3272r || m3272r2) && (!m3272r || !m3272r2 || this.f34501i != c10826r.f34501i)) {
            return false;
        }
        boolean m3270t = m3270t();
        boolean m3270t2 = c10826r.m3270t();
        if ((m3270t || m3270t2) && (!m3270t || !m3270t2 || !this.f34502j.equals(c10826r.f34502j))) {
            return false;
        }
        boolean m3269u = m3269u();
        boolean m3269u2 = c10826r.m3269u();
        if ((m3269u || m3269u2) && (!m3269u || !m3269u2 || !this.f34503k.equals(c10826r.f34503k))) {
            return false;
        }
        boolean m3267w = m3267w();
        boolean m3267w2 = c10826r.m3267w();
        return (!m3267w && !m3267w2) || (m3267w && m3267w2 && this.f34504l == c10826r.f34504l);
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(C10826r c10826r) {
        int m1269a;
        int m1272a;
        int m1272a2;
        int m1280a;
        int m1280a2;
        int m1277a;
        int m1280a3;
        int m1277a2;
        int m1277a3;
        int m1277a4;
        int m1279a;
        int m1277a5;
        if (!getClass().equals(c10826r.getClass())) {
            return getClass().getName().compareTo(c10826r.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m3293c()).compareTo(Boolean.valueOf(c10826r.m3293c()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m3293c() && (m1277a5 = C11369b.m1277a(this.f34493a, c10826r.f34493a)) != 0) {
            return m1277a5;
        }
        int compareTo2 = Boolean.valueOf(m3286e()).compareTo(Boolean.valueOf(c10826r.m3286e()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m3286e() && (m1279a = C11369b.m1279a(this.f34494b, c10826r.f34494b)) != 0) {
            return m1279a;
        }
        int compareTo3 = Boolean.valueOf(m3283g()).compareTo(Boolean.valueOf(c10826r.m3283g()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (m3283g() && (m1277a4 = C11369b.m1277a(this.f34495c, c10826r.f34495c)) != 0) {
            return m1277a4;
        }
        int compareTo4 = Boolean.valueOf(m3281i()).compareTo(Boolean.valueOf(c10826r.m3281i()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (m3281i() && (m1277a3 = C11369b.m1277a(this.f34496d, c10826r.f34496d)) != 0) {
            return m1277a3;
        }
        int compareTo5 = Boolean.valueOf(m3279k()).compareTo(Boolean.valueOf(c10826r.m3279k()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (m3279k() && (m1277a2 = C11369b.m1277a(this.f34497e, c10826r.f34497e)) != 0) {
            return m1277a2;
        }
        int compareTo6 = Boolean.valueOf(m3277m()).compareTo(Boolean.valueOf(c10826r.m3277m()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (m3277m() && (m1280a3 = C11369b.m1280a(this.f34498f, c10826r.f34498f)) != 0) {
            return m1280a3;
        }
        int compareTo7 = Boolean.valueOf(m3276n()).compareTo(Boolean.valueOf(c10826r.m3276n()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (m3276n() && (m1277a = C11369b.m1277a(this.f34499g, c10826r.f34499g)) != 0) {
            return m1277a;
        }
        int compareTo8 = Boolean.valueOf(m3274p()).compareTo(Boolean.valueOf(c10826r.m3274p()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (m3274p() && (m1280a2 = C11369b.m1280a(this.f34500h, c10826r.f34500h)) != 0) {
            return m1280a2;
        }
        int compareTo9 = Boolean.valueOf(m3272r()).compareTo(Boolean.valueOf(c10826r.m3272r()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (m3272r() && (m1280a = C11369b.m1280a(this.f34501i, c10826r.f34501i)) != 0) {
            return m1280a;
        }
        int compareTo10 = Boolean.valueOf(m3270t()).compareTo(Boolean.valueOf(c10826r.m3270t()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (m3270t() && (m1272a2 = C11369b.m1272a(this.f34502j, c10826r.f34502j)) != 0) {
            return m1272a2;
        }
        int compareTo11 = Boolean.valueOf(m3269u()).compareTo(Boolean.valueOf(c10826r.m3269u()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (m3269u() && (m1272a = C11369b.m1272a(this.f34503k, c10826r.f34503k)) != 0) {
            return m1272a;
        }
        int compareTo12 = Boolean.valueOf(m3267w()).compareTo(Boolean.valueOf(c10826r.m3267w()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (m3267w() && (m1269a = C11369b.m1269a(this.f34504l, c10826r.f34504l)) != 0) {
            return m1269a;
        }
        return 0;
    }

    /* renamed from: b */
    public C10826r m3297b(int i) {
        this.f34500h = i;
        m3290c(true);
        return this;
    }

    /* renamed from: b */
    public C10826r m3295b(String str) {
        this.f34495c = str;
        return this;
    }

    /* renamed from: b */
    public String m3298b() {
        return this.f34493a;
    }

    @Override // org.p286a.p321b.AbstractC11361a
    /* renamed from: b */
    public void mo1285b(AbstractC11376e abstractC11376e) {
        m3266x();
        abstractC11376e.mo1250a(f34479n);
        if (this.f34493a != null) {
            abstractC11376e.mo1254a(f34480o);
            abstractC11376e.mo1256a(this.f34493a);
            abstractC11376e.mo1247b();
        }
        abstractC11376e.mo1254a(f34481p);
        abstractC11376e.mo1257a(this.f34494b);
        abstractC11376e.mo1247b();
        if (this.f34495c != null && m3283g()) {
            abstractC11376e.mo1254a(f34482q);
            abstractC11376e.mo1256a(this.f34495c);
            abstractC11376e.mo1247b();
        }
        if (this.f34496d != null && m3281i()) {
            abstractC11376e.mo1254a(f34483r);
            abstractC11376e.mo1256a(this.f34496d);
            abstractC11376e.mo1247b();
        }
        if (this.f34497e != null && m3279k()) {
            abstractC11376e.mo1254a(f34484s);
            abstractC11376e.mo1256a(this.f34497e);
            abstractC11376e.mo1247b();
        }
        if (m3277m()) {
            abstractC11376e.mo1254a(f34485t);
            abstractC11376e.mo1258a(this.f34498f);
            abstractC11376e.mo1247b();
        }
        if (this.f34499g != null && m3276n()) {
            abstractC11376e.mo1254a(f34486u);
            abstractC11376e.mo1256a(this.f34499g);
            abstractC11376e.mo1247b();
        }
        if (m3274p()) {
            abstractC11376e.mo1254a(f34487v);
            abstractC11376e.mo1258a(this.f34500h);
            abstractC11376e.mo1247b();
        }
        if (m3272r()) {
            abstractC11376e.mo1254a(f34488w);
            abstractC11376e.mo1258a(this.f34501i);
            abstractC11376e.mo1247b();
        }
        if (this.f34502j != null && m3270t()) {
            abstractC11376e.mo1254a(f34489x);
            abstractC11376e.mo1252a(new C11375d((byte) 11, (byte) 11, this.f34502j.size()));
            for (Map.Entry<String, String> entry : this.f34502j.entrySet()) {
                abstractC11376e.mo1256a(entry.getKey());
                abstractC11376e.mo1256a(entry.getValue());
            }
            abstractC11376e.mo1245d();
            abstractC11376e.mo1247b();
        }
        if (this.f34503k != null && m3269u()) {
            abstractC11376e.mo1254a(f34490y);
            abstractC11376e.mo1252a(new C11375d((byte) 11, (byte) 11, this.f34503k.size()));
            for (Map.Entry<String, String> entry2 : this.f34503k.entrySet()) {
                abstractC11376e.mo1256a(entry2.getKey());
                abstractC11376e.mo1256a(entry2.getValue());
            }
            abstractC11376e.mo1245d();
            abstractC11376e.mo1247b();
        }
        if (m3267w()) {
            abstractC11376e.mo1254a(f34491z);
            abstractC11376e.mo1248a(this.f34504l);
            abstractC11376e.mo1247b();
        }
        abstractC11376e.mo1246c();
        abstractC11376e.mo1261a();
    }

    /* renamed from: b */
    public void m3294b(boolean z) {
        this.f34492A.set(1, z);
    }

    /* renamed from: c */
    public C10826r m3292c(int i) {
        this.f34501i = i;
        m3287d(true);
        return this;
    }

    /* renamed from: c */
    public C10826r m3291c(String str) {
        this.f34496d = str;
        return this;
    }

    /* renamed from: c */
    public void m3290c(boolean z) {
        this.f34492A.set(2, z);
    }

    /* renamed from: c */
    public boolean m3293c() {
        return this.f34493a != null;
    }

    /* renamed from: d */
    public long m3289d() {
        return this.f34494b;
    }

    /* renamed from: d */
    public C10826r m3288d(String str) {
        this.f34497e = str;
        return this;
    }

    /* renamed from: d */
    public void m3287d(boolean z) {
        this.f34492A.set(3, z);
    }

    /* renamed from: e */
    public void m3285e(boolean z) {
        this.f34492A.set(4, z);
    }

    /* renamed from: e */
    public boolean m3286e() {
        return this.f34492A.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C10826r)) {
            return m3303a((C10826r) obj);
        }
        return false;
    }

    /* renamed from: f */
    public String m3284f() {
        return this.f34495c;
    }

    /* renamed from: g */
    public boolean m3283g() {
        return this.f34495c != null;
    }

    /* renamed from: h */
    public String m3282h() {
        return this.f34496d;
    }

    public int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public boolean m3281i() {
        return this.f34496d != null;
    }

    /* renamed from: j */
    public String m3280j() {
        return this.f34497e;
    }

    /* renamed from: k */
    public boolean m3279k() {
        return this.f34497e != null;
    }

    /* renamed from: l */
    public int m3278l() {
        return this.f34498f;
    }

    /* renamed from: m */
    public boolean m3277m() {
        return this.f34492A.get(1);
    }

    /* renamed from: n */
    public boolean m3276n() {
        return this.f34499g != null;
    }

    /* renamed from: o */
    public int m3275o() {
        return this.f34500h;
    }

    /* renamed from: p */
    public boolean m3274p() {
        return this.f34492A.get(2);
    }

    /* renamed from: q */
    public int m3273q() {
        return this.f34501i;
    }

    /* renamed from: r */
    public boolean m3272r() {
        return this.f34492A.get(3);
    }

    /* renamed from: s */
    public Map<String, String> m3271s() {
        return this.f34502j;
    }

    /* renamed from: t */
    public boolean m3270t() {
        return this.f34502j != null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PushMetaInfo(");
        sb.append("id:");
        if (this.f34493a == null) {
            sb.append("null");
        } else {
            sb.append(this.f34493a);
        }
        sb.append(", ");
        sb.append("messageTs:");
        sb.append(this.f34494b);
        if (m3283g()) {
            sb.append(", ");
            sb.append("topic:");
            if (this.f34495c == null) {
                sb.append("null");
            } else {
                sb.append(this.f34495c);
            }
        }
        if (m3281i()) {
            sb.append(", ");
            sb.append("title:");
            if (this.f34496d == null) {
                sb.append("null");
            } else {
                sb.append(this.f34496d);
            }
        }
        if (m3279k()) {
            sb.append(", ");
            sb.append("description:");
            if (this.f34497e == null) {
                sb.append("null");
            } else {
                sb.append(this.f34497e);
            }
        }
        if (m3277m()) {
            sb.append(", ");
            sb.append("notifyType:");
            sb.append(this.f34498f);
        }
        if (m3276n()) {
            sb.append(", ");
            sb.append("url:");
            if (this.f34499g == null) {
                sb.append("null");
            } else {
                sb.append(this.f34499g);
            }
        }
        if (m3274p()) {
            sb.append(", ");
            sb.append("passThrough:");
            sb.append(this.f34500h);
        }
        if (m3272r()) {
            sb.append(", ");
            sb.append("notifyId:");
            sb.append(this.f34501i);
        }
        if (m3270t()) {
            sb.append(", ");
            sb.append("extra:");
            if (this.f34502j == null) {
                sb.append("null");
            } else {
                sb.append(this.f34502j);
            }
        }
        if (m3269u()) {
            sb.append(", ");
            sb.append("internal:");
            if (this.f34503k == null) {
                sb.append("null");
            } else {
                sb.append(this.f34503k);
            }
        }
        if (m3267w()) {
            sb.append(", ");
            sb.append("ignoreRegInfo:");
            sb.append(this.f34504l);
        }
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: u */
    public boolean m3269u() {
        return this.f34503k != null;
    }

    /* renamed from: v */
    public boolean m3268v() {
        return this.f34504l;
    }

    /* renamed from: w */
    public boolean m3267w() {
        return this.f34492A.get(4);
    }

    /* renamed from: x */
    public void m3266x() {
        if (this.f34493a == null) {
            throw new C11377f("Required field 'id' was not present! Struct: " + toString());
        }
    }
}
