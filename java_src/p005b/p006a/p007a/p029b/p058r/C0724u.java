package p005b.p006a.p007a.p029b.p058r;

import java.util.Properties;
import p005b.p006a.p007a.p029b.AbstractC0427f;
import p005b.p006a.p007a.p029b.p030a.C0403b;
import p005b.p006a.p007a.p029b.p055o.AbstractC0661e;
import p005b.p006a.p007a.p029b.p055o.AbstractC0672p;
import p005b.p006a.p007a.p029b.p055o.C0674r;
import p005b.p006a.p007a.p029b.p057q.C0693b;
/* renamed from: b.a.a.b.r.u */
/* loaded from: classes.dex */
public class C0724u {

    /* renamed from: a */
    static final String f1322a = "${";

    /* renamed from: b */
    static final char f1323b = '}';

    /* renamed from: c */
    static final String f1324c = ":-";

    /* renamed from: d */
    static final int f1325d = 2;

    /* renamed from: e */
    static final int f1326e = 1;

    /* renamed from: f */
    static final int f1327f = 2;

    /* renamed from: g */
    static final String f1328g = "_IS_UNDEFINED";

    /* renamed from: a */
    public static Object m38382a(String str, Class<?> cls, AbstractC0427f abstractC0427f) {
        return m38380a(str, cls, C0720s.m38398a(abstractC0427f));
    }

    /* renamed from: a */
    public static Object m38381a(String str, Class<?> cls, AbstractC0427f abstractC0427f, Class<?> cls2, Object obj) {
        return m38379a(str, cls, C0720s.m38398a(abstractC0427f), cls2, obj);
    }

    /* renamed from: a */
    public static Object m38380a(String str, Class<?> cls, ClassLoader classLoader) {
        return m38379a(str, cls, classLoader, (Class<?>) null, (Object) null);
    }

    /* renamed from: a */
    public static Object m38379a(String str, Class<?> cls, ClassLoader classLoader, Class<?> cls2, Object obj) {
        if (str == null) {
            throw new NullPointerException();
        }
        try {
            Class<?> loadClass = classLoader.loadClass(str);
            if (!cls.isAssignableFrom(loadClass)) {
                throw new C0718q(cls, loadClass);
            }
            return cls2 == null ? loadClass.newInstance() : loadClass.getConstructor(cls2).newInstance(obj);
        } catch (C0718q e) {
            throw e;
        } catch (Throwable th) {
            throw new C0712k("Failed to instantiate type " + str, th);
        }
    }

    /* renamed from: a */
    public static String m38385a(String str) {
        try {
            return System.getenv(str);
        } catch (SecurityException e) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m38384a(String str, AbstractC0672p abstractC0672p) {
        return m38383a(str, abstractC0672p, (AbstractC0672p) null);
    }

    /* renamed from: a */
    public static String m38383a(String str, AbstractC0672p abstractC0672p, AbstractC0672p abstractC0672p2) {
        try {
            return C0693b.m38461a(str, abstractC0672p, abstractC0672p2);
        } catch (C0674r e) {
            throw new IllegalArgumentException("Failed to parse input [" + str + "]", e);
        }
    }

    /* renamed from: a */
    public static String m38378a(String str, String str2) {
        try {
            return System.getProperty(str, str2);
        } catch (SecurityException e) {
            return str2;
        }
    }

    /* renamed from: a */
    public static Properties m38388a() {
        try {
            return System.getProperties();
        } catch (SecurityException e) {
            return new Properties();
        }
    }

    /* renamed from: a */
    public static void m38387a(AbstractC0661e abstractC0661e, String str, String str2) {
        try {
            System.setProperty(str, str2);
        } catch (SecurityException e) {
            abstractC0661e.mo38549a("Failed to set system property [" + str + "]", e);
        }
    }

    /* renamed from: a */
    public static void m38386a(AbstractC0661e abstractC0661e, Properties properties) {
        for (String str : properties.keySet()) {
            m38387a(abstractC0661e, str, properties.getProperty(str));
        }
    }

    /* renamed from: a */
    public static boolean m38377a(String str, boolean z) {
        if (str == null) {
            return z;
        }
        String trim = str.trim();
        if ("true".equalsIgnoreCase(trim)) {
            return true;
        }
        if (!"false".equalsIgnoreCase(trim)) {
            return z;
        }
        return false;
    }

    /* renamed from: b */
    public static String m38376b(String str) {
        try {
            return C0403b.m39412a().m39410a(str, (String) null);
        } catch (IllegalArgumentException e) {
            return null;
        }
    }

    /* renamed from: b */
    public static String m38375b(String str, AbstractC0672p abstractC0672p, AbstractC0672p abstractC0672p2) {
        String mo38529a = abstractC0672p.mo38529a(str);
        if (mo38529a == null && abstractC0672p2 != null) {
            mo38529a = abstractC0672p2.mo38529a(str);
        }
        if (mo38529a == null) {
            mo38529a = m38378a(str, (String) null);
        }
        return mo38529a == null ? m38385a(str) : mo38529a;
    }

    /* renamed from: c */
    public static String m38374c(String str) {
        try {
            String property = System.getProperty(str);
            return property == null ? m38376b(str) : property;
        } catch (SecurityException e) {
            return null;
        }
    }

    /* renamed from: d */
    public static String[] m38373d(String str) {
        String[] strArr = new String[2];
        if (str != null) {
            strArr[0] = str;
            int indexOf = str.indexOf(":-");
            if (indexOf != -1) {
                strArr[0] = str.substring(0, indexOf);
                strArr[1] = str.substring(indexOf + 2);
            }
        }
        return strArr;
    }

    /* renamed from: e */
    public static boolean m38372e(String str) {
        return str == null || "".equals(str);
    }
}
