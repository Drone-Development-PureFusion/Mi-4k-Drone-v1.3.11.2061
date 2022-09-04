package com.google.android.gms.internal;

import com.google.android.gms.internal.AbstractC7030gi;
import com.google.android.gms.internal.AbstractC7090hj;
import com.google.android.gms.tagmanager.C9065aw;
import com.google.android.gms.tagmanager.C9147cw;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* renamed from: com.google.android.gms.internal.en */
/* loaded from: classes2.dex */
public class C6899en {

    /* renamed from: com.google.android.gms.internal.en$a */
    /* loaded from: classes2.dex */
    public static class C6901a {

        /* renamed from: a */
        private final Map<String, AbstractC7090hj.C7091a> f23273a;

        /* renamed from: b */
        private final AbstractC7090hj.C7091a f23274b;

        private C6901a(Map<String, AbstractC7090hj.C7091a> map, AbstractC7090hj.C7091a c7091a) {
            this.f23273a = map;
            this.f23274b = c7091a;
        }

        /* renamed from: a */
        public static C6902b m16005a() {
            return new C6902b();
        }

        /* renamed from: a */
        public void m16004a(String str, AbstractC7090hj.C7091a c7091a) {
            this.f23273a.put(str, c7091a);
        }

        /* renamed from: b */
        public Map<String, AbstractC7090hj.C7091a> m16003b() {
            return Collections.unmodifiableMap(this.f23273a);
        }

        /* renamed from: c */
        public AbstractC7090hj.C7091a m16002c() {
            return this.f23274b;
        }

        public String toString() {
            String valueOf = String.valueOf(m16003b());
            String valueOf2 = String.valueOf(this.f23274b);
            return new StringBuilder(String.valueOf(valueOf).length() + 32 + String.valueOf(valueOf2).length()).append("Properties: ").append(valueOf).append(" pushAfterEvaluate: ").append(valueOf2).toString();
        }
    }

    /* renamed from: com.google.android.gms.internal.en$b */
    /* loaded from: classes2.dex */
    public static class C6902b {

        /* renamed from: a */
        private final Map<String, AbstractC7090hj.C7091a> f23275a;

        /* renamed from: b */
        private AbstractC7090hj.C7091a f23276b;

        private C6902b() {
            this.f23275a = new HashMap();
        }

        /* renamed from: a */
        public C6901a m16001a() {
            return new C6901a(this.f23275a, this.f23276b);
        }

        /* renamed from: a */
        public C6902b m16000a(AbstractC7090hj.C7091a c7091a) {
            this.f23276b = c7091a;
            return this;
        }

        /* renamed from: a */
        public C6902b m15999a(String str, AbstractC7090hj.C7091a c7091a) {
            this.f23275a.put(str, c7091a);
            return this;
        }
    }

    /* renamed from: com.google.android.gms.internal.en$c */
    /* loaded from: classes2.dex */
    public static class C6903c {

        /* renamed from: a */
        private final List<C6905e> f23277a;

        /* renamed from: b */
        private final Map<String, List<C6901a>> f23278b;

        /* renamed from: c */
        private final String f23279c;

        /* renamed from: d */
        private final int f23280d;

        private C6903c(List<C6905e> list, Map<String, List<C6901a>> map, String str, int i) {
            this.f23277a = Collections.unmodifiableList(list);
            this.f23278b = Collections.unmodifiableMap(map);
            this.f23279c = str;
            this.f23280d = i;
        }

        /* renamed from: a */
        public static C6904d m15998a() {
            return new C6904d();
        }

        /* renamed from: b */
        public List<C6905e> m15997b() {
            return this.f23277a;
        }

        /* renamed from: c */
        public String m15996c() {
            return this.f23279c;
        }

        /* renamed from: d */
        public Map<String, List<C6901a>> m15995d() {
            return this.f23278b;
        }

        public String toString() {
            String valueOf = String.valueOf(m15997b());
            String valueOf2 = String.valueOf(this.f23278b);
            return new StringBuilder(String.valueOf(valueOf).length() + 17 + String.valueOf(valueOf2).length()).append("Rules: ").append(valueOf).append("  Macros: ").append(valueOf2).toString();
        }
    }

    /* renamed from: com.google.android.gms.internal.en$d */
    /* loaded from: classes2.dex */
    public static class C6904d {

        /* renamed from: a */
        private final List<C6905e> f23281a;

        /* renamed from: b */
        private final Map<String, List<C6901a>> f23282b;

