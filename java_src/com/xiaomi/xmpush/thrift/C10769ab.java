package com.xiaomi.xmpush.thrift;

import com.tencent.tauth.AuthActivity;
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
import org.p286a.p321b.p322a.C11362a;
import org.p286a.p321b.p322a.C11363b;
import org.p286a.p321b.p322a.C11364c;
import org.p286a.p321b.p322a.C11368g;
import org.p286a.p321b.p323b.AbstractC11376e;
import org.p286a.p321b.p323b.C11373b;
import org.p286a.p321b.p323b.C11377f;
import org.p286a.p321b.p323b.C11379h;
import org.p286a.p321b.p323b.C11381j;
/* renamed from: com.xiaomi.xmpush.thrift.ab */
/* loaded from: classes.dex */
public class C10769ab implements Serializable, Cloneable, AbstractC11361a<C10769ab, EnumC10770a> {

    /* renamed from: i */
    public static final Map<EnumC10770a, C11363b> f33656i;

    /* renamed from: j */
    private static final C11381j f33657j = new C11381j("XmPushActionContainer");

    /* renamed from: k */
    private static final C11373b f33658k = new C11373b(AuthActivity.ACTION_KEY, (byte) 8, 1);

    /* renamed from: l */
    private static final C11373b f33659l = new C11373b("encryptAction", (byte) 2, 2);

    /* renamed from: m */
    private static final C11373b f33660m = new C11373b("isRequest", (byte) 2, 3);

    /* renamed from: n */
    private static final C11373b f33661n = new C11373b("pushAction", (byte) 11, 4);

    /* renamed from: o */
    private static final C11373b f33662o = new C11373b("appid", (byte) 11, 5);

    /* renamed from: p */
    private static final C11373b f33663p = new C11373b(C10445j.f32447W, (byte) 11, 6);

    /* renamed from: q */
    private static final C11373b f33664q = new C11373b("target", (byte) 12, 7);

    /* renamed from: r */
    private static final C11373b f33665r = new C11373b("metaInfo", (byte) 12, 8);

    /* renamed from: a */
    public EnumC10766a f33666a;

    /* renamed from: d */
    public ByteBuffer f33669d;

    /* renamed from: e */
    public String f33670e;

    /* renamed from: f */
    public String f33671f;

    /* renamed from: g */
    public C10831u f33672g;

    /* renamed from: h */
    public C10826r f33673h;

    /* renamed from: s */
    private BitSet f33674s = new BitSet(2);

    /* renamed from: b */
    public boolean f33667b = true;

    /* renamed from: c */
    public boolean f33668c = true;

    /* renamed from: com.xiaomi.xmpush.thrift.ab$a */
    /* loaded from: classes2.dex */
    public enum EnumC10770a {
        ACTION(1, AuthActivity.ACTION_KEY),
        ENCRYPT_ACTION(2, "encryptAction"),
        IS_REQUEST(3, "isRequest"),
        PUSH_ACTION(4, "pushAction"),
        APPID(5, "appid"),
        PACKAGE_NAME(6, C10445j.f32447W),
        TARGET(7, "target"),
        META_INFO(8, "metaInfo");
        

        /* renamed from: i */
        private static final Map<String, EnumC10770a> f33683i = new HashMap();

        /* renamed from: j */
        private final short f33685j;

        /* renamed from: k */
        private final String f33686k;

        static {
            Iterator it2 = EnumSet.allOf(EnumC10770a.class).iterator();
            while (it2.hasNext()) {
                EnumC10770a enumC10770a = (EnumC10770a) it2.next();
                f33683i.put(enumC10770a.m3724a(), enumC10770a);
            }
        }

        EnumC10770a(short s, String str) {
            this.f33685j = s;
            this.f33686k = str;
        }

        /* renamed from: a */
        public String m3724a() {
            return this.f33686k;
        }
    }

