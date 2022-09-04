package com.xiaomi.xmpush.thrift;

import com.facebook.common.util.UriUtil;
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
import org.p286a.p321b.p323b.C11379h;
import org.p286a.p321b.p323b.C11381j;
/* renamed from: com.xiaomi.xmpush.thrift.d */
/* loaded from: classes2.dex */
public class C10804d implements Serializable, Cloneable, AbstractC11361a<C10804d, EnumC10805a> {

    /* renamed from: h */
    public static final Map<EnumC10805a, C11363b> f34180h;

    /* renamed from: i */
    private static final C11381j f34181i = new C11381j("ClientUploadDataItem");

    /* renamed from: j */
    private static final C11373b f34182j = new C11373b("channel", (byte) 11, 1);

    /* renamed from: k */
    private static final C11373b f34183k = new C11373b(UriUtil.DATA_SCHEME, (byte) 11, 2);

    /* renamed from: l */
    private static final C11373b f34184l = new C11373b("name", (byte) 11, 3);

    /* renamed from: m */
    private static final C11373b f34185m = new C11373b("counter", (byte) 10, 4);

    /* renamed from: n */
    private static final C11373b f34186n = new C11373b("timestamp", (byte) 10, 5);

    /* renamed from: o */
    private static final C11373b f34187o = new C11373b("fromSdk", (byte) 2, 6);

    /* renamed from: p */
    private static final C11373b f34188p = new C11373b("category", (byte) 11, 7);

    /* renamed from: a */
    public String f34189a;

    /* renamed from: b */
    public String f34190b;

    /* renamed from: c */
    public String f34191c;

    /* renamed from: d */
    public long f34192d;

    /* renamed from: e */
    public long f34193e;

    /* renamed from: f */
    public boolean f34194f;

    /* renamed from: g */
    public String f34195g;

    /* renamed from: q */
    private BitSet f34196q = new BitSet(3);

    /* renamed from: com.xiaomi.xmpush.thrift.d$a */
    /* loaded from: classes2.dex */
    public enum EnumC10805a {
        CHANNEL(1, "channel"),
        DATA(2, UriUtil.DATA_SCHEME),
        NAME(3, "name"),
        COUNTER(4, "counter"),
        TIMESTAMP(5, "timestamp"),
        FROM_SDK(6, "fromSdk"),
        CATEGORY(7, "category");
        

        /* renamed from: h */
        private static final Map<String, EnumC10805a> f34204h = new HashMap();

        /* renamed from: i */
        private final short f34206i;

        /* renamed from: j */
        private final String f34207j;

        static {
            Iterator it2 = EnumSet.allOf(EnumC10805a.class).iterator();
            while (it2.hasNext()) {
                EnumC10805a enumC10805a = (EnumC10805a) it2.next();
                f34204h.put(enumC10805a.m3438a(), enumC10805a);
            }
        }

        EnumC10805a(short s, String str) {
            this.f34206i = s;
            this.f34207j = str;
        }

        /* renamed from: a */
        public String m3438a() {
            return this.f34207j;
        }
    }

    static {
        EnumMap enumMap = new EnumMap(EnumC10805a.class);
        enumMap.put((EnumMap) EnumC10805a.CHANNEL, (EnumC10805a) new C11363b("channel", (byte) 2, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10805a.DATA, (EnumC10805a) new C11363b(UriUtil.DATA_SCHEME, (byte) 2, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10805a.NAME, (EnumC10805a) new C11363b("name", (byte) 2, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10805a.COUNTER, (EnumC10805a) new C11363b("counter", (byte) 2, new C11364c((byte) 10)));
        enumMap.put((EnumMap) EnumC10805a.TIMESTAMP, (EnumC10805a) new C11363b("timestamp", (byte) 2, new C11364c((byte) 10)));
        enumMap.put((EnumMap) EnumC10805a.FROM_SDK, (EnumC10805a) new C11363b("fromSdk", (byte) 2, new C11364c((byte) 2)));
        enumMap.put((EnumMap) EnumC10805a.CATEGORY, (EnumC10805a) new C11363b("category", (byte) 2, new C11364c((byte) 11)));
        f34180h = Collections.unmodifiableMap(enumMap);
        C11363b.m1284a(C10804d.class, f34180h);
    }

    @Override // org.p286a.p321b.AbstractC11361a
    /* renamed from: a */
    public void mo1286a(AbstractC11376e abstractC11376e) {
        abstractC11376e.mo1242g();
        while (true) {
            C11373b mo1240i = abstractC11376e.mo1240i();
            if (mo1240i.f36479b == 0) {
                abstractC11376e.mo1241h();
                m3439h();
                return;
            }
            switch (mo1240i.f36480c) {
                case 1:
                    if (mo1240i.f36479b != 11) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f34189a = abstractC11376e.mo1223w();
                        break;
                    }
                case 2:
                    if (mo1240i.f36479b != 11) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f34190b = abstractC11376e.mo1223w();
                        break;
                    }
                case 3:
                    if (mo1240i.f36479b != 11) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f34191c = abstractC11376e.mo1223w();
                        break;
                    }
                case 4:
                    if (mo1240i.f36479b != 10) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f34192d = abstractC11376e.mo1231u();
                        m3449a(true);
                        break;
                    }
                case 5:
                    if (mo1240i.f36479b != 10) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f34193e = abstractC11376e.mo1231u();
                        m3446b(true);
                        break;
                    }
                case 6:
                    if (mo1240i.f36479b != 2) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f34194f = abstractC11376e.mo1235q();
                        m3444c(true);
                        break;
                    }
                case 7:
                    if (mo1240i.f36479b != 11) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f34195g = abstractC11376e.mo1223w();
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
    public void m3449a(boolean z) {
        this.f34196q.set(0, z);
    }

