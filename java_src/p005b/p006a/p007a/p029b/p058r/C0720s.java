package p005b.p006a.p007a.p029b.p058r;

import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import p005b.p006a.p007a.p029b.AbstractC0427f;
/* renamed from: b.a.a.b.r.s */
/* loaded from: classes.dex */
public class C0720s {

    /* renamed from: a */
    static final String f1315a = "Caught Exception while in Loader.getResource. This may be innocuous.";

    /* renamed from: b */
    public static final String f1316b = "logback.ignoreTCL";

    /* renamed from: c */
    private static boolean f1317c;

    /* renamed from: d */
    private static boolean f1318d;

    static {
        f1317c = false;
        f1318d = false;
        String m38378a = C0724u.m38378a(f1316b, (String) null);
        if (m38378a != null) {
            f1317c = Boolean.valueOf(m38378a).booleanValue();
        }
        f1318d = ((Boolean) AccessController.doPrivileged(new PrivilegedAction<Boolean>() { // from class: b.a.a.b.r.s.1
            @Override // java.security.PrivilegedAction
            /* renamed from: a */
            public Boolean run() {
                try {
                    AccessController.checkPermission(new RuntimePermission("getClassLoader"));
                    return true;
                } catch (SecurityException e) {
                    return false;
                }
            }
        })).booleanValue();
    }

    /* renamed from: a */
    public static Class<?> m38396a(String str, AbstractC0427f abstractC0427f) {
        return m38398a(abstractC0427f).loadClass(str);
    }

    /* renamed from: a */
    public static ClassLoader m38400a() {
        return Thread.currentThread().getContextClassLoader();
    }

    /* renamed from: a */
    public static ClassLoader m38399a(final Class<?> cls) {
        if (!f1318d) {
            return null;
        }
        return (ClassLoader) AccessController.doPrivileged(new PrivilegedAction<ClassLoader>() { // from class: b.a.a.b.r.s.2
            @Override // java.security.PrivilegedAction
            /* renamed from: a */
            public ClassLoader run() {
                return cls.getClassLoader();
            }
        });
    }

    /* renamed from: a */
    public static ClassLoader m38398a(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Argument cannot be null");
        }
        return m38394b(obj.getClass());
    }

    /* renamed from: a */
    public static URL m38397a(String str) {
        return m38392b(str, m38394b(C0720s.class));
    }

    /* renamed from: a */
    public static Set<URL> m38395a(String str, ClassLoader classLoader) {
        HashSet hashSet = new HashSet();
        Enumeration<URL> resources = classLoader.getResources(str);
        while (resources.hasMoreElements()) {
            hashSet.add(resources.nextElement());
        }
        return hashSet;
    }

    /* renamed from: b */
    public static Class<?> m38393b(String str) {
        if (f1317c) {
            return Class.forName(str);
        }
        try {
            return m38400a().loadClass(str);
        } catch (Throwable th) {
            return Class.forName(str);
        }
    }

    /* renamed from: b */
    public static ClassLoader m38394b(Class<?> cls) {
        ClassLoader classLoader = cls.getClassLoader();
        return classLoader == null ? ClassLoader.getSystemClassLoader() : classLoader;
    }

    /* renamed from: b */
    public static URL m38392b(String str, ClassLoader classLoader) {
        try {
            return classLoader.getResource(str);
        } catch (Throwable th) {
            return null;
        }
    }
}
