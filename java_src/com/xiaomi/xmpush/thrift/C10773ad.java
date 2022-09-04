package com.xiaomi.xmpush.thrift;

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
/* renamed from: com.xiaomi.xmpush.thrift.ad */
/* loaded from: classes2.dex */
public class C10773ad implements Serializable, Cloneable, AbstractC11361a<C10773ad, EnumC10774a> {

    /* renamed from: d */
    public static final Map<EnumC10774a, C11363b> f33696d;

    /* renamed from: e */
    private static final C11381j f33697e = new C11381j("XmPushActionNormalConfig");

    /* renamed from: f */
    private static final C11373b f33698f = new C11373b("normalConfigs", (byte) 15, 1);

    /* renamed from: g */
    private static final C11373b f33699g = new C11373b("appId", (byte) 10, 4);

    /* renamed from: h */
    private static final C11373b f33700h = new C11373b(C10445j.f32447W, (byte) 11, 5);

    /* renamed from: a */
    public List<C10819n> f33701a;

    /* renamed from: b */
    public long f33702b;

    /* renamed from: c */
    public String f33703c;

    /* renamed from: i */
    private BitSet f33704i = new BitSet(1);

    /* renamed from: com.xiaomi.xmpush.thrift.ad$a */
    /* loaded from: classes2.dex */
    public enum EnumC10774a {
        NORMAL_CONFIGS(1, "normalConfigs"),
        APP_ID(4, "appId"),
        PACKAGE_NAME(5, C10445j.f32447W);
        

        /* renamed from: d */
        private static final Map<String, EnumC10774a> f33708d = new HashMap();

        /* renamed from: e */
        private final short f33710e;

        /* renamed from: f */
        private final String f33711f;

        static {
            Iterator it2 = EnumSet.allOf(EnumC10774a.class).iterator();
            while (it2.hasNext()) {
                EnumC10774a enumC10774a = (EnumC10774a) it2.next();
                f33708d.put(enumC10774a.m3709a(), enumC10774a);
            }
        }

        EnumC10774a(short s, String str) {
            this.f33710e = s;
            this.f33711f = str;
        }

        /* renamed from: a */
        public String m3709a() {
            return this.f33711f;
        }
    }

    static {
        EnumMap enumMap = new EnumMap(EnumC10774a.class);
        enumMap.put((EnumMap) EnumC10774a.NORMAL_CONFIGS, (EnumC10774a) new C11363b("normalConfigs", (byte) 1, new C11365d((byte) 15, new C11368g((byte) 12, C10819n.class))));
        enumMap.put((EnumMap) EnumC10774a.APP_ID, (EnumC10774a) new C11363b("appId", (byte) 2, new C11364c((byte) 10)));
        enumMap.put((EnumMap) EnumC10774a.PACKAGE_NAME, (EnumC10774a) new C11363b(C10445j.f32447W, (byte) 2, new C11364c((byte) 11)));
        f33696d = Collections.unmodifiableMap(enumMap);
        C11363b.m1284a(C10773ad.class, f33696d);
    }

    /* renamed from: a */
    public List<C10819n> m3717a() {
        return this.f33701a;
    }