    /* renamed from: a */
    public boolean m3451a() {
        return this.f34189a != null;
    }

    /* renamed from: a */
    public boolean m3450a(C10804d c10804d) {
        if (c10804d == null) {
            return false;
        }
        boolean m3451a = m3451a();
        boolean m3451a2 = c10804d.m3451a();
        if ((m3451a || m3451a2) && (!m3451a || !m3451a2 || !this.f34189a.equals(c10804d.f34189a))) {
            return false;
        }
        boolean m3448b = m3448b();
        boolean m3448b2 = c10804d.m3448b();
        if ((m3448b || m3448b2) && (!m3448b || !m3448b2 || !this.f34190b.equals(c10804d.f34190b))) {
            return false;
        }
        boolean m3445c = m3445c();
        boolean m3445c2 = c10804d.m3445c();
        if ((m3445c || m3445c2) && (!m3445c || !m3445c2 || !this.f34191c.equals(c10804d.f34191c))) {
            return false;
        }
        boolean m3443d = m3443d();
        boolean m3443d2 = c10804d.m3443d();
        if ((m3443d || m3443d2) && (!m3443d || !m3443d2 || this.f34192d != c10804d.f34192d)) {
            return false;
        }
        boolean m3442e = m3442e();
        boolean m3442e2 = c10804d.m3442e();
        if ((m3442e || m3442e2) && (!m3442e || !m3442e2 || this.f34193e != c10804d.f34193e)) {
            return false;
        }
        boolean m3441f = m3441f();
        boolean m3441f2 = c10804d.m3441f();
        if ((m3441f || m3441f2) && (!m3441f || !m3441f2 || this.f34194f != c10804d.f34194f)) {
            return false;
        }
        boolean m3440g = m3440g();
        boolean m3440g2 = c10804d.m3440g();
        return (!m3440g && !m3440g2) || (m3440g && m3440g2 && this.f34195g.equals(c10804d.f34195g));
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(C10804d c10804d) {
        int m1277a;
        int m1269a;
        int m1279a;
        int m1279a2;
        int m1277a2;
        int m1277a3;
        int m1277a4;
        if (!getClass().equals(c10804d.getClass())) {
            return getClass().getName().compareTo(c10804d.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m3451a()).compareTo(Boolean.valueOf(c10804d.m3451a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m3451a() && (m1277a4 = C11369b.m1277a(this.f34189a, c10804d.f34189a)) != 0) {
            return m1277a4;
        }
        int compareTo2 = Boolean.valueOf(m3448b()).compareTo(Boolean.valueOf(c10804d.m3448b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m3448b() && (m1277a3 = C11369b.m1277a(this.f34190b, c10804d.f34190b)) != 0) {
            return m1277a3;
        }
        int compareTo3 = Boolean.valueOf(m3445c()).compareTo(Boolean.valueOf(c10804d.m3445c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (m3445c() && (m1277a2 = C11369b.m1277a(this.f34191c, c10804d.f34191c)) != 0) {
            return m1277a2;
        }
        int compareTo4 = Boolean.valueOf(m3443d()).compareTo(Boolean.valueOf(c10804d.m3443d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (m3443d() && (m1279a2 = C11369b.m1279a(this.f34192d, c10804d.f34192d)) != 0) {
            return m1279a2;
        }
        int compareTo5 = Boolean.valueOf(m3442e()).compareTo(Boolean.valueOf(c10804d.m3442e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (m3442e() && (m1279a = C11369b.m1279a(this.f34193e, c10804d.f34193e)) != 0) {
            return m1279a;
        }
        int compareTo6 = Boolean.valueOf(m3441f()).compareTo(Boolean.valueOf(c10804d.m3441f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (m3441f() && (m1269a = C11369b.m1269a(this.f34194f, c10804d.f34194f)) != 0) {
            return m1269a;
        }
        int compareTo7 = Boolean.valueOf(m3440g()).compareTo(Boolean.valueOf(c10804d.m3440g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (m3440g() && (m1277a = C11369b.m1277a(this.f34195g, c10804d.f34195g)) != 0) {
            return m1277a;
        }
        return 0;
    }

    @Override // org.p286a.p321b.AbstractC11361a
    /* renamed from: b */
    public void mo1285b(AbstractC11376e abstractC11376e) {
        m3439h();
        abstractC11376e.mo1250a(f34181i);
        if (this.f34189a != null && m3451a()) {
            abstractC11376e.mo1254a(f34182j);
            abstractC11376e.mo1256a(this.f34189a);
            abstractC11376e.mo1247b();
        }
        if (this.f34190b != null && m3448b()) {
            abstractC11376e.mo1254a(f34183k);
            abstractC11376e.mo1256a(this.f34190b);
            abstractC11376e.mo1247b();
        }
        if (this.f34191c != null && m3445c()) {
            abstractC11376e.mo1254a(f34184l);
            abstractC11376e.mo1256a(this.f34191c);
            abstractC11376e.mo1247b();
        }
        if (m3443d()) {
            abstractC11376e.mo1254a(f34185m);
            abstractC11376e.mo1257a(this.f34192d);
            abstractC11376e.mo1247b();
        }
        if (m3442e()) {
            abstractC11376e.mo1254a(f34186n);
            abstractC11376e.mo1257a(this.f34193e);
            abstractC11376e.mo1247b();
        }
        if (m3441f()) {
            abstractC11376e.mo1254a(f34187o);
            abstractC11376e.mo1248a(this.f34194f);
            abstractC11376e.mo1247b();
        }
        if (this.f34195g != null && m3440g()) {
            abstractC11376e.mo1254a(f34188p);
            abstractC11376e.mo1256a(this.f34195g);
            abstractC11376e.mo1247b();
        }
        abstractC11376e.mo1246c();
        abstractC11376e.mo1261a();
    }

    /* renamed from: b */
    public void m3446b(boolean z) {
        this.f34196q.set(1, z);
    }

    /* renamed from: b */
    public boolean m3448b() {
        return this.f34190b != null;
    }

    /* renamed from: c */
    public void m3444c(boolean z) {
        this.f34196q.set(2, z);
    }

    /* renamed from: c */
    public boolean m3445c() {
        return this.f34191c != null;
    }

    /* renamed from: d */
    public boolean m3443d() {
        return this.f34196q.get(0);
    }

    /* renamed from: e */
    public boolean m3442e() {
        return this.f34196q.get(1);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C10804d)) {
            return m3450a((C10804d) obj);
        }
        return false;
    }

    /* renamed from: f */
    public boolean m3441f() {
        return this.f34196q.get(2);
    }

    /* renamed from: g */
    public boolean m3440g() {
        return this.f34195g != null;
    }

    /* renamed from: h */
    public void m3439h() {
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        boolean z = false;
        StringBuilder sb = new StringBuilder("ClientUploadDataItem(");
        boolean z2 = true;
        if (m3451a()) {
            sb.append("channel:");
            if (this.f34189a == null) {
                sb.append("null");
            } else {
                sb.append(this.f34189a);
            }
            z2 = false;
        }
        if (m3448b()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("data:");
            if (this.f34190b == null) {
                sb.append("null");
            } else {
                sb.append(this.f34190b);
            }
            z2 = false;
        }
        if (m3445c()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("name:");
            if (this.f34191c == null) {
                sb.append("null");
            } else {
                sb.append(this.f34191c);
            }
            z2 = false;
        }
        if (m3443d()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("counter:");
            sb.append(this.f34192d);
            z2 = false;
        }
        if (m3442e()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("timestamp:");
            sb.append(this.f34193e);
            z2 = false;
        }
        if (m3441f()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("fromSdk:");
            sb.append(this.f34194f);
        } else {
            z = z2;
        }
        if (m3440g()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("category:");
            if (this.f34195g == null) {
                sb.append("null");
            } else {
                sb.append(this.f34195g);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
