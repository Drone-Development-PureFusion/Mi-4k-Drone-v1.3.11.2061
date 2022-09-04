package com.google.android.gms.internal;

import com.tencent.connect.common.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public class aqc {

    /* renamed from: a */
    private static final Map<String, C6754a> f22855a;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.internal.aqc$a */
    /* loaded from: classes2.dex */
    public static final class C6754a {

        /* renamed from: a */
        public static final String[] f22856a = {EnumC6958fh.ARG0.toString(), EnumC6958fh.ARG1.toString()};

        /* renamed from: b */
        private final String f22857b;

        /* renamed from: c */
        private final String[] f22858c;

        public C6754a(String str) {
            this.f22857b = str;
            this.f22858c = f22856a;
        }

        public C6754a(String str, String[] strArr) {
            this.f22857b = str;
            this.f22858c = strArr;
        }

        /* renamed from: a */
        public String m16228a() {
            return this.f22857b;
        }

        /* renamed from: b */
        public String[] m16227b() {
            return this.f22858c;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(EnumC6890eg.CONTAINS.toString(), new C6754a("contains"));
        hashMap.put(EnumC6890eg.ENDS_WITH.toString(), new C6754a("endsWith"));
        hashMap.put(EnumC6890eg.EQUALS.toString(), new C6754a("equals"));
        hashMap.put(EnumC6890eg.GREATER_EQUALS.toString(), new C6754a("greaterEquals"));
        hashMap.put(EnumC6890eg.GREATER_THAN.toString(), new C6754a("greaterThan"));
        hashMap.put(EnumC6890eg.LESS_EQUALS.toString(), new C6754a("lessEquals"));
        hashMap.put(EnumC6890eg.LESS_THAN.toString(), new C6754a("lessThan"));
        hashMap.put(EnumC6890eg.REGEX.toString(), new C6754a("regex", new String[]{EnumC6958fh.ARG0.toString(), EnumC6958fh.ARG1.toString(), EnumC6958fh.IGNORE_CASE.toString()}));
        hashMap.put(EnumC6890eg.STARTS_WITH.toString(), new C6754a("startsWith"));
        f22855a = hashMap;
    }

    /* renamed from: a */
    public static C6892ei m16230a(String str, Map<String, AbstractC6880ea<?>> map, apr aprVar) {
        if (!f22855a.containsKey(str)) {
            throw new RuntimeException(new StringBuilder(String.valueOf(str).length() + 47).append("Fail to convert ").append(str).append(" to the internal representation").toString());
        }
        C6754a c6754a = f22855a.get(str);
        List<AbstractC6880ea<?>> m16229a = m16229a(c6754a.m16227b(), map);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C6893ej("gtmUtils"));
        C6892ei c6892ei = new C6892ei(Constants.VIA_REPORT_TYPE_WPA_STATE, arrayList);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(c6892ei);
        arrayList2.add(new C6893ej("mobile"));
        C6892ei c6892ei2 = new C6892ei("17", arrayList2);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(c6892ei2);
        arrayList3.add(new C6893ej(c6754a.m16228a()));
        arrayList3.add(new C6887ef(m16229a));
        return new C6892ei("2", arrayList3);
    }

    /* renamed from: a */
    public static String m16232a(EnumC6890eg enumC6890eg) {
        return m16231a(enumC6890eg.toString());
    }

    /* renamed from: a */
    public static String m16231a(String str) {
        if (f22855a.containsKey(str)) {
            return f22855a.get(str).m16228a();
        }
        return null;
    }

    /* renamed from: a */
    private static List<AbstractC6880ea<?>> m16229a(String[] strArr, Map<String, AbstractC6880ea<?>> map) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < strArr.length) {
                if (!map.containsKey(strArr[i2])) {
                    arrayList.add(C6886ee.f23122e);
                } else {
                    arrayList.add(map.get(strArr[i2]));
                }
                i = i2 + 1;
            } else {
                return arrayList;
            }
        }
    }
}
