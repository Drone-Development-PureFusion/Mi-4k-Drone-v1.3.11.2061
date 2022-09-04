package org.p356d;

import android.support.p004v7.media.SystemMediaRouteProvider;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import org.p356d.p357a.C11729e;
import org.p356d.p358b.C11739h;
import org.p356d.p358b.C11742k;
import org.p356d.p358b.C11743l;
import org.p356d.p358b.C11744m;
import org.p356d.p359c.C11748a;
/* renamed from: org.d.d */
/* loaded from: classes3.dex */
public final class C11751d {

    /* renamed from: a */
    static final String f37072a = "http://www.slf4j.org/codes.html";

    /* renamed from: b */
    static final String f37073b = "http://www.slf4j.org/codes.html#StaticLoggerBinder";

    /* renamed from: c */
    static final String f37074c = "http://www.slf4j.org/codes.html#multiple_bindings";

    /* renamed from: d */
    static final String f37075d = "http://www.slf4j.org/codes.html#null_LF";

    /* renamed from: e */
    static final String f37076e = "http://www.slf4j.org/codes.html#version_mismatch";

    /* renamed from: f */
    static final String f37077f = "http://www.slf4j.org/codes.html#substituteLogger";

    /* renamed from: g */
    static final String f37078g = "http://www.slf4j.org/codes.html#loggerNameMismatch";

    /* renamed from: h */
    static final String f37079h = "http://www.slf4j.org/codes.html#replay";

    /* renamed from: i */
    static final String f37080i = "http://www.slf4j.org/codes.html#unsuccessfulInit";

    /* renamed from: j */
    static final String f37081j = "org.slf4j.LoggerFactory could not be successfully initialized. See also http://www.slf4j.org/codes.html#unsuccessfulInit";

    /* renamed from: k */
    static final int f37082k = 0;

    /* renamed from: l */
    static final int f37083l = 1;

    /* renamed from: m */
    static final int f37084m = 2;

    /* renamed from: n */
    static final int f37085n = 3;

    /* renamed from: o */
    static final int f37086o = 4;

    /* renamed from: t */
    static final String f37091t = "java.vendor.url";

    /* renamed from: p */
    static volatile int f37087p = 0;

    /* renamed from: q */
    static C11743l f37088q = new C11743l();

    /* renamed from: r */
    static C11739h f37089r = new C11739h();

    /* renamed from: s */
    static final String f37090s = "slf4j.detectLoggerNameMismatch";

    /* renamed from: u */
    static boolean f37092u = C11744m.m121b(f37090s);

    /* renamed from: v */
    private static final String[] f37093v = {"1.6", "1.7"};

    /* renamed from: w */
    private static String f37094w = "org/slf4j/impl/StaticLoggerBinder.class";

    private C11751d() {
    }

