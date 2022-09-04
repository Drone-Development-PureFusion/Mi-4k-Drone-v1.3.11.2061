package p005b.p006a.p007a.p029b.p036g.p041e;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
/* renamed from: b.a.a.b.g.e.c */
/* loaded from: classes.dex */
public class C0488c {
    /* renamed from: a */
    public static String m39143a(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        String lowerCase = str.substring(0, 1).toLowerCase();
        return str.length() > 1 ? lowerCase + str.substring(1) : lowerCase;
    }

    /* renamed from: a */
    public static C0489d[] m39144a(Class<?> cls) {
        Method[] methods;
        ArrayList arrayList = new ArrayList();
        for (Method method : cls.getMethods()) {
            arrayList.add(new C0489d(method.getName(), method));
        }
        return (C0489d[]) arrayList.toArray(new C0489d[0]);
    }

    /* renamed from: b */
    public static C0490e[] m39142b(Class<?> cls) {
        Method[] methods;
        int length = "set".length();
        HashMap hashMap = new HashMap();
        for (Method method : cls.getMethods()) {
            String name = method.getName();
            boolean z = name.startsWith("get") && name.length() > length;
            boolean z2 = name.startsWith("set") && name.length() > length;
            if (z || z2) {
                String m39143a = m39143a(name.substring(length));
                C0490e c0490e = (C0490e) hashMap.get(m39143a);
                if (c0490e == null) {
                    c0490e = new C0490e(m39143a);
                    hashMap.put(m39143a, c0490e);
                }
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (z2) {
                    if (parameterTypes.length == 1) {
                        c0490e.m39137a(method);
                        c0490e.m39138a(parameterTypes[0]);
                    }
                } else if (z && parameterTypes.length == 0) {
                    c0490e.m39135b(method);
                    if (c0490e.m39133d() == null) {
                        c0490e.m39138a(method.getReturnType());
                    }
                }
            }
        }
        return (C0490e[]) hashMap.values().toArray(new C0490e[0]);
    }
}
