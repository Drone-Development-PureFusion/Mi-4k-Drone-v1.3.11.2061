package com.xiaomi.xmpush.thrift;

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
/* renamed from: com.xiaomi.xmpush.thrift.u */
/* loaded from: classes2.dex */
public class C10831u implements Serializable, Cloneable, AbstractC11361a<C10831u, EnumC10832a> {

    /* renamed from: f */
    public static final Map<EnumC10832a, C11363b> f34535f;

    /* renamed from: g */
    private static final C11381j f34536g = new C11381j("Target");

    /* renamed from: h */
    private static final C11373b f34537h = new C11373b("channelId", (byte) 10, 1);

    /* renamed from: i */
    private static final C11373b f34538i = new C11373b("userId", (byte) 11, 2);

    /* renamed from: j */
    private static final C11373b f34539j = new C11373b("server", (byte) 11, 3);

    /* renamed from: k */
    private static final C11373b f34540k = new C11373b("resource", (byte) 11, 4);

    /* renamed from: l */
    private static final C11373b f34541l = new C11373b("isPreview", (byte) 2, 5);

    /* renamed from: b */
    public String f34543b;

    /* renamed from: m */
    private BitSet f34547m = new BitSet(2);

    /* renamed from: a */
    public long f34542a = 5;

    /* renamed from: c */
    public String f34544c = "xiaomi.com";

    /* renamed from: d */
    public String f34545d = "";

    /* renamed from: e */
    public boolean f34546e = false;

    /* renamed from: com.xiaomi.xmpush.thrift.u$a */
    /* loaded from: classes2.dex */
    public enum EnumC10832a {
        CHANNEL_ID(1, "channelId"),
        USER_ID(2, "userId"),
        SERVER(3, "server"),
        RESOURCE(4, "resource"),
        IS_PREVIEW(5, "isPreview");
        

        /* renamed from: f */
        private static final Map<String, EnumC10832a> f34553f = new HashMap();

        /* renamed from: g */
        private final short f34555g;

        /* renamed from: h */
        private final String f34556h;

        static {
            Iterator it2 = EnumSet.allOf(EnumC10832a.class).iterator();
            while (it2.hasNext()) {
                EnumC10832a enumC10832a = (EnumC10832a) it2.next();
                f34553f.put(enumC10832a.m3245a(), enumC10832a);
            }
        }

        EnumC10832a(short s, String str) {
            this.f34555g = s;
            this.f34556h = str;
        }

        /* renamed from: a */
        public String m3245a() {
            return this.f34556h;
        }
    }