    /* renamed from: a */
    public static AbstractC11747c m50a(Class<?> cls) {
        Class<?> m125a;
        AbstractC11747c m48a = m48a(cls.getName());
        if (f37092u && (m125a = C11744m.m125a()) != null && m49a(cls, m125a)) {
            C11744m.m119c(String.format("Detected logger name mismatch. Given name: \"%s\"; computed name: \"%s\".", m48a.mo88d(), m125a.getName()));
            C11744m.m119c("See http://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
        }
        return m48a;
    }

    /* renamed from: a */
    public static AbstractC11747c m48a(String str) {
        return m40c().mo126e(str);
    }

    /* renamed from: a */
    static void m52a() {
        f37087p = 0;
    }

    /* renamed from: a */
    private static void m51a(int i) {
        C11744m.m119c("A number (" + i + ") of logging calls during the initialization phase have been intercepted and are");
        C11744m.m119c("now being replayed. These are subject to the filtering rules of the underlying logging system.");
        C11744m.m119c("See also http://www.slf4j.org/codes.html#replay");
    }

    /* renamed from: a */
    static void m47a(Throwable th) {
        f37087p = 2;
        C11744m.m123a("Failed to instantiate SLF4J LoggerFactory", th);
    }

    /* renamed from: a */
    private static void m45a(C11729e c11729e) {
        if (c11729e == null) {
            return;
        }
        C11742k m167i = c11729e.m167i();
        String mo88d = m167i.mo88d();
        if (m167i.m134c()) {
            throw new IllegalStateException("Delegate logger cannot be null at this state.");
        }
        if (m167i.m133e()) {
            return;
        }
        if (m167i.m135b()) {
            m167i.m137a(c11729e);
        } else {
            C11744m.m119c(mo88d);
        }
    }

    /* renamed from: a */
    private static void m44a(C11729e c11729e, int i) {
        if (c11729e.m167i().m135b()) {
            m51a(i);
        } else if (c11729e.m167i().m133e()) {
        } else {
            m34h();
        }
    }

    /* renamed from: a */
    private static boolean m49a(Class<?> cls, Class<?> cls2) {
        return !cls2.isAssignableFrom(cls);
    }

    /* renamed from: a */
    private static boolean m46a(Set<URL> set) {
        return set.size() > 1;
    }

    /* renamed from: b */
    static Set<URL> m43b() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            ClassLoader classLoader = C11751d.class.getClassLoader();
            Enumeration<URL> systemResources = classLoader == null ? ClassLoader.getSystemResources(f37094w) : classLoader.getResources(f37094w);
            while (systemResources.hasMoreElements()) {
                linkedHashSet.add(systemResources.nextElement());
            }
        } catch (IOException e) {
            C11744m.m123a("Error getting resources from path", e);
        }
        return linkedHashSet;
    }

    /* renamed from: b */
    private static void m41b(Set<URL> set) {
        if (m46a(set)) {
            C11744m.m119c("Class path contains multiple SLF4J bindings.");
            Iterator<URL> it2 = set.iterator();
            while (it2.hasNext()) {
                C11744m.m119c("Found binding in [" + it2.next() + "]");
            }
            C11744m.m119c("See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }

    /* renamed from: b */
    private static boolean m42b(String str) {
        if (str == null) {
            return false;
        }
        return str.contains("org/slf4j/impl/StaticLoggerBinder") || str.contains("org.slf4j.impl.StaticLoggerBinder");
    }

    /* renamed from: c */
    public static AbstractC11724a m40c() {
        if (f37087p == 0) {
            synchronized (C11751d.class) {
                if (f37087p == 0) {
                    f37087p = 1;
                    m38d();
                }
            }
        }
        switch (f37087p) {
            case 1:
                return f37088q;
            case 2:
                throw new IllegalStateException(f37081j);
            case 3:
                return C11748a.m57a().mo30d();
            case 4:
                return f37089r;
            default:
                throw new IllegalStateException("Unreachable code");
        }
    }

    /* renamed from: c */
    private static void m39c(Set<URL> set) {
        if (set == null || !m46a(set)) {
            return;
        }
        C11744m.m119c("Actual binding is of type [" + C11748a.m57a().mo29e() + "]");
    }

    /* renamed from: d */
    private static final void m38d() {
        m37e();
        if (f37087p == 3) {
            m33i();
        }
    }

    /* renamed from: e */
    private static final void m37e() {
        Set<URL> set = null;
        try {
            if (!m32j()) {
                set = m43b();
                m41b(set);
            }
            C11748a.m57a();
            f37087p = 3;
            m39c(set);
            m36f();
            m35g();
            f37088q.m127e();
        } catch (Exception e) {
            m47a(e);
            throw new IllegalStateException("Unexpected initialization failure", e);
        } catch (NoClassDefFoundError e2) {
            if (!m42b(e2.getMessage())) {
                m47a(e2);
                throw e2;
            }
            f37087p = 4;
            C11744m.m119c("Failed to load class \"org.slf4j.impl.StaticLoggerBinder\".");
            C11744m.m119c("Defaulting to no-operation (NOP) logger implementation");
            C11744m.m119c("See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.");
        } catch (NoSuchMethodError e3) {
            String message = e3.getMessage();
            if (message != null && message.contains("org.slf4j.impl.StaticLoggerBinder.getSingleton()")) {
                f37087p = 2;
                C11744m.m119c("slf4j-api 1.6.x (or later) is incompatible with this binding.");
                C11744m.m119c("Your binding is version 1.5.5 or earlier.");
                C11744m.m119c("Upgrade your binding to version 1.6.x.");
            }
            throw e3;
        }
    }

    /* renamed from: f */
    private static void m36f() {
        synchronized (f37088q) {
            f37088q.m128d();
            for (C11742k c11742k : f37088q.m130b()) {
                c11742k.m136a(m48a(c11742k.mo88d()));
            }
        }
    }

    /* renamed from: g */
    private static void m35g() {
        LinkedBlockingQueue<C11729e> m129c = f37088q.m129c();
        int size = m129c.size();
        int i = 0;
        ArrayList<C11729e> arrayList = new ArrayList(128);
        while (m129c.drainTo(arrayList, 128) != 0) {
            int i2 = i;
            for (C11729e c11729e : arrayList) {
                m45a(c11729e);
                int i3 = i2 + 1;
                if (i2 == 0) {
                    m44a(c11729e, size);
                }
                i2 = i3;
            }
            arrayList.clear();
            i = i2;
        }
    }

    /* renamed from: h */
    private static void m34h() {
        C11744m.m119c("The following set of substitute loggers may have been accessed");
        C11744m.m119c("during the initialization phase. Logging calls during this");
        C11744m.m119c("phase were not honored. However, subsequent logging calls to these");
        C11744m.m119c("loggers will work as normally expected.");
        C11744m.m119c("See also http://www.slf4j.org/codes.html#substituteLogger");
    }

    /* renamed from: i */
    private static final void m33i() {
        boolean z = false;
        try {
            String str = C11748a.f37062a;
            for (String str2 : f37093v) {
                if (str.startsWith(str2)) {
                    z = true;
                }
            }
            if (z) {
                return;
            }
            C11744m.m119c("The requested version " + str + " by your slf4j binding is not compatible with " + Arrays.asList(f37093v).toString());
            C11744m.m119c("See http://www.slf4j.org/codes.html#version_mismatch for further details.");
        } catch (NoSuchFieldError e) {
        } catch (Throwable th) {
            C11744m.m123a("Unexpected problem occured during version sanity check", th);
        }
    }

    /* renamed from: j */
    private static boolean m32j() {
        String m124a = C11744m.m124a(f37091t);
        if (m124a == null) {
            return false;
        }
        return m124a.toLowerCase().contains(SystemMediaRouteProvider.PACKAGE_NAME);
    }
}