        /* renamed from: c */
        private String f23283c;

        /* renamed from: d */
        private int f23284d;

        private C6904d() {
            this.f23281a = new ArrayList();
            this.f23282b = new HashMap();
            this.f23283c = "";
            this.f23284d = 0;
        }

        /* renamed from: a */
        public C6903c m15994a() {
            return new C6903c(this.f23281a, this.f23282b, this.f23283c, this.f23284d);
        }

        /* renamed from: a */
        public C6904d m15993a(int i) {
            this.f23284d = i;
            return this;
        }

        /* renamed from: a */
        public C6904d m15992a(C6901a c6901a) {
            String m9132a = C9147cw.m9132a(c6901a.m16003b().get(EnumC6958fh.INSTANCE_NAME.toString()));
            List<C6901a> list = this.f23282b.get(m9132a);
            if (list == null) {
                list = new ArrayList<>();
                this.f23282b.put(m9132a, list);
            }
            list.add(c6901a);
            return this;
        }

        /* renamed from: a */
        public C6904d m15991a(C6905e c6905e) {
            this.f23281a.add(c6905e);
            return this;
        }

        /* renamed from: a */
        public C6904d m15990a(String str) {
            this.f23283c = str;
            return this;
        }
    }

    /* renamed from: com.google.android.gms.internal.en$e */
    /* loaded from: classes2.dex */
    public static class C6905e {

        /* renamed from: a */
        private final List<C6901a> f23285a;

        /* renamed from: b */
        private final List<C6901a> f23286b;

        /* renamed from: c */
        private final List<C6901a> f23287c;

        /* renamed from: d */
        private final List<C6901a> f23288d;

        /* renamed from: e */
        private final List<C6901a> f23289e;

        /* renamed from: f */
        private final List<C6901a> f23290f;

        /* renamed from: g */
        private final List<String> f23291g;

        /* renamed from: h */
        private final List<String> f23292h;

        /* renamed from: i */
        private final List<String> f23293i;

        /* renamed from: j */
        private final List<String> f23294j;

        private C6905e(List<C6901a> list, List<C6901a> list2, List<C6901a> list3, List<C6901a> list4, List<C6901a> list5, List<C6901a> list6, List<String> list7, List<String> list8, List<String> list9, List<String> list10) {
            this.f23285a = Collections.unmodifiableList(list);
            this.f23286b = Collections.unmodifiableList(list2);
            this.f23287c = Collections.unmodifiableList(list3);
            this.f23288d = Collections.unmodifiableList(list4);
            this.f23289e = Collections.unmodifiableList(list5);
            this.f23290f = Collections.unmodifiableList(list6);
            this.f23291g = Collections.unmodifiableList(list7);
            this.f23292h = Collections.unmodifiableList(list8);
            this.f23293i = Collections.unmodifiableList(list9);
            this.f23294j = Collections.unmodifiableList(list10);
        }

        /* renamed from: a */
        public static C6906f m15989a() {
            return new C6906f();
        }

        /* renamed from: b */
        public List<C6901a> m15988b() {
            return this.f23285a;
        }

        /* renamed from: c */
        public List<C6901a> m15987c() {
            return this.f23286b;
        }

        /* renamed from: d */
        public List<C6901a> m15986d() {
            return this.f23287c;
        }

        /* renamed from: e */
        public List<C6901a> m15985e() {
            return this.f23288d;
        }

        /* renamed from: f */
        public List<C6901a> m15984f() {
            return this.f23289e;
        }

        /* renamed from: g */
        public List<String> m15983g() {
            return this.f23291g;
        }

        /* renamed from: h */
        public List<String> m15982h() {
            return this.f23292h;
        }

        /* renamed from: i */
        public List<String> m15981i() {
            return this.f23293i;
        }

        /* renamed from: j */
        public List<String> m15980j() {
            return this.f23294j;
        }

        /* renamed from: k */
        public List<C6901a> m15979k() {
            return this.f23290f;
        }

        public String toString() {
            String valueOf = String.valueOf(m15988b());
            String valueOf2 = String.valueOf(m15987c());
            String valueOf3 = String.valueOf(m15986d());
            String valueOf4 = String.valueOf(m15985e());
            String valueOf5 = String.valueOf(m15984f());
            String valueOf6 = String.valueOf(m15979k());
            return new StringBuilder(String.valueOf(valueOf).length() + 102 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length() + String.valueOf(valueOf6).length()).append("Positive predicates: ").append(valueOf).append("  Negative predicates: ").append(valueOf2).append("  Add tags: ").append(valueOf3).append("  Remove tags: ").append(valueOf4).append("  Add macros: ").append(valueOf5).append("  Remove macros: ").append(valueOf6).toString();
        }
    }

