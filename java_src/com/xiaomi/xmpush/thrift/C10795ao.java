package com.xiaomi.xmpush.thrift;

import com.p255mi.live.openlivesdk.C10022a;
import com.xiaomi.market.sdk.C10445j;
import java.io.Serializable;
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
/* renamed from: com.xiaomi.xmpush.thrift.ao */
/* loaded from: classes2.dex */
public class C10795ao implements Serializable, Cloneable, AbstractC11361a<C10795ao, EnumC10796a> {

    /* renamed from: h */
    public static final Map<EnumC10796a, C11363b> f34094h;

    /* renamed from: i */
    private static final C11381j f34095i = new C11381j("XmPushActionUnSubscription");

    /* renamed from: j */
    private static final C11373b f34096j = new C11373b(C10022a.f30894c, (byte) 11, 1);

    /* renamed from: k */
    private static final C11373b f34097k = new C11373b("target", (byte) 12, 2);

    /* renamed from: l */
    private static final C11373b f34098l = new C11373b("id", (byte) 11, 3);

    /* renamed from: m */
    private static final C11373b f34099m = new C11373b("appId", (byte) 11, 4);

    /* renamed from: n */
    private static final C11373b f34100n = new C11373b("topic", (byte) 11, 5);

    /* renamed from: o */
    private static final C11373b f34101o = new C11373b(C10445j.f32447W, (byte) 11, 6);

    /* renamed from: p */
    private static final C11373b f34102p = new C11373b("category", (byte) 11, 7);

    /* renamed from: a */
    public String f34103a;

    /* renamed from: b */
    public C10831u f34104b;

    /* renamed from: c */
    public String f34105c;

    /* renamed from: d */
    public String f34106d;

    /* renamed from: e */
    public String f34107e;

    /* renamed from: f */
    public String f34108f;

    /* renamed from: g */
    public String f34109g;

    /* renamed from: com.xiaomi.xmpush.thrift.ao$a */
    /* loaded from: classes2.dex */
    public enum EnumC10796a {
        DEBUG(1, C10022a.f30894c),
        TARGET(2, "target"),
        ID(3, "id"),
        APP_ID(4, "appId"),
        TOPIC(5, "topic"),
        PACKAGE_NAME(6, C10445j.f32447W),
        CATEGORY(7, "category");
        

        /* renamed from: h */
        private static final Map<String, EnumC10796a> f34117h = new HashMap();

        /* renamed from: i */
        private final short f34119i;

        /* renamed from: j */
        private final String f34120j;

        static {
            Iterator it2 = EnumSet.allOf(EnumC10796a.class).iterator();
            while (it2.hasNext()) {
                EnumC10796a enumC10796a = (EnumC10796a) it2.next();
                f34117h.put(enumC10796a.m3490a(), enumC10796a);
            }
        }

        EnumC10796a(short s, String str) {
            this.f34119i = s;
            this.f34120j = str;
        }

        /* renamed from: a */
        public String m3490a() {
            return this.f34120j;
        }
    }

    static {
        EnumMap enumMap = new EnumMap(EnumC10796a.class);
        enumMap.put((EnumMap) EnumC10796a.DEBUG, (EnumC10796a) new C11363b(C10022a.f30894c, (byte) 2, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10796a.TARGET, (EnumC10796a) new C11363b("target", (byte) 2, new C11368g((byte) 12, C10831u.class)));
        enumMap.put((EnumMap) EnumC10796a.ID, (EnumC10796a) new C11363b("id", (byte) 1, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10796a.APP_ID, (EnumC10796a) new C11363b("appId", (byte) 1, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10796a.TOPIC, (EnumC10796a) new C11363b("topic", (byte) 1, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10796a.PACKAGE_NAME, (EnumC10796a) new C11363b(C10445j.f32447W, (byte) 2, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10796a.CATEGORY, (EnumC10796a) new C11363b("category", (byte) 2, new C11364c((byte) 11)));
        f34094h = Collections.unmodifiableMap(enumMap);
        C11363b.m1284a(C10795ao.class, f34094h);
    }

    /* renamed from: a */
    public C10795ao m3503a(String str) {
        this.f34105c = str;
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
                m3491h();
                return;
            }
            switch (mo1240i.f36480c) {
                case 1:
                    if (mo1240i.f36479b != 11) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f34103a = abstractC11376e.mo1223w();
                        break;
                    }
                case 2:
                    if (mo1240i.f36479b != 12) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f34104b = new C10831u();
                        this.f34104b.mo1286a(abstractC11376e);
                        break;
                    }
                case 3:
                    if (mo1240i.f36479b != 11) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f34105c = abstractC11376e.mo1223w();
                        break;
                    }
                case 4:
                    if (mo1240i.f36479b != 11) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f34106d = abstractC11376e.mo1223w();
                        break;
                    }
                case 5:
                    if (mo1240i.f36479b != 11) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f34107e = abstractC11376e.mo1223w();
                        break;
                    }
                case 6:
                    if (mo1240i.f36479b != 11) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f34108f = abstractC11376e.mo1223w();
                        break;
                    }
                case 7:
                    if (mo1240i.f36479b != 11) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f34109g = abstractC11376e.mo1223w();
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
    public boolean m3505a() {
        return this.f34103a != null;
    }

