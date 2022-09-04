package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.AbstractC7090hj;
import com.google.firebase.p253b.C9755a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* renamed from: com.google.android.gms.tagmanager.cw */
/* loaded from: classes2.dex */
public class C9147cw {

    /* renamed from: a */
    private static final Object f28878a = null;

    /* renamed from: b */
    private static Long f28879b = new Long(0);

    /* renamed from: c */
    private static Double f28880c = new Double((double) C9755a.f30449c);

    /* renamed from: d */
    private static C9146cv f28881d = C9146cv.m9141a(0);

    /* renamed from: e */
    private static String f28882e = new String("");

    /* renamed from: f */
    private static Boolean f28883f = new Boolean(false);

    /* renamed from: g */
    private static List<Object> f28884g = new ArrayList(0);

    /* renamed from: h */
    private static Map<Object, Object> f28885h = new HashMap();

    /* renamed from: i */
    private static AbstractC7090hj.C7091a f28886i = m9111f(f28882e);

    /* renamed from: a */
    public static AbstractC7090hj.C7091a m9130a(String str) {
        AbstractC7090hj.C7091a c7091a = new AbstractC7090hj.C7091a();
        c7091a.f23881a = 5;
        c7091a.f23887g = str;
        return c7091a;
    }

    /* renamed from: a */
    public static Object m9133a() {
        return null;
    }

    /* renamed from: a */
    public static String m9132a(AbstractC7090hj.C7091a c7091a) {
        return m9131a(m9112f(c7091a));
    }

    /* renamed from: a */
    public static String m9131a(Object obj) {
        return obj == null ? f28882e : obj.toString();
    }

    /* renamed from: b */
    public static C9146cv m9128b(AbstractC7090hj.C7091a c7091a) {
        return m9127b(m9112f(c7091a));
    }

    /* renamed from: b */
    public static C9146cv m9127b(Object obj) {
        return obj instanceof C9146cv ? (C9146cv) obj : m9107i(obj) ? C9146cv.m9141a(m9106j(obj)) : m9109g(obj) ? C9146cv.m9139a(Double.valueOf(m9108h(obj))) : m9126b(m9131a(obj));
    }

    /* renamed from: b */
    private static C9146cv m9126b(String str) {
        try {
            return C9146cv.m9138a(str);
        } catch (NumberFormatException e) {
            C9065aw.m9301a(new StringBuilder(String.valueOf(str).length() + 33).append("Failed to convert '").append(str).append("' to a number.").toString());
            return f28881d;
        }
    }

    /* renamed from: b */
    public static Long m9129b() {
        return f28879b;
    }

    /* renamed from: c */
    public static Double m9125c() {
        return f28880c;
    }

    /* renamed from: c */
    public static Long m9124c(AbstractC7090hj.C7091a c7091a) {
        return m9123c(m9112f(c7091a));
    }

    /* renamed from: c */
    public static Long m9123c(Object obj) {
        return m9107i(obj) ? Long.valueOf(m9106j(obj)) : m9122c(m9131a(obj));
    }

    /* renamed from: c */
    private static Long m9122c(String str) {
        C9146cv m9126b = m9126b(str);
        return m9126b == f28881d ? f28879b : Long.valueOf(m9126b.longValue());
    }

    /* renamed from: d */
    public static Boolean m9121d() {
        return f28883f;
    }

    /* renamed from: d */
    public static Double m9120d(AbstractC7090hj.C7091a c7091a) {
        return m9119d(m9112f(c7091a));
    }

    /* renamed from: d */
    public static Double m9119d(Object obj) {
        return m9109g(obj) ? Double.valueOf(m9108h(obj)) : m9118d(m9131a(obj));
    }

    /* renamed from: d */
    private static Double m9118d(String str) {
        C9146cv m9126b = m9126b(str);
        return m9126b == f28881d ? f28880c : Double.valueOf(m9126b.doubleValue());
    }

    /* renamed from: e */
    public static C9146cv m9117e() {
        return f28881d;
    }

    /* renamed from: e */
    public static Boolean m9116e(AbstractC7090hj.C7091a c7091a) {
        return m9115e(m9112f(c7091a));
    }

    /* renamed from: e */
    public static Boolean m9115e(Object obj) {
        return obj instanceof Boolean ? (Boolean) obj : m9114e(m9131a(obj));
    }

    /* renamed from: e */
    private static Boolean m9114e(String str) {
        return "true".equalsIgnoreCase(str) ? Boolean.TRUE : "false".equalsIgnoreCase(str) ? Boolean.FALSE : f28883f;
    }

