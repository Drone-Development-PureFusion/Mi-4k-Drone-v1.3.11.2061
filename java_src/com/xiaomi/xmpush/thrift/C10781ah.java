package com.xiaomi.xmpush.thrift;

import com.p255mi.live.openlivesdk.C10022a;
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
import org.p286a.p321b.p322a.C11366e;
import org.p286a.p321b.p322a.C11368g;
import org.p286a.p321b.p323b.AbstractC11376e;
import org.p286a.p321b.p323b.C11373b;
import org.p286a.p321b.p323b.C11375d;
import org.p286a.p321b.p323b.C11377f;
import org.p286a.p321b.p323b.C11379h;
import org.p286a.p321b.p323b.C11381j;
/* renamed from: com.xiaomi.xmpush.thrift.ah */
/* loaded from: classes2.dex */
public class C10781ah implements Serializable, Cloneable, AbstractC11361a<C10781ah, EnumC10782a> {

    /* renamed from: g */
    public static final Map<EnumC10782a, C11363b> f33865g;

    /* renamed from: h */
    private static final C11381j f33866h = new C11381j("XmPushActionSendFeedback");

    /* renamed from: i */
    private static final C11373b f33867i = new C11373b(C10022a.f30894c, (byte) 11, 1);

    /* renamed from: j */
    private static final C11373b f33868j = new C11373b("target", (byte) 12, 2);

    /* renamed from: k */
    private static final C11373b f33869k = new C11373b("id", (byte) 11, 3);

    /* renamed from: l */
    private static final C11373b f33870l = new C11373b("appId", (byte) 11, 4);

    /* renamed from: m */
    private static final C11373b f33871m = new C11373b("feedbacks", (byte) 13, 5);

    /* renamed from: n */
    private static final C11373b f33872n = new C11373b("category", (byte) 11, 6);

    /* renamed from: a */
    public String f33873a;

    /* renamed from: b */
    public C10831u f33874b;

    /* renamed from: c */
    public String f33875c;

    /* renamed from: d */
    public String f33876d;

    /* renamed from: e */
    public Map<String, String> f33877e;

    /* renamed from: f */
    public String f33878f;

    /* renamed from: com.xiaomi.xmpush.thrift.ah$a */
    /* loaded from: classes2.dex */
    public enum EnumC10782a {
        DEBUG(1, C10022a.f30894c),
        TARGET(2, "target"),
        ID(3, "id"),
        APP_ID(4, "appId"),
        FEEDBACKS(5, "feedbacks"),
        CATEGORY(6, "category");
        

        /* renamed from: g */
        private static final Map<String, EnumC10782a> f33885g = new HashMap();

        /* renamed from: h */
        private final short f33887h;

        /* renamed from: i */
        private final String f33888i;

        static {
            Iterator it2 = EnumSet.allOf(EnumC10782a.class).iterator();
            while (it2.hasNext()) {
                EnumC10782a enumC10782a = (EnumC10782a) it2.next();
                f33885g.put(enumC10782a.m3608a(), enumC10782a);
            }
        }

        EnumC10782a(short s, String str) {
            this.f33887h = s;
            this.f33888i = str;
        }

        /* renamed from: a */
        public String m3608a() {
            return this.f33888i;
        }
    }