    /* renamed from: com.google.android.gms.internal.en$f */
    /* loaded from: classes2.dex */
    public static class C6906f {

        /* renamed from: a */
        private final List<C6901a> f23295a;

        /* renamed from: b */
        private final List<C6901a> f23296b;

        /* renamed from: c */
        private final List<C6901a> f23297c;

        /* renamed from: d */
        private final List<C6901a> f23298d;

        /* renamed from: e */
        private final List<C6901a> f23299e;

        /* renamed from: f */
        private final List<C6901a> f23300f;

        /* renamed from: g */
        private final List<String> f23301g;

        /* renamed from: h */
        private final List<String> f23302h;

        /* renamed from: i */
        private final List<String> f23303i;

        /* renamed from: j */
        private final List<String> f23304j;

        private C6906f() {
            this.f23295a = new ArrayList();
            this.f23296b = new ArrayList();
            this.f23297c = new ArrayList();
            this.f23298d = new ArrayList();
            this.f23299e = new ArrayList();
            this.f23300f = new ArrayList();
            this.f23301g = new ArrayList();
            this.f23302h = new ArrayList();
            this.f23303i = new ArrayList();
            this.f23304j = new ArrayList();
        }

        /* renamed from: a */
        public C6905e m15978a() {
            return new C6905e(this.f23295a, this.f23296b, this.f23297c, this.f23298d, this.f23299e, this.f23300f, this.f23301g, this.f23302h, this.f23303i, this.f23304j);
        }

        /* renamed from: a */
        public C6906f m15977a(C6901a c6901a) {
            this.f23295a.add(c6901a);
            return this;
        }

        /* renamed from: a */
        public C6906f m15976a(String str) {
            this.f23303i.add(str);
            return this;
        }

        /* renamed from: b */
        public C6906f m15975b(C6901a c6901a) {
            this.f23296b.add(c6901a);
            return this;
        }

        /* renamed from: b */
        public C6906f m15974b(String str) {
            this.f23304j.add(str);
            return this;
        }

        /* renamed from: c */
        public C6906f m15973c(C6901a c6901a) {
            this.f23297c.add(c6901a);
            return this;
        }

        /* renamed from: c */
        public C6906f m15972c(String str) {
            this.f23301g.add(str);
            return this;
        }

        /* renamed from: d */
        public C6906f m15971d(C6901a c6901a) {
            this.f23298d.add(c6901a);
            return this;
        }

        /* renamed from: d */
        public C6906f m15970d(String str) {
            this.f23302h.add(str);
            return this;
        }

        /* renamed from: e */
        public C6906f m15969e(C6901a c6901a) {
            this.f23299e.add(c6901a);
            return this;
        }

        /* renamed from: f */
        public C6906f m15968f(C6901a c6901a) {
            this.f23300f.add(c6901a);
            return this;
        }
    }

    /* renamed from: com.google.android.gms.internal.en$g */
    /* loaded from: classes2.dex */
    public static class C6907g extends Exception {
        public C6907g(String str) {
            super(str);
        }
    }

    /* renamed from: a */
    private static C6901a m16013a(AbstractC7030gi.C7032b c7032b, AbstractC7030gi.C7036f c7036f, AbstractC7090hj.C7091a[] c7091aArr, int i) {
        C6902b m16005a = C6901a.m16005a();
        for (int i2 : c7032b.f23724a) {
            AbstractC7030gi.C7035e c7035e = (AbstractC7030gi.C7035e) m16007a(c7036f.f23744d, Integer.valueOf(i2).intValue(), "properties");
            String str = (String) m16007a(c7036f.f23742b, c7035e.f23739a, "keys");
            AbstractC7090hj.C7091a c7091a = (AbstractC7090hj.C7091a) m16007a(c7091aArr, c7035e.f23740b, "values");
            if (EnumC6958fh.PUSH_AFTER_EVALUATE.toString().equals(str)) {
                m16005a.m16000a(c7091a);
            } else {
                m16005a.m15999a(str, c7091a);
            }
        }
        return m16005a.m16001a();
    }

