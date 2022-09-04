package com.xiaomi.xmpush.thrift;

import com.p255mi.live.openlivesdk.C10022a;
import com.tencent.open.SocialConstants;
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
import org.p286a.p321b.p322a.C11368g;
import org.p286a.p321b.p323b.AbstractC11376e;
import org.p286a.p321b.p323b.C11373b;
import org.p286a.p321b.p323b.C11377f;
import org.p286a.p321b.p323b.C11379h;
import org.p286a.p321b.p323b.C11381j;
/* renamed from: com.xiaomi.xmpush.thrift.ai */
/* loaded from: classes2.dex */
public class C10783ai implements Serializable, Cloneable, AbstractC11361a<C10783ai, EnumC10784a> {

    /* renamed from: i */
    public static final Map<EnumC10784a, C11363b> f33889i;

    /* renamed from: j */
    private static final C11381j f33890j = new C11381j("XmPushActionSendFeedbackResult");

    /* renamed from: k */
    private static final C11373b f33891k = new C11373b(C10022a.f30894c, (byte) 11, 1);

    /* renamed from: l */
    private static final C11373b f33892l = new C11373b("target", (byte) 12, 2);

    /* renamed from: m */
    private static final C11373b f33893m = new C11373b("id", (byte) 11, 3);

    /* renamed from: n */
    private static final C11373b f33894n = new C11373b("appId", (byte) 11, 4);

    /* renamed from: o */
    private static final C11373b f33895o = new C11373b(SocialConstants.TYPE_REQUEST, (byte) 12, 5);

    /* renamed from: p */
    private static final C11373b f33896p = new C11373b("errorCode", (byte) 10, 6);

    /* renamed from: q */
    private static final C11373b f33897q = new C11373b("reason", (byte) 11, 7);

    /* renamed from: r */
    private static final C11373b f33898r = new C11373b("category", (byte) 11, 8);

    /* renamed from: a */
    public String f33899a;

    /* renamed from: b */
    public C10831u f33900b;

    /* renamed from: c */
    public String f33901c;

    /* renamed from: d */
    public String f33902d;

    /* renamed from: e */
    public C10781ah f33903e;

    /* renamed from: f */
    public long f33904f;

    /* renamed from: g */
    public String f33905g;

    /* renamed from: h */
    public String f33906h;

    /* renamed from: s */
    private BitSet f33907s = new BitSet(1);

    /* renamed from: com.xiaomi.xmpush.thrift.ai$a */
    /* loaded from: classes2.dex */
    public enum EnumC10784a {
        DEBUG(1, C10022a.f30894c),
        TARGET(2, "target"),
        ID(3, "id"),
        APP_ID(4, "appId"),
        REQUEST(5, SocialConstants.TYPE_REQUEST),
        ERROR_CODE(6, "errorCode"),
        REASON(7, "reason"),
        CATEGORY(8, "category");
        

        /* renamed from: i */
        private static final Map<String, EnumC10784a> f33916i = new HashMap();

        /* renamed from: j */
        private final short f33918j;

        /* renamed from: k */
        private final String f33919k;

        static {
            Iterator it2 = EnumSet.allOf(EnumC10784a.class).iterator();
            while (it2.hasNext()) {
                EnumC10784a enumC10784a = (EnumC10784a) it2.next();
                f33916i.put(enumC10784a.m3595a(), enumC10784a);
            }
        }

        EnumC10784a(short s, String str) {
            this.f33918j = s;
            this.f33919k = str;
        }

        /* renamed from: a */
        public String m3595a() {
            return this.f33919k;
        }
    }

