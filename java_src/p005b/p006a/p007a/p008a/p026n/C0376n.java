package p005b.p006a.p007a.p008a.p026n;

import java.net.URL;
import java.security.CodeSource;
import java.util.HashMap;
/* renamed from: b.a.a.a.n.n */
/* loaded from: classes.dex */
public class C0376n {

    /* renamed from: a */
    static final C0378p[] f404a = new C0378p[0];

    /* renamed from: b */
    HashMap<String, C0364b> f405b = new HashMap<>();

    /* renamed from: a */
    private C0364b m39520a(C0378p c0378p, ClassLoader classLoader) {
        String className = c0378p.f406a.getClassName();
        C0364b c0364b = this.f405b.get(className);
        if (c0364b != null) {
            return c0364b;
        }
        Class m39514b = m39514b(classLoader, className);
        C0364b c0364b2 = new C0364b(m39515b(m39514b), m39519a(m39514b), false);
        this.f405b.put(className, c0364b2);
        return c0364b2;
    }

    /* renamed from: a */
    private Class m39518a(ClassLoader classLoader, String str) {
        if (classLoader == null) {
            return null;
        }
        try {
            return classLoader.loadClass(str);
        } catch (ClassNotFoundException e) {
            return null;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        } catch (NoClassDefFoundError e3) {
            return null;
        }
    }

    /* renamed from: a */
    private String m39517a(String str, char c) {
        int lastIndexOf = str.lastIndexOf(c);
        if (m39523a(lastIndexOf, str)) {
            return str.substring(str.lastIndexOf(c, lastIndexOf - 1) + 1);
        }
        if (lastIndexOf <= 0) {
            return null;
        }
        return str.substring(lastIndexOf + 1);
    }

    /* renamed from: a */
    private boolean m39523a(int i, String str) {
        return i != -1 && i + 1 == str.length();
    }

    /* renamed from: b */
    private Class m39514b(ClassLoader classLoader, String str) {
        Class m39518a = m39518a(classLoader, str);
        if (m39518a != null) {
            return m39518a;
        }
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader != classLoader) {
            m39518a = m39518a(contextClassLoader, str);
        }
        if (m39518a != null) {
            return m39518a;
        }
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            return null;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        } catch (NoClassDefFoundError e3) {
            return null;
        }
    }

    /* renamed from: a */
    String m39519a(Class cls) {
        Package r0;
        String implementationVersion;
        return (cls == null || (r0 = cls.getPackage()) == null || (implementationVersion = r0.getImplementationVersion()) == null) ? "na" : implementationVersion;
    }

    /* renamed from: a */
    void m39522a(int i, C0378p[] c0378pArr, ClassLoader classLoader) {
        int length = c0378pArr.length - i;
        for (int i2 = 0; i2 < length; i2++) {
            C0378p c0378p = c0378pArr[i2];
            c0378p.m39511a(m39520a(c0378p, classLoader));
        }
    }

    /* renamed from: a */
    public void m39521a(AbstractC0367e abstractC0367e) {
        while (abstractC0367e != null) {
            m39516a(abstractC0367e.mo39487c());
            AbstractC0367e[] mo39484f = abstractC0367e.mo39484f();
            if (mo39484f != null) {
                for (AbstractC0367e abstractC0367e2 : mo39484f) {
                    m39516a(abstractC0367e2.mo39487c());
                }
            }
            abstractC0367e = abstractC0367e.mo39485e();
        }
    }

    /* renamed from: a */
    void m39516a(C0378p[] c0378pArr) {
        int m39513a = C0377o.m39513a(new Throwable("local stack reference").getStackTrace(), c0378pArr);
        int length = c0378pArr.length - m39513a;
        for (int i = 0; i < m39513a; i++) {
            C0378p c0378p = c0378pArr[length + i];
            c0378p.m39511a(m39520a(c0378p, (ClassLoader) null));
        }
        m39522a(m39513a, c0378pArr, null);
    }

    /* renamed from: b */
    String m39515b(Class cls) {
        URL location;
        if (cls != null) {
            try {
                CodeSource codeSource = cls.getProtectionDomain().getCodeSource();
                if (codeSource != null && (location = codeSource.getLocation()) != null) {
                    String url = location.toString();
                    String m39517a = m39517a(url, '/');
                    return m39517a != null ? m39517a : m39517a(url, '\\');
                }
            } catch (Exception e) {
            }
        }
        return "na";
    }
}