    /* renamed from: a */
    public static C6903c m16012a(AbstractC7030gi.C7036f c7036f) {
        AbstractC7090hj.C7091a[] c7091aArr = new AbstractC7090hj.C7091a[c7036f.f23743c.length];
        for (int i = 0; i < c7036f.f23743c.length; i++) {
            m16014a(i, c7036f, c7091aArr, new HashSet(0));
        }
        C6904d m15998a = C6903c.m15998a();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < c7036f.f23746f.length; i2++) {
            arrayList.add(m16013a(c7036f.f23746f[i2], c7036f, c7091aArr, i2));
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i3 = 0; i3 < c7036f.f23747g.length; i3++) {
            arrayList2.add(m16013a(c7036f.f23747g[i3], c7036f, c7091aArr, i3));
        }
        ArrayList arrayList3 = new ArrayList();
        for (int i4 = 0; i4 < c7036f.f23745e.length; i4++) {
            C6901a m16013a = m16013a(c7036f.f23745e[i4], c7036f, c7091aArr, i4);
            m15998a.m15992a(m16013a);
            arrayList3.add(m16013a);
        }
        for (AbstractC7030gi.C7037g c7037g : c7036f.f23748h) {
            m15998a.m15991a(m16011a(c7037g, arrayList, arrayList3, arrayList2, c7036f));
        }
        m15998a.m15990a(c7036f.f23752l);
        m15998a.m15993a(c7036f.f23757q);
        return m15998a.m15994a();
    }

    /* renamed from: a */
    private static C6905e m16011a(AbstractC7030gi.C7037g c7037g, List<C6901a> list, List<C6901a> list2, List<C6901a> list3, AbstractC7030gi.C7036f c7036f) {
        C6906f m15989a = C6905e.m15989a();
        for (int i : c7037g.f23759a) {
            m15989a.m15977a(list3.get(Integer.valueOf(i).intValue()));
        }
        for (int i2 : c7037g.f23760b) {
            m15989a.m15975b(list3.get(Integer.valueOf(i2).intValue()));
        }
        for (int i3 : c7037g.f23761c) {
            m15989a.m15973c(list.get(Integer.valueOf(i3).intValue()));
        }
        for (int i4 : c7037g.f23763e) {
            m15989a.m15976a(c7036f.f23743c[Integer.valueOf(i4).intValue()].f23882b);
        }
        for (int i5 : c7037g.f23762d) {
            m15989a.m15971d(list.get(Integer.valueOf(i5).intValue()));
        }
        for (int i6 : c7037g.f23764f) {
            m15989a.m15974b(c7036f.f23743c[Integer.valueOf(i6).intValue()].f23882b);
        }
        for (int i7 : c7037g.f23765g) {
            m15989a.m15969e(list2.get(Integer.valueOf(i7).intValue()));
        }
        for (int i8 : c7037g.f23767i) {
            m15989a.m15972c(c7036f.f23743c[Integer.valueOf(i8).intValue()].f23882b);
        }
        for (int i9 : c7037g.f23766h) {
            m15989a.m15968f(list2.get(Integer.valueOf(i9).intValue()));
        }
        for (int i10 : c7037g.f23768j) {
            m15989a.m15970d(c7036f.f23743c[Integer.valueOf(i10).intValue()].f23882b);
        }
        return m15989a.m15978a();
    }

    /* renamed from: a */
    private static AbstractC7090hj.C7091a m16014a(int i, AbstractC7030gi.C7036f c7036f, AbstractC7090hj.C7091a[] c7091aArr, Set<Integer> set) {
        int i2 = 0;
        if (set.contains(Integer.valueOf(i))) {
            String valueOf = String.valueOf(set);
            m16008a(new StringBuilder(String.valueOf(valueOf).length() + 90).append("Value cycle detected.  Current value reference: ").append(i).append(".  Previous value references: ").append(valueOf).append(".").toString());
        }
        AbstractC7090hj.C7091a c7091a = (AbstractC7090hj.C7091a) m16007a(c7036f.f23743c, i, "values");
        if (c7091aArr[i] != null) {
            return c7091aArr[i];
        }
        AbstractC7090hj.C7091a c7091a2 = null;
        set.add(Integer.valueOf(i));
        switch (c7091a.f23881a) {
            case 1:
            case 5:
            case 6:
            case 8:
                c7091a2 = c7091a;
                break;
            case 2:
                AbstractC7030gi.C7038h m16006b = m16006b(c7091a);
                c7091a2 = m16010a(c7091a);
                c7091a2.f23883c = new AbstractC7090hj.C7091a[m16006b.f23771b.length];
                int[] iArr = m16006b.f23771b;
                int length = iArr.length;
                int i3 = 0;
                while (i2 < length) {
                    c7091a2.f23883c[i3] = m16014a(iArr[i2], c7036f, c7091aArr, set);
                    i2++;
                    i3++;
                }
                break;
            case 3:
                c7091a2 = m16010a(c7091a);
                AbstractC7030gi.C7038h m16006b2 = m16006b(c7091a);
                if (m16006b2.f23772c.length != m16006b2.f23773d.length) {
                    m16008a(new StringBuilder(58).append("Uneven map keys (").append(m16006b2.f23772c.length).append(") and map values (").append(m16006b2.f23773d.length).append(")").toString());
                }
                c7091a2.f23884d = new AbstractC7090hj.C7091a[m16006b2.f23772c.length];
                c7091a2.f23885e = new AbstractC7090hj.C7091a[m16006b2.f23772c.length];
                int[] iArr2 = m16006b2.f23772c;
                int length2 = iArr2.length;
                int i4 = 0;
                int i5 = 0;
                while (i4 < length2) {
                    c7091a2.f23884d[i5] = m16014a(iArr2[i4], c7036f, c7091aArr, set);
                    i4++;
                    i5++;
                }
                int[] iArr3 = m16006b2.f23773d;
                int length3 = iArr3.length;
                int i6 = 0;
                while (i2 < length3) {
                    c7091a2.f23885e[i6] = m16014a(iArr3[i2], c7036f, c7091aArr, set);
                    i2++;
                    i6++;
                }
                break;
            case 4:
                c7091a2 = m16010a(c7091a);
                c7091a2.f23886f = C9147cw.m9132a(m16014a(m16006b(c7091a).f23776g, c7036f, c7091aArr, set));
                break;
            case 7:
                c7091a2 = m16010a(c7091a);
                AbstractC7030gi.C7038h m16006b3 = m16006b(c7091a);
                c7091a2.f23890j = new AbstractC7090hj.C7091a[m16006b3.f23775f.length];
                int[] iArr4 = m16006b3.f23775f;
                int length4 = iArr4.length;
                int i7 = 0;
                while (i2 < length4) {
                    c7091a2.f23890j[i7] = m16014a(iArr4[i2], c7036f, c7091aArr, set);
                    i2++;
                    i7++;
                }
                break;
        }
        if (c7091a2 == null) {
            String valueOf2 = String.valueOf(c7091a);
            m16008a(new StringBuilder(String.valueOf(valueOf2).length() + 15).append("Invalid value: ").append(valueOf2).toString());
        }
        c7091aArr[i] = c7091a2;
        set.remove(Integer.valueOf(i));
        return c7091a2;
    }

    /* renamed from: a */
    public static AbstractC7090hj.C7091a m16010a(AbstractC7090hj.C7091a c7091a) {
        AbstractC7090hj.C7091a c7091a2 = new AbstractC7090hj.C7091a();
        c7091a2.f23881a = c7091a.f23881a;
        c7091a2.f23891k = (int[]) c7091a.f23891k.clone();
        if (c7091a.f23892l) {
            c7091a2.f23892l = c7091a.f23892l;
        }
        return c7091a2;
    }

    /* renamed from: a */
    private static <T> T m16007a(T[] tArr, int i, String str) {
        if (i < 0 || i >= tArr.length) {
            m16008a(new StringBuilder(String.valueOf(str).length() + 45).append("Index out of bounds detected: ").append(i).append(" in ").append(str).toString());
        }
        return tArr[i];
    }

    /* renamed from: a */
    public static void m16009a(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return;
            }
            outputStream.write(bArr, 0, read);
        }
    }

    /* renamed from: a */
    private static void m16008a(String str) {
        C9065aw.m9301a(str);
        throw new C6907g(str);
    }

    /* renamed from: b */
    private static AbstractC7030gi.C7038h m16006b(AbstractC7090hj.C7091a c7091a) {
        if (((AbstractC7030gi.C7038h) c7091a.a(AbstractC7030gi.C7038h.f23769a)) == null) {
            String valueOf = String.valueOf(c7091a);
            m16008a(new StringBuilder(String.valueOf(valueOf).length() + 54).append("Expected a ServingValue and didn't get one. Value is: ").append(valueOf).toString());
        }
        return (AbstractC7030gi.C7038h) c7091a.a(AbstractC7030gi.C7038h.f23769a);
    }
}
