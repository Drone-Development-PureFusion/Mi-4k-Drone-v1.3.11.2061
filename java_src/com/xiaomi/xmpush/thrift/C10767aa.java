package com.xiaomi.xmpush.thrift;

import com.p255mi.live.openlivesdk.C10022a;
import com.tencent.open.SocialConstants;
import com.xiaomi.market.sdk.C10445j;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.p286a.p321b.AbstractC11361a;
import org.p286a.p321b.C11369b;
import org.p286a.p321b.p322a.C11363b;
import org.p286a.p321b.p322a.C11364c;
import org.p286a.p321b.p322a.C11365d;
import org.p286a.p321b.p322a.C11368g;
import org.p286a.p321b.p323b.AbstractC11376e;
import org.p286a.p321b.p323b.C11373b;
import org.p286a.p321b.p323b.C11374c;
import org.p286a.p321b.p323b.C11377f;
import org.p286a.p321b.p323b.C11379h;
import org.p286a.p321b.p323b.C11381j;
/* renamed from: com.xiaomi.xmpush.thrift.aa */
/* loaded from: classes2.dex */
public class C10767aa implements Serializable, Cloneable, AbstractC11361a<C10767aa, EnumC10768a> {

    /* renamed from: l */
    public static final Map<EnumC10768a, C11363b> f33616l;

    /* renamed from: m */
    private static final C11381j f33617m = new C11381j("XmPushActionCommandResult");

    /* renamed from: n */
    private static final C11373b f33618n = new C11373b(C10022a.f30894c, (byte) 11, 1);

    /* renamed from: o */
    private static final C11373b f33619o = new C11373b("target", (byte) 12, 2);

    /* renamed from: p */
    private static final C11373b f33620p = new C11373b("id", (byte) 11, 3);

    /* renamed from: q */
    private static final C11373b f33621q = new C11373b("appId", (byte) 11, 4);

    /* renamed from: r */
    private static final C11373b f33622r = new C11373b("cmdName", (byte) 11, 5);

    /* renamed from: s */
    private static final C11373b f33623s = new C11373b(SocialConstants.TYPE_REQUEST, (byte) 12, 6);

    /* renamed from: t */
    private static final C11373b f33624t = new C11373b("errorCode", (byte) 10, 7);

    /* renamed from: u */
    private static final C11373b f33625u = new C11373b("reason", (byte) 11, 8);

    /* renamed from: v */
    private static final C11373b f33626v = new C11373b(C10445j.f32447W, (byte) 11, 9);

    /* renamed from: w */
    private static final C11373b f33627w = new C11373b("cmdArgs", (byte) 15, 10);

    /* renamed from: x */
    private static final C11373b f33628x = new C11373b("category", (byte) 11, 12);

    /* renamed from: a */
    public String f33629a;

    /* renamed from: b */
    public C10831u f33630b;

    /* renamed from: c */
    public String f33631c;

    /* renamed from: d */
    public String f33632d;

    /* renamed from: e */
    public String f33633e;

    /* renamed from: f */
    public C10841z f33634f;

    /* renamed from: g */
    public long f33635g;

    /* renamed from: h */
    public String f33636h;

    /* renamed from: i */
    public String f33637i;

    /* renamed from: j */
    public List<String> f33638j;

    /* renamed from: k */
    public String f33639k;

    /* renamed from: y */
    private BitSet f33640y = new BitSet(1);

    /* renamed from: com.xiaomi.xmpush.thrift.aa$a */
    /* loaded from: classes2.dex */
    public enum EnumC10768a {
        DEBUG(1, C10022a.f30894c),
        TARGET(2, "target"),
        ID(3, "id"),
        APP_ID(4, "appId"),
        CMD_NAME(5, "cmdName"),
        REQUEST(6, SocialConstants.TYPE_REQUEST),
        ERROR_CODE(7, "errorCode"),
        REASON(8, "reason"),
        PACKAGE_NAME(9, C10445j.f32447W),
        CMD_ARGS(10, "cmdArgs"),
        CATEGORY(12, "category");
        

        /* renamed from: l */
        private static final Map<String, EnumC10768a> f33652l = new HashMap();

        /* renamed from: m */
        private final short f33654m;

        /* renamed from: n */
        private final String f33655n;