    static {
        EnumMap enumMap = new EnumMap(EnumC10782a.class);
        enumMap.put((EnumMap) EnumC10782a.DEBUG, (EnumC10782a) new C11363b(C10022a.f30894c, (byte) 2, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10782a.TARGET, (EnumC10782a) new C11363b("target", (byte) 2, new C11368g((byte) 12, C10831u.class)));
        enumMap.put((EnumMap) EnumC10782a.ID, (EnumC10782a) new C11363b("id", (byte) 1, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10782a.APP_ID, (EnumC10782a) new C11363b("appId", (byte) 1, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10782a.FEEDBACKS, (EnumC10782a) new C11363b("feedbacks", (byte) 2, new C11366e((byte) 13, new C11364c((byte) 11), new C11364c((byte) 11))));
        enumMap.put((EnumMap) EnumC10782a.CATEGORY, (EnumC10782a) new C11363b("category", (byte) 2, new C11364c((byte) 11)));
        f33865g = Collections.unmodifiableMap(enumMap);
        C11363b.m1284a(C10781ah.class, f33865g);
    }

    @Override // org.p286a.p321b.AbstractC11361a
    /* renamed from: a */
    public void mo1286a(AbstractC11376e abstractC11376e) {
        abstractC11376e.mo1242g();
        while (true) {
            C11373b mo1240i = abstractC11376e.mo1240i();
            if (mo1240i.f36479b == 0) {
                abstractC11376e.mo1241h();
                m3609g();
                return;
            }
            switch (mo1240i.f36480c) {
                case 1:
                    if (mo1240i.f36479b == 11) {
                        this.f33873a = abstractC11376e.mo1223w();
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 2:
                    if (mo1240i.f36479b == 12) {
                        this.f33874b = new C10831u();
                        this.f33874b.mo1286a(abstractC11376e);
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 3:
                    if (mo1240i.f36479b == 11) {
                        this.f33875c = abstractC11376e.mo1223w();
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 4:
                    if (mo1240i.f36479b == 11) {
                        this.f33876d = abstractC11376e.mo1223w();
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 5:
                    if (mo1240i.f36479b == 13) {
                        C11375d mo1226k = abstractC11376e.mo1226k();
                        this.f33877e = new HashMap(mo1226k.f36485c * 2);
                        for (int i = 0; i < mo1226k.f36485c; i++) {
                            this.f33877e.put(abstractC11376e.mo1223w(), abstractC11376e.mo1223w());
                        }
                        abstractC11376e.mo1238l();
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 6:
                    if (mo1240i.f36479b == 11) {
                        this.f33878f = abstractC11376e.mo1223w();
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
    public boolean m3617a() {
        return this.f33873a != null;
    }

    /* renamed from: a */
    public boolean m3616a(C10781ah c10781ah) {
        if (c10781ah == null) {
            return false;
        }
        boolean m3617a = m3617a();
        boolean m3617a2 = c10781ah.m3617a();
        if ((m3617a || m3617a2) && (!m3617a || !m3617a2 || !this.f33873a.equals(c10781ah.f33873a))) {
            return false;
        }
        boolean m3615b = m3615b();
        boolean m3615b2 = c10781ah.m3615b();
        if ((m3615b || m3615b2) && (!m3615b || !m3615b2 || !this.f33874b.m3254a(c10781ah.f33874b))) {
            return false;
        }
        boolean m3613c = m3613c();
        boolean m3613c2 = c10781ah.m3613c();
        if ((m3613c || m3613c2) && (!m3613c || !m3613c2 || !this.f33875c.equals(c10781ah.f33875c))) {
            return false;
        }
        boolean m3612d = m3612d();
        boolean m3612d2 = c10781ah.m3612d();
        if ((m3612d || m3612d2) && (!m3612d || !m3612d2 || !this.f33876d.equals(c10781ah.f33876d))) {
            return false;
        }
        boolean m3611e = m3611e();
        boolean m3611e2 = c10781ah.m3611e();
        if ((m3611e || m3611e2) && (!m3611e || !m3611e2 || !this.f33877e.equals(c10781ah.f33877e))) {
            return false;
        }
        boolean m3610f = m3610f();
        boolean m3610f2 = c10781ah.m3610f();
        return (!m3610f && !m3610f2) || (m3610f && m3610f2 && this.f33878f.equals(c10781ah.f33878f));
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(C10781ah c10781ah) {
        int m1277a;
        int m1272a;
        int m1277a2;
        int m1277a3;
        int m1278a;
        int m1277a4;
        if (!getClass().equals(c10781ah.getClass())) {
            return getClass().getName().compareTo(c10781ah.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m3617a()).compareTo(Boolean.valueOf(c10781ah.m3617a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m3617a() && (m1277a4 = C11369b.m1277a(this.f33873a, c10781ah.f33873a)) != 0) {
            return m1277a4;
        }
        int compareTo2 = Boolean.valueOf(m3615b()).compareTo(Boolean.valueOf(c10781ah.m3615b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m3615b() && (m1278a = C11369b.m1278a(this.f33874b, c10781ah.f33874b)) != 0) {
            return m1278a;
        }
        int compareTo3 = Boolean.valueOf(m3613c()).compareTo(Boolean.valueOf(c10781ah.m3613c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (m3613c() && (m1277a3 = C11369b.m1277a(this.f33875c, c10781ah.f33875c)) != 0) {
            return m1277a3;
        }
        int compareTo4 = Boolean.valueOf(m3612d()).compareTo(Boolean.valueOf(c10781ah.m3612d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (m3612d() && (m1277a2 = C11369b.m1277a(this.f33876d, c10781ah.f33876d)) != 0) {
            return m1277a2;
        }
        int compareTo5 = Boolean.valueOf(m3611e()).compareTo(Boolean.valueOf(c10781ah.m3611e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (m3611e() && (m1272a = C11369b.m1272a(this.f33877e, c10781ah.f33877e)) != 0) {
            return m1272a;
        }
        int compareTo6 = Boolean.valueOf(m3610f()).compareTo(Boolean.valueOf(c10781ah.m3610f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (m3610f() && (m1277a = C11369b.m1277a(this.f33878f, c10781ah.f33878f)) != 0) {
            return m1277a;
        }
        return 0;
    }

    @Override // org.p286a.p321b.AbstractC11361a
    /* renamed from: b */
    public void mo1285b(AbstractC11376e abstractC11376e) {
        m3609g();
        abstractC11376e.mo1250a(f33866h);
        if (this.f33873a != null && m3617a()) {
            abstractC11376e.mo1254a(f33867i);
            abstractC11376e.mo1256a(this.f33873a);
            abstractC11376e.mo1247b();
        }
        if (this.f33874b != null && m3615b()) {
            abstractC11376e.mo1254a(f33868j);
            this.f33874b.mo1285b(abstractC11376e);
            abstractC11376e.mo1247b();
        }
        if (this.f33875c != null) {
            abstractC11376e.mo1254a(f33869k);
            abstractC11376e.mo1256a(this.f33875c);
            abstractC11376e.mo1247b();
        }
        if (this.f33876d != null) {
            abstractC11376e.mo1254a(f33870l);
            abstractC11376e.mo1256a(this.f33876d);
            abstractC11376e.mo1247b();
        }
        if (this.f33877e != null && m3611e()) {
            abstractC11376e.mo1254a(f33871m);
            abstractC11376e.mo1252a(new C11375d((byte) 11, (byte) 11, this.f33877e.size()));
            for (Map.Entry<String, String> entry : this.f33877e.entrySet()) {
                abstractC11376e.mo1256a(entry.getKey());
                abstractC11376e.mo1256a(entry.getValue());
            }
            abstractC11376e.mo1245d();
            abstractC11376e.mo1247b();
        }
        if (this.f33878f != null && m3610f()) {
            abstractC11376e.mo1254a(f33872n);
            abstractC11376e.mo1256a(this.f33878f);
            abstractC11376e.mo1247b();
        }
        abstractC11376e.mo1246c();
        abstractC11376e.mo1261a();
    }

    /* renamed from: b */
    public boolean m3615b() {
        return this.f33874b != null;
    }

    /* renamed from: c */
    public boolean m3613c() {
        return this.f33875c != null;
    }

    /* renamed from: d */
    public boolean m3612d() {
        return this.f33876d != null;
    }

    /* renamed from: e */
    public boolean m3611e() {
        return this.f33877e != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C10781ah)) {
            return m3616a((C10781ah) obj);
        }
        return false;
    }

    /* renamed from: f */
    public boolean m3610f() {
        return this.f33878f != null;
    }

    /* renamed from: g */
    public void m3609g() {
        if (this.f33875c == null) {
            throw new C11377f("Required field 'id' was not present! Struct: " + toString());
        }
        if (this.f33876d != null) {
            return;
        }
        throw new C11377f("Required field 'appId' was not present! Struct: " + toString());
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        boolean z = false;
        StringBuilder sb = new StringBuilder("XmPushActionSendFeedback(");
        boolean z2 = true;
        if (m3617a()) {
            sb.append("debug:");
            if (this.f33873a == null) {
                sb.append("null");
            } else {
                sb.append(this.f33873a);
            }
            z2 = false;
        }
        if (m3615b()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("target:");
            if (this.f33874b == null) {
                sb.append("null");
            } else {
                sb.append(this.f33874b);
            }
        } else {
            z = z2;
        }
        if (!z) {
            sb.append(", ");
        }
        sb.append("id:");
        if (this.f33875c == null) {
            sb.append("null");
        } else {
            sb.append(this.f33875c);
        }
        sb.append(", ");
        sb.append("appId:");
        if (this.f33876d == null) {
            sb.append("null");
        } else {
            sb.append(this.f33876d);
        }
        if (m3611e()) {
            sb.append(", ");
            sb.append("feedbacks:");
            if (this.f33877e == null) {
                sb.append("null");
            } else {
                sb.append(this.f33877e);
            }
        }
        if (m3610f()) {
            sb.append(", ");
            sb.append("category:");
            if (this.f33878f == null) {
                sb.append("null");
            } else {
                sb.append(this.f33878f);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