    static {
        EnumMap enumMap = new EnumMap(EnumC10832a.class);
        enumMap.put((EnumMap) EnumC10832a.CHANNEL_ID, (EnumC10832a) new C11363b("channelId", (byte) 1, new C11364c((byte) 10)));
        enumMap.put((EnumMap) EnumC10832a.USER_ID, (EnumC10832a) new C11363b("userId", (byte) 1, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10832a.SERVER, (EnumC10832a) new C11363b("server", (byte) 2, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10832a.RESOURCE, (EnumC10832a) new C11363b("resource", (byte) 2, new C11364c((byte) 11)));
        enumMap.put((EnumMap) EnumC10832a.IS_PREVIEW, (EnumC10832a) new C11363b("isPreview", (byte) 2, new C11364c((byte) 2)));
        f34535f = Collections.unmodifiableMap(enumMap);
        C11363b.m1284a(C10831u.class, f34535f);
    }

    @Override // org.p286a.p321b.AbstractC11361a
    /* renamed from: a */
    public void mo1286a(AbstractC11376e abstractC11376e) {
        abstractC11376e.mo1242g();
        while (true) {
            C11373b mo1240i = abstractC11376e.mo1240i();
            if (mo1240i.f36479b == 0) {
                abstractC11376e.mo1241h();
                if (!m3255a()) {
                    throw new C11377f("Required field 'channelId' was not found in serialized data! Struct: " + toString());
                }
                m3246f();
                return;
            }
            switch (mo1240i.f36480c) {
                case 1:
                    if (mo1240i.f36479b != 10) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f34542a = abstractC11376e.mo1231u();
                        m3253a(true);
                        break;
                    }
                case 2:
                    if (mo1240i.f36479b != 11) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f34543b = abstractC11376e.mo1223w();
                        break;
                    }
                case 3:
                    if (mo1240i.f36479b != 11) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f34544c = abstractC11376e.mo1223w();
                        break;
                    }
                case 4:
                    if (mo1240i.f36479b != 11) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f34545d = abstractC11376e.mo1223w();
                        break;
                    }
                case 5:
                    if (mo1240i.f36479b != 2) {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    } else {
                        this.f34546e = abstractC11376e.mo1235q();
                        m3250b(true);
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
    public void m3253a(boolean z) {
        this.f34547m.set(0, z);
    }

    /* renamed from: a */
    public boolean m3255a() {
        return this.f34547m.get(0);
    }

    /* renamed from: a */
    public boolean m3254a(C10831u c10831u) {
        if (c10831u != null && this.f34542a == c10831u.f34542a) {
            boolean m3252b = m3252b();
            boolean m3252b2 = c10831u.m3252b();
            if ((m3252b || m3252b2) && (!m3252b || !m3252b2 || !this.f34543b.equals(c10831u.f34543b))) {
                return false;
            }
            boolean m3249c = m3249c();
            boolean m3249c2 = c10831u.m3249c();
            if ((m3249c || m3249c2) && (!m3249c || !m3249c2 || !this.f34544c.equals(c10831u.f34544c))) {
                return false;
            }
            boolean m3248d = m3248d();
            boolean m3248d2 = c10831u.m3248d();
            if ((m3248d || m3248d2) && (!m3248d || !m3248d2 || !this.f34545d.equals(c10831u.f34545d))) {
                return false;
            }
            boolean m3247e = m3247e();
            boolean m3247e2 = c10831u.m3247e();
            return (!m3247e && !m3247e2) || (m3247e && m3247e2 && this.f34546e == c10831u.f34546e);
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(C10831u c10831u) {
        int m1269a;
        int m1277a;
        int m1277a2;
        int m1277a3;
        int m1279a;
        if (!getClass().equals(c10831u.getClass())) {
            return getClass().getName().compareTo(c10831u.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m3255a()).compareTo(Boolean.valueOf(c10831u.m3255a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m3255a() && (m1279a = C11369b.m1279a(this.f34542a, c10831u.f34542a)) != 0) {
            return m1279a;
        }
        int compareTo2 = Boolean.valueOf(m3252b()).compareTo(Boolean.valueOf(c10831u.m3252b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m3252b() && (m1277a3 = C11369b.m1277a(this.f34543b, c10831u.f34543b)) != 0) {
            return m1277a3;
        }
        int compareTo3 = Boolean.valueOf(m3249c()).compareTo(Boolean.valueOf(c10831u.m3249c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (m3249c() && (m1277a2 = C11369b.m1277a(this.f34544c, c10831u.f34544c)) != 0) {
            return m1277a2;
        }
        int compareTo4 = Boolean.valueOf(m3248d()).compareTo(Boolean.valueOf(c10831u.m3248d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (m3248d() && (m1277a = C11369b.m1277a(this.f34545d, c10831u.f34545d)) != 0) {
            return m1277a;
        }
        int compareTo5 = Boolean.valueOf(m3247e()).compareTo(Boolean.valueOf(c10831u.m3247e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (m3247e() && (m1269a = C11369b.m1269a(this.f34546e, c10831u.f34546e)) != 0) {
            return m1269a;
        }
        return 0;
    }

    @Override // org.p286a.p321b.AbstractC11361a
    /* renamed from: b */
    public void mo1285b(AbstractC11376e abstractC11376e) {
        m3246f();
        abstractC11376e.mo1250a(f34536g);
        abstractC11376e.mo1254a(f34537h);
        abstractC11376e.mo1257a(this.f34542a);
        abstractC11376e.mo1247b();
        if (this.f34543b != null) {
            abstractC11376e.mo1254a(f34538i);
            abstractC11376e.mo1256a(this.f34543b);
            abstractC11376e.mo1247b();
        }
        if (this.f34544c != null && m3249c()) {
            abstractC11376e.mo1254a(f34539j);
            abstractC11376e.mo1256a(this.f34544c);
            abstractC11376e.mo1247b();
        }
        if (this.f34545d != null && m3248d()) {
            abstractC11376e.mo1254a(f34540k);
            abstractC11376e.mo1256a(this.f34545d);
            abstractC11376e.mo1247b();
        }
        if (m3247e()) {
            abstractC11376e.mo1254a(f34541l);
            abstractC11376e.mo1248a(this.f34546e);
            abstractC11376e.mo1247b();
        }
        abstractC11376e.mo1246c();
        abstractC11376e.mo1261a();
    }

    /* renamed from: b */
    public void m3250b(boolean z) {
        this.f34547m.set(1, z);
    }

    /* renamed from: b */
    public boolean m3252b() {
        return this.f34543b != null;
    }

    /* renamed from: c */
    public boolean m3249c() {
        return this.f34544c != null;
    }

    /* renamed from: d */
    public boolean m3248d() {
        return this.f34545d != null;
    }

    /* renamed from: e */
    public boolean m3247e() {
        return this.f34547m.get(1);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C10831u)) {
            return m3254a((C10831u) obj);
        }
        return false;
    }

    /* renamed from: f */
    public void m3246f() {
        if (this.f34543b == null) {
            throw new C11377f("Required field 'userId' was not present! Struct: " + toString());
        }
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Target(");
        sb.append("channelId:");
        sb.append(this.f34542a);
        sb.append(", ");
        sb.append("userId:");
        if (this.f34543b == null) {
            sb.append("null");
        } else {
            sb.append(this.f34543b);
        }
        if (m3249c()) {
            sb.append(", ");
            sb.append("server:");
            if (this.f34544c == null) {
                sb.append("null");
            } else {
                sb.append(this.f34544c);
            }
        }
        if (m3248d()) {
            sb.append(", ");
            sb.append("resource:");
            if (this.f34545d == null) {
                sb.append("null");
            } else {
                sb.append(this.f34545d);
            }
        }
        if (m3247e()) {
            sb.append(", ");
            sb.append("isPreview:");
            sb.append(this.f34546e);
        }
        sb.append(")");
        return sb.toString();
    }
}
