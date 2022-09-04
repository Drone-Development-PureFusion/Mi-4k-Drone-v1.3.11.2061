package com.xiaomi.push.thrift;

import com.fimi.soul.utils.p219a.C3070c;
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
import org.p286a.p321b.p323b.AbstractC11376e;
import org.p286a.p321b.p323b.C11373b;
import org.p286a.p321b.p323b.C11377f;
import org.p286a.p321b.p323b.C11379h;
import org.p286a.p321b.p323b.C11381j;
/* renamed from: com.xiaomi.push.thrift.b */
/* loaded from: classes2.dex */
public class C10705b implements Serializable, Cloneable, AbstractC11361a<C10705b, EnumC10706a> {

    /* renamed from: k */
    public static final Map<EnumC10706a, C11363b> f33320k;

    /* renamed from: l */
    private static final C11381j f33321l = new C11381j("StatsEvent");

    /* renamed from: m */
    private static final C11373b f33322m = new C11373b("chid", (byte) 3, 1);

    /* renamed from: n */
    private static final C11373b f33323n = new C11373b("type", (byte) 8, 2);

    /* renamed from: o */
    private static final C11373b f33324o = new C11373b("value", (byte) 8, 3);

    /* renamed from: p */
    private static final C11373b f33325p = new C11373b("connpt", (byte) 11, 4);

    /* renamed from: q */
    private static final C11373b f33326q = new C11373b(C10445j.HOST, (byte) 11, 5);

    /* renamed from: r */
    private static final C11373b f33327r = new C11373b("subvalue", (byte) 8, 6);

    /* renamed from: s */
    private static final C11373b f33328s = new C11373b("annotation", (byte) 11, 7);

    /* renamed from: t */
    private static final C11373b f33329t = new C11373b("user", (byte) 11, 8);

    /* renamed from: u */
    private static final C11373b f33330u = new C11373b(C3070c.C3071a.f11505i, (byte) 8, 9);

    /* renamed from: v */
    private static final C11373b f33331v = new C11373b("clientIp", (byte) 8, 10);

    /* renamed from: a */
    public byte f33332a;

    /* renamed from: b */
    public int f33333b;

    /* renamed from: c */
    public int f33334c;

    /* renamed from: d */
    public String f33335d;

    /* renamed from: e */
    public String f33336e;

    /* renamed from: f */
    public int f33337f;

    /* renamed from: g */
    public String f33338g;

    /* renamed from: h */
    public String f33339h;

    /* renamed from: i */
    public int f33340i;

    /* renamed from: j */
    public int f33341j;

    /* renamed from: w */
    private BitSet f33342w = new BitSet(6);

    /* renamed from: com.xiaomi.push.thrift.b$a */
    /* loaded from: classes2.dex */
    public enum EnumC10706a {
        CHID(1, "chid"),
        TYPE(2, "type"),
        VALUE(3, "value"),
        CONNPT(4, "connpt"),
        HOST(5, C10445j.HOST),
        SUBVALUE(6, "subvalue"),
        ANNOTATION(7, "annotation"),
        USER(8, "user"),
        TIME(9, C3070c.C3071a.f11505i),
        CLIENT_IP(10, "clientIp");
        

        /* renamed from: k */
        private static final Map<String, EnumC10706a> f33353k = new HashMap();

        /* renamed from: l */
        private final short f33355l;

        /* renamed from: m */
        private final String f33356m;

        static {
            Iterator it2 = EnumSet.allOf(EnumC10706a.class).iterator();
            while (it2.hasNext()) {
                EnumC10706a enumC10706a = (EnumC10706a) it2.next();
                f33353k.put(enumC10706a.m4046a(), enumC10706a);
            }
        }

        EnumC10706a(short s, String str) {
            this.f33355l = s;
            this.f33356m = str;
        }

        /* renamed from: a */
        public String m4046a() {
            return this.f33356m;
        }
    }