        static {
            Iterator it2 = EnumSet.allOf(EnumC10768a.class).iterator();
            while (it2.hasNext()) {
                EnumC10768a enumC10768a = (EnumC10768a) it2.next();
                f33652l.put(enumC10768a.m3752a(), enumC10768a);
            }
        }

        EnumC10768a(short s, String str) {
            this.f33654m = s;
            this.f33655n = str;
        }

        /* renamed from: a */
        public String m3752a() {
            return this.f33655n;
        }
    }

    static {
        EnumMap enumMap = new EnumMap(EnumC10768a.class);
        enumMap.put((EnumMap) EnumC10768a.DEBUG, (EnumC10768a) new C11363b(C10022a.f30894c, (byte) 2, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10768a.TARGET, (EnumC10768a) new C11363b("target", (byte) 2, new C11368g((byte) 12, C10831u.class)));
        enumMap.put((EnumMap) EnumC10768a.ID, (EnumC10768a) new C11363b("id", (byte) 1, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10768a.APP_ID, (EnumC10768a) new C11363b("appId", (byte) 1, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10768a.CMD_NAME, (EnumC10768a) new C11363b("cmdName", (byte) 1, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10768a.REQUEST, (EnumC10768a) new C11363b(SocialConstants.TYPE_REQUEST, (byte) 2, new C11368g((byte) 12, C10841z.class)));
        enumMap.put((EnumMap) EnumC10768a.ERROR_CODE, (EnumC10768a) new C11363b("errorCode", (byte) 1, new C11364c((byte) 10)));
        enumMap.put((EnumMap) EnumC10768a.REASON, (EnumC10768a) new C11363b("reason", (byte) 2, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10768a.PACKAGE_NAME, (EnumC10768a) new C11363b(C10445j.f32447W, (byte) 2, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10768a.CMD_ARGS, (EnumC10768a) new C11363b("cmdArgs", (byte) 2, new C11365d((byte) 15, new C11364c((byte) 11))));
        enumMap.put((EnumMap) EnumC10768a.CATEGORY, (EnumC10768a) new C11363b("category", (byte) 2, new C11364c((byte) 11)));
        f33616l = Collections.unmodifiableMap(enumMap);
        C11363b.m1284a(C10767aa.class, f33616l);
    }

    @Override // org.p286a.p321b.AbstractC11361a
    /* renamed from: a */
    public void mo1286a(AbstractC11376e abstractC11376e) {
        abstractC11376e.mo1242g();
        while (true) {
            C11373b mo1240i = abstractC11376e.mo1240i();
            if (mo1240i.f36479b == 0) {
                abstractC11376e.mo1241h();
                if (!m3760h()) {
                    throw new C11377f("Required field 'errorCode' was not found in serialized data! Struct: " + toString());
                }
                m3753o();
                return;
            }
            switch (mo1240i.f36480c) {
                case 1:
                    if (mo1240i.f36479b == 11) {
                        this.f33629a = abstractC11376e.mo1223w();
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 2:
                    if (mo1240i.f36479b == 12) {
                        this.f33630b = new C10831u();
                        this.f33630b.mo1286a(abstractC11376e);
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 3:
                    if (mo1240i.f36479b == 11) {
                        this.f33631c = abstractC11376e.mo1223w();
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 4:
                    if (mo1240i.f36479b == 11) {
                        this.f33632d = abstractC11376e.mo1223w();
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 5:
                    if (mo1240i.f36479b == 11) {
                        this.f33633e = abstractC11376e.mo1223w();
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 6:
                    if (mo1240i.f36479b == 12) {
                        this.f33634f = new C10841z();
                        this.f33634f.mo1286a(abstractC11376e);
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 7:
                    if (mo1240i.f36479b == 10) {
                        this.f33635g = abstractC11376e.mo1231u();
                        m3768a(true);
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 8:
                    if (mo1240i.f36479b == 11) {
                        this.f33636h = abstractC11376e.mo1223w();
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 9:
                    if (mo1240i.f36479b == 11) {
                        this.f33637i = abstractC11376e.mo1223w();
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 10:
                    if (mo1240i.f36479b == 15) {
                        C11374c mo1225m = abstractC11376e.mo1225m();
                        this.f33638j = new ArrayList(mo1225m.f36482b);
                        for (int i = 0; i < mo1225m.f36482b; i++) {
                            this.f33638j.add(abstractC11376e.mo1223w());
                        }
                        abstractC11376e.mo1237n();
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 11:
                default:
                    C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                    break;
                case 12:
                    if (mo1240i.f36479b == 11) {
                        this.f33639k = abstractC11376e.mo1223w();
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
    public void m3768a(boolean z) {
        this.f33640y.set(0, z);
    }

    /* renamed from: a */
    public boolean m3770a() {
        return this.f33629a != null;
    }

    /* renamed from: a */
    public boolean m3769a(C10767aa c10767aa) {
        if (c10767aa == null) {
            return false;
        }
        boolean m3770a = m3770a();
        boolean m3770a2 = c10767aa.m3770a();
        if ((m3770a || m3770a2) && (!m3770a || !m3770a2 || !this.f33629a.equals(c10767aa.f33629a))) {
            return false;
        }
        boolean m3767b = m3767b();
        boolean m3767b2 = c10767aa.m3767b();
        if ((m3767b || m3767b2) && (!m3767b || !m3767b2 || !this.f33630b.m3254a(c10767aa.f33630b))) {
            return false;
        }
        boolean m3765c = m3765c();
        boolean m3765c2 = c10767aa.m3765c();
        if ((m3765c || m3765c2) && (!m3765c || !m3765c2 || !this.f33631c.equals(c10767aa.f33631c))) {
            return false;
        }
        boolean m3764d = m3764d();
        boolean m3764d2 = c10767aa.m3764d();
        if ((m3764d || m3764d2) && (!m3764d || !m3764d2 || !this.f33632d.equals(c10767aa.f33632d))) {
            return false;
        }
        boolean m3762f = m3762f();
        boolean m3762f2 = c10767aa.m3762f();
        if ((m3762f || m3762f2) && (!m3762f || !m3762f2 || !this.f33633e.equals(c10767aa.f33633e))) {
            return false;
        }
        boolean m3761g = m3761g();
        boolean m3761g2 = c10767aa.m3761g();
        if (((m3761g || m3761g2) && (!m3761g || !m3761g2 || !this.f33634f.m3169a(c10767aa.f33634f))) || this.f33635g != c10767aa.f33635g) {
            return false;
        }
        boolean m3759i = m3759i();
        boolean m3759i2 = c10767aa.m3759i();
        if ((m3759i || m3759i2) && (!m3759i || !m3759i2 || !this.f33636h.equals(c10767aa.f33636h))) {
            return false;
        }
        boolean m3758j = m3758j();
        boolean m3758j2 = c10767aa.m3758j();
        if ((m3758j || m3758j2) && (!m3758j || !m3758j2 || !this.f33637i.equals(c10767aa.f33637i))) {
            return false;
        }
        boolean m3756l = m3756l();
        boolean m3756l2 = c10767aa.m3756l();
        if ((m3756l || m3756l2) && (!m3756l || !m3756l2 || !this.f33638j.equals(c10767aa.f33638j))) {
            return false;
        }
        boolean m3754n = m3754n();
        boolean m3754n2 = c10767aa.m3754n();
        return (!m3754n && !m3754n2) || (m3754n && m3754n2 && this.f33639k.equals(c10767aa.f33639k));
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(C10767aa c10767aa) {
        int m1277a;
        int m1273a;
        int m1277a2;
        int m1277a3;
        int m1279a;
        int m1278a;
        int m1277a4;
        int m1277a5;
        int m1277a6;
        int m1278a2;
        int m1277a7;
        if (!getClass().equals(c10767aa.getClass())) {
            return getClass().getName().compareTo(c10767aa.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m3770a()).compareTo(Boolean.valueOf(c10767aa.m3770a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m3770a() && (m1277a7 = C11369b.m1277a(this.f33629a, c10767aa.f33629a)) != 0) {
            return m1277a7;
        }
        int compareTo2 = Boolean.valueOf(m3767b()).compareTo(Boolean.valueOf(c10767aa.m3767b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m3767b() && (m1278a2 = C11369b.m1278a(this.f33630b, c10767aa.f33630b)) != 0) {
            return m1278a2;
        }
        int compareTo3 = Boolean.valueOf(m3765c()).compareTo(Boolean.valueOf(c10767aa.m3765c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (m3765c() && (m1277a6 = C11369b.m1277a(this.f33631c, c10767aa.f33631c)) != 0) {
            return m1277a6;
        }
        int compareTo4 = Boolean.valueOf(m3764d()).compareTo(Boolean.valueOf(c10767aa.m3764d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (m3764d() && (m1277a5 = C11369b.m1277a(this.f33632d, c10767aa.f33632d)) != 0) {
            return m1277a5;
        }
        int compareTo5 = Boolean.valueOf(m3762f()).compareTo(Boolean.valueOf(c10767aa.m3762f()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (m3762f() && (m1277a4 = C11369b.m1277a(this.f33633e, c10767aa.f33633e)) != 0) {
            return m1277a4;
        }
        int compareTo6 = Boolean.valueOf(m3761g()).compareTo(Boolean.valueOf(c10767aa.m3761g()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (m3761g() && (m1278a = C11369b.m1278a(this.f33634f, c10767aa.f33634f)) != 0) {
            return m1278a;
        }
        int compareTo7 = Boolean.valueOf(m3760h()).compareTo(Boolean.valueOf(c10767aa.m3760h()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (m3760h() && (m1279a = C11369b.m1279a(this.f33635g, c10767aa.f33635g)) != 0) {
            return m1279a;
        }
        int compareTo8 = Boolean.valueOf(m3759i()).compareTo(Boolean.valueOf(c10767aa.m3759i()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (m3759i() && (m1277a3 = C11369b.m1277a(this.f33636h, c10767aa.f33636h)) != 0) {
            return m1277a3;
        }
        int compareTo9 = Boolean.valueOf(m3758j()).compareTo(Boolean.valueOf(c10767aa.m3758j()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (m3758j() && (m1277a2 = C11369b.m1277a(this.f33637i, c10767aa.f33637i)) != 0) {
            return m1277a2;
        }
        int compareTo10 = Boolean.valueOf(m3756l()).compareTo(Boolean.valueOf(c10767aa.m3756l()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (m3756l() && (m1273a = C11369b.m1273a(this.f33638j, c10767aa.f33638j)) != 0) {
            return m1273a;
        }
        int compareTo11 = Boolean.valueOf(m3754n()).compareTo(Boolean.valueOf(c10767aa.m3754n()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (m3754n() && (m1277a = C11369b.m1277a(this.f33639k, c10767aa.f33639k)) != 0) {
            return m1277a;
        }
        return 0;
    }

    @Override // org.p286a.p321b.AbstractC11361a
    /* renamed from: b */
    public void mo1285b(AbstractC11376e abstractC11376e) {
        m3753o();
        abstractC11376e.mo1250a(f33617m);
        if (this.f33629a != null && m3770a()) {
            abstractC11376e.mo1254a(f33618n);
            abstractC11376e.mo1256a(this.f33629a);
            abstractC11376e.mo1247b();
        }
        if (this.f33630b != null && m3767b()) {
            abstractC11376e.mo1254a(f33619o);
            this.f33630b.mo1285b(abstractC11376e);
            abstractC11376e.mo1247b();
        }
        if (this.f33631c != null) {
            abstractC11376e.mo1254a(f33620p);
            abstractC11376e.mo1256a(this.f33631c);
            abstractC11376e.mo1247b();
        }
        if (this.f33632d != null) {
            abstractC11376e.mo1254a(f33621q);
            abstractC11376e.mo1256a(this.f33632d);
            abstractC11376e.mo1247b();
        }
        if (this.f33633e != null) {
            abstractC11376e.mo1254a(f33622r);
            abstractC11376e.mo1256a(this.f33633e);
            abstractC11376e.mo1247b();
        }
        if (this.f33634f != null && m3761g()) {
            abstractC11376e.mo1254a(f33623s);
            this.f33634f.mo1285b(abstractC11376e);
            abstractC11376e.mo1247b();
        }
        abstractC11376e.mo1254a(f33624t);
        abstractC11376e.mo1257a(this.f33635g);
        abstractC11376e.mo1247b();
        if (this.f33636h != null && m3759i()) {
            abstractC11376e.mo1254a(f33625u);
            abstractC11376e.mo1256a(this.f33636h);
            abstractC11376e.mo1247b();
        }
        if (this.f33637i != null && m3758j()) {
            abstractC11376e.mo1254a(f33626v);
            abstractC11376e.mo1256a(this.f33637i);
            abstractC11376e.mo1247b();
        }
        if (this.f33638j != null && m3756l()) {
            abstractC11376e.mo1254a(f33627w);
            abstractC11376e.mo1253a(new C11374c((byte) 11, this.f33638j.size()));
            for (String str : this.f33638j) {
                abstractC11376e.mo1256a(str);
            }
            abstractC11376e.mo1244e();
            abstractC11376e.mo1247b();
        }
        if (this.f33639k != null && m3754n()) {
            abstractC11376e.mo1254a(f33628x);
            abstractC11376e.mo1256a(this.f33639k);
            abstractC11376e.mo1247b();
        }
        abstractC11376e.mo1246c();
        abstractC11376e.mo1261a();
    }

    /* renamed from: b */
    public boolean m3767b() {
        return this.f33630b != null;
    }

    /* renamed from: c */
    public boolean m3765c() {
        return this.f33631c != null;
    }

    /* renamed from: d */
    public boolean m3764d() {
        return this.f33632d != null;
    }

    /* renamed from: e */
    public String m3763e() {
        return this.f33633e;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C10767aa)) {
            return m3769a((C10767aa) obj);
        }
        return false;
    }

    /* renamed from: f */
    public boolean m3762f() {
        return this.f33633e != null;
    }

    /* renamed from: g */
    public boolean m3761g() {
        return this.f33634f != null;
    }

    /* renamed from: h */
    public boolean m3760h() {
        return this.f33640y.get(0);
    }

    public int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public boolean m3759i() {
        return this.f33636h != null;
    }

    /* renamed from: j */
    public boolean m3758j() {
        return this.f33637i != null;
    }

    /* renamed from: k */
    public List<String> m3757k() {
        return this.f33638j;
    }

    /* renamed from: l */
    public boolean m3756l() {
        return this.f33638j != null;
    }

    /* renamed from: m */
    public String m3755m() {
        return this.f33639k;
    }

    /* renamed from: n */
    public boolean m3754n() {
        return this.f33639k != null;
    }

    /* renamed from: o */
    public void m3753o() {
        if (this.f33631c == null) {
            throw new C11377f("Required field 'id' was not present! Struct: " + toString());
        }
        if (this.f33632d == null) {
            throw new C11377f("Required field 'appId' was not present! Struct: " + toString());
        }
        if (this.f33633e != null) {
            return;
        }
        throw new C11377f("Required field 'cmdName' was not present! Struct: " + toString());
    }

    public String toString() {
        boolean z = false;
        StringBuilder sb = new StringBuilder("XmPushActionCommandResult(");
        boolean z2 = true;
        if (m3770a()) {
            sb.append("debug:");
            if (this.f33629a == null) {
                sb.append("null");
            } else {
                sb.append(this.f33629a);
            }
            z2 = false;
        }
        if (m3767b()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("target:");
            if (this.f33630b == null) {
                sb.append("null");
            } else {
                sb.append(this.f33630b);
            }
        } else {
            z = z2;
        }
        if (!z) {
            sb.append(", ");
        }
        sb.append("id:");
        if (this.f33631c == null) {
            sb.append("null");
        } else {
            sb.append(this.f33631c);
        }
        sb.append(", ");
        sb.append("appId:");
        if (this.f33632d == null) {
            sb.append("null");
        } else {
            sb.append(this.f33632d);
        }
        sb.append(", ");
        sb.append("cmdName:");
        if (this.f33633e == null) {
            sb.append("null");
        } else {
            sb.append(this.f33633e);
        }
        if (m3761g()) {
            sb.append(", ");
            sb.append("request:");
            if (this.f33634f == null) {
                sb.append("null");
            } else {
                sb.append(this.f33634f);
            }
        }
        sb.append(", ");
        sb.append("errorCode:");
        sb.append(this.f33635g);
        if (m3759i()) {
            sb.append(", ");
            sb.append("reason:");
            if (this.f33636h == null) {
                sb.append("null");
            } else {
                sb.append(this.f33636h);
            }
        }
        if (m3758j()) {
            sb.append(", ");
            sb.append("packageName:");
            if (this.f33637i == null) {
                sb.append("null");
            } else {
                sb.append(this.f33637i);
            }
        }
        if (m3756l()) {
            sb.append(", ");
            sb.append("cmdArgs:");
            if (this.f33638j == null) {
                sb.append("null");
            } else {
                sb.append(this.f33638j);
            }
        }
        if (m3754n()) {
            sb.append(", ");
            sb.append("category:");
            if (this.f33639k == null) {
                sb.append("null");
            } else {
                sb.append(this.f33639k);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
