package com.xiaomi.xmpush.thrift;

import java.io.Serializable;
import java.util.ArrayList;
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
import org.p286a.p321b.p322a.C11365d;
import org.p286a.p321b.p322a.C11368g;
import org.p286a.p321b.p323b.AbstractC11376e;
import org.p286a.p321b.p323b.C11373b;
import org.p286a.p321b.p323b.C11374c;
import org.p286a.p321b.p323b.C11377f;
import org.p286a.p321b.p323b.C11379h;
import org.p286a.p321b.p323b.C11381j;
/* renamed from: com.xiaomi.xmpush.thrift.c */
/* loaded from: classes2.dex */
public class C10802c implements Serializable, Cloneable, AbstractC11361a<C10802c, EnumC10803a> {

    /* renamed from: b */
    public static final Map<EnumC10803a, C11363b> f34171b;

    /* renamed from: c */
    private static final C11381j f34172c = new C11381j("ClientUploadData");

    /* renamed from: d */
    private static final C11373b f34173d = new C11373b("uploadDataItems", (byte) 15, 1);

    /* renamed from: a */
    public List<C10804d> f34174a;

    /* renamed from: com.xiaomi.xmpush.thrift.c$a */
    /* loaded from: classes2.dex */
    public enum EnumC10803a {
        UPLOAD_DATA_ITEMS(1, "uploadDataItems");
        

        /* renamed from: b */
        private static final Map<String, EnumC10803a> f34176b = new HashMap();

        /* renamed from: c */
        private final short f34178c;

        /* renamed from: d */
        private final String f34179d;

        static {
            Iterator it2 = EnumSet.allOf(EnumC10803a.class).iterator();
            while (it2.hasNext()) {
                EnumC10803a enumC10803a = (EnumC10803a) it2.next();
                f34176b.put(enumC10803a.m3452a(), enumC10803a);
            }
        }

        EnumC10803a(short s, String str) {
            this.f34178c = s;
            this.f34179d = str;
        }

        /* renamed from: a */
        public String m3452a() {
            return this.f34179d;
        }
    }

    static {
        EnumMap enumMap = new EnumMap(EnumC10803a.class);
        enumMap.put((EnumMap) EnumC10803a.UPLOAD_DATA_ITEMS, (EnumC10803a) new C11363b("uploadDataItems", (byte) 1, new C11365d((byte) 15, new C11368g((byte) 12, C10804d.class))));
        f34171b = Collections.unmodifiableMap(enumMap);
        C11363b.m1284a(C10802c.class, f34171b);
    }

    /* renamed from: a */
    public int m3458a() {
        if (this.f34174a == null) {
            return 0;
        }
        return this.f34174a.size();
    }

    /* renamed from: a */
    public void m3456a(C10804d c10804d) {
        if (this.f34174a == null) {
            this.f34174a = new ArrayList();
        }
        this.f34174a.add(c10804d);
    }

    @Override // org.p286a.p321b.AbstractC11361a
    /* renamed from: a */
    public void mo1286a(AbstractC11376e abstractC11376e) {
        abstractC11376e.mo1242g();
        while (true) {
            C11373b mo1240i = abstractC11376e.mo1240i();
            if (mo1240i.f36479b == 0) {
                abstractC11376e.mo1241h();
                m3453c();
                return;
            }
            switch (mo1240i.f36480c) {
                case 1:
                    if (mo1240i.f36479b == 15) {
                        C11374c mo1225m = abstractC11376e.mo1225m();
                        this.f34174a = new ArrayList(mo1225m.f36482b);
                        for (int i = 0; i < mo1225m.f36482b; i++) {
                            C10804d c10804d = new C10804d();
                            c10804d.mo1286a(abstractC11376e);
                            this.f34174a.add(c10804d);
                        }
                        abstractC11376e.mo1237n();
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
    public boolean m3457a(C10802c c10802c) {
        if (c10802c == null) {
            return false;
        }
        boolean m3455b = m3455b();
        boolean m3455b2 = c10802c.m3455b();
        return (!m3455b && !m3455b2) || (m3455b && m3455b2 && this.f34174a.equals(c10802c.f34174a));
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(C10802c c10802c) {
        int m1273a;
        if (!getClass().equals(c10802c.getClass())) {
            return getClass().getName().compareTo(c10802c.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m3455b()).compareTo(Boolean.valueOf(c10802c.m3455b()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m3455b() && (m1273a = C11369b.m1273a(this.f34174a, c10802c.f34174a)) != 0) {
            return m1273a;
        }
        return 0;
    }

    @Override // org.p286a.p321b.AbstractC11361a
    /* renamed from: b */
    public void mo1285b(AbstractC11376e abstractC11376e) {
        m3453c();
        abstractC11376e.mo1250a(f34172c);
        if (this.f34174a != null) {
            abstractC11376e.mo1254a(f34173d);
            abstractC11376e.mo1253a(new C11374c((byte) 12, this.f34174a.size()));
            for (C10804d c10804d : this.f34174a) {
                c10804d.mo1285b(abstractC11376e);
            }
            abstractC11376e.mo1244e();
            abstractC11376e.mo1247b();
        }
        abstractC11376e.mo1246c();
        abstractC11376e.mo1261a();
    }

    /* renamed from: b */
    public boolean m3455b() {
        return this.f34174a != null;
    }

    /* renamed from: c */
    public void m3453c() {
        if (this.f34174a == null) {
            throw new C11377f("Required field 'uploadDataItems' was not present! Struct: " + toString());
        }
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C10802c)) {
            return m3457a((C10802c) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ClientUploadData(");
        sb.append("uploadDataItems:");
        if (this.f34174a == null) {
            sb.append("null");
        } else {
            sb.append(this.f34174a);
        }
        sb.append(")");
        return sb.toString();
    }
}