    /* renamed from: a */
    public boolean m3504a(C10795ao c10795ao) {
        if (c10795ao == null) {
            return false;
        }
        boolean m3505a = m3505a();
        boolean m3505a2 = c10795ao.m3505a();
        if ((m3505a || m3505a2) && (!m3505a || !m3505a2 || !this.f34103a.equals(c10795ao.f34103a))) {
            return false;
        }
        boolean m3502b = m3502b();
        boolean m3502b2 = c10795ao.m3502b();
        if ((m3502b || m3502b2) && (!m3502b || !m3502b2 || !this.f34104b.m3254a(c10795ao.f34104b))) {
            return false;
        }
        boolean m3499c = m3499c();
        boolean m3499c2 = c10795ao.m3499c();
        if ((m3499c || m3499c2) && (!m3499c || !m3499c2 || !this.f34105c.equals(c10795ao.f34105c))) {
            return false;
        }
        boolean m3497d = m3497d();
        boolean m3497d2 = c10795ao.m3497d();
        if ((m3497d || m3497d2) && (!m3497d || !m3497d2 || !this.f34106d.equals(c10795ao.f34106d))) {
            return false;
        }
        boolean m3495e = m3495e();
        boolean m3495e2 = c10795ao.m3495e();
        if ((m3495e || m3495e2) && (!m3495e || !m3495e2 || !this.f34107e.equals(c10795ao.f34107e))) {
            return false;
        }
        boolean m3493f = m3493f();
        boolean m3493f2 = c10795ao.m3493f();
        if ((m3493f || m3493f2) && (!m3493f || !m3493f2 || !this.f34108f.equals(c10795ao.f34108f))) {
            return false;
        }
        boolean m3492g = m3492g();
        boolean m3492g2 = c10795ao.m3492g();
        return (!m3492g && !m3492g2) || (m3492g && m3492g2 && this.f34109g.equals(c10795ao.f34109g));
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(C10795ao c10795ao) {
        int m1277a;
        int m1277a2;
        int m1277a3;
        int m1277a4;
        int m1277a5;
        int m1278a;
        int m1277a6;
        if (!getClass().equals(c10795ao.getClass())) {
            return getClass().getName().compareTo(c10795ao.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m3505a()).compareTo(Boolean.valueOf(c10795ao.m3505a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m3505a() && (m1277a6 = C11369b.m1277a(this.f34103a, c10795ao.f34103a)) != 0) {
            return m1277a6;
        }
        int compareTo2 = Boolean.valueOf(m3502b()).compareTo(Boolean.valueOf(c10795ao.m3502b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m3502b() && (m1278a = C11369b.m1278a(this.f34104b, c10795ao.f34104b)) != 0) {
            return m1278a;
        }
        int compareTo3 = Boolean.valueOf(m3499c()).compareTo(Boolean.valueOf(c10795ao.m3499c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (m3499c() && (m1277a5 = C11369b.m1277a(this.f34105c, c10795ao.f34105c)) != 0) {
            return m1277a5;
        }
        int compareTo4 = Boolean.valueOf(m3497d()).compareTo(Boolean.valueOf(c10795ao.m3497d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (m3497d() && (m1277a4 = C11369b.m1277a(this.f34106d, c10795ao.f34106d)) != 0) {
            return m1277a4;
        }
        int compareTo5 = Boolean.valueOf(m3495e()).compareTo(Boolean.valueOf(c10795ao.m3495e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (m3495e() && (m1277a3 = C11369b.m1277a(this.f34107e, c10795ao.f34107e)) != 0) {
            return m1277a3;
        }
        int compareTo6 = Boolean.valueOf(m3493f()).compareTo(Boolean.valueOf(c10795ao.m3493f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (m3493f() && (m1277a2 = C11369b.m1277a(this.f34108f, c10795ao.f34108f)) != 0) {
            return m1277a2;
        }
        int compareTo7 = Boolean.valueOf(m3492g()).compareTo(Boolean.valueOf(c10795ao.m3492g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (m3492g() && (m1277a = C11369b.m1277a(this.f34109g, c10795ao.f34109g)) != 0) {
            return m1277a;
        }
        return 0;
    }

    /* renamed from: b */
    public C10795ao m3500b(String str) {
        this.f34106d = str;
        return this;
    }

    @Override // org.p286a.p321b.AbstractC11361a
    /* renamed from: b */
    public void mo1285b(AbstractC11376e abstractC11376e) {
        m3491h();
        abstractC11376e.mo1250a(f34095i);
        if (this.f34103a != null && m3505a()) {
            abstractC11376e.mo1254a(f34096j);
            abstractC11376e.mo1256a(this.f34103a);
            abstractC11376e.mo1247b();
        }
        if (this.f34104b != null && m3502b()) {
            abstractC11376e.mo1254a(f34097k);
            this.f34104b.mo1285b(abstractC11376e);
            abstractC11376e.mo1247b();
        }
        if (this.f34105c != null) {
            abstractC11376e.mo1254a(f34098l);
            abstractC11376e.mo1256a(this.f34105c);
            abstractC11376e.mo1247b();
        }
        if (this.f34106d != null) {
            abstractC11376e.mo1254a(f34099m);
            abstractC11376e.mo1256a(this.f34106d);
            abstractC11376e.mo1247b();
        }
        if (this.f34107e != null) {
            abstractC11376e.mo1254a(f34100n);
            abstractC11376e.mo1256a(this.f34107e);
            abstractC11376e.mo1247b();
        }
        if (this.f34108f != null && m3493f()) {
            abstractC11376e.mo1254a(f34101o);
            abstractC11376e.mo1256a(this.f34108f);
            abstractC11376e.mo1247b();
        }
        if (this.f34109g != null && m3492g()) {
            abstractC11376e.mo1254a(f34102p);
            abstractC11376e.mo1256a(this.f34109g);
            abstractC11376e.mo1247b();
        }
        abstractC11376e.mo1246c();
        abstractC11376e.mo1261a();
    }

    /* renamed from: b */
    public boolean m3502b() {
        return this.f34104b != null;
    }

    /* renamed from: c */
    public C10795ao m3498c(String str) {
        this.f34107e = str;
        return this;
    }

    /* renamed from: c */
    public boolean m3499c() {
        return this.f34105c != null;
    }

    /* renamed from: d */
    public C10795ao m3496d(String str) {
        this.f34108f = str;
        return this;
    }

    /* renamed from: d */
    public boolean m3497d() {
        return this.f34106d != null;
    }

    /* renamed from: e */
    public C10795ao m3494e(String str) {
        this.f34109g = str;
        return this;
    }

    /* renamed from: e */
    public boolean m3495e() {
        return this.f34107e != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C10795ao)) {
            return m3504a((C10795ao) obj);
        }
        return false;
    }

    /* renamed from: f */
    public boolean m3493f() {
        return this.f34108f != null;
    }

    /* renamed from: g */
    public boolean m3492g() {
        return this.f34109g != null;
    }

    /* renamed from: h */
    public void m3491h() {
        if (this.f34105c == null) {
            throw new C11377f("Required field 'id' was not present! Struct: " + toString());
        }
        if (this.f34106d == null) {
            throw new C11377f("Required field 'appId' was not present! Struct: " + toString());
        }
        if (this.f34107e != null) {
            return;
        }
        throw new C11377f("Required field 'topic' was not present! Struct: " + toString());
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        boolean z = false;
        StringBuilder sb = new StringBuilder("XmPushActionUnSubscription(");
        boolean z2 = true;
        if (m3505a()) {
            sb.append("debug:");
            if (this.f34103a == null) {
                sb.append("null");
            } else {
                sb.append(this.f34103a);
            }
            z2 = false;
        }
        if (m3502b()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("target:");
            if (this.f34104b == null) {
                sb.append("null");
            } else {
                sb.append(this.f34104b);
            }
        } else {
            z = z2;
        }
        if (!z) {
            sb.append(", ");
        }
        sb.append("id:");
        if (this.f34105c == null) {
            sb.append("null");
        } else {
            sb.append(this.f34105c);
        }
        sb.append(", ");
        sb.append("appId:");
        if (this.f34106d == null) {
            sb.append("null");
        } else {
            sb.append(this.f34106d);
        }
        sb.append(", ");
        sb.append("topic:");
        if (this.f34107e == null) {
            sb.append("null");
        } else {
            sb.append(this.f34107e);
        }
        if (m3493f()) {
            sb.append(", ");
            sb.append("packageName:");
            if (this.f34108f == null) {
                sb.append("null");
            } else {
                sb.append(this.f34108f);
            }
        }
        if (m3492g()) {
            sb.append(", ");
            sb.append("category:");
            if (this.f34109g == null) {
                sb.append("null");
            } else {
                sb.append(this.f34109g);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
