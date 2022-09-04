package p070c.p072b;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
/* renamed from: c.b.j */
/* loaded from: classes.dex */
public abstract class AbstractC0754j extends C0744a implements AbstractC0753i {

    /* renamed from: a */
    private String f1409a;

    public AbstractC0754j() {
        this.f1409a = null;
    }

    public AbstractC0754j(String str) {
        this.f1409a = str;
    }

    /* renamed from: b */
    public static void m38233b(byte b, byte b2) {
        C0744a.m38291a(b, b2);
    }

    /* renamed from: b */
    public static void m38232b(char c, char c2) {
        C0744a.m38290a(c, c2);
    }

    /* renamed from: b */
    public static void m38231b(double d, double d2, double d3) {
        C0744a.m38289a(d, d2, d3);
    }

    /* renamed from: b */
    public static void m38230b(float f, float f2, float f3) {
        C0744a.m38288a(f, f2, f3);
    }

    /* renamed from: b */
    public static void m38229b(int i, int i2) {
        C0744a.m38287a(i, i2);
    }

    /* renamed from: b */
    public static void m38228b(long j, long j2) {
        C0744a.m38286a(j, j2);
    }

    /* renamed from: b */
    public static void m38227b(String str, byte b, byte b2) {
        C0744a.m38282a(str, b, b2);
    }

    /* renamed from: b */
    public static void m38226b(String str, char c, char c2) {
        C0744a.m38281a(str, c, c2);
    }

    /* renamed from: b */
    public static void m38225b(String str, double d, double d2, double d3) {
        C0744a.m38280a(str, d, d2, d3);
    }

    /* renamed from: b */
    public static void m38224b(String str, float f, float f2, float f3) {
        C0744a.m38279a(str, f, f2, f3);
    }

    /* renamed from: b */
    public static void m38223b(String str, int i, int i2) {
        C0744a.m38278a(str, i, i2);
    }

    /* renamed from: b */
    public static void m38222b(String str, long j, long j2) {
        C0744a.m38277a(str, j, j2);
    }

    /* renamed from: b */
    public static void m38221b(String str, String str2) {
        C0744a.m38274a(str, str2);
    }

    /* renamed from: b */
    public static void m38220b(String str, String str2, String str3) {
        C0744a.m38273a(str, str2, str3);
    }

    /* renamed from: b */
    public static void m38219b(String str, short s, short s2) {
        C0744a.m38272a(str, s, s2);
    }

    /* renamed from: b */
    public static void m38218b(String str, boolean z, boolean z2) {
        C0744a.m38270a(str, z, z2);
    }

    /* renamed from: b */
    public static void m38217b(short s, short s2) {
        C0744a.m38269a(s, s2);
    }

    /* renamed from: b */
    public static void m38216b(boolean z, boolean z2) {
        C0744a.m38267a(z, z2);
    }

    /* renamed from: c */
    public static void m38214c(Object obj) {
        C0744a.m38285a(obj);
    }

    /* renamed from: c */
    public static void m38213c(String str) {
        C0744a.m38283a(str);
    }

    /* renamed from: c */
    public static void m38212c(String str, Object obj) {
        C0744a.m38276a(str, obj);
    }

    /* renamed from: c */
    public static void m38211c(String str, boolean z) {
        C0744a.m38271a(str, z);
    }

    /* renamed from: c */
    public static void m38210c(boolean z) {
        C0744a.m38268a(z);
    }

    /* renamed from: d */
    public static void m38208d(Object obj) {
        C0744a.m38266b(obj);
    }

    /* renamed from: d */
    public static void m38207d(Object obj, Object obj2) {
        C0744a.m38284a(obj, obj2);
    }

    /* renamed from: d */
    public static void m38206d(String str) {
        C0744a.m38264b(str);
    }

    /* renamed from: d */
    public static void m38205d(String str, Object obj) {
        C0744a.m38263b(str, obj);
    }

    /* renamed from: d */
    public static void m38204d(String str, boolean z) {
        C0744a.m38261b(str, z);
    }

    /* renamed from: d */
    public static void m38203d(boolean z) {
        C0744a.m38260b(z);
    }

    /* renamed from: e */
    public static void m38202e(Object obj, Object obj2) {
        C0744a.m38265b(obj, obj2);
    }

    /* renamed from: f */
    public static void m38200f(Object obj, Object obj2) {
        C0744a.m38259c(obj, obj2);
    }

    /* renamed from: g */
    public static void m38199g() {
        C0744a.m38256e();
    }

    /* renamed from: g */
    public static void m38198g(String str, Object obj, Object obj2) {
        C0744a.m38275a(str, obj, obj2);
    }

    /* renamed from: h */
    public static void m38196h(String str, Object obj, Object obj2) {
        C0744a.m38262b(str, obj, obj2);
    }

    /* renamed from: i */
    public static void m38194i(String str, Object obj, Object obj2) {
        C0744a.m38258c(str, obj, obj2);
    }

    /* renamed from: j */
    public static void m38192j(String str, Object obj, Object obj2) {
        C0744a.m38257d(str, obj, obj2);
    }

    /* renamed from: k */
    public static void m38191k(String str, Object obj, Object obj2) {
        C0744a.m38255e(str, obj, obj2);
    }

    /* renamed from: l */
    public static String m38190l(String str, Object obj, Object obj2) {
        return C0744a.m38254f(str, obj, obj2);
    }

    @Override // p070c.p072b.AbstractC0753i
    /* renamed from: a */
    public int mo38166a() {
        return 1;
    }

    @Override // p070c.p072b.AbstractC0753i
    /* renamed from: a */
    public void mo38162a(C0757m c0757m) {
        c0757m.m38179a(this);
    }

    /* renamed from: b */
    protected C0757m m38234b() {
        return new C0757m();
    }

    /* renamed from: c */
    public C0757m m38215c() {
        C0757m m38234b = m38234b();
        mo38162a(m38234b);
        return m38234b;
    }

    /* renamed from: d */
    public void m38209d() {
        Throwable th = null;
        m38197h();
        try {
            mo38147f();
            try {
                m38195i();
            } catch (Throwable th2) {
                th = th2;
                if (0 != 0) {
                    th = null;
                }
                th = th;
            }
        } catch (Throwable th3) {
            th = th3;
            try {
                m38195i();
            } catch (Throwable th4) {
                th = th4;
                if (th != null) {
                    th = th;
                }
                th = th;
            }
        }
        if (th != null) {
            throw th;
        }
    }

    /* renamed from: e */
    public void m38201e(String str) {
        this.f1409a = str;
    }

    /* renamed from: f */
    protected void mo38147f() {
        Method method;
        m38212c("TestCase.fName cannot be null", (Object) this.f1409a);
        try {
            method = getClass().getMethod(this.f1409a, null);
        } catch (NoSuchMethodException e) {
            m38213c("Method \"" + this.f1409a + "\" not found");
            method = null;
        }
        if (!Modifier.isPublic(method.getModifiers())) {
            m38213c("Method \"" + this.f1409a + "\" should be public");
        }
        try {
            method.invoke(this, new Object[0]);
        } catch (IllegalAccessException e2) {
            e2.fillInStackTrace();
            throw e2;
        } catch (InvocationTargetException e3) {
            e3.fillInStackTrace();
            throw e3.getTargetException();
        }
    }

    /* renamed from: h */
    protected void m38197h() {
    }

    /* renamed from: i */
    protected void m38195i() {
    }

    /* renamed from: j */
    public String m38193j() {
        return this.f1409a;
    }

    public String toString() {
        return m38193j() + "(" + getClass().getName() + ")";
    }
}