    static {
        EnumMap enumMap = new EnumMap(EnumC10770a.class);
        enumMap.put((EnumMap) EnumC10770a.ACTION, (EnumC10770a) new C11363b(AuthActivity.ACTION_KEY, (byte) 1, new C11362a((byte) 16, EnumC10766a.class)));
        enumMap.put((EnumMap) EnumC10770a.ENCRYPT_ACTION, (EnumC10770a) new C11363b("encryptAction", (byte) 1, new C11364c((byte) 2)));
        enumMap.put((EnumMap) EnumC10770a.IS_REQUEST, (EnumC10770a) new C11363b("isRequest", (byte) 1, new C11364c((byte) 2)));
        enumMap.put((EnumMap) EnumC10770a.PUSH_ACTION, (EnumC10770a) new C11363b("pushAction", (byte) 1, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10770a.APPID, (EnumC10770a) new C11363b("appid", (byte) 2, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10770a.PACKAGE_NAME, (EnumC10770a) new C11363b(C10445j.f32447W, (byte) 2, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10770a.TARGET, (EnumC10770a) new C11363b("target", (byte) 1, new C11368g((byte) 12, C10831u.class)));
        enumMap.put((EnumMap) EnumC10770a.META_INFO, (EnumC10770a) new C11363b("metaInfo", (byte) 2, new C11368g((byte) 12, C10826r.class)));
        f33656i = Collections.unmodifiableMap(enumMap);
        C11363b.m1284a(C10769ab.class, f33656i);
    }

    /* renamed from: a */
    public EnumC10766a m3751a() {
        return this.f33666a;
    }

    /* renamed from: a */
    public C10769ab m3750a(EnumC10766a enumC10766a) {
        this.f33666a = enumC10766a;
        return this;
    }

    /* renamed from: a */
    public C10769ab m3748a(C10826r c10826r) {
        this.f33673h = c10826r;
        return this;
    }

    /* renamed from: a */
    public C10769ab m3747a(C10831u c10831u) {
        this.f33672g = c10831u;
        return this;
    }

    /* renamed from: a */
    public C10769ab m3746a(String str) {
        this.f33670e = str;
        return this;
    }

    /* renamed from: a */
    public C10769ab m3745a(ByteBuffer byteBuffer) {
        this.f33669d = byteBuffer;
        return this;
    }

    /* renamed from: a */
    public C10769ab m3744a(boolean z) {
        this.f33667b = z;
        m3740b(true);
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
                if (!m3737d()) {
                    throw new C11377f("Required field 'encryptAction' was not found in serialized data! Struct: " + toString());
                }
                if (!m3735e()) {
                    throw new C11377f("Required field 'isRequest' was not found in serialized data! Struct: " + toString());
                }
                m3725o();
                return;
            }
            switch (mo1240i.f36480c) {
                case 1:
                    if (mo1240i.f36479b != 8) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f33666a = EnumC10766a.m3771a(abstractC11376e.mo1232t());
                        break;
                    }
                case 2:
                    if (mo1240i.f36479b != 2) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f33667b = abstractC11376e.mo1235q();
                        m3740b(true);
                        break;
                    }
                case 3:
                    if (mo1240i.f36479b != 2) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f33668c = abstractC11376e.mo1235q();
                        m3736d(true);
                        break;
                    }
                case 4:
                    if (mo1240i.f36479b != 11) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f33669d = abstractC11376e.mo1222x();
                        break;
                    }
                case 5:
                    if (mo1240i.f36479b != 11) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f33670e = abstractC11376e.mo1223w();
                        break;
                    }
                case 6:
                    if (mo1240i.f36479b != 11) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f33671f = abstractC11376e.mo1223w();
                        break;
                    }
                case 7:
                    if (mo1240i.f36479b != 12) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f33672g = new C10831u();
                        this.f33672g.mo1286a(abstractC11376e);
                        break;
                    }
                case 8:
                    if (mo1240i.f36479b != 12) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f33673h = new C10826r();
                        this.f33673h.mo1286a(abstractC11376e);
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
    public boolean m3749a(C10769ab c10769ab) {
        if (c10769ab == null) {
            return false;
        }
        boolean m3743b = m3743b();
        boolean m3743b2 = c10769ab.m3743b();
        if (((m3743b || m3743b2) && (!m3743b || !m3743b2 || !this.f33666a.equals(c10769ab.f33666a))) || this.f33667b != c10769ab.f33667b || this.f33668c != c10769ab.f33668c) {
            return false;
        }
        boolean m3733g = m3733g();
        boolean m3733g2 = c10769ab.m3733g();
        if ((m3733g || m3733g2) && (!m3733g || !m3733g2 || !this.f33669d.equals(c10769ab.f33669d))) {
            return false;
        }
        boolean m3731i = m3731i();
        boolean m3731i2 = c10769ab.m3731i();
        if ((m3731i || m3731i2) && (!m3731i || !m3731i2 || !this.f33670e.equals(c10769ab.f33670e))) {
            return false;
        }
        boolean m3729k = m3729k();
        boolean m3729k2 = c10769ab.m3729k();
        if ((m3729k || m3729k2) && (!m3729k || !m3729k2 || !this.f33671f.equals(c10769ab.f33671f))) {
            return false;
        }
        boolean m3728l = m3728l();
        boolean m3728l2 = c10769ab.m3728l();
        if ((m3728l || m3728l2) && (!m3728l || !m3728l2 || !this.f33672g.m3254a(c10769ab.f33672g))) {
            return false;
        }
        boolean m3726n = m3726n();
        boolean m3726n2 = c10769ab.m3726n();
        return (!m3726n && !m3726n2) || (m3726n && m3726n2 && this.f33673h.m3303a(c10769ab.f33673h));
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(C10769ab c10769ab) {
        int m1278a;
        int m1278a2;
        int m1277a;
        int m1277a2;
        int m1278a3;
        int m1269a;
        int m1269a2;
        int m1278a4;
        if (!getClass().equals(c10769ab.getClass())) {
            return getClass().getName().compareTo(c10769ab.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m3743b()).compareTo(Boolean.valueOf(c10769ab.m3743b()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m3743b() && (m1278a4 = C11369b.m1278a(this.f33666a, c10769ab.f33666a)) != 0) {
            return m1278a4;
        }
        int compareTo2 = Boolean.valueOf(m3737d()).compareTo(Boolean.valueOf(c10769ab.m3737d()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m3737d() && (m1269a2 = C11369b.m1269a(this.f33667b, c10769ab.f33667b)) != 0) {
            return m1269a2;
        }
        int compareTo3 = Boolean.valueOf(m3735e()).compareTo(Boolean.valueOf(c10769ab.m3735e()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (m3735e() && (m1269a = C11369b.m1269a(this.f33668c, c10769ab.f33668c)) != 0) {
            return m1269a;
        }
        int compareTo4 = Boolean.valueOf(m3733g()).compareTo(Boolean.valueOf(c10769ab.m3733g()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (m3733g() && (m1278a3 = C11369b.m1278a(this.f33669d, c10769ab.f33669d)) != 0) {
            return m1278a3;
        }
        int compareTo5 = Boolean.valueOf(m3731i()).compareTo(Boolean.valueOf(c10769ab.m3731i()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (m3731i() && (m1277a2 = C11369b.m1277a(this.f33670e, c10769ab.f33670e)) != 0) {
            return m1277a2;
        }
        int compareTo6 = Boolean.valueOf(m3729k()).compareTo(Boolean.valueOf(c10769ab.m3729k()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (m3729k() && (m1277a = C11369b.m1277a(this.f33671f, c10769ab.f33671f)) != 0) {
            return m1277a;
        }
        int compareTo7 = Boolean.valueOf(m3728l()).compareTo(Boolean.valueOf(c10769ab.m3728l()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (m3728l() && (m1278a2 = C11369b.m1278a(this.f33672g, c10769ab.f33672g)) != 0) {
            return m1278a2;
        }
        int compareTo8 = Boolean.valueOf(m3726n()).compareTo(Boolean.valueOf(c10769ab.m3726n()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (m3726n() && (m1278a = C11369b.m1278a(this.f33673h, c10769ab.f33673h)) != 0) {
            return m1278a;
        }
        return 0;
    }

    /* renamed from: b */
    public C10769ab m3741b(String str) {
        this.f33671f = str;
        return this;
    }

    @Override // org.p286a.p321b.AbstractC11361a
    /* renamed from: b */
    public void mo1285b(AbstractC11376e abstractC11376e) {
        m3725o();
        abstractC11376e.mo1250a(f33657j);
        if (this.f33666a != null) {
            abstractC11376e.mo1254a(f33658k);
            abstractC11376e.mo1258a(this.f33666a.m3772a());
            abstractC11376e.mo1247b();
        }
        abstractC11376e.mo1254a(f33659l);
        abstractC11376e.mo1248a(this.f33667b);
        abstractC11376e.mo1247b();
        abstractC11376e.mo1254a(f33660m);
        abstractC11376e.mo1248a(this.f33668c);
        abstractC11376e.mo1247b();
        if (this.f33669d != null) {
            abstractC11376e.mo1254a(f33661n);
            abstractC11376e.mo1255a(this.f33669d);
            abstractC11376e.mo1247b();
        }
        if (this.f33670e != null && m3731i()) {
            abstractC11376e.mo1254a(f33662o);
            abstractC11376e.mo1256a(this.f33670e);
            abstractC11376e.mo1247b();
        }
        if (this.f33671f != null && m3729k()) {
            abstractC11376e.mo1254a(f33663p);
            abstractC11376e.mo1256a(this.f33671f);
            abstractC11376e.mo1247b();
        }
        if (this.f33672g != null) {
            abstractC11376e.mo1254a(f33664q);
            this.f33672g.mo1285b(abstractC11376e);
            abstractC11376e.mo1247b();
        }
        if (this.f33673h != null && m3726n()) {
            abstractC11376e.mo1254a(f33665r);
            this.f33673h.mo1285b(abstractC11376e);
            abstractC11376e.mo1247b();
        }
        abstractC11376e.mo1246c();
        abstractC11376e.mo1261a();
    }

    /* renamed from: b */
    public void m3740b(boolean z) {
        this.f33674s.set(0, z);
    }

    /* renamed from: b */
    public boolean m3743b() {
        return this.f33666a != null;
    }

    /* renamed from: c */
    public C10769ab m3738c(boolean z) {
        this.f33668c = z;
        m3736d(true);
        return this;
    }

    /* renamed from: c */
    public boolean m3739c() {
        return this.f33667b;
    }

    /* renamed from: d */
    public void m3736d(boolean z) {
        this.f33674s.set(1, z);
    }

    /* renamed from: d */
    public boolean m3737d() {
        return this.f33674s.get(0);
    }

    /* renamed from: e */
    public boolean m3735e() {
        return this.f33674s.get(1);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C10769ab)) {
            return m3749a((C10769ab) obj);
        }
        return false;
    }

    /* renamed from: f */
    public byte[] m3734f() {
        m3745a(C11369b.m1266c(this.f33669d));
        return this.f33669d.array();
    }

    /* renamed from: g */
    public boolean m3733g() {
        return this.f33669d != null;
    }

    /* renamed from: h */
    public String m3732h() {
        return this.f33670e;
    }

    public int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public boolean m3731i() {
        return this.f33670e != null;
    }

    /* renamed from: j */
    public String m3730j() {
        return this.f33671f;
    }

    /* renamed from: k */
    public boolean m3729k() {
        return this.f33671f != null;
    }

    /* renamed from: l */
    public boolean m3728l() {
        return this.f33672g != null;
    }

    /* renamed from: m */
    public C10826r m3727m() {
        return this.f33673h;
    }

    /* renamed from: n */
    public boolean m3726n() {
        return this.f33673h != null;
    }

    /* renamed from: o */
    public void m3725o() {
        if (this.f33666a == null) {
            throw new C11377f("Required field 'action' was not present! Struct: " + toString());
        }
        if (this.f33669d == null) {
            throw new C11377f("Required field 'pushAction' was not present! Struct: " + toString());
        }
        if (this.f33672g != null) {
            return;
        }
        throw new C11377f("Required field 'target' was not present! Struct: " + toString());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("XmPushActionContainer(");
        sb.append("action:");
        if (this.f33666a == null) {
            sb.append("null");
        } else {
            sb.append(this.f33666a);
        }
        sb.append(", ");
        sb.append("encryptAction:");
        sb.append(this.f33667b);
        sb.append(", ");
        sb.append("isRequest:");
        sb.append(this.f33668c);
        sb.append(", ");
        sb.append("pushAction:");
        if (this.f33669d == null) {
            sb.append("null");
        } else {
            C11369b.m1275a(this.f33669d, sb);
        }
        if (m3731i()) {
            sb.append(", ");
            sb.append("appid:");
            if (this.f33670e == null) {
                sb.append("null");
            } else {
                sb.append(this.f33670e);
            }
        }
        if (m3729k()) {
            sb.append(", ");
            sb.append("packageName:");
            if (this.f33671f == null) {
                sb.append("null");
            } else {
                sb.append(this.f33671f);
            }
        }
        sb.append(", ");
        sb.append("target:");
        if (this.f33672g == null) {
            sb.append("null");
        } else {
            sb.append(this.f33672g);
        }
        if (m3726n()) {
            sb.append(", ");
            sb.append("metaInfo:");
            if (this.f33673h == null) {
                sb.append("null");
            } else {
                sb.append(this.f33673h);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
