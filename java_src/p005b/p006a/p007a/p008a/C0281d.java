package p005b.p006a.p007a.p008a;

import java.io.Serializable;
import org.p286a.p287a.p290c.p293c.C11053o;
/* renamed from: b.a.a.a.d */
/* loaded from: classes.dex */
public final class C0281d implements Serializable {

    /* renamed from: a */
    public static final int f196a = Integer.MAX_VALUE;

    /* renamed from: c */
    public static final int f198c = 30000;

    /* renamed from: d */
    public static final int f199d = 20000;

    /* renamed from: e */
    public static final int f200e = 10000;

    /* renamed from: f */
    public static final int f201f = 5000;

    /* renamed from: g */
    public static final int f202g = Integer.MIN_VALUE;
    private static final long serialVersionUID = -814092767334282137L;

    /* renamed from: v */
    public final int f217v;

    /* renamed from: w */
    public final String f218w;

    /* renamed from: h */
    public static final Integer f203h = Integer.MAX_VALUE;

    /* renamed from: b */
    public static final int f197b = 40000;

    /* renamed from: i */
    public static final Integer f204i = Integer.valueOf((int) f197b);

    /* renamed from: j */
    public static final Integer f205j = 30000;

    /* renamed from: k */
    public static final Integer f206k = 20000;

    /* renamed from: l */
    public static final Integer f207l = 10000;

    /* renamed from: m */
    public static final Integer f208m = 5000;

    /* renamed from: n */
    public static final Integer f209n = Integer.MIN_VALUE;

    /* renamed from: o */
    public static final C0281d f210o = new C0281d(Integer.MAX_VALUE, "OFF");

    /* renamed from: p */
    public static final C0281d f211p = new C0281d(f197b, "ERROR");

    /* renamed from: q */
    public static final C0281d f212q = new C0281d(30000, "WARN");

    /* renamed from: r */
    public static final C0281d f213r = new C0281d(20000, "INFO");

    /* renamed from: s */
    public static final C0281d f214s = new C0281d(10000, "DEBUG");

    /* renamed from: t */
    public static final C0281d f215t = new C0281d(5000, C11053o.f35598a);

    /* renamed from: u */
    public static final C0281d f216u = new C0281d(Integer.MIN_VALUE, "ALL");

    private C0281d(int i, String str) {
        this.f217v = i;
        this.f218w = str;
    }

    /* renamed from: a */
    public static C0281d m39803a(int i) {
        return m39802a(i, f214s);
    }

    /* renamed from: a */
    public static C0281d m39802a(int i, C0281d c0281d) {
        switch (i) {
            case Integer.MIN_VALUE:
                return f216u;
            case 5000:
                return f215t;
            case 10000:
                return f214s;
            case 20000:
                return f213r;
            case 30000:
                return f212q;
            case f197b /* 40000 */:
                return f211p;
            case Integer.MAX_VALUE:
                return f210o;
            default:
                return c0281d;
        }
    }

    /* renamed from: a */
    public static C0281d m39800a(String str) {
        return m39799a(str, f214s);
    }

    /* renamed from: a */
    public static C0281d m39799a(String str, C0281d c0281d) {
        return str == null ? c0281d : str.equalsIgnoreCase("ALL") ? f216u : str.equalsIgnoreCase(C11053o.f35598a) ? f215t : str.equalsIgnoreCase("DEBUG") ? f214s : str.equalsIgnoreCase("INFO") ? f213r : str.equalsIgnoreCase("WARN") ? f212q : str.equalsIgnoreCase("ERROR") ? f211p : str.equalsIgnoreCase("OFF") ? f210o : c0281d;
    }

    /* renamed from: b */
    public static int m39796b(C0281d c0281d) {
        if (c0281d == null) {
            throw new IllegalArgumentException("null level parameter is not admitted");
        }
        switch (c0281d.m39804a()) {
            case 5000:
                return 0;
            case 10000:
                return 10;
            case 20000:
                return 20;
            case 30000:
                return 30;
            case f197b /* 40000 */:
                return 40;
            default:
                throw new IllegalArgumentException(c0281d + " not a valid level value");
        }
    }

    /* renamed from: b */
    public static C0281d m39797b(int i) {
        switch (i) {
            case 0:
                return f215t;
            case 10:
                return f214s;
            case 20:
                return f213r;
            case 30:
                return f212q;
            case 40:
                return f211p;
            default:
                throw new IllegalArgumentException(i + " not a valid level value");
        }
    }

    /* renamed from: b */
    public static C0281d m39795b(String str) {
        return m39799a(str, f214s);
    }

    private Object readResolve() {
        return m39803a(this.f217v);
    }

    /* renamed from: a */
    public int m39804a() {
        return this.f217v;
    }

    /* renamed from: a */
    public boolean m39801a(C0281d c0281d) {
        return this.f217v >= c0281d.f217v;
    }

    /* renamed from: b */
    public Integer m39798b() {
        switch (this.f217v) {
            case Integer.MIN_VALUE:
                return f209n;
            case 5000:
                return f208m;
            case 10000:
                return f207l;
            case 20000:
                return f206k;
            case 30000:
                return f205j;
            case f197b /* 40000 */:
                return f204i;
            case Integer.MAX_VALUE:
                return f203h;
            default:
                throw new IllegalStateException("Level " + this.f218w + ", " + this.f217v + " is unknown.");
        }
    }

    public String toString() {
        return this.f218w;
    }
}