    static {
        EnumMap enumMap = new EnumMap(EnumC10784a.class);
        enumMap.put((EnumMap) EnumC10784a.DEBUG, (EnumC10784a) new C11363b(C10022a.f30894c, (byte) 2, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10784a.TARGET, (EnumC10784a) new C11363b("target", (byte) 2, new C11368g((byte) 12, C10831u.class)));
        enumMap.put((EnumMap) EnumC10784a.ID, (EnumC10784a) new C11363b("id", (byte) 1, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10784a.APP_ID, (EnumC10784a) new C11363b("appId", (byte) 1, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10784a.REQUEST, (EnumC10784a) new C11363b(SocialConstants.TYPE_REQUEST, (byte) 2, new C11368g((byte) 12, C10781ah.class)));
        enumMap.put((EnumMap) EnumC10784a.ERROR_CODE, (EnumC10784a) new C11363b("errorCode", (byte) 1, new C11364c((byte) 10)));
        enumMap.put((EnumMap) EnumC10784a.REASON, (EnumC10784a) new C11363b("reason", (byte) 2, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10784a.CATEGORY, (EnumC10784a) new C11363b("category", (byte) 2, new C11364c((byte) 11)));
        f33889i = Collections.unmodifiableMap(enumMap);
        C11363b.m1284a(C10783ai.class, f33889i);
    }

    @Override // org.p286a.p321b.AbstractC11361a
    /* renamed from: a */
    public void mo1286a(AbstractC11376e abstractC11376e) {
        abstractC11376e.mo1242g();
        while (true) {
            C11373b mo1240i = abstractC11376e.mo1240i();
            if (mo1240i.f36479b == 0) {
                abstractC11376e.mo1241h();
                if (!m3599f()) {
                    throw new C11377f("Required field 'errorCode' was not found in serialized data! Struct: " + toString());
                }
                m3596i();
                return;
            }
            switch (mo1240i.f36480c) {
                case 1:
                    if (mo1240i.f36479b != 11) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f33899a = abstractC11376e.mo1223w();
                        break;
                    }
                case 2:
                    if (mo1240i.f36479b != 12) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f33900b = new C10831u();
                        this.f33900b.mo1286a(abstractC11376e);
                        break;
                    }
                case 3:
                    if (mo1240i.f36479b != 11) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f33901c = abstractC11376e.mo1223w();
                        break;
                    }
                case 4:
                    if (mo1240i.f36479b != 11) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f33902d = abstractC11376e.mo1223w();
                        break;
                    }
                case 5:
                    if (mo1240i.f36479b != 12) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f33903e = new C10781ah();
                        this.f33903e.mo1286a(abstractC11376e);
                        break;
                    }
                case 6:
                    if (mo1240i.f36479b != 10) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f33904f = abstractC11376e.mo1231u();
                        m3605a(true);
                        break;
                    }
                case 7:
                    if (mo1240i.f36479b != 11) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f33905g = abstractC11376e.mo1223w();
                        break;
                    }
                case 8:
                    if (mo1240i.f36479b != 11) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f33906h = abstractC11376e.mo1223w();
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
    public void m3605a(boolean z) {
        this.f33907s.set(0, z);
    }

    /* renamed from: a */
    public boolean m3607a() {
        return this.f33899a != null;
    }

