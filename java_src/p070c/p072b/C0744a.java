package p070c.p072b;
@Deprecated
/* renamed from: c.b.a */
/* loaded from: classes.dex */
public class C0744a {
    /* renamed from: a */
    public static void m38291a(byte b, byte b2) {
        m38282a((String) null, b, b2);
    }

    /* renamed from: a */
    public static void m38290a(char c, char c2) {
        m38281a((String) null, c, c2);
    }

    /* renamed from: a */
    public static void m38289a(double d, double d2, double d3) {
        m38280a((String) null, d, d2, d3);
    }

    /* renamed from: a */
    public static void m38288a(float f, float f2, float f3) {
        m38279a((String) null, f, f2, f3);
    }

    /* renamed from: a */
    public static void m38287a(int i, int i2) {
        m38278a((String) null, i, i2);
    }

    /* renamed from: a */
    public static void m38286a(long j, long j2) {
        m38277a((String) null, j, j2);
    }

    /* renamed from: a */
    public static void m38285a(Object obj) {
        m38276a((String) null, obj);
    }

    /* renamed from: a */
    public static void m38284a(Object obj, Object obj2) {
        m38275a((String) null, obj, obj2);
    }

    /* renamed from: a */
    public static void m38283a(String str) {
        if (str == null) {
            throw new C0745b();
        }
        throw new C0745b(str);
    }

    /* renamed from: a */
    public static void m38282a(String str, byte b, byte b2) {
        m38275a(str, Byte.valueOf(b), Byte.valueOf(b2));
    }

    /* renamed from: a */
    public static void m38281a(String str, char c, char c2) {
        m38275a(str, Character.valueOf(c), Character.valueOf(c2));
    }

    /* renamed from: a */
    public static void m38280a(String str, double d, double d2, double d3) {
        if (Double.compare(d, d2) != 0 && Math.abs(d - d2) > d3) {
            m38255e(str, new Double(d), new Double(d2));
        }
    }

    /* renamed from: a */
    public static void m38279a(String str, float f, float f2, float f3) {
        if (Float.compare(f, f2) != 0 && Math.abs(f - f2) > f3) {
            m38255e(str, new Float(f), new Float(f2));
        }
    }

    /* renamed from: a */
    public static void m38278a(String str, int i, int i2) {
        m38275a(str, Integer.valueOf(i), Integer.valueOf(i2));
    }

    /* renamed from: a */
    public static void m38277a(String str, long j, long j2) {
        m38275a(str, Long.valueOf(j), Long.valueOf(j2));
    }

    /* renamed from: a */
    public static void m38276a(String str, Object obj) {
        m38271a(str, obj != null);
    }

    /* renamed from: a */
    public static void m38275a(String str, Object obj, Object obj2) {
        if (obj == null && obj2 == null) {
            return;
        }
        if (obj != null && obj.equals(obj2)) {
            return;
        }
        m38255e(str, obj, obj2);
    }

    /* renamed from: a */
    public static void m38274a(String str, String str2) {
        m38273a((String) null, str, str2);
    }

    /* renamed from: a */
    public static void m38273a(String str, String str2, String str3) {
        if (str2 == null && str3 == null) {
            return;
        }
        if (str2 != null && str2.equals(str3)) {
            return;
        }
        if (str == null) {
            str = "";
        }
        throw new C0747d(str, str2, str3);
    }

    /* renamed from: a */
    public static void m38272a(String str, short s, short s2) {
        m38275a(str, Short.valueOf(s), Short.valueOf(s2));
    }

    /* renamed from: a */
    public static void m38271a(String str, boolean z) {
        if (!z) {
            m38283a(str);
        }
    }

    /* renamed from: a */
    public static void m38270a(String str, boolean z, boolean z2) {
        m38275a(str, Boolean.valueOf(z), Boolean.valueOf(z2));
    }

    /* renamed from: a */
    public static void m38269a(short s, short s2) {
        m38272a((String) null, s, s2);
    }

    /* renamed from: a */
    public static void m38268a(boolean z) {
        m38271a((String) null, z);
    }

    /* renamed from: a */
    public static void m38267a(boolean z, boolean z2) {
        m38270a((String) null, z, z2);
    }

    /* renamed from: b */
    public static void m38266b(Object obj) {
        if (obj != null) {
            m38263b("Expected: <null> but was: " + obj.toString(), obj);
        }
    }

    /* renamed from: b */
    public static void m38265b(Object obj, Object obj2) {
        m38262b(null, obj, obj2);
    }

    /* renamed from: b */
    public static void m38264b(String str) {
        m38283a((str != null ? str + " " : "") + "expected not same");
    }

    /* renamed from: b */
    public static void m38263b(String str, Object obj) {
        m38271a(str, obj == null);
    }

    /* renamed from: b */
    public static void m38262b(String str, Object obj, Object obj2) {
        if (obj == obj2) {
            return;
        }
        m38257d(str, obj, obj2);
    }

    /* renamed from: b */
    public static void m38261b(String str, boolean z) {
        m38271a(str, !z);
    }

    /* renamed from: b */
    public static void m38260b(boolean z) {
        m38261b((String) null, z);
    }

    /* renamed from: c */
    public static void m38259c(Object obj, Object obj2) {
        m38258c(null, obj, obj2);
    }

    /* renamed from: c */
    public static void m38258c(String str, Object obj, Object obj2) {
        if (obj == obj2) {
            m38264b(str);
        }
    }

    /* renamed from: d */
    public static void m38257d(String str, Object obj, Object obj2) {
        m38283a((str != null ? str + " " : "") + "expected same:<" + obj + "> was not:<" + obj2 + ">");
    }

    /* renamed from: e */
    public static void m38256e() {
        m38283a((String) null);
    }

    /* renamed from: e */
    public static void m38255e(String str, Object obj, Object obj2) {
        m38283a(m38254f(str, obj, obj2));
    }

    /* renamed from: f */
    public static String m38254f(String str, Object obj, Object obj2) {
        String str2 = "";
        if (str != null && str.length() > 0) {
            str2 = str + " ";
        }
        return str2 + "expected:<" + obj + "> but was:<" + obj2 + ">";
    }
}
