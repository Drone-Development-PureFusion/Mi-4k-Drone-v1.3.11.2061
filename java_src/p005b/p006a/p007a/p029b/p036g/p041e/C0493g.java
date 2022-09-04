package p005b.p006a.p007a.p029b.p036g.p041e;

import java.lang.reflect.Modifier;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import p005b.p006a.p007a.p029b.C0494h;
import p005b.p006a.p007a.p029b.p055o.AbstractC0661e;
/* renamed from: b.a.a.b.g.e.g */
/* loaded from: classes.dex */
public class C0493g {

    /* renamed from: a */
    private static final Class<?>[] f679a = {String.class};

    /* renamed from: a */
    private static Object m39107a(AbstractC0661e abstractC0661e, Class<?> cls, String str) {
        try {
            return cls.getMethod(C0494h.f725m, f679a).invoke(null, str);
        } catch (Exception e) {
            abstractC0661e.mo38546c("Failed to invoke valueOf{} method in class [" + cls.getName() + "] with value [" + str + "]");
            return null;
        }
    }

    /* renamed from: a */
    public static Object m39105a(AbstractC0661e abstractC0661e, String str, Class<?> cls) {
        if (str == null) {
            return null;
        }
        String trim = str.trim();
        if (String.class.isAssignableFrom(cls)) {
            return trim;
        }
        if (Integer.TYPE.isAssignableFrom(cls)) {
            return new Integer(trim);
        }
        if (Long.TYPE.isAssignableFrom(cls)) {
            return new Long(trim);
        }
        if (Float.TYPE.isAssignableFrom(cls)) {
            return new Float(trim);
        }
        if (Double.TYPE.isAssignableFrom(cls)) {
            return new Double(trim);
        }
        if (Boolean.TYPE.isAssignableFrom(cls)) {
            if ("true".equalsIgnoreCase(trim)) {
                return Boolean.TRUE;
            }
            if (!"false".equalsIgnoreCase(trim)) {
                return null;
            }
            return Boolean.FALSE;
        } else if (cls.isEnum()) {
            return m39103b(abstractC0661e, trim, cls);
        } else {
            if (m39101c(cls)) {
                return m39107a(abstractC0661e, cls, trim);
            }
            if (!m39102b(cls)) {
                return null;
            }
            return m39106a(abstractC0661e, str);
        }
    }

    /* renamed from: a */
    private static Charset m39106a(AbstractC0661e abstractC0661e, String str) {
        try {
            return Charset.forName(str);
        } catch (UnsupportedCharsetException e) {
            abstractC0661e.mo38549a("Failed to get charset [" + str + "]", e);
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m39104a(Class<?> cls) {
        Package r1 = cls.getPackage();
        if (cls.isPrimitive()) {
            return true;
        }
        return (r1 != null && "java.lang".equals(r1.getName())) || m39101c(cls) || cls.isEnum() || m39102b(cls);
    }

    /* renamed from: b */
    private static Object m39103b(AbstractC0661e abstractC0661e, String str, Class<? extends Enum> cls) {
        return Enum.valueOf(cls, str);
    }

    /* renamed from: b */
    private static boolean m39102b(Class<?> cls) {
        return Charset.class.isAssignableFrom(cls);
    }

    /* renamed from: c */
    private static boolean m39101c(Class<?> cls) {
        return Modifier.isStatic(cls.getMethod(C0494h.f725m, f679a).getModifiers());
    }

    /* renamed from: a */
    boolean m39108a() {
        return false;
    }
}
