package p005b.p006a.p007a.p029b.p030a;

import java.lang.reflect.Method;
/* renamed from: b.a.a.b.a.b */
/* loaded from: classes.dex */
public class C0403b {

    /* renamed from: a */
    private static final C0403b f475a = new C0403b(null);

    /* renamed from: b */
    private Class<?> f476b;

    /* renamed from: c */
    private Method f477c;

    /* renamed from: d */
    private Method f478d;

    private C0403b(ClassLoader classLoader) {
        try {
            m39411a(classLoader);
        } catch (Exception e) {
        }
    }

    /* renamed from: a */
    public static C0403b m39412a() {
        return f475a;
    }

    /* renamed from: a */
    public Boolean m39409a(String str, boolean z) {
        if (this.f476b == null || this.f478d == null) {
            return Boolean.valueOf(z);
        }
        try {
            return (Boolean) this.f478d.invoke(this.f476b, str, Boolean.valueOf(z));
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (Exception e2) {
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: a */
    public String m39410a(String str, String str2) {
        String str3;
        if (this.f476b == null || this.f477c == null) {
            return null;
        }
        try {
            str3 = (String) this.f477c.invoke(this.f476b, str, str2);
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (Exception e2) {
            str3 = null;
        }
        return (str3 == null || str3.length() == 0) ? str2 : str3;
    }

    /* renamed from: a */
    public void m39411a(ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = getClass().getClassLoader();
        }
        this.f476b = classLoader.loadClass("android.os.SystemProperties");
        this.f477c = this.f476b.getMethod("get", String.class, String.class);
        this.f478d = this.f476b.getMethod("getBoolean", String.class, Boolean.TYPE);
    }
}