    static {
        EnumMap enumMap = new EnumMap(EnumC10706a.class);
        enumMap.put((EnumMap) EnumC10706a.CHID, (EnumC10706a) new C11363b("chid", (byte) 1, new C11364c((byte) 3)));
        enumMap.put((EnumMap) EnumC10706a.TYPE, (EnumC10706a) new C11363b("type", (byte) 1, new C11364c((byte) 8)));
        enumMap.put((EnumMap) EnumC10706a.VALUE, (EnumC10706a) new C11363b("value", (byte) 1, new C11364c((byte) 8)));
        enumMap.put((EnumMap) EnumC10706a.CONNPT, (EnumC10706a) new C11363b("connpt", (byte) 1, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10706a.HOST, (EnumC10706a) new C11363b(C10445j.HOST, (byte) 2, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10706a.SUBVALUE, (EnumC10706a) new C11363b("subvalue", (byte) 2, new C11364c((byte) 8)));
        enumMap.put((EnumMap) EnumC10706a.ANNOTATION, (EnumC10706a) new C11363b("annotation", (byte) 2, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10706a.USER, (EnumC10706a) new C11363b("user", (byte) 2, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10706a.TIME, (EnumC10706a) new C11363b(C3070c.C3071a.f11505i, (byte) 2, new C11364c((byte) 8)));
        enumMap.put((EnumMap) EnumC10706a.CLIENT_IP, (EnumC10706a) new C11363b("clientIp", (byte) 2, new C11364c((byte) 8)));
        f33320k = Collections.unmodifiableMap(enumMap);
        C11363b.m1284a(C10705b.class, f33320k);
    }

    /* renamed from: a */
    public C10705b m4074a(byte b) {
        this.f33332a = b;
        m4070a(true);
        return this;
    }

    /* renamed from: a */
    public C10705b m4073a(int i) {
        this.f33333b = i;
        m4065b(true);
        return this;
    }

    /* renamed from: a */
    public C10705b m4071a(String str) {
        this.f33335d = str;
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
                if (!m4075a()) {
                    throw new C11377f("Required field 'chid' was not found in serialized data! Struct: " + toString());
                }
                if (!m4069b()) {
                    throw new C11377f("Required field 'type' was not found in serialized data! Struct: " + toString());
                }
                if (!m4064c()) {
                    throw new C11377f("Required field 'value' was not found in serialized data! Struct: " + toString());
                }
                m4047k();
                return;
            }
            switch (mo1240i.f36480c) {
                case 1:
                    if (mo1240i.f36479b != 3) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f33332a = abstractC11376e.mo1234r();
                        m4070a(true);
                        break;
                    }
                case 2:
                    if (mo1240i.f36479b != 8) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f33333b = abstractC11376e.mo1232t();
                        m4065b(true);
                        break;
                    }
                case 3:
                    if (mo1240i.f36479b != 8) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f33334c = abstractC11376e.mo1232t();
                        m4061c(true);
                        break;
                    }
                case 4:
                    if (mo1240i.f36479b != 11) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f33335d = abstractC11376e.mo1223w();
                        break;
                    }
                case 5:
                    if (mo1240i.f36479b != 11) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f33336e = abstractC11376e.mo1223w();
                        break;
                    }
                case 6:
                    if (mo1240i.f36479b != 8) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f33337f = abstractC11376e.mo1232t();
                        m4057d(true);
                        break;
                    }
                case 7:
                    if (mo1240i.f36479b != 11) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f33338g = abstractC11376e.mo1223w();
                        break;
                    }
                case 8:
                    if (mo1240i.f36479b != 11) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f33339h = abstractC11376e.mo1223w();
                        break;
                    }
                case 9:
                    if (mo1240i.f36479b != 8) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f33340i = abstractC11376e.mo1232t();
                        m4054e(true);
                        break;
                    }
                case 10:
                    if (mo1240i.f36479b != 8) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f33341j = abstractC11376e.mo1232t();
                        m4052f(true);
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
    public void m4070a(boolean z) {
        this.f33342w.set(0, z);
    }

    /* renamed from: a */
    public boolean m4075a() {
        return this.f33342w.get(0);
    }

    /* renamed from: a */
    public boolean m4072a(C10705b c10705b) {
        if (c10705b != null && this.f33332a == c10705b.f33332a && this.f33333b == c10705b.f33333b && this.f33334c == c10705b.f33334c) {
            boolean m4060d = m4060d();
            boolean m4060d2 = c10705b.m4060d();
            if ((m4060d || m4060d2) && (!m4060d || !m4060d2 || !this.f33335d.equals(c10705b.f33335d))) {
                return false;
            }
            boolean m4056e = m4056e();
            boolean m4056e2 = c10705b.m4056e();
            if ((m4056e || m4056e2) && (!m4056e || !m4056e2 || !this.f33336e.equals(c10705b.f33336e))) {
                return false;
            }
            boolean m4053f = m4053f();
            boolean m4053f2 = c10705b.m4053f();
            if ((m4053f || m4053f2) && (!m4053f || !m4053f2 || this.f33337f != c10705b.f33337f)) {
                return false;
            }
            boolean m4051g = m4051g();
            boolean m4051g2 = c10705b.m4051g();
            if ((m4051g || m4051g2) && (!m4051g || !m4051g2 || !this.f33338g.equals(c10705b.f33338g))) {
                return false;
            }
            boolean m4050h = m4050h();
            boolean m4050h2 = c10705b.m4050h();
            if ((m4050h || m4050h2) && (!m4050h || !m4050h2 || !this.f33339h.equals(c10705b.f33339h))) {
                return false;
            }
            boolean m4049i = m4049i();
            boolean m4049i2 = c10705b.m4049i();
            if ((m4049i || m4049i2) && (!m4049i || !m4049i2 || this.f33340i != c10705b.f33340i)) {
                return false;
            }
            boolean m4048j = m4048j();
            boolean m4048j2 = c10705b.m4048j();
            return (!m4048j && !m4048j2) || (m4048j && m4048j2 && this.f33341j == c10705b.f33341j);
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(C10705b c10705b) {
        int m1280a;
        int m1280a2;
        int m1277a;
        int m1277a2;
        int m1280a3;
        int m1277a3;
        int m1277a4;
        int m1280a4;
        int m1280a5;
        int m1282a;
        if (!getClass().equals(c10705b.getClass())) {
            return getClass().getName().compareTo(c10705b.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m4075a()).compareTo(Boolean.valueOf(c10705b.m4075a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m4075a() && (m1282a = C11369b.m1282a(this.f33332a, c10705b.f33332a)) != 0) {
            return m1282a;
        }
        int compareTo2 = Boolean.valueOf(m4069b()).compareTo(Boolean.valueOf(c10705b.m4069b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m4069b() && (m1280a5 = C11369b.m1280a(this.f33333b, c10705b.f33333b)) != 0) {
            return m1280a5;
        }
        int compareTo3 = Boolean.valueOf(m4064c()).compareTo(Boolean.valueOf(c10705b.m4064c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (m4064c() && (m1280a4 = C11369b.m1280a(this.f33334c, c10705b.f33334c)) != 0) {
            return m1280a4;
        }
        int compareTo4 = Boolean.valueOf(m4060d()).compareTo(Boolean.valueOf(c10705b.m4060d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (m4060d() && (m1277a4 = C11369b.m1277a(this.f33335d, c10705b.f33335d)) != 0) {
            return m1277a4;
        }
        int compareTo5 = Boolean.valueOf(m4056e()).compareTo(Boolean.valueOf(c10705b.m4056e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (m4056e() && (m1277a3 = C11369b.m1277a(this.f33336e, c10705b.f33336e)) != 0) {
            return m1277a3;
        }
        int compareTo6 = Boolean.valueOf(m4053f()).compareTo(Boolean.valueOf(c10705b.m4053f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (m4053f() && (m1280a3 = C11369b.m1280a(this.f33337f, c10705b.f33337f)) != 0) {
            return m1280a3;
        }
        int compareTo7 = Boolean.valueOf(m4051g()).compareTo(Boolean.valueOf(c10705b.m4051g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (m4051g() && (m1277a2 = C11369b.m1277a(this.f33338g, c10705b.f33338g)) != 0) {
            return m1277a2;
        }
        int compareTo8 = Boolean.valueOf(m4050h()).compareTo(Boolean.valueOf(c10705b.m4050h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (m4050h() && (m1277a = C11369b.m1277a(this.f33339h, c10705b.f33339h)) != 0) {
            return m1277a;
        }
        int compareTo9 = Boolean.valueOf(m4049i()).compareTo(Boolean.valueOf(c10705b.m4049i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (m4049i() && (m1280a2 = C11369b.m1280a(this.f33340i, c10705b.f33340i)) != 0) {
            return m1280a2;
        }
        int compareTo10 = Boolean.valueOf(m4048j()).compareTo(Boolean.valueOf(c10705b.m4048j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (m4048j() && (m1280a = C11369b.m1280a(this.f33341j, c10705b.f33341j)) != 0) {
            return m1280a;
        }
        return 0;
    }

    /* renamed from: b */
    public C10705b m4068b(int i) {
        this.f33334c = i;
        m4061c(true);
        return this;
    }

    /* renamed from: b */
    public C10705b m4066b(String str) {
        this.f33336e = str;
        return this;
    }

    @Override // org.p286a.p321b.AbstractC11361a
    /* renamed from: b */
    public void mo1285b(AbstractC11376e abstractC11376e) {
        m4047k();
        abstractC11376e.mo1250a(f33321l);
        abstractC11376e.mo1254a(f33322m);
        abstractC11376e.mo1260a(this.f33332a);
        abstractC11376e.mo1247b();
        abstractC11376e.mo1254a(f33323n);
        abstractC11376e.mo1258a(this.f33333b);
        abstractC11376e.mo1247b();
        abstractC11376e.mo1254a(f33324o);
        abstractC11376e.mo1258a(this.f33334c);
        abstractC11376e.mo1247b();
        if (this.f33335d != null) {
            abstractC11376e.mo1254a(f33325p);
            abstractC11376e.mo1256a(this.f33335d);
            abstractC11376e.mo1247b();
        }
        if (this.f33336e != null && m4056e()) {
            abstractC11376e.mo1254a(f33326q);
            abstractC11376e.mo1256a(this.f33336e);
            abstractC11376e.mo1247b();
        }
        if (m4053f()) {
            abstractC11376e.mo1254a(f33327r);
            abstractC11376e.mo1258a(this.f33337f);
            abstractC11376e.mo1247b();
        }
        if (this.f33338g != null && m4051g()) {
            abstractC11376e.mo1254a(f33328s);
            abstractC11376e.mo1256a(this.f33338g);
            abstractC11376e.mo1247b();
        }
        if (this.f33339h != null && m4050h()) {
            abstractC11376e.mo1254a(f33329t);
            abstractC11376e.mo1256a(this.f33339h);
            abstractC11376e.mo1247b();
        }
        if (m4049i()) {
            abstractC11376e.mo1254a(f33330u);
            abstractC11376e.mo1258a(this.f33340i);
            abstractC11376e.mo1247b();
        }
        if (m4048j()) {
            abstractC11376e.mo1254a(f33331v);
            abstractC11376e.mo1258a(this.f33341j);
            abstractC11376e.mo1247b();
        }
        abstractC11376e.mo1246c();
        abstractC11376e.mo1261a();
    }

    /* renamed from: b */
    public void m4065b(boolean z) {
        this.f33342w.set(1, z);
    }

    /* renamed from: b */
    public boolean m4069b() {
        return this.f33342w.get(1);
    }

    /* renamed from: c */
    public C10705b m4063c(int i) {
        this.f33337f = i;
        m4057d(true);
        return this;
    }

    /* renamed from: c */
    public C10705b m4062c(String str) {
        this.f33338g = str;
        return this;
    }

    /* renamed from: c */
    public void m4061c(boolean z) {
        this.f33342w.set(2, z);
    }

    /* renamed from: c */
    public boolean m4064c() {
        return this.f33342w.get(2);
    }

    /* renamed from: d */
    public C10705b m4059d(int i) {
        this.f33340i = i;
        m4054e(true);
        return this;
    }

    /* renamed from: d */
    public C10705b m4058d(String str) {
        this.f33339h = str;
        return this;
    }

    /* renamed from: d */
    public void m4057d(boolean z) {
        this.f33342w.set(3, z);
    }

    /* renamed from: d */
    public boolean m4060d() {
        return this.f33335d != null;
    }

    /* renamed from: e */
    public C10705b m4055e(int i) {
        this.f33341j = i;
        m4052f(true);
        return this;
    }

    /* renamed from: e */
    public void m4054e(boolean z) {
        this.f33342w.set(4, z);
    }

    /* renamed from: e */
    public boolean m4056e() {
        return this.f33336e != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C10705b)) {
            return m4072a((C10705b) obj);
        }
        return false;
    }

    /* renamed from: f */
    public void m4052f(boolean z) {
        this.f33342w.set(5, z);
    }

    /* renamed from: f */
    public boolean m4053f() {
        return this.f33342w.get(3);
    }

    /* renamed from: g */
    public boolean m4051g() {
        return this.f33338g != null;
    }

    /* renamed from: h */
    public boolean m4050h() {
        return this.f33339h != null;
    }

    public int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public boolean m4049i() {
        return this.f33342w.get(4);
    }

    /* renamed from: j */
    public boolean m4048j() {
        return this.f33342w.get(5);
    }

    /* renamed from: k */
    public void m4047k() {
        if (this.f33335d == null) {
            throw new C11377f("Required field 'connpt' was not present! Struct: " + toString());
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StatsEvent(");
        sb.append("chid:");
        sb.append((int) this.f33332a);
        sb.append(", ");
        sb.append("type:");
        sb.append(this.f33333b);
        sb.append(", ");
        sb.append("value:");
        sb.append(this.f33334c);
        sb.append(", ");
        sb.append("connpt:");
        if (this.f33335d == null) {
            sb.append("null");
        } else {
            sb.append(this.f33335d);
        }
        if (m4056e()) {
            sb.append(", ");
            sb.append("host:");
            if (this.f33336e == null) {
                sb.append("null");
            } else {
                sb.append(this.f33336e);
            }
        }
        if (m4053f()) {
            sb.append(", ");
            sb.append("subvalue:");
            sb.append(this.f33337f);
        }
        if (m4051g()) {
            sb.append(", ");
            sb.append("annotation:");
            if (this.f33338g == null) {
                sb.append("null");
            } else {
                sb.append(this.f33338g);
            }
        }
        if (m4050h()) {
            sb.append(", ");
            sb.append("user:");
            if (this.f33339h == null) {
                sb.append("null");
            } else {
                sb.append(this.f33339h);
            }
        }
        if (m4049i()) {
            sb.append(", ");
            sb.append("time:");
            sb.append(this.f33340i);
        }
        if (m4048j()) {
            sb.append(", ");
            sb.append("clientIp:");
            sb.append(this.f33341j);
        }
        sb.append(")");
        return sb.toString();
    }
}