    /* renamed from: a */
    public boolean m3606a(C10783ai c10783ai) {
        if (c10783ai == null) {
            return false;
        }
        boolean m3607a = m3607a();
        boolean m3607a2 = c10783ai.m3607a();
        if ((m3607a || m3607a2) && (!m3607a || !m3607a2 || !this.f33899a.equals(c10783ai.f33899a))) {
            return false;
        }
        boolean m3604b = m3604b();
        boolean m3604b2 = c10783ai.m3604b();
        if ((m3604b || m3604b2) && (!m3604b || !m3604b2 || !this.f33900b.m3254a(c10783ai.f33900b))) {
            return false;
        }
        boolean m3602c = m3602c();
        boolean m3602c2 = c10783ai.m3602c();
        if ((m3602c || m3602c2) && (!m3602c || !m3602c2 || !this.f33901c.equals(c10783ai.f33901c))) {
            return false;
        }
        boolean m3601d = m3601d();
        boolean m3601d2 = c10783ai.m3601d();
        if ((m3601d || m3601d2) && (!m3601d || !m3601d2 || !this.f33902d.equals(c10783ai.f33902d))) {
            return false;
        }
        boolean m3600e = m3600e();
        boolean m3600e2 = c10783ai.m3600e();
        if (((m3600e || m3600e2) && (!m3600e || !m3600e2 || !this.f33903e.m3616a(c10783ai.f33903e))) || this.f33904f != c10783ai.f33904f) {
            return false;
        }
        boolean m3598g = m3598g();
        boolean m3598g2 = c10783ai.m3598g();
        if ((m3598g || m3598g2) && (!m3598g || !m3598g2 || !this.f33905g.equals(c10783ai.f33905g))) {
            return false;
        }
        boolean m3597h = m3597h();
        boolean m3597h2 = c10783ai.m3597h();
        return (!m3597h && !m3597h2) || (m3597h && m3597h2 && this.f33906h.equals(c10783ai.f33906h));
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(C10783ai c10783ai) {
        int m1277a;
        int m1277a2;
        int m1279a;
        int m1278a;
        int m1277a3;
        int m1277a4;
        int m1278a2;
        int m1277a5;
        if (!getClass().equals(c10783ai.getClass())) {
            return getClass().getName().compareTo(c10783ai.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m3607a()).compareTo(Boolean.valueOf(c10783ai.m3607a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m3607a() && (m1277a5 = C11369b.m1277a(this.f33899a, c10783ai.f33899a)) != 0) {
            return m1277a5;
        }
        int compareTo2 = Boolean.valueOf(m3604b()).compareTo(Boolean.valueOf(c10783ai.m3604b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m3604b() && (m1278a2 = C11369b.m1278a(this.f33900b, c10783ai.f33900b)) != 0) {
            return m1278a2;
        }
        int compareTo3 = Boolean.valueOf(m3602c()).compareTo(Boolean.valueOf(c10783ai.m3602c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (m3602c() && (m1277a4 = C11369b.m1277a(this.f33901c, c10783ai.f33901c)) != 0) {
            return m1277a4;
        }
        int compareTo4 = Boolean.valueOf(m3601d()).compareTo(Boolean.valueOf(c10783ai.m3601d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (m3601d() && (m1277a3 = C11369b.m1277a(this.f33902d, c10783ai.f33902d)) != 0) {
            return m1277a3;
        }
        int compareTo5 = Boolean.valueOf(m3600e()).compareTo(Boolean.valueOf(c10783ai.m3600e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (m3600e() && (m1278a = C11369b.m1278a(this.f33903e, c10783ai.f33903e)) != 0) {
            return m1278a;
        }
        int compareTo6 = Boolean.valueOf(m3599f()).compareTo(Boolean.valueOf(c10783ai.m3599f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (m3599f() && (m1279a = C11369b.m1279a(this.f33904f, c10783ai.f33904f)) != 0) {
            return m1279a;
        }
        int compareTo7 = Boolean.valueOf(m3598g()).compareTo(Boolean.valueOf(c10783ai.m3598g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (m3598g() && (m1277a2 = C11369b.m1277a(this.f33905g, c10783ai.f33905g)) != 0) {
            return m1277a2;
        }
        int compareTo8 = Boolean.valueOf(m3597h()).compareTo(Boolean.valueOf(c10783ai.m3597h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (m3597h() && (m1277a = C11369b.m1277a(this.f33906h, c10783ai.f33906h)) != 0) {
            return m1277a;
        }
        return 0;
    }

    @Override // org.p286a.p321b.AbstractC11361a
    /* renamed from: b */
    public void mo1285b(AbstractC11376e abstractC11376e) {
        m3596i();
        abstractC11376e.mo1250a(f33890j);
        if (this.f33899a != null && m3607a()) {
            abstractC11376e.mo1254a(f33891k);
            abstractC11376e.mo1256a(this.f33899a);
            abstractC11376e.mo1247b();
        }
        if (this.f33900b != null && m3604b()) {
            abstractC11376e.mo1254a(f33892l);
            this.f33900b.mo1285b(abstractC11376e);
            abstractC11376e.mo1247b();
        }
        if (this.f33901c != null) {
            abstractC11376e.mo1254a(f33893m);
            abstractC11376e.mo1256a(this.f33901c);
            abstractC11376e.mo1247b();
        }
        if (this.f33902d != null) {
            abstractC11376e.mo1254a(f33894n);
            abstractC11376e.mo1256a(this.f33902d);
            abstractC11376e.mo1247b();
        }
        if (this.f33903e != null && m3600e()) {
            abstractC11376e.mo1254a(f33895o);
            this.f33903e.mo1285b(abstractC11376e);
            abstractC11376e.mo1247b();
        }
        abstractC11376e.mo1254a(f33896p);
        abstractC11376e.mo1257a(this.f33904f);
        abstractC11376e.mo1247b();
        if (this.f33905g != null && m3598g()) {
            abstractC11376e.mo1254a(f33897q);
            abstractC11376e.mo1256a(this.f33905g);
            abstractC11376e.mo1247b();
        }
        if (this.f33906h != null && m3597h()) {
            abstractC11376e.mo1254a(f33898r);
            abstractC11376e.mo1256a(this.f33906h);
            abstractC11376e.mo1247b();
        }
        abstractC11376e.mo1246c();
        abstractC11376e.mo1261a();
    }

    /* renamed from: b */
    public boolean m3604b() {
        return this.f33900b != null;
    }

    /* renamed from: c */
    public boolean m3602c() {
        return this.f33901c != null;
    }

    /* renamed from: d */
    public boolean m3601d() {
        return this.f33902d != null;
    }

    /* renamed from: e */
    public boolean m3600e() {
        return this.f33903e != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C10783ai)) {
            return m3606a((C10783ai) obj);
        }
        return false;
    }

    /* renamed from: f */
    public boolean m3599f() {
        return this.f33907s.get(0);
    }

    /* renamed from: g */
    public boolean m3598g() {
        return this.f33905g != null;
    }

    /* renamed from: h */
    public boolean m3597h() {
        return this.f33906h != null;
    }

    public int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public void m3596i() {
        if (this.f33901c == null) {
            throw new C11377f("Required field 'id' was not present! Struct: " + toString());
        }
        if (this.f33902d != null) {
            return;
        }
        throw new C11377f("Required field 'appId' was not present! Struct: " + toString());
    }

    public String toString() {
        boolean z = false;
        StringBuilder sb = new StringBuilder("XmPushActionSendFeedbackResult(");
        boolean z2 = true;
        if (m3607a()) {
            sb.append("debug:");
            if (this.f33899a == null) {
                sb.append("null");
            } else {
                sb.append(this.f33899a);
            }
            z2 = false;
        }
        if (m3604b()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("target:");
            if (this.f33900b == null) {
                sb.append("null");
            } else {
                sb.append(this.f33900b);
            }
        } else {
            z = z2;
        }
        if (!z) {
            sb.append(", ");
        }
        sb.append("id:");
        if (this.f33901c == null) {
            sb.append("null");
        } else {
            sb.append(this.f33901c);
        }
        sb.append(", ");
        sb.append("appId:");
        if (this.f33902d == null) {
            sb.append("null");
        } else {
            sb.append(this.f33902d);
        }
        if (m3600e()) {
            sb.append(", ");
            sb.append("request:");
            if (this.f33903e == null) {
                sb.append("null");
            } else {
                sb.append(this.f33903e);
            }
        }
        sb.append(", ");
        sb.append("errorCode:");
        sb.append(this.f33904f);
        if (m3598g()) {
            sb.append(", ");
            sb.append("reason:");
            if (this.f33905g == null) {
                sb.append("null");
            } else {
                sb.append(this.f33905g);
            }
        }
        if (m3597h()) {
            sb.append(", ");
            sb.append("category:");
            if (this.f33906h == null) {
                sb.append("null");
            } else {
                sb.append(this.f33906h);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