    /* renamed from: f */
    public static AbstractC7090hj.C7091a m9111f(Object obj) {
        boolean z = false;
        AbstractC7090hj.C7091a c7091a = new AbstractC7090hj.C7091a();
        if (obj instanceof AbstractC7090hj.C7091a) {
            return (AbstractC7090hj.C7091a) obj;
        }
        if (obj instanceof String) {
            c7091a.f23881a = 1;
            c7091a.f23882b = (String) obj;
        } else if (obj instanceof List) {
            c7091a.f23881a = 2;
            List<Object> list = (List) obj;
            ArrayList arrayList = new ArrayList(list.size());
            boolean z2 = false;
            for (Object obj2 : list) {
                AbstractC7090hj.C7091a m9111f = m9111f(obj2);
                if (m9111f == f28886i) {
                    return f28886i;
                }
                boolean z3 = z2 || m9111f.f23892l;
                arrayList.add(m9111f);
                z2 = z3;
            }
            c7091a.f23883c = (AbstractC7090hj.C7091a[]) arrayList.toArray(new AbstractC7090hj.C7091a[0]);
            z = z2;
        } else if (obj instanceof Map) {
            c7091a.f23881a = 3;
            Set<Map.Entry> entrySet = ((Map) obj).entrySet();
            ArrayList arrayList2 = new ArrayList(entrySet.size());
            ArrayList arrayList3 = new ArrayList(entrySet.size());
            boolean z4 = false;
            for (Map.Entry entry : entrySet) {
                AbstractC7090hj.C7091a m9111f2 = m9111f(entry.getKey());
                AbstractC7090hj.C7091a m9111f3 = m9111f(entry.getValue());
                if (m9111f2 == f28886i || m9111f3 == f28886i) {
                    return f28886i;
                }
                boolean z5 = z4 || m9111f2.f23892l || m9111f3.f23892l;
                arrayList2.add(m9111f2);
                arrayList3.add(m9111f3);
                z4 = z5;
            }
            c7091a.f23884d = (AbstractC7090hj.C7091a[]) arrayList2.toArray(new AbstractC7090hj.C7091a[0]);
            c7091a.f23885e = (AbstractC7090hj.C7091a[]) arrayList3.toArray(new AbstractC7090hj.C7091a[0]);
            z = z4;
        } else if (m9109g(obj)) {
            c7091a.f23881a = 1;
            c7091a.f23882b = obj.toString();
        } else if (m9107i(obj)) {
            c7091a.f23881a = 6;
            c7091a.f23888h = m9106j(obj);
        } else if (!(obj instanceof Boolean)) {
            String valueOf = String.valueOf(obj == null ? "null" : obj.getClass().toString());
            C9065aw.m9301a(valueOf.length() != 0 ? "Converting to Value from unknown object type: ".concat(valueOf) : new String("Converting to Value from unknown object type: "));
            return f28886i;
        } else {
            c7091a.f23881a = 8;
            c7091a.f23889i = ((Boolean) obj).booleanValue();
        }
        c7091a.f23892l = z;
        return c7091a;
    }

    /* renamed from: f */
    public static Object m9112f(AbstractC7090hj.C7091a c7091a) {
        int i = 0;
        if (c7091a == null) {
            return null;
        }
        switch (c7091a.f23881a) {
            case 1:
                return c7091a.f23882b;
            case 2:
                ArrayList arrayList = new ArrayList(c7091a.f23883c.length);
                AbstractC7090hj.C7091a[] c7091aArr = c7091a.f23883c;
                int length = c7091aArr.length;
                while (i < length) {
                    Object m9112f = m9112f(c7091aArr[i]);
                    if (m9112f == null) {
                        return null;
                    }
                    arrayList.add(m9112f);
                    i++;
                }
                return arrayList;
            case 3:
                if (c7091a.f23884d.length != c7091a.f23885e.length) {
                    String valueOf = String.valueOf(c7091a.toString());
                    C9065aw.m9301a(valueOf.length() != 0 ? "Converting an invalid value to object: ".concat(valueOf) : new String("Converting an invalid value to object: "));
                    return null;
                }
                HashMap hashMap = new HashMap(c7091a.f23885e.length);
                while (i < c7091a.f23884d.length) {
                    Object m9112f2 = m9112f(c7091a.f23884d[i]);
                    Object m9112f3 = m9112f(c7091a.f23885e[i]);
                    if (m9112f2 == null || m9112f3 == null) {
                        return null;
                    }
                    hashMap.put(m9112f2, m9112f3);
                    i++;
                }
                return hashMap;
            case 4:
                C9065aw.m9301a("Trying to convert a macro reference to object");
                return null;
            case 5:
                C9065aw.m9301a("Trying to convert a function id to object");
                return null;
            case 6:
                return Long.valueOf(c7091a.f23888h);
            case 7:
                StringBuffer stringBuffer = new StringBuffer();
                AbstractC7090hj.C7091a[] c7091aArr2 = c7091a.f23890j;
                int length2 = c7091aArr2.length;
                while (i < length2) {
                    String m9132a = m9132a(c7091aArr2[i]);
                    if (m9132a == f28882e) {
                        return null;
                    }
                    stringBuffer.append(m9132a);
                    i++;
                }
                return stringBuffer.toString();
            case 8:
                return Boolean.valueOf(c7091a.f23889i);
            default:
                C9065aw.m9301a(new StringBuilder(46).append("Failed to convert a value of type: ").append(c7091a.f23881a).toString());
                return null;
        }
    }

    /* renamed from: f */
    public static String m9113f() {
        return f28882e;
    }

    /* renamed from: g */
    public static AbstractC7090hj.C7091a m9110g() {
        return f28886i;
    }

    /* renamed from: g */
    private static boolean m9109g(Object obj) {
        return (obj instanceof Double) || (obj instanceof Float) || ((obj instanceof C9146cv) && ((C9146cv) obj).m9142a());
    }

    /* renamed from: h */
    private static double m9108h(Object obj) {
        if (obj instanceof Number) {
            return ((Number) obj).doubleValue();
        }
        C9065aw.m9301a("getDouble received non-Number");
        return C9755a.f30449c;
    }

    /* renamed from: i */
    private static boolean m9107i(Object obj) {
        return (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long) || ((obj instanceof C9146cv) && ((C9146cv) obj).m9137b());
    }

    /* renamed from: j */
    private static long m9106j(Object obj) {
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        }
        C9065aw.m9301a("getInt64 received non-Number");
        return 0L;
    }
}
