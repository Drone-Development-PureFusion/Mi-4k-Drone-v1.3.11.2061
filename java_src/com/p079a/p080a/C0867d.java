package com.p079a.p080a;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.ZipException;
/* renamed from: com.a.a.d */
/* loaded from: classes.dex */
public class C0867d {

    /* renamed from: a */
    private static final int f1806a = 4;

    /* renamed from: b */
    private static final Map<C0863ab, Class<?>> f1807b = new ConcurrentHashMap();

    /* renamed from: com.a.a.d$a */
    /* loaded from: classes.dex */
    public static final class C0868a {

        /* renamed from: a */
        public static final int f1808a = 0;

        /* renamed from: b */
        public static final int f1809b = 1;

        /* renamed from: c */
        public static final int f1810c = 2;

        /* renamed from: d */
        public static final C0868a f1811d = new C0868a(0);

        /* renamed from: e */
        public static final C0868a f1812e = new C0868a(1);

        /* renamed from: f */
        public static final C0868a f1813f = new C0868a(2);

        /* renamed from: g */
        private final int f1814g;

        private C0868a(int i) {
            this.f1814g = i;
        }

        /* renamed from: a */
        public int m37564a() {
            return this.f1814g;
        }
    }

    static {
        m37570a(C0865b.class);
        m37570a(C0871g.class);
        m37570a(C0876k.class);
        m37570a(C0875j.class);
        m37570a(C0882p.class);
    }

    /* renamed from: a */
    public static AbstractC0891x m37571a(C0863ab c0863ab) {
        Class<?> cls = f1807b.get(c0863ab);
        if (cls != null) {
            return (AbstractC0891x) cls.newInstance();
        }
        C0879n c0879n = new C0879n();
        c0879n.m37547a(c0863ab);
        return c0879n;
    }

    /* renamed from: a */
    public static void m37570a(Class<?> cls) {
        try {
            f1807b.put(((AbstractC0891x) cls.newInstance()).mo37484a(), cls);
        } catch (ClassCastException e) {
            throw new RuntimeException(cls + " doesn't implement ZipExtraField");
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(cls + "'s no-arg constructor is not public");
        } catch (InstantiationException e3) {
            throw new RuntimeException(cls + " is not a concrete class");
        }
    }

    /* renamed from: a */
    public static byte[] m37566a(AbstractC0891x[] abstractC0891xArr) {
        boolean z = abstractC0891xArr.length > 0 && (abstractC0891xArr[abstractC0891xArr.length + (-1)] instanceof C0878m);
        int length = z ? abstractC0891xArr.length - 1 : abstractC0891xArr.length;
        int i = length * 4;
        for (AbstractC0891x abstractC0891x : abstractC0891xArr) {
            i += abstractC0891x.mo37479f().m37596b();
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            System.arraycopy(abstractC0891xArr[i3].mo37484a().m37600a(), 0, bArr, i2, 2);
            System.arraycopy(abstractC0891xArr[i3].mo37479f().m37600a(), 0, bArr, i2 + 2, 2);
            byte[] mo37480e = abstractC0891xArr[i3].mo37480e();
            System.arraycopy(mo37480e, 0, bArr, i2 + 4, mo37480e.length);
            i2 += mo37480e.length + 4;
        }
        if (z) {
            byte[] mo37480e2 = abstractC0891xArr[abstractC0891xArr.length - 1].mo37480e();
            System.arraycopy(mo37480e2, 0, bArr, i2, mo37480e2.length);
        }
        return bArr;
    }

    /* renamed from: a */
    public static AbstractC0891x[] m37569a(byte[] bArr) {
        return m37567a(bArr, true, C0868a.f1811d);
    }

    /* renamed from: a */
    public static AbstractC0891x[] m37568a(byte[] bArr, boolean z) {
        return m37567a(bArr, z, C0868a.f1811d);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static AbstractC0891x[] m37567a(byte[] bArr, boolean z, C0868a c0868a) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            if (i > bArr.length - 4) {
                break;
            }
            C0863ab c0863ab = new C0863ab(bArr, i);
            int m37596b = new C0863ab(bArr, i + 2).m37596b();
            if (i + 4 + m37596b > bArr.length) {
                switch (c0868a.m37564a()) {
                    case 0:
                        throw new ZipException("bad extra field starting at " + i + ".  Block length of " + m37596b + " bytes exceeds remaining data of " + ((bArr.length - i) - 4) + " bytes.");
                    case 1:
                        break;
                    case 2:
                        C0878m c0878m = new C0878m();
                        if (z) {
                            c0878m.mo37483a(bArr, i, bArr.length - i);
                        } else {
                            c0878m.mo37536b(bArr, i, bArr.length - i);
                        }
                        arrayList.add(c0878m);
                        break;
                    default:
                        throw new ZipException("unknown UnparseableExtraField key: " + c0868a.m37564a());
                }
            } else {
                try {
                    AbstractC0891x m37571a = m37571a(c0863ab);
                    if (z || !(m37571a instanceof AbstractC0866c)) {
                        m37571a.mo37483a(bArr, i + 4, m37596b);
                    } else {
                        ((AbstractC0866c) m37571a).mo37536b(bArr, i + 4, m37596b);
                    }
                    arrayList.add(m37571a);
                    i = m37596b + 4 + i;
                } catch (IllegalAccessException e) {
                    throw new ZipException(e.getMessage());
                } catch (InstantiationException e2) {
                    throw new ZipException(e2.getMessage());
                }
            }
        }
        return (AbstractC0891x[]) arrayList.toArray(new AbstractC0891x[arrayList.size()]);
    }

    /* renamed from: b */
    public static byte[] m37565b(AbstractC0891x[] abstractC0891xArr) {
        boolean z = abstractC0891xArr.length > 0 && (abstractC0891xArr[abstractC0891xArr.length + (-1)] instanceof C0878m);
        int length = z ? abstractC0891xArr.length - 1 : abstractC0891xArr.length;
        int i = length * 4;
        for (AbstractC0891x abstractC0891x : abstractC0891xArr) {
            i += abstractC0891x.mo37481d().m37596b();
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            System.arraycopy(abstractC0891xArr[i3].mo37484a().m37600a(), 0, bArr, i2, 2);
            System.arraycopy(abstractC0891xArr[i3].mo37481d().m37600a(), 0, bArr, i2 + 2, 2);
            byte[] mo37482c = abstractC0891xArr[i3].mo37482c();
            System.arraycopy(mo37482c, 0, bArr, i2 + 4, mo37482c.length);
            i2 += mo37482c.length + 4;
        }
        if (z) {
            byte[] mo37482c2 = abstractC0891xArr[abstractC0891xArr.length - 1].mo37482c();
            System.arraycopy(mo37482c2, 0, bArr, i2, mo37482c2.length);
        }
        return bArr;
    }
}