    @Override // org.p286a.p321b.AbstractC11361a
    /* renamed from: a */
    public void mo1286a(AbstractC11376e abstractC11376e) {
        abstractC11376e.mo1242g();
        while (true) {
            C11373b mo1240i = abstractC11376e.mo1240i();
            if (mo1240i.f36479b == 0) {
                abstractC11376e.mo1241h();
                m3710e();
                return;
            }
            switch (mo1240i.f36480c) {
                case 1:
                    if (mo1240i.f36479b == 15) {
                        C11374c mo1225m = abstractC11376e.mo1225m();
                        this.f33701a = new ArrayList(mo1225m.f36482b);
                        for (int i = 0; i < mo1225m.f36482b; i++) {
                            C10819n c10819n = new C10819n();
                            c10819n.mo1286a(abstractC11376e);
                            this.f33701a.add(c10819n);
                        }
                        abstractC11376e.mo1237n();
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 2:
                case 3:
                default:
                    C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                    break;
                case 4:
                    if (mo1240i.f36479b == 10) {
                        this.f33702b = abstractC11376e.mo1231u();
                        m3715a(true);
                        break;
                    } else {
                        C11379h.m1228a(abstractC11376e, mo1240i.f36479b);
                        break;
                    }
                case 5:
                    if (mo1240i.f36479b == 11) {
                        this.f33703c = abstractC11376e.mo1223w();
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
    public void m3715a(boolean z) {
        this.f33704i.set(0, z);
    }

    /* renamed from: a */
    public boolean m3716a(C10773ad c10773ad) {
        if (c10773ad == null) {
            return false;
        }
        boolean m3714b = m3714b();
        boolean m3714b2 = c10773ad.m3714b();
        if ((m3714b || m3714b2) && (!m3714b || !m3714b2 || !this.f33701a.equals(c10773ad.f33701a))) {
            return false;
        }
        boolean m3712c = m3712c();
        boolean m3712c2 = c10773ad.m3712c();
        if ((m3712c || m3712c2) && (!m3712c || !m3712c2 || this.f33702b != c10773ad.f33702b)) {
            return false;
        }
        boolean m3711d = m3711d();
        boolean m3711d2 = c10773ad.m3711d();
        return (!m3711d && !m3711d2) || (m3711d && m3711d2 && this.f33703c.equals(c10773ad.f33703c));
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(C10773ad c10773ad) {
        int m1277a;
        int m1279a;
        int m1273a;
        if (!getClass().equals(c10773ad.getClass())) {
            return getClass().getName().compareTo(c10773ad.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m3714b()).compareTo(Boolean.valueOf(c10773ad.m3714b()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m3714b() && (m1273a = C11369b.m1273a(this.f33701a, c10773ad.f33701a)) != 0) {
            return m1273a;
        }
        int compareTo2 = Boolean.valueOf(m3712c()).compareTo(Boolean.valueOf(c10773ad.m3712c()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m3712c() && (m1279a = C11369b.m1279a(this.f33702b, c10773ad.f33702b)) != 0) {
            return m1279a;
        }
        int compareTo3 = Boolean.valueOf(m3711d()).compareTo(Boolean.valueOf(c10773ad.m3711d()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (m3711d() && (m1277a = C11369b.m1277a(this.f33703c, c10773ad.f33703c)) != 0) {
            return m1277a;
        }
        return 0;
    }

    @Override // org.p286a.p321b.AbstractC11361a
    /* renamed from: b */
    public void mo1285b(AbstractC11376e abstractC11376e) {
        m3710e();
        abstractC11376e.mo1250a(f33697e);
        if (this.f33701a != null) {
            abstractC11376e.mo1254a(f33698f);
            abstractC11376e.mo1253a(new C11374c((byte) 12, this.f33701a.size()));
            for (C10819n c10819n : this.f33701a) {
                c10819n.mo1285b(abstractC11376e);
            }
            abstractC11376e.mo1244e();
            abstractC11376e.mo1247b();
        }
        if (m3712c()) {
            abstractC11376e.mo1254a(f33699g);
            abstractC11376e.mo1257a(this.f33702b);
            abstractC11376e.mo1247b();
        }
        if (this.f33703c != null && m3711d()) {
            abstractC11376e.mo1254a(f33700h);
            abstractC11376e.mo1256a(this.f33703c);
            abstractC11376e.mo1247b();
        }
        abstractC11376e.mo1246c();
        abstractC11376e.mo1261a();
    }

    /* renamed from: b */
    public boolean m3714b() {
        return this.f33701a != null;
    }

    /* renamed from: c */
    public boolean m3712c() {
        return this.f33704i.get(0);
    }

    /* renamed from: d */
    public boolean m3711d() {
        return this.f33703c != null;
    }

    /* renamed from: e */
    public void m3710e() {
        if (this.f33701a == null) {
            throw new C11377f("Required field 'normalConfigs' was not present! Struct: " + toString());
        }
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C10773ad)) {
            return m3716a((C10773ad) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("XmPushActionNormalConfig(");
        sb.append("normalConfigs:");
        if (this.f33701a == null) {
            sb.append("null");
        } else {
            sb.append(this.f33701a);
        }
        if (m3712c()) {
            sb.append(", ");
            sb.append("appId:");
            sb.append(this.f33702b);
        }
        if (m3711d()) {
            sb.append(", ");
            sb.append("packageName:");
            if (this.f33703c == null) {
                sb.append("null");
            } else {
                sb.append(this.f33703c);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
